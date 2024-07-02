package ushtrimi19;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Kadare", "albanian");
        Poem poem1 = new Poem(author1, 3);
        Author author2 = new Author("Agolli", "albanian");
        Poem poem2 = new Poem(author2, 5);
        Author author3 = new Author("Doçi", "albanian");
        Poem poem3 = new Poem(author3, 2);
        Author [] array1 = new Author [] {author1, author2, author3};
        Poem [] array2 = new Poem [] {poem1, poem2, poem3};
        System.out.println("Poem1 : ");
        System.out.println("Surname : " + array1[0].surname);
        System.out.println("Nationality : " + array1[0].nationality);
        System.out.println("Number of strophes : " + array2[0].stropheNumbers);
        System.out.println();
        System.out.println("Poem2 : ");
        System.out.println("Surname : " + array1[1].surname);
        System.out.println("Nationality : " + array1[1].nationality);
        System.out.println("Number of strophes : " + array2[1].stropheNumbers);
        System.out.println();
        System.out.println("Poem3 : ");
        System.out.println("Surname : " + array1[2].surname);
        System.out.println("Nationality : " + array1[2].nationality);
        System.out.println("Number of strophes : " + array2[2].stropheNumbers);
        System.out.println();
        int maxStropheNumbers = array2[0].stropheNumbers;
        String maxSurnameAuthor = array1[0].surname;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i].stropheNumbers > maxStropheNumbers) {
                maxStropheNumbers = array2[i].stropheNumbers;
                maxSurnameAuthor = array1[i].surname;
            }
        }
        System.out.println("The author with the longest poem is " + maxSurnameAuthor + ".");
    }
}
