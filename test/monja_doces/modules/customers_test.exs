defmodule MonjaDoces.Test.Modules.Customers do
  use ExUnit.Case, async: false
  
  alias MonjaDoces.Modules.Customers

  setup do
    customer_map = %{
      name: Faker.Company.name(),
      business_name: Faker.Company.name(),
      document: Brcpfcnpj.cnpj_generate()
    }

    {:ok, customer} = Customers.create(%{
      name: Faker.Company.name(),
      business_name: Faker.Company.name(),
      document: Brcpfcnpj.cnpj_generate()
    })

    %{customer_map: customer_map, customer: customer}
  end
  
  describe "with Customers do" do
    test "create a customer", %{customer_map: customer_map} do
      {:ok, customer} = Customers.create(customer_map)

      assert customer.document == customer_map.document
    end
    
    test "update a customer", %{customer: customer} do
      {:ok, customer} = Customers.update(customer.id, %{business_name: "Monja Doces"})

      assert customer.business_name == "Monja Doces"
    end
    
    test "retrieve a customer", %{customer: customer} do
      {:ok, get_customer} = Customers.get(customer.id)

      assert get_customer.id == customer.id
    end
    
    test "retrieve a list of customers", %{} do
      {:ok, customers} = Customers.retrieve_all()

      assert length(customers) > 0
    end
  end
end