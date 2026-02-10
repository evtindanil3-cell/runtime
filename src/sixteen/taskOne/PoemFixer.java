package sixteen.taskOne;

public class PoemFixer {
    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }
    public String fixPoem(String[] poem) {
        String text = "";
        for(int i = 0;i<poem.length;i++){
            if(!poem[i].isBlank()){
                text +=poem[i].trim();
                text+="\n";
            }
        }
        return text;
    }
}
