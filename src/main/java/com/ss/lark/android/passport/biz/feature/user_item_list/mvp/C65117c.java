package com.ss.lark.android.passport.biz.feature.user_item_list.mvp;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b;
import com.ss.android.lark.passport.infra.base.router.C49087a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterScene;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.account.Tenant;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.entity.UserItem;
import com.ss.lark.android.passport.biz.feature.user_item_list.UserListStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a;
import java.lang.reflect.Type;
import java.util.HashMap;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.c */
public class C65117c extends AbstractC49021b<C65112a.AbstractC65113a, C65112a.AbstractC65114b, C65112a.AbstractC65114b.AbstractC65115a> {

    /* renamed from: d */
    public final Activity f164006d;

    /* renamed from: e */
    private final C49087a f164007e;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49021b
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        mo224300h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C65112a.AbstractC65114b.AbstractC65115a mo171180c() {
        return new C65118a();
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.c$a */
    public class C65118a implements C65112a.AbstractC65114b.AbstractC65115a {
        @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65114b.AbstractC65115a
        /* renamed from: a */
        public void mo224297a() {
            ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224288d();
            ((C65112a.AbstractC65113a) C65117c.this.mo171182e()).mo224292a(new ICallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65117c.C65118a.C651223 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return BaseStepData.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(NetworkErrorResult networkErrorResult) {
                    ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224289e();
                    String errorMessage = networkErrorResult.getErrorMessage();
                    if (TextUtils.isEmpty(errorMessage)) {
                        errorMessage = "tenantCreate on error";
                    }
                    C65117c.this.f123081c.mo171465b("UserListPresenter", errorMessage);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                    ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224289e();
                    BaseStepData data = responseModel.getData();
                    if (data == null) {
                        C65117c.this.f123081c.mo171465b("UserListPresenter", "tenantCreate on succ data == null");
                    } else {
                        C49092f.m193529a(C65117c.this.f164006d, data, RouterScene.ALL.value, C65117c.this.f123080b, C65117c.this.f123081c, (AbstractC49336a) null);
                    }
                }
            });
        }

        public C65118a() {
        }

        /* renamed from: b */
        public void mo224302b(String str) {
            ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224288d();
            ((C65112a.AbstractC65113a) C65117c.this.mo171182e()).mo224294b(str, new ICallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65117c.C65118a.C651212 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return BaseStepData.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                    ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224288d();
                    BaseStepData data = responseModel.getData();
                    if (data == null) {
                        C65117c.this.f123081c.mo171465b("UserListPresenter", "emailCreate on succ data == null");
                    } else {
                        C49092f.m193529a(C65117c.this.f164006d, data, RouterScene.ALL.value, C65117c.this.f123080b, C65117c.this.f123081c, (AbstractC49336a) null);
                    }
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(NetworkErrorResult networkErrorResult) {
                    ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224289e();
                    if (4402 == networkErrorResult.getErrorCode()) {
                        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(C65117c.this.f164006d).titleBold(true)).message(C49226y.m194059a(networkErrorResult.getErrorMessage()))).addActionButton(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_IKnow, $$Lambda$c$a$2$9cxYhdZiZCHnvaGktvCloN7WlwE.INSTANCE)).show();
                        return;
                    }
                    String errorMessage = networkErrorResult.getErrorMessage();
                    if (TextUtils.isEmpty(errorMessage)) {
                        errorMessage = "emailCreate on error";
                    }
                    C65117c.this.f123081c.mo171465b("UserListPresenter", errorMessage);
                }
            });
        }

        /* renamed from: a */
        public void mo224301a(String str) {
            ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224288d();
            ((C65112a.AbstractC65113a) C65117c.this.mo171182e()).mo224293a(str, new ICallback<BaseStepData>() {
                /* class com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65117c.C65118a.C651191 */

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public Type mo101474a() {
                    return BaseStepData.class;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101475a(NetworkErrorResult networkErrorResult) {
                    ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224289e();
                    if (4402 == networkErrorResult.getErrorCode()) {
                        ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(C65117c.this.f164006d).message(C49226y.m194059a(networkErrorResult.getErrorMessage()))).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_IKnow, $$Lambda$c$a$1$EG9Hv_HNjOXMbnHGUF4o3pWt_PE.INSTANCE)).show();
                        return;
                    }
                    String errorMessage = networkErrorResult.getErrorMessage();
                    if (TextUtils.isEmpty(errorMessage)) {
                        errorMessage = "Request Error On EnterApp";
                    }
                    UDToast.show(C65117c.this.f164006d, errorMessage);
                    C65117c.this.f123081c.mo171465b("UserListPresenter", errorMessage);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
                /* renamed from: a */
                public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                    BaseStepData data = responseModel.getData();
                    if (data == null) {
                        ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224289e();
                        C65117c.this.f123081c.mo171465b("UserListPresenter", "enterApp on succ data == null");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("next_step", data.nextStep);
                    WatcherHelper.m193665a(C65117c.this.f123080b, C40654u.f103185h, hashMap);
                    C49092f.m193529a(C65117c.this.f164006d, data, RouterScene.ALL.value, C65117c.this.f123080b, C65117c.this.f123081c, new AbstractC49336a() {
                        /* class com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65117c.C65118a.C651191.C651201 */

                        @Override // com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a
                        public void onRouterResult(int i, Object obj) {
                            if (C65117c.this.mo171181d() != null) {
                                ((C65112a.AbstractC65114b) C65117c.this.mo171181d()).mo224289e();
                            }
                        }
                    });
                }
            });
        }

        @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65114b.AbstractC65115a
        /* renamed from: a */
        public void mo224298a(UserItem userItem) {
            boolean z;
            UserListStatisticsHelper.m255712a(((C65112a.AbstractC65113a) C65117c.this.mo171182e()).cz_(), UserListStatisticsHelper.m255713a(((C65112a.AbstractC65113a) C65117c.this.mo171182e()).mo224295c()));
            if (userItem == null || userItem.user == null) {
                C65117c.this.f123081c.mo171471d("UserListPresenter", "user is null");
            } else if (!TextUtils.isEmpty(userItem.toastDesc)) {
                C65117c.this.f123081c.mo171465b("UserListPresenter", "has toastDesc, toast it");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(C65117c.this.f164006d).title(R.string.Lark_Legacy_LarkTip)).message(userItem.toastDesc)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_IKnow, $$Lambda$c$a$tZ8JKp7yK5R73TfQlqIDf3Macg.INSTANCE)).show();
            } else if (userItem.user.getStatus() == 5) {
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(C65117c.this.f164006d).title(R.string.Lark_Legacy_LarkTip)).message(R.string.Lark_Passport_SelectTeamTeamInReviewTagTip)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_IKnow, $$Lambda$c$a$9cTWBJyKhxTPUA2vuuodYAlvtHE.INSTANCE)).show();
            } else {
                Tenant tenant = userItem.user.tenant;
                if (userItem.type == 0) {
                    mo224301a(userItem.user.userId);
                } else if (tenant == null || TextUtils.isEmpty(tenant.tenantId)) {
                    PassportLog passportLog = C65117c.this.f123081c;
                    StringBuilder sb = new StringBuilder();
                    sb.append("userItem.type: ");
                    sb.append(userItem.type);
                    sb.append(", tenant is null: ");
                    if (tenant == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    passportLog.mo171471d("UserListPresenter", sb.toString());
                    if (tenant != null) {
                        C65117c.this.f123081c.mo171471d("UserListPresenter", "tenant is not null, but tenant id is empty");
                    }
                } else {
                    mo224302b(tenant.tenantId);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo224300h() {
        C65112a.AbstractC65113a aVar = (C65112a.AbstractC65113a) mo171182e();
        if (aVar != null && mo171181d() != null) {
            ((C65112a.AbstractC65114b) mo171181d()).mo224286a(aVar.mo224295c());
        }
    }

    public C65117c(Activity activity, C65112a.AbstractC65113a aVar, C65112a.AbstractC65114b bVar, C49087a aVar2, UniContext uniContext, PassportLog passportLog) {
        super(aVar, bVar, uniContext, passportLog);
        this.f164006d = activity;
        this.f164007e = aVar2;
        this.f123081c.mo171465b("UserListPresenter", "start dispatchNext");
    }
}
