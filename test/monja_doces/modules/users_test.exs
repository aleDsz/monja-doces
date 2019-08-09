defmodule MonjaDoces.Test.Modules.Users do
  use ExUnit.Case, async: false

  alias MonjaDoces.Modules.Users

  setup do
    code_access1 =
      1..10_000
      |> Enum.random()
      |> to_string()

    code_access2 =
      1..10_000
      |> Enum.random()
      |> to_string()

    user_map = %{
      name: "Monja",
      code_access: code_access1,
      password_access: "1234"
    }

    {:ok, user} = Users.create(%{
      name: "Monja Do Capeta",
      code_access: code_access2,
      password_access: "1239"
    })

    %{user_map: user_map, user: user}
  end

  describe "generated basic parameters" do
    test "should create a user", %{user_map: user_map} do
      {:ok, new_user} = Users.create(user_map)

      assert new_user.name == user_map.name
    end

    test "should update a user", %{user: user} do
      {:ok, user} = Users.update(user.id, %{name: "Monja Doces"})

      assert user.name == "Monja Doces"
    end

    test "should retrieve a user", %{user: user} do
      {:ok, get_user} = Users.get(user.id)

      assert get_user.id == user.id
    end

    test "should retrieve a list of users", %{} do
      {:ok, users} = Users.retrieve_all()

      assert length(users) > 0
    end
  end
end
