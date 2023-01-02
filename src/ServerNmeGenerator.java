import java.util.Random;

public class ServerNmeGenerator {
    public static void main(String[]args){
        Random rand = new Random();
        String[] tenAdjectives = {"Everywhen ", "Hullaballoo ", "Biblioklept ", "Rhumba ", "Nippy ", "Whippersnapper ", "Cattywampus ", " Bamboozled ", "Thundering ", "Functional "};
        String[] tenNouns = {"Balaclava ", "Monocle ", "Revolver ", "Subaru ", "Diving Rod ", "British Shorthair ", "Diesel Exhaust Fluid ", "Gloabl Warming ", "Rumours ", "Hamsters"};

        System.out.println("Server Name: " + tenAdjectives[rand.nextInt(tenAdjectives.length)] + tenNouns[rand.nextInt(tenNouns.length)]);

    }
}