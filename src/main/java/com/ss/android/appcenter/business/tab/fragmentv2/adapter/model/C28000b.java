package com.ss.android.appcenter.business.tab.fragmentv2.adapter.model;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.workplacehome.C27776b;
import com.ss.android.appcenter.business.net.workplacehome.TagChild;
import com.ss.android.appcenter.business.net.workplacehome.WorkplaceHomeData;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.CategoryGroupData;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.C28004a;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.b */
public class C28000b {

    /* renamed from: a */
    public static HashMap<String, Integer> f70052a = new HashMap<>();

    /* renamed from: b */
    public static int f70053b = 1000;

    /* renamed from: c */
    private int f70054c;

    /* renamed from: d */
    private List<C27999a> f70055d = new ArrayList();

    /* renamed from: e */
    private int f70056e = -1;

    /* renamed from: f */
    private Set f70057f = new HashSet();

    /* renamed from: g */
    private Set f70058g = new HashSet();

    /* renamed from: h */
    private C27999a f70059h;

    /* renamed from: i */
    private C27999a f70060i;

    /* renamed from: j */
    private C27999a f70061j;

    /* renamed from: k */
    private Object f70062k = new Object();

    /* renamed from: a */
    public boolean mo99802a() {
        return this.f70056e != -1;
    }

    /* renamed from: a */
    public void mo99801a(Map<Integer, List<ItemInfo>> map) {
        int i = this.f70056e;
        if (i != -1) {
            C27999a o = mo99821o(i);
            if (o instanceof CategoryGroupData) {
                ((CategoryGroupData) o).mo99832a(map);
            }
        }
    }

    /* renamed from: a */
    public int mo99800a(ItemInfo itemInfo, boolean z) {
        int i;
        synchronized (this.f70062k) {
            m102272c(itemInfo, z);
            i = -1;
            if (z) {
                C27999a aVar = this.f70061j;
                if (aVar == null) {
                    this.f70061j = new C27999a(Group.WIDGET_LIST, null, new ArrayList(Arrays.asList(itemInfo)), false, null, false, true);
                    this.f70055d.add(this.f70055d.indexOf(this.f70060i) + 1, this.f70061j);
                } else {
                    aVar.mo99792i().add(itemInfo);
                }
                i = m102270c();
            } else {
                C27999a aVar2 = this.f70060i;
                if (aVar2 != null) {
                    List<ItemInfo> i2 = aVar2.mo99792i();
                    i2.add(i2.size() - 1, itemInfo);
                    i = m102274d();
                }
            }
            this.f70057f.add(itemInfo.getItemId());
        }
        return i;
    }

    /* renamed from: b */
    public int mo99804b() {
        return this.f70055d.size();
    }

    /* renamed from: c */
    private int m102270c() {
        int a = m102263a(this.f70061j);
        if (this.f70061j.mo99785b()) {
            a++;
        }
        return (a + this.f70061j.mo99793j()) - 1;
    }

    /* renamed from: d */
    private int m102274d() {
        int a = m102263a(this.f70060i);
        if (this.f70060i.mo99785b()) {
            a++;
        }
        return (a + this.f70060i.mo99793j()) - 2;
    }

    public C28000b() {
    }

    /* renamed from: b */
    private void m102269b(C27999a aVar) {
        if (this.f70059h == null) {
            this.f70059h = aVar;
        }
    }

    /* renamed from: c */
    private void m102273c(C27999a aVar) {
        if (this.f70060i == null) {
            this.f70060i = aVar;
        }
    }

    /* renamed from: d */
    private void m102275d(C27999a aVar) {
        if (this.f70061j == null) {
            this.f70061j = aVar;
        }
    }

    /* renamed from: a */
    public boolean mo99803a(String str) {
        return this.f70057f.contains(str);
    }

    /* renamed from: p */
    private boolean m102276p(int i) {
        if (1000 > i || i > f70053b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public int mo99798a(int i) {
        return mo99821o(i).mo99790g();
    }

    /* renamed from: c */
    public boolean mo99809c(int i) {
        return mo99821o(i).mo99787d();
    }

    /* renamed from: d */
    public int mo99810d(int i) {
        return mo99821o(i).mo99786c();
    }

    /* renamed from: e */
    public int mo99811e(int i) {
        return mo99821o(i).mo99788e();
    }

    /* renamed from: f */
    public int mo99812f(int i) {
        return ViewType.fromValue(i).getLayoutRes();
    }

    /* renamed from: g */
    public int mo99813g(int i) {
        return ViewType.fromValue(i).getLayoutRes();
    }

    /* renamed from: i */
    public String mo99815i(int i) {
        return mo99821o(i).mo99791h();
    }

    /* renamed from: j */
    public List<ItemInfo> mo99816j(int i) {
        return mo99821o(i).mo99792i();
    }

    /* renamed from: k */
    public Group mo99817k(int i) {
        return mo99821o(i).mo99784a();
    }

    /* renamed from: l */
    public int mo99818l(int i) {
        return mo99821o(i).mo99793j();
    }

    /* renamed from: m */
    public boolean mo99819m(int i) {
        return mo99821o(i).mo99794k();
    }

    /* renamed from: n */
    public boolean mo99820n(int i) {
        return mo99821o(i).mo99795l();
    }

    /* renamed from: h */
    public int mo99814h(int i) {
        if (m102276p(i)) {
            return R.layout.workplace_fragment_adapter_widget_item;
        }
        return ViewType.fromValue(i).getLayoutRes();
    }

    /* renamed from: c */
    private int m102271c(String str) {
        Integer num = f70052a.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i = f70053b;
        f70053b = i + 1;
        Integer valueOf = Integer.valueOf(i);
        f70052a.put(str, valueOf);
        return valueOf.intValue();
    }

    /* renamed from: b */
    public boolean mo99807b(int i) {
        return mo99821o(i).mo99785b();
    }

    /* renamed from: o */
    public C27999a mo99821o(int i) {
        C27999a aVar = (C27999a) C28182f.m103235a(this.f70055d, i, null);
        if (aVar != null) {
            return aVar;
        }
        C28184h.m103248b("Workplace_Page", "WorkplaceAdapterData getGroupData null.");
        return new C27999a(Group.DEFAULT, null, new ArrayList(), false, null);
    }

    public C28000b(WorkplaceHomeData workplaceHomeData) {
        m102266a(workplaceHomeData);
    }

    /* renamed from: a */
    private int m102263a(C27999a aVar) {
        int i = 0;
        for (C27999a aVar2 : this.f70055d) {
            if (aVar2 == aVar) {
                return i;
            }
            i += aVar2.mo99793j();
            if (aVar2.mo99785b()) {
                i++;
            }
            if (aVar2.mo99787d()) {
                i++;
            }
        }
        C28184h.m103248b("WorkplaceAdapterData", "no this group:" + aVar.mo99791h());
        return 0;
    }

    /* renamed from: b */
    public boolean mo99808b(String str) {
        return this.f70058g.contains(str);
    }

    /* renamed from: a */
    private void m102266a(WorkplaceHomeData workplaceHomeData) {
        boolean z;
        AtomicBoolean atomicBoolean;
        List<TagChild> list;
        Map<String, ItemInfo> map;
        int i;
        List<C27776b.C27777a> list2;
        boolean z2 = false;
        this.f70054c = 0;
        this.f70055d.clear();
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, ItemInfo> allItemInfos = workplaceHomeData.getAllItemInfos();
        for (C27776b bVar : workplaceHomeData.getTagList()) {
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(z2);
            boolean c = bVar.mo99135c();
            boolean e = bVar.mo99137e();
            String b = bVar.mo99133b();
            List<TagChild> d = bVar.mo99136d();
            List<C27776b.C27777a> f = bVar.mo99138f();
            boolean z3 = !C28182f.m103238c(f);
            if (bVar.mo99137e() || z3) {
                z = false;
            } else {
                z = true;
            }
            String str = null;
            ArrayList<ItemInfo> arrayList = null;
            int i2 = 0;
            while (i2 < d.size()) {
                TagChild tagChild = d.get(i2);
                String itemId = tagChild.getItemId();
                ItemInfo itemInfo = allItemInfos.get(itemId);
                if (tagChild.isAddApp()) {
                    itemInfo = new AddAppItem();
                }
                if (itemInfo == null) {
                    C28184h.m103250d("Workplace_Page", "itemInfo == null, child:" + tagChild);
                    i = i2;
                } else {
                    if (itemInfo.isNative()) {
                        i = i2;
                        if (!C27548m.m100547m().mo98216a().mo98162b(itemInfo.getNativeAppKey())) {
                            C28184h.m103250d("Workplace_Page", "filter disable Native App. item:" + itemInfo);
                        }
                    } else {
                        i = i2;
                    }
                    if (tagChild.isCommonItem()) {
                        this.f70057f.add(itemInfo.getItemId());
                    } else if (tagChild.isRecommendOrPlatformWidget()) {
                        this.f70058g.add(itemId);
                    }
                    if (tagChild.isWidget()) {
                        itemInfo.setWidget(true);
                    }
                    if (tagChild.isBlock()) {
                        itemInfo.setBlock(true);
                        itemInfo.setWidget(true);
                    }
                    if (str == null) {
                        arrayList = new ArrayList<>();
                        str = tagChild.getType();
                        arrayList.add(itemInfo);
                    } else if (z3) {
                        arrayList.add(itemInfo);
                    } else if (!e) {
                        arrayList.add(itemInfo);
                    } else if (TextUtils.equals(str, tagChild.getType())) {
                        arrayList.add(itemInfo);
                    } else {
                        map = allItemInfos;
                        list2 = f;
                        list = d;
                        atomicBoolean = atomicBoolean2;
                        m102267a(bVar.mo99130a(), str, arrayList, c, b, atomicBoolean2, z, e);
                        arrayList = new ArrayList<>();
                        str = tagChild.getType();
                        arrayList.add(itemInfo);
                        i2 = i + 1;
                        f = list2;
                        allItemInfos = map;
                        d = list;
                        atomicBoolean2 = atomicBoolean;
                    }
                }
                list = d;
                atomicBoolean = atomicBoolean2;
                map = allItemInfos;
                list2 = f;
                i2 = i + 1;
                f = list2;
                allItemInfos = map;
                d = list;
                atomicBoolean2 = atomicBoolean;
            }
            if (z3) {
                m102268a(arrayList, f, bVar.mo99139g());
            } else {
                m102267a(bVar.mo99130a(), str, arrayList, c, b, atomicBoolean2, z, e);
            }
            allItemInfos = allItemInfos;
            z2 = false;
        }
        C28184h.m103250d("Workplace_Page", "convertData duration:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    private int m102264a(String str, List<ItemInfo> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(list.get(i).getItemId(), str)) {
                list.remove(i);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public ItemInfo mo99806b(int i, int i2) {
        return (ItemInfo) C28182f.m103235a(mo99816j(i), i2, null);
    }

    /* renamed from: c */
    private void m102272c(ItemInfo itemInfo, boolean z) {
        String itemId = itemInfo.getItemId();
        if (mo99808b(itemId)) {
            this.f70058g.remove(itemId);
            if (z) {
                C27999a aVar = this.f70059h;
                if (aVar != null) {
                    m102264a(itemId, aVar.mo99792i());
                    return;
                }
                return;
            }
            C27999a aVar2 = this.f70060i;
            if (aVar2 != null) {
                m102264a(itemId, aVar2.mo99792i());
            }
        }
    }

    /* renamed from: b */
    public int mo99805b(ItemInfo itemInfo, boolean z) {
        int a;
        int a2;
        if (z) {
            if (this.f70061j != null) {
                a = m102264a(itemInfo.getItemId(), this.f70061j.mo99792i());
                this.f70057f.remove(itemInfo.getItemId());
                if (a != -1) {
                    a2 = m102263a(this.f70061j);
                }
            }
            return -1;
        }
        if (this.f70060i != null) {
            a = m102264a(itemInfo.getItemId(), this.f70060i.mo99792i());
            this.f70057f.remove(itemInfo.getItemId());
            if (a != -1) {
                a2 = m102263a(this.f70060i);
            }
        }
        return -1;
        return a + a2;
    }

    /* renamed from: a */
    public int mo99799a(int i, int i2) {
        if (mo99817k(i) != Group.WIDGET_LIST) {
            return mo99821o(i).mo99789f();
        }
        ItemInfo b = mo99806b(i, i2);
        if (b != null) {
            return m102271c(b.getItemId());
        }
        C28184h.m103248b("Workplace_Page", String.format("getChildViewType(%s,%s) itemInfo is null", String.valueOf(i), String.valueOf(i2)));
        return ViewType.DEFAULT.getViewTypeValue();
    }

    /* renamed from: a */
    private void m102268a(ArrayList<ItemInfo> arrayList, List<C27776b.C27777a> list, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C27776b.C27777a aVar = list.get(i);
            CategoryGroupData.C28011a aVar2 = new CategoryGroupData.C28011a(1, aVar.mo99141a(), aVar.mo99142b());
            if (i == 0) {
                aVar2.mo99844a(arrayList);
                aVar2.mo99845a(z);
            }
            arrayList2.add(aVar2);
        }
        this.f70055d.add(new CategoryGroupData(arrayList2));
        int i2 = this.f70054c;
        this.f70056e = i2;
        this.f70054c = i2 + 1;
    }

    /* renamed from: a */
    private C27999a m102265a(String str, Group group, List<ItemInfo> list, boolean z, String str2, boolean z2, boolean z3) {
        C27999a aVar;
        if (group == Group.ICON_LIST) {
            aVar = new C28004a(group, str, list, z, str2, z2, z3);
        } else {
            aVar = new C27999a(group, str, list, z, str2, z2, z3);
        }
        this.f70055d.add(aVar);
        this.f70054c++;
        return aVar;
    }

    /* renamed from: a */
    private void m102267a(String str, String str2, List<ItemInfo> list, boolean z, String str3, AtomicBoolean atomicBoolean, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        AtomicBoolean atomicBoolean2;
        Group group;
        if (C28182f.m103238c(list)) {
            C28184h.m103250d("Workplace_Page", "add group is null. filter.");
            return;
        }
        boolean z6 = false;
        if (!z || atomicBoolean.get()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 || !z4) {
            atomicBoolean2 = atomicBoolean;
            z5 = false;
        } else {
            atomicBoolean2 = atomicBoolean;
            z5 = true;
        }
        atomicBoolean2.set(true);
        if (TextUtils.equals(str2, "widget") || TextUtils.equals(str2, "block")) {
            z6 = true;
        }
        if (!z3 || !z6) {
            group = Group.ICON_LIST;
        } else {
            group = Group.WIDGET_LIST;
        }
        C27999a a = m102265a(str, group, list, z4, str3, z5, z3);
        if (!z3) {
            return;
        }
        if (Group.WIDGET_LIST == group && this.f70060i == null) {
            m102269b(a);
        } else if (Group.ICON_LIST == group) {
            m102273c(a);
        } else if (Group.WIDGET_LIST == group && this.f70060i != null) {
            m102275d(a);
        }
    }
}
