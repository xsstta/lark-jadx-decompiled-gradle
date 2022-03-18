package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.CronetProvider;
import com.ttnet.org.chromium.net.ExperimentalCronetEngine;
import java.util.Arrays;

public class NativeCronetProvider extends CronetProvider {
    @Override // com.ttnet.org.chromium.net.CronetProvider
    public String getName() {
        return "App-Packaged-Cronet-Provider";
    }

    @Override // com.ttnet.org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }

    @Override // com.ttnet.org.chromium.net.CronetProvider
    public String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    @Override // com.ttnet.org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        return new ExperimentalCronetEngine.Builder(new NativeCronetEngineBuilderWithLibraryLoaderImpl(this.mContext));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.mContext});
    }

    public NativeCronetProvider(Context context) {
        super(context);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof NativeCronetProvider) && this.mContext.equals(((NativeCronetProvider) obj).mContext))) {
            return true;
        }
        return false;
    }
}
