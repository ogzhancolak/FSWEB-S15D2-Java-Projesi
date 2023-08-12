package com.workintech.sets.modelone;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> tasks = new HashSet<>();

    public Set<Task> getTasks(String person) {
        Set<Task> personTasks = new HashSet<>();

        for (Task task : tasks) {
            if (person.equals("all") || task.getAssignee().contains(person)) {
                personTasks.add(task);
            }
        }

        return personTasks;
    }

    public Set<Task> getUnassignedTasks() {
        Set<Task> unassignedTasks = new HashSet<>();

        for (Task task : tasks) {
            if (task.getAssignee().isEmpty()) {
                unassignedTasks.add(task);
            }
        }

        return unassignedTasks;
    }

    public Set<Task> getTasksAssignedToMultiple() {
        Set<Task> tasksAssignedToMultiple = new HashSet<>();
        Set<String> uniqueTasks = new HashSet<>();

        for (Task task : tasks) {
            if (task.getAssignee().size() > 1) {
                tasksAssignedToMultiple.add(task);
            }
        }

        return tasksAssignedToMultiple;
    }

    public Set<Task> getUnion(Set<Task> set1, Set<Task> set2) {
        Set<Task> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public Set<Task> getIntersect(Set<Task> set1, Set<Task> set2) {
        Set<Task> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    public Set<Task> getDifference(Set<Task> set1, Set<Task> set2) {
        Set<Task> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    public void addTask(String assignee, Task task) {
        if (assignee != null) {
            task.getAssignee().add(assignee);
        }
        tasks.add(task);
    }
}
