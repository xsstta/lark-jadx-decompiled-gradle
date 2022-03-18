package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullAllOncallTagsRequest extends Message<PullAllOncallTagsRequest, C17268a> {
    public static final ProtoAdapter<PullAllOncallTagsRequest> ADAPTER = new C17269b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullAllOncallTagsRequest$b */
    private static final class C17269b extends ProtoAdapter<PullAllOncallTagsRequest> {
        C17269b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllOncallTagsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllOncallTagsRequest pullAllOncallTagsRequest) {
            return pullAllOncallTagsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllOncallTagsRequest decode(ProtoReader protoReader) throws IOException {
            C17268a aVar = new C17268a();
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
        public void encode(ProtoWriter protoWriter, PullAllOncallTagsRequest pullAllOncallTagsRequest) throws IOException {
            protoWriter.writeBytes(pullAllOncallTagsRequest.unknownFields());
        }
    }

    public PullAllOncallTagsRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.PullAllOncallTagsRequest$a */
    public static final class C17268a extends Message.Builder<PullAllOncallTagsRequest, C17268a> {
        /* renamed from: a */
        public PullAllOncallTagsRequest build() {
            return new PullAllOncallTagsRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17268a newBuilder() {
        C17268a aVar = new C17268a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "PullAllOncallTagsRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "PullAllOncallTagsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllOncallTagsRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
