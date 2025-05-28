import java.awt.Color;

/**
 * Uma visão textual da simulação que imprime no terminal o número de raposas e coelhos a cada passo.
 */
public class VisaoDeTexto implements VisaoSimulador {

    private EstatisticasCampo estatisticas;

    public VisaoDeTexto() {
        estatisticas = new EstatisticasCampo();
    }

    @Override
    public void definirCor(Class<?> classeAnimal, Color cor) {
    }

    @Override
    public boolean ehViavel(Campo campo) {
        return estatisticas.ehViavel(campo);
    }

    @Override
    public void mostrarStatus(int passo, Campo campo) {
        estatisticas.reiniciar();
        int raposas = estatisticas.obterContagemPopulacao(campo, Raposa.class);
        int coelhos = estatisticas.obterContagemPopulacao(campo, Coelho.class);
        System.out.println("Passo " + passo + " - Raposas: " + raposas + " Coelhos: " + coelhos);
    }

    @Override
    public void reiniciar() {
        estatisticas.reiniciar();
    }

    @Override
    public void reabilitarOpcoes() {
    }
}
