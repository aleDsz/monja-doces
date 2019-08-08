defmodule MonjaDoces.Repo.Migrations.CreateTableCustomers do
  use Ecto.Migration

  def change do
    create table(:customers) do
      add :name, :string, null: false
      add :business_name, :string, null: false
      add :document, :string, null: false

      timestamps()
    end
    
    create unique_index(:customers, [:name, :document], name: :customers_name_document_index)
  end
end
