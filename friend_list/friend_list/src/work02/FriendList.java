package work02;

import java.lang.reflect.Field;

public class FriendList {
    private final String name;
    private FriendList next;

    private FriendList(String name) { this.name = name; }
    public static FriendList newList() { return new FriendList(""); }
    public boolean addFriend(String name) {
        /*
        It returns "false" if "name" is null or a blank string or
        this "name" has already existed its "name" field of itself,
        its "next", or its "next" of "next" ...
        Otherwise, it will create a new "FriendList" object with that "name"
        and put it in the "next" field of the last "FriendList".
        */
        if (name == null || name.isBlank()) {
            return false;
        }
        FriendList current = this;
        while (current.next != null) {
            current = current.next;
            if (current.name.equals(name)) {
                return false;
            }
        }
        current.next = new FriendList(name);
        return true;
    }
    @Override
    public String toString() {
        /* this method returns a "String" containing "name" of
        all "FriendList" object in all the "next" fields */

        // KK Style
        var current = this.next;
        if (current == null) {
            return "";
        }
        var s = new StringBuilder() ;
        s.append(current.name) ;
        while ((current = current.next) != null) {
            s.append(", ").append(current.name);
        }
        return s.toString();

        /* Chat GPT
        StringBuilder result = new StringBuilder();
        FriendList current = this;
        while (current != null) {
            result.append(current.name).append(" ");
            current = current.next;
        }
        return result.toString().trim();
        */
    }
}
