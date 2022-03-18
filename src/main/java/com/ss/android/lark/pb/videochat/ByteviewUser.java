package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ByteviewUser extends Message<ByteviewUser, C50274a> {
    public static final ProtoAdapter<ByteviewUser> ADAPTER = new C50275b();
    private static final long serialVersionUID = 0;
    public final String mdevice_id;
    public final String muser_id;
    public final ParticipantType muser_type;

    /* renamed from: com.ss.android.lark.pb.videochat.ByteviewUser$b */
    private static final class C50275b extends ProtoAdapter<ByteviewUser> {
        C50275b() {
            super(FieldEncoding.LENGTH_DELIMITED, ByteviewUser.class);
        }

        /* renamed from: a */
        public int encodedSize(ByteviewUser byteviewUser) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, byteviewUser.muser_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, byteviewUser.mdevice_id) + ParticipantType.ADAPTER.encodedSizeWithTag(3, byteviewUser.muser_type) + byteviewUser.unknownFields().size();
        }

        /* renamed from: a */
        public ByteviewUser decode(ProtoReader protoReader) throws IOException {
            C50274a aVar = new C50274a();
            aVar.f125632a = "";
            aVar.f125633b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125632a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125633b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f125634c = ParticipantType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ByteviewUser byteviewUser) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, byteviewUser.muser_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, byteviewUser.mdevice_id);
            ParticipantType.ADAPTER.encodeWithTag(protoWriter, 3, byteviewUser.muser_type);
            protoWriter.writeBytes(byteviewUser.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50274a newBuilder() {
        C50274a aVar = new C50274a();
        aVar.f125632a = this.muser_id;
        aVar.f125633b = this.mdevice_id;
        aVar.f125634c = this.muser_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videochat.ByteviewUser$a */
    public static final class C50274a extends Message.Builder<ByteviewUser, C50274a> {

        /* renamed from: a */
        public String f125632a;

        /* renamed from: b */
        public String f125633b;

        /* renamed from: c */
        public ParticipantType f125634c;

        /* renamed from: a */
        public ByteviewUser build() {
            String str;
            ParticipantType participantType;
            String str2 = this.f125632a;
            if (str2 != null && (str = this.f125633b) != null && (participantType = this.f125634c) != null) {
                return new ByteviewUser(str2, str, participantType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "muser_id", this.f125633b, "mdevice_id", this.f125634c, "muser_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.muser_id);
        sb.append(", device_id=");
        sb.append(this.mdevice_id);
        sb.append(", user_type=");
        sb.append(this.muser_type);
        StringBuilder replace = sb.replace(0, 2, "ByteviewUser{");
        replace.append('}');
        return replace.toString();
    }

    public ByteviewUser(String str, String str2, ParticipantType participantType) {
        this(str, str2, participantType, ByteString.EMPTY);
    }

    public ByteviewUser(String str, String str2, ParticipantType participantType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = str;
        this.mdevice_id = str2;
        this.muser_type = participantType;
    }
}
