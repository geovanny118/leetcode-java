package exercise_0125;

public class exercise_0125 {
    public boolean IsPalindrome(string s) {
        s = PrepareString(s);
        if(s.Equals(ReverseString(s)))
        {
            return true;
        }
        return false;
    }

    public String PrepareString(string s)
    {
        s = RemovePunctuationAndSpaces(s);
        s = ChangeToLowerCase(s);
        return s;
    }

    public String RemovePunctuationAndSpaces(string s)
    {
        string pattern = @"[.,:;!?@#_'|\\/\- {}\""[\]()``]";
        string subtitution = "";
        s = Regex.Replace(s, pattern, subtitution);
        return s;
    }

    public String ChangeToLowerCase(string s)
    {
        s = Regex.Replace(s, @"[A-Z]", match => match.Value.ToLower());
        return s;
    }

    public String ReverseString(string s)
    {
        char[] charArray = s.ToCharArray();
        Array.Reverse(charArray);
        return new string(charArray);
    }
}
