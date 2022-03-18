package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class Crypto extends Message<Crypto, C49694a> {
    public static final ProtoAdapter<Crypto> ADAPTER = new C49695b();
    private static final long serialVersionUID = 0;
    public final Cipher mcipher;
    public final Type mtype;

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

    /* renamed from: com.ss.android.lark.pb.entities.Crypto$b */
    private static final class C49695b extends ProtoAdapter<Crypto> {
        C49695b() {
            super(FieldEncoding.LENGTH_DELIMITED, Crypto.class);
        }

        /* renamed from: a */
        public int encodedSize(Crypto crypto) {
            int i;
            int i2 = 0;
            if (crypto.mtype != null) {
                i = Type.ADAPTER.encodedSizeWithTag(1, crypto.mtype);
            } else {
                i = 0;
            }
            if (crypto.mcipher != null) {
                i2 = Cipher.ADAPTER.encodedSizeWithTag(2, crypto.mcipher);
            }
            return i + i2 + crypto.unknownFields().size();
        }

        /* renamed from: a */
        public Crypto decode(ProtoReader protoReader) throws IOException {
            C49694a aVar = new C49694a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124420a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124421b = Cipher.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Crypto crypto) throws IOException {
            if (crypto.mtype != null) {
                Type.ADAPTER.encodeWithTag(protoWriter, 1, crypto.mtype);
            }
            if (crypto.mcipher != null) {
                Cipher.ADAPTER.encodeWithTag(protoWriter, 2, crypto.mcipher);
            }
            protoWriter.writeBytes(crypto.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.Crypto$a */
    public static final class C49694a extends Message.Builder<Crypto, C49694a> {

        /* renamed from: a */
        public Type f124420a;

        /* renamed from: b */
        public Cipher f124421b;

        /* renamed from: a */
        public Crypto build() {
            return new Crypto(this.f124420a, this.f124421b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49694a newBuilder() {
        C49694a aVar = new C49694a();
        aVar.f124420a = this.mtype;
        aVar.f124421b = this.mcipher;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtype != null) {
            sb.append(", type=");
            sb.append(this.mtype);
        }
        if (this.mcipher != null) {
            sb.append(", cipher=");
            sb.append(this.mcipher);
        }
        StringBuilder replace = sb.replace(0, 2, "Crypto{");
        replace.append('}');
        return replace.toString();
    }

    public Crypto(Type type, Cipher cipher) {
        this(type, cipher, ByteString.EMPTY);
    }

    public Crypto(Type type, Cipher cipher, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
        this.mcipher = cipher;
    }
}
