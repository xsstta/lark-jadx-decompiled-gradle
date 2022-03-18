package com.ss.android.lark.calendar.impl.rustadapter.service;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.calendars.BindingExchangeAccountRequest;
import com.ss.android.lark.pb.calendars.BindingExchangeAccountResponse;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.pb.videochat.CalendarVideoChatStatus;
import com.ss.android.lark.pb.videochat.GetCalendarVchatStatusRequest;
import com.ss.android.lark.pb.videochat.GetCalendarVchatStatusResponse;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nH\u0007J4\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarServerService;", "", "()V", "getCalendarVchatStatusRequest", "", "uniqueId", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent$Source;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/videochat/CalendarVideoChatStatus;", "loginExchange", "account", "", "password", "url", "Lcom/ss/android/lark/pb/calendars/BindingExchangeAccountResponse$State;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.d */
public final class CalendarServerService {

    /* renamed from: a */
    public static final CalendarServerService f83525a = new CalendarServerService();

    private CalendarServerService() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/videochat/CalendarVideoChatStatus;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.d$a */
    static final class C32581a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C32581a f83526a = new C32581a();

        C32581a() {
        }

        /* renamed from: a */
        public final CalendarVideoChatStatus parse(byte[] bArr) {
            GetCalendarVchatStatusResponse decode = GetCalendarVchatStatusResponse.ADAPTER.decode(bArr);
            if (decode != null) {
                return decode.mvideo_chat_status;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/calendars/BindingExchangeAccountResponse$State;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.rustadapter.c.d$b */
    public static final class C32582b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C32582b f83527a = new C32582b();

        C32582b() {
        }

        /* renamed from: a */
        public final BindingExchangeAccountResponse.State parse(byte[] bArr) {
            return BindingExchangeAccountResponse.ADAPTER.decode(bArr).mresp_state;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124812a(long j, CalendarEvent.Source source, IGetDataCallback<CalendarVideoChatStatus> iGetDataCallback) {
        Command command;
        Intrinsics.checkParameterIsNotNull(source, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        GetCalendarVchatStatusRequest.C50314a a = new GetCalendarVchatStatusRequest.C50314a().mo174507a(Long.valueOf(j));
        if (CalendarEvent.Source.PEOPLE == source) {
            command = Command.GET_INTERVIEW_VCHAT_STATUS;
        } else {
            command = Command.GET_CALENDAR_VCHAT_STATUS;
        }
        SdkSender.sendPassThroughRequest(command, a, iGetDataCallback, C32581a.f83526a);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m124813a(String str, String str2, String str3, IGetDataCallback<BindingExchangeAccountResponse.State> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        SdkSender.sendPassThroughRequest(Command.BINDING_EXCHANGE_ACCOUNT, new BindingExchangeAccountRequest.C49566a().mo172845b(str).mo172846c(str2).mo172843a(str3), iGetDataCallback, C32582b.f83527a);
    }
}
