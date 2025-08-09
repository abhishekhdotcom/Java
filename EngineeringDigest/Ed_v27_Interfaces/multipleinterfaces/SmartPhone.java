package Ed_v27_Interfaces.multipleinterfaces;

// Smartphone class impliment multiple interface
public class SmartPhone implements Camera, MusicPlayer, Phone {

    // -----------Method Override-----------
    // Camera
    @Override
    public void takePhoto() {
        System.out.println("Click Photo by Smart-Phone!");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record Video by Smart-Phone!");
    }

    // Music
    @Override
    public void playMusic() {
        System.out.println("Play Music by Smart-Phone!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop Music by Smart-Phone!");
    }

    // Phone
    @Override
    public void MakeCall(String number) {
        System.out.println("Make Call by Smart-Phone: " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Call End by Smart-Phone!");
    }

}
