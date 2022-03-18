package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PreviewEntityPair extends Message<PreviewEntityPair, C15119a> {
    public static final ProtoAdapter<PreviewEntityPair> ADAPTER = new C15120b();
    private static final long serialVersionUID = 0;
    public final Map<String, UrlPreviewEntity> preview_entity;

    /* renamed from: com.bytedance.lark.pb.basic.v1.PreviewEntityPair$a */
    public static final class C15119a extends Message.Builder<PreviewEntityPair, C15119a> {

        /* renamed from: a */
        public Map<String, UrlPreviewEntity> f40082a = Internal.newMutableMap();

        /* renamed from: a */
        public PreviewEntityPair build() {
            return new PreviewEntityPair(this.f40082a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15119a mo55135a(Map<String, UrlPreviewEntity> map) {
            Internal.checkElementsNotNull(map);
            this.f40082a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.PreviewEntityPair$b */
    private static final class C15120b extends ProtoAdapter<PreviewEntityPair> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrlPreviewEntity>> f40083a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewEntity.ADAPTER);

        C15120b() {
            super(FieldEncoding.LENGTH_DELIMITED, PreviewEntityPair.class);
        }

        /* renamed from: a */
        public int encodedSize(PreviewEntityPair previewEntityPair) {
            return this.f40083a.encodedSizeWithTag(1, previewEntityPair.preview_entity) + previewEntityPair.unknownFields().size();
        }

        /* renamed from: a */
        public PreviewEntityPair decode(ProtoReader protoReader) throws IOException {
            C15119a aVar = new C15119a();
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
                    aVar.f40082a.putAll(this.f40083a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PreviewEntityPair previewEntityPair) throws IOException {
            this.f40083a.encodeWithTag(protoWriter, 1, previewEntityPair.preview_entity);
            protoWriter.writeBytes(previewEntityPair.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15119a newBuilder() {
        C15119a aVar = new C15119a();
        aVar.f40082a = Internal.copyOf("preview_entity", this.preview_entity);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "PreviewEntityPair");
        StringBuilder sb = new StringBuilder();
        if (!this.preview_entity.isEmpty()) {
            sb.append(", preview_entity=");
            sb.append(this.preview_entity);
        }
        StringBuilder replace = sb.replace(0, 2, "PreviewEntityPair{");
        replace.append('}');
        return replace.toString();
    }

    public PreviewEntityPair(Map<String, UrlPreviewEntity> map) {
        this(map, ByteString.EMPTY);
    }

    public PreviewEntityPair(Map<String, UrlPreviewEntity> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.preview_entity = Internal.immutableCopyOf("preview_entity", map);
    }
}
