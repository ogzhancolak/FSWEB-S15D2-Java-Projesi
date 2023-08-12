package com.workintech.sets.modelone;

import java.util.Set;

public class taskMain {
    public static void main(String[] args) {
        TaskData taskData = new TaskData();

        Task task1 = new Task("Project A", "Test 1", Priority.HIGH,Status.IN_PROGRESS);
        Task task2 = new Task("Project B", "Test 2", Priority.LOW,Status.ASSIGNED);
        Task task3 = new Task("Project C", "Test 3", Priority.HIGH,Status.IN_PROGRESS);
        Task task4 = new Task("Project D", "Test 4", Priority.MED,Status.IN_QUEUE);
        Task task5 = new Task("Project E", "Test 5", Priority.LOW,Status.ASSIGNED);
        Task task6 = new Task("Project F", "Test 6", Priority.MED,Status.IN_PROGRESS);

        taskData.addTask("ann", task1);
        taskData.addTask("bob", task2);
        taskData.addTask("carol", task3);
        taskData.addTask("ann", task4);
        taskData.addTask("bob", task5);
        taskData.addTask("carol",task6);

        taskData.addTask("carol",task2);
        taskData.addTask("bob",task1);

        Set<Task> taskAll = taskData.getTasks("all");
        System.out.println("All Taks: " + taskAll);

        Set<Task> taskAnn = taskData.getTasks("ann");
        Set<Task> taskCarol = taskData.getTasks("carol");
        Set<Task> taskBob = taskData.getTasks("bob");

        System.out.println("Ann's Task: " + taskAnn);
        System.out.println("Carol's Task: " + taskCarol);
        System.out.println("Bob's Task: " + taskBob);

        Set<Task> unassignedTasks = taskData.getUnassignedTasks();
        System.out.println("Unassigned Tasks: " + unassignedTasks);

        Set<Task> duplicateTasks = taskData.getTasksAssignedToMultiple();
        System.out.println("Duplicate Tasks: " + duplicateTasks);

        Set<Task> annAndBobTasks = taskData.getUnion(taskAnn, taskBob);
        System.out.println("Union of Ann and Bob's Tasks: " + annAndBobTasks);

        Set<Task> bobAndCarolTasks = taskData.getIntersect(taskBob, taskCarol);
        System.out.println("Intersection of Bob and Carol's Tasks: " + bobAndCarolTasks);

        Set<Task> carolTasksDifference = taskData.getDifference(taskAnn, taskCarol);
        System.out.println("Difference of Carol's Tasks from Ann's Tasks: " + carolTasksDifference);

    }
}
