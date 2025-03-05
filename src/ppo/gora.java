package ppo;

public class gora {
    private String name;
    private String country;
    private int height;

    public gora(String name, String country,int height) {
        this.name = name;
        this.country = country;
        this.height = height;
    }

    public String info() {
        return "название" + name + ", страна" + country + ", высота" + height;
    }
}
