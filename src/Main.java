import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        if (args.length == 2) {
            int arrayLimit = Integer.parseInt(args[0]);
            int stepsCount = Integer.parseInt(args[1]);

            List<Integer> wayNumbers = new ArrayList();
            int finishSensor = 0;

            while (true) {
                for (int i = 0; i < stepsCount; i++) {
                    finishSensor++;
                    if (i == 0) {
                        wayNumbers.add(finishSensor);
                    }

                    if (finishSensor == arrayLimit & i != stepsCount - 1) {
                        finishSensor = 0;
                    }
                }

                if (finishSensor == 1) {
                    break;
                }

                finishSensor--;

            }
            wayNumbers.forEach(x -> System.out.print(x));
        }
    }
}