package androidx.p022c.p023a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.p022c.p023a.C0498b;

/* renamed from: androidx.c.a.a */
public abstract class AbstractC0495a extends BaseAdapter implements Filterable, C0498b.AbstractC0499a {

    /* renamed from: a */
    protected boolean f1799a;

    /* renamed from: b */
    protected boolean f1800b;

    /* renamed from: c */
    protected Cursor f1801c;

    /* renamed from: d */
    protected Context f1802d;

    /* renamed from: e */
    protected int f1803e;

    /* renamed from: f */
    protected C0496a f1804f;

    /* renamed from: g */
    protected DataSetObserver f1805g;

    /* renamed from: h */
    protected C0498b f1806h;

    /* renamed from: i */
    protected FilterQueryProvider f1807i;

    /* renamed from: a */
    public abstract View mo2773a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo2776a(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    @Override // androidx.p022c.p023a.C0498b.AbstractC0499a
    /* renamed from: a */
    public Cursor mo2794a() {
        return this.f1801c;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.c.a.a$b */
    public class C0497b extends DataSetObserver {
        public void onChanged() {
            AbstractC0495a.this.f1799a = true;
            AbstractC0495a.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            AbstractC0495a.this.f1799a = false;
            AbstractC0495a.this.notifyDataSetInvalidated();
        }

        C0497b() {
        }
    }

    public int getCount() {
        Cursor cursor;
        if (!this.f1799a || (cursor = this.f1801c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Filter getFilter() {
        if (this.f1806h == null) {
            this.f1806h = new C0498b(this);
        }
        return this.f1806h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2797b() {
        Cursor cursor;
        if (this.f1800b && (cursor = this.f1801c) != null && !cursor.isClosed()) {
            this.f1799a = this.f1801c.requery();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.c.a.a$a */
    public class C0496a extends ContentObserver {
        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            AbstractC0495a.this.mo2797b();
        }

        C0496a() {
            super(new Handler());
        }
    }

    @Override // androidx.p022c.p023a.C0498b.AbstractC0499a
    /* renamed from: a */
    public Cursor mo2771a(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f1807i;
        if (filterQueryProvider != null) {
            return filterQueryProvider.runQuery(charSequence);
        }
        return this.f1801c;
    }

    @Override // androidx.p022c.p023a.C0498b.AbstractC0499a
    /* renamed from: b */
    public CharSequence mo2777b(Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f1799a || (cursor = this.f1801c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1801c;
    }

    @Override // androidx.p022c.p023a.C0498b.AbstractC0499a
    /* renamed from: a */
    public void mo2775a(Cursor cursor) {
        Cursor c = mo2798c(cursor);
        if (c != null) {
            c.close();
        }
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f1799a || (cursor = this.f1801c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f1801c.getLong(this.f1803e);
    }

    /* renamed from: c */
    public Cursor mo2798c(Cursor cursor) {
        Cursor cursor2 = this.f1801c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0496a aVar = this.f1804f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1805g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1801c = cursor;
        if (cursor != null) {
            C0496a aVar2 = this.f1804f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f1805g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1803e = cursor.getColumnIndexOrThrow("_id");
            this.f1799a = true;
            notifyDataSetChanged();
        } else {
            this.f1803e = -1;
            this.f1799a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public View mo2796b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo2773a(context, cursor, viewGroup);
    }

    public AbstractC0495a(Context context, Cursor cursor, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        mo2795a(context, cursor, i);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1799a) {
            return null;
        }
        this.f1801c.moveToPosition(i);
        if (view == null) {
            view = mo2796b(this.f1802d, this.f1801c, viewGroup);
        }
        mo2776a(view, this.f1802d, this.f1801c);
        return view;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1799a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f1801c.moveToPosition(i)) {
            if (view == null) {
                view = mo2773a(this.f1802d, this.f1801c, viewGroup);
            }
            mo2776a(view, this.f1802d, this.f1801c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2795a(Context context, Cursor cursor, int i) {
        int i2;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1800b = true;
        } else {
            this.f1800b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f1801c = cursor;
        this.f1799a = z;
        this.f1802d = context;
        if (z) {
            i2 = cursor.getColumnIndexOrThrow("_id");
        } else {
            i2 = -1;
        }
        this.f1803e = i2;
        if ((i & 2) == 2) {
            this.f1804f = new C0496a();
            this.f1805g = new C0497b();
        } else {
            this.f1804f = null;
            this.f1805g = null;
        }
        if (z) {
            C0496a aVar = this.f1804f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1805g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }
}
