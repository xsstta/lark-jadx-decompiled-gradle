package com.ss.android.lark.create.groupchat.impl.inside;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.dto.CreateGroupScene;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.info.C36314c;
import com.ss.android.lark.create.groupchat.impl.inside.C36332a;
import com.ss.android.lark.create.groupchat.impl.inside.C36338c;
import com.ss.android.lark.create.groupchat.impl.inside.InsideGroupView;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36276b;
import com.ss.android.lark.create.groupchat.impl.service.CreateGroupChatUtils;
import com.ss.android.lark.create.groupchat.impl.service.CreateGroupService;
import com.ss.android.lark.create.groupchat.impl.statistics.GroupHitPoint;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.create.groupchat.impl.inside.d */
public class C36340d extends BasePresenter<C36332a.AbstractC36333a, C36332a.AbstractC36334b, C36332a.AbstractC36334b.AbstractC36335a> {

    /* renamed from: a */
    public InsideGroupView.AbstractC36331a f93783a;

    /* renamed from: b */
    public long f93784b;

    /* renamed from: c */
    public String f93785c = "";

    /* renamed from: d */
    private AbstractC36248c.AbstractC36249a f93786d = CreateGroupChatModule.getDependency().getAccountDependency();

    /* renamed from: e */
    private C36338c.AbstractC36339a f93787e = new C36338c.AbstractC36339a() {
        /* class com.ss.android.lark.create.groupchat.impl.inside.C36340d.C363411 */

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36338c.AbstractC36339a
        /* renamed from: b */
        public void mo134072b() {
            ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134028e();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36338c.AbstractC36339a
        /* renamed from: a */
        public void mo134070a() {
            ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134020a(((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b());
            ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134019a(((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134049c());
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36338c.AbstractC36339a
        /* renamed from: b */
        public void mo134073b(List<SearchBaseInfo> list) {
            ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134023b(list);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36338c.AbstractC36339a
        /* renamed from: a */
        public void mo134071a(List<SearchBaseInfo> list) {
            ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134019a(list);
            ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134020a(((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b());
        }
    };

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C36332a.AbstractC36334b.AbstractC36335a createViewDelegate() {
        return new C36342a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.create.groupchat.impl.inside.d$a */
    public class C36342a implements C36332a.AbstractC36334b.AbstractC36335a {
        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: a */
        public void mo134059a(List<String> list, List<SearchBaseInfo> list2) {
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: b */
        public List<String> mo134061b() {
            return ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134041a();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: c */
        public String mo134063c() {
            return ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134055h();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: d */
        public Map<String, SearchBaseInfo> mo134064d() {
            return ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b();
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: a */
        public void mo134056a() {
            Map<String, SearchBaseInfo> b = ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b();
            if (b != null && b.size() > 0) {
                C36340d.this.f93783a.mo134035a(new ArrayList(b.values()));
            }
        }

        private C36342a() {
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: a */
        public void mo134060a(boolean z) {
            ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134048b(z);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: a */
        public void mo134057a(Context context) {
            Map<String, SearchBaseInfo> b = ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b();
            GroupCreateInfo g = ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134053g();
            ArrayList arrayList = new ArrayList(b.values());
            if (g.isPublic()) {
                if (!DesktopUtil.m144307b()) {
                    C36314c.m143032a(((C36332a.AbstractC36334b) C36340d.this.getView()).mo134029f(), g, CreateGroupChatUtils.m142782b(arrayList), C36340d.this.f93784b);
                } else if (g.isPublic() && TextUtils.isEmpty(g.getName())) {
                    LKUIToast.show(context, (int) R.string.Lark_Group_CreateGroup_TypePublic_SetName_Noinput);
                }
                ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134015a();
            } else {
                IGetDataCallback iGetDataCallback = (IGetDataCallback) ((C36332a.AbstractC36333a) C36340d.this.getModel()).getCallbackManager().wrapAndAddCallback(new IGetDataCallback<Chat>() {
                    /* class com.ss.android.lark.create.groupchat.impl.inside.C36340d.C36342a.C363431 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134015a();
                    }

                    /* renamed from: a */
                    public void onSuccess(Chat chat) {
                        C36340d.this.f93783a.mo134034a(chat.getId());
                        ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134015a();
                    }
                });
                CreateGroupScene createGroupScene = CreateGroupScene.PLUS_MENU;
                if (C36340d.this.f93785c.equals("forward")) {
                    createGroupScene = CreateGroupScene.FORWARD;
                }
                CreateGroupService.m142804a(context, g, arrayList, iGetDataCallback, createGroupScene);
            }
            long currentTimeMillis = (System.currentTimeMillis() - C36340d.this.f93784b) / 1000;
            if (currentTimeMillis > 0 && g.isCreateTopicGroup()) {
                CreateGroupChatModule.getDependency().getChatDependency().mo133735c(String.valueOf(currentTimeMillis));
            }
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: b */
        public void mo134062b(String str, SearchBaseInfo searchBaseInfo) {
            if (!((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134041a().contains(searchBaseInfo.getId())) {
                ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134047b(searchBaseInfo);
                ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134020a(((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b());
            }
        }

        @Override // com.ss.android.lark.create.groupchat.impl.inside.C36332a.AbstractC36334b.AbstractC36335a
        /* renamed from: a */
        public void mo134058a(String str, SearchBaseInfo searchBaseInfo) {
            if ((searchBaseInfo instanceof SearchChatterInfo) && ((SearchChatterInfo) searchBaseInfo).isNotContact() && ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134050d().size() > CreateGroupChatModule.getDependency().getAppConfigDependency().mo133723a()) {
                ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134018a(UIHelper.getString(R.string.Lark_NewContacts_PermissionRequestSelectUserMax));
            } else if (((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b().size() >= 100) {
                ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134018a(UIHelper.getString(R.string.Lark_Legacy_AddGuestLimit));
            } else if (!((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134041a().contains(searchBaseInfo.getId())) {
                ((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134043a(searchBaseInfo);
                ((C36332a.AbstractC36334b) C36340d.this.getView()).mo134020a(((C36332a.AbstractC36333a) C36340d.this.getModel()).mo134046b());
            }
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        this.f93784b = System.currentTimeMillis();
        m143183d();
    }

    /* renamed from: a */
    public boolean mo134078a() {
        return ((C36332a.AbstractC36334b) getView()).mo134027d();
    }

    /* renamed from: d */
    private void m143183d() {
        ((C36332a.AbstractC36334b) getView()).mo134016a(((C36332a.AbstractC36333a) getModel()).mo134053g());
        ((C36332a.AbstractC36333a) getModel()).mo134053g().setTypeChangeListener(new GroupCreateInfo.OnTypeChangeListener() {
            /* class com.ss.android.lark.create.groupchat.impl.inside.$$Lambda$d$xStcv9AwVAbuEQ9ZVJ7ddHtdbZ8 */

            @Override // com.ss.android.lark.create.groupchat.dto.GroupCreateInfo.OnTypeChangeListener
            public final void onTypeChanged(boolean z) {
                C36340d.this.m143179a((C36340d) z);
            }
        });
    }

    /* renamed from: b */
    public void mo134079b() {
        C36332a.AbstractC36333a aVar = (C36332a.AbstractC36333a) getModel();
        GroupHitPoint.f93889a.mo134207a();
        this.f93783a.mo134031a();
    }

    /* renamed from: e */
    private void m143184e() {
        Map<String, SearchBaseInfo> b = ((C36332a.AbstractC36333a) getModel()).mo134046b();
        ArrayList arrayList = new ArrayList();
        for (SearchBaseInfo searchBaseInfo : b.values()) {
            if (!m143180a(searchBaseInfo)) {
                arrayList.add(searchBaseInfo);
            }
        }
        if (arrayList.size() != b.size()) {
            ((C36332a.AbstractC36333a) getModel()).mo134044a(arrayList);
        }
    }

    /* renamed from: a */
    public void mo134077a(String str) {
        this.f93785c = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m143179a(boolean z) {
        mo134076a(((C36332a.AbstractC36333a) getModel()).mo134053g());
    }

    /* renamed from: b */
    private boolean m143182b(SearchBaseInfo searchBaseInfo) {
        if (searchBaseInfo instanceof SearchChatterInfo) {
            return ((SearchChatterInfo) searchBaseInfo).isCrossTenant();
        }
        if (searchBaseInfo instanceof SearchChatInfo) {
            return ((SearchChatInfo) searchBaseInfo).isCrossTenant();
        }
        return false;
    }

    /* renamed from: a */
    private boolean m143180a(SearchBaseInfo searchBaseInfo) {
        AbstractC36248c.AbstractC36249a accountDependency = CreateGroupChatModule.getDependency().getAccountDependency();
        if (((C36332a.AbstractC36333a) getModel()).mo134052f() || !m143182b(searchBaseInfo) || accountDependency.mo133722c()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo134074a(Intent intent) {
        ((C36332a.AbstractC36333a) getModel()).mo134044a(C36276b.m142828a(CreateGroupChatModule.getDependency().getContactDependency().mo133737a(intent), ((C36332a.AbstractC36333a) getModel()).mo134046b()));
    }

    /* renamed from: a */
    public void mo134075a(Bundle bundle) {
        Department b;
        bundle.putSerializable("selectedIds", (HashMap) ((C36332a.AbstractC36333a) getModel()).mo134046b());
        bundle.putSerializable("requiredIds", (HashMap) ((C36332a.AbstractC36333a) getModel()).mo134051e());
        if (((C36332a.AbstractC36334b) getView()).mo134025c() == 2 && (b = ((C36332a.AbstractC36334b) getView()).mo134022b()) != null) {
            bundle.putString("department_id", b.getId());
        }
    }

    /* renamed from: a */
    public void mo134076a(GroupCreateInfo groupCreateInfo) {
        GroupCreateInfo g = ((C36332a.AbstractC36333a) getModel()).mo134053g();
        ((C36332a.AbstractC36333a) getModel()).mo134042a(groupCreateInfo);
        ((C36332a.AbstractC36334b) getView()).mo134016a(groupCreateInfo);
        m143181b(g, groupCreateInfo);
        m143178a(g, groupCreateInfo);
    }

    /* renamed from: a */
    private void m143178a(GroupCreateInfo groupCreateInfo, GroupCreateInfo groupCreateInfo2) {
        boolean z;
        boolean z2 = false;
        if (groupCreateInfo == null || groupCreateInfo.getMode() != groupCreateInfo2.getMode()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            List<SearchBaseInfo> c = ((C36332a.AbstractC36333a) getModel()).mo134049c();
            ArrayList arrayList = new ArrayList(c.size());
            for (SearchBaseInfo searchBaseInfo : c) {
                if (searchBaseInfo instanceof SearchChatterInfo) {
                    arrayList.add(searchBaseInfo);
                }
            }
            ((C36332a.AbstractC36333a) getModel()).mo134044a(arrayList);
            if (groupCreateInfo2.getMode() != CreateGroupMode.SECRET_MODE) {
                z2 = true;
            }
            ((C36332a.AbstractC36334b) getView()).mo134024b(z2);
        }
    }

    /* renamed from: b */
    private void m143181b(GroupCreateInfo groupCreateInfo, GroupCreateInfo groupCreateInfo2) {
        boolean z;
        if (groupCreateInfo == null || groupCreateInfo.isPublic() != groupCreateInfo2.isPublic()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (DesktopUtil.m144307b()) {
                ((C36332a.AbstractC36333a) getModel()).mo134045a(groupCreateInfo2.isPublic());
                ((C36332a.AbstractC36334b) getView()).mo134020a(((C36332a.AbstractC36333a) getModel()).mo134046b());
                ((C36332a.AbstractC36334b) getView()).mo134019a(((C36332a.AbstractC36333a) getModel()).mo134049c());
            } else {
                m143184e();
            }
            ((C36332a.AbstractC36334b) getView()).mo134021a(groupCreateInfo2.isPublic());
        }
    }

    public C36340d(Context context, Bundle bundle, GroupCreateInfo groupCreateInfo, InsideGroupView.AbstractC36331a aVar) {
        this.f93783a = aVar;
        InsideGroupView insideGroupView = new InsideGroupView(context, aVar, groupCreateInfo.isCreateTopicGroup());
        setModel(new C36338c(bundle, groupCreateInfo, this.f93787e));
        setView(insideGroupView);
        C36332a.AbstractC36334b.AbstractC36335a c = createViewDelegate();
        if (c != null) {
            insideGroupView.setViewDelegate(c);
        }
    }
}
