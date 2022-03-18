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
import okio.ByteString;

public final class CreateHomeSchoolChatResponse extends Message<CreateHomeSchoolChatResponse, C17362a> {
    public static final ProtoAdapter<CreateHomeSchoolChatResponse> ADAPTER = new C17363b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateHomeSchoolChatResponse$b */
    private static final class C17363b extends ProtoAdapter<CreateHomeSchoolChatResponse> {
        C17363b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateHomeSchoolChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateHomeSchoolChatResponse createHomeSchoolChatResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createHomeSchoolChatResponse.chat_id) + C14928Entity.ADAPTER.encodedSizeWithTag(2, createHomeSchoolChatResponse.entity) + createHomeSchoolChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateHomeSchoolChatResponse decode(ProtoReader protoReader) throws IOException {
            C17362a aVar = new C17362a();
            aVar.f44244a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44244a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44245b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateHomeSchoolChatResponse createHomeSchoolChatResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createHomeSchoolChatResponse.chat_id);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, createHomeSchoolChatResponse.entity);
            protoWriter.writeBytes(createHomeSchoolChatResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17362a newBuilder() {
        C17362a aVar = new C17362a();
        aVar.f44244a = this.chat_id;
        aVar.f44245b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateHomeSchoolChatResponse$a */
    public static final class C17362a extends Message.Builder<CreateHomeSchoolChatResponse, C17362a> {

        /* renamed from: a */
        public String f44244a;

        /* renamed from: b */
        public C14928Entity f44245b;

        /* renamed from: a */
        public CreateHomeSchoolChatResponse build() {
            C14928Entity entity;
            String str = this.f44244a;
            if (str != null && (entity = this.f44245b) != null) {
                return new CreateHomeSchoolChatResponse(str, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f44245b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateHomeSchoolChatResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "CreateHomeSchoolChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateHomeSchoolChatResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public CreateHomeSchoolChatResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
    }
}
