package com.ss.android.vc.meeting.module.preview.openplatform;

import com.ss.android.vc.entity.response.JoinMeetingEntity;
import com.ss.android.vc.meeting.module.preview.AbstractC62650a;
import com.ss.android.vc.net.request.AbstractC63598b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract;", "Lcom/ss/android/vc/meeting/module/preview/IVCPreviewBaseContract;", "()V", "IModel", "IView", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.preview.c.a */
public final class IVCPreviewOpenPlatformContract implements AbstractC62650a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0004H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J/\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel;", "Lcom/ss/android/vc/meeting/module/preview/IVCPreviewBaseContract$IModel;", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel$Delegate;", "buildModelDelegate", "", "getReserveID", "", "sendRequestWrapper", "audioMute", "", "cameraMute", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/JoinMeetingEntity;", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/ss/android/vc/net/request/IVcGetDataCallback;)V", "startLoadData", "fromUrl", "Delegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.a$a */
    public interface IModel extends AbstractC62650a.AbstractC62651a<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IModel$Delegate;", "Lcom/ss/android/vc/meeting/module/preview/IVCPreviewBaseContract$IModel$Delegate;", "onLoadMeetingInfoSuccess", "", "title", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.preview.c.a$a$a */
        public interface Delegate extends AbstractC62650a.AbstractC62651a.AbstractC62652a {
        }

        /* renamed from: a */
        void mo216605a(Boolean bool, Boolean bool2, AbstractC63598b<JoinMeetingEntity> bVar);

        /* renamed from: c */
        void mo216606c(boolean z);

        /* renamed from: f */
        String mo216607f();

        /* renamed from: g */
        void mo216608g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fJ\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView;", "Lcom/ss/android/vc/meeting/module/preview/IVCPreviewBaseContract$IView;", "Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView$Delegate;", "onLoadMeetingInfoSuccess", "", "title", "", "updateCameraBtn", "micMute", "", "updateMicBtn", "updateSpeakerBtn", "Delegate", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.preview.c.a$b */
    public interface IView extends AbstractC62650a.AbstractC62653b<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/meeting/module/preview/openplatform/IVCPreviewOpenPlatformContract$IView$Delegate;", "Lcom/ss/android/vc/meeting/module/preview/IVCPreviewBaseContract$IView$Delegate;", "updateBtns", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.vc.meeting.module.preview.c.a$b$a */
        public interface Delegate extends AbstractC62650a.AbstractC62653b.AbstractC62654a {
            /* renamed from: e */
            void mo216612e();
        }

        void p_(boolean z);

        void q_(boolean z);

        void r_(boolean z);
    }
}
