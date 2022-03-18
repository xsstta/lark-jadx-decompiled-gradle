package com.ss.android.lark.create.groupchat.impl.p2p.view.p1784a;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.CreateGroupScene;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.p2p.C36356e;
import com.ss.android.lark.create.groupchat.impl.service.CreateGroupChatUtils;
import com.ss.android.lark.create.groupchat.impl.service.CreateGroupErrorHandlers;
import com.ss.android.lark.create.groupchat.impl.service.CreateGroupService;
import com.ss.android.lark.create.groupchat.impl.statistics.GroupHitPoint;
import com.ss.android.lark.create.groupchat.impl.statistics.P2PCreateGroupHitPoint;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.view.a.b */
public class C36366b extends AbstractC36365a {
    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: e */
    public List<String> mo134126e() {
        return this.f93829a.mo134093b();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: f */
    public String mo134127f() {
        return this.f93829a.mo134104g();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: g */
    public Map<String, SearchBaseInfo> mo134128g() {
        return this.f93829a.mo134095c();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.p1784a.AbstractC36365a
    /* renamed from: h */
    public void mo134151h() {
        this.f93830b.mo134108a(8);
    }

    /* renamed from: j */
    private boolean m143350j() {
        if (!this.f93830b.mo134113b() || this.f93829a.mo134103f() == null || this.f93829a.mo134103f().getLastMessagePosition() < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private ArrayList<Contact> m143351k() {
        HashSet<SearchBaseInfo> hashSet = new HashSet(this.f93829a.mo134097e().values());
        ArrayList<Contact> arrayList = new ArrayList<>(hashSet.size());
        for (SearchBaseInfo searchBaseInfo : hashSet) {
            arrayList.add(new Contact(searchBaseInfo.getId(), searchBaseInfo.getAvatarKey(), searchBaseInfo.getTitle()));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.create.groupchat.impl.p2p.view.p1784a.AbstractC36365a
    /* renamed from: i */
    public void mo134152i() {
        boolean z;
        String str;
        Map<String, SearchBaseInfo> e = this.f93829a.mo134097e();
        Map<String, SearchBaseInfo> c = this.f93829a.mo134095c();
        HashSet hashSet = new HashSet();
        for (String str2 : this.f93829a.mo134089a()) {
            if (!e.containsKey(str2)) {
                SearchChatterInfo searchChatterInfo = new SearchChatterInfo();
                searchChatterInfo.setId(str2);
                hashSet.add(searchChatterInfo);
            }
        }
        HashSet hashSet2 = new HashSet(c.values());
        hashSet2.addAll(hashSet);
        hashSet2.removeAll(e.values());
        Chat f = this.f93829a.mo134103f();
        boolean z2 = true;
        if (hashSet2.size() > 2 || f == null || !f.isP2PChat() || !TextUtils.equals(f.getP2pChatterId(), this.f93829a.mo134105i())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Iterator it = hashSet2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = "";
                    break;
                }
                SearchBaseInfo searchBaseInfo = (SearchBaseInfo) it.next();
                if (!TextUtils.equals(this.f93829a.mo134105i(), searchBaseInfo.getId())) {
                    str = searchBaseInfo.getId();
                    break;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                this.f93831c.mo134133a(str);
                return;
            }
        }
        if (m143350j()) {
            m143349b(new ArrayList<>(CreateGroupChatUtils.m142782b(hashSet2)), f);
            return;
        }
        GroupCreateInfo groupCreateInfo = new GroupCreateInfo();
        if (f == null || !f.isSecret()) {
            z2 = false;
        }
        if (z2) {
            groupCreateInfo.setMode(CreateGroupMode.SECRET_MODE);
        }
        CreateGroupService.m142804a(this.f93830b.mo134118g(), groupCreateInfo, new ArrayList(hashSet2), (IGetDataCallback) this.f93829a.getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.p1784a.C36366b.C363671 */

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                GroupHitPoint.f93889a.mo134209a(chat, "p2p_config");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C36366b.this.f93830b.mo134107a();
            }
        }), CreateGroupScene.P2P);
        P2PCreateGroupHitPoint.f93890a.mo134220a(hashSet2.size(), false, z2);
    }

    public C36366b(C36356e eVar) {
        super(eVar);
    }

    /* renamed from: b */
    private void m143349b(final ArrayList<PickChatEntity> arrayList, final Chat chat) {
        CreateGroupService.m142807a(Chat.ChatMode.DEFAULT, arrayList, chat, this.f93829a.getCallbackManager().wrapAndAddGetDataCallback(new UIGetDataCallback<Pair<Boolean, String>>() {
            /* class com.ss.android.lark.create.groupchat.impl.p2p.view.p1784a.C36366b.C363682 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                C36366b.this.f93830b.mo134109a(errorResult.getDisplayMsg());
            }

            /* renamed from: a */
            public void onSuccessed(Pair<Boolean, String> pair) {
                if (!((Boolean) pair.first).booleanValue()) {
                    CreateGroupErrorHandlers.f93544a.mo133806a(C36366b.this.f93831c.mo134137d(), (String) pair.second, CreateGroupScene.P2P);
                } else {
                    C36366b.this.mo134153a(arrayList, chat);
                }
            }
        }));
    }

    /* renamed from: a */
    public void mo134153a(ArrayList<PickChatEntity> arrayList, Chat chat) {
        boolean z;
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("param_chatter_ids", arrayList);
        intent.putParcelableArrayListExtra("contacts_to_apply", m143351k());
        Department c = this.f93830b.mo134114c();
        if (c != null) {
            intent.putExtra("department_id", c.getId());
        }
        this.f93831c.mo134131a(intent);
        P2PCreateGroupHitPoint.Companion aVar = P2PCreateGroupHitPoint.f93890a;
        int size = arrayList.size();
        if (chat == null || !chat.isSecret()) {
            z = false;
        } else {
            z = true;
        }
        aVar.mo134220a(size, true, z);
    }
}
