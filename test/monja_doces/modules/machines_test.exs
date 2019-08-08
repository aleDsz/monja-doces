defmodule MonjaDoces.Test.Modules.Machines do
  use ExUnit.Case, async: false
  
  alias MonjaDoces.Modules.Customers
  alias MonjaDoces.Modules.Machines

  setup do
    {:ok, customer} = Customers.create(%{
      name: Faker.Company.name(),
      business_name: Faker.Company.name(),
      document: Brcpfcnpj.cnpj_generate()
    })

    machine_map = %{
      name: Faker.Company.name(),
      serial_number: Brcpfcnpj.cpf_generate(),
      customer_id: customer.id
    }

    {:ok, machine} = Machines.create(%{
      name: Faker.Company.name(),
      serial_number: Brcpfcnpj.cpf_generate(),
      customer_id: customer.id
    })

    %{machine_map: machine_map, machine: machine}
  end
  
  describe "with Machines do" do
    test "create a machine", %{machine_map: machine_map} do
      {:ok, machine} = Machines.create(machine_map)

      assert machine.serial_number == machine_map.serial_number
    end
    
    test "update a machine", %{machine: machine} do
      {:ok, machine} = Machines.update(machine.id, %{serial_number: "9G1451A2155Z"})
      assert machine.serial_number == "9G1451A2155Z"
    end
    
    test "retrieve a machine", %{machine: machine} do
      {:ok, get_machine} = Machines.get(machine.id)

      assert get_machine.id == machine.id
    end
    
    test "retrieve a list of machines", %{} do
      {:ok, machines} = Machines.retrieve_all()

      assert length(machines) > 0
    end
  end
end