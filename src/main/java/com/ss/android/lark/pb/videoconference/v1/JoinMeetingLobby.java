package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class JoinMeetingLobby extends Message<JoinMeetingLobby, C50819a> {
    public static final ProtoAdapter<JoinMeetingLobby> ADAPTER = new C50820b();
    public static final Boolean DEFAULT_IS_JOIN_MEETING_LOBBY = false;
    public static final Boolean DEFAULT_IS_JOIN_PRE_LOBBY = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_join_meeting_lobby;
    public final Boolean is_join_pre_lobby;
    public final VCLobbyParticipant lobby_participant;
    public final VCPreLobbyParticipant pre_lobby_participant;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingLobby$b */
    private static final class C50820b extends ProtoAdapter<JoinMeetingLobby> {
        C50820b() {
            super(FieldEncoding.LENGTH_DELIMITED, JoinMeetingLobby.class);
        }

        /* renamed from: a */
        public int encodedSize(JoinMeetingLobby joinMeetingLobby) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (joinMeetingLobby.is_join_meeting_lobby != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, joinMeetingLobby.is_join_meeting_lobby);
            } else {
                i = 0;
            }
            if (joinMeetingLobby.lobby_participant != null) {
                i2 = VCLobbyParticipant.ADAPTER.encodedSizeWithTag(2, joinMeetingLobby.lobby_participant);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (joinMeetingLobby.is_join_pre_lobby != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, joinMeetingLobby.is_join_pre_lobby);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (joinMeetingLobby.pre_lobby_participant != null) {
                i4 = VCPreLobbyParticipant.ADAPTER.encodedSizeWithTag(4, joinMeetingLobby.pre_lobby_participant);
            }
            return i6 + i4 + joinMeetingLobby.unknownFields().size();
        }

        /* renamed from: a */
        public JoinMeetingLobby decode(ProtoReader protoReader) throws IOException {
            C50819a aVar = new C50819a();
            aVar.f126687a = false;
            aVar.f126689c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126687a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126688b = VCLobbyParticipant.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126689c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126690d = VCPreLobbyParticipant.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, JoinMeetingLobby joinMeetingLobby) throws IOException {
            if (joinMeetingLobby.is_join_meeting_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, joinMeetingLobby.is_join_meeting_lobby);
            }
            if (joinMeetingLobby.lobby_participant != null) {
                VCLobbyParticipant.ADAPTER.encodeWithTag(protoWriter, 2, joinMeetingLobby.lobby_participant);
            }
            if (joinMeetingLobby.is_join_pre_lobby != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, joinMeetingLobby.is_join_pre_lobby);
            }
            if (joinMeetingLobby.pre_lobby_participant != null) {
                VCPreLobbyParticipant.ADAPTER.encodeWithTag(protoWriter, 4, joinMeetingLobby.pre_lobby_participant);
            }
            protoWriter.writeBytes(joinMeetingLobby.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.JoinMeetingLobby$a */
    public static final class C50819a extends Message.Builder<JoinMeetingLobby, C50819a> {

        /* renamed from: a */
        public Boolean f126687a;

        /* renamed from: b */
        public VCLobbyParticipant f126688b;

        /* renamed from: c */
        public Boolean f126689c;

        /* renamed from: d */
        public VCPreLobbyParticipant f126690d;

        /* renamed from: a */
        public JoinMeetingLobby build() {
            return new JoinMeetingLobby(this.f126687a, this.f126688b, this.f126689c, this.f126690d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50819a newBuilder() {
        C50819a aVar = new C50819a();
        aVar.f126687a = this.is_join_meeting_lobby;
        aVar.f126688b = this.lobby_participant;
        aVar.f126689c = this.is_join_pre_lobby;
        aVar.f126690d = this.pre_lobby_participant;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "JoinMeetingLobby");
        StringBuilder sb = new StringBuilder();
        if (this.is_join_meeting_lobby != null) {
            sb.append(", is_join_meeting_lobby=");
            sb.append(this.is_join_meeting_lobby);
        }
        if (this.lobby_participant != null) {
            sb.append(", lobby_participant=");
            sb.append(this.lobby_participant);
        }
        if (this.is_join_pre_lobby != null) {
            sb.append(", is_join_pre_lobby=");
            sb.append(this.is_join_pre_lobby);
        }
        if (this.pre_lobby_participant != null) {
            sb.append(", pre_lobby_participant=");
            sb.append(this.pre_lobby_participant);
        }
        StringBuilder replace = sb.replace(0, 2, "JoinMeetingLobby{");
        replace.append('}');
        return replace.toString();
    }

    public JoinMeetingLobby(Boolean bool, VCLobbyParticipant vCLobbyParticipant, Boolean bool2, VCPreLobbyParticipant vCPreLobbyParticipant) {
        this(bool, vCLobbyParticipant, bool2, vCPreLobbyParticipant, ByteString.EMPTY);
    }

    public JoinMeetingLobby(Boolean bool, VCLobbyParticipant vCLobbyParticipant, Boolean bool2, VCPreLobbyParticipant vCPreLobbyParticipant, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_join_meeting_lobby = bool;
        this.lobby_participant = vCLobbyParticipant;
        this.is_join_pre_lobby = bool2;
        this.pre_lobby_participant = vCPreLobbyParticipant;
    }
}
