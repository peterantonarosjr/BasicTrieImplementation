public class Main {

    public static void main(String[] args){

        String testWord1 = "hello";
        String testWord2 = "world";
        Trie newTrie = new Trie();
        newTrie.insertWord(testWord1);
        newTrie.insertWord(testWord2);

        System.out.println(newTrie.isWordIn(testWord1));
        System.out.println(newTrie.isWordIn(testWord2));
        System.out.println(newTrie.isPrefixIn("wo"));
        System.out.println(newTrie.isPrefixIn("he"));


    }
}