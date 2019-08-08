defmodule MonjaDoces.Repo.Migrations.CreateTableMachines do
  use Ecto.Migration

  def change do
    create table(:machines) do
      add :name, :string, null: false
      add :serial_number, :string, null: false
      add :customer_id, references(:customers, on_delete: :nothing), null: false

      timestamps()
    end

    create unique_index(:machines, [:name, :serial_number], name: :machines_name_serial_number_index)
  end
end
