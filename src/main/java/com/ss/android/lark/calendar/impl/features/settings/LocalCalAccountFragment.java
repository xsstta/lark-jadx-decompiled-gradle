package com.ss.android.lark.calendar.impl.features.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32492j;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LocalCalAccountFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public AbstractC32383a f82965a;

    /* renamed from: b */
    public CalendarSettingViewData f82966b;

    /* renamed from: e */
    private C32384b f82967e;
    @BindView(10157)
    ListView mLvSettingItems;
    @BindView(11297)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment$a */
    public interface AbstractC32383a {
        /* renamed from: a */
        void mo109659a();

        /* renamed from: a */
        void mo109660a(String str, boolean z);
    }

    public LocalCalAccountFragment() {
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment$b */
    public class C32384b extends BaseAdapter {

        /* renamed from: a */
        public List<String> f82969a = new ArrayList();

        /* renamed from: c */
        private List<Boolean> f82971c = new ArrayList();

        public long getItemId(int i) {
            return (long) i;
        }

        public int getCount() {
            return this.f82969a.size();
        }

        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        C32384b(Map<String, Boolean> map) {
            if (map != null) {
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    this.f82969a.add(entry.getKey());
                    this.f82971c.add(entry.getValue());
                }
            }
        }

        public View getView(final int i, View view, ViewGroup viewGroup) {
            C32386c cVar;
            if (view == null) {
                view = LayoutInflater.from(LocalCalAccountFragment.this.mContext).inflate(R.layout.item_local_accounr_calendar, (ViewGroup) null, true);
                cVar = new C32386c();
                cVar.f82974a = (TextView) view.findViewById(R.id.tv_account_name);
                cVar.f82975b = (UDSwitch) view.findViewById(R.id.switch_show_local_account2);
                view.setTag(cVar);
            } else {
                cVar = (C32386c) view.getTag();
            }
            cVar.f82974a.setText(this.f82969a.get(i));
            cVar.f82975b.setChecked(this.f82971c.get(i).booleanValue());
            cVar.f82975b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.C32384b.C323851 */

                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Map<String, Boolean> localCalAccSetting = LocalCalAccountFragment.this.f82966b.getLocalCalAccSetting();
                    String str = C32384b.this.f82969a.get(i);
                    localCalAccSetting.put(str, Boolean.valueOf(z));
                    EventBus.getDefault().trigger(new C32492j());
                    LocalCalAccountFragment.this.f82965a.mo109660a(str, z);
                }
            });
            return view;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        this.f82965a.mo109659a();
        return true;
    }

    /* renamed from: c */
    private void m123604c() {
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment.View$OnClickListenerC323821 */

            public void onClick(View view) {
                LocalCalAccountFragment.this.mo113714e();
            }
        });
    }

    /* renamed from: b */
    private void m123603b() {
        this.f82967e = new C32384b(this.f82966b.getLocalCalAccSetting());
        this.mTitleBar.setTitle(C32634ae.m125182b(R.string.Calendar_Setting_LocalCalendars));
        this.mTitleBar.setMainTitleTextStyle(1);
        this.mLvSettingItems.setAdapter((ListAdapter) this.f82967e);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.LocalCalAccountFragment$c */
    final class C32386c {

        /* renamed from: a */
        TextView f82974a;

        /* renamed from: b */
        UDSwitch f82975b;

        C32386c() {
        }
    }

    /* renamed from: a */
    public void mo118344a(CalendarSettingViewData calendarSettingViewData) {
        this.f82966b = calendarSettingViewData;
        m123603b();
    }

    public LocalCalAccountFragment(AbstractC32383a aVar, CalendarSettingViewData calendarSettingViewData) {
        this.f82965a = aVar;
        this.f82966b = calendarSettingViewData;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_local_calendar_settinng, (ViewGroup) null);
        ButterKnife.bind(this, inflate);
        m123604c();
        m123603b();
        return inflate;
    }
}
