package enumeracao.Execiceos.diasDaSemana.dominio;

public enum diasDaSemana {
    SEGUNDA{
      @Override
      public String dias(String dia){
          return "Segunda-Feira";
      }
    },
    TERCA{
        @Override
        public String dias(String dia){
            return "Terça-Feira";
        }
    },
    QUARTA{
        @Override
        public String dias(String dia){
            return "Quarta-Feira";
        }
    },
    QUINTA{
        @Override
        public String dias(String dia){
            return "Quinta-Feira";
        }

    },
    SEXTA{
        @Override
        public String dias(String dia){
            return "Sexta-Feira";
        }

    },
    SABADO{
        @Override
        public String dias(String dia){
            return "Sabado";
        }
    },
    DOMINGO{
        @Override
        public String dias(String dia){
            return "Domingo";
        }
    };
    private String dia;

    public abstract String dias(String dia);

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }
}
