public class solution1 {
    public static void main(String[] args) {
        String twister="Рассерженный Родион Романович раскричался: 'Рано радовались, размокший ремень рюкзака разорвался'";
        String twisterWithoutR=twister.replace('р', '*');// буквы Р не трогал!
        //String twisterWithoutBigR=twister.replace('Р', '*');//если очень хочется заменить Р - расскомментируй
        System.out.println(twisterWithoutR);
    }

}
