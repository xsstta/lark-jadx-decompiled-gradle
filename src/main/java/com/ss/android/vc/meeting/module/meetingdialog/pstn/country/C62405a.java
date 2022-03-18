package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.widget.IconFontView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.a */
public class C62405a extends RecyclerView.Adapter implements AbstractC26197e {

    /* renamed from: a */
    private List<CountryInfo> f156970a = new ArrayList();

    /* renamed from: b */
    private List<CountryInfo> f156971b = new ArrayList();

    /* renamed from: c */
    private List<CountryInfo> f156972c = new ArrayList();

    /* renamed from: d */
    private boolean f156973d;

    /* renamed from: e */
    private String f156974e;

    /* renamed from: f */
    private AbstractC62408c f156975f;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.a$c */
    public interface AbstractC62408c {
        /* renamed from: a */
        void mo215770a(CountryInfo countryInfo);
    }

    /* renamed from: b */
    public boolean mo215795b() {
        return this.f156973d;
    }

    /* renamed from: c */
    public List<CountryInfo> mo215796c() {
        return this.f156970a;
    }

    /* renamed from: a */
    public void mo215790a() {
        this.f156970a.clear();
        this.f156971b.clear();
        this.f156972c.clear();
        this.f156973d = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.larksuite.framework.ui.p1198b.AbstractC26197e
    public int getItemCount() {
        if (this.f156973d) {
            return this.f156971b.size() + this.f156970a.size();
        }
        return this.f156972c.size();
    }

    /* renamed from: a */
    public void mo215791a(AbstractC62408c cVar) {
        this.f156975f = cVar;
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.a$a */
    public class C62406a extends RecyclerView.ViewHolder {

        /* renamed from: b */
        private TextView f156977b;

        /* renamed from: a */
        public void mo215797a(String str) {
            this.f156977b.setText(str);
        }

        public C62406a(TextView textView) {
            super(textView);
            this.f156977b = textView;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.a$b */
    public class C62407b extends RecyclerView.ViewHolder {

        /* renamed from: b */
        private TextView f156979b;

        /* renamed from: c */
        private View f156980c;

        /* renamed from: d */
        private IconFontView f156981d;

        /* renamed from: a */
        public void mo215798a(String str) {
            this.f156979b.setText(str);
        }

        /* renamed from: a */
        public void mo215799a(boolean z) {
            int i;
            View view = this.f156980c;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }

        /* renamed from: b */
        public void mo215800b(boolean z) {
            int i;
            this.f156979b.setSelected(z);
            IconFontView iconFontView = this.f156981d;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            iconFontView.setVisibility(i);
        }

        public C62407b(View view) {
            super(view);
            this.f156979b = (TextView) view.findViewById(R.id.tv_country_desc);
            this.f156980c = view.findViewById(R.id.line_separator);
            this.f156981d = (IconFontView) view.findViewById(R.id.icon_selected);
        }
    }

    /* renamed from: b */
    public C62406a mo93177a(ViewGroup viewGroup) {
        return new C62406a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.country_list_header, viewGroup, false));
    }

    /* renamed from: b */
    private CountryInfo m243909b(int i) {
        if (!this.f156973d) {
            return this.f156972c.get(i);
        }
        if (i < this.f156971b.size()) {
            return this.f156971b.get(i);
        }
        return this.f156970a.get(i - this.f156971b.size());
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        CountryInfo b = m243909b(i);
        if (TextUtils.isEmpty(b.getHeadIndex())) {
            C60700b.m235864f("CountryListAdapter", "[getHeaderId]", "country bean head index is empty, country name is " + b.getName());
            return -1;
        }
        String headIndex = b.getHeadIndex();
        if (headIndex.equals("-1")) {
            return -1;
        }
        return (long) headIndex.toUpperCase().charAt(0);
    }

    /* renamed from: a */
    public void mo215792a(String str) {
        this.f156974e = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243908a(CountryInfo countryInfo, View view) {
        AbstractC62408c cVar = this.f156975f;
        if (cVar != null) {
            cVar.mo215770a(countryInfo);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C62407b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.country_list_item, viewGroup, false));
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
        String headIndex = m243909b(i).getHeadIndex();
        if (!(viewHolder instanceof C62406a)) {
            C60700b.m235864f("CountryListAdapter", "[onBindHeaderViewHolder]", "bind wrong holder type, should be CountryHeaderViewHolder but actually is " + viewHolder);
            return;
        }
        ((C62406a) viewHolder).mo215797a(headIndex.toUpperCase());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        if (viewHolder instanceof C62407b) {
            C62407b bVar = (C62407b) viewHolder;
            CountryInfo b = m243909b(i);
            boolean z2 = false;
            if (this.f156973d && i < getItemCount() - 1) {
                long a = mo93176a(i);
                long a2 = mo93176a(i + 1);
                if (a2 < 0 || a2 == a) {
                    z = false;
                } else {
                    z = true;
                }
                bVar.mo215799a(z);
            }
            bVar.mo215798a(String.format("%s %s", b.getName(), b.getCode()));
            if (!this.f156973d && !TextUtils.isEmpty(this.f156974e) && this.f156974e.equals(b.getCode())) {
                z2 = true;
            }
            bVar.mo215800b(z2);
            bVar.itemView.setOnClickListener(new View.OnClickListener(b) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$a$0TbC8k5KNyfcykquqJTOaogRdgs */
                public final /* synthetic */ CountryInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C62405a.this.m243908a((C62405a) this.f$1, (CountryInfo) view);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo215793a(Collection<CountryInfo> collection, Collection<CountryInfo> collection2) {
        mo215790a();
        this.f156971b.addAll(collection);
        this.f156970a.addAll(collection2);
        this.f156972c.addAll(collection);
        for (CountryInfo countryInfo : this.f156970a) {
            if (!this.f156972c.contains(countryInfo)) {
                this.f156972c.add(countryInfo);
            }
        }
        C60700b.m235851b("CountryListAdapter", "[reset]", "composed list size: " + this.f156972c.size());
        if (this.f156972c.size() >= 15) {
            this.f156973d = true;
        } else {
            this.f156973d = false;
        }
    }
}
