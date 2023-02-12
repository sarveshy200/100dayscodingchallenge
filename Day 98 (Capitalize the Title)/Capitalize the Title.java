class Solution {
    public String capitalizeTitle(String title) {
        String s="";
        title=title.toLowerCase();
        String[] arr=title.split("\\s+");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>2){
                arr[i]=Character.toUpperCase(arr[i].charAt(0))+arr[i].substring(1,arr[i].length());
            }
            s=s+arr[i]+" ";
        }
        return s.trim();
    }
}
