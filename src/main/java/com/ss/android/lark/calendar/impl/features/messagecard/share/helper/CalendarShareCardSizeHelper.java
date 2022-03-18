package com.ss.android.lark.calendar.impl.features.messagecard.share.helper;

import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.ZoomLevel;
import com.larksuite.component.universe_design.button.UDButton;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.share.listener.ShareCalendarEventContentHolder;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/share/helper/CalendarShareCardSizeHelper;", "", "()V", "adaptFontZoomLevel", "", "holder", "Lcom/ss/android/lark/calendar/impl/features/messagecard/share/listener/ShareCalendarEventContentHolder;", "updateDetailImageSize", "shareEventHolder", "Lcom/ss/android/lark/calendar/impl/features/messagecard/share/ShareCalendarMessageDetailBinder$ShareCalendarEventContentHolder;", "updateDetailTextSize", "updateImageSize", "updateReplyLayoutModel", "replyContainer", "Lcom/ss/android/lark/calendar/impl/features/messagecard/widget/MessageCardReplyContainer;", "updateTextSize", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.share.a.a */
public final class CalendarShareCardSizeHelper {

    /* renamed from: a */
    public static final CalendarShareCardSizeHelper f82380a = new CalendarShareCardSizeHelper();

    private CalendarShareCardSizeHelper() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122784a(ShareCalendarEventContentHolder shareCalendarEventContentHolder) {
        Intrinsics.checkParameterIsNotNull(shareCalendarEventContentHolder, "holder");
        m122786b(shareCalendarEventContentHolder);
        m122787c(shareCalendarEventContentHolder);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122785a(MessageCardReplyContainer messageCardReplyContainer) {
        Intrinsics.checkParameterIsNotNull(messageCardReplyContainer, "replyContainer");
        ZoomLevel a = LKUIDisplayManager.m91870a();
        if (a == ZoomLevel.LARGE3 || a == ZoomLevel.LARGE4) {
            messageCardReplyContainer.mo117763a(MessageCardReplyContainer.LayoutMode.VERTICAL);
        } else {
            messageCardReplyContainer.mo117763a(MessageCardReplyContainer.LayoutMode.HORIZONTAL);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m122786b(ShareCalendarEventContentHolder shareCalendarEventContentHolder) {
        Intrinsics.checkParameterIsNotNull(shareCalendarEventContentHolder, "shareEventHolder");
        TextView textView = shareCalendarEventContentHolder.mEventSummary;
        Intrinsics.checkExpressionValueIsNotNull(textView, "shareEventHolder.mEventSummary");
        C25649b.m91856a(textView, 16);
        UDButton uDButton = shareCalendarEventContentHolder.mEventAction;
        Intrinsics.checkExpressionValueIsNotNull(uDButton, "shareEventHolder.mEventAction");
        C25649b.m91856a((TextView) uDButton, 14);
        shareCalendarEventContentHolder.mReplyContainer.setReplyTextSize(14);
        TextView textView2 = shareCalendarEventContentHolder.mTimeConflict;
        Intrinsics.checkExpressionValueIsNotNull(textView2, "shareEventHolder.mTimeConflict");
        C25649b.m91856a(textView2, 11);
        TimeShowTextView timeShowTextView = shareCalendarEventContentHolder.mTime;
        Intrinsics.checkExpressionValueIsNotNull(timeShowTextView, "shareEventHolder.mTime");
        C25649b.m91856a((TextView) timeShowTextView, 14);
        TextView textView3 = shareCalendarEventContentHolder.mRepeat;
        Intrinsics.checkExpressionValueIsNotNull(textView3, "shareEventHolder.mRepeat");
        C25649b.m91856a(textView3, 14);
        TextView textView4 = shareCalendarEventContentHolder.mLocation;
        Intrinsics.checkExpressionValueIsNotNull(textView4, "shareEventHolder.mLocation");
        C25649b.m91856a(textView4, 14);
        TextView textView5 = shareCalendarEventContentHolder.mMeetingRoom;
        Intrinsics.checkExpressionValueIsNotNull(textView5, "shareEventHolder.mMeetingRoom");
        C25649b.m91856a(textView5, 14);
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m122787c(ShareCalendarEventContentHolder shareCalendarEventContentHolder) {
        Intrinsics.checkParameterIsNotNull(shareCalendarEventContentHolder, "shareEventHolder");
        ImageView imageView = shareCalendarEventContentHolder.mEventHeaderIcon;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "shareEventHolder.mEventHeaderIcon");
        C25649b.m91853a(imageView, 16);
        ImageView imageView2 = shareCalendarEventContentHolder.mTimeIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "shareEventHolder.mTimeIv");
        C25649b.m91853a(imageView2, 16);
        ImageView imageView3 = shareCalendarEventContentHolder.mRepeatIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView3, "shareEventHolder.mRepeatIv");
        C25649b.m91853a(imageView3, 16);
        ImageView imageView4 = shareCalendarEventContentHolder.mLocationIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView4, "shareEventHolder.mLocationIv");
        C25649b.m91853a(imageView4, 16);
        ImageView imageView5 = shareCalendarEventContentHolder.mMeetingRoomIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView5, "shareEventHolder.mMeetingRoomIv");
        C25649b.m91853a(imageView5, 16);
    }
}
