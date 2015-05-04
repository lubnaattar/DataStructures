package Trie;

class Trie
{
    private TrieNode root;
 
     /* Constructor */
    public Trie()
    {
        root = new TrieNode(' '); 
    }
    
     /* Function to insert word */
    public void insert(String word)
    {
        if (search(word) == true)  // search if word is existing already
            return;        
        TrieNode current = root; 
        for (char ch : word.toCharArray() ) //covert word to character
        {
            TrieNode child = current.subNode(ch);  // search for the same character in subnode
            if (child != null)
                current = child;  // if existing then traverse the character
            else 
            {
                 current.childList.add(new TrieNode(ch)); // else add a new character in childList 
                 current = current.subNode(ch); //  //
            }
            current.count++; 
        }
        current.isEnd = true;
    }
    
    /* Function to search for word */
    public boolean search(String word)
    {
        TrieNode current = root;  
        for (char ch : word.toCharArray() )
        {
            if (current.subNode(ch) == null)
                return false;
            else
                current = current.subNode(ch);
            System.out.println("character subnode found " + ch);
        }      
        if (current.isEnd == true){
        	System.out.println("word found at current" +word + "count" + current.count + "displaying current" + current);
        	return true;
        }
        return false;
    }
    /* Function to remove a word */
    public void remove(String word)
    {
        if (search(word) == false)
        {
            System.out.println(word +" does not exist in trie\n");
            return;
        }             
        TrieNode current = root;
        for (char ch : word.toCharArray()) 
        { 
            TrieNode child = current.subNode(ch);
            if (child.count == 1) 
            {
                current.childList.remove(child);
                return;
            } 
            else 
            {
                child.count--;
                current = child;
            }
        }
        current.isEnd = false;
    }
}