package com.bytedance.lark.pb.onboarding.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetProductGuideRequest extends Message<GetProductGuideRequest, C18590a> {
    public static final ProtoAdapter<GetProductGuideRequest> ADAPTER = new C18591b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetProductGuideRequest$b */
    private static final class C18591b extends ProtoAdapter<GetProductGuideRequest> {
        C18591b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetProductGuideRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetProductGuideRequest getProductGuideRequest) {
            return getProductGuideRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetProductGuideRequest decode(ProtoReader protoReader) throws IOException {
            C18590a aVar = new C18590a();
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
        public void encode(ProtoWriter protoWriter, GetProductGuideRequest getProductGuideRequest) throws IOException {
            protoWriter.writeBytes(getProductGuideRequest.unknownFields());
        }
    }

    public GetProductGuideRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.onboarding.v1.GetProductGuideRequest$a */
    public static final class C18590a extends Message.Builder<GetProductGuideRequest, C18590a> {
        /* renamed from: a */
        public GetProductGuideRequest build() {
            return new GetProductGuideRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18590a newBuilder() {
        C18590a aVar = new C18590a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("onboarding", "GetProductGuideRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetProductGuideRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetProductGuideRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
