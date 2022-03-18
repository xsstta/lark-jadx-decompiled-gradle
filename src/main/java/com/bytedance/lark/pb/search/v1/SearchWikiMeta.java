package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchWikiMeta extends Message<SearchWikiMeta, C18917a> {
    public static final ProtoAdapter<SearchWikiMeta> ADAPTER = new C18918b();
    private static final long serialVersionUID = 0;
    public final String doc_id;
    public final SearchDocMeta doc_meta;
    public final String id;
    public final String space_id;
    public final String space_name;
    public final List<Tag> tags;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchWikiMeta$b */
    private static final class C18918b extends ProtoAdapter<SearchWikiMeta> {
        C18918b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchWikiMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchWikiMeta searchWikiMeta) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchWikiMeta.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, searchWikiMeta.space_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, searchWikiMeta.space_name);
            int i2 = 0;
            if (searchWikiMeta.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, searchWikiMeta.url);
            } else {
                i = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i + ProtoAdapter.STRING.encodedSizeWithTag(5, searchWikiMeta.doc_id);
            if (searchWikiMeta.doc_meta != null) {
                i2 = SearchDocMeta.ADAPTER.encodedSizeWithTag(6, searchWikiMeta.doc_meta);
            }
            return encodedSizeWithTag2 + i2 + Tag.ADAPTER.asRepeated().encodedSizeWithTag(7, searchWikiMeta.tags) + searchWikiMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchWikiMeta decode(ProtoReader protoReader) throws IOException {
            C18917a aVar = new C18917a();
            aVar.f46795a = "";
            aVar.f46796b = "";
            aVar.f46797c = "";
            aVar.f46798d = "";
            aVar.f46799e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46795a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46796b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46797c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46798d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46799e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46800f = SearchDocMeta.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f46801g.add(Tag.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchWikiMeta searchWikiMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchWikiMeta.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchWikiMeta.space_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchWikiMeta.space_name);
            if (searchWikiMeta.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchWikiMeta.url);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchWikiMeta.doc_id);
            if (searchWikiMeta.doc_meta != null) {
                SearchDocMeta.ADAPTER.encodeWithTag(protoWriter, 6, searchWikiMeta.doc_meta);
            }
            Tag.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, searchWikiMeta.tags);
            protoWriter.writeBytes(searchWikiMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18917a newBuilder() {
        C18917a aVar = new C18917a();
        aVar.f46795a = this.id;
        aVar.f46796b = this.space_id;
        aVar.f46797c = this.space_name;
        aVar.f46798d = this.url;
        aVar.f46799e = this.doc_id;
        aVar.f46800f = this.doc_meta;
        aVar.f46801g = Internal.copyOf("tags", this.tags);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchWikiMeta$a */
    public static final class C18917a extends Message.Builder<SearchWikiMeta, C18917a> {

        /* renamed from: a */
        public String f46795a;

        /* renamed from: b */
        public String f46796b;

        /* renamed from: c */
        public String f46797c;

        /* renamed from: d */
        public String f46798d;

        /* renamed from: e */
        public String f46799e;

        /* renamed from: f */
        public SearchDocMeta f46800f;

        /* renamed from: g */
        public List<Tag> f46801g = Internal.newMutableList();

        /* renamed from: a */
        public SearchWikiMeta build() {
            String str;
            String str2;
            String str3;
            String str4 = this.f46795a;
            if (str4 != null && (str = this.f46796b) != null && (str2 = this.f46797c) != null && (str3 = this.f46799e) != null) {
                return new SearchWikiMeta(str4, str, str2, this.f46798d, str3, this.f46800f, this.f46801g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str4, "id", this.f46796b, "space_id", this.f46797c, "space_name", this.f46799e, "doc_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchWikiMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", space_id=");
        sb.append(this.space_id);
        sb.append(", space_name=");
        sb.append(this.space_name);
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        sb.append(", doc_id=");
        sb.append(this.doc_id);
        if (this.doc_meta != null) {
            sb.append(", doc_meta=");
            sb.append(this.doc_meta);
        }
        if (!this.tags.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchWikiMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchWikiMeta(String str, String str2, String str3, String str4, String str5, SearchDocMeta searchDocMeta, List<Tag> list) {
        this(str, str2, str3, str4, str5, searchDocMeta, list, ByteString.EMPTY);
    }

    public SearchWikiMeta(String str, String str2, String str3, String str4, String str5, SearchDocMeta searchDocMeta, List<Tag> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.space_id = str2;
        this.space_name = str3;
        this.url = str4;
        this.doc_id = str5;
        this.doc_meta = searchDocMeta;
        this.tags = Internal.immutableCopyOf("tags", list);
    }
}
