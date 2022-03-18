package com.ss.android.lark.calendar.impl.features.settings.alternateCalendar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.settings.alternateCalendar.AlternateCalendarFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u0014\u0010\u0018\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarAdapter$ViewHolder;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarFragment$Delegate;", "(Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarFragment$Delegate;)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarFragment$Delegate;", "setDelegate", "mData", "", "Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarData;", "mSelectedCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$AlternateCalendar;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setSelectAlternateCalendar", "alternateCalendar", "ViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.settings.a.a */
public final class AlternateCalendarAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public CalendarSetting.AlternateCalendar f83002a;

    /* renamed from: b */
    private List<AlternateCalendarData> f83003b = new ArrayList();

    /* renamed from: c */
    private AlternateCalendarFragment.Delegate f83004c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/alternateCalendar/AlternateCalendarAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.a.a$a */
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final View f83005a;

        /* renamed from: a */
        public final View mo118378a() {
            return this.f83005a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f83005a = view;
        }
    }

    /* renamed from: a */
    public final AlternateCalendarFragment.Delegate mo118374a() {
        return this.f83004c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f83003b.size();
    }

    /* renamed from: a */
    public final void mo118376a(CalendarSetting.AlternateCalendar alternateCalendar) {
        Intrinsics.checkParameterIsNotNull(alternateCalendar, "alternateCalendar");
        this.f83002a = alternateCalendar;
    }

    /* renamed from: a */
    public final void mo118377a(List<AlternateCalendarData> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f83003b = list;
    }

    public AlternateCalendarAdapter(AlternateCalendarFragment.Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f83004c = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.settings.a.a$b */
    public static final class View$OnClickListenerC32397b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlternateCalendarAdapter f83006a;

        /* renamed from: b */
        final /* synthetic */ AlternateCalendarData f83007b;

        View$OnClickListenerC32397b(AlternateCalendarAdapter aVar, AlternateCalendarData bVar) {
            this.f83006a = aVar;
            this.f83007b = bVar;
        }

        public final void onClick(View view) {
            this.f83006a.f83002a = this.f83007b.mo118381b();
            this.f83006a.notifyDataSetChanged();
            this.f83006a.mo118374a().mo118387a(this.f83007b.mo118381b());
            CalendarSettingHitPoint.m124371b("other_calendar_system");
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_alternate_calendar, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder aVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        AlternateCalendarData bVar = this.f83003b.get(i);
        TextView textView = (TextView) aVar.mo118378a().findViewById(R.id.calendarTypeTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.view.calendarTypeTV");
        textView.setText(bVar.mo118380a());
        ImageView imageView = (ImageView) aVar.mo118378a().findViewById(R.id.calendarCheckState);
        Intrinsics.checkExpressionValueIsNotNull(imageView, "holder.view.calendarCheckState");
        int i3 = 0;
        if (this.f83002a == bVar.mo118381b()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        View findViewById = aVar.mo118378a().findViewById(R.id.bottomDivider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "holder.view.bottomDivider");
        if (i == getItemCount() - 1) {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
        aVar.mo118378a().setOnClickListener(new View$OnClickListenerC32397b(this, bVar));
    }
}
