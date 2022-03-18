package com.ss.android.vc.meeting.module.record;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LKVCJumpDialogController;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.request.RecordMeetingEntityRequest;
import com.ss.android.vc.entity.response.al;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.AbstractC61424d;
import com.ss.android.vc.meeting.module.base.AbstractC61429i;
import com.ss.android.vc.meeting.module.base.MeetingActivity;
import com.ss.android.vc.meeting.module.base.util.DataAdapterUtil;
import com.ss.android.vc.meeting.module.record.C62898e;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event2.MeetingPopupEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.record.e */
public class C62898e extends AbstractC61424d implements AbstractC62895b {

    /* renamed from: a */
    C62896c f158437a;

    /* renamed from: b */
    private Dialog f158438b;

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: a */
    public void mo217359a(boolean z, boolean z2) {
    }

    /* renamed from: c */
    public void mo217380c() {
        m246278d();
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: g */
    public void mo217369g() {
        mo217380c();
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: a */
    public void mo217372a(View view) {
        C62896c cVar = new C62896c();
        this.f158437a = cVar;
        cVar.mo217375a(view);
        mo217380c();
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: a */
    public void mo217373a(AbstractC61222a aVar) {
        if (isMeetType()) {
            m246273b(aVar);
        } else {
            m246277c(aVar);
        }
    }

    /* renamed from: a */
    public void mo217378a(String str, AbstractC61222a aVar) {
        VcMsgInfo h = getMeeting().mo212106X().mo217370h();
        if (h == null || h.msg_i18n_key == null || h.msg_i18n_key.i18nParams == null || h.msg_i18n_key.i18nParams.size() <= 0 || TextUtils.isEmpty(h.msg_i18n_key.key)) {
            m246267a(str, "", aVar);
            return;
        }
        for (Map.Entry<String, VcI18nKeyInfo.I18nParam> entry : h.msg_i18n_key.i18nParams.entrySet()) {
            VcI18nKeyInfo.I18nParam value = entry.getValue();
            if (value.type == VcI18nKeyInfo.I18nParam.Type.USER_ID) {
                Observable.create(new ObservableOnSubscribe(value.value) {
                    /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$kjLVo5dqUI3GZV1c4rEqzCdS9M */
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // io.reactivex.ObservableOnSubscribe
                    public final void subscribe(ObservableEmitter observableEmitter) {
                        C62898e.m246268a(this.f$0, observableEmitter);
                    }
                }).subscribeOn(LarkRxSchedulers.io()).observeOn(LarkRxSchedulers.io()).flatMap(new Function(entry, h) {
                    /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$5Ka6skOU_w2or4jOHjgmpsbLnCM */
                    public final /* synthetic */ Map.Entry f$1;
                    public final /* synthetic */ VcMsgInfo f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // io.reactivex.functions.Function
                    public final Object apply(Object obj) {
                        return C62898e.this.m246259a(this.f$1, this.f$2, (String) obj);
                    }
                }).observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer(str, aVar) {
                    /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$d4bKE7WkExeRded1WuNKl04VkXw */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ AbstractC61222a f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C62898e.this.m246267a((C62898e) this.f$1, (String) this.f$2, (AbstractC61222a) ((String) obj));
                    }
                });
            } else {
                m246267a(str, "", aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246270a(Map.Entry entry, String str, VcMsgInfo vcMsgInfo, final ObservableEmitter observableEmitter) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(entry.getKey(), str);
        VcBizSender.m249235b(vcMsgInfo.msg_i18n_key.key, hashMap).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.record.C62898e.C629024 */

            /* renamed from: a */
            public void onSuccess(String str) {
                observableEmitter.onNext(str);
                observableEmitter.onComplete();
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                observableEmitter.onNext("");
                observableEmitter.onComplete();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m246267a(String str, String str2, AbstractC61222a aVar) {
        C60700b.m235851b("RecordViewControl", "[showRecordStopDialog]", "showRecordStopDialog");
        if (C57782ag.m224241a(str2)) {
            if (isMeetType()) {
                str2 = C60773o.m236119a((int) R.string.View_M_StopRecordingQuestion);
            } else {
                str2 = C60773o.m236119a((int) R.string.View_AV_StopRecordingQuestion);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = C60773o.m236119a((int) R.string.View_M_StopRecordingQuestion);
        }
        VCDialogUtils.m236219c(getActivity(), str, 2, str2, R.string.View_G_CancelButton, new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$bvYEu_2IcP387qnMt7V2FIyKBQ */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62898e.this.m246260a((C62898e) dialogInterface, (DialogInterface) i);
            }
        }, R.string.View_G_StopButton, new DialogInterface.OnClickListener(aVar) {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$dttGEVX2cNyx_SZI9gxosf2sXOA */
            public final /* synthetic */ AbstractC61222a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62898e.this.m246264a((C62898e) this.f$1, (AbstractC61222a) dialogInterface, (DialogInterface) i);
            }
        }, false);
        MeetingPopupEvent.m249838a().mo220317a("record_stop", getMeeting().mo212056e());
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: a */
    public void mo217357a(InMeetingData.RecordMeetingData recordMeetingData) {
        if (recordMeetingData.mo209046a() == InMeetingData.RecordMeetingData.Type.RECORDING_STATUS_CHANGE) {
            m246272b(recordMeetingData);
        } else if (recordMeetingData.mo209046a() == InMeetingData.RecordMeetingData.Type.PARTICIPANT_REQUEST) {
            if (this.mPresent != null) {
                m246276c(recordMeetingData);
            }
        } else if (recordMeetingData.mo209046a() == InMeetingData.RecordMeetingData.Type.HOST_RESPONSE) {
            m246280d(recordMeetingData);
        }
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: a */
    public void mo217356a() {
        mo217380c();
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void destroy() {
        getMeeting().mo212106X().mo217361b(this);
    }

    /* renamed from: e */
    private void m246282e() {
        C60700b.m235851b("RecordViewControl", "[sendRecordRequest]", "sendRecordRequest");
        VcBizSender.m249166a(getMeeting().mo212055d(), RecordMeetingEntityRequest.Action.PARTICIPANT_REQUEST_START, (ByteviewUser) null, C60774p.m236129a()).mo219893b(new AbstractC63598b<al>() {
            /* class com.ss.android.vc.meeting.module.record.C62898e.C628991 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m246302a() {
                C62898e.this.mo217380c();
                C62898e.this.mo217379b();
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("RecordViewControl", "[sendRecordRequest3]", "onError");
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m246303a(VideoChatUser videoChatUser) {
                String str;
                String a = C60773o.m236119a((int) R.string.View_AV_RecordingStartIfApprovalNameBraces);
                if (videoChatUser == null) {
                    str = "";
                } else {
                    str = videoChatUser.getName();
                }
                C60738ac.m236039c(UIHelper.mustacheFormat(a, "name", str));
            }

            /* renamed from: a */
            public void onSuccess(al alVar) {
                C60700b.m235851b("RecordViewControl", "[sendRecordRequest2]", "onSuccess");
                C62898e.this.getMeeting().mo212106X().mo217364c(true);
                C60735ab.m236001a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$1$DJNCzQKzVw3W1Z5Y5uGvyGwbWsM */

                    public final void run() {
                        C62898e.C628991.this.m246302a();
                    }
                });
                if (C62898e.this.isMeetType()) {
                    C60738ac.m236037c((int) R.string.View_G_RequestSent);
                    return;
                }
                VideoChatUser singleRemoteUser = C62898e.this.getMeeting().mo212088F().getSingleRemoteUser();
                if (!TextUtils.isEmpty(singleRemoteUser.getId())) {
                    UserInfoService.getUserInfoById(C62898e.this.getMeeting().mo212055d(), singleRemoteUser.getId(), singleRemoteUser.getType(), $$Lambda$e$1$2dgucUNJXkvMVLUtCeQoJfRIAA.INSTANCE);
                }
            }
        });
    }

    /* renamed from: f */
    private boolean m246288f() {
        VideoChat e;
        C61303k meeting = getMeeting();
        if (meeting == null || (e = meeting.mo212056e()) == null || e.getParticipants() == null || e.getParticipants().size() != 1 || !ParticipantUtil.m248732c(e.getParticipants().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.vc.meeting.module.record.AbstractC62895b
    /* renamed from: i */
    public void mo217374i() {
        if (getMeeting() != null && getMeeting().aE().mo208293c()) {
            C60700b.m235851b("RecordViewControl", "dismissInMeetingRequestDialog", "");
            Dialog dialog = this.f158438b;
            if (dialog != null && dialog.isShowing()) {
                this.f158438b.dismiss();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61424d
    public void init() {
        getMeeting().mo212106X().mo217358a(this);
        if (getMeeting().mo212106X().mo217365c() && !getMeeting().mo212106X().mo217363b()) {
            m246276c(getMeeting().mo212106X().mo217366d());
        }
    }

    /* renamed from: d */
    private void m246278d() {
        if (this.f158437a == null) {
            return;
        }
        if (isCallType()) {
            if (getMeeting().mo212106X().mo217367e()) {
                this.f158437a.f158426c.setText(R.string.View_G_Record);
                this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_record_filled));
            } else if (getMeeting().mo212106X().mo217363b()) {
                this.f158437a.f158426c.setText(R.string.View_M_StopRecording);
                this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_stop_record_filled));
            } else {
                this.f158437a.f158426c.setText(R.string.View_G_Record);
                this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_record_filled));
            }
        } else if (isMeetHostUnderUIConfig()) {
            if (getMeeting().mo212106X().mo217363b()) {
                this.f158437a.f158426c.setText(R.string.View_M_StopRecording);
                this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_stop_record_filled));
                return;
            }
            this.f158437a.f158426c.setText(R.string.View_G_Record);
            this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_record_filled));
        } else if (getMeeting().mo212106X().mo217367e()) {
            this.f158437a.f158426c.setText(R.string.View_G_Record);
            this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_record_filled));
        } else if (getMeeting().mo212106X().mo217363b()) {
            this.f158437a.f158426c.setText(R.string.View_M_Recording);
            this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_record_filled));
        } else {
            this.f158437a.f158426c.setText(R.string.View_G_Record);
            this.f158437a.f158425b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_record_filled));
        }
    }

    /* renamed from: b */
    public void mo217379b() {
        Activity b = this.mPresent.mo212918b();
        if (b != null && m246288f() && DataAdapterUtil.f154006a.mo212853b(getMeeting())) {
            MeetingPopupEvent.m249838a().mo220315a(getMeeting(), "record_unmute");
            VCDialogUtils.m236218b((Context) b, (int) R.string.View_G_NoAudioWillBeRecorded, 2, (int) R.string.View_G_Muted, (int) R.string.View_G_RecordWithoutAudio, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$xjI8gb5Zdyce3mROpS6RNnJh2uI */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62898e.this.m246289g(dialogInterface, i);
                }
            }, (int) R.string.View_G_UnmuteMyself, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$5TLzJ20o68qUezXEJ5JPfQtWlj4 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62898e.this.m246286f(dialogInterface, i);
                }
            }, false);
        }
    }

    public C62898e(AbstractC61429i iVar) {
        super(iVar);
        init();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m246265a(VideoChatUser videoChatUser) {
        if (videoChatUser != null && !TextUtils.isEmpty(videoChatUser.getName())) {
            C60738ac.m236039c(UIHelper.mustacheFormat(C60773o.m236119a((int) R.string.View_AV_DeclinedToRecordNameBraces), "name", videoChatUser.getName()));
        }
    }

    /* renamed from: b */
    private void m246272b(InMeetingData.RecordMeetingData recordMeetingData) {
        mo217380c();
        if (!recordMeetingData.mo209053b()) {
            Activity b = this.mPresent.mo212918b();
            if (b instanceof MeetingActivity) {
                ((MeetingActivity) b).mo212793t();
            }
        }
    }

    /* renamed from: c */
    private void m246276c(InMeetingData.RecordMeetingData recordMeetingData) {
        if (recordMeetingData == null || recordMeetingData.mo209054c() == null) {
            m246263a(recordMeetingData, "");
            return;
        }
        ByteviewUser c = recordMeetingData.mo209054c();
        UserInfoService.getUserInfoById(getMeeting().mo212055d(), c.getUserId(), c.getParticipantType(), new GetUserInfoListener(recordMeetingData) {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$QBFIb722nsj7E9hnSb6zeCOO7Fg */
            public final /* synthetic */ InMeetingData.RecordMeetingData f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C62898e.this.m246262a((C62898e) this.f$1, (InMeetingData.RecordMeetingData) videoChatUser);
            }
        });
    }

    /* renamed from: g */
    private void m246290g(AbstractC61222a aVar) {
        C60700b.m235851b("RecordViewControl", "[toStartRecord]", "toStartRecord");
        C63742at.m250072a(true, getMeeting().mo212056e());
        VcBizSender.m249166a(getMeeting().mo212055d(), RecordMeetingEntityRequest.Action.START, (ByteviewUser) null, C60774p.m236129a()).mo219889a(new AbstractC63598b<al>() {
            /* class com.ss.android.vc.meeting.module.record.C62898e.C629002 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("RecordViewControl", "[toStartRecord3]", "onError");
            }

            /* renamed from: a */
            public void onSuccess(al alVar) {
                C60700b.m235851b("RecordViewControl", "[toStartRecord2]", "onSuccess");
                C62898e.this.getMeeting().mo212106X().s_(true);
                C62898e.this.mo217380c();
                C62898e.this.mo217379b();
            }
        });
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: b */
    private void m246273b(AbstractC61222a aVar) {
        if (isMeetHostUnderUIConfig()) {
            if (getMeeting().mo212106X().mo217363b()) {
                m246291h(aVar);
            } else {
                m246287f(aVar);
            }
        } else if (getMeeting().mo212106X().mo217363b()) {
            C60700b.m235851b("RecordViewControl", "[meetRecordClick]", "isRecording");
            C60738ac.m236037c((int) R.string.View_M_CurrentlyRecording);
        } else if (getMeeting().mo212106X().mo217367e()) {
            C60700b.m235851b("RecordViewControl", "[meetRecordClick2]", "isRequesting");
            C60738ac.m236037c((int) R.string.View_G_RequestSentShort);
        } else {
            m246281d(aVar);
        }
    }

    /* renamed from: d */
    private void m246281d(AbstractC61222a aVar) {
        C60700b.m235851b("RecordViewControl", "[requestMeetingRecordAction]", "requestMeetingRecordAction");
        if (!getMeeting().mo212106X().mo217367e() && !getMeeting().mo212106X().mo217363b()) {
            C63742at.m250092e(getMeeting().mo212056e());
            Activity activity = getActivity();
            if (activity != null) {
                C60700b.m235851b("RecordViewControl", "[requestMeetingRecordAction2]", "show dialog");
                VCDialogUtils.m236177a((Context) activity, (int) R.string.View_G_AskHostToRecordQuestion, 2, (int) R.string.View_G_AskHostToRecordInfo, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$eaz4_BMet4WFnEoUs3cebjdL3to */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62898e.this.m246279d(dialogInterface, i);
                    }
                }, (int) R.string.View_M_SendRequest, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$0H7mLPBH_8Z1viQYmYqDlCht6_0 */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C62898e.this.m246275c(dialogInterface, i);
                    }
                }, false);
                MeetingPopupEvent.m249838a().mo220317a("record_request", getMeeting().mo212056e());
                mo217380c();
                if (aVar != null) {
                    aVar.dismiss();
                }
            }
        }
    }

    /* renamed from: f */
    private void m246287f(AbstractC61222a aVar) {
        C60700b.m235851b("RecordViewControl", "[startRecordAction]", "startRecordAction");
        if (!C63634c.m249496b("byteview.callmeeting.android.record_reconfirm") || m246288f()) {
            m246290g(aVar);
            return;
        }
        VCDialogUtils.m236184a((Context) getActivity(), C60773o.m236119a((int) R.string.View_VM_StartRecordingQuestion), 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$DLsW_efzcPIh8RrxXeB5hnEhS8 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62898e.this.m246271b(dialogInterface, i);
            }
        }, (int) R.string.View_G_Record, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(aVar) {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$RHCe7lJX2eg9JHtJfUfFPgQ5I0 */
            public final /* synthetic */ AbstractC61222a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62898e.this.m246274b(this.f$1, dialogInterface, i);
            }
        }, false);
        MeetingPopupEvent.m249838a().mo220317a("record_reconfirm", getMeeting().mo212056e());
    }

    /* renamed from: h */
    private void m246291h(final AbstractC61222a aVar) {
        if (C60773o.m236120a(C60773o.m236124b(getContext()))) {
            C60700b.m235851b("RecordViewControl", "[stopRecordAction]", "stopRecordAction");
            C63742at.m250072a(false, getMeeting().mo212056e());
            VcMsgInfo h = getMeeting().mo212106X().mo217370h();
            if (h == null || h.msg_title_i18n_key == null) {
                mo217378a("", aVar);
            } else {
                VcBizSender.m249235b(h.msg_title_i18n_key.key, (Map<String, String>) null).mo219889a(new AbstractC63598b<String>() {
                    /* class com.ss.android.vc.meeting.module.record.C62898e.C629013 */

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        C60700b.m235851b("RecordViewControl", "[stopRecordAction2]", "onSuccess");
                        C62898e.this.mo217378a(str, aVar);
                    }

                    @Override // com.ss.android.vc.net.request.AbstractC63598b
                    public void onError(C63602e eVar) {
                        C60700b.m235864f("RecordViewControl", "[stopRecordAction3]", "onError");
                        C62898e.this.mo217378a("", aVar);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m246277c(AbstractC61222a aVar) {
        if (getMeeting().mo212106X().mo217363b()) {
            m246291h(aVar);
        } else if (getMeeting().mo212106X().mo217368f()) {
            m246287f(aVar);
        } else {
            m246285e(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m246284e(InMeetingData.RecordMeetingData recordMeetingData) {
        long j;
        C60700b.m235851b("RecordViewControl", "[participantRequestInternal4]", "click url");
        try {
            getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(recordMeetingData.mo209055d())));
            if (Build.VERSION.SDK_INT < 26) {
                j = 1500;
            } else {
                j = 800;
            }
            gotoFloatWindow(j);
        } catch (Exception e) {
            e.printStackTrace();
            C60700b.m235864f("RecordViewControl", "[showTips]", "startActivity" + recordMeetingData.mo209055d());
        }
    }

    /* renamed from: d */
    private void m246280d(InMeetingData.RecordMeetingData recordMeetingData) {
        if (isCallType() || isMeetParticipant()) {
            C60700b.m235851b("RecordViewControl", "[hostResponse]", "isRecording = " + recordMeetingData.mo209053b());
            if (!recordMeetingData.mo209053b()) {
                if (isMeetType()) {
                    C60738ac.m236037c((int) R.string.View_M_HostDeclinedToRecord);
                } else if (getMeeting().mo212088F() != null && getMeeting().mo212088F().getSingleRemoteUser() != null && !TextUtils.isEmpty(getMeeting().mo212088F().getSingleRemoteUser().getId())) {
                    VideoChatUser singleRemoteUser = getMeeting().mo212088F().getSingleRemoteUser();
                    UserInfoService.getUserInfoById(getMeeting().mo212055d(), singleRemoteUser.getId(), singleRemoteUser.getType(), $$Lambda$e$R8YeSWvqISvTPP38ahpM7LlgGvs.INSTANCE);
                } else {
                    return;
                }
                getMeeting().mo212106X().s_(recordMeetingData.mo209053b());
                mo217380c();
            }
        }
    }

    /* renamed from: e */
    private void m246285e(AbstractC61222a aVar) {
        C60700b.m235851b("RecordViewControl", "[requestCallRecordAction]", "requestCallRecordAction");
        if (!getMeeting().mo212106X().mo217367e() && !getMeeting().mo212106X().mo217363b()) {
            C63742at.m250092e(getMeeting().mo212056e());
            m246282e();
            mo217380c();
            if (aVar != null) {
                aVar.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m246289g(DialogInterface dialogInterface, int i) {
        MeetingPopupEvent.m249838a().mo220316a(getMeeting(), "record_unmute", "record_without_audio");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246262a(InMeetingData.RecordMeetingData recordMeetingData, VideoChatUser videoChatUser) {
        String str;
        if (videoChatUser == null) {
            str = "";
        } else {
            str = videoChatUser.getName();
        }
        m246263a(recordMeetingData, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m246271b(DialogInterface dialogInterface, int i) {
        C63742at.m250081b(false, getMeeting().mo212056e());
        MeetingPopupEvent.m249838a().mo220318a("cancel", "record_reconfirm", getMeeting().mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m246279d(DialogInterface dialogInterface, int i) {
        C63742at.m250063a(getMeeting().mo212056e(), "cancel");
        MeetingPopupEvent.m249838a().mo220318a("cancel", "record_request", getMeeting().mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m246286f(DialogInterface dialogInterface, int i) {
        getMeeting().ai().mo213017b(false, false);
        MeetingPopupEvent.m249838a().mo220316a(getMeeting(), "record_unmute", "self_unmute");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246260a(DialogInterface dialogInterface, int i) {
        C63742at.m250083b(false, getMeeting().mo212091I().mo212494b().mo212605j().getParticipantRoleSettings().isMeetingOwner(), getMeeting().mo212056e());
        MeetingPopupEvent.m249838a().mo220318a("cancel", "record_stop", getMeeting().mo212056e());
        C60700b.m235851b("RecordViewControl", "[showRecordStopDialog2]", "click cancel");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m246275c(DialogInterface dialogInterface, int i) {
        C63742at.m250063a(getMeeting().mo212056e(), "confirm");
        if (isMeetHostUnderUIConfig()) {
            C60738ac.m236037c((int) R.string.View_G_CouldNotSendRequest);
        } else if (getMeeting().mo212106X().mo217363b()) {
            C60738ac.m236037c((int) R.string.View_M_CurrentlyRecording);
        } else {
            m246282e();
        }
        MeetingPopupEvent.m249838a().mo220318a("confirm", "record_request", getMeeting().mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m246283e(DialogInterface dialogInterface, int i) {
        if (isCallType()) {
            C63763l.m250315i(getMeeting().mo212056e());
        } else {
            C63742at.m250088c(true, getMeeting().mo212056e());
        }
        C60700b.m235851b("RecordViewControl", "[participantRequestInternal3]", "click right");
        VcBizSender.m249166a(getMeeting().mo212055d(), RecordMeetingEntityRequest.Action.HOST_ACCEPT, (ByteviewUser) null, C60774p.m236129a()).mo219896d();
        getMeeting().mo212106X().mo217362b(false);
        getMeeting().mo212106X().mo217360b((InMeetingData.RecordMeetingData) null);
        MeetingPopupEvent.m249838a().mo220318a("confirm", "record_request_confirm", getMeeting().mo212056e());
    }

    /* renamed from: a */
    private void m246263a(InMeetingData.RecordMeetingData recordMeetingData, String str) {
        String str2;
        if (C60773o.m236120a(C60773o.m236124b(getContext())) && recordMeetingData != null) {
            Dialog dialog = this.f158438b;
            if (dialog != null && dialog.isShowing()) {
                return;
            }
            if ((isMeetHostUnderUIConfig() || isCallType()) && isParticipant(recordMeetingData.mo209054c()) && !getMeeting().mo212106X().mo217363b()) {
                if (isMeetType()) {
                    str2 = UIHelper.mustacheFormat(C60773o.m236119a((int) R.string.View_M_RequestToRecordInfoNew), "name", str);
                } else {
                    str2 = UIHelper.mustacheFormat(C60773o.m236119a((int) R.string.View_AV_RequestToRecordInfoNew), "name", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    getMeeting().mo212106X().mo217362b(true);
                    getMeeting().mo212106X().mo217360b(recordMeetingData);
                    C60700b.m235851b("RecordViewControl", "[participantRequestInternal", "showDialog");
                    this.f158438b = VCDialogUtils.m236161a((Context) getActivity(), (int) R.string.View_M_RequestToRecord, 1, str2, (int) R.string.View_G_DeclineButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(recordMeetingData) {
                        /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$qiLokb8fQ2IV4582N4AkQm3k2g */
                        public final /* synthetic */ InMeetingData.RecordMeetingData f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C62898e.this.m246261a((C62898e) this.f$1, (InMeetingData.RecordMeetingData) dialogInterface, (DialogInterface) i);
                        }
                    }, (int) R.string.View_G_ApproveButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$lPJBSU19FHQHf9i1877M9jBxalc */

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C62898e.this.m246283e(dialogInterface, i);
                        }
                    }, false, (LKVCJumpDialogController.OnJumpListener) new LKVCJumpDialogController.OnJumpListener(recordMeetingData) {
                        /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$P3fIJwpiixP85LBSPz2S5l9z8I */
                        public final /* synthetic */ InMeetingData.RecordMeetingData f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.vc.common.widget.LKVCJumpDialogController.OnJumpListener
                        public final void onJump() {
                            C62898e.this.m246284e((C62898e) this.f$1);
                        }
                    }, str.length());
                    MeetingPopupEvent.m249838a().mo220317a("record_request_confirm", getMeeting().mo212056e());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m246266a(ObservableEmitter observableEmitter, VideoChatUser videoChatUser) {
        String str;
        if (videoChatUser != null) {
            if (videoChatUser.getName().equals(C60773o.m236119a((int) R.string.View_VM_Unknown))) {
                str = "";
            } else {
                str = videoChatUser.getName();
            }
            observableEmitter.onNext(str);
            observableEmitter.onComplete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m246268a(String str, ObservableEmitter observableEmitter) throws Exception {
        UserInfoService.getChatterById(str, new GetUserInfoListener() {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$5dODyWFYkyER3eufC_qwzYfyrDY */

            @Override // com.ss.android.vc.net.service.GetUserInfoListener
            public final void onGetUserInfo(VideoChatUser videoChatUser) {
                C62898e.m246266a(ObservableEmitter.this, videoChatUser);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ ObservableSource m246259a(Map.Entry entry, VcMsgInfo vcMsgInfo, String str) throws Exception {
        return Observable.create(new ObservableOnSubscribe(entry, str, vcMsgInfo) {
            /* class com.ss.android.vc.meeting.module.record.$$Lambda$e$QH7bG0bASNKVCreizK7aYhdYgA */
            public final /* synthetic */ Map.Entry f$1;
            public final /* synthetic */ String f$2;
            public final /* synthetic */ VcMsgInfo f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                C62898e.this.m246270a(this.f$1, this.f$2, this.f$3, observableEmitter);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246261a(InMeetingData.RecordMeetingData recordMeetingData, DialogInterface dialogInterface, int i) {
        if (isCallType()) {
            C63763l.m250316j(getMeeting().mo212056e());
        } else {
            C63742at.m250088c(false, getMeeting().mo212056e());
        }
        C60700b.m235851b("RecordViewControl", "[participantRequestInternal2]", "click left");
        VcBizSender.m249166a(getMeeting().mo212055d(), RecordMeetingEntityRequest.Action.HOST_REFUSE, recordMeetingData.mo209054c(), C60774p.m236129a()).mo219896d();
        getMeeting().mo212106X().mo217362b(false);
        getMeeting().mo212106X().mo217360b((InMeetingData.RecordMeetingData) null);
        MeetingPopupEvent.m249838a().mo220318a("cancel", "record_request_confirm", getMeeting().mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m246274b(AbstractC61222a aVar, DialogInterface dialogInterface, int i) {
        C63742at.m250081b(true, getMeeting().mo212056e());
        m246290g(aVar);
        MeetingPopupEvent.m249838a().mo220318a("confirm", "record_reconfirm", getMeeting().mo212056e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m246264a(AbstractC61222a aVar, DialogInterface dialogInterface, int i) {
        C60700b.m235851b("RecordViewControl", "[showRecordStopDialog3]", "click stop");
        VcBizSender.m249166a(getMeeting().mo212055d(), RecordMeetingEntityRequest.Action.STOP, (ByteviewUser) null, C60774p.m236129a()).mo219889a(new AbstractC63598b<al>() {
            /* class com.ss.android.vc.meeting.module.record.C62898e.C629035 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("RecordViewControl", "[showRecordStopDialog5]", "click stop onError");
            }

            /* renamed from: a */
            public void onSuccess(al alVar) {
                C60700b.m235851b("RecordViewControl", "[showRecordStopDialog4]", "click stop onSuccess");
                C62898e.this.getMeeting().mo212106X().s_(false);
                C62898e.this.mo217380c();
            }
        });
        if (aVar != null) {
            aVar.dismiss();
        }
        C63742at.m250083b(true, getMeeting().mo212091I().mo212494b().mo212605j().getParticipantRoleSettings().isMeetingOwner(), getMeeting().mo212056e());
        MeetingPopupEvent.m249838a().mo220318a("confirm", "record_stop", getMeeting().mo212056e());
    }
}
