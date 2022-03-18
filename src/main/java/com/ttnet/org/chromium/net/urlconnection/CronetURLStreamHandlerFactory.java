package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.Objects;

public class CronetURLStreamHandlerFactory implements URLStreamHandlerFactory {
    private final ExperimentalCronetEngine mCronetEngine;

    public CronetURLStreamHandlerFactory(ExperimentalCronetEngine experimentalCronetEngine) {
        Objects.requireNonNull(experimentalCronetEngine, "CronetEngine is null.");
        this.mCronetEngine = experimentalCronetEngine;
    }

    public URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new CronetHttpURLStreamHandler(this.mCronetEngine);
        }
        return null;
    }
}
