package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.PreviewEntityPair;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetMessagePreviewsResponse extends Message<GetMessagePreviewsResponse, C17625a> {
    public static final ProtoAdapter<GetMessagePreviewsResponse> ADAPTER = new C17626b();
    private static final long serialVersionUID = 0;
    public final Map<String, PreviewEntityPair> preview_entities;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagePreviewsResponse$a */
    public static final class C17625a extends Message.Builder<GetMessagePreviewsResponse, C17625a> {

        /* renamed from: a */
        public Map<String, PreviewEntityPair> f44622a = Internal.newMutableMap();

        /* renamed from: a */
        public GetMessagePreviewsResponse build() {
            return new GetMessagePreviewsResponse(this.f44622a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetMessagePreviewsResponse$b */
    private static final class C17626b extends ProtoAdapter<GetMessagePreviewsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, PreviewEntityPair>> f44623a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PreviewEntityPair.ADAPTER);

        C17626b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessagePreviewsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessagePreviewsResponse getMessagePreviewsResponse) {
            return this.f44623a.encodedSizeWithTag(1, getMessagePreviewsResponse.preview_entities) + getMessagePreviewsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessagePreviewsResponse decode(ProtoReader protoReader) throws IOException {
            C17625a aVar = new C17625a();
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
                    aVar.f44622a.putAll(this.f44623a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessagePreviewsResponse getMessagePreviewsResponse) throws IOException {
            this.f44623a.encodeWithTag(protoWriter, 1, getMessagePreviewsResponse.preview_entities);
            protoWriter.writeBytes(getMessagePreviewsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17625a newBuilder() {
        C17625a aVar = new C17625a();
        aVar.f44622a = Internal.copyOf("preview_entities", this.preview_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetMessagePreviewsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.preview_entities.isEmpty()) {
            sb.append(", preview_entities=");
            sb.append(this.preview_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessagePreviewsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessagePreviewsResponse(Map<String, PreviewEntityPair> map) {
        this(map, ByteString.EMPTY);
    }

    public GetMessagePreviewsResponse(Map<String, PreviewEntityPair> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.preview_entities = Internal.immutableCopyOf("preview_entities", map);
    }
}
