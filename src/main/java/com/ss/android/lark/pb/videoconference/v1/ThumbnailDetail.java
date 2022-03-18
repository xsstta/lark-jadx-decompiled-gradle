package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class ThumbnailDetail extends Message<ThumbnailDetail, C51116a> {
    public static final ProtoAdapter<ThumbnailDetail> ADAPTER = new C51117b();
    public static final CipherType DEFAULT_CIPHER_TYPE = CipherType.UNENCRYPTED;
    private static final long serialVersionUID = 0;
    public final CipherType cipher_type;
    public final String decrypt_key;
    public final String nonce;
    public final String thumbnail_url;

    public enum CipherType implements WireEnum {
        UNENCRYPTED(0),
        AES_256_GCM(1),
        AES_CBC(2),
        SM4_128(3);
        
        public static final ProtoAdapter<CipherType> ADAPTER = ProtoAdapter.newEnumAdapter(CipherType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CipherType fromValue(int i) {
            if (i == 0) {
                return UNENCRYPTED;
            }
            if (i == 1) {
                return AES_256_GCM;
            }
            if (i == 2) {
                return AES_CBC;
            }
            if (i != 3) {
                return null;
            }
            return SM4_128;
        }

        private CipherType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ThumbnailDetail$b */
    private static final class C51117b extends ProtoAdapter<ThumbnailDetail> {
        C51117b() {
            super(FieldEncoding.LENGTH_DELIMITED, ThumbnailDetail.class);
        }

        /* renamed from: a */
        public int encodedSize(ThumbnailDetail thumbnailDetail) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (thumbnailDetail.thumbnail_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, thumbnailDetail.thumbnail_url);
            } else {
                i = 0;
            }
            if (thumbnailDetail.decrypt_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, thumbnailDetail.decrypt_key);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (thumbnailDetail.cipher_type != null) {
                i3 = CipherType.ADAPTER.encodedSizeWithTag(3, thumbnailDetail.cipher_type);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (thumbnailDetail.nonce != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, thumbnailDetail.nonce);
            }
            return i6 + i4 + thumbnailDetail.unknownFields().size();
        }

        /* renamed from: a */
        public ThumbnailDetail decode(ProtoReader protoReader) throws IOException {
            C51116a aVar = new C51116a();
            aVar.f127229a = "";
            aVar.f127230b = "";
            aVar.f127231c = CipherType.UNENCRYPTED;
            aVar.f127232d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127229a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127230b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f127231c = CipherType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127232d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ThumbnailDetail thumbnailDetail) throws IOException {
            if (thumbnailDetail.thumbnail_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, thumbnailDetail.thumbnail_url);
            }
            if (thumbnailDetail.decrypt_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, thumbnailDetail.decrypt_key);
            }
            if (thumbnailDetail.cipher_type != null) {
                CipherType.ADAPTER.encodeWithTag(protoWriter, 3, thumbnailDetail.cipher_type);
            }
            if (thumbnailDetail.nonce != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, thumbnailDetail.nonce);
            }
            protoWriter.writeBytes(thumbnailDetail.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ThumbnailDetail$a */
    public static final class C51116a extends Message.Builder<ThumbnailDetail, C51116a> {

        /* renamed from: a */
        public String f127229a;

        /* renamed from: b */
        public String f127230b;

        /* renamed from: c */
        public CipherType f127231c;

        /* renamed from: d */
        public String f127232d;

        /* renamed from: a */
        public ThumbnailDetail build() {
            return new ThumbnailDetail(this.f127229a, this.f127230b, this.f127231c, this.f127232d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51116a newBuilder() {
        C51116a aVar = new C51116a();
        aVar.f127229a = this.thumbnail_url;
        aVar.f127230b = this.decrypt_key;
        aVar.f127231c = this.cipher_type;
        aVar.f127232d = this.nonce;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ThumbnailDetail");
        StringBuilder sb = new StringBuilder();
        if (this.thumbnail_url != null) {
            sb.append(", thumbnail_url=");
            sb.append(this.thumbnail_url);
        }
        if (this.decrypt_key != null) {
            sb.append(", decrypt_key=");
            sb.append(this.decrypt_key);
        }
        if (this.cipher_type != null) {
            sb.append(", cipher_type=");
            sb.append(this.cipher_type);
        }
        if (this.nonce != null) {
            sb.append(", nonce=");
            sb.append(this.nonce);
        }
        StringBuilder replace = sb.replace(0, 2, "ThumbnailDetail{");
        replace.append('}');
        return replace.toString();
    }

    public ThumbnailDetail(String str, String str2, CipherType cipherType, String str3) {
        this(str, str2, cipherType, str3, ByteString.EMPTY);
    }

    public ThumbnailDetail(String str, String str2, CipherType cipherType, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thumbnail_url = str;
        this.decrypt_key = str2;
        this.cipher_type = cipherType;
        this.nonce = str3;
    }
}
