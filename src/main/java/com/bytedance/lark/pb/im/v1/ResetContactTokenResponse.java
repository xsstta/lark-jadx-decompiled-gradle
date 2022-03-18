package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ResetContactTokenResponse extends Message<ResetContactTokenResponse, C18009a> {
    public static final ProtoAdapter<ResetContactTokenResponse> ADAPTER = new C18010b();
    private static final long serialVersionUID = 0;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.im.v1.ResetContactTokenResponse$b */
    private static final class C18010b extends ProtoAdapter<ResetContactTokenResponse> {
        C18010b() {
            super(FieldEncoding.LENGTH_DELIMITED, ResetContactTokenResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ResetContactTokenResponse resetContactTokenResponse) {
            int i;
            if (resetContactTokenResponse.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, resetContactTokenResponse.token);
            } else {
                i = 0;
            }
            return i + resetContactTokenResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ResetContactTokenResponse decode(ProtoReader protoReader) throws IOException {
            C18009a aVar = new C18009a();
            aVar.f45107a = "";
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
                    aVar.f45107a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ResetContactTokenResponse resetContactTokenResponse) throws IOException {
            if (resetContactTokenResponse.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resetContactTokenResponse.token);
            }
            protoWriter.writeBytes(resetContactTokenResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ResetContactTokenResponse$a */
    public static final class C18009a extends Message.Builder<ResetContactTokenResponse, C18009a> {

        /* renamed from: a */
        public String f45107a;

        /* renamed from: a */
        public ResetContactTokenResponse build() {
            return new ResetContactTokenResponse(this.f45107a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18009a newBuilder() {
        C18009a aVar = new C18009a();
        aVar.f45107a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ResetContactTokenResponse");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "ResetContactTokenResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ResetContactTokenResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public ResetContactTokenResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
