package InheritanceDemos.polymorphismDemo;

public class TvShowroom {

    void channels()
    {
        System.out.println("Showroom channels");
    }
    void volume()
    {
        System.out.println("Showroom volume");
    }

    void settings()
    {
        System.out.println("Showroom settings");
    }
}

class Samsung extends  TvShowroom {

    void channels()
    {
        System.out.println("Samsung channels");
    }
    void volume()
    {
        System.out.println("Samsung volume");
    }

    void settings()
    {
        System.out.println("Samsung settings");
    }
}

class Onida extends  TvShowroom {

    void channels()
    {
        System.out.println("Onida channels");
    }
    void volume()
    {
        System.out.println("Onida volume");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }
}

class LG extends  TvShowroom {

    void channels()
    {
        System.out.println("LG channels");
    }
    void volume()
    {
        System.out.println("LG volume");
    }

    void settings()
    {
        System.out.println("LG settings");
    }
}

class TestOverriding{

    public static void main(String[] args) {

        TvShowroom tvShowroom = new Samsung();

        tvShowroom.channels();
        tvShowroom.volume();
        tvShowroom.settings();

        tvShowroom = new Onida();

        tvShowroom.channels();
        tvShowroom.volume();
        tvShowroom.settings();

        tvShowroom = new LG();

        tvShowroom.channels();
        tvShowroom.volume();
        tvShowroom.settings();
    }
}