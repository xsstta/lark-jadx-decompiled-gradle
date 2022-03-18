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
import java.util.List;
import okio.ByteString;

public final class GetMessageActionPayloadResponse extends Message<GetMessageActionPayloadResponse, C17611a> {
    public static final ProtoAdapter<GetMessageActionPayloadResponse> ADAPTER = new C17612b();
    public static final Content.SystemMessageAction.ActType DEFAULT_ACTION_TYPE = Content.SystemMessageAction.ActType.UNKNOWN_ACT_TYPE;
    private static final long serialVersionUID = 0;
    public final Content.SystemMessageAction.ActType action_type;
    public final List<String> at_chatter_ids;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageActionPayloadResponse$b */
    private static final class C17612b extends ProtoAdapter<GetMessageActionPayloadResponse> {
        C17612b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageActionPayloadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageActionPayloadResponse getMessageActionPayloadResponse) {
            int i;
            int encodedSizeWithTag = Content.SystemMessageAction.ActType.ADAPTER.encodedSizeWithTag(1, getMessageActionPayloadResponse.action_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getMessageActionPayloadResponse.at_chatter_ids);
            if (getMessageActionPayloadResponse.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, getMessageActionPayloadResponse.url);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getMessageActionPayloadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageActionPayloadResponse decode(ProtoReader protoReader) throws IOException {
            C17611a aVar = new C17611a();
            aVar.f44604a = Content.SystemMessageAction.ActType.UNKNOWN_ACT_TYPE;
            aVar.f44606c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f44604a = Content.SystemMessageAction.ActType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f44605b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44606c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageActionPayloadResponse getMessageActionPayloadResponse) throws IOException {
            Content.SystemMessageAction.ActType.ADAPTER.encodeWithTag(protoWriter, 1, getMessageActionPayloadResponse.action_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getMessageActionPayloadResponse.at_chatter_ids);
            if (getMessageActionPayloadResponse.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getMessageActionPayloadResponse.url);
            }
            protoWriter.writeBytes(getMessageActionPayloadResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17611a newBuilder() {
        C17611a aVar = new C17611a();
        aVar.f44604a = this.action_type;
        aVar.f44605b = Internal.copyOf("at_chatter_ids", this.at_chatter_ids);
        aVar.f44606c = this.url;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessageActionPayloadResponse$a */
    public static final class C17611a extends Message.Builder<GetMessageActionPayloadResponse, C17611a> {

        /* renamed from: a */
        public Content.SystemMessageAction.ActType f44604a;

        /* renamed from: b */
        public List<String> f44605b = Internal.newMutableList();

        /* renamed from: c */
        public String f44606c;

        /* renamed from: a */
        public GetMessageActionPayloadResponse build() {
            Content.SystemMessageAction.ActType actType = this.f44604a;
            if (actType != null) {
                return new GetMessageActionPayloadResponse(actType, this.f44605b, this.f44606c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(actType, "action_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessageActionPayloadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", action_type=");
        sb.append(this.action_type);
        if (!this.at_chatter_ids.isEmpty()) {
            sb.append(", at_chatter_ids=");
            sb.append(this.at_chatter_ids);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageActionPayloadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageActionPayloadResponse(Content.SystemMessageAction.ActType actType, List<String> list, String str) {
        this(actType, list, str, ByteString.EMPTY);
    }

    public GetMessageActionPayloadResponse(Content.SystemMessageAction.ActType actType, List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_type = actType;
        this.at_chatter_ids = Internal.immutableCopyOf("at_chatter_ids", list);
        this.url = str;
    }
}
