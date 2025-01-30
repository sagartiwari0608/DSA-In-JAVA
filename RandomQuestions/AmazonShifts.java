
// import java.util.Arrays;

// public class AmazonShifts {
//     public static void main(String[] args) {
//         int[] orderProcessTime = { 2, 4, 5, 1, 1 };
//         int[] shiftDuration = { 1, 5, 1, 5, 2 };

//         int[] remainingOrders = processOrders(orderProcessTime, shiftDuration);

//         System.out.println("Remaining orders after each shift: " + Arrays.toString(remainingOrders));
//     }

//     public static int[] processOrders(int[] orderProcessTime, int[] shiftDuration) {
//         int n = shiftDuration.length;
//         int m = orderProcessTime.length;
//         int[] remainingOrders = new int[n];

//         for (int i = 0; i < shiftDuration.length; i++) {
//             int shiftTime = shiftDuration[i];

//             for (int j = 0; j < orderProcessTime.length; j++) {
//                 if (orderProcessTime[j] > 0) {
//                     if (orderProcessTime[j] <= shiftTime) {
//                         shiftTime -= orderProcessTime[j];
//                         orderProcessTime[j] = 0;
//                     } else {
//                         orderProcessTime[j] -= shiftTime;
//                         shiftTime = 0;
//                     }
//                 }

//                 if (shiftTime == 0)
//                     break;
//             }

//             // Count remaining orders after each shift
//             int count = 0;
//             for (int order : orderProcessTime) {
//                 if (order > 0)
//                     count++;
//             }
//             remainingOrders[i] = count;
//         }

//         return remainingOrders;
//     }
// }

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AmazonShifts {
    public static void main(String[] args) {
        int[] orderProcessTime = { 2, 4, 5, 1, 1 };
        int[] shiftDuration = { 1, 5, 1, 5, 2 };

        List<Integer> remainingOrders = processOrders(orderProcessTime, shiftDuration);

        System.out.println("Remaining orders after each shift: " + remainingOrders);
    }

    public static List<Integer> processOrders(int[] orderProcessTime, int[] shiftDuration) {
        int n = shiftDuration.length;
        int[] remainingOrdersArray = new int[n];

        for (int i = 0; i < shiftDuration.length; i++) {
            int shiftTime = shiftDuration[i];

            for (int j = 0; j < orderProcessTime.length; j++) {
                if (orderProcessTime[j] > 0) {
                    if (orderProcessTime[j] <= shiftTime) {
                        shiftTime -= orderProcessTime[j];
                        orderProcessTime[j] = 0;
                    } else {
                        orderProcessTime[j] -= shiftTime;
                        shiftTime = 0;
                    }
                }

                if (shiftTime == 0)
                    break;
            }

            // Count remaining orders after each shift
            int count = 0;
            for (int order : orderProcessTime) {
                if (order > 0)
                    count++;
            }
            remainingOrdersArray[i] = count;
        }

        // Convert array to List<Integer>
        List<Integer> remainingOrdersList = Arrays.stream(remainingOrdersArray).boxed().collect(Collectors.toList());
        // this would have worked but bc dimaag kharaab hogaaya
        System.out.println(remainingOrdersList.getClass().getName());

        return remainingOrdersList;
    }
}
