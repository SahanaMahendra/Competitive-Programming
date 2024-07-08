import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberUsingQueue {
    static String[] binaryNumberUsingQueue(int n){
        String[] result =new String[n];
        Queue<String> que= new LinkedList<>();
        que.offer("1");
        for(int i=1; i<n; i++){
            result[i]=que.poll();
            String n1=result[i]+"0";
            String n2=result[i]+"1";
            que.offer(n1);
            que.offer(n2);
        }
        return result;
    }
}
