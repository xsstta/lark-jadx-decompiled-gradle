package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.AbstractC0339m;
import com.larksuite.suite.R;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
public class C0319d implements AdapterView.OnItemClickListener, AbstractC0337l {

    /* renamed from: a */
    Context f1040a;

    /* renamed from: b */
    LayoutInflater f1041b;

    /* renamed from: c */
    C0322f f1042c;

    /* renamed from: d */
    ExpandedMenuView f1043d;

    /* renamed from: e */
    int f1044e;

    /* renamed from: f */
    int f1045f;

    /* renamed from: g */
    int f1046g;

    /* renamed from: h */
    C0320a f1047h;

    /* renamed from: i */
    private AbstractC0337l.AbstractC0338a f1048i;

    /* renamed from: j */
    private int f1049j;

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1350a(C0322f fVar, C0326h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1247b() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: b */
    public boolean mo1352b(C0322f fVar, C0326h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: c */
    public int mo1353c() {
        return this.f1049j;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$a */
    public class C0320a extends BaseAdapter {

        /* renamed from: b */
        private int f1051b = -1;

        public long getItemId(int i) {
            return (long) i;
        }

        public void notifyDataSetChanged() {
            mo1365a();
            super.notifyDataSetChanged();
        }

        public int getCount() {
            int size = C0319d.this.f1042c.mo1439m().size() - C0319d.this.f1044e;
            if (this.f1051b < 0) {
                return size;
            }
            return size - 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1365a() {
            C0326h s = C0319d.this.f1042c.mo1449s();
            if (s != null) {
                ArrayList<C0326h> m = C0319d.this.f1042c.mo1439m();
                int size = m.size();
                for (int i = 0; i < size; i++) {
                    if (m.get(i) == s) {
                        this.f1051b = i;
                        return;
                    }
                }
            }
            this.f1051b = -1;
        }

        public C0320a() {
            mo1365a();
        }

        /* renamed from: a */
        public C0326h getItem(int i) {
            ArrayList<C0326h> m = C0319d.this.f1042c.mo1439m();
            int i2 = i + C0319d.this.f1044e;
            int i3 = this.f1051b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m.get(i2);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0319d.this.f1041b.inflate(C0319d.this.f1046g, viewGroup, false);
            }
            ((AbstractC0339m.AbstractC0340a) view).mo1214a(getItem(i), 0);
            return view;
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    public Parcelable c_() {
        if (this.f1043d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo1360a(bundle);
        return bundle;
    }

    /* renamed from: d */
    public ListAdapter mo1362d() {
        if (this.f1047h == null) {
            this.f1047h = new C0320a();
        }
        return this.f1047h;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1242a(AbstractC0337l.AbstractC0338a aVar) {
        this.f1048i = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1237a(Parcelable parcelable) {
        mo1361b((Bundle) parcelable);
    }

    /* renamed from: b */
    public void mo1361b(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1043d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public void mo1360a(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1043d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: a */
    public AbstractC0339m mo1359a(ViewGroup viewGroup) {
        if (this.f1043d == null) {
            this.f1043d = (ExpandedMenuView) this.f1041b.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1047h == null) {
                this.f1047h = new C0320a();
            }
            this.f1043d.setAdapter((ListAdapter) this.f1047h);
            this.f1043d.setOnItemClickListener(this);
        }
        return this.f1043d;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1243a(boolean z) {
        C0320a aVar = this.f1047h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public boolean mo1244a(SubMenuC0346q qVar) {
        if (!qVar.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnClickListenerC0325g(qVar).mo1457a((IBinder) null);
        AbstractC0337l.AbstractC0338a aVar = this.f1048i;
        if (aVar == null) {
            return true;
        }
        aVar.mo883a(qVar);
        return true;
    }

    public C0319d(int i, int i2) {
        this.f1046g = i;
        this.f1045f = i2;
    }

    public C0319d(Context context, int i) {
        this(i, 0);
        this.f1040a = context;
        this.f1041b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1241a(C0322f fVar, boolean z) {
        AbstractC0337l.AbstractC0338a aVar = this.f1048i;
        if (aVar != null) {
            aVar.mo882a(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0337l
    /* renamed from: a */
    public void mo1345a(Context context, C0322f fVar) {
        if (this.f1045f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1045f);
            this.f1040a = contextThemeWrapper;
            this.f1041b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1040a != null) {
            this.f1040a = context;
            if (this.f1041b == null) {
                this.f1041b = LayoutInflater.from(context);
            }
        }
        this.f1042c = fVar;
        C0320a aVar = this.f1047h;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1042c.mo1397a(this.f1047h.getItem(i), this, 0);
    }
}
