public class linear_search_in_string {
    public static void main(String[] args){
        String name="Roshan";
        char target='s';
        System.out.println(stringsearch(name,target));
    }
    static boolean stringsearch(String name, char target){
        // name.length() is used to cal. length of string whereas name.length is used to cal. length of arr or int. Internally .length() works same as .length .
        if (name.length()==0){
            return false;
        }
        for(int i=0; i<name.length();i++){
            if (target==name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
