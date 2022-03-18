package com.bytedance.lark.webview.container.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.CookieManager;
import android.webkit.PermissionRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.ee.larkwebview.monitor.webview.BizType;
import com.bytedance.ee.larkwebview.pool.C13457d;
import com.bytedance.ee.larkwebview.quality.performance.IPerformanceService;
import com.bytedance.ee.larkwebview.service.AbstractC13471f;
import com.bytedance.ee.larkwebview.service.AbstractC13473h;
import com.bytedance.ee.larkwebview.service.C13477l;
import com.bytedance.ee.larkwebview.service.listener.OnViewScrollListener;
import com.bytedance.lark.webview.container.impl.C19857c;
import com.bytedance.lark.webview.container.impl.menu.C19885d;
import com.bytedance.lark.webview.container.impl.p835a.C19849a;
import com.bytedance.lark.webview.container.impl.p835a.C19850b;
import com.bytedance.lark.webview.container.impl.p835a.C19853c;
import com.bytedance.lark.webview.container.impl.p837c.AbstractC19872b;
import com.bytedance.lark.webview.container.impl.p837c.C19873c;
import com.bytedance.lark.webview.container.impl.p837c.C19874d;
import com.bytedance.lynx.webview.TTWebSdk;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.component.webview.container.C25822b;
import com.larksuite.component.webview.container.dto.AbstractC25833d;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.component.webview.container.dto.AbstractInjectWebViewDelegate;
import com.larksuite.component.webview.container.dto.C25830a;
import com.larksuite.component.webview.container.dto.C25835f;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.component.webview.container.dto.IWebContainerContract;
import com.larksuite.component.webview.container.impl.C25839a;
import com.larksuite.component.webview.container.impl.C25841b;
import com.larksuite.component.webview.container.impl.C25844c;
import com.larksuite.component.webview.container.impl.C25859d;
import com.larksuite.component.webview.container.impl.C25861e;
import com.larksuite.component.webview.container.impl.TitleBarTextRedDotView;
import com.larksuite.component.webview.container.impl.WebTitleBar;
import com.larksuite.component.webview.container.impl.inject.AbstractC25867d;
import com.larksuite.component.webview.container.impl.inject.C25863b;
import com.larksuite.component.webview.container.impl.inject.C25864c;
import com.larksuite.component.webview.container.impl.jsapi.C25871b;
import com.larksuite.component.webview.container.impl.jsapi.InjectJSApiWrapper;
import com.larksuite.component.webview.container.impl.p1170a.C25840a;
import com.larksuite.component.webview.container.impl.p1171b.C25842a;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25854e;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25855f;
import com.larksuite.component.webview.container.impl.p1172c.AbstractC25856g;
import com.larksuite.component.webview.container.impl.p1172c.C25848b;
import com.larksuite.component.webview.container.impl.queryapi.C25876a;
import com.larksuite.component.webview.container.impl.queryapi.InjectQueryApiWrapper;
import com.larksuite.component.webview.container.impl.statistics.PerformanceTimingHandler;
import com.larksuite.component.webview.container.impl.statistics.WebContainerReporter;
import com.larksuite.component.webview.container.p1169a.AbstractC25820a;
import com.larksuite.component.webview.container.p1169a.C25821b;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.C26323w;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.AbstractC29528b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.openapi.jsapi.AbstractC48761c;
import com.ss.android.lark.openapi.jsapi.AbstractC48762d;
import com.ss.android.lark.openapi.permission.C48765a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.lark.webview.container.impl.c */
public class C19857c extends AbstractC29528b implements AbstractC25833d, AbstractC25856g {

    /* renamed from: Z */
    private static final Map<String, String> f48468Z = new HashMap<String, String>() {
        /* class com.bytedance.lark.webview.container.impl.C19857c.C198581 */

        {
            put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
    };
    private static final Map<String, String> aa = new HashMap<String, String>() {
        /* class com.bytedance.lark.webview.container.impl.C19857c.C198688 */

        {
            put("android.permission.RECORD_AUDIO", "android.webkit.resource.AUDIO_CAPTURE");
            put("android.permission.CAMERA", "android.webkit.resource.VIDEO_CAPTURE");
        }
    };

    /* renamed from: A */
    public C48765a f48469A;

    /* renamed from: B */
    public C25876a f48470B;

    /* renamed from: C */
    public C25859d f48471C;

    /* renamed from: D */
    public C25844c f48472D;

    /* renamed from: E */
    public long f48473E = 0;

    /* renamed from: F */
    public long f48474F = 0;

    /* renamed from: G */
    public C25835f f48475G;

    /* renamed from: H */
    public ViewStub f48476H;

    /* renamed from: I */
    public volatile boolean f48477I = false;

    /* renamed from: J */
    public Future f48478J = null;

    /* renamed from: K */
    public AbstractInjectWebViewDelegate f48479K;

    /* renamed from: M */
    private String f48480M;

    /* renamed from: N */
    private boolean f48481N = true;

    /* renamed from: O */
    private boolean f48482O = true;

    /* renamed from: P */
    private boolean f48483P = true;

    /* renamed from: Q */
    private String f48484Q;

    /* renamed from: R */
    private boolean f48485R;

    /* renamed from: S */
    private boolean f48486S;

    /* renamed from: T */
    private ConcurrentHashMap<String, Object> f48487T = new ConcurrentHashMap<>();

    /* renamed from: U */
    private C19855b f48488U;

    /* renamed from: V */
    private C19848a f48489V;

    /* renamed from: W */
    private C19853c f48490W;

    /* renamed from: X */
    private C25848b f48491X;

    /* renamed from: Y */
    private long f48492Y = 0;

    /* renamed from: a */
    public ViewGroup f48493a;
    private final View.OnClickListener ab = new View.OnClickListener() {
        /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$4qGWr5npOgQBKcHmhCUhHv9fn8 */

        public final void onClick(View view) {
            C19857c.this.m72443e(view);
        }
    };
    private View.OnClickListener ac = new View.OnClickListener() {
        /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$RUdp6sm3nGge2h_5B59Y7v69GqU */

        public final void onClick(View view) {
            C19857c.this.m72442d((C19857c) view);
        }
    };
    private final AbstractC25855f ad = new AbstractC25855f() {
        /* class com.bytedance.lark.webview.container.impl.C19857c.C198699 */

        /* renamed from: b */
        private boolean f48541b;

        @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25855f
        /* renamed from: a */
        public void mo67348a(WebView webView) {
            Log.m165389i("WebContainerFragment", "webcontainerfragment onRenderProcess Gone");
            C19857c.this.f48513u = true;
            if (C19857c.this.getActivity() != null && !C19857c.this.getActivity().isFinishing()) {
                if (webView == null || webView != C19857c.this.f48494b || webView.getParent() != C19857c.this.f48498f) {
                    Log.m165389i("WebContainerFragment", "onRenderProcessGone WebView can not be removed");
                } else if (!C19857c.this.mo67296h()) {
                    Log.m165389i("WebContainerFragment", "not has WebView Core so finish");
                    C19857c.this.finish();
                } else {
                    WebContainerReporter.m93651a().mo92045a("render_gone");
                    C19857c.this.mo67284a(true);
                    C19857c.this.mo67285b();
                }
            }
        }

        @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25855f
        /* renamed from: a */
        public void mo67350a(WebView webView, String str) {
            C19857c.this.f48513u = true;
            if (!this.f48541b) {
                this.f48541b = true;
                Log.m165389i("WebContainerFragment", "onBoostTracerPageFinish");
                C25821b.m93347a().mo91853e();
            }
            if (C19857c.this.f48497e != null) {
                C19857c.this.mo67288b(false);
                C19857c.this.f48500h.mo91957a(BitmapDescriptorFactory.HUE_RED);
            }
            C19857c.this.f48516x.mo67353a(C19857c.this.getContext(), C19857c.this.f48494b, false, true);
            C19857c.this.mo67281a(webView);
        }

        @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25855f
        /* renamed from: a */
        public void mo67351a(WebView webView, String str, Bitmap bitmap) {
            C19857c.this.f48513u = true;
            C19857c.this.mo67288b(true);
            C19857c.this.f48469A.mo170324b();
            C19857c.this.f48505m = false;
            C19857c.this.f48470B.mo92042a(str);
        }

        @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25855f
        /* renamed from: a */
        public void mo67349a(WebView webView, int i, String str, String str2) {
            C19857c.this.f48513u = true;
            if (C19857c.this.f48497e != null && C19857c.this.f48495c != null) {
                C19857c.this.f48497e.setVisibility(8);
                webView.evaluateJavascript("javascript:document.open();document.write('');document.close();", null);
                if (C19857c.this.f48496d != null) {
                    C19857c.this.f48496d.setDesc(UIHelper.mustacheFormat((int) R.string.OpenPlatform_AppErrPage_PageLoadFailedErrDesc, new HashMap<String, String>(i, str) {
                        /* class com.bytedance.lark.webview.container.impl.C19857c.C198699.C198701 */
                        final /* synthetic */ String val$description;
                        final /* synthetic */ int val$errorCode;

                        {
                            this.val$errorCode = r2;
                            this.val$description = r3;
                            put("errorCode", String.valueOf(r2));
                            put("errorDesc", r3);
                        }
                    }));
                }
                C19857c.this.f48495c.setVisibility(0);
            }
        }
    };
    private View.OnLongClickListener ae = new View.OnLongClickListener() {
        /* class com.bytedance.lark.webview.container.impl.C19857c.AnonymousClass10 */

        public boolean onLongClick(View view) {
            if (C19857c.this.f48494b == null) {
                return false;
            }
            WebView.HitTestResult hitTestResult = C19857c.this.f48494b.getHitTestResult();
            if (!C19857c.this.f48471C.mo91955a(hitTestResult)) {
                return false;
            }
            C19857c.this.f48471C.mo91954a(C19857c.this.getActivity(), hitTestResult);
            return true;
        }
    };
    private OnViewScrollListener af = new OnViewScrollListener() {
        /* class com.bytedance.lark.webview.container.impl.C19857c.AnonymousClass11 */

        @Override // com.bytedance.ee.larkwebview.service.listener.OnViewScrollListener
        /* renamed from: a */
        public void mo49932a(int i, int i2, int i3) {
            if (C19857c.this.f48494b != null && C19857c.this.f48500h != null) {
                boolean z = true;
                if (i3 == 1 || i3 == 0) {
                    if (((int) ((((float) C19857c.this.f48494b.getContentHeight()) * C19857c.this.f48494b.getScaleY()) - ((float) C19857c.this.f48494b.getHeight()))) <= UIHelper.dp2px(120.0f)) {
                        z = false;
                    }
                    if (z) {
                        C19857c.this.f48500h.mo91957a(((float) i2) / ((float) UIHelper.dp2px(120.0f)));
                    }
                }
            }
        }

        @Override // com.bytedance.ee.larkwebview.service.listener.OnViewScrollListener
        /* renamed from: a */
        public void mo49933a(int i, int i2, int i3, int i4) {
            if (C19857c.this.f48479K != null) {
                C19857c.this.f48479K.mo91872a(i, i2, i3, i4);
            }
        }
    };
    private boolean ag = false;
    private IWebContainerContract.IWebContainerView ah = new IWebContainerContract.IWebContainerView() {
        /* class com.bytedance.lark.webview.container.impl.C19857c.C198635 */

        /* renamed from: b */
        private IWebContainerContract.IWebContainerView.IWebContainerTitleBar f48532b;

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView
        /* renamed from: a */
        public IWebContainerContract.IWebContainerView.AbstractC25825b mo67305a() {
            return C19857c.this.f48471C;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView
        /* renamed from: c */
        public boolean mo67310c() {
            return C19857c.this.f48512t;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView
        /* renamed from: d */
        public ViewStub mo67311d() {
            return C19857c.this.f48476H;
        }

        /* renamed from: e */
        public LarkWebView mo67314g() {
            return C19857c.this.f48494b;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView
        /* renamed from: f */
        public ViewGroup mo67313f() {
            return C19857c.this.f48493a;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView
        /* renamed from: b */
        public IWebContainerContract.IWebContainerView.IWebContainerTitleBar mo67308b() {
            IWebContainerContract.IWebContainerView.IWebContainerTitleBar iWebContainerTitleBar = this.f48532b;
            if (iWebContainerTitleBar != null) {
                return iWebContainerTitleBar;
            }
            C198641 r0 = new IWebContainerContract.IWebContainerView.IWebContainerTitleBar() {
                /* class com.bytedance.lark.webview.container.impl.C19857c.C198635.C198641 */

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: b */
                public boolean mo67328b() {
                    return C19857c.this.f48507o;
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: c */
                public void mo67329c() {
                    C19857c.this.f48514v.clear();
                    C19857c.this.f48515w.clear();
                }

                @Override // com.ss.android.lark.ui.IActionTitlebar
                public void removeAllActions() {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48500h.removeAllActions();
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public boolean mo67322a() {
                    if (!C19857c.this.f48502j || !C19857c.this.f48500h.mo91964a()) {
                        return false;
                    }
                    return true;
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public void mo67316a(C25835f fVar) {
                    C19857c.this.f48475G = fVar;
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public void mo67317a(C25838g gVar) {
                    mo67318a(gVar, 1);
                }

                @Override // com.ss.android.lark.ui.IActionTitlebar
                public View addAction(IActionTitlebar.Action action) {
                    if (C19857c.this.f48500h == null) {
                        return null;
                    }
                    return C19857c.this.f48500h.addAction(action);
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: b */
                public void mo67324b(int i) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48500h.mo91972d(i);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: d */
                public void mo67332d(boolean z) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48506n = true;
                        C19857c.this.f48500h.mo91969b(z);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: e */
                public void mo67333e(boolean z) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48500h.mo91973d(z);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: f */
                public void mo67334f(boolean z) {
                    if (C19857c.this.f48499g != null) {
                        C19857c.this.f48499g.mo91930a(z);
                    }
                }

                @Override // com.ss.android.lark.ui.IActionTitlebar
                public void setTitle(CharSequence charSequence) {
                    if (C19857c.this.f48500h != null) {
                        if (charSequence == null) {
                            C19857c.this.mo67287b((String) null);
                        } else {
                            C19857c.this.mo67287b(charSequence.toString());
                        }
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: b */
                public void mo67325b(OnSingleClickListener onSingleClickListener) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48506n = true;
                        C19857c.this.f48500h.mo91967b(onSingleClickListener);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: c */
                public void mo67330c(int i) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48506n = true;
                        C19857c.this.f48500h.mo91970c(i);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public void mo67315a(int i) {
                    if (C19857c.this.f48500h != null) {
                        StatusBarUtil.setColorNoTranslucent(C19857c.this.getActivity(), i);
                        C19857c.this.f48507o = true;
                        C19857c.this.f48500h.mo91958a(i);
                        C19857c.this.f48500h.mo91963a(false);
                        ColorStateList colorStateList = C19857c.this.getResources().getColorStateList(R.color.white_back_text_selector);
                        C19857c.this.f48500h.mo91965b(C19857c.this.getResources().getColor(R.color.lkui_N00));
                        C19857c.this.f48500h.mo91959a(colorStateList);
                        C19857c.this.f48500h.mo91966b(colorStateList);
                        C19857c.this.f48500h.mo91970c(R.drawable.titlebar_back_white_bg_selector);
                        C19857c.this.f48499g.setTextColor(colorStateList);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: b */
                public void mo67326b(String str) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48506n = true;
                        C19857c.this.f48500h.mo91968b(str);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: c */
                public void mo67331c(boolean z) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48506n = true;
                        C19857c.this.f48500h.mo91971c(z);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public void mo67319a(OnSingleClickListener onSingleClickListener) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48506n = true;
                        C19857c.this.f48500h.mo91961a(onSingleClickListener);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: b */
                public void mo67327b(boolean z) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48500h.mo91975e(z);
                        if (z) {
                            C198635.this.mo67306a(44.0f);
                        } else {
                            C198635.this.mo67306a(BitmapDescriptorFactory.HUE_RED);
                        }
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public void mo67320a(String str) {
                    if (C19857c.this.f48500h != null) {
                        C19857c.this.f48506n = true;
                        C19857c.this.f48500h.mo91962a(str);
                    }
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public void mo67321a(boolean z) {
                    C19857c.this.f48503k = z;
                    C19857c.this.mo67293f();
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ int m72501a(C25838g gVar, C25838g gVar2) {
                    return gVar.mo91927f() - gVar2.mo91927f();
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView.IWebContainerTitleBar
                /* renamed from: a */
                public void mo67318a(C25838g gVar, int i) {
                    if (i == 0) {
                        C19857c.this.f48514v.add(0, gVar);
                        Collections.sort(C19857c.this.f48514v, $$Lambda$c$5$1$4erYOiMzB4qR3jPT15rEkMGOQCU.INSTANCE);
                        return;
                    }
                    C19857c.this.f48515w.add(gVar);
                }
            };
            this.f48532b = r0;
            return r0;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView
        /* renamed from: b */
        public void mo67309b(boolean z) {
            C19857c.this.f48512t = z;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.IWebContainerView
        /* renamed from: a */
        public void mo67307a(boolean z) {
            if (z) {
                mo67306a(BitmapDescriptorFactory.HUE_RED);
            } else {
                mo67306a(44.0f);
            }
        }

        /* renamed from: a */
        public void mo67306a(float f) {
            if (C19857c.this.f48494b != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) C19857c.this.f48494b.getLayoutParams();
                layoutParams.topMargin = UIHelper.dp2px(f);
                C19857c.this.f48494b.setLayoutParams(layoutParams);
            }
            if (C19857c.this.f48476H != null) {
                Log.m165389i("WebContainerFragment", "WebTopNotification setMarginTop");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) C19857c.this.f48476H.getLayoutParams();
                layoutParams2.topMargin = UIHelper.dp2px(f);
                C19857c.this.f48476H.setLayoutParams(layoutParams2);
            }
        }
    };

    /* renamed from: ai  reason: collision with root package name */
    private IWebContainerContract.AbstractC25826a f175434ai = new IWebContainerContract.AbstractC25826a() {
        /* class com.bytedance.lark.webview.container.impl.C19857c.C198656 */

        /* renamed from: b */
        private IWebContainerContract.AbstractC25826a.AbstractC25827a f48535b;

        /* renamed from: c */
        private String f48536c;

        /* renamed from: d */
        private boolean f48537d = true;

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a
        /* renamed from: c */
        public boolean mo67343c() {
            return this.f48537d;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a
        /* renamed from: a */
        public CallbackManager mo67337a() {
            return C19857c.this.f48517y;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a
        /* renamed from: b */
        public IWebContainerContract.AbstractC25826a.AbstractC25827a mo67342b() {
            IWebContainerContract.AbstractC25826a.AbstractC25827a aVar = this.f48535b;
            if (aVar != null) {
                return aVar;
            }
            C198661 r0 = new IWebContainerContract.AbstractC25826a.AbstractC25827a() {
                /* class com.bytedance.lark.webview.container.impl.C19857c.C198656.C198661 */

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a.AbstractC25827a
                /* renamed from: a */
                public C48765a mo67344a() {
                    return C19857c.this.f48469A;
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a.AbstractC25827a
                /* renamed from: b */
                public String mo67346b() {
                    return C19857c.this.f48469A.mo170322a();
                }

                @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a.AbstractC25827a
                /* renamed from: a */
                public boolean mo67345a(String str) {
                    return C19857c.this.f48518z.mo67358a(str);
                }
            };
            this.f48535b = r0;
            return r0;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a
        /* renamed from: a */
        public void mo67341a(boolean z) {
            this.f48537d = z;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a
        /* renamed from: a */
        public String mo67338a(Context context) {
            String str;
            if (!TextUtils.isEmpty(this.f48536c)) {
                return this.f48536c;
            }
            String str2 = "";
            if (C19857c.this.getArguments() != null) {
                str2 = C19857c.this.getArguments().getString("userAgent", str2);
            }
            if (TextUtils.isEmpty(str2)) {
                if (DesktopUtil.m144301a(C19857c.this.getContext())) {
                    str = DesktopUtil.m144296a();
                } else {
                    str = C19857c.this.mo67294g();
                }
                this.f48536c = str;
            } else {
                this.f48536c = str2;
            }
            return this.f48536c;
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a
        /* renamed from: a */
        public void mo67339a(String str, AbstractC19872b<?> bVar) {
            C19857c.this.f48518z.mo67354a(str, bVar);
        }

        @Override // com.larksuite.component.webview.container.dto.IWebContainerContract.AbstractC25826a
        /* renamed from: a */
        public void mo67340a(String str, AbstractC48761c<?> cVar) {
            Log.m165383e("WebContainerFragment", "V2 container does not execute registerJSApiV1");
        }
    };
    private C25871b aj = new C25871b();
    private AtomicBoolean ak;
    private Map<Integer, Pair<String, PermissionRequest>> al = new ConcurrentHashMap();
    private PermissionRequest am;
    private Set<String> an = new HashSet();

    /* renamed from: b */
    public LarkWebView f48494b;

    /* renamed from: c */
    public View f48495c;

    /* renamed from: d */
    public UDEmptyState f48496d;

    /* renamed from: e */
    ProgressBar f48497e;

    /* renamed from: f */
    FrameLayout f48498f;

    /* renamed from: g */
    public TitleBarTextRedDotView f48499g;

    /* renamed from: h */
    public C25861e f48500h;

    /* renamed from: i */
    public String f48501i;

    /* renamed from: j */
    public boolean f48502j = true;

    /* renamed from: k */
    public boolean f48503k = true;

    /* renamed from: l */
    public boolean f48504l = true;

    /* renamed from: m */
    public boolean f48505m;

    /* renamed from: n */
    public boolean f48506n;

    /* renamed from: o */
    public boolean f48507o;

    /* renamed from: p */
    public boolean f48508p;

    /* renamed from: q */
    public boolean f48509q = true;

    /* renamed from: r */
    public boolean f48510r = true;

    /* renamed from: s */
    public boolean f48511s = true;

    /* renamed from: t */
    public boolean f48512t = true;

    /* renamed from: u */
    public boolean f48513u;

    /* renamed from: v */
    public List<C25838g> f48514v = new ArrayList();

    /* renamed from: w */
    public List<C25838g> f48515w = new ArrayList();

    /* renamed from: x */
    public C19873c f48516x = new C19873c();

    /* renamed from: y */
    public CallbackManager f48517y;

    /* renamed from: z */
    public C19874d f48518z;

    @Override // com.larksuite.component.webview.container.dto.AbstractC25833d
    /* renamed from: i */
    public Fragment mo67297i() {
        return this;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragment
    public CallbackManager getCallbackManager() {
        return this.f48517y;
    }

    /* renamed from: a */
    public void mo67284a(boolean z) {
        m72427C();
        if (this.f48479K != null) {
            Log.m165389i("WebContainerFragment", "call onDestroyWebView");
            this.f48479K.mo91876e(this, this.f48494b);
        }
        if (this.f48494b != null) {
            Log.m165389i("WebContainerFragment", "mWebView != null");
            LarkWebView larkWebView = this.f48494b;
            larkWebView.evaluateJavascript("javascript:" + C25839a.f63929b, null);
            this.f48498f.removeView(this.f48494b);
            m72446o();
            this.f48494b.stopLoading();
            this.f48494b.setWebChromeClient(null);
            this.f48494b.setWebViewClient(null);
            this.f48494b.destroy();
            this.f48494b = null;
        }
        if (this.f48495c != null) {
            Log.m165389i("WebContainerFragment", "mErrorView remove");
            this.f48498f.removeView(this.f48495c);
            this.f48495c = null;
        }
        C19853c cVar = this.f48490W;
        if (cVar != null && cVar.mo67260c() != null) {
            Log.m165389i("WebContainerFragment", "uploadHandler cancel");
            this.f48490W.mo67260c().mo91941a();
        }
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25856g
    /* renamed from: a */
    public void mo67283a(String str) {
        LarkWebView larkWebView;
        String str2 = !TextUtils.isEmpty(this.f48480M) ? this.f48480M : str;
        if (!this.f48505m || ((larkWebView = this.f48494b) != null && !TextUtils.equals(str2, larkWebView.getUrl()))) {
            this.f48505m = true;
            mo67287b(str2);
            this.f48484Q = str2;
            AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
            if (abstractInjectWebViewDelegate != null) {
                abstractInjectWebViewDelegate.mo51004d(this.f48494b, str);
            }
        }
    }

    /* renamed from: a */
    public void mo67282a(C25863b bVar) {
        if (bVar.mo92007d() == null) {
            Log.m165389i("WebContainerFragment", "register empty viewDelegate");
            mo67285b();
            return;
        }
        this.f48479K = bVar.mo92007d();
        ((AbstractC25867d) C25864c.m93607a()).mo92011a(this.f48479K, getActivity(), this, this.f48487T, this.ah, this.f175434ai);
        Log.m165389i("WebContainerFragment", "registerWebViewDelegate success");
        AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
        if (abstractInjectWebViewDelegate == null || !abstractInjectWebViewDelegate.mo51013k()) {
            mo67285b();
        } else {
            this.f48479K.mo91874a(new Runnable() {
                /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$Ds6LRNvUON58W44kbNNqCEnBtE */

                public final void run() {
                    C19857c.this.m72433I();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo67281a(WebView webView) {
        LarkWebView larkWebView = this.f48494b;
        if (larkWebView == null) {
            Log.m165389i("WebContainerFragment", "mWebView is null");
            return;
        }
        C13477l serviceManager = larkWebView.getServiceManager();
        if (serviceManager == null) {
            Log.m165389i("WebContainerFragment", "mWebView.getServiceManager is null !!");
            return;
        }
        AbstractC13471f fVar = (AbstractC13471f) serviceManager.mo49931b(AbstractC13471f.class);
        if (fVar == null || !C25821b.m93347a().mo91848a("lark.browser.performance.timing")) {
            webView.evaluateJavascript("javascript:window._container_performance_timing.report(JSON.stringify(performance.timing.toJSON()))", null);
        } else {
            CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
                /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$eLTg3pp9ztJPGQWSuPcA_jp62I */

                public final void run() {
                    C19857c.m72436a(AbstractC13471f.this);
                }
            });
        }
    }

    /* renamed from: z */
    private void m72457z() {
        m72426B();
        m72428D();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: I */
    private /* synthetic */ void m72433I() {
        if (isActive()) {
            mo67285b();
        }
    }

    /* renamed from: t */
    private void m72451t() {
        this.f48500h.addAction(new IActionTitlebar.C57575b(this.f48499g) {
            /* class com.bytedance.lark.webview.container.impl.C19857c.AnonymousClass13 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: c */
            private /* synthetic */ void m72488c(C25838g gVar) {
                if (C19857c.this.isActive() && gVar.mo91924d() != null) {
                    gVar.mo91924d().onSingleClick(null);
                }
            }

            /* renamed from: a */
            private C19885d.C19889b m72486a(final C25838g gVar) {
                if (gVar == null) {
                    return null;
                }
                C19885d.C19889b bVar = new C19885d.C19889b(R.id.login_menu_change, gVar.mo50899b(), new C19885d.AbstractC19890c() {
                    /* class com.bytedance.lark.webview.container.impl.C19857c.AnonymousClass13.C198591 */

                    @Override // com.bytedance.lark.webview.container.impl.menu.C19885d.AbstractC19890c
                    public void onMenuItemClick() {
                        if (C19857c.this.isActive() && gVar.mo91924d() != null) {
                            gVar.mo91924d().onSingleClick(null);
                        }
                    }
                });
                bVar.mo67395b(gVar.mo50898a());
                bVar.mo67392a(12);
                bVar.mo67396b(gVar.mo91926e());
                return bVar;
            }

            /* renamed from: b */
            private C19885d.C19889b m72487b(C25838g gVar) {
                if (gVar == null) {
                    return null;
                }
                C19885d.C19889b bVar = new C19885d.C19889b(R.id.login_menu_change, gVar.mo50899b(), new C19885d.AbstractC19890c(gVar) {
                    /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$13$1uBKwGF3yEUXGrPH7qVlohISOjE */
                    public final /* synthetic */ C25838g f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.lark.webview.container.impl.menu.C19885d.AbstractC19890c
                    public final void onMenuItemClick() {
                        C19857c.AnonymousClass13.this.m72488c(this.f$1);
                    }
                });
                bVar.mo67395b(gVar.mo50898a());
                bVar.mo67392a(12);
                bVar.mo67396b(gVar.mo91926e());
                bVar.mo67393a(gVar.mo91923c());
                return bVar;
            }

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                if (C19857c.this.f48494b != null) {
                    if (C19857c.this.f48479K == null || !C19857c.this.f48479K.mo91875a(view)) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (C25838g gVar : C19857c.this.f48514v) {
                            arrayList.add(m72487b(gVar));
                        }
                        if (C19857c.this.f48509q) {
                            C19857c cVar = C19857c.this;
                            arrayList.add(C19850b.m72407a(cVar, cVar.f48494b.getUrl()));
                        }
                        if (C19857c.this.f48510r) {
                            arrayList.add(C19850b.m72406a(C19857c.this));
                        }
                        if (C19857c.this.f48511s) {
                            C19857c cVar2 = C19857c.this;
                            arrayList.add(C19850b.m72409b(cVar2, cVar2.f48494b.getUrl()));
                        }
                        for (C25838g gVar2 : C19857c.this.f48515w) {
                            arrayList2.add(m72486a(gVar2));
                        }
                        WebContainerLogHelper.f48550a.mo67360a(C19857c.this.f48475G);
                        C19857c cVar3 = C19857c.this;
                        C19850b.m72408a(cVar3, arrayList, arrayList2, cVar3.f48475G);
                        return;
                    }
                    Log.m165379d("WebContainerFragment", "moreButton click is handled by delegate");
                }
            }
        });
    }

    /* renamed from: x */
    private void m72455x() {
        if (isActive()) {
            KeyboardUtils.hideKeyboard(getActivity());
        }
    }

    /* renamed from: y */
    private boolean m72456y() {
        AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
        if (abstractInjectWebViewDelegate != null) {
            return abstractInjectWebViewDelegate.mo50992a(this, this.f48494b);
        }
        return false;
    }

    /* renamed from: H */
    private void m72432H() {
        this.f48495c.setVisibility(8);
        m72453v();
        C25848b bVar = this.f48491X;
        if (bVar != null) {
            bVar.mo91949b();
        }
        this.f48494b.reload();
    }

    /* renamed from: v */
    private void m72453v() {
        LarkWebView larkWebView;
        if (isActive() && (larkWebView = this.f48494b) != null) {
            larkWebView.getSettings().setUserAgentString(this.f175434ai.mo67338a(this.mContext));
        }
    }

    /* renamed from: w */
    private boolean m72454w() {
        LarkWebView larkWebView;
        if (!isActive() || (larkWebView = this.f48494b) == null) {
            return false;
        }
        return larkWebView.canGoBack();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: c */
    public void mo67289c() {
        LarkWebView larkWebView;
        super.mo67289c();
        if (mo67296h() && (larkWebView = this.f48494b) != null) {
            larkWebView.resumeTimers();
        }
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mo67296h()) {
            AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
            if (abstractInjectWebViewDelegate != null) {
                abstractInjectWebViewDelegate.mo51005d(this, this.f48494b);
            }
            LarkWebView larkWebView = this.f48494b;
            if (larkWebView != null) {
                larkWebView.onPause();
            }
        }
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (mo67296h()) {
            AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
            if (abstractInjectWebViewDelegate != null) {
                abstractInjectWebViewDelegate.mo51000c(this, this.f48494b);
            }
            LarkWebView larkWebView = this.f48494b;
            if (larkWebView != null) {
                larkWebView.onResume();
            }
        }
    }

    /* renamed from: A */
    private void m72425A() {
        C48211b.m190251a().mo168689b("initWithContainerV2");
        Future a = ((AbstractC25867d) C25864c.m93607a()).mo92010a(getArguments(), new UIGetDataCallback(new IGetDataCallback<C25863b>() {
            /* class com.bytedance.lark.webview.container.impl.C19857c.C198624 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C48211b.m190251a().mo168691c("initWithContainerV2");
                Log.m165383e("WebContainerFragment", "binding data error will finish");
                WebContainerReporter.m93651a().mo92045a("init_failed");
                C19857c.this.finish();
                ((AbstractC25867d) C25864c.m93607a()).mo92014b(C19857c.this.getArguments());
                C48211b.m190251a().mo168692d();
            }

            /* renamed from: a */
            public void onSuccess(C25863b bVar) {
                C48211b.m190251a().mo168691c("initWithContainerV2");
                if ((C19857c.this.f48478J == null || C19857c.this.f48478J.isCancelled()) && C19857c.this.getActivity() != null && !C19857c.this.getActivity().isFinishing()) {
                    Log.m165389i("WebContainerFragment", "binding data success, but be canceled will finish");
                    WebContainerReporter.m93651a().mo92045a("init_canceled");
                    C19857c.this.finish();
                    ((AbstractC25867d) C25864c.m93607a()).mo92014b(C19857c.this.getArguments());
                    C48211b.m190251a().mo168692d();
                    return;
                }
                Log.m165389i("WebContainerFragment", "binding data success");
                C19857c.this.mo67282a(bVar);
            }
        }));
        this.f48478J = a;
        if (a == null) {
            C48211b.m190251a().mo168691c("initWithContainerV2");
            Log.m165383e("WebContainerFragment", "cannot get session to bind");
            finish();
            C48211b.m190251a().mo168692d();
        }
    }

    /* renamed from: E */
    private HashMap<String, String> m72429E() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            hashMap.put("host", Uri.parse(this.f48501i).getHost());
        } catch (Exception e) {
            Log.m165384e("WebContainerFragment", "parse url error", e);
        }
        hashMap.put("appId", m72438b(getArguments()));
        return hashMap;
    }

    /* renamed from: G */
    private void m72431G() {
        UDEmptyState uDEmptyState = (UDEmptyState) this.f48495c.findViewById(R.id.web_error_state);
        this.f48496d = uDEmptyState;
        if (uDEmptyState != null) {
            uDEmptyState.setPrimaryClickListener(new View.OnClickListener() {
                /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$16E0XHMj0SH5RAOTddaVlj7t2E */

                public final void onClick(View view) {
                    C19857c.this.m72441c((C19857c) view);
                }
            });
        } else {
            this.f48495c.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$1bg0YneDSi2QBb9dzdDBz_Dm0tY */

                public final void onClick(View view) {
                    C19857c.this.m72440b((C19857c) view);
                }
            });
        }
    }

    /* renamed from: m */
    private boolean m72444m() {
        if (getArguments() != null) {
            return true;
        }
        if (getContext() == null) {
            return false;
        }
        LKUIToast.show(getContext(), UIUtils.getString(getContext(), R.string.Lark_Legacy_WebUrlLoadTip));
        return false;
    }

    /* renamed from: o */
    private void m72446o() {
        LarkWebView larkWebView = this.f48494b;
        if (larkWebView != null && larkWebView.getSettings() != null) {
            WebSettings settings = this.f48494b.getSettings();
            if (settings.getCacheMode() != -1) {
                settings.setCacheMode(-1);
                Log.m165389i("WebContainerFragment", "reset cacheMode success");
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: d */
    public void mo67291d() {
        LarkWebView larkWebView;
        super.mo67291d();
        if (mo67296h() && (larkWebView = this.f48494b) != null) {
            larkWebView.pauseTimers();
        }
    }

    @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25856g
    /* renamed from: f */
    public void mo67293f() {
        if (isActive() && !this.f48506n) {
            if (m72454w()) {
                this.f48500h.mo91971c(true);
                this.f48500h.mo91969b(true);
                return;
            }
            this.f48500h.mo91969b(false);
            if (this.f48503k) {
                this.f48500h.mo91971c(true);
            } else {
                this.f48500h.mo91971c(false);
            }
        }
    }

    /* renamed from: h */
    public boolean mo67296h() {
        AtomicBoolean atomicBoolean = this.ak;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            CookieManager.getInstance();
            this.ak = new AtomicBoolean(true);
        } catch (Exception e) {
            Log.m165385e("WebContainerFragment", "hasWebViewCore check failed", e, true);
            this.ak = new AtomicBoolean(false);
        }
        return this.ak.get();
    }

    /* renamed from: j */
    public void mo67298j() {
        AbstractC25820a a = C25821b.m93347a();
        long j = 3000;
        if (a != null) {
            j = a.mo91843a(3000);
        }
        Log.m165389i("WebContainerFragment", "defaultLoadUrlTimeOutValue---" + j);
        LarkWebView larkWebView = this.f48494b;
        if (larkWebView != null) {
            larkWebView.postDelayed(new Runnable() {
                /* class com.bytedance.lark.webview.container.impl.C19857c.RunnableC198677 */

                public void run() {
                    if (C19857c.this.f48513u) {
                        Log.m165389i("WebContainerFragment", "loadurl success so do nothing");
                    } else if (C19857c.this.f48494b == null) {
                        Log.m165389i("WebContainerFragment", "mWebView is null");
                    } else if (C25841b.m93494a(C19857c.this.f48501i) || C25841b.m93494a(C19857c.this.f48494b.getUrl())) {
                        Log.m165389i("WebContainerFragment", "download apk url so not show retry dialog");
                    } else {
                        C19857c.this.mo67299k();
                    }
                }
            }, j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Log.m165389i("WebContainerFragment", "onDestroy");
        AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
        if (abstractInjectWebViewDelegate != null) {
            abstractInjectWebViewDelegate.mo50979a(this);
        }
        if (!this.ag) {
            ((AbstractC25867d) C25864c.m93607a()).mo92014b(getArguments());
        }
        Future future = this.f48478J;
        if (future != null && !future.isDone()) {
            this.f48478J.cancel(false);
        }
        this.ae = null;
        this.af = null;
        this.ac = null;
    }

    /* renamed from: B */
    private void m72426B() {
        C25863b a = ((AbstractC25867d) C25864c.m93607a()).mo92008a(getArguments());
        if (a == null || CollectionUtils.isEmpty(a.mo92005b())) {
            Log.m165389i("WebContainerFragment", "registerInjectJSApi failed");
            return;
        }
        Iterator<InjectJSApiWrapper> it = a.mo92005b().iterator();
        while (it.hasNext()) {
            InjectJSApiWrapper next = it.next();
            String str = next.f63993a;
            AbstractInjectJSApiHandler abstractInjectJSApiHandler = next.f63994b;
            this.aj.mo92027a(abstractInjectJSApiHandler, getActivity(), this, this.f48487T, this.ah, this.f175434ai);
            this.f48518z.mo67354a(str, this.aj.mo92028b(abstractInjectJSApiHandler));
        }
        Log.m165389i("WebContainerFragment", "registerInjectJSApi success");
    }

    /* renamed from: C */
    private void m72427C() {
        C25863b a = ((AbstractC25867d) C25864c.m93607a()).mo92008a(getArguments());
        if (a != null && !CollectionUtils.isEmpty(a.mo92005b())) {
            Iterator<InjectJSApiWrapper> it = a.mo92005b().iterator();
            while (it.hasNext()) {
                try {
                    this.aj.mo92026a(it.next().f63994b);
                } catch (Exception e) {
                    if (getActivity() == null || !C26284k.m95185a(getActivity())) {
                        Log.m165385e("WebContainerFragment", "onWebViewDestroy error", e, true);
                    } else {
                        throw new RuntimeException(e);
                    }
                }
            }
            Log.m165389i("WebContainerFragment", "destroyInjectJSApi success");
        }
    }

    /* renamed from: D */
    private void m72428D() {
        C25863b a = ((AbstractC25867d) C25864c.m93607a()).mo92008a(getArguments());
        if (a == null || a.mo92006c() == null) {
            Log.m165389i("WebContainerFragment", "registerQueryApi failed");
            return;
        }
        Iterator<InjectQueryApiWrapper> it = a.mo92006c().iterator();
        while (it.hasNext()) {
            InjectQueryApiWrapper next = it.next();
            ((AbstractC25867d) C25864c.m93607a()).mo92011a(next.f64004b, getActivity(), this, this.f48487T, this.ah, this.f175434ai);
            this.f48470B.mo92043a(next.f64003a, next.f64004b);
        }
        Log.m165389i("WebContainerFragment", "registerQueryApi success");
    }

    /* renamed from: F */
    private void m72430F() {
        if (getContext() == null || getActivity() == null) {
            Log.m165389i("WebContainerFragment", "getContext or getActivity is null");
            return;
        }
        boolean z = false;
        Class cls = WebContainerActivity.class;
        if (getActivity() instanceof WebContainerMainProcessActivity) {
            cls = WebContainerMainProcessActivity.class;
            Log.m165389i("WebContainerFragment", "is WebContainerMainProcessActivity");
            z = true;
        }
        finish();
        Intent intent = new Intent(LarkContext.getApplication().getApplicationContext(), cls);
        intent.setFlags(268435456);
        C25830a aVar = new C25830a(!z);
        aVar.mo91890a(C25821b.m93347a().mo91855g());
        Bundle arguments = getArguments();
        C25822b.m93352b().mo91901a(arguments, aVar);
        intent.putExtras(arguments);
        startActivity(intent);
        Log.m165389i("WebContainerFragment", "reStart containerActivity");
    }

    /* renamed from: q */
    private void m72448q() {
        Context context = getContext();
        if (context == null) {
            Log.m165383e("WebContainerFragment", "context == null");
        } else if (!TTWebSdk.isTTWebView()) {
            Log.m165383e("WebContainerFragment", "is system core not support darkMode");
        } else if (!TTWebSdk.isDarkModeSupported() || !TTWebSdk.isDarkStrategySupported()) {
            Log.m165383e("WebContainerFragment", "ttwebview not support darkMode");
        } else if (this.f48494b == null) {
            Log.m165383e("WebContainerFragment", "mWebView is null");
        } else {
            boolean a = UDUiModeUtils.m93319a(context);
            Log.m165389i("WebContainerFragment", "isDarkMode ==" + a);
            int i = 0;
            if (a) {
                i = 2;
            }
            TTWebSdk.setForceDark(this.f48494b.getSettings(), i);
            TTWebSdk.setForceDarkStrategy(this.f48494b.getSettings(), 1);
        }
    }

    /* renamed from: r */
    private LarkWebView m72449r() {
        StringBuilder sb = new StringBuilder();
        sb.append("buildLarkWebView:canNotUseFixedAbility--");
        sb.append(!TTWebSdk.isTTWebView());
        Log.m165389i("WebContainerFragment", sb.toString());
        if (!TTWebSdk.isTTWebView()) {
            return new LarkWebView(getActivity(), BizType.f35444h.mo49861b());
        }
        if (this.f48486S) {
            return new LarkWebView(getActivity(), BizType.f35444h.mo49861b());
        }
        return C13457d.m54696a(getContext()).mo49897a(getActivity());
    }

    /* renamed from: b */
    public void mo67285b() {
        AbstractC48762d dVar;
        if (!isActive()) {
            Log.m165389i("WebContainerFragment", "not isActive so return");
            return;
        }
        if (this.f48518z == null) {
            Log.m165389i("WebContainerFragment", "mOpenApiManager = null");
            AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
            if (abstractInjectWebViewDelegate == null || (dVar = abstractInjectWebViewDelegate.mo51015m()) == null) {
                dVar = new C25840a();
            }
            this.f48518z = new C19874d(dVar);
        }
        m72447p();
        m72445n();
    }

    /* renamed from: e */
    public void mo67292e() {
        if (isActive() && this.f48494b != null) {
            this.f48495c.setVisibility(8);
            m72453v();
            C25848b bVar = this.f48491X;
            if (bVar != null) {
                bVar.mo91949b();
            }
            this.f48494b.reload();
        }
    }

    /* renamed from: g */
    public String mo67294g() {
        String a = C57824f.m224460a(this.f48494b.getContext(), this.f48494b.getSettings().getUserAgentString(), Locale.forLanguageTag(C25821b.m93347a().mo91852d()));
        String str = "Feishu";
        if (PackageChannelManager.getDeployMode(getContext()) == 1 && C25821b.m93347a().mo91854f()) {
            str = "Lark";
        }
        return a + " " + "ChannelName/" + str;
    }

    /* renamed from: n */
    private void m72445n() {
        if (this.f48486S) {
            this.f48486S = false;
            if (C19849a.m72399a().mo67251a(this.f48494b)) {
                Log.m165389i("WebContainerFragment", "newWindowBind return");
                return;
            }
        }
        if (TextUtils.isEmpty(this.f48501i)) {
            Log.m165389i("WebContainerFragment", "mExtraUrl = null");
            return;
        }
        if (C25841b.m93494a(this.f48501i)) {
            if (!this.f48485R) {
                C26323w.m95324a(this.f73822L.getContext(), this.f48501i);
            }
            this.f48485R = true;
        }
        C48211b.m190251a().mo168689b("loadData");
        final HashMap hashMap = new HashMap();
        hashMap.put("Accept-Language", C25821b.m93347a().mo91852d());
        this.f48470B.mo92042a(this.f48501i);
        this.f48492Y = System.currentTimeMillis();
        C25821b.m93347a().mo91845a(this.f48501i, getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>() {
            /* class com.bytedance.lark.webview.container.impl.C19857c.AnonymousClass12 */

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m72484a(Map map) {
                C19857c.this.f48494b.loadUrl(C19857c.this.f48501i, map);
                C19857c.this.mo67298j();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                if (("on async sec link check error " + errorResult) != null) {
                    str = errorResult.getMessage();
                } else {
                    str = "";
                }
                Log.m165389i("WebContainerFragment", str);
                if (C19857c.this.getActivity() != null) {
                    C19857c.this.getActivity().runOnUiThread(new Runnable(hashMap) {
                        /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$12$kTkLnpfyhO0nc72WnWbQAaCEzLA */
                        public final /* synthetic */ Map f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C19857c.AnonymousClass12.this.m72484a((C19857c.AnonymousClass12) this.f$1);
                        }
                    });
                } else {
                    Log.m165389i("WebContainerFragment", "onError and getActivity is null");
                }
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("WebContainerFragment", "on async sec link check return, result is " + bool);
                if (C19857c.this.getActivity() != null) {
                    C19857c.this.getActivity().runOnUiThread(new Runnable(bool, hashMap) {
                        /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$12$zPTJq2y_AChptsnOnAC91DnsKNQ */
                        public final /* synthetic */ Boolean f$1;
                        public final /* synthetic */ Map f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C19857c.AnonymousClass12.this.m72483a(this.f$1, this.f$2);
                        }
                    });
                } else {
                    Log.m165389i("WebContainerFragment", "onSuccess but getActivity is null ");
                }
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m72483a(Boolean bool, Map map) {
                if (bool.booleanValue()) {
                    C19857c.this.f48494b.loadUrl(C19857c.this.f48501i, map);
                } else {
                    C19857c.this.f48494b.loadUrl(C19857c.this.f48472D.mo91938a(C19857c.this.f48501i), map);
                }
                C19857c.this.mo67298j();
            }
        }));
        C48211b.m190251a().mo168691c("loadData");
        C48211b.m190251a().mo168692d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        if (r0 == null) goto L_0x0044;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m72447p() {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lark.webview.container.impl.C19857c.m72447p():void");
    }

    /* renamed from: s */
    private void m72450s() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f73822L.findViewById(R.id.webview_titlebar_action);
        WebTitleBar webTitleBar = (WebTitleBar) this.f73822L.findViewById(R.id.webview_titlebar_nonaction);
        if (this.f48481N) {
            this.f48500h = new C25861e(commonTitleBar);
        } else {
            this.f48500h = new C25861e(webTitleBar);
        }
        this.f48500h.mo91970c(R.drawable.titlebar_back_black_bg_selector);
        this.f48500h.mo91962a(UIHelper.getString(R.string.Lark_Legacy_LarkBack));
        this.f48500h.mo91968b(UIHelper.getString(R.string.Lark_Legacy_LarkClose));
        this.f48500h.mo91969b(false);
        this.f48500h.mo91961a(this.ab);
        this.f48500h.mo91967b(this.ac);
        if (this.f48481N) {
            if (this.f48483P) {
                this.f48500h.removeAllActions();
                this.f48499g = (TitleBarTextRedDotView) LayoutInflater.from(this.mContext).inflate(R.layout.browser_web_title_right_view, (ViewGroup) null, false);
                m72451t();
                this.f48499g.setPadding(0, 0, 0, 0);
            }
            this.ah.mo67308b().mo67321a(this.f48503k);
        } else {
            ColorStateList colorStateList = getResources().getColorStateList(R.color.white_back_text_selector);
            this.f48500h.mo91965b(getResources().getColor(R.color.lkui_N00));
            this.f48500h.mo91959a(colorStateList);
            this.f48500h.mo91966b(colorStateList);
            this.f48500h.mo91960a(getResources().getDrawable(R.color.lkui_transparent, null));
            this.f48500h.mo91970c(R.drawable.titlebar_back_white_bg_selector);
            this.f48500h.mo91963a(false);
        }
        if (!TextUtils.isEmpty(this.f48480M)) {
            mo67287b(this.f48480M);
        }
    }

    /* renamed from: k */
    public void mo67299k() {
        Context context = getContext();
        if (context == null) {
            Log.m165383e("WebContainerFragment", "tryShowNoResponseDialog context is null");
            return;
        }
        LarkWebView larkWebView = this.f48494b;
        if (larkWebView == null) {
            Log.m165389i("WebContainerFragment", "tryShowNoResponseDialog mWebView is null");
            return;
        }
        mo67281a((WebView) larkWebView);
        Log.m165389i("WebContainerFragment", "tryShowNoResponseDialog");
        WebContainerReporter.m93651a().mo92046a("no_page_start_response", m72429E());
        new C25639g(context).mo89246d(false).mo89247e(false).mo89238b(true).mo89250i(R.color.ud_N900).mo89249h(17).mo89223a(-1, 24, -1, -1).mo89237b(context.getString(R.string.Lark_ErrorMsg_NoResponsePageReload)).mo89255n(16).mo89256o(R.color.ud_N900).mo89225a(R.id.lkui_dialog_btn_left, context.getString(R.string.Lark_Legacy_PhoneAlertDialogCancel), $$Lambda$c$rN_Zqx2ZS1QM5u7fZxw9jra3Vk8.INSTANCE).mo89225a(R.id.lkui_dialog_btn_right, context.getString(R.string.Lark_Legacy_PhoneAlertDialogConfirm), new DialogInterface.OnClickListener() {
            /* class com.bytedance.lark.webview.container.impl.$$Lambda$c$kQ_fivTvWmLdbmVyOiFkMdtLCcE */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C19857c.this.m72434a((C19857c) dialogInterface, (DialogInterface) i);
            }
        }).mo89233b().show();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.base.fragment.AbstractC29528b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Log.m165389i("WebContainerFragment", "onDestroyView");
        if (mo67296h()) {
            if (!(this.f48494b == null || !TTWebSdk.isTTWebView() || this.f48494b.getServiceManager().mo49931b(AbstractC13471f.class) == null)) {
                if (this.f48492Y > 0 && this.f48474F == 0) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("interval", (System.currentTimeMillis() - this.f48492Y) + "");
                    WebContainerReporter.m93651a().mo92046a("white_screen", hashMap);
                    Log.m165383e("WebContainerFragment", "onDestroyView occur white screen");
                }
                if (this.f48492Y > 0 && this.f48474F == 0 && this.f48473E == 0) {
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put("interval", (System.currentTimeMillis() - this.f48492Y) + "");
                    WebContainerReporter.m93651a().mo92046a("no_response", hashMap2);
                    Log.m165383e("WebContainerFragment", "onDestroyView occur no net response");
                }
            }
            LarkWebView larkWebView = this.f48494b;
            if (larkWebView != null) {
                larkWebView.setOnLongClickListener(null);
            }
            mo67284a(false);
            CallbackManager callbackManager = this.f48517y;
            if (callbackManager != null) {
                callbackManager.cancelCallbacks();
            }
            C19874d dVar = this.f48518z;
            if (dVar != null) {
                dVar.mo67355a();
            }
            super.onDestroyView();
        }
    }

    /* renamed from: u */
    private void m72452u() {
        AnonymousClass14 r6 = new AbstractC25854e() {
            /* class com.bytedance.lark.webview.container.impl.C19857c.AnonymousClass14 */

            @Override // com.larksuite.component.webview.container.impl.p1172c.AbstractC25854e
            /* renamed from: a */
            public void mo67302a(int i) {
                if (C19857c.this.f48497e != null && C19857c.this.f48504l) {
                    C19857c.this.f48497e.setProgress(i);
                }
                if (i >= 30 && !C19857c.this.f48508p && C19857c.this.f48494b != null) {
                    LarkWebView larkWebView = C19857c.this.f48494b;
                    larkWebView.evaluateJavascript("javascript:" + C25839a.f63928a, null);
                    boolean z = true;
                    C19857c.this.f48508p = true;
                    C19873c cVar = C19857c.this.f48516x;
                    Context context = C19857c.this.getContext();
                    LarkWebView larkWebView2 = C19857c.this.f48494b;
                    if (i >= 30) {
                        z = false;
                    }
                    cVar.mo67353a(context, larkWebView2, z, false);
                }
                if (i > 90) {
                    C19857c.this.f48508p = false;
                }
                if (C19857c.this.f48479K != null) {
                    C19857c.this.f48479K.mo50975a(C19857c.this.f48494b, i);
                }
            }
        };
        this.f48491X = new C25848b(this);
        this.f48489V = new C19848a(this.f48490W, this.f48479K, this.ah, this, r6, this.f48491X) {
            /* class com.bytedance.lark.webview.container.impl.C19857c.AnonymousClass15 */

            public void onPermissionRequest(PermissionRequest permissionRequest) {
                Log.m165389i("WebContainerFragment", "capture permission = " + Arrays.toString(permissionRequest.getResources()));
                if (C19857c.this.f48477I) {
                    Log.m165389i("WebContainerFragment", "permission optimize fg on ,run optimize");
                    C19857c.this.mo67280a(permissionRequest);
                    return;
                }
                Log.m165389i("WebContainerFragment", "permission optimize fg not on , run default");
                C19857c.this.mo67286b(permissionRequest);
            }
        };
        C19855b a = mo67277a(this);
        this.f48488U = a;
        a.mo67263a(this.ad);
        ((AbstractC13473h) this.f48494b.getServiceManager().mo49931b(AbstractC13473h.class)).mo49915a(this.af);
        if (getContext() != null) {
            this.f48494b.setBackgroundColor(getContext().getResources().getColor(R.color.lkui_N00));
            if (Build.VERSION.SDK_INT >= 29) {
                this.f48494b.setVerticalScrollbarThumbDrawable(getResources().getDrawable(R.drawable.web_scroll_bar_drawable_shape));
            }
        }
        this.f48494b.setWebViewClient(this.f48488U);
        this.f48494b.setWebChromeClient(this.f48489V);
        if (getActivity() != null) {
            LarkWebView larkWebView = this.f48494b;
            larkWebView.setDownloadListener(new C25842a(this.f48501i, larkWebView, getActivity()));
        }
        this.f48494b.getSettings().setMixedContentMode(2);
        this.f48494b.getSettings().setMediaPlaybackRequiresUserGesture(true);
        this.f48494b.setOnLongClickListener(this.ae);
        this.f48494b.setLayerType(2, null);
        if (this.f48494b.getServiceManager().mo49931b(AbstractC13471f.class) == null || !C25821b.m93347a().mo91848a("lark.browser.performance.timing")) {
            this.f48494b.addJavascriptInterface(new PerformanceTimingHandler(), "_container_performance_timing");
        } else {
            PerformanceTimingHandler.enableTTPerformanceTiming(this.f48494b);
        }
        if (this.f48494b.getServiceManager().mo49931b(AbstractC13471f.class) != null) {
            ((AbstractC13471f) this.f48494b.getServiceManager().mo49931b(AbstractC13471f.class)).mo49910a().enableFeature("ttmp", C25821b.m93347a().mo91848a("lark.browser.webview.ttmp"));
        }
        if (this.f48494b.getServiceManager().mo49931b(AbstractC13471f.class) != null) {
            ((AbstractC13471f) this.f48494b.getServiceManager().mo49931b(AbstractC13471f.class)).mo49910a().setMemoryEventListener((IWebViewExtension.MemoryEventListener) new IWebViewExtension.MemoryEventListener() {
                /* class com.bytedance.lark.webview.container.impl.C19857c.C198602 */
            });
            if (this.f48494b.getServiceManager().mo49931b(AbstractC13471f.class) != null) {
                ((IPerformanceService) this.f48494b.getServiceManager().mo49931b(IPerformanceService.class)).mo49816a(new IWebViewExtension.PerformanceTimingListener() {
                    /* class com.bytedance.lark.webview.container.impl.C19857c.C198613 */

                    @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                    public /* synthetic */ void onGetJavaScriptStackTrace(String str) {
                        IPerformanceTimingListenersdk113.CC.$default$onGetJavaScriptStackTrace(this, str);
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                    public void onBodyParsing() {
                        Log.m165389i("WebContainerFragment", "onBodyParsing");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                    public void onDOMContentLoaded() {
                        Log.m165389i("WebContainerFragment", "onDOMContentLoaded");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                    public void onFirstImagePaint() {
                        Log.m165389i("WebContainerFragment", "onFirstImagePaint");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                    public void onFirstMeaningfulPaint() {
                        Log.m165389i("WebContainerFragment", "onFirstMeaningfulPaint");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                    public void onFirstScreenPaint() {
                        Log.m165389i("WebContainerFragment", "onFirstScreenPaint");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                    public void onNetFinish() {
                        Log.m165389i("WebContainerFragment", "onNetFinish");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk111.IPerformanceTimingListenersdk111
                    public void onFirstContentfulPaint() {
                        Log.m165389i("WebContainerFragment", "onFirstContentfulPaint");
                        C19857c.this.f48474F = System.currentTimeMillis();
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                    public void onCustomTagNotify(String str) {
                        Log.m165389i("WebContainerFragment", "onCustomTagNotify");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                    public void onIframeLoaded(String str) {
                        Log.m165389i("WebContainerFragment", "onIframeLoaded");
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                    public void onReceivedResponse(String str) {
                        Log.m165389i("WebContainerFragment", "onReceivedResponse");
                        C19857c.this.f48473E = System.currentTimeMillis();
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk113.IPerformanceTimingListenersdk113
                    public void onJSError(String str) {
                        Log.m165389i("WebContainerFragment", "onJSError\n" + str);
                    }

                    @Override // com.bytedance.lynx.webview.glue.sdk112.IPerformanceTimingListenersdk112
                    public void onReceivedSpecialEvent(String str) {
                        Log.m165389i("WebContainerFragment", "onReceivedSpecialEvent\n" + str);
                    }
                });
            }
        }
        m72453v();
        m72457z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67278a() {
        this.f48469A = new C48765a();
        this.f48470B = new C25876a();
        this.f48471C = new C25859d(this.mContext, this.f48517y);
        this.f48472D = new C25844c(this.f175434ai);
        m72435a(getArguments());
        this.f48475G = new C25835f.C25837a(this.f48501i).mo91914a();
        WebContainerReporter.m93651a().mo92045a("init_data");
        if (C25821b.m93347a() != null) {
            this.f48477I = C25821b.m93347a().mo91848a("openplatform.webapp.permission.optimize");
        }
        Log.m165389i("WebContainerFragment", "mIsPermissionOptimizeFGOn = " + this.f48477I);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.ag = true;
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m72441c(View view) {
        m72432H();
        Log.m165389i("WebContainerFragment", "click mUdEmptyState refresh item");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m72436a(AbstractC13471f fVar) {
        if (fVar.mo49910a() == null) {
            Log.m165389i("WebContainerFragment", "TTWebViewExtension is null ");
            return;
        }
        new PerformanceTimingHandler().report(fVar.mo49910a().getPerformanceTiming());
    }

    /* renamed from: b */
    private String m72438b(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("app_id", "");
        if (TextUtils.isEmpty(string)) {
            return bundle.getString("key_appid", "");
        }
        return string;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m72442d(View view) {
        m72455x();
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m72440b(View view) {
        m72432H();
        Log.m165389i("WebContainerFragment", "click mErrorView refresh");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m72443e(View view) {
        m72455x();
        if (m72454w()) {
            this.f48495c.setVisibility(8);
            this.f48494b.goBack();
        } else if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractC25833d
    /* renamed from: c */
    public boolean mo67290c(boolean z) {
        if (!z && m72456y()) {
            return true;
        }
        C19853c cVar = this.f48490W;
        if (cVar != null && cVar.mo67259b()) {
            return true;
        }
        if (this.f48494b == null || !m72454w()) {
            return false;
        }
        this.f48495c.setVisibility(8);
        this.f48494b.goBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isActive()) {
            AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
            if (abstractInjectWebViewDelegate != null) {
                abstractInjectWebViewDelegate.mo91873a(configuration);
            }
            if (this.f48500h != null && getActivity() != null) {
                this.f48500h.mo91974e(UIUtils.dp2px(getActivity(), ((float) configuration.screenWidthDp) + 0.5f));
            }
        }
    }

    /* renamed from: a */
    private void m72435a(Bundle bundle) {
        if (bundle != null) {
            this.f48501i = bundle.getString("url", "");
            this.f48480M = bundle.getString("title", "");
            this.f48481N = bundle.getBoolean("showActionTitleBar", true);
            this.f48482O = bundle.getBoolean("showTitle", true);
            this.f48502j = bundle.getBoolean("showTitleBar", true);
            this.f48483P = bundle.getBoolean("showMoreMenuBtn", true);
            this.f48504l = bundle.getBoolean("isShowLoading", true);
            this.f48486S = bundle.getBoolean("is_multi_window_open", false);
            this.f48484Q = this.f48480M;
        }
    }

    /* renamed from: b */
    public void mo67286b(PermissionRequest permissionRequest) {
        boolean z;
        boolean z2;
        String[] resources = permissionRequest.getResources();
        for (String str : resources) {
            if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                if (ActivityCompat.checkSelfPermission(getActivity(), "android.permission.RECORD_AUDIO") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Log.m165389i("WebContainerFragment", "audio_capture permission = " + z2);
                if (!z2) {
                    this.al.put(1000, Pair.create(str, permissionRequest));
                    requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 1000);
                } else {
                    try {
                        permissionRequest.grant(new String[]{str});
                    } catch (IllegalStateException unused) {
                    }
                }
            } else if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                if (ActivityCompat.checkSelfPermission(getActivity(), "android.permission.CAMERA") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                Log.m165389i("WebContainerFragment", "video_capture permission = " + z);
                if (!z) {
                    this.al.put(Integer.valueOf((int) CommonCode.StatusCode.API_CLIENT_EXPIRED), Pair.create(str, permissionRequest));
                    requestPermissions(new String[]{"android.permission.CAMERA"}, CommonCode.StatusCode.API_CLIENT_EXPIRED);
                } else {
                    permissionRequest.grant(new String[]{str});
                }
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C48211b.m190251a().mo168689b("onActivityCreated");
        if (!mo67296h()) {
            if (getContext() != null) {
                LKUIToast.show(getContext(), (int) R.string.Lark_Legacy_EnableChrome);
            }
            if (getActivity() != null) {
                getActivity().finish();
                return;
            }
            return;
        }
        boolean z = false;
        if (C26284k.m95186b(this.mContext) || C26284k.m95185a(this.mContext)) {
            WebView.setWebContentsDebuggingEnabled(true);
        } else {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        if (!m72444m()) {
            Log.m165389i("WebContainerFragment", "checkArguments failed");
            return;
        }
        this.f48517y = new CallbackManager();
        if (getArguments() != null && getArguments().getBoolean("screenForcePortrait", false)) {
            z = true;
        }
        if (z && getActivity() != null) {
            getActivity().setRequestedOrientation(1);
        }
        mo67278a();
        Log.m165389i("WebContainerFragment", "after parse args");
        Log.m165389i("WebContainerFragment", "init with v2 container");
        m72425A();
        C48211b.m190251a().mo168691c("onActivityCreated");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C19855b mo67277a(AbstractC25856g gVar) {
        return new C19855b(gVar, this.f48472D, this.f48479K);
    }

    /* renamed from: b */
    public void mo67287b(String str) {
        if (this.f48482O) {
            this.f48500h.setTitle(str);
        }
    }

    /* renamed from: b */
    public void mo67288b(boolean z) {
        ProgressBar progressBar;
        int i;
        if (this.f48504l && (progressBar = this.f48497e) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            progressBar.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: a */
    public void mo67279a(View view) {
        this.f48497e = (ProgressBar) this.f48493a.findViewById(R.id.web_load_progressbar);
        this.f48498f = (FrameLayout) this.f48493a.findViewById(R.id.webView_root_layout);
        this.f48476H = (ViewStub) this.f48493a.findViewById(R.id.webview_availability_notify);
    }

    /* renamed from: a */
    public void mo67280a(PermissionRequest permissionRequest) {
        ArrayList arrayList = new ArrayList();
        for (String str : permissionRequest.getResources()) {
            m72437a(str, arrayList);
        }
        if (arrayList.size() > 0) {
            this.am = permissionRequest;
            requestPermissions((String[]) arrayList.toArray(new String[0]), 1002);
            Log.m165389i("WebContainerFragment", "request permission " + arrayList);
            return;
        }
        Log.m165389i("WebContainerFragment", "granted web permission once : " + this.an);
        try {
            permissionRequest.grant((String[]) this.an.toArray(new String[0]));
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m72434a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        Log.m165389i("WebContainerFragment", "start run reStart");
        m72430F();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m72439b(DialogInterface dialogInterface, int i) {
        Log.m165389i("WebContainerFragment", "Cancel no response dialog");
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: a */
    public View mo67276a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C48211b.m190251a().mo168689b("getContentView");
        this.f48493a = (ViewGroup) layoutInflater.inflate(R.layout.fragment_webview_container_v2, viewGroup, false);
        C48211b.m190251a().mo168691c("getContentView");
        Log.m165389i("WebContainerFragment", "finish inflate view");
        return this.f48493a;
    }

    /* renamed from: a */
    private void m72437a(String str, List<String> list) {
        boolean z;
        String str2 = f48468Z.get(str);
        if (str2 == null) {
            Log.m165389i("WebContainerFragment", "not define permission so return");
            return;
        }
        if (ActivityCompat.checkSelfPermission(getActivity(), str2) == 0) {
            z = true;
        } else {
            z = false;
        }
        Log.m165389i("WebContainerFragment", "capture permission = [" + str2 + "] " + z);
        if (!z) {
            list.add(str2);
        } else {
            this.an.add(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        C19853c cVar;
        super.onActivityResult(i, i2, intent);
        Log.m165389i("WebContainerFragment", "onActivityResult delegate requestCode: " + i + ", resultCode: " + i2);
        AbstractInjectWebViewDelegate abstractInjectWebViewDelegate = this.f48479K;
        if (abstractInjectWebViewDelegate != null) {
            abstractInjectWebViewDelegate.mo50974a(i, i2, intent);
        }
        Log.m165389i("WebContainerFragment", "onActivityResult delegate finished");
        if ((i == 12000 || i == 13000) && (cVar = this.f48490W) != null && cVar.mo67260c() != null) {
            cVar.mo67260c().mo91942a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        switch (i) {
            case 1000:
            case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                Pair<String, PermissionRequest> pair = this.al.get(Integer.valueOf(i));
                Log.m165389i("WebContainerFragment", "requestCode = " + i + " , pair = " + pair);
                if (pair != null) {
                    ((PermissionRequest) pair.second).grant(new String[]{(String) pair.first});
                    return;
                }
                return;
            case 1002:
                Log.m165389i("WebContainerFragment", "onRequestPermissionsResult request all");
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (iArr[i2] == 0 && this.am != null) {
                        Log.m165389i("WebContainerFragment", "granted permission " + strArr[i2]);
                        this.an.add(aa.get(strArr[i2]));
                    }
                }
                if (this.an.size() > 0) {
                    Log.m165389i("WebContainerFragment", "grant per " + this.an);
                    PermissionRequest permissionRequest = this.am;
                    if (permissionRequest != null) {
                        try {
                            permissionRequest.grant((String[]) this.an.toArray(new String[0]));
                            Log.m165389i("WebContainerFragment", "after get permission grant permission " + this.an);
                            return;
                        } catch (IllegalStateException unused) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
