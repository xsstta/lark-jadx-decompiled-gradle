package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetRecommendedContentsRequest extends Message<GetRecommendedContentsRequest, C19525a> {
    public static final ProtoAdapter<GetRecommendedContentsRequest> ADAPTER = new C19526b();
    public static final Integer DEFAULT_COUNT = 0;
    private static final long serialVersionUID = 0;
    public final Integer count;

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetRecommendedContentsRequest$b */
    private static final class C19526b extends ProtoAdapter<GetRecommendedContentsRequest> {
        C19526b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRecommendedContentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRecommendedContentsRequest getRecommendedContentsRequest) {
            int i;
            if (getRecommendedContentsRequest.count != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getRecommendedContentsRequest.count);
            } else {
                i = 0;
            }
            return i + getRecommendedContentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRecommendedContentsRequest decode(ProtoReader protoReader) throws IOException {
            C19525a aVar = new C19525a();
            aVar.f47880a = 0;
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
                    aVar.f47880a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRecommendedContentsRequest getRecommendedContentsRequest) throws IOException {
            if (getRecommendedContentsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getRecommendedContentsRequest.count);
            }
            protoWriter.writeBytes(getRecommendedContentsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.GetRecommendedContentsRequest$a */
    public static final class C19525a extends Message.Builder<GetRecommendedContentsRequest, C19525a> {

        /* renamed from: a */
        public Integer f47880a;

        /* renamed from: a */
        public GetRecommendedContentsRequest build() {
            return new GetRecommendedContentsRequest(this.f47880a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19525a mo66359a(Integer num) {
            this.f47880a = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19525a newBuilder() {
        C19525a aVar = new C19525a();
        aVar.f47880a = this.count;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "GetRecommendedContentsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetRecommendedContentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRecommendedContentsRequest(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public GetRecommendedContentsRequest(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.count = num;
    }
}
