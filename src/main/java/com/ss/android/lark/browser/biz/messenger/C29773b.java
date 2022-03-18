package com.ss.android.lark.browser.biz.messenger;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29929a;
import com.ss.android.lark.browser.impl.p1422b.p1423a.C29931b;
import com.ss.android.lark.browser.impl.statistics.BrowserHitPoint;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2069j.p2070a.C40647n;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.browser.biz.messenger.b */
public class C29773b {

    /* renamed from: a */
    private static String f74477a;

    /* renamed from: b */
    private static View f74478b;

    /* renamed from: c */
    private static ObjectAnimator f74479c;

    /* renamed from: com.ss.android.lark.browser.biz.messenger.b$a */
    public interface AbstractC29781a {
        void shareValueReceived(String str, String str2, String str3, String str4);
    }

    /* renamed from: com.ss.android.lark.browser.biz.messenger.b$b */
    public interface AbstractC29782b {
        /* renamed from: a */
        void mo107253a(ErrorResult errorResult);

        /* renamed from: a */
        void mo107254a(File file);

        /* renamed from: a */
        void mo107255a(String str);

        /* renamed from: b */
        void mo107256b(ErrorResult errorResult);
    }

    /* renamed from: a */
    public static void m110106a() {
        C26171w.m94675a($$Lambda$b$0XgBxv8Og1vVMAlWvQ_ZHzy_LA.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m110115b() {
        View view = f74478b;
        if (view != null) {
            view.setVisibility(8);
        }
        ObjectAnimator objectAnimator = f74479c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: a */
    public static void m110110a(Fragment fragment, ViewGroup viewGroup) {
        C26171w.m94675a(new Runnable(viewGroup) {
            /* class com.ss.android.lark.browser.biz.messenger.$$Lambda$b$wmS_Z0d6D_06QWsjZNb2GU08uOQ */
            public final /* synthetic */ ViewGroup f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C29773b.m110116b(Fragment.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    private static File m110104a(Context context, Bitmap bitmap) {
        String E = C57881t.m224606E(context);
        try {
            File file = new File(E + System.currentTimeMillis() + ".png");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static File m110105a(Context context, String str) {
        try {
            return m110104a(context, ImageLoader.with(context).load(str).asBitmap().getBitmap(Integer.MIN_VALUE, Integer.MIN_VALUE));
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[SYNTHETIC, Splitter:B:24:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004e A[SYNTHETIC, Splitter:B:31:0x004e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m110114b(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Exception -> 0x003f, all -> 0x003d }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003b }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x003b }
            r1.<init>(r4)     // Catch:{ Exception -> 0x003b }
            r5.<init>(r1)     // Catch:{ Exception -> 0x003b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003b }
            r1.<init>()     // Catch:{ Exception -> 0x003b }
        L_0x0018:
            java.lang.String r2 = r5.readLine()     // Catch:{ Exception -> 0x003b }
            if (r2 == 0) goto L_0x0029
            java.lang.String r3 = "^\\s*\\/\\/.*"
            boolean r3 = r2.matches(r3)     // Catch:{ Exception -> 0x003b }
            if (r3 != 0) goto L_0x0029
            r1.append(r2)     // Catch:{ Exception -> 0x003b }
        L_0x0029:
            if (r2 != 0) goto L_0x0018
            r5.close()     // Catch:{ Exception -> 0x003b }
            r4.close()     // Catch:{ Exception -> 0x003b }
            java.lang.String r5 = r1.toString()     // Catch:{ Exception -> 0x003b }
            if (r4 == 0) goto L_0x003a
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return r5
        L_0x003b:
            r5 = move-exception
            goto L_0x0041
        L_0x003d:
            r5 = move-exception
            goto L_0x004c
        L_0x003f:
            r5 = move-exception
            r4 = r0
        L_0x0041:
            r5.printStackTrace()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0049
            r4.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r0
        L_0x004a:
            r5 = move-exception
            r0 = r4
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            r0.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.browser.biz.messenger.C29773b.m110114b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m110116b(Fragment fragment, ViewGroup viewGroup) {
        if (f74478b == null) {
            f74478b = LayoutInflater.from(fragment.getContext()).inflate(R.layout.loading_status_layout, viewGroup, false);
        }
        f74478b.setVisibility(0);
        if (f74478b.getParent() != null) {
            ((ViewGroup) f74478b.getParent()).removeView(f74478b);
        }
        viewGroup.addView(f74478b);
        ObjectAnimator duration = ObjectAnimator.ofFloat(f74478b.findViewById(R.id.loading_iv), "rotation", -180.0f, 180.0f).setDuration(800L);
        f74479c = duration;
        duration.setRepeatCount(-1);
        f74479c.start();
    }

    /* renamed from: a */
    public static void m110108a(Context context, final File file, final IGetDataCallback<String> iGetDataCallback) {
        if (file != null) {
            C29638a.m109622a().getManisDependency().mo107702b(file.getAbsolutePath(), new IGetDataCallback<String>() {
                /* class com.ss.android.lark.browser.biz.messenger.C29773b.C297806 */

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
    public static void m110109a(final Context context, final String str, final AbstractC29782b bVar) {
        C57865c.m224575a(new C57865c.AbstractC57873d<File>() {
            /* class com.ss.android.lark.browser.biz.messenger.C29773b.C297763 */

            /* renamed from: a */
            public File produce() {
                return C29773b.m110105a(context, str);
            }
        }, new C57865c.AbstractC57871b<File>() {
            /* class com.ss.android.lark.browser.biz.messenger.C29773b.C297774 */

            /* renamed from: a */
            public void consume(File file) {
                bVar.mo107254a(file);
                C29773b.m110108a(context, file, new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.browser.biz.messenger.C29773b.C297774.C297781 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        bVar.mo107255a(str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("MessengerTitleMoreHandler", " upload image err " + errorResult.getDebugMsg());
                        bVar.mo107256b(errorResult);
                    }
                });
            }
        }, new C57865c.AbstractC57871b<Throwable>() {
            /* class com.ss.android.lark.browser.biz.messenger.C29773b.C297795 */

            /* renamed from: a */
            public void consume(Throwable th) {
                Log.m165384e("MessengerTitleMoreHandler", " download image err", th);
                bVar.mo107253a(new ErrorResult(new Exception(th)));
            }
        });
    }

    /* renamed from: a */
    public static void m110107a(Activity activity, Fragment fragment, WebView webView, ViewGroup viewGroup, AbstractC29781a aVar) {
        if (C57582a.m223607a(activity) && fragment.isAdded()) {
            BrowserHitPoint.f74663a.mo107795a("WebPage");
            m110112a(fragment, webView, viewGroup, webView.getUrl(), aVar);
        }
    }

    /* renamed from: a */
    private static void m110112a(final Fragment fragment, WebView webView, ViewGroup viewGroup, final String str, final AbstractC29781a aVar) {
        BrowserHitPoint.f74663a.mo107797b("", "simple");
        C29929a.m110673a(C29931b.f74694y).addCategoryValue("op_tracking", "opshare_web_pageshare").flush();
        if (webView != null) {
            if (TextUtils.isEmpty(f74477a)) {
                if (C29638a.m109622a().isFeatureGatingEnable("gadget.h5.standard_meta_info")) {
                    Log.m165389i("MessengerTitleMoreHandler", "h5 use new js content ");
                    f74477a = m110114b(fragment.getContext(), "content/get_h5_content_v2.js");
                } else {
                    f74477a = m110114b(fragment.getContext(), "content/get_h5_content.js");
                }
            }
            webView.evaluateJavascript("javascript:" + f74477a, new ValueCallback<String>() {
                /* class com.ss.android.lark.browser.biz.messenger.C29773b.C297741 */

                /* renamed from: a */
                public void onReceiveValue(String str) {
                    JSONObject parseObject = JSONObject.parseObject(str);
                    if (parseObject == null) {
                        LKUIToast.show(fragment.getContext(), (int) R.string.Lark_Legacy_ShareFailed);
                        return;
                    }
                    String str2 = (String) parseObject.get("title");
                    String str3 = (String) parseObject.get("desc");
                    String str4 = (String) parseObject.get("iconUrl");
                    AbstractC29781a aVar = aVar;
                    if (aVar != null) {
                        aVar.shareValueReceived(str2, str, str3, str4);
                    }
                    BrowserHitPoint.f74663a.mo107798c("", "simple");
                }
            });
        }
    }

    /* renamed from: a */
    public static void m110113a(Fragment fragment, String str, String str2, String str3, String str4) {
        C29929a.m110673a(C29931b.f74669C).flush();
        C29638a.m109622a().getForwardDependency().mo107667a(fragment.getActivity(), "", str, str2, str3, str4);
    }

    /* renamed from: a */
    public static void m110111a(final Fragment fragment, ViewGroup viewGroup, final String str, final String str2, final String str3, String str4) {
        m110110a(fragment, viewGroup);
        m110109a(fragment.getContext(), str4, new AbstractC29782b() {
            /* class com.ss.android.lark.browser.biz.messenger.C29773b.C297752 */

            @Override // com.ss.android.lark.browser.biz.messenger.C29773b.AbstractC29782b
            /* renamed from: a */
            public void mo107254a(File file) {
                Log.m165389i("MessengerTitleMoreHandler", " download image success ");
            }

            @Override // com.ss.android.lark.browser.biz.messenger.C29773b.AbstractC29782b
            /* renamed from: a */
            public void mo107253a(ErrorResult errorResult) {
                C29773b.m110106a();
                C29773b.m110113a(fragment, str, str2, "", str3);
            }

            @Override // com.ss.android.lark.browser.biz.messenger.C29773b.AbstractC29782b
            /* renamed from: b */
            public void mo107256b(ErrorResult errorResult) {
                C29773b.m110106a();
                C29773b.m110113a(fragment, str, str2, "", str3);
                C29929a.m110673a(C29931b.f74668B).flush();
            }

            @Override // com.ss.android.lark.browser.biz.messenger.C29773b.AbstractC29782b
            /* renamed from: a */
            public void mo107255a(String str) {
                C29773b.m110106a();
                C29773b.m110113a(fragment, str, str2, str, str3);
                C29929a.m110673a(C40647n.f103115c).flush();
            }
        });
    }
}
