package com.ss.android.lark.calendar.impl.features.calendars.selector;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.AccountManagerVH;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.AddCalendarVH;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarTitleVH;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.ViewSwitchVH;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a */
public class C30397a extends RecyclerView.Adapter {

    /* renamed from: a */
    protected AbstractC30399a f76113a;

    /* renamed from: b */
    protected List<DataListItem> f76114b = new ArrayList();

    /* renamed from: c */
    private List<DataListItem> f76115c;

    /* renamed from: d */
    private List<DataListItem> f76116d;

    /* renamed from: e */
    private List<DataListItem> f76117e;

    /* renamed from: f */
    private boolean f76118f = false;

    /* renamed from: g */
    private CalendarCellVH.OnCellClickListener f76119g = new CalendarCellVH.OnCellClickListener() {
        /* class com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a.C303981 */

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH.OnCellClickListener
        /* renamed from: a */
        public void mo109740a(AccountDataListItem aVar) {
            if (C30397a.this.f76113a != null) {
                C30397a.this.f76113a.mo109745a(aVar);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH.OnCellClickListener
        /* renamed from: a */
        public void mo109741a(String str) {
            if (C30397a.this.f76113a != null) {
                C30397a.this.f76113a.mo109746a(str);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.vh.CalendarCellVH.OnCellClickListener
        /* renamed from: a */
        public void mo109742a(String str, boolean z, boolean z2) {
            if (C30397a.this.f76113a != null) {
                C30397a.this.f76113a.mo109747a(str, z, z2);
            }
        }
    };

    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a$a */
    public interface AbstractC30399a {

        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.a$a$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$b(AbstractC30399a aVar) {
            }
        }

        /* renamed from: a */
        void mo109743a();

        /* renamed from: a */
        void mo109744a(int i);

        /* renamed from: a */
        void mo109745a(AccountDataListItem aVar);

        /* renamed from: a */
        void mo109746a(String str);

        /* renamed from: a */
        void mo109747a(String str, boolean z, boolean z2);

        /* renamed from: b */
        void mo109748b();
    }

    /* renamed from: a */
    public void mo109732a() {
        this.f76118f = true;
    }

    /* renamed from: b */
    public List<DataListItem> mo109736b() {
        return new ArrayList(this.f76114b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<DataListItem> list = this.f76114b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: c */
    private void m112980c() {
        if (this.f76116d != null) {
            this.f76114b.clear();
            List<DataListItem> list = this.f76115c;
            if (list != null) {
                this.f76114b.addAll(list);
            }
            List<DataListItem> list2 = this.f76116d;
            if (list2 != null) {
                this.f76114b.addAll(list2);
            }
            List<DataListItem> list3 = this.f76117e;
            if (list3 != null) {
                this.f76114b.addAll(list3);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo109733a(AbstractC30399a aVar) {
        this.f76113a = aVar;
    }

    /* renamed from: c */
    public void mo109739c(List<DataListItem> list) {
        this.f76117e = list;
        m112980c();
    }

    /* renamed from: a */
    public void mo109734a(List<DataListItem> list) {
        this.f76115c = list;
    }

    /* renamed from: b */
    public void mo109737b(List<DataListItem> list) {
        this.f76116d = list;
        m112980c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        DataListItem dataListItem = this.f76114b.get(i);
        if (dataListItem == null) {
            return DataListItem.TYPE.CELL.getIntValue();
        }
        return dataListItem.mo109833r().getIntValue();
    }

    /* renamed from: a */
    public int[] mo109735a(String str) {
        int i = -1;
        int i2 = 1;
        for (int i3 = 0; i3 < this.f76114b.size(); i3++) {
            DataListItem dataListItem = this.f76114b.get(i3);
            if (dataListItem.mo109833r() == DataListItem.TYPE.TITLE && !TextUtils.isEmpty(dataListItem.mo109834s()) && dataListItem.mo109834s().equals(str)) {
                i = i3;
            }
            if (dataListItem.mo109833r() == DataListItem.TYPE.CELL && !TextUtils.isEmpty(dataListItem.mo109812b()) && dataListItem.mo109812b().equals(str)) {
                i2++;
            }
        }
        if (i == -1 || i + i2 >= this.f76114b.size()) {
            return null;
        }
        return new int[]{i, i2};
    }

    /* renamed from: b */
    public int[] mo109738b(String str) {
        int i = -1;
        for (int i2 = 0; i2 < this.f76114b.size(); i2++) {
            DataListItem dataListItem = this.f76114b.get(i2);
            if (dataListItem.mo109833r() == DataListItem.TYPE.CELL && !TextUtils.isEmpty(dataListItem.mo109806a()) && dataListItem.mo109806a().equals(str)) {
                i = i2;
            }
        }
        if (i == -1 || i + 1 >= this.f76114b.size()) {
            return null;
        }
        return new int[]{i, 1};
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Integer.valueOf(i));
        DataListItem dataListItem = this.f76114b.get(i);
        if (dataListItem != null) {
            if (dataListItem.mo109833r() == DataListItem.TYPE.TITLE) {
                CalendarTitleVH dVar = (CalendarTitleVH) viewHolder;
                dVar.mo109860a(dataListItem);
                if (this.f76118f) {
                    dVar.mo109859a();
                }
            } else if (dataListItem.mo109833r() == DataListItem.TYPE.ACC_MANAGER) {
                ((AccountManagerVH) viewHolder).mo109844a(dataListItem);
            } else if (dataListItem.mo109833r() == DataListItem.TYPE.CELL) {
                CalendarCellVH cVar = (CalendarCellVH) viewHolder;
                if (this.f76118f) {
                    cVar.mo109854f();
                }
                cVar.mo109849a(dataListItem);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == DataListItem.TYPE.TITLE.getIntValue()) {
            return new CalendarTitleVH(from.inflate(R.layout.item_calendar_selector_title, viewGroup, false));
        }
        if (i == DataListItem.TYPE.ACC_MANAGER.getIntValue()) {
            return new AccountManagerVH(from.inflate(R.layout.item_calendar_selector_acc_manager, viewGroup, false), this.f76119g);
        }
        if (i == DataListItem.TYPE.VIEW_SWITCH.getIntValue()) {
            return new ViewSwitchVH(from.inflate(R.layout.item_calendar_selector_swtich, viewGroup, false), this.f76113a);
        }
        if (i == DataListItem.TYPE.ADD_CALENDAR.getIntValue()) {
            return new AddCalendarVH(from.inflate(R.layout.item_calendar_selector_add_calendar, viewGroup, false), this.f76113a);
        }
        return new CalendarCellVH(from.inflate(R.layout.item_calendar_selector_cell, viewGroup, false), this.f76119g);
    }
}
