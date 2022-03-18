package com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.WeekInfo;
import com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapInfo;
import com.ss.android.lark.calendar.impl.features.recyclerview.SimpleHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstancesWeekViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/WeekInfo;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "week", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.d */
public final class InstancesWeekViewHolder extends SimpleHolder<WeekInfo> {

    /* renamed from: a */
    public static final Companion f75611a = new Companion(null);

    /* renamed from: b */
    private final TextView f75612b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstancesWeekViewHolder$Companion;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapInfo;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/WeekInfo;", "()V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.d$a */
    public static final class Companion extends HolderMapInfo<WeekInfo> {
        private Companion() {
            super(WeekInfo.class, R.layout.calendar_holder_instance_list_week, InstancesWeekViewHolder.class, null, 0, 24, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstancesWeekViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.f75612b = (TextView) view.findViewById(R.id.week);
    }

    /* renamed from: a */
    public void mo109156a(WeekInfo lVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(lVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo109156a((Object) lVar);
        TextView textView = this.f75612b;
        Intrinsics.checkExpressionValueIsNotNull(textView, "week");
        textView.setText(lVar.mo109247b());
        TextView textView2 = this.f75612b;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        if (lVar.mo109248c()) {
            i = R.color.text_placeholder;
        } else {
            i = R.color.text_title;
        }
        textView2.setTextColor(UDColorUtils.getColor(context, i));
    }
}
