package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.j */
public abstract class AbstractC0334j implements AdapterView.OnItemClickListener, AbstractC0337l, AbstractC0342o {

    /* renamed from: a */
    private Rect f1132a;

    /* renamed from: a */
    public abstract void mo1236a(int i);

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1345a(Context context, C0322f fVar) {
    }

    /* renamed from: a */
    public abstract void mo1238a(View view);

    /* renamed from: a */
    public abstract void mo1239a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo1240a(C0322f fVar);

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1350a(C0322f fVar, C0326h hVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo1245b(int i);

    /* renamed from: b */
    public abstract void mo1246b(boolean z);

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1352b(C0322f fVar, C0326h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: c */
    public int mo1353c() {
        return 0;
    }

    /* renamed from: c */
    public abstract void mo1248c(int i);

    /* renamed from: c */
    public abstract void mo1249c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1251d() {
        return true;
    }

    AbstractC0334j() {
    }

    /* renamed from: e */
    public Rect mo1591e() {
        return this.f1132a;
    }

    /* renamed from: a */
    protected static C0321e m1430a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0321e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0321e) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m1431b(C0322f fVar) {
        int size = fVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = fVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo1590a(Rect rect) {
        this.f1132a = rect;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0322f fVar = m1430a(listAdapter).f1052a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo1251d()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        fVar.mo1397a(menuItem, this, i2);
    }

    /* renamed from: a */
    protected static int m1429a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }
}
