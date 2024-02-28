class flowerbed {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Initialize a counter for the number of new flowers that can be planted
        
        // Traverse the flowerbed array
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty and the adjacent plots are also empty (or out of bounds)
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower in the current plot
                count++; // Increment the count of planted flowers
                
                // If the required number of new flowers have been planted, return true
                if (count >= n)
                    return true;
            }
        }
        
        // Return true if the required number of new flowers have been planted, false otherwise
        return count >= n;
    }
    
    public static void main(String[] args) {
        flowerbed solution = new flowerbed();
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed1, n1)); // Output: true
        
        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed2, n2)); // Output: false
    }
}
