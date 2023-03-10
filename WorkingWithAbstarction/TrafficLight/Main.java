package WorkingWithAbstarction.TrafficLight;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TrafficLight> trafficLights = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(TrafficLight::valueOf).collect(Collectors.toList());
        int numberOfTimes = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numberOfTimes; i++){
            incrementTrafficLights(trafficLights);
            String print = trafficLights.stream().map(TrafficLight::name)
                    .collect(Collectors.joining(" "));
            System.out.println(print);
        }
    }

    private static void incrementTrafficLights(List<TrafficLight> trafficLights) {
        for(int i = 0; i< trafficLights.size(); i++){
            trafficLights.set(i, trafficLights.get(i).next());
        }
    }
}
