package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUnreadAtMessagesResponse extends Message<GetUnreadAtMessagesResponse, C17745a> {
    public static final ProtoAdapter<GetUnreadAtMessagesResponse> ADAPTER = new C17746b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final List<String> ordered_message_ids;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesResponse$b */
    private static final class C17746b extends ProtoAdapter<GetUnreadAtMessagesResponse> {
        C17746b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUnreadAtMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUnreadAtMessagesResponse getUnreadAtMessagesResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getUnreadAtMessagesResponse.entity) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getUnreadAtMessagesResponse.ordered_message_ids) + getUnreadAtMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUnreadAtMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C17745a aVar = new C17745a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44795a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44796b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUnreadAtMessagesResponse getUnreadAtMessagesResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getUnreadAtMessagesResponse.entity);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getUnreadAtMessagesResponse.ordered_message_ids);
            protoWriter.writeBytes(getUnreadAtMessagesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUnreadAtMessagesResponse$a */
    public static final class C17745a extends Message.Builder<GetUnreadAtMessagesResponse, C17745a> {

        /* renamed from: a */
        public C14928Entity f44795a;

        /* renamed from: b */
        public List<String> f44796b = Internal.newMutableList();

        /* renamed from: a */
        public GetUnreadAtMessagesResponse build() {
            C14928Entity entity = this.f44795a;
            if (entity != null) {
                return new GetUnreadAtMessagesResponse(entity, this.f44796b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17745a newBuilder() {
        C17745a aVar = new C17745a();
        aVar.f44795a = this.entity;
        aVar.f44796b = Internal.copyOf("ordered_message_ids", this.ordered_message_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUnreadAtMessagesResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        if (!this.ordered_message_ids.isEmpty()) {
            sb.append(", ordered_message_ids=");
            sb.append(this.ordered_message_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUnreadAtMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUnreadAtMessagesResponse(C14928Entity entity2, List<String> list) {
        this(entity2, list, ByteString.EMPTY);
    }

    public GetUnreadAtMessagesResponse(C14928Entity entity2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.ordered_message_ids = Internal.immutableCopyOf("ordered_message_ids", list);
    }
}
