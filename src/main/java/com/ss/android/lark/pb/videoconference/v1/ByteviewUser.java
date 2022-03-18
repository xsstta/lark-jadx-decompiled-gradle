package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ByteviewUser extends Message<ByteviewUser, C50491a> {
    public static final ProtoAdapter<ByteviewUser> ADAPTER = new C50492b();
    public static final ParticipantType DEFAULT_USER_TYPE = ParticipantType.UNKNOW;
    private static final long serialVersionUID = 0;
    public final String device_id;
    public final String user_id;
    public final ParticipantType user_type;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteviewUser$b */
    private static final class C50492b extends ProtoAdapter<ByteviewUser> {
        C50492b() {
            super(FieldEncoding.LENGTH_DELIMITED, ByteviewUser.class);
        }

        /* renamed from: a */
        public int encodedSize(ByteviewUser byteviewUser) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, byteviewUser.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, byteviewUser.device_id) + ParticipantType.ADAPTER.encodedSizeWithTag(3, byteviewUser.user_type) + byteviewUser.unknownFields().size();
        }

        /* renamed from: a */
        public ByteviewUser decode(ProtoReader protoReader) throws IOException {
            C50491a aVar = new C50491a();
            aVar.f126048a = "";
            aVar.f126049b = "";
            aVar.f126050c = ParticipantType.UNKNOW;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126048a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126049b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126050c = ParticipantType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ByteviewUser byteviewUser) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, byteviewUser.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, byteviewUser.device_id);
            ParticipantType.ADAPTER.encodeWithTag(protoWriter, 3, byteviewUser.user_type);
            protoWriter.writeBytes(byteviewUser.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50491a newBuilder() {
        C50491a aVar = new C50491a();
        aVar.f126048a = this.user_id;
        aVar.f126049b = this.device_id;
        aVar.f126050c = this.user_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ByteviewUser$a */
    public static final class C50491a extends Message.Builder<ByteviewUser, C50491a> {

        /* renamed from: a */
        public String f126048a;

        /* renamed from: b */
        public String f126049b;

        /* renamed from: c */
        public ParticipantType f126050c;

        /* renamed from: a */
        public ByteviewUser build() {
            String str;
            ParticipantType participantType;
            String str2 = this.f126048a;
            if (str2 != null && (str = this.f126049b) != null && (participantType = this.f126050c) != null) {
                return new ByteviewUser(str2, str, participantType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "user_id", this.f126049b, "device_id", this.f126050c, "user_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ByteviewUser");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", device_id=");
        sb.append(this.device_id);
        sb.append(", user_type=");
        sb.append(this.user_type);
        StringBuilder replace = sb.replace(0, 2, "ByteviewUser{");
        replace.append('}');
        return replace.toString();
    }

    public ByteviewUser(String str, String str2, ParticipantType participantType) {
        this(str, str2, participantType, ByteString.EMPTY);
    }

    public ByteviewUser(String str, String str2, ParticipantType participantType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.device_id = str2;
        this.user_type = participantType;
    }
}
