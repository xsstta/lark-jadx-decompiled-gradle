package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;

public class JavaCronetEngineBuilderImpl extends CronetEngineBuilderImpl {
    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder
    public ExperimentalCronetEngine build() {
        if (getUserAgent() == null) {
            setUserAgent(getDefaultUserAgent());
        }
        return new JavaCronetEngine(this);
    }

    public JavaCronetEngineBuilderImpl(Context context) {
        super(context);
    }
}
