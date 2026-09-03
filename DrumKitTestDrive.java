class DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("Bang Bang Ba-Bang");
    }
    void playTopHat(){
        System.out.println("Ding Ding Da-Ding");
    }
}
class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.playTopHat();
    }
}   

