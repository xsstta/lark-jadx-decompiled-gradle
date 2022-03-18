package com.ss.android.appcenter.business.tab.fragmentv2.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.tab.business.widget.C27971l;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C28000b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.Group;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27990a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.C28001a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.p1282a.C28005b;
import com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.adapter.groupadapter.GroupedGridLayoutManager;
import com.ss.android.appcenter.common.adapter.groupadapter.UpdateActionType;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.common.view.BannerRecyclerView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.b */
public class C27995b extends AbstractC28120c {

    /* renamed from: a */
    public C28000b f70033a = new C28000b();

    /* renamed from: b */
    public WeakReference<Fragment> f70034b;

    /* renamed from: c */
    public BannerRecyclerView f70035c;

    /* renamed from: d */
    public int f70036d;

    /* renamed from: e */
    public C27998a f70037e;

    /* renamed from: f */
    public GroupedGridLayoutManager f70038f;

    /* renamed from: p */
    private SparseArray<AbstractC27990a> f70039p = new SparseArray<>();

    /* renamed from: q */
    private AbstractC27994e f70040q = new AbstractC27994e() {
        /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.C27995b.C279972 */

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: a */
        public Context mo99754a() {
            return C27995b.this.f70428m;
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: c */
        public void mo99762c() {
            C27995b.this.notifyDataSetChanged();
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: d */
        public int mo99764d() {
            return C27995b.this.f70036d;
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: e */
        public RecyclerView mo99766e() {
            return C27995b.this.f70035c;
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: b */
        public Fragment mo99760b() {
            return C27995b.this.f70034b.get();
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: a */
        public void mo99755a(int i) {
            C27995b.this.notifyItemInserted(i);
            C27995b bVar = C27995b.this;
            bVar.notifyItemRangeChanged(i, bVar.getItemCount() - i);
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: b */
        public void mo99761b(int i) {
            C27995b.this.notifyItemRemoved(i);
            C27995b bVar = C27995b.this;
            bVar.notifyItemRangeChanged(i, bVar.getItemCount() - i);
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: d */
        public boolean mo99765d(int i) {
            return C27995b.this.f70037e.mo99780a(C27995b.this.f70033a.mo99821o(i).mo99796m());
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: a */
        public void mo99758a(String str) {
            int b = C27995b.this.f70033a.mo99804b();
            for (int i = 0; i < b; i++) {
                for (ItemInfo itemInfo : C27995b.this.f70033a.mo99816j(i)) {
                    if (TextUtils.equals(itemInfo.getItemId(), str)) {
                        itemInfo.setNew(false);
                    }
                }
            }
            C27995b.this.notifyDataSetChanged();
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: c */
        public void mo99763c(int i) {
            int l = C27995b.this.mo100103l(i);
            C27995b.this.f70035c.scrollToPosition(l);
            C28184h.m103250d("Workplace_Page", "changeTag" + l);
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: a */
        public void mo99759a(boolean z) {
            C27995b.this.f70038f.mo100077a(z);
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: a */
        public void mo99757a(int i, boolean z) {
            C27995b.this.f70037e.mo99779a(C27995b.this.f70033a.mo99821o(i).mo99796m(), z);
        }

        @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e
        /* renamed from: a */
        public void mo99756a(int i, int i2, C28118a aVar) {
            int i3;
            int c = C27995b.this.mo100099c(i, i2);
            int top = aVar.itemView.getTop();
            if (C27995b.this.f70033a.mo99807b(i)) {
                Group k = C27995b.this.f70033a.mo99817k(i);
                if (k == Group.ICON_LIST) {
                    i3 = C28209p.m103293a(mo99754a(), 32.0f);
                } else if (k == Group.CATEGORY) {
                    i3 = C28209p.m103293a(mo99754a(), 78.0f);
                } else {
                    i3 = 0;
                }
                if (i3 != 0 && i3 - top > 0) {
                    C27995b.this.f70035c.scrollBy(0, (-i3) + top);
                    return;
                }
            }
            C27995b.this.f70035c.scrollToPosition(c);
        }
    };

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public void mo99771a(C28118a aVar, int i, UpdateActionType updateActionType) {
        ((AbstractC27993d) m102213n(this.f70033a.mo99817k(i).getValue())).mo99752a(this.f70040q, aVar, i, this.f70033a, updateActionType);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public int mo98377b() {
        return this.f70033a.mo99804b();
    }

    /* renamed from: e */
    public void mo99773e(int i) {
        this.f70036d = i;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: c */
    public int mo98380c(int i) {
        return this.f70033a.mo99812f(i);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: d */
    public int mo98381d(int i) {
        return this.f70033a.mo99814h(i);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: f */
    public boolean mo99774f(int i) {
        return this.f70033a.mo99809c(i);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: g */
    public int mo99775g(int i) {
        return this.f70033a.mo99813g(i);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: h */
    public int mo99776h(int i) {
        return this.f70033a.mo99810d(i);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: i */
    public int mo99777i(int i) {
        return this.f70033a.mo99811e(i);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.b$a */
    private class C27998a {

        /* renamed from: b */
        private HashMap<String, Boolean> f70044b = new HashMap<>();

        public C27998a() {
        }

        /* renamed from: a */
        public boolean mo99780a(String str) {
            if (this.f70044b.containsKey(str)) {
                return this.f70044b.get(str).booleanValue();
            }
            this.f70044b.put(str, true);
            return true;
        }

        /* renamed from: a */
        public void mo99779a(String str, boolean z) {
            this.f70044b.put(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: n */
    private AbstractC27990a m102213n(int i) {
        return this.f70039p.get(i);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public boolean mo98379b(int i) {
        return this.f70033a.mo99807b(i);
    }

    /* renamed from: a */
    public GroupedGridLayoutManager mo99767a(Context context) {
        GroupedGridLayoutManager groupedGridLayoutManager = new GroupedGridLayoutManager(context, 4, this);
        this.f70038f = groupedGridLayoutManager;
        groupedGridLayoutManager.mo100076a(new GroupedGridLayoutManager.AbstractC28114a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.C27995b.C279961 */

            @Override // com.ss.android.appcenter.common.adapter.groupadapter.GroupedGridLayoutManager.AbstractC28114a
            /* renamed from: a */
            public int mo99778a(int i, int i2) {
                return C27995b.this.f70033a.mo99798a(i);
            }
        });
        return this.f70038f;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public int mo98372a(int i) {
        if (!this.f70033a.mo99819m(i) || !this.f70037e.mo99780a(this.f70033a.mo99821o(i).mo99796m())) {
            return this.f70033a.mo99818l(i);
        }
        return Math.min(12, this.f70033a.mo99818l(i));
    }

    /* renamed from: a */
    public void mo99768a(C27971l lVar) {
        C28001a aVar = (C28001a) m102213n(Group.WIDGET_LIST.getValue());
        aVar.mo99823a(lVar);
        Fragment fragment = this.f70034b.get();
        if (fragment != null) {
            aVar.mo99822a(fragment.getLifecycle());
        }
    }

    /* renamed from: a */
    public void mo99769a(C28000b bVar) {
        this.f70033a = bVar;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m102212a(int i, AbstractC27990a aVar) {
        this.f70039p.put(i, aVar);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public int mo98614a(int i, int i2) {
        return this.f70033a.mo99799a(i, i2);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public void mo99772b(C28118a aVar, int i) {
        AbstractC27993d dVar = (AbstractC27993d) m102213n(this.f70033a.mo99817k(i).getValue());
        if (dVar != null) {
            dVar.mo99753b(this.f70040q, aVar, i, this.f70033a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        if (r8 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (r1 == com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.Group.CATEGORY) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r1 == com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.Group.CATEGORY) goto L_0x004b;
     */
    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98617a(com.ss.android.appcenter.common.adapter.groupadapter.C28118a r7, int r8) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.tab.fragmentv2.adapter.C27995b.mo98617a(com.ss.android.appcenter.common.adapter.groupadapter.a, int):void");
    }

    public C27995b(Context context, Fragment fragment, BannerRecyclerView bannerRecyclerView) {
        super(context);
        this.f70034b = new WeakReference<>(fragment);
        this.f70037e = new C27998a();
        this.f70035c = bannerRecyclerView;
        m102212a(Group.WIDGET_LIST.getValue(), new C28001a());
        m102212a(Group.ICON_LIST.getValue(), new C28005b());
        m102212a(Group.CATEGORY.getValue(), new C28015b());
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public void mo98375a(C28118a aVar, int i, int i2) {
        AbstractC27991b bVar = (AbstractC27991b) m102213n(this.f70033a.mo99817k(i).getValue());
        if (bVar != null) {
            bVar.mo99749a(this.f70040q, aVar, i, i2, this.f70033a);
        }
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public void mo99770a(C28118a aVar, int i, int i2, UpdateActionType updateActionType) {
        ((AbstractC27991b) m102213n(this.f70033a.mo99817k(i).getValue())).mo99750a(this.f70040q, aVar, i, i2, this.f70033a, updateActionType);
    }
}
