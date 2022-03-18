package org.tukaani.xz;

import java.io.IOException;

public class XZIOException extends IOException {
    private static final long serialVersionUID = 3;

    public XZIOException() {
    }

    public XZIOException(String str) {
        super(str);
    }
}
