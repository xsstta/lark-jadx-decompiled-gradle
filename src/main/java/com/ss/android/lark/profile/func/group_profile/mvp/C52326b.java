package com.ss.android.lark.profile.func.group_profile.mvp;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dto.ProfileChat;
import com.ss.android.lark.profile.dto.ProfileChatter;
import com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c;
import com.ss.android.lark.profile.func.group_profile.mvp.GroupProfileView;
import com.ss.android.lark.profile.statistics.GroupProfilePerceivableErrorCostTimeHitPoint;
import com.ss.android.lark.profile.statistics.ProfileHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;

/* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.b */
public class C52326b extends BasePresenter<AbstractC52331c.AbstractC52332a, AbstractC52331c.AbstractC52333b, AbstractC52331c.AbstractC52333b.AbstractC52334a> {
    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC52331c.AbstractC52333b.AbstractC52334a createViewDelegate() {
        return new C52329a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.profile.func.group_profile.mvp.b$a */
    public class C52329a implements AbstractC52331c.AbstractC52333b.AbstractC52334a {
        @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b.AbstractC52334a
        /* renamed from: a */
        public void mo179194a() {
            ((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179171a(((AbstractC52331c.AbstractC52332a) C52326b.this.getModel()).mo179175a().mo178839b(), ((AbstractC52331c.AbstractC52332a) C52326b.this.getModel()).mo179175a().mo178838a(), ((AbstractC52331c.AbstractC52332a) C52326b.this.getModel()).mo179175a().mo178841d());
        }

        private C52329a() {
        }

        @Override // com.ss.android.lark.profile.func.group_profile.mvp.AbstractC52331c.AbstractC52333b.AbstractC52334a
        /* renamed from: a */
        public void mo179195a(final Context context) {
            ProfileHitPoint.m204704a(((AbstractC52331c.AbstractC52332a) C52326b.this.getModel()).mo179175a());
            ((AbstractC52331c.AbstractC52332a) C52326b.this.getModel()).mo179177a(context, new AbstractC44896a() {
                /* class com.ss.android.lark.profile.func.group_profile.mvp.C52326b.C52329a.C523301 */

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: b */
                public void mo128966b() {
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128963a() {
                    LKUIToast.show(context, (int) R.string.Lark_Group_JoinGroupToast);
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128965a(String str) {
                    ((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179164a();
                    ((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179174c(str);
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: b */
                public void mo128967b(ErrorResult errorResult) {
                    if (!TextUtils.isEmpty(errorResult.getDisplayMsg())) {
                        LKUIToast.show(context, errorResult.getDisplayMsg());
                    }
                    Log.m165382e(errorResult.toString());
                }

                @Override // com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a
                /* renamed from: a */
                public void mo128964a(ErrorResult errorResult) {
                    Log.m165382e("join group chat failed: " + errorResult.toString());
                    if (!((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179172a(errorResult)) {
                        if (errorResult.getErrorCode() == 4037) {
                            ((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179173b(errorResult.getDisplayMsg());
                        } else {
                            ((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179170a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_JoinFailed)));
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ ProfileChat m203003b(String str) {
        return C52239a.m202617d().mo133586p().mo133613c(str);
    }

    /* renamed from: a */
    private void m203000a(String str) {
        ((AbstractC52331c.AbstractC52332a) getModel()).mo179183b(str, new UIGetDataCallback(new IGetDataCallback<Pair<Integer, Bundle>>() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.C52326b.C523282 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(Pair<Integer, Bundle> pair) {
                ((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179165a(((Integer) pair.first).intValue(), (Bundle) pair.second);
            }
        }));
    }

    /* renamed from: a */
    public void mo179191a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("params__chat_id");
            if (!TextUtils.isEmpty(string)) {
                String string2 = bundle.getString("params_group_inviter_id", "");
                String string3 = bundle.getString("param_token");
                boolean z = bundle.getBoolean("param_just_show_chat_info", false);
                boolean z2 = bundle.getBoolean("key_param_is_from_link", false);
                boolean z3 = bundle.getBoolean("params_education_group", false);
                boolean z4 = bundle.getBoolean("key_params_is_search_public", false);
                ((AbstractC52331c.AbstractC52333b) getView()).mo179167a(bundle);
                ((AbstractC52331c.AbstractC52332a) getModel()).mo179181a(z2);
                ((AbstractC52331c.AbstractC52332a) getModel()).mo179184b(z4);
                GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180532c();
                C57865c.m224574a(new C57865c.AbstractC57873d(string) {
                    /* class com.ss.android.lark.profile.func.group_profile.mvp.$$Lambda$b$ovi4oOe1qHyXsm0EuZUJzTsqKrI */
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return C52326b.m203003b(this.f$0);
                    }
                }, new C57865c.AbstractC57871b(string2, string3, z3, z) {
                    /* class com.ss.android.lark.profile.func.group_profile.mvp.$$Lambda$b$25GZnMy7pxpZ_Ct0lWr1Hin3TI */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ boolean f$3;
                    public final /* synthetic */ boolean f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                    public final void consume(Object obj) {
                        C52326b.this.m203001a(this.f$1, this.f$2, this.f$3, this.f$4, (ProfileChat) obj);
                    }
                });
            }
        }
    }

    public C52326b(AbstractC52331c.AbstractC52332a aVar, AbstractC52331c.AbstractC52333b bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    private void m203002a(final boolean z, ProfileChat profileChat) {
        ((AbstractC52331c.AbstractC52332a) getModel()).mo179180a(profileChat.mo178839b(), new UIGetDataCallback(new IGetDataCallback<ProfileChatter>() {
            /* class com.ss.android.lark.profile.func.group_profile.mvp.C52326b.C523271 */

            /* renamed from: a */
            public void onSuccess(ProfileChatter profileChatter) {
                GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180533d();
                ((AbstractC52331c.AbstractC52333b) C52326b.this.getView()).mo179168a(C52326b.this.mo179189a(((AbstractC52331c.AbstractC52332a) C52326b.this.getModel()).mo179175a(), profileChatter, z));
                GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180538i();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180533d();
                GroupProfilePerceivableErrorCostTimeHitPoint.f130734a.mo180530a();
                Log.m165382e("get chatter by id failed: " + errorResult.toString());
            }
        }));
    }

    /* renamed from: a */
    public GroupProfileView.C52321a mo179189a(ProfileChat profileChat, ProfileChatter profileChatter, boolean z) {
        GroupProfileView.C52321a aVar = new GroupProfileView.C52321a();
        aVar.f129736a = profileChat.mo178840c();
        aVar.f129737b = profileChat.mo178841d();
        aVar.f129738c = profileChat.mo178842e();
        aVar.f129739d = profileChat.mo178843f();
        aVar.f129740e = profileChat.mo178838a();
        aVar.f129741f = C52239a.m202617d().mo133586p().mo133612b(profileChatter.getId());
        aVar.f129742g = profileChatter.getAvatarKey();
        aVar.f129743h = profileChatter.getId();
        aVar.f129744i = z;
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m203001a(String str, String str2, boolean z, boolean z2, ProfileChat profileChat) {
        ((AbstractC52331c.AbstractC52332a) getModel()).mo179178a(profileChat);
        ((AbstractC52331c.AbstractC52332a) getModel()).mo179179a(str);
        ((AbstractC52331c.AbstractC52332a) getModel()).mo179182b(str2);
        if (z) {
            m203000a(profileChat.mo178838a());
        }
        m203002a(z2, profileChat);
    }
}
