package enumeracao.Execiceos.NíveisdeAcesso.teste;

import enumeracao.Execiceos.NíveisdeAcesso.dominio.Acesso;
import enumeracao.Execiceos.NíveisdeAcesso.dominio.Niveis;

public class testeAcesso {
    public static void main(String[] args) {
        Acesso acesso = new Acesso("Alexandre", Niveis.ADIMIN);
        System.out.println(acesso);
        acesso.Acesso();
    }
}
