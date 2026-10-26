public class Enemigo {
    
    public static int enemigoCreado = 0;
    
        private String nombre;

        private int hp;

        private int hitMax;
        
        private int damage;

    public Enemigo (String nombre, int hp, int damage){


        this.nombre = nombre;
        this.hp = hitMax;
        this.damage = damage;
   
        enemigoCreado++;
    }

//Math.max devuelve el mayor de los 2 valores, lo que impide que la vida sea negativa.

    public void restarVida(int damageRecibido){

            hp = Math.max(0, hp - damageRecibido);

    }

    public boolean estaDerrotado() {
    return hp <= 0;

    }
}