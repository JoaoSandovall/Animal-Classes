public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3, 15.5);
        Gato gato = new Gato("Mingau", 2, 4.2);
        Tartaruga tartaruga = new Tartaruga("Donatello", 10, 8.7);
        Iguana iguana = new Iguana("Iggy", 5, 3.1);
        Galinha galinha = new Galinha("Pintadinha", 1, 2.5);
        Calopsita calopsita = new Calopsita("Lola", 2, 0.3);
        Pardal pardal = new Pardal("Piu", 1, 0.1);
        Arara arara = new Arara("Blue", 4, 1.2);

        cachorro.emitirSom();
        gato.mover();
        tartaruga.trocarPele();
        iguana.emitirSom();
        galinha.botarOvo();
        calopsita.dormir();
        pardal.comer();
        arara.emitirSom();
    }
}