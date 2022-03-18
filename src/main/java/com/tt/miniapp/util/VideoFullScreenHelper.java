package com.tt.miniapp.util;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebChromeClient;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.C66546p;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.view.FullScreenVideoLayout;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.util.C67587d;

public class VideoFullScreenHelper {

    /* renamed from: a */
    public String f168984a;

    /* renamed from: b */
    private WebChromeClient.CustomViewCallback f168985b;

    /* renamed from: c */
    private View f168986c;

    /* renamed from: d */
    private ScreenDirection f168987d = ScreenDirection.LANDSCAPE;

    /* renamed from: e */
    private FullScreenVideoLayout f168988e;

    /* renamed from: f */
    private IAppContext f168989f;

    public enum ScreenDirection {
        PORTRAIT,
        LANDSCAPE,
        REVERSE_LANDSCAPE
    }

    /* renamed from: a */
    public boolean mo233134a() {
        WebChromeClient.CustomViewCallback customViewCallback = this.f168985b;
        if (customViewCallback == null) {
            return false;
        }
        customViewCallback.onCustomViewHidden();
        return true;
    }

    /* renamed from: a */
    public void mo233132a(ScreenDirection screenDirection) {
        this.f168987d = screenDirection;
    }

    /* renamed from: a */
    public void mo233128a(Activity activity) {
        mo233129a(activity, -1);
    }

    public VideoFullScreenHelper(IAppContext iAppContext) {
        this.f168989f = iAppContext;
    }

    /* renamed from: a */
    public ScreenDirection mo233126a(int i) {
        if (i == -90) {
            return ScreenDirection.REVERSE_LANDSCAPE;
        }
        if (i == 90) {
            return ScreenDirection.LANDSCAPE;
        }
        return ScreenDirection.PORTRAIT;
    }

    /* renamed from: b */
    private FullScreenVideoLayout m261186b(Activity activity) {
        if (activity == null) {
            return null;
        }
        if (this.f168988e == null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.microapp_m_video_view_stub);
            if (viewStub != null) {
                viewStub.inflate();
            }
            this.f168988e = (FullScreenVideoLayout) activity.findViewById(R.id.microapp_m_video_full_screen_container);
        }
        return this.f168988e;
    }

    /* renamed from: a */
    public void mo233133a(String str) {
        this.f168984a = str;
    }

    /* renamed from: b */
    private void m261187b(Activity activity, int i) {
        activity.setRequestedOrientation(i);
        if (activity instanceof MiniappHostBase) {
            AbstractC67497e activityProxy = ((MiniappHostBase) activity).getActivityProxy();
            if (activityProxy instanceof C66546p) {
                ((C66546p) activityProxy).mo232122d(i);
            }
        }
    }

    /* renamed from: a */
    public void mo233129a(Activity activity, int i) {
        View view = this.f168986c;
        if (view != null) {
            C67024ac.m261234a(view, true);
            m261187b(activity, 1);
            m261186b(activity).mo233466a();
            if (i >= 0) {
                mo233127a(i, this.f168984a, false);
            }
            this.f168987d = ScreenDirection.LANDSCAPE;
            this.f168984a = "";
            this.f168986c = null;
            this.f168985b = null;
        }
    }

    /* renamed from: a */
    public void mo233130a(Activity activity, View view, WebChromeClient.CustomViewCallback customViewCallback) {
        mo233131a(activity, view, customViewCallback, -1);
    }

    /* renamed from: a */
    public void mo233127a(int i, String str, boolean z) {
        RenderViewManager renderViewManager;
        if (!TextUtils.isEmpty(str) && (renderViewManager = AppbrandApplicationImpl.getInst(this.f168989f).getRenderViewManager()) != null) {
            renderViewManager.publish(i, "onVideoFullScreenChange", new C67587d().mo234783a("fullScreen", Boolean.valueOf(z)).mo234783a("id", str).mo234784a().toString());
        }
    }

    /* renamed from: a */
    public void mo233131a(Activity activity, final View view, WebChromeClient.CustomViewCallback customViewCallback, final int i) {
        WebChromeClient.CustomViewCallback customViewCallback2;
        if (this.f168986c == null || (customViewCallback2 = this.f168985b) == null) {
            this.f168985b = customViewCallback;
            this.f168986c = view;
            int i2 = 0;
            if (this.f168987d == ScreenDirection.PORTRAIT) {
                i2 = 1;
            } else if (this.f168987d == ScreenDirection.REVERSE_LANDSCAPE) {
                i2 = 8;
            }
            m261187b(activity, i2);
            m261186b(activity).mo233467a(view, new FullScreenVideoLayout.AbstractC67138a() {
                /* class com.tt.miniapp.util.VideoFullScreenHelper.C670171 */

                @Override // com.tt.miniapp.view.FullScreenVideoLayout.AbstractC67138a
                /* renamed from: a */
                public void mo233135a() {
                    int i = i;
                    if (i >= 0) {
                        VideoFullScreenHelper videoFullScreenHelper = VideoFullScreenHelper.this;
                        videoFullScreenHelper.mo233127a(i, videoFullScreenHelper.f168984a, true);
                    }
                    C67024ac.m261234a(view, false);
                }
            });
            return;
        }
        customViewCallback2.onCustomViewHidden();
    }
}
