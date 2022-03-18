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

public final class PushOpenAppBadgeNodesRequest extends Message<PushOpenAppBadgeNodesRequest, C18693a> {
    public static final ProtoAdapter<PushOpenAppBadgeNodesRequest> ADAPTER = new C18694b();
    private static final long serialVersionUID = 0;
    public final List<OpenAppBadgeNode> notice_nodes;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushOpenAppBadgeNodesRequest$b */
    private static final class C18694b extends ProtoAdapter<PushOpenAppBadgeNodesRequest> {
        C18694b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushOpenAppBadgeNodesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushOpenAppBadgeNodesRequest pushOpenAppBadgeNodesRequest) {
            return OpenAppBadgeNode.ADAPTER.asRepeated().encodedSizeWithTag(1, pushOpenAppBadgeNodesRequest.notice_nodes) + pushOpenAppBadgeNodesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushOpenAppBadgeNodesRequest decode(ProtoReader protoReader) throws IOException {
            C18693a aVar = new C18693a();
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
                    aVar.f46235a.add(OpenAppBadgeNode.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushOpenAppBadgeNodesRequest pushOpenAppBadgeNodesRequest) throws IOException {
            OpenAppBadgeNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushOpenAppBadgeNodesRequest.notice_nodes);
            protoWriter.writeBytes(pushOpenAppBadgeNodesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushOpenAppBadgeNodesRequest$a */
    public static final class C18693a extends Message.Builder<PushOpenAppBadgeNodesRequest, C18693a> {

        /* renamed from: a */
        public List<OpenAppBadgeNode> f46235a = Internal.newMutableList();

        /* renamed from: a */
        public PushOpenAppBadgeNodesRequest build() {
            return new PushOpenAppBadgeNodesRequest(this.f46235a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18693a newBuilder() {
        C18693a aVar = new C18693a();
        aVar.f46235a = Internal.copyOf("notice_nodes", this.notice_nodes);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PushOpenAppBadgeNodesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.notice_nodes.isEmpty()) {
            sb.append(", notice_nodes=");
            sb.append(this.notice_nodes);
        }
        StringBuilder replace = sb.replace(0, 2, "PushOpenAppBadgeNodesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushOpenAppBadgeNodesRequest(List<OpenAppBadgeNode> list) {
        this(list, ByteString.EMPTY);
    }

    public PushOpenAppBadgeNodesRequest(List<OpenAppBadgeNode> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.notice_nodes = Internal.immutableCopyOf("notice_nodes", list);
    }
}
