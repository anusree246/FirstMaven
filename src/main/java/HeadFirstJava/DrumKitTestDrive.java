package HeadFirstJava;

public class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d=new DrumKit();
        d.playSnare();
        d.platTopHat();
        d.snare=false;

        if(d.snare == true){
            d.playSnare();
        }

    }
}
