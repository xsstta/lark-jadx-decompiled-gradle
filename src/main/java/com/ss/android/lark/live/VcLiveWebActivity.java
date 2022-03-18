package com.ss.android.lark.live;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.AbstractC0203c;
import androidx.core.graphics.C0768a;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.air.AirActivity;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.C29517a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inno.network.C38928a;
import com.ss.android.lark.inno.network.model.GetDecorationData;
import com.ss.android.lark.inno.network.p1971a.AbstractC38929a;
import com.ss.android.lark.inno.network.p1971a.C38930b;
import com.ss.android.lark.live.LiveStateHolder;
import com.ss.android.lark.live.model.VCLiveData;
import com.ss.android.lark.live.p2133a.C41488a;
import com.ss.android.lark.live.p2140c.C41509a;
import com.ss.android.lark.live.p2140c.C41510b;
import com.ss.android.lark.live.webview.AbstractC41531a;
import com.ss.android.lark.live.webview.AbstractC41532b;
import com.ss.android.lark.live.webview.AbstractC41537c;
import com.ss.android.lark.live.webview.C41538d;
import com.ss.android.lark.live.webview.C41540e;
import com.ss.android.lark.live.webview.C41541f;
import com.ss.android.lark.live.webview.VcWebViewAdapter;
import com.ss.android.lark.live.webview.bridgev2.C41535c;
import com.ss.android.lark.live.widget.ShareDialog;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.floatwindow.floating.permission.C46313a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 S2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001SB\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020#H\u0002J\b\u0010)\u001a\u00020#H\u0002J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020#H\u0002J\u0010\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\u0006H\u0002J\b\u00102\u001a\u00020#H\u0016J\u0010\u00103\u001a\u00020#2\u0006\u00104\u001a\u000205H\u0016J\u0012\u00106\u001a\u00020#2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020#H\u0014J(\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0016J\b\u0010@\u001a\u00020#H\u0016J\u0018\u0010A\u001a\u00020#2\u0006\u0010;\u001a\u00020<2\u0006\u0010B\u001a\u00020\u0006H\u0016J\"\u0010C\u001a\u00020#2\u0006\u0010;\u001a\u00020<2\u0006\u0010B\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u00020&H\u0002J\u0010\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020\u0006H\u0016J\b\u0010J\u001a\u00020#H\u0002J\b\u0010K\u001a\u00020#H\u0002J\b\u0010L\u001a\u00020#H\u0002J\u0012\u0010M\u001a\u00020#2\b\b\u0001\u0010N\u001a\u00020&H\u0002J\u0012\u0010O\u001a\u00020#2\b\b\u0001\u0010N\u001a\u00020&H\u0002J\b\u0010P\u001a\u00020#H\u0002J\u0010\u0010Q\u001a\u00020#2\u0006\u0010R\u001a\u00020/H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/ss/android/lark/live/VcLiveWebActivity;", "Lcom/larksuite/component/air/AirActivity;", "Lcom/ss/android/lark/live/webview/IVcWebTitleListener;", "Lcom/ss/android/lark/live/webview/IVcWebStatusListener;", "()V", "currentLink", "", "getCurrentLink", "()Ljava/lang/String;", "mErrorView", "Landroid/view/View;", "getMErrorView", "()Landroid/view/View;", "mErrorView$delegate", "Lkotlin/Lazy;", "mProgressBar", "Landroid/widget/ProgressBar;", "mShareDialog", "Lcom/ss/android/lark/live/widget/ShareDialog;", "getMShareDialog", "()Lcom/ss/android/lark/live/widget/ShareDialog;", "mShareDialog$delegate", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "mUrlParam", "Lcom/ss/android/lark/live/VcLiveUrlParam;", "mWebChromeClient", "Landroid/webkit/WebChromeClient;", "mWebViewAdapter", "Lcom/ss/android/lark/live/webview/VcWebViewAdapter;", "mWebViewClient", "Landroid/webkit/WebViewClient;", "mWeblayout", "Landroid/widget/FrameLayout;", "addAction", "", "titleBar", "tintColor", "", "createWebViewAdapter", "findViews", "initNavigationBarColor", "initStatusBarColor", "colorRes", "initTitleBar", "liveModeTrace", "isLand", "", "moreTrace", "action", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onError", "view", "Landroid/webkit/WebView;", "errorCode", "description", "failingUrl", "onNavigationChange", "onPageFinished", "url", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onProgressChanged", "newProgress", "onTitleChange", "title", "parserBundle", "refresh", "requestTheme", "setDarkTextStatusBar", "bgColor", "setLightTextStatusBar", "shareLink", "showWebLoadingBar", "isShow", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VcLiveWebActivity extends AirActivity implements AbstractC41532b, AbstractC41537c {

    /* renamed from: f */
    public static final Companion f105444f = new Companion(null);

    /* renamed from: a */
    public VcWebViewAdapter f105445a;

    /* renamed from: b */
    public WebViewClient f105446b;

    /* renamed from: c */
    public WebChromeClient f105447c;

    /* renamed from: d */
    public FrameLayout f105448d;

    /* renamed from: e */
    public CommonTitleBar f105449e;

    /* renamed from: g */
    private VcLiveUrlParam f105450g;

    /* renamed from: h */
    private ProgressBar f105451h;

    /* renamed from: i */
    private final Lazy f105452i = LazyKt.lazy(new C41477e(this));

    /* renamed from: j */
    private final Lazy f105453j = LazyKt.lazy(new C41479f(this));

    /* renamed from: j */
    private final View m164585j() {
        return (View) this.f105452i.getValue();
    }

    /* renamed from: a */
    public Context mo149273a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public final ShareDialog mo149274a() {
        return (ShareDialog) this.f105453j.getValue();
    }

    /* renamed from: a */
    public void mo149276a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m164578a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m164576a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo149290g() {
        return super.getResources();
    }

    public AssetManager getAssets() {
        return m164582c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m164577a(this);
    }

    /* renamed from: h */
    public void mo149292h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo149293i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m164580b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/live/VcLiveWebActivity$Companion;", "", "()V", "TAG", "", "attachActivity", "", "activity", "Lcom/ss/android/lark/live/VcLiveWebActivity;", "webView", "Landroid/webkit/WebView;", "detachActivity", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo149294a(VcLiveWebActivity vcLiveWebActivity, WebView webView) {
            FrameLayout frameLayout = vcLiveWebActivity.f105448d;
            if (frameLayout != null) {
                frameLayout.addView(webView, 0);
            }
            WebViewClient webViewClient = vcLiveWebActivity.f105446b;
            if (webViewClient != null) {
                webView.setWebViewClient(webViewClient);
            }
            WebChromeClient webChromeClient = vcLiveWebActivity.f105447c;
            if (webChromeClient != null) {
                webView.setWebChromeClient(webChromeClient);
            }
        }

        /* renamed from: b */
        public final void mo149295b(VcLiveWebActivity vcLiveWebActivity, WebView webView) {
            FrameLayout frameLayout = vcLiveWebActivity.f105448d;
            if (frameLayout != null) {
                frameLayout.removeView(webView);
            }
            webView.setWebViewClient(new WebViewClient());
            webView.setWebChromeClient(new WebChromeClient());
        }
    }

    /* renamed from: a */
    public final void mo149280a(CommonTitleBar commonTitleBar, int i) {
        commonTitleBar.removeAllActions();
        commonTitleBar.addAction(new C41474b(this, i, R.drawable.ud_icon_more_outlined, i));
    }

    /* renamed from: a */
    public final void mo149281a(String str) {
        C41535c c;
        VcWebViewAdapter vcWebViewAdapter = this.f105445a;
        C41510b.m164741a(str, C41509a.m164737a(this), (vcWebViewAdapter == null || (c = vcWebViewAdapter.mo149435c()) == null) ? false : c.f105597c, "more");
    }

    /* renamed from: n */
    private final void m164589n() {
        Serializable serializable;
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("bundle_live_url_param");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f105450g = (VcLiveUrlParam) serializable;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.live.VcLiveUrlParam");
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (C41509a.m164737a(this)) {
            C45855f.m181664c("VcLiveWebActivity@", "[onInterceptBack] onInterceptBack, rotate screen to portrait");
            setRequestedOrientation(1);
            return;
        }
        super.onBackPressed();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$e */
    static final class C41477e extends Lambda implements Function0<View> {
        final /* synthetic */ VcLiveWebActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41477e(VcLiveWebActivity vcLiveWebActivity) {
            super(0);
            this.this$0 = vcLiveWebActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            View inflate = LayoutInflater.from(this.this$0).inflate(R.layout.vc_live_web_error_page, (ViewGroup) this.this$0.f105448d, false);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "errorView");
            inflate.setVisibility(8);
            FrameLayout frameLayout = this.this$0.f105448d;
            if (frameLayout == null) {
                Intrinsics.throwNpe();
            }
            frameLayout.addView(inflate, layoutParams);
            inflate.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.lark.live.VcLiveWebActivity.C41477e.View$OnClickListenerC414781 */

                /* renamed from: a */
                final /* synthetic */ C41477e f105458a;

                {
                    this.f105458a = r1;
                }

                public final void onClick(View view) {
                    this.f105458a.this$0.mo149285c();
                }
            });
            return inflate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/live/widget/ShareDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$f */
    static final class C41479f extends Lambda implements Function0<ShareDialog> {
        final /* synthetic */ VcLiveWebActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41479f(VcLiveWebActivity vcLiveWebActivity) {
            super(0);
            this.this$0 = vcLiveWebActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ShareDialog invoke() {
            ShareDialog.Builder aVar = new ShareDialog.Builder();
            aVar.mo149386b(new View$OnClickListenerC41480a(this));
            aVar.mo149384a(new View$OnClickListenerC41481b(this));
            aVar.mo149388c(new View$OnClickListenerC41482c(this));
            return aVar.mo149389d();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/live/VcLiveWebActivity$mShareDialog$2$1$2"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$f$b */
        public static final class View$OnClickListenerC41481b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C41479f f105460a;

            View$OnClickListenerC41481b(C41479f fVar) {
                this.f105460a = fVar;
            }

            public final void onClick(View view) {
                C45855f.m181664c("VcLiveWebActivity@", "[onSingleClick] share button on click");
                this.f105460a.this$0.mo149281a("share");
                this.f105460a.this$0.mo149287d();
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/live/VcLiveWebActivity$mShareDialog$2$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$f$a */
        public static final class View$OnClickListenerC41480a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C41479f f105459a;

            View$OnClickListenerC41480a(C41479f fVar) {
                this.f105459a = fVar;
            }

            public final void onClick(View view) {
                C45855f.m181664c("VcLiveWebActivity@", "[onSingleClick] Copy button on click");
                this.f105459a.this$0.mo149281a("copy_link");
                Object systemService = this.f105459a.this$0.getSystemService("clipboard");
                if (systemService != null) {
                    ((ClipboardManager) systemService).setText(this.f105459a.this$0.mo149288e());
                    LKUIToast.show(this.f105459a.this$0, (int) R.string.Common_G_FromView_LinkCopied);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/live/VcLiveWebActivity$mShareDialog$2$1$3"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$f$c */
        public static final class View$OnClickListenerC41482c implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C41479f f105461a;

            View$OnClickListenerC41482c(C41479f fVar) {
                this.f105461a = fVar;
            }

            public final void onClick(View view) {
                WebView b;
                C45855f.m181664c("VcLiveWebActivity@", "[onSingleClick] Refresh button on click");
                this.f105461a.this$0.mo149281a("reload");
                VcWebViewAdapter vcWebViewAdapter = this.f105461a.this$0.f105445a;
                if (!(vcWebViewAdapter == null || (b = vcWebViewAdapter.mo149433b()) == null)) {
                    b.reload();
                }
                this.f105461a.this$0.mo149282b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/live/VcLiveWebActivity$onCreate$3", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$h */
    public static final class C41484h extends AbstractC0203c {

        /* renamed from: a */
        final /* synthetic */ VcLiveWebActivity f105463a;

        @Override // androidx.activity.AbstractC0203c
        public void handleOnBackPressed() {
            VcWebViewAdapter vcWebViewAdapter = this.f105463a.f105445a;
            if (vcWebViewAdapter != null && vcWebViewAdapter.mo149436d()) {
                C41488a a = C41488a.m164623a();
                Intrinsics.checkExpressionValueIsNotNull(a, "LiveControl.of()");
                if (!a.mo149324c() && !C46313a.m183388a((Context) this.f105463a)) {
                    C46313a.m183387a(this.f105463a, new C41485a(this));
                    return;
                }
            }
            this.f105463a.finish();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$h$a */
        static final class C41485a implements C46313a.AbstractC46314a {

            /* renamed from: a */
            final /* synthetic */ C41484h f105464a;

            C41485a(C41484h hVar) {
                this.f105464a = hVar;
            }

            @Override // com.ss.android.lark.mm.module.floatwindow.floating.permission.C46313a.AbstractC46314a
            public final void permissionGranted(boolean z) {
                if (!z) {
                    this.f105464a.f105463a.finish();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41484h(VcLiveWebActivity vcLiveWebActivity, boolean z) {
            super(z);
            this.f105463a = vcLiveWebActivity;
        }
    }

    /* renamed from: k */
    private final void m164586k() {
        int color = UIUtils.getColor(this, R.color.bg_body);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(134217728);
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        window.setNavigationBarColor(color);
    }

    /* renamed from: l */
    private final void m164587l() {
        this.f105448d = (FrameLayout) findViewById(R.id.live_web_layout);
        this.f105449e = (CommonTitleBar) findViewById(R.id.titlebar);
        this.f105451h = (ProgressBar) findViewById(R.id.web_load_progressbar);
    }

    /* renamed from: m */
    private final VcWebViewAdapter m164588m() {
        String str = null;
        VcWebViewAdapter vcWebViewAdapter = null;
        VcLiveUrlParam vcLiveUrlParam = this.f105450g;
        if (vcLiveUrlParam != null && vcLiveUrlParam.source() == 1) {
            C41538d a = C41538d.m164835a();
            VcLiveUrlParam vcLiveUrlParam2 = this.f105450g;
            if (vcLiveUrlParam2 != null) {
                str = vcLiveUrlParam2.url();
            }
            vcWebViewAdapter = a.mo149455a(str);
        }
        if (vcWebViewAdapter != null) {
            return vcWebViewAdapter;
        }
        return new VcWebViewAdapter(this, new LarkWebView(getApplicationContext(), BizType.f35444h.mo49861b()));
    }

    /* renamed from: o */
    private final void m164590o() {
        CommonTitleBar commonTitleBar = this.f105449e;
        if (commonTitleBar != null) {
            commonTitleBar.setLeftVisible(true);
            commonTitleBar.addAction(new C41475c(R.drawable.ud_icon_more_outlined, R.color.icon_n1, this));
            mo149280a(commonTitleBar, R.color.icon_n1);
            commonTitleBar.setLeftClickListener(new View$OnClickListenerC41476d(this));
        }
        mo149282b();
    }

    /* renamed from: c */
    public final void mo149285c() {
        WebView b;
        m164585j().setVisibility(8);
        VcWebViewAdapter vcWebViewAdapter = this.f105445a;
        if (vcWebViewAdapter != null && (b = vcWebViewAdapter.mo149433b()) != null) {
            b.reload();
        }
    }

    /* renamed from: d */
    public final void mo149287d() {
        WebView b;
        String title;
        VcWebViewAdapter vcWebViewAdapter = this.f105445a;
        if (vcWebViewAdapter != null && (b = vcWebViewAdapter.mo149433b()) != null && (title = b.getTitle()) != null) {
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            a.getForwardDependency().gotoShareForwardSelectPage(this, mo149288e(), title, "");
        }
    }

    /* renamed from: e */
    public final String mo149288e() {
        String str;
        C41535c c;
        VCLiveData vCLiveData;
        String str2;
        WebView b;
        VcWebViewAdapter vcWebViewAdapter = this.f105445a;
        String str3 = "";
        if (vcWebViewAdapter == null || (b = vcWebViewAdapter.mo149433b()) == null || (str = b.getUrl()) == null) {
            str = str3;
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "mWebViewAdapter?.webView?.url ?: \"\"");
        VcWebViewAdapter vcWebViewAdapter2 = this.f105445a;
        if (!(vcWebViewAdapter2 == null || (c = vcWebViewAdapter2.mo149435c()) == null || (vCLiveData = c.f105596b) == null || (str2 = vCLiveData.f105545a) == null)) {
            str3 = str2;
        }
        return !TextUtils.isEmpty(str3) ? str3 : str;
    }

    @Override // com.ss.android.lark.live.webview.AbstractC41537c
    /* renamed from: f */
    public void mo149289f() {
        WebView b;
        VcWebViewAdapter vcWebViewAdapter = this.f105445a;
        if (vcWebViewAdapter == null || (b = vcWebViewAdapter.mo149433b()) == null || !b.canGoBack()) {
            CommonTitleBar commonTitleBar = this.f105449e;
            if (commonTitleBar != null) {
                commonTitleBar.setSecLeftVisible(false);
            }
            CommonTitleBar commonTitleBar2 = this.f105449e;
            if (commonTitleBar2 != null) {
                commonTitleBar2.setLeftVisible(true);
                return;
            }
            return;
        }
        CommonTitleBar commonTitleBar3 = this.f105449e;
        if (commonTitleBar3 != null) {
            commonTitleBar3.setLeftVisible(true);
        }
        CommonTitleBar commonTitleBar4 = this.f105449e;
        if (commonTitleBar4 != null) {
            commonTitleBar4.setSecLeftVisible(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        VcWebViewAdapter vcWebViewAdapter = this.f105445a;
        if (vcWebViewAdapter != null) {
            WebView b = vcWebViewAdapter.mo149433b();
            Intrinsics.checkExpressionValueIsNotNull(b, "it.webView");
            String url = b.getUrl();
            Companion aVar = f105444f;
            WebView b2 = vcWebViewAdapter.mo149433b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "it.webView");
            aVar.mo149295b(this, b2);
            C41538d.m164835a().mo149456a(vcWebViewAdapter);
            this.f105445a = null;
            C41488a.m164623a().mo149323b(url);
            C41510b.m164738a(0);
        }
        super.onDestroy();
    }

    /* renamed from: b */
    public final void mo149282b() {
        String baseUrl;
        VcLiveUrlParam vcLiveUrlParam;
        String liveId;
        VcLiveUrlParam vcLiveUrlParam2 = this.f105450g;
        if (vcLiveUrlParam2 != null && (baseUrl = vcLiveUrlParam2.getBaseUrl()) != null && (vcLiveUrlParam = this.f105450g) != null && (liveId = vcLiveUrlParam.getLiveId()) != null) {
            C38928a.m153633a(baseUrl, liveId, new C41486i(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/live/VcLiveWebActivity$initTitleBar$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$d */
    public static final class View$OnClickListenerC41476d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VcLiveWebActivity f105457a;

        View$OnClickListenerC41476d(VcLiveWebActivity vcLiveWebActivity) {
            this.f105457a = vcLiveWebActivity;
        }

        public final void onClick(View view) {
            this.f105457a.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newProgress", "", "onProgressChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$g */
    static final class C41483g implements AbstractC41531a {

        /* renamed from: a */
        final /* synthetic */ VcLiveWebActivity f105462a;

        C41483g(VcLiveWebActivity vcLiveWebActivity) {
            this.f105462a = vcLiveWebActivity;
        }

        @Override // com.ss.android.lark.live.webview.AbstractC41531a
        /* renamed from: a */
        public final void mo149301a(int i) {
            this.f105462a.mo149283b(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/live/VcLiveWebActivity$requestTheme$1", "Lcom/ss/android/lark/inno/network/base/ILiveDataCallback;", "Lcom/ss/android/lark/inno/network/model/GetDecorationData$GetDecorationResp;", "onErrorResult", "", "errorResult", "Lcom/ss/android/lark/inno/network/base/LiveErrorResult;", "onResp", "resp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$i */
    public static final class C41486i extends AbstractC38929a<GetDecorationData.GetDecorationResp> {

        /* renamed from: a */
        final /* synthetic */ VcLiveWebActivity f105465a;

        @Override // com.ss.android.lark.inno.network.p1971a.AbstractC38929a
        /* renamed from: a */
        public void mo142522a(C38930b bVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41486i(VcLiveWebActivity vcLiveWebActivity) {
            this.f105465a = vcLiveWebActivity;
        }

        /* renamed from: a */
        public void mo142521a(GetDecorationData.GetDecorationResp getDecorationResp) {
            GetDecorationData getDecorationData;
            CommonTitleBar commonTitleBar;
            if (getDecorationResp != null && (getDecorationData = (GetDecorationData) getDecorationResp.data) != null && (commonTitleBar = this.f105465a.f105449e) != null) {
                commonTitleBar.setBackgroundResource(getDecorationData.getTitleBackgroundColor());
                commonTitleBar.setMainTitleColor(this.f105465a.getResources().getColor(getDecorationData.getTitleColor()));
                commonTitleBar.setLeftImageResource(R.drawable.ud_icon_left_outlined, getDecorationData.getTitleColor());
                this.f105465a.mo149280a(commonTitleBar, getDecorationData.getTitleColor());
                this.f105465a.mo149275a(getDecorationData.getTitleBackgroundColor());
            }
        }
    }

    /* renamed from: b */
    public final void mo149283b(int i) {
        ProgressBar progressBar = this.f105451h;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    /* renamed from: c */
    private final void m164583c(int i) {
        C29517a.m108726b().mo102665a(this, i);
    }

    /* renamed from: d */
    private final void m164584d(int i) {
        C29517a.m108726b().mo102666b(this, i);
    }

    @Override // com.ss.android.lark.live.webview.AbstractC41537c
    /* renamed from: b */
    public void mo149284b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        CommonTitleBar commonTitleBar = this.f105449e;
        if (commonTitleBar != null) {
            commonTitleBar.setTitle(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/live/VcLiveWebActivity$addAction$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$b */
    public static final class C41474b extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ VcLiveWebActivity f105454a;

        /* renamed from: b */
        final /* synthetic */ int f105455b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            ShareDialog a = this.f105454a.mo149274a();
            FragmentManager supportFragmentManager = this.f105454a.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
            a.mo149380a(supportFragmentManager);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41474b(VcLiveWebActivity vcLiveWebActivity, int i, int i2, int i3) {
            super(i2, i3);
            this.f105454a = vcLiveWebActivity;
            this.f105455b = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/live/VcLiveWebActivity$initTitleBar$1$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.live.VcLiveWebActivity$c */
    public static final class C41475c extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ VcLiveWebActivity f105456a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            super.performAction(view);
            ShareDialog a = this.f105456a.mo149274a();
            FragmentManager supportFragmentManager = this.f105456a.getSupportFragmentManager();
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
            a.mo149380a(supportFragmentManager);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41475c(int i, int i2, VcLiveWebActivity vcLiveWebActivity) {
            super(i, i2);
            this.f105456a = vcLiveWebActivity;
        }
    }

    /* renamed from: a */
    public static Resources m164577a(VcLiveWebActivity vcLiveWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcLiveWebActivity);
        }
        return vcLiveWebActivity.mo149290g();
    }

    /* renamed from: b */
    private final void m164581b(boolean z) {
        int i;
        C45855f.m181664c("VcLiveWebActivity@", "[liveModeTrace] isLandscape: " + z);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C41510b.m164738a(i);
    }

    /* renamed from: c */
    public static AssetManager m164582c(VcLiveWebActivity vcLiveWebActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcLiveWebActivity);
        }
        return vcLiveWebActivity.mo149293i();
    }

    /* renamed from: b */
    public static void m164580b(VcLiveWebActivity vcLiveWebActivity) {
        vcLiveWebActivity.mo149292h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            VcLiveWebActivity vcLiveWebActivity2 = vcLiveWebActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    vcLiveWebActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        C41535c c;
        C41535c c2;
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 1) {
            VcWebViewAdapter vcWebViewAdapter = this.f105445a;
            if (vcWebViewAdapter != null && (c2 = vcWebViewAdapter.mo149435c()) != null && c2.f105597c) {
                m164581b(false);
                return;
            }
            return;
        }
        VcWebViewAdapter vcWebViewAdapter2 = this.f105445a;
        if (vcWebViewAdapter2 != null && (c = vcWebViewAdapter2.mo149435c()) != null && c.f105597c) {
            m164581b(true);
        }
    }

    /* renamed from: a */
    private final void m164579a(boolean z) {
        int i;
        ProgressBar progressBar = this.f105451h;
        if (progressBar != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            progressBar.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        String str;
        String url;
        super.onCreate(bundle);
        m164589n();
        setContentView(R.layout.vc_live_web_activity);
        mo149275a(R.color.bg_body);
        m164586k();
        VcLiveUrlParam vcLiveUrlParam = this.f105450g;
        String str2 = null;
        if (vcLiveUrlParam != null) {
            str = vcLiveUrlParam.url();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            finish();
            return;
        }
        m164587l();
        m164590o();
        C41488a.m164623a().mo149321a(true);
        VcLiveWebActivity vcLiveWebActivity = this;
        this.f105446b = new C41541f(vcLiveWebActivity, this);
        this.f105447c = new C41540e(vcLiveWebActivity, new C41483g(this));
        VcWebViewAdapter m = m164588m();
        this.f105445a = m;
        if (m != null) {
            Companion aVar = f105444f;
            WebView b = m.mo149433b();
            Intrinsics.checkExpressionValueIsNotNull(b, "it.webView");
            aVar.mo149294a(this, b);
            VcLiveUrlParam vcLiveUrlParam2 = this.f105450g;
            if (vcLiveUrlParam2 != null) {
                str2 = vcLiveUrlParam2.url();
            }
            WebView b2 = m.mo149433b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "it.webView");
            if (!C41538d.m164836a(str2, b2.getUrl())) {
                HashMap hashMap = new HashMap();
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45882j languageDependency = a.getLanguageDependency();
                Intrinsics.checkExpressionValueIsNotNull(languageDependency, "MmDepend.impl().languageDependency");
                String languageTag = languageDependency.mo144665a().toLanguageTag();
                Intrinsics.checkExpressionValueIsNotNull(languageTag, "MmDepend.impl().language…geSetting.toLanguageTag()");
                hashMap.put("Accept-Language", languageTag);
                C41504b.m164711a();
                C41504b.m164719i();
                VcLiveUrlParam vcLiveUrlParam3 = this.f105450g;
                if (!(vcLiveUrlParam3 == null || (url = vcLiveUrlParam3.url()) == null)) {
                    m.mo149433b().loadUrl(url, hashMap);
                }
                C41488a.m164623a().mo149318a(LiveStateHolder.LiveState.START);
            } else {
                CommonTitleBar commonTitleBar = this.f105449e;
                if (commonTitleBar != null) {
                    WebView b3 = m.mo149433b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "it.webView");
                    commonTitleBar.setTitle(b3.getTitle());
                }
                m.mo149429a(VcWebViewAdapter.DisplayMode.NORMAL);
            }
        }
        getOnBackPressedDispatcher().addCallback(new C41484h(this, true));
    }

    /* renamed from: a */
    public final void mo149275a(int i) {
        int color = UIUtils.getColor(this, i);
        if (C0768a.m3714b(-1, color) <= ((double) 3.0f)) {
            m164583c(color);
        } else {
            m164584d(color);
        }
    }

    /* renamed from: a */
    public static void m164578a(VcLiveWebActivity vcLiveWebActivity, Context context) {
        vcLiveWebActivity.mo149276a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(vcLiveWebActivity);
        }
    }

    /* renamed from: a */
    public static Context m164576a(VcLiveWebActivity vcLiveWebActivity, Configuration configuration) {
        Context a = vcLiveWebActivity.mo149273a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.ss.android.lark.live.webview.AbstractC41532b
    /* renamed from: a */
    public void mo149278a(WebView webView, String str) {
        Intrinsics.checkParameterIsNotNull(webView, "view");
        Intrinsics.checkParameterIsNotNull(str, "url");
        if (this.f105451h != null) {
            m164579a(false);
        }
    }

    @Override // com.ss.android.lark.live.webview.AbstractC41532b
    /* renamed from: a */
    public void mo149279a(WebView webView, String str, Bitmap bitmap) {
        C41535c c;
        VCLiveData vCLiveData;
        String str2;
        boolean z;
        Intrinsics.checkParameterIsNotNull(webView, "view");
        Intrinsics.checkParameterIsNotNull(str, "url");
        m164579a(true);
        VcWebViewAdapter vcWebViewAdapter = this.f105445a;
        if (vcWebViewAdapter != null && (c = vcWebViewAdapter.mo149435c()) != null && (vCLiveData = c.f105596b) != null && (str2 = vCLiveData.f105545a) != null) {
            if (str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vCLiveData.f105545a = str;
            }
        }
    }

    @Override // com.ss.android.lark.live.webview.AbstractC41532b
    /* renamed from: a */
    public void mo149277a(WebView webView, int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(webView, "view");
        Intrinsics.checkParameterIsNotNull(str, "description");
        Intrinsics.checkParameterIsNotNull(str2, "failingUrl");
        C45855f.m181666e("VcLiveWebActivity@", "[onReceivedError] failed to open url: " + str2 + ", cause: " + str + ", with errorCode: " + i);
        ProgressBar progressBar = this.f105451h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        m164585j().setVisibility(0);
        C41504b.m164716f();
        C41504b.m164724n();
    }
}
