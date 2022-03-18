package com.ss.android.lark.chatsetting.impl.group.info;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.impl.group.info.C34614b;
import com.ss.android.lark.chatsetting.impl.group.info.C34619c;
import com.ss.android.lark.chatsetting.impl.group.info.GroupInfoView;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.chatsetting.impl.group.info.b */
public class C34614b extends BasePresenter<C34619c.AbstractC34620a, C34619c.AbstractC34622b, C34619c.AbstractC34622b.AbstractC34623a> {

    /* renamed from: a */
    public Context f89379a;

    /* renamed from: b */
    public C36516a<?> f89380b;

    /* renamed from: b */
    private C34619c.AbstractC34620a.AbstractC34621a m134506b() {
        return new C34619c.AbstractC34620a.AbstractC34621a() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.C34614b.C346172 */

            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m134512b(Chat chat, Team team) {
                ((C34619c.AbstractC34622b) C34614b.this.getView()).mo127859a(chat, team);
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a.AbstractC34621a
            /* renamed from: a */
            public void mo127904a(Chat chat, Team team) {
                UICallbackExecutor.execute(new Runnable(chat, team) {
                    /* class com.ss.android.lark.chatsetting.impl.group.info.$$Lambda$b$2$ny9UgtClJRQOK7xBjH2TErC9_E0 */
                    public final /* synthetic */ Chat f$1;
                    public final /* synthetic */ Team f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C34614b.C346172.lambda$ny9UgtClJRQOK7xBjH2TErC9_E0(C34614b.C346172.this, this.f$1, this.f$2);
                    }
                });
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34620a.AbstractC34621a
            /* renamed from: a */
            public void mo127905a(final Chat chat, final boolean z, final String str) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.chatsetting.impl.group.info.C34614b.C346172.RunnableC346181 */

                    public void run() {
                        ((C34619c.AbstractC34622b) C34614b.this.getView()).mo127866b(chat, z, str);
                    }
                });
            }
        };
    }

    /* renamed from: a */
    public C34619c.AbstractC34622b.AbstractC34623a createViewDelegate() {
        return new C34619c.AbstractC34622b.AbstractC34623a() {
            /* class com.ss.android.lark.chatsetting.impl.group.info.C34614b.C346151 */

            @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b.AbstractC34623a
            /* renamed from: b */
            public void mo127902b() {
                ((C34619c.AbstractC34620a) C34614b.this.getModel()).mo127889a(new UIGetDataCallback(new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.chatsetting.impl.group.info.C34614b.C346151.C346161 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C34619c.AbstractC34622b) C34614b.this.getView()).mo127869c(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_RecallMessageErr)));
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        if (chat != null) {
                            ((C34619c.AbstractC34620a) C34614b.this.getModel()).mo127890a(chat);
                            ((C34619c.AbstractC34620a) C34614b.this.getModel()).mo127893a((Team) null);
                            ((C34619c.AbstractC34622b) C34614b.this.getView()).mo127859a(chat, null);
                        }
                    }
                }));
            }

            @Override // com.ss.android.lark.chatsetting.impl.group.info.C34619c.AbstractC34622b.AbstractC34623a
            /* renamed from: a */
            public void mo127901a() {
                if (NetworkUtils.m153070c(C34614b.this.f89379a)) {
                    ArrayList arrayList = new ArrayList();
                    Chat a = ((C34619c.AbstractC34620a) C34614b.this.getModel()).mo127886a();
                    if (!TextUtils.isEmpty(a.getAvatarKey())) {
                        arrayList.add(a.getAvatarKey());
                    } else {
                        arrayList.add(((C34619c.AbstractC34620a) C34614b.this.getModel()).mo127887a(C34614b.this.f89379a));
                    }
                    boolean c = ((C34619c.AbstractC34620a) C34614b.this.getModel()).mo127897c();
                    GroupHitPoint.f90519a.mo129234e();
                    if (!c) {
                        ((C34619c.AbstractC34622b) C34614b.this.getView()).mo127864a(c, a, arrayList);
                        return;
                    }
                    GroupHitPoint.f90519a.mo129235e(a);
                    ((C34619c.AbstractC34620a) C34614b.this.getModel()).mo127888a(C34614b.this.f89379a, C34614b.this.f89380b);
                    GroupHitPoint.f90519a.mo129259m();
                }
            }
        };
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((C34619c.AbstractC34622b) getView()).mo127861a(((C34619c.AbstractC34620a) getModel()).mo127886a(), ((C34619c.AbstractC34620a) getModel()).mo127897c(), ((C34619c.AbstractC34620a) getModel()).mo127894b());
        ((C34619c.AbstractC34620a) getModel()).mo127896c(((C34619c.AbstractC34620a) getModel()).mo127886a());
    }

    /* renamed from: a */
    public void mo127900a(Intent intent) {
        if (intent.getStringExtra("group_name") != null) {
            ((C34619c.AbstractC34622b) getView()).mo127863a(intent.getStringExtra("group_name"));
        }
        if (intent.getStringExtra("group_desc") != null) {
            ((C34619c.AbstractC34622b) getView()).mo127867b(intent.getStringExtra("group_desc"));
        }
    }

    public C34614b(GroupInfoView.AbstractC34610a aVar, Context context, Chat chat, boolean z, C36516a<?> aVar2) {
        this.f89379a = context;
        this.f89380b = aVar2;
        GroupInfoView groupInfoView = new GroupInfoView(context, aVar);
        C34611a aVar3 = new C34611a(chat, z);
        setView(groupInfoView);
        setModel(aVar3);
        groupInfoView.setViewDelegate(createViewDelegate());
        aVar3.mo127892a(m134506b());
    }
}
