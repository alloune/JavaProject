public class Main {
    public static void main(String[] args) {
        int loadingCap = 9;
        int remainingBoxes = 34;
        int totalLoad=0;

        while(remainingBoxes > 0){
            if(remainingBoxes >= loadingCap){
                remainingBoxes -= loadingCap;
                totalLoad = loadingCap;
                System.out.println("Voyage de " + totalLoad + " cartons.");
            }
            else{
                loadingCap = remainingBoxes;
                totalLoad = loadingCap;
                remainingBoxes -=totalLoad;
                System.out.println("Voyage de " + totalLoad + " cartons.");
            }
        }
    }
}