package enumeracao.Execiceos.NíveisdeAcesso.dominio;

public enum Niveis {
    ADIMIN("Adimin"),
    USER("Usuario"),
    VISITE("Visitante");
    public String Conta;

    Niveis(String Conta){
        this.Conta = Conta;
    }
}
