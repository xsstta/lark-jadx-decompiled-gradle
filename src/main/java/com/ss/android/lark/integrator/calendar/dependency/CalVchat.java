package com.ss.android.lark.integrator.calendar.dependency;

import android.content.Context;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.api.entity.CalendarPstnDetailInfo;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai;
import com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest;
import com.ss.android.lark.pb.videoconference.v1.GetAdminSettingsResponse;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.vc.api.IVCApi;
import com.ss.android.lark.vc.api.PstnDetailInfoResponse2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016Jh\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016J\u001c\u0010\u0015\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0018\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0019\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u001b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u001d\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalVchat;", "Lcom/ss/android/lark/calendar/dependency/idependency/IVchatDependency;", "()V", "createVideo", "", "context", "Landroid/content/Context;", "getPstnDetailInfo", "uniqueId", "", "userId", "meetingTitle", "attendeeName", "meetingUrl", "tenantId", "sourceType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;", "meetingTimeStr", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/api/entity/CalendarPstnDetailInfo;", "getPstnDetailPage", "adminSettingsResponse", "Lcom/ss/android/lark/pb/videoconference/v1/GetAdminSettingsResponse;", "joinInterviewVchat", "joinVchat", "title", "joinVideo", "meetingId", "openPreSettingPage", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.ah */
public final class CalVchat implements AbstractC30040ai {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/calendar/dependency/CalVchat$getPstnDetailInfo$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/vc/api/PstnDetailInfoResponse2;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.ah$a */
    public static final class C39198a implements IGetDataCallback<PstnDetailInfoResponse2> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f100481a;

        C39198a(IGetDataCallback iGetDataCallback) {
            this.f100481a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f100481a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(PstnDetailInfoResponse2 eVar) {
            IGetDataCallback iGetDataCallback;
            if (eVar != null && (iGetDataCallback = this.f100481a) != null) {
                iGetDataCallback.onSuccess(new CalendarPstnDetailInfo(eVar.mo196316a(), eVar.mo196317b(), eVar.mo196318c(), eVar.mo196319d()));
            }
        }
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai
    /* renamed from: a */
    public void mo108199a(Context context, String str) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).joinInterviewGroupMeeting(context, str);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai
    /* renamed from: b */
    public void mo108203b(Context context, String str) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).startPreVideoChatSettingActivity(context, str);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai
    /* renamed from: a */
    public void mo108201a(GetAdminSettingsResponse getAdminSettingsResponse, String str) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).showPstnDetail(getAdminSettingsResponse, str);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai
    /* renamed from: a */
    public void mo108200a(Context context, String str, String str2) {
        ((IVCApi) ApiUtils.getApi(IVCApi.class)).joinCalendarGroupMeeting(context, str, str2);
    }

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30040ai
    /* renamed from: a */
    public void mo108202a(String str, String str2, String str3, String str4, String str5, String str6, CalendarEvent.Source source, String str7, IGetDataCallback<CalendarPstnDetailInfo> iGetDataCallback) {
        GetPstnSipFeatureConfigRequest.CalendarType calendarType;
        IVCApi iVCApi = (IVCApi) ApiUtils.getApi(IVCApi.class);
        if (source == CalendarEvent.Source.PEOPLE) {
            calendarType = GetPstnSipFeatureConfigRequest.CalendarType.CALENDAR_TYPE_INTERVIEW;
        } else {
            calendarType = GetPstnSipFeatureConfigRequest.CalendarType.CALENDAR_TYPE_UNKNOWN;
        }
        iVCApi.getPstnDetailInfo(str, str2, str3, str4, str5, str6, calendarType, str7, new C39198a(iGetDataCallback));
    }
}
