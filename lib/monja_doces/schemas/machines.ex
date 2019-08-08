defmodule MonjaDoces.Schemas.Machine do
  @moduledoc """
  Schema for machines table
  """
  use Ecto.Schema
  import Ecto.Changeset

  alias MonjaDoces.Schemas.Customer

  @primary_key {:id, :id, autogenerate: true}
  @foreign_key {:id, type: :integer}

  schema "machines" do
    field :name, :string
    field :serial_number, :string

    belongs_to :customer, Customer

    timestamps()
  end
  
  def changeset(%__MODULE__{} = schema, attrs) when is_map(attrs) do
    schema
    |> cast(attrs, [:name, :serial_number, :customer_id])
    |> validate_required([:name, :serial_number, :customer_id])
    |> unique_constraint(:name, name: :machines_name_serial_number_index)
    |> unique_constraint(:serial_number, name: :machines_name_serial_number_index)
  end
end