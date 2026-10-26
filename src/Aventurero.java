public class Aventurero {

    public static int aventureroCreado = 0;

        private String nombre;

        private int hp;

        private int hitMax;

        private int damage;

        private int maxPotis;

            public int curacionPotis = 25;

    public Aventurero (String nombre, int hp, int damage, int maxPotis){


        this.nombre = nombre;
        this.hp = hitMax;
        this.damage = damage;
        this.maxPotis = maxPotis;

        aventureroCreado++;
    }

    //Math.min devuelve el menor de los 2 valores, lo que impide que la vida sea mayor a la vida máxima del personaje.

    public void SumarVidaYRestarPotis(int hpActual, int curación, int potisActuales, int potisFinales){

            hp = Math.min(hp, hpActual + curación);
            potisFinales = Math.max(0, potisActuales - 1);
    
    }
    //=====================================================================
    public void RestarVida(int damageRecibido){

            hp = Math.max(0, hp - damageRecibido);

    }

    public boolean haCaído() {
    return hp <= 0;
    }
    //=====================================================================

    public String getNombre() {
        return this.nombre;
    }

    public int getHP() {
        return this.hp;
    }

    public int getDamage() {
        return this.damage;

       }

    public int getMaxPotis() {
        return this.maxPotis;

        }
        public int getCuracionPotis() {
        return curacionPotis;

        } 
    }
