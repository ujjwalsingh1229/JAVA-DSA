package ARRAY.LinearSearching;

public class SearchiINString {
    public static void main(String[] args){
        String name="Ujjwal";
        char target ='w';
        System.out.println(Search(name,target));

    }
    public static boolean Search(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0; i<name.length(); i++){
            if(target==name.charAt(i)){
            return true;
            }
        }
        return false;
    }
}
