/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may
 * not use this file except in compliance with the License. A copy of the
 * License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "LICENSE" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.blox.frontend.models;

import java.time.Instant;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Deployment {
  private final String deploymentId;
  private final Instant timestamp;
  private final String environmentName;
  private final String oldTargetRevisionId;
  private final String newTargetRevisionId;
}
