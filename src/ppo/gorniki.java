package ppo;

public class gorniki {
    private String name;
    private int age;
    private String addres;

    public gorniki(String name, int age, String addres) {
        this.name = name;
        this.age = age;
        this.addres = addres;
    }

    public String getName(){
        return  this.name;
    }

    public int getAge(){
        return  this.age;
    }

    public  String getAddres(){
        return this.addres;
    }

    public String info(){
        return "имя" + name + ", возраст" + age + ", адрес" + addres;
    }
}

