public class App {
    public static void main(String[] args) throws Exception {
        Lutadores l[]= new Lutadores[6];
        l[0] = new Lutadores("Gojo", "Japão", 28,1.90f,69.9f,17,1,1);
        l[1] = new Lutadores("Saitama", "Japão", 25, 1.75f, 73.00f, 20, 0, 0);
        l[2] = new Lutadores("Todo", "Japão", 20, 1.95f, 90.00f,10,0,1 );
        l[3] = new Lutadores("All  Might", "Japão", 35, 2.05f, 110.00f,15,2,2 );
        l[4] = new Lutadores("Goku", "Japão", 40, 1.85f, 81.00f,20,5,3 );
        l[5] = new Lutadores("Shigaraki", "Japão", 22, 1.80f, 71.00f,12,3,1 );
        Luta nome = new Luta();
        nome.marcarLuta(l[1], l[4]);
        nome.lutar();
        
    }
}
