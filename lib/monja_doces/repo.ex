defmodule MonjaDoces.Repo do
  use Ecto.Repo,
    otp_app: :monja_doces,
    adapter: Ecto.Adapters.MyXQL
end