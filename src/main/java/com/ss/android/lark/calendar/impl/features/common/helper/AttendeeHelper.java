package com.ss.android.lark.calendar.impl.features.common.helper;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.ImageView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/helper/AttendeeHelper;", "", "()V", "isCrossTenant", "", "isGoogleEvent", "isExchangeEvent", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "isGroupHasAllMember", "groupAttendee", "setAttendeeStatusImage", "", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/RSVPStatus;", "statusImageView", "Landroid/widget/ImageView;", "showNotInGroupTipDialog", "context", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.c.a */
public final class AttendeeHelper {

    /* renamed from: a */
    public static final AttendeeHelper f78609a = new AttendeeHelper();

    private AttendeeHelper() {
    }

    /* renamed from: a */
    public final void mo112726a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Detail_GroupHiddedTip)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, (DialogInterface.OnClickListener) null)).messageTextColor(R.color.text_caption)).messageTextSize(14)).show();
    }

    /* renamed from: a */
    public final boolean mo112728a(CalendarEventAttendee calendarEventAttendee) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "groupAttendee");
        List<CalendarEventAttendee> groupMembers = calendarEventAttendee.getGroupMembers();
        if (groupMembers == null || groupMembers.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || calendarEventAttendee.getGroupMembers().size() != calendarEventAttendee.getValidMemberCount()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo112727a(RSVPStatus rSVPStatus, ImageView imageView) {
        Intrinsics.checkParameterIsNotNull(rSVPStatus, UpdateKey.STATUS);
        int i = C31127b.f78610a[rSVPStatus.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_succeed_colorful);
                }
            } else if (i == 3) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_delete_colorful);
                }
            } else if (i == 4) {
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.ud_icon_file_round_unknow_colorful);
                }
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final boolean mo112729a(boolean z, boolean z2, CalendarEventAttendee calendarEventAttendee) {
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        if ((loginDependency != null && loginDependency.mo108270b()) || z || z2) {
            return false;
        }
        if (calendarEventAttendee.isThirdParty()) {
            return true;
        }
        if (calendarEventAttendee.isGroup()) {
            return calendarEventAttendee.getIsCrossTenantGroup();
        }
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "loginDependency");
        return calendarEventAttendee.isOuterUser(loginDependency.mo108271c());
    }
}
