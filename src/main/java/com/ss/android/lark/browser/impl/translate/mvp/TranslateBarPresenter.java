package com.ss.android.lark.browser.impl.translate.mvp;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.browser.impl.translate.entity.C29953a;
import com.ss.android.lark.browser.impl.translate.entity.TranslateLanguage;
import com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi;
import com.ss.android.lark.browser.impl.translate.jsb.params.ChangeBannerJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.DetectSourceLanguageJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.GetTranslateSettingJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.SendTranslateRequestJSParams;
import com.ss.android.lark.browser.impl.translate.jsb.params.UpdateBarStatusJSPrams;
import com.ss.android.lark.browser.impl.translate.jsb.result.ChangeBannerJSResult;
import com.ss.android.lark.browser.impl.translate.jsb.result.DetectSourceLanguageJSResult;
import com.ss.android.lark.browser.impl.translate.jsb.result.ErrorJSResult;
import com.ss.android.lark.browser.impl.translate.jsb.result.GetDetectSettingJSResult;
import com.ss.android.lark.browser.impl.translate.jsb.result.GetTranslateSettingJSResult;
import com.ss.android.lark.browser.impl.translate.jsb.result.SendTranslateRequestJSResult;
import com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract;
import com.ss.android.lark.log.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\u0004H\u0014J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u0019\u001a\u00020\u0012J\b\u0010\u001a\u001a\u00020\u000eH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarModel;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView$IViewDelegate;", "model", "view", "dependency", "Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$IPresenterDependency;", "(Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarModel;Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView;Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$IPresenterDependency;)V", "barState", "Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$BarStateHolder;", "createViewDelegate", "doCompatibleTranslate", "", "setting", "Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;", "needChoose", "", "doTranslate", "getJSHandlerApi", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "init", "url", "", "isReady", "openChooseDialog", "BarStateHolder", "Companion", "IPresenterDependency", "JSHandlerApiImpl", "ViewDelegate", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b */
public final class TranslateBarPresenter extends BasePresenter<ITranslateBarContract.ITranslateBarModel, ITranslateBarContract.ITranslateBarView, ITranslateBarContract.ITranslateBarView.IViewDelegate> {

    /* renamed from: c */
    public static final Companion f74753c = new Companion(null);

    /* renamed from: a */
    public final BarStateHolder f74754a = new BarStateHolder();

    /* renamed from: b */
    public final IPresenterDependency f74755b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$IPresenterDependency;", "", "getContext", "Landroid/content/Context;", "getJSCallerApi", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$ICallerApi;", "getWebUrl", "", "openTranslateSettingPage", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$c */
    public interface IPresenterDependency {
        /* renamed from: a */
        void mo107841a();

        /* renamed from: b */
        TranslateJSApi.ICallerApi mo107842b();

        /* renamed from: c */
        Context mo107843c();

        /* renamed from: d */
        String mo107844d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0015J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u001f\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$BarStateHolder;", "", "()V", "isBarClose", "", "()Z", "isBarOpen", "isReady", "originLang", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "getOriginLang", "()Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "targetLang", "getTargetLang", "translateSetting", "Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;", "getTranslateSetting", "()Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;", "setTranslateSetting", "(Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;)V", "translateState", "", "getTranslateState", "()Ljava/lang/String;", "setTranslateState", "(Ljava/lang/String;)V", "moveToInit", "", "onBarStatusUpdate", "state", "onDataReady", "recordBarClose", "recordBarOpen", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$a */
    public static final class BarStateHolder {

        /* renamed from: a */
        private C29953a f74756a;

        /* renamed from: b */
        private String f74757b;

        /* renamed from: c */
        private boolean f74758c;

        /* renamed from: h */
        public final void mo107998h() {
            this.f74758c = true;
        }

        /* renamed from: i */
        public final void mo107999i() {
            this.f74758c = false;
        }

        /* renamed from: a */
        public final C29953a mo107989a() {
            return this.f74756a;
        }

        /* renamed from: b */
        public final String mo107992b() {
            return this.f74757b;
        }

        /* renamed from: c */
        public final boolean mo107993c() {
            return !this.f74758c;
        }

        /* renamed from: d */
        public final boolean mo107994d() {
            if (this.f74756a != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final TranslateLanguage mo107995e() {
            C29953a aVar = this.f74756a;
            if (aVar != null) {
                return aVar.mo107865a();
            }
            return null;
        }

        /* renamed from: f */
        public final TranslateLanguage mo107996f() {
            C29953a aVar = this.f74756a;
            if (aVar != null) {
                return aVar.mo107869b();
            }
            return null;
        }

        /* renamed from: g */
        public final void mo107997g() {
            this.f74756a = null;
            this.f74757b = null;
            this.f74758c = false;
        }

        /* renamed from: a */
        public final void mo107990a(C29953a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "translateSetting");
            this.f74756a = aVar;
        }

        /* renamed from: a */
        public final void mo107991a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "state");
            this.f74757b = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$Companion;", "", "()V", "TAG", "", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$ViewDelegate;", "Lcom/ss/android/lark/browser/impl/translate/mvp/ITranslateBarContract$ITranslateBarView$IViewDelegate;", "(Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter;)V", "doRevertToOriginLang", "", "doTranslateToTargetLang", "needChoose", "", "isOriginState", "onBarClose", "onBarSettingChanged", "barSettingOp", "", "enable", "openBarSettingDialog", "openChooseLanguageDialog", "openTranslateSettingPage", "setTargetLangAndTranslate", "lang", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$e */
    public final class ViewDelegate implements ITranslateBarContract.ITranslateBarView.IViewDelegate {
        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: c */
        public void mo107976c() {
            TranslateBarPresenter.this.f74755b.mo107841a();
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: d */
        public void mo107977d() {
            TranslateBarPresenter.this.mo107988e();
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: e */
        public void mo107978e() {
            TranslateBarPresenter.this.f74754a.mo107999i();
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: f */
        public boolean mo107979f() {
            return Intrinsics.areEqual(TranslateBarPresenter.this.f74754a.mo107992b(), "origin");
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: a */
        public void mo107971a() {
            TranslateLanguage e = TranslateBarPresenter.this.f74754a.mo107995e();
            if (e != null) {
                TranslateLanguage f = TranslateBarPresenter.this.f74754a.mo107996f();
                if (f != null) {
                    TranslateBarPresenter.this.f74755b.mo107842b().mo107839a("revert", e, f);
                } else {
                    Log.m165382e("[doRevertToOriginLang], targetLang is null");
                }
            } else {
                Log.m165382e("[doRevertToOriginLang], originLang is null");
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: b */
        public void mo107975b() {
            C29953a a = TranslateBarPresenter.this.f74754a.mo107989a();
            if (a != null) {
                ITranslateBarContract.BarSettingInfo.Setter aVar = new ITranslateBarContract.BarSettingInfo.Setter();
                TranslateLanguage a2 = a.mo107865a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "setting.originLang");
                String name = a2.getName();
                Intrinsics.checkExpressionValueIsNotNull(name, "setting.originLang.name");
                ITranslateBarContract.BarSettingInfo a3 = aVar.mo107952a(name).mo107953a(a.mo107874d()).mo107956c(a.mo107875e()).mo107955b(a.mo107876f()).mo107954a();
                ITranslateBarContract.ITranslateBarView dVar = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                if (dVar != null) {
                    dVar.mo107967a(a3);
                    return;
                }
                return;
            }
            Log.m165383e("TranslateBarPresenter", "[openBarSettingDialog], translate setting is null");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: a */
        public void mo107974a(boolean z) {
            C29953a a = TranslateBarPresenter.this.f74754a.mo107989a();
            if (a != null) {
                TranslateBarPresenter.this.mo107982a(a, z);
            } else {
                Log.m165382e("[doTranslateToTargetLang], translate setting is null");
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: a */
        public void mo107973a(TranslateLanguage translateLanguage) {
            String str;
            TranslateLanguage a;
            Intrinsics.checkParameterIsNotNull(translateLanguage, "lang");
            TranslateLanguage e = TranslateBarPresenter.this.f74754a.mo107995e();
            if (e != null) {
                C29953a a2 = TranslateBarPresenter.this.f74754a.mo107989a();
                if (a2 == null || (a = a2.mo107865a()) == null) {
                    str = null;
                } else {
                    str = a.getCode();
                }
                if (TextUtils.equals(str, translateLanguage.getCode())) {
                    mo107971a();
                    return;
                }
                C29953a a3 = TranslateBarPresenter.this.f74754a.mo107989a();
                if (a3 != null) {
                    a3.mo107870b(translateLanguage);
                }
                TranslateBarPresenter.this.f74755b.mo107842b().mo107839a("updateTargetLang", e, translateLanguage);
                return;
            }
            Log.m165382e("[setTargetLangAndTranslate], originLang is null");
        }

        @Override // com.ss.android.lark.browser.impl.translate.mvp.ITranslateBarContract.ITranslateBarView.IViewDelegate
        /* renamed from: a */
        public void mo107972a(int i, boolean z) {
            TranslateLanguage e;
            if (i == 1) {
                C29953a a = TranslateBarPresenter.this.f74754a.mo107989a();
                if (a != null) {
                    a.mo107868a(z);
                }
                ITranslateBarContract.ITranslateBarModel cVar = (ITranslateBarContract.ITranslateBarModel) TranslateBarPresenter.this.getModel();
                if (cVar != null) {
                    cVar.mo107963a(z);
                }
            } else if (i == 2) {
                C29953a a2 = TranslateBarPresenter.this.f74754a.mo107989a();
                if (a2 != null) {
                    C29953a a3 = TranslateBarPresenter.this.f74754a.mo107989a();
                    if (a3 != null) {
                        a3.mo107873c(z);
                    }
                    ITranslateBarContract.ITranslateBarModel cVar2 = (ITranslateBarContract.ITranslateBarModel) TranslateBarPresenter.this.getModel();
                    if (cVar2 != null) {
                        cVar2.mo107962a(a2.mo107872c(), z);
                    }
                }
            } else if (i == 4 && (e = TranslateBarPresenter.this.f74754a.mo107995e()) != null) {
                C29953a a4 = TranslateBarPresenter.this.f74754a.mo107989a();
                if (a4 != null) {
                    a4.mo107871b(z);
                }
                ITranslateBarContract.ITranslateBarModel cVar3 = (ITranslateBarContract.ITranslateBarModel) TranslateBarPresenter.this.getModel();
                if (cVar3 != null) {
                    cVar3.mo107959a(e, z);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo107984a() {
        return this.f74754a.mo107994d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ITranslateBarContract.ITranslateBarView.IViewDelegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* renamed from: c */
    public final TranslateJSApi.IHandlerApi mo107986c() {
        return new JSHandlerApiImpl();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$openChooseDialog$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$f */
    public static final class C29968f extends UIGetDataCallback<List<? extends TranslateLanguage>> {

        /* renamed from: a */
        final /* synthetic */ TranslateBarPresenter f74766a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$f$a */
        public static final class RunnableC29969a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C29968f f74767a;

            /* renamed from: b */
            final /* synthetic */ List f74768b;

            /* renamed from: c */
            final /* synthetic */ TranslateLanguage f74769c;

            RunnableC29969a(C29968f fVar, List list, TranslateLanguage translateLanguage) {
                this.f74767a = fVar;
                this.f74768b = list;
                this.f74769c = translateLanguage;
            }

            public final void run() {
                ITranslateBarContract.ITranslateBarView dVar = (ITranslateBarContract.ITranslateBarView) this.f74767a.f74766a.getView();
                if (dVar != null) {
                    dVar.mo107968a(this.f74768b, this.f74769c);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C29968f(TranslateBarPresenter bVar) {
            this.f74766a = bVar;
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            super.onErrored(errorResult);
            Log.m165383e("TranslateBarPresenter", "[openChooseLanguageDialog], error=" + errorResult);
        }

        /* renamed from: a */
        public void onSuccessed(List<? extends TranslateLanguage> list) {
            TranslateLanguage b;
            super.onSuccessed(list);
            if (list != null) {
                List filterNotNull = CollectionsKt.filterNotNull(list);
                if (filterNotNull.isEmpty()) {
                    Log.m165383e("TranslateBarPresenter", "[openChooseLanguageDialog], list is empty");
                    return;
                }
                C29953a a = this.f74766a.f74754a.mo107989a();
                if (a == null || (b = a.mo107869b()) == null) {
                    Log.m165382e("[openChooseLanguageDialog], targetLang is null");
                } else {
                    UICallbackExecutor.post(new RunnableC29969a(this, filterNotNull, b));
                }
            } else {
                Log.m165383e("TranslateBarPresenter", "[openChooseLanguageDialog], data is null");
            }
        }
    }

    /* renamed from: e */
    public final void mo107988e() {
        ITranslateBarContract.ITranslateBarModel cVar = (ITranslateBarContract.ITranslateBarModel) getModel();
        if (cVar != null) {
            cVar.mo107958a(new C29968f(this));
        }
    }

    /* renamed from: d */
    public final void mo107987d() {
        C29953a a = this.f74754a.mo107989a();
        if (a == null) {
            Log.m165383e("TranslateBarPresenter", "[doTranslate], translate setting is null");
        } else if (!a.mo107877g()) {
            Context c = this.f74755b.mo107843c();
            if (c != null) {
                LKUIToast.show(c, (int) R.string.Lark_Chat_ImageTextUnsupportTranslate);
            }
        } else {
            m110834a(this, a, false, 2, null);
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$JSHandlerApiImpl;", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$IHandlerApi;", "(Lcom/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter;)V", "changeBanner", "", "params", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/ChangeBannerJSParams;", "callback", "Lcom/ss/android/lark/browser/impl/translate/jsb/TranslateJSApi$JSApiCallback;", "detectSourceLanguage", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/DetectSourceLanguageJSParams;", "getDetectSetting", "getTranslateSetting", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/GetTranslateSettingJSParams;", "sendTranslateRequest", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/SendTranslateRequestJSParams;", "updateBarStatus", "Lcom/ss/android/lark/browser/impl/translate/jsb/params/UpdateBarStatusJSPrams;", "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$d */
    public final class JSHandlerApiImpl implements TranslateJSApi.IHandlerApi {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$JSHandlerApiImpl$detectSourceLanguage$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/browser/impl/translate/entity/TranslateLanguage;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$d$a */
        public static final class C29965a implements IGetDataCallback<TranslateLanguage> {

            /* renamed from: a */
            final /* synthetic */ TranslateJSApi.JSApiCallback f74760a;

            C29965a(TranslateJSApi.JSApiCallback eVar) {
                this.f74760a = eVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f74760a.mo107886a(new ErrorJSResult(String.valueOf(errorResult)));
            }

            /* renamed from: a */
            public void onSuccess(TranslateLanguage translateLanguage) {
                if (translateLanguage != null) {
                    DetectSourceLanguageJSResult detectSourceLanguageJSResult = new DetectSourceLanguageJSResult();
                    detectSourceLanguageJSResult.setCode(translateLanguage.getCode());
                    detectSourceLanguageJSResult.setName(translateLanguage.getName());
                    this.f74760a.mo107885a(detectSourceLanguageJSResult);
                    return;
                }
                this.f74760a.mo107886a(new ErrorJSResult("result data is null"));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public JSHandlerApiImpl() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$JSHandlerApiImpl$getTranslateSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/browser/impl/translate/entity/WebTranslateSetting;", "getTranslateType", "", "setting", "isOriginAndTargetEq", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$d$b */
        public static final class C29966b implements IGetDataCallback<C29953a> {

            /* renamed from: a */
            final /* synthetic */ JSHandlerApiImpl f74761a;

            /* renamed from: b */
            final /* synthetic */ TranslateJSApi.JSApiCallback f74762b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f74762b.mo107886a(new ErrorJSResult(String.valueOf(errorResult)));
            }

            /* renamed from: c */
            private final boolean m110864c(C29953a aVar) {
                TranslateLanguage b = aVar.mo107869b();
                Intrinsics.checkExpressionValueIsNotNull(b, "setting.targetLang");
                TranslateLanguage a = aVar.mo107865a();
                Intrinsics.checkExpressionValueIsNotNull(a, "setting.originLang");
                return TextUtils.equals(b.getCode(), a.getCode());
            }

            /* renamed from: a */
            public void onSuccess(C29953a aVar) {
                if (aVar != null) {
                    String b = mo108002b(aVar);
                    GetTranslateSettingJSResult getTranslateSettingJSResult = new GetTranslateSettingJSResult();
                    getTranslateSettingJSResult.setType(b);
                    getTranslateSettingJSResult.setTargetLang(aVar.mo107869b());
                    this.f74762b.mo107885a(getTranslateSettingJSResult);
                    TranslateBarPresenter.this.f74754a.mo107990a(aVar);
                    return;
                }
                this.f74762b.mo107886a(new ErrorJSResult("result data is null"));
            }

            /* renamed from: b */
            public final String mo108002b(C29953a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "setting");
                if (!aVar.mo107877g() || m110864c(aVar) || aVar.mo107875e() || aVar.mo107876f()) {
                    return "disable";
                }
                if (aVar.mo107874d()) {
                    return "auto";
                }
                return "manual";
            }

            C29966b(JSHandlerApiImpl dVar, TranslateJSApi.JSApiCallback eVar) {
                this.f74761a = dVar;
                this.f74762b = eVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00052\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/browser/impl/translate/mvp/TranslateBarPresenter$JSHandlerApiImpl$sendTranslateRequest$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_browser_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.browser.impl.translate.mvp.b$d$c */
        public static final class C29967c implements IGetDataCallback<List<? extends String>> {

            /* renamed from: a */
            final /* synthetic */ String[] f74763a;

            /* renamed from: b */
            final /* synthetic */ TranslateJSApi.JSApiCallback f74764b;

            /* renamed from: a */
            public void onSuccess(List<String> list) {
                if (list != null) {
                    SendTranslateRequestJSResult sendTranslateRequestJSResult = new SendTranslateRequestJSResult();
                    sendTranslateRequestJSResult.setData(list);
                    this.f74764b.mo107885a(sendTranslateRequestJSResult);
                    return;
                }
                this.f74764b.mo107886a(new ErrorJSResult("result data is null"));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165384e("TranslateBarPresenter", "[sendTranslateRequest] error", errorResult);
                this.f74764b.mo107886a(new ErrorJSResult(String.valueOf(errorResult)));
            }

            C29967c(String[] strArr, TranslateJSApi.JSApiCallback eVar) {
                this.f74763a = strArr;
                this.f74764b = eVar;
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApi
        /* renamed from: a */
        public void mo107879a(TranslateJSApi.JSApiCallback eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "callback");
            ITranslateBarContract.ITranslateBarModel cVar = (ITranslateBarContract.ITranslateBarModel) TranslateBarPresenter.this.getModel();
            if (cVar != null) {
                eVar.mo107885a(new GetDetectSettingJSResult(cVar.mo107957a()));
            } else {
                eVar.mo107886a(new ErrorJSResult("result data is null"));
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApi
        /* renamed from: a */
        public void mo107880a(ChangeBannerJSParams changeBannerJSParams, TranslateJSApi.JSApiCallback eVar) {
            Intrinsics.checkParameterIsNotNull(changeBannerJSParams, "params");
            Intrinsics.checkParameterIsNotNull(eVar, "callback");
            ChangeBannerJSResult changeBannerJSResult = new ChangeBannerJSResult();
            changeBannerJSResult.setClose(TranslateBarPresenter.this.f74754a.mo107993c());
            eVar.mo107885a(changeBannerJSResult);
            if (!TranslateBarPresenter.this.f74754a.mo107993c()) {
                if (changeBannerJSParams.isShow()) {
                    ITranslateBarContract.ITranslateBarView dVar = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                    if (dVar != null) {
                        dVar.mo107969a(true);
                        return;
                    }
                    return;
                }
                ITranslateBarContract.ITranslateBarView dVar2 = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                if (dVar2 != null) {
                    dVar2.mo107970b(true);
                }
            }
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApi
        /* renamed from: a */
        public void mo107881a(DetectSourceLanguageJSParams detectSourceLanguageJSParams, TranslateJSApi.JSApiCallback eVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(detectSourceLanguageJSParams, "params");
            Intrinsics.checkParameterIsNotNull(eVar, "callback");
            String[] textList = detectSourceLanguageJSParams.getTextList();
            if (textList != null) {
                if (textList.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String[] textList2 = detectSourceLanguageJSParams.getTextList();
                    ITranslateBarContract.ITranslateBarModel cVar = (ITranslateBarContract.ITranslateBarModel) TranslateBarPresenter.this.getModel();
                    if (cVar != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textList2, "textList");
                        cVar.mo107964a(textList2, new C29965a(eVar));
                        return;
                    }
                    return;
                }
            }
            eVar.mo107886a(new ErrorJSResult("textList is empty"));
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApi
        /* renamed from: a */
        public void mo107882a(GetTranslateSettingJSParams getTranslateSettingJSParams, TranslateJSApi.JSApiCallback eVar) {
            Intrinsics.checkParameterIsNotNull(getTranslateSettingJSParams, "params");
            Intrinsics.checkParameterIsNotNull(eVar, "callback");
            String originLan = getTranslateSettingJSParams.getOriginLan();
            if (originLan != null) {
                String d = TranslateBarPresenter.this.f74755b.mo107844d();
                if (d != null) {
                    ITranslateBarContract.ITranslateBarModel cVar = (ITranslateBarContract.ITranslateBarModel) TranslateBarPresenter.this.getModel();
                    if (cVar != null) {
                        cVar.mo107960a(originLan, d, new C29966b(this, eVar));
                        return;
                    }
                    return;
                }
                eVar.mo107886a(new ErrorJSResult("webUrl is null"));
                return;
            }
            eVar.mo107886a(new ErrorJSResult("originLang is null"));
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApi
        /* renamed from: a */
        public void mo107883a(SendTranslateRequestJSParams sendTranslateRequestJSParams, TranslateJSApi.JSApiCallback eVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(sendTranslateRequestJSParams, "params");
            Intrinsics.checkParameterIsNotNull(eVar, "callback");
            String originLang = sendTranslateRequestJSParams.getOriginLang();
            if (originLang != null) {
                String targetLang = sendTranslateRequestJSParams.getTargetLang();
                if (targetLang != null) {
                    String[] words = sendTranslateRequestJSParams.getWords();
                    if (words != null) {
                        if (words.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            String[] words2 = sendTranslateRequestJSParams.getWords();
                            ITranslateBarContract.ITranslateBarModel cVar = (ITranslateBarContract.ITranslateBarModel) TranslateBarPresenter.this.getModel();
                            if (cVar != null) {
                                Intrinsics.checkExpressionValueIsNotNull(words2, "words");
                                cVar.mo107961a(originLang, targetLang, words2, new C29967c(words2, eVar));
                                return;
                            }
                            return;
                        }
                    }
                    eVar.mo107886a(new ErrorJSResult("words is empty"));
                    return;
                }
                eVar.mo107886a(new ErrorJSResult("targetLang is null"));
                return;
            }
            eVar.mo107886a(new ErrorJSResult("originLang is null"));
        }

        @Override // com.ss.android.lark.browser.impl.translate.jsb.TranslateJSApi.IHandlerApi
        /* renamed from: a */
        public void mo107884a(UpdateBarStatusJSPrams updateBarStatusJSPrams, TranslateJSApi.JSApiCallback eVar) {
            ITranslateBarContract.ITranslateBarView dVar;
            Intrinsics.checkParameterIsNotNull(updateBarStatusJSPrams, "params");
            Intrinsics.checkParameterIsNotNull(eVar, "callback");
            TranslateLanguage originLang = updateBarStatusJSPrams.getOriginLang();
            if (originLang != null) {
                TranslateLanguage targetLang = updateBarStatusJSPrams.getTargetLang();
                if (targetLang == null) {
                    eVar.mo107886a(new ErrorJSResult("targetLang is null"));
                } else if (!TranslateBarPresenter.this.f74754a.mo107994d()) {
                    eVar.mo107886a(new ErrorJSResult("call translate setting first"));
                } else {
                    String translateStatus = updateBarStatusJSPrams.getTranslateStatus();
                    if (translateStatus != null) {
                        switch (translateStatus.hashCode()) {
                            case -1281977283:
                                if (translateStatus.equals("failed")) {
                                    ITranslateBarContract.ITranslateBarView dVar2 = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                                    if (dVar2 != null) {
                                        dVar2.mo107966a(new ITranslateBarContract.BarDisplayInfo(originLang, targetLang, 1));
                                    }
                                    BarStateHolder aVar = TranslateBarPresenter.this.f74754a;
                                    String translateStatus2 = updateBarStatusJSPrams.getTranslateStatus();
                                    Intrinsics.checkExpressionValueIsNotNull(translateStatus2, "params.translateStatus");
                                    aVar.mo107991a(translateStatus2);
                                    TranslateBarPresenter.this.f74754a.mo107998h();
                                    return;
                                }
                                break;
                            case -1008619738:
                                if (translateStatus.equals("origin")) {
                                    ITranslateBarContract.ITranslateBarView dVar3 = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                                    if (dVar3 != null) {
                                        dVar3.mo107966a(new ITranslateBarContract.BarDisplayInfo(originLang, targetLang, 1));
                                    }
                                    BarStateHolder aVar2 = TranslateBarPresenter.this.f74754a;
                                    String translateStatus22 = updateBarStatusJSPrams.getTranslateStatus();
                                    Intrinsics.checkExpressionValueIsNotNull(translateStatus22, "params.translateStatus");
                                    aVar2.mo107991a(translateStatus22);
                                    TranslateBarPresenter.this.f74754a.mo107998h();
                                    return;
                                }
                                break;
                            case -880905839:
                                if (translateStatus.equals("target")) {
                                    ITranslateBarContract.ITranslateBarView dVar4 = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                                    if (dVar4 != null) {
                                        dVar4.mo107966a(new ITranslateBarContract.BarDisplayInfo(originLang, targetLang, 2));
                                    }
                                    C29953a a = TranslateBarPresenter.this.f74754a.mo107989a();
                                    if (!(a == null || a.mo107874d() || (dVar = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView()) == null)) {
                                        dVar.mo107965a();
                                    }
                                    BarStateHolder aVar22 = TranslateBarPresenter.this.f74754a;
                                    String translateStatus222 = updateBarStatusJSPrams.getTranslateStatus();
                                    Intrinsics.checkExpressionValueIsNotNull(translateStatus222, "params.translateStatus");
                                    aVar22.mo107991a(translateStatus222);
                                    TranslateBarPresenter.this.f74754a.mo107998h();
                                    return;
                                }
                                break;
                            case 336650556:
                                if (translateStatus.equals("loading")) {
                                    if (TextUtils.equals(originLang.getCode(), targetLang.getCode())) {
                                        ITranslateBarContract.ITranslateBarView dVar5 = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                                        if (dVar5 != null) {
                                            dVar5.mo107966a(new ITranslateBarContract.BarDisplayInfo(originLang, targetLang, 1));
                                        }
                                        TranslateBarPresenter.this.mo107988e();
                                    } else {
                                        ITranslateBarContract.ITranslateBarView dVar6 = (ITranslateBarContract.ITranslateBarView) TranslateBarPresenter.this.getView();
                                        if (dVar6 != null) {
                                            dVar6.mo107966a(new ITranslateBarContract.BarDisplayInfo(originLang, targetLang, 3));
                                        }
                                    }
                                    BarStateHolder aVar222 = TranslateBarPresenter.this.f74754a;
                                    String translateStatus2222 = updateBarStatusJSPrams.getTranslateStatus();
                                    Intrinsics.checkExpressionValueIsNotNull(translateStatus2222, "params.translateStatus");
                                    aVar222.mo107991a(translateStatus2222);
                                    TranslateBarPresenter.this.f74754a.mo107998h();
                                    return;
                                }
                                break;
                        }
                    }
                    Log.m165383e("TranslateBarPresenter", "translate status not matched, status=" + updateBarStatusJSPrams.getTranslateStatus());
                    eVar.mo107886a(new ErrorJSResult("translate status not matched"));
                }
            } else {
                eVar.mo107886a(new ErrorJSResult("originLang is null"));
            }
        }
    }

    /* renamed from: a */
    public final void mo107983a(String str) {
        this.f74754a.mo107997g();
        ITranslateBarContract.ITranslateBarView dVar = (ITranslateBarContract.ITranslateBarView) getView();
        if (dVar != null) {
            ITranslateBarContract.ITranslateBarView.C29961a.m110813a(dVar, false, 1, null);
        }
    }

    /* renamed from: a */
    public final void mo107982a(C29953a aVar, boolean z) {
        if (!Intrinsics.areEqual(this.f74754a.mo107992b(), "target")) {
            TranslateLanguage a = aVar.mo107865a();
            Intrinsics.checkExpressionValueIsNotNull(a, "setting.originLang");
            TranslateLanguage b = aVar.mo107869b();
            Intrinsics.checkExpressionValueIsNotNull(b, "setting.targetLang");
            if (!TextUtils.equals(a.getCode(), b.getCode())) {
                TranslateJSApi.ICallerApi b2 = this.f74755b.mo107842b();
                TranslateLanguage a2 = aVar.mo107865a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "setting.originLang");
                TranslateLanguage b3 = aVar.mo107869b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "setting.targetLang");
                b2.mo107839a("translate", a2, b3);
                return;
            }
        }
        if (z) {
            mo107988e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslateBarPresenter(ITranslateBarContract.ITranslateBarModel cVar, ITranslateBarContract.ITranslateBarView dVar, IPresenterDependency cVar2) {
        super(cVar, dVar);
        Intrinsics.checkParameterIsNotNull(cVar, "model");
        Intrinsics.checkParameterIsNotNull(dVar, "view");
        Intrinsics.checkParameterIsNotNull(cVar2, "dependency");
        this.f74755b = cVar2;
    }

    /* renamed from: a */
    static /* synthetic */ void m110834a(TranslateBarPresenter bVar, C29953a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        bVar.mo107982a(aVar, z);
    }
}
