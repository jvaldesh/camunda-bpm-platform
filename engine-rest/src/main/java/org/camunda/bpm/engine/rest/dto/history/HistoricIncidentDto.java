/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.engine.rest.dto.history;

import java.util.Date;

import org.camunda.bpm.engine.history.HistoricIncident;

/**
 * @author Roman Smirnov
 *
 */
public class HistoricIncidentDto {

  protected String id;
  protected String processDefinitionId;
  protected String processInstanceId;
  protected String executionId;
  protected Date createTime;
  protected Date endTime;
  protected String incidentType;
  protected String activityId;
  protected String causeIncidentId;
  protected String rootCauseIncidentId;
  protected String configuration;
  protected String incidentMessage;
  protected Boolean open;
  protected Boolean deleted;
  protected Boolean resolved;

  public String getId() {
    return id;
  }

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }

  public String getProcessInstanceId() {
    return processInstanceId;
  }

  public String getExecutionId() {
    return executionId;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public String getIncidentType() {
    return incidentType;
  }

  public String getActivityId() {
    return activityId;
  }

  public String getCauseIncidentId() {
    return causeIncidentId;
  }

  public String getRootCauseIncidentId() {
    return rootCauseIncidentId;
  }

  public String getConfiguration() {
    return configuration;
  }

  public String getIncidentMessage() {
    return incidentMessage;
  }

  public Boolean isOpen() {
    return open;
  }

  public Boolean isDeleted() {
    return deleted;
  }

  public Boolean isResolved() {
    return resolved;
  }

  public static HistoricIncidentDto fromHistoricIncident(HistoricIncident historicIncident) {
    HistoricIncidentDto dto = new HistoricIncidentDto();

    dto.id = historicIncident.getId();
    dto.processDefinitionId = historicIncident.getProcessDefinitionId();
    dto.processInstanceId = historicIncident.getProcessInstanceId();
    dto.executionId = historicIncident.getExecutionId();
    dto.createTime = historicIncident.getCreateTime();
    dto.endTime = historicIncident.getEndTime();
    dto.incidentType = historicIncident.getIncidentType();
    dto.activityId = historicIncident.getActivityId();
    dto.causeIncidentId = historicIncident.getCauseIncidentId();
    dto.rootCauseIncidentId = historicIncident.getRootCauseIncidentId();
    dto.configuration = historicIncident.getConfiguration();
    dto.incidentMessage = historicIncident.getIncidentMessage();
    dto.open = historicIncident.isOpen();
    dto.deleted = historicIncident.isDeleted();
    dto.resolved = historicIncident.isResolved();

    return dto;
  }

}
