defmodule MonjaDoces.Modules.Users do
  @moduledoc """
  Module responsible to handle user from database
  """
  require Logger
  import Ecto.Query

  alias __MODULE__
  alias MonjaDoces.Repo

  alias MonjaDoces.Schemas.User

  def get(user_id) do
    from(
      u in User,
      where: u.id == ^user_id
    )
    |> Repo.one()
    |> case do
      nil ->
        {:error, :not_found}
        
      user ->
        {:ok, user}
    end
  end
  
  def retrieve_all() do
    from(
      u in User
    )
    |> Repo.all()
    |> case do
      [] ->
        {:error, :not_found}
        
      users ->
        {:ok, users}
    end
  end
  
  def create(attrs) do
    %User{}
    |> User.changeset(attrs)
    |> Repo.insert()
  end
  
  def update(user_id, attrs) do
    with {:ok, user} <- Users.get(user_id) do
      user
      |> User.changeset(attrs)
      |> Repo.update()
    end
  end
end