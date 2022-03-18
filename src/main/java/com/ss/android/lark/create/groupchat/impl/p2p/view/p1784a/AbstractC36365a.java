package com.ss.android.lark.create.groupchat.impl.p2p.view.p1784a;

import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b;
import com.ss.android.lark.create.groupchat.impl.p2p.C36356e;
import com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.view.a.a */
public abstract class AbstractC36365a implements AbstractC36349b.AbstractC36351b.AbstractC36352a {

    /* renamed from: a */
    protected AbstractC36349b.AbstractC36350a f93829a;

    /* renamed from: b */
    protected AbstractC36349b.AbstractC36351b f93830b;

    /* renamed from: c */
    protected GroupChatStructureBaseView.AbstractC36362a f93831c;

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: a */
    public boolean mo134121a(List<String> list, List<SearchBaseInfo> list2) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract void mo134151h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract void mo134152i();

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: b */
    public void mo134122b() {
        m143339j();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: c */
    public void mo134124c() {
        m143339j();
        mo134152i();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: a */
    public void mo134119a() {
        m143339j();
        mo134151h();
        this.f93831c.mo134130a();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: d */
    public void mo134125d() {
        Map<String, SearchBaseInfo> c = this.f93829a.mo134095c();
        if (c != null && c.size() > 0) {
            this.f93831c.mo134134a(new ArrayList(c.values()));
        }
    }

    /* renamed from: j */
    private void m143339j() {
        if (CollectionUtils.isNotEmpty(this.f93829a.mo134095c())) {
            this.f93829a.mo134102a(this.f93830b.mo134117f(), this.f93829a.mo134103f(), new ArrayList(this.f93829a.mo134095c().keySet()));
        }
    }

    public AbstractC36365a(C36356e eVar) {
        this.f93829a = eVar.mo134142e();
        this.f93830b = eVar.mo134141d();
        this.f93831c = eVar.mo134143f();
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: b */
    public boolean mo134123b(String str, SearchBaseInfo searchBaseInfo) {
        if (this.f93829a.mo134093b().contains(searchBaseInfo.getId())) {
            return false;
        }
        this.f93829a.mo134094b(searchBaseInfo);
        this.f93830b.mo134111a(this.f93829a.mo134095c());
        return true;
    }

    @Override // com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b.AbstractC36351b.AbstractC36352a
    /* renamed from: a */
    public boolean mo134120a(String str, SearchBaseInfo searchBaseInfo) {
        if (this.f93829a.mo134097e().size() > CreateGroupChatModule.getDependency().getAppConfigDependency().mo133723a()) {
            this.f93830b.mo134109a(UIHelper.getString(R.string.Lark_NewContacts_PermissionRequestSelectUserMax));
            return false;
        } else if (this.f93829a.mo134095c().size() >= 100) {
            this.f93830b.mo134109a(UIHelper.getString(R.string.Lark_Legacy_AddGuestLimit));
            return false;
        } else if (this.f93829a.mo134093b().contains(searchBaseInfo.getId())) {
            return false;
        } else {
            this.f93829a.mo134091a(searchBaseInfo);
            this.f93830b.mo134111a(this.f93829a.mo134095c());
            return true;
        }
    }
}
