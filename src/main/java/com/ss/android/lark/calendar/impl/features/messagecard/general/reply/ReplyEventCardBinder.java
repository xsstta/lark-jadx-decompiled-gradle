package com.ss.android.lark.calendar.impl.features.messagecard.general.reply;

import android.app.Activity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.widget.TimeShowTextView;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.CalendarCardContent;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.RSVPCommentCardInfo;
import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalGeneralContent;
import com.ss.android.lark.calendar.impl.features.messagecard.general.helper.CalendarGeneralCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.general.listener.CalendarGeneralViewHolder;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardBinderCommonHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.helper.CalendarMessageCardHelper;
import com.ss.android.lark.calendar.impl.features.messagecard.widget.MessageCardReplyContainer;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.ao;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.linked_emojicon.widget.LinkEmojiTextView;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011J$\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\"\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/messagecard/general/reply/ReplyEventCardBinder;", "", "()V", "TAG", "", "bindMessageData", "", "activity", "Landroid/app/Activity;", "holder", "Lcom/ss/android/lark/calendar/impl/features/messagecard/general/listener/CalendarGeneralViewHolder;", "generalContent", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/content/CalendarInternalGeneralContent;", "getInvitorName", "cardInfo", "Lcom/ss/android/lark/calendar/impl/features/messagecard/entity/RSVPCommentCardInfo;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "updateReplyStatusContainer", UpdateKey.STATUS, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee$Status;", "updateReplyStatusValue", "inviterName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.b.a */
public final class ReplyEventCardBinder {

    /* renamed from: a */
    public static final ReplyEventCardBinder f82345a = new ReplyEventCardBinder();

    private ReplyEventCardBinder() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/general/reply/ReplyEventCardBinder$updateReplyStatusContainer$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "invitorName", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.b.a$b */
    public static final class C32201b implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ CalendarEventAttendee.Status f82349a;

        /* renamed from: b */
        final /* synthetic */ CalendarGeneralViewHolder f82350b;

        /* renamed from: a */
        public void onSuccess(String str) {
            ReplyEventCardBinder.f82345a.mo117745a(this.f82349a, this.f82350b, str);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ReplyEventCardBinder.f82345a.mo117745a(this.f82349a, this.f82350b, "");
        }

        C32201b(CalendarEventAttendee.Status status, CalendarGeneralViewHolder calendarGeneralViewHolder) {
            this.f82349a = status;
            this.f82350b = calendarGeneralViewHolder;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/messagecard/general/reply/ReplyEventCardBinder$getInvitorName$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatterData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.general.b.a$a */
    public static final class C32200a implements IGetDataCallback<AbstractC30026d> {

        /* renamed from: a */
        final /* synthetic */ String f82346a;

        /* renamed from: b */
        final /* synthetic */ String f82347b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f82348c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("ReplyEventCardBinder", C32673y.m125370a(this.f82346a, this.f82347b, errorResult));
            this.f82348c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(AbstractC30026d dVar) {
            Log.m165389i("ReplyEventCardBinder", C32673y.m125373a(this.f82346a, this.f82347b, new String[0]));
            if (dVar == null) {
                this.f82348c.onError(new ErrorResult("chatterData is null"));
            } else {
                this.f82348c.onSuccess(dVar.getLocalizedName());
            }
        }

        C32200a(String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f82346a = str;
            this.f82347b = str2;
            this.f82348c = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public final void mo117744a(RSVPCommentCardInfo rSVPCommentCardInfo, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (rSVPCommentCardInfo == null || TextUtils.isEmpty(rSVPCommentCardInfo.getResponderUserId())) {
            iGetDataCallback.onError(new ErrorResult("data is null"));
            return;
        }
        String responderUserId = rSVPCommentCardInfo.getResponderUserId();
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i("ReplyEventCardBinder", C32673y.m125376b(valueOf, "getChatterById", "inviterUserId: ", responderUserId));
        C30022a.f74882a.chatModuleDependency().mo108225a(responderUserId, new C32200a(valueOf, "getChatterById", iGetDataCallback));
    }

    /* renamed from: a */
    private final void m122743a(CalendarEventAttendee.Status status, CalendarGeneralViewHolder calendarGeneralViewHolder, RSVPCommentCardInfo rSVPCommentCardInfo) {
        if (status == null) {
            View view = calendarGeneralViewHolder.mReplyStateContainer;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.mReplyStateContainer");
            view.setVisibility(8);
            return;
        }
        mo117744a(rSVPCommentCardInfo, new UIGetDataCallback(new C32201b(status, calendarGeneralViewHolder)));
    }

    /* renamed from: a */
    public final void mo117745a(CalendarEventAttendee.Status status, CalendarGeneralViewHolder calendarGeneralViewHolder, String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(calendarGeneralViewHolder, "holder");
        if (status == null) {
            View view = calendarGeneralViewHolder.mReplyStateContainer;
            Intrinsics.checkExpressionValueIsNotNull(view, "holder.mReplyStateContainer");
            view.setVisibility(8);
            return;
        }
        View view2 = calendarGeneralViewHolder.mReplyStateContainer;
        Intrinsics.checkExpressionValueIsNotNull(view2, "holder.mReplyStateContainer");
        view2.setVisibility(0);
        int i = C32202b.f82351a[status.ordinal()];
        if (i == 1) {
            str2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_Acceptedrsvp, "name", str);
        } else if (i == 2) {
            str2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_Rejectrsvp, "name", str);
        } else if (i != 3) {
            View view3 = calendarGeneralViewHolder.mReplyStateContainer;
            Intrinsics.checkExpressionValueIsNotNull(view3, "holder.mReplyStateContainer");
            view3.setVisibility(8);
            str2 = "";
        } else {
            str2 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Detail_Maybersvp, "name", str);
        }
        TextView textView = calendarGeneralViewHolder.mReplyStatus;
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mReplyStatus");
        textView.setText(str2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m122742a(Activity activity, CalendarGeneralViewHolder calendarGeneralViewHolder, CalendarInternalGeneralContent calendarInternalGeneralContent) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(calendarGeneralViewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(calendarInternalGeneralContent, "generalContent");
        CalendarCardContent calendarCardContent = calendarInternalGeneralContent.getCalendarCardContent();
        if (calendarCardContent != null) {
            RSVPCommentCardInfo rSVPCommentCardInfo = calendarInternalGeneralContent.getRSVPCommentCardInfo();
            ReplyOpenDetailActivityClickListener cVar = new ReplyOpenDetailActivityClickListener(calendarCardContent, rSVPCommentCardInfo);
            calendarGeneralViewHolder.f82367a.setOnClickListener(cVar);
            TextView textView = calendarGeneralViewHolder.mEventTitle;
            Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mEventTitle");
            textView.setVisibility(8);
            MessageCardReplyContainer messageCardReplyContainer = calendarGeneralViewHolder.mReplyContainer;
            Intrinsics.checkExpressionValueIsNotNull(messageCardReplyContainer, "holder.mReplyContainer");
            messageCardReplyContainer.setVisibility(8);
            f82345a.m122743a(calendarCardContent.getSelfAttendeeStatus(), calendarGeneralViewHolder, rSVPCommentCardInfo);
            Activity activity2 = activity;
            UDTagsDrawable i = new UDTagsDrawable.Builder(activity2).mo91384a(new UDTagsDrawable.TagModel.Builder(activity2).mo91418a(C32634ae.m125182b(R.string.Calendar_Detail_External)).mo91422c(UDColorUtils.getColor(activity2, R.color.udtoken_tag_text_s_orange)).mo91419b(UDColorUtils.getColor(activity2, R.color.udtoken_tag_bg_orange)).mo91427g()).mo91383a((float) LKUIDisplayManager.m91881c(activity2, 12)).mo91398i();
            if (i != null) {
                TextView textView2 = calendarGeneralViewHolder.mExternalLabel;
                Intrinsics.checkExpressionValueIsNotNull(textView2, "holder.mExternalLabel");
                i.mo91369a(textView2);
            }
            TextView textView3 = calendarGeneralViewHolder.mExternalLabel;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "holder.mExternalLabel");
            boolean isCrossTenant = calendarCardContent.isCrossTenant();
            AbstractC30054s a = CalendarCardHelper.f82294a.mo117525a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CalendarCardHelper.loginDependency");
            CalendarCardBinderCommonHelper.m122631a(textView3, isCrossTenant, a.mo108270b());
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
            CalendarCardBinderCommonHelper.m122629a(textView7, calendarCardContent.getConflictType(), calendarCardContent.getConflictTime(), cVar);
            CalendarGeneralCardHelper bVar2 = CalendarGeneralCardHelper.f82343a;
            ViewGroup viewGroup = calendarGeneralViewHolder.mAttendeeContainer;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "holder.mAttendeeContainer");
            LinkEmojiTextView linkEmojiTextView = calendarGeneralViewHolder.mAttendees;
            Intrinsics.checkExpressionValueIsNotNull(linkEmojiTextView, "holder.mAttendees");
            bVar2.mo117741a(activity2, viewGroup, linkEmojiTextView, calendarCardContent);
            ao.m125225a(calendarGeneralViewHolder.mMeetingRoomContainer, calendarGeneralViewHolder.mMeetingRoom, CalendarGeneralCardHelper.f82343a.mo117740a(calendarCardContent.getMeetingRooms(), calendarCardContent.getMeetingRoomsIsDisabled()));
            ao.m125226a(calendarGeneralViewHolder.mLocationContainer, calendarGeneralViewHolder.mLocation, calendarCardContent.getLocation());
            ao.m125226a(calendarGeneralViewHolder.mRepeatContainer, calendarGeneralViewHolder.mRepeat, CalendarMessageCardHelper.m122674a(calendarCardContent));
            CalendarGeneralCardHelper bVar3 = CalendarGeneralCardHelper.f82343a;
            ViewGroup viewGroup2 = calendarGeneralViewHolder.mDescriptionContainer;
            Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "holder.mDescriptionContainer");
            TextView textView8 = calendarGeneralViewHolder.mDescription;
            Intrinsics.checkExpressionValueIsNotNull(textView8, "holder.mDescription");
            bVar3.mo117742a(viewGroup2, textView8, calendarCardContent.getDescription());
        }
    }
}
