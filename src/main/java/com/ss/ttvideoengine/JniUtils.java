package com.ss.ttvideoengine;

import com.C1711a;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

public class JniUtils {
    public static volatile String exception = "";
    public static volatile boolean isLibraryLoaded;
    public static volatile LibraryLoaderProxy mProxy;

    public static native String getDecodedStr(byte[] bArr, byte[] bArr2);

    public static native String getEncryptionKey(byte[] bArr);

    public static native int getSupportedMethod();

    public static synchronized void loadLibrary() {
        synchronized (JniUtils.class) {
            try {
                if (!isLibraryLoaded) {
                    if (mProxy != null) {
                        mProxy.loadLibrary("videodec");
                    } else {
                        C1711a.m7628a("videodec");
                    }
                    isLibraryLoaded = true;
                }
            } catch (Throwable th) {
                TTVideoEngineLog.m256501d(th);
                exception = th.toString();
            }
        }
        return;
    }

    public static int getDecodeMethod() throws Exception {
        String str = "exception is null";
        if (!isLibraryLoaded) {
            StringBuilder sb = new StringBuilder();
            sb.append("library not load suc exception:");
            if (exception != null) {
                str = exception;
            }
            sb.append(str);
            throw new Exception(sb.toString());
        }
        try {
            return getSupportedMethod();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            sb2.append(str);
            throw new Exception(sb2.toString());
        }
    }

    public static void setLoadProxy(LibraryLoaderProxy libraryLoaderProxy) {
        if (libraryLoaderProxy != null) {
            mProxy = libraryLoaderProxy;
        }
    }

    public static String getEncryptionKeyWithCheck(byte[] bArr) throws Exception {
        String str = "exception is null";
        if (!isLibraryLoaded) {
            StringBuilder sb = new StringBuilder();
            sb.append("library not load suc exception:");
            if (exception != null) {
                str = exception;
            }
            sb.append(str);
            throw new Exception(sb.toString());
        } else if (bArr == null) {
            TTVideoEngineLog.m256503e("JniUtils", "getEncryptionKeyWithCheck convertedKey is null");
            return null;
        } else {
            try {
                return getEncryptionKey(bArr);
            } catch (Throwable th) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getEncryptionKey exception:");
                if (th.toString() != null) {
                    str = th.toString();
                }
                sb2.append(str);
                throw new Exception(sb2.toString());
            }
        }
    }

    public static String getDecodedStrWithKey(byte[] bArr, byte[] bArr2) throws Exception {
        String str = "exception is null";
        if (!isLibraryLoaded) {
            StringBuilder sb = new StringBuilder();
            sb.append("library not load suc exception:");
            if (exception != null) {
                str = exception;
            }
            sb.append(str);
            throw new Exception(sb.toString());
        }
        try {
            return getDecodedStr(bArr, bArr2);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getDecodedStr exception:");
            if (th.toString() != null) {
                str = th.toString();
            }
            sb2.append(str);
            throw new Exception(sb2.toString());
        }
    }
}
