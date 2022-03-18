package com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dto.SearchParticipantInfo;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.PSTNInfo;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChatSettings;
import com.ss.android.vc.entity.request.ManageApprovalRequest;
import com.ss.android.vc.entity.response.C60955ab;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.interpretation.C61957c;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.meetingdialog.p3138c.AbstractC62201a;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62328e;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62329f;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62335h;
import com.ss.android.vc.meeting.module.meetingdialog.search.SearchUserInLobbyDialog;
import com.ss.android.vc.meeting.module.meetingdialog.search.SearchUserInMeetingDialog;
import com.ss.android.vc.meeting.module.meetingdialog.search.SearchUserInvitingDialog;
import com.ss.android.vc.meeting.module.searchInvite.C62927f;
import com.ss.android.vc.meeting.module.searchInvite.addcontact.AddContactDialog;
import com.ss.android.vc.meeting.utils.AbstractC63488d;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event.az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.n.b.a.c */
public class C62533c extends LarkRecyclerViewBaseAdapter<C62531a, SearchParticipantInfo> {

    /* renamed from: a */
    public C61303k f157373a;

    /* renamed from: b */
    public C62927f.AbstractC62932a f157374b;

    /* renamed from: c */
    public AbstractC61222a f157375c;

    /* renamed from: d */
    private Activity f157376d;

    /* renamed from: e */
    private AbstractC62532b<SearchParticipantInfo, C62554h> f157377e;

    /* renamed from: f */
    private AbstractC62532b<SearchParticipantInfo, C62548f> f157378f;

    /* renamed from: g */
    private HashMap<String, Integer> f157379g = new HashMap<>();

    /* renamed from: h */
    private AbstractC62329f f157380h;

    /* renamed from: i */
    private boolean f157381i;

    /* renamed from: j */
    private Boolean f157382j;

    /* renamed from: k */
    private AbstractC62201a f157383k = new AbstractC62201a() {
        /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625352 */

        @Override // com.ss.android.vc.meeting.module.meetingdialog.p3138c.AbstractC62201a
        /* renamed from: a */
        public void mo215130a(SearchParticipantInfo searchParticipantInfo) {
            C62533c.this.f157374b.mo217444b();
            C62533c.this.mo216253c(searchParticipantInfo);
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.p3138c.AbstractC62201a
        /* renamed from: a */
        public void mo215131a(VCLobbyParticipant vCLobbyParticipant) {
            C62533c.this.f157374b.mo217444b();
            if (vCLobbyParticipant != null && vCLobbyParticipant.getUser() != null) {
                C60700b.m235851b("InviteParticipantSearchAdapter", "[addFromLobby]", "admit lobby participant: " + vCLobbyParticipant.toString());
                VcBizService.manageApproval(C62533c.this.f157373a.mo212055d(), ManageApprovalRequest.ApprovalType.MEETING_LOBBY, ManageApprovalRequest.ApprovalAction.PASS, Collections.singletonList(vCLobbyParticipant.getUser()), null);
            }
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.p3138c.AbstractC62201a
        /* renamed from: b */
        public void mo215132b(final VCLobbyParticipant vCLobbyParticipant) {
            if (vCLobbyParticipant != null && vCLobbyParticipant.getUser() != null) {
                C60700b.m235851b("InviteParticipantSearchAdapter", "[removeFromLobby]", "remove lobby participant: " + vCLobbyParticipant.toString());
                ParticipantUtil.m248709a(C62533c.this.f157373a.mo212055d(), vCLobbyParticipant.getUser().getUserId(), vCLobbyParticipant.getUser().getParticipantType(), new AbstractC63488d() {
                    /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625352.C625361 */

                    @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
                    /* renamed from: a */
                    public void mo215583a() {
                        C60700b.m235864f("InviteParticipantSearchAdapter", "[removeFromLobby2]", "Can not get user info by lobby participant" + vCLobbyParticipant);
                    }

                    @Override // com.ss.android.vc.meeting.utils.AbstractC63488d
                    /* renamed from: a */
                    public void mo215584a(String str) {
                        C62533c.this.mo216251a(str, vCLobbyParticipant);
                    }
                });
            }
        }
    };

    /* renamed from: a */
    public static /* synthetic */ void m244589a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: b */
    public static /* synthetic */ void m244598b(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: a */
    public void onBindViewHolder(C62531a aVar, int i) {
        SearchParticipantInfo searchParticipantInfo = (SearchParticipantInfo) getItem(i);
        if (aVar instanceof C62554h) {
            C62554h hVar = (C62554h) aVar;
            m244595a(hVar, searchParticipantInfo);
            this.f157377e.mo216246a(hVar, searchParticipantInfo);
        } else if (aVar instanceof C62548f) {
            C62548f fVar = (C62548f) aVar;
            this.f157378f.mo216246a(fVar, searchParticipantInfo);
            m244593a(fVar, searchParticipantInfo);
        }
    }

    /* renamed from: a */
    public void mo216251a(String str, VCLobbyParticipant vCLobbyParticipant) {
        if (vCLobbyParticipant.isGuest()) {
            str = str + UIHelper.getString(R.string.View_M_GuestParentheses);
        }
        VCDialogUtils.m236184a((Context) this.f157376d, UIHelper.mustacheFormat((int) R.string.View_M_RemoveParticipantFromLobby, "name", str), 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$c$7Fta8bWXfLJPEAVxDZhg9A_TiA8.INSTANCE, (int) R.string.View_G_ConfirmButton, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(vCLobbyParticipant) {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$c$OJDD8gNpnbiJiwxHaEJBJ5sHJ18 */
            public final /* synthetic */ VCLobbyParticipant f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C62533c.lambda$OJDD8gNpnbiJiwxHaEJBJ5sHJ18(C62533c.this, this.f$1, dialogInterface, i);
            }
        }, false);
    }

    /* renamed from: a */
    public void mo216248a(SearchParticipantInfo searchParticipantInfo) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (searchParticipantInfo.getParticipantType() == ParticipantType.ROOM) {
            arrayList2.add(searchParticipantInfo.getId());
        } else {
            arrayList.add(searchParticipantInfo.getId());
        }
        VcBizSender.m249202a(arrayList, arrayList2, this.f157373a.mo212055d()).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625395 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("InviteParticipantSearchAdapter", "[inviteLarkAndRoom]", "Participant calling success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("InviteParticipantSearchAdapter", "[inviteLarkAndRoom2]", "Participant calling error " + eVar.toString());
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                }
            }
        });
    }

    /* renamed from: a */
    public void onViewRecycled(C62531a aVar) {
        if (aVar instanceof C62554h) {
            ImageLoader.clear(((C62554h) aVar).f157438b);
        }
        super.onViewRecycled(aVar);
    }

    /* renamed from: com.ss.android.vc.meeting.module.n.b.a.c$8 */
    public static /* synthetic */ class C625428 {

        /* renamed from: a */
        static final /* synthetic */ int[] f157396a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.entity.Participant$DeviceType[] r0 = com.ss.android.vc.entity.Participant.DeviceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625428.f157396a = r0
                com.ss.android.vc.entity.Participant$DeviceType r1 = com.ss.android.vc.entity.Participant.DeviceType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625428.f157396a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.Participant$DeviceType r1 = com.ss.android.vc.entity.Participant.DeviceType.WEB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625428.<clinit>():void");
        }
    }

    /* renamed from: a */
    private boolean m244597a() {
        return C63496i.m248850d(this.f157373a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        String id = ((SearchParticipantInfo) getItem(i)).getId();
        if (!TextUtils.isEmpty(id)) {
            return Long.parseLong(id);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (((SearchParticipantInfo) getItem(i)).getUserStatus() == SearchParticipantInfo.UserStatus.IN_MEETING) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private Collection<? extends SearchParticipantInfo> m244588a(Collection<? extends SearchParticipantInfo> collection) {
        Participant participant;
        ArrayList arrayList = new ArrayList(collection);
        for (int i = 0; i < arrayList.size(); i++) {
            SearchParticipantInfo searchParticipantInfo = (SearchParticipantInfo) arrayList.get(i);
            if (!(searchParticipantInfo == null || (participant = searchParticipantInfo.getParticipant()) == null || TextUtils.isEmpty(participant.getBreakoutRoomId()))) {
                arrayList.remove(searchParticipantInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo216252b(SearchParticipantInfo searchParticipantInfo) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new PSTNInfo(searchParticipantInfo.getSipMainAddress(), "", ParticipantType.SIP_USER, ""));
        VcBizSender.m249201a(arrayList, this.f157373a.mo212055d()).mo219889a(new AbstractC63598b<C60955ab>() {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625406 */

            /* renamed from: a */
            public void onSuccess(C60955ab abVar) {
                C60700b.m235851b("InviteParticipantSearchAdapter", "[inviteSIP]", "Participant calling success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("InviteParticipantSearchAdapter", "[inviteSIP2]", "Participant calling error " + eVar.toString());
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                }
            }
        });
    }

    @Override // com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public void resetAll(Collection<? extends SearchParticipantInfo> collection) {
        this.items.clear();
        if (!this.f157373a.al().mo213181h() || !this.f157381i) {
            this.items.addAll(collection);
        } else {
            this.items.addAll(m244588a(collection));
        }
        this.f157379g = ParticipantUtil.f160321a;
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public void mo216253c(SearchParticipantInfo searchParticipantInfo) {
        C60700b.m235851b("InviteParticipantSearchAdapter", "[cancelCalling]", "cancel a call to user_id: " + searchParticipantInfo.getId());
        ArrayList arrayList = new ArrayList(1);
        String id = searchParticipantInfo.getId();
        ParticipantType participantType = ParticipantType.LARK_USER;
        if (searchParticipantInfo.getParticipantType() == ParticipantType.ROOM) {
            participantType = ParticipantType.ROOM;
        } else if (searchParticipantInfo.getParticipant() != null) {
            id = searchParticipantInfo.getParticipant().getId();
            participantType = searchParticipantInfo.getParticipant().getParticipantType();
        }
        arrayList.add(new ByteviewUser(id, "0", participantType));
        VcBizSender.m249240b(arrayList, this.f157373a.mo212055d()).mo219889a(new AbstractC63598b<String>() {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625417 */

            /* renamed from: a */
            public void onSuccess(String str) {
                C60700b.m235851b("InviteParticipantSearchAdapter", "[cancelCalling]", "cancelInviteVideoChat success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("InviteParticipantSearchAdapter", "[cancelCalling2]", "cancelInviteVideoChat error " + eVar.toString());
                if (eVar.f160600c) {
                    return;
                }
                if (eVar.mo219899a() == 10008 || eVar.mo219899a() == 10009) {
                    C60738ac.m236037c((int) R.string.View_G_ConnectionError);
                } else {
                    C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_VM_OperationFailedCodeErrorCode, "error_code", Integer.toString(eVar.mo219899a())));
                }
            }
        });
    }

    /* renamed from: d */
    public boolean mo216254d(SearchParticipantInfo searchParticipantInfo) {
        if (searchParticipantInfo.getCollaborationType() == SearchParticipantInfo.CollaborationType.BLOCKED) {
            C60738ac.m236037c((int) R.string.View_G_NoPermissionsToCallBlocked);
            return false;
        } else if (searchParticipantInfo.getCollaborationType() == SearchParticipantInfo.CollaborationType.BE_BLOCKED) {
            C60738ac.m236037c((int) R.string.View_G_NoPermissionsToCall);
            return false;
        } else if (searchParticipantInfo.getCollaborationType() != SearchParticipantInfo.CollaborationType.REQUEST_NEEDED) {
            return true;
        } else {
            VCDialogUtils.m236216b((Context) this.f157376d, UIHelper.getString(R.string.View_M_AddContactNow), 1, UIHelper.mustacheFormat((int) R.string.View_G_AddToContactsDialogContent, "name", searchParticipantInfo.getTitle()), (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$c$vKpdjC1E_ynHweEq8e7baxnlg.INSTANCE, (int) R.string.View_G_Send, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(searchParticipantInfo) {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$c$Rza0cDB08YxAFR0Rme5amlJXDGw */
                public final /* synthetic */ SearchParticipantInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C62533c.lambda$Rza0cDB08YxAFR0Rme5amlJXDGw(C62533c.this, this.f$1, dialogInterface, i);
                }
            }, false);
            return false;
        }
    }

    /* renamed from: a */
    private void m244592a(C62531a aVar, SearchParticipantInfo searchParticipantInfo) {
        Participant participant;
        if (searchParticipantInfo.getUserStatus() == SearchParticipantInfo.UserStatus.IN_LOBBY) {
            if (m244597a()) {
                new SearchUserInLobbyDialog(this.f157376d, this.f157373a, searchParticipantInfo, this.f157383k).mo211606a();
                this.f157374b.mo217445c();
            }
        } else if (searchParticipantInfo.getUserStatus() == SearchParticipantInfo.UserStatus.IN_MEETING && (participant = searchParticipantInfo.getParticipant()) != null) {
            if (participant.getStatus() == Participant.Status.RINGING) {
                if (m244597a() || ParticipantUtil.m248722a(searchParticipantInfo.getParticipant().getInviterId(), searchParticipantInfo.getParticipant().getInviterType(), searchParticipantInfo.getParticipant().getInviterDeviceId())) {
                    new SearchUserInvitingDialog(this.f157376d, this.f157373a, searchParticipantInfo, this.f157383k).mo211606a();
                    this.f157374b.mo217445c();
                }
            } else if (participant.getStatus() == Participant.Status.ON_THE_CALL && C63496i.m248843a(participant, this.f157373a)) {
                if (searchParticipantInfo.getParticipant() != null) {
                    new SearchUserInMeetingDialog(this.f157376d, searchParticipantInfo.getParticipant(), this.f157373a, this.f157380h, this.f157374b).mo211606a();
                } else {
                    C60700b.m235861e("InviteParticipantSearchAdapter", "[onItemClicked]", "participant is null");
                }
                this.f157374b.mo217445c();
            }
        }
    }

    /* renamed from: a */
    private void m244593a(C62548f fVar, final SearchParticipantInfo searchParticipantInfo) {
        if (this.f157381i) {
            fVar.f157415i.setVisibility(8);
            fVar.f157416j.setVisibility(8);
            fVar.f157407a.setVisibility(8);
            fVar.f157418l.setVisibility(8);
            fVar.f157417k.setVisibility(8);
            fVar.itemView.setClickable(true);
            fVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.View$OnClickListenerC625373 */

                public void onClick(View view) {
                    C61957c e = C62533c.this.f157373a.mo212105W().mo212845x().mo214449e();
                    boolean a = e.mo214501a(searchParticipantInfo.getParticipant());
                    boolean b = e.mo214503b(searchParticipantInfo.getParticipant());
                    if (searchParticipantInfo.getParticipant() != null && searchParticipantInfo.getParticipant().getCapabilities() != null && !searchParticipantInfo.getParticipant().getCapabilities().isBecomeInterpreter()) {
                        C60738ac.m236037c((int) R.string.View_G_UserVersionNoInterpretation);
                    } else if (searchParticipantInfo.getParticipant() != null && searchParticipantInfo.getParticipant().isGuest()) {
                        C60738ac.m236037c((int) R.string.View_G_UserVersionNoInterpretation);
                    } else if (searchParticipantInfo.getParticipantType() == ParticipantType.ROOM) {
                        C60738ac.m236037c((int) R.string.View_G_UserAppNoInterpretation);
                    } else if (a || b) {
                        C62533c.this.f157373a.mo212105W().mo212845x().mo214443b(searchParticipantInfo.getParticipant());
                        C62533c.this.f157375c.dismiss();
                    } else {
                        C60738ac.m236037c((int) R.string.View_G_AlreadyInterpreter);
                    }
                }
            });
        } else {
            fVar.itemView.setOnClickListener(new View.OnClickListener(fVar, searchParticipantInfo) {
                /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$c$YfYvB3tOgq1AWuMUPnqk3u4qZo */
                public final /* synthetic */ C62548f f$1;
                public final /* synthetic */ SearchParticipantInfo f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C62533c.m271341lambda$YfYvB3tOgq1AWuMUPnqk3u4qZo(C62533c.this, this.f$1, this.f$2, view);
                }
            });
        }
        Participant participant = searchParticipantInfo.getParticipant();
        String id = participant.getId();
        Participant.DeviceType deviceType = participant.getDeviceType();
        if (deviceType != null) {
            int i = C625428.f157396a[deviceType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    fVar.f157421o.setVisibility(8);
                } else if (this.f157379g.get(id) == null || this.f157379g.get(id).intValue() < 2) {
                    fVar.f157421o.setVisibility(8);
                } else {
                    fVar.f157421o.setVisibility(0);
                    fVar.f157421o.setImageResource(R.drawable.ud_icon_mac_filled);
                }
            } else if (this.f157379g.get(id) == null || this.f157379g.get(id).intValue() < 2) {
                fVar.f157421o.setVisibility(8);
            } else {
                fVar.f157421o.setVisibility(0);
                fVar.f157421o.setImageResource(R.drawable.ud_icon_cellphone_outlined);
            }
        } else {
            fVar.f157421o.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m244595a(C62554h hVar, final SearchParticipantInfo searchParticipantInfo) {
        hVar.f157442f.setText(searchParticipantInfo.getTitle());
        hVar.f157443g.setText(searchParticipantInfo.getSubTitle());
        hVar.itemView.setOnClickListener(new View.OnClickListener(hVar, searchParticipantInfo) {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.$$Lambda$c$sHW9RWC1CcrvLLct_8zCs3oGy_0 */
            public final /* synthetic */ C62554h f$1;
            public final /* synthetic */ SearchParticipantInfo f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C62533c.lambda$sHW9RWC1CcrvLLct_8zCs3oGy_0(C62533c.this, this.f$1, this.f$2, view);
            }
        });
        if (searchParticipantInfo.getUserStatus() == SearchParticipantInfo.UserStatus.IN_LOBBY) {
            hVar.f157451o.setVisibility(0);
        } else {
            hVar.f157451o.setVisibility(8);
        }
        hVar.f157448l.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.View$OnClickListenerC625384 */

            public void onClick(View view) {
                VideoChatSettings videoChatSettings;
                List<Participant> participants = C62533c.this.f157373a.mo212056e().getParticipants();
                if (participants != null && participants.size() != 0 && (videoChatSettings = C62533c.this.f157373a.mo212056e().getVideoChatSettings()) != null) {
                    if (participants.size() >= videoChatSettings.getMaxParticipantNum()) {
                        C60700b.m235851b("InviteParticipantSearchAdapter", "[bindCommonData]", "participant reach to limit max count braces");
                        C60738ac.m236039c(UIHelper.mustacheFormat((int) R.string.View_M_CapacityReachedMaxNum, "max_num", videoChatSettings.getMaxParticipantNum() + ""));
                        C62533c.this.f157374b.mo217443a();
                    } else if (searchParticipantInfo.isExecutive()) {
                        C60738ac.m236037c((int) R.string.View_M_AdminRestrictionsInfo);
                        C62533c.this.f157374b.mo217443a();
                    } else if (!C62533c.this.mo216254d(searchParticipantInfo)) {
                        C62533c.this.f157374b.mo217443a();
                    } else {
                        C60700b.m235851b("InviteParticipantSearchAdapter", "[bindCommonData2]", "call to user_id: " + searchParticipantInfo.getId());
                        az.m250132a(searchParticipantInfo.getId(), C62533c.this.f157373a.mo212056e());
                        if (searchParticipantInfo.getParticipantType() == ParticipantType.SIP_USER) {
                            C62533c.this.mo216252b(searchParticipantInfo);
                        } else {
                            C62533c.this.mo216248a(searchParticipantInfo);
                        }
                        C62533c.this.f157374b.mo217443a();
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public C62531a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C62548f(LayoutInflater.from(this.f157376d).inflate(R.layout.dialog_participant_list_item, viewGroup, false));
        }
        return new C62554h(LayoutInflater.from(this.f157376d).inflate(R.layout.videochat_participant_invite_select_item, viewGroup, false));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m244594a(C62548f fVar, SearchParticipantInfo searchParticipantInfo, View view) {
        m244592a((C62531a) fVar, searchParticipantInfo);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m244596a(C62554h hVar, SearchParticipantInfo searchParticipantInfo, View view) {
        m244592a((C62531a) hVar, searchParticipantInfo);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m244590a(SearchParticipantInfo searchParticipantInfo, DialogInterface dialogInterface, int i) {
        new AddContactDialog(searchParticipantInfo.getId(), searchParticipantInfo.getTitle(), this.f157376d, this.f157373a).mo211606a();
    }

    public C62533c(Activity activity, final C61303k kVar, C62927f.AbstractC62932a aVar) {
        this.f157376d = activity;
        this.f157373a = kVar;
        this.f157374b = aVar;
        this.f157377e = new C62549g(activity, kVar, aVar);
        this.f157378f = new C62544e(activity, kVar, aVar);
        this.f157380h = C62335h.m243526a(activity, kVar, new AbstractC62328e() {
            /* class com.ss.android.vc.meeting.module.p3143n.p3146b.p3147a.C62533c.C625341 */

            @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62328e
            /* renamed from: a */
            public boolean mo215561a() {
                return C63496i.m248846b(kVar);
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62328e
            /* renamed from: b */
            public boolean mo215562b() {
                return C63496i.m248848c(kVar);
            }
        }).mo215587a(new C62543d());
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m244591a(VCLobbyParticipant vCLobbyParticipant, DialogInterface dialogInterface, int i) {
        this.f157374b.mo217444b();
        VcBizService.manageApproval(this.f157373a.mo212055d(), ManageApprovalRequest.ApprovalType.MEETING_LOBBY, ManageApprovalRequest.ApprovalAction.REJECT, Collections.singletonList(vCLobbyParticipant.getUser()), null);
    }

    public C62533c(Activity activity, C61303k kVar, C62927f.AbstractC62932a aVar, AbstractC61222a aVar2, boolean z, Boolean bool) {
        this.f157376d = activity;
        this.f157373a = kVar;
        this.f157374b = aVar;
        this.f157377e = new C62549g(activity, kVar, aVar);
        this.f157378f = new C62544e(activity, kVar, aVar);
        this.f157375c = aVar2;
        this.f157381i = z;
        this.f157382j = bool;
    }
}
