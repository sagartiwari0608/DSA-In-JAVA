public class OpenDoor {
    public static void main(String[] args) {
    //   this is just a peseudo code

    // we have reached starting point. 



    // first close all doors since we know max so we loop for max number .

        maxHouses=7;

        for(int i=0;i<maxHouses;i++){

            currentHouse.close();
            currentHouse.moveLeft();

        }
//now that all doors areb
// then repeat earlier process.



        currentHouse.open();
        count =1;
        currentHouse.moveLeft();

        while(!isOpened()){
            count++;
            currentHouse.moveLeft();
        }
        return count;

    }
}
