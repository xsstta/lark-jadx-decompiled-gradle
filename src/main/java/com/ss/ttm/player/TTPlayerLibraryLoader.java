package com.ss.ttm.player;

import android.util.Log;
import com.C1711a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TTPlayerLibraryLoader {
    private static boolean IsErrored = false;
    public static final String TAG = "TTPlayerLibraryLoader";
    private static ILibraryLoader mDebugLibraryLoader;
    private static ILibraryLoader mDefaultLibLoader = new DefaultLibraryLoader();
    public static String mErrorInfo = null;
    private static boolean mLibraryLoaded = false;
    private static ILibraryLoader mLibraryLoader;
    private static ILibraryLoader mPluginLibLoader;
    private static int mVersion = 0;

    private static class DefaultLibraryLoader implements ILibraryLoader {
        private DefaultLibraryLoader() {
        }

        @Override // com.ss.ttm.player.ILibraryLoader
        public boolean onLoadNativeLibs(List<String> list) {
            for (String str : list) {
                try {
                    C1711a.m7628a(str);
                } catch (Throwable th) {
                    TTPlayerLibraryLoader.mErrorInfo = th.getMessage();
                    String str2 = TTPlayerLibraryLoader.TAG;
                    Log.d(str2, "load lib failed = " + TTPlayerLibraryLoader.mErrorInfo);
                    return false;
                }
            }
            return true;
        }
    }

    public static String getErrorInfo() {
        return mErrorInfo;
    }

    public static boolean isError() {
        return IsErrored;
    }

    public static final synchronized void loadLibrary() {
        boolean z;
        synchronized (TTPlayerLibraryLoader.class) {
            try {
                boolean z2 = false;
                if (mVersion == 0) {
                    mVersion = TTPlayerConfiger.getValue(13, 0) / 1000;
                }
                if (mVersion == 2925) {
                    z = true;
                } else {
                    z = false;
                }
                if (TTPlayerConfiger.getValue(3, false)) {
                    if (!z) {
                        loadPlayerlibrary("ttopenssl");
                        loadPlayerlibrary("mffmpeg");
                    }
                    if (!loadPlayerlibrary("ttmplayer")) {
                        IsErrored = true;
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (!z) {
                        arrayList.add("ttopenssl");
                        arrayList.add("mffmpeg");
                    }
                    arrayList.add("ttmplayer");
                    if (!loadLibs(arrayList, false)) {
                        z2 = true;
                    }
                    IsErrored = z2;
                }
            } catch (Throwable th) {
                IsErrored = true;
                th.printStackTrace();
                mErrorInfo = "load default library error." + th.toString();
            }
        }
        return;
    }

    public static final void setDebugLibraryLoader(ILibraryLoader iLibraryLoader) {
        mDebugLibraryLoader = iLibraryLoader;
    }

    public static final void setLibraryLoader(ILibraryLoader iLibraryLoader) {
        mLibraryLoader = iLibraryLoader;
    }

    public static final void setPluginLibraryLoader(ILibraryLoader iLibraryLoader) {
        mPluginLibLoader = iLibraryLoader;
    }

    private static boolean loadPlayerlibrary(String str) {
        String str2;
        try {
            TTPlayerConfiger.setLibraryName("lib" + str + ".so");
            TTPlayerConfiger.checkDebugTTPlayerLib();
            str2 = TTPlayerConfiger.getPlayerLibraryPath();
            if (str2 != null && !new File(str2).exists()) {
                str2 = null;
            }
            if (str2 != null) {
                if (mDebugLibraryLoader != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str2);
                    Log.d(TAG, "load library path = " + str2);
                    mDebugLibraryLoader.onLoadNativeLibs(arrayList);
                } else {
                    System.load(str2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            mErrorInfo = "load path library error." + th.toString();
            str2 = null;
        }
        if (str2 == null) {
            try {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                loadLibs(arrayList2, true);
                mErrorInfo = null;
            } catch (Throwable unused) {
                Log.e(TAG, "load lib failed name = " + str);
                return false;
            }
        }
        return true;
    }

    private static boolean loadLibs(List<String> list, boolean z) {
        boolean z2 = mLibraryLoaded;
        if ((!z) && z2) {
            return z2;
        }
        ILibraryLoader iLibraryLoader = mLibraryLoader;
        if (iLibraryLoader != null) {
            try {
                mLibraryLoaded = iLibraryLoader.onLoadNativeLibs(list);
            } catch (Throwable th) {
                mErrorInfo = th.getMessage();
            }
        } else {
            ILibraryLoader iLibraryLoader2 = mPluginLibLoader;
            if (iLibraryLoader2 != null) {
                try {
                    mLibraryLoaded = iLibraryLoader2.onLoadNativeLibs(list);
                } catch (Throwable th2) {
                    mErrorInfo = th2.getMessage();
                }
            } else {
                mLibraryLoaded = mDefaultLibLoader.onLoadNativeLibs(list);
            }
        }
        return mLibraryLoaded;
    }
}
