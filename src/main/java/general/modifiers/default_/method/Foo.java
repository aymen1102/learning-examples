package general.modifiers.default_.method;

public interface Foo {

    public static void maMethodeStatic() {
        System.out.println("Ici j'ai implémenté une méthode statique");
    }


    default void maMethodeParDefaut() {
        System.out.println("Ici j'ai implémenté une méthode par défaut");
    }

    public void display();

}
