package com.ss.lark.android.passport.biz.feature.country;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.widget.p2445c.AbstractC49260c;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.country.b */
public class C64715b extends RecyclerView.Adapter implements AbstractC49260c {

    /* renamed from: a */
    public AbstractC64719b f163246a;

    /* renamed from: b */
    private List<CountryBean> f163247b = new ArrayList();

    /* renamed from: com.ss.lark.android.passport.biz.feature.country.b$b */
    public interface AbstractC64719b {
        /* renamed from: a */
        void mo223562a(CountryBean countryBean);
    }

    /* renamed from: a */
    public void mo223569a() {
        this.f163247b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.passport.infra.widget.p2445c.AbstractC49260c
    public int getItemCount() {
        return this.f163247b.size();
    }

    /* renamed from: a */
    public void mo223570a(AbstractC64719b bVar) {
        this.f163246a = bVar;
    }

    /* renamed from: a */
    public void mo223571a(Collection<CountryBean> collection) {
        this.f163247b.addAll(collection);
    }

    @Override // com.ss.android.lark.passport.infra.widget.p2445c.AbstractC49260c
    /* renamed from: a */
    public RecyclerView.ViewHolder mo171816a(ViewGroup viewGroup) {
        return new RecyclerView.ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.signin_sdk_activity_country_select_header, viewGroup, false)) {
            /* class com.ss.lark.android.passport.biz.feature.country.C64715b.C647172 */
        };
    }

    /* renamed from: b */
    public void mo223572b(Collection<CountryBean> collection) {
        List<CountryBean> list = this.f163247b;
        ArrayList arrayList = new ArrayList();
        this.f163247b = arrayList;
        arrayList.addAll(collection);
        this.f163247b.addAll(list);
    }

    @Override // com.ss.android.lark.passport.infra.widget.p2445c.AbstractC49260c
    /* renamed from: a */
    public long mo171815a(int i) {
        CountryBean countryBean = this.f163247b.get(i);
        if (TextUtils.isEmpty(countryBean.getHeadIndex())) {
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171471d("CountryListAdapter", "country bean head index is empty, country name is " + countryBean.getName());
            return 0;
        }
        String headIndex = countryBean.getHeadIndex();
        if (headIndex.equals("-1")) {
            return 35;
        }
        return (long) headIndex.toUpperCase().charAt(0);
    }

    /* renamed from: com.ss.lark.android.passport.biz.feature.country.b$a */
    public class C64718a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f163251a;

        public C64718a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.country_text);
            this.f163251a = textView;
            DesktopUtil.m144299a(textView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C64718a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.signin_sdk_country_item, viewGroup, false));
    }

    @Override // com.ss.android.lark.passport.infra.widget.p2445c.AbstractC49260c
    /* renamed from: a */
    public void mo171817a(RecyclerView.ViewHolder viewHolder, int i) {
        String headIndex = this.f163247b.get(i).getHeadIndex();
        TextView textView = (TextView) viewHolder.itemView;
        if (headIndex == null || headIndex.equals("-1")) {
            textView.setText("#");
        } else {
            textView.setText(headIndex.toUpperCase());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        final CountryBean countryBean = this.f163247b.get(i);
        TextView textView = ((C64718a) viewHolder).f163251a;
        textView.setText(countryBean.getName() + " " + countryBean.getCode());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.country.C64715b.View$OnClickListenerC647161 */

            public void onClick(View view) {
                if (C64715b.this.f163246a != null) {
                    C64715b.this.f163246a.mo223562a(countryBean);
                }
            }
        });
    }
}
