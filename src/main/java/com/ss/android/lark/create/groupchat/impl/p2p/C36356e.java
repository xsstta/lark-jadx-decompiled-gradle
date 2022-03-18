package com.ss.android.lark.create.groupchat.impl.p2p;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.mvp.C26033a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.impl.p1779b.C36276b;
import com.ss.android.lark.create.groupchat.impl.p2p.AbstractC36349b;
import com.ss.android.lark.create.groupchat.impl.p2p.p1783a.AbstractC36345a;
import com.ss.android.lark.create.groupchat.impl.p2p.p1783a.C36347b;
import com.ss.android.lark.create.groupchat.impl.p2p.view.C36363a;
import com.ss.android.lark.create.groupchat.impl.p2p.view.GroupChatStructureBaseView;
import com.ss.android.lark.create.groupchat.impl.p2p.view.p1784a.C36366b;
import com.ss.android.lark.create.groupchat.impl.util.GroupFGUtils;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.lark.create.groupchat.impl.p2p.e */
public class C36356e extends C26033a<AbstractC36349b.AbstractC36350a, AbstractC36349b.AbstractC36351b> {

    /* renamed from: a */
    public boolean f93811a;

    /* renamed from: b */
    public AbstractC36349b.AbstractC36350a f93812b;

    /* renamed from: c */
    public AbstractC36349b.AbstractC36351b f93813c;

    /* renamed from: d */
    private final GroupChatStructureBaseView.AbstractC36362a f93814d;

    /* renamed from: e */
    private final Activity f93815e;

    /* renamed from: f */
    private final AbstractC36345a.AbstractC36346a f93816f = new AbstractC36345a.AbstractC36346a() {
        /* class com.ss.android.lark.create.groupchat.impl.p2p.C36356e.C363571 */

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.p1783a.AbstractC36345a.AbstractC36346a
        /* renamed from: a */
        public void mo134099a() {
            C36356e.this.f93813c.mo134111a(C36356e.this.f93812b.mo134095c());
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.p1783a.AbstractC36345a.AbstractC36346a
        /* renamed from: a */
        public void mo134101a(List<SearchBaseInfo> list) {
            C36356e.this.f93813c.mo134110a(list);
        }

        @Override // com.ss.android.lark.create.groupchat.impl.p2p.p1783a.AbstractC36345a.AbstractC36346a
        /* renamed from: a */
        public void mo134100a(int i) {
            boolean z;
            C36356e.this.mo134140c();
            ((AbstractC36349b.AbstractC36351b) C36356e.this.mo92551a()).mo134111a(((AbstractC36349b.AbstractC36350a) C36356e.this.mo92554b()).mo134095c());
            AbstractC36349b.AbstractC36351b bVar = (AbstractC36349b.AbstractC36351b) C36356e.this.mo92551a();
            boolean z2 = false;
            if (i <= 1 || C36356e.this.f93811a) {
                z = false;
            } else {
                z = true;
            }
            bVar.mo134112a(z);
            if (DesktopUtil.m144307b()) {
                ((AbstractC36349b.AbstractC36351b) C36356e.this.mo92551a()).mo134110a(((AbstractC36349b.AbstractC36350a) C36356e.this.mo92554b()).mo134096d());
                AbstractC36349b.AbstractC36351b bVar2 = (AbstractC36349b.AbstractC36351b) C36356e.this.mo92551a();
                if (i > 1 && !C36356e.this.f93811a) {
                    z2 = true;
                }
                bVar2.mo134112a(z2);
            }
        }
    };

    /* renamed from: f */
    public GroupChatStructureBaseView.AbstractC36362a mo134143f() {
        return this.f93814d;
    }

    /* renamed from: d */
    public AbstractC36349b.AbstractC36351b mo134141d() {
        return (AbstractC36349b.AbstractC36351b) mo92551a();
    }

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        GroupFGUtils.m142835a(false);
    }

    /* renamed from: e */
    public AbstractC36349b.AbstractC36350a mo134142e() {
        return (AbstractC36349b.AbstractC36350a) mo92554b();
    }

    /* renamed from: g */
    public void mo134144g() {
        this.f93813c.mo134116e();
    }

    /* renamed from: c */
    public void mo134140c() {
        int i;
        if (!this.f93811a) {
            AbstractC36349b.AbstractC36351b bVar = this.f93813c;
            if (this.f93812b.mo134098h()) {
                i = 0;
            } else {
                i = 8;
            }
            bVar.mo134108a(i);
        }
    }

    /* renamed from: a */
    public void mo134138a(Intent intent) {
        this.f93812b.mo134092a(C36276b.m142828a(CreateGroupChatModule.getDependency().getContactDependency().mo133737a(intent), ((AbstractC36349b.AbstractC36350a) mo92554b()).mo134095c()));
    }

    /* renamed from: b */
    private void m143285b(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("key_is_secret", false);
        this.f93811a = booleanExtra;
        GroupFGUtils.m142835a(booleanExtra);
        this.f93813c = new C36363a(this.f93815e, this.f93814d, this.f93811a);
        C36347b bVar = new C36347b(intent, this.f93811a, this.f93816f);
        this.f93812b = bVar;
        mo92553a(this.f93813c, bVar);
        this.f93813c.setViewDelegate(new C36366b(this));
    }

    /* renamed from: a */
    public void mo134139a(Bundle bundle) {
        Department c;
        bundle.putSerializable("selectedIds", (HashMap) this.f93812b.mo134095c());
        bundle.putSerializable("requiredIds", (HashSet) this.f93812b.mo134089a());
        if (this.f93813c.mo134115d() == 2 && (c = this.f93813c.mo134114c()) != null) {
            bundle.putString("department_id", c.getId());
        }
    }

    public C36356e(Activity activity, Intent intent, GroupChatStructureBaseView.AbstractC36362a aVar) {
        this.f93814d = aVar;
        this.f93815e = activity;
        m143285b(intent);
    }
}
