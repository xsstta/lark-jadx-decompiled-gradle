package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListCellViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListHeaderViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListShowMoreViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.CalendarListSubHeaderViewHolder;
import com.ss.android.lark.calendar.impl.features.search.calendar.vh.DataListItem;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.a */
public class C32315a extends RecyclerView.Adapter {

    /* renamed from: a */
    protected AbstractC32317a f82710a;

    /* renamed from: b */
    RecyclerView f82711b;

    /* renamed from: c */
    protected List<DataListItem> f82712c = new ArrayList();

    /* renamed from: d */
    protected View.OnClickListener f82713d = new View.OnClickListener() {
        /* class com.ss.android.lark.calendar.impl.features.search.calendar.C32315a.View$OnClickListenerC323161 */

        public void onClick(View view) {
            int childAdapterPosition;
            if (C32315a.this.f82710a != null && (childAdapterPosition = C32315a.this.f82711b.getChildAdapterPosition(view)) != -1 && childAdapterPosition < C32315a.this.f82712c.size()) {
                DataListItem dataListItem = C32315a.this.f82712c.get(childAdapterPosition);
                if (dataListItem.mo118153c() == DataListItem.TYPE.MORE) {
                    DataListItem dataListItem2 = C32315a.this.f82712c.get(childAdapterPosition);
                    C32315a.this.f82712c.remove(childAdapterPosition);
                    C32315a.this.notifyItemRemoved(childAdapterPosition);
                    C32315a.this.f82712c.addAll(childAdapterPosition, dataListItem2.mo118156f());
                    C32315a.this.notifyItemRangeInserted(childAdapterPosition, dataListItem2.mo118156f().size());
                } else if (dataListItem.mo118153c() == DataListItem.TYPE.CELL) {
                    Calendar a = dataListItem.mo118146a();
                    a.setIsVisible(!a.isVisible());
                    C32315a.this.f82710a.mo118073a(a.getServerId(), a.isVisible(), dataListItem.mo118157g());
                }
            }
        }
    };

    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.a$a */
    public interface AbstractC32317a {
        /* renamed from: a */
        void mo118073a(String str, boolean z, boolean z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<DataListItem> list = this.f82712c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public C32315a(RecyclerView recyclerView) {
        this.f82711b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        DataListItem dataListItem = this.f82712c.get(i);
        if (dataListItem == null) {
            return DataListItem.TYPE.CELL.getIntValue();
        }
        return dataListItem.mo118153c().getIntValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.itemView.setTag(Integer.valueOf(i));
        DataListItem dataListItem = this.f82712c.get(i);
        if (dataListItem != null) {
            if (dataListItem.mo118153c() == DataListItem.TYPE.HEADER) {
                ((CalendarListHeaderViewHolder) viewHolder).mo118141a(dataListItem);
            } else if (dataListItem.mo118153c() == DataListItem.TYPE.SUB_HEADER) {
                ((CalendarListSubHeaderViewHolder) viewHolder).mo118145a(dataListItem);
            } else if (dataListItem.mo118153c() == DataListItem.TYPE.MORE) {
                ((CalendarListShowMoreViewHolder) viewHolder).mo118142a(dataListItem);
            } else {
                ((CalendarListCellViewHolder) viewHolder).mo118135a(dataListItem);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == DataListItem.TYPE.HEADER.getIntValue()) {
            return new CalendarListHeaderViewHolder(from.inflate(R.layout.item_calendar_drawer_header, viewGroup, false));
        }
        if (i == DataListItem.TYPE.SUB_HEADER.getIntValue()) {
            return new CalendarListSubHeaderViewHolder(from.inflate(R.layout.item_calendar_drawer_sub_header, viewGroup, false));
        }
        if (i == DataListItem.TYPE.MORE.getIntValue()) {
            return new CalendarListShowMoreViewHolder(from.inflate(R.layout.item_calendar_drawer_more, viewGroup, false), this.f82713d);
        }
        return new CalendarListCellViewHolder(from.inflate(R.layout.item_calendar_drawer_cell, viewGroup, false), this.f82713d);
    }
}
