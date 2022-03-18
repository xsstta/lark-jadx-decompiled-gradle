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

public final class UpdateChatResponse extends Message<UpdateChatResponse, C18139a> {
    public static final ProtoAdapter<UpdateChatResponse> ADAPTER = new C18140b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatResponse$b */
    private static final class C18140b extends ProtoAdapter<UpdateChatResponse> {
        C18140b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatResponse updateChatResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateChatResponse.chat_id) + C14928Entity.ADAPTER.encodedSizeWithTag(2, updateChatResponse.entity) + updateChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatResponse decode(ProtoReader protoReader) throws IOException {
            C18139a aVar = new C18139a();
            aVar.f45334a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45334a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45335b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatResponse updateChatResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateChatResponse.chat_id);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, updateChatResponse.entity);
            protoWriter.writeBytes(updateChatResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18139a newBuilder() {
        C18139a aVar = new C18139a();
        aVar.f45334a = this.chat_id;
        aVar.f45335b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.UpdateChatResponse$a */
    public static final class C18139a extends Message.Builder<UpdateChatResponse, C18139a> {

        /* renamed from: a */
        public String f45334a;

        /* renamed from: b */
        public C14928Entity f45335b;

        /* renamed from: a */
        public UpdateChatResponse build() {
            C14928Entity entity;
            String str = this.f45334a;
            if (str != null && (entity = this.f45335b) != null) {
                return new UpdateChatResponse(str, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id", this.f45335b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "UpdateChatResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "UpdateChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public UpdateChatResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
    }
}
