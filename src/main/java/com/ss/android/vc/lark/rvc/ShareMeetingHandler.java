package com.ss.android.vc.lark.rvc;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoRequest;
import com.ss.android.lark.pb.videoconference.v1.GetMeetingURLInfoResponse;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.dependency.AbstractC60907u;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u001c\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\bH\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/vc/lark/rvc/ShareMeetingHandler;", "Lcom/larksuite/component/webview/container/dto/AbstractInjectJSApiHandler;", "Lcom/ss/android/vc/lark/rvc/ShareMeetingJSModel;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "describeContents", "", "init", "", "extra", "Landroid/os/Bundle;", "onRequest", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/larksuite/component/webview/container/dto/IJSApiRequestCallback;", "shareMeeting", "meetingId", "", "writeToParcel", "flags", "CREATOR", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareMeetingHandler extends AbstractInjectJSApiHandler<ShareMeetingJSModel> {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001d\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/vc/lark/rvc/ShareMeetingHandler$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/vc/lark/rvc/ShareMeetingHandler;", "()V", "TAG", "", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/vc/lark/rvc/ShareMeetingHandler;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.rvc.ShareMeetingHandler$a */
    public static final class CREATOR implements Parcelable.Creator<ShareMeetingHandler> {
        private CREATOR() {
        }

        /* renamed from: a */
        public ShareMeetingHandler[] newArray(int i) {
            return new ShareMeetingHandler[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public ShareMeetingHandler createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new ShareMeetingHandler(parcel);
        }
    }

    public ShareMeetingHandler() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/lark/rvc/ShareMeetingHandler$shareMeeting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/videoconference/v1/GetMeetingURLInfoResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.rvc.ShareMeetingHandler$b */
    public static final class C61178b implements IGetDataCallback<GetMeetingURLInfoResponse> {

        /* renamed from: a */
        final /* synthetic */ String f153229a;

        C61178b(String str) {
            this.f153229a = str;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C60700b.m235864f("ShareMeetingHandler", "[shareMeeting]", "[GET_MEETING_URL_INFO] error " + errorResult);
            C60738ac.m236023a((int) R.string.Lark_RVC_UnableToShareToChat_Toast);
        }

        /* renamed from: a */
        public void onSuccess(GetMeetingURLInfoResponse getMeetingURLInfoResponse) {
            String str;
            Intrinsics.checkParameterIsNotNull(getMeetingURLInfoResponse, "response");
            if (VideoChatModuleDependency.getChatDependency().getLoginChatter() != null) {
                str = VideoChatModuleDependency.getChatDependency().getLoginChatter().getName();
            } else {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("name", str);
            AbstractC60907u larkAppDependency = VideoChatModuleDependency.getLarkAppDependency();
            Intrinsics.checkExpressionValueIsNotNull(larkAppDependency, "VideoChatModuleDependency.getLarkAppDependency()");
            String b = larkAppDependency.mo196409b();
            Intrinsics.checkExpressionValueIsNotNull(b, "VideoChatModuleDependenc…pDependency().larkAppName");
            linkedHashMap.put("appName", b);
            sb.append(UIHelper.mustacheFormat((int) R.string.View_M_InvitedToMeetingNameBraces, linkedHashMap));
            sb.append("\n");
            sb.append(UIHelper.getString(R.string.View_M_MeetingIdColon) + getMeetingURLInfoResponse.meeting_no);
            sb.append("\n");
            if (getMeetingURLInfoResponse.meeting_source.getValue() == VideoChat.MeetingSource.VC_FROM_INTERVIEW.getNumber()) {
                sb.append(UIHelper.getString(R.string.View_N_MeetingTopicColon) + UIHelper.mustacheFormat((int) R.string.View_M_VideoInterviewNameBraces, "name", getMeetingURLInfoResponse.topic));
            } else {
                sb.append(UIHelper.getString(R.string.View_N_MeetingTopicColon) + getMeetingURLInfoResponse.topic);
            }
            sb.append("\n");
            sb.append(UIHelper.getString(R.string.View_N_MeetingLinkColon) + getMeetingURLInfoResponse.meeting_url);
            String sb2 = sb.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb2, "sb.toString()");
            String str2 = sb2;
            if (!TextUtils.isEmpty(str2)) {
                Context a = ar.m236694a();
                Object systemService = a.getSystemService("clipboard");
                if (systemService != null) {
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("meetingUrl", str2));
                    C60738ac.m236029a(a.getString(R.string.View_M_LinkCopied));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
                }
            }
            VideoChatModule.getDependency().goShareVideoMeeting(ar.m236694a(), this.f153229a, sb2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/pb/videoconference/v1/GetMeetingURLInfoResponse;", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.rvc.ShareMeetingHandler$c */
    public static final class C61179c<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C61179c f153230a = new C61179c();

        C61179c() {
        }

        /* renamed from: a */
        public final GetMeetingURLInfoResponse parse(byte[] bArr) {
            return GetMeetingURLInfoResponse.ADAPTER.decode(bArr);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareMeetingHandler(Parcel parcel) {
        super(parcel);
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    /* renamed from: a */
    public final void mo211534a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        if (VideoChatModuleDependency.getFeatureGatingDependency().mo196393a("byteview.meeting.android.copymeetinglink")) {
            SdkSender.asynSendRequestNonWrap(Command.GET_MEETING_URL_INFO, new GetMeetingURLInfoRequest.C50657a().mo175290a(str), new C61178b(str), C61179c.f153230a);
            return;
        }
        VideoChatModule.getDependency().goShareVideoMeeting(ar.m236694a(), str, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(ShareMeetingJSModel shareMeetingJSModel, AbstractC25832c cVar) {
        if (shareMeetingJSModel != null) {
            mo211534a(shareMeetingJSModel.getMeetingId());
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        super.writeToParcel(parcel, i);
    }
}
