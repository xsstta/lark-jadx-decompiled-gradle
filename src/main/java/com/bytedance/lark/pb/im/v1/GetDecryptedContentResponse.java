package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Content;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetDecryptedContentResponse extends Message<GetDecryptedContentResponse, C17568a> {
    public static final ProtoAdapter<GetDecryptedContentResponse> ADAPTER = new C17569b();
    private static final long serialVersionUID = 0;
    public final Map<String, Content> contents;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDecryptedContentResponse$a */
    public static final class C17568a extends Message.Builder<GetDecryptedContentResponse, C17568a> {

        /* renamed from: a */
        public C14928Entity f44527a;

        /* renamed from: b */
        public Map<String, Content> f44528b = Internal.newMutableMap();

        /* renamed from: a */
        public GetDecryptedContentResponse build() {
            return new GetDecryptedContentResponse(this.f44527a, this.f44528b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetDecryptedContentResponse$b */
    private static final class C17569b extends ProtoAdapter<GetDecryptedContentResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Content>> f44529a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Content.ADAPTER);

        C17569b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetDecryptedContentResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetDecryptedContentResponse getDecryptedContentResponse) {
            int i;
            if (getDecryptedContentResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(1, getDecryptedContentResponse.entity);
            } else {
                i = 0;
            }
            return i + this.f44529a.encodedSizeWithTag(2, getDecryptedContentResponse.contents) + getDecryptedContentResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetDecryptedContentResponse decode(ProtoReader protoReader) throws IOException {
            C17568a aVar = new C17568a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44527a = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44528b.putAll(this.f44529a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetDecryptedContentResponse getDecryptedContentResponse) throws IOException {
            if (getDecryptedContentResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 1, getDecryptedContentResponse.entity);
            }
            this.f44529a.encodeWithTag(protoWriter, 2, getDecryptedContentResponse.contents);
            protoWriter.writeBytes(getDecryptedContentResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17568a newBuilder() {
        C17568a aVar = new C17568a();
        aVar.f44527a = this.entity;
        aVar.f44528b = Internal.copyOf("contents", this.contents);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetDecryptedContentResponse");
        StringBuilder sb = new StringBuilder();
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.contents.isEmpty()) {
            sb.append(", contents=");
            sb.append(this.contents);
        }
        StringBuilder replace = sb.replace(0, 2, "GetDecryptedContentResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetDecryptedContentResponse(C14928Entity entity2, Map<String, Content> map) {
        this(entity2, map, ByteString.EMPTY);
    }

    public GetDecryptedContentResponse(C14928Entity entity2, Map<String, Content> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity = entity2;
        this.contents = Internal.immutableCopyOf("contents", map);
    }
}
