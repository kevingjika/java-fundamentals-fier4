import perseritje.Human;
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Human human2 = new Human("Kevin");
        Human human3 = new Human("j80330074e", "Kevin", 26);
        human.emri = "Mario";
        System.out.println("Emri : " + human.emri);
        System.out.println("Emri : " + human2.emri);
        System.out.println("Id : " + human3.id);
        System.out.println("Emri : " + human3.emri);
        System.out.println("Mosha : " + human3.mosha + " vjeç");
    }
}