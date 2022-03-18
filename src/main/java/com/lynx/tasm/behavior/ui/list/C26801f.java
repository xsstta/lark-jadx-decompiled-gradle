package com.lynx.tasm.behavior.ui.list;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.list.C26799e;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.lynx.tasm.behavior.ui.list.f */
public class C26801f extends RecyclerView.Adapter<C26799e> {

    /* renamed from: a */
    JavaOnlyArray f66491a;

    /* renamed from: b */
    boolean f66492b;

    /* renamed from: c */
    private final HashMap<String, Integer> f66493c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<Long, C26799e> f66494d = new HashMap<>();

    /* renamed from: e */
    private final UIList f66495e;

    /* renamed from: f */
    private JavaOnlyArray f66496f;

    /* renamed from: g */
    private JavaOnlyArray f66497g;

    /* renamed from: h */
    private JavaOnlyArray f66498h;

    /* renamed from: i */
    private final C26803a f66499i = new C26803a();

    /* renamed from: j */
    private int f66500j;

    /* renamed from: k */
    private final C26789a f66501k;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f66491a.size();
    }

    /* renamed from: c */
    private long m97298c() {
        int i = this.f66500j;
        this.f66500j = i + 1;
        return (((long) this.f66495e.mo94576q()) << 32) + ((long) i);
    }

    /* renamed from: b */
    private void m97296b() {
        for (int i = 0; i < this.f66491a.size(); i++) {
            String string = this.f66491a.getString(i);
            if (!this.f66493c.containsKey(string)) {
                HashMap<String, Integer> hashMap = this.f66493c;
                hashMap.put(string, Integer.valueOf(hashMap.size()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.f$a */
    public final class C26803a {

        /* renamed from: b */
        private ReadableArray f66503b;

        /* renamed from: c */
        private ReadableArray f66504c;

        /* renamed from: d */
        private ReadableArray f66505d;

        /* renamed from: e */
        private ReadableArray f66506e;

        /* renamed from: f */
        private ReadableArray f66507f;

        /* renamed from: g */
        private ReadableArray f66508g;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo95335a() {
            for (int i = 0; i < this.f66505d.size(); i++) {
                C26801f.this.notifyItemChanged(this.f66505d.getInt(i), Integer.valueOf(this.f66506e.getInt(i)));
            }
            for (int i2 = 0; i2 < this.f66507f.size(); i2++) {
                C26801f.this.notifyItemMoved(this.f66507f.getInt(i2), this.f66508g.getInt(i2));
            }
            for (int size = this.f66504c.size() - 1; size >= 0; size--) {
                C26801f.this.notifyItemRemoved(this.f66504c.getInt(size));
            }
            for (int i3 = 0; i3 < this.f66503b.size(); i3++) {
                C26801f.this.notifyItemInserted(this.f66503b.getInt(i3));
            }
        }

        private C26803a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo95336a(ReadableMap readableMap) {
            this.f66503b = readableMap.getArray("insertions");
            this.f66504c = readableMap.getArray("removals");
            this.f66505d = readableMap.getArray("updateFrom");
            this.f66506e = readableMap.getArray("updateTo");
            this.f66507f = readableMap.getArray("moveFrom");
            this.f66508g = readableMap.getArray("moveTo");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95324a() {
        boolean z;
        JavaOnlyArray javaOnlyArray = this.f66491a;
        if (javaOnlyArray == null || this.f66496f == null || javaOnlyArray.size() != this.f66496f.size()) {
            z = false;
        } else {
            z = true;
        }
        JavaOnlyMap d = this.f66495e.mo53300d();
        if (d != null) {
            this.f66496f = d.getArray("fullspan");
            this.f66491a = d.getArray("viewTypes");
            this.f66497g = d.getArray("stickyTop");
            this.f66498h = d.getArray("stickyBottom");
            boolean z2 = d.getBoolean("diffable");
            m97296b();
            if (z || !z2) {
                notifyDataSetChanged();
                return;
            }
            this.f66499i.mo95336a(d.getMap("diffResult"));
            this.f66499i.mo95335a();
        }
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(C26799e eVar) {
        this.f66501k.mo95287b(eVar);
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(C26799e eVar) {
        this.f66501k.mo95288c(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo95329a(int i) {
        return this.f66496f.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo95331b(int i) {
        return this.f66497g.contains(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo95332c(int i) {
        return this.f66498h.contains(Integer.valueOf(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (hasStableIds()) {
            return (long) i;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Integer num = this.f66493c.get(this.f66491a.getString(i));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo95333d(int i) {
        for (int size = this.f66496f.size() - 1; size >= 0; size--) {
            Integer num = (Integer) this.f66496f.get(size);
            if (num.intValue() <= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo95334e(int i) {
        for (int i2 = 0; i2 < this.f66496f.size(); i2++) {
            Integer num = (Integer) this.f66496f.get(i2);
            if (num.intValue() >= i) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95325a(long j) {
        boolean z;
        boolean z2;
        if (UIList.f66420e) {
            LLog.m96425c("UIList2", "Adapter onLayoutFinish " + (65535 & j));
        }
        C26799e remove = this.f66494d.remove(Long.valueOf(j));
        if (remove != null) {
            UIComponent b = remove.mo95320b();
            if (b != null) {
                b.mo94999e(0);
                b.mo94997d(0);
                b.mo95040v();
                if (b.mo94937T() != remove.itemView.getWidth()) {
                    z = true;
                } else {
                    z = false;
                }
                if (b.mo94938U() != remove.itemView.getHeight()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    remove.itemView.requestLayout();
                }
                if (UIList.f66420e) {
                    LLog.m96425c("UIList2", String.format("UIComponent layout finish, position %d (w %d, h %d)", Integer.valueOf(remove.getAdapterPosition()), Integer.valueOf(b.mo94937T()), Integer.valueOf(b.mo94938U())));
                }
            }
            remove.f66487a.f66488a = 2;
        }
    }

    public C26801f(UIList uIList, C26789a aVar) {
        this.f66495e = uIList;
        this.f66501k = aVar;
    }

    /* renamed from: b */
    private void m97297b(C26799e eVar, int i) {
        if (this.f66492b) {
            StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(eVar.itemView.getLayoutParams());
            layoutParams.mo7274a(mo95329a(i));
            eVar.itemView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public C26799e onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (UIList.f66420e) {
            LLog.m96425c("UIList2", "Adapter onCreateViewHolder " + i);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        C26799e.C26800a aVar = new C26799e.C26800a(viewGroup.getContext());
        aVar.setLayoutParams(layoutParams);
        return new C26799e(aVar);
    }

    /* renamed from: a */
    public void onBindViewHolder(C26799e eVar, int i) {
        if (UIList.f66420e) {
            LLog.m96425c("UIList2", "Adapter onBindViewHolder " + i);
        }
        long c = m97298c();
        if (eVar.mo95320b() == null) {
            this.f66494d.put(Long.valueOf(c), eVar);
            eVar.mo95319a((UIComponent) this.f66495e.mo95254a(i, c));
            this.f66501k.mo95286a(eVar);
        } else {
            this.f66494d.put(Long.valueOf(c), eVar);
            eVar.f66487a.f66488a = 1;
            this.f66495e.mo95256a(eVar.mo95320b(), i, c);
        }
        m97297b(eVar, i);
    }

    /* renamed from: a */
    public void onBindViewHolder(C26799e eVar, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(eVar, i);
            return;
        }
        long c = m97298c();
        Integer num = (Integer) list.get(list.size() - 1);
        this.f66494d.put(Long.valueOf(c), eVar);
        this.f66501k.mo95288c(eVar);
        eVar.f66487a.f66488a = 1;
        this.f66495e.mo95256a(eVar.mo95320b(), num.intValue(), c);
        this.f66501k.mo95287b(eVar);
        m97297b(eVar, num.intValue());
    }
}
