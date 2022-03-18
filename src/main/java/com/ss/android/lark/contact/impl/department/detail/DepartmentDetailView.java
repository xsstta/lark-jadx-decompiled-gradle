package com.ss.android.lark.contact.impl.department.detail;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.mvp.C26034b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.AbstractC29541ac;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.SchoolParent;
import com.ss.android.lark.contact.impl.department.detail.C35841e;
import com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b;
import com.ss.android.lark.contact.impl.department.detail.frame.C35850a;
import com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DepartmentDetailView extends C26034b<C35841e.AbstractC35844b.AbstractC35845a> implements C35841e.AbstractC35844b, AbstractC35851b {

    /* renamed from: a */
    public C35841e.AbstractC35844b.AbstractC35845a f92585a;

    /* renamed from: b */
    private final AbstractC35818a f92586b;

    /* renamed from: c */
    private final Activity f92587c;

    /* renamed from: d */
    private final Bundle f92588d;

    /* renamed from: e */
    private final String f92589e = C35358a.m138143a().mo130163h().mo130231c();

    /* renamed from: f */
    private boolean f92590f;

    /* renamed from: g */
    private boolean f92591g;

    /* renamed from: h */
    private final boolean f92592h;

    /* renamed from: i */
    private boolean f92593i;

    /* renamed from: j */
    private String f92594j;
    ViewGroup mContainerLayout;
    DepartmentFrameView mDepartmentFrameView;
    TextView mSchoolInfoCount;

    /* renamed from: com.ss.android.lark.contact.impl.department.detail.DepartmentDetailView$a */
    public interface AbstractC35818a extends AbstractC29541ac {
        /* renamed from: a */
        void mo131785a(DepartmentDetailView departmentDetailView);

        /* renamed from: b */
        void mo131786b();

        /* renamed from: b */
        void mo131787b(String str);
    }

    /* renamed from: d */
    public void mo131776d() {
        mo131782h();
    }

    /* renamed from: a */
    public void mo131760a(boolean z) {
        DepartmentFrameView departmentFrameView = this.mDepartmentFrameView;
        if (departmentFrameView != null) {
            departmentFrameView.mo131871b(z);
        }
    }

    /* renamed from: a */
    public void mo131759a(List<String> list) {
        this.mDepartmentFrameView.setSelectedMembers(m140171d(list));
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: a */
    public void mo131757a(String str) {
        this.f92586b.mo131787b(str);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: a */
    public void mo131756a(DepartmentRecyclerViewItem departmentRecyclerViewItem, int i) {
        DepartmentRecyclerViewItem.Person person = departmentRecyclerViewItem.getPerson();
        Chatter chatter = person.getChatter();
        this.f92586b.mo102979a(chatter);
        this.f92586b.mo102980a(chatter, person.getDeniedReason(), i);
        ContactHitPoint.m140786a((this.mDepartmentFrameView.getBreadcrumbsLength() - this.mDepartmentFrameView.getBreadCrumbsLengthPrefix()) + 1, null, chatter != null ? chatter.getId() : null);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: a */
    public boolean mo131761a(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
        return !this.f92586b.mo102984a(departmentRecyclerViewItem.getDepartment(), z);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: a */
    public boolean mo131762a(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z, int i) {
        DepartmentRecyclerViewItem.Person person = departmentRecyclerViewItem.getPerson();
        ContactHitPoint.m140789a(departmentRecyclerViewItem.isCrossTenant());
        return !this.f92586b.mo102983a(person.getChatter(), z, person.getDeniedReason(), person.getEnterpriseEmail(), i);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: a */
    public void mo131758a(String str, String str2, int i) {
        this.f92586b.mo102978a(this.f92587c, str, str2, i);
    }

    /* renamed from: b */
    public Department mo131763b() {
        return this.mDepartmentFrameView.getCurDepartment();
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: e */
    public void mo131779e() {
        this.f92586b.mo131786b();
    }

    /* renamed from: g */
    public int mo131781g() {
        return this.mDepartmentFrameView.getBreadcrumbsLength();
    }

    /* renamed from: a */
    public void mo131747a() {
        this.mDepartmentFrameView.mo131875e();
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f92586b.mo131785a(this);
        m140173i();
        m140174j();
    }

    /* renamed from: h */
    public void mo131782h() {
        this.f92585a.mo131849a(this.mDepartmentFrameView.getCurDepartment(), this.mDepartmentFrameView.mo131872b());
    }

    /* renamed from: i */
    private void m140173i() {
        int i;
        AbstractC35818a aVar = this.f92586b;
        if (this.f92592h) {
            i = R.string.Lark_B2B_TrustedParties;
        } else {
            i = R.string.Lark_Legacy_StructureDepartments;
        }
        aVar.mo102981a(UIHelper.getString(i));
        this.f92586b.mo102982a(false);
        this.mDepartmentFrameView.setPullRefreshListener(new DepartmentListView.AbstractC35854a() {
            /* class com.ss.android.lark.contact.impl.department.detail.DepartmentDetailView.C358171 */

            @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView.AbstractC35854a
            /* renamed from: a */
            public void mo131783a() {
                DepartmentDetailView.this.f92585a.mo131853b();
            }

            @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView.AbstractC35854a
            /* renamed from: a */
            public boolean mo131784a(boolean z) {
                if (!z || !DepartmentDetailView.this.f92585a.mo131852a()) {
                    return false;
                }
                return true;
            }
        });
        this.mDepartmentFrameView.setDepartmentOperationHandler(this);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: f */
    public void mo131780f() {
        this.mDepartmentFrameView.mo131873c();
        Department curDepartment = this.mDepartmentFrameView.getCurDepartment();
        int breadcrumbsLength = this.mDepartmentFrameView.getBreadcrumbsLength() - this.mDepartmentFrameView.getBreadCrumbsLengthPrefix();
        if (this.f92591g) {
            this.f92585a.mo131855b(curDepartment, breadcrumbsLength);
        } else {
            this.f92585a.mo131847a(curDepartment, breadcrumbsLength);
        }
    }

    /* renamed from: j */
    private void m140174j() {
        if (this.f92588d.getBoolean("is_edu_mode", false)) {
            this.f92591g = true;
            this.f92586b.mo102981a(UIHelper.getString(R.string.Lark_Education_SchoolParentContacts));
        }
        if (this.f92588d.getBoolean("get_inactive_parent", false)) {
            this.f92593i = true;
        }
        if (this.f92588d.getBoolean("need_show_local_time", false)) {
            mo131760a(true);
        }
        if (this.f92588d.getBoolean("department_select_mode", false)) {
            mo131769b(true);
        }
        this.f92594j = this.f92588d.getString("department_page_title");
        PickType pickType = (PickType) this.f92588d.getSerializable("department_pick_type");
        this.f92590f = this.f92588d.getBoolean("ignore_login_user", false);
        ArrayList arrayList = (ArrayList) this.f92588d.getSerializable("key_department_select_member");
        ArrayList arrayList2 = (ArrayList) this.f92588d.getSerializable("key_department_contain_member");
        if (!CollectionUtils.isNotEmpty(arrayList2)) {
            arrayList2 = new ArrayList();
        }
        if (!CollectionUtils.isNotEmpty(arrayList)) {
            arrayList = new ArrayList();
        }
        this.mDepartmentFrameView.setSelectedMembers(m140171d(arrayList));
        this.mDepartmentFrameView.setContainsMembers(m140171d(arrayList2));
        this.mDepartmentFrameView.setPickType(pickType);
    }

    /* renamed from: a */
    public void setViewDelegate(C35841e.AbstractC35844b.AbstractC35845a aVar) {
        this.f92585a = aVar;
    }

    /* renamed from: c */
    public void mo131775c(boolean z) {
        this.mDepartmentFrameView.setDisableOutChatter(z);
    }

    /* renamed from: d */
    public void mo131778d(boolean z) {
        this.mDepartmentFrameView.mo131867a(z);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: b */
    public void mo131767b(String str) {
        LKUIToast.show(this.f92587c, str);
    }

    /* renamed from: c */
    public void mo131774c(List<String> list) {
        this.mDepartmentFrameView.setContainsMembers(m140171d(list));
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: d */
    public void mo131777d(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        if (!this.mDepartmentFrameView.mo131869a()) {
            this.f92585a.mo131845a(this.f92587c, departmentRecyclerViewItem);
        }
    }

    /* renamed from: b */
    private void m140168b(Department department) {
        if ((department instanceof SchoolParent) && ((SchoolParent) department).getEduDepartmentLevel() != null) {
            ContactHitPoint.m140784a(((SchoolParent) mo131763b()).getEduDepartmentLevel().getValue());
        }
    }

    /* renamed from: c */
    private void m140169c(Department department) {
        this.f92586b.mo102981a(m140170d(department));
        this.f92586b.mo102982a(true);
        this.mDepartmentFrameView.mo131876f();
    }

    /* renamed from: d */
    private List<String> m140171d(List<String> list) {
        if (!CollectionUtils.isEmpty(list) && this.f92590f) {
            list.remove(this.f92589e);
        }
        return list;
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: a */
    public void mo131748a(int i) {
        mo131767b(UIUtils.getString(this.f92587c, i));
    }

    /* renamed from: d */
    private String m140170d(Department department) {
        if (!TextUtils.isEmpty(this.f92594j) && department != null && "0".equals(department.getId())) {
            return this.f92594j;
        }
        if (department != null) {
            return department.getName();
        }
        return "";
    }

    /* renamed from: a */
    public void mo131749a(PickType pickType) {
        DepartmentFrameView departmentFrameView = this.mDepartmentFrameView;
        if (departmentFrameView != null) {
            departmentFrameView.setPickType(pickType);
        }
    }

    /* renamed from: d */
    private void m140172d(C35850a aVar) {
        if (aVar == null || aVar.mo131895a() == null || C57782ag.m224241a(aVar.mo131895a().getId())) {
            this.mSchoolInfoCount.setVisibility(8);
            return;
        }
        Department a = aVar.mo131895a();
        if (a instanceof SchoolParent) {
            SchoolParent schoolParent = (SchoolParent) a;
            if (!schoolParent.isVirtualNode()) {
                this.mSchoolInfoCount.setVisibility(0);
                int studentCount = schoolParent.getStudentCount();
                int activeParentCount = schoolParent.getActiveParentCount() + schoolParent.getInactiveParentsCount();
                int inactiveParentsCount = schoolParent.getInactiveParentsCount();
                String string = UIHelper.getString(R.string.Lark_Education_XStudentsYParentsInactive);
                HashMap hashMap = new HashMap();
                hashMap.put("CountStudent", String.valueOf(studentCount));
                hashMap.put("CountParent", String.valueOf(activeParentCount));
                hashMap.put("CountInactiveParent", String.valueOf(inactiveParentsCount));
                this.mSchoolInfoCount.setText(UIHelper.mustacheFormat(string, hashMap));
                this.mSchoolInfoCount.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: a */
    public void mo131750a(Department department) {
        m140169c(department);
        this.mDepartmentFrameView.mo131863a(department);
        this.f92585a.mo131854b(department);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: b */
    public void mo131765b(C35850a aVar) {
        boolean z = true;
        this.mDepartmentFrameView.mo131865a(aVar, this.f92588d.getBoolean("KEY_IS_SHOW_CONTACT", true));
        this.f92586b.mo102981a(m140170d(aVar.mo131895a()));
        m140172d(aVar);
        DepartmentFrameView departmentFrameView = this.mDepartmentFrameView;
        boolean z2 = this.f92593i;
        if (aVar.mo131900b() != null && aVar.mo131900b().size() > 0) {
            z = false;
        }
        departmentFrameView.mo131868a(z2, z);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: c */
    public void mo131771c(C35850a aVar) {
        boolean z;
        this.mDepartmentFrameView.mo131864a(aVar);
        m140172d(aVar);
        DepartmentFrameView departmentFrameView = this.mDepartmentFrameView;
        boolean z2 = this.f92593i;
        if (aVar.mo131900b() == null || aVar.mo131900b().size() <= 0) {
            z = true;
        } else {
            z = false;
        }
        departmentFrameView.mo131868a(z2, z);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: b */
    public void mo131766b(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        DepartmentRecyclerViewItem.Person person = departmentRecyclerViewItem.getPerson();
        Chatter chatter = person.getChatter();
        this.f92586b.mo102979a(chatter);
        this.f92586b.mo102980a(chatter, person.getDeniedReason(), -1);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: c */
    public void mo131772c(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        SchoolParent schoolParent = (SchoolParent) departmentRecyclerViewItem.getDepartment();
        boolean isVirtualNode = schoolParent.isVirtualNode();
        this.f92585a.mo131848a(departmentRecyclerViewItem.getDepartment(), schoolParent.getName(), isVirtualNode);
    }

    /* renamed from: b */
    public void mo131768b(List<String> list) {
        this.mDepartmentFrameView.setSelectedDepartment(list);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: c */
    public void mo131773c(String str) {
        new C25639g(this.f92587c).mo89254m(R.string.Lark_Contacts_TeamGroupSupervisorCreateTipContent).mo89248g(R.string.Lark_Contacts_TeamGroupSupervisorCreateTipTitle).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Contacts_TeamGroupSupervisorCreateTipCreate, new DialogInterface.OnClickListener(str) {
            /* class com.ss.android.lark.contact.impl.department.detail.$$Lambda$DepartmentDetailView$p5hRRPySG9Tx2BPz7fYDypA */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                DepartmentDetailView.m270493lambda$p5hRRPySG9Tx2BPz7fYDypA(DepartmentDetailView.this, this.f$1, dialogInterface, i);
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Contacts_TeamGroupSupervisorCreateTipCancel, (DialogInterface.OnClickListener) null).mo89239c();
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: a */
    public void mo131754a(C35850a aVar) {
        boolean z;
        if (aVar.mo131895a().getId().equals(this.mDepartmentFrameView.getCurDepartment().getId())) {
            this.mDepartmentFrameView.setDepartmentData(aVar);
            DepartmentFrameView departmentFrameView = this.mDepartmentFrameView;
            boolean z2 = this.f92593i;
            if (aVar.mo131900b() == null || aVar.mo131900b().size() <= 0) {
                z = true;
            } else {
                z = false;
            }
            departmentFrameView.mo131868a(z2, z);
            m140172d(aVar);
        }
    }

    /* renamed from: b */
    public void mo131769b(boolean z) {
        this.mDepartmentFrameView.setSelecting(z);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: a */
    public void mo131755a(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        String str;
        Department department = departmentRecyclerViewItem.getDepartment();
        this.f92585a.mo131846a(department);
        int breadcrumbsLength = this.mDepartmentFrameView.getBreadcrumbsLength() - this.mDepartmentFrameView.getBreadCrumbsLengthPrefix();
        if (department != null) {
            str = department.getId();
        } else {
            str = null;
        }
        ContactHitPoint.m140786a(breadcrumbsLength, str, null);
        ContactHitPoint.m140791b(breadcrumbsLength);
        this.f92586b.mo102986c(this.f92592h);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: b */
    public void mo131764b(Department department, int i) {
        m140169c(department);
        this.mDepartmentFrameView.mo131862a(i);
        m140168b(department);
        this.f92585a.mo131851a(department.getId(), "", false, i);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.AbstractC35851b
    /* renamed from: c */
    public void mo131770c(Department department, int i) {
        ContactHitPoint.m140810k();
        this.f92586b.mo102985b(this.f92592h);
        if (this.f92585a.mo131857c(department, i)) {
            this.f92586b.mo102977a();
        } else if (this.f92591g) {
            this.f92585a.mo131855b(department, i);
        } else {
            this.f92585a.mo131847a(department, i);
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: a */
    public void mo131751a(Department department, int i) {
        m140169c(department);
        this.mDepartmentFrameView.mo131862a(i);
        this.f92585a.mo131854b(department);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m140167a(String str, DialogInterface dialogInterface, int i) {
        this.f92585a.mo131850a(str);
    }

    public DepartmentDetailView(Activity activity, AbstractC35818a aVar, Bundle bundle) {
        this.f92586b = aVar;
        this.f92587c = activity;
        this.f92588d = bundle;
        this.f92592h = bundle.getBoolean("b2b_connect", false);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.C35841e.AbstractC35844b
    /* renamed from: a */
    public void mo131752a(Department department, String str, boolean z) {
        m140169c(department);
        this.mDepartmentFrameView.mo131863a(department);
        int g = mo131781g();
        m140168b(department);
        this.f92585a.mo131851a(department.getId(), str, z, g);
    }
}
