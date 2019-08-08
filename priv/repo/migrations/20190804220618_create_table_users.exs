defmodule MonjaDoces.Repo.Migrations.CreateTableUsers do
  use Ecto.Migration

  def change do
    create table(:users) do
      add :name, :string, null: false
      add :code_access, :string, null: false
      add :password_access, :string, null: false
      
      timestamps()
    end
    
    create unique_index(:users, [:code_access], name: :users_code_access_index)
  end
end
