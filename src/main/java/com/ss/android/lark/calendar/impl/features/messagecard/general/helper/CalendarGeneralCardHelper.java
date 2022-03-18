package com.ss.android.lark.calendar.impl.features.messagecard.general.helper;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardBinderCommonHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32666r;
import com.ss.android.lark.calendar.impl.utils.RoundBgTag;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ \u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017J\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/general/helper/CalendarGeneralCardHelper;", "", "()V", "bindAttendeeContainer", "", "context", "Landroid/content/Context;", "attendeeContainer", "Landroid/view/ViewGroup;", "attendeesTextView", "Lcom/ss/android/lark/widget/linked_emojicon/widget/LinkEmojiTextView;", "content", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "bindDescriptionContainer", "descriptionContainer", "descriptionTv", "Landroid/widget/TextView;", "descriptionString", "", "getCalendarCardContentTime", "getSpannableMeetingText", "Landroid/text/SpannableStringBuilder;", "meetingRoomList", "", "meetingRoomsIsDisabledList", "", "showTimeInMultiLine", "timeShowTextView", "Lcom/ss/android/lark/calendar/impl/features/events/detail/widget/TimeShowTextView;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.a.b */
public final class CalendarGeneralCardHelper {

    /* renamed from: a */
    public static final CalendarGeneralCardHelper f82343a = new CalendarGeneralCardHelper();

    private CalendarGeneralCardHelper() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "url", "", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.a.b$a */
    public static final class C32199a implements C32666r.C32667a.AbstractC32668a {

        /* renamed from: a */
        final /* synthetic */ TextView f82344a;

        C32199a(TextView textView) {
            this.f82344a = textView;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.C32666r.C32667a.AbstractC32668a
        public final void onClick(String str) {
            C30022a.f74882a.statisticsDependency().mo108184a();
            C30022a.f74882a.browserModuleDependency().mo108211a(this.f82344a.getContext(), str);
        }
    }

    /* renamed from: a */
    private final String m122737a(CalendarCardContent calendarCardContent) {
        String a = C32646c.m125249a(calendarCardContent.getStartTime(), calendarCardContent.getEndTime(), calendarCardContent.isAllDay());
        if (a != null) {
            return a;
        }
        return "";
    }

    /* renamed from: a */
    public final SpannableStringBuilder mo117740a(List<String> list, List<Boolean> list2) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<String> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return spannableStringBuilder;
        }
        int size = list3.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            spannableStringBuilder.append((CharSequence) list.get(i));
            if (list2 != null && list2.get(i).booleanValue()) {
                spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) C32634ae.m125182b(R.string.Calendar_Common_Inactivate));
                spannableStringBuilder.setSpan(new RoundBgTag(C25653b.m91893a(C32634ae.m125178a(R.color.lkui_O500), 0.12f), C32634ae.m125178a(R.color.lkui_O500), 2), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            }
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final void mo117743a(TimeShowTextView timeShowTextView, CalendarCardContent calendarCardContent) {
        Intrinsics.checkParameterIsNotNull(timeShowTextView, "timeShowTextView");
        Intrinsics.checkParameterIsNotNull(calendarCardContent, "content");
        TimeZone timeZone = TimeZone.getDefault();
        if (calendarCardContent.isAllDay()) {
            timeZone = TimeZone.getTimeZone("UTC");
        }
        timeShowTextView.mo114201a(m122737a(calendarCardContent), C26279i.m95157a(calendarCardContent.getStartTime(), calendarCardContent.getEndTime(), timeZone));
        timeShowTextView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo117742a(ViewGroup viewGroup, TextView textView, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(viewGroup, "descriptionContainer");
        Intrinsics.checkParameterIsNotNull(textView, "descriptionTv");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(C32666r.m125357a(str, new C32199a(textView)));
    }

    /* renamed from: a */
    public final void mo117741a(Context context, ViewGroup viewGroup, LinkEmojiTextView linkEmojiTextView, CalendarCardContent calendarCardContent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "attendeeContainer");
        Intrinsics.checkParameterIsNotNull(linkEmojiTextView, "attendeesTextView");
        Intrinsics.checkParameterIsNotNull(calendarCardContent, "content");
        CalendarCardBinderCommonHelper.m122628a(context, viewGroup, linkEmojiTextView, CalendarCardHelper.m122669a(calendarCardContent.getAttendeeList(), calendarCardContent.getChatNames()), calendarCardContent.getAttendeeCount(), calendarCardContent.getSummary(), calendarCardContent.getId());
    }
}
