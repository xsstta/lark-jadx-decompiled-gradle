package com.ss.android.lark.browser.impl.translate.mvp;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.C26034b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.C29638a;
import com.ss.android.lark.browser.dependency.IBrowserModuleDependency;
import com.ss.android.lark.browser.impl.translate.C29945a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract;
import com.ss.android.lark.browser.impl.translate.mvp.view.TranslateBarSettingDialog;
import com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.widget.dialog.C58423b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u001c\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u000fH\u0016J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarView;", "Lcom/larksuite/framework/mvp/BaseView;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView$IViewDelegate;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView;", "activity", "Landroid/app/Activity;", "parentContainer", "Landroid/widget/FrameLayout;", "(Landroid/app/Activity;Landroid/widget/FrameLayout;)V", "guideDelegateRef", "Ljava/lang/ref/WeakReference;", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "translateBar", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/WebTranslateBar;", "attachToParent", "", "closeBar", "create", "destroy", "detachFromParent", "hide", "anim", "", "initTranslateBarListener", "removeViewFromParent", "view", "Landroid/view/View;", "show", "showChooseLanguageDialog", "list", "", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "targetLang", "showSettingDialog", "barSettingInfo", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarSettingInfo;", "showTip", "updateDisplay", "displayInfo", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$BarDisplayInfo;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.impl.translate.mvp.c */
public final class TranslateBarView extends C26034b<ITranslateBarContract.ITranslateBarView.IViewDelegate> implements ITranslateBarContract.ITranslateBarView {

    /* renamed from: a */
    public WeakReference<GuideDelegate> f74770a;

    /* renamed from: b */
    public final Activity f74771b;

    /* renamed from: c */
    private WebTranslateBar f74772c;

    /* renamed from: d */
    private final FrameLayout f74773d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarView$showSettingDialog$1", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/TranslateBarSettingDialog$OnSettingItemListener;", "onAutoTranslateChanged", "", "checked", "", "onChooseLanguageClick", "onMoreSettingClick", "onNotTranslateThisLanguageChanged", "onNotTranslateThisSiteChanged", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.c$c */
    public static final class C29972c implements TranslateBarSettingDialog.OnSettingItemListener {

        /* renamed from: a */
        final /* synthetic */ TranslateBarView f74777a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/browser/impl/translate/mvp/TranslateBarView$showSettingDialog$1$onNotTranslateThisLanguageChanged$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.c$c$a */
        static final class RunnableC29973a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C29972c f74778a;

            /* renamed from: b */
            final /* synthetic */ boolean f74779b;

            RunnableC29973a(C29972c cVar, boolean z) {
                this.f74778a = cVar;
                this.f74779b = z;
            }

            public final void run() {
                this.f74778a.f74777a.mo108006b();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/browser/impl/translate/mvp/TranslateBarView$showSettingDialog$1$onNotTranslateThisSiteChanged$1$1"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.c$c$b */
        static final class RunnableC29974b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C29972c f74780a;

            /* renamed from: b */
            final /* synthetic */ boolean f74781b;

            RunnableC29974b(C29972c cVar, boolean z) {
                this.f74780a = cVar;
                this.f74781b = z;
            }

            public final void run() {
                this.f74780a.f74777a.mo108006b();
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.TranslateBarSettingDialog.OnSettingItemListener
        /* renamed from: a */
        public void mo108012a() {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74777a.mo92555c();
            if (bVar != null) {
                bVar.mo107977d();
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.TranslateBarSettingDialog.OnSettingItemListener
        /* renamed from: b */
        public void mo108014b() {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74777a.mo92555c();
            if (bVar != null) {
                bVar.mo107976c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C29972c(TranslateBarView cVar) {
            this.f74777a = cVar;
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.TranslateBarSettingDialog.OnSettingItemListener
        /* renamed from: b */
        public void mo108015b(boolean z) {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74777a.mo92555c();
            if (bVar != null) {
                if (z) {
                    if (!bVar.mo107979f()) {
                        bVar.mo107971a();
                    }
                    UICallbackExecutor.executeDelayed(new RunnableC29973a(this, z), 660);
                }
                LKUIToast.show(this.f74777a.f74771b, UIUtils.getString(this.f74777a.f74771b, R.string.Lark_Chat_SetTranslateWebSuccess));
                bVar.mo107972a(4, z);
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.TranslateBarSettingDialog.OnSettingItemListener
        /* renamed from: c */
        public void mo108016c(boolean z) {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74777a.mo92555c();
            if (bVar != null) {
                if (z) {
                    if (!bVar.mo107979f()) {
                        bVar.mo107971a();
                    }
                    UICallbackExecutor.executeDelayed(new RunnableC29974b(this, z), 660);
                }
                LKUIToast.show(this.f74777a.f74771b, UIUtils.getString(this.f74777a.f74771b, R.string.Lark_Chat_SetTranslateWebSuccess));
                bVar.mo107972a(2, z);
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.TranslateBarSettingDialog.OnSettingItemListener
        /* renamed from: a */
        public void mo108013a(boolean z) {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74777a.mo92555c();
            if (bVar != null) {
                if (z) {
                    bVar.mo107974a(false);
                    LKUIToast.show(this.f74777a.f74771b, UIUtils.getString(this.f74777a.f74771b, R.string.Lark_Chat_OpenWebAutoTranslateSuccess));
                } else {
                    LKUIToast.show(this.f74777a.f74771b, UIUtils.getString(this.f74777a.f74771b, R.string.Lark_Chat_SetTranslateWebSuccess));
                }
                bVar.mo107972a(1, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarView$initTranslateBarListener$1", "Lcom/ss/android/lark/browser/impl/translate/mvp/view/WebTranslateBar$WebTranslateListener;", "onClose", "", "onOpenSetting", "onOriginLangClick", "onTargetLangClick", "isSelected", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.c$a */
    public static final class C29970a implements WebTranslateBar.WebTranslateListener {

        /* renamed from: a */
        final /* synthetic */ TranslateBarView f74774a;

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar.WebTranslateListener
        /* renamed from: c */
        public void mo108010c() {
            this.f74774a.mo108006b();
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar.WebTranslateListener
        /* renamed from: a */
        public void mo108007a() {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74774a.mo92555c();
            if (bVar != null) {
                bVar.mo107971a();
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar.WebTranslateListener
        /* renamed from: b */
        public void mo108009b() {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74774a.mo92555c();
            if (bVar != null) {
                bVar.mo107975b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C29970a(TranslateBarView cVar) {
            this.f74774a = cVar;
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.view.WebTranslateBar.WebTranslateListener
        /* renamed from: a */
        public void mo108008a(boolean z) {
            ITranslateBarContract.ITranslateBarView.IViewDelegate bVar;
            if (!z && (bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74774a.mo92555c()) != null) {
                ITranslateBarContract.ITranslateBarView.IViewDelegate.C29962a.m110823a(bVar, false, 1, null);
            }
        }
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m110880d();
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        m110881e();
    }

    /* renamed from: e */
    private final void m110881e() {
        m110878a((View) this.f74772c);
        this.f74772c = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/lark/browser/impl/translate/mvp/TranslateBarView$showTip$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.c$d */
    static final class RunnableC29975d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f74782a;

        /* renamed from: b */
        final /* synthetic */ TranslateBarView f74783b;

        RunnableC29975d(View view, TranslateBarView cVar) {
            this.f74782a = view;
            this.f74783b = cVar;
        }

        public final void run() {
            IBrowserModuleDependency a = C29638a.m109622a();
            Intrinsics.checkExpressionValueIsNotNull(a, "BrowserModule.getDependency()");
            GuideDelegate a2 = a.getGuideDependency().mo107672a(this.f74782a, View$OnClickListenerC29977d.f74785a, new View.OnClickListener(this) {
                /* class com.ss.android.lark.browser.impl.translate.mvp.TranslateBarView.RunnableC29975d.View$OnClickListenerC299761 */

                /* renamed from: a */
                final /* synthetic */ RunnableC29975d f74784a;

                {
                    this.f74784a = r1;
                }

                public final void onClick(View view) {
                    ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74784a.f74783b.mo92555c();
                    if (bVar != null) {
                        bVar.mo107972a(1, true);
                    }
                    ITranslateBarContract.ITranslateBarView.IViewDelegate bVar2 = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74784a.f74783b.mo92555c();
                    if (bVar2 != null) {
                        bVar2.mo107974a(false);
                    }
                    C29945a.m110725a().mo107850f();
                }
            });
            if (a2 != null) {
                this.f74783b.f74770a = new WeakReference<>(a2);
            }
        }
    }

    /* renamed from: d */
    private final void m110880d() {
        WebTranslateBar webTranslateBar = this.f74772c;
        if (webTranslateBar == null) {
            WebTranslateBar webTranslateBar2 = new WebTranslateBar(this.f74773d.getContext());
            m110879a(webTranslateBar2);
            this.f74772c = webTranslateBar2;
        } else if (webTranslateBar.getParent() != null) {
            return;
        }
        WebTranslateBar webTranslateBar3 = this.f74772c;
        if (webTranslateBar3 != null) {
            this.f74773d.addView(webTranslateBar3, new FrameLayout.LayoutParams(-1, -2));
            webTranslateBar3.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo108006b() {
        GuideDelegate gVar;
        WebTranslateBar webTranslateBar = this.f74772c;
        if (webTranslateBar != null) {
            webTranslateBar.mo108026e();
        }
        ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) mo92555c();
        if (bVar != null) {
            bVar.mo107978e();
        }
        WeakReference<GuideDelegate> weakReference = this.f74770a;
        if (weakReference != null && (gVar = weakReference.get()) != null) {
            gVar.mo141659b();
        }
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView
    /* renamed from: a */
    public void mo107965a() {
        Boolean bool;
        WebTranslateBar webTranslateBar;
        View settingBtnView;
        GuideDelegate gVar;
        WeakReference<GuideDelegate> weakReference = this.f74770a;
        if (weakReference == null || (gVar = weakReference.get()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(gVar.mo141658a());
        }
        if (!C29945a.m110725a().mo107849e()) {
            return;
        }
        if ((bool == null || !bool.booleanValue()) && (webTranslateBar = this.f74772c) != null && (settingBtnView = webTranslateBar.getSettingBtnView()) != null) {
            settingBtnView.post(new RunnableC29975d(settingBtnView, this));
        }
    }

    /* renamed from: a */
    private final void m110879a(WebTranslateBar webTranslateBar) {
        webTranslateBar.setListener(new C29970a(this));
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView
    /* renamed from: b */
    public void mo107970b(boolean z) {
        WebTranslateBar webTranslateBar = this.f74772c;
        if (webTranslateBar == null) {
            return;
        }
        if (z) {
            webTranslateBar.mo108028g();
        } else {
            webTranslateBar.mo108026e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.c$b */
    static final class C29971b implements C58423b.AbstractC58427b {

        /* renamed from: a */
        final /* synthetic */ TranslateBarView f74775a;

        /* renamed from: b */
        final /* synthetic */ List f74776b;

        C29971b(TranslateBarView cVar, List list) {
            this.f74775a = cVar;
            this.f74776b = list;
        }

        @Override // com.ss.android.lark.widget.dialog.C58423b.AbstractC58427b
        /* renamed from: a */
        public final void mo108011a(int i) {
            if (i < this.f74776b.size()) {
                TranslateLanguage translateLanguage = (TranslateLanguage) this.f74776b.get(i);
                ITranslateBarContract.ITranslateBarView.IViewDelegate bVar = (ITranslateBarContract.ITranslateBarView.IViewDelegate) this.f74775a.mo92555c();
                if (bVar != null) {
                    bVar.mo107973a(translateLanguage);
                }
            }
        }
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView
    /* renamed from: a */
    public void mo107969a(boolean z) {
        WebTranslateBar webTranslateBar = this.f74772c;
        if (webTranslateBar == null) {
            return;
        }
        if (z) {
            webTranslateBar.mo108027f();
        } else {
            webTranslateBar.mo108025d();
        }
    }

    /* renamed from: a */
    private final void m110878a(View view) {
        ViewParent parent;
        if (view != null && (parent = view.getParent()) != null) {
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            if (parent == null) {
                return;
            }
            if (parent != null) {
                ((ViewGroup) parent).removeView(view);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView
    /* renamed from: a */
    public void mo107966a(ITranslateBarContract.BarDisplayInfo aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "displayInfo");
        WebTranslateBar webTranslateBar = this.f74772c;
        if (webTranslateBar != null) {
            webTranslateBar.setVisibility(0);
            webTranslateBar.setOriginLangText(aVar.mo107942a().getName());
            webTranslateBar.setTargetLangText(aVar.mo107943b().getName());
            int c = aVar.mo107944c();
            if (c == 1) {
                webTranslateBar.mo108022a();
            } else if (c == 2) {
                webTranslateBar.mo108023b();
            } else if (c == 3) {
                webTranslateBar.mo108024c();
            }
        }
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView
    /* renamed from: a */
    public void mo107967a(ITranslateBarContract.BarSettingInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "barSettingInfo");
        TranslateBarSettingDialog.f74806e.mo108044a(this.f74771b, new TranslateBarSettingDialog.InitData(bVar.mo107948a(), bVar.mo107950c(), bVar.mo107949b(), bVar.mo107951d()), new C29972c(this));
    }

    public TranslateBarView(Activity activity, FrameLayout frameLayout) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(frameLayout, "parentContainer");
        this.f74771b = activity;
        this.f74773d = frameLayout;
    }

    @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView
    /* renamed from: a */
    public void mo107968a(List<? extends TranslateLanguage> list, TranslateLanguage translateLanguage) {
        String str;
        Intrinsics.checkParameterIsNotNull(list, "list");
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            TranslateLanguage translateLanguage2 = (TranslateLanguage) list.get(i2);
            if (translateLanguage != null) {
                str = translateLanguage.getCode();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, translateLanguage2.getCode())) {
                i = i2;
            }
            arrayList.add(translateLanguage2.getName());
        }
        Activity activity = this.f74771b;
        new C58423b(activity, UIUtils.getString(activity, R.string.Lark_Chat_ChooseTranslateLanguage), i, arrayList, new C29971b(this, list), true).mo197765f();
    }
}
