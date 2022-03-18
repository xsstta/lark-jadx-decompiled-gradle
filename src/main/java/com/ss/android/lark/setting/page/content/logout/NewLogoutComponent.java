package com.ss.android.lark.setting.page.content.logout;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.setting.BaseItemView;
import com.ss.android.lark.setting.ButtonItemView;
import com.ss.android.lark.setting.C54115c;
import com.ss.android.lark.setting.dependency.ISettingDependency;
import com.ss.android.lark.setting.export.AbstractC54125a;
import com.ss.android.lark.setting.export.AbstractC54126b;
import com.ss.android.lark.setting.export.SystemSettingComponentType;
import com.ss.android.lark.setting.page.content.base.LogoutUtils;
import com.ss.android.lark.setting.page.content.common.statistics.DisplayAppearanceSettingHitPoint;
import com.ss.android.lark.setting.page.statistics.SettingHitPoint;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\t*\u0002\u0011\u001c\u0018\u0000 62\u00020\u0001:\u0003678B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u0014H\u0016J\b\u0010-\u001a\u00020\u0014H\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020'00H\u0002J\b\u00101\u001a\u00020\u001fH\u0002J\b\u00102\u001a\u00020\u001fH\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\b\u00104\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020\u001fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001d¨\u00069"}, d2 = {"Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent;", "Lcom/ss/android/lark/setting/export/IComponent;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "contextWeakRef", "Ljava/lang/ref/WeakReference;", "loadingDialog", "Lcom/ss/android/lark/setting/page/content/logout/LogoutLoadingDialog;", "loginDependency", "Lcom/ss/android/lark/setting/dependency/ISettingDependency$ILoginDependency;", "logoutAllUserCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "logoutComponentClickListener", "com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$logoutComponentClickListener$1", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$logoutComponentClickListener$1;", "mContentView", "Landroid/view/View;", "getMContentView", "()Landroid/view/View;", "mContentView$delegate", "Lkotlin/Lazy;", "mDisposable", "Lio/reactivex/disposables/Disposable;", "newLogoutClickListener", "com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$newLogoutClickListener$1", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$newLogoutClickListener$1;", "backFeed", "", "create", "destroy", "enterLogout", "isSingleLogout", "", "generateButtonView", "getComponentTag", "", "getCurrentTenantName", "haveSessionAccountGreaterThanOne", "logoutAllUsers", "onSingleLogout", "provideContent", "provideDesktopContent", "reload", "setupItemList", "", "showAllLogoutDialog", "showInterceptAccountView", "showNewLogoutDialog", "showOldLogoutDialog", "showSingleLogoutDialog", "Companion", "SettingLogoutEndContext", "SettingUserSwitchEndContext", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.b.b */
public final class NewLogoutComponent implements AbstractC54125a {

    /* renamed from: e */
    public static final Companion f134023e = new Companion(null);

    /* renamed from: a */
    public WeakReference<Activity> f134024a;

    /* renamed from: b */
    public final CallbackManager f134025b;

    /* renamed from: c */
    public final ISettingDependency.ILoginDependency f134026c;

    /* renamed from: d */
    public final LogoutLoadingDialog f134027d;

    /* renamed from: f */
    private final Lazy f134028f = LazyKt.lazy(new C54140g(this));

    /* renamed from: g */
    private Disposable f134029g;

    /* renamed from: h */
    private final IGetDataCallback<SettingLogoutEndContext> f134030h;

    /* renamed from: i */
    private final C54141h f134031i;

    /* renamed from: j */
    private final View$OnClickListenerC54139f f134032j;

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: a */
    public /* synthetic */ void mo132391a() {
        AbstractC54126b.CC.$default$a(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    public /* synthetic */ void aA_() {
        AbstractC54126b.CC.$default$aA_(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: d */
    public void mo132396d() {
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: f */
    public /* synthetic */ boolean mo132398f() {
        return AbstractC54125a.CC.$default$f(this);
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: g */
    public /* synthetic */ void mo132399g() {
        AbstractC54126b.CC.$default$g(this);
    }

    /* renamed from: h */
    public final View mo185308h() {
        return (View) this.f134028f.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$Companion;", "", "()V", "ALL_LOGOUT_IDNEX", "", "SINGLE_LOGOUT_IDNEX", "SP_KEY_FORM_LOGOUT", "", "TAG", "TIMER_DELAY", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "", "isSuccess", "", "(Z)V", "()Z", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$b */
    public static final class SettingLogoutEndContext {

        /* renamed from: a */
        private final boolean f134033a;

        /* renamed from: a */
        public final boolean mo185319a() {
            return this.f134033a;
        }

        public SettingLogoutEndContext(boolean z) {
            this.f134033a = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$showAllLogoutDialog$2", "Landroid/content/DialogInterface$OnClickListener;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$k */
    public static final class DialogInterface$OnClickListenerC54145k implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC54145k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SettingHitPoint.f134851a.mo186406f(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$showSingleLogoutDialog$2", "Landroid/content/DialogInterface$OnClickListener;", "onClick", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$o */
    public static final class DialogInterface$OnClickListenerC54149o implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC54149o() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DisplayAppearanceSettingHitPoint.m210249a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$g */
    static final class C54140g extends Lambda implements Function0<View> {
        final /* synthetic */ NewLogoutComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54140g(NewLogoutComponent bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            return this.this$0.mo185309i();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    public View az_() {
        return mo185308h();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: b */
    public View mo132394b() {
        return mo185308h();
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54126b
    /* renamed from: e */
    public void mo132397e() {
        Disposable disposable = this.f134029g;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.ss.android.lark.setting.export.AbstractC54125a
    /* renamed from: c */
    public String mo132395c() {
        String value = SystemSettingComponentType.NEW_LOGOUT.getValue();
        Intrinsics.checkExpressionValueIsNotNull(value, "SystemSettingComponentType.NEW_LOGOUT.value");
        return value;
    }

    /* renamed from: q */
    public final void mo185317q() {
        UICallbackExecutor.execute(new RunnableC54136c(this));
    }

    /* renamed from: r */
    public final boolean mo185318r() {
        if (this.f134026c.mo178357b().size() > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final String m210183s() {
        String tenantName;
        TenantInfo c = this.f134026c.mo178359c();
        if (c == null || (tenantName = c.getTenantName()) == null) {
            return "";
        }
        return tenantName;
    }

    /* renamed from: l */
    public final void mo185312l() {
        this.f134027d.show();
        ICallback wrapAndAddCallback = this.f134025b.wrapAndAddCallback(this.f134030h);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndA…ck(logoutAllUserCallback)");
        LogoutUtils.m210180a((IGetDataCallback) wrapAndAddCallback);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$c */
    public static final class RunnableC54136c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134034a;

        RunnableC54136c(NewLogoutComponent bVar) {
            this.f134034a = bVar;
        }

        public final void run() {
            Activity activity;
            Activity activity2;
            int a = C54115c.m210080a().mo178295g().mo178362a();
            WeakReference<Activity> weakReference = this.f134034a.f134024a;
            if (!(weakReference == null || (activity2 = weakReference.get()) == null)) {
                activity2.setResult(a, new Intent().putExtra("key_is_from_logout", true));
            }
            WeakReference<Activity> weakReference2 = this.f134034a.f134024a;
            if (weakReference2 != null && (activity = weakReference2.get()) != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: t */
    private final List<String> m210184t() {
        ArrayList arrayList = new ArrayList();
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Accounts_LogOutNameAccountButton, "TenantName", m210183s());
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(…, getCurrentTenantName())");
        arrayList.add(mustacheFormat);
        String string = UIHelper.getString(R.string.Lark_Accounts_LogOutAllAccountsButton);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_LogOutAllAccountsButton)");
        arrayList.add(string);
        return arrayList;
    }

    /* renamed from: o */
    public final void mo185315o() {
        mo185308h().setEnabled(false);
        this.f134027d.show();
        this.f134029g = Observable.timer((long) HwBuildEx.VersionCodes.CUR_DEVELOPMENT, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C54146l(this));
    }

    /* renamed from: i */
    public final View mo185309i() {
        BaseItemView a = new ButtonItemView.C54108a(this.f134024a.get()).mo185184c(UIHelper.getString(R.string.Lark_Legacy_LarkLogout)).mo185182b(UIUtils.getColor(this.f134024a.get(), R.color.text_title)).mo185181a(this.f134032j).mo185176a(true).mo185179b(true).mo185177a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ButtonItemView.Builder(c…\n                .build()");
        return a;
    }

    /* renamed from: j */
    public final void mo185310j() {
        Activity activity = this.f134024a.get();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "contextWeakRef.get()!!");
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(activity);
        String string = UIHelper.getString(R.string.Lark_Settings_LogOut);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Settings_LogOut)");
        List<? extends CharSequence> singletonList = Collections.singletonList(UIHelper.getString(R.string.Lark_Legacy_LarkLogout));
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis….Lark_Legacy_LarkLogout))");
        String string2 = UIHelper.getString(R.string.Lark_Accounts_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_Accounts_Cancel)");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.title(string)).titleColor(R.color.text_caption)).mo90870a(singletonList)).mo90869a(new C54147m(this))).mo90876c(R.color.function_danger_500)).addActionButton(R.id.ud_dialog_btn_cancel, string2, (DialogInterface.OnClickListener) null)).show();
    }

    /* renamed from: k */
    public final void mo185311k() {
        Activity activity = this.f134024a.get();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "contextWeakRef.get()!!");
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(activity);
        String string = UIHelper.getString(R.string.Lark_Accounts_LogOutAllAccountsConfirmMobile);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…AllAccountsConfirmMobile)");
        List<? extends CharSequence> singletonList = Collections.singletonList(UIHelper.getString(R.string.Lark_Accounts_LogOutAllAccountsButton));
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…LogOutAllAccountsButton))");
        String string2 = UIHelper.getString(R.string.Lark_Accounts_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.string.Lark_Accounts_Cancel)");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.title(string)).mo90870a(singletonList)).mo90869a(new C54144j(this))).mo90876c(R.color.function_danger_500)).addActionButton(R.id.ud_dialog_btn_cancel, string2, new DialogInterface$OnClickListenerC54145k())).show();
    }

    /* renamed from: m */
    public final void mo185313m() {
        Activity activity = this.f134024a.get();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "contextWeakRef.get()!!");
        String string = UIHelper.getString(R.string.Lark_Accounts_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Accounts_Cancel)");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(activity).mo90870a(m210184t())).mo90869a(this.f134031i)).addActionButton(R.id.ud_dialog_btn_cancel, string, (DialogInterface.OnClickListener) null)).autoDismiss(true)).show();
    }

    /* renamed from: n */
    public final void mo185314n() {
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Accounts_LogOutNameAccountButton, "TenantName", m210183s());
        String mustacheFormat2 = UIHelper.mustacheFormat((int) R.string.Lark_Accounts_LogOutNameAccountConfirmMobile, "TenantName", m210183s());
        Activity activity = this.f134024a.get();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity, "contextWeakRef.get()!!");
        UDActionPanelBuilder aVar = new UDActionPanelBuilder(activity);
        Intrinsics.checkExpressionValueIsNotNull(mustacheFormat2, "titleStr");
        String string = UIHelper.getString(R.string.Lark_Accounts_Cancel);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.string.Lark_Accounts_Cancel)");
        ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) aVar.title(mustacheFormat2)).mo90870a(CollectionsKt.listOf(mustacheFormat))).mo90876c(R.color.function_danger_500)).mo90869a(new C54148n(this))).addActionButton(R.id.ud_dialog_btn_cancel, string, new DialogInterface$OnClickListenerC54149o())).show();
    }

    /* renamed from: p */
    public final void mo185316p() {
        this.f134027d.show();
        TenantInfo c = this.f134026c.mo178359c();
        UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new C54142i(this, c));
        if (!mo185318r()) {
            mo185312l();
        } else if (c != null && !TextUtils.isEmpty(c.getUserId())) {
            DisplayAppearanceSettingHitPoint.m210249a(true);
            ISettingDependency.ILoginDependency lVar = this.f134026c;
            String userId = c.getUserId();
            Intrinsics.checkExpressionValueIsNotNull(userId, "currentTenant.userId");
            ICallback wrapAndAddCallback = this.f134025b.wrapAndAddCallback(uIGetDataCallback);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndAddCallback(callback)");
            lVar.mo178355a(userId, (IGetDataCallback) wrapAndAddCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$onSingleLogout$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$i */
    public static final class C54142i implements IGetDataCallback<SettingLogoutEndContext> {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134040a;

        /* renamed from: b */
        final /* synthetic */ TenantInfo f134041b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$onSingleLogout$callback$1$onSuccess$1$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "user", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.setting.page.content.b.b$i$a */
        public static final class C54143a implements IGetDataCallback<User> {

            /* renamed from: a */
            final /* synthetic */ C54142i f134042a;

            C54143a(C54142i iVar) {
                this.f134042a = iVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                this.f134042a.f134040a.mo185317q();
                Log.m165397w("SingleLogoutComponent", "switch to next valid user falid when logout an user");
            }

            /* renamed from: a */
            public void onSuccess(User user) {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("have switched to next user: ");
                if (user != null) {
                    str = user.userId;
                } else {
                    str = null;
                }
                sb.append(str);
                Log.m165389i("SingleLogoutComponent", sb.toString());
                this.f134042a.f134040a.mo185317q();
            }
        }

        /* renamed from: a */
        public void onSuccess(SettingLogoutEndContext bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f134040a.f134027d.dismiss();
            if (!bVar.mo185319a()) {
                Log.m165397w("SingleLogoutComponent", "single logout faild! isSuccess: false");
                return;
            }
            Log.m165389i("SingleLogoutComponent", "single account logout success！");
            C57744a.m224104a().putBoolean("sp_key_from_logout", true);
            if (this.f134040a.f134024a.get() != null) {
                ISettingDependency.ILoginDependency lVar = this.f134040a.f134026c;
                Activity activity = this.f134040a.f134024a.get();
                if (activity == null) {
                    Intrinsics.throwNpe();
                }
                Intrinsics.checkExpressionValueIsNotNull(activity, "contextWeakRef.get()!!");
                ICallback wrapAndAddCallback = this.f134040a.f134025b.wrapAndAddCallback(new C54143a(this));
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "callbackManager.wrapAndA… }\n                    })");
                lVar.mo178352a(activity, 2, (IGetDataCallback) wrapAndAddCallback);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            String str;
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134040a.f134027d.dismiss();
            Activity activity = this.f134040a.f134024a.get();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                Activity activity2 = activity;
                String debugMsg = errorResult.getDebugMsg();
                if (debugMsg == null) {
                    debugMsg = "";
                }
                UDToast.show(activity2, debugMsg, (int) R.drawable.ud_icon_more_close_outlined);
            }
            StringBuilder sb = new StringBuilder();
            TenantInfo tenantInfo = this.f134041b;
            if (tenantInfo != null) {
                str = tenantInfo.getTenantName();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" logout failed!");
            Log.m165383e("SingleLogoutComponent", sb.toString());
        }

        C54142i(NewLogoutComponent bVar, TenantInfo tenantInfo) {
            this.f134040a = bVar;
            this.f134041b = tenantInfo;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$logoutAllUserCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/setting/page/content/logout/NewLogoutComponent$SettingLogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$e */
    public static final class C54138e implements IGetDataCallback<SettingLogoutEndContext> {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134037a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54138e(NewLogoutComponent bVar) {
            this.f134037a = bVar;
        }

        /* renamed from: a */
        public void onSuccess(SettingLogoutEndContext bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f134037a.f134027d.dismiss();
            Log.m165389i("SingleLogoutComponent", "logout all users success!");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f134037a.f134027d.dismiss();
            Activity activity = this.f134037a.f134024a.get();
            if (activity != null) {
                Intrinsics.checkExpressionValueIsNotNull(activity, "it");
                Activity activity2 = activity;
                String debugMsg = errorResult.getDebugMsg();
                if (debugMsg == null) {
                    debugMsg = "";
                }
                UDToast.show(activity2, debugMsg, (int) R.drawable.ud_icon_more_close_outlined);
            }
            Log.m165383e("SingleLogoutComponent", "logout all users failed!");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$logoutComponentClickListener$1", "Landroid/view/View$OnClickListener;", "onClick", "", "v", "Landroid/view/View;", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$f */
    public static final class View$OnClickListenerC54139f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134038a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnClickListenerC54139f(NewLogoutComponent bVar) {
            this.f134038a = bVar;
        }

        public void onClick(View view) {
            boolean a = C54115c.m210080a().mo178291e().mo178337a("lark.core.exit_single");
            Log.m165389i("SingleLogoutComponent", "isSingleLogoutShow=" + a);
            if (!a) {
                this.f134038a.mo185310j();
            } else if (this.f134038a.mo185318r()) {
                this.f134038a.mo185313m();
            } else {
                this.f134038a.mo185314n();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$newLogoutClickListener$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$h */
    public static final class C54141h implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134039a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54141h(NewLogoutComponent bVar) {
            this.f134039a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            if (i == 0) {
                this.f134039a.mo185314n();
            } else if (i == 1) {
                this.f134039a.mo185311k();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$showAllLogoutDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$j */
    public static final class C54144j implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134043a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54144j(NewLogoutComponent bVar) {
            this.f134043a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            SettingHitPoint.f134851a.mo186406f(true);
            this.f134043a.mo185307a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$showOldLogoutDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$m */
    public static final class C54147m implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134045a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54147m(NewLogoutComponent bVar) {
            this.f134045a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f134045a.mo185307a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$showSingleLogoutDialog$1", "Lcom/larksuite/component/universe_design/dialog/UDListDialogController$OnItemClickListener;", "onItemClick", "", "index", "", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$n */
    public static final class C54148n implements UDListDialogController.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134046a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54148n(NewLogoutComponent bVar) {
            this.f134046a = bVar;
        }

        @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
        public void onItemClick(int i) {
            this.f134046a.mo185307a(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/setting/page/content/logout/NewLogoutComponent$enterLogout$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$d */
    public static final class C54137d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134035a;

        /* renamed from: b */
        final /* synthetic */ boolean f134036b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo185321a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo185321a(boolean z) {
            this.f134035a.mo185315o();
            if (this.f134036b) {
                this.f134035a.mo185316p();
            } else {
                this.f134035a.mo185312l();
            }
        }

        C54137d(NewLogoutComponent bVar, boolean z) {
            this.f134035a = bVar;
            this.f134036b = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "aLong", "", "accept", "(Ljava/lang/Long;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.b.b$l */
    public static final class C54146l<T> implements Consumer<Long> {

        /* renamed from: a */
        final /* synthetic */ NewLogoutComponent f134044a;

        C54146l(NewLogoutComponent bVar) {
            this.f134044a = bVar;
        }

        /* renamed from: a */
        public final void accept(Long l) {
            this.f134044a.f134027d.dismiss();
            this.f134044a.mo185308h().setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo185307a(boolean z) {
        ISettingDependency.ILoginDependency n = C54115c.m210080a().mo178302n();
        Activity activity = this.f134024a.get();
        if (activity != null) {
            n.mo178358b(activity, new UIGetDataCallback(new C54137d(this, z)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.Context");
    }

    public NewLogoutComponent(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        this.f134024a = new WeakReference<>(activity);
        this.f134025b = new CallbackManager();
        this.f134026c = C54115c.m210080a().mo178302n();
        this.f134027d = new LogoutLoadingDialog(activity);
        this.f134030h = new UIGetDataCallback(new C54138e(this));
        this.f134031i = new C54141h(this);
        this.f134032j = new View$OnClickListenerC54139f(this);
    }
}
