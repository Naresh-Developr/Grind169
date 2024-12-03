class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[] distance = new int[n];

        for(int i=0;i<n;i++){
            int x = points[i][0];
            int y = points[i][1];

            distance[i] = (x*x) + (y*y);

        }
        Arrays.sort(distance);
        int[][] result = new int[k][2];
        int distk = distance[k-1];
        int index = 0;
        for(int i=0;i<n;i++){
            int x = points[i][0];
            int y = points[i][1];
            int dist = (x*x) + (y*y);

            if(dist<=distk){
                result[index++] = points[i];
            }
        }
        return result;
        
    }

    
}