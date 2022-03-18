package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class CryptoInfo extends Message<CryptoInfo, C49696a> {
    public static final ProtoAdapter<CryptoInfo> ADAPTER = new C49697b();
    public static final Integer DEFAULT_BURNED_SECONDS = 0;
    private static final long serialVersionUID = 0;
    public final Integer mburned_seconds;
    public final CryptoType mcrypto_type;
    public final CryptoMessageDetail mfallback_detail;
    public final String msecret_version;

    public enum CryptoType implements WireEnum {
        UNKNOWN(0),
        PLAIN_TEXT(1),
        E2EE(2),
        THIRD_PARTY(3);
        
        public static final ProtoAdapter<CryptoType> ADAPTER = ProtoAdapter.newEnumAdapter(CryptoType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CryptoType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return PLAIN_TEXT;
            }
            if (i == 2) {
                return E2EE;
            }
            if (i != 3) {
                return null;
            }
            return THIRD_PARTY;
        }

        private CryptoType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.CryptoInfo$b */
    private static final class C49697b extends ProtoAdapter<CryptoInfo> {
        C49697b() {
            super(FieldEncoding.LENGTH_DELIMITED, CryptoInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CryptoInfo cryptoInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (cryptoInfo.mcrypto_type != null) {
                i = CryptoType.ADAPTER.encodedSizeWithTag(1, cryptoInfo.mcrypto_type);
            } else {
                i = 0;
            }
            if (cryptoInfo.msecret_version != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, cryptoInfo.msecret_version);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (cryptoInfo.mburned_seconds != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, cryptoInfo.mburned_seconds);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (cryptoInfo.mfallback_detail != null) {
                i4 = CryptoMessageDetail.ADAPTER.encodedSizeWithTag(4, cryptoInfo.mfallback_detail);
            }
            return i6 + i4 + cryptoInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CryptoInfo decode(ProtoReader protoReader) throws IOException {
            C49696a aVar = new C49696a();
            aVar.f124423b = "";
            aVar.f124424c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f124422a = CryptoType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f124423b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124424c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124425d = CryptoMessageDetail.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CryptoInfo cryptoInfo) throws IOException {
            if (cryptoInfo.mcrypto_type != null) {
                CryptoType.ADAPTER.encodeWithTag(protoWriter, 1, cryptoInfo.mcrypto_type);
            }
            if (cryptoInfo.msecret_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cryptoInfo.msecret_version);
            }
            if (cryptoInfo.mburned_seconds != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, cryptoInfo.mburned_seconds);
            }
            if (cryptoInfo.mfallback_detail != null) {
                CryptoMessageDetail.ADAPTER.encodeWithTag(protoWriter, 4, cryptoInfo.mfallback_detail);
            }
            protoWriter.writeBytes(cryptoInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.CryptoInfo$a */
    public static final class C49696a extends Message.Builder<CryptoInfo, C49696a> {

        /* renamed from: a */
        public CryptoType f124422a;

        /* renamed from: b */
        public String f124423b;

        /* renamed from: c */
        public Integer f124424c;

        /* renamed from: d */
        public CryptoMessageDetail f124425d;

        /* renamed from: a */
        public CryptoInfo build() {
            return new CryptoInfo(this.f124422a, this.f124423b, this.f124424c, this.f124425d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49696a newBuilder() {
        C49696a aVar = new C49696a();
        aVar.f124422a = this.mcrypto_type;
        aVar.f124423b = this.msecret_version;
        aVar.f124424c = this.mburned_seconds;
        aVar.f124425d = this.mfallback_detail;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcrypto_type != null) {
            sb.append(", crypto_type=");
            sb.append(this.mcrypto_type);
        }
        if (this.msecret_version != null) {
            sb.append(", secret_version=");
            sb.append(this.msecret_version);
        }
        if (this.mburned_seconds != null) {
            sb.append(", burned_seconds=");
            sb.append(this.mburned_seconds);
        }
        if (this.mfallback_detail != null) {
            sb.append(", fallback_detail=");
            sb.append(this.mfallback_detail);
        }
        StringBuilder replace = sb.replace(0, 2, "CryptoInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CryptoInfo(CryptoType cryptoType, String str, Integer num, CryptoMessageDetail cryptoMessageDetail) {
        this(cryptoType, str, num, cryptoMessageDetail, ByteString.EMPTY);
    }

    public CryptoInfo(CryptoType cryptoType, String str, Integer num, CryptoMessageDetail cryptoMessageDetail, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mcrypto_type = cryptoType;
        this.msecret_version = str;
        this.mburned_seconds = num;
        this.mfallback_detail = cryptoMessageDetail;
    }
}
