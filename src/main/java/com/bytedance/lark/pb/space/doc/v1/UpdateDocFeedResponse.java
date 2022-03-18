package com.bytedance.lark.pb.space.doc.v1;

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

public final class UpdateDocFeedResponse extends Message<UpdateDocFeedResponse, C19279a> {
    public static final ProtoAdapter<UpdateDocFeedResponse> ADAPTER = new C19280b();
    private static final long serialVersionUID = 0;
    public final String doc_feed_id;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocFeedResponse$b */
    private static final class C19280b extends ProtoAdapter<UpdateDocFeedResponse> {
        C19280b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateDocFeedResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateDocFeedResponse updateDocFeedResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateDocFeedResponse.doc_feed_id) + C14928Entity.ADAPTER.encodedSizeWithTag(2, updateDocFeedResponse.entity) + updateDocFeedResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateDocFeedResponse decode(ProtoReader protoReader) throws IOException {
            C19279a aVar = new C19279a();
            aVar.f47468a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47468a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47469b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateDocFeedResponse updateDocFeedResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateDocFeedResponse.doc_feed_id);
            C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, updateDocFeedResponse.entity);
            protoWriter.writeBytes(updateDocFeedResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19279a newBuilder() {
        C19279a aVar = new C19279a();
        aVar.f47468a = this.doc_feed_id;
        aVar.f47469b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.UpdateDocFeedResponse$a */
    public static final class C19279a extends Message.Builder<UpdateDocFeedResponse, C19279a> {

        /* renamed from: a */
        public String f47468a;

        /* renamed from: b */
        public C14928Entity f47469b;

        /* renamed from: a */
        public UpdateDocFeedResponse build() {
            C14928Entity entity;
            String str = this.f47468a;
            if (str != null && (entity = this.f47469b) != null) {
                return new UpdateDocFeedResponse(str, entity, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "doc_feed_id", this.f47469b, "entity");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "UpdateDocFeedResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", doc_feed_id=");
        sb.append(this.doc_feed_id);
        sb.append(", entity=");
        sb.append(this.entity);
        StringBuilder replace = sb.replace(0, 2, "UpdateDocFeedResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateDocFeedResponse(String str, C14928Entity entity2) {
        this(str, entity2, ByteString.EMPTY);
    }

    public UpdateDocFeedResponse(String str, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.doc_feed_id = str;
        this.entity = entity2;
    }
}
