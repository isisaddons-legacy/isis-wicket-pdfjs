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

import org.wicketstuff.pdfjs.PdfJsConfig;
import org.wicketstuff.pdfjs.Scale;

import org.apache.isis.core.metamodel.facetapi.FacetHolder;

import static org.isisaddons.wicket.pdfjs.cpt.applib.Util.createPdfJsConfig;

public class PdfJsViewerFacetFromAnnotation extends PdfJsViewerFacetAbstract {

    public PdfJsViewerFacetFromAnnotation(final PdfJsConfig config, final FacetHolder holder) {
        super(config, holder);
    }

    public static PdfJsViewerFacetFromAnnotation create(final PdfJsViewer annotation, final FacetHolder holder) {

        int initialPage = annotation.initialPageNum();
        final Scale initialScale = annotation.initialScale();
        int initialHeight = annotation.initialHeight();

        PdfJsConfig config = createPdfJsConfig(initialPage, initialScale, initialHeight);

        return new PdfJsViewerFacetFromAnnotation(config, holder);
    }

}
