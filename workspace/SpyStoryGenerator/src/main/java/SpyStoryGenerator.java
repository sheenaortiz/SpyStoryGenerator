public class SpyStoryGenerator {
    public static void main (String[] args) {
        String[] wordListOne = {"Japanese", "Russian", "German", "Scottish", "Italian", "English", "Egyptian", "Greek", "Spanish", "Korean"};
        String[] wordListTwo = {"well-travelled", "competent", "ambitious", "resourceful", "charismatic", "knowledgeable", "observant", "contented", "easily-awed", "pretentious"};
        String[] wordListThree = {"dog", "cat", "iguana", "fish", "badger", "parrot", "bunny", "horse", "mouse", "ferret"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListThree[rand3];
        String phraseTwo = wordListTwo[rand2];

        System.out.println("What we really need on this mission is a " + phrase + " who is " + phraseTwo + ".");
    }
}
