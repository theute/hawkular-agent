/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.agent.monitor.scheduler.storage;

import java.util.Date;

import org.hawkular.agent.monitor.scheduler.polling.Task;

/**
 * Metric data that was collected.
 */
public class DataPoint {
    private Task task;
    private long timestamp;
    private double value;

    public DataPoint(Task task, double value) {
        this.task = task;
        this.timestamp = System.currentTimeMillis();
        this.value = value;
    }

    /**
     * @return Identifies the metric that was collected.
     */
    public Task getTask() {
        return task;
    }

    /**
     * @return when the metric was collected
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @return the actual data that was collected
     */
    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DataPoint: task=[" + task + "], timestamp=[" + new Date(timestamp) + "], value=[" + value + "]";
    }
}
