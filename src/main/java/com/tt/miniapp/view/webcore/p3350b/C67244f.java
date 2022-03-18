package com.tt.miniapp.view.webcore.p3350b;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.ee.lark.infra.config.mina.keys.Settings;
import com.bytedance.ee.lark.infra.config.mina.p614a.C12738a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.streamloader.C66862a;
import com.tt.miniapp.streamloader.StreamLoader;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapp.view.webcore.LoadPathInterceptor;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.refer.common.util.C67866g;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.view.webcore.b.f */
public class C67244f {
    /* renamed from: a */
    private static boolean m262066a() {
        if (!HostDependManager.getInst().isTTWebView()) {
            AppBrandLogger.m52830i("ResourceReader", "enableCodeCache, not tt webview");
            return false;
        }
        if (C12738a.m52722a(AppbrandContext.getInst().getApplicationContext(), 0, Settings.TT_TMA_SWITCH, Settings.TmaSwitch.ENABLE_CODE_CACHE) == 1) {
            return true;
        }
        AppBrandLogger.m52830i("ResourceReader", "enableCodeCache, turn off");
        return false;
    }

    /* renamed from: a */
    public static String m262065a(Uri uri) {
        String path = uri.getPath();
        if (path == null || !path.startsWith("/")) {
            return path;
        }
        return path.substring(1);
    }

    /* renamed from: a */
    private static byte[] m262067a(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        return IOUtils.readBytes(file.getAbsolutePath());
    }

    /* renamed from: a */
    public static WebResourceResponse m262062a(IAppContext iAppContext, Uri uri) {
        return m262063a(iAppContext, uri, "ttjssdk");
    }

    /* renamed from: c */
    private static File m262069c(IAppContext iAppContext, String str) {
        return new File(AppbrandConstant.getJsBundleDir(AppbrandContext.getInst().getApplicationContext(), iAppContext), str);
    }

    /* renamed from: a */
    public static WebResourceResponse m262064a(IAppContext iAppContext, String str) {
        byte[] interceptRpx2Px = HostDependManager.getInst().interceptRpx2Px(m262067a(m262069c(iAppContext, str)));
        if (interceptRpx2Px == null) {
            interceptRpx2Px = new byte[0];
            TimeLogger.getInstance(iAppContext).logError("ResourceReader_templatefile_null");
            new C67500a(C67501b.f170235c, iAppContext).setResultTypeFail().setErrorMessage("getPageFrameHtml, page-frame.html not found").flush();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "templatefile_not_found_at_intercept");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C67509b.m262587a("mp_start_error", (int) AuthCode.StatusCode.AUTH_INFO_NOT_EXIST, jSONObject, iAppContext);
        }
        return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(interceptRpx2Px));
    }

    /* renamed from: b */
    public static InputStream m262068b(final IAppContext iAppContext, final String str) {
        final boolean z;
        if (str.endsWith(".json") || str.endsWith(".js")) {
            z = true;
        } else {
            z = false;
        }
        final MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(iAppContext).getService(MpTimeLineReporter.class);
        final LoadPathInterceptor loadPathInterceptor = (LoadPathInterceptor) AppbrandApplicationImpl.getInst(iAppContext).getService(LoadPathInterceptor.class);
        final String[] strArr = new String[1];
        final C672451 r0 = new C66862a() {
            /* class com.tt.miniapp.view.webcore.p3350b.C67244f.C672451 */

            @Override // java.io.Closeable, com.tt.miniapp.streamloader.C66862a, java.lang.AutoCloseable, java.io.InputStream
            public void close() throws IOException {
                super.close();
                if (z) {
                    TimeLogger.getInstance(iAppContext).logTimeDuration("ResourceReader_stream_close", strArr[0]);
                    mpTimeLineReporter.addPoint("get_file_content_from_ttpkg_end", new MpTimeLineReporter.C67015a().mo233114a("file_path", strArr[0]).mo233115a());
                }
            }
        };
        InputStream stream = StreamLoader.getStream(str, iAppContext);
        if (stream != null) {
            strArr[0] = str;
            if (z) {
                TimeLogger.getInstance(iAppContext).logTimeDuration("ResourceReader_stream_open", strArr[0]);
                mpTimeLineReporter.addPoint("get_file_content_from_ttpkg_begin", new MpTimeLineReporter.C67015a().mo233114a("file_path", strArr[0]).mo233115a());
            }
            r0.mo232805a(stream);
        } else if (loadPathInterceptor.shouldIntercept(str)) {
            TimeLogger.getInstance(iAppContext).logTimeDuration("ResourceReader_doInterceptLoadPath", String.valueOf(str));
            C67866g.m264025a(new Action() {
                /* class com.tt.miniapp.view.webcore.p3350b.C67244f.C672462 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    strArr[0] = loadPathInterceptor.interceptPath(str);
                    if (z) {
                        TimeLogger.getInstance(iAppContext).logTimeDuration("ResourceReader_stream_open2", strArr[0]);
                        mpTimeLineReporter.addPoint("get_file_content_from_ttpkg_begin", new MpTimeLineReporter.C67015a().mo233114a("file_path", strArr[0]).mo233115a());
                    }
                    InputStream stream = StreamLoader.getStream(strArr[0], iAppContext);
                    if (stream == null) {
                        TimeLogger.getInstance(iAppContext).logError("ResourceReader_interceptLoader_originStream_is_null2", str, String.valueOf(strArr[0]));
                        stream = new ByteArrayInputStream(new byte[0]);
                    }
                    r0.mo232805a(stream);
                }
            }, C67554l.m262725b());
        } else {
            TimeLogger.getInstance(iAppContext).logTimeDuration("ResourceReader_interceptLoader_originStream_is_null", String.valueOf(str));
            r0.mo232805a(new ByteArrayInputStream(new byte[0]));
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse m262063a(com.bytedance.ee.lark.infra.sandbox.context.IAppContext r8, android.net.Uri r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 277
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.view.webcore.p3350b.C67244f.m262063a(com.bytedance.ee.lark.infra.sandbox.context.IAppContext, android.net.Uri, java.lang.String):android.webkit.WebResourceResponse");
    }
}
