package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DecryptSealRequest extends Message<DecryptSealRequest, C19691a> {
    public static final ProtoAdapter<DecryptSealRequest> ADAPTER = new C19692b();
    public static final ByteString DEFAULT_CIPHERTEXT = ByteString.EMPTY;
    public static final ByteString DEFAULT_EPHEMERAL_PUBLICKEY = ByteString.EMPTY;
    public static final ByteString DEFAULT_NONCE = ByteString.EMPTY;
    public static final ByteString DEFAULT_PKID = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString ciphertext;
    public final ByteString ephemeral_publickey;
    public final ByteString nonce;
    public final ByteString pkid;

    /* renamed from: com.bytedance.lark.pb.tool.v1.DecryptSealRequest$b */
    private static final class C19692b extends ProtoAdapter<DecryptSealRequest> {
        C19692b() {
            super(FieldEncoding.LENGTH_DELIMITED, DecryptSealRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DecryptSealRequest decryptSealRequest) {
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, decryptSealRequest.pkid) + ProtoAdapter.BYTES.encodedSizeWithTag(2, decryptSealRequest.ephemeral_publickey) + ProtoAdapter.BYTES.encodedSizeWithTag(3, decryptSealRequest.nonce) + ProtoAdapter.BYTES.encodedSizeWithTag(4, decryptSealRequest.ciphertext) + decryptSealRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DecryptSealRequest decode(ProtoReader protoReader) throws IOException {
            C19691a aVar = new C19691a();
            aVar.f48139a = ByteString.EMPTY;
            aVar.f48140b = ByteString.EMPTY;
            aVar.f48141c = ByteString.EMPTY;
            aVar.f48142d = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48139a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48140b = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48141c = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48142d = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DecryptSealRequest decryptSealRequest) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, decryptSealRequest.pkid);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, decryptSealRequest.ephemeral_publickey);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, decryptSealRequest.nonce);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, decryptSealRequest.ciphertext);
            protoWriter.writeBytes(decryptSealRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19691a newBuilder() {
        C19691a aVar = new C19691a();
        aVar.f48139a = this.pkid;
        aVar.f48140b = this.ephemeral_publickey;
        aVar.f48141c = this.nonce;
        aVar.f48142d = this.ciphertext;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.DecryptSealRequest$a */
    public static final class C19691a extends Message.Builder<DecryptSealRequest, C19691a> {

        /* renamed from: a */
        public ByteString f48139a;

        /* renamed from: b */
        public ByteString f48140b;

        /* renamed from: c */
        public ByteString f48141c;

        /* renamed from: d */
        public ByteString f48142d;

        /* renamed from: a */
        public DecryptSealRequest build() {
            ByteString byteString;
            ByteString byteString2;
            ByteString byteString3;
            ByteString byteString4 = this.f48139a;
            if (byteString4 != null && (byteString = this.f48140b) != null && (byteString2 = this.f48141c) != null && (byteString3 = this.f48142d) != null) {
                return new DecryptSealRequest(byteString4, byteString, byteString2, byteString3, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString4, "pkid", this.f48140b, "ephemeral_publickey", this.f48141c, "nonce", this.f48142d, "ciphertext");
        }

        /* renamed from: a */
        public C19691a mo66764a(ByteString byteString) {
            this.f48139a = byteString;
            return this;
        }

        /* renamed from: b */
        public C19691a mo66766b(ByteString byteString) {
            this.f48140b = byteString;
            return this;
        }

        /* renamed from: c */
        public C19691a mo66767c(ByteString byteString) {
            this.f48141c = byteString;
            return this;
        }

        /* renamed from: d */
        public C19691a mo66768d(ByteString byteString) {
            this.f48142d = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "DecryptSealRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", pkid=");
        sb.append(this.pkid);
        sb.append(", ephemeral_publickey=");
        sb.append(this.ephemeral_publickey);
        sb.append(", nonce=");
        sb.append(this.nonce);
        sb.append(", ciphertext=");
        sb.append(this.ciphertext);
        StringBuilder replace = sb.replace(0, 2, "DecryptSealRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DecryptSealRequest(ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4) {
        this(byteString, byteString2, byteString3, byteString4, ByteString.EMPTY);
    }

    public DecryptSealRequest(ByteString byteString, ByteString byteString2, ByteString byteString3, ByteString byteString4, ByteString byteString5) {
        super(ADAPTER, byteString5);
        this.pkid = byteString;
        this.ephemeral_publickey = byteString2;
        this.nonce = byteString3;
        this.ciphertext = byteString4;
    }
}
