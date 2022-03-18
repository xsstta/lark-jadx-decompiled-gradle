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

public final class DecryptSealResponse extends Message<DecryptSealResponse, C19693a> {
    public static final ProtoAdapter<DecryptSealResponse> ADAPTER = new C19694b();
    public static final ByteString DEFAULT_PLAINTEXT = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString plaintext;

    /* renamed from: com.bytedance.lark.pb.tool.v1.DecryptSealResponse$b */
    private static final class C19694b extends ProtoAdapter<DecryptSealResponse> {
        C19694b() {
            super(FieldEncoding.LENGTH_DELIMITED, DecryptSealResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DecryptSealResponse decryptSealResponse) {
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, decryptSealResponse.plaintext) + decryptSealResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DecryptSealResponse decode(ProtoReader protoReader) throws IOException {
            C19693a aVar = new C19693a();
            aVar.f48143a = ByteString.EMPTY;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48143a = ProtoAdapter.BYTES.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DecryptSealResponse decryptSealResponse) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, decryptSealResponse.plaintext);
            protoWriter.writeBytes(decryptSealResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.DecryptSealResponse$a */
    public static final class C19693a extends Message.Builder<DecryptSealResponse, C19693a> {

        /* renamed from: a */
        public ByteString f48143a;

        /* renamed from: a */
        public DecryptSealResponse build() {
            ByteString byteString = this.f48143a;
            if (byteString != null) {
                return new DecryptSealResponse(byteString, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString, "plaintext");
        }
    }

    @Override // com.squareup.wire.Message
    public C19693a newBuilder() {
        C19693a aVar = new C19693a();
        aVar.f48143a = this.plaintext;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "DecryptSealResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", plaintext=");
        sb.append(this.plaintext);
        StringBuilder replace = sb.replace(0, 2, "DecryptSealResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DecryptSealResponse(ByteString byteString) {
        this(byteString, ByteString.EMPTY);
    }

    public DecryptSealResponse(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.plaintext = byteString;
    }
}
