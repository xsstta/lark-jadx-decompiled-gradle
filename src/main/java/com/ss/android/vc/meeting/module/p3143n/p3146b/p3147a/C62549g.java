package com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.dependency.AbstractC60882ag;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.UserWorkStatusType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62549g;
import com.ss.android.vc.meeting.module.searchInvite.C62927f;
import com.ss.android.vc.meeting.utils.C63497j;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.ax;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.n.b.a.g */
public class C62549g implements AbstractC62532b<SearchParticipantInfo, C62554h> {

    /* renamed from: a */
    public Context f157425a;

    /* renamed from: b */
    public C61303k f157426b;

    /* renamed from: c */
    private C62927f.AbstractC62932a f157427c;

    /* renamed from: com.ss.android.vc.meeting.module.n.b.a.g$4 */
    public static /* synthetic */ class C625534 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157436a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.entity.Participant$Status[] r0 = com.ss.android.vc.entity.Participant.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62549g.C625534.f157436a = r0
                com.ss.android.vc.entity.Participant$Status r1 = com.ss.android.vc.entity.Participant.Status.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62549g.C625534.f157436a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.Participant$Status r1 = com.ss.android.vc.entity.Participant.Status.RINGING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62549g.C625534.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m244634a(C62554h hVar) {
        hVar.f157448l.setVisibility(4);
        hVar.f157450n.setVisibility(4);
        hVar.f157449m.setVisibility(4);
    }

    /* renamed from: b */
    private void m244637b(C62554h hVar) {
        hVar.f157448l.setVisibility(4);
        hVar.f157450n.setVisibility(4);
        hVar.f157449m.setVisibility(0);
    }

    /* renamed from: c */
    private void m244639c(C62554h hVar) {
        hVar.f157448l.setVisibility(0);
        hVar.f157448l.setTextColor(C60773o.m236126d(R.color.ud_N900));
        hVar.f157450n.setVisibility(4);
        hVar.f157449m.setVisibility(4);
    }

    /* renamed from: d */
    private void m244641d(C62554h hVar) {
        hVar.f157448l.setVisibility(0);
        hVar.f157448l.setTextColor(C60773o.m236126d(R.color.grey_4_disable));
        hVar.f157450n.setVisibility(4);
        hVar.f157449m.setVisibility(4);
    }

    /* renamed from: a */
    private boolean m244636a(SearchParticipantInfo searchParticipantInfo) {
        if (searchParticipantInfo.getZenModeEndTime() > VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m244635a(C62554h hVar, String str) {
        if (str == null || str.length() <= 0) {
            hVar.f157447k.setVisibility(8);
        } else {
            C52977a.m205190a().mo180995a(hVar.f157447k, str);
        }
    }

    /* renamed from: b */
    private void m244638b(C62554h hVar, final SearchParticipantInfo searchParticipantInfo) {
        int i;
        if (searchParticipantInfo.getParticipantType() == ParticipantType.ROOM) {
            i = 96;
        } else {
            i = 48;
        }
        C60783v.m236230a(searchParticipantInfo.getAvatarKey(), searchParticipantInfo.getId(), searchParticipantInfo.getParticipantType(), hVar.f157438b, i, i);
        hVar.f157438b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62549g.C625523 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (searchParticipantInfo.getByteviewUser() != null && C63497j.m248860d(C62549g.this.f157426b, searchParticipantInfo.getByteviewUser())) {
                    ax.m250129b(C62549g.this.f157426b.mo212056e(), searchParticipantInfo.getByteviewUser().getUserId(), searchParticipantInfo.getByteviewUser().getDeviceId());
                    C63497j.m248853a((Activity) C62549g.this.f157425a, C62549g.this.f157426b, searchParticipantInfo.getByteviewUser());
                }
            }
        });
    }

    /* renamed from: c */
    private void m244640c(C62554h hVar, SearchParticipantInfo searchParticipantInfo) {
        if (searchParticipantInfo.getParticipantType() == ParticipantType.ROOM) {
            hVar.f157439c.setVisibility(8);
            hVar.f157440d.clearAnimation();
        }
    }

    /* renamed from: g */
    private void m244645g(C62554h hVar, SearchParticipantInfo searchParticipantInfo) {
        if (searchParticipantInfo.getCollaborationType() == SearchParticipantInfo.CollaborationType.BLOCKED || searchParticipantInfo.getCollaborationType() == SearchParticipantInfo.CollaborationType.BE_BLOCKED) {
            hVar.f157448l.setTextColor(C60773o.m236126d(R.color.ud_N400));
        } else {
            hVar.f157448l.setTextColor(C60773o.m236126d(R.color.ud_N900));
        }
    }

    /* renamed from: e */
    private void m244643e(C62554h hVar, SearchParticipantInfo searchParticipantInfo) {
        ChatterDescription chatterDescription = searchParticipantInfo.getChatterDescription();
        if (chatterDescription == null || TextUtils.isEmpty(chatterDescription.getContent())) {
            hVar.f157443g.setVisibility(8);
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) hVar.f157443g.getLayoutParams();
        if (hVar.f157444h.getVisibility() == 0 || hVar.f157445i.getVisibility() == 0) {
            layoutParams.leftMargin = C60773o.m236115a(4.0d);
        } else {
            layoutParams.leftMargin = 0;
        }
        hVar.f157443g.setLayoutParams(layoutParams);
        hVar.f157443g.setVisibility(0);
        UIUtils.showByStatus(hVar.f157443g, chatterDescription.getContent(), true);
    }

    /* renamed from: f */
    private void m244644f(C62554h hVar, SearchParticipantInfo searchParticipantInfo) {
        if (hVar.f157451o.getVisibility() == 0) {
            m244634a(hVar);
            return;
        }
        List<Participant> participants = this.f157426b.mo212056e().getParticipants();
        if (participants != null && participants.size() != 0) {
            Participant.Status status = Participant.Status.IDLE;
            Iterator<Participant> it = participants.iterator();
            while (true) {
                if (it.hasNext()) {
                    Participant next = it.next();
                    if (next != null && next.getId() != null && next.getId().equals(searchParticipantInfo.getId())) {
                        status = next.getStatus();
                        break;
                    }
                } else {
                    break;
                }
            }
            int i = C625534.f157436a[status.ordinal()];
            if (i == 1) {
                m244639c(hVar);
                if (participants.size() >= this.f157426b.mo212056e().getVideoChatSettings().getMaxParticipantNum()) {
                    m244641d(hVar);
                }
                m244645g(hVar, searchParticipantInfo);
            } else if (i == 2) {
                m244637b(hVar);
            }
        }
    }

    /* renamed from: d */
    private void m244642d(C62554h hVar, SearchParticipantInfo searchParticipantInfo) {
        int i;
        int i2;
        TextView textView = hVar.f157444h;
        int i3 = 0;
        if (!searchParticipantInfo.isCrossTenant() || !VideoChatModuleDependency.m236632e()) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        if (VideoChatModuleDependency.m236634g().mo196512b()) {
            hVar.f157446j.setVisibility(8);
            hVar.f157447k.setVisibility(0);
            VideoChatModuleDependency.m236634g().mo196511a(searchParticipantInfo.getCustomStatuses(), new AbstractC60882ag.AbstractC60883a() {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$g$wPfFecNowLmUcG5nRpu1H19Lhfc */

                @Override // com.ss.android.vc.dependency.AbstractC60882ag.AbstractC60883a
                public final void onStatus(String str) {
                    C62549g.lambda$wPfFecNowLmUcG5nRpu1H19Lhfc(C62554h.this, str);
                }
            });
        } else {
            ImageView imageView = hVar.f157446j;
            if (m244636a(searchParticipantInfo)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            hVar.f157447k.setVisibility(8);
        }
        UserWorkStatusType workStatusType = searchParticipantInfo.getWorkStatusType();
        if (workStatusType != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) hVar.f157445i.getLayoutParams();
            if (hVar.f157444h.getVisibility() == 0) {
                layoutParams.leftMargin = C60773o.m236115a(4.0d);
            } else {
                layoutParams.leftMargin = 0;
            }
            hVar.f157445i.setLayoutParams(layoutParams);
            TextView textView2 = hVar.f157445i;
            UserWorkStatusType userWorkStatusType = UserWorkStatusType.ON_LEAVE;
            if (workStatusType != UserWorkStatusType.ON_LEAVE) {
                i3 = 8;
            }
            textView2.setVisibility(i3);
            return;
        }
        hVar.f157445i.setVisibility(8);
    }

    /* renamed from: a */
    public void mo216246a(final C62554h hVar, final SearchParticipantInfo searchParticipantInfo) {
        m244638b(hVar, searchParticipantInfo);
        m244640c(hVar, searchParticipantInfo);
        m244642d(hVar, searchParticipantInfo);
        m244643e(hVar, searchParticipantInfo);
        m244644f(hVar, searchParticipantInfo);
        if (!(searchParticipantInfo.getParticipant() == null || searchParticipantInfo.getParticipant().getParticipantType() == ParticipantType.LARK_USER)) {
            UserInfoService.getUserInfoById(this.f157426b.mo212055d(), searchParticipantInfo.getParticipant().getId(), searchParticipantInfo.getParticipant().getParticipantType(), new GetUserInfoListener() {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62549g.C625501 */

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public void onGetUserInfo(VideoChatUser videoChatUser) {
                    hVar.f157442f.post(new Runnable(searchParticipantInfo, hVar) {
                        /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$g$1$D2l7yZlEhNugk7hBey5O3BKtiKc */
                        public final /* synthetic */ SearchParticipantInfo f$1;
                        public final /* synthetic */ C62554h f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C62549g.C625501.lambda$D2l7yZlEhNugk7hBey5O3BKtiKc(VideoChatUser.this, this.f$1, this.f$2);
                        }
                    });
                }

                /* renamed from: a */
                public static /* synthetic */ void m244648a(VideoChatUser videoChatUser, SearchParticipantInfo searchParticipantInfo, C62554h hVar) {
                    String str;
                    int i;
                    ParticipantType participantType;
                    if (!TextUtils.isEmpty(videoChatUser.getNickname())) {
                        str = videoChatUser.getNickname();
                    } else {
                        str = videoChatUser.getName();
                    }
                    searchParticipantInfo.setTitle(str);
                    hVar.f157442f.setText(str);
                    if (videoChatUser.isRoom()) {
                        i = 96;
                    } else {
                        i = 48;
                    }
                    String avatarKey = videoChatUser.getAvatarKey();
                    String id = videoChatUser.getId();
                    if (videoChatUser.isRoom()) {
                        participantType = ParticipantType.ROOM;
                    } else {
                        participantType = ParticipantType.LARK_USER;
                    }
                    C60783v.m236230a(avatarKey, id, participantType, hVar.f157438b, i, i);
                }
            });
        }
        if (searchParticipantInfo.getLobbyParticipant() != null && searchParticipantInfo.getLobbyParticipant().getUser() != null && searchParticipantInfo.getLobbyParticipant().getUser().getParticipantType() != ParticipantType.LARK_USER) {
            UserInfoService.getUserInfoById(this.f157426b.mo212055d(), searchParticipantInfo.getLobbyParticipant().getUser().getUserId(), searchParticipantInfo.getLobbyParticipant().getUser().getParticipantType(), new GetUserInfoListener() {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62549g.C625512 */

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public void onGetUserInfo(VideoChatUser videoChatUser) {
                    hVar.f157442f.post(new Runnable(searchParticipantInfo, hVar) {
                        /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$g$2$ObIZHKjeU5wVxJxas_eOI2h_io */
                        public final /* synthetic */ SearchParticipantInfo f$1;
                        public final /* synthetic */ C62554h f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C62549g.C625512.m271343lambda$ObIZHKjeU5wVxJxas_eOI2h_io(VideoChatUser.this, this.f$1, this.f$2);
                        }
                    });
                }

                /* renamed from: a */
                public static /* synthetic */ void m244649a(VideoChatUser videoChatUser, SearchParticipantInfo searchParticipantInfo, C62554h hVar) {
                    String str;
                    int i;
                    ParticipantType participantType;
                    if (!TextUtils.isEmpty(videoChatUser.getNickname())) {
                        str = videoChatUser.getNickname();
                    } else {
                        str = videoChatUser.getName();
                    }
                    searchParticipantInfo.setTitle(str);
                    hVar.f157442f.setText(str);
                    if (videoChatUser.isRoom()) {
                        i = 96;
                    } else {
                        i = 48;
                    }
                    String avatarKey = videoChatUser.getAvatarKey();
                    String id = videoChatUser.getId();
                    if (videoChatUser.isRoom()) {
                        participantType = ParticipantType.ROOM;
                    } else {
                        participantType = ParticipantType.LARK_USER;
                    }
                    C60783v.m236230a(avatarKey, id, participantType, hVar.f157438b, i, i);
                }
            });
        }
    }

    public C62549g(Context context, C61303k kVar, C62927f.AbstractC62932a aVar) {
        this.f157425a = context;
        this.f157426b = kVar;
        this.f157427c = aVar;
    }
}
