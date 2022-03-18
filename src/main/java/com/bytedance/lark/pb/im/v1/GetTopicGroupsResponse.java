package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ChatOptionInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetTopicGroupsResponse extends Message<GetTopicGroupsResponse, C17719a> {
    public static final ProtoAdapter<GetTopicGroupsResponse> ADAPTER = new C17720b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final Map<String, ChatOptionInfo> group_option_info;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsResponse$a */
    public static final class C17719a extends Message.Builder<GetTopicGroupsResponse, C17719a> {

        /* renamed from: a */
        public C14928Entity f44750a;

        /* renamed from: b */
        public Map<String, ChatOptionInfo> f44751b = Internal.newMutableMap();

        /* renamed from: a */
        public GetTopicGroupsResponse build() {
            C14928Entity entity = this.f44750a;
            if (entity != null) {
                return new GetTopicGroupsResponse(entity, this.f44751b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetTopicGroupsResponse$b */
    private static final class C17720b extends ProtoAdapter<GetTopicGroupsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, ChatOptionInfo>> f44752a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ChatOptionInfo.ADAPTER);

        C17720b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetTopicGroupsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetTopicGroupsResponse getTopicGroupsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getTopicGroupsResponse.entity) + this.f44752a.encodedSizeWithTag(2, getTopicGroupsResponse.group_option_info) + getTopicGroupsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetTopicGroupsResponse decode(ProtoReader protoReader) throws IOException {
            C17719a aVar = new C17719a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44750a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44751b.putAll(this.f44752a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetTopicGroupsResponse getTopicGroupsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getTopicGroupsResponse.entity);
            this.f44752a.encodeWithTag(protoWriter, 2, getTopicGroupsResponse.group_option_info);
            protoWriter.writeBytes(getTopicGroupsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17719a newBuilder() {
        C17719a aVar = new C17719a();
        aVar.f44750a = this.entity;
        aVar.f44751b = Internal.copyOf("group_option_info", this.group_option_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetTopicGroupsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.group_option_info.isEmpty()) {
            sb.append(", group_option_info=");
            sb.append(this.group_option_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetTopicGroupsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetTopicGroupsResponse(C14928Entity entity2, Map<String, ChatOptionInfo> map) {
        this(entity2, map, ByteString.EMPTY);
    }

    public GetTopicGroupsResponse(C14928Entity entity2, Map<String, ChatOptionInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.group_option_info = Internal.immutableCopyOf("group_option_info", map);
    }
}
