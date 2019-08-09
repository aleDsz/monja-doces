defmodule MonjaDoces.Schemas.Customer do
  use Ecto.Schema
  import Ecto.Changeset
  import Brcpfcnpj.Changeset

  alias MonjaDoces.Schemas.Machine

  @primary_key {:id, :id, autogenerate: true}

  schema "customers" do
    field :name, :string
    field :business_name, :string
    field :document, :string

    has_many :machines, Machine

    timestamps()
  end

  def changeset(%__MODULE__{} = schema, attrs) when is_map(attrs) do
    schema
    |> cast(attrs, [:name, :business_name, :document])
    |> validate_required([:name, :business_name, :document])
    |> validate_cnpj(:document, message: "invalid CNPJ")
    |> unique_constraint(:name, name: :customers_name_document_index)
    |> unique_constraint(:document, name: :customers_name_document_index)
  end
end
