package com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.ChosenMeetingRoomModel;
import com.ss.android.lark.calendar.impl.p1436a.C30070d;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.an;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomChosenBinding;", "(Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomChosenBinding;)V", "getBinding", "()Lcom/ss/android/lark/calendar/impl/databinding/ItemEventMeetingRoomChosenBinding;", "deleteResourceAction", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;", "getDeleteResourceAction", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;", "setDeleteResourceAction", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;)V", "bindData", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/ChosenMeetingRoomModel;", "Companion", "IChosenResourceAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.b */
public final class ChosenMeetingRoomViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public static final Companion f81783a = new Companion(null);

    /* renamed from: b */
    private IChosenResourceAction f81784b;

    /* renamed from: c */
    private final C30070d f81785c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;", "", "onDeleteIconClicked", "", "deleteResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.b$b */
    public interface IChosenResourceAction {
        /* renamed from: a */
        void mo116704a(CalendarEventAttendee calendarEventAttendee);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder;", "parent", "Landroid/view/ViewGroup;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ChosenMeetingRoomViewHolder mo116725a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            C30070d a = C30070d.m111273a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(a, "ItemEventMeetingRoomChos….context), parent, false)");
            return new ChosenMeetingRoomViewHolder(a);
        }
    }

    /* renamed from: a */
    public final IChosenResourceAction mo116723a() {
        return this.f81784b;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$bindData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.a.b$c */
    public static final class View$OnClickListenerC31994c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChosenMeetingRoomViewHolder f81786a;

        /* renamed from: b */
        final /* synthetic */ ChosenMeetingRoomModel f81787b;

        View$OnClickListenerC31994c(ChosenMeetingRoomViewHolder bVar, ChosenMeetingRoomModel bVar2) {
            this.f81786a = bVar;
            this.f81787b = bVar2;
        }

        public final void onClick(View view) {
            IChosenResourceAction a = this.f81786a.mo116723a();
            if (a != null) {
                a.mo116704a(this.f81787b.mo116794e());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChosenMeetingRoomViewHolder(C30070d dVar) {
        super(dVar.mo108416a());
        Intrinsics.checkParameterIsNotNull(dVar, "binding");
        this.f81785c = dVar;
    }

    /* renamed from: a */
    public final void mo116724a(ChosenMeetingRoomModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "model");
        TextView textView = this.f81785c.f74956e;
        Intrinsics.checkExpressionValueIsNotNull(textView, "binding.tvEventBoardroomName");
        textView.setText(bVar.mo116790b());
        LinearLayout linearLayout = this.f81785c.f74954c;
        an.m125213a(linearLayout, bVar.mo116792c());
        linearLayout.setOnClickListener(new View$OnClickListenerC31994c(this, bVar));
        ImageView imageView = this.f81785c.f74953b;
        Context context = imageView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        Context context2 = imageView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        imageView.setBackground(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_room_outlined, UDColorUtils.getColor(context2, R.color.icon_n3)));
        int i = 0;
        imageView.setVisibility(0);
        TextView textView2 = this.f81785c.f74955d;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "binding.tvDisabledIcon");
        if (!bVar.mo116793d()) {
            i = 8;
        }
        textView2.setVisibility(i);
    }
}
