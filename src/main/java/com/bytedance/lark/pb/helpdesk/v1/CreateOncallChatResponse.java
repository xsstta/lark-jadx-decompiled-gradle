package com.bytedance.lark.pb.helpdesk.v1;

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

public final class CreateOncallChatResponse extends Message<CreateOncallChatResponse, C17256a> {
    public static final ProtoAdapter<CreateOncallChatResponse> ADAPTER = new C17257b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatResponse$b */
    private static final class C17257b extends ProtoAdapter<CreateOncallChatResponse> {
        C17257b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateOncallChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateOncallChatResponse createOncallChatResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createOncallChatResponse.chat_id);
            if (createOncallChatResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, createOncallChatResponse.entity);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + createOncallChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateOncallChatResponse decode(ProtoReader protoReader) throws IOException {
            C17256a aVar = new C17256a();
            aVar.f44088a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44088a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44089b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateOncallChatResponse createOncallChatResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createOncallChatResponse.chat_id);
            if (createOncallChatResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, createOncallChatResponse.entity);
            }
            protoWriter.writeBytes(createOncallChatResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatResponse$a */
    public static final class C17256a extends Message.Builder<CreateOncallChatResponse, C17256a> {

        /* renamed from: a */
        public String f44088a;

        /* renamed from: b */
        public C14928Entity f44089b;

        /* renamed from: a */
        public CreateOncallChatResponse build() {
            String str = this.f44088a;
            if (str != null) {
                return new CreateOncallChatResponse(str, this.f44089b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C17256a newBuilder() {
        C17256a aVar = new C17256a();
        aVar.f44088a = this.chat_id;
        aVar.f44089b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "CreateOncallChatResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateOncallChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateOncallChatResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public CreateOncallChatResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
        this.entity = entity2;
    }
}
