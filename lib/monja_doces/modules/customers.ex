defmodule MonjaDoces.Modules.Customers do
  @moduledoc """
  Module responsible to handle customer from database
  """
  require Logger
  import Ecto.Query

  alias __MODULE__
  alias MonjaDoces.Repo

  alias MonjaDoces.Schemas.Customer

  def get(customer_id) do
    from(
      c in Customer,
      where: c.id == ^customer_id,
      preload: :machines
    )
    |> Repo.one()
    |> case do
      nil ->
        {:error, :not_found}
        
      customer ->
        {:ok, customer}
    end
  end
  
  def retrieve_all() do
    from(
      c in Customer,
      preload: :machines
    )
    |> Repo.all()
    |> case do
      [] ->
        {:error, :not_found}
        
      customers ->
        {:ok, customers}
    end
  end
  
  def create(attrs) do
    %Customer{}
    |> Customer.changeset(attrs)
    |> Repo.insert()
  end
  
  def update(customer_id, attrs) do
    with {:ok, customer} <- Customers.get(customer_id) do
      customer
      |> Customer.changeset(attrs)
      |> Repo.update()
    end
  end
end