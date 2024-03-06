import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Purple");
        colorsList.add("Yellow");
        colorsList.add("Green");

        for (String colors : colorsList) {
            System.out.println(colors);
        }

        colorsList.add(2, "Orange");
        colorsList.remove(1);
        System.out.println(colorsList);

        String searchTerm = "Green";
        String searchResult = searchColor(colorsList, searchTerm);
        System.out.println(searchResult);
    }
    public static String searchColor(ArrayList<String> colorsList, String searchTerm){
        int index = -1;
        for (int i = 0; i < colorsList.size(); i++){
            if (colorsList.get(i).equalsIgnoreCase(searchTerm)){
                index = i;
                break;

            }
        }
        if (index!= -1) {
            return "Color=" + searchTerm + "   Index=" + index;
        } else {
            return "The Color in not in the ArrayList";
        }

    }

}