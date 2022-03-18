package com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.MonthInfo;
import com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapInfo;
import com.ss.android.lark.calendar.impl.features.recyclerview.SimpleHolder;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstancesMonthViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/MonthInfo;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "month", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.c */
public final class InstancesMonthViewHolder extends SimpleHolder<MonthInfo> {

    /* renamed from: a */
    public static final Typeface f75608a;

    /* renamed from: b */
    public static final Companion f75609b = new Companion(null);

    /* renamed from: c */
    private final TextView f75610c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstancesMonthViewHolder$Companion;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapInfo;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/MonthInfo;", "()V", "typeface", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.c$a */
    public static final class Companion extends HolderMapInfo<MonthInfo> {
        /* renamed from: a */
        public final Typeface mo109172a() {
            return InstancesMonthViewHolder.f75608a;
        }

        private Companion() {
            super(MonthInfo.class, R.layout.calendar_holder_instance_list_month, InstancesMonthViewHolder.class, null, 0, 24, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Typeface typeface = null;
        try {
            Context a = C32634ae.m125179a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
            typeface = Typeface.createFromAsset(a.getAssets(), "fonts/DINPro-Bold.ttf");
        } catch (RuntimeException unused) {
        }
        f75608a = typeface;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstancesMonthViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
        TextView textView = (TextView) view.findViewById(R.id.month);
        Intrinsics.checkExpressionValueIsNotNull(textView, "it");
        textView.setTypeface(f75608a);
        this.f75610c = textView;
    }

    /* renamed from: a */
    public void mo109156a(MonthInfo kVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(kVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo109156a((Object) kVar);
        TextView textView = this.f75610c;
        Intrinsics.checkExpressionValueIsNotNull(textView, "month");
        textView.setText(kVar.mo109244b());
        TextView textView2 = this.f75610c;
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
        if (kVar.mo109245c()) {
            i = R.color.text_placeholder;
        } else {
            i = R.color.text_title;
        }
        textView2.setTextColor(UDColorUtils.getColor(context, i));
    }
}
