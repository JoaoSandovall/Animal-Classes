abstract class Animal {
    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public abstract void emitirSom();
    public abstract void mover();

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
}

abstract class Mamifero extends Animal {
    public Mamifero(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está andando.");
    }

    public abstract void amamentar();
}

abstract class Ave extends Animal {
    public Ave(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está voando.");
    }

    public abstract void botarOvo();
}

abstract class Reptil extends Animal {
    public Reptil(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está rastejando.");
    }

    public abstract void trocarPele();
}

class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au!");
    }

    @Override
    public void amamentar() {
        System.out.println(getNome() + " está amamentando seus filhotes.");
    }
}

class Gato extends Mamifero {
    public Gato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau!");
    }

    @Override
    public void amamentar() {
        System.out.println(getNome() + " está amamentando seus gatinhos.");
    }
}

class Tartaruga extends Reptil {
    public Tartaruga(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som baixo.");
    }

    @Override
    public void trocarPele() {
        System.out.println(getNome() + " está trocando de casco.");
    }
}

class Iguana extends Reptil {
    public Iguana(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um som sibilante.");
    }

    @Override
    public void trocarPele() {
        System.out.println(getNome() + " está mudando de pele.");
    }
}

class Galinha extends Ave {
    public Galinha(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Có có có!");
    }

    @Override
    public void botarOvo() {
        System.out.println(getNome() + " botou um ovo!");
    }
}

class Calopsita extends Ave {
    public Calopsita(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está cantando!");
    }

    @Override
    public void botarOvo() {
        System.out.println(getNome() + " botou um pequeno ovo.");
    }
}

class Pardal extends Ave {
    public Pardal(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está piando!");
    }

    @Override
    public void botarOvo() {
        System.out.println(getNome() + " botou um ovo pequeno no ninho.");
    }
}

class Arara extends Ave {
    public Arara(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz um barulho alto!");
    }

    @Override
    public void botarOvo() {
        System.out.println(getNome() + " botou um ovo colorido.");
    }
}