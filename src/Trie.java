import java.util.HashMap;

public class Trie {
    private TrieNode rootNode;

    public Trie(){
        rootNode = new TrieNode();
    }

    public void insertWord(String word){
        HashMap<Character,TrieNode> childrenNodes = rootNode.childrenNodes;

        for(int i=0; i<word.length(); i++){
            char current = word.charAt(i);

            TrieNode node;
            if(childrenNodes.containsKey(current)){
                node = childrenNodes.get(current);
            }else{
                node = new TrieNode(current);
                childrenNodes.put(current,node);
            }

            childrenNodes = node.childrenNodes;

            if(i==word.length()-1){
                node.leaf = true;
            }

        }
    }

    //Returns true or false if word is in the Trie
    public boolean isWordIn(String word){
        TrieNode node = searchTrie(word);

        if(node !=null && node.leaf){
            return true;
        }else{
            return false;
        }
    }

    //Returns true or false if "prefix" is in the Trie
    public boolean isPrefixIn(String prefix){
        TrieNode node = searchTrie(prefix);
        if(node == null){
            return false;
        }else{
            return true;
        }
    }

    //Searches Trie for the word provided in isInTrie()
    public TrieNode searchTrie(String word) {
        HashMap<Character,TrieNode> childrenNodes = rootNode.childrenNodes;
        TrieNode node = null;

        for(int i=0; i<word.length(); i++){
            char current = word.charAt(i);
            if(childrenNodes.containsKey(current)){
                node = childrenNodes.get(current);
                childrenNodes = node.childrenNodes;
            }else{
                return null;
            }
        }
        return node;
    }

}
