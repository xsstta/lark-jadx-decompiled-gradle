package com.bytedance.ee.bear.lynx.impl.utli;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.bear.doc.resupdate.GeckoResConfig;
import com.bytedance.ee.bear.lynx.impl.CCMLynxLocalDrawableConfig;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/LynxImageUrlUtils;", "", "()V", "APP_SCHEME", "", "TAG", "assetResourceCacheMap", "", "", "geckoResourceCacheMap", "", "getLatestChannelVersion", "channelDir", "Ljava/io/File;", "(Ljava/io/File;)Ljava/lang/Long;", "redirectImageUrlWithPipeline", "context", "Landroid/content/Context;", "imageUrl", "wrapperAssetUrl", "wrapperCdnUrl", "wrapperGeckoUrl", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.c.a */
public final class LynxImageUrlUtils {

    /* renamed from: a */
    public static final LynxImageUrlUtils f23764a = new LynxImageUrlUtils();

    /* renamed from: b */
    private static final Map<String, Boolean> f23765b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, Long> f23766c = new LinkedHashMap();

    private LynxImageUrlUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "pathname", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.c.a$a */
    public static final class C8830a implements FileFilter {

        /* renamed from: a */
        public static final C8830a f23767a = new C8830a();

        C8830a() {
        }

        public final boolean accept(File file) {
            Intrinsics.checkExpressionValueIsNotNull(file, "pathname");
            return file.isDirectory();
        }
    }

    /* renamed from: a */
    private final String m37017a(String str) {
        return LynxResourceConstant.f23773a.mo33924a() + str;
    }

    /* renamed from: a */
    private final Long m37016a(File file) {
        boolean z;
        Long l = null;
        if (file == null) {
            return null;
        }
        File[] listFiles = file.listFiles(C8830a.f23767a);
        if (listFiles != null) {
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                l = null;
                for (File file2 : listFiles) {
                    Intrinsics.checkExpressionValueIsNotNull(file2, "file");
                    String name = file2.getName();
                    try {
                        Intrinsics.checkExpressionValueIsNotNull(name, "fileName");
                        long parseLong = Long.parseLong(name);
                        if (l == null) {
                            l = Long.valueOf(parseLong);
                        } else if (parseLong > l.longValue()) {
                            l = Long.valueOf(parseLong);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return l;
    }

    /* renamed from: b */
    private final String m37018b(String str) {
        String str2 = "offline" + File.separatorChar + "docs_lynx_channel" + str;
        String str3 = "file:///android_asset/" + str2;
        Map<String, Boolean> map = f23765b;
        if (Intrinsics.areEqual((Object) map.get(str), (Object) true)) {
            return str3;
        }
        InputStream inputStream = null;
        try {
            Application application = C13615c.f35773a;
            Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
            InputStream open = application.getAssets().open(str2);
            if (open.available() > 0) {
                map.put(str, true);
                if (open != null) {
                    try {
                        open.close();
                    } catch (Exception e) {
                        C13479a.m54759a("ccm-lynx: LynxImageUrlUtils", "wrapperAssetUrl close stream", e);
                    }
                }
                return str3;
            }
            if (open != null) {
                try {
                    open.close();
                } catch (Exception e2) {
                    C13479a.m54759a("ccm-lynx: LynxImageUrlUtils", "wrapperAssetUrl close stream", e2);
                }
            }
            f23765b.put(str, false);
            return "";
        } catch (Exception e3) {
            f23765b.put(str, false);
            C13479a.m54759a("ccm-lynx: LynxImageUrlUtils", "wrapperAssetUrl", e3);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e4) {
                    C13479a.m54759a("ccm-lynx: LynxImageUrlUtils", "wrapperAssetUrl close stream", e4);
                }
            }
            return "";
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    C13479a.m54759a("ccm-lynx: LynxImageUrlUtils", "wrapperAssetUrl close stream", e5);
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    private final String m37019c(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        GeckoResConfig eVar = GeckoResConfig.f15547a;
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        File b = eVar.mo21856b(application);
        if (b != null) {
            str2 = b.getAbsolutePath();
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(File.separatorChar);
        GeckoResConfig eVar2 = GeckoResConfig.f15547a;
        Application application2 = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application2, "ContextUtils.baseApplication");
        sb.append(eVar2.mo21855a(application2));
        sb.append(File.separatorChar);
        sb.append("docs_lynx_channel");
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            return "";
        }
        try {
            Map<String, Long> map = f23766c;
            Long l = map.get(str);
            if (l != null) {
                l.longValue();
                String str3 = sb2 + File.separatorChar + l + File.separatorChar + "res" + str;
                if (new File(str3).exists()) {
                    return str3;
                }
                map.remove(str);
            }
            Long a = m37016a(file);
            if (a == null) {
                return "";
            }
            a.longValue();
            String str4 = sb2 + File.separatorChar + a + File.separatorChar + "res" + str;
            if (!new File(str4).exists()) {
                return "";
            }
            map.put(str, a);
            return str4;
        } catch (Exception e) {
            C13479a.m54759a("ccm-lynx: LynxImageUrlUtils", "wrapperGeckoUrl", e);
            return "";
        }
    }

    /* renamed from: a */
    public final String mo33915a(Context context, String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        if (Intrinsics.areEqual("appImage", scheme) && !TextUtils.isEmpty(host)) {
            CCMLynxLocalDrawableConfig bVar = CCMLynxLocalDrawableConfig.f23747a;
            if (host == null) {
                Intrinsics.throwNpe();
            }
            Integer a = bVar.mo33893a(host);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                if (context != null) {
                    str2 = context.getPackageName();
                }
                sb.append(str2);
                sb.append('/');
                sb.append(a);
                return sb.toString();
            }
        }
        if (!TextUtils.isEmpty(scheme) || !TextUtils.isEmpty(host) || TextUtils.isEmpty(path)) {
            return null;
        }
        LynxImageUrlUtils aVar = f23764a;
        String c = aVar.m37019c(str);
        if (TextUtils.isEmpty(c)) {
            c = aVar.m37018b(str);
        }
        if (TextUtils.isEmpty(c)) {
            return aVar.m37017a(str);
        }
        return c;
    }
}
