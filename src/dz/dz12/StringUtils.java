package dz.dz12;

/**
 * Created by Администратор on 20.05.2017.
 */
public class StringUtils {
    public static void main(String[] args) {
        getPolindroms("");
    }
    public static String[] getPolindroms (String innerText){
        String str = "Пришел, Вася, Бабаб! Бла-бла? Казак, эй! полоп";
        str = str.toLowerCase();
        String[] words = str.split("[,.;:'\"!?]+");
        for(int i=0; i<words.length; i++)
        {
            int k=words[i].length()-1;
            for(int j=0; j<words[i].length(); j++)
            {
//                if(words[i][j]==words[i][k-j])
//                {
//
//                }
            }
        }
        return words;
    }
}
