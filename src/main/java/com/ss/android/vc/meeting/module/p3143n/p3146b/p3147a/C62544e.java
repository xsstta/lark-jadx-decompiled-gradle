package com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantSettings;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62544e;
import com.ss.android.vc.meeting.module.searchInvite.C62927f;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.ax;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.n.b.a.e */
public class C62544e implements AbstractC62532b<SearchParticipantInfo, C62548f> {

    /* renamed from: a */
    public Context f157397a;

    /* renamed from: b */
    public C61303k f157398b;

    /* renamed from: c */
    private C62927f.AbstractC62932a f157399c;

    /* renamed from: d */
    private void m244627d(C62548f fVar, SearchParticipantInfo searchParticipantInfo) {
        Participant participant = searchParticipantInfo.getParticipant();
        mo216261a(fVar, searchParticipantInfo.getTitle(), participant, participant.isGuest());
    }

    /* renamed from: b */
    private void m244625b(C62548f fVar, SearchParticipantInfo searchParticipantInfo) {
        int i;
        fVar.f157417k.setVisibility(0);
        fVar.f157417k.setBackground(null);
        fVar.f157417k.setTextColor(C60773o.m236126d(R.color.ud_N500));
        TextView textView = fVar.f157417k;
        if (searchParticipantInfo.getParticipant().getStatus() == Participant.Status.ON_THE_CALL) {
            i = R.string.View_M_JoinedButton;
        } else {
            i = R.string.View_G_Calling;
        }
        textView.setText(i);
    }

    /* renamed from: e */
    private void m244628e(C62548f fVar, final SearchParticipantInfo searchParticipantInfo) {
        int i;
        if (searchParticipantInfo.getParticipantType() == ParticipantType.ROOM) {
            i = 96;
        } else {
            i = 48;
        }
        C60783v.m236230a(searchParticipantInfo.getAvatarKey(), searchParticipantInfo.getId(), searchParticipantInfo.getParticipantType(), fVar.f157408b, i, i);
        fVar.f157408b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62544e.C625473 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (searchParticipantInfo.getByteviewUser() != null && C63497j.m248860d(C62544e.this.f157398b, searchParticipantInfo.getByteviewUser())) {
                    ax.m250129b(C62544e.this.f157398b.mo212056e(), searchParticipantInfo.getByteviewUser().getUserId(), searchParticipantInfo.getByteviewUser().getDeviceId());
                    C63497j.m248853a((Activity) C62544e.this.f157397a, C62544e.this.f157398b, searchParticipantInfo.getByteviewUser());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo216246a(final C62548f fVar, final SearchParticipantInfo searchParticipantInfo) {
        fVar.f157418l.setVisibility(8);
        fVar.f157407a.setVisibility(8);
        fVar.f157415i.setVisibility(8);
        fVar.f157416j.setVisibility(8);
        m244628e(fVar, searchParticipantInfo);
        m244627d(fVar, searchParticipantInfo);
        m244626c(fVar, searchParticipantInfo);
        m244625b(fVar, searchParticipantInfo);
        if (searchParticipantInfo.getParticipant().getParticipantType() != ParticipantType.LARK_USER || searchParticipantInfo.getParticipant().isGuest()) {
            UserInfoService.getUserInfoById(this.f157398b.mo212055d(), searchParticipantInfo.getParticipant().getId(), searchParticipantInfo.getParticipant().getParticipantType(), new GetUserInfoListener() {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62544e.C625451 */

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public void onGetUserInfo(VideoChatUser videoChatUser) {
                    fVar.f157411e.post(new Runnable(videoChatUser, searchParticipantInfo, fVar) {
                        /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$e$1$PoV78P8GzIm4jFK991fZ7z9HnQ0 */
                        public final /* synthetic */ VideoChatUser f$1;
                        public final /* synthetic */ SearchParticipantInfo f$2;
                        public final /* synthetic */ C62548f f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        public final void run() {
                            C62544e.C625451.this.m244632a(this.f$1, this.f$2, this.f$3);
                        }
                    });
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m244632a(VideoChatUser videoChatUser, SearchParticipantInfo searchParticipantInfo, C62548f fVar) {
                    String str;
                    if (!TextUtils.isEmpty(videoChatUser.getNickname())) {
                        str = videoChatUser.getNickname();
                    } else {
                        str = videoChatUser.getName();
                    }
                    searchParticipantInfo.setTitle(str);
                    C62544e.this.mo216261a(fVar, str, searchParticipantInfo.getParticipant(), searchParticipantInfo.getParticipant().isGuest());
                    C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), searchParticipantInfo.getParticipant().getParticipantType(), fVar.f157408b, 160, 160);
                }
            });
        }
    }

    /* renamed from: c */
    private void m244626c(final C62548f fVar, SearchParticipantInfo searchParticipantInfo) {
        Participant participant = searchParticipantInfo.getParticipant();
        ParticipantSettings participantSettings = participant.getParticipantSettings();
        InMeetingData.ScreenSharedData f = this.f157398b.mo212091I().mo212490a().mo212474f();
        int i = 0;
        if (f == null || !ParticipantUtil.m248717a(participant, f.getParticipantId(), f.getParticipantDeviceId(), f.getParticipantType())) {
            fVar.f157419m.setVisibility(8);
        } else {
            fVar.f157419m.setVisibility(0);
        }
        boolean is_host = this.f157398b.mo212091I().mo212494b().mo212605j().is_host();
        boolean isCoHost = this.f157398b.mo212091I().mo212494b().mo212605j().isCoHost();
        if (participantSettings.getHandsStatus() == ParticipantSettings.HandsStatus.PUT_UP) {
            fVar.f157414h.setVisibility(0);
            if (is_host || isCoHost) {
                fVar.f157409c.setVisibility(0);
            } else {
                fVar.f157409c.setVisibility(8);
            }
        } else {
            fVar.f157414h.setVisibility(8);
            fVar.f157409c.setVisibility(8);
        }
        if (C60938g.m237062b(participant)) {
            VcBizSender.m249235b(participant.getParticipantSettings().getInterpreterSetting().interpretingLanguage.despI18nKey, (Map<String, String>) null).mo219889a(new AbstractC63598b<String>() {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62544e.C625462 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("SearchParticipantOutMeetingItemBinder", "[bindInterpretationView2]", "getViewI18nTemplate onError:" + eVar);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    C60700b.m235851b("SearchParticipantOutMeetingItemBinder", "[bindInterpretationView1] ", "getViewI18nTemplate onSuccess:" + str);
                    String mustacheFormat = UIHelper.mustacheFormat((int) R.string.View_G_InterpreterLanguage_Status, "interpreter_language", str);
                    fVar.f157424r.setVisibility(0);
                    fVar.f157424r.setText(mustacheFormat);
                }
            });
        } else {
            fVar.f157424r.setVisibility(8);
        }
        boolean isCoHost2 = participant.isCoHost();
        boolean is_host2 = participant.is_host();
        if (isCoHost2 || is_host2) {
            fVar.f157413g.setVisibility(0);
            if (isCoHost2) {
                fVar.f157413g.setText(R.string.View_M_CoHost);
            } else {
                fVar.f157413g.setText(R.string.View_M_Host);
            }
        } else {
            fVar.f157413g.setVisibility(8);
        }
        View view = fVar.f157423q;
        if (!ParticipantUtil.m248735d(searchParticipantInfo.getParticipant())) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public C62544e(Context context, C61303k kVar, C62927f.AbstractC62932a aVar) {
        this.f157397a = context;
        this.f157398b = kVar;
        this.f157399c = aVar;
    }

    /* renamed from: a */
    public void mo216261a(C62548f fVar, String str, Participant participant, boolean z) {
        if (ParticipantUtil.m248732c(participant)) {
            str = str + UIHelper.getString(R.string.View_M_MeParentheses);
        } else if (z) {
            str = str + UIHelper.getString(R.string.View_M_GuestParentheses);
        }
        fVar.f157411e.setText(str);
    }
}
