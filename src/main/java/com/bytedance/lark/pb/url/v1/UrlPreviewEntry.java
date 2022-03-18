package com.bytedance.lark.pb.url.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.UrlPreviewEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UrlPreviewEntry extends Message<UrlPreviewEntry, C19823a> {
    public static final ProtoAdapter<UrlPreviewEntry> ADAPTER = new C19824b();
    public static final Integer DEFAULT_LENGTH = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    private static final long serialVersionUID = 0;
    public final Integer length;
    public final Integer offset;
    public final UrlPreviewEntity preview_entity;
    public final String preview_id;

    /* renamed from: com.bytedance.lark.pb.url.v1.UrlPreviewEntry$b */
    private static final class C19824b extends ProtoAdapter<UrlPreviewEntry> {
        C19824b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlPreviewEntry.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlPreviewEntry urlPreviewEntry) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (urlPreviewEntry.offset != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, urlPreviewEntry.offset);
            } else {
                i = 0;
            }
            if (urlPreviewEntry.length != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, urlPreviewEntry.length);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (urlPreviewEntry.preview_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, urlPreviewEntry.preview_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (urlPreviewEntry.preview_entity != null) {
                i4 = UrlPreviewEntity.ADAPTER.encodedSizeWithTag(4, urlPreviewEntry.preview_entity);
            }
            return i6 + i4 + urlPreviewEntry.unknownFields().size();
        }

        /* renamed from: a */
        public UrlPreviewEntry decode(ProtoReader protoReader) throws IOException {
            C19823a aVar = new C19823a();
            aVar.f48311a = 0;
            aVar.f48312b = 0;
            aVar.f48313c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48311a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48312b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48313c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48314d = UrlPreviewEntity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UrlPreviewEntry urlPreviewEntry) throws IOException {
            if (urlPreviewEntry.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, urlPreviewEntry.offset);
            }
            if (urlPreviewEntry.length != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, urlPreviewEntry.length);
            }
            if (urlPreviewEntry.preview_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, urlPreviewEntry.preview_id);
            }
            if (urlPreviewEntry.preview_entity != null) {
                UrlPreviewEntity.ADAPTER.encodeWithTag(protoWriter, 4, urlPreviewEntry.preview_entity);
            }
            protoWriter.writeBytes(urlPreviewEntry.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.url.v1.UrlPreviewEntry$a */
    public static final class C19823a extends Message.Builder<UrlPreviewEntry, C19823a> {

        /* renamed from: a */
        public Integer f48311a;

        /* renamed from: b */
        public Integer f48312b;

        /* renamed from: c */
        public String f48313c;

        /* renamed from: d */
        public UrlPreviewEntity f48314d;

        /* renamed from: a */
        public UrlPreviewEntry build() {
            return new UrlPreviewEntry(this.f48311a, this.f48312b, this.f48313c, this.f48314d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19823a newBuilder() {
        C19823a aVar = new C19823a();
        aVar.f48311a = this.offset;
        aVar.f48312b = this.length;
        aVar.f48313c = this.preview_id;
        aVar.f48314d = this.preview_entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("url", "UrlPreviewEntry");
        StringBuilder sb = new StringBuilder();
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.length != null) {
            sb.append(", length=");
            sb.append(this.length);
        }
        if (this.preview_id != null) {
            sb.append(", preview_id=");
            sb.append(this.preview_id);
        }
        if (this.preview_entity != null) {
            sb.append(", preview_entity=");
            sb.append(this.preview_entity);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlPreviewEntry{");
        replace.append('}');
        return replace.toString();
    }

    public UrlPreviewEntry(Integer num, Integer num2, String str, UrlPreviewEntity urlPreviewEntity) {
        this(num, num2, str, urlPreviewEntity, ByteString.EMPTY);
    }

    public UrlPreviewEntry(Integer num, Integer num2, String str, UrlPreviewEntity urlPreviewEntity, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offset = num;
        this.length = num2;
        this.preview_id = str;
        this.preview_entity = urlPreviewEntity;
    }
}
