public class interfacePractical {

    public static void main(String[] args) {
        Remote remote = new Television();
        remote.powerOn();
        remote.powerOff();
        remote.volumUp();
        remote.powerDown();

    }
}

interface Remote{
    abstract public void powerOn();
    abstract public void powerOff();
    abstract public void volumUp();
    abstract public void powerDown();

}

class Television implements Remote{


    @Override
    public void powerOn() {
        System.out.println("Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }

    @Override
    public void volumUp() {

        System.out.println("Volume Up");
    }

    @Override
    public void powerDown() {

        System.out.println("Volume Down");
    }
}