package com.workintech.sets.modelone;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Task {
    private String project;
    private String description;
    private Set<String> assignees;
    Priority priority;
    Status status;

    public Task(String project, String description, Priority priority, Status status) {
        this.project = project;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.assignees = new HashSet<>();
    }

    public String getProject() {
        return project;
    }


    public String getDescription() {
        return description;
    }

    public Set<String> getAssignee() {
        return assignees;
    }

    public void addAssignee(String assignee) {
        assignees.add(assignee);
    }

    public void removeAssignee(String assignee) {
        assignees.remove(assignee);
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", assignee='" + assignees + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
