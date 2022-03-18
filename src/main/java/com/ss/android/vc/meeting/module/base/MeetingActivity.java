package com.ss.android.vc.meeting.module.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.p1786d.AbstractC36434e;
import com.ss.android.lark.p1786d.AbstractC36435f;
import com.ss.android.lark.p1786d.C36443k;
import com.ss.android.vc.common.lifecycle.C60790a;
import com.ss.android.vc.common.lifecycle.C60793b;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60751e;
import com.ss.android.vc.common.p3083e.C60774p;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.common.widget.LKVCJumpDialogController;
import com.ss.android.vc.common.widget.maxwidthdialog.LKVCJumpMaxWidthDialogController;
import com.ss.android.vc.dependency.AbstractC60908v;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.VCNotice;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCombinedInfo;
import com.ss.android.vc.entity.request.RecordMeetingEntityRequest;
import com.ss.android.vc.meeting.basedialog.FullScreen.AbstractC61214a;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61299g;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.framework.meeting.EventSource;
import com.ss.android.vc.meeting.framework.meeting.LifecycleActivity;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.vc.meeting.module.audio.MeetingAudioManager;
import com.ss.android.vc.meeting.module.fastentry.AbstractC61661d;
import com.ss.android.vc.meeting.module.floatingwindow.C61730c;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.multi.presenter.InMeetingPresenter;
import com.ss.android.vc.meeting.module.p3130k.C61999a;
import com.ss.android.vc.meeting.utils.C63492g;
import com.ss.android.vc.meeting.utils.ProximityUtil;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.p3069b.p3072c.C60675a;
import com.ss.android.vc.statistics.event.ay;
import com.ss.android.vc.trace.C63784a;
import com.ss.android.vcxp.C63801c;
import com.tt.frontendapiinterface.ApiHandler;
import io.reactivex.p3457e.C68296b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MeetingActivity extends LifecycleActivity implements AbstractC7710h, AbstractC36435f, AbstractC60908v.AbstractC60910b, AbstractC61299g, AbstractC61430j {

    /* renamed from: d */
    private static long f153980d;

    /* renamed from: c */
    public final String f153981c;

    /* renamed from: e */
    private boolean f153982e = true;

    /* renamed from: f */
    private String f153983f;

    /* renamed from: g */
    private InMeetingPresenter f153984g;

    /* renamed from: h */
    private List<AbstractC61214a> f153985h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private ExtensionActivityImpl f153986i;

    /* renamed from: j */
    private Dialog f153987j;

    /* renamed from: k */
    private Dialog f153988k;

    /* renamed from: l */
    private UDDialog f153989l;

    /* renamed from: m */
    private C61999a f153990m;

    /* renamed from: n */
    private MeetingAudioManager.AbstractC61403a f153991n;

    /* renamed from: o */
    private AbstractC36434e f153992o;

    /* renamed from: a */
    public void mo212769a(Intent intent) {
    }

    /* renamed from: a */
    public void mo212770a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.common.base.BaseActivity
    /* renamed from: e */
    public boolean mo208278e() {
        return false;
    }

    /* renamed from: l */
    public boolean mo212785l() {
        return false;
    }

    /* renamed from: n */
    public void mo212787n() {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingCombinedInfo(VideoChatCombinedInfo videoChatCombinedInfo) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onMeetingVideoChat(VideoChat videoChat) {
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61299g
    public void onStateTransform(int i, int i2, int i3) {
    }

    /* renamed from: p */
    public void mo212789p() {
    }

    /* renamed from: q */
    public void mo212790q() {
    }

    /* renamed from: r */
    public void mo212791r() {
    }

    /* renamed from: h */
    public C61999a mo212781h() {
        return this.f153990m;
    }

    /* renamed from: a */
    public boolean mo212775a(String str) {
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f153981c + ":init");
        String str2 = this.f153981c;
        C60700b.m235851b(str2, "[init]", "meetingId " + this.f153983f);
        C63784a.m250428a("[VideoChat_MeetingActivity_init]");
        bw_().init(str);
        bw_().addMeetingListener(this);
        if (mo212786m() == null) {
            C60700b.m235861e(this.f153981c, "[init2]", "meeting null!!!");
            return false;
        }
        C63784a.m250429b("[VideoChat_MeetingActivity_init]");
        TimeConsumeUtils.m248928a(a);
        return true;
    }

    /* renamed from: a */
    public void mo212772a(C61303k kVar, VCNotice vCNotice, String str) {
        this.f153987j = VCDialogUtils.m236165a((Context) this, Integer.valueOf((int) R.string.View_M_RecordingConsentTitle), 2, str, (int) R.string.View_M_LeaveMeetingShort, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(kVar) {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$miVyEE46QSot7K16wOWyppSZ4U */
            public final /* synthetic */ C61303k f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MeetingActivity.this.m239564b((MeetingActivity) this.f$1, (C61303k) dialogInterface, (DialogInterface) i);
            }
        }, (int) R.string.View_M_StayInMeetingShort, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(kVar) {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$gWC75gHvHhGppGwBe__QM62neHc */
            public final /* synthetic */ C61303k f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MeetingActivity.this.m239559a((MeetingActivity) this.f$1, (C61303k) dialogInterface, (DialogInterface) i);
            }
        }, false, (LKVCJumpDialogController.OnJumpListener) new LKVCJumpDialogController.OnJumpListener(vCNotice) {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$giovsRsEe0EKu3iUfGXWbSKM7ng */
            public final /* synthetic */ VCNotice f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.common.widget.LKVCJumpDialogController.OnJumpListener
            public final void onJump() {
                MeetingActivity.this.m239570c(this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo212773a(String str, String str2) {
        C61303k m = mo212786m();
        if (m != null && !TextUtils.isEmpty(str)) {
            m.ab().mo213862a(str, str2);
        }
    }

    /* renamed from: a */
    public void mo212774a(String str, boolean z) {
        Dialog dialog = this.f153988k;
        if (dialog != null && dialog.isShowing()) {
            if (z || !TextUtils.equals(str, m239556a(mo212786m().mo212096N()))) {
                this.f153988k.dismiss();
                this.f153988k = null;
                mo212786m().mo212150b((VCNotice) null);
            }
        }
    }

    @Override // com.ss.android.lark.p1786d.AbstractC36435f
    /* renamed from: a */
    public AbstractC36434e mo129674a() {
        if (this.f153992o == null) {
            this.f153992o = C36443k.m143598a(this);
        }
        return this.f153992o;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.meeting.LifecycleActivity
    /* renamed from: g */
    public void mo212039g() {
        if (mo212786m() != null) {
            mo212786m().mo212043a(this.f153546b);
        }
    }

    /* renamed from: i */
    public void mo212782i() {
        if (bw_() != null) {
            bw_().destroy();
        }
    }

    /* renamed from: j */
    public Fragment mo212783j() {
        return getSupportFragmentManager().findFragmentById(R.id.container_bytertc);
    }

    /* renamed from: m */
    public C61303k mo212786m() {
        return bw_().getMeeting();
    }

    /* renamed from: o */
    public void mo212788o() {
        C61303k m = mo212786m();
        if (m != null) {
            m.aF();
        }
    }

    /* renamed from: c */
    private void mo208257c() {
        C61303k m = mo212786m();
        if (m != null) {
            m.mo212105W().mo212820I().mo211735a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.AbstractC61430j
    public synchronized InMeetingPresenter bw_() {
        if (this.f153984g == null) {
            this.f153984g = new InMeetingPresenter();
        }
        return this.f153984g;
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.LifecycleActivity
    public void finish() {
        C60700b.m235851b(this.f153981c, "[finish]", Arrays.toString(new Throwable().getStackTrace()));
        super.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AbstractC61661d mo212784k() {
        if (mo212783j() == null || !(mo212783j() instanceof AbstractC61661d)) {
            return null;
        }
        return (AbstractC61661d) mo212783j();
    }

    /* renamed from: t */
    public void mo212793t() {
        Dialog dialog = this.f153987j;
        if (dialog != null && dialog.isShowing()) {
            this.f153987j.dismiss();
            this.f153987j = null;
        }
    }

    /* renamed from: v */
    public void mo212795v() {
        VCNotice O = mo212786m().mo212097O();
        if (O != null && this.f153989l == null) {
            m239557a(O.meetingEndTime, O.meetingEndReceiveTime);
        }
    }

    /* renamed from: w */
    public void mo212796w() {
        UDDialog uDDialog = this.f153989l;
        if (uDDialog != null && uDDialog.isShowing()) {
            this.f153989l.dismiss();
            this.f153989l = null;
            mo212786m().mo212156c((VCNotice) null);
        }
    }

    public MeetingActivity() {
        StringBuilder sb = new StringBuilder();
        sb.append("MeetingActivity@");
        long j = f153980d + 1;
        f153980d = j;
        sb.append(j);
        this.f153981c = sb.toString();
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        ExtensionActivityImpl extensionActivityImpl = this.f153986i;
        if (extensionActivityImpl != null && extensionActivityImpl.mo30094a()) {
            return;
        }
        if (this.f153985h.size() > 0) {
            List<AbstractC61214a> list = this.f153985h;
            list.get(list.size() - 1).bS_();
            return;
        }
        C61426f.m239679a(getSupportFragmentManager());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.meeting.LifecycleActivity, androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
        String str = this.f153981c;
        C60700b.m235851b(str, "[onPause]", "isSurvived = " + this.f153982e);
        MeetingAudioManager.m239471k().mo212693b(this.f153991n);
        ProximityUtil.m248871a(false);
        if (this.f153982e) {
            C61999a aVar = this.f153990m;
            if (aVar != null) {
                aVar.mo214620b(false);
            }
            mo212789p();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r1 = r0.mo212095M();
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo212792s() {
        /*
            r4 = this;
            com.ss.android.vc.meeting.framework.meeting.k r0 = r4.mo212786m()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.vc.entity.VCNotice r1 = r0.mo212095M()
            if (r1 == 0) goto L_0x0026
            android.app.Dialog r2 = r4.f153987j
            if (r2 == 0) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            com.ss.android.vc.entity.VcI18nKeyInfo r2 = r1.msg_i18n_key
            java.lang.String r2 = r2.newKey
            com.ss.android.vc.entity.VcI18nKeyInfo r3 = r1.msg_i18n_key
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.params
            com.ss.android.vc.net.request.VcBizTask r2 = com.ss.android.vc.net.request.VcBizSender.m249235b(r2, r3)
            com.ss.android.vc.meeting.module.base.MeetingActivity$2 r3 = new com.ss.android.vc.meeting.module.base.MeetingActivity$2
            r3.<init>(r0, r1)
            r2.mo219889a(r3)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.base.MeetingActivity.mo212792s():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r1 = r0.mo212096N();
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo212794u() {
        /*
            r4 = this;
            com.ss.android.vc.meeting.framework.meeting.k r0 = r4.mo212786m()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.vc.entity.VCNotice r1 = r0.mo212096N()
            if (r1 == 0) goto L_0x0026
            android.app.Dialog r2 = r4.f153988k
            if (r2 == 0) goto L_0x0012
            goto L_0x0026
        L_0x0012:
            com.ss.android.vc.entity.VcI18nKeyInfo r2 = r1.msg_i18n_key
            java.lang.String r2 = r2.newKey
            com.ss.android.vc.entity.VcI18nKeyInfo r3 = r1.msg_i18n_key
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.params
            com.ss.android.vc.net.request.VcBizTask r2 = com.ss.android.vc.net.request.VcBizSender.m249235b(r2, r3)
            com.ss.android.vc.meeting.module.base.MeetingActivity$3 r3 = new com.ss.android.vc.meeting.module.base.MeetingActivity$3
            r3.<init>(r0, r1)
            r2.mo219889a(r3)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.base.MeetingActivity.mo212794u():void");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.meeting.LifecycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onDestroy() {
        String str = this.f153981c;
        C60700b.m235851b(str, "[onDestroy]", " start isSurvived = " + this.f153982e);
        C60751e.m236074a(this);
        mo212782i();
        if (this.f153982e) {
            C61999a aVar = this.f153990m;
            if (aVar != null) {
                aVar.mo214611a();
            }
            mo212791r();
            C60790a.m236265a().mo208391b(this);
        }
        super.onDestroy();
        C60700b.m235851b(this.f153981c, "[onDestroy2]", "end");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.vc.common.base.BaseActivity
    public void onStart() {
        super.onStart();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f153981c + ":onStart");
        String str = this.f153981c;
        C60700b.m235851b(str, "[onStart]", "isSurvived = " + this.f153982e);
        C60675a.m235774e().mo208236b();
        C63784a.m250428a("[VideoChat_MeetingActivity2_onStart]");
        C48211b.m190251a().mo168689b("onStart");
        if (this.f153982e) {
            mo212788o();
            C60790a.m236265a().mo208390a(this);
        }
        C48211b.m190251a().mo168691c("onStart");
        C63784a.m250429b("[VideoChat_MeetingActivity2_onStart]");
        TimeConsumeUtils.m248928a(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        String str = this.f153981c;
        C60700b.m235851b(str, "[onStop]", "isSurvived = " + this.f153982e);
        if (this.f153982e) {
            mo212790q();
            if (C61730c.m240977a(this, mo212786m()) && !mo208256b()) {
                if ((mo212786m() != null && !mo212786m().aE().mo208293c()) || !(VCAppLifeCycle.m236256c() instanceof ByteRTCMeetingActivity)) {
                    mo212786m().at().mo213572a();
                }
                if (mo212786m() != null && !mo212786m().aE().mo208293c()) {
                    finish();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.framework.meeting.LifecycleActivity, androidx.fragment.app.FragmentActivity
    public void onResume() {
        super.onResume();
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f153981c + ":onResume");
        String str = this.f153981c;
        C60700b.m235851b(str, "[onResume]", "isSurvived = " + this.f153982e);
        C63784a.m250428a("[VideoChat_MeetingActivity2_onResume]");
        C48211b.m190251a().mo168689b("onResume");
        ProximityUtil.m248869a(this, mo212786m());
        if (this.f153991n == null) {
            this.f153991n = new MeetingAudioManager.AbstractC61403a() {
                /* class com.ss.android.vc.meeting.module.base.MeetingActivity.C614111 */

                @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
                public void onAudioStateUnchanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
                }

                @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
                public void onAudioMuted() {
                    C60738ac.m236037c((int) R.string.View_MV_MutedNoTalk_Toast);
                }

                @Override // com.ss.android.vc.meeting.module.audio.MeetingAudioManager.AbstractC61403a
                public void onAudioStateChanged(MeetingAudioManager.AudioType audioType, boolean z, boolean z2) {
                    MeetingActivity meetingActivity = MeetingActivity.this;
                    ProximityUtil.m248869a(meetingActivity, meetingActivity.mo212786m());
                }
            };
        }
        MeetingAudioManager.m239471k().mo212685a(this.f153991n);
        if (this.f153982e) {
            C61999a aVar = this.f153990m;
            if (aVar != null) {
                aVar.mo214620b(true);
            }
            mo212787n();
        }
        mo212792s();
        mo212794u();
        mo208257c();
        mo212795v();
        C48211b.m190251a().mo168691c("onResume");
        C63784a.m250429b("[VideoChat_MeetingActivity2_onResume]");
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: b */
    private boolean mo208256b() {
        if (!C28460b.m104296a(this) || mo212786m().mo212062k() || !mo212785l()) {
            return false;
        }
        if (mo212786m() != null && !mo212786m().aE().mo208293c()) {
            finish();
        }
        C60700b.m235851b(this.f153981c, "[onStop]", "goto floatwindow");
        return true;
    }

    /* renamed from: b */
    public void mo212776b(AbstractC61214a aVar) {
        this.f153985h.remove(aVar);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onConfigurationChanged(Configuration configuration) {
        ExtensionActivityImpl extensionActivityImpl = this.f153986i;
        if (extensionActivityImpl != null) {
            extensionActivityImpl.mo30092a(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    /* renamed from: a */
    private String m239556a(VCNotice vCNotice) {
        if (vCNotice == null || vCNotice.extra == null) {
            return null;
        }
        return vCNotice.extra.get("share_id");
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ExtensionActivityImpl extensionActivityImpl = this.f153986i;
        if (extensionActivityImpl == null || !extensionActivityImpl.mo30095a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ExtensionActivityImpl extensionActivityImpl = this.f153986i;
        if (extensionActivityImpl == null || !extensionActivityImpl.mo30096a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f153981c + ":onNewIntent");
        if (this.f153982e) {
            mo212769a(intent);
        }
        TimeConsumeUtils.m248928a(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239563b(VCNotice vCNotice) {
        VcI18nKeyInfo vcI18nKeyInfo = vCNotice.msg_i18n_key;
        if (vcI18nKeyInfo.type == VcI18nKeyInfo.Type.SCHEME_JUMP) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(vcI18nKeyInfo.jumpScheme)));
                mo208256b();
            } catch (Exception e) {
                e.printStackTrace();
                String str = this.f153981c;
                C60700b.m235864f(str, "[showMagicShareDialog]", "showTips startActivity" + vcI18nKeyInfo.jumpScheme);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m239570c(VCNotice vCNotice) {
        VcI18nKeyInfo vcI18nKeyInfo = vCNotice.msg_i18n_key;
        if (vcI18nKeyInfo.type == VcI18nKeyInfo.Type.SCHEME_JUMP) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(vcI18nKeyInfo.jumpScheme)));
                mo208256b();
            } catch (Exception e) {
                e.printStackTrace();
                String str = this.f153981c;
                C60700b.m235864f(str, "[showDialog]", "showTips startActivity" + vcI18nKeyInfo.jumpScheme);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.ss.android.vc.meeting.framework.meeting.LifecycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.vc.common.base.BaseActivity
    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        C68296b<Boolean> a = TimeConsumeUtils.m248927a(this.f153981c + ":onCreate");
        this.f153982e = m239567b(bundle);
        String str2 = this.f153981c;
        C60700b.m235851b(str2, "[onCreate]", "isSurvived = " + this.f153982e);
        C63784a.m250428a("[VideoChat_MeetingActivity2_onCreate]");
        getWindow().getDecorView();
        super.onCreate(bundle);
        if (!this.f153982e) {
            super.finish();
            return;
        }
        C48211b.m190252a(getClass().getSimpleName()).mo168688b();
        Intent intent = getIntent();
        if (!DesktopUtil.m144307b()) {
            if (intent.getBooleanExtra("key_is_from_float", false) || intent.getBooleanExtra("is_from_float", false) || intent.getBooleanExtra("key_meeting_is_from_float", false)) {
                z = true;
            } else {
                z = false;
            }
            str = String.format("onCreate(isFromFloat=%b)", Boolean.valueOf(z));
        } else {
            str = "onCreate";
        }
        C68296b<Boolean> a2 = TimeConsumeUtils.m248927a(this.f153981c + ":PageLoadMonitor.pageSpanStart");
        C48211b.m190251a().mo168689b(str);
        TimeConsumeUtils.m248928a(a2);
        C68296b<Boolean> a3 = TimeConsumeUtils.m248927a(this.f153981c + ":followSdk.docActivityExt");
        this.f153986i = VideoChatModuleDependency.getDocsDependency().mo196380c().mo196382a((AppCompatActivity) this);
        TimeConsumeUtils.m248928a(a3);
        String stringExtra = intent.getStringExtra("key_meeing_id");
        this.f153983f = stringExtra;
        this.f153982e = mo212775a(stringExtra);
        String str3 = this.f153981c;
        C60700b.m235851b(str3, "[onCreate2]", "isSurvived = " + this.f153982e);
        if (this.f153982e) {
            C68296b<Boolean> a4 = TimeConsumeUtils.m248927a(this.f153981c + ":orientationHelper.lockPortrait");
            C61999a aVar = new C61999a((Activity) this);
            this.f153990m = aVar;
            aVar.mo214617b();
            TimeConsumeUtils.m248928a(a4);
            mo212770a(bundle);
        } else {
            super.finish();
        }
        MeetingCheckUtils.m248887a();
        C48211b.m190251a().mo168691c(str);
        C63784a.m250429b("[VideoChat_MeetingActivity2_onCreate]");
        TimeConsumeUtils.m248928a(a);
    }

    /* renamed from: b */
    private boolean m239567b(Bundle bundle) {
        if (bundle != null) {
            try {
                if (bundle.get("android:support:fragments") != null) {
                    C60700b.m235851b(this.f153981c, "[clearFragmentRestore]", "fase");
                    bundle.putParcelable("android:support:fragments", null);
                    return false;
                }
            } catch (Exception e) {
                C60700b.m235864f(this.f153981c, "[clearFragmentRestore2]", ApiHandler.API_CALLBACK_EXCEPTION);
                e.printStackTrace();
            }
        }
        C60700b.m235851b(this.f153981c, "[clearFragmentRestore3]", "true");
        return true;
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7710h
    /* renamed from: a */
    public <T> T mo17222a(Class<T> cls) {
        ExtensionActivityImpl extensionActivityImpl = this.f153986i;
        if (extensionActivityImpl == null) {
            return null;
        }
        return (T) extensionActivityImpl.mo17222a(cls);
    }

    /* renamed from: a */
    public void mo212771a(AbstractC61214a aVar) {
        if (this.f153985h.contains(aVar)) {
            C60700b.m235851b(this.f153981c, "[registerBackPressedHandler]", "already register");
        } else {
            this.f153985h.add(aVar);
        }
    }

    /* renamed from: b */
    public void mo212778b(String str) {
        C61303k m = mo212786m();
        if (m != null && !TextUtils.isEmpty(str)) {
            C60735ab.m236001a(new Runnable(str) {
                /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$a4VWerYUdQdO0fWaBQP5Losz8_w */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    MeetingActivity.m239561a(C61303k.this, this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m239561a(C61303k kVar, String str) {
        kVar.al().mo213167a(str);
    }

    @Override // com.ss.android.vc.dependency.AbstractC60908v.AbstractC60910b
    public void onAppLifecycleChanged(C60793b bVar, C60793b bVar2) {
        if (!bVar2.f152000b || !C63801c.m250500a(bVar2.f151999a)) {
            mo208256b();
        }
    }

    /* renamed from: a */
    private void m239557a(long j, long j2) {
        this.f153989l = VCDialogUtils.m236203a(this, j, j2, new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$9nGW5HEwN4hd5rPs8Qr4WwOEkyA */

            public final void onClick(DialogInterface dialogInterface, int i) {
                MeetingActivity.this.m239569c(dialogInterface, i);
            }
        }, new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$ZpO2YIgmRXL43cV79J0A8OvZW8 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                MeetingActivity.this.m239562b((MeetingActivity) dialogInterface, (DialogInterface) i);
            }
        }, new DialogInterface.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$3t0EpVNsxf5BXcN8Y29Wpj0vmo */

            public final void onClick(DialogInterface dialogInterface, int i) {
                MeetingActivity.this.m239558a((MeetingActivity) dialogInterface, (DialogInterface) i);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239562b(DialogInterface dialogInterface, int i) {
        mo212786m().mo212051a(C61344j.m239002a().mo212329a(99).mo212331a(EventSource.EVENT_DIALOG));
        mo212796w();
        C60738ac.m236031a(getString(R.string.View_M_YouEndedMeeting), 1000L);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m239569c(DialogInterface dialogInterface, int i) {
        VcBizSender.m249283g(mo212786m().mo212055d(), new AbstractC63598b<Object>() {
            /* class com.ss.android.vc.meeting.module.base.MeetingActivity.C614144 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60700b.m235864f(MeetingActivity.this.f153981c, "showAutoEndConfirmDialog", "keep meeting onSuccess");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                String str = MeetingActivity.this.f153981c;
                C60700b.m235864f(str, "showAutoEndConfirmDialog", "keep meeting onError error=" + eVar.toString());
            }
        });
        mo212796w();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m239558a(DialogInterface dialogInterface, int i) {
        mo212786m().mo212051a(C61344j.m239002a().mo212329a(SmEvents.EVENT_AUTO_END).mo212331a(EventSource.EVENT_DIALOG));
        mo212796w();
        C60738ac.m236031a(getString(R.string.View_MV_AutoEnd_MobileToast), 1000L);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = this.f153981c;
        C60700b.m235851b(str, "[onActivityResult]", i + " " + i2);
        bw_().onActivityResult(i, i2, intent);
        ExtensionActivityImpl extensionActivityImpl = this.f153986i;
        if (extensionActivityImpl != null) {
            extensionActivityImpl.mo30091a(i, i2, intent);
        }
        LabsUtils.m242894a(i, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m239559a(C61303k kVar, DialogInterface dialogInterface, int i) {
        ay.m250130a(kVar.mo212056e(), true);
        VcBizSender.m249166a(kVar.mo212055d(), RecordMeetingEntityRequest.Action.PARTICIPANT_CONSENT_STAY, (ByteviewUser) null, C60774p.m236129a()).mo219896d();
        kVar.mo212109a((VCNotice) null);
        this.f153987j = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239564b(C61303k kVar, DialogInterface dialogInterface, int i) {
        ay.m250130a(kVar.mo212056e(), false);
        kVar.mo212109a((VCNotice) null);
        this.f153987j = null;
        VcBizSender.m249166a(kVar.mo212055d(), RecordMeetingEntityRequest.Action.PARTICIPANT_CONSENT_LEAVE, (ByteviewUser) null, C60774p.m236129a()).mo219896d();
        C60700b.m235841a(kVar.mo212056e(), "UI", "StateEngine", "clickLeftMeeting", this.f153981c, "clickLeftMeetingButton");
        C63492g.m248824b(true, Boolean.valueOf(kVar.mo212092J().mo212512I()));
        kVar.mo212051a(C61344j.m239002a().mo212329a(103).mo212331a(EventSource.EVENT_DIALOG));
    }

    /* renamed from: b */
    public void mo212777b(C61303k kVar, VCNotice vCNotice, String str) {
        this.f153988k = VCDialogUtils.m236168a((Context) this, str, (int) R.string.View_N_Cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(kVar, vCNotice) {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$HoHHYpfEnrKSGxZ8V6eqSjzJQIQ */
            public final /* synthetic */ C61303k f$1;
            public final /* synthetic */ VCNotice f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MeetingActivity.this.m239565b(this.f$1, this.f$2, dialogInterface, i);
            }
        }, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(kVar, vCNotice) {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$u6UZLHCQyXRFpMJR4HEFHHYuthA */
            public final /* synthetic */ C61303k f$1;
            public final /* synthetic */ VCNotice f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MeetingActivity.this.m239560a(this.f$1, this.f$2, dialogInterface, i);
            }
        }, false, (LKVCJumpMaxWidthDialogController.OnJumpListener) new LKVCJumpMaxWidthDialogController.OnJumpListener(vCNotice) {
            /* class com.ss.android.vc.meeting.module.base.$$Lambda$MeetingActivity$8N7OKlfKelTyjMvp4j0kcwBwRk */
            public final /* synthetic */ VCNotice f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.vc.common.widget.maxwidthdialog.LKVCJumpMaxWidthDialogController.OnJumpListener
            public final void onJump() {
                MeetingActivity.this.m239563b((MeetingActivity) this.f$1);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m239565b(C61303k kVar, VCNotice vCNotice, DialogInterface dialogInterface, int i) {
        kVar.mo212150b((VCNotice) null);
        this.f153988k = null;
        VcBizSender.m249137a(2, kVar.mo212055d(), vCNotice.messageId).mo219896d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m239560a(C61303k kVar, VCNotice vCNotice, DialogInterface dialogInterface, int i) {
        VcBizSender.m249137a(1, kVar.mo212055d(), vCNotice.messageId).mo219896d();
        kVar.mo212150b((VCNotice) null);
        this.f153988k = null;
    }
}
