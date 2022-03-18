package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list;

import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.module.lobby.pb.VCLobbyParticipant;
import java.util.ArrayList;
import java.util.List;

public class ParticipantItem {

    /* renamed from: a */
    public Participant f156729a;

    /* renamed from: b */
    public VCLobbyParticipant f156730b;

    /* renamed from: c */
    public boolean f156731c;

    /* renamed from: d */
    private ParticipantType f156732d;

    /* renamed from: e */
    private GroupType f156733e;

    /* renamed from: f */
    private int f156734f;

    /* renamed from: g */
    private ArrayList<ParticipantItem> f156735g;

    public enum GroupType {
        UNKNOWN,
        TITLE,
        USER
    }

    public enum ParticipantType {
        IN_MEETING,
        SUGGESTION,
        CALLING,
        WAITING
    }

    /* renamed from: a */
    public GroupType mo215629a() {
        return this.f156733e;
    }

    /* renamed from: b */
    public ParticipantType mo215631b() {
        return this.f156732d;
    }

    /* renamed from: c */
    public int mo215632c() {
        return this.f156734f;
    }

    /* renamed from: e */
    public ArrayList<ParticipantItem> mo215634e() {
        return this.f156735g;
    }

    /* renamed from: d */
    public void mo215633d() {
        this.f156735g.clear();
    }

    /* renamed from: a */
    public void mo215630a(List<ParticipantItem> list) {
        mo215633d();
        this.f156735g.addAll(list);
    }

    public ParticipantItem(Participant participant, int i, ParticipantType participantType, GroupType groupType) {
        this.f156731c = true;
        this.f156735g = new ArrayList<>();
        this.f156729a = participant;
        this.f156734f = i;
        this.f156732d = participantType;
        this.f156733e = groupType;
    }

    public ParticipantItem(Participant participant, VCLobbyParticipant vCLobbyParticipant, int i, ParticipantType participantType, GroupType groupType) {
        this(participant, i, participantType, groupType);
        this.f156730b = vCLobbyParticipant;
    }
}
