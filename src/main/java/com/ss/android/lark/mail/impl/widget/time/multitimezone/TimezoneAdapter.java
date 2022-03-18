package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0016\u0010\u0015\u001a\u00020\u000f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005J\u0010\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimezoneAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneVH;", "()V", "mDataList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "mItemClickListener", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimezoneAdapter$ItemClickListener;", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "refreshTimezoneData", "dataList", "setItemClickListener", "itemClickListener", "ItemClickListener", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.p */
public final class TimezoneAdapter extends RecyclerView.Adapter<TimeZoneVH> {

    /* renamed from: a */
    private ArrayList<TimeZoneItemData> f112072a = new ArrayList<>();

    /* renamed from: b */
    private ItemClickListener f112073b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimezoneAdapter$ItemClickListener;", "", "onBodyClick", "", "itemData", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.p$a */
    public interface ItemClickListener {
        /* renamed from: a */
        void mo157071a(TimeZoneItemData iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f112072a.size();
    }

    public TimezoneAdapter() {
        setHasStableIds(true);
    }

    /* renamed from: a */
    public final void mo157076a(ItemClickListener aVar) {
        this.f112073b = aVar;
    }

    /* renamed from: a */
    public final void mo157077a(ArrayList<TimeZoneItemData> arrayList) {
        this.f112072a.clear();
        if (arrayList != null) {
            this.f112072a.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public TimeZoneVH onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_item_calendar_timezone_cell, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new TimeZoneVH(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(TimeZoneVH oVar, int i) {
        Intrinsics.checkParameterIsNotNull(oVar, "holder");
        TimeZoneItemData iVar = this.f112072a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(iVar, "mDataList[position]");
        oVar.mo157072a(iVar, this.f112073b);
    }
}
