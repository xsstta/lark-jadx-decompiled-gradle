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

public final class GetChatChattersByIdsResponse extends Message<GetChatChattersByIdsResponse, C17504a> {
    public static final ProtoAdapter<GetChatChattersByIdsResponse> ADAPTER = new C17505b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersByIdsResponse$b */
    private static final class C17505b extends ProtoAdapter<GetChatChattersByIdsResponse> {
        C17505b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatChattersByIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatChattersByIdsResponse getChatChattersByIdsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getChatChattersByIdsResponse.entity) + getChatChattersByIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatChattersByIdsResponse decode(ProtoReader protoReader) throws IOException {
            C17504a aVar = new C17504a();
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
                    aVar.f44411a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatChattersByIdsResponse getChatChattersByIdsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getChatChattersByIdsResponse.entity);
            protoWriter.writeBytes(getChatChattersByIdsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatChattersByIdsResponse$a */
    public static final class C17504a extends Message.Builder<GetChatChattersByIdsResponse, C17504a> {

        /* renamed from: a */
        public C14928Entity f44411a;

        /* renamed from: a */
        public GetChatChattersByIdsResponse build() {
            C14928Entity entity = this.f44411a;
            if (entity != null) {
                return new GetChatChattersByIdsResponse(entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17504a newBuilder() {
        C17504a aVar = new C17504a();
        aVar.f44411a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatChattersByIdsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "GetChatChattersByIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatChattersByIdsResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public GetChatChattersByIdsResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
