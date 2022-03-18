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
import java.util.List;
import okio.ByteString;

public final class GetExternalContactsAuthRequest extends Message<GetExternalContactsAuthRequest, C16462a> {
    public static final ProtoAdapter<GetExternalContactsAuthRequest> ADAPTER = new C16463b();
    public static final ActionType DEFAULT_ACTION_TYPE = ActionType.UNKNOWN_ACTION;
    private static final long serialVersionUID = 0;
    public final ActionType action_type;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactsAuthRequest$b */
    private static final class C16463b extends ProtoAdapter<GetExternalContactsAuthRequest> {
        C16463b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetExternalContactsAuthRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetExternalContactsAuthRequest getExternalContactsAuthRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getExternalContactsAuthRequest.chatter_ids);
            if (getExternalContactsAuthRequest.action_type != null) {
                i = ActionType.ADAPTER.encodedSizeWithTag(2, getExternalContactsAuthRequest.action_type);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getExternalContactsAuthRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetExternalContactsAuthRequest decode(ProtoReader protoReader) throws IOException {
            C16462a aVar = new C16462a();
            aVar.f42766b = ActionType.UNKNOWN_ACTION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42765a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42766b = ActionType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetExternalContactsAuthRequest getExternalContactsAuthRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getExternalContactsAuthRequest.chatter_ids);
            if (getExternalContactsAuthRequest.action_type != null) {
                ActionType.ADAPTER.encodeWithTag(protoWriter, 2, getExternalContactsAuthRequest.action_type);
            }
            protoWriter.writeBytes(getExternalContactsAuthRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.GetExternalContactsAuthRequest$a */
    public static final class C16462a extends Message.Builder<GetExternalContactsAuthRequest, C16462a> {

        /* renamed from: a */
        public List<String> f42765a = Internal.newMutableList();

        /* renamed from: b */
        public ActionType f42766b;

        /* renamed from: a */
        public GetExternalContactsAuthRequest build() {
            return new GetExternalContactsAuthRequest(this.f42765a, this.f42766b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16462a mo58710a(ActionType actionType) {
            this.f42766b = actionType;
            return this;
        }

        /* renamed from: a */
        public C16462a mo58711a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f42765a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16462a newBuilder() {
        C16462a aVar = new C16462a();
        aVar.f42765a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.f42766b = this.action_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "GetExternalContactsAuthRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        if (this.action_type != null) {
            sb.append(", action_type=");
            sb.append(this.action_type);
        }
        StringBuilder replace = sb.replace(0, 2, "GetExternalContactsAuthRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetExternalContactsAuthRequest(List<String> list, ActionType actionType) {
        this(list, actionType, ByteString.EMPTY);
    }

    public GetExternalContactsAuthRequest(List<String> list, ActionType actionType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
        this.action_type = actionType;
    }
}
