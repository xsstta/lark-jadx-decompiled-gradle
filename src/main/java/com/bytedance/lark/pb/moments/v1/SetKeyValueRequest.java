package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SetKeyValueRequest extends Message<SetKeyValueRequest, C18544a> {
    public static final ProtoAdapter<SetKeyValueRequest> ADAPTER = new C18545b();
    public static final KeyType DEFAULT_KEY_TYPE = KeyType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String key;
    public final KeyType key_type;
    public final String value;

    public enum KeyType implements WireEnum {
        UNKNOWN(0),
        COMMON(1),
        DRAFT(2),
        SDK_LOCAL_PATH(101),
        SETTING(102);
        
        public static final ProtoAdapter<KeyType> ADAPTER = ProtoAdapter.newEnumAdapter(KeyType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static KeyType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return COMMON;
            }
            if (i == 2) {
                return DRAFT;
            }
            if (i == 101) {
                return SDK_LOCAL_PATH;
            }
            if (i != 102) {
                return null;
            }
            return SETTING;
        }

        private KeyType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.SetKeyValueRequest$b */
    private static final class C18545b extends ProtoAdapter<SetKeyValueRequest> {
        C18545b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetKeyValueRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetKeyValueRequest setKeyValueRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (setKeyValueRequest.key_type != null) {
                i = KeyType.ADAPTER.encodedSizeWithTag(1, setKeyValueRequest.key_type);
            } else {
                i = 0;
            }
            if (setKeyValueRequest.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, setKeyValueRequest.key);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (setKeyValueRequest.value != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, setKeyValueRequest.value);
            }
            return i4 + i3 + setKeyValueRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetKeyValueRequest decode(ProtoReader protoReader) throws IOException {
            C18544a aVar = new C18544a();
            aVar.f46031a = KeyType.UNKNOWN;
            aVar.f46032b = "";
            aVar.f46033c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f46031a = KeyType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f46032b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46033c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetKeyValueRequest setKeyValueRequest) throws IOException {
            if (setKeyValueRequest.key_type != null) {
                KeyType.ADAPTER.encodeWithTag(protoWriter, 1, setKeyValueRequest.key_type);
            }
            if (setKeyValueRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setKeyValueRequest.key);
            }
            if (setKeyValueRequest.value != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setKeyValueRequest.value);
            }
            protoWriter.writeBytes(setKeyValueRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.SetKeyValueRequest$a */
    public static final class C18544a extends Message.Builder<SetKeyValueRequest, C18544a> {

        /* renamed from: a */
        public KeyType f46031a;

        /* renamed from: b */
        public String f46032b;

        /* renamed from: c */
        public String f46033c;

        /* renamed from: a */
        public SetKeyValueRequest build() {
            return new SetKeyValueRequest(this.f46031a, this.f46032b, this.f46033c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18544a mo63967a(KeyType keyType) {
            this.f46031a = keyType;
            return this;
        }

        /* renamed from: b */
        public C18544a mo63970b(String str) {
            this.f46033c = str;
            return this;
        }

        /* renamed from: a */
        public C18544a mo63968a(String str) {
            this.f46032b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18544a newBuilder() {
        C18544a aVar = new C18544a();
        aVar.f46031a = this.key_type;
        aVar.f46032b = this.key;
        aVar.f46033c = this.value;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "SetKeyValueRequest");
        StringBuilder sb = new StringBuilder();
        if (this.key_type != null) {
            sb.append(", key_type=");
            sb.append(this.key_type);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "SetKeyValueRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetKeyValueRequest(KeyType keyType, String str, String str2) {
        this(keyType, str, str2, ByteString.EMPTY);
    }

    public SetKeyValueRequest(KeyType keyType, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key_type = keyType;
        this.key = str;
        this.value = str2;
    }
}
