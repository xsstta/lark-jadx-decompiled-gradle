package com.ss.android.lark.browser.impl.translate;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.larksuite.component.webview.container.dto.C25838g;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.browser.impl.translate.jsb.C29954a;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.ManualTranslateJSParam;
import com.ss.android.lark.browser.impl.translate.mvp.TranslateBarModel;
import com.ss.android.lark.browser.impl.translate.mvp.TranslateBarPresenter;
import com.ss.android.lark.browser.impl.translate.mvp.TranslateBarView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper;", "", "callHandler", "Lcom/ss/android/lark/browser/impl/translate/WebCallHandler;", "(Lcom/ss/android/lark/browser/impl/translate/WebCallHandler;)V", "barPresenter", "Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter;", "addTranslateBar", "", "parentView", "Landroid/widget/FrameLayout;", "createWebMoreMenuItem", "Lcom/larksuite/component/webview/container/dto/WebMoreMenuItem;", "context", "Landroid/content/Context;", "initTranslateBar", "activity", "Landroid/app/Activity;", "barContainer", "Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper$BarContainer;", "injectJsCode", "url", "", "onPageFinished", "webView", "Landroid/webkit/WebView;", "BarContainer", "Companion", "JSCallerApiImpl", "WebMoreMenuItemWrapper", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WebTranslateHelper {

    /* renamed from: c */
    public static final Companion f74708c = new Companion(null);

    /* renamed from: a */
    public TranslateBarPresenter f74709a;

    /* renamed from: b */
    public final AbstractC29952b f74710b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\"\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH&R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper$WebMoreMenuItemWrapper;", "Lcom/larksuite/component/webview/container/dto/WebMoreMenuItem;", "iconResId", "", "disableIconResId", "title", "", "clickListener", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "(IILjava/lang/String;Lcom/ss/android/lark/widget/listener/OnSingleClickListener;)V", "getClickListener", "getIconResId", "isEnable", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.WebTranslateHelper$c */
    private static abstract class WebMoreMenuItemWrapper extends C25838g {

        /* renamed from: a */
        private final int f74713a;

        /* renamed from: g */
        public abstract boolean mo107840g();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/browser/impl/translate/WebTranslateHelper$WebMoreMenuItemWrapper$getClickListener$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.WebTranslateHelper$c$a */
        public static final class C29941a extends OnSingleClickListener {
            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
            }

            C29941a() {
            }
        }

        @Override // com.larksuite.component.webview.container.dto.C25838g
        /* renamed from: a */
        public int mo50898a() {
            if (mo107840g()) {
                return super.mo50898a();
            }
            return this.f74713a;
        }

        @Override // com.larksuite.component.webview.container.dto.C25838g
        /* renamed from: d */
        public OnSingleClickListener mo91924d() {
            if (!mo107840g()) {
                return new C29941a();
            }
            OnSingleClickListener d = super.mo91924d();
            Intrinsics.checkExpressionValueIsNotNull(d, "super.getClickListener()");
            return d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WebMoreMenuItemWrapper(int i, int i2, String str, OnSingleClickListener onSingleClickListener) {
            super(i, str, onSingleClickListener);
            Intrinsics.checkParameterIsNotNull(str, "title");
            Intrinsics.checkParameterIsNotNull(onSingleClickListener, "clickListener");
            this.f74713a = i2;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\n\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper$BarContainer;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApiProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "translateHandlerApi", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "getTranslateHandlerApi", "()Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "setTranslateHandlerApi", "(Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;)V", "getHandlerApi", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class BarContainer extends FrameLayout implements TranslateJSApi.IHandlerApiProvider {

        /* renamed from: a */
        private TranslateJSApi.IHandlerApi f74711a;

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApiProvider
        public TranslateJSApi.IHandlerApi getHandlerApi() {
            return this.f74711a;
        }

        /* renamed from: a */
        public final void mo107835a(TranslateJSApi.IHandlerApi cVar) {
            this.f74711a = cVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BarContainer(Context context) {
            super(context);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BarContainer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BarContainer(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Intrinsics.checkParameterIsNotNull(context, "context");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper$Companion;", "", "()V", "TAG", "", "findTranslateBar", "Landroid/view/View;", "parentView", "Landroid/view/ViewGroup;", "getTranslateHandlerApi", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "containerView", "isFgEnable", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.WebTranslateHelper$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final boolean mo107838a() {
            C29945a a = C29945a.m110725a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ConfigManager.inst()");
            return a.mo107846b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final View m110713b(ViewGroup viewGroup) {
            if (viewGroup != null) {
                return viewGroup.findViewById(R.id.browser_web_translate_bar);
            }
            return null;
        }

        /* renamed from: a */
        public final TranslateJSApi.IHandlerApi mo107837a(ViewGroup viewGroup) {
            View b = m110713b(viewGroup);
            if (b == null || !(b instanceof TranslateJSApi.IHandlerApiProvider)) {
                return null;
            }
            return ((TranslateJSApi.IHandlerApiProvider) b).getHandlerApi();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/browser/impl/translate/WebTranslateHelper$createWebMoreMenuItem$1", "Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper$WebMoreMenuItemWrapper;", "isEnable", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.WebTranslateHelper$d */
    public static final class C29942d extends WebMoreMenuItemWrapper {

        /* renamed from: a */
        final /* synthetic */ WebTranslateHelper f74714a;

        /* renamed from: b */
        final /* synthetic */ Context f74715b;

        @Override // com.ss.android.lark.browser.impl.translate.WebTranslateHelper.WebMoreMenuItemWrapper
        /* renamed from: g */
        public boolean mo107840g() {
            TranslateBarPresenter bVar = this.f74714a.f74709a;
            if (bVar == null || !bVar.mo107984a()) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29942d(WebTranslateHelper webTranslateHelper, Context context, int i, int i2, String str, OnSingleClickListener onSingleClickListener) {
            super(i, i2, str, onSingleClickListener);
            this.f74714a = webTranslateHelper;
            this.f74715b = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/browser/impl/translate/WebTranslateHelper$initTranslateBar$1", "Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$IPresenterDependency;", "getContext", "Landroid/content/Context;", "getJSCallerApi", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$ICallerApi;", "getWebUrl", "", "openTranslateSettingPage", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.WebTranslateHelper$f */
    public static final class C29944f implements TranslateBarPresenter.IPresenterDependency {

        /* renamed from: a */
        final /* synthetic */ WebTranslateHelper f74717a;

        /* renamed from: b */
        final /* synthetic */ Activity f74718b;

        @Override // com.ss.android.lark.browser.impl.translate.mvp.TranslateBarPresenter.IPresenterDependency
        /* renamed from: b */
        public TranslateJSApi.ICallerApi mo107842b() {
            return new JSCallerApiImpl();
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.TranslateBarPresenter.IPresenterDependency
        /* renamed from: c */
        public Context mo107843c() {
            return this.f74717a.f74710b.mo107581b();
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.TranslateBarPresenter.IPresenterDependency
        /* renamed from: d */
        public String mo107844d() {
            return this.f74717a.f74710b.mo107578a();
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.TranslateBarPresenter.IPresenterDependency
        /* renamed from: a */
        public void mo107841a() {
            IBrowserModuleDependency a = C29638a.m109622a();
            Intrinsics.checkExpressionValueIsNotNull(a, "BrowserModule.getDependency()");
            a.getMineDependency().mo107709a(this.f74718b);
        }

        C29944f(WebTranslateHelper webTranslateHelper, Activity activity) {
            this.f74717a = webTranslateHelper;
            this.f74718b = activity;
        }
    }

    static {
        C29954a.m110771a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper$JSCallerApiImpl;", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$ICallerApi;", "(Lcom/ss/android/lark/browser/impl/translate/WebTranslateHelper;)V", "doTranslate", "", "manualType", "", "originLang", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "targetLang", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.WebTranslateHelper$b */
    private final class JSCallerApiImpl implements TranslateJSApi.ICallerApi {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public JSCallerApiImpl() {
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.ICallerApi
        /* renamed from: a */
        public void mo107839a(String str, TranslateLanguage translateLanguage, TranslateLanguage translateLanguage2) {
            Intrinsics.checkParameterIsNotNull(str, "manualType");
            Intrinsics.checkParameterIsNotNull(translateLanguage, "originLang");
            Intrinsics.checkParameterIsNotNull(translateLanguage2, "targetLang");
            ManualTranslateJSParam manualTranslateJSParam = new ManualTranslateJSParam();
            manualTranslateJSParam.setTranslateType(str);
            manualTranslateJSParam.setOriginLang(translateLanguage);
            manualTranslateJSParam.setTargetLang(translateLanguage2);
            String a = C57878s.m224591a(manualTranslateJSParam);
            if (a == null) {
                a = "{}";
            }
            WebTranslateHelper.this.f74710b.mo107580a("biz.larkWebTranslate.onManualTranslate", a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/browser/impl/translate/WebTranslateHelper$createWebMoreMenuItem$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.WebTranslateHelper$e */
    public static final class C29943e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ WebTranslateHelper f74716a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C29943e(WebTranslateHelper webTranslateHelper) {
            this.f74716a = webTranslateHelper;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            TranslateBarPresenter bVar;
            TranslateBarPresenter bVar2 = this.f74716a.f74709a;
            if (bVar2 != null && bVar2.mo107984a() && (bVar = this.f74716a.f74709a) != null) {
                bVar.mo107987d();
            }
        }
    }

    public WebTranslateHelper(AbstractC29952b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callHandler");
        this.f74710b = bVar;
    }

    /* renamed from: a */
    private final void m110708a(String str) {
        boolean z;
        Log.m165389i("WebTranslateHelper", "injectJsCode");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165383e("WebTranslateHelper", "[injectJsCode], url is null");
        } else if (C29945a.m110725a().mo107845a(str)) {
            C29954a.m110772a(this.f74710b);
        }
    }

    /* renamed from: a */
    public final C25838g mo107832a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        String string = UIUtils.getString(context, R.string.Lark_Legacy_Translation);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(contex….Lark_Legacy_Translation)");
        return new C29942d(this, context, R.drawable.browser_menu_ic_translate, R.drawable.browser_menu_ic_translate_disable, string, new C29943e(this));
    }

    /* renamed from: a */
    public final void mo107834a(FrameLayout frameLayout) {
        if (frameLayout != null) {
            View findViewById = frameLayout.findViewById(R.id.browser_web_translate_bar);
            if (findViewById != null) {
                ViewParent parent = findViewById.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(findViewById);
                }
            }
            Context context = frameLayout.getContext();
            if (context != null) {
                Activity activity = (Activity) context;
                BarContainer barContainer = new BarContainer(activity);
                barContainer.setId(R.id.browser_web_translate_bar);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                frameLayout.addView(barContainer, layoutParams);
                m110707a(activity, barContainer);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    /* renamed from: a */
    public final void mo107833a(WebView webView, String str) {
        if (!f74708c.mo107838a()) {
            Log.m165389i("WebTranslateHelper", "[onPageFinished], fg=false");
            return;
        }
        TranslateBarPresenter bVar = this.f74709a;
        if (bVar != null) {
            bVar.mo107983a(str);
        }
        m110708a(str);
    }

    /* renamed from: a */
    private final void m110707a(Activity activity, BarContainer barContainer) {
        TranslateBarPresenter bVar = new TranslateBarPresenter(new TranslateBarModel(), new TranslateBarView(activity, barContainer), new C29944f(this, activity));
        bVar.create();
        barContainer.mo107835a(bVar.mo107986c());
        this.f74709a = bVar;
    }
}
