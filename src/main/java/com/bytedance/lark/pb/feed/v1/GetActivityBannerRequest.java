package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetActivityBannerRequest extends Message<GetActivityBannerRequest, C17140a> {
    public static final ProtoAdapter<GetActivityBannerRequest> ADAPTER = new C17141b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetActivityBannerRequest$b */
    private static final class C17141b extends ProtoAdapter<GetActivityBannerRequest> {
        C17141b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetActivityBannerRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetActivityBannerRequest getActivityBannerRequest) {
            return getActivityBannerRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetActivityBannerRequest decode(ProtoReader protoReader) throws IOException {
            C17140a aVar = new C17140a();
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
        public void encode(ProtoWriter protoWriter, GetActivityBannerRequest getActivityBannerRequest) throws IOException {
            protoWriter.writeBytes(getActivityBannerRequest.unknownFields());
        }
    }

    public GetActivityBannerRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetActivityBannerRequest$a */
    public static final class C17140a extends Message.Builder<GetActivityBannerRequest, C17140a> {
        /* renamed from: a */
        public GetActivityBannerRequest build() {
            return new GetActivityBannerRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17140a newBuilder() {
        C17140a aVar = new C17140a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetActivityBannerRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetActivityBannerRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetActivityBannerRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
