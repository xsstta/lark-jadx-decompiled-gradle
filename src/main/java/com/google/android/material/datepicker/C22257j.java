package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C22241f;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.j */
public class C22257j extends RecyclerView.Adapter<C22259a> {

    /* renamed from: a */
    public final C22241f.AbstractC22252b f54431a;

    /* renamed from: b */
    private final CalendarConstraints f54432b;

    /* renamed from: c */
    private final DateSelector<?> f54433c;

    /* renamed from: d */
    private final int f54434d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f54432b.mo77294e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo77430a(Month month) {
        return this.f54432b.mo77290b().mo77360b(month);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Month mo77434b(int i) {
        return this.f54432b.mo77290b().mo77361b(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f54432b.mo77290b().mo77361b(i).mo77362c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo77432a(int i) {
        return mo77434b(i).mo77364d();
    }

    /* renamed from: com.google.android.material.datepicker.j$a */
    public static class C22259a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TextView f54437a;

        /* renamed from: b */
        final MaterialCalendarGridView f54438b;

        C22259a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f54437a = textView;
            ViewCompat.m4070d((View) textView, true);
            this.f54438b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public C22259a onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.m80412a(viewGroup.getContext())) {
            return new C22259a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f54434d));
        return new C22259a(linearLayout, true);
    }

    /* renamed from: a */
    public void onBindViewHolder(C22259a aVar, int i) {
        Month b = this.f54432b.mo77290b().mo77361b(i);
        aVar.f54437a.setText(b.mo77364d());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f54438b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b.equals(materialCalendarGridView.getAdapter().f54427b)) {
            C22256i iVar = new C22256i(b, this.f54433c, this.f54432b);
            materialCalendarGridView.setNumColumns(b.f54345c);
            materialCalendarGridView.setAdapter((ListAdapter) iVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.google.android.material.datepicker.C22257j.C222581 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (materialCalendarGridView.getAdapter().mo77422d(i)) {
                    C22257j.this.f54431a.mo77412a(materialCalendarGridView.getAdapter().getItem(i).longValue());
                }
            }
        });
    }

    C22257j(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C22241f.AbstractC22252b bVar) {
        int i;
        Month b = calendarConstraints.mo77290b();
        Month c = calendarConstraints.mo77291c();
        Month d = calendarConstraints.mo77292d();
        if (b.compareTo(d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (d.compareTo(c) <= 0) {
            int a = C22256i.f54426a * C22241f.m80492a(context);
            if (MaterialDatePicker.m80412a(context)) {
                i = C22241f.m80492a(context);
            } else {
                i = 0;
            }
            this.f54434d = a + i;
            this.f54432b = calendarConstraints;
            this.f54433c = dateSelector;
            this.f54431a = bVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }
}
