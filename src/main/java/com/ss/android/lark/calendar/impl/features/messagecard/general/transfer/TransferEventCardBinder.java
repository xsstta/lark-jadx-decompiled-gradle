package com.ss.android.lark.calendar.impl.features.messagecard.general.transfer;

import android.app.Activity;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.impl.features.messagecard.general.helper.CalendarGeneralCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.general.listener.CalendarGeneralViewHolder;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardBinderCommonHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarMessageCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J(\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/general/transfer/TransferEventCardBinder;", "", "()V", "bindExternalLabel", "", "content", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/CalendarCardContent;", "holder", "Lcom/ss/android/lark/calendar/impl/features/messagecard/general/listener/CalendarGeneralViewHolder;", "bindMessageData", "activity", "Landroid/app/Activity;", "generalContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent;", "isSwitch", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.c.b */
public final class TransferEventCardBinder {

    /* renamed from: a */
    public static final TransferEventCardBinder f82366a = new TransferEventCardBinder();

    private TransferEventCardBinder() {
    }

    /* renamed from: a */
    private final void m122767a(CalendarCardContent calendarCardContent, CalendarGeneralViewHolder calendarGeneralViewHolder) {
        if (calendarCardContent.isCrossTenant()) {
            AbstractC30054s a = CalendarCardHelper.f82294a.mo117525a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarCardHelper.loginDependency");
            if (!a.mo108270b()) {
                TextView textView = calendarGeneralViewHolder.mEventTitle;
                Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mEventTitle");
                View view = calendarGeneralViewHolder.f82367a;
                Intrinsics.checkExpressionValueIsNotNull(view, "holder.holderView");
                textView.setMaxWidth(UIUtils.dp2px(view.getContext(), 225.0f));
                TextView textView2 = calendarGeneralViewHolder.mExternalLabel;
                Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mExternalLabel");
                textView2.setVisibility(0);
                return;
            }
        }
        TextView textView3 = calendarGeneralViewHolder.mExternalLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mExternalLabel");
        textView3.setVisibility(8);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122766a(Activity activity, CalendarGeneralViewHolder calendarGeneralViewHolder, CalendarInternalGeneralContent calendarInternalGeneralContent, boolean z) {
        String localizedName;
        String localizedName2;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(calendarGeneralViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(calendarInternalGeneralContent, "generalContent");
        CalendarCardContent calendarCardContent = calendarInternalGeneralContent.getCalendarCardContent();
        if (calendarCardContent != null) {
            GeneralOpenDetailActivityClickListener aVar = new GeneralOpenDetailActivityClickListener(calendarCardContent);
            calendarGeneralViewHolder.f82367a.setOnClickListener(aVar);
            TextView textView = calendarGeneralViewHolder.mEventTitle;
            Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mEventTitle");
            textView.setVisibility(0);
            View view = calendarGeneralViewHolder.mReplyStateContainer;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.mReplyStateContainer");
            view.setVisibility(8);
            MessageCardReplyContainer messageCardReplyContainer = calendarGeneralViewHolder.mReplyContainer;
            Intrinsics.checkExpressionValueIsNotNull(messageCardReplyContainer, "holder.mReplyContainer");
            messageCardReplyContainer.setVisibility(8);
            String str = "";
            if (z) {
                TextView textView2 = calendarGeneralViewHolder.mEventTitle;
                Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mEventTitle");
                AbstractC30026d sender = calendarCardContent.getSender();
                if (!(sender == null || (localizedName2 = sender.getLocalizedName()) == null)) {
                    str = localizedName2;
                }
                textView2.setText(UIHelper.mustacheFormat((int) R.string.Calendar_Bot_EventTransferredToNewCalendarTitle, "name", str));
            } else {
                TextView textView3 = calendarGeneralViewHolder.mEventTitle;
                Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mEventTitle");
                AbstractC30026d sender2 = calendarCardContent.getSender();
                if (!(sender2 == null || (localizedName = sender2.getLocalizedName()) == null)) {
                    str = localizedName;
                }
                textView3.setText(UIHelper.mustacheFormat((int) R.string.Calendar_Transfer_SuccessTransferBot, "name", str));
            }
            f82366a.m122767a(calendarCardContent, calendarGeneralViewHolder);
            TextView textView4 = calendarGeneralViewHolder.mEventSummary;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.mEventSummary");
            textView4.setText(CalendarCardBinderCommonHelper.m122627a(calendarCardContent.getSummary()));
            TextView textView5 = calendarGeneralViewHolder.mEventSummary;
            Intrinsics.checkExpressionValueIsNotNull(textView5, "holder.mEventSummary");
            TextPaint paint = textView5.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "holder.mEventSummary.paint");
            paint.setFakeBoldText(true);
            CalendarGeneralCardHelper bVar = CalendarGeneralCardHelper.f82343a;
            TimeShowTextView timeShowTextView = calendarGeneralViewHolder.mTime;
            Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "holder.mTime");
            bVar.mo117743a(timeShowTextView, calendarCardContent);
            TextView textView6 = calendarGeneralViewHolder.mOptionalAttendee;
            Intrinsics.checkExpressionValueIsNotNull(textView6, "holder.mOptionalAttendee");
            CalendarCardBinderCommonHelper.m122630a(textView6, calendarCardContent.isOptional());
            TextView textView7 = calendarGeneralViewHolder.mTimeConflict;
            Intrinsics.checkExpressionValueIsNotNull(textView7, "holder.mTimeConflict");
            CalendarCardBinderCommonHelper.m122629a(textView7, calendarCardContent.getConflictType(), calendarCardContent.getConflictTime(), aVar);
            ViewGroup viewGroup = calendarGeneralViewHolder.mAttendeeContainer;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "holder.mAttendeeContainer");
            LinkEmojiTextView linkEmojiTextView = calendarGeneralViewHolder.mAttendees;
            Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView, "holder.mAttendees");
            CalendarGeneralCardHelper.f82343a.mo117741a(activity, viewGroup, linkEmojiTextView, calendarCardContent);
            ao.m125225a(calendarGeneralViewHolder.mMeetingRoomContainer, calendarGeneralViewHolder.mMeetingRoom, CalendarGeneralCardHelper.f82343a.mo117740a(calendarCardContent.getMeetingRooms(), calendarCardContent.getMeetingRoomsIsDisabled()));
            ao.m125226a(calendarGeneralViewHolder.mLocationContainer, calendarGeneralViewHolder.mLocation, calendarCardContent.getLocation());
            ao.m125226a(calendarGeneralViewHolder.mRepeatContainer, calendarGeneralViewHolder.mRepeat, CalendarMessageCardHelper.m122674a(calendarCardContent));
            CalendarGeneralCardHelper bVar2 = CalendarGeneralCardHelper.f82343a;
            ViewGroup viewGroup2 = calendarGeneralViewHolder.mDescriptionContainer;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "holder.mDescriptionContainer");
            TextView textView8 = calendarGeneralViewHolder.mDescription;
            Intrinsics.checkExpressionValueIsNotNull(textView8, "holder.mDescription");
            bVar2.mo117742a(viewGroup2, textView8, calendarCardContent.getDescription());
        }
    }
}
