package uicomponents;

public class FabricaAndroid implements IFabricaUI {
    @Override
    public IButton criarBotao() {
        return new AndroidButton();
    }

    @Override
    public INotification criarNotificacao() {
        return new AndroidNotification();
    }
}
