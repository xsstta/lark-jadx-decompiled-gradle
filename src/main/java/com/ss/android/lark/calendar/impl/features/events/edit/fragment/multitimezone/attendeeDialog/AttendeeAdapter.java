package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeDialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.p1507d.C31256c;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.UserAttendeeBaseInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeAdapter$AttendeeViewHolder;", "()V", "attendeeData", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAttendeeList", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "AttendeeViewHolder", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.a */
public final class AttendeeAdapter extends RecyclerView.Adapter<AttendeeViewHolder> {

    /* renamed from: a */
    public static final Companion f80498a = new Companion(null);

    /* renamed from: b */
    private List<UserAttendeeBaseInfo> f80499b = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeAdapter$Companion;", "", "()V", "AVATAR_HEIGHT", "", "AVATAR_WIDTH", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.a$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f80499b.size();
    }

    /* renamed from: a */
    public final void mo115424a(List<UserAttendeeBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80499b = list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeAdapter$AttendeeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeDialog/AttendeeAdapter;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "bind", "", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/UserAttendeeBaseInfo;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a.a$a */
    public final class AttendeeViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AttendeeAdapter f80500a;

        /* renamed from: b */
        private final View f80501b;

        /* renamed from: a */
        public final void mo115425a(UserAttendeeBaseInfo userAttendeeBaseInfo) {
            Intrinsics.checkParameterIsNotNull(userAttendeeBaseInfo, "attendee");
            TextView textView = (TextView) this.f80501b.findViewById(R.id.attendeeNameTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.attendeeNameTv");
            textView.setText(userAttendeeBaseInfo.getBaseLocalDisplayName());
            C31256c.m117135a(this.f80501b.getContext(), (SelectableRoundedImageView) this.f80501b.findViewById(R.id.ivAvatar), 48, 48, userAttendeeBaseInfo.getBaseAvatarKey(), userAttendeeBaseInfo.getBaseAttendeeCalendarId(), userAttendeeBaseInfo.getBaseLocalDisplayName(), true, userAttendeeBaseInfo.getAvatarEntityId());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AttendeeViewHolder(AttendeeAdapter aVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f80500a = aVar;
            this.f80501b = view;
        }
    }

    /* renamed from: a */
    public AttendeeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_dialog_time_zone_attendee, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new AttendeeViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(AttendeeViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo115425a(this.f80499b.get(i));
    }
}
