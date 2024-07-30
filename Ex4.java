package homework2;

public class Ex4 {
    public static void main(String[] args) {
        String simply = "this is simply. This is my favourite song.";

        String newSimply = simply.replace("this is", "those are");
        System.out.println(newSimply);
        int index1 = newSimply.indexOf("o");
        int index2 = newSimply.indexOf("o", index1+1);
        System.out.println("Индекс 2-й \"o\": " + index2);
    }
}
