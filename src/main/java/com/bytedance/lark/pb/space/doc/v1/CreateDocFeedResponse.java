package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateDocFeedResponse extends Message<CreateDocFeedResponse, C19237a> {
    public static final ProtoAdapter<CreateDocFeedResponse> ADAPTER = new C19238b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocFeedResponse$b */
    private static final class C19238b extends ProtoAdapter<CreateDocFeedResponse> {
        C19238b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDocFeedResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDocFeedResponse createDocFeedResponse) {
            int i;
            if (createDocFeedResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, createDocFeedResponse.entity);
            } else {
                i = 0;
            }
            return i + createDocFeedResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDocFeedResponse decode(ProtoReader protoReader) throws IOException {
            C19237a aVar = new C19237a();
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
                    aVar.f47411a = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateDocFeedResponse createDocFeedResponse) throws IOException {
            if (createDocFeedResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, createDocFeedResponse.entity);
            }
            protoWriter.writeBytes(createDocFeedResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocFeedResponse$a */
    public static final class C19237a extends Message.Builder<CreateDocFeedResponse, C19237a> {

        /* renamed from: a */
        public C14928Entity f47411a;

        /* renamed from: a */
        public CreateDocFeedResponse build() {
            return new CreateDocFeedResponse(this.f47411a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19237a newBuilder() {
        C19237a aVar = new C19237a();
        aVar.f47411a = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CreateDocFeedResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateDocFeedResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDocFeedResponse(C14928Entity entity2) {
        this(entity2, ByteString.EMPTY);
    }

    public CreateDocFeedResponse(C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
    }
}
