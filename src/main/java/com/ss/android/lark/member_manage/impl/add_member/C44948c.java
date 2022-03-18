package com.ss.android.lark.member_manage.impl.add_member;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.C44893a;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.member_manage.export.p2253a.C44897b;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;
import com.ss.android.lark.member_manage.impl.add_member.edugroup.EduGroupInvitationDelegate;
import com.ss.android.lark.member_manage.impl.join_group.JoinGroupChatUtil;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.member_manage.impl.add_member.c */
public class C44948c extends BaseModel implements IAddGroupMemberContract.AbstractC44929a {

    /* renamed from: a */
    protected List<SearchChatterInfo> f113808a = new ArrayList();

    /* renamed from: b */
    protected Map<String, SearchBaseInfo> f113809b = new LinkedHashMap();

    /* renamed from: c */
    protected Map<String, SearchBaseInfo> f113810c = new HashMap();

    /* renamed from: d */
    protected String f113811d;

    /* renamed from: e */
    IGroupMemberManageModuleDependency.IChatDependency f113812e;

    /* renamed from: f */
    IGroupMemberManageModuleDependency.AbstractC44881d f113813f;

    /* renamed from: g */
    IGroupMemberManageModuleDependency.AbstractC44878a f113814g;

    /* renamed from: h */
    IGroupMemberManageModuleDependency.AbstractC44889k f113815h;

    /* renamed from: i */
    IGroupMemberManageModuleDependency.AbstractC44892n f113816i;

    /* renamed from: j */
    IGroupMemberManageModuleDependency.AbstractC44885g f113817j;

    /* renamed from: k */
    IGroupMemberManageModuleDependency.AbstractC44880c f113818k;

    /* renamed from: l */
    private AbstractC44950a f113819l;

    /* renamed from: m */
    private Chat f113820m;

    /* renamed from: n */
    private final Context f113821n;

    /* renamed from: o */
    private boolean f113822o;

    /* renamed from: p */
    private String f113823p = "";

    /* renamed from: q */
    private IAddGroupMemberContract.AbstractC44930b f113824q;

    /* renamed from: com.ss.android.lark.member_manage.impl.add_member.c$a */
    public interface AbstractC44950a {
        /* renamed from: a */
        void mo159066a();

        /* renamed from: b */
        void mo159067b();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public Map<String, SearchBaseInfo> mo159017a() {
        return this.f113809b;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: c */
    public Chat mo159029c() {
        return this.f113820m;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: e */
    public String mo159031e() {
        return this.f113811d;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: g */
    public boolean mo159033g() {
        return this.f113822o;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: h */
    public String mo159035h() {
        return this.f113823p;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m178224i() {
        this.f113819l.mo159066a();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: d */
    public String mo159030d() {
        return this.f113814g.mo143795b();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: f */
    public String mo159032f() {
        return this.f113820m.getId();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a, com.larksuite.framework.mvp.BaseModel
    public CallbackManager getCallbackManager() {
        return super.getCallbackManager();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: b */
    public Set<SearchBaseInfo> mo159026b() {
        return new HashSet(this.f113810c.values());
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        GroupMemberManageModule.m177902a().setInSecretMode(false);
    }

    /* renamed from: c */
    private boolean m178223c(SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof SearchChatterInfo) {
            return ((SearchChatterInfo) searchBaseInfo).isNotContact();
        }
        return false;
    }

    /* renamed from: a */
    public void mo159064a(IAddGroupMemberContract.AbstractC44930b bVar) {
        this.f113824q = bVar;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: b */
    public void mo159027b(SearchBaseInfo searchBaseInfo) {
        this.f113809b.remove(searchBaseInfo.getId());
        if (m178223c(searchBaseInfo)) {
            this.f113810c.remove(searchBaseInfo.getId());
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: b */
    public boolean mo159028b(int i) {
        if (i == this.f113816i.mo143807c()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo159063a(Bundle bundle) {
        Log.m165389i("AddGroupMemberActivity", "bundle: " + bundle);
        this.f113811d = bundle.getString("department_id", "");
        Map<? extends String, ? extends SearchBaseInfo> map = (Map) bundle.getSerializable("selectedIds");
        if (!CollectionUtils.isEmpty(map)) {
            this.f113809b.putAll(map);
        }
        this.f113820m = (Chat) bundle.getSerializable("extra_key_chat");
        this.f113823p = bundle.getString("extra_key_source");
        GroupMemberManageModule.m177902a().setInSecretMode(this.f113820m.isSecret());
        boolean z = bundle.getBoolean("key_chat_is_edu", false);
        this.f113822o = z;
        if (z) {
            mo159064a(new EduGroupInvitationDelegate(this.f113820m, this.f113821n, this));
        }
        this.f113811d = bundle.getString("department_id");
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.member_manage.impl.add_member.$$Lambda$c$Ryjpj3kClndv4x5Oc5nGtBtGDNU */

            public final void run() {
                C44948c.lambda$Ryjpj3kClndv4x5Oc5nGtBtGDNU(C44948c.this);
            }
        });
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public void mo159020a(IGetDataCallback<Boolean> iGetDataCallback) {
        this.f113818k.mo143812a(this.f113820m, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public void mo159022a(SearchBaseInfo searchBaseInfo) {
        if (!this.f113809b.containsKey(searchBaseInfo.getId())) {
            this.f113809b.put(searchBaseInfo.getId(), searchBaseInfo);
            if (m178223c(searchBaseInfo)) {
                this.f113810c.put(searchBaseInfo.getId(), searchBaseInfo);
            }
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public void mo159024a(List<SearchBaseInfo> list) {
        this.f113809b.clear();
        for (SearchBaseInfo searchBaseInfo : list) {
            this.f113809b.put(searchBaseInfo.getId(), searchBaseInfo);
            if (m178223c(searchBaseInfo)) {
                this.f113810c.put(searchBaseInfo.getId(), searchBaseInfo);
            }
        }
        this.f113819l.mo159067b();
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public boolean mo159025a(int i) {
        if (i == this.f113816i.mo143806b()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public void mo159018a(Context context, List<PickChatEntity> list, AbstractC44896a aVar) {
        IAddGroupMemberContract.AbstractC44930b bVar = this.f113824q;
        if (bVar == null || !bVar.mo159037a()) {
            JoinGroupChatUtil.f113676b.mo158916a(this.f113821n, this.f113820m.getId(), list, 2, (AbstractC44896a) getCallbackManager().wrapAndAddCallback(new C44897b(aVar)));
        } else {
            this.f113824q.mo159036a(context, list, aVar);
        }
    }

    public C44948c(Context context, Bundle bundle, AbstractC44950a aVar) {
        this.f113821n = context;
        this.f113819l = aVar;
        this.f113812e = GroupMemberManageModule.m177902a().getChatDependency();
        this.f113813f = GroupMemberManageModule.m177902a().getChatterDependency();
        this.f113814g = GroupMemberManageModule.m177902a().getAccountDependency();
        this.f113815h = GroupMemberManageModule.m177902a().getSearchDependency();
        this.f113816i = GroupMemberManageModule.m177902a().getUserAuthorityDependency();
        this.f113817j = GroupMemberManageModule.m177902a().getCreateGroupDependency();
        this.f113818k = GroupMemberManageModule.m177902a().getChatSettingDependency();
        mo159063a(bundle);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public void mo159023a(String str, Chat chat, List<SearchBaseInfo> list) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList(list.size());
            for (SearchBaseInfo searchBaseInfo : list) {
                if (searchBaseInfo instanceof SearchChatterInfo) {
                    arrayList.add(searchBaseInfo.getId());
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < arrayList.size()) {
                int i2 = i + 1;
                arrayList2.add(new C44893a(i2, (String) arrayList.get(i)));
                i = i2;
            }
            IGroupMemberManageModuleDependency.AbstractC44889k kVar = this.f113815h;
            if (chat == null) {
                str2 = "";
            } else {
                str2 = chat.getId();
            }
            kVar.mo143799a(str, str2, arrayList2, new IGetDataCallback<Void>() {
                /* class com.ss.android.lark.member_manage.impl.add_member.C44948c.C449491 */

                /* renamed from: a */
                public void onSuccess(Void r1) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165382e("put search history failed: " + errorResult.toString());
                }
            });
        }
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public void mo159021a(Chat.ChatMode chatMode, List<PickChatEntity> list, Chat chat, IGetDataCallback<Pair<Boolean, String>> iGetDataCallback) {
        this.f113818k.mo143811a(chatMode, list, chat, iGetDataCallback);
    }

    @Override // com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract.AbstractC44929a
    /* renamed from: a */
    public void mo159019a(Context context, boolean z, boolean z2, List<SearchBaseInfo> list, IGetDataCallback<Chat> iGetDataCallback) {
        this.f113817j.mo143814a(context, z, z2, list, this.f113820m.getId(), iGetDataCallback, true);
    }
}
