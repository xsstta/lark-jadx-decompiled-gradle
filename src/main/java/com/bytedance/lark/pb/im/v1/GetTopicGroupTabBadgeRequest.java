package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetTopicGroupTabBadgeRequest extends Message<GetTopicGroupTabBadgeRequest, C17713a> {
    public static final ProtoAdapter<GetTopicGroupTabBadgeRequest> ADAPTER = new C17714b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupTabBadgeRequest$b */
    private static final class C17714b extends ProtoAdapter<GetTopicGroupTabBadgeRequest> {
        C17714b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTopicGroupTabBadgeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTopicGroupTabBadgeRequest getTopicGroupTabBadgeRequest) {
            return getTopicGroupTabBadgeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetTopicGroupTabBadgeRequest decode(ProtoReader protoReader) throws IOException {
            C17713a aVar = new C17713a();
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
        public void encode(ProtoWriter protoWriter, GetTopicGroupTabBadgeRequest getTopicGroupTabBadgeRequest) throws IOException {
            protoWriter.writeBytes(getTopicGroupTabBadgeRequest.unknownFields());
        }
    }

    public GetTopicGroupTabBadgeRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupTabBadgeRequest$a */
    public static final class C17713a extends Message.Builder<GetTopicGroupTabBadgeRequest, C17713a> {
        /* renamed from: a */
        public GetTopicGroupTabBadgeRequest build() {
            return new GetTopicGroupTabBadgeRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17713a newBuilder() {
        C17713a aVar = new C17713a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTopicGroupTabBadgeRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "GetTopicGroupTabBadgeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetTopicGroupTabBadgeRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
