/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network ACLs for SignalR.
 */
public class SignalRNetworkACLs {
    /**
     * Default action when no other rule matches. Possible values include:
     * 'Allow', 'Deny'.
     */
    @JsonProperty(value = "defaultAction")
    private ACLAction defaultAction;

    /**
     * ACL for requests from public network.
     */
    @JsonProperty(value = "publicNetwork")
    private NetworkACL publicNetwork;

    /**
     * ACLs for requests from private endpoints.
     */
    @JsonProperty(value = "privateEndpoints")
    private List<PrivateEndpointACL> privateEndpoints;

    /**
     * Get default action when no other rule matches. Possible values include: 'Allow', 'Deny'.
     *
     * @return the defaultAction value
     */
    public ACLAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set default action when no other rule matches. Possible values include: 'Allow', 'Deny'.
     *
     * @param defaultAction the defaultAction value to set
     * @return the SignalRNetworkACLs object itself.
     */
    public SignalRNetworkACLs withDefaultAction(ACLAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get aCL for requests from public network.
     *
     * @return the publicNetwork value
     */
    public NetworkACL publicNetwork() {
        return this.publicNetwork;
    }

    /**
     * Set aCL for requests from public network.
     *
     * @param publicNetwork the publicNetwork value to set
     * @return the SignalRNetworkACLs object itself.
     */
    public SignalRNetworkACLs withPublicNetwork(NetworkACL publicNetwork) {
        this.publicNetwork = publicNetwork;
        return this;
    }

    /**
     * Get aCLs for requests from private endpoints.
     *
     * @return the privateEndpoints value
     */
    public List<PrivateEndpointACL> privateEndpoints() {
        return this.privateEndpoints;
    }

    /**
     * Set aCLs for requests from private endpoints.
     *
     * @param privateEndpoints the privateEndpoints value to set
     * @return the SignalRNetworkACLs object itself.
     */
    public SignalRNetworkACLs withPrivateEndpoints(List<PrivateEndpointACL> privateEndpoints) {
        this.privateEndpoints = privateEndpoints;
        return this;
    }

}