package com.ss.android.lark.calendar.impl.features.messagecard.general.helper;

import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.general.listener.CalendarGeneralViewHolder;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/general/helper/CalendarGeneralCardFontHelper;", "", "()V", "adaptFontZoomLevel", "", "holder", "Lcom/ss/android/lark/calendar/impl/features/messagecard/general/listener/CalendarGeneralViewHolder;", "updateDetailCardImageSize", "Lcom/ss/android/lark/calendar/impl/features/messagecard/general/CalendarGeneraMessageDetailBinder$CalendarGeneralViewHolder;", "updateDetailCardTextSize", "updateImageSize", "updateTextSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.a.a */
public final class CalendarGeneralCardFontHelper {

    /* renamed from: a */
    public static final CalendarGeneralCardFontHelper f82342a = new CalendarGeneralCardFontHelper();

    private CalendarGeneralCardFontHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122734a(CalendarGeneralViewHolder calendarGeneralViewHolder) {
        Intrinsics.checkParameterIsNotNull(calendarGeneralViewHolder, "holder");
        m122735b(calendarGeneralViewHolder);
        m122736c(calendarGeneralViewHolder);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m122736c(CalendarGeneralViewHolder calendarGeneralViewHolder) {
        Intrinsics.checkParameterIsNotNull(calendarGeneralViewHolder, "holder");
        ImageView imageView = calendarGeneralViewHolder.mBotHeadIcon;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "holder.mBotHeadIcon");
        C25649b.m91853a(imageView, 16);
        ImageView imageView2 = calendarGeneralViewHolder.mTimeIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "holder.mTimeIv");
        C25649b.m91853a(imageView2, 16);
        ImageView imageView3 = calendarGeneralViewHolder.mRepeatIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "holder.mRepeatIv");
        C25649b.m91853a(imageView3, 16);
        ImageView imageView4 = calendarGeneralViewHolder.mLocationIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "holder.mLocationIv");
        C25649b.m91853a(imageView4, 16);
        ImageView imageView5 = calendarGeneralViewHolder.mMeetingRoomIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView5, "holder.mMeetingRoomIv");
        C25649b.m91853a(imageView5, 16);
        ImageView imageView6 = calendarGeneralViewHolder.mAttendeeIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView6, "holder.mAttendeeIv");
        C25649b.m91853a(imageView6, 16);
        ImageView imageView7 = calendarGeneralViewHolder.mDescriptionIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView7, "holder.mDescriptionIv");
        C25649b.m91853a(imageView7, 16);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m122735b(CalendarGeneralViewHolder calendarGeneralViewHolder) {
        Intrinsics.checkParameterIsNotNull(calendarGeneralViewHolder, "holder");
        TextView textView = calendarGeneralViewHolder.mEventTitle;
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mEventTitle");
        C25649b.m91856a(textView, 12);
        TextView textView2 = calendarGeneralViewHolder.mEventSummary;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mEventSummary");
        C25649b.m91856a(textView2, 16);
        TextView textView3 = calendarGeneralViewHolder.mExternalLabel;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mExternalLabel");
        C25649b.m91856a(textView3, 10);
        TextView textView4 = calendarGeneralViewHolder.mOptionalAttendee;
        Intrinsics.checkExpressionValueIsNotNull(textView4, "holder.mOptionalAttendee");
        C25649b.m91856a(textView4, 10);
        TimeShowTextView timeShowTextView = calendarGeneralViewHolder.mTime;
        Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "holder.mTime");
        C25649b.m91856a((TextView) timeShowTextView, 14);
        TextView textView5 = calendarGeneralViewHolder.mTimeConflict;
        Intrinsics.checkExpressionValueIsNotNull(textView5, "holder.mTimeConflict");
        C25649b.m91856a(textView5, 11);
        TextView textView6 = calendarGeneralViewHolder.mRepeat;
        Intrinsics.checkExpressionValueIsNotNull(textView6, "holder.mRepeat");
        C25649b.m91856a(textView6, 14);
        TextView textView7 = calendarGeneralViewHolder.mLocation;
        Intrinsics.checkExpressionValueIsNotNull(textView7, "holder.mLocation");
        C25649b.m91856a(textView7, 14);
        TextView textView8 = calendarGeneralViewHolder.mMeetingRoom;
        Intrinsics.checkExpressionValueIsNotNull(textView8, "holder.mMeetingRoom");
        C25649b.m91856a(textView8, 14);
        LinkEmojiTextView linkEmojiTextView = calendarGeneralViewHolder.mAttendees;
        Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView, "holder.mAttendees");
        C25649b.m91856a((TextView) linkEmojiTextView, 14);
        TextView textView9 = calendarGeneralViewHolder.mDescription;
        Intrinsics.checkExpressionValueIsNotNull(textView9, "holder.mDescription");
        C25649b.m91856a(textView9, 14);
        calendarGeneralViewHolder.mReplyContainer.setReplyTextSize(14);
        TextView textView10 = calendarGeneralViewHolder.mReplyStatus;
        Intrinsics.checkExpressionValueIsNotNull(textView10, "holder.mReplyStatus");
        C25649b.m91856a(textView10, 14);
    }
}
