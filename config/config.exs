use Mix.Config

config :monja_doces,
  ecto_repos: [MonjaDoces.Repo]
  
config :monja_doces, MonjaDoces.Repo,
  hostname: "localhost",
  username: "root",
  database: "monja_doces",
  adapter: Ecto.Adapters.MyXQL