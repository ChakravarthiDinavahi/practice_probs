    public static void convertToWave(int a[], int n){
        
        // Your code here
        int t;
        for(int i=0;i<n;i=i+2){
            
            if ( i+1 < n && a[i] < a[i+1]){
                t=a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }

        }
        
    }
