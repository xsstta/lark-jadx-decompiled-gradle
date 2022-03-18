package com.bytedance.ee.webapp;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.webapp.AbstractC13794f;
import com.bytedance.ee.webapp.p720a.C13754a;
import com.bytedance.ee.webapp.p720a.C13755b;
import com.bytedance.ee.webapp.p720a.C13756c;
import com.bytedance.ee.webapp.p722c.C13765a;
import com.bytedance.ee.webapp.v2.AbstractC13836d;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.apiplugin.common.UG;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.ee.webapp.d */
public class C13783d {

    /* renamed from: a */
    private static String f36027a;

    /* renamed from: b */
    private static View f36028b;

    /* renamed from: c */
    private static ObjectAnimator f36029c;

    /* renamed from: d */
    private static final Executor f36030d = Executors.newSingleThreadExecutor();

    /* renamed from: com.bytedance.ee.webapp.d$a */
    public interface AbstractC13789a {
        void onSharedReceiveValue(String str, String str2, String str3, AbstractC13836d dVar, String str4);
    }

    /* renamed from: a */
    public static void m55874a(final AbstractC13836d dVar, final String str, final AbstractC13789a aVar) {
        C13765a.m55784a(dVar.mo51008f(), m55883b(dVar) ? "app_normal" : "simple");
        m55878a(C13754a.f35953a, dVar.mo51007e(), dVar.mo51008f());
        WebView d = dVar.mo51003d();
        if (d != null) {
            d.getSettings();
            if (TextUtils.isEmpty(f36027a)) {
                if (C13802g.m55926a().mo50866b().mo50838a("gadget.h5.standard_meta_info")) {
                    f36027a = m55880b(dVar.mo50994b(), "content/get_h5_content_v2.js");
                    AppBrandLogger.m52830i("TitleMoreHandler", " use new js content ");
                } else {
                    f36027a = m55880b(dVar.mo50994b(), "content/get_h5_content.js");
                }
            }
            if (TextUtils.isEmpty(f36027a)) {
                AppBrandLogger.m52829e("TitleMoreHandler", " get jscontent null");
                return;
            }
            d.evaluateJavascript("javascript:" + f36027a, new ValueCallback<String>() {
                /* class com.bytedance.ee.webapp.C13783d.C137841 */

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    JSONObject parseObject = JSONObject.parseObject(str);
                    if (parseObject == null) {
                        LKUIToast.show(dVar.mo50994b(), (int) R.string.lark_webapp_share_failed);
                        C13755b.m55771a("op_h5_share_result", C13756c.f35964f, dVar.mo51007e()).addCategoryValue("app_url", str).flush();
                        return;
                    }
                    String str2 = (String) parseObject.get("title");
                    String str3 = (String) parseObject.get("desc");
                    if (!TextUtils.isEmpty(str3) && str3.length() >= 300 && !C13802g.m55926a().mo50866b().mo50838a("openplatform.h5.share.truncate.disable")) {
                        str3 = str3.substring(0, LocationRequest.PRIORITY_INDOOR);
                    }
                    String str4 = (String) parseObject.get("iconUrl");
                    AbstractC13789a aVar = aVar;
                    if (aVar != null) {
                        aVar.onSharedReceiveValue(str2, str3, str4, dVar, str);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m55879a(final String str, final String str2, String str3, final AbstractC13836d dVar, final String str4) {
        m55875a(dVar, str3, new IGetDataCallback<File>() {
            /* class com.bytedance.ee.webapp.C13783d.C137863 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(File file) {
                C13783d.m55873a(dVar);
                C13783d.m55872a(dVar.mo50999c(), file, dVar.mo51010h().wrapAndAddGetDataCallback(new IGetDataCallback<String>() {
                    /* class com.bytedance.ee.webapp.C13783d.C137863.C137871 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        C13783d.m55868a();
                        C13783d.m55876a(dVar, str4, str, str, str2);
                        C13783d.m55878a(C13754a.f35955c, dVar.mo51007e(), dVar.mo51008f());
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        C13783d.m55868a();
                        C13783d.m55876a(dVar, str4, str, "", str2);
                        C13783d.m55878a(C13754a.f35956d, dVar.mo51007e(), dVar.mo51008f());
                    }
                }));
            }
        });
    }

    /* renamed from: a */
    public static void m55875a(AbstractC13836d dVar, String str, IGetDataCallback<File> iGetDataCallback) {
        f36030d.execute(new Runnable(str, iGetDataCallback) {
            /* class com.bytedance.ee.webapp.$$Lambda$d$lgGzWdcd45OxXTmncSRzy9X1Ez0 */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ IGetDataCallback f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C13783d.lambda$lgGzWdcd45OxXTmncSRzy9X1Ez0(AbstractC13836d.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public static void m55878a(OPMonitorCode oPMonitorCode, IAppContext iAppContext, String str) {
        C13755b.m55770a(oPMonitorCode, iAppContext).addCategoryValue("app_id", str).addCategoryValue("app_type", "webApp").addCategoryValue("op_tracking", "opshare_web_app_pageshare").flush();
    }

    /* renamed from: a */
    public static void m55876a(AbstractC13836d dVar, String str, String str2, String str3, String str4) {
        m55878a(C13754a.f35957e, dVar.mo51007e(), dVar.mo51008f());
        if (m55883b(dVar)) {
            C13802g.m55926a().mo50866b().mo50833a(dVar.mo50999c(), dVar.mo51008f(), str, str2, str4, str3);
        } else {
            C13802g.m55926a().mo50866b().mo50832a(dVar.mo50999c(), str, str2, str3, str4);
        }
        C13765a.m55786b(dVar.mo51008f(), TextUtils.isEmpty(dVar.mo51008f()) ? "simple" : "app_normal");
    }

    /* renamed from: a */
    public static void m55873a(AbstractC13836d dVar) {
        if (f36028b == null) {
            f36028b = LayoutInflater.from(dVar.mo50994b()).inflate(R.layout.lark_webapp_loading_status_layout, dVar.mo51009g(), false);
        }
        f36028b.setVisibility(0);
        if (f36028b.getParent() != null) {
            ((ViewGroup) f36028b.getParent()).removeView(f36028b);
        }
        dVar.mo51009g().addView(f36028b);
        ObjectAnimator duration = ObjectAnimator.ofFloat(f36028b.findViewById(R.id.loading_iv), "rotation", -180.0f, 180.0f).setDuration(800L);
        f36029c = duration;
        duration.setRepeatCount(-1);
        f36029c.start();
    }

    /* renamed from: a */
    public static void m55868a() {
        View view = f36028b;
        if (view != null) {
            view.setVisibility(8);
        }
        ObjectAnimator objectAnimator = f36029c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    private static boolean m55883b(AbstractC13836d dVar) {
        return !TextUtils.isEmpty(dVar.mo51008f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0034 A[SYNTHETIC, Splitter:B:23:0x0034] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m55866a(java.io.File r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0025, all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0025, all -> 0x0023 }
            int r3 = r1.available()     // Catch:{ Exception -> 0x0021 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0021 }
            r1.read(r3)     // Catch:{ Exception -> 0x0021 }
            r2 = 16
            java.lang.String r0 = android.util.Base64.encodeToString(r3, r2)     // Catch:{ Exception -> 0x0021 }
            r1.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x002f
        L_0x001c:
            r3 = move-exception
            r3.printStackTrace()
            goto L_0x002f
        L_0x0021:
            r3 = move-exception
            goto L_0x0027
        L_0x0023:
            r3 = move-exception
            goto L_0x0032
        L_0x0025:
            r3 = move-exception
            r1 = r0
        L_0x0027:
            r3.printStackTrace()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002f
            r1.close()
        L_0x002f:
            return r0
        L_0x0030:
            r3 = move-exception
            r0 = r1
        L_0x0032:
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ IOException -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r0.printStackTrace()
        L_0x003c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.webapp.C13783d.m55866a(java.io.File):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m55877a(IGetDataCallback iGetDataCallback, File file) {
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(file);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m55881b(Context context, UG.ShareResponse shareResponse) {
        if (context != null) {
            m55871a(context, shareResponse);
        }
    }

    /* renamed from: a */
    private static File m55865a(Context context, String str) {
        try {
            return (File) ComponentCallbacks2C2115c.m9151c(context).mo10434m().mo10396a(str).mo10404b().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b A[SYNTHETIC, Splitter:B:25:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058 A[SYNTHETIC, Splitter:B:33:0x0058] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m55880b(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Exception -> 0x0044, all -> 0x0042 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0040 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0040 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0040 }
            r5.<init>(r1)     // Catch:{ Exception -> 0x0040 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0040 }
            r1.<init>()     // Catch:{ Exception -> 0x0040 }
        L_0x0018:
            java.lang.String r2 = r5.readLine()     // Catch:{ Exception -> 0x0040 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r3 = "^\\s*\\/\\/.*"
            boolean r3 = r2.matches(r3)     // Catch:{ Exception -> 0x0040 }
            if (r3 != 0) goto L_0x0029
            r1.append(r2)     // Catch:{ Exception -> 0x0040 }
        L_0x0029:
            if (r2 != 0) goto L_0x0018
            r5.close()     // Catch:{ Exception -> 0x0040 }
            r4.close()     // Catch:{ Exception -> 0x0040 }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x0040 }
            if (r4 == 0) goto L_0x003f
            r4.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x003f
        L_0x003b:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003f:
            return r5
        L_0x0040:
            r5 = move-exception
            goto L_0x0046
        L_0x0042:
            r5 = move-exception
            goto L_0x0056
        L_0x0044:
            r5 = move-exception
            r4 = r0
        L_0x0046:
            r5.printStackTrace()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0053
            r4.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0053:
            return r0
        L_0x0054:
            r5 = move-exception
            r0 = r4
        L_0x0056:
            if (r0 == 0) goto L_0x0060
            r0.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x0060
        L_0x005c:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0060:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.webapp.C13783d.m55880b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m55871a(Context context, UG.ShareResponse shareResponse) {
        if (shareResponse == null) {
            LKUIToast.show(context, context.getResources().getString(R.string.lark_brand_share_failed));
        } else if (shareResponse.mErrorCode == OnShareCallback.NOT_INSTALLED.getCode()) {
            LKUIToast.show(context, context.getResources().getString(R.string.lark_webapp_apk_not_install));
        } else if (shareResponse.mErrorCode != Integer.MIN_VALUE) {
            LKUIToast.show(context, context.getResources().getString(R.string.lark_brand_share_failed));
        }
    }

    /* renamed from: a */
    public static ArrayList<C25838g> m55867a(Activity activity, Fragment fragment, AbstractC13794f.AbstractC13797c cVar) {
        return C13802g.m55926a().mo50866b().mo50831a(activity, fragment, cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m55882b(AbstractC13836d dVar, String str, IGetDataCallback iGetDataCallback) {
        UICallbackExecutor.execute(new Runnable(m55865a(dVar.mo50994b(), str)) {
            /* class com.bytedance.ee.webapp.$$Lambda$d$PNFnp8xS6aFdfHCj_waash2JL4g */
            public final /* synthetic */ File f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C13783d.lambda$PNFnp8xS6aFdfHCj_waash2JL4g(IGetDataCallback.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public static void m55872a(Context context, final File file, final IGetDataCallback<String> iGetDataCallback) {
        if (file != null) {
            C13802g.m55926a().mo50866b().mo50837a(file.getAbsolutePath(), new IGetDataCallback<String>() {
                /* class com.bytedance.ee.webapp.C13783d.C137884 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onSuccess(str);
                    }
                    file.delete();
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    file.delete();
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(errorResult);
                    }
                }
            });
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("download image failed"));
        }
    }

    /* renamed from: a */
    public static void m55870a(int i, String str, String str2, String str3, String str4, C67462h hVar) {
        String str5;
        if (i == 1) {
            str5 = UG.ShareChannelType.WX.mValue;
        } else {
            str5 = UG.ShareChannelType.WX_TIMELINE.mValue;
        }
        UG.ShareRequest shareRequest = new UG.ShareRequest();
        shareRequest.mContentType = UG.ShareContentType.WEB_URL.mValue;
        shareRequest.mTitle = str3;
        shareRequest.mContent = str2;
        shareRequest.mImage = str4;
        shareRequest.mUrl = str;
        if (!TextUtils.isEmpty(str5)) {
            shareRequest.mChannelType.add(str5);
        }
        if (hVar.getBridgeContext() != null) {
            hVar.getBridgeContext().mo92209a("share", shareRequest, new AbstractC25897h(hVar.getBridgeContext().mo92207a()) {
                /* class com.bytedance.ee.webapp.$$Lambda$d$FCJK4CFa8EVc4dJCbv0XU31hn9Y */
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25897h
                public final void callback(Object obj) {
                    C13783d.lambda$FCJK4CFa8EVc4dJCbv0XU31hn9Y(this.f$0, (UG.ShareResponse) obj);
                }
            }, UG.ShareResponse.class);
            return;
        }
        Log.m165383e("TitleMoreHandler", "error");
    }

    /* renamed from: a */
    public static void m55869a(final int i, final String str, final String str2, String str3, AbstractC13836d dVar, final String str4, final WeakReference<C67462h> weakReference) {
        m55875a(dVar, str3, new IGetDataCallback<File>() {
            /* class com.bytedance.ee.webapp.C13783d.C137852 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(File file) {
                String a = C13783d.m55866a(file);
                C67462h hVar = (C67462h) weakReference.get();
                if (hVar != null) {
                    C13783d.m55870a(i, str4, str2, str, a, hVar);
                }
            }
        });
    }
}
