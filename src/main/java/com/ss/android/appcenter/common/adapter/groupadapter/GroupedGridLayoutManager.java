package com.ss.android.appcenter.common.adapter.groupadapter;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

public class GroupedGridLayoutManager extends GridLayoutManager {

    /* renamed from: i */
    public AbstractC28120c f70404i;

    /* renamed from: j */
    private AbstractC28114a f70405j;

    /* renamed from: k */
    private boolean f70406k = true;

    /* renamed from: com.ss.android.appcenter.common.adapter.groupadapter.GroupedGridLayoutManager$a */
    public interface AbstractC28114a {
        /* renamed from: a */
        int mo99778a(int i, int i2);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    /* renamed from: a */
    public void mo6501a(GridLayoutManager.AbstractC1297b bVar) {
    }

    /* renamed from: c */
    private void m102811c() {
        super.mo6501a(new GridLayoutManager.AbstractC1297b() {
            /* class com.ss.android.appcenter.common.adapter.groupadapter.GroupedGridLayoutManager.C281131 */

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
            /* renamed from: a */
            public int mo6533a(int i) {
                int b = GroupedGridLayoutManager.this.mo6502b();
                if (GroupedGridLayoutManager.this.f70404i == null || GroupedGridLayoutManager.this.f70404i.mo100101j(i) != AbstractC28120c.type_child) {
                    return b;
                }
                int k = GroupedGridLayoutManager.this.f70404i.mo100102k(i);
                return GroupedGridLayoutManager.this.mo100078b(k, GroupedGridLayoutManager.this.f70404i.mo100097b(k, i));
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollVertically() {
        if (!this.f70406k) {
            return false;
        }
        return super.canScrollVertically();
    }

    /* renamed from: a */
    public void mo100076a(AbstractC28114a aVar) {
        this.f70405j = aVar;
    }

    /* renamed from: a */
    public void mo100077a(boolean z) {
        this.f70406k = z;
    }

    /* renamed from: b */
    public int mo100078b(int i, int i2) {
        AbstractC28114a aVar = this.f70405j;
        if (aVar != null) {
            return aVar.mo99778a(i, i2);
        }
        return 1;
    }

    public GroupedGridLayoutManager(Context context, int i, AbstractC28120c cVar) {
        super(context, i);
        this.f70404i = cVar;
        m102811c();
    }
}
