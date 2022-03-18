package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Content;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetMessageActionPayloadRequest extends Message<GetMessageActionPayloadRequest, C17609a> {
    public static final ProtoAdapter<GetMessageActionPayloadRequest> ADAPTER = new C17610b();
    public static final Content.SystemMessageAction.ActType DEFAULT_ACTION_TYPE = Content.SystemMessageAction.ActType.UNKNOWN_ACT_TYPE;
    private static final long serialVersionUID = 0;
    public final Content.SystemMessageAction.ActType action_type;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageActionPayloadRequest$b */
    private static final class C17610b extends ProtoAdapter<GetMessageActionPayloadRequest> {
        C17610b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageActionPayloadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageActionPayloadRequest getMessageActionPayloadRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageActionPayloadRequest.message_id) + Content.SystemMessageAction.ActType.ADAPTER.encodedSizeWithTag(2, getMessageActionPayloadRequest.action_type) + getMessageActionPayloadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageActionPayloadRequest decode(ProtoReader protoReader) throws IOException {
            C17609a aVar = new C17609a();
            aVar.f44602a = "";
            aVar.f44603b = Content.SystemMessageAction.ActType.UNKNOWN_ACT_TYPE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44602a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f44603b = Content.SystemMessageAction.ActType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageActionPayloadRequest getMessageActionPayloadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageActionPayloadRequest.message_id);
            Content.SystemMessageAction.ActType.ADAPTER.encodeWithTag(protoWriter, 2, getMessageActionPayloadRequest.action_type);
            protoWriter.writeBytes(getMessageActionPayloadRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17609a newBuilder() {
        C17609a aVar = new C17609a();
        aVar.f44602a = this.message_id;
        aVar.f44603b = this.action_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageActionPayloadRequest$a */
    public static final class C17609a extends Message.Builder<GetMessageActionPayloadRequest, C17609a> {

        /* renamed from: a */
        public String f44602a;

        /* renamed from: b */
        public Content.SystemMessageAction.ActType f44603b;

        /* renamed from: a */
        public GetMessageActionPayloadRequest build() {
            Content.SystemMessageAction.ActType actType;
            String str = this.f44602a;
            if (str != null && (actType = this.f44603b) != null) {
                return new GetMessageActionPayloadRequest(str, actType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id", this.f44603b, "action_type");
        }

        /* renamed from: a */
        public C17609a mo61600a(Content.SystemMessageAction.ActType actType) {
            this.f44603b = actType;
            return this;
        }

        /* renamed from: a */
        public C17609a mo61601a(String str) {
            this.f44602a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageActionPayloadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", action_type=");
        sb.append(this.action_type);
        StringBuilder replace = sb.replace(0, 2, "GetMessageActionPayloadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageActionPayloadRequest(String str, Content.SystemMessageAction.ActType actType) {
        this(str, actType, ByteString.EMPTY);
    }

    public GetMessageActionPayloadRequest(String str, Content.SystemMessageAction.ActType actType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.action_type = actType;
    }
}
