package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetVerificationInfoRequest extends Message<GetVerificationInfoRequest, C50717a> {
    public static final ProtoAdapter<GetVerificationInfoRequest> ADAPTER = new C50718b();
    private static final long serialVersionUID = 0;
    public final String Token;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationInfoRequest$b */
    private static final class C50718b extends ProtoAdapter<GetVerificationInfoRequest> {
        C50718b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVerificationInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVerificationInfoRequest getVerificationInfoRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getVerificationInfoRequest.Token) + getVerificationInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVerificationInfoRequest decode(ProtoReader protoReader) throws IOException {
            C50717a aVar = new C50717a();
            aVar.f126464a = "";
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
                    aVar.f126464a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVerificationInfoRequest getVerificationInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getVerificationInfoRequest.Token);
            protoWriter.writeBytes(getVerificationInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVerificationInfoRequest$a */
    public static final class C50717a extends Message.Builder<GetVerificationInfoRequest, C50717a> {

        /* renamed from: a */
        public String f126464a;

        /* renamed from: a */
        public GetVerificationInfoRequest build() {
            String str = this.f126464a;
            if (str != null) {
                return new GetVerificationInfoRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "Token");
        }

        /* renamed from: a */
        public C50717a mo175419a(String str) {
            this.f126464a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50717a newBuilder() {
        C50717a aVar = new C50717a();
        aVar.f126464a = this.Token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVerificationInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", Token=");
        sb.append(this.Token);
        StringBuilder replace = sb.replace(0, 2, "GetVerificationInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVerificationInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetVerificationInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.Token = str;
    }
}
