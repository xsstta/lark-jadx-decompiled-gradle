package com.bytedance.lark.pb.contact.v1;

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

public final class MGetChattersResponse extends Message<MGetChattersResponse, C16326a> {
    public static final ProtoAdapter<MGetChattersResponse> ADAPTER = new C16327b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetChattersResponse$b */
    private static final class C16327b extends ProtoAdapter<MGetChattersResponse> {
        C16327b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetChattersResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetChattersResponse mGetChattersResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, mGetChattersResponse.entity) + mGetChattersResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetChattersResponse decode(ProtoReader protoReader) throws IOException {
            C16326a aVar = new C16326a();
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
                    aVar.f42573a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetChattersResponse mGetChattersResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, mGetChattersResponse.entity);
            protoWriter.writeBytes(mGetChattersResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.MGetChattersResponse$a */
    public static final class C16326a extends Message.Builder<MGetChattersResponse, C16326a> {

        /* renamed from: a */
        public C14928Entity f42573a;

        /* renamed from: a */
        public MGetChattersResponse build() {
            C14928Entity entity = this.f42573a;
            if (entity != null) {
                return new MGetChattersResponse(entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C16326a newBuilder() {
        C16326a aVar = new C16326a();
        aVar.f42573a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "MGetChattersResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "MGetChattersResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetChattersResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public MGetChattersResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
