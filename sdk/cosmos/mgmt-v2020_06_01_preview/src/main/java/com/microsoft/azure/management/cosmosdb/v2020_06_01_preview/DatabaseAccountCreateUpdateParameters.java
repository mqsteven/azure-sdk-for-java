/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to create and update Cosmos DB database accounts.
 */
public class DatabaseAccountCreateUpdateParameters extends ARMResourceProperties {
    /**
     * Indicates the type of database account. This can only be set at database
     * account creation. Possible values include: 'GlobalDocumentDB',
     * 'MongoDB', 'Parse'.
     */
    @JsonProperty(value = "kind")
    private DatabaseAccountKind kind;

    /**
     * The properties property.
     */
    @JsonProperty(value = "properties", required = true)
    private DatabaseAccountCreateUpdateProperties properties;

    /**
     * Get indicates the type of database account. This can only be set at database account creation. Possible values include: 'GlobalDocumentDB', 'MongoDB', 'Parse'.
     *
     * @return the kind value
     */
    public DatabaseAccountKind kind() {
        return this.kind;
    }

    /**
     * Set indicates the type of database account. This can only be set at database account creation. Possible values include: 'GlobalDocumentDB', 'MongoDB', 'Parse'.
     *
     * @param kind the kind value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withKind(DatabaseAccountKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DatabaseAccountCreateUpdateProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the DatabaseAccountCreateUpdateParameters object itself.
     */
    public DatabaseAccountCreateUpdateParameters withProperties(DatabaseAccountCreateUpdateProperties properties) {
        this.properties = properties;
        return this;
    }

}
