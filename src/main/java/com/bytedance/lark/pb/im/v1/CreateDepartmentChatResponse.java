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

public final class CreateDepartmentChatResponse extends Message<CreateDepartmentChatResponse, C17350a> {
    public static final ProtoAdapter<CreateDepartmentChatResponse> ADAPTER = new C17351b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDepartmentChatResponse$b */
    private static final class C17351b extends ProtoAdapter<CreateDepartmentChatResponse> {
        C17351b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDepartmentChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDepartmentChatResponse createDepartmentChatResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createDepartmentChatResponse.chat_id) + C14928Entity.ADAPTER.encodedSizeWithTag(2, createDepartmentChatResponse.entity) + createDepartmentChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDepartmentChatResponse decode(ProtoReader protoReader) throws IOException {
            C17350a aVar = new C17350a();
            aVar.f44230a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44230a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44231b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateDepartmentChatResponse createDepartmentChatResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createDepartmentChatResponse.chat_id);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, createDepartmentChatResponse.entity);
            protoWriter.writeBytes(createDepartmentChatResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17350a newBuilder() {
        C17350a aVar = new C17350a();
        aVar.f44230a = this.chat_id;
        aVar.f44231b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateDepartmentChatResponse$a */
    public static final class C17350a extends Message.Builder<CreateDepartmentChatResponse, C17350a> {

        /* renamed from: a */
        public String f44230a;

        /* renamed from: b */
        public C14928Entity f44231b;

        /* renamed from: a */
        public CreateDepartmentChatResponse build() {
            C14928Entity entity;
            String str = this.f44230a;
            if (str != null && (entity = this.f44231b) != null) {
                return new CreateDepartmentChatResponse(str, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f44231b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateDepartmentChatResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "CreateDepartmentChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDepartmentChatResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public CreateDepartmentChatResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
    }
}
