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

public final class CreateChatResponse extends Message<CreateChatResponse, C17342a> {
    public static final ProtoAdapter<CreateChatResponse> ADAPTER = new C17343b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatResponse$b */
    private static final class C17343b extends ProtoAdapter<CreateChatResponse> {
        C17343b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateChatResponse createChatResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, createChatResponse.chat_id) + C14928Entity.ADAPTER.encodedSizeWithTag(2, createChatResponse.entity) + createChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateChatResponse decode(ProtoReader protoReader) throws IOException {
            C17342a aVar = new C17342a();
            aVar.f44216a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44216a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44217b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateChatResponse createChatResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createChatResponse.chat_id);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, createChatResponse.entity);
            protoWriter.writeBytes(createChatResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17342a newBuilder() {
        C17342a aVar = new C17342a();
        aVar.f44216a = this.chat_id;
        aVar.f44217b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateChatResponse$a */
    public static final class C17342a extends Message.Builder<CreateChatResponse, C17342a> {

        /* renamed from: a */
        public String f44216a;

        /* renamed from: b */
        public C14928Entity f44217b;

        /* renamed from: a */
        public CreateChatResponse build() {
            C14928Entity entity;
            String str = this.f44216a;
            if (str != null && (entity = this.f44217b) != null) {
                return new CreateChatResponse(str, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f44217b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateChatResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "CreateChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateChatResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public CreateChatResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
    }
}
