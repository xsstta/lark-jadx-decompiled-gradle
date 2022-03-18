package com.tt.miniapp.util;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.p3298k.C66273g;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapp.settings.v2.handler.C66806w;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.p3256b.AbstractC65679a;
import com.tt.refer.common.base.AppType;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import okio.ByteString;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.util.z */
public class C67070z {

    /* renamed from: a */
    private static Set<String> f169047a = new HashSet<String>() {
        /* class com.tt.miniapp.util.C67070z.C670711 */

        {
            add("base64");
            add("hex");
            add("ucs2");
            add("ucs-2");
            add("utf16le");
            add("utf-16le");
            add("binary");
            add("ascii");
            add("utf-8");
            add("utf8");
            add("latin1");
        }
    };

    /* renamed from: com.tt.miniapp.util.z$a */
    public static class C67072a {

        /* renamed from: a */
        public String f169048a;

        /* renamed from: b */
        public String f169049b;
    }

    /* renamed from: a */
    public static void m261391a(Activity activity, int i, IAppContext iAppContext) {
        AppInfoEntity appInfo;
        if (activity != null) {
            if (activity instanceof MiniappHostBase) {
                MiniappHostBase miniappHostBase = (MiniappHostBase) activity;
                C66273g.m259315a(iAppContext);
                if (m261403c(iAppContext)) {
                    i = 12;
                }
                boolean z = i == 10 || i == 15;
                AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(iAppContext);
                if (!(inst == null || (appInfo = inst.getAppInfo()) == null || !C66645a.m260337a().mo232355a(appInfo.sandBoxEnvType).isInHostStack(activity.getClass()) || i == 12)) {
                    i = 1;
                }
                AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(iAppContext);
                if (miniAppLifeCycleInstance != null) {
                    miniAppLifeCycleInstance.mo229926b(i);
                }
                if (i != 12 && miniappHostBase.isTriggeredHomeOrRecentApp()) {
                    C67018a.m261201a(activity, z);
                }
                AppBrandLogger.m52830i("ToolUtils", "moveTaskToBack exitType:", Integer.valueOf(i));
                if (i == 2 || i == 15 || i == 9 || i == 10) {
                    try {
                        activity.moveTaskToBack(true);
                        AppBrandLogger.m52828d("ToolUtils", "moveTaskToBack activity:", activity);
                    } catch (Exception e) {
                        AppBrandLogger.m52829e("ToolUtils", "onActivityExit", e);
                        return;
                    }
                } else if (i != 12) {
                    if (i != 13) {
                        activity.finish();
                        AppBrandLogger.m52828d("ToolUtils", "Activity finish activity:", activity);
                        if (iAppContext instanceof AbstractC67433a) {
                            ((AbstractC67433a) iAppContext).mo234170j();
                        }
                    } else {
                        activity.finishAndRemoveTask();
                        AppBrandLogger.m52828d("ToolUtils", "Activity finishAndRemoveTask activity:", activity);
                    }
                } else if (miniappHostBase.isInHostStack()) {
                    activity.finish();
                    AppBrandLogger.m52828d("ToolUtils", "Host Stack Activity finish activity:", activity);
                } else {
                    activity.finishAndRemoveTask();
                    AppBrandLogger.m52828d("ToolUtils", "Activity finishAndRemoveTask activity:", activity);
                }
                if (z) {
                    C67018a.m261219d(activity);
                    activity.getWindow().addFlags(8192);
                } else if (!C25529d.m91166g(iAppContext)) {
                    HostDependManager.getInst().overridePendingTransition(activity, R.anim.microapp_i_slide_in_no, R.anim.microapp_i_slide_in_bottom, 2);
                }
                if (i != 12) {
                    C66612a.m260231a((String) null, false, iAppContext);
                }
                AppbrandApplicationImpl.getInst(iAppContext).getForeBackgroundManager().mo231959a(true);
            } else if (!activity.isFinishing()) {
                activity.finish();
                C67018a.m261219d(activity);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093 A[SYNTHETIC, Splitter:B:36:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a5 A[SYNTHETIC, Splitter:B:43:0x00a5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m261396a(java.lang.String r10, long r11, long r13) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67070z.m261396a(java.lang.String, long, long):byte[]");
    }

    /* renamed from: a */
    public static boolean m261394a(String str, String str2, String str3) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.createNewFile();
        }
        m261393a(str, m261400b(str2, str3));
        return true;
    }

    /* renamed from: a */
    public static void m261393a(String str, byte[] bArr) throws IOException {
        if (bArr != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.write(bArr, 0, bArr.length);
            dataOutputStream.close();
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    public static void m261392a(WebView webView) {
        webView.setWebChromeClient(null);
        webView.setWebViewClient(null);
        ViewParent parent = webView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(webView);
            try {
                webView.destroy();
            } catch (Throwable th) {
                AppBrandLogger.m52829e("ToolUtils", "clearWebView", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m261395a(String str, ByteBuffer byteBuffer) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.getChannel().write(byteBuffer);
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            AppBrandLogger.m52829e("ToolUtils", e);
            return false;
        }
    }

    /* renamed from: a */
    public static String m261386a() {
        String str;
        C67072a aVar = ContextSingletonInstance.getInstance().toolUtilInstance;
        if (!TextUtils.isEmpty(aVar.f169048a)) {
            return aVar.f169048a;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str = WebSettings.getDefaultUserAgent(AppbrandContext.getInst().getApplicationContext());
            } catch (Exception unused) {
                str = System.getProperty("http.agent");
            }
        } else {
            str = System.getProperty("http.agent");
        }
        if (str == null) {
            str = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                stringBuffer.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                stringBuffer.append(charAt);
            }
        }
        aVar.f169048a = stringBuffer.toString();
        return aVar.f169048a;
    }

    /* renamed from: b */
    public static String m261398b(byte[] bArr) {
        return ByteString.of(bArr).base64();
    }

    /* renamed from: c */
    private static String m261402c(byte[] bArr) {
        return ByteString.of(bArr).hex();
    }

    /* renamed from: e */
    private static byte[] m261406e(String str) {
        return ByteString.decodeHex(str).toByteArray();
    }

    /* renamed from: a */
    public static long m261384a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return 0;
        }
        return (long) (byteBuffer.limit() - byteBuffer.position());
    }

    /* renamed from: c */
    private static boolean m261403c(IAppContext iAppContext) {
        if (HostDependManager.getInst().getAnchorConfig(C67432a.m262319a(iAppContext).getSchema()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Bitmap m261385a(byte[] bArr) {
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (Exception e) {
            AppBrandLogger.stacktrace(6, "ToolUtils", e.getStackTrace());
            return null;
        }
    }

    /* renamed from: d */
    private static byte[] m261405d(String str) {
        ByteString decodeBase64 = ByteString.decodeBase64(str);
        if (decodeBase64 != null) {
            return decodeBase64.toByteArray();
        }
        AppBrandLogger.m52830i("ToolUtils", "data cannot be decoded to base64:" + str);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[SYNTHETIC, Splitter:B:19:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[SYNTHETIC, Splitter:B:25:0x004c] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m261399b(java.lang.String r9) {
        /*
            java.lang.String r0 = "fis close exception:"
            java.lang.String r1 = "ToolUtils"
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 2
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            r6.<init>(r9)     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            int r9 = r6.available()     // Catch:{ IOException -> 0x0028 }
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x0028 }
            r6.read(r9)     // Catch:{ IOException -> 0x0028 }
            r6.close()     // Catch:{ IOException -> 0x001a }
            goto L_0x0024
        L_0x001a:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r2
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r1, r5)
        L_0x0024:
            return r9
        L_0x0025:
            r9 = move-exception
            r2 = r6
            goto L_0x004a
        L_0x0028:
            r9 = move-exception
            goto L_0x002e
        L_0x002a:
            r9 = move-exception
            goto L_0x004a
        L_0x002c:
            r9 = move-exception
            r6 = r2
        L_0x002e:
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0025 }
            java.lang.String r8 = "readBytes exception"
            r7[r4] = r8     // Catch:{ all -> 0x0025 }
            r7[r3] = r9     // Catch:{ all -> 0x0025 }
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r1, r7)     // Catch:{ all -> 0x0025 }
            if (r6 == 0) goto L_0x0049
            r6.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x0049
        L_0x003f:
            r9 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r9
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r1, r5)
        L_0x0049:
            return r2
        L_0x004a:
            if (r2 == 0) goto L_0x005a
            r2.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x005a
        L_0x0050:
            r2 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r2
            com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52829e(r1, r5)
        L_0x005a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.util.C67070z.m261399b(java.lang.String):byte[]");
    }

    /* renamed from: c */
    public static boolean m261404c(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return f169047a.contains(str);
    }

    /* renamed from: f */
    private static String m261407f(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1388966911:
                if (str.equals("binary")) {
                    c = 0;
                    break;
                }
                break;
            case -1109877331:
                if (str.equals("latin1")) {
                    c = 1;
                    break;
                }
                break;
            case -119555963:
                if (str.equals("utf16le")) {
                    c = 2;
                    break;
                }
                break;
            case 3584301:
                if (str.equals("ucs2")) {
                    c = 3;
                    break;
                }
                break;
            case 111113226:
                if (str.equals("ucs-2")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return "latin1";
            case 2:
            case 3:
            case 4:
                return "UTF-16LE";
            default:
                return str;
        }
    }

    /* renamed from: a */
    public static String m261387a(IAppContext iAppContext) {
        String str;
        C67072a aVar = ContextSingletonInstance.getInstance().toolUtilInstance;
        String b = m261397b(iAppContext);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        if (!TextUtils.isEmpty(aVar.f169049b)) {
            return aVar.f169049b;
        }
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        String str2 = "";
        if (initParams != null) {
            str2 = initParams.mo234511k();
            str = initParams.mo234512l();
        } else {
            str = str2;
        }
        String b2 = C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), iAppContext);
        if (TextUtils.isEmpty(b2)) {
            b2 = "1.0.0";
        }
        StringBuilder sb = new StringBuilder(m261386a());
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" ");
            sb.append(str2);
            sb.append("/");
        }
        sb.append(C67043j.m261283f(AppbrandContext.getInst().getApplicationContext()));
        sb.append(" ToutiaoMicroApp/");
        sb.append(b2);
        if (!TextUtils.isEmpty(str)) {
            sb.append(" PluginVersion/");
            sb.append(str);
        }
        aVar.f169049b = sb.toString();
        return aVar.f169049b;
    }

    /* renamed from: b */
    private static String m261397b(IAppContext iAppContext) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        String a = C57824f.m224460a(applicationContext, "", Locale.getDefault());
        StringBuilder sb = new StringBuilder(a);
        if (TextUtils.isEmpty(a)) {
            sb = new StringBuilder(WebSettings.getDefaultUserAgent(applicationContext));
            sb.append(" Lark/");
            sb.append(C67043j.m261283f(applicationContext));
        }
        String b = C66399c.m259608a().mo231922b(applicationContext, iAppContext);
        if (TextUtils.isEmpty(b)) {
            b = "-1";
        }
        sb.append(" EEMicroApp/");
        sb.append(b);
        if (ProcessUtil.isMiniappProcess() || (iAppContext != null && AppType.GadgetAPP == iAppContext.getAppType())) {
            if (C67432a.m262319a(iAppContext) == null) {
                return sb.toString();
            }
            AppInfoEntity appInfo = C67432a.m262319a(iAppContext).getAppInfo();
            if (appInfo != null && !TextUtils.isEmpty(appInfo.appId)) {
                return m261401c(sb.toString(), appInfo.appId);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m261388a(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 7 || length != 4 || str.charAt(0) != '#') {
            return str;
        }
        return "#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3);
    }

    /* renamed from: a */
    public static long m261383a(long j, boolean z) {
        double d = ((double) j) / 1024.0d;
        if (z) {
            return (long) Math.ceil(d);
        }
        return (long) d;
    }

    /* renamed from: b */
    public static byte[] m261400b(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        str2.hashCode();
        if (str2.equals("base64")) {
            return m261405d(str);
        }
        if (!str2.equals("hex")) {
            return str.getBytes(m261407f(str2));
        }
        return m261406e(str);
    }

    /* renamed from: c */
    private static String m261401c(String str, String str2) {
        String a = C66806w.m260686a().mo232714a("default");
        if (!TextUtils.isEmpty(a) && !TextUtils.equals(a, "default")) {
            try {
                if (new JSONObject(a).optBoolean(str2)) {
                    return str.replace("Chrome", "");
                }
                return str;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m261389a(String str, String str2) {
        byte[] b = m261399b(str);
        char c = 65535;
        try {
            int hashCode = str2.hashCode();
            if (hashCode != -1396204209) {
                if (hashCode == 103195) {
                    if (str2.equals("hex")) {
                        c = 1;
                    }
                }
            } else if (str2.equals("base64")) {
                c = 0;
            }
            if (c == 0) {
                return m261398b(b);
            }
            if (c != 1) {
                return new String(b, m261407f(str2));
            }
            return m261402c(b);
        } catch (Exception e) {
            AppBrandLogger.m52829e("ToolUtils", "readString error:" + str2, e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m261390a(byte[] bArr, String str) {
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1396204209) {
                if (hashCode == 103195) {
                    if (str.equals("hex")) {
                        c = 1;
                    }
                }
            } else if (str.equals("base64")) {
                c = 0;
            }
            if (c == 0) {
                return m261398b(bArr);
            }
            if (c != 1) {
                return new String(bArr, m261407f(str));
            }
            return m261402c(bArr);
        } catch (Exception e) {
            AppBrandLogger.m52829e("ToolUtils", "decodeByteArrayToString exception:", e);
            return null;
        }
    }
}
