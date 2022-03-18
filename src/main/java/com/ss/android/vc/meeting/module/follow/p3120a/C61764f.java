package com.ss.android.vc.meeting.module.follow.p3120a;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.base.content.AbstractC61423b;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.follow.p3122c.C61799d;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event2.MeetingMagicShareEvent;

/* renamed from: com.ss.android.vc.meeting.module.follow.a.f */
public class C61764f extends C61756a implements AbstractC61769l {

    /* renamed from: c */
    private String f154993c;

    /* renamed from: d */
    private C61763e f154994d;

    /* renamed from: e */
    private Context f154995e;

    /* renamed from: f */
    private UDDialog f154996f;

    /* renamed from: g */
    private C61303k f154997g;

    /* renamed from: h */
    private AbstractC61423b f154998h;

    /* renamed from: i */
    private AbstractC61751a.AbstractC61753b f154999i;

    /* renamed from: j */
    private ViewGroup f155000j;

    /* renamed from: k */
    private ViewGroup f155001k;

    /* renamed from: l */
    private boolean f155002l;

    /* renamed from: m */
    private DialogInterface.OnClickListener f155003m = new DialogInterface.OnClickListener() {
        /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$f$26Y5iyeEwhwRpQVvMRxLWdVh4w4 */

        public final void onClick(DialogInterface dialogInterface, int i) {
            C61764f.lambda$26Y5iyeEwhwRpQVvMRxLWdVh4w4(C61764f.this, dialogInterface, i);
        }
    };

    /* renamed from: n */
    private DialogInterface.OnClickListener f155004n = new DialogInterface.OnClickListener() {
        /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$f$Di5IuZlOUUlxnD85EQyVFbDwfk */

        public final void onClick(DialogInterface dialogInterface, int i) {
            C61764f.m271251lambda$Di5IuZlOUUlxnD85EQyVFbDwfk(C61764f.this, dialogInterface, i);
        }
    };

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: d */
    public boolean mo213981d() {
        return this.f155002l;
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: k */
    public C61303k mo213988k() {
        return this.f154997g;
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: f */
    public void mo213983f() {
        C61763e eVar = this.f154994d;
        if (eVar != null) {
            eVar.mo213964a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: h */
    public void mo213985h() {
        this.f154994d.mo213968b();
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: a */
    public void mo213973a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f155000j;
        if (viewGroup2 != null && (viewGroup = this.f155001k) != null) {
            viewGroup2.removeView(viewGroup);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: j */
    public void mo213987j() {
        UDDialog uDDialog = this.f154996f;
        if (uDDialog != null) {
            uDDialog.dismiss();
            this.f154996f = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m241194q() {
        C61763e eVar = this.f154994d;
        eVar.mo213966a(UIHelper.getString(R.string.View_VM_YouAreViewing) + this.f154993c);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m241195r() {
        this.f154994d.mo213966a(UIHelper.mustacheFormat((int) R.string.View_VM_YouAreSharingFileName, "fileName", this.f154993c));
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: g */
    public void mo213984g() {
        this.f154994d.mo213967a(false);
        this.f154994d.mo213969b(this.f154997g.ab().mo213896v());
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: m */
    public void mo213990m() {
        m241193p();
        C63742at.m250090d(mo213988k().mo212056e(), mo213988k().ab().mo213882h());
        MeetingMagicShareEvent.m249817a().mo220297a("take_control", null, Boolean.valueOf(this.f154997g.ab().mo213889o()), null, this.f154997g.mo212056e(), null);
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: b */
    public void mo213978b() {
        if (!(this.f154997g.mo212056e() == null || this.f154997g.mo212056e().getVideoChatSettings() == null || this.f154997g.mo212056e().getVideoChatSettings().getSubType() != VideoChatSettings.SubType.SCREEN_SHARE)) {
            this.f154997g.ah().mo219482b();
        }
        if (this.f154961b == null) {
            C60700b.m235864f("FollowLog_FollowToolbarViewControl", "[stopShare]", "failed. followControl is null");
            return;
        }
        this.f154961b.mo213885k();
        C63742at.m250076b(this.f154997g.mo212056e(), this.f154997g.ab().mo213882h());
        MeetingMagicShareEvent.m249817a().mo220297a("stop_sharing", null, Boolean.valueOf(this.f154997g.ab().mo213889o()), null, this.f154997g.mo212056e(), null);
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: c */
    public void mo213980c() {
        if (this.f154961b == null) {
            C60700b.m235864f("FollowLog_FollowToolbarViewControl", "[toPresenter]", "failed. followControl is null");
            return;
        }
        this.f154961b.mo213887m();
        C63742at.m250085c(this.f154997g.mo212056e(), this.f154997g.ab().mo213882h());
        MeetingMagicShareEvent.m249817a().mo220297a("follow", null, Boolean.valueOf(this.f154997g.ab().mo213889o()), null, this.f154997g.mo212056e(), null);
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: e */
    public void mo213982e() {
        FollowInfo followInfo;
        if (this.f154961b == null) {
            C60700b.m235864f("FollowLog_FollowToolbarViewControl", "[popBack]", "failed. followControl is null");
            return;
        }
        this.f154961b.mo213886l();
        if (this.f154961b.mo213889o() || this.f154961b.mo213881g() == null) {
            followInfo = this.f154961b.mo213882h();
        } else {
            followInfo = this.f154961b.mo213881g();
        }
        C63742at.m250061a(this.f154997g.mo212056e(), followInfo, this.f154997g.ab().mo213889o() ? 1 : 0);
        MeetingMagicShareEvent.m249817a().mo220297a("backward", null, Boolean.valueOf(this.f154997g.ab().mo213889o()), null, this.f154997g.mo212056e(), null);
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: i */
    public void mo213986i() {
        if (this.f154961b == null) {
            C60700b.m235864f("FollowLog_FollowToolbarViewControl", "[processFreeBrowse]", "followControl is null");
        }
        if (!this.f154961b.mo213889o()) {
            this.f154961b.mo213888n();
            FollowInfo h = this.f154961b.mo213882h();
            if (!(h == null || h.getShareType() == FollowInfo.ShareType.UNIVERSAL)) {
                this.f154994d.mo213969b(true);
                this.f154999i.mo213915a().mo213963b(this.f155000j);
            }
            if (!this.f154961b.mo213896v()) {
                C63742at.m250100h(this.f154997g.mo212056e(), h);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: l */
    public void mo213989l() {
        FollowInfo followInfo;
        mo213988k().ab().mo213879e();
        if (mo213988k().ab().mo213889o() || mo213988k().ab().mo213881g() == null) {
            followInfo = mo213988k().ab().mo213882h();
        } else {
            followInfo = mo213988k().ab().mo213881g();
        }
        C63742at.m250077b(mo213988k().mo212056e(), followInfo, mo213988k().ab().mo213889o() ? 1 : 0);
        MeetingMagicShareEvent.m249817a().mo220297a("reload", null, Boolean.valueOf(this.f154997g.ab().mo213889o()), null, mo213988k().mo212056e(), null);
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: n */
    public void mo213991n() {
        C60700b.m235851b("FollowLog_FollowToolbarViewControl", "[transPresenter]", "isDocSharing:" + mo213988k().ab().mo213880f());
        C61799d.m241431a((Activity) this.f154995e, mo213988k()).mo211606a();
        MeetingMagicShareEvent.m249817a().mo220297a("pass_sharing", null, Boolean.valueOf(this.f154997g.ab().mo213889o()), null, mo213988k().mo212056e(), null);
    }

    /* renamed from: p */
    private void m241193p() {
        String str;
        FollowInfo h = this.f154997g.ab().mo213882h();
        if (h == null) {
            C60700b.m235861e("FollowLog_FollowToolbarViewControl", "[takeControl]", "fail because followinfo is null");
        } else if (this.f154997g.mo212091I().mo212494b().mo212605j().isHostOrCoHost() || this.f154997g.mo212058g() != VideoChat.Type.MEET || (!this.f154997g.mo212056e().getVideoChatSettings().getOnlyHostCanShare() && !this.f154997g.mo212056e().getVideoChatSettings().getOnlyHostCanReplaceShare())) {
            String docTitle = h.getDocTitle();
            if (TextUtils.isEmpty(docTitle)) {
                docTitle = h.getUrl();
            }
            if (h.getShareType() == FollowInfo.ShareType.CCM || h.getShareType() == FollowInfo.ShareType.GOOGLE) {
                str = UIHelper.mustacheFormat((int) R.string.View_VM_YouWillTakeOverSharingFileNameTitle, "fileName", docTitle);
            } else {
                str = UIHelper.mustacheFormat((int) R.string.View_VM_YouWillTakeOverSharingWebPageNameTitle, "webPageName", docTitle);
            }
            Participant j = this.f154997g.mo212091I().mo212494b().mo212605j();
            if (j != null && j.getCapabilities() != null) {
                if (C61806b.m241472a(h, j)) {
                    if (this.f154996f == null) {
                        this.f154996f = VCDialogUtils.m236205a(this.f154995e, (View) null, str, 3, (Integer) null, (int) R.string.View_G_CancelButton, this.f155003m, (int) R.string.View_G_ConfirmButton, this.f155004n, false);
                    }
                    this.f154996f.show();
                    return;
                }
                C60738ac.m236037c((int) R.string.View_VM_YouCanNotTakeControl);
            }
        } else {
            C60738ac.m236023a((int) R.string.View_M_UnableToTakeControl);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: o */
    public void mo213992o() {
        FollowInfo followInfo;
        ClipboardManager clipboardManager = (ClipboardManager) ar.m236694a().getSystemService("clipboard");
        if (mo213988k().ab().mo213889o() || mo213988k().ab().mo213881g() == null) {
            followInfo = mo213988k().ab().mo213882h();
        } else {
            followInfo = mo213988k().ab().mo213881g();
        }
        if (followInfo == null) {
            C60700b.m235861e("FollowLog_FollowToolbarViewControl", "[initTitleBar]", "followInfo is null");
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("followUrl", followInfo.getRawUrl()));
        if (followInfo.getShareType() == FollowInfo.ShareType.CCM || followInfo.getShareType() == FollowInfo.ShareType.GOOGLE) {
            C60738ac.m236029a(UIHelper.getString(R.string.View_VM_FileLinkCopied));
        } else {
            C60738ac.m236029a(UIHelper.getString(R.string.View_VM_WebPageLinkCopied));
        }
        C63742at.m250060a(mo213988k().mo212056e(), followInfo);
        MeetingMagicShareEvent.m249817a().mo220298a(C57859q.m224565a(followInfo.getToken()), mo213988k().ab().mo213889o(), mo213988k().mo212056e());
    }

    /* renamed from: a */
    public void mo213974a(int i) {
        this.f154994d.mo213965a(i);
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: b */
    public void mo213979b(boolean z) {
        this.f154994d.mo213971c(z);
        mo213975a((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241189a(VideoChatUser videoChatUser) {
        C61763e eVar = this.f154994d;
        eVar.mo213966a(UIHelper.mustacheFormat((int) R.string.View_VM_NameIsSharing, "name", C60733aa.m235991b(videoChatUser.getId(), videoChatUser.getName())) + this.f154993c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241190a(Integer num) {
        mo213974a(num.intValue());
        if (this.f154999i.mo213915a() != null) {
            this.f154999i.mo213915a().mo213960a(this.f155000j);
        }
    }

    /* renamed from: c */
    private void m241192c(boolean z) {
        double d;
        C61763e eVar;
        C60700b.m235851b("FollowLog_FollowToolbarViewControl", "[initToolbar]", "isLandscape=:" + z);
        if (z) {
            this.f155001k = (RelativeLayout) LayoutInflater.from(ar.m236698c()).inflate(R.layout.follow_action_toolbar_landscape_layout, (ViewGroup) null, false);
            d = 36.0d;
        } else {
            this.f155001k = (ConstraintLayout) LayoutInflater.from(ar.m236698c()).inflate(R.layout.follow_action_toolbar_agent_layout, (ViewGroup) null, false);
            d = 40.0d;
        }
        if (this.f155001k != null) {
            this.f155000j.removeAllViews();
            this.f155001k.setMinimumHeight(C60773o.m236115a(d));
            this.f155000j.addView(this.f155001k, new FrameLayout.LayoutParams(-1, UIHelper.dp2px((float) d)));
        }
        this.f154994d = new C61763e(this.f154995e, this.f155000j, this);
        mo213979b(this.f154997g.ab().mo213889o());
        this.f154994d.setTopBtnMinWidth(z);
        if (DesktopUtil.m144307b() && (eVar = this.f154994d) != null) {
            eVar.mo213970c();
        }
        mo213988k().ab().mo213895u().mo5923a(this.f154998h.mo212890v(), new AbstractC1178x() {
            /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$f$AMO4L5KdrZjQePiSQEXeNwA8A */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C61764f.m271250lambda$AMO4L5KdrZjQePiSQEXeNwA8A(C61764f.this, (Integer) obj);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: a */
    public void mo213975a(String str) {
        FollowInfo h = this.f154997g.ab().mo213882h();
        if (h != null && this.f154994d != null) {
            if (TextUtils.isEmpty(str)) {
                str = this.f154997g.ab().mo213891q();
            }
            this.f154993c = str;
            if (this.f154997g.ab().mo213889o()) {
                C26171w.m94675a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$f$bn3BbySEwa85vB_TGWwz9W9vniA */

                    public final void run() {
                        C61764f.lambda$bn3BbySEwa85vB_TGWwz9W9vniA(C61764f.this);
                    }
                });
            } else if (this.f154997g.ab().mo213881g() != null) {
                C26171w.m94675a(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$f$OHeA1cEB_Mk3BVgpKMELmWJNVZw */

                    public final void run() {
                        C61764f.lambda$OHeA1cEB_Mk3BVgpKMELmWJNVZw(C61764f.this);
                    }
                });
            } else {
                UserInfoService.getUserInfoById(this.f154997g.mo212055d(), h.getUserId(), h.getUserType(), new GetUserInfoListener() {
                    /* class com.ss.android.vc.meeting.module.follow.p3120a.$$Lambda$f$kh2TnZrlYm6nf_Nvmj8J4AZlETc */

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C61764f.lambda$kh2TnZrlYm6nf_Nvmj8J4AZlETc(C61764f.this, videoChatUser);
                    }
                });
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: a */
    public void mo213976a(boolean z) {
        this.f154994d.mo213969b(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241188a(DialogInterface dialogInterface, int i) {
        this.f154997g.ab().mo213864a(true);
        C63742at.m250096f(this.f154997g.mo212056e(), this.f154997g.ab().mo213882h());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m241191b(DialogInterface dialogInterface, int i) {
        C63742at.m250093e(this.f154997g.mo212056e(), this.f154997g.ab().mo213882h());
    }

    @Override // com.ss.android.vc.meeting.module.follow.p3120a.AbstractC61769l
    /* renamed from: a */
    public void mo213977a(boolean z, boolean z2) {
        this.f155002l = z;
        C61763e eVar = this.f154994d;
        if (eVar != null) {
            eVar.mo213964a();
        }
        m241192c(z);
    }

    public C61764f(Context context, C61303k kVar, ViewGroup viewGroup, AbstractC61423b bVar, AbstractC61751a.AbstractC61753b bVar2) {
        super(kVar);
        this.f154997g = kVar;
        this.f154995e = context;
        this.f155000j = viewGroup;
        this.f154998h = bVar;
        this.f154999i = bVar2;
        m241192c(false);
    }
}
