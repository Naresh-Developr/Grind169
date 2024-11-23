class Solution {
    public boolean canConstruct(String r, String m) {
        char[] a = r.toCharArray();
        char[] b = m.toCharArray(); 
        Arrays.sort(a);
        Arrays.sort(b);

        int idx = 0;

        for(int i=0;i<b.length;i++){
            if(idx < a.length && a[idx]==b[i]){
                idx++;
            }
        }

        return idx == a.length;


    }
}