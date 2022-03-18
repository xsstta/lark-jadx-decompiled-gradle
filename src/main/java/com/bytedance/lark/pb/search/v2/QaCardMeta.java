package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Doc;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class QaCardMeta extends Message<QaCardMeta, C19011a> {
    public static final ProtoAdapter<QaCardMeta> ADAPTER = new C19012b();
    public static final SourceType DEFAULT_SOURCE_TYPE = SourceType.UNKNOWN_SOURCE;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String category_desc;
    public final String category_name;
    public final String content_avatar_key;
    public final String id;
    public final String name;
    public final String qa_render_meta;
    public final List<String> recommended_questions;
    public final String source_id;
    public final SourceMeta source_meta;
    public final SourceType source_type;
    public final String source_url;
    public final Long update_time;

    public enum SourceType implements WireEnum {
        UNKNOWN_SOURCE(0),
        ONCALL(1),
        DOC(2),
        APP(3),
        WIKI(4);
        
        public static final ProtoAdapter<SourceType> ADAPTER = ProtoAdapter.newEnumAdapter(SourceType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SourceType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_SOURCE;
            }
            if (i == 1) {
                return ONCALL;
            }
            if (i == 2) {
                return DOC;
            }
            if (i == 3) {
                return APP;
            }
            if (i != 4) {
                return null;
            }
            return WIKI;
        }

        private SourceType(int i) {
            this.value = i;
        }
    }

    public static final class AppMeta extends Message<AppMeta, C19001a> {
        public static final ProtoAdapter<AppMeta> ADAPTER = new C19002b();
        private static final long serialVersionUID = 0;
        public final String user_id;

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$AppMeta$b */
        private static final class C19002b extends ProtoAdapter<AppMeta> {
            C19002b() {
                super(FieldEncoding.LENGTH_DELIMITED, AppMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(AppMeta appMeta) {
                int i;
                if (appMeta.user_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, appMeta.user_id);
                } else {
                    i = 0;
                }
                return i + appMeta.unknownFields().size();
            }

            /* renamed from: a */
            public AppMeta decode(ProtoReader protoReader) throws IOException {
                C19001a aVar = new C19001a();
                aVar.f46994a = "";
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
                        aVar.f46994a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AppMeta appMeta) throws IOException {
                if (appMeta.user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appMeta.user_id);
                }
                protoWriter.writeBytes(appMeta.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$AppMeta$a */
        public static final class C19001a extends Message.Builder<AppMeta, C19001a> {

            /* renamed from: a */
            public String f46994a;

            /* renamed from: a */
            public AppMeta build() {
                return new AppMeta(this.f46994a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19001a newBuilder() {
            C19001a aVar = new C19001a();
            aVar.f46994a = this.user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "AppMeta");
            StringBuilder sb = new StringBuilder();
            if (this.user_id != null) {
                sb.append(", user_id=");
                sb.append(this.user_id);
            }
            StringBuilder replace = sb.replace(0, 2, "AppMeta{");
            replace.append('}');
            return replace.toString();
        }

        public AppMeta(String str) {
            this(str, ByteString.EMPTY);
        }

        public AppMeta(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.user_id = str;
        }
    }

    public static final class DocMeta extends Message<DocMeta, C19003a> {
        public static final ProtoAdapter<DocMeta> ADAPTER = new C19004b();
        public static final Doc.Type DEFAULT_DOC_TYPE = Doc.Type.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final String anchor_url;
        public final Doc.Type doc_type;

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$DocMeta$b */
        private static final class C19004b extends ProtoAdapter<DocMeta> {
            C19004b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(DocMeta docMeta) {
                int i;
                int i2 = 0;
                if (docMeta.anchor_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, docMeta.anchor_url);
                } else {
                    i = 0;
                }
                if (docMeta.doc_type != null) {
                    i2 = Doc.Type.ADAPTER.encodedSizeWithTag(2, docMeta.doc_type);
                }
                return i + i2 + docMeta.unknownFields().size();
            }

            /* renamed from: a */
            public DocMeta decode(ProtoReader protoReader) throws IOException {
                C19003a aVar = new C19003a();
                aVar.f46995a = "";
                aVar.f46996b = Doc.Type.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f46995a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f46996b = Doc.Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocMeta docMeta) throws IOException {
                if (docMeta.anchor_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docMeta.anchor_url);
                }
                if (docMeta.doc_type != null) {
                    Doc.Type.ADAPTER.encodeWithTag(protoWriter, 2, docMeta.doc_type);
                }
                protoWriter.writeBytes(docMeta.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$DocMeta$a */
        public static final class C19003a extends Message.Builder<DocMeta, C19003a> {

            /* renamed from: a */
            public String f46995a;

            /* renamed from: b */
            public Doc.Type f46996b;

            /* renamed from: a */
            public DocMeta build() {
                return new DocMeta(this.f46995a, this.f46996b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19003a newBuilder() {
            C19003a aVar = new C19003a();
            aVar.f46995a = this.anchor_url;
            aVar.f46996b = this.doc_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "DocMeta");
            StringBuilder sb = new StringBuilder();
            if (this.anchor_url != null) {
                sb.append(", anchor_url=");
                sb.append(this.anchor_url);
            }
            if (this.doc_type != null) {
                sb.append(", doc_type=");
                sb.append(this.doc_type);
            }
            StringBuilder replace = sb.replace(0, 2, "DocMeta{");
            replace.append('}');
            return replace.toString();
        }

        public DocMeta(String str, Doc.Type type) {
            this(str, type, ByteString.EMPTY);
        }

        public DocMeta(String str, Doc.Type type, ByteString byteString) {
            super(ADAPTER, byteString);
            this.anchor_url = str;
            this.doc_type = type;
        }
    }

    public static final class OncallMeta extends Message<OncallMeta, C19005a> {
        public static final ProtoAdapter<OncallMeta> ADAPTER = new C19006b();
        private static final long serialVersionUID = 0;
        public final String faq_identity;

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$OncallMeta$b */
        private static final class C19006b extends ProtoAdapter<OncallMeta> {
            C19006b() {
                super(FieldEncoding.LENGTH_DELIMITED, OncallMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(OncallMeta oncallMeta) {
                int i;
                if (oncallMeta.faq_identity != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(2, oncallMeta.faq_identity);
                } else {
                    i = 0;
                }
                return i + oncallMeta.unknownFields().size();
            }

            /* renamed from: a */
            public OncallMeta decode(ProtoReader protoReader) throws IOException {
                C19005a aVar = new C19005a();
                aVar.f46997a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46997a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OncallMeta oncallMeta) throws IOException {
                if (oncallMeta.faq_identity != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, oncallMeta.faq_identity);
                }
                protoWriter.writeBytes(oncallMeta.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$OncallMeta$a */
        public static final class C19005a extends Message.Builder<OncallMeta, C19005a> {

            /* renamed from: a */
            public String f46997a;

            /* renamed from: a */
            public OncallMeta build() {
                return new OncallMeta(this.f46997a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19005a newBuilder() {
            C19005a aVar = new C19005a();
            aVar.f46997a = this.faq_identity;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "OncallMeta");
            StringBuilder sb = new StringBuilder();
            if (this.faq_identity != null) {
                sb.append(", faq_identity=");
                sb.append(this.faq_identity);
            }
            StringBuilder replace = sb.replace(0, 2, "OncallMeta{");
            replace.append('}');
            return replace.toString();
        }

        public OncallMeta(String str) {
            this(str, ByteString.EMPTY);
        }

        public OncallMeta(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.faq_identity = str;
        }
    }

    public static final class SourceMeta extends Message<SourceMeta, C19007a> {
        public static final ProtoAdapter<SourceMeta> ADAPTER = new C19008b();
        private static final long serialVersionUID = 0;
        public final AppMeta app_meta;
        public final DocMeta doc_meta;
        public final OncallMeta oncall_meta;
        public final WikiMeta wiki_meta;

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$SourceMeta$b */
        private static final class C19008b extends ProtoAdapter<SourceMeta> {
            C19008b() {
                super(FieldEncoding.LENGTH_DELIMITED, SourceMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(SourceMeta sourceMeta) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (sourceMeta.oncall_meta != null) {
                    i = OncallMeta.ADAPTER.encodedSizeWithTag(1, sourceMeta.oncall_meta);
                } else {
                    i = 0;
                }
                if (sourceMeta.doc_meta != null) {
                    i2 = DocMeta.ADAPTER.encodedSizeWithTag(2, sourceMeta.doc_meta);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (sourceMeta.app_meta != null) {
                    i3 = AppMeta.ADAPTER.encodedSizeWithTag(3, sourceMeta.app_meta);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (sourceMeta.wiki_meta != null) {
                    i4 = WikiMeta.ADAPTER.encodedSizeWithTag(4, sourceMeta.wiki_meta);
                }
                return i6 + i4 + sourceMeta.unknownFields().size();
            }

            /* renamed from: a */
            public SourceMeta decode(ProtoReader protoReader) throws IOException {
                C19007a aVar = new C19007a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo65074a(OncallMeta.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.mo65073a(DocMeta.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.mo65072a(AppMeta.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo65075a(WikiMeta.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SourceMeta sourceMeta) throws IOException {
                if (sourceMeta.oncall_meta != null) {
                    OncallMeta.ADAPTER.encodeWithTag(protoWriter, 1, sourceMeta.oncall_meta);
                }
                if (sourceMeta.doc_meta != null) {
                    DocMeta.ADAPTER.encodeWithTag(protoWriter, 2, sourceMeta.doc_meta);
                }
                if (sourceMeta.app_meta != null) {
                    AppMeta.ADAPTER.encodeWithTag(protoWriter, 3, sourceMeta.app_meta);
                }
                if (sourceMeta.wiki_meta != null) {
                    WikiMeta.ADAPTER.encodeWithTag(protoWriter, 4, sourceMeta.wiki_meta);
                }
                protoWriter.writeBytes(sourceMeta.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19007a newBuilder() {
            C19007a aVar = new C19007a();
            aVar.f46998a = this.oncall_meta;
            aVar.f46999b = this.doc_meta;
            aVar.f47000c = this.app_meta;
            aVar.f47001d = this.wiki_meta;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SourceMeta");
            StringBuilder sb = new StringBuilder();
            if (this.oncall_meta != null) {
                sb.append(", oncall_meta=");
                sb.append(this.oncall_meta);
            }
            if (this.doc_meta != null) {
                sb.append(", doc_meta=");
                sb.append(this.doc_meta);
            }
            if (this.app_meta != null) {
                sb.append(", app_meta=");
                sb.append(this.app_meta);
            }
            if (this.wiki_meta != null) {
                sb.append(", wiki_meta=");
                sb.append(this.wiki_meta);
            }
            StringBuilder replace = sb.replace(0, 2, "SourceMeta{");
            replace.append('}');
            return replace.toString();
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$SourceMeta$a */
        public static final class C19007a extends Message.Builder<SourceMeta, C19007a> {

            /* renamed from: a */
            public OncallMeta f46998a;

            /* renamed from: b */
            public DocMeta f46999b;

            /* renamed from: c */
            public AppMeta f47000c;

            /* renamed from: d */
            public WikiMeta f47001d;

            /* renamed from: a */
            public SourceMeta build() {
                return new SourceMeta(this.f46998a, this.f46999b, this.f47000c, this.f47001d, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19007a mo65072a(AppMeta appMeta) {
                this.f47000c = appMeta;
                this.f46998a = null;
                this.f46999b = null;
                this.f47001d = null;
                return this;
            }

            /* renamed from: a */
            public C19007a mo65073a(DocMeta docMeta) {
                this.f46999b = docMeta;
                this.f46998a = null;
                this.f47000c = null;
                this.f47001d = null;
                return this;
            }

            /* renamed from: a */
            public C19007a mo65074a(OncallMeta oncallMeta) {
                this.f46998a = oncallMeta;
                this.f46999b = null;
                this.f47000c = null;
                this.f47001d = null;
                return this;
            }

            /* renamed from: a */
            public C19007a mo65075a(WikiMeta wikiMeta) {
                this.f47001d = wikiMeta;
                this.f46998a = null;
                this.f46999b = null;
                this.f47000c = null;
                return this;
            }
        }

        public SourceMeta(OncallMeta oncallMeta, DocMeta docMeta, AppMeta appMeta, WikiMeta wikiMeta) {
            this(oncallMeta, docMeta, appMeta, wikiMeta, ByteString.EMPTY);
        }

        public SourceMeta(OncallMeta oncallMeta, DocMeta docMeta, AppMeta appMeta, WikiMeta wikiMeta, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(oncallMeta, docMeta, appMeta, wikiMeta, new Object[0]) <= 1) {
                this.oncall_meta = oncallMeta;
                this.doc_meta = docMeta;
                this.app_meta = appMeta;
                this.wiki_meta = wikiMeta;
                return;
            }
            throw new IllegalArgumentException("at most one of oncall_meta, doc_meta, app_meta, wiki_meta may be non-null");
        }
    }

    public static final class WikiMeta extends Message<WikiMeta, C19009a> {
        public static final ProtoAdapter<WikiMeta> ADAPTER = new C19010b();
        private static final long serialVersionUID = 0;
        public final String anchor_url;

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$WikiMeta$b */
        private static final class C19010b extends ProtoAdapter<WikiMeta> {
            C19010b() {
                super(FieldEncoding.LENGTH_DELIMITED, WikiMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(WikiMeta wikiMeta) {
                int i;
                if (wikiMeta.anchor_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, wikiMeta.anchor_url);
                } else {
                    i = 0;
                }
                return i + wikiMeta.unknownFields().size();
            }

            /* renamed from: a */
            public WikiMeta decode(ProtoReader protoReader) throws IOException {
                C19009a aVar = new C19009a();
                aVar.f47002a = "";
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
                        aVar.f47002a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, WikiMeta wikiMeta) throws IOException {
                if (wikiMeta.anchor_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, wikiMeta.anchor_url);
                }
                protoWriter.writeBytes(wikiMeta.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$WikiMeta$a */
        public static final class C19009a extends Message.Builder<WikiMeta, C19009a> {

            /* renamed from: a */
            public String f47002a;

            /* renamed from: a */
            public WikiMeta build() {
                return new WikiMeta(this.f47002a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19009a newBuilder() {
            C19009a aVar = new C19009a();
            aVar.f47002a = this.anchor_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "WikiMeta");
            StringBuilder sb = new StringBuilder();
            if (this.anchor_url != null) {
                sb.append(", anchor_url=");
                sb.append(this.anchor_url);
            }
            StringBuilder replace = sb.replace(0, 2, "WikiMeta{");
            replace.append('}');
            return replace.toString();
        }

        public WikiMeta(String str) {
            this(str, ByteString.EMPTY);
        }

        public WikiMeta(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.anchor_url = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$b */
    private static final class C19012b extends ProtoAdapter<QaCardMeta> {
        C19012b() {
            super(FieldEncoding.LENGTH_DELIMITED, QaCardMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(QaCardMeta qaCardMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, qaCardMeta.id);
            int i9 = 0;
            if (qaCardMeta.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, qaCardMeta.name);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (qaCardMeta.source_type != null) {
                i2 = SourceType.ADAPTER.encodedSizeWithTag(4, qaCardMeta.source_type);
            } else {
                i2 = 0;
            }
            int i11 = i10 + i2;
            if (qaCardMeta.source_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, qaCardMeta.source_id);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (qaCardMeta.source_url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, qaCardMeta.source_url);
            } else {
                i4 = 0;
            }
            int i13 = i12 + i4;
            if (qaCardMeta.category_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, qaCardMeta.category_name);
            } else {
                i5 = 0;
            }
            int i14 = i13 + i5;
            if (qaCardMeta.category_desc != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(9, qaCardMeta.category_desc);
            } else {
                i6 = 0;
            }
            int i15 = i14 + i6;
            if (qaCardMeta.update_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(10, qaCardMeta.update_time);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag2 = i15 + i7 + SourceMeta.ADAPTER.encodedSizeWithTag(11, qaCardMeta.source_meta);
            if (qaCardMeta.content_avatar_key != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(12, qaCardMeta.content_avatar_key);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + i8 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(13, qaCardMeta.recommended_questions);
            if (qaCardMeta.qa_render_meta != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(14, qaCardMeta.qa_render_meta);
            }
            return encodedSizeWithTag3 + i9 + qaCardMeta.unknownFields().size();
        }

        /* renamed from: a */
        public QaCardMeta decode(ProtoReader protoReader) throws IOException {
            C19011a aVar = new C19011a();
            aVar.f47003a = "";
            aVar.f47004b = "";
            aVar.f47005c = SourceType.UNKNOWN_SOURCE;
            aVar.f47006d = "";
            aVar.f47007e = "";
            aVar.f47008f = "";
            aVar.f47009g = "";
            aVar.f47010h = 0L;
            aVar.f47012j = "";
            aVar.f47014l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47003a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47004b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                        case 6:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 4:
                            try {
                                aVar.f47005c = SourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f47006d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47007e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47008f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47009g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47010h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47011i = SourceMeta.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f47012j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                            aVar.f47013k.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            aVar.f47014l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QaCardMeta qaCardMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, qaCardMeta.id);
            if (qaCardMeta.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, qaCardMeta.name);
            }
            if (qaCardMeta.source_type != null) {
                SourceType.ADAPTER.encodeWithTag(protoWriter, 4, qaCardMeta.source_type);
            }
            if (qaCardMeta.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, qaCardMeta.source_id);
            }
            if (qaCardMeta.source_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, qaCardMeta.source_url);
            }
            if (qaCardMeta.category_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, qaCardMeta.category_name);
            }
            if (qaCardMeta.category_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, qaCardMeta.category_desc);
            }
            if (qaCardMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, qaCardMeta.update_time);
            }
            SourceMeta.ADAPTER.encodeWithTag(protoWriter, 11, qaCardMeta.source_meta);
            if (qaCardMeta.content_avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, qaCardMeta.content_avatar_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 13, qaCardMeta.recommended_questions);
            if (qaCardMeta.qa_render_meta != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, qaCardMeta.qa_render_meta);
            }
            protoWriter.writeBytes(qaCardMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.QaCardMeta$a */
    public static final class C19011a extends Message.Builder<QaCardMeta, C19011a> {

        /* renamed from: a */
        public String f47003a;

        /* renamed from: b */
        public String f47004b;

        /* renamed from: c */
        public SourceType f47005c;

        /* renamed from: d */
        public String f47006d;

        /* renamed from: e */
        public String f47007e;

        /* renamed from: f */
        public String f47008f;

        /* renamed from: g */
        public String f47009g;

        /* renamed from: h */
        public Long f47010h;

        /* renamed from: i */
        public SourceMeta f47011i;

        /* renamed from: j */
        public String f47012j;

        /* renamed from: k */
        public List<String> f47013k = Internal.newMutableList();

        /* renamed from: l */
        public String f47014l;

        /* renamed from: a */
        public QaCardMeta build() {
            SourceMeta sourceMeta;
            String str = this.f47003a;
            if (str != null && (sourceMeta = this.f47011i) != null) {
                return new QaCardMeta(str, this.f47004b, this.f47005c, this.f47006d, this.f47007e, this.f47008f, this.f47009g, this.f47010h, sourceMeta, this.f47012j, this.f47013k, this.f47014l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f47011i, "source_meta");
        }
    }

    @Override // com.squareup.wire.Message
    public C19011a newBuilder() {
        C19011a aVar = new C19011a();
        aVar.f47003a = this.id;
        aVar.f47004b = this.name;
        aVar.f47005c = this.source_type;
        aVar.f47006d = this.source_id;
        aVar.f47007e = this.source_url;
        aVar.f47008f = this.category_name;
        aVar.f47009g = this.category_desc;
        aVar.f47010h = this.update_time;
        aVar.f47011i = this.source_meta;
        aVar.f47012j = this.content_avatar_key;
        aVar.f47013k = Internal.copyOf("recommended_questions", this.recommended_questions);
        aVar.f47014l = this.qa_render_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "QaCardMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.source_url != null) {
            sb.append(", source_url=");
            sb.append(this.source_url);
        }
        if (this.category_name != null) {
            sb.append(", category_name=");
            sb.append(this.category_name);
        }
        if (this.category_desc != null) {
            sb.append(", category_desc=");
            sb.append(this.category_desc);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        sb.append(", source_meta=");
        sb.append(this.source_meta);
        if (this.content_avatar_key != null) {
            sb.append(", content_avatar_key=");
            sb.append(this.content_avatar_key);
        }
        if (!this.recommended_questions.isEmpty()) {
            sb.append(", recommended_questions=");
            sb.append(this.recommended_questions);
        }
        if (this.qa_render_meta != null) {
            sb.append(", qa_render_meta=");
            sb.append(this.qa_render_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "QaCardMeta{");
        replace.append('}');
        return replace.toString();
    }

    public QaCardMeta(String str, String str2, SourceType sourceType, String str3, String str4, String str5, String str6, Long l, SourceMeta sourceMeta, String str7, List<String> list, String str8) {
        this(str, str2, sourceType, str3, str4, str5, str6, l, sourceMeta, str7, list, str8, ByteString.EMPTY);
    }

    public QaCardMeta(String str, String str2, SourceType sourceType, String str3, String str4, String str5, String str6, Long l, SourceMeta sourceMeta, String str7, List<String> list, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.source_type = sourceType;
        this.source_id = str3;
        this.source_url = str4;
        this.category_name = str5;
        this.category_desc = str6;
        this.update_time = l;
        this.source_meta = sourceMeta;
        this.content_avatar_key = str7;
        this.recommended_questions = Internal.immutableCopyOf("recommended_questions", list);
        this.qa_render_meta = str8;
    }
}
