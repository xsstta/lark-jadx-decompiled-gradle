package com.ss.android.lark.pb.usearch;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.DocType;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class QACardMeta extends Message<QACardMeta, C50230a> {
    public static final ProtoAdapter<QACardMeta> ADAPTER = new C50231b();
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String mcategory_desc;
    public final String mcategory_name;
    public final String mcontent_avatar_key;
    public final String mid;
    public final String mname;
    public final String mqa_render_meta;
    public final List<String> mrecommended_questions;
    public final String msource_id;
    public final SourceMeta msource_meta;
    public final SourceType msource_type;
    public final String msource_url;
    public final Long mupdate_time;

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

    public static final class AppMeta extends Message<AppMeta, C50220a> {
        public static final ProtoAdapter<AppMeta> ADAPTER = new C50221b();
        private static final long serialVersionUID = 0;
        public final String muser_id;

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$AppMeta$b */
        private static final class C50221b extends ProtoAdapter<AppMeta> {
            C50221b() {
                super(FieldEncoding.LENGTH_DELIMITED, AppMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(AppMeta appMeta) {
                int i;
                if (appMeta.muser_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, appMeta.muser_id);
                } else {
                    i = 0;
                }
                return i + appMeta.unknownFields().size();
            }

            /* renamed from: a */
            public AppMeta decode(ProtoReader protoReader) throws IOException {
                C50220a aVar = new C50220a();
                aVar.f125486a = "";
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
                        aVar.f125486a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, AppMeta appMeta) throws IOException {
                if (appMeta.muser_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appMeta.muser_id);
                }
                protoWriter.writeBytes(appMeta.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$AppMeta$a */
        public static final class C50220a extends Message.Builder<AppMeta, C50220a> {

            /* renamed from: a */
            public String f125486a;

            /* renamed from: a */
            public AppMeta build() {
                return new AppMeta(this.f125486a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50220a newBuilder() {
            C50220a aVar = new C50220a();
            aVar.f125486a = this.muser_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.muser_id != null) {
                sb.append(", user_id=");
                sb.append(this.muser_id);
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
            this.muser_id = str;
        }
    }

    public static final class DocMeta extends Message<DocMeta, C50222a> {
        public static final ProtoAdapter<DocMeta> ADAPTER = new C50223b();
        private static final long serialVersionUID = 0;
        public final String manchor_url;
        public final DocType mdoc_type;

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$DocMeta$b */
        private static final class C50223b extends ProtoAdapter<DocMeta> {
            C50223b() {
                super(FieldEncoding.LENGTH_DELIMITED, DocMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(DocMeta docMeta) {
                int i;
                int i2 = 0;
                if (docMeta.manchor_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, docMeta.manchor_url);
                } else {
                    i = 0;
                }
                if (docMeta.mdoc_type != null) {
                    i2 = DocType.ADAPTER.encodedSizeWithTag(2, docMeta.mdoc_type);
                }
                return i + i2 + docMeta.unknownFields().size();
            }

            /* renamed from: a */
            public DocMeta decode(ProtoReader protoReader) throws IOException {
                C50222a aVar = new C50222a();
                aVar.f125487a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125487a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f125488b = DocType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, DocMeta docMeta) throws IOException {
                if (docMeta.manchor_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, docMeta.manchor_url);
                }
                if (docMeta.mdoc_type != null) {
                    DocType.ADAPTER.encodeWithTag(protoWriter, 2, docMeta.mdoc_type);
                }
                protoWriter.writeBytes(docMeta.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$DocMeta$a */
        public static final class C50222a extends Message.Builder<DocMeta, C50222a> {

            /* renamed from: a */
            public String f125487a;

            /* renamed from: b */
            public DocType f125488b;

            /* renamed from: a */
            public DocMeta build() {
                return new DocMeta(this.f125487a, this.f125488b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50222a newBuilder() {
            C50222a aVar = new C50222a();
            aVar.f125487a = this.manchor_url;
            aVar.f125488b = this.mdoc_type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.manchor_url != null) {
                sb.append(", anchor_url=");
                sb.append(this.manchor_url);
            }
            if (this.mdoc_type != null) {
                sb.append(", doc_type=");
                sb.append(this.mdoc_type);
            }
            StringBuilder replace = sb.replace(0, 2, "DocMeta{");
            replace.append('}');
            return replace.toString();
        }

        public DocMeta(String str, DocType docType) {
            this(str, docType, ByteString.EMPTY);
        }

        public DocMeta(String str, DocType docType, ByteString byteString) {
            super(ADAPTER, byteString);
            this.manchor_url = str;
            this.mdoc_type = docType;
        }
    }

    public static final class OncallMeta extends Message<OncallMeta, C50224a> {
        public static final ProtoAdapter<OncallMeta> ADAPTER = new C50225b();
        private static final long serialVersionUID = 0;
        public final String mfaq_id;

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$OncallMeta$b */
        private static final class C50225b extends ProtoAdapter<OncallMeta> {
            C50225b() {
                super(FieldEncoding.LENGTH_DELIMITED, OncallMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(OncallMeta oncallMeta) {
                int i;
                if (oncallMeta.mfaq_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, oncallMeta.mfaq_id);
                } else {
                    i = 0;
                }
                return i + oncallMeta.unknownFields().size();
            }

            /* renamed from: a */
            public OncallMeta decode(ProtoReader protoReader) throws IOException {
                C50224a aVar = new C50224a();
                aVar.f125489a = "";
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
                        aVar.f125489a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OncallMeta oncallMeta) throws IOException {
                if (oncallMeta.mfaq_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, oncallMeta.mfaq_id);
                }
                protoWriter.writeBytes(oncallMeta.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$OncallMeta$a */
        public static final class C50224a extends Message.Builder<OncallMeta, C50224a> {

            /* renamed from: a */
            public String f125489a;

            /* renamed from: a */
            public OncallMeta build() {
                return new OncallMeta(this.f125489a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50224a newBuilder() {
            C50224a aVar = new C50224a();
            aVar.f125489a = this.mfaq_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mfaq_id != null) {
                sb.append(", faq_id=");
                sb.append(this.mfaq_id);
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
            this.mfaq_id = str;
        }
    }

    public static final class SourceMeta extends Message<SourceMeta, C50226a> {
        public static final ProtoAdapter<SourceMeta> ADAPTER = new C50227b();
        private static final long serialVersionUID = 0;
        public final AppMeta mapp_meta;
        public final DocMeta mdoc_meta;
        public final OncallMeta moncall_meta;
        public final WikiMeta mwiki_meta;

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$SourceMeta$b */
        private static final class C50227b extends ProtoAdapter<SourceMeta> {
            C50227b() {
                super(FieldEncoding.LENGTH_DELIMITED, SourceMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(SourceMeta sourceMeta) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (sourceMeta.moncall_meta != null) {
                    i = OncallMeta.ADAPTER.encodedSizeWithTag(1, sourceMeta.moncall_meta);
                } else {
                    i = 0;
                }
                if (sourceMeta.mdoc_meta != null) {
                    i2 = DocMeta.ADAPTER.encodedSizeWithTag(2, sourceMeta.mdoc_meta);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (sourceMeta.mapp_meta != null) {
                    i3 = AppMeta.ADAPTER.encodedSizeWithTag(3, sourceMeta.mapp_meta);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (sourceMeta.mwiki_meta != null) {
                    i4 = WikiMeta.ADAPTER.encodedSizeWithTag(4, sourceMeta.mwiki_meta);
                }
                return i6 + i4 + sourceMeta.unknownFields().size();
            }

            /* renamed from: a */
            public SourceMeta decode(ProtoReader protoReader) throws IOException {
                C50226a aVar = new C50226a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.mo174297a(OncallMeta.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        aVar.mo174296a(DocMeta.ADAPTER.decode(protoReader));
                    } else if (nextTag == 3) {
                        aVar.mo174295a(AppMeta.ADAPTER.decode(protoReader));
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.mo174298a(WikiMeta.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SourceMeta sourceMeta) throws IOException {
                if (sourceMeta.moncall_meta != null) {
                    OncallMeta.ADAPTER.encodeWithTag(protoWriter, 1, sourceMeta.moncall_meta);
                }
                if (sourceMeta.mdoc_meta != null) {
                    DocMeta.ADAPTER.encodeWithTag(protoWriter, 2, sourceMeta.mdoc_meta);
                }
                if (sourceMeta.mapp_meta != null) {
                    AppMeta.ADAPTER.encodeWithTag(protoWriter, 3, sourceMeta.mapp_meta);
                }
                if (sourceMeta.mwiki_meta != null) {
                    WikiMeta.ADAPTER.encodeWithTag(protoWriter, 4, sourceMeta.mwiki_meta);
                }
                protoWriter.writeBytes(sourceMeta.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50226a newBuilder() {
            C50226a aVar = new C50226a();
            aVar.f125490a = this.moncall_meta;
            aVar.f125491b = this.mdoc_meta;
            aVar.f125492c = this.mapp_meta;
            aVar.f125493d = this.mwiki_meta;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.moncall_meta != null) {
                sb.append(", oncall_meta=");
                sb.append(this.moncall_meta);
            }
            if (this.mdoc_meta != null) {
                sb.append(", doc_meta=");
                sb.append(this.mdoc_meta);
            }
            if (this.mapp_meta != null) {
                sb.append(", app_meta=");
                sb.append(this.mapp_meta);
            }
            if (this.mwiki_meta != null) {
                sb.append(", wiki_meta=");
                sb.append(this.mwiki_meta);
            }
            StringBuilder replace = sb.replace(0, 2, "SourceMeta{");
            replace.append('}');
            return replace.toString();
        }

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$SourceMeta$a */
        public static final class C50226a extends Message.Builder<SourceMeta, C50226a> {

            /* renamed from: a */
            public OncallMeta f125490a;

            /* renamed from: b */
            public DocMeta f125491b;

            /* renamed from: c */
            public AppMeta f125492c;

            /* renamed from: d */
            public WikiMeta f125493d;

            /* renamed from: a */
            public SourceMeta build() {
                return new SourceMeta(this.f125490a, this.f125491b, this.f125492c, this.f125493d, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C50226a mo174295a(AppMeta appMeta) {
                this.f125492c = appMeta;
                this.f125490a = null;
                this.f125491b = null;
                this.f125493d = null;
                return this;
            }

            /* renamed from: a */
            public C50226a mo174296a(DocMeta docMeta) {
                this.f125491b = docMeta;
                this.f125490a = null;
                this.f125492c = null;
                this.f125493d = null;
                return this;
            }

            /* renamed from: a */
            public C50226a mo174297a(OncallMeta oncallMeta) {
                this.f125490a = oncallMeta;
                this.f125491b = null;
                this.f125492c = null;
                this.f125493d = null;
                return this;
            }

            /* renamed from: a */
            public C50226a mo174298a(WikiMeta wikiMeta) {
                this.f125493d = wikiMeta;
                this.f125490a = null;
                this.f125491b = null;
                this.f125492c = null;
                return this;
            }
        }

        public SourceMeta(OncallMeta oncallMeta, DocMeta docMeta, AppMeta appMeta, WikiMeta wikiMeta) {
            this(oncallMeta, docMeta, appMeta, wikiMeta, ByteString.EMPTY);
        }

        public SourceMeta(OncallMeta oncallMeta, DocMeta docMeta, AppMeta appMeta, WikiMeta wikiMeta, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(oncallMeta, docMeta, appMeta, wikiMeta, new Object[0]) <= 1) {
                this.moncall_meta = oncallMeta;
                this.mdoc_meta = docMeta;
                this.mapp_meta = appMeta;
                this.mwiki_meta = wikiMeta;
                return;
            }
            throw new IllegalArgumentException("at most one of moncall_meta, mdoc_meta, mapp_meta, mwiki_meta may be non-null");
        }
    }

    public static final class WikiMeta extends Message<WikiMeta, C50228a> {
        public static final ProtoAdapter<WikiMeta> ADAPTER = new C50229b();
        private static final long serialVersionUID = 0;
        public final String manchor_url;

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$WikiMeta$b */
        private static final class C50229b extends ProtoAdapter<WikiMeta> {
            C50229b() {
                super(FieldEncoding.LENGTH_DELIMITED, WikiMeta.class);
            }

            /* renamed from: a */
            public int encodedSize(WikiMeta wikiMeta) {
                int i;
                if (wikiMeta.manchor_url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, wikiMeta.manchor_url);
                } else {
                    i = 0;
                }
                return i + wikiMeta.unknownFields().size();
            }

            /* renamed from: a */
            public WikiMeta decode(ProtoReader protoReader) throws IOException {
                C50228a aVar = new C50228a();
                aVar.f125494a = "";
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
                        aVar.f125494a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, WikiMeta wikiMeta) throws IOException {
                if (wikiMeta.manchor_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, wikiMeta.manchor_url);
                }
                protoWriter.writeBytes(wikiMeta.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$WikiMeta$a */
        public static final class C50228a extends Message.Builder<WikiMeta, C50228a> {

            /* renamed from: a */
            public String f125494a;

            /* renamed from: a */
            public WikiMeta build() {
                return new WikiMeta(this.f125494a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50228a newBuilder() {
            C50228a aVar = new C50228a();
            aVar.f125494a = this.manchor_url;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.manchor_url != null) {
                sb.append(", anchor_url=");
                sb.append(this.manchor_url);
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
            this.manchor_url = str;
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$b */
    private static final class C50231b extends ProtoAdapter<QACardMeta> {
        C50231b() {
            super(FieldEncoding.LENGTH_DELIMITED, QACardMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(QACardMeta qACardMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, qACardMeta.mid);
            int i9 = 0;
            if (qACardMeta.msource_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, qACardMeta.msource_id);
            } else {
                i = 0;
            }
            int i10 = encodedSizeWithTag + i;
            if (qACardMeta.msource_type != null) {
                i2 = SourceType.ADAPTER.encodedSizeWithTag(3, qACardMeta.msource_type);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i10 + i2 + SourceMeta.ADAPTER.encodedSizeWithTag(4, qACardMeta.msource_meta);
            if (qACardMeta.msource_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, qACardMeta.msource_url);
            } else {
                i3 = 0;
            }
            int i11 = encodedSizeWithTag2 + i3;
            if (qACardMeta.mname != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, qACardMeta.mname);
            } else {
                i4 = 0;
            }
            int i12 = i11 + i4;
            if (qACardMeta.mcategory_name != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, qACardMeta.mcategory_name);
            } else {
                i5 = 0;
            }
            int i13 = i12 + i5;
            if (qACardMeta.mcategory_desc != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, qACardMeta.mcategory_desc);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (qACardMeta.mupdate_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(9, qACardMeta.mupdate_time);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (qACardMeta.mcontent_avatar_key != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, qACardMeta.mcontent_avatar_key);
            } else {
                i8 = 0;
            }
            int encodedSizeWithTag3 = i15 + i8 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(11, qACardMeta.mrecommended_questions);
            if (qACardMeta.mqa_render_meta != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(12, qACardMeta.mqa_render_meta);
            }
            return encodedSizeWithTag3 + i9 + qACardMeta.unknownFields().size();
        }

        /* renamed from: a */
        public QACardMeta decode(ProtoReader protoReader) throws IOException {
            C50230a aVar = new C50230a();
            aVar.f125495a = "";
            aVar.f125496b = "";
            aVar.f125499e = "";
            aVar.f125500f = "";
            aVar.f125501g = "";
            aVar.f125502h = "";
            aVar.f125503i = 0L;
            aVar.f125504j = "";
            aVar.f125506l = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125495a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125496b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f125497c = SourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f125498d = SourceMeta.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125499e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125500f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125501g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f125502h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f125503i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f125504j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f125505k.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f125506l = ProtoAdapter.STRING.decode(protoReader);
                            break;
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
        public void encode(ProtoWriter protoWriter, QACardMeta qACardMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, qACardMeta.mid);
            if (qACardMeta.msource_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, qACardMeta.msource_id);
            }
            if (qACardMeta.msource_type != null) {
                SourceType.ADAPTER.encodeWithTag(protoWriter, 3, qACardMeta.msource_type);
            }
            SourceMeta.ADAPTER.encodeWithTag(protoWriter, 4, qACardMeta.msource_meta);
            if (qACardMeta.msource_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, qACardMeta.msource_url);
            }
            if (qACardMeta.mname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, qACardMeta.mname);
            }
            if (qACardMeta.mcategory_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, qACardMeta.mcategory_name);
            }
            if (qACardMeta.mcategory_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, qACardMeta.mcategory_desc);
            }
            if (qACardMeta.mupdate_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, qACardMeta.mupdate_time);
            }
            if (qACardMeta.mcontent_avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, qACardMeta.mcontent_avatar_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 11, qACardMeta.mrecommended_questions);
            if (qACardMeta.mqa_render_meta != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, qACardMeta.mqa_render_meta);
            }
            protoWriter.writeBytes(qACardMeta.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.usearch.QACardMeta$a */
    public static final class C50230a extends Message.Builder<QACardMeta, C50230a> {

        /* renamed from: a */
        public String f125495a;

        /* renamed from: b */
        public String f125496b;

        /* renamed from: c */
        public SourceType f125497c;

        /* renamed from: d */
        public SourceMeta f125498d;

        /* renamed from: e */
        public String f125499e;

        /* renamed from: f */
        public String f125500f;

        /* renamed from: g */
        public String f125501g;

        /* renamed from: h */
        public String f125502h;

        /* renamed from: i */
        public Long f125503i;

        /* renamed from: j */
        public String f125504j;

        /* renamed from: k */
        public List<String> f125505k = Internal.newMutableList();

        /* renamed from: l */
        public String f125506l;

        /* renamed from: a */
        public QACardMeta build() {
            SourceMeta sourceMeta;
            String str = this.f125495a;
            if (str != null && (sourceMeta = this.f125498d) != null) {
                return new QACardMeta(str, this.f125496b, this.f125497c, sourceMeta, this.f125499e, this.f125500f, this.f125501g, this.f125502h, this.f125503i, this.f125504j, this.f125505k, this.f125506l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid", this.f125498d, "msource_meta");
        }
    }

    @Override // com.squareup.wire.Message
    public C50230a newBuilder() {
        C50230a aVar = new C50230a();
        aVar.f125495a = this.mid;
        aVar.f125496b = this.msource_id;
        aVar.f125497c = this.msource_type;
        aVar.f125498d = this.msource_meta;
        aVar.f125499e = this.msource_url;
        aVar.f125500f = this.mname;
        aVar.f125501g = this.mcategory_name;
        aVar.f125502h = this.mcategory_desc;
        aVar.f125503i = this.mupdate_time;
        aVar.f125504j = this.mcontent_avatar_key;
        aVar.f125505k = Internal.copyOf("mrecommended_questions", this.mrecommended_questions);
        aVar.f125506l = this.mqa_render_meta;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        if (this.msource_id != null) {
            sb.append(", source_id=");
            sb.append(this.msource_id);
        }
        if (this.msource_type != null) {
            sb.append(", source_type=");
            sb.append(this.msource_type);
        }
        sb.append(", source_meta=");
        sb.append(this.msource_meta);
        if (this.msource_url != null) {
            sb.append(", source_url=");
            sb.append(this.msource_url);
        }
        if (this.mname != null) {
            sb.append(", name=");
            sb.append(this.mname);
        }
        if (this.mcategory_name != null) {
            sb.append(", category_name=");
            sb.append(this.mcategory_name);
        }
        if (this.mcategory_desc != null) {
            sb.append(", category_desc=");
            sb.append(this.mcategory_desc);
        }
        if (this.mupdate_time != null) {
            sb.append(", update_time=");
            sb.append(this.mupdate_time);
        }
        if (this.mcontent_avatar_key != null) {
            sb.append(", content_avatar_key=");
            sb.append(this.mcontent_avatar_key);
        }
        if (!this.mrecommended_questions.isEmpty()) {
            sb.append(", recommended_questions=");
            sb.append(this.mrecommended_questions);
        }
        if (this.mqa_render_meta != null) {
            sb.append(", qa_render_meta=");
            sb.append(this.mqa_render_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "QACardMeta{");
        replace.append('}');
        return replace.toString();
    }

    public QACardMeta(String str, String str2, SourceType sourceType, SourceMeta sourceMeta, String str3, String str4, String str5, String str6, Long l, String str7, List<String> list, String str8) {
        this(str, str2, sourceType, sourceMeta, str3, str4, str5, str6, l, str7, list, str8, ByteString.EMPTY);
    }

    public QACardMeta(String str, String str2, SourceType sourceType, SourceMeta sourceMeta, String str3, String str4, String str5, String str6, Long l, String str7, List<String> list, String str8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.msource_id = str2;
        this.msource_type = sourceType;
        this.msource_meta = sourceMeta;
        this.msource_url = str3;
        this.mname = str4;
        this.mcategory_name = str5;
        this.mcategory_desc = str6;
        this.mupdate_time = l;
        this.mcontent_avatar_key = str7;
        this.mrecommended_questions = Internal.immutableCopyOf("mrecommended_questions", list);
        this.mqa_render_meta = str8;
    }
}
