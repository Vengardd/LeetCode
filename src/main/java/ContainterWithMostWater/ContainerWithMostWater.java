package ContainterWithMostWater;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        ContainerWithMostWater c = new ContainerWithMostWater();
        int[] tab = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(c.maxArea(tab));
    }

    public int maxArea(int[] height) {
        int actualLeftPointer = 0;
        int actualRightPointer = height.length - 1;
        int leftMaxPointer = actualLeftPointer;
        int rightMaxPointer = actualRightPointer;
        int actualSize = countSize(height, leftMaxPointer, rightMaxPointer);
        int maxSize = actualSize;
        while(actualRightPointer > actualLeftPointer) {
            actualSize = countSize(height, actualLeftPointer, actualRightPointer);
            if(actualSize > maxSize) {
                leftMaxPointer = actualLeftPointer;
                rightMaxPointer = actualRightPointer;
                maxSize = actualSize;
            }
            if(height[actualLeftPointer] > height[actualRightPointer])
                actualRightPointer--;
            else
                actualLeftPointer++;
        }
        return maxSize;
    }

    private int countSize(int[] tab, int leftMaxPointer, int rightMaxPointer) {
        int smaller = tab[leftMaxPointer] < tab[rightMaxPointer] ? tab[leftMaxPointer] : tab[rightMaxPointer];
        return (rightMaxPointer - leftMaxPointer) * smaller;
    }


}
