package String;

public class RemoveNoncharacter {
    public static void removeNonCharacter(String s) {
        String input = s.replaceAll("[^A-Za-z]", "").toLowerCase();
        //removed non character like numeric and spaces, convert in lower case

        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    //return false;
                }
                head++;
                tail--;
            }
        }
    }
}
