class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        paren(n, 0,0,"",list);
        return list;
    }

    public static void paren(int n, int open, int close, String ans, List<String> list){
        if(open==n && close==n){
            list.add(ans);
            return;
        }
        if(open<n){
        paren(n, open+1, close, ans+'(', list);
        }
        if(close<open){
        paren(n, open, close+1, ans+')', list);
        }
    }
}
