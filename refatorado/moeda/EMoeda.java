package refatorado.moeda;

public enum EMoeda {

    EURO_REAL(1, new CalculaEuroRealMoeda()),
    DOLAR_REAL(2, new CalculaDolarRealMoeda()),
    REAL_DOLAR(3, new CalculaRealDolarMoeda()),
    REAL_EURO(4, new CalculaRealEuroMoeda());

    private final Integer identificador;
    private final ICalculaMoeda calcula;

    EMoeda(Integer identificador, ICalculaMoeda calcula) {
        this.identificador = identificador;
        this.calcula = calcula;
    }

    public ICalculaMoeda pegarCalculadora() {
        return calcula;
    }

    public static EMoeda getByIdentificador(Integer identificador) {
        for (EMoeda moeda : values()) {
            if (moeda.identificador.equals(identificador)) {
                return moeda;
            }
        }
        throw new IllegalArgumentException("Identificador de moeda inválido: " + identificador);
    }
}
