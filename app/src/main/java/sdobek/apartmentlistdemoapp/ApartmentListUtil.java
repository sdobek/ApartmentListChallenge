package sdobek.apartmentlistdemoapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by stevendobek on 2/14/18.
 */

public class ApartmentListUtil {

    public static List<List<String>> splitList(ArrayList<String> peopleList) {
        List<List<String>> returnList = new ArrayList<>();
        if (peopleList.size() < 2) {
            throw new IndexOutOfBoundsException();
        }

        if (peopleList.size() >= 3 && peopleList.size() <= 5) {
            Log.d("==>", "List size: " + peopleList.size() + ", " + Arrays.toString(peopleList.toArray()));
            // Done
            returnList.add(peopleList);
            return returnList;
        } else {

            Random rand = new Random();
            ArrayList newGroup = new ArrayList();
            final int currentSize = peopleList.size();
            while (peopleList.size() > (currentSize / 2)) {
                int n = rand.nextInt(peopleList.size());
                String person = peopleList.remove(n);
                newGroup.add(person);
            }

            returnList.addAll(splitList(peopleList));
            returnList.addAll(splitList(newGroup));
            Log.d("==>", "List size: " + returnList.size() + ", " + Arrays.toString(returnList.toArray()));

            return returnList;
        }

    }
}
