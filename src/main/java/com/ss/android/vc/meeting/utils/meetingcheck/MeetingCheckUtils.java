package com.ss.android.vc.meeting.utils.meetingcheck;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.C25647t;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.ui.dialog.ILKUIGlobalDialog;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.common.p3083e.C60785x;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.an;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.response.JoinMeetingPreCheckEntity;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.preview.interview.MeetingPreviewInterviewFragment;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XObservable;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.impl.VideoChatService;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.al;
import com.ss.android.vc.statistics.event.ao;
import com.ss.android.vc.statistics.event.cb;
import com.ss.android.vc.statistics.p3180a.C63693e;
import com.ss.android.vc.statistics.p3180a.C63697g;
import com.ss.android.vcxp.C63791b;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import com.ss.android.vcxp.annotation.XProcess;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.p3457e.C68296b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@XClass(isStatic = true, runOnProcess = XProcess.VC)
public class MeetingCheckUtils {

    /* renamed from: a */
    public static final ArrayList<String> f160441a = new ArrayList<>();

    /* renamed from: b */
    public static WeakReference<ILKUIGlobalDialog> f160442b;

    /* renamed from: c */
    public static WeakReference<DialogC25637f> f160443c;

    /* renamed from: d */
    private static int f160444d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface JoinType {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m248884a(MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue()) {
            return m248905d();
        }
        C63693e.m249689e();
        C63697g.m249707e();
        return Observable.just(new MeetingCheckData(false, null, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m248883a(Context context, String str, String str2, MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue()) {
            return m248880a(context, str, str2);
        }
        C63693e.m249689e();
        C63697g.m249707e();
        return Observable.just(new MeetingCheckData(false, null, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m248885a(Boolean bool, Context context, String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, String str2, boolean z, String str3, String str4, boolean z2, MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue() && bool.booleanValue()) {
            return m248878a(context, str, joinMeetingCheckIDType, str2, z, str3, str4, z2, bVar);
        }
        if (!bVar.mo219661a().booleanValue()) {
            C63693e.m249689e();
            C63697g.m249707e();
        }
        return Observable.just(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m248882a(Context context, int i, String str, String str2, MeetingCheckData bVar) throws Exception {
        if (bVar.mo219661a().booleanValue()) {
            return m248875a(context, i, bVar, str, str2);
        }
        C63693e.m249689e();
        C63697g.m249707e();
        VideoChatService.m249602d().mo220190k();
        return Observable.just(bVar);
    }

    /* renamed from: a */
    public static void m248887a() {
        ILKUIGlobalDialog cVar;
        DialogC25637f fVar;
        try {
            WeakReference<DialogC25637f> weakReference = f160443c;
            if (!(weakReference == null || (fVar = weakReference.get()) == null || !fVar.isShowing())) {
                fVar.dismiss();
            }
            WeakReference<ILKUIGlobalDialog> weakReference2 = f160442b;
            if (weakReference2 != null && (cVar = weakReference2.get()) != null && cVar.mo89213b()) {
                cVar.mo89212a();
            }
        } catch (Exception e) {
            C60775q.m236136a(e.getMessage());
        }
    }

    /* renamed from: a */
    public static Observable<MeetingCheckData> m248881a(JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, int i) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCheckUtils:recordFloatCheck:stopPodCasting");
        if (VideoChatModuleDependency.getMinutesDependency().mo196442d()) {
            VideoChatModuleDependency.getMinutesDependency().mo196443e();
        }
        TimeConsumeUtils.m248928a(a);
        return Observable.create(new ObservableOnSubscribe(i) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$aU2G2LBtxy38FVyWHNkEb8dbWI */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                MeetingCheckUtils.m248895a(JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.this, this.f$1, observableEmitter);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248895a(JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, int i, ObservableEmitter observableEmitter) throws Exception {
        int i2;
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCheckUtils:recordFloatCheck:emit");
        if (isRecordInFloat()) {
            C63697g.m249707e();
            C63693e.m249689e();
            JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType2 = JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.CALL_TARGET_USER;
            int i3 = R.string.View_G_StartMeeting;
            if (joinMeetingCheckIDType == joinMeetingCheckIDType2) {
                i2 = R.string.View_G_RecordingWillStopIfStartCall;
            } else {
                i2 = i == 0 ? R.string.View_G_RecordingWillStopIfStartMeeting : R.string.View_G_StopRecordingToJoinMeeting;
                if (i != 0) {
                    i3 = R.string.View_G_Join;
                }
            }
            Context c = VCAppLifeCycle.m236256c();
            if (c == null) {
                c = ar.m236694a();
            }
            C25639g tVar = C63791b.m250468b() ? new C25647t(c) : new C25639g(c);
            new AtomicBoolean(false);
            tVar.mo89254m(i2).mo89225a(R.id.lkui_dialog_btn_left, UIHelper.getString(R.string.View_G_CancelButton), $$Lambda$MeetingCheckUtils$LBKcungBpzfq18xmZH8B6RgiRzw.INSTANCE).mo89224a(R.id.lkui_dialog_btn_right, i3, new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$vWavfaeXwNmOVYxYdEN627Y */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    MeetingCheckUtils.m248897a(ObservableEmitter.this, dialogInterface, i);
                }
            }).mo89247e(false);
            if (c instanceof Application) {
                tVar.mo89244d();
            } else if (c instanceof Activity) {
                C26171w.m94675a(new Runnable() {
                    /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$pZTU9rcss_Pt9rS00lOaFicP6Y */

                    public final void run() {
                        C25639g.this.mo89239c();
                    }
                });
            }
        } else {
            observableEmitter.onNext(new MeetingCheckData(true, null, null));
            observableEmitter.onComplete();
            TimeConsumeUtils.m248928a(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248897a(ObservableEmitter observableEmitter, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        interruptRecord();
        observableEmitter.onNext(new MeetingCheckData(true, null, null));
        observableEmitter.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248896a(final ObservableEmitter observableEmitter) throws Exception {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCheckUtils:liveInFloatCheck");
        if (isLiveInFloat()) {
            C63697g.m249707e();
            C63693e.m249689e();
            VCDialogUtils.m236174a((int) R.string.View_G_WatchingLivestream, 2, UIHelper.getString(R.string.View_G_WatchingLivestreamInfo), (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils.DialogInterface$OnClickListenerC635041 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    cb.m250253a("cancel");
                    observableEmitter.onNext(new MeetingCheckData(false, null, null));
                    observableEmitter.onComplete();
                }
            }, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils.DialogInterface$OnClickListenerC635052 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    cb.m250253a("confirm");
                    MeetingCheckUtils.interruptFloatLive();
                    observableEmitter.onNext(new MeetingCheckData(true, null, null));
                    observableEmitter.onComplete();
                }
            }, true);
            return;
        }
        observableEmitter.onNext(new MeetingCheckData(true, null, null));
        observableEmitter.onComplete();
        TimeConsumeUtils.m248928a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248891a(Context context, String str, String str2, ObservableEmitter observableEmitter) throws Exception {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCheckUtils:localCallingOrNetworkCheck");
        C60700b.m235851b("MeetingCheckUtils", "[localCallingOrNetworkCheck]", "check calling or ongoing");
        if (context != null && !C60785x.m236238b()) {
            C60738ac.m236023a((int) R.string.View_G_NoConnection);
            al.m250020a(str, str2, "no_network");
            observableEmitter.onNext(new MeetingCheckData(false, null, null));
            observableEmitter.onComplete();
        } else if (VideoChatService.m249602d().mo220181e() || VideoChatModuleDependency.getVoIpDependency().isFloatIconShown()) {
            LKUIToast.show(context, (int) R.string.View_G_CurrentlyInCall);
            observableEmitter.onNext(new MeetingCheckData(false, null, null));
            observableEmitter.onComplete();
        } else {
            observableEmitter.onNext(new MeetingCheckData(true, null, null));
            observableEmitter.onComplete();
            TimeConsumeUtils.m248928a(a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248894a(an anVar, MeetingCheckData bVar, Context context, int i, String str, String str2, ObservableEmitter observableEmitter) throws Exception {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCheckUtils:localOnCallOrRingingCheck");
        C60700b.m235851b("MeetingCheckUtils", "[localOnCallOrRingingCheck]", "start");
        if (VideoChatService.m249602d().isOngoing(true) || anVar.isFloatIconShown()) {
            VideoChatService.m249602d().mo220190k();
            C63693e.m249689e();
            C63697g.m249707e();
            if (VideoChatService.m249602d().mo220181e() || anVar.isFloatIconShown()) {
                LKUIToast.show(ar.m236694a(), (int) R.string.View_G_CurrentlyInCall);
                bVar.mo219664a((Boolean) false);
                observableEmitter.onNext(bVar);
                observableEmitter.onComplete();
                return;
            }
            C26171w.m94675a(new Runnable(context, bVar, observableEmitter, i, str, str2) {
                /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$lQrvZvnKUHEYXZ1OYkR6RULdB8 */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ MeetingCheckData f$1;
                public final /* synthetic */ ObservableEmitter f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ String f$5;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    MeetingCheckUtils.m248889a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
            return;
        }
        observableEmitter.onNext(bVar);
        observableEmitter.onComplete();
        TimeConsumeUtils.m248928a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m248889a(Context context, MeetingCheckData bVar, ObservableEmitter<MeetingCheckData> observableEmitter, int i, String str, String str2) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        C61303k kVar2 = (C61303k) MeetingManager.m238341a().mo211907k();
        if (m248900a(kVar, bVar.mo219665b())) {
            bVar.mo219664a((Boolean) false);
            C60700b.m235851b("MeetingCheckUtils", "[launchNewWhenVcOnCallOrRing]", "reopen meeting from localOnCallOrRingingCheck");
            ByteRTCMeetingActivity.m244032a(kVar);
            bVar.mo219664a((Boolean) false);
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
        } else if (m248900a(kVar2, bVar.mo219665b())) {
            bVar.mo219664a((Boolean) false);
            C60700b.m235851b("MeetingCheckUtils", "[launchNewWhenVcOnCallOrRing2]", "reopen waiting page from localOnCallOrRingingCheck");
            ByteRTCMeetingActivity.m244038b(kVar2);
            bVar.mo219664a((Boolean) false);
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
        } else {
            m248888a(context, (("chat_window_banner".equals(str2) || "calendar_reminder".equals(str2) || "calendar_detail".equals(str2)) && i != 2) ? !TextUtils.isEmpty(m248886a(bVar.mo219665b())) ? 1 : 0 : i, MeetingManager.m238341a().mo211894b(), kVar, observableEmitter, bVar, str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r12.mo212056e().getVideoChatSettings().getSubType() == com.ss.android.vc.entity.VideoChatSettings.SubType.SCREEN_SHARE) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r12.mo212056e().getVideoChatSettings().getSubType() == com.ss.android.vc.entity.VideoChatSettings.SubType.SCREEN_SHARE) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        r6 = com.larksuite.suite.R.string.View_G_SharingMirroringTitle;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m248888a(android.content.Context r20, int r21, java.util.List<com.ss.android.vc.meeting.framework.meeting.AbstractC61294b> r22, final com.ss.android.vc.meeting.framework.meeting.C61303k r23, final io.reactivex.ObservableEmitter<com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData> r24, final com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData r25, final java.lang.String r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils.m248888a(android.content.Context, int, java.util.List, com.ss.android.vc.meeting.framework.meeting.k, io.reactivex.ObservableEmitter, com.ss.android.vc.meeting.utils.meetingcheck.b, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248899a(AtomicBoolean atomicBoolean, C61303k kVar, int i, String str, List list, final ObservableEmitter observableEmitter, final MeetingCheckData bVar, DialogInterface dialogInterface, int i2) {
        atomicBoolean.set(true);
        dialogInterface.dismiss();
        if (kVar != null) {
            String str2 = i == 1 ? "join_another_meeting" : "create_another_meeting";
            if (kVar.mo212057f() == VideoChat.Type.CALL) {
                C63761k.m250298a(kVar.mo212056e(), 9, str2);
            } else {
                ao.m250026a(kVar.mo212056e(), str2);
            }
            C63512c.m248917a("confirm", str, kVar);
        }
        boolean z = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC61294b bVar2 = (AbstractC61294b) it.next();
            if (bVar2 != null && !bVar2.mo212062k()) {
                if (!z) {
                    MeetingManager.m238341a().addMeetingsSizeChangeListener(new IMeetingsSizeChangeListener() {
                        /* class com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils.C635085 */

                        @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
                        /* renamed from: a */
                        public /* synthetic */ void mo208172a(List list) {
                            IMeetingsSizeChangeListener.CC.$default$a(this, list);
                        }

                        @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
                        public void onMeetingsBegin(boolean z) {
                        }

                        @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
                        public void onMeetingsEnd() {
                            MeetingManager.m238341a().removeMeetingsSizeChangeListener(this);
                            C26171w.m94675a(new Runnable(bVar) {
                                /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$5$q3cpmeHfO_UhfJ3gTSsEQcDNcc */
                                public final /* synthetic */ MeetingCheckData f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    MeetingCheckUtils.C635085.m248906a(ObservableEmitter.this, this.f$1);
                                }
                            });
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public static /* synthetic */ void m248906a(ObservableEmitter observableEmitter, MeetingCheckData bVar) {
                            observableEmitter.onNext(bVar);
                            observableEmitter.onComplete();
                        }
                    });
                    z = true;
                }
                bVar2.mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST).mo212331a(EventSource.EVENT_DIALOG));
            }
        }
        if (!z) {
            observableEmitter.onNext(bVar);
            observableEmitter.onComplete();
        }
    }

    /* renamed from: a */
    private static String m248886a(JoinMeetingPreCheckEntity joinMeetingPreCheckEntity) {
        if (joinMeetingPreCheckEntity == null || joinMeetingPreCheckEntity.f152605b == null || joinMeetingPreCheckEntity.f152605b.f152607a == null || joinMeetingPreCheckEntity.f152605b.f152607a.size() <= 0 || joinMeetingPreCheckEntity.f152605b.f152607a.get(0) == null) {
            return null;
        }
        return joinMeetingPreCheckEntity.f152605b.f152607a.get(0).getId();
    }

    /* renamed from: a */
    private static boolean m248900a(C61303k kVar, JoinMeetingPreCheckEntity joinMeetingPreCheckEntity) {
        if (kVar == null) {
            return false;
        }
        String a = m248886a(joinMeetingPreCheckEntity);
        if (kVar == null || kVar.mo212055d() == null || !kVar.mo212055d().equals(a)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248898a(String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, boolean z, ParticipantRole participantRole, final String str2, final String str3, final boolean z2, final MeetingCheckData bVar, final C68296b bVar2, final Context context, final ObservableEmitter observableEmitter) throws Exception {
        C60700b.m235851b("MeetingCheckUtils", "[remoteCheck]", "remoteCheck");
        C63693e.m249686c();
        C63697g.m249705c();
        VcBizSender.m249165a(str, joinMeetingCheckIDType, z, participantRole).mo219893b(new AbstractC63598b<JoinMeetingPreCheckEntity>() {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils.C635096 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                if (!eVar.f160600c) {
                    C63693e.m249689e();
                    C63697g.m249707e();
                    C60738ac.m236023a((int) R.string.View_G_ServerError);
                    bVar.mo219664a((Boolean) false);
                    bVar.mo219662a((VideoChat.VendorType) null);
                    bVar.mo219663a((JoinMeetingPreCheckEntity) null);
                    observableEmitter.onNext(bVar);
                    observableEmitter.onComplete();
                    MeetingCheckUtils.m248890a(context, str2);
                }
            }

            /* renamed from: a */
            public void onSuccess(JoinMeetingPreCheckEntity joinMeetingPreCheckEntity) {
                boolean z;
                boolean z2 = true;
                if (joinMeetingPreCheckEntity == null || joinMeetingPreCheckEntity.f152605b == null || joinMeetingPreCheckEntity.f152605b.f152607a == null || joinMeetingPreCheckEntity.f152605b.f152607a.size() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                switch (C635107.f160464a[joinMeetingPreCheckEntity.f152604a.ordinal()]) {
                    case 1:
                        C60738ac.m236023a((int) R.string.View_M_CannotStartMeetings);
                        al.m250020a(str2, str3, "disable_speak");
                        z2 = false;
                        break;
                    case 2:
                        C60738ac.m236023a((int) R.string.View_G_BlacklistCallsMeetingsUnavailable);
                        al.m250020a(str2, str3, "black_list");
                        z2 = false;
                        break;
                    case 3:
                        C60738ac.m236023a((int) R.string.View_G_CurrentlyInCall);
                        al.m250020a(str2, str3, "another_device_voip_onthecall");
                        z2 = false;
                        break;
                    case 4:
                        C60738ac.m236023a((int) R.string.View_G_FeatureNotSupported);
                        al.m250020a(str2, str3, "version_not_available");
                        z2 = false;
                        break;
                    case 5:
                        C60738ac.m236023a((int) R.string.View_M_CapacityReachedAndroid);
                        al.m250020a(str2, str3, "meeting_user_full");
                        z2 = false;
                        break;
                    case 6:
                        C60738ac.m236023a((int) R.string.View_M_MeetingHasEnded);
                        al.m250020a(str2, str3, "meeting_finished");
                        z2 = false;
                        break;
                    case 7:
                        C60738ac.m236023a((int) R.string.View_M_MeetingLocked);
                        al.m250020a(str2, str3, "meeting_locked");
                        z2 = false;
                        break;
                    case 8:
                        break;
                    case 9:
                        C60738ac.m236023a((int) R.string.View_M_NoPermissionToJoinInterview);
                        al.m250020a(str2, str3, "meeting_interview_no_permission");
                        z2 = false;
                        break;
                    case 10:
                        C60738ac.m236023a((int) R.string.View_M_InterviewLinkExpired);
                        al.m250020a(str2, str3, "meeting_out_of_date");
                        z2 = false;
                        break;
                    case 11:
                        C60738ac.m236023a((int) R.string.View_M_MeetingExpired);
                        z2 = false;
                        break;
                    default:
                        if (z2) {
                            if (z) {
                                C60738ac.m236023a((int) R.string.View_M_FailedToJoinMeeting);
                            } else {
                                C60738ac.m236023a((int) R.string.View_M_FailedToStartMeeting);
                            }
                        }
                        z2 = false;
                        break;
                }
                if (z2) {
                    C63693e.m249688d();
                    C63697g.m249706d();
                } else {
                    C63693e.m249689e();
                    C63697g.m249707e();
                }
                VideoChat.VendorType vendorType = VideoChat.VendorType.UNKNOWN_VENDOR_TYPE;
                if (joinMeetingPreCheckEntity.f152606c != null) {
                    vendorType = VideoChat.VendorType.valueOf(joinMeetingPreCheckEntity.f152606c.getNumber());
                }
                bVar.mo219664a(Boolean.valueOf(z2));
                bVar.mo219662a(vendorType);
                bVar.mo219663a(joinMeetingPreCheckEntity);
                observableEmitter.onNext(bVar);
                observableEmitter.onComplete();
                VideoChatModule.getVideoChatService().dismissLoadingDialog();
                TimeConsumeUtils.m248928a(bVar2);
            }
        });
    }

    /* renamed from: d */
    private static Observable<MeetingCheckData> m248905d() {
        return Observable.create($$Lambda$MeetingCheckUtils$DLnoKH6ydso6dl33NvTcfER8KKU.INSTANCE);
    }

    @XMethod(runOnProcess = XProcess.Main)
    private static void interruptRecord() {
        VideoChatModuleDependency.getMinutesDependency().mo196441c();
    }

    @XMethod(runOnProcess = XProcess.Main)
    public static void interruptFloatLive() {
        VideoChatModule.getDependency().getMinutesDependency().mo196445g();
    }

    @XMethod(runOnProcess = XProcess.Main)
    private static boolean isLiveInFloat() {
        return VideoChatModule.getDependency().getMinutesDependency().mo196444f();
    }

    @XMethod(runOnProcess = XProcess.Main)
    private static boolean isRecordInFloat() {
        return VideoChatModuleDependency.getMinutesDependency().mo196440b();
    }

    /* renamed from: b */
    private static int m248901b() {
        Activity activity;
        if (!DesktopUtil.m144307b()) {
            activity = VCAppLifeCycle.m236256c();
        } else {
            activity = m248904c();
        }
        if (activity != null) {
            return activity.hashCode();
        }
        return -1;
    }

    /* renamed from: c */
    private static Activity m248904c() {
        if (VCAppLifeCycle.m236256c() != null) {
            return VCAppLifeCycle.m236256c();
        }
        return C36519d.m144080a().mo134826h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils$7 */
    public static /* synthetic */ class C635107 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160464a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 133
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils.C635107.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static int m248873a(Context context) {
        if (context == null || !(context instanceof Activity)) {
            return m248901b();
        }
        return ((Activity) context).hashCode();
    }

    /* renamed from: a */
    public static void m248890a(Context context, String str) {
        if (str != "calendar_detail") {
            VideoChatModule.getVideoChatService().dismissLoadingDialog();
        }
    }

    /* renamed from: b */
    private static void m248903b(Context context, String str) {
        if (str != "calendar_detail") {
            VideoChatModule.getVideoChatService().showLoadingDialog(context, null);
        }
    }

    /* renamed from: a */
    private static C61303k m248874a(List<AbstractC61294b> list, C61303k kVar) {
        if (kVar != null) {
            return kVar;
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (C61303k) list.get(0);
    }

    /* renamed from: a */
    private static Observable<MeetingCheckData> m248880a(Context context, String str, String str2) {
        return Observable.create(new ObservableOnSubscribe(context, str, str2) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$1pLCc_GIzzCn4LzmKJqWzoApB4 */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                MeetingCheckUtils.m248891a(this.f$0, this.f$1, this.f$2, observableEmitter);
            }
        }).subscribeOn(LarkRxSchedulers.io());
    }

    /* renamed from: a */
    private static Observable<MeetingCheckData> m248875a(Context context, int i, MeetingCheckData bVar, String str, String str2) {
        return Observable.create(new ObservableOnSubscribe(bVar, context, i, str, str2) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$eZVzwqGWWrPWlIo0oH2U9u81n8 */
            public final /* synthetic */ MeetingCheckData f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                MeetingCheckUtils.m248894a(an.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, observableEmitter);
            }
        });
    }

    @XMethod(methodId = "1")
    public static XObservable<MeetingCheckData> meetingCheck(Context context, String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, boolean z, String str2, String str3, Integer num, boolean z2) {
        return new XObservable<>(m248879a(context, str, joinMeetingCheckIDType, z, str2, str3, true, num.intValue(), Boolean.valueOf(z2)));
    }

    @XMethod(methodId = "2")
    public static XObservable<MeetingCheckData> meetingCheck(Context context, String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, boolean z, String str2, String str3, Integer num, boolean z2, boolean z3) {
        return new XObservable<>(m248879a(context, str, joinMeetingCheckIDType, z, str2, str3, z3, num.intValue(), Boolean.valueOf(z2)));
    }

    /* renamed from: a */
    public static Observable<MeetingCheckData> m248876a(Context context, String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, String str2, boolean z, String str3, String str4, int i, Boolean bool) {
        return m248877a(context, str, joinMeetingCheckIDType, str2, z, str3, str4, true, i, bool);
    }

    /* renamed from: a */
    private static Observable<MeetingCheckData> m248878a(Context context, String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, String str2, boolean z, String str3, String str4, boolean z2, MeetingCheckData bVar) {
        ParticipantRole participantRole;
        C68296b<Boolean> a = TimeConsumeUtils.m248927a("MeetingCheckUtils:remoteCheck");
        m248903b(context, str3);
        if (TextUtils.isEmpty(str2)) {
            participantRole = null;
        } else if (MeetingPreviewInterviewFragment.InterviewerType.INTERVIEWER.getType().equals(str2)) {
            participantRole = ParticipantRole.INTERVIEWER;
        } else if (MeetingPreviewInterviewFragment.InterviewerType.INTERVIEWEE.getType().equals(str2)) {
            participantRole = ParticipantRole.INTERVIEWEE;
        } else {
            participantRole = ParticipantRole.UNKNOW_ROLE;
        }
        return Observable.create(new ObservableOnSubscribe(str, joinMeetingCheckIDType, z, participantRole, str3, str4, z2, bVar, a, context) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$6H2O_BI4wGIjT1FiqgF0NlJdkc */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ ParticipantRole f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ String f$5;
            public final /* synthetic */ boolean f$6;
            public final /* synthetic */ MeetingCheckData f$7;
            public final /* synthetic */ C68296b f$8;
            public final /* synthetic */ Context f$9;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
                this.f$9 = r10;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                MeetingCheckUtils.m248898a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, observableEmitter);
            }
        });
    }

    /* renamed from: a */
    public static Observable<MeetingCheckData> m248879a(Context context, String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, boolean z, String str2, String str3, boolean z2, int i, Boolean bool) {
        return m248877a(context, str, joinMeetingCheckIDType, "", z, str2, str3, z2, i, bool);
    }

    /* renamed from: a */
    private static Observable<MeetingCheckData> m248877a(Context context, String str, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType joinMeetingCheckIDType, String str2, boolean z, String str3, String str4, boolean z2, int i, Boolean bool) {
        Context context2;
        if (DesktopUtil.m144307b()) {
            context2 = m248904c();
        } else {
            context2 = context;
        }
        if (context2 == null) {
            context2 = ar.m236694a();
        }
        f160444d = m248873a(context2);
        if (context2 == null) {
            C63693e.m249689e();
            C63697g.m249707e();
            return Observable.just(new MeetingCheckData(false, null, null));
        }
        VideoChatService.m249602d().mo220188j();
        return m248881a(joinMeetingCheckIDType, i).flatMap($$Lambda$MeetingCheckUtils$UppbOprorYP8zoosq9nsNd3Yuhs.INSTANCE).flatMap(new Function(context2, str3, str4) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$6595bZ5YIGQCjb8cqfovI5l7Yo */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ String f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MeetingCheckUtils.m248883a(this.f$0, this.f$1, this.f$2, (MeetingCheckData) obj);
            }
        }).flatMap(new Function(bool, context2, str, joinMeetingCheckIDType, str2, z, str3, str4, z2) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$v2yVvM8323vllNUZNt7nqZXaPg */
            public final /* synthetic */ Boolean f$0;
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType f$3;
            public final /* synthetic */ String f$4;
            public final /* synthetic */ boolean f$5;
            public final /* synthetic */ String f$6;
            public final /* synthetic */ String f$7;
            public final /* synthetic */ boolean f$8;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
                this.f$7 = r8;
                this.f$8 = r9;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MeetingCheckUtils.m248885a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (MeetingCheckData) obj);
            }
        }).flatMap(new Function(context2, i, str4, str3) {
            /* class com.ss.android.vc.meeting.utils.meetingcheck.$$Lambda$MeetingCheckUtils$1isE0KD7P08h7PxA1nPTmpfLY */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MeetingCheckUtils.m248882a(this.f$0, this.f$1, this.f$2, this.f$3, (MeetingCheckData) obj);
            }
        }).observeOn(LarkRxSchedulers.mainThread());
    }
}
