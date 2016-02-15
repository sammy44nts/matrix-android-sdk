/*
 * Copyright 2016 OpenMarket Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.matrix.androidsdk.rest.api;

import org.matrix.androidsdk.rest.model.SyncV2.SyncResponse;

import java.util.Map;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/**
 * The events API .
 */
public interface EventsApiV2 {

    /**
     * Perform the initial sync to find the rooms that concern the user, the participants' presence, etc.
     * @param params the GET params.
     * @param callback The asynchronous callback to call when finished
     */
    @GET("/sync")
    void sync(@QueryMap Map<String, Object> params, Callback<SyncResponse> callback);
}
