package com.bytedance.ee.bear.document.docpageconfig;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.bytedance.ee.bear.browser.AbstractC4931i;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.browser.view.AbstractC4964b;
import com.bytedance.ee.bear.browser.view.C4966d;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocBridgeWebViewV2;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.aj;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.ss.android.vesdk.p3188b.C63954b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/document/docpageconfig/DocPageConfigPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/widget/statusbar/StatusBarCompat$IInterceptor;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "mDecorateLayer", "Lcom/bytedance/ee/bear/browser/view/DecorateLayer;", "mDocPageConfig", "Landroid/os/Bundle;", "getConfigValue", "", "key", "", "handleOrientationState", "", "handleScrollConflicts", "handleTitleBarState", "interceptSetStatusBarColor", "activity", "Landroid/app/Activity;", "i", "", C63954b.f161494a, "interceptSetSystemUiVisibility", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromHost", "onDetachFromUIContainer", "shouldDisableLandscape", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocPageConfigPlugin extends DocumentPlugin implements AbstractC6054a, C11789c.AbstractC11791a {
    public static final Companion Companion = new Companion(null);
    private AbstractC4964b mDecorateLayer;
    private Bundle mDocPageConfig;

    @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
    public boolean interceptSetStatusBarColor(Activity activity, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return true;
    }

    @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
    public boolean interceptSetSystemUiVisibility(Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        return true;
    }

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/docpageconfig/DocPageConfigPlugin$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.docpageconfig.DocPageConfigPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void handleOrientationState() {
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin;
        if (getConfigValue("disableLandscape") && (unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class)) != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
            C13479a.m54772d("DocPageConfigPlugin", "disableLandscape");
        }
    }

    private final void handleScrollConflicts() {
        if (this.mDecorateLayer == null) {
            this.mDecorateLayer = new C5742b(this);
        }
        AbstractC4931i web = getWeb();
        Intrinsics.checkExpressionValueIsNotNull(web, "web");
        if (web.mo19435b() instanceof DocBridgeWebViewV2) {
            AbstractC4931i web2 = getWeb();
            Intrinsics.checkExpressionValueIsNotNull(web2, "web");
            WebView b = web2.mo19435b();
            if (b != null) {
                ((DocBridgeWebViewV2) b).mo19618a(this.mDecorateLayer);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.document.DocBridgeWebViewV2");
        }
    }

    private final void handleTitleBarState() {
        TitleBar titleBar = getTitleBar();
        if (titleBar != null) {
            boolean configValue = getConfigValue("hideTitleBar");
            if (configValue) {
                BaseTitleBar a = titleBar.mo19508a();
                Intrinsics.checkExpressionValueIsNotNull(a, "curTitleBar.titleBarLayout");
                a.setVisibility(8);
            }
            boolean configValue2 = getConfigValue("hideTitle");
            if (configValue2) {
                getTitleBar().mo19515a(false);
                getTitleBar().mo19526f(false);
            }
            boolean configValue3 = getConfigValue("hideBackIcon");
            if (configValue3) {
                titleBar.mo19525e(false);
            }
            ArrayList arrayList = new ArrayList();
            boolean configValue4 = getConfigValue("hideMessageIcon");
            boolean configValue5 = getConfigValue("hideShareIcon");
            boolean configValue6 = getConfigValue("hideMoreIcon");
            if (configValue4) {
                arrayList.add(new MenuItem("MESSAGE", null));
            }
            if (configValue5) {
                arrayList.add(new MenuItem("SHARE", null));
            }
            if (configValue6) {
                arrayList.add(new MenuItem("MORE_OPERATE", null));
            }
            titleBar.mo19513a(arrayList);
            C13479a.m54772d("DocPageConfigPlugin", "hideTitleBar=" + configValue + ", hideTitle=" + configValue2 + ", hideBackIcon=" + configValue3 + ", hiddenMenuItems=" + arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/document/docpageconfig/DocPageConfigPlugin$handleScrollConflicts$1", "Lcom/bytedance/ee/bear/browser/view/SimpleDecorateLayer;", "onOverScrolled", "", "scrollX", "", "scrollY", "clampedX", "", "clampedY", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.docpageconfig.DocPageConfigPlugin$b */
    public static final class C5742b extends C4966d {

        /* renamed from: a */
        final /* synthetic */ DocPageConfigPlugin f16199a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5742b(DocPageConfigPlugin docPageConfigPlugin) {
            this.f16199a = docPageConfigPlugin;
        }

        @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
        /* renamed from: a */
        public boolean mo19641a(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            AbstractC4931i web = this.f16199a.getWeb();
            Intrinsics.checkExpressionValueIsNotNull(web, "web");
            web.mo19435b().requestDisallowInterceptTouchEvent(true);
            return false;
        }

        @Override // com.bytedance.ee.bear.browser.view.AbstractC4964b, com.bytedance.ee.bear.browser.view.C4966d
        /* renamed from: a */
        public void mo19639a(int i, int i2, boolean z, boolean z2) {
            super.mo19639a(i, i2, z, z2);
            if (z) {
                AbstractC4931i web = this.f16199a.getWeb();
                Intrinsics.checkExpressionValueIsNotNull(web, "web");
                web.mo19435b().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    private final boolean getConfigValue(String str) {
        Bundle bundle = this.mDocPageConfig;
        if (bundle != null) {
            return bundle.getBoolean(str, false);
        }
        return false;
    }

    public void onAttachToHost(C6095s sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        super.onAttachToHost((C4943e) sVar);
        C11789c.m48866a(getActivity(), this);
    }

    public void onDetachFromHost(C6095s sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        super.onDetachFromHost((C4943e) sVar);
        C11789c.m48871b(getActivity(), this);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        Bundle bundle;
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        aj l = sVar.mo24597l();
        Intrinsics.checkExpressionValueIsNotNull(l, "host.webViewFragment");
        Bundle arguments = l.getArguments();
        if (arguments != null) {
            bundle = arguments.getBundle("doc_page_config");
        } else {
            bundle = null;
        }
        this.mDocPageConfig = bundle;
        if (bundle != null) {
            handleTitleBarState();
            handleOrientationState();
        }
        handleScrollConflicts();
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        AbstractC4931i web = getWeb();
        Intrinsics.checkExpressionValueIsNotNull(web, "web");
        if ((web.mo19435b() instanceof DocBridgeWebViewV2) && this.mDecorateLayer != null) {
            AbstractC4931i web2 = getWeb();
            Intrinsics.checkExpressionValueIsNotNull(web2, "web");
            WebView b = web2.mo19435b();
            if (b != null) {
                ((DocBridgeWebViewV2) b).mo19620b(this.mDecorateLayer);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.document.DocBridgeWebViewV2");
            }
        }
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin != null) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }
}
