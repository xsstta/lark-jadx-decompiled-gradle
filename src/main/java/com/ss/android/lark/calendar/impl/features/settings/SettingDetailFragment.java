package com.ss.android.lark.calendar.impl.features.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;

public class SettingDetailFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public AbstractC32389a f82978a;

    /* renamed from: b */
    public CalendarSettingViewData f82979b;

    /* renamed from: e */
    public C32390b<String> f82980e;

    /* renamed from: f */
    public int f82981f;
    @BindView(10161)
    ListView mLvSettingItems;
    @BindView(11297)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment$a */
    public interface AbstractC32389a {
        /* renamed from: a */
        void mo118354a();

        /* renamed from: a */
        void mo118355a(CalendarSettingViewData calendarSettingViewData);
    }

    public SettingDetailFragment() {
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment$b */
    public class C32390b<T extends CharSequence> extends BaseAdapter {

        /* renamed from: b */
        private List<T> f82985b;

        public long getItemId(int i) {
            return (long) i;
        }

        public int getCount() {
            return this.f82985b.size();
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        C32390b(List<T> list) {
            this.f82985b = list;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C32391c cVar;
            if (view == null) {
                view = LayoutInflater.from(SettingDetailFragment.this.mContext).inflate(R.layout.item_setting_detail, (ViewGroup) null, true);
                cVar = new C32391c();
                cVar.f82986a = (TextView) view.findViewById(R.id.tv_reminder_desc);
                cVar.f82987b = (ImageView) view.findViewById(R.id.iv_reminder_check_state);
                view.setTag(cVar);
            } else {
                cVar = (C32391c) view.getTag();
            }
            cVar.f82986a.setText(this.f82985b.get(i));
            cVar.f82987b.setImageResource(R.drawable.ud_icon_list_check_outlined);
            cVar.f82987b.setColorFilter(C57582a.m223616d(SettingDetailFragment.this.mContext, R.color.primary_pri_500));
            if (SettingDetailFragment.this.f82981f == i) {
                cVar.f82987b.setVisibility(0);
            } else {
                cVar.f82987b.setVisibility(8);
            }
            return view;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        this.f82978a.mo118354a();
        return true;
    }

    /* renamed from: b */
    private void m123609b() {
        this.f82981f = this.f82979b.getChooseIndex();
        this.f82980e = new C32390b<>(this.f82979b.getSettingItems());
        this.mTitleBar.setTitle(this.f82979b.getTitleText());
        this.mLvSettingItems.setAdapter((ListAdapter) this.f82980e);
    }

    /* renamed from: c */
    private void m123610c() {
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setMainTitleTextStyle(1);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment.View$OnClickListenerC323871 */

            public void onClick(View view) {
                SettingDetailFragment.this.mo113714e();
            }
        });
        this.mLvSettingItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment.C323882 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SettingDetailFragment.this.f82981f = i;
                SettingDetailFragment.this.f82979b.setChooseIndex(i);
                SettingDetailFragment.this.f82980e.notifyDataSetChanged();
                SettingDetailFragment.this.f82978a.mo118355a(SettingDetailFragment.this.f82979b);
            }
        });
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.SettingDetailFragment$c */
    final class C32391c {

        /* renamed from: a */
        TextView f82986a;

        /* renamed from: b */
        ImageView f82987b;

        C32391c() {
        }
    }

    /* renamed from: a */
    public void mo118351a(CalendarSettingViewData calendarSettingViewData) {
        this.f82979b = calendarSettingViewData;
        m123609b();
    }

    public SettingDetailFragment(AbstractC32389a aVar, CalendarSettingViewData calendarSettingViewData) {
        this.f82978a = aVar;
        this.f82979b = calendarSettingViewData;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_calendar_settinng, (ViewGroup) null);
        ButterKnife.bind(this, inflate);
        m123610c();
        m123609b();
        return inflate;
    }
}
