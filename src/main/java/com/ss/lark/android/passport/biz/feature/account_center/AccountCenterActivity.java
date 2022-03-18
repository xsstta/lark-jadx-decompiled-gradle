package com.ss.lark.android.passport.biz.feature.account_center;

import android.content.Intent;
import android.os.Bundle;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterModel;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterPresenter;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.AccountCenterView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RouterAnno(name = "operation_center", teaName = "passport_change_or_create_team_view")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/AccountCenterActivity;", "Lcom/ss/android/lark/passport/infra/base/architecture/BaseActivity;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterPresenter;", "()V", "model", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterModel;", "getModel", "()Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterModel;", "setModel", "(Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterModel;)V", "createUniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public class AccountCenterActivity extends BaseActivity<AccountCenterPresenter> {

    /* renamed from: h */
    private AccountCenterModel f163011h;

    /* renamed from: a */
    public final AccountCenterModel mo170967a() {
        return this.f163011h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity
    /* renamed from: s */
    public UniContext mo171147s() {
        return WatcherUniContext.f123348l.mo171436d();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        ((AccountCenterPresenter) this.f123050a).cn_();
        super.onDestroy();
    }

    /* renamed from: b */
    public void mo170969b() {
        this.f123052c.mo171465b("n_page_account_center", "enter");
        AccountCenterView cVar = new AccountCenterView(this);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        AccountCenterModel aVar = new AccountCenterModel(intent);
        this.f163011h = aVar;
        UniContext uniContext = this.f123055f;
        PassportLog passportLog = this.f123052c;
        Intrinsics.checkExpressionValueIsNotNull(passportLog, "logger");
        this.f123050a = new AccountCenterPresenter(this, aVar, cVar, uniContext, passportLog);
        ((AccountCenterPresenter) this.f123050a).mo171169a();
    }

    /* renamed from: a */
    public final void mo223305a(AccountCenterModel aVar) {
        this.f163011h = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.lark.passport.infra.base.architecture.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        mo171135g();
        super.onCreate(bundle);
        mo171130c(R.color.bg_base);
        setContentView(R.layout.account_center_layout);
        mo170969b();
    }
}
