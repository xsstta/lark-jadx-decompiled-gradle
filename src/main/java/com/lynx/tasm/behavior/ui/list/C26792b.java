package com.lynx.tasm.behavior.ui.list;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.hms.location.LocationRequest;
import com.lynx.react.bridge.AbstractC26517a;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.p1216a.C26545a;
import com.lynx.tasm.p1216a.C26547c;
import com.lynx.tasm.p1216a.C26551g;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.ui.list.b */
public class C26792b extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    boolean f66448a;

    /* renamed from: b */
    private final EventEmitter f66449b;

    /* renamed from: c */
    private final RecyclerView f66450c;

    /* renamed from: d */
    private int f66451d;

    /* renamed from: e */
    private int f66452e = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: f */
    private int f66453f = 50;

    /* renamed from: g */
    private int f66454g = 50;

    /* renamed from: h */
    private int f66455h;

    /* renamed from: i */
    private int f66456i;

    /* renamed from: j */
    private long f66457j;

    /* renamed from: k */
    private final UIList f66458k;

    /* renamed from: l */
    private boolean f66459l = true;

    /* renamed from: m */
    private int f66460m;

    /* renamed from: n */
    private int f66461n = 1;

    /* renamed from: a */
    private boolean m97257a(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: b */
    private boolean m97259b(int i) {
        return (i & 2) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95296a(Map<String, C26545a> map) {
        this.f66451d = 0;
        if (map != null) {
            this.f66451d = map.containsKey("scroll") ? this.f66451d | 1 : this.f66451d;
            this.f66451d = map.containsKey("scrolltoupper") ? this.f66451d | 2 : this.f66451d;
            this.f66451d = map.containsKey("scrolltolower") ? this.f66451d | 4 : this.f66451d;
            this.f66451d = map.containsKey("scrollstatechange") ? this.f66451d | 8 : this.f66451d;
            this.f66451d = map.containsKey("layoutcomplete") ? this.f66451d | 16 : this.f66451d;
        }
    }

    /* renamed from: a */
    public boolean mo95297a() {
        if ((this.f66451d & 16) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private int m97260c() {
        int i;
        boolean z;
        RecyclerView.LayoutManager layoutManager = this.f66450c.getLayoutManager();
        int childCount = this.f66450c.getChildCount();
        int i2 = this.f66455h;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        boolean z2 = true;
        if (i2 > 0 || this.f66456i > 0) {
            int itemCount = (layoutManager.getItemCount() - this.f66456i) - 1;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                int childLayoutPosition = this.f66450c.getChildLayoutPosition(this.f66450c.getChildAt(i7));
                i5 = Math.min(childLayoutPosition, i5);
                i6 = Math.max(childLayoutPosition, i6);
            }
            if (i5 < i2) {
                i = 1;
            } else {
                i = 0;
            }
            if (i6 > itemCount) {
                i |= 2;
            }
        } else {
            i = 0;
        }
        if (this.f66450c.findViewHolderForLayoutPosition(0) != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f66450c.findViewHolderForLayoutPosition(layoutManager.getItemCount() - 1) == null) {
            z2 = false;
        }
        if (!(z || z2)) {
            return i;
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = this.f66450c.getChildAt(i8);
            i4 = Math.min(layoutManager.getDecoratedTop(childAt), i4);
            i3 = Math.max(layoutManager.getDecoratedBottom(childAt), i3);
        }
        int paddingTop = layoutManager.getPaddingTop();
        int height = layoutManager.getHeight() - layoutManager.getPaddingBottom();
        if (z) {
            if (i4 == paddingTop) {
                this.f66460m = 0;
            }
            if (i4 > paddingTop - this.f66453f) {
                i |= 1;
            }
        }
        if (!z2 || i3 >= height + this.f66454g) {
            return i;
        }
        return i | 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public JavaOnlyArray mo95298b() {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        if (DisplayMetricsHolder.m97898a() == null) {
            return javaOnlyArray;
        }
        ArrayList arrayList = new ArrayList();
        RecyclerView.LayoutManager layoutManager = this.f66450c.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            for (int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                arrayList.add(Integer.valueOf(findFirstVisibleItemPosition));
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] a = staggeredGridLayoutManager.mo7253a((int[]) null);
            int[] c = staggeredGridLayoutManager.mo7262c((int[]) null);
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            for (int i3 : a) {
                arrayList.add(Integer.valueOf(i3));
                i2 = Math.max(i2, i3);
            }
            for (int i4 : c) {
                arrayList.add(Integer.valueOf(i4));
                i = Math.min(i, i4);
            }
            while (true) {
                i2++;
                if (i2 >= i) {
                    break;
                }
                arrayList.add(Integer.valueOf(i2));
            }
            Collections.sort(arrayList);
        }
        float f = DisplayMetricsHolder.m97898a().density;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            C26799e eVar = (C26799e) this.f66450c.findViewHolderForLayoutPosition(intValue);
            if (!(eVar == null || eVar.mo95320b() == null)) {
                View view = eVar.itemView;
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put("id", eVar.mo95320b().mo94934Q());
                javaOnlyMap.put("position", Integer.valueOf(intValue));
                javaOnlyMap.put("top", Float.valueOf(((float) view.getTop()) / f));
                javaOnlyMap.put("bottom", Float.valueOf(((float) view.getBottom()) / f));
                javaOnlyMap.put("left", Float.valueOf(((float) view.getLeft()) / f));
                javaOnlyMap.put("right", Float.valueOf(((float) view.getRight()) / f));
                javaOnlyArray.add(javaOnlyMap);
            }
        }
        LLog.m96425c("UIList2", "getVisibleCells size " + javaOnlyArray.size());
        return javaOnlyArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo95300c(AbstractC26517a aVar) {
        this.f66455h = m97254a(aVar, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo95301d(AbstractC26517a aVar) {
        this.f66456i = m97254a(aVar, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95295a(AbstractC26517a aVar) {
        this.f66453f = m97254a(aVar, 50);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo95299b(AbstractC26517a aVar) {
        this.f66454g = m97254a(aVar, 50);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo95302e(AbstractC26517a aVar) {
        this.f66452e = m97254a(aVar, (int) LocationRequest.PRIORITY_HD_ACCURACY);
    }

    /* renamed from: a */
    public void mo95294a(JavaOnlyArray javaOnlyArray) {
        if (mo95297a()) {
            C26547c cVar = new C26547c(this.f66458k.mo94576q(), "layoutcomplete");
            cVar.mo94347a("timestamp", Long.valueOf(new Date().getTime()));
            cVar.mo94347a("cells", javaOnlyArray);
            this.f66449b.mo94075a(cVar);
        }
    }

    /* renamed from: a */
    public static int m97254a(AbstractC26517a aVar, int i) {
        ReadableType g = aVar.mo94071g();
        if (g == ReadableType.String) {
            try {
                return Integer.parseInt(aVar.mo94069e());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return i;
            }
        } else if (g == ReadableType.Int || g == ReadableType.Number || g == ReadableType.Long) {
            return aVar.mo94068d();
        } else {
            return i;
        }
    }

    /* renamed from: a */
    private void m97255a(int i, String str) {
        JavaOnlyArray javaOnlyArray;
        if ((this.f66451d & 8) != 0) {
            C26551g a = C26551g.m96256a(this.f66458k.mo94576q(), str);
            if (this.f66448a) {
                javaOnlyArray = mo95298b();
            } else {
                javaOnlyArray = null;
            }
            a.mo94355a(i, javaOnlyArray);
            this.f66449b.mo94075a(a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        this.f66458k.mo95042x();
        if (i == 0) {
            m97255a(1, "scrollstatechange");
            if (this.f66458k.af()) {
                this.f66458k.mo95039u().mo94678d().mo95738b(new AbstractC26911n.C26913b(recyclerView, this.f66458k.mo94919B(), this.f66458k.ag()));
            }
        } else if (i == 1) {
            this.f66459l = false;
            m97255a(2, "scrollstatechange");
            if (this.f66458k.af()) {
                this.f66458k.mo95039u().mo94678d().mo95737a(new AbstractC26911n.C26913b(recyclerView, this.f66458k.mo94919B(), this.f66458k.ag()));
            }
        } else if (i == 2) {
            m97255a(3, "scrollstatechange");
        }
    }

    /* renamed from: a */
    public static boolean m97258a(AbstractC26517a aVar, boolean z) {
        if (aVar == null) {
            return z;
        }
        ReadableType g = aVar.mo94071g();
        if (g == ReadableType.String) {
            return Boolean.parseBoolean(aVar.mo94069e());
        }
        if (g == ReadableType.Int || g == ReadableType.Number || g == ReadableType.Long) {
            if (aVar.mo94068d() != 0) {
                return true;
            }
            return false;
        } else if (g == ReadableType.Boolean) {
            return aVar.mo94066b();
        } else {
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95293a(int i, int i2) {
        if (!this.f66459l && i2 == 0) {
            if (i > 0) {
                m97256a("scrolltolower", 4, 0, this.f66460m, 0, 0);
                this.f66459l = true;
            } else if (i < 0) {
                this.f66460m = 0;
                m97256a("scrolltoupper", 2, 0, 0, 0, 0);
                this.f66459l = true;
            }
        }
    }

    public C26792b(EventEmitter eventEmitter, RecyclerView recyclerView, UIList uIList) {
        this.f66449b = eventEmitter;
        this.f66450c = recyclerView;
        recyclerView.addOnScrollListener(this);
        this.f66458k = uIList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (i != 0 || i2 != 0) {
            this.f66460m += i2;
            if (System.currentTimeMillis() - this.f66457j > ((long) this.f66452e)) {
                m97256a("scroll", 1, 0, this.f66460m, i, i2);
                this.f66457j = System.currentTimeMillis();
            }
            int c = m97260c();
            if (m97257a(c) && !m97257a(this.f66461n)) {
                m97256a("scrolltoupper", 2, 0, this.f66460m, 0, 0);
            } else if (m97259b(c) && !m97259b(this.f66461n)) {
                m97256a("scrolltolower", 4, 0, this.f66460m, 0, 0);
            }
            this.f66461n = c;
        }
    }

    /* renamed from: a */
    private void m97256a(String str, int i, int i2, int i3, int i4, int i5) {
        JavaOnlyArray javaOnlyArray;
        if ((i & this.f66451d) != 0) {
            C26551g a = C26551g.m96256a(this.f66458k.mo94576q(), str);
            if (this.f66448a) {
                javaOnlyArray = mo95298b();
            } else {
                javaOnlyArray = null;
            }
            a.mo94354a(i2, i3, i4, i5, javaOnlyArray);
            this.f66449b.mo94075a(a);
        }
    }
}
