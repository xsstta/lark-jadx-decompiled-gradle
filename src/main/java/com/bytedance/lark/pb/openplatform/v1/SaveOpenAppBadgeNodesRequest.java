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

public final class SaveOpenAppBadgeNodesRequest extends Message<SaveOpenAppBadgeNodesRequest, C18703a> {
    public static final ProtoAdapter<SaveOpenAppBadgeNodesRequest> ADAPTER = new C18704b();
    public static final Boolean DEFAULT_NEED_TRIGGER_PUSH = false;
    private static final long serialVersionUID = 0;
    public final List<OpenAppBadgeNode> badge_nodes;
    public final Boolean need_trigger_push;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SaveOpenAppBadgeNodesRequest$b */
    private static final class C18704b extends ProtoAdapter<SaveOpenAppBadgeNodesRequest> {
        C18704b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveOpenAppBadgeNodesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveOpenAppBadgeNodesRequest saveOpenAppBadgeNodesRequest) {
            int i;
            int encodedSizeWithTag = OpenAppBadgeNode.ADAPTER.asRepeated().encodedSizeWithTag(1, saveOpenAppBadgeNodesRequest.badge_nodes);
            if (saveOpenAppBadgeNodesRequest.need_trigger_push != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, saveOpenAppBadgeNodesRequest.need_trigger_push);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + saveOpenAppBadgeNodesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SaveOpenAppBadgeNodesRequest decode(ProtoReader protoReader) throws IOException {
            C18703a aVar = new C18703a();
            aVar.f46245b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46244a.add(OpenAppBadgeNode.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46245b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveOpenAppBadgeNodesRequest saveOpenAppBadgeNodesRequest) throws IOException {
            OpenAppBadgeNode.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, saveOpenAppBadgeNodesRequest.badge_nodes);
            if (saveOpenAppBadgeNodesRequest.need_trigger_push != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, saveOpenAppBadgeNodesRequest.need_trigger_push);
            }
            protoWriter.writeBytes(saveOpenAppBadgeNodesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.SaveOpenAppBadgeNodesRequest$a */
    public static final class C18703a extends Message.Builder<SaveOpenAppBadgeNodesRequest, C18703a> {

        /* renamed from: a */
        public List<OpenAppBadgeNode> f46244a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f46245b;

        /* renamed from: a */
        public SaveOpenAppBadgeNodesRequest build() {
            return new SaveOpenAppBadgeNodesRequest(this.f46244a, this.f46245b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18703a newBuilder() {
        C18703a aVar = new C18703a();
        aVar.f46244a = Internal.copyOf("badge_nodes", this.badge_nodes);
        aVar.f46245b = this.need_trigger_push;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "SaveOpenAppBadgeNodesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.badge_nodes.isEmpty()) {
            sb.append(", badge_nodes=");
            sb.append(this.badge_nodes);
        }
        if (this.need_trigger_push != null) {
            sb.append(", need_trigger_push=");
            sb.append(this.need_trigger_push);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveOpenAppBadgeNodesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SaveOpenAppBadgeNodesRequest(List<OpenAppBadgeNode> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public SaveOpenAppBadgeNodesRequest(List<OpenAppBadgeNode> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.badge_nodes = Internal.immutableCopyOf("badge_nodes", list);
        this.need_trigger_push = bool;
    }
}
