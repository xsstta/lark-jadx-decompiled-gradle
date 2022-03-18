package com.ss.android.vc.service;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.C60979m;
import com.ss.android.vc.entity.response.IDTypeEntity;
import com.ss.android.vc.entity.response.ReservationInfoEntity;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XProcess;

@XClass(runOnProcess = XProcess.VC)
public interface IVideoChatService {

    /* renamed from: com.ss.android.vc.service.IVideoChatService$a */
    public interface AbstractC63626a {
        void onError(VCLaunchError vCLaunchError);
    }

    /* renamed from: com.ss.android.vc.service.IVideoChatService$b */
    public interface AbstractC63627b {
        /* renamed from: a */
        void mo197025a();

        /* renamed from: a */
        void mo197026a(VCLaunchError vCLaunchError);
    }

    /* renamed from: a */
    void mo220072a(Context context, OpenChatter openChatter, AbstractC63627b bVar);

    /* renamed from: a */
    void mo220073a(Context context, String str, String str2);

    /* renamed from: a */
    void mo220074a(OpenChatter openChatter, String str, String str2);

    /* renamed from: a */
    void mo220075a(OpenChatter openChatter, String str, String str2, boolean z, boolean z2, AbstractC63626a aVar);

    /* renamed from: a */
    void mo220076a(VideoChatCalleeType videoChatCalleeType, OpenChatter openChatter, ReservationInfoEntity reservationInfoEntity, String str, String str2, boolean z, boolean z2, AbstractC63626a aVar);

    /* renamed from: a */
    void mo220077a(String str, IDTypeEntity iDTypeEntity, IGetDataCallback<C60979m> iGetDataCallback);

    /* renamed from: a */
    void mo220078a(String str, String str2);

    /* renamed from: a */
    void mo220079a(boolean z);

    /* renamed from: a */
    boolean mo220080a();

    void asyncCheckAndInit(VideoChatService.OnInitFinishListener onInitFinishListener);

    /* renamed from: b */
    void mo220082b();

    /* renamed from: c */
    boolean mo220083c();

    void checkAndInit();

    void dismissLoadingDialog();

    void interruptFloatLive();

    boolean isLiveInFloat();

    boolean isOngoing(boolean z);

    boolean isRinging();

    boolean isVCUrl(String str);

    void joinVideoMeeting(Context context, String str, String str2, String str3, VideoChat.VendorType vendorType);

    void launchVideoMeeting(Context context, String str, String str2, IDTypeEntity iDTypeEntity, String str3, String str4, String str5, VideoChat.VendorType vendorType);

    void notifyVoipOnCall();

    void openJoinMeetingPage(Context context, String str, String str2);

    void openVCUrl(Context context, String str);

    void otherOpenCamera();

    void showLoadingDialog(Context context, String str);

    void unInit();
}
