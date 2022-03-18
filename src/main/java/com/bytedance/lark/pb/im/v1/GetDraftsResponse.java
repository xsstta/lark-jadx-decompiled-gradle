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

public final class GetDraftsResponse extends Message<GetDraftsResponse, C17572a> {
    public static final ProtoAdapter<GetDraftsResponse> ADAPTER = new C17573b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDraftsResponse$b */
    private static final class C17573b extends ProtoAdapter<GetDraftsResponse> {
        C17573b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDraftsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDraftsResponse getDraftsResponse) {
            return C14928Entity.ADAPTER.encodedSizeWithTag(1, getDraftsResponse.entity) + getDraftsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDraftsResponse decode(ProtoReader protoReader) throws IOException {
            C17572a aVar = new C17572a();
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
                    aVar.f44531a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDraftsResponse getDraftsResponse) throws IOException {
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getDraftsResponse.entity);
            protoWriter.writeBytes(getDraftsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDraftsResponse$a */
    public static final class C17572a extends Message.Builder<GetDraftsResponse, C17572a> {

        /* renamed from: a */
        public C14928Entity f44531a;

        /* renamed from: a */
        public GetDraftsResponse build() {
            C14928Entity entity = this.f44531a;
            if (entity != null) {
                return new GetDraftsResponse(entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(entity, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public C17572a newBuilder() {
        C17572a aVar = new C17572a();
        aVar.f44531a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetDraftsResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "GetDraftsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDraftsResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public GetDraftsResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
