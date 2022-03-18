package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VCManageNotify extends Message<VCManageNotify, C51154a> {
    public static final ProtoAdapter<VCManageNotify> ADAPTER = new C51155b();
    public static final NotificationType DEFAULT_NOTIFICATION_TYPE = NotificationType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<VCLobbyParticipant> lobby_participants;
    public final String meeting_id;
    public final String need_help_break_out_room_id;
    public final NotificationType notification_type;
    public final List<ByteviewUser> participants;

    public enum NotificationType implements WireEnum {
        UNKNOWN(0),
        MEETINGLOBBY(1),
        PUT_UP_HANDS(2),
        PUT_DOWN_HANDS(3),
        BREAKOUT_ROOM_USER_NEED_HALP(4);
        
        public static final ProtoAdapter<NotificationType> ADAPTER = ProtoAdapter.newEnumAdapter(NotificationType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static NotificationType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MEETINGLOBBY;
            }
            if (i == 2) {
                return PUT_UP_HANDS;
            }
            if (i == 3) {
                return PUT_DOWN_HANDS;
            }
            if (i != 4) {
                return null;
            }
            return BREAKOUT_ROOM_USER_NEED_HALP;
        }

        private NotificationType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageNotify$b */
    private static final class C51155b extends ProtoAdapter<VCManageNotify> {
        C51155b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCManageNotify.class);
        }

        /* renamed from: a */
        public int encodedSize(VCManageNotify vCManageNotify) {
            int i;
            int i2;
            int i3 = 0;
            if (vCManageNotify.meeting_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCManageNotify.meeting_id);
            } else {
                i = 0;
            }
            if (vCManageNotify.notification_type != null) {
                i2 = NotificationType.ADAPTER.encodedSizeWithTag(2, vCManageNotify.notification_type);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + VCLobbyParticipant.ADAPTER.asRepeated().encodedSizeWithTag(3, vCManageNotify.lobby_participants) + ByteviewUser.ADAPTER.asRepeated().encodedSizeWithTag(4, vCManageNotify.participants);
            if (vCManageNotify.need_help_break_out_room_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, vCManageNotify.need_help_break_out_room_id);
            }
            return encodedSizeWithTag + i3 + vCManageNotify.unknownFields().size();
        }

        /* renamed from: a */
        public VCManageNotify decode(ProtoReader protoReader) throws IOException {
            C51154a aVar = new C51154a();
            aVar.f127300a = "";
            aVar.f127301b = NotificationType.UNKNOWN;
            aVar.f127304e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127300a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f127301b = NotificationType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f127302c.add(VCLobbyParticipant.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f127303d.add(ByteviewUser.ADAPTER.decode(protoReader));
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127304e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCManageNotify vCManageNotify) throws IOException {
            if (vCManageNotify.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCManageNotify.meeting_id);
            }
            if (vCManageNotify.notification_type != null) {
                NotificationType.ADAPTER.encodeWithTag(protoWriter, 2, vCManageNotify.notification_type);
            }
            VCLobbyParticipant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, vCManageNotify.lobby_participants);
            ByteviewUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, vCManageNotify.participants);
            if (vCManageNotify.need_help_break_out_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, vCManageNotify.need_help_break_out_room_id);
            }
            protoWriter.writeBytes(vCManageNotify.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCManageNotify$a */
    public static final class C51154a extends Message.Builder<VCManageNotify, C51154a> {

        /* renamed from: a */
        public String f127300a;

        /* renamed from: b */
        public NotificationType f127301b;

        /* renamed from: c */
        public List<VCLobbyParticipant> f127302c = Internal.newMutableList();

        /* renamed from: d */
        public List<ByteviewUser> f127303d = Internal.newMutableList();

        /* renamed from: e */
        public String f127304e;

        /* renamed from: a */
        public VCManageNotify build() {
            return new VCManageNotify(this.f127300a, this.f127301b, this.f127302c, this.f127303d, this.f127304e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51154a newBuilder() {
        C51154a aVar = new C51154a();
        aVar.f127300a = this.meeting_id;
        aVar.f127301b = this.notification_type;
        aVar.f127302c = Internal.copyOf("lobby_participants", this.lobby_participants);
        aVar.f127303d = Internal.copyOf("participants", this.participants);
        aVar.f127304e = this.need_help_break_out_room_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCManageNotify");
        StringBuilder sb = new StringBuilder();
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.notification_type != null) {
            sb.append(", notification_type=");
            sb.append(this.notification_type);
        }
        if (!this.lobby_participants.isEmpty()) {
            sb.append(", lobby_participants=");
            sb.append(this.lobby_participants);
        }
        if (!this.participants.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.need_help_break_out_room_id != null) {
            sb.append(", need_help_break_out_room_id=");
            sb.append(this.need_help_break_out_room_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VCManageNotify{");
        replace.append('}');
        return replace.toString();
    }

    public VCManageNotify(String str, NotificationType notificationType, List<VCLobbyParticipant> list, List<ByteviewUser> list2, String str2) {
        this(str, notificationType, list, list2, str2, ByteString.EMPTY);
    }

    public VCManageNotify(String str, NotificationType notificationType, List<VCLobbyParticipant> list, List<ByteviewUser> list2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.notification_type = notificationType;
        this.lobby_participants = Internal.immutableCopyOf("lobby_participants", list);
        this.participants = Internal.immutableCopyOf("participants", list2);
        this.need_help_break_out_room_id = str2;
    }
}
