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

public final class GetAllDraftsResponse extends Message<GetAllDraftsResponse, C17468a> {
    public static final ProtoAdapter<GetAllDraftsResponse> ADAPTER = new C17469b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAllDraftsResponse$b */
    private static final class C17469b extends ProtoAdapter<GetAllDraftsResponse> {
        C17469b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllDraftsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllDraftsResponse getAllDraftsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getAllDraftsResponse.entity) + getAllDraftsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllDraftsResponse decode(ProtoReader protoReader) throws IOException {
            C17468a aVar = new C17468a();
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
                    aVar.f44359a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllDraftsResponse getAllDraftsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getAllDraftsResponse.entity);
            protoWriter.writeBytes(getAllDraftsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetAllDraftsResponse$a */
    public static final class C17468a extends Message.Builder<GetAllDraftsResponse, C17468a> {

        /* renamed from: a */
        public C14928Entity f44359a;

        /* renamed from: a */
        public GetAllDraftsResponse build() {
            C14928Entity entity = this.f44359a;
            if (entity != null) {
                return new GetAllDraftsResponse(entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17468a newBuilder() {
        C17468a aVar = new C17468a();
        aVar.f44359a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetAllDraftsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "GetAllDraftsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllDraftsResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public GetAllDraftsResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
