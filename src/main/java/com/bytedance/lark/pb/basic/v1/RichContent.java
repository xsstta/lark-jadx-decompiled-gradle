package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class RichContent extends Message<RichContent, C15157a> {
    public static final ProtoAdapter<RichContent> ADAPTER = new C15158b();
    private static final long serialVersionUID = 0;
    public final DocEntity doc_entity;
    public final List<String> fake_preview_ids;
    public final RichText rich_text;
    public final PreviewEntityPair url_preview_entities;
    public final Map<String, UrlPreviewHangPoint> url_preview_hang_points;

    /* renamed from: com.bytedance.lark.pb.basic.v1.RichContent$b */
    private static final class C15158b extends ProtoAdapter<RichContent> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, UrlPreviewHangPoint>> f40211a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, UrlPreviewHangPoint.ADAPTER);

        C15158b() {
            super(FieldEncoding.LENGTH_DELIMITED, RichContent.class);
        }

        /* renamed from: a */
        public int encodedSize(RichContent richContent) {
            int i;
            int i2;
            int i3 = 0;
            if (richContent.rich_text != null) {
                i = RichText.ADAPTER.encodedSizeWithTag(1, richContent.rich_text);
            } else {
                i = 0;
            }
            if (richContent.doc_entity != null) {
                i2 = DocEntity.ADAPTER.encodedSizeWithTag(2, richContent.doc_entity);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + this.f40211a.encodedSizeWithTag(3, richContent.url_preview_hang_points);
            if (richContent.url_preview_entities != null) {
                i3 = PreviewEntityPair.ADAPTER.encodedSizeWithTag(4, richContent.url_preview_entities);
            }
            return encodedSizeWithTag + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, richContent.fake_preview_ids) + richContent.unknownFields().size();
        }

        /* renamed from: a */
        public RichContent decode(ProtoReader protoReader) throws IOException {
            C15157a aVar = new C15157a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40206a = RichText.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40207b = DocEntity.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40208c.putAll(this.f40211a.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f40209d = PreviewEntityPair.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40210e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, RichContent richContent) throws IOException {
            if (richContent.rich_text != null) {
                RichText.ADAPTER.encodeWithTag(protoWriter, 1, richContent.rich_text);
            }
            if (richContent.doc_entity != null) {
                DocEntity.ADAPTER.encodeWithTag(protoWriter, 2, richContent.doc_entity);
            }
            this.f40211a.encodeWithTag(protoWriter, 3, richContent.url_preview_hang_points);
            if (richContent.url_preview_entities != null) {
                PreviewEntityPair.ADAPTER.encodeWithTag(protoWriter, 4, richContent.url_preview_entities);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, richContent.fake_preview_ids);
            protoWriter.writeBytes(richContent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15157a newBuilder() {
        C15157a aVar = new C15157a();
        aVar.f40206a = this.rich_text;
        aVar.f40207b = this.doc_entity;
        aVar.f40208c = Internal.copyOf("url_preview_hang_points", this.url_preview_hang_points);
        aVar.f40209d = this.url_preview_entities;
        aVar.f40210e = Internal.copyOf("fake_preview_ids", this.fake_preview_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.RichContent$a */
    public static final class C15157a extends Message.Builder<RichContent, C15157a> {

        /* renamed from: a */
        public RichText f40206a;

        /* renamed from: b */
        public DocEntity f40207b;

        /* renamed from: c */
        public Map<String, UrlPreviewHangPoint> f40208c = Internal.newMutableMap();

        /* renamed from: d */
        public PreviewEntityPair f40209d;

        /* renamed from: e */
        public List<String> f40210e = Internal.newMutableList();

        /* renamed from: a */
        public RichContent build() {
            return new RichContent(this.f40206a, this.f40207b, this.f40208c, this.f40209d, this.f40210e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15157a mo55251a(DocEntity docEntity) {
            this.f40207b = docEntity;
            return this;
        }

        /* renamed from: a */
        public C15157a mo55252a(PreviewEntityPair previewEntityPair) {
            this.f40209d = previewEntityPair;
            return this;
        }

        /* renamed from: a */
        public C15157a mo55253a(RichText richText) {
            this.f40206a = richText;
            return this;
        }

        /* renamed from: a */
        public C15157a mo55254a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40210e = list;
            return this;
        }

        /* renamed from: a */
        public C15157a mo55255a(Map<String, UrlPreviewHangPoint> map) {
            Internal.checkElementsNotNull(map);
            this.f40208c = map;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "RichContent");
        StringBuilder sb = new StringBuilder();
        if (this.rich_text != null) {
            sb.append(", rich_text=");
            sb.append(this.rich_text);
        }
        if (this.doc_entity != null) {
            sb.append(", doc_entity=");
            sb.append(this.doc_entity);
        }
        if (!this.url_preview_hang_points.isEmpty()) {
            sb.append(", url_preview_hang_points=");
            sb.append(this.url_preview_hang_points);
        }
        if (this.url_preview_entities != null) {
            sb.append(", url_preview_entities=");
            sb.append(this.url_preview_entities);
        }
        if (!this.fake_preview_ids.isEmpty()) {
            sb.append(", fake_preview_ids=");
            sb.append(this.fake_preview_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "RichContent{");
        replace.append('}');
        return replace.toString();
    }

    public RichContent(RichText richText, DocEntity docEntity, Map<String, UrlPreviewHangPoint> map, PreviewEntityPair previewEntityPair, List<String> list) {
        this(richText, docEntity, map, previewEntityPair, list, ByteString.EMPTY);
    }

    public RichContent(RichText richText, DocEntity docEntity, Map<String, UrlPreviewHangPoint> map, PreviewEntityPair previewEntityPair, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rich_text = richText;
        this.doc_entity = docEntity;
        this.url_preview_hang_points = Internal.immutableCopyOf("url_preview_hang_points", map);
        this.url_preview_entities = previewEntityPair;
        this.fake_preview_ids = Internal.immutableCopyOf("fake_preview_ids", list);
    }
}
