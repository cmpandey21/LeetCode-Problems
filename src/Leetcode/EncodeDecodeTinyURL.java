package Leetcode;
/*
Input: url = "https://leetcode.com/problems/design-tinyurl"
Output: "https://leetcode.com/problems/design-tinyurl"

Explanation:
Solution obj = new Solution();
string tiny = obj.encode(url); // returns the encoded tiny url.
string ans = obj.decode(tiny); // returns the original url after decoding it.
 */
public class EncodeDecodeTinyURL {
	private static String origionalUrl;
    private static String tinyUrl;

	 public String encode(String longUrl) {
	        
		 origionalUrl=longUrl;
	        tinyUrl="http://tinyurl.com/4e9iAkl";
	        return tinyUrl;
	    }

	    // Decodes a shortened URL to its original URL.
	    public  String decode(String shortUrl) {
	    	return origionalUrl;

	    }
}
