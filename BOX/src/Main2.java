public class Main2 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Tsubasa", 100,90,15,30);
        Fighter f2 = new Fighter("Naketakesan",120,85,18,40);

        Match match = new Match(f1,f2,84,92);
        match.run();
    }

}
