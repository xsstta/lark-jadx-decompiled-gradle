package com.bytedance.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileLock {

    /* renamed from: a */
    private static final Map<String, Integer> f37720a = new HashMap();

    /* renamed from: b */
    private final int f37721b;

    /* renamed from: c */
    private final String f37722c;

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i) throws Exception;

    private static native void nLockFileSegment(int i, int i2) throws Exception;

    private static native void nRelease(int i) throws Exception;

    private static native boolean nTryLock(int i) throws Exception;

    private static native void nUnlockFile(int i) throws Exception;

    static {
        C14362h.m57835a("file_lock");
    }

    /* renamed from: a */
    public void mo52472a() {
        try {
            nUnlockFile(this.f37721b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f37722c);
        }
    }

    /* renamed from: b */
    public void mo52473b() {
        Integer remove;
        Map<String, Integer> map = f37720a;
        synchronized (map) {
            remove = map.remove(this.f37722c);
        }
        try {
            nRelease(remove.intValue());
        } catch (Exception e) {
            throw new RuntimeException("release lock failed, file:" + this.f37722c + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: a */
    public static FileLock m57799a(String str) {
        try {
            int d = m57803d(str);
            nLockFile(d);
            return new FileLock(str, d);
        } catch (Exception e) {
            throw new RuntimeException("lock failed, file:" + str + ", pid:" + Process.myPid() + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: b */
    public static FileLock m57801b(String str) {
        try {
            int d = m57803d(str);
            if (!nTryLock(d)) {
                return null;
            }
            return new FileLock(str, d);
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: c */
    public static FileLock m57802c(String str) throws Exception {
        try {
            int d = m57803d(str);
            if (nTryLock(d)) {
                return new FileLock(str, d);
            }
            new FileLock(str, d).mo52473b();
            return null;
        } catch (Exception e) {
            throw new RuntimeException("try lock failed, file:" + str + " caused by:" + e.getMessage());
        }
    }

    /* renamed from: d */
    private static int m57803d(String str) throws Exception {
        Integer num;
        Map<String, Integer> map = f37720a;
        synchronized (map) {
            num = map.get(str);
            if (num == null) {
                new File(str).getParentFile().mkdirs();
                num = Integer.valueOf(nGetFD(str));
                map.put(str, num);
            }
        }
        return num.intValue();
    }

    private FileLock(String str, int i) {
        this.f37722c = str;
        this.f37721b = i;
    }

    /* renamed from: a */
    public static FileLock m57800a(String str, int i) {
        try {
            int d = m57803d(str);
            nLockFileSegment(d, i);
            return new FileLock(str, d);
        } catch (Exception e) {
            throw new RuntimeException("lock segment failed, file:" + str + " caused by:" + e.getMessage());
        }
    }
}
