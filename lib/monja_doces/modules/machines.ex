defmodule MonjaDoces.Modules.Machines do
  @moduledoc """
  Module responsible to handle machine from database
  """
  require Logger
  import Ecto.Query

  alias __MODULE__
  alias MonjaDoces.Repo

  alias MonjaDoces.Schemas.Machine

  def get(machine_id) do
    from(
      m in Machine,
      where: m.id == ^machine_id
    )
    |> Repo.one()
    |> case do
      nil ->
        {:error, :not_found}
        
      machine ->
        {:ok, machine}
    end
  end
  
  def retrieve_all() do
    from(
      m in Machine
    )
    |> Repo.all()
    |> case do
      [] ->
        {:error, :not_found}
        
      machines ->
        {:ok, machines}
    end
  end
  
  def create(attrs) do
    %Machine{}
    |> Machine.changeset(attrs)
    |> Repo.insert()
  end
  
  def update(machine_id, attrs) do
    with {:ok, machine} <- Machines.get(machine_id) do
      machine
      |> Machine.changeset(attrs)
      |> Repo.update()
    end
  end
end