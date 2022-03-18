package com.bytedance.ee.larkwebview.service.p681a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.p668b.C13398b;
import com.bytedance.ee.larkwebview.service.AbstractC13472g;
import com.bytedance.ee.larkwebview.service.listener.AbstractC13478a;
import com.ss.android.lark.log.Log;

/* renamed from: com.bytedance.ee.larkwebview.service.a.c */
public class C13462c implements AbstractC13472g {

    /* renamed from: a */
    private boolean f35502a;

    /* renamed from: b */
    private AbstractC13478a f35503b;

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13472g
    /* renamed from: a */
    public Bitmap mo49912a() {
        Log.m165389i("UrlQueryParameterHandleServiceImpl", "mHideVideoPoster = " + this.f35502a);
        if (this.f35502a) {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
        return null;
    }

    /* renamed from: a */
    private void m54707a(Uri uri) {
        String queryParameter = uri.getQueryParameter("lark_remove_video_overlay_icon");
        if (!TextUtils.isEmpty(queryParameter)) {
            Log.m165389i("UrlQueryParameterHandleServiceImpl", "hideVideoOverlayIcon = " + queryParameter);
            this.f35502a = Boolean.parseBoolean(queryParameter);
            return;
        }
        Log.m165389i("UrlQueryParameterHandleServiceImpl", "hideVideoOverlayIcon is empty");
        this.f35502a = false;
    }

    /* renamed from: b */
    private void m54709b(Uri uri, LarkWebView larkWebView) {
        AbstractC13478a aVar;
        String queryParameter = uri.getQueryParameter("lark_web_title_bar_show");
        Log.m165389i("UrlQueryParameterHandleServiceImpl", "titleBarShowValue = " + queryParameter + " , mTitleBarShowListener = " + this.f35503b);
        if (!TextUtils.isEmpty(queryParameter) && (aVar = this.f35503b) != null) {
            aVar.mo49934a(Boolean.parseBoolean(queryParameter));
        }
    }

    /* renamed from: a */
    private void m54708a(Uri uri, LarkWebView larkWebView) {
        String queryParameter = uri.getQueryParameter("lark_media_auto_play");
        if (!TextUtils.isEmpty(queryParameter)) {
            Log.m165389i("UrlQueryParameterHandleServiceImpl", "autoValue = " + queryParameter);
            larkWebView.getSettings().setMediaPlaybackRequiresUserGesture(Boolean.parseBoolean(queryParameter) ^ true);
            return;
        }
        boolean z = false;
        if (C13398b.m54466a() != null) {
            z = C13398b.m54466a().mo22591a("openplatform.webbrowser.autoplaynew");
        }
        boolean mediaPlaybackRequiresUserGesture = larkWebView.getSettings().getMediaPlaybackRequiresUserGesture();
        Log.m165389i("UrlQueryParameterHandleServiceImpl", "autoState = " + mediaPlaybackRequiresUserGesture + " ， autoPlayFg = " + z);
        if (z) {
            Log.m165389i("UrlQueryParameterHandleServiceImpl", "new autoPlay and flag is null ,so do nothing ");
            return;
        }
        Log.m165389i("UrlQueryParameterHandleServiceImpl", "autoValue is empty");
        larkWebView.getSettings().setMediaPlaybackRequiresUserGesture(true);
    }

    @Override // com.bytedance.ee.larkwebview.service.AbstractC13472g
    /* renamed from: a */
    public void mo49913a(String str, LarkWebView larkWebView) {
        if (TextUtils.isEmpty(str) || larkWebView == null) {
            Log.m165389i("UrlQueryParameterHandleServiceImpl", "url is " + str + ", webview is " + larkWebView);
            return;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                Log.m165389i("UrlQueryParameterHandleServiceImpl", "url is null");
                return;
            }
            m54708a(parse, larkWebView);
            m54707a(parse);
            m54709b(parse, larkWebView);
        } catch (Exception e) {
            Log.m165384e("UrlQueryParameterHandleServiceImpl", "handle url error", e);
        }
    }
}
