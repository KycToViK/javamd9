public abstract class Pet {
    private int pawsCount;
    private String voice;

    protected Pet(int u, String voice){
        this.pawsCount = u;
        this.voice = voice;
    }
    public void sleep() {
        System.out.println("Сплю");
    }

    public void play(){
        System.out.println("Играю");
    }


    public void giveVoice(){
        System.out.println(voice);
    }

    public int getPawsCount() {
        return pawsCount;
    }
}
