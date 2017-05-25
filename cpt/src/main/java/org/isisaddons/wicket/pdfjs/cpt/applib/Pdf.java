/*
 *  Copyright 2013~2014 Dan Haywood
 *
 *  Licensed under the Apache License, Version 2.0 (the
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

import java.io.Serializable;

import org.wicketstuff.pdfjs.Scale;

import org.apache.isis.applib.value.Blob;

/**
 * A value type that wraps {@link Blob} and incorporating responsibilities of {@link PdfJsViewer},
 */
public final class Pdf implements Serializable {

    // TODO: compute, based on Blob and config
    private static final long serialVersionUID = 0L;

    private final Blob blob;

    private final Integer initialPageNum;
    private final Scale initialScale;
    private final Integer initialHeight;

    public Pdf(
            final Blob blob,
            final Integer initialPageNum,
            final Scale initialScale,
            final Integer initialHeight) {
        this.initialPageNum = initialPageNum;
        this.initialScale = initialScale;
        this.initialHeight = initialHeight;
        if (Util.holdsPdf(blob)) {
            throw new IllegalArgumentException("Blob must be application/pdf");
        }
        this.blob = blob;
    }

    public String getName() {
        return blob.getName();
    }

    public Blob getBlob() {
        return blob;
    }

    public int getInitialPageNum() {
        return initialPageNum;
    }

    public Scale getInitialScale() {
        return initialScale;
    }

    public int getInitialHeight() {
        return initialHeight;
    }


    @Override
    public String toString() {
        return "PDF: " + getName() ;
    }

}

