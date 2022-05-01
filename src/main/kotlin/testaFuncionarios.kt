fun testaFuncionarios() {
    val alex = CargoAnalista(
        nome = "Alex",
        sobrenome = "Peixoto",
        cpf = "232.265.326-36",
        salario = 3500.00,
        tipo = 0
    )

    val fran = CargoGerente(
        nome = "Fran",
        sobrenome = "Amaro",
        cpf = "653.365.325-65",
        salario = 7000.00,
        senha = 123456
    )

    val gui = CargoDiretor(
        nome = "Gui",
        sobrenome = "Alcantara",
        cpf = "123.653.258-36",
        salario = 14000.00,
        senha = 123456,
        plr = 200.0
    )

}