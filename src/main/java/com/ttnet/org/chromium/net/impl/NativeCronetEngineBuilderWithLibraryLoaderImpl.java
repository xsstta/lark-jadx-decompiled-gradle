package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.CronetEngine;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;

public class NativeCronetEngineBuilderWithLibraryLoaderImpl extends NativeCronetEngineBuilderImpl {
    private VersionSafeCallbacks.LibraryLoader mLibraryLoader;

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    public VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return this.mLibraryLoader;
    }

    public NativeCronetEngineBuilderWithLibraryLoaderImpl(Context context) {
        super(context);
    }

    @Override // com.ttnet.org.chromium.net.ICronetEngineBuilder, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    public CronetEngineBuilderImpl setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.mLibraryLoader = new VersionSafeCallbacks.LibraryLoader(libraryLoader);
        return this;
    }
}
