package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import dataStructure.Node;
import dataStructure.PCB;
import dataStructure.Queue;
import scheduler.SchedulerSimulationController;

public class Main extends Application {

    private Queue readyQueue;
    private int currentTime = 0;
    private int totalBurstTime = 0;
    private int totalWaitingTime = 0;
    private int totalTurnaroundTime = 0;
    private int numberOfProcesses = 0;
    private SchedulerSimulationController ctrl;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("SJF Preemptive FCFS Gantt Chart");

        // Create a BarChart to represent the Gantt Chart
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> ganttChart = new BarChart<>(xAxis, yAxis);
        ganttChart.setTitle("Gantt Chart");

        // Create series for the chart
        XYChart.Series<String, Number> series = new XYChart.Series<>();

        // Initialize your readyQueue and ctrl objects here

        // Add processes to the readyQueue

        // Prepare the Gantt Chart data
        prepare();

        Node traverseNode = readyQueue.getHead();
        while (traverseNode != null) {
            // Add data to the chart
            if (ctrl.getCurrentTime() < traverseNode.getPcb().getArrivalTime()) {
                series.getData().add(new XYChart.Data<>(
                        "Idle",
                        traverseNode.getPcb().getArrivalTime() - ctrl.getCurrentTime()
                ));
            }
            series.getData().add(new XYChart.Data<>(
                    "P" + traverseNode.getPcb().getPID(),
                    traverseNode.getPcb().getBurstTime()
            ));
            traverseNode = traverseNode.getNext();
        }

        // Create a scene with the chart
        Scene scene = new Scene(ganttChart, 800, 600);
        ganttChart.getData().addAll(series);

        primaryStage.setScene(scene);
        primaryStage.show();

        // Calculate and display average waiting and turnaround times
        calculateAverageTimes();
    }

    private void prepare() {
        // Initialize the readyQueue and other necessary variables
    }

    private void calculateAverageTimes() {
        // Calculate and display the average waiting and turnaround times
    }
}
