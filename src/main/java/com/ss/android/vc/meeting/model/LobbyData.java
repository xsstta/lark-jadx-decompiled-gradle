package com.ss.android.vc.meeting.model;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.lobby.pb.C62148a;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import com.ss.android.vc.meeting.module.lobby.pb.VCManageNotify;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class LobbyData {

    /* renamed from: a */
    private C61303k f153784a;

    /* renamed from: b */
    private List<AbstractC61370a> f153785b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private EnumSet<LobbyUpdateType> f153786c = EnumSet.noneOf(LobbyUpdateType.class);

    /* renamed from: d */
    private Map<String, VCLobbyParticipant> f153787d;

    /* renamed from: e */
    private Set<String> f153788e;

    /* renamed from: f */
    private List<VCLobbyParticipant> f153789f;

    public enum LobbyUpdateType {
        NOTHING,
        ADD,
        REMOVE,
        UPDATE
    }

    /* renamed from: com.ss.android.vc.meeting.model.LobbyData$a */
    public interface AbstractC61370a {
        /* renamed from: a */
        void mo212424a();
    }

    /* renamed from: d */
    public List<VCLobbyParticipant> mo212422d() {
        return this.f153789f;
    }

    /* renamed from: e */
    public void mo212423e() {
        this.f153785b.clear();
    }

    /* renamed from: b */
    public void mo212419b() {
        this.f153784a.ao().mo218460a((List<Participant>) null);
        this.f153784a.mo212114a((Boolean) null, (Boolean) false);
    }

    /* renamed from: a */
    public void mo212414a() {
        this.f153787d = null;
        this.f153788e = null;
        this.f153789f = null;
        this.f153784a.aq().mo214937a(new ArrayList());
        this.f153784a.mo212114a((Boolean) false, (Boolean) null);
    }

    /* renamed from: c */
    public void mo212421c() {
        this.f153784a.aq().mo214937a(new ArrayList());
        this.f153784a.ao().mo218460a((List<Participant>) null);
        this.f153784a.mo212114a((Boolean) false, (Boolean) false);
    }

    /* renamed from: b */
    public void mo212420b(AbstractC61370a aVar) {
        if (this.f153785b.contains(aVar)) {
            this.f153785b.remove(aVar);
        }
    }

    public LobbyData(C61303k kVar) {
        this.f153784a = kVar;
    }

    /* renamed from: a */
    public VCLobbyParticipant mo212412a(ByteviewUser byteviewUser) {
        if (byteviewUser != null) {
            return mo212413a(byteviewUser.getUserId(), byteviewUser.getParticipantType(), byteviewUser.getDeviceId());
        }
        return null;
    }

    /* renamed from: a */
    public void mo212415a(AbstractC61370a aVar) {
        if (!this.f153785b.contains(aVar)) {
            this.f153785b.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo212416a(VCManageNotify vCManageNotify) {
        if (vCManageNotify != null && vCManageNotify.lobby_participants != null) {
            Participant j = this.f153784a.mo212091I().mo212494b().mo212605j();
            if (j == null || !j.isGuest() || !j.is_host()) {
                m239141a(vCManageNotify.lobby_participants, false);
            } else {
                mo212414a();
            }
            for (AbstractC61370a aVar : this.f153785b) {
                aVar.mo212424a();
            }
            if (this.f153786c.size() == 1 && this.f153786c.contains(LobbyUpdateType.UPDATE)) {
                return;
            }
            if (this.f153786c.contains(LobbyUpdateType.ADD)) {
                this.f153784a.aq().mo214937a(mo212422d());
            } else if (this.f153786c.contains(LobbyUpdateType.REMOVE) && this.f153784a.aq().mo214940b()) {
                this.f153784a.aq().mo214937a(mo212422d());
            }
        }
    }

    /* renamed from: a */
    public void mo212417a(C62148a aVar) {
        if (!(aVar == null || aVar.f156114b == null)) {
            Participant j = this.f153784a.mo212091I().mo212494b().mo212605j();
            if (j == null || !j.isGuest() || !j.is_host()) {
                m239141a(aVar.f156114b, true);
                this.f153784a.aq().mo214937a(mo212422d());
            } else {
                mo212414a();
            }
            for (AbstractC61370a aVar2 : this.f153785b) {
                aVar2.mo212424a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo212418a(String str) {
        return this.f153788e.contains(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m239140a(VCLobbyParticipant vCLobbyParticipant, VCLobbyParticipant vCLobbyParticipant2) {
        return -Long.compare(vCLobbyParticipant.getJoinLobbyTime(), vCLobbyParticipant2.getJoinLobbyTime());
    }

    /* renamed from: a */
    private void m239141a(List<VCLobbyParticipant> list, boolean z) {
        C60700b.m235851b("LobbyData", "[updateLobbyParticipants]", list + ", isFull: " + z);
        this.f153786c.clear();
        if (list != null) {
            if (this.f153787d == null) {
                this.f153787d = new HashMap();
            }
            if (this.f153788e == null) {
                this.f153788e = new HashSet();
            }
            if (this.f153789f == null) {
                this.f153789f = new ArrayList();
            }
            if (z) {
                C60700b.m235851b("LobbyData", "[updateLobbyParticipants2]", "full data");
                this.f153787d.clear();
                this.f153788e.clear();
                for (VCLobbyParticipant vCLobbyParticipant : list) {
                    this.f153786c.add(LobbyUpdateType.ADD);
                    this.f153787d.put(vCLobbyParticipant.getID(), vCLobbyParticipant);
                    this.f153788e.add(vCLobbyParticipant.getUser().getUserId());
                }
            } else {
                C60700b.m235851b("LobbyData", "[updateLobbyParticipants3]", "do merge");
                if (list.size() > 0) {
                    for (VCLobbyParticipant vCLobbyParticipant2 : list) {
                        if (!vCLobbyParticipant2.isStatusWait()) {
                            if (this.f153787d.remove(vCLobbyParticipant2.getID()) != null) {
                                this.f153786c.add(LobbyUpdateType.REMOVE);
                            }
                            this.f153788e.remove(vCLobbyParticipant2.getUser().getUserId());
                        } else {
                            if (this.f153787d.containsKey(vCLobbyParticipant2.getID())) {
                                this.f153786c.add(LobbyUpdateType.UPDATE);
                            } else {
                                this.f153786c.add(LobbyUpdateType.ADD);
                            }
                            this.f153787d.put(vCLobbyParticipant2.getID(), vCLobbyParticipant2);
                            this.f153788e.add(vCLobbyParticipant2.getUser().getUserId());
                        }
                    }
                }
            }
            this.f153789f.clear();
            this.f153789f.addAll(this.f153787d.values());
            if (this.f153786c.size() != 1 || !this.f153786c.contains(LobbyUpdateType.UPDATE)) {
                if (this.f153786c.contains(LobbyUpdateType.ADD)) {
                    this.f153784a.mo212114a((Boolean) true, (Boolean) null);
                } else if (this.f153786c.contains(LobbyUpdateType.REMOVE) && this.f153789f.size() == 0) {
                    this.f153784a.mo212114a((Boolean) false, (Boolean) null);
                }
            }
            Collections.sort(this.f153789f, $$Lambda$LobbyData$Y_d9HHAWAi9Q7UFaFTAPrXg1hUI.INSTANCE);
        }
    }

    /* renamed from: a */
    public VCLobbyParticipant mo212413a(String str, ParticipantType participantType, String str2) {
        return ParticipantUtil.m248725b(str, participantType, str2, this.f153789f);
    }
}
