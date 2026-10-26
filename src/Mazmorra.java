import java.util.Scanner;

public class Mazmorra {
    public static void main(String[] args) throws Exception {
        System.out.println("¡Bienvenido a la Mainmozrra! Cree a su personaje: ");

        Scanner scan = new Scanner(System.in);

        Aventurero personaje = new Aventurero ("Facundo",100, 10, 3);

        Enemigo villano = new Enemigo ("Duende",50, 12);

        System.out.println("!Bienvenido " + personaje.getNombre() + "! Estas son tus estadísticas: ");
        System.out.println("Vida: " + personaje.getHP());
        System.out.println("Daño: " + personaje.getDamage());
        System.out.println("Las Pociones que Posees: " + personaje.getMaxPotis());

        System.out.println("¡Cuidado! Tu primer enemigo es un duende de Villa Ariable.");
        System.out.println("¡Dale su merecido!");

    }
}