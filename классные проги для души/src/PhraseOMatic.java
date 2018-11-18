public class PhraseOMatic {
    public static void main(String[] args) {
        String[] worldListOne = {"ты"};
        String[] wordListTwo = {"оказываешь поддержку","сильный","с невероятным голосом","крепко стоишь на ногах.","вдохновляешь меня становиться лучше. ","такой понимающий. ","такой невероятный","много для меня значишь. ","важен, даже если ты так не думаешь. ","силен в творчестве. ","так хорош в любви к людям."};
        int oneLenght = worldListOne.length;
        int twoLenght = wordListTwo.length;
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        String phrase = worldListOne[rand1] + " " + wordListTwo[rand2];
        System.out.println(phrase);
    }
}
