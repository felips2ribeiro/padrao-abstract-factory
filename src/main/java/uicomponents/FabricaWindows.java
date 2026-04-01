package uicomponents;

public class FabricaWindows implements IFabricaUI {
    @Override
    public IButton criarBotao() {
        return new WindowsButton();
    }

    @Override
    public INotification criarNotificacao() {
        return new WindowsNotification();
    }
}
