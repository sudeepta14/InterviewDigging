package Blind75.Medium;

class DesignAddAndSearch {
    TrieNodeNew root;
    public DesignAddAndSearch() {
        root = new TrieNodeNew();
    }

    public void addWord(String word) {
        TrieNodeNew curr = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            if(curr.children[c-'a'] == null){
                curr.children[c-'a'] = new TrieNodeNew();
            }
            curr = curr.children[c-'a'];
        }
        curr.item = word;
    }

    public boolean search(String word) {
        return match(word.toCharArray(), 0, root);
    }

    public boolean match(char[] chs, int k, TrieNodeNew root){
        if(chs.length == k) return !root.item.equals("");

        char c = chs[k];
        if(c != '.'){
            return root.children[c-'a'] != null && match(chs, k+1, root.children[c-'a']);
        }else{
            for(int i=0; i<26; i++){
                if(root.children[i] != null){
                    if(match(chs, k+1, root.children[i])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

class TrieNodeNew{
    public TrieNodeNew[] children = new TrieNodeNew[26];
    public String item = "";
}

/*
Time complexity for adding O(M) -- length of the word
Time complexity for search O(N * 26^M) -- n-ary nodes size of a tree.


 */