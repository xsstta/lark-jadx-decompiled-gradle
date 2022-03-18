package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetMessageIdsByPositionResponse extends Message<GetMessageIdsByPositionResponse, C17615a> {
    public static final ProtoAdapter<GetMessageIdsByPositionResponse> ADAPTER = new C17616b();
    private static final long serialVersionUID = 0;
    public final Map<String, Message.Type> message_id_types;
    public final Map<Integer, String> message_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionResponse$a */
    public static final class C17615a extends Message.Builder<GetMessageIdsByPositionResponse, C17615a> {

        /* renamed from: a */
        public Map<Integer, String> f44611a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, Message.Type> f44612b = Internal.newMutableMap();

        /* renamed from: a */
        public GetMessageIdsByPositionResponse build() {
            return new GetMessageIdsByPositionResponse(this.f44611a, this.f44612b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageIdsByPositionResponse$b */
    private static final class C17616b extends ProtoAdapter<GetMessageIdsByPositionResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Integer, String>> f44613a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Message.Type>> f44614b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Message.Type.ADAPTER);

        C17616b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageIdsByPositionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageIdsByPositionResponse getMessageIdsByPositionResponse) {
            return this.f44613a.encodedSizeWithTag(1, getMessageIdsByPositionResponse.message_ids) + this.f44614b.encodedSizeWithTag(2, getMessageIdsByPositionResponse.message_id_types) + getMessageIdsByPositionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageIdsByPositionResponse decode(ProtoReader protoReader) throws IOException {
            C17615a aVar = new C17615a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44611a.putAll(this.f44613a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44612b.putAll(this.f44614b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageIdsByPositionResponse getMessageIdsByPositionResponse) throws IOException {
            this.f44613a.encodeWithTag(protoWriter, 1, getMessageIdsByPositionResponse.message_ids);
            this.f44614b.encodeWithTag(protoWriter, 2, getMessageIdsByPositionResponse.message_id_types);
            protoWriter.writeBytes(getMessageIdsByPositionResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17615a newBuilder() {
        C17615a aVar = new C17615a();
        aVar.f44611a = Internal.copyOf("message_ids", this.message_ids);
        aVar.f44612b = Internal.copyOf("message_id_types", this.message_id_types);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageIdsByPositionResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (!this.message_id_types.isEmpty()) {
            sb.append(", message_id_types=");
            sb.append(this.message_id_types);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageIdsByPositionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageIdsByPositionResponse(Map<Integer, String> map, Map<String, Message.Type> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public GetMessageIdsByPositionResponse(Map<Integer, String> map, Map<String, Message.Type> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", map);
        this.message_id_types = Internal.immutableCopyOf("message_id_types", map2);
    }
}
