package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.AbstractC0339m;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0321e extends BaseAdapter {

    /* renamed from: a */
    C0322f f1052a;

    /* renamed from: b */
    private int f1053b = -1;

    /* renamed from: c */
    private boolean f1054c;

    /* renamed from: d */
    private final boolean f1055d;

    /* renamed from: e */
    private final LayoutInflater f1056e;

    /* renamed from: f */
    private final int f1057f;

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public C0322f mo1371a() {
        return this.f1052a;
    }

    public void notifyDataSetChanged() {
        mo1374b();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1374b() {
        C0326h s = this.f1052a.mo1449s();
        if (s != null) {
            ArrayList<C0326h> m = this.f1052a.mo1439m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                if (m.get(i) == s) {
                    this.f1053b = i;
                    return;
                }
            }
        }
        this.f1053b = -1;
    }

    public int getCount() {
        ArrayList<C0326h> arrayList;
        if (this.f1055d) {
            arrayList = this.f1052a.mo1439m();
        } else {
            arrayList = this.f1052a.mo1436j();
        }
        if (this.f1053b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    /* renamed from: a */
    public void mo1373a(boolean z) {
        this.f1054c = z;
    }

    /* renamed from: a */
    public C0326h getItem(int i) {
        ArrayList<C0326h> arrayList;
        if (this.f1055d) {
            arrayList = this.f1052a.mo1439m();
        } else {
            arrayList = this.f1052a.mo1436j();
        }
        int i2 = this.f1053b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f1056e.inflate(this.f1057f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f1052a.mo1413b() || groupId == i2) {
            z = false;
        } else {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        AbstractC0339m.AbstractC0340a aVar = (AbstractC0339m.AbstractC0340a) view;
        if (this.f1054c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1214a(getItem(i), 0);
        return view;
    }

    public C0321e(C0322f fVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1055d = z;
        this.f1056e = layoutInflater;
        this.f1052a = fVar;
        this.f1057f = i;
        mo1374b();
    }
}
