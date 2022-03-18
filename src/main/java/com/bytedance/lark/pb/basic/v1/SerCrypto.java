package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SerCrypto extends Message<SerCrypto, Builder> {
    public static final ProtoAdapter<SerCrypto> ADAPTER = new C15263a();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Cipher cipher;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        AES_256_GCM(1),
        AES_CTR(2),
        CRYPTO_SDK_UNIFIED(3),
        CRYPTO_SDK_DOWNGRADE(4),
        CRYPTO_SDK_THIRDPARTY(5),
        SM4_128(6);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return AES_256_GCM;
                case 2:
                    return AES_CTR;
                case 3:
                    return CRYPTO_SDK_UNIFIED;
                case 4:
                    return CRYPTO_SDK_DOWNGRADE;
                case 5:
                    return CRYPTO_SDK_THIRDPARTY;
                case 6:
                    return SM4_128;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SerCrypto$a */
    private static final class C15263a extends ProtoAdapter<SerCrypto> {
        C15263a() {
            super(FieldEncoding.LENGTH_DELIMITED, SerCrypto.class);
        }

        /* renamed from: a */
        public int encodedSize(SerCrypto serCrypto) {
            int i;
            int i2 = 0;
            if (serCrypto.type != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, serCrypto.type);
            } else {
                i = 0;
            }
            if (serCrypto.cipher != null) {
                i2 = Cipher.ADAPTER.encodedSizeWithTag(2, serCrypto.cipher);
            }
            return i + i2 + serCrypto.unknownFields().size();
        }

        /* renamed from: a */
        public SerCrypto decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            builder.type = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.type = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cipher = Cipher.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SerCrypto serCrypto) throws IOException {
            if (serCrypto.type != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, serCrypto.type);
            }
            if (serCrypto.cipher != null) {
                Cipher.ADAPTER.encodeWithTag(protoWriter, 2, serCrypto.cipher);
            }
            protoWriter.writeBytes(serCrypto.unknownFields());
        }
    }

    public static final class Builder extends Message.Builder<SerCrypto, Builder> {
        public Cipher cipher;
        public Type type;

        @Override // com.squareup.wire.Message.Builder
        public SerCrypto build() {
            return new SerCrypto(this.type, this.cipher, super.buildUnknownFields());
        }

        public Builder cipher(Cipher cipher2) {
            this.cipher = cipher2;
            return this;
        }

        public Builder type(Type type2) {
            this.type = type2;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.cipher = this.cipher;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SerCrypto");
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.cipher != null) {
            sb.append(", cipher=");
            sb.append(this.cipher);
        }
        StringBuilder replace = sb.replace(0, 2, "SerCrypto{");
        replace.append('}');
        return replace.toString();
    }

    public SerCrypto(Type type2, Cipher cipher2) {
        this(type2, cipher2, ByteString.EMPTY);
    }

    public SerCrypto(Type type2, Cipher cipher2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.cipher = cipher2;
    }
}
