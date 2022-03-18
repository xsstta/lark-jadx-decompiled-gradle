package com.ss.android.vc.net.push;

import com.ss.android.lark.sdk.C53248k;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import com.ss.android.vcxp.annotation.XSingleton;

public class PushListeners {

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class FullVCLobbyParticipantsListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$FullVCLobbyParticipantsListener$a */
        public static class C63536a {

            /* renamed from: a */
            public static FullVCLobbyParticipantsListener f160530a = new FullVCLobbyParticipantsListener();
        }

        private FullVCLobbyParticipantsListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static FullVCLobbyParticipantsListener m248980a() {
            return C63536a.f160530a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219778w(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class GrootCellsListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$GrootCellsListener$a */
        public static class C63537a {

            /* renamed from: a */
            public static GrootCellsListener f160531a = new GrootCellsListener();
        }

        private GrootCellsListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static GrootCellsListener m248981a() {
            return C63537a.f160531a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219759f(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class GrootChannelStatusListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$GrootChannelStatusListener$a */
        public static class C63538a {

            /* renamed from: a */
            public static GrootChannelStatusListener f160532a = new GrootChannelStatusListener();
        }

        private GrootChannelStatusListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static GrootChannelStatusListener m248982a() {
            return C63538a.f160532a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219758e(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class MeetingChangedInfoListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$MeetingChangedInfoListener$a */
        public static class C63539a {

            /* renamed from: a */
            public static MeetingChangedInfoListener f160533a = new MeetingChangedInfoListener();
        }

        private MeetingChangedInfoListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static MeetingChangedInfoListener m248983a() {
            return C63539a.f160533a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219757d(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class MeetingInfoListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$MeetingInfoListener$a */
        public static class C63540a {

            /* renamed from: a */
            public static MeetingInfoListener f160534a = new MeetingInfoListener();
        }

        private MeetingInfoListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static MeetingInfoListener m248984a() {
            return C63540a.f160534a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219754b(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class MeetingParticipantChangeListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$MeetingParticipantChangeListener$a */
        public static class C63541a {

            /* renamed from: a */
            public static MeetingParticipantChangeListener f160535a = new MeetingParticipantChangeListener();
        }

        private MeetingParticipantChangeListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static MeetingParticipantChangeListener m248985a() {
            return C63541a.f160535a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219731a(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class UpdateCallsListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$UpdateCallsListener$a */
        public static class C63542a {

            /* renamed from: a */
            public static UpdateCallsListener f160536a = new UpdateCallsListener();
        }

        private UpdateCallsListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static UpdateCallsListener m248986a() {
            return C63542a.f160536a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219771r(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class UpdateHistoryMeetingsListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$UpdateHistoryMeetingsListener$a */
        public static class C63543a {

            /* renamed from: a */
            public static UpdateHistoryMeetingsListener f160537a = new UpdateHistoryMeetingsListener();
        }

        private UpdateHistoryMeetingsListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static UpdateHistoryMeetingsListener m248987a() {
            return C63543a.f160537a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219770q(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class UpdateUpcomingEventsListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$UpdateUpcomingEventsListener$a */
        public static class C63544a {

            /* renamed from: a */
            public static UpdateUpcomingEventsListener f160538a = new UpdateUpcomingEventsListener();
        }

        private UpdateUpcomingEventsListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static UpdateUpcomingEventsListener m248988a() {
            return C63544a.f160538a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219769p(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static final class VCEnterprisePhoneListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VCEnterprisePhoneListener$a */
        public static class C63545a {

            /* renamed from: a */
            public static VCEnterprisePhoneListener f160539a = new VCEnterprisePhoneListener();
        }

        private VCEnterprisePhoneListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VCEnterprisePhoneListener m248989a() {
            return C63545a.f160539a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219761h(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VCTabMissedCallListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VCTabMissedCallListener$a */
        public static class C63546a {

            /* renamed from: a */
            public static VCTabMissedCallListener f160540a = new VCTabMissedCallListener();
        }

        private VCTabMissedCallListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VCTabMissedCallListener m248990a() {
            return C63546a.f160540a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219760g(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static final class VCVirtualBackgroundListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VCVirtualBackgroundListener$a */
        public static class C63547a {

            /* renamed from: a */
            public static VCVirtualBackgroundListener f160541a = new VCVirtualBackgroundListener();
        }

        private VCVirtualBackgroundListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VCVirtualBackgroundListener m248991a() {
            return C63547a.f160541a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219779x(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VcManagerNotifyListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VcManagerNotifyListener$a */
        public static class C63548a {

            /* renamed from: a */
            public static VcManagerNotifyListener f160542a = new VcManagerNotifyListener();
        }

        private VcManagerNotifyListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VcManagerNotifyListener m248992a() {
            return C63548a.f160542a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219776u(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VcManagerResultListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VcManagerResultListener$a */
        public static class C63549a {

            /* renamed from: a */
            public static VcManagerResultListener f160543a = new VcManagerResultListener();
        }

        private VcManagerResultListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VcManagerResultListener m248993a() {
            return C63549a.f160543a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219777v(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatCombinedInfoListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatCombinedInfoListener$a */
        public static class C63550a {

            /* renamed from: a */
            public static VideoChatCombinedInfoListener f160544a = new VideoChatCombinedInfoListener();
        }

        private VideoChatCombinedInfoListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatCombinedInfoListener m248994a() {
            return C63550a.f160544a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219766m(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatExtraInfoListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatExtraInfoListener$a */
        public static class C63551a {

            /* renamed from: a */
            public static VideoChatExtraInfoListener f160545a = new VideoChatExtraInfoListener();
        }

        private VideoChatExtraInfoListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatExtraInfoListener m248995a() {
            return C63551a.f160545a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219765l(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatInteractionMessagesListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatInteractionMessagesListener$a */
        public static class C63552a {

            /* renamed from: a */
            public static VideoChatInteractionMessagesListener f160546a = new VideoChatInteractionMessagesListener();
        }

        private VideoChatInteractionMessagesListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatInteractionMessagesListener m248996a() {
            return C63552a.f160546a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219775t(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatListener$a */
        public static class C63553a {

            /* renamed from: a */
            public static VideoChatListener f160547a = new VideoChatListener();
        }

        private VideoChatListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatListener m248997a() {
            return C63553a.f160547a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219762i(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static final class VideoChatMeetingJoinStatusListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatMeetingJoinStatusListener$a */
        public static class C63554a {

            /* renamed from: a */
            public static VideoChatMeetingJoinStatusListener f160548a = new VideoChatMeetingJoinStatusListener();
        }

        private VideoChatMeetingJoinStatusListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatMeetingJoinStatusListener m248998a() {
            return C63554a.f160548a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219756c(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatNoticeListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatNoticeListener$a */
        public static class C63555a {

            /* renamed from: a */
            public static VideoChatNoticeListener f160549a = new VideoChatNoticeListener();
        }

        private VideoChatNoticeListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatNoticeListener m248999a() {
            return C63555a.f160549a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219763j(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatNoticeUpdateListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatNoticeUpdateListener$a */
        public static class C63556a {

            /* renamed from: a */
            public static VideoChatNoticeUpdateListener f160550a = new VideoChatNoticeUpdateListener();
        }

        private VideoChatNoticeUpdateListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatNoticeUpdateListener m249000a() {
            return C63556a.f160550a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219767n(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatPromptListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatPromptListener$a */
        public static class C63557a {

            /* renamed from: a */
            public static VideoChatPromptListener f160551a = new VideoChatPromptListener();
        }

        private VideoChatPromptListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatPromptListener m249001a() {
            return C63557a.f160551a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219774s(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatResetHeartbeatListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatResetHeartbeatListener$a */
        public static class C63558a {

            /* renamed from: a */
            public static VideoChatResetHeartbeatListener f160552a = new VideoChatResetHeartbeatListener();
        }

        private VideoChatResetHeartbeatListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatResetHeartbeatListener m249002a() {
            return C63558a.f160552a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219764k(bArr, str, z, z2);
        }
    }

    @XClass(isSingleton = true, runOnProcess = XProcess.VC)
    public static class VideoChatStatusListener implements C53248k.AbstractC53250a {

        /* access modifiers changed from: private */
        /* renamed from: com.ss.android.vc.net.push.PushListeners$VideoChatStatusListener$a */
        public static class C63559a {

            /* renamed from: a */
            public static VideoChatStatusListener f160553a = new VideoChatStatusListener();
        }

        private VideoChatStatusListener() {
        }

        @XSingleton
        /* renamed from: a */
        public static VideoChatStatusListener m249003a() {
            return C63559a.f160553a;
        }

        @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
        @XMethod
        public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
            VideoChatPush.m249004a().mo219768o(bArr, str, z, z2);
        }
    }
}
