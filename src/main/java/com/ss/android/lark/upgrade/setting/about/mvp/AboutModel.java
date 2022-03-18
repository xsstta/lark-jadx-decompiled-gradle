package com.ss.android.lark.upgrade.setting.about.mvp;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.impl.C57642b;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.setting.about.MineUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000fH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\fH\u0016J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00122\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/upgrade/setting/about/mvp/AboutModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/upgrade/setting/about/mvp/IModel;", "()V", "mChatModuleDependency", "Lcom/ss/android/lark/upgrade/dependency/IUpgradeModuleDependency$IChatDependency;", "mContext", "Landroid/content/Context;", "checkNewVersion", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "create", "getApplicationPermissionDescUrl", "", "getBestPracticeUrl", "getLogFile", "Ljava/io/File;", "getReleaseNotesUrl", "getSecurityWhitePaperUrl", "getSpecialFunctionUrl", "getThirdPartySDKListUrl", "init", "initDependency", "isHasNewVersion", "isPrimaryHost", "sendFileMessageToSelfP2PChat", "file", "Ljava/lang/Void;", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.upgrade.setting.about.b.a */
public final class AboutModel extends BaseModel implements IModel {

    /* renamed from: a */
    private Context f142149a;

    /* renamed from: b */
    private AbstractC57608a.AbstractC57611c f142150b;

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m223944h();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: g */
    public boolean mo195802g() {
        C57642b a = C57642b.m223804a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeImpl.inst()");
        return a.mo195732d();
    }

    /* renamed from: h */
    private final void m223944h() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        Context a2 = a.mo177704a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "UpgradeModule.getDependency().context");
        this.f142149a = a2;
        m223945i();
    }

    /* renamed from: i */
    private final void m223945i() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57611c j = a.mo177716j();
        Intrinsics.checkExpressionValueIsNotNull(j, "UpgradeModule.getDependency().chatDependency");
        this.f142150b = j;
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: a */
    public String mo195793a() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57609a m = a.mo177719m();
        Intrinsics.checkExpressionValueIsNotNull(m, "UpgradeModule.getDependency().appConfigDependency");
        return m.mo177740a();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: b */
    public String mo195796b() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57609a m = a.mo177719m();
        Intrinsics.checkExpressionValueIsNotNull(m, "UpgradeModule.getDependency().appConfigDependency");
        return m.mo177741b();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: c */
    public String mo195798c() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57609a m = a.mo177719m();
        Intrinsics.checkExpressionValueIsNotNull(m, "UpgradeModule.getDependency().appConfigDependency");
        return m.mo177742c();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: d */
    public String mo195799d() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57609a m = a.mo177719m();
        Intrinsics.checkExpressionValueIsNotNull(m, "UpgradeModule.getDependency().appConfigDependency");
        return m.mo177743d();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: e */
    public String mo195800e() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57609a m = a.mo177719m();
        Intrinsics.checkExpressionValueIsNotNull(m, "UpgradeModule.getDependency().appConfigDependency");
        return m.mo177744e();
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: f */
    public String mo195801f() {
        AbstractC57608a a = C57607a.m223662a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UpgradeModule.getDependency()");
        AbstractC57608a.AbstractC57609a m = a.mo177719m();
        Intrinsics.checkExpressionValueIsNotNull(m, "UpgradeModule.getDependency().appConfigDependency");
        return m.mo177745f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/upgrade/setting/about/mvp/AboutModel$getLogFile$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/io/File;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "file", "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.a$a */
    public static final class C57685a implements IGetDataCallback<File> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f142151a;

        C57685a(IGetDataCallback iGetDataCallback) {
            this.f142151a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f142151a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(File file) {
            if (file == null || !file.exists()) {
                IGetDataCallback iGetDataCallback = this.f142151a;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult("file is not existed"));
                    return;
                }
                return;
            }
            IGetDataCallback iGetDataCallback2 = this.f142151a;
            if (iGetDataCallback2 != null) {
                iGetDataCallback2.onSuccess(file);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/upgrade/setting/about/mvp/AboutModel$sendFileMessageToSelfP2PChat$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/lang/Void;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_upgrade_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.upgrade.setting.about.b.a$b */
    public static final class C57686b implements IGetDataCallback<Void> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f142152a;

        C57686b(IGetDataCallback iGetDataCallback) {
            this.f142152a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(Void r2) {
            IGetDataCallback iGetDataCallback = this.f142152a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(null);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f142152a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: a */
    public void mo195794a(IGetDataCallback<File> iGetDataCallback) {
        MineUtils.f142185a.mo195853a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C57685a(iGetDataCallback)));
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: b */
    public void mo195797b(IGetDataCallback<Boolean> iGetDataCallback) {
        C57642b.m223804a().mo195713a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.upgrade.setting.about.mvp.IModel
    /* renamed from: a */
    public void mo195795a(File file, IGetDataCallback<Void> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(file, "file");
        AbstractC57608a.AbstractC57611c cVar = this.f142150b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatModuleDependency");
        }
        cVar.mo177734a(file, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C57686b(iGetDataCallback)));
    }
}
