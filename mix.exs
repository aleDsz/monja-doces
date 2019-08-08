defmodule MonjaDoces.MixProject do
  use Mix.Project

  def project do
    [
      app: :monja_doces,
      version: "1.0.0",
      elixir: "~> 1.8",
      start_permanent: Mix.env() == :prod,
      deps: deps()
    ]
  end

  def application do
    [
      extra_applications: [:logger],
      mod: {MonjaDoces.Application, []}
    ]
  end

  defp deps do
    [
      {:poison, "~> 4.0"},
      {:ecto, "~> 3.1"},
      {:ecto_sql, "~> 3.1"},
      {:plug, "~> 1.8"},
      {:cowboy, "~> 2.6"},
      {:myxql, "~> 0.2.6"},
      
      {:faker, "~> 0.12.0", only: :test},
      {:brcpfcnpj, "~> 0.2.0", only: :test}
    ]
  end
end
