package deadlock.problem.Service;

import deadlock.shared.Resource;

/**
 * Created by User-PC on 26.10.2014.
 */
public class UsefulService {

    public void useResource(Resource resourceA, Resource resourceB){
        try {
            resourceA.useItWith(resourceB);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
