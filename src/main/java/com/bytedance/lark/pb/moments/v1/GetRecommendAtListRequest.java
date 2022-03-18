package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRecommendAtListRequest extends Message<GetRecommendAtListRequest, C18388a> {
    public static final ProtoAdapter<GetRecommendAtListRequest> ADAPTER = new C18389b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetRecommendAtListRequest$b */
    private static final class C18389b extends ProtoAdapter<GetRecommendAtListRequest> {
        C18389b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecommendAtListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecommendAtListRequest getRecommendAtListRequest) {
            return getRecommendAtListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecommendAtListRequest decode(ProtoReader protoReader) throws IOException {
            C18388a aVar = new C18388a();
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
        public void encode(ProtoWriter protoWriter, GetRecommendAtListRequest getRecommendAtListRequest) throws IOException {
            protoWriter.writeBytes(getRecommendAtListRequest.unknownFields());
        }
    }

    public GetRecommendAtListRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.GetRecommendAtListRequest$a */
    public static final class C18388a extends Message.Builder<GetRecommendAtListRequest, C18388a> {
        /* renamed from: a */
        public GetRecommendAtListRequest build() {
            return new GetRecommendAtListRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18388a newBuilder() {
        C18388a aVar = new C18388a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "GetRecommendAtListRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetRecommendAtListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecommendAtListRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
