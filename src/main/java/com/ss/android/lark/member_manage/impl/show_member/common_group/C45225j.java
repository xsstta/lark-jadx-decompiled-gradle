package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.base.mvp.BaseGroupMemberManageView;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45190b;
import com.ss.android.lark.member_manage.impl.statistics.PerfGroupMemberMonitor;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.team.entity.Team;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.j */
public class C45225j extends BasePresenter<C45190b.AbstractC45191a, C45190b.AbstractC45193b, C45190b.AbstractC45193b.AbstractC45194a> {

    /* renamed from: a */
    int f114458a;

    /* renamed from: b */
    public C45213i f114459b;

    /* renamed from: c */
    public C45207h f114460c;

    /* renamed from: d */
    public boolean f114461d = false;

    /* renamed from: e */
    private CallbackManager f114462e = new CallbackManager();

    /* renamed from: f */
    private Bundle f114463f;

    /* renamed from: g */
    private String f114464g;

    /* renamed from: h */
    private List<String> f114465h;

    /* renamed from: i */
    private boolean f114466i = false;

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f114462e.cancelCallbacks();
        this.f114462e = null;
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C45190b.AbstractC45193b.AbstractC45194a createViewDelegate() {
        List<String> list = this.f114465h;
        if (list != null) {
            return new C45200g(this.f114459b, this.f114460c, this.f114458a, list);
        }
        return new C45200g(this.f114459b, this.f114460c, this.f114458a, this.f114464g);
    }

    /* renamed from: b */
    public void mo159806b() {
        final boolean[] zArr = {false};
        ((C45190b.AbstractC45191a) getModel()).mo159435a(new IGetDataCallback<SelectBeansResult>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45225j.C452283 */

            /* renamed from: a */
            public void onSuccess(final SelectBeansResult dVar) {
                zArr[0] = true;
                PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.SHOW, C45225j.this.f114460c.mo159756l(), null);
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45225j.C452283.RunnableC452291 */

                    public void run() {
                        ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159765c(dVar);
                        ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159448b(new ArrayList(C45225j.this.f114460c.mo159441c().values()));
                        C48211b.m190251a().mo168691c("load_data");
                        C48211b.m190251a().mo168692d();
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(final ErrorResult errorResult) {
                C48211b.m190251a().mo168691c("load_data");
                C48211b.m190251a().mo168692d();
                PerfGroupMemberMonitor.m179720a(PerfGroupMemberMonitor.ActionType.SHOW, C45225j.this.f114460c.mo159756l(), errorResult);
                if (zArr[0]) {
                    Log.m165382e(errorResult.toString());
                } else {
                    UICallbackExecutor.execute(new Runnable() {
                        /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45225j.C452283.RunnableC452302 */

                        public void run() {
                            Log.m165382e(errorResult.toString());
                            ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159393a(errorResult.getDisplayMsg());
                        }
                    });
                }
            }
        });
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        C48211b.m190251a().mo168689b("load_data");
        ((C45190b.AbstractC45191a) getModel()).mo159434a(this.f114463f, new IGetDataCallback<SelectMemberInitData>() {
            /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45225j.C452261 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159393a(errorResult.getDisplayMsg());
                Log.m165383e("ShowMemberPresenter", errorResult.toString());
            }

            /* renamed from: a */
            public void onSuccess(SelectMemberInitData selectMemberInitData) {
                ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159760a(selectMemberInitData.getSelectedIds());
                ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159447a(selectMemberInitData.getChat());
                C45225j.this.mo159806b();
                ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159761a(C45225j.this.f114461d);
                C45225j.this.mo159805a(selectMemberInitData);
            }
        });
        m179492c();
    }

    /* renamed from: c */
    private void m179492c() {
        String string = this.f114463f.getString("key_chat_id");
        if (!TextUtils.isEmpty(string)) {
            ((C45190b.AbstractC45191a) getModel()).mo159751b(string, new UIGetDataCallback(new IGetDataCallback<Integer>() {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45225j.C452272 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165386e("ShowMemberPresenter", errorResult);
                }

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    if (num.intValue() > 0) {
                        ((C45190b.AbstractC45193b) C45225j.this.getView()).e_(num.intValue());
                    }
                }
            }));
        }
    }

    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.common_group.j$a */
    private class C45232a implements C45190b.AbstractC45191a.AbstractC45192a {
        private C45232a() {
        }
    }

    /* renamed from: a */
    public void mo159805a(SelectMemberInitData selectMemberInitData) {
        if (selectMemberInitData != null && selectMemberInitData.getChat() != null && GroupMemberManageModule.m177902a().getTeamDependency().mo143778a()) {
            ((C45190b.AbstractC45191a) getModel()).mo159745a(selectMemberInitData.getChat().getTeamId(), new IGetDataCallback<Team>() {
                /* class com.ss.android.lark.member_manage.impl.show_member.common_group.C45225j.C452314 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }

                /* renamed from: a */
                public void onSuccess(Team team) {
                    ((C45190b.AbstractC45193b) C45225j.this.getView()).mo159759a(team);
                }
            });
        }
    }

    public C45225j(Activity activity, Bundle bundle, BaseGroupMemberManageView.AbstractC45064a aVar) {
        this.f114463f = bundle;
        this.f114464g = bundle.getString("key_chat_id");
        this.f114465h = bundle.getStringArrayList("key_chatter_ids");
        boolean z = bundle.getBoolean("key_is_thread");
        this.f114458a = bundle.getInt("key.type", 2);
        this.f114461d = bundle.getBoolean("keu.is.remove", false);
        this.f114466i = bundle.getBoolean("key_is_disable_action", false);
        this.f114459b = new C45213i(activity, aVar, z, this.f114464g);
        C45207h hVar = new C45207h(this.f114458a);
        this.f114460c = hVar;
        hVar.mo159785a(new C45232a());
        this.f114459b.mo159793b(this.f114458a);
        this.f114459b.mo159794b(this.f114466i);
        setModel(this.f114460c);
        setView(this.f114459b);
        this.f114459b.setViewDelegate(createViewDelegate());
    }
}
