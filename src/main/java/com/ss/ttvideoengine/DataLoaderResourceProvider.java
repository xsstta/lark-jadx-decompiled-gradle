package com.ss.ttvideoengine;

public interface DataLoaderResourceProvider {

    /* renamed from: com.ss.ttvideoengine.DataLoaderResourceProvider$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static String $default$getCacheDir(DataLoaderResourceProvider dataLoaderResourceProvider) {
            return null;
        }
    }

    String getCacheDir();

    String getKey();

    long getPreloadSize();

    String[] getUrls();
}
