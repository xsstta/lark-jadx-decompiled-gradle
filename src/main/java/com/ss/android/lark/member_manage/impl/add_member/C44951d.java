package com.ss.android.lark.member_manage.impl.add_member;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.mvp.C26033a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.add_member.AddGroupMemberView;
import com.ss.android.lark.member_manage.impl.add_member.C44948c;
import com.ss.android.lark.member_manage.impl.add_member.IAddGroupMemberContract;
import java.util.HashMap;

/* renamed from: com.ss.android.lark.member_manage.impl.add_member.d */
public class C44951d extends C26033a<IAddGroupMemberContract.AbstractC44929a, IAddGroupMemberContract.IView> {

    /* renamed from: a */
    protected AddGroupMemberView.AbstractC44927a f113826a;

    /* renamed from: b */
    protected Activity f113827b;

    /* renamed from: c */
    protected C44948c.AbstractC44950a f113828c = new C44948c.AbstractC44950a() {
        /* class com.ss.android.lark.member_manage.impl.add_member.C44951d.C449521 */

        @Override // com.ss.android.lark.member_manage.impl.add_member.C44948c.AbstractC44950a
        /* renamed from: b */
        public void mo159067b() {
            IAddGroupMemberContract.IView iView = (IAddGroupMemberContract.IView) C44951d.this.mo92551a();
            if (iView != null) {
                iView.mo158970a(((IAddGroupMemberContract.AbstractC44929a) C44951d.this.mo92554b()).mo159017a());
            }
        }

        @Override // com.ss.android.lark.member_manage.impl.add_member.C44948c.AbstractC44950a
        /* renamed from: a */
        public void mo159066a() {
            IAddGroupMemberContract.IView iView = (IAddGroupMemberContract.IView) C44951d.this.mo92551a();
            if (iView != null) {
                iView.mo158970a(((IAddGroupMemberContract.AbstractC44929a) C44951d.this.mo92554b()).mo159017a());
                if (DesktopUtil.m144307b()) {
                    iView.mo158974b(((IAddGroupMemberContract.AbstractC44929a) C44951d.this.mo92554b()).mo159017a());
                }
            }
        }
    };

    /* renamed from: e */
    public AddGroupMemberView.AbstractC44927a mo159073e() {
        return this.f113826a;
    }

    /* renamed from: c */
    public IAddGroupMemberContract.IView mo159071c() {
        return (IAddGroupMemberContract.IView) mo92551a();
    }

    @Override // com.larksuite.framework.mvp.C26033a, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m178248g();
    }

    /* renamed from: d */
    public IAddGroupMemberContract.AbstractC44929a mo159072d() {
        return (IAddGroupMemberContract.AbstractC44929a) mo92554b();
    }

    /* renamed from: f */
    public void mo159074f() {
        ((IAddGroupMemberContract.IView) mo92551a()).mo158987n();
    }

    /* renamed from: g */
    private void m178248g() {
        if (!GroupMemberManageModule.m177902a().getAccountDependency().mo143792a() && !TextUtils.isEmpty(((IAddGroupMemberContract.AbstractC44929a) mo92554b()).mo159031e())) {
            ((IAddGroupMemberContract.IView) mo92551a()).mo158970a(((IAddGroupMemberContract.AbstractC44929a) mo92554b()).mo159017a());
        }
        ((IAddGroupMemberContract.IView) mo92551a()).mo158969a(((IAddGroupMemberContract.AbstractC44929a) mo92554b()).mo159032f());
    }

    /* renamed from: a */
    public void mo159068a(Intent intent) {
        ((IAddGroupMemberContract.AbstractC44929a) mo92554b()).mo159024a(C44959f.m178302a(GroupMemberManageModule.m177902a().getContactDependency().mo143741b(intent), ((IAddGroupMemberContract.AbstractC44929a) mo92554b()).mo159017a()));
    }

    /* renamed from: a */
    public void mo159069a(Bundle bundle) {
        Department m;
        bundle.putSerializable("selectedIds", (HashMap) ((IAddGroupMemberContract.AbstractC44929a) mo92554b()).mo159017a());
        bundle.putSerializable("extra_key_chat", ((IAddGroupMemberContract.AbstractC44929a) mo92554b()).mo159029c());
        if (((IAddGroupMemberContract.IView) mo92551a()).mo158984k() == 2 && (m = ((IAddGroupMemberContract.IView) mo92551a()).mo158986m()) != null) {
            bundle.putString("department_id", m.getId());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo159070a(Bundle bundle, Bundle bundle2) {
        mo92553a(new AddGroupMemberView(this.f113827b, this.f113826a, bundle.getBoolean("extra_key_show_title_bar", true), true), new C44948c(this.f113827b, bundle, this.f113828c));
        ((IAddGroupMemberContract.IView) mo92551a()).setViewDelegate(new C44953e(this.f113827b, this));
    }

    public C44951d(Activity activity, Bundle bundle, Bundle bundle2, AddGroupMemberView.AbstractC44927a aVar) {
        this.f113826a = aVar;
        this.f113827b = activity;
        mo159070a(bundle, bundle2);
    }
}
