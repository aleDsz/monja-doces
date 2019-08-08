defmodule MonjaDoces.Schemas.User do
  @moduledoc """
  Schema for users table
  """
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :id, autogenerate: true}
  @foreign_key {:id, type: :integer}

  schema "users" do
    field :name, :string
    field :code_access, :string
    field :password_access, :string
    
    timestamps()
  end
  
  def changeset(%__MODULE__{} = schema, attrs) when is_map(attrs) do
    schema
    |> cast(attrs, [:name, :code_access, :password_access])
    |> validate_required([:name, :code_access, :password_access])
    |> unique_constraint(:code_access, name: :users_code_access_index)
  end
end
