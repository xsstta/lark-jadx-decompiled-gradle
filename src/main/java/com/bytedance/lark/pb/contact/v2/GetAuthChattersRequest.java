package com.bytedance.lark.pb.contact.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ActionType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetAuthChattersRequest extends Message<GetAuthChattersRequest, C16436a> {
    public static final ProtoAdapter<GetAuthChattersRequest> ADAPTER = new C16437b();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.UNKNOWN_ACTION;
    private static final long serialVersionUID = 0;
    public final ActionType action_type;
    public final Map<String, String> chatters_auth_info;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAuthChattersRequest$a */
    public static final class C16436a extends Message.Builder<GetAuthChattersRequest, C16436a> {

        /* renamed from: a */
        public ActionType f42736a;

        /* renamed from: b */
        public Map<String, String> f42737b = Internal.newMutableMap();

        /* renamed from: a */
        public GetAuthChattersRequest build() {
            ActionType actionType = this.f42736a;
            if (actionType != null) {
                return new GetAuthChattersRequest(actionType, this.f42737b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(actionType, "action_type");
        }

        /* renamed from: a */
        public C16436a mo58647a(ActionType actionType) {
            this.f42736a = actionType;
            return this;
        }

        /* renamed from: a */
        public C16436a mo58648a(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.f42737b = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetAuthChattersRequest$b */
    private static final class C16437b extends ProtoAdapter<GetAuthChattersRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f42738a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C16437b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAuthChattersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAuthChattersRequest getAuthChattersRequest) {
            return ActionType.ADAPTER.encodedSizeWithTag(1, getAuthChattersRequest.action_type) + this.f42738a.encodedSizeWithTag(2, getAuthChattersRequest.chatters_auth_info) + getAuthChattersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAuthChattersRequest decode(ProtoReader protoReader) throws IOException {
            C16436a aVar = new C16436a();
            aVar.f42736a = ActionType.UNKNOWN_ACTION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42736a = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42737b.putAll(this.f42738a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAuthChattersRequest getAuthChattersRequest) throws IOException {
            ActionType.ADAPTER.encodeWithTag(protoWriter, 1, getAuthChattersRequest.action_type);
            this.f42738a.encodeWithTag(protoWriter, 2, getAuthChattersRequest.chatters_auth_info);
            protoWriter.writeBytes(getAuthChattersRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16436a newBuilder() {
        C16436a aVar = new C16436a();
        aVar.f42736a = this.action_type;
        aVar.f42737b = Internal.copyOf("chatters_auth_info", this.chatters_auth_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetAuthChattersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", action_type=");
        sb.append(this.action_type);
        if (!this.chatters_auth_info.isEmpty()) {
            sb.append(", chatters_auth_info=");
            sb.append(this.chatters_auth_info);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAuthChattersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAuthChattersRequest(ActionType actionType, Map<String, String> map) {
        this(actionType, map, ByteString.EMPTY);
    }

    public GetAuthChattersRequest(ActionType actionType, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_type = actionType;
        this.chatters_auth_info = Internal.immutableCopyOf("chatters_auth_info", map);
    }
}
