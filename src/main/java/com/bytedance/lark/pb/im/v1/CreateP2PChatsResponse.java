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

public final class CreateP2PChatsResponse extends Message<CreateP2PChatsResponse, C17370a> {
    public static final ProtoAdapter<CreateP2PChatsResponse> ADAPTER = new C17371b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateP2PChatsResponse$b */
    private static final class C17371b extends ProtoAdapter<CreateP2PChatsResponse> {
        C17371b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateP2PChatsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateP2PChatsResponse createP2PChatsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, createP2PChatsResponse.entity) + createP2PChatsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateP2PChatsResponse decode(ProtoReader protoReader) throws IOException {
            C17370a aVar = new C17370a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44255a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateP2PChatsResponse createP2PChatsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, createP2PChatsResponse.entity);
            protoWriter.writeBytes(createP2PChatsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CreateP2PChatsResponse$a */
    public static final class C17370a extends Message.Builder<CreateP2PChatsResponse, C17370a> {

        /* renamed from: a */
        public C14928Entity f44255a;

        /* renamed from: a */
        public CreateP2PChatsResponse build() {
            C14928Entity entity = this.f44255a;
            if (entity != null) {
                return new CreateP2PChatsResponse(entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17370a newBuilder() {
        C17370a aVar = new C17370a();
        aVar.f44255a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CreateP2PChatsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "CreateP2PChatsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateP2PChatsResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public CreateP2PChatsResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
