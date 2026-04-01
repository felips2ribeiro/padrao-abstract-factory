package uicomponents;

public class Aplicativo {
    private IButton botao;
    private INotification notificacao;

    public Aplicativo(IFabricaUI fabrica) {
        this.botao = fabrica.criarBotao();
        this.notificacao = fabrica.criarNotificacao();
    }

    public void renderizar() {
        System.out.println(botao.render());
        System.out.println(notificacao.show());
    }
}
