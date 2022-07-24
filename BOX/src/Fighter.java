public class Fighter {
    String name;
    int health;
    int weight;
    int damage;
    int dodge;

    Fighter(String name,int health,int weight,int damage,int dodge){

        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        if (dodge >= 0 && dodge <=100) {
            this.dodge = dodge;
        }else
        this.dodge = 0;
    }

    int hit (Fighter rival){
        System.out.println(this.name + "  " + rival.name + "'a " + this.damage + " hasar vurdu!");

        if (rival.isDodge()){
            System.out.println(rival.name + " Gelen Hasari Blokladi!");
            System.out.println("------------------------");
            return rival.health;
        }
        if (rival.health-this.damage <0){
            return 0;
        }
        return rival.health-this.damage;
    }

    boolean isDodge (){
        double randomNumber = Math.random () *100;
        return randomNumber <= this.dodge;
    }
}
