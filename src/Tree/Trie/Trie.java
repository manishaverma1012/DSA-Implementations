package Tree.Trie;
import java.sql.SQLOutput;
import java.util.*;
//time complexity O(L) L is length of largest string;
public class Trie {
    static class Node
    {
        Node[] children =new Node[26];
        boolean EndOfWord;
        Node()
        {
            EndOfWord=false;

            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }

        }
    }
    static Node root=new Node();//stores the children's information
    public static void insert(String word)
    {
        Node curNode=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curNode.children[idx]==null)
            {
                curNode.children[idx]=new Node();
            }

            curNode=curNode.children[idx];

        }
        curNode.EndOfWord=true;
    }
    public static boolean Search(String key)
    {
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int idx=key.charAt(i)-'a';

            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.EndOfWord;

    }

    public static void main(String[] args) {
        String words[]={"the", "a", "there", "their","any"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(Search("there"));
        System.out.println(Search("any"));
        System.out.println(Search("hot"));
    }
}
