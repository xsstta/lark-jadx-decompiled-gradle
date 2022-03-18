package com.tt.miniapp.streamloader;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.refer.common.pkg.IStreamLoader;
import com.tt.refer.common.pkg.p3424a.AbstractC67820a;
import com.tt.refer.common.pkg.p3424a.C67821b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okio.AbstractC69698d;
import okio.C69705k;

public class StreamLoader {
    private static AbstractC67820a sPkgFileLoader = new C67821b();

    public static ConcurrentHashMap<String, IStreamLoader> getLoadTaskMap(IAppContext iAppContext) {
        return C67485a.m262488a(iAppContext).mo234280a().f170175b;
    }

    public static IStreamLoader getLoadTask(IAppContext iAppContext) {
        boolean z;
        if (iAppContext instanceof AbstractC67433a) {
            z = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z = false;
        }
        if (z) {
            return C67485a.m262488a(iAppContext).mo234280a().f170176c;
        }
        return C67485a.m262488a(iAppContext).mo234280a().f170174a;
    }

    public static boolean isDirectoryOfPkg(String str, IAppContext iAppContext) {
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->isDirectoryOfPkg:", str);
            return sPkgFileLoader.mo235435d(str, iAppContext);
        }
        IStreamLoader loadTask = getLoadTask(iAppContext);
        if (loadTask != null) {
            return loadTask.isDirectoryOfPkg(str);
        }
        return false;
    }

    public static String loadStringFromStream(String str, IAppContext iAppContext) {
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->loadStringFromStream:", str);
            return sPkgFileLoader.mo235433b(str, iAppContext);
        }
        byte[] loadByteFromStream = loadByteFromStream(str, iAppContext);
        if (loadByteFromStream != null) {
            return getLoadTask(iAppContext).getStringCache(str, loadByteFromStream);
        }
        return null;
    }

    public static String waitExtractFinishIfNeeded(String str, IAppContext iAppContext) {
        String str2;
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->waitExtractFinishIfNeeded:", str);
            return sPkgFileLoader.mo235436e(str, iAppContext);
        }
        TTAPkgFile findFile = findFile(str, iAppContext);
        IStreamLoader loadTask = getLoadTask(iAppContext);
        if (loadTask == null || findFile == null) {
            str2 = "";
        } else {
            str2 = loadTask.waitExtractFinish(findFile);
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public static TTAPkgFile findFile(String str, IAppContext iAppContext) {
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->findFile:", str);
            return (TTAPkgFile) sPkgFileLoader.mo235434c(str, iAppContext);
        }
        IStreamLoader loadTask = getLoadTask(iAppContext);
        if (loadTask != null) {
            try {
                return loadTask.findFile(str);
            } catch (Throwable th) {
                AppBrandLogger.m52829e("StreamLoader", th);
                return null;
            }
        } else {
            AppBrandLogger.m52829e("StreamLoader", "findFile not found: " + str);
            return null;
        }
    }

    public static InputStream getStream(String str, IAppContext iAppContext) {
        boolean z;
        TTAPkgFile findFile;
        IStreamLoader iStreamLoader;
        TTAPkgFile findFile2;
        if (iAppContext instanceof AbstractC67433a) {
            z = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z = false;
        }
        if (z && "page-frame.js".equals(str) && (iStreamLoader = getLoadTaskMap(iAppContext).get("__APP__")) != null && (findFile2 = iStreamLoader.findFile(str)) != null) {
            return iStreamLoader.requestStream(findFile2);
        }
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->getStream:", str);
            return sPkgFileLoader.mo235437f(str, iAppContext);
        }
        IStreamLoader loadTask = getLoadTask(iAppContext);
        if (loadTask == null || (findFile = loadTask.findFile(str)) == null) {
            return null;
        }
        return loadTask.requestStream(findFile);
    }

    public static byte[] loadByteFromStream(String str, IAppContext iAppContext) {
        TTAPkgFile findFile;
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->loadByteFromStream:", str);
            return sPkgFileLoader.mo235432a(str, iAppContext);
        }
        IStreamLoader loadTask = getLoadTask(iAppContext);
        if (loadTask != null && (findFile = loadTask.findFile(str)) != null) {
            return loadTask.requestBytes(findFile);
        }
        AppBrandLogger.eWithThrowable("StreamLoader", "不应该走到这里来的: " + str, new Throwable());
        return IOUtils.readBytes(str);
    }

    public static Set<String> listTTAPKG(String str, IAppContext iAppContext) {
        TTAPkgInfo tTAPkgInfo;
        Collection<String> fileNames;
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->listPkgFile:", str);
            return sPkgFileLoader.mo235438g(str, iAppContext);
        }
        String a = C67404a.m262266a(iAppContext).mo234076a(str);
        if (a.startsWith("./")) {
            a = a.substring(2);
        } else if (a.startsWith("/")) {
            a = a.substring(1);
        }
        IStreamLoader loadTask = getLoadTask(iAppContext);
        HashSet hashSet = new HashSet();
        if (!(loadTask == null || (tTAPkgInfo = loadTask.getTTAPkgInfo()) == null || (fileNames = tTAPkgInfo.getFileNames()) == null || fileNames.isEmpty())) {
            for (String str2 : fileNames) {
                if (str2 != null && str2.startsWith(a)) {
                    String[] split = C66877c.m260854a(str2, a).split("/");
                    if (split.length > 0) {
                        hashSet.add(split[0]);
                    }
                }
            }
        }
        return hashSet;
    }

    public static boolean extractToFile(String str, String str2, String str3, IAppContext iAppContext) {
        AppBrandLogger.m52830i("StreamLoader", "extractToFile fileNameOrPath=" + str + " extractDirPath=" + str2 + " extractFileName=" + str3);
        if (sPkgFileLoader != null) {
            AppBrandLogger.m52830i("StreamLoader", "sPkgFileLoader->extractToFile:", str);
            return sPkgFileLoader.mo235431a(str, str2, str3, iAppContext);
        }
        if (getLoadTask(iAppContext) != null) {
            byte[] loadByteFromStream = loadByteFromStream(str, iAppContext);
            if (str3 == null || loadByteFromStream == null) {
                AppBrandLogger.m52830i("StreamLoader", "extractFile failed extractFileName=" + str3 + " bytesLen=" + loadByteFromStream.length);
            } else {
                File file = new File(str2, str3);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                AbstractC69698d dVar = null;
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    AbstractC69698d a = C69705k.m267589a(C69705k.m267599b(file));
                    a.mo244533b(loadByteFromStream);
                    a.flush();
                    if (a != null) {
                        try {
                            a.close();
                        } catch (IOException e) {
                            AppBrandLogger.eWithThrowable("StreamLoader", e.getMessage(), e);
                            e.printStackTrace();
                        }
                    }
                    return true;
                } catch (FileNotFoundException e2) {
                    AppBrandLogger.eWithThrowable("StreamLoader", e2.getMessage(), e2);
                    e2.printStackTrace();
                    if (0 != 0) {
                        dVar.close();
                    }
                } catch (IOException e3) {
                    AppBrandLogger.eWithThrowable("StreamLoader", e3.getMessage(), e3);
                    e3.printStackTrace();
                    if (0 != 0) {
                        try {
                            dVar.close();
                        } catch (IOException e4) {
                            AppBrandLogger.eWithThrowable("StreamLoader", e4.getMessage(), e4);
                            e4.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            dVar.close();
                        } catch (IOException e5) {
                            AppBrandLogger.eWithThrowable("StreamLoader", e5.getMessage(), e5);
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } else {
            AppBrandLogger.m52830i("StreamLoader", "loadTask null");
        }
        return false;
    }
}
