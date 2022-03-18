package com.ss.android.lark.member_manage.impl.atselector.model;

import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.C44895d;
import com.ss.android.lark.member_manage.impl.GroupUtils;
import com.ss.android.lark.member_manage.impl.atselector.bean.AllAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.AtSelectInitData;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.model.p2256a.C45004b;
import com.ss.android.lark.member_manage.impl.statistics.AtSelectPerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.utils.C57814c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.model.a */
public class C44999a extends BaseAtModel {

    /* renamed from: k */
    private C45004b f113939k;

    /* renamed from: l */
    private Chat f113940l;

    /* renamed from: m */
    private IGroupMemberManageModuleDependency.IChatDependency f113941m;

    /* renamed from: n */
    private IGroupMemberManageModuleDependency.AbstractC44878a f113942n;

    /* renamed from: o */
    private GroupMemberManageModule.AbstractC44877b f113943o = new GroupMemberManageModule.AbstractC44877b() {
        /* class com.ss.android.lark.member_manage.impl.atselector.model.C44999a.C450001 */

        @Override // com.ss.android.lark.member_manage.GroupMemberManageModule.AbstractC44877b
        /* renamed from: a */
        public void mo158813a(Chat chat) {
            C44999a.this.mo159237a(chat);
        }
    };

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: j */
    public Chat mo159135j() {
        Chat chat = this.f113940l;
        if (chat != null) {
            return chat;
        }
        return this.f113941m.mo143743a(this.f113929a);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m178463l() {
        this.f113940l = this.f113941m.mo143743a(this.f113929a);
        AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159937a(this.f113940l);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        GroupMemberManageModule.m177902a().getChatDependency().mo143766b(String.valueOf(hashCode()), this.f113929a, this.f113943o);
        super.destroy();
    }

    /* renamed from: k */
    private boolean m178462k() {
        if (this.f113931c.getIsInterruptAtAll().booleanValue() || mo159135j().getType() != Chat.Type.GROUP || (!GroupUtils.m178040b(mo159135j()) && mo159135j().getAtAllPermission() != Chat.AtAllPermission.ALL_MEMBERS)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: c */
    public List<BaseAtBean> mo159128c() {
        if (CollectionUtils.isEmpty(this.f113932d)) {
            return new ArrayList();
        }
        Iterator it = this.f113932d.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((BaseAtBean) it.next()).getId().equals(C57814c.m224347a())) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        return this.f113932d;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f113939k = new C45004b(this.f113929a);
        GroupMemberManageModule.m177902a().getChatDependency().mo143753a(String.valueOf(hashCode()), this.f113929a, this.f113943o);
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.member_manage.impl.atselector.model.$$Lambda$a$AVRa9__2r811MyqkLIm3ziiElg8 */

            public final void run() {
                C44999a.this.m178463l();
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: i */
    public boolean mo159134i() {
        Chat j = mo159135j();
        boolean isFeatureGatingEnable = GroupMemberManageModule.m177902a().isFeatureGatingEnable("group.mention.new.tips");
        if (j == null || j.getChatMode() != Chat.ChatMode.THREAD_V2 || !j.isPublic() || !isFeatureGatingEnable) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: d */
    public List<BaseAtBean> mo159129d() {
        if (!m178462k()) {
            return this.f113932d;
        }
        if (CollectionUtils.isEmpty(this.f113932d)) {
            return new ArrayList();
        }
        HashMap hashMap = new HashMap();
        for (BaseAtBean baseAtBean : this.f113932d) {
            hashMap.put(baseAtBean.getId(), baseAtBean);
        }
        int i = 0;
        for (BaseAtBean baseAtBean2 : this.f113932d) {
            if (baseAtBean2.getType() == 0) {
                i++;
            }
        }
        if (!hashMap.containsKey(C57814c.m224347a())) {
            this.f113932d.add(0, new AllAtBean(i));
        }
        return this.f113932d;
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: a */
    public void mo159121a(final IGetDataCallback<List<BaseAtBean>> iGetDataCallback) {
        this.f113939k.mo159241a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C25975i(new IGetDataCallback<List<BaseAtBean>>() {
            /* class com.ss.android.lark.member_manage.impl.atselector.model.C44999a.C450012 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(List<BaseAtBean> list) {
                if (iGetDataCallback != null) {
                    C44999a aVar = C44999a.this;
                    aVar.f113932d = aVar.mo159236a(list);
                    if (C44999a.this.f113931c.getIsInterruptAtAll().booleanValue()) {
                        C44999a.this.mo159128c();
                    }
                    iGetDataCallback.onSuccess(C44999a.this.f113932d);
                }
            }
        })));
    }

    public C44999a(AtSelectInitData atSelectInitData) {
        super(atSelectInitData);
        this.f113929a = atSelectInitData.getChannelId();
        this.f113941m = GroupMemberManageModule.m177902a().getChatDependency();
        this.f113942n = GroupMemberManageModule.m177902a().getAccountDependency();
    }

    /* renamed from: a */
    public void mo159237a(Chat chat) {
        if (chat.getId().equals(this.f113929a) && !chat.isP2PChat()) {
            Chat.AtAllPermission atAllPermission = chat.getAtAllPermission();
            if (GroupUtils.m178040b(chat)) {
                return;
            }
            if (atAllPermission == Chat.AtAllPermission.ALL_MEMBERS) {
                this.f113930b.mo159100a(this.f113932d, true);
            } else if (atAllPermission == Chat.AtAllPermission.ONLY_OWNER) {
                this.f113930b.mo159100a(this.f113932d, false);
            }
        }
    }

    /* renamed from: a */
    private IGetDataCallback<C44895d> m178461a(final String str, final IGetDataCallback<C44895d> iGetDataCallback) {
        return new IGetDataCallback<C44895d>() {
            /* class com.ss.android.lark.member_manage.impl.atselector.model.C44999a.C450023 */

            /* renamed from: a */
            public void onSuccess(C44895d dVar) {
                IGetDataCallback iGetDataCallback;
                if (C44999a.this.f113936h.equals(str) && (iGetDataCallback = iGetDataCallback) != null) {
                    iGetDataCallback.onSuccess(dVar);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback;
                if (C44999a.this.f113936h.equals(str) && (iGetDataCallback = iGetDataCallback) != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: b */
    public void mo159127b(String str, String str2, IGetDataCallback<C44895d> iGetDataCallback) {
        this.f113935g = str;
        this.f113936h = str2;
        this.f113941m.mo143755a(this.f113929a, str, str2, true, getCallbackManager().wrapAndAddGetDataCallback(m178461a(str2, iGetDataCallback)));
    }

    @Override // com.ss.android.lark.member_manage.impl.atselector.C44972b.AbstractC44973a
    /* renamed from: a */
    public void mo159123a(String str, String str2, IGetDataCallback<C44895d> iGetDataCallback) {
        this.f113935g = str;
        this.f113936h = str2;
        this.f113941m.mo143755a(this.f113929a, str, str2, false, getCallbackManager().wrapAndAddGetDataCallback(m178461a(str2, iGetDataCallback)));
    }
}
