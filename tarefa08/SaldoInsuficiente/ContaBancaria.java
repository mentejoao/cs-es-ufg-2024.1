class ContaBancaria {
    private Double saldo;

    public ContaBancaria(Double saldoInicial) {
        if (saldoInicial != null) {
            saldo = saldoInicial;
        } else {
            saldo = 0.0;
        }
    }

    public ContaBancaria() {
        saldo = 0.0;
    }

    public void depositar(Double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " bem-sucedido.");
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " bem-sucedido.");
    }

    public Double getSaldo() {
        return saldo;
    }
}