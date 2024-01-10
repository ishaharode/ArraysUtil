public class SubsetOfList {

    public static List<Integer> subsetA(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        Collections.sort(arr);
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        int m= n%2;
        int l= n-m;

        for(int i =n-1;i>n-3;i--){

            A.add(arr.get(i));
        }
        for(int i =0;i>=n-3;i++){

            B.add(arr.get(i));
        }

        Collections.sort(A);

        return A;

    }
}
