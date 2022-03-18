package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class VCPreLobbyParticipant extends Message<VCPreLobbyParticipant, C51166a> {
    public static final ProtoAdapter<VCPreLobbyParticipant> ADAPTER = new C51167b();
    public static final Boolean DEFAULT_IS_STATUS_WAIT = false;
    public static final Long DEFAULT_JOIN_LOBBY_TIME = 0L;
    public static final LeaveReason DEFAULT_LEAVE_REASON = LeaveReason.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String is_lark_guest;
    public final Boolean is_status_wait;
    public final Long join_lobby_time;
    public final LeaveReason leave_reason;
    public final String meeting_id;
    public final ByteviewUser user;

    public enum LeaveReason implements WireEnum {
        UNKNOWN(0),
        LEAVE(1),
        MEETING_START(2),
        HEARTBEAT_STOP(3);
        
        public static final ProtoAdapter<LeaveReason> ADAPTER = ProtoAdapter.newEnumAdapter(LeaveReason.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static LeaveReason fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LEAVE;
            }
            if (i == 2) {
                return MEETING_START;
            }
            if (i != 3) {
                return null;
            }
            return HEARTBEAT_STOP;
        }

        private LeaveReason(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCPreLobbyParticipant$b */
    private static final class C51167b extends ProtoAdapter<VCPreLobbyParticipant> {
        C51167b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCPreLobbyParticipant.class);
        }

        /* renamed from: a */
        public int encodedSize(VCPreLobbyParticipant vCPreLobbyParticipant) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (vCPreLobbyParticipant.user != null) {
                i = ByteviewUser.ADAPTER.encodedSizeWithTag(1, vCPreLobbyParticipant.user);
            } else {
                i = 0;
            }
            if (vCPreLobbyParticipant.meeting_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, vCPreLobbyParticipant.meeting_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (vCPreLobbyParticipant.is_status_wait != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, vCPreLobbyParticipant.is_status_wait);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (vCPreLobbyParticipant.join_lobby_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, vCPreLobbyParticipant.join_lobby_time);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (vCPreLobbyParticipant.is_lark_guest != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, vCPreLobbyParticipant.is_lark_guest);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (vCPreLobbyParticipant.leave_reason != null) {
                i6 = LeaveReason.ADAPTER.encodedSizeWithTag(6, vCPreLobbyParticipant.leave_reason);
            }
            return i10 + i6 + vCPreLobbyParticipant.unknownFields().size();
        }

        /* renamed from: a */
        public VCPreLobbyParticipant decode(ProtoReader protoReader) throws IOException {
            C51166a aVar = new C51166a();
            aVar.f127346b = "";
            aVar.f127347c = false;
            aVar.f127348d = 0L;
            aVar.f127349e = "";
            aVar.f127350f = LeaveReason.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127345a = ByteviewUser.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127346b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127347c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127348d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127349e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f127350f = LeaveReason.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCPreLobbyParticipant vCPreLobbyParticipant) throws IOException {
            if (vCPreLobbyParticipant.user != null) {
                ByteviewUser.ADAPTER.encodeWithTag(protoWriter, 1, vCPreLobbyParticipant.user);
            }
            if (vCPreLobbyParticipant.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vCPreLobbyParticipant.meeting_id);
            }
            if (vCPreLobbyParticipant.is_status_wait != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, vCPreLobbyParticipant.is_status_wait);
            }
            if (vCPreLobbyParticipant.join_lobby_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, vCPreLobbyParticipant.join_lobby_time);
            }
            if (vCPreLobbyParticipant.is_lark_guest != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, vCPreLobbyParticipant.is_lark_guest);
            }
            if (vCPreLobbyParticipant.leave_reason != null) {
                LeaveReason.ADAPTER.encodeWithTag(protoWriter, 6, vCPreLobbyParticipant.leave_reason);
            }
            protoWriter.writeBytes(vCPreLobbyParticipant.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCPreLobbyParticipant$a */
    public static final class C51166a extends Message.Builder<VCPreLobbyParticipant, C51166a> {

        /* renamed from: a */
        public ByteviewUser f127345a;

        /* renamed from: b */
        public String f127346b;

        /* renamed from: c */
        public Boolean f127347c;

        /* renamed from: d */
        public Long f127348d;

        /* renamed from: e */
        public String f127349e;

        /* renamed from: f */
        public LeaveReason f127350f;

        /* renamed from: a */
        public VCPreLobbyParticipant build() {
            return new VCPreLobbyParticipant(this.f127345a, this.f127346b, this.f127347c, this.f127348d, this.f127349e, this.f127350f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51166a newBuilder() {
        C51166a aVar = new C51166a();
        aVar.f127345a = this.user;
        aVar.f127346b = this.meeting_id;
        aVar.f127347c = this.is_status_wait;
        aVar.f127348d = this.join_lobby_time;
        aVar.f127349e = this.is_lark_guest;
        aVar.f127350f = this.leave_reason;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCPreLobbyParticipant");
        StringBuilder sb = new StringBuilder();
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.is_status_wait != null) {
            sb.append(", is_status_wait=");
            sb.append(this.is_status_wait);
        }
        if (this.join_lobby_time != null) {
            sb.append(", join_lobby_time=");
            sb.append(this.join_lobby_time);
        }
        if (this.is_lark_guest != null) {
            sb.append(", is_lark_guest=");
            sb.append(this.is_lark_guest);
        }
        if (this.leave_reason != null) {
            sb.append(", leave_reason=");
            sb.append(this.leave_reason);
        }
        StringBuilder replace = sb.replace(0, 2, "VCPreLobbyParticipant{");
        replace.append('}');
        return replace.toString();
    }

    public VCPreLobbyParticipant(ByteviewUser byteviewUser, String str, Boolean bool, Long l, String str2, LeaveReason leaveReason) {
        this(byteviewUser, str, bool, l, str2, leaveReason, ByteString.EMPTY);
    }

    public VCPreLobbyParticipant(ByteviewUser byteviewUser, String str, Boolean bool, Long l, String str2, LeaveReason leaveReason, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user = byteviewUser;
        this.meeting_id = str;
        this.is_status_wait = bool;
        this.join_lobby_time = l;
        this.is_lark_guest = str2;
        this.leave_reason = leaveReason;
    }
}
