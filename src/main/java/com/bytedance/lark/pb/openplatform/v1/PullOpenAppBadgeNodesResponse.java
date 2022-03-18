package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PullOpenAppBadgeNodesResponse extends Message<PullOpenAppBadgeNodesResponse, C18685a> {
    public static final ProtoAdapter<PullOpenAppBadgeNodesResponse> ADAPTER = new C18686b();
    private static final long serialVersionUID = 0;
    public final List<OpenAppBadgeNode> notice_nodes;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse$b */
    private static final class C18686b extends ProtoAdapter<PullOpenAppBadgeNodesResponse> {
        C18686b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullOpenAppBadgeNodesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) {
            return OpenAppBadgeNode.ADAPTER.asRepeated().encodedSizeWithTag(1, pullOpenAppBadgeNodesResponse.notice_nodes) + pullOpenAppBadgeNodesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullOpenAppBadgeNodesResponse decode(ProtoReader protoReader) throws IOException {
            C18685a aVar = new C18685a();
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
                    aVar.f46225a.add(OpenAppBadgeNode.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullOpenAppBadgeNodesResponse pullOpenAppBadgeNodesResponse) throws IOException {
            OpenAppBadgeNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullOpenAppBadgeNodesResponse.notice_nodes);
            protoWriter.writeBytes(pullOpenAppBadgeNodesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PullOpenAppBadgeNodesResponse$a */
    public static final class C18685a extends Message.Builder<PullOpenAppBadgeNodesResponse, C18685a> {

        /* renamed from: a */
        public List<OpenAppBadgeNode> f46225a = Internal.newMutableList();

        /* renamed from: a */
        public PullOpenAppBadgeNodesResponse build() {
            return new PullOpenAppBadgeNodesResponse(this.f46225a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18685a newBuilder() {
        C18685a aVar = new C18685a();
        aVar.f46225a = Internal.copyOf("notice_nodes", this.notice_nodes);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PullOpenAppBadgeNodesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.notice_nodes.isEmpty()) {
            sb.append(", notice_nodes=");
            sb.append(this.notice_nodes);
        }
        StringBuilder replace = sb.replace(0, 2, "PullOpenAppBadgeNodesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullOpenAppBadgeNodesResponse(List<OpenAppBadgeNode> list) {
        this(list, ByteString.EMPTY);
    }

    public PullOpenAppBadgeNodesResponse(List<OpenAppBadgeNode> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notice_nodes = Internal.immutableCopyOf("notice_nodes", list);
    }
}
