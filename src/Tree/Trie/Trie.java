package Tree.Trie;
import java.sql.SQLOutput;
import java.util.*;
//time complexity O(L) L is length of largest string; (insert function)

//search fast
// root node is empty node.
//prefix is not repeated.
// we will mark eow when one string completed while making tree
public class Trie {
    static class Node {
        Node[] children = new Node[26];
        boolean EndOfWord;

        Node() {
            EndOfWord = false;

            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }

        }
    }

    static Node root = new Node();//stores the children's information

    public static void insert(String word) {
        Node curNode = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curNode.children[idx] == null) {
                curNode.children[idx] = new Node();
            }

            curNode = curNode.children[idx];

        }
        curNode.EndOfWord = true;
    }

    public static boolean Search(String key) // search time complexity  O(key.length)/O(L)
    {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.EndOfWord;

    }

    public static boolean wordbreak(String key) {
        if(key.length()==0) {
            return true;
        }
        for(int i=1; i<=key.length(); i++) {
            String firstPart = key.substring(0,i);
            String secondpart = key.substring(i);
            if(Search(firstPart) && wordbreak(secondpart)) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
//        String words[]={"the", "a", "there", "their","any"};
//        for(int i=0;i<words.length;i++)
//        {
//            insert(words[i]);
//        }
//        System.out.println(Search("there"));
//        System.out.println(Search("any"));
//        System.out.println(Search("hot"));


        String words[] = {"i", "like", "sam", "samsung", "mobile"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        String key = "ilikesung";
        boolean result = wordbreak(key);
        System.out.println(result);
    }
}


// question type
//startsWithPrefix
//count unique substrings(solvig technique pehle all suffix then unke all prefix)
// total nodes of trie = count of unique prefix.f