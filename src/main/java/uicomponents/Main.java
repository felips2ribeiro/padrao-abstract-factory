package uicomponents;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testando Abstract Factory (UI Components) ===\n");

        System.out.println("--- Cenário Windows ---");
        IFabricaUI fabricaWin = new FabricaWindows();
        Aplicativo appWin = new Aplicativo(fabricaWin);
        appWin.renderizar();

        System.out.println("\n--- Cenário Android ---");
        IFabricaUI fabricaAndroid = new FabricaAndroid();
        Aplicativo appAndroid = new Aplicativo(fabricaAndroid);
        appAndroid.renderizar();
    }
}
