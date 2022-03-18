package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTrustedMailInfoRequest extends Message<GetTrustedMailInfoRequest, C18594a> {
    public static final ProtoAdapter<GetTrustedMailInfoRequest> ADAPTER = new C18595b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetTrustedMailInfoRequest$b */
    private static final class C18595b extends ProtoAdapter<GetTrustedMailInfoRequest> {
        C18595b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTrustedMailInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTrustedMailInfoRequest getTrustedMailInfoRequest) {
            return getTrustedMailInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTrustedMailInfoRequest decode(ProtoReader protoReader) throws IOException {
            C18594a aVar = new C18594a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTrustedMailInfoRequest getTrustedMailInfoRequest) throws IOException {
            protoWriter.writeBytes(getTrustedMailInfoRequest.unknownFields());
        }
    }

    public GetTrustedMailInfoRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetTrustedMailInfoRequest$a */
    public static final class C18594a extends Message.Builder<GetTrustedMailInfoRequest, C18594a> {
        /* renamed from: a */
        public GetTrustedMailInfoRequest build() {
            return new GetTrustedMailInfoRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18594a newBuilder() {
        C18594a aVar = new C18594a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetTrustedMailInfoRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetTrustedMailInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTrustedMailInfoRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
