package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C22241f;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.p */
public class C22266p extends RecyclerView.Adapter<C22268a> {

    /* renamed from: a */
    public final C22241f<?> f54445a;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f54445a.mo77405b().mo77296f();
    }

    /* renamed from: com.google.android.material.datepicker.p$a */
    public static class C22268a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final TextView f54448a;

        C22268a(TextView textView) {
            super(textView);
            this.f54448a = textView;
        }
    }

    C22266p(C22241f<?> fVar) {
        this.f54445a = fVar;
    }

    /* renamed from: c */
    private View.OnClickListener m80560c(final int i) {
        return new View.OnClickListener() {
            /* class com.google.android.material.datepicker.C22266p.View$OnClickListenerC222671 */

            public void onClick(View view) {
                C22266p.this.f54445a.mo77403a(C22266p.this.f54445a.mo77405b().mo77288a(Month.m80428a(i, C22266p.this.f54445a.mo77402a().f54343a)));
                C22266p.this.f54445a.mo77404a(C22241f.EnumC22251a.DAY);
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo77440a(int i) {
        return i - this.f54445a.mo77405b().mo77290b().f54344b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo77443b(int i) {
        return this.f54445a.mo77405b().mo77290b().f54344b + i;
    }

    /* renamed from: a */
    public C22268a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C22268a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C22268a aVar, int i) {
        C22236a aVar2;
        int b = mo77443b(i);
        String string = aVar.f54448a.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f54448a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(b)));
        aVar.f54448a.setContentDescription(String.format(string, Integer.valueOf(b)));
        C22237b d = this.f54445a.mo77407d();
        Calendar b2 = C22265o.m80547b();
        if (b2.get(1) == b) {
            aVar2 = d.f54378f;
        } else {
            aVar2 = d.f54376d;
        }
        for (Long l : this.f54445a.mo77406c().mo77320c()) {
            b2.setTimeInMillis(l.longValue());
            if (b2.get(1) == b) {
                aVar2 = d.f54377e;
            }
        }
        aVar2.mo77392a(aVar.f54448a);
        aVar.f54448a.setOnClickListener(m80560c(b));
    }
}
