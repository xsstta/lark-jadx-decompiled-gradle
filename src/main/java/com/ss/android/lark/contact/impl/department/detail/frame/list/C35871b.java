package com.ss.android.lark.contact.impl.department.detail.frame.list;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.entity.Department;
import com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a;
import com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.AbsItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IDepartmentDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.CollaborationTenantItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.DepartmentGroupCreateBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.DepartmentItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.DepartmentPersonItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.SchoolParentItemBinder;
import com.ss.android.lark.contact.impl.department.detail.frame.list.binder.impl.SchoolPersonItemBinder;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.b */
public class C35871b extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AbstractC35856a, IDepartmentDependency, IPersonDependency, ISelectDependency {

    /* renamed from: a */
    AbstractC35361b f92776a = C35358a.m138143a();

    /* renamed from: c */
    private final List<DepartmentRecyclerViewItem> f92777c;

    /* renamed from: d */
    private Set<String> f92778d = new HashSet();

    /* renamed from: e */
    private final DepartmentListView f92779e;

    /* renamed from: f */
    private final LinkedHashSet<String> f92780f = new LinkedHashSet<>();

    /* renamed from: g */
    private final LinkedHashSet<String> f92781g = new LinkedHashSet<>();

    /* renamed from: h */
    private final Set<String> f92782h = new HashSet();

    /* renamed from: i */
    private boolean f92783i = false;

    /* renamed from: j */
    private boolean f92784j = false;

    /* renamed from: k */
    private boolean f92785k = false;

    /* renamed from: l */
    private final Set<String> f92786l = new HashSet();

    /* renamed from: m */
    private final Map<String, DeniedReason> f92787m = new HashMap();

    /* renamed from: n */
    private final Map<String, String> f92788n = new HashMap();

    /* renamed from: o */
    private final DepartmentGroupCreateBinder f92789o;

    /* renamed from: p */
    private final DepartmentItemBinder f92790p;

    /* renamed from: q */
    private final DepartmentPersonItemBinder f92791q;

    /* renamed from: r */
    private final SchoolParentItemBinder f92792r;

    /* renamed from: s */
    private final SchoolPersonItemBinder f92793s;

    /* renamed from: t */
    private final CollaborationTenantItemBinder f92794t;

    /* renamed from: u */
    private AbstractC35856a f92795u;

    /* renamed from: v */
    private PickType f92796v = new PickType();

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
    /* renamed from: a */
    public /* synthetic */ int mo131890a() {
        return AbstractC35856a.CC.$default$a(this);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
    /* renamed from: a */
    public /* synthetic */ void mo131892a(DepartmentRecyclerViewItem departmentRecyclerViewItem, int i) {
        AbstractC35856a.CC.$default$a(this, departmentRecyclerViewItem, i);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
    /* renamed from: a */
    public /* synthetic */ boolean mo131894a(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z, int i) {
        return AbstractC35856a.CC.$default$a(this, departmentRecyclerViewItem, z, i);
    }

    /* renamed from: b */
    public List<DepartmentRecyclerViewItem> mo132057b() {
        return this.f92777c;
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency
    /* renamed from: d */
    public boolean mo131995d() {
        return this.f92783i;
    }

    /* renamed from: a */
    public void mo132056a(boolean z) {
        this.f92783i = z;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo132055a(Set<String> set) {
        Set<String> set2 = this.f92778d;
        if (set2 != null && set != null) {
            set2.addAll(set);
        } else if (set != null) {
            this.f92778d = set;
        }
    }

    /* renamed from: a */
    public void mo132054a(Map<String, DeniedReason> map) {
        this.f92787m.clear();
        if (CollectionUtils.isNotEmpty(map)) {
            this.f92787m.putAll(map);
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency
    /* renamed from: a */
    public boolean mo131991a(String str) {
        if (C35358a.m138143a().mo130180y()) {
            return this.f92787m.get(str) == DeniedReason.SAME_TENANT_DENY;
        }
        return this.f92786l.contains(str);
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
    /* renamed from: a */
    public boolean mo131893a(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
        DepartmentRecyclerViewItem.Type type = departmentRecyclerViewItem.getType();
        m140542b(departmentRecyclerViewItem);
        if (type == DepartmentRecyclerViewItem.Type.EDUER || type == DepartmentRecyclerViewItem.Type.PERSON) {
            Chatter chatter = departmentRecyclerViewItem.getPerson().getChatter();
            if (!m140544c(departmentRecyclerViewItem, z) && !m140543b(departmentRecyclerViewItem, z)) {
                m140540a(chatter, z);
            }
            return false;
        } else if (type == DepartmentRecyclerViewItem.Type.DEPARTMENT || type == DepartmentRecyclerViewItem.Type.EDUER_GROUP || type == DepartmentRecyclerViewItem.Type.COLLABORATION_TENANT) {
            if (m140543b(departmentRecyclerViewItem, z)) {
                return false;
            }
            m140541a(departmentRecyclerViewItem.getDepartment(), z);
        }
        notifyItemChanged(this.f92777c.indexOf(departmentRecyclerViewItem));
        return false;
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency
    /* renamed from: a */
    public boolean mo131997a(String str, int i) {
        if (i == 1) {
            return this.f92781g.contains(str);
        }
        return this.f92780f.contains(str);
    }

    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.b$a */
    public static class C35873a extends C1374g.AbstractC1376a {

        /* renamed from: a */
        private final List<DepartmentRecyclerViewItem> f92798a;

        /* renamed from: b */
        private final List<DepartmentRecyclerViewItem> f92799b;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            return true;
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f92798a.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f92799b.size();
        }

        public C35873a(List<DepartmentRecyclerViewItem> list, List<DepartmentRecyclerViewItem> list2) {
            this.f92798a = list;
            this.f92799b = list2;
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            if (i == this.f92798a.size() - 1) {
                return false;
            }
            return this.f92798a.get(i).equals(this.f92799b.get(i2));
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency
    /* renamed from: c */
    public boolean mo131993c() {
        return this.f92785k;
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency
    /* renamed from: e */
    public boolean mo131998e() {
        return this.f92779e.mo131913b();
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency
    /* renamed from: g */
    public boolean mo132000g() {
        return this.f92796v.getEnableExternalChatter();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f92777c.size();
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency
    /* renamed from: h */
    public boolean mo132001h() {
        return this.f92796v.getEnableDepartment();
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.ISelectDependency
    /* renamed from: f */
    public boolean mo131999f() {
        if (this.f92796v.getEnableChatter() || this.f92796v.getEnableExternalChatter()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.department.detail.frame.list.b$1 */
    public static /* synthetic */ class C358721 {

        /* renamed from: a */
        static final /* synthetic */ int[] f92797a;

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
                com.ss.android.lark.contact.impl.department.detail.frame.list.C35871b.C358721.f92797a = r0
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.PERSON     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.C35871b.C358721.f92797a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.DEPARTMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.C35871b.C358721.f92797a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.GROUP_CHAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.C35871b.C358721.f92797a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.EDUER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.C35871b.C358721.f92797a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.EDUER_GROUP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.contact.impl.department.detail.frame.list.C35871b.C358721.f92797a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem$Type r1 = com.ss.android.lark.contact.impl.department.detail.frame.list.DepartmentRecyclerViewItem.Type.COLLABORATION_TENANT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.contact.impl.department.detail.frame.list.C35871b.C358721.<clinit>():void");
        }
    }

    /* renamed from: c */
    public void mo132064c(boolean z) {
        this.f92785k = z;
    }

    /* renamed from: b */
    public void mo132061b(boolean z) {
        this.f92784j = z;
        notifyDataSetChanged();
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency
    /* renamed from: d */
    public boolean mo131996d(String str) {
        return this.f92778d.contains(str);
    }

    /* renamed from: a */
    public void mo132050a(PickType pickType) {
        if (pickType != null) {
            this.f92796v = pickType;
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo132058b(List<String> list) {
        this.f92780f.clear();
        this.f92780f.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public void mo132062c(List<String> list) {
        this.f92781g.clear();
        this.f92781g.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f92777c.get(i).getItemId();
    }

    /* renamed from: c */
    public void mo132063c(Set<String> set) {
        this.f92786l.clear();
        if (CollectionUtils.isNotEmpty(set)) {
            this.f92786l.addAll(set);
        }
    }

    /* renamed from: a */
    private AbsItemBinder<?> m140539a(int i) {
        if (i == R.layout.department_structure_item_department) {
            return this.f92790p;
        }
        if (i == R.layout.department_structure_item_chat) {
            return this.f92789o;
        }
        if (i == R.layout.school_structure_item_eduer) {
            return this.f92793s;
        }
        if (i == R.layout.school_structure_item_eduer_group) {
            return this.f92792r;
        }
        if (i == R.layout.department_structure_item_collaboration_tenant) {
            return this.f92794t;
        }
        return this.f92791q;
    }

    /* renamed from: b */
    private void m140542b(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        int i = C358721.f92797a[departmentRecyclerViewItem.getType().ordinal()];
        String str = "academic_org";
        String str2 = "contact";
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 5) {
                        str2 = "group";
                    }
                }
                ContactHitPoint.m140788a(str, str2, this.f92795u.mo131890a() - 1, this.f92777c.indexOf(departmentRecyclerViewItem));
            }
            str2 = "department";
        } else if (departmentRecyclerViewItem.isCrossTenant()) {
            str = "external_contacts";
            ContactHitPoint.m140788a(str, str2, this.f92795u.mo131890a() - 1, this.f92777c.indexOf(departmentRecyclerViewItem));
        }
        str = "bussiness_org";
        ContactHitPoint.m140788a(str, str2, this.f92795u.mo131890a() - 1, this.f92777c.indexOf(departmentRecyclerViewItem));
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency
    /* renamed from: c */
    public boolean mo131994c(String str) {
        if (this.f92784j) {
            return TextUtils.isEmpty(this.f92788n.get(str));
        }
        return false;
    }

    public C35871b(DepartmentListView departmentListView) {
        setHasStableIds(true);
        this.f92777c = new ArrayList();
        this.f92779e = departmentListView;
        this.f92789o = new DepartmentGroupCreateBinder(this);
        this.f92792r = new SchoolParentItemBinder(this);
        this.f92790p = new DepartmentItemBinder(this, this, this);
        this.f92791q = new DepartmentPersonItemBinder(this, this, this);
        this.f92793s = new SchoolPersonItemBinder(this, this, this);
        this.f92794t = new CollaborationTenantItemBinder(this, this);
    }

    /* renamed from: b */
    public void mo132059b(Map<String, String> map) {
        this.f92788n.clear();
        if (CollectionUtils.isNotEmpty(map)) {
            this.f92788n.putAll(map);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        switch (C358721.f92797a[this.f92777c.get(i).getType().ordinal()]) {
            case 1:
                return R.layout.department_structure_item_people;
            case 2:
                return R.layout.department_structure_item_department;
            case 3:
                return R.layout.department_structure_item_chat;
            case 4:
                return R.layout.school_structure_item_eduer;
            case 5:
                return R.layout.school_structure_item_eduer_group;
            case 6:
                return R.layout.department_structure_item_collaboration_tenant;
            default:
                return -1;
        }
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.AbstractC35856a
    /* renamed from: a */
    public void mo131891a(DepartmentRecyclerViewItem departmentRecyclerViewItem) {
        if (this.f92795u != null) {
            m140542b(departmentRecyclerViewItem);
            this.f92795u.mo131892a(departmentRecyclerViewItem, this.f92777c.indexOf(departmentRecyclerViewItem));
        }
    }

    /* renamed from: b */
    public void mo132060b(Set<String> set) {
        this.f92778d.clear();
        this.f92778d.addAll(set);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo132051a(AbstractC35856a aVar) {
        this.f92795u = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.department.detail.frame.list.binder.contact.IPersonDependency
    /* renamed from: b */
    public boolean mo131992b(String str) {
        if (!C35358a.m138143a().mo130180y() || this.f92787m.get(str) != DeniedReason.CRYPTO_CHAT_DENY || !C35358a.m138143a().mo130181z()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo132052a(Collection<? extends DepartmentRecyclerViewItem> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (this.f92777c.size() == 0) {
            this.f92777c.addAll(arrayList);
            notifyDataSetChanged();
            return;
        }
        C1374g.m6298a(new C35873a(this.f92777c, arrayList), false).mo7412a(this);
        this.f92777c.clear();
        this.f92777c.addAll(arrayList);
    }

    /* renamed from: a */
    public void mo132053a(List<DepartmentRecyclerViewItem> list) {
        this.f92777c.clear();
        this.f92777c.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m140539a(i).mo131989a(viewGroup.getContext());
    }

    /* renamed from: a */
    private void m140540a(Chatter chatter, boolean z) {
        if (!z) {
            this.f92780f.remove(chatter.getId());
        } else {
            this.f92780f.add(chatter.getId());
        }
    }

    /* renamed from: b */
    private boolean m140543b(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
        AbstractC35856a aVar = this.f92795u;
        if (aVar == null || !aVar.mo131894a(departmentRecyclerViewItem, z, this.f92777c.indexOf(departmentRecyclerViewItem))) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        m140539a(getItemViewType(i)).mo131990a(viewHolder, this.f92777c.get(i));
    }

    /* renamed from: a */
    private void m140541a(Department department, boolean z) {
        if (!z) {
            this.f92781g.remove(department.getId());
        } else {
            this.f92781g.add(department.getId());
        }
    }

    /* renamed from: c */
    private boolean m140544c(DepartmentRecyclerViewItem departmentRecyclerViewItem, boolean z) {
        DepartmentRecyclerViewItem.Person person = departmentRecyclerViewItem.getPerson();
        Chatter chatter = person.getChatter();
        if (this.f92778d.contains(chatter.getId())) {
            return true;
        }
        if (!person.isNotContact()) {
            return false;
        }
        int w = this.f92776a.mo130178w();
        Context context = this.f92779e.getContext();
        if (!z) {
            this.f92782h.remove(chatter.getId());
        } else if (this.f92782h.size() >= w) {
            LKUIToast.show(context, (int) R.string.Lark_NewContacts_PermissionRequestSelectUserMax);
            return true;
        } else {
            this.f92782h.add(chatter.getId());
        }
        return false;
    }
}
