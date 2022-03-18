package com.bytedance.bae.base;

import com.C1711a;

class NativeLibrary {
    public static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static NativeLibraryLoadListener loadListener;
    private static Object lock = new Object();

    static class DefaultLoader implements NativeLibraryLoader {
        DefaultLoader() {
        }

        @Override // com.bytedance.bae.base.NativeLibraryLoader
        public boolean load(String str) {
            String str2 = NativeLibrary.TAG;
            Logging.m14755d(str2, "Loading library: " + str);
            try {
                C1711a.m7628a(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                String str3 = NativeLibrary.TAG;
                Logging.m14757e(str3, "Failed to load native library: " + str, e);
                return false;
            }
        }
    }

    NativeLibrary() {
    }

    static void disposeListener() {
        if (loadListener != null) {
            loadListener = null;
        }
    }

    static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }

    static void setLoadListener(NativeLibraryLoadListener nativeLibraryLoadListener) {
        loadListener = nativeLibraryLoadListener;
    }

    static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            if (libraryLoaded) {
                Logging.m14755d(TAG, "Native library has already been loaded.");
                NativeLibraryLoadListener nativeLibraryLoadListener = loadListener;
                if (nativeLibraryLoadListener != null) {
                    nativeLibraryLoadListener.onLoadAlready(str);
                }
                return;
            }
            String str2 = TAG;
            Logging.m14755d(str2, "Loading native library: " + str);
            boolean load = nativeLibraryLoader.load(str);
            libraryLoaded = load;
            NativeLibraryLoadListener nativeLibraryLoadListener2 = loadListener;
            if (nativeLibraryLoadListener2 != null) {
                if (load) {
                    nativeLibraryLoadListener2.onLoadSuccess(str);
                } else {
                    nativeLibraryLoadListener2.onLoadError(str);
                }
            }
        }
    }
}
