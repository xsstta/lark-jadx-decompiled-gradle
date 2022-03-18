package com.ss.android.lark.upgrade.setting.about.mvp;

import android.app.Activity;
import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIDelayGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.impl.C57642b;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.setting.about.mvp.IView;
import com.ss.android.lark.upgrade.statistics.UpgradeHitPoint;
import com.ss.android.lark.utils.UIHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00122\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0012\u0013B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u0011\u001a\u00020\u000bH\u0002R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IModel;", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IView;", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/upgrade/setting/about/mvp/IModel;Lcom/ss/android/lark/upgrade/setting/about/mvp/IView;)V", "mContext", "Landroid/content/Context;", "checkNewVersion", "", "create", "createViewDelegate", "getAboutSafeUrl", "init", "initUpdateStaus", "updateUpgradeView", "Companion", "ViewDelegate", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.b.b */
public final class AboutPresenter extends BasePresenter<IModel, IView, IView.Delegate> {

    /* renamed from: b */
    public static final Companion f142153b = new Companion(null);

    /* renamed from: a */
    public Context f142154a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter$Companion;", "", "()V", "TAG", "", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter$ViewDelegate;", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IView$Delegate;", "(Lcom/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter;)V", "onClickBestPractice", "", "onClickCheckNewVersion", "onClickLogo", "onClickPrivacyPolicy", "onClickReleaseNotes", "onClickSpecialFunction", "onClickUserAgreement", "onShowUpgradeDialog", "activity", "Landroid/app/Activity;", "sendLogMessageToSelf", "file", "Ljava/io/File;", "showGetChatError", "errorMsg", "", "uploadLog", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.b$b */
    public final class ViewDelegate implements IView.Delegate {
        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: g */
        public void mo195818g() {
            m223965h();
        }

        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: a */
        public void mo195809a() {
            AboutPresenter.this.mo195806b();
        }

        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: e */
        public void mo195816e() {
            AbstractC57608a a = C57607a.m223662a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
            AbstractC57608a.AbstractC57619k k = a.mo177717k();
            if (k != null) {
                k.mo177737a(AboutPresenter.m223958a(AboutPresenter.this));
            }
        }

        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: f */
        public void mo195817f() {
            AbstractC57608a a = C57607a.m223662a();
            Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
            AbstractC57608a.AbstractC57619k k = a.mo177717k();
            if (k != null) {
                k.mo177738b(AboutPresenter.m223958a(AboutPresenter.this));
            }
        }

        /* renamed from: h */
        private final void m223965h() {
            ((IView) AboutPresenter.this.getView()).mo195822a();
            ((IModel) AboutPresenter.this.getModel()).mo195794a(new UIGetDataCallback(new C57688b(this)));
        }

        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: b */
        public void mo195813b() {
            String a = ((IModel) AboutPresenter.this.getModel()).mo195793a();
            if (a == null) {
                Log.m165397w("MineAboutLarkPresenter", "get release notes url failed");
            } else {
                ((IView) AboutPresenter.this.getView()).mo195826b(a);
            }
        }

        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: c */
        public void mo195814c() {
            String b = ((IModel) AboutPresenter.this.getModel()).mo195796b();
            if (b == null) {
                Log.m165397w("MineAboutLarkPresenter", "get best practice url failed");
            } else {
                ((IView) AboutPresenter.this.getView()).mo195826b(b);
            }
        }

        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: d */
        public void mo195815d() {
            String c = ((IModel) AboutPresenter.this.getModel()).mo195798c();
            if (c == null) {
                Log.m165397w("MineAboutLarkPresenter", "get special function url failed");
            } else {
                ((IView) AboutPresenter.this.getView()).mo195826b(c);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter$ViewDelegate$sendLogMessageToSelf$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/lang/Void;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.upgrade.setting.about.b.b$b$a */
        public static final class C57687a implements IGetDataCallback<Void> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f142156a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C57687a(ViewDelegate bVar) {
                this.f142156a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(Void r3) {
                String string = UIHelper.getString(R.string.Lark_Legacy_AboutUploadLogIng);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Legacy_AboutUploadLogIng)");
                ((IView) AboutPresenter.this.getView()).mo195823a(string);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ViewDelegate bVar = this.f142156a;
                String string = UIHelper.getString(R.string.Lark_Legacy_LogErrorUploadFail);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…egacy_LogErrorUploadFail)");
                bVar.mo195812a(string);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter$ViewDelegate$uploadLog$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/io/File;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "file", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.upgrade.setting.about.b.b$b$b */
        public static final class C57688b implements IGetDataCallback<File> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f142157a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C57688b(ViewDelegate bVar) {
                this.f142157a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(File file) {
                Intrinsics.checkParameterIsNotNull(file, "file");
                ((IView) AboutPresenter.this.getView()).mo195825b();
                this.f142157a.mo195811a(file);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IView) AboutPresenter.this.getView()).mo195825b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        /* renamed from: a */
        public final void mo195811a(File file) {
            ((IModel) AboutPresenter.this.getModel()).mo195795a(file, new C57687a(this));
        }

        @Override // com.ss.android.lark.upgrade.setting.about.mvp.IView.Delegate
        /* renamed from: a */
        public void mo195810a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Activity activity2 = activity;
            if (NetworkUtils.m153070c(activity2)) {
                C57642b.m223804a().mo195711a(activity2);
                return;
            }
            String string = UIHelper.getString(R.string.Lark_Legacy_NetUnavailableNow);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Legacy_NetUnavailableNow)");
            ((IView) AboutPresenter.this.getView()).mo195823a(string);
        }

        /* renamed from: a */
        public final void mo195812a(String str) {
            ((IView) AboutPresenter.this.getView()).mo195823a(str);
            Log.m165397w("MineAboutLarkPresenter", "ErrorMsg: " + str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m223959e();
    }

    /* renamed from: d */
    public final void mo195808d() {
        ((IView) getView()).mo195835h();
    }

    /* renamed from: c */
    public final void mo195807c() {
        ((IView) getView()).mo195824a(((IModel) getModel()).mo195802g());
    }

    /* renamed from: e */
    private final void m223959e() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        Context a2 = a.mo177704a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UpgradeModule.getDependency().context");
        this.f142154a = a2;
        ((IView) getView()).mo195827c();
        mo195806b();
        m223960f();
    }

    /* renamed from: b */
    public final void mo195806b() {
        ((IView) getView()).mo195834g();
        ((IModel) getModel()).mo195797b(new UIDelayGetDataCallback(new C57689c(this), 1000));
    }

    /* renamed from: f */
    private final void m223960f() {
        boolean z;
        boolean z2;
        String d = ((IModel) getModel()).mo195799d();
        String str = d;
        boolean z3 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m165397w("MineAboutLarkPresenter", "get security white paper url failed");
            ((IView) getView()).mo195829d();
        } else {
            ((IView) getView()).mo195828c(d);
        }
        String e = ((IModel) getModel()).mo195800e();
        String str2 = e;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Log.m165397w("MineAboutLarkPresenter", "get application permission desc url failed");
            ((IView) getView()).mo195831e();
        } else {
            ((IView) getView()).mo195830d(e);
        }
        String f = ((IModel) getModel()).mo195801f();
        String str3 = f;
        if (str3 == null || str3.length() == 0) {
            z3 = true;
        }
        if (z3) {
            Log.m165397w("MineAboutLarkPresenter", "get third party SDK list url failed");
            ((IView) getView()).mo195833f();
            return;
        }
        ((IView) getView()).mo195832e(f);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/upgrade/setting/about/mvp/AboutPresenter$checkNewVersion$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "(Ljava/lang/Boolean;)V", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.b$c */
    public static final class C57689c implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AboutPresenter f142158a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57689c(AboutPresenter bVar) {
            this.f142158a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            UpgradeHitPoint.f141994a.mo195631c();
            this.f142158a.mo195807c();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165397w("MineAboutLarkPresenter", "checkNewVersion onError");
            this.f142158a.mo195807c();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m223958a(AboutPresenter bVar) {
        Context context = bVar.f142154a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AboutPresenter(IModel cVar, IView dVar) {
        super(cVar, dVar);
        Intrinsics.checkParameterIsNotNull(cVar, "model");
        Intrinsics.checkParameterIsNotNull(dVar, "view");
    }
}
