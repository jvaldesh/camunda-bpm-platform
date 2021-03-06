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
package org.camunda.bpm.engine.impl.form.validator;

import java.util.Map;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.VariableScope;

/**
 * <p>Object passed in to a {@link FormFieldValidator} providing access to validation properties</p>
 *
 * @author Daniel Meyer
 *
 */
public interface FormFieldValidatorContext {

  /** @return the execution
   * Deprecated, use {@link #getVariableScope()} */
  @Deprecated
  public DelegateExecution getExecution();

  /**
   * @return the variable scope in which the value is submitted
   */
  public VariableScope getVariableScope();

  /** @return the configuration of this validator */
  public String getConfiguration();

  /** @return all values submitted in the form */
  public Map<String, Object> getSubmittedValues();

}
