package com.ss.android.lark.calendar.impl.features.calendars.detail.viewholder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.InstanceCardInfo;
import com.ss.android.lark.calendar.impl.features.recyclerview.HolderMapInfo;
import com.ss.android.lark.calendar.impl.features.recyclerview.SimpleHolder;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.utils.C32659l;
import com.ss.android.lark.calendar.impl.utils.RoundRectDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\u00100\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstanceCardViewHolder;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/SimpleHolder;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/InstanceCardInfo;", "Landroid/view/View$OnClickListener;", "v", "Landroid/view/View;", "(Landroid/view/View;)V", "actionDispatcher", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "getActionDispatcher", "()Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "setActionDispatcher", "(Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;)V", "colorDot", "kotlin.jvm.PlatformType", "desc", "Landroid/widget/TextView;", "summary", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onClick", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.a */
public final class InstanceCardViewHolder extends SimpleHolder<InstanceCardInfo> implements View.OnClickListener {

    /* renamed from: a */
    public static final Companion f75596a = new Companion(null);

    /* renamed from: b */
    private ActionDispatcher f75597b;

    /* renamed from: c */
    private final View f75598c;

    /* renamed from: d */
    private final TextView f75599d;

    /* renamed from: e */
    private final TextView f75600e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewholder/InstanceCardViewHolder$Companion;", "Lcom/ss/android/lark/calendar/impl/features/recyclerview/HolderMapInfo;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/InstanceCardInfo;", "()V", "ACTION_OPEN_CALENDAR_EVENT", "", "openCalendarEvent", "", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "instance", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.a.a$a */
    public static final class Companion extends HolderMapInfo<InstanceCardInfo> {
        private Companion() {
            super(InstanceCardInfo.class, R.layout.calendar_holder_instance_list_card, InstanceCardViewHolder.class, null, 0, 24, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo109167a(ActionDispatcher aVar, InstanceCardInfo hVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$openCalendarEvent");
            Intrinsics.checkParameterIsNotNull(hVar, "instance");
            return aVar.doAction("ACTION_OPEN_CALENDAR_EVENT", hVar);
        }
    }

    /* renamed from: a */
    public final void mo109165a(ActionDispatcher aVar) {
        this.f75597b = aVar;
    }

    public void onClick(View view) {
        InstanceCardInfo hVar;
        ActionDispatcher aVar;
        if (Intrinsics.areEqual(view, this.itemView) && (hVar = (InstanceCardInfo) mo109155a()) != null && (aVar = this.f75597b) != null) {
            f75596a.mo109167a(aVar, hVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstanceCardViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.f75598c = view.findViewById(R.id.color_dot);
        this.f75599d = (TextView) view.findViewById(R.id.summary);
        this.f75600e = (TextView) view.findViewById(R.id.desc);
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo109156a(InstanceCardInfo hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        super.mo109156a((Object) hVar);
        TextView textView = this.f75599d;
        Intrinsics.checkExpressionValueIsNotNull(textView, "summary");
        textView.setText(hVar.mo109230c());
        TextView textView2 = this.f75600e;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "desc");
        textView2.setText(hVar.mo109232d());
        View view = this.f75598c;
        Intrinsics.checkExpressionValueIsNotNull(view, "colorDot");
        view.setBackground(new RoundRectDrawable(hVar.mo109233e(), C32659l.m125335a((Number) 1), 0, 0, 0, false, 60, null));
        if (hVar.mo109229b()) {
            TextView textView3 = this.f75599d;
            View view2 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
            Context context = view2.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "itemView.context");
            textView3.setTextColor(UDColorUtils.getColor(context, R.color.text_placeholder));
            TextView textView4 = this.f75600e;
            View view3 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
            Context context2 = view3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "itemView.context");
            textView4.setTextColor(UDColorUtils.getColor(context2, R.color.text_placeholder));
            View view4 = this.f75598c;
            Intrinsics.checkExpressionValueIsNotNull(view4, "colorDot");
            view4.setAlpha(0.5f);
            return;
        }
        TextView textView5 = this.f75599d;
        View view5 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view5, "itemView");
        Context context3 = view5.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "itemView.context");
        textView5.setTextColor(UDColorUtils.getColor(context3, R.color.text_title));
        TextView textView6 = this.f75600e;
        View view6 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view6, "itemView");
        Context context4 = view6.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "itemView.context");
        textView6.setTextColor(UDColorUtils.getColor(context4, R.color.text_caption));
        View view7 = this.f75598c;
        Intrinsics.checkExpressionValueIsNotNull(view7, "colorDot");
        view7.setAlpha(1.0f);
    }
}
