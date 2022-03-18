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

public final class PushMessagePreviewsRequest extends Message<PushMessagePreviewsRequest, C17911a> {
    public static final ProtoAdapter<PushMessagePreviewsRequest> ADAPTER = new C17912b();
    private static final long serialVersionUID = 0;
    public final Map<String, PreviewEntityPair> preview_entities;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessagePreviewsRequest$a */
    public static final class C17911a extends Message.Builder<PushMessagePreviewsRequest, C17911a> {

        /* renamed from: a */
        public Map<String, PreviewEntityPair> f44994a = Internal.newMutableMap();

        /* renamed from: a */
        public PushMessagePreviewsRequest build() {
            return new PushMessagePreviewsRequest(this.f44994a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushMessagePreviewsRequest$b */
    private static final class C17912b extends ProtoAdapter<PushMessagePreviewsRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, PreviewEntityPair>> f44995a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, PreviewEntityPair.ADAPTER);

        C17912b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMessagePreviewsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMessagePreviewsRequest pushMessagePreviewsRequest) {
            return this.f44995a.encodedSizeWithTag(1, pushMessagePreviewsRequest.preview_entities) + pushMessagePreviewsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushMessagePreviewsRequest decode(ProtoReader protoReader) throws IOException {
            C17911a aVar = new C17911a();
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
                    aVar.f44994a.putAll(this.f44995a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushMessagePreviewsRequest pushMessagePreviewsRequest) throws IOException {
            this.f44995a.encodeWithTag(protoWriter, 1, pushMessagePreviewsRequest.preview_entities);
            protoWriter.writeBytes(pushMessagePreviewsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17911a newBuilder() {
        C17911a aVar = new C17911a();
        aVar.f44994a = Internal.copyOf("preview_entities", this.preview_entities);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushMessagePreviewsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.preview_entities.isEmpty()) {
            sb.append(", preview_entities=");
            sb.append(this.preview_entities);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMessagePreviewsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushMessagePreviewsRequest(Map<String, PreviewEntityPair> map) {
        this(map, ByteString.EMPTY);
    }

    public PushMessagePreviewsRequest(Map<String, PreviewEntityPair> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.preview_entities = Internal.immutableCopyOf("preview_entities", map);
    }
}
