package com.tt.refer.common.pkg.p3424a;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.streamloader.C66877c;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.ttapkgdecoder.TTAPkgFile;
import com.tt.miniapp.ttapkgdecoder.TTAPkgInfo;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.p3417c.C67746a;
import com.tt.refer.common.pkg.IStreamLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import okio.AbstractC69698d;
import okio.C69705k;

/* renamed from: com.tt.refer.common.pkg.a.b */
public class C67821b implements AbstractC67820a {
    /* renamed from: a */
    public static IStreamLoader m263863a(IAppContext iAppContext) {
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

    /* renamed from: b */
    public static IStreamLoader m263864b(IAppContext iAppContext) {
        if (C67485a.m262488a(iAppContext).mo234280a().f170175b != null) {
            return C67485a.m262488a(iAppContext).mo234280a().f170175b.get("__APP__");
        }
        return null;
    }

    @Override // com.tt.refer.common.pkg.p3424a.AbstractC67820a
    /* renamed from: d */
    public boolean mo235435d(String str, IAppContext iAppContext) {
        IStreamLoader a = m263863a(iAppContext);
        if (a != null) {
            return a.isDirectoryOfPkg(str);
        }
        return false;
    }

    @Override // com.tt.refer.common.pkg.p3424a.AbstractC67820a
    /* renamed from: b */
    public String mo235433b(String str, IAppContext iAppContext) {
        byte[] a = mo235432a(str, iAppContext);
        if (a != null) {
            return m263863a(iAppContext).getStringCache(str, a);
        }
        return null;
    }

    @Override // com.tt.refer.common.pkg.p3424a.AbstractC67820a
    /* renamed from: e */
    public String mo235436e(String str, IAppContext iAppContext) {
        String str2;
        TTAPkgFile findFile = StreamLoader.findFile(str, iAppContext);
        IStreamLoader a = m263863a(iAppContext);
        if (a == null || findFile == null) {
            str2 = "";
        } else {
            str2 = a.waitExtractFinish(findFile);
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    @Override // com.tt.refer.common.pkg.p3424a.AbstractC67820a
    /* renamed from: f */
    public InputStream mo235437f(String str, IAppContext iAppContext) {
        TTAPkgFile findFile;
        IStreamLoader a = m263863a(iAppContext);
        if (a == null || (findFile = a.findFile(str)) == null) {
            return null;
        }
        return a.requestStream(findFile);
    }

    @Override // com.tt.refer.common.pkg.p3424a.AbstractC67820a
    /* renamed from: a */
    public byte[] mo235432a(String str, IAppContext iAppContext) {
        boolean z;
        TTAPkgFile findFile;
        IStreamLoader a = m263863a(iAppContext);
        if (iAppContext instanceof AbstractC67433a) {
            z = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z = false;
        }
        if (a != null) {
            TTAPkgFile findFile2 = a.findFile(str);
            if (z) {
                if (findFile2 != null && a.requestBytes(findFile2) != null) {
                    return a.requestBytes(findFile2);
                }
                IStreamLoader b = m263864b(iAppContext);
                if (!(b == null || (findFile = b.findFile(str)) == null)) {
                    return b.requestBytes(findFile);
                }
            } else if (findFile2 != null) {
                return a.requestBytes(findFile2);
            }
        }
        AppBrandLogger.eWithThrowable("PkgFileLoader", "不应该走到这里来的: " + str, new Throwable());
        return IOUtils.readBytes(str);
    }

    @Override // com.tt.refer.common.pkg.p3424a.AbstractC67820a
    /* renamed from: g */
    public Set<String> mo235438g(String str, IAppContext iAppContext) {
        TTAPkgInfo tTAPkgInfo;
        Collection<String> fileNames;
        String a = C67404a.m262266a(iAppContext).mo234076a(str);
        if (a.startsWith("./")) {
            a = a.substring(2);
        } else if (a.startsWith("/")) {
            a = a.substring(1);
        }
        IStreamLoader a2 = m263863a(iAppContext);
        HashSet hashSet = new HashSet();
        if (!(a2 == null || (tTAPkgInfo = a2.getTTAPkgInfo()) == null || (fileNames = tTAPkgInfo.getFileNames()) == null || fileNames.isEmpty())) {
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

    /* renamed from: h */
    public TTAPkgFile mo235434c(String str, IAppContext iAppContext) {
        boolean z;
        IStreamLoader a = m263863a(iAppContext);
        if (iAppContext instanceof AbstractC67433a) {
            z = ((AbstractC67433a) iAppContext).mo234167g();
        } else {
            z = false;
        }
        if (a == null) {
            AppBrandLogger.m52829e("PkgFileLoader", "findFile not found: " + str);
        } else if (!z) {
            try {
                return a.findFile(str);
            } catch (Throwable th) {
                AppBrandLogger.m52829e("PkgFileLoader", th);
            }
        } else if (a.findFile(str) == null) {
            IStreamLoader b = m263864b(iAppContext);
            if (b != null) {
                try {
                    return b.findFile(str);
                } catch (Throwable th2) {
                    AppBrandLogger.m52829e("PkgFileLoader", th2);
                }
            }
        } else {
            try {
                return a.findFile(str);
            } catch (Throwable th3) {
                AppBrandLogger.m52829e("PkgFileLoader", th3);
            }
        }
        OPMonitor resultTypeFail = new C67500a(C67746a.f170604E, iAppContext).mo234325a(iAppContext.getAppId()).setResultTypeFail();
        resultTypeFail.setErrorMessage("file not found:" + str).flush();
        return null;
    }

    @Override // com.tt.refer.common.pkg.p3424a.AbstractC67820a
    /* renamed from: a */
    public boolean mo235431a(String str, String str2, String str3, IAppContext iAppContext) {
        AppBrandLogger.m52830i("PkgFileLoader", "extractToFile fileNameOrPath=" + str + " extractDirPath=" + str2 + " extractFileName=" + str3);
        if (m263863a(iAppContext) != null) {
            byte[] a = mo235432a(str, iAppContext);
            if (str3 == null || a == null) {
                AppBrandLogger.m52830i("PkgFileLoader", "extractFile failed extractFileName=" + str3 + " bytesLen=" + a.length);
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
                    AbstractC69698d a2 = C69705k.m267589a(C69705k.m267599b(file));
                    a2.mo244533b(a);
                    a2.flush();
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (IOException e) {
                            AppBrandLogger.eWithThrowable("PkgFileLoader", e.getMessage(), e);
                            e.printStackTrace();
                        }
                    }
                    return true;
                } catch (FileNotFoundException e2) {
                    AppBrandLogger.eWithThrowable("PkgFileLoader", e2.getMessage(), e2);
                    e2.printStackTrace();
                    if (0 != 0) {
                        dVar.close();
                    }
                } catch (IOException e3) {
                    AppBrandLogger.eWithThrowable("PkgFileLoader", e3.getMessage(), e3);
                    e3.printStackTrace();
                    if (0 != 0) {
                        try {
                            dVar.close();
                        } catch (IOException e4) {
                            AppBrandLogger.eWithThrowable("PkgFileLoader", e4.getMessage(), e4);
                            e4.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            dVar.close();
                        } catch (IOException e5) {
                            AppBrandLogger.eWithThrowable("PkgFileLoader", e5.getMessage(), e5);
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
        } else {
            AppBrandLogger.m52830i("PkgFileLoader", "loadTask null");
        }
        return false;
    }
}
