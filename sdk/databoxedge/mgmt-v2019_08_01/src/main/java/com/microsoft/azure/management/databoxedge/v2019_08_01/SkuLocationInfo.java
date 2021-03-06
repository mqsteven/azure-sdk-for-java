/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The location info.
 */
public class SkuLocationInfo {
    /**
     * The location.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * The zones.
     */
    @JsonProperty(value = "zones", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> zones;

    /**
     * The sites.
     */
    @JsonProperty(value = "sites", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> sites;

    /**
     * Get the location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the zones.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Get the sites.
     *
     * @return the sites value
     */
    public List<String> sites() {
        return this.sites;
    }

}
