package org.isisaddons.wicket.pdfjs.cpt.applib;

import java.util.Objects;

import javax.activation.MimeType;

import org.wicketstuff.pdfjs.PdfJsConfig;
import org.wicketstuff.pdfjs.Scale;

import org.apache.isis.applib.value.Blob;

public class Util {

    private Util() {
    }

    public static PdfJsConfig createPdfJsConfig(
            final Integer initialPage,
            final Scale initialScale,
            final Integer initialHeight) {
        PdfJsConfig config = new PdfJsConfig();
        if (initialPage == null && initialPage > 0) {
            config.withInitialPage(initialPage);
        }
        if (initialScale != null && initialScale != Scale._1_00) {
            config.withInitialScale(initialScale);
        }

        if (initialHeight != null && initialHeight > 0) {
            config.withInitialHeight(initialHeight);
        }
        return config;
    }

    public static boolean holdsPdf(final Blob blob) {
        final MimeType mimeType = blob.getMimeType();
        return Objects.equals("application", mimeType.getPrimaryType()) &&
                Objects.equals("pdf", mimeType.getSubType());
    }
}
