package org.camunda.bpm.engine.rest.helper;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.camunda.bpm.engine.task.DelegationState;
import org.camunda.bpm.engine.task.Task;

public class MockTaskBuilder {

  private String id;
  private String name;
  private String assignee;
  private Date createTime;
  private Date dueDate;
  private DelegationState delegationState;
  private String description;
  private String executionId;
  private String owner;
  private String parentTaskId;
  private int priority;
  private String processDefinitionId;
  private String processInstanceId;
  private String taskDefinitionKey;
  
  public MockTaskBuilder id(String id) {
    this.id = id;
    return this;
  }
  
  public MockTaskBuilder name(String name) {
    this.name = name;
    return this;
  }
  
  public MockTaskBuilder assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }
  
  public MockTaskBuilder createTime(Date createTime) {
    this.createTime = createTime;
    return this;
  }
  
  public MockTaskBuilder dueDate(Date dueDate) {
    this.dueDate = dueDate;
    return this;
  }
  
  public MockTaskBuilder delegationState(DelegationState delegationState) {
    this.delegationState = delegationState;
    return this;
  }
  
  public MockTaskBuilder description(String description) {
    this.description = description;
    return this;
  }

  public MockTaskBuilder executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }
  
  public MockTaskBuilder owner(String owner) {
    this.owner = owner;
    return this;
  }
  
  public MockTaskBuilder parentTaskId(String parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }
  
  public MockTaskBuilder priority(int priority) {
    this.priority = priority;
    return this;
  }
  
  public MockTaskBuilder processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }
  
  public MockTaskBuilder processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

  public MockTaskBuilder taskDefinitionKey(String taskDefinitionKey) {
    this.taskDefinitionKey = taskDefinitionKey;
    return this;
  }
  
  public Task build() {
    Task mockTask = mock(Task.class);
    when(mockTask.getId()).thenReturn(id);
    when(mockTask.getName()).thenReturn(name);
    when(mockTask.getAssignee()).thenReturn(assignee);
    when(mockTask.getCreateTime()).thenReturn(createTime);  
    when(mockTask.getDueDate()).thenReturn(dueDate); 
    when(mockTask.getDelegationState()).thenReturn(delegationState); 
    when(mockTask.getDescription()).thenReturn(description); 
    when(mockTask.getExecutionId()).thenReturn(executionId); 
    when(mockTask.getOwner()).thenReturn(owner); 
    when(mockTask.getParentTaskId()).thenReturn(parentTaskId); 
    when(mockTask.getPriority()).thenReturn(priority); 
    when(mockTask.getProcessDefinitionId()).thenReturn(processDefinitionId); 
    when(mockTask.getProcessInstanceId()).thenReturn(processInstanceId);
    when(mockTask.getTaskDefinitionKey()).thenReturn(taskDefinitionKey);
    return mockTask;
  }
  
}