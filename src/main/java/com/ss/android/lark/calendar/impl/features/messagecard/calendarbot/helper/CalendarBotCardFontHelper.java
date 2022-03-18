package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.helper;

import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.listener.CalendarViewHolder;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/helper/CalendarBotCardFontHelper;", "", "()V", "adaptFontZoomLevel", "", "holder", "Lcom/ss/android/lark/calendar/impl/features/messagecard/calendarbot/listener/CalendarViewHolder;", "updateImageSize", "updateReplyLayoutModel", "replyContainer", "Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer;", "updateTextSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.a.a */
public final class CalendarBotCardFontHelper {

    /* renamed from: a */
    public static final CalendarBotCardFontHelper f82306a = new CalendarBotCardFontHelper();

    private CalendarBotCardFontHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122700a(CalendarViewHolder calendarViewHolder) {
        Intrinsics.checkParameterIsNotNull(calendarViewHolder, "holder");
        m122702b(calendarViewHolder);
        m122703c(calendarViewHolder);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122701a(MessageCardReplyContainer messageCardReplyContainer) {
        Intrinsics.checkParameterIsNotNull(messageCardReplyContainer, "replyContainer");
        ZoomLevel a = LKUIDisplayManager.m91870a();
        if (a == ZoomLevel.LARGE3 || a == ZoomLevel.LARGE4) {
            messageCardReplyContainer.mo117763a(MessageCardReplyContainer.LayoutMode.VERTICAL);
        } else {
            messageCardReplyContainer.mo117763a(MessageCardReplyContainer.LayoutMode.HORIZONTAL);
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m122703c(CalendarViewHolder calendarViewHolder) {
        Intrinsics.checkParameterIsNotNull(calendarViewHolder, "holder");
        ImageView imageView = calendarViewHolder.mBotHeadIcon;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "holder.mBotHeadIcon");
        C25649b.m91853a(imageView, 16);
        ImageView imageView2 = calendarViewHolder.mTimeIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "holder.mTimeIv");
        C25649b.m91853a(imageView2, 16);
        ImageView imageView3 = calendarViewHolder.mRepeatIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "holder.mRepeatIv");
        C25649b.m91853a(imageView3, 16);
        ImageView imageView4 = calendarViewHolder.mLocationIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "holder.mLocationIv");
        C25649b.m91853a(imageView4, 16);
        ImageView imageView5 = calendarViewHolder.mMeetingRoomIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView5, "holder.mMeetingRoomIv");
        C25649b.m91853a(imageView5, 16);
        ImageView imageView6 = calendarViewHolder.mAttendeeIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView6, "holder.mAttendeeIv");
        C25649b.m91853a(imageView6, 16);
        ImageView imageView7 = calendarViewHolder.mDescriptionIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView7, "holder.mDescriptionIv");
        C25649b.m91853a(imageView7, 16);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m122702b(CalendarViewHolder calendarViewHolder) {
        Intrinsics.checkParameterIsNotNull(calendarViewHolder, "holder");
        TextView textView = calendarViewHolder.mEventTitle;
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mEventTitle");
        C25649b.m91856a(textView, 12);
        TextView textView2 = calendarViewHolder.mEventSummary;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mEventSummary");
        C25649b.m91856a(textView2, 16);
        TextView textView3 = calendarViewHolder.mExternalLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mExternalLabel");
        C25649b.m91856a(textView3, 10);
        TextView textView4 = calendarViewHolder.mOptionalAttendee;
        Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.mOptionalAttendee");
        C25649b.m91856a(textView4, 10);
        TimeShowTextView timeShowTextView = calendarViewHolder.mTime;
        Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "holder.mTime");
        C25649b.m91856a((TextView) timeShowTextView, 14);
        TextView textView5 = calendarViewHolder.mTimeDiffLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView5, "holder.mTimeDiffLabel");
        C25649b.m91856a(textView5, 10);
        TextView textView6 = calendarViewHolder.mTimeConflict;
        Intrinsics.checkExpressionValueIsNotNull(textView6, "holder.mTimeConflict");
        C25649b.m91856a(textView6, 11);
        TextView textView7 = calendarViewHolder.mRepeat;
        Intrinsics.checkExpressionValueIsNotNull(textView7, "holder.mRepeat");
        C25649b.m91856a(textView7, 14);
        TextView textView8 = calendarViewHolder.mRepeatDiffLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView8, "holder.mRepeatDiffLabel");
        C25649b.m91856a(textView8, 10);
        TextView textView9 = calendarViewHolder.mLocation;
        Intrinsics.checkExpressionValueIsNotNull(textView9, "holder.mLocation");
        C25649b.m91856a(textView9, 14);
        TextView textView10 = calendarViewHolder.mLocationDiffLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView10, "holder.mLocationDiffLabel");
        C25649b.m91856a(textView10, 10);
        TextView textView11 = calendarViewHolder.mMeetingRoom;
        Intrinsics.checkExpressionValueIsNotNull(textView11, "holder.mMeetingRoom");
        C25649b.m91856a(textView11, 14);
        TextView textView12 = calendarViewHolder.mMeetingRoomDiffLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView12, "holder.mMeetingRoomDiffLabel");
        C25649b.m91856a(textView12, 10);
        LinkEmojiTextView linkEmojiTextView = calendarViewHolder.mAttendees;
        Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView, "holder.mAttendees");
        C25649b.m91856a((TextView) linkEmojiTextView, 14);
        TextView textView13 = calendarViewHolder.mDescription;
        Intrinsics.checkExpressionValueIsNotNull(textView13, "holder.mDescription");
        C25649b.m91856a(textView13, 14);
        TextView textView14 = calendarViewHolder.mDescriptionDiffLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView14, "holder.mDescriptionDiffLabel");
        C25649b.m91856a(textView14, 10);
        calendarViewHolder.mReplyContainer.setReplyTextSize(14);
    }
}
