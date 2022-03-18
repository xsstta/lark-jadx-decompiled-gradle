package com.bytedance.lark.pb.space.drive.v1;

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

public final class DriveDecryptRequest extends Message<DriveDecryptRequest, C19355a> {
    public static final ProtoAdapter<DriveDecryptRequest> ADAPTER = new C19356b();
    public static final ByteString DEFAULT_BODY = ByteString.EMPTY;
    public static final DecryptType DEFAULT_DECRYPT_TYPE = DecryptType.AesGcm;
    private static final long serialVersionUID = 0;
    public final ByteString body;
    public final DecryptType decrypt_type;
    public final String key;
    public final String nonce;

    public enum DecryptType implements WireEnum {
        AesGcm(0),
        Sm4Gcm(1);
        
        public static final ProtoAdapter<DecryptType> ADAPTER = ProtoAdapter.newEnumAdapter(DecryptType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DecryptType fromValue(int i) {
            if (i == 0) {
                return AesGcm;
            }
            if (i != 1) {
                return null;
            }
            return Sm4Gcm;
        }

        private DecryptType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveDecryptRequest$b */
    private static final class C19356b extends ProtoAdapter<DriveDecryptRequest> {
        C19356b() {
            super(FieldEncoding.LENGTH_DELIMITED, DriveDecryptRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DriveDecryptRequest driveDecryptRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = DecryptType.ADAPTER.encodedSizeWithTag(1, driveDecryptRequest.decrypt_type);
            int i3 = 0;
            if (driveDecryptRequest.key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, driveDecryptRequest.key);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (driveDecryptRequest.nonce != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, driveDecryptRequest.nonce);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (driveDecryptRequest.body != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(4, driveDecryptRequest.body);
            }
            return i5 + i3 + driveDecryptRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DriveDecryptRequest decode(ProtoReader protoReader) throws IOException {
            C19355a aVar = new C19355a();
            aVar.f47584a = DecryptType.AesGcm;
            aVar.f47585b = "";
            aVar.f47586c = "";
            aVar.f47587d = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f47584a = DecryptType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f47585b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47586c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47587d = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DriveDecryptRequest driveDecryptRequest) throws IOException {
            DecryptType.ADAPTER.encodeWithTag(protoWriter, 1, driveDecryptRequest.decrypt_type);
            if (driveDecryptRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, driveDecryptRequest.key);
            }
            if (driveDecryptRequest.nonce != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, driveDecryptRequest.nonce);
            }
            if (driveDecryptRequest.body != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, driveDecryptRequest.body);
            }
            protoWriter.writeBytes(driveDecryptRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19355a newBuilder() {
        C19355a aVar = new C19355a();
        aVar.f47584a = this.decrypt_type;
        aVar.f47585b = this.key;
        aVar.f47586c = this.nonce;
        aVar.f47587d = this.body;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DriveDecryptRequest$a */
    public static final class C19355a extends Message.Builder<DriveDecryptRequest, C19355a> {

        /* renamed from: a */
        public DecryptType f47584a;

        /* renamed from: b */
        public String f47585b;

        /* renamed from: c */
        public String f47586c;

        /* renamed from: d */
        public ByteString f47587d;

        /* renamed from: a */
        public DriveDecryptRequest build() {
            DecryptType decryptType = this.f47584a;
            if (decryptType != null) {
                return new DriveDecryptRequest(decryptType, this.f47585b, this.f47586c, this.f47587d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(decryptType, "decrypt_type");
        }

        /* renamed from: a */
        public C19355a mo65948a(DecryptType decryptType) {
            this.f47584a = decryptType;
            return this;
        }

        /* renamed from: b */
        public C19355a mo65952b(String str) {
            this.f47586c = str;
            return this;
        }

        /* renamed from: a */
        public C19355a mo65949a(String str) {
            this.f47585b = str;
            return this;
        }

        /* renamed from: a */
        public C19355a mo65950a(ByteString byteString) {
            this.f47587d = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DriveDecryptRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", decrypt_type=");
        sb.append(this.decrypt_type);
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.nonce != null) {
            sb.append(", nonce=");
            sb.append(this.nonce);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        StringBuilder replace = sb.replace(0, 2, "DriveDecryptRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DriveDecryptRequest(DecryptType decryptType, String str, String str2, ByteString byteString) {
        this(decryptType, str, str2, byteString, ByteString.EMPTY);
    }

    public DriveDecryptRequest(DecryptType decryptType, String str, String str2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.decrypt_type = decryptType;
        this.key = str;
        this.nonce = str2;
        this.body = byteString;
    }
}
