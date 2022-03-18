package com.ss.android.lark.chat.video;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u0003123B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J\u0012\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010\b2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u000e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010)\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\b\u0010+\u001a\u00020\u001aH\u0016J\b\u0010,\u001a\u00020\u001aH\u0016J\u001a\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010/\u001a\u00020\u001aH\u0002J\b\u00100\u001a\u00020\u001aH\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/chat/video/YoutubeVideoPreviewFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/ss/android/lark/chat/video/SharedElementListener;", "Lcom/ss/android/lark/chat/video/BackListener;", "()V", "isPortrait", "", "mClose", "Landroid/view/View;", "mCoverImage", "Lcom/ss/android/lark/image/entity/Image;", "mCoverView", "Landroid/widget/ImageView;", "mErrorContainer", "Landroid/view/ViewGroup;", "mIFrameUrl", "", "mIsVideoStart", "mListener", "Lcom/ss/android/lark/chat/video/OnFragmentInteractListener;", "mLoading", "mRootView", "mVid", "mWebView", "Landroid/webkit/WebView;", "dealWithError", "", "onAttach", "context", "Landroid/content/Context;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroy", "onDetach", "onPause", "onSharedElementEnd", "onViewCreated", "view", "pauseVideo", "playYoutubeVideo", "Companion", "JSListener", "YoutubeClient", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.video.i */
public final class YoutubeVideoPreviewFragment extends Fragment implements BackListener, SharedElementListener {

    /* renamed from: f */
    public static final Companion f88849f = new Companion(null);

    /* renamed from: a */
    public View f88850a;

    /* renamed from: b */
    public ImageView f88851b;

    /* renamed from: c */
    public OnFragmentInteractListener f88852c;

    /* renamed from: d */
    public boolean f88853d;

    /* renamed from: e */
    public boolean f88854e = true;

    /* renamed from: g */
    private String f88855g;

    /* renamed from: h */
    private Image f88856h;

    /* renamed from: i */
    private String f88857i;

    /* renamed from: j */
    private WebView f88858j;

    /* renamed from: k */
    private ViewGroup f88859k;

    /* renamed from: l */
    private View f88860l;

    /* renamed from: m */
    private View f88861m;

    /* renamed from: n */
    private HashMap f88862n;

    /* renamed from: d */
    public void mo127047d() {
        HashMap hashMap = this.f88862n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.chat.video.SharedElementListener
    /* renamed from: g */
    public void mo126995g() {
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo127047d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/video/YoutubeVideoPreviewFragment$Companion;", "", "()V", "YOUTUBE_FRAME", "", "YOUTUBE_HTTP", "YOUTUBE_HTTPS", "newInstance", "Lcom/ss/android/lark/chat/video/YoutubeVideoPreviewFragment;", "iFrameUrl", "vid", "image", "Lcom/ss/android/lark/image/entity/Image;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final YoutubeVideoPreviewFragment mo127048a(String str, String str2, Image image) {
            Intrinsics.checkParameterIsNotNull(str, "iFrameUrl");
            YoutubeVideoPreviewFragment iVar = new YoutubeVideoPreviewFragment();
            Bundle bundle = new Bundle();
            bundle.putString("param_i_frame_url", str);
            bundle.putSerializable("param_vid", str2);
            bundle.putSerializable("param_cover_image", image);
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        m133422e();
    }

    /* renamed from: e */
    private final void m133422e() {
        WebView webView = this.f88858j;
        if (webView != null) {
            webView.loadUrl("javascript:pauseVideo()");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        WebView webView = this.f88858j;
        if (webView != null) {
            webView.destroy();
        }
        this.f88858j = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f88852c = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/video/YoutubeVideoPreviewFragment$JSListener;", "", "(Lcom/ss/android/lark/chat/video/YoutubeVideoPreviewFragment;)V", "postEvent", "", "eventName", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.i$b */
    public final class JSListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.video.i$b$b */
        static final class RunnableC34411b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JSListener f88866a;

            RunnableC34411b(JSListener bVar) {
                this.f88866a = bVar;
            }

            public final void run() {
                ImageView imageView = YoutubeVideoPreviewFragment.this.f88851b;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                View view = YoutubeVideoPreviewFragment.this.f88850a;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.video.i$b$a */
        static final class RunnableC34410a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ JSListener f88864a;

            /* renamed from: b */
            final /* synthetic */ String f88865b;

            RunnableC34410a(JSListener bVar, String str) {
                this.f88864a = bVar;
                this.f88865b = str;
            }

            public final void run() {
                Window window;
                Window window2;
                if (Intrinsics.areEqual("1", this.f88865b)) {
                    FragmentActivity activity = YoutubeVideoPreviewFragment.this.getActivity();
                    if (!(activity == null || (window2 = activity.getWindow()) == null)) {
                        window2.addFlags(SmActions.ACTION_ONTHECALL_EXIT);
                    }
                    ImageView imageView = YoutubeVideoPreviewFragment.this.f88851b;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    View view = YoutubeVideoPreviewFragment.this.f88850a;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    YoutubeVideoPreviewFragment.this.f88853d = true;
                    return;
                }
                FragmentActivity activity2 = YoutubeVideoPreviewFragment.this.getActivity();
                if (activity2 != null && (window = activity2.getWindow()) != null) {
                    window.clearFlags(SmActions.ACTION_ONTHECALL_EXIT);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public JSListener() {
        }

        @JavascriptInterface
        public final void postEvent(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "eventName");
            Intrinsics.checkParameterIsNotNull(str2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            int hashCode = str.hashCode();
            if (hashCode != -1349867671) {
                if (hashCode == 1201265730 && str.equals("onStateChange")) {
                    UICallbackExecutor.execute(new RunnableC34410a(this, str2));
                }
            } else if (str.equals("onError")) {
                UICallbackExecutor.execute(new RunnableC34411b(this));
            }
        }
    }

    @Override // com.ss.android.lark.chat.video.BackListener
    /* renamed from: a */
    public boolean mo126985a() {
        ImageView imageView = this.f88851b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (this.f88854e) {
            return false;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    /* renamed from: c */
    public final void mo127046c() {
        if (!this.f88853d) {
            ViewGroup viewGroup = this.f88859k;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            View view = this.f88850a;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    public final void mo127045b() {
        WebView webView = this.f88858j;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings, "it.settings");
            settings.setJavaScriptEnabled(true);
            WebSettings settings2 = webView.getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings2, "it.settings");
            settings2.setDomStorageEnabled(true);
            WebSettings settings3 = webView.getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings3, "it.settings");
            settings3.setMediaPlaybackRequiresUserGesture(false);
            WebSettings settings4 = webView.getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings4, "it.settings");
            settings4.setMixedContentMode(0);
            webView.addJavascriptInterface(new JSListener(), "playerListener");
            webView.setWebViewClient(new YoutubeClient());
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            Locale locale = Locale.US;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
            String format = String.format(locale, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                                  \"onReady\" : \"onReady\",                                  \"onError\" : \"onError\",                                  \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                                  \"start\" : %2$d,                                  \"rel\" : 0,                                  \"showinfo\" : 0,                                  \"modestbranding\" : 1,                                  \"iv_load_policy\" : 3,                                  \"autohide\" : 1,                                  \"fs\" : 0,                                  \"autoplay\" : 1,                                  \"cc_load_policy\" : 1,                                  \"playsinline\" : 1,                                  \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function pauseVideo() {        if(player !== undefined) {            player.pauseVideo();       }    }    function onStateChange(event) {       if(window.playerListener !== undefined) {            window.playerListener.postEvent(\"onStateChange\", event.data);       }    }    function onError(event) {       if (!posted) {            if (window.playerListener !== undefined) {                   window.playerListener.postEvent(\"onError\", event.data);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();       videoEl = player.getIframe().contentDocument.getElementsByTagName('video')[0];\n       videoEl.addEventListener(\"canplay\", function() {            if (playing) {               videoEl.play();            }       }, true);       videoEl.addEventListener(\"timeupdate\", function() {            if (!posted && videoEl.currentTime > 0) {               if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);                }               posted = true;           }       }, true);       observer = new MutationObserver(function() {\n          if (videoEl.controls) {\n               videoEl.controls = 0;\n          }       });\n    }    window.onresize = function() {        player.setSize(window.innerWidth, window.innerHeight);    }    </script></body></html>", Arrays.copyOf(new Object[]{this.f88857i, 0}, 2));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            webView.loadDataWithBaseURL("https://www.youtube.com", format, "text/html", "UTF-8", "http://www.youtube.com");
        }
        View view = this.f88850a;
        if (view != null) {
            view.setVisibility(0);
        }
        ViewGroup viewGroup = this.f88859k;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/video/YoutubeVideoPreviewFragment$YoutubeClient;", "Landroid/webkit/WebViewClient;", "(Lcom/ss/android/lark/chat/video/YoutubeVideoPreviewFragment;)V", "onReceivedError", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "", "failingUrl", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.i$c */
    public final class YoutubeClient extends WebViewClient {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public YoutubeClient() {
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            YoutubeVideoPreviewFragment.this.mo127046c();
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (Build.VERSION.SDK_INT < 23) {
                YoutubeVideoPreviewFragment.this.mo127046c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.i$d */
    static final class View$OnClickListenerC34412d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ YoutubeVideoPreviewFragment f88868a;

        View$OnClickListenerC34412d(YoutubeVideoPreviewFragment iVar) {
            this.f88868a = iVar;
        }

        public final void onClick(View view) {
            this.f88868a.mo127045b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.onAttach(context);
        if (context instanceof OnFragmentInteractListener) {
            this.f88852c = (OnFragmentInteractListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        boolean z = true;
        if (configuration.orientation != 1) {
            z = false;
        }
        this.f88854e = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.video.i$e */
    static final class View$OnClickListenerC34413e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ YoutubeVideoPreviewFragment f88869a;

        View$OnClickListenerC34413e(YoutubeVideoPreviewFragment iVar) {
            this.f88869a = iVar;
        }

        public final void onClick(View view) {
            ImageView imageView = this.f88869a.f88851b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            OnFragmentInteractListener cVar = this.f88869a.f88852c;
            if (cVar != null) {
                cVar.mo126962b();
            }
            if (this.f88869a.f88854e) {
                FragmentActivity activity = this.f88869a.getActivity();
                if (activity != null) {
                    activity.finishAfterTransition();
                    return;
                }
                return;
            }
            FragmentActivity activity2 = this.f88869a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f88855g = arguments.getString("param_i_frame_url");
            this.f88856h = (Image) arguments.getSerializable("param_cover_image");
            this.f88857i = arguments.getString("param_vid");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        OnFragmentInteractListener cVar = this.f88852c;
        if (cVar != null) {
            cVar.mo126960a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.preview_youtube_fragment, viewGroup, false);
        this.f88858j = (WebView) inflate.findViewById(R.id.play_wv);
        this.f88860l = inflate.findViewById(R.id.ctrl_close);
        this.f88850a = inflate.findViewById(R.id.loading_progress);
        this.f88851b = (ImageView) inflate.findViewById(R.id.youtube_cover);
        this.f88859k = (ViewGroup) inflate.findViewById(R.id.error_tip_container);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        inflate.setTransitionName("show_video_share_element");
        this.f88861m = inflate;
        mo127045b();
        ViewGroup viewGroup2 = this.f88859k;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new View$OnClickListenerC34412d(this));
        }
        Image image = this.f88856h;
        if (image != null) {
            ImageLoader.with(getContext()).load(new C38824b(image.getKey())).error(R.drawable.__picker_ic_broken_image_black_48dp).into(this.f88851b);
        }
        View view = this.f88860l;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC34413e(this));
        }
        return inflate;
    }
}
