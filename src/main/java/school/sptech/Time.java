package school.sptech;

public class Time {
    String nome;
    Integer vitorias = 0,empates = 0,derrotas = 0;

    public void registrarVitoria(){
        vitorias ++;
    }

    public void registrarEmpate(){
        empates ++;
    }
    public void registrarDerrota(){
        derrotas ++;
    }

    public Integer getPontos() {
        Integer pontos = empates + (vitorias*3);

        return pontos;
    }

    public Integer getTotalPartidas(){
        Integer partidas = empates + derrotas + vitorias;
        return partidas;
    }

    public Integer getAproveitamento(){
        Integer Aproveitamento = (vitorias * 100) / getTotalPartidas();
        return Aproveitamento;
    }

    public void compararAproveitamento(Time adversario){
        if (getAproveitamento() > adversario.getAproveitamento()) {
            System.out.println("O time " + nome + " tem melhor aproveitamento");
        } else if (getAproveitamento() < adversario.getAproveitamento()) {
            System.out.println("O time " + adversario.nome + " tem melhor aproveitamento" );
        } else {
            System.out.println("O time tem o mesmo aproveitamento");
        }

    }

    public void exibirInformacoes(){
        var texto = """
                Time: %s
                Vitórias: %d
                Empates: %d
                Derrotas: %d

                Pontos: %d
                Total de Partidas: %d
                Aproveitamento: %d%%
                    """.formatted(
                nome,
                vitorias,
                empates,
                derrotas,
                getPontos(),
                getTotalPartidas(),
                getAproveitamento());

        System.out.println(texto);
    }
}

