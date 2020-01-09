package com.example;

import java.time.LocalDate;

public class Task {
	 private String taskName;
	 private String taskId;
	 private LocalDate taskDate;
	 private boolean isCompleted;
	
	 public Task(String taskName, String taskId, LocalDate taskDate, boolean isCompleted )
	 {
		 this.taskName = taskName;
		 this.taskId = taskId;
		 this.taskDate = taskDate;
		 this.isCompleted = isCompleted;
	 }

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", taskId=" + taskId + ", taskDate=" + taskDate + ", isCompleted="
				+ isCompleted + "]";
	}


	public boolean equals(Object obj) {

		Task myTask = null;
		boolean isEqual=false;
		if (obj instanceof Task) {
			myTask = (Task) obj;
		}
		if((this.getTaskName()==myTask.getTaskName()) &&
				(this.getTaskDate().equals(((Task) obj).getTaskDate())&&(this.isCompleted()==myTask.isCompleted())))
		{
			isEqual=true;
		}
		return isEqual;

	}

	private boolean getCoachesFor() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	 
	 
}