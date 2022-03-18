package com.ss.android.lark.calendar.impl.features.calendars.sidebar.vh;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.C30397a;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.an;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/vh/AddCalendarViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "addIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "addText", "Landroid/widget/TextView;", "isSubscribe", "", "listener", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorAdapter$OnRecyclerViewItemClickListener;", "bindItem", "", "item", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "onClick", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.a.a */
public final class AddCalendarViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a */
    public static final int f76426a = R.layout.calendar_holder_sidebar_add_subscribe;

    /* renamed from: b */
    public static final Companion f76427b = new Companion(null);

    /* renamed from: c */
    private final ImageView f76428c;

    /* renamed from: d */
    private final TextView f76429d;

    /* renamed from: e */
    private boolean f76430e;

    /* renamed from: f */
    private C30397a.AbstractC30399a f76431f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/vh/AddCalendarViewHolder$Companion;", "", "()V", "layoutRes", "", "getLayoutRes", "()I", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo110236a() {
            return AddCalendarViewHolder.f76426a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void onClick(View view) {
        if (this.f76430e) {
            C30397a.AbstractC30399a aVar = this.f76431f;
            if (aVar != null) {
                aVar.mo109748b();
                return;
            }
            return;
        }
        C30397a.AbstractC30399a aVar2 = this.f76431f;
        if (aVar2 != null) {
            aVar2.mo109743a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCalendarViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.f76428c = (ImageView) view.findViewById(R.id.add_icon);
        this.f76429d = (TextView) view.findViewById(R.id.add_text);
        View findViewById = view.findViewById(R.id.bg_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "v.findViewById<View>(R.id.bg_view)");
        an.m125210a(findViewById, Integer.valueOf(C32659l.m125335a((Number) 8)));
        view.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo110234a(DataListItem dataListItem, C30397a.AbstractC30399a aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(dataListItem, "item");
        if (dataListItem.mo109833r() == DataListItem.TYPE.SUBSCRIBE_CALENDAR) {
            z = true;
        } else {
            z = false;
        }
        this.f76430e = z;
        if (z) {
            this.f76428c.setImageResource(R.drawable.ud_icon_subscribe_add_outlined);
            this.f76429d.setText(R.string.Calendar_Common_SubscribedCalendar);
        } else {
            this.f76428c.setImageResource(R.drawable.ud_icon_calendar_add_outlined);
            this.f76429d.setText(R.string.Calendar_Common_AddCalendar);
        }
        this.f76431f = aVar;
    }
}
