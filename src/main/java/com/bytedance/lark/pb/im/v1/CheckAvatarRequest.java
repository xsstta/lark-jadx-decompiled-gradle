package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CheckAvatarRequest extends Message<CheckAvatarRequest, C17320a> {
    public static final ProtoAdapter<CheckAvatarRequest> ADAPTER = new C17321b();
    public static final Type DEFAULT_TYPE = Type.CHATTER;
    private static final long serialVersionUID = 0;
    public final String id;
    public final String key;
    public final Type type;

    public enum Type implements WireEnum {
        CHATTER(0),
        CHAT(1);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return CHATTER;
            }
            if (i != 1) {
                return null;
            }
            return CHAT;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckAvatarRequest$b */
    private static final class C17321b extends ProtoAdapter<CheckAvatarRequest> {
        C17321b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckAvatarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckAvatarRequest checkAvatarRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, checkAvatarRequest.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, checkAvatarRequest.key);
            if (checkAvatarRequest.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(3, checkAvatarRequest.type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + checkAvatarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckAvatarRequest decode(ProtoReader protoReader) throws IOException {
            C17320a aVar = new C17320a();
            aVar.f44171a = "";
            aVar.f44172b = "";
            aVar.f44173c = Type.CHATTER;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44171a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44172b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44173c = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckAvatarRequest checkAvatarRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkAvatarRequest.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, checkAvatarRequest.key);
            if (checkAvatarRequest.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 3, checkAvatarRequest.type);
            }
            protoWriter.writeBytes(checkAvatarRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17320a newBuilder() {
        C17320a aVar = new C17320a();
        aVar.f44171a = this.id;
        aVar.f44172b = this.key;
        aVar.f44173c = this.type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckAvatarRequest$a */
    public static final class C17320a extends Message.Builder<CheckAvatarRequest, C17320a> {

        /* renamed from: a */
        public String f44171a;

        /* renamed from: b */
        public String f44172b;

        /* renamed from: c */
        public Type f44173c;

        /* renamed from: a */
        public CheckAvatarRequest build() {
            String str;
            String str2 = this.f44171a;
            if (str2 != null && (str = this.f44172b) != null) {
                return new CheckAvatarRequest(str2, str, this.f44173c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "id", this.f44172b, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CheckAvatarRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", key=");
        sb.append(this.key);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckAvatarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckAvatarRequest(String str, String str2, Type type2) {
        this(str, str2, type2, ByteString.EMPTY);
    }

    public CheckAvatarRequest(String str, String str2, Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.key = str2;
        this.type = type2;
    }
}
