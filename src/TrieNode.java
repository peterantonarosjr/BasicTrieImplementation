import java.util.HashMap;

public class TrieNode {
    char c;
    HashMap<Character,TrieNode> childrenNodes = new HashMap<Character,TrieNode>();
    boolean leaf;

    public TrieNode(){
        //Empty Node
    }
    public TrieNode(char c){
        this.c = c;
    }
}
