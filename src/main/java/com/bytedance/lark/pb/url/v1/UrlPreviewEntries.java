package com.bytedance.lark.pb.url.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class UrlPreviewEntries extends Message<UrlPreviewEntries, C19821a> {
    public static final ProtoAdapter<UrlPreviewEntries> ADAPTER = new C19822b();
    public static final UrlPreviewSourceType DEFAULT_SOURCE_TYPE = UrlPreviewSourceType.CHAT_ANNOUNCEMENT;
    private static final long serialVersionUID = 0;
    public final List<UrlPreviewEntry> entries;
    public final String source_id;
    public final String source_text_md5;
    public final UrlPreviewSourceType source_type;

    /* renamed from: com.bytedance.lark.pb.url.v1.UrlPreviewEntries$b */
    private static final class C19822b extends ProtoAdapter<UrlPreviewEntries> {
        C19822b() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlPreviewEntries.class);
        }

        /* renamed from: a */
        public int encodedSize(UrlPreviewEntries urlPreviewEntries) {
            int i;
            int i2;
            int i3 = 0;
            if (urlPreviewEntries.source_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, urlPreviewEntries.source_id);
            } else {
                i = 0;
            }
            if (urlPreviewEntries.source_type != null) {
                i2 = UrlPreviewSourceType.ADAPTER.encodedSizeWithTag(2, urlPreviewEntries.source_type);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (urlPreviewEntries.source_text_md5 != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, urlPreviewEntries.source_text_md5);
            }
            return i4 + i3 + UrlPreviewEntry.ADAPTER.asRepeated().encodedSizeWithTag(4, urlPreviewEntries.entries) + urlPreviewEntries.unknownFields().size();
        }

        /* renamed from: a */
        public UrlPreviewEntries decode(ProtoReader protoReader) throws IOException {
            C19821a aVar = new C19821a();
            aVar.f48307a = "";
            aVar.f48308b = UrlPreviewSourceType.CHAT_ANNOUNCEMENT;
            aVar.f48309c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48307a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f48308b = UrlPreviewSourceType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f48309c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48310d.add(UrlPreviewEntry.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UrlPreviewEntries urlPreviewEntries) throws IOException {
            if (urlPreviewEntries.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlPreviewEntries.source_id);
            }
            if (urlPreviewEntries.source_type != null) {
                UrlPreviewSourceType.ADAPTER.encodeWithTag(protoWriter, 2, urlPreviewEntries.source_type);
            }
            if (urlPreviewEntries.source_text_md5 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, urlPreviewEntries.source_text_md5);
            }
            UrlPreviewEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, urlPreviewEntries.entries);
            protoWriter.writeBytes(urlPreviewEntries.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.url.v1.UrlPreviewEntries$a */
    public static final class C19821a extends Message.Builder<UrlPreviewEntries, C19821a> {

        /* renamed from: a */
        public String f48307a;

        /* renamed from: b */
        public UrlPreviewSourceType f48308b;

        /* renamed from: c */
        public String f48309c;

        /* renamed from: d */
        public List<UrlPreviewEntry> f48310d = Internal.newMutableList();

        /* renamed from: a */
        public UrlPreviewEntries build() {
            return new UrlPreviewEntries(this.f48307a, this.f48308b, this.f48309c, this.f48310d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19821a newBuilder() {
        C19821a aVar = new C19821a();
        aVar.f48307a = this.source_id;
        aVar.f48308b = this.source_type;
        aVar.f48309c = this.source_text_md5;
        aVar.f48310d = Internal.copyOf("entries", this.entries);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("url", "UrlPreviewEntries");
        StringBuilder sb = new StringBuilder();
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.source_text_md5 != null) {
            sb.append(", source_text_md5=");
            sb.append(this.source_text_md5);
        }
        if (!this.entries.isEmpty()) {
            sb.append(", entries=");
            sb.append(this.entries);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlPreviewEntries{");
        replace.append('}');
        return replace.toString();
    }

    public UrlPreviewEntries(String str, UrlPreviewSourceType urlPreviewSourceType, String str2, List<UrlPreviewEntry> list) {
        this(str, urlPreviewSourceType, str2, list, ByteString.EMPTY);
    }

    public UrlPreviewEntries(String str, UrlPreviewSourceType urlPreviewSourceType, String str2, List<UrlPreviewEntry> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source_id = str;
        this.source_type = urlPreviewSourceType;
        this.source_text_md5 = str2;
        this.entries = Internal.immutableCopyOf("entries", list);
    }
}
