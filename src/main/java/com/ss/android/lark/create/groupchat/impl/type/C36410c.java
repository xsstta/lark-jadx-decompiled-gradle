package com.ss.android.lark.create.groupchat.impl.type;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.larksuite.suite.R;
import com.ss.android.lark.create.groupchat.dto.GroupCreateInfo;
import com.ss.android.lark.create.groupchat.impl.select_member.NextStepClickListener;
import com.ss.android.lark.create.groupchat.impl.type.AbstractC36413d;
import com.ss.android.lark.create.groupchat.impl.type.fragment.GroupTypeSelectorFragment;

/* renamed from: com.ss.android.lark.create.groupchat.impl.type.c */
public class C36410c implements AbstractC36413d.AbstractC36414a {

    /* renamed from: a */
    public AbstractC36412a f93943a;

    /* renamed from: b */
    private Context f93944b;

    /* renamed from: c */
    private GroupCreateInfo f93945c;

    /* renamed from: d */
    private GroupTypeSelectorFragment f93946d;

    /* renamed from: com.ss.android.lark.create.groupchat.impl.type.c$a */
    public interface AbstractC36412a {
        /* renamed from: a */
        FragmentManager mo134233a();

        /* renamed from: a */
        void mo134234a(GroupCreateInfo groupCreateInfo);

        /* renamed from: a */
        void mo134235a(C36410c cVar);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC36413d.AbstractC36414a.AbstractC36415a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public boolean mo134265a() {
        GroupTypeSelectorFragment bVar = this.f93946d;
        if (bVar != null) {
            return bVar.mo134067c();
        }
        return false;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f93943a.mo134235a(this);
        m143544b();
    }

    /* renamed from: b */
    private void m143544b() {
        FragmentTransaction beginTransaction = this.f93943a.mo134233a().beginTransaction();
        new Bundle().putSerializable("key_group_create_info", this.f93945c);
        GroupTypeSelectorFragment a = GroupTypeSelectorFragment.f93899b.mo134238a(this.f93945c, new NextStepClickListener() {
            /* class com.ss.android.lark.create.groupchat.impl.type.C36410c.C364111 */

            @Override // com.ss.android.lark.create.groupchat.impl.select_member.NextStepClickListener
            /* renamed from: a */
            public void mo134195a(GroupCreateInfo groupCreateInfo) {
                C36410c.this.f93943a.mo134234a(groupCreateInfo);
            }
        });
        this.f93946d = a;
        beginTransaction.add(R.id.content_root, a);
        beginTransaction.commitAllowingStateLoss();
    }

    public C36410c(Context context, GroupCreateInfo groupCreateInfo, AbstractC36412a aVar) {
        this.f93944b = context;
        this.f93943a = aVar;
        this.f93945c = groupCreateInfo;
    }
}
