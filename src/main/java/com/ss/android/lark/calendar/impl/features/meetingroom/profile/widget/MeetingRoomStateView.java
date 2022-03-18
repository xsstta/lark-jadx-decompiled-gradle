package com.ss.android.lark.calendar.impl.features.meetingroom.profile.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\nH\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/widget/MeetingRoomStateView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setState", "", "state", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;", "updateMeetingRoomStateSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MeetingRoomStateView extends LinearLayout {

    /* renamed from: a */
    private HashMap f82192a;

    public MeetingRoomStateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MeetingRoomStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo117328a(int i) {
        if (this.f82192a == null) {
            this.f82192a = new HashMap();
        }
        View view = (View) this.f82192a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f82192a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m122345a() {
        AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "CalendarDependencyHolder…ency.languageDependency()");
        if (languageDependency.mo108250c()) {
            ((TextView) mo117328a(R.id.meetingRoomStateTv)).setTextSize(1, 10.0f);
        } else {
            ((TextView) mo117328a(R.id.meetingRoomStateTv)).setTextSize(1, 12.0f);
        }
    }

    public final void setState(MeetingRoomStatus meetingRoomStatus) {
        Drawable drawable;
        Drawable drawable2;
        String str;
        Intrinsics.checkParameterIsNotNull(meetingRoomStatus, "state");
        Drawable d = C32634ae.m125184d(R.drawable.bg_calendar_meeting_room_state);
        if (d != null) {
            drawable = d.mutate();
        } else {
            drawable = null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        Drawable d2 = C32634ae.m125184d(R.drawable.bg_calendar_meeting_room_text_state);
        if (d2 != null) {
            drawable2 = d2.mutate();
        } else {
            drawable2 = null;
        }
        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable2;
        Integer num = null;
        Drawable drawable3 = null;
        int i = C32152a.f82193a[meetingRoomStatus.ordinal()];
        if (i == 1) {
            num = Integer.valueOf(C32634ae.m125178a(R.color.ud_G600));
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            drawable3 = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_room_outlined, UDColorUtils.getColor(context2, R.color.ud_G400));
            if (gradientDrawable != null) {
                gradientDrawable.setColor(C32634ae.m125178a(R.color.ud_G50));
            }
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(C32634ae.m125178a(R.color.ud_G100));
            }
            str = C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomCanBeReserve);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(R.stri…_MeetingRoomCanBeReserve)");
        } else if (i == 2) {
            num = Integer.valueOf(C32634ae.m125178a(R.color.text_caption));
            Context context3 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "context");
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            drawable3 = UDIconUtils.getIconDrawable(context3, (int) R.drawable.ud_icon_room_unavailable_outlined, UDColorUtils.getColor(context4, R.color.icon_disable));
            if (gradientDrawable != null) {
                gradientDrawable.setColor(C32634ae.m125178a(R.color.ud_N100));
            }
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(C32634ae.m125178a(R.color.ud_N300));
            }
            str = C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomCantReserve);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(R.stri…t_MeetingRoomCantReserve)");
        } else if (i != 3) {
            str = "";
        } else {
            num = Integer.valueOf(C32634ae.m125178a(R.color.ud_R600));
            Context context5 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context5, "context");
            Context context6 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context6, "context");
            drawable3 = UDIconUtils.getIconDrawable(context5, (int) R.drawable.ud_icon_room_outlined, UDColorUtils.getColor(context6, R.color.ud_R400));
            if (gradientDrawable != null) {
                gradientDrawable.setColor(C32634ae.m125178a(R.color.ud_R50));
            }
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColor(C32634ae.m125178a(R.color.ud_R100));
            }
            str = C32634ae.m125182b(R.string.Calendar_Edit_MeetingRoomReserved);
            Intrinsics.checkExpressionValueIsNotNull(str, "ResUtil.getString(R.stri…Edit_MeetingRoomReserved)");
        }
        if (gradientDrawable != null) {
            setBackground(gradientDrawable);
        }
        if (drawable3 != null) {
            ((ImageView) mo117328a(R.id.meetingRoomIv)).setImageDrawable(drawable3);
        }
        if (gradientDrawable2 != null) {
            TextView textView = (TextView) mo117328a(R.id.meetingRoomStateTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "meetingRoomStateTv");
            textView.setBackground(gradientDrawable2);
        }
        if (num != null) {
            ((TextView) mo117328a(R.id.meetingRoomStateTv)).setTextColor(num.intValue());
        }
        TextView textView2 = (TextView) mo117328a(R.id.meetingRoomStateTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "meetingRoomStateTv");
        textView2.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MeetingRoomStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.layout_meeting_room_state, this);
        m122345a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MeetingRoomStateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
