
public class CommonElement {
    public static void main(String[] args) {
        
        int arr1[]={1,5,10,20,40,80};
        int arr2[]={6,7,20,80,100};
        int arr3[]={3,4,15,20,30,70,80,100};
        //Function Call
        System.out.println("Common Element in Three sorted array is:");
        
        commonele(arr1,arr2,arr3);

    }
    public static void commonele(int arr1[],int arr2[],int arr3[]){
        int x=0,y=0,z=0;
        //loop until any array is not empty
        while (x<arr1.length && y<arr2.length && z<arr3.length){
            //if x=y and y=z then print any of them
            if (arr1[x]==arr2[y]&&arr2[y]==arr3[z]){
                //print any of them
                System.out.println(arr1[x]);
                x++;
                y++;
                z++;
             //if x<y then increment x
            }else if (arr1[x]>arr2[y]){
                y++;
                //if y<z then increment y
            } else if (arr2[y]>arr3[z]) {
                z++;
                
                //if x<z then increment z
            }else {
                x++;
            }
        }
    }
}

