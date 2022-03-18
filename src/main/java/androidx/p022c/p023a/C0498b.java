package androidx.p022c.p023a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: androidx.c.a.b */
class C0498b extends Filter {

    /* renamed from: a */
    AbstractC0499a f1810a;

    /* renamed from: androidx.c.a.b$a */
    interface AbstractC0499a {
        /* renamed from: a */
        Cursor mo2794a();

        /* renamed from: a */
        Cursor mo2771a(CharSequence charSequence);

        /* renamed from: a */
        void mo2775a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo2777b(Cursor cursor);
    }

    C0498b(AbstractC0499a aVar) {
        this.f1810a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1810a.mo2777b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f1810a.mo2771a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor a = this.f1810a.mo2794a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f1810a.mo2775a((Cursor) filterResults.values);
        }
    }
}
