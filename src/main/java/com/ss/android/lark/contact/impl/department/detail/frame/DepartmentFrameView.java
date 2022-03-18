package com.ss.android.lark.contact.impl.department.detail.frame;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.entity.SchoolParent;
import com.ss.android.lark.contact.entity.VirtualNodeType;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentListView;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.crumbs.AbstractC58376b;
import com.ss.android.lark.widget.crumbs.C58375a;
import com.ss.android.lark.widget.crumbs.DepartmentBreadcrumbsView;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class DepartmentFrameView extends LinearLayout {

    /* renamed from: a */
    private Department f92703a;

    /* renamed from: b */
    private final Map<String, Department> f92704b = new HashMap();

    /* renamed from: c */
    private final String f92705c = C35358a.m138143a().mo130156d().mo130258b();

    /* renamed from: d */
    private AbstractC35851b f92706d;
    @BindView(6931)
    DepartmentBreadcrumbsView mDepartmentBreadcrumbsView;
    @BindView(7128)
    DepartmentListView mDepartmentListView;
    @BindView(7129)
    ViewGroup mDepartmentListViewWrapper;
    @BindView(7175)
    View mDividerView;
    @BindView(8318)
    TextView mInviteTv;
    @BindView(8321)
    TextView mTvNodeEmpty;
    @BindView(7176)
    View mdividerDown;
    @BindView(7186)
    View mdividerUp;
    @BindView(7590)
    LinearLayout mllInvite;
    @BindView(7593)
    LinearLayout mllNodeEmpty;

    public Department getCurDepartment() {
        return this.f92703a;
    }

    /* renamed from: a */
    public boolean mo131869a() {
        return this.mDepartmentListView.mo131913b();
    }

    /* renamed from: a */
    public boolean mo131870a(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z, int i) {
        int i2 = C358494.f92710a[departmentRecyclerViewItem.getType().ordinal()];
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return this.f92706d.mo131762a(departmentRecyclerViewItem, z, i);
            }
            if (i2 != 5) {
                return false;
            }
        }
        return this.f92706d.mo131761a(departmentRecyclerViewItem, z);
    }

    /* renamed from: e */
    public void mo131875e() {
        this.mDepartmentListView.mo131914c();
    }

    /* renamed from: f */
    public void mo131876f() {
        this.mDepartmentListView.mo131915d();
    }

    public List<C58375a> getBreadcrumbsItems() {
        return this.mDepartmentBreadcrumbsView.getItems();
    }

    public int getBreadCrumbsLengthPrefix() {
        DepartmentBreadcrumbsView departmentBreadcrumbsView = this.mDepartmentBreadcrumbsView;
        if (departmentBreadcrumbsView == null) {
            return 2;
        }
        return departmentBreadcrumbsView.getBaseLengthPrefix();
    }

    public int getBreadcrumbsLength() {
        return this.mDepartmentBreadcrumbsView.getItems().size();
    }

    /* renamed from: g */
    private void m140388g() {
        LayoutInflater.from(getContext()).inflate(R.layout.department_structure_view, (ViewGroup) this, true);
        ButterKnife.bind(this);
    }

    /* renamed from: h */
    private void m140389h() {
        this.mDepartmentListView.mo131909a(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358461 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                KeyboardUtils.hideKeyboard(DepartmentFrameView.this.getContext());
            }
        });
        this.mllInvite.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358472 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                DepartmentFrameView.this.mo131874d();
            }
        });
        this.mDepartmentBreadcrumbsView.setCallback(new AbstractC58376b() {
            /* class com.ss.android.lark.contact.impl.department.detail.frame.$$Lambda$DepartmentFrameView$vk7ujf8CjOCEVfHBsKHcsmACEfg */

            @Override // com.ss.android.lark.widget.crumbs.AbstractC58376b
            public final void onItemClick(C58375a aVar, int i) {
                DepartmentFrameView.this.m140386a((DepartmentFrameView) aVar, (C58375a) i);
            }
        });
        this.mDepartmentListView.setItemOperationHandler(new AbstractC35856a() {
            /* class com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358483 */

            @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
            /* renamed from: a */
            public /* synthetic */ void mo131891a(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
                AbstractC35856a.CC.$default$a(this, departmentRecyclerViewItem);
            }

            @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
            /* renamed from: a */
            public /* synthetic */ boolean mo131893a(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
                return AbstractC35856a.CC.$default$a(this, departmentRecyclerViewItem, z);
            }

            @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
            /* renamed from: a */
            public int mo131890a() {
                if (DepartmentFrameView.this.mDepartmentBreadcrumbsView != null) {
                    return DepartmentFrameView.this.getBreadcrumbsLength();
                }
                return 0;
            }

            @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
            /* renamed from: a */
            public void mo131892a(DepartmentRecyclerViewItem departmentRecyclerViewItem, int i) {
                DepartmentFrameView.this.mo131866a(departmentRecyclerViewItem, i);
            }

            @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
            /* renamed from: a */
            public boolean mo131894a(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z, int i) {
                return DepartmentFrameView.this.mo131870a(departmentRecyclerViewItem, z, i);
            }
        });
    }

    /* renamed from: b */
    public boolean mo131872b() {
        if (getBreadcrumbsLength() == 0) {
            return true;
        }
        return getBreadcrumbsItems().get(getBreadcrumbsLength() - this.mDepartmentBreadcrumbsView.getBaseLengthPrefix()).mo197629b().equals("-1");
    }

    /* renamed from: d */
    public void mo131874d() {
        Department department = this.f92703a;
        if (department instanceof SchoolParent) {
            SchoolParent schoolParent = (SchoolParent) department;
            String id = schoolParent.getId();
            String name = schoolParent.getName();
            if (schoolParent.isVirtualNode()) {
                id = schoolParent.getParentId();
                name = schoolParent.getLastLevelName();
            } else if (TextUtils.isEmpty(id) || "0".equals(id)) {
                name = this.f92705c;
                id = "";
            }
            AbstractC35851b bVar = this.f92706d;
            if (bVar != null) {
                bVar.mo131758a(id, name, schoolParent.getInactiveParentsCount());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView$4 */
    public static /* synthetic */ class C358494 {

        /* renamed from: a */
        static final /* synthetic */ int[] f92710a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358494.f92710a = r0
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.COLLABORATION_TENANT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358494.f92710a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.DEPARTMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358494.f92710a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.PERSON     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358494.f92710a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.EDUER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358494.f92710a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.EDUER_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358494.f92710a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.GROUP_CHAT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.department.detail.frame.DepartmentFrameView.C358494.<clinit>():void");
        }
    }

    /* renamed from: c */
    public void mo131873c() {
        if (getBreadcrumbsLength() != 0) {
            int breadcrumbsLength = getBreadcrumbsLength() - this.mDepartmentBreadcrumbsView.getBaseLengthPrefix();
            Department department = this.f92704b.get(getBreadcrumbsItems().get(breadcrumbsLength).mo197629b());
            if (department == null) {
                department = new Department();
                department.setId(getBreadcrumbsItems().get(breadcrumbsLength).mo197629b());
                department.setName(getBreadcrumbsItems().get(breadcrumbsLength).mo197627a());
            }
            this.f92703a = department;
        }
    }

    public void setDepartmentOperationHandler(AbstractC35851b bVar) {
        this.f92706d = bVar;
    }

    /* renamed from: a */
    public void mo131864a(C35850a aVar) {
        this.mDepartmentListView.mo131910a(aVar);
    }

    public void setDepartmentData(C35850a aVar) {
        m140387a(true, aVar);
    }

    public void setDisableOutChatter(boolean z) {
        this.mDepartmentListView.setDisableOutChatter(z);
    }

    public void setPickType(PickType pickType) {
        this.mDepartmentListView.setPickType(pickType);
    }

    public void setPullRefreshListener(DepartmentListView.AbstractC35854a aVar) {
        this.mDepartmentListView.setPullToRefreshListener(aVar);
    }

    public void setSelectedDepartment(List<String> list) {
        this.mDepartmentListView.setSelectedDepartment(list);
    }

    public void setSelectedMembers(List<String> list) {
        this.mDepartmentListView.setSelectedMembers(list);
    }

    public void setSelecting(boolean z) {
        this.mDepartmentListView.setSelectMode(z);
    }

    /* renamed from: b */
    public void mo131871b(boolean z) {
        DepartmentListView departmentListView = this.mDepartmentListView;
        if (departmentListView != null) {
            departmentListView.mo131912b(z);
        }
    }

    public void setContainsMembers(List<String> list) {
        this.mDepartmentListView.setContainsMemberIds(new HashSet(list));
    }

    /* renamed from: a */
    public void mo131862a(int i) {
        if (i != this.mDepartmentBreadcrumbsView.getItems().size() - 1) {
            this.mDepartmentBreadcrumbsView.mo197622c(i + 1);
        }
    }

    /* renamed from: a */
    public void mo131863a(Department department) {
        if (!this.mDepartmentBreadcrumbsView.getTopItem().mo197629b().equals(department.getId())) {
            this.mDepartmentBreadcrumbsView.mo197619a(department.getId(), department.getName());
            this.f92704b.put(department.getId(), department);
        }
    }

    /* renamed from: a */
    public void mo131867a(boolean z) {
        this.mDepartmentListView.mo131911a(z);
    }

    /* renamed from: a */
    private void m140387a(boolean z, C35850a aVar) {
        this.mDepartmentListView.setItemsFromDepartmentStructure(aVar);
        if (z) {
            this.mDepartmentListView.mo131908a();
        }
    }

    public DepartmentFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m140388g();
        m140389h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m140386a(C58375a aVar, int i) {
        Department department = this.f92704b.get(aVar.mo197629b());
        if (department == null) {
            department = new Department();
            department.setName(aVar.mo197627a());
            department.setId(aVar.mo197629b());
        }
        this.f92703a = department;
        this.f92706d.mo131770c(department, i);
    }

    /* renamed from: a */
    public void mo131865a(C35850a aVar, boolean z) {
        Department a = aVar.mo131895a();
        if (a != null) {
            this.f92703a = a;
            m140387a(false, aVar);
            this.mDepartmentBreadcrumbsView.mo197621b(a.getId(), a.getName(), z);
            this.f92704b.put(a.getId(), a);
        }
    }

    /* renamed from: a */
    public void mo131866a(DepartmentRecyclerViewItem departmentRecyclerViewItem, int i) {
        switch (C358494.f92710a[departmentRecyclerViewItem.getType().ordinal()]) {
            case 1:
            case 2:
                this.f92703a = departmentRecyclerViewItem.getDepartment();
                this.f92706d.mo131755a(departmentRecyclerViewItem);
                return;
            case 3:
                this.f92706d.mo131756a(departmentRecyclerViewItem, i);
                return;
            case 4:
                this.f92706d.mo131766b(departmentRecyclerViewItem);
                return;
            case 5:
                this.f92703a = departmentRecyclerViewItem.getDepartment();
                this.f92706d.mo131772c(departmentRecyclerViewItem);
                return;
            case 6:
                this.f92706d.mo131777d(departmentRecyclerViewItem);
                return;
            default:
                Log.m165383e("DepartmentFrameView", "Unknown type clicked " + departmentRecyclerViewItem.getType());
                return;
        }
    }

    /* renamed from: a */
    public void mo131868a(boolean z, boolean z2) {
        String str;
        Department department = this.f92703a;
        if (!(department instanceof SchoolParent)) {
            if (z2) {
                this.mTvNodeEmpty.setText(R.string.Lark_Legacy_ContactEmpty);
                this.mllNodeEmpty.setVisibility(0);
                return;
            }
            this.mllNodeEmpty.setVisibility(8);
        } else if (!z) {
            this.mllInvite.setVisibility(8);
            this.mdividerDown.setVisibility(8);
            this.mdividerUp.setVisibility(8);
        } else {
            SchoolParent schoolParent = (SchoolParent) department;
            boolean isVirtualNode = schoolParent.isVirtualNode();
            VirtualNodeType virtualNodeType = schoolParent.getVirtualNodeType();
            if (!isVirtualNode || !z2) {
                this.mllNodeEmpty.setVisibility(8);
            } else {
                this.mllNodeEmpty.setVisibility(0);
                if (virtualNodeType == VirtualNodeType.VNODE_PARENT) {
                    str = UIHelper.getString(R.string.Lark_Education_NoParentAdded);
                } else if (virtualNodeType == VirtualNodeType.VNODE_TEACHER) {
                    str = UIHelper.getString(R.string.Lark_Education_NoTeacherAssigned);
                } else if (virtualNodeType == VirtualNodeType.VNODE_STUDENT) {
                    str = UIHelper.getString(R.string.Lark_Education_NoStudentAdded);
                } else {
                    str = "";
                }
                this.mTvNodeEmpty.setText(str);
            }
            if (!isVirtualNode || virtualNodeType == VirtualNodeType.VNODE_PARENT) {
                this.mllInvite.setVisibility(0);
                this.mdividerDown.setVisibility(0);
                this.mdividerUp.setVisibility(0);
                return;
            }
            this.mllInvite.setVisibility(8);
            this.mdividerDown.setVisibility(8);
            this.mdividerUp.setVisibility(8);
        }
    }
}
