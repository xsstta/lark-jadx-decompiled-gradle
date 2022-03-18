package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class VideoChatParticipant extends Message<VideoChatParticipant, C51274a> {
    public static final ProtoAdapter<VideoChatParticipant> ADAPTER = new C51275b();
    public static final Boolean DEFAULT_IS_BOT = false;
    public static final ParticipantRole DEFAULT_ROLE = ParticipantRole.UNKNOW_ROLE;
    public static final ParticipantType DEFAULT_TYPE = ParticipantType.UNKNOW;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String device_id;
    public final Boolean is_bot;
    public final String name;
    public final ParticipantRole role;
    public final ParticipantType type;
    public final String user_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatParticipant$b */
    private static final class C51275b extends ProtoAdapter<VideoChatParticipant> {
        C51275b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatParticipant.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatParticipant videoChatParticipant) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = 0;
            if (videoChatParticipant.user_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, videoChatParticipant.user_id);
            } else {
                i = 0;
            }
            if (videoChatParticipant.device_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, videoChatParticipant.device_id);
            } else {
                i2 = 0;
            }
            int i8 = i + i2;
            if (videoChatParticipant.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatParticipant.name);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (videoChatParticipant.avatar_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoChatParticipant.avatar_key);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (videoChatParticipant.type != null) {
                i5 = ParticipantType.ADAPTER.encodedSizeWithTag(5, videoChatParticipant.type);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (videoChatParticipant.role != null) {
                i6 = ParticipantRole.ADAPTER.encodedSizeWithTag(6, videoChatParticipant.role);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (videoChatParticipant.is_bot != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, videoChatParticipant.is_bot);
            }
            return i12 + i7 + videoChatParticipant.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatParticipant decode(ProtoReader protoReader) throws IOException {
            C51274a aVar = new C51274a();
            aVar.f127689a = "";
            aVar.f127690b = "";
            aVar.f127691c = "";
            aVar.f127692d = "";
            aVar.f127693e = ParticipantType.UNKNOW;
            aVar.f127694f = ParticipantRole.UNKNOW_ROLE;
            aVar.f127695g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127689a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127690b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127691c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127692d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f127693e = ParticipantType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f127694f = ParticipantRole.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f127695g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
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
        public void encode(ProtoWriter protoWriter, VideoChatParticipant videoChatParticipant) throws IOException {
            if (videoChatParticipant.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, videoChatParticipant.user_id);
            }
            if (videoChatParticipant.device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, videoChatParticipant.device_id);
            }
            if (videoChatParticipant.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatParticipant.name);
            }
            if (videoChatParticipant.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoChatParticipant.avatar_key);
            }
            if (videoChatParticipant.type != null) {
                ParticipantType.ADAPTER.encodeWithTag(protoWriter, 5, videoChatParticipant.type);
            }
            if (videoChatParticipant.role != null) {
                ParticipantRole.ADAPTER.encodeWithTag(protoWriter, 6, videoChatParticipant.role);
            }
            if (videoChatParticipant.is_bot != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, videoChatParticipant.is_bot);
            }
            protoWriter.writeBytes(videoChatParticipant.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatParticipant$a */
    public static final class C51274a extends Message.Builder<VideoChatParticipant, C51274a> {

        /* renamed from: a */
        public String f127689a;

        /* renamed from: b */
        public String f127690b;

        /* renamed from: c */
        public String f127691c;

        /* renamed from: d */
        public String f127692d;

        /* renamed from: e */
        public ParticipantType f127693e;

        /* renamed from: f */
        public ParticipantRole f127694f;

        /* renamed from: g */
        public Boolean f127695g;

        /* renamed from: a */
        public VideoChatParticipant build() {
            return new VideoChatParticipant(this.f127689a, this.f127690b, this.f127691c, this.f127692d, this.f127693e, this.f127694f, this.f127695g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51274a newBuilder() {
        C51274a aVar = new C51274a();
        aVar.f127689a = this.user_id;
        aVar.f127690b = this.device_id;
        aVar.f127691c = this.name;
        aVar.f127692d = this.avatar_key;
        aVar.f127693e = this.type;
        aVar.f127694f = this.role;
        aVar.f127695g = this.is_bot;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatParticipant");
        StringBuilder sb = new StringBuilder();
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.device_id != null) {
            sb.append(", device_id=");
            sb.append(this.device_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        if (this.is_bot != null) {
            sb.append(", is_bot=");
            sb.append(this.is_bot);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatParticipant{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatParticipant(String str, String str2, String str3, String str4, ParticipantType participantType, ParticipantRole participantRole, Boolean bool) {
        this(str, str2, str3, str4, participantType, participantRole, bool, ByteString.EMPTY);
    }

    public VideoChatParticipant(String str, String str2, String str3, String str4, ParticipantType participantType, ParticipantRole participantRole, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.device_id = str2;
        this.name = str3;
        this.avatar_key = str4;
        this.type = participantType;
        this.role = participantRole;
        this.is_bot = bool;
    }
}
