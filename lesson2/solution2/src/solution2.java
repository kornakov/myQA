public class solution2 {
    public static void main(String[] args) {
        String twister="Рассерженный Родион Романович раскричался: 'Рано радовались, размокший ремень рюкзака разорвался'";
        String twisterWithoutR="";
        for(int i=0; i<twister.length(); i++)
        {
            if (twister.charAt(i)=='р' /*|| twister.charAt(i)=='Р'*/) twisterWithoutR+="*"; // Если нужно заменить и большую букву - раскомментируй.
            else twisterWithoutR +=twister.charAt(i);
        }
        System.out.println(twisterWithoutR);

    }
}
