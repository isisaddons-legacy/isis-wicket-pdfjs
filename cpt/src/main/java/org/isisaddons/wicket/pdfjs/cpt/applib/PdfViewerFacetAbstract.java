/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.isisaddons.wicket.pdfjs.cpt.applib;

import org.apache.isis.core.metamodel.facetapi.Facet;
import org.apache.isis.core.metamodel.facetapi.FacetHolder;
import org.apache.isis.core.metamodel.facets.MultipleValueFacet;
import org.apache.isis.core.metamodel.facets.MultipleValueFacetAbstract;
import org.wicketstuff.pdfjs.PdfJsConfig;

public abstract class PdfViewerFacetAbstract extends MultipleValueFacetAbstract implements MultipleValueFacet {

    private final PdfJsConfig config;

    public PdfViewerFacetAbstract(PdfJsConfig config, final FacetHolder holder) {
        super(type(), holder);

        this.config = config;
    }

    public PdfJsConfig getConfig() {
        return config;
    }

    public static Class<? extends Facet> type() {
        return PdfViewerFacetAbstract.class;
    }

}