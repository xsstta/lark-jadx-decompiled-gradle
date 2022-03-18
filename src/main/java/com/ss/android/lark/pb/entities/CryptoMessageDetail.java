package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CryptoMessageDetail extends Message<CryptoMessageDetail, C49698a> {
    public static final ProtoAdapter<CryptoMessageDetail> ADAPTER = new C49699b();
    public static final ByteString DEFAULT_ADDITIONAL_DATA = ByteString.EMPTY;
    public static final ByteString DEFAULT_CONTENT = ByteString.EMPTY;
    public static final ByteString DEFAULT_NONCE = ByteString.EMPTY;
    public static final ByteString DEFAULT_SENDER_PUBLIC_KEY = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString madditional_data;
    public final ByteString mcontent;
    public final String mfrom_device_id;
    public final ByteString mnonce;
    public final ByteString msender_public_key;

    /* renamed from: com.ss.android.lark.pb.entities.CryptoMessageDetail$b */
    private static final class C49699b extends ProtoAdapter<CryptoMessageDetail> {
        C49699b() {
            super(FieldEncoding.LENGTH_DELIMITED, CryptoMessageDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(CryptoMessageDetail cryptoMessageDetail) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (cryptoMessageDetail.mcontent != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, cryptoMessageDetail.mcontent);
            } else {
                i = 0;
            }
            if (cryptoMessageDetail.mfrom_device_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, cryptoMessageDetail.mfrom_device_id);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (cryptoMessageDetail.msender_public_key != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, cryptoMessageDetail.msender_public_key);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (cryptoMessageDetail.mnonce != null) {
                i4 = ProtoAdapter.BYTES.encodedSizeWithTag(4, cryptoMessageDetail.mnonce);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (cryptoMessageDetail.madditional_data != null) {
                i5 = ProtoAdapter.BYTES.encodedSizeWithTag(5, cryptoMessageDetail.madditional_data);
            }
            return i8 + i5 + cryptoMessageDetail.unknownFields().size();
        }

        /* renamed from: a */
        public CryptoMessageDetail decode(ProtoReader protoReader) throws IOException {
            C49698a aVar = new C49698a();
            aVar.f124426a = ByteString.EMPTY;
            aVar.f124427b = "";
            aVar.f124428c = ByteString.EMPTY;
            aVar.f124429d = ByteString.EMPTY;
            aVar.f124430e = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124426a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124427b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124428c = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f124429d = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124430e = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CryptoMessageDetail cryptoMessageDetail) throws IOException {
            if (cryptoMessageDetail.mcontent != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, cryptoMessageDetail.mcontent);
            }
            if (cryptoMessageDetail.mfrom_device_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, cryptoMessageDetail.mfrom_device_id);
            }
            if (cryptoMessageDetail.msender_public_key != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, cryptoMessageDetail.msender_public_key);
            }
            if (cryptoMessageDetail.mnonce != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, cryptoMessageDetail.mnonce);
            }
            if (cryptoMessageDetail.madditional_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 5, cryptoMessageDetail.madditional_data);
            }
            protoWriter.writeBytes(cryptoMessageDetail.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.CryptoMessageDetail$a */
    public static final class C49698a extends Message.Builder<CryptoMessageDetail, C49698a> {

        /* renamed from: a */
        public ByteString f124426a;

        /* renamed from: b */
        public String f124427b;

        /* renamed from: c */
        public ByteString f124428c;

        /* renamed from: d */
        public ByteString f124429d;

        /* renamed from: e */
        public ByteString f124430e;

        /* renamed from: a */
        public CryptoMessageDetail build() {
            return new CryptoMessageDetail(this.f124426a, this.f124427b, this.f124428c, this.f124429d, this.f124430e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49698a newBuilder() {
        C49698a aVar = new C49698a();
        aVar.f124426a = this.mcontent;
        aVar.f124427b = this.mfrom_device_id;
        aVar.f124428c = this.msender_public_key;
        aVar.f124429d = this.mnonce;
        aVar.f124430e = this.madditional_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mcontent != null) {
            sb.append(", content=");
            sb.append(this.mcontent);
        }
        if (this.mfrom_device_id != null) {
            sb.append(", from_device_id=");
            sb.append(this.mfrom_device_id);
        }
        if (this.msender_public_key != null) {
            sb.append(", sender_public_key=");
            sb.append(this.msender_public_key);
        }
        if (this.mnonce != null) {
            sb.append(", nonce=");
            sb.append(this.mnonce);
        }
        if (this.madditional_data != null) {
            sb.append(", additional_data=");
            sb.append(this.madditional_data);
        }
        StringBuilder replace = sb.replace(0, 2, "CryptoMessageDetail{");
        replace.append('}');
        return replace.toString();
    }

    public CryptoMessageDetail(ByteString byteString, String str, ByteString byteString2, ByteString byteString3, ByteString byteString4) {
        this(byteString, str, byteString2, byteString3, byteString4, ByteString.EMPTY);
    }

    public CryptoMessageDetail(ByteString byteString, String str, ByteString byteString2, ByteString byteString3, ByteString byteString4, ByteString byteString5) {
        super(ADAPTER, byteString5);
        this.mcontent = byteString;
        this.mfrom_device_id = str;
        this.msender_public_key = byteString2;
        this.mnonce = byteString3;
        this.madditional_data = byteString4;
    }
}
