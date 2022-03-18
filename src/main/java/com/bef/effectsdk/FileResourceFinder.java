package com.bef.effectsdk;

public final class FileResourceFinder implements ResourceFinder {

    /* renamed from: a */
    private final String f7089a;

    private static native long nativeCreateFileResourceFinder(long j, String str);

    @Override // com.bef.effectsdk.ResourceFinder
    public void release(long j) {
    }

    public FileResourceFinder(String str) {
        this.f7089a = str;
    }

    @Override // com.bef.effectsdk.ResourceFinder
    public long createNativeResourceFinder(long j) {
        return nativeCreateFileResourceFinder(j, this.f7089a);
    }
}
