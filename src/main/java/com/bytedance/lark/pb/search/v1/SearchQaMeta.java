package com.bytedance.lark.pb.search.v1;

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
import okio.ByteString;

public final class SearchQaMeta extends Message<SearchQaMeta, C18909a> {
    public static final ProtoAdapter<SearchQaMeta> ADAPTER = new C18910b();
    public static final Doc.Type DEFAULT_DOC_TYPE = Doc.Type.UNKNOWN;
    public static final SourceType DEFAULT_SOURCE_TYPE = SourceType.UNKNOWN_SOURCE;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String category_desc;
    public final String category_name;
    public final String description;
    public final Doc.Type doc_type;
    public final String faq_id;
    public final String id;
    public final String name;
    public final String source_anchor_url;
    public final String source_id;
    public final SourceType source_type;
    public final String source_url;
    public final Long update_time;
    public final String user_id;

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

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchQaMeta$b */
    private static final class C18910b extends ProtoAdapter<SearchQaMeta> {
        C18910b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchQaMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchQaMeta searchQaMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchQaMeta.id);
            int i13 = 0;
            if (searchQaMeta.name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, searchQaMeta.name);
            } else {
                i = 0;
            }
            int i14 = encodedSizeWithTag + i;
            if (searchQaMeta.description != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchQaMeta.description);
            } else {
                i2 = 0;
            }
            int i15 = i14 + i2;
            if (searchQaMeta.source_type != null) {
                i3 = SourceType.ADAPTER.encodedSizeWithTag(4, searchQaMeta.source_type);
            } else {
                i3 = 0;
            }
            int i16 = i15 + i3;
            if (searchQaMeta.source_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchQaMeta.source_id);
            } else {
                i4 = 0;
            }
            int i17 = i16 + i4;
            if (searchQaMeta.faq_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, searchQaMeta.faq_id);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (searchQaMeta.source_url != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, searchQaMeta.source_url);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (searchQaMeta.category_name != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, searchQaMeta.category_name);
            } else {
                i7 = 0;
            }
            int i20 = i19 + i7;
            if (searchQaMeta.category_desc != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, searchQaMeta.category_desc);
            } else {
                i8 = 0;
            }
            int i21 = i20 + i8;
            if (searchQaMeta.update_time != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(10, searchQaMeta.update_time);
            } else {
                i9 = 0;
            }
            int i22 = i21 + i9;
            if (searchQaMeta.avatar_key != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, searchQaMeta.avatar_key);
            } else {
                i10 = 0;
            }
            int i23 = i22 + i10;
            if (searchQaMeta.user_id != null) {
                i11 = ProtoAdapter.STRING.encodedSizeWithTag(12, searchQaMeta.user_id);
            } else {
                i11 = 0;
            }
            int i24 = i23 + i11;
            if (searchQaMeta.source_anchor_url != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(14, searchQaMeta.source_anchor_url);
            } else {
                i12 = 0;
            }
            int i25 = i24 + i12;
            if (searchQaMeta.doc_type != null) {
                i13 = Doc.Type.ADAPTER.encodedSizeWithTag(15, searchQaMeta.doc_type);
            }
            return i25 + i13 + searchQaMeta.unknownFields().size();
        }

        /* renamed from: a */
        public SearchQaMeta decode(ProtoReader protoReader) throws IOException {
            C18909a aVar = new C18909a();
            aVar.f46752a = "";
            aVar.f46753b = "";
            aVar.f46754c = "";
            aVar.f46755d = SourceType.UNKNOWN_SOURCE;
            aVar.f46756e = "";
            aVar.f46757f = "";
            aVar.f46758g = "";
            aVar.f46759h = "";
            aVar.f46760i = "";
            aVar.f46761j = 0L;
            aVar.f46762k = "";
            aVar.f46763l = "";
            aVar.f46764m = "";
            aVar.f46765n = Doc.Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46752a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46753b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46754c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f46755d = SourceType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f46756e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46757f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f46758g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f46759h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f46760i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f46761j = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 11:
                            aVar.f46762k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f46763l = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 13:
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 14:
                            aVar.f46764m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            try {
                                aVar.f46765n = Doc.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SearchQaMeta searchQaMeta) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchQaMeta.id);
            if (searchQaMeta.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, searchQaMeta.name);
            }
            if (searchQaMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchQaMeta.description);
            }
            if (searchQaMeta.source_type != null) {
                SourceType.ADAPTER.encodeWithTag(protoWriter, 4, searchQaMeta.source_type);
            }
            if (searchQaMeta.source_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchQaMeta.source_id);
            }
            if (searchQaMeta.faq_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, searchQaMeta.faq_id);
            }
            if (searchQaMeta.source_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchQaMeta.source_url);
            }
            if (searchQaMeta.category_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, searchQaMeta.category_name);
            }
            if (searchQaMeta.category_desc != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, searchQaMeta.category_desc);
            }
            if (searchQaMeta.update_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, searchQaMeta.update_time);
            }
            if (searchQaMeta.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, searchQaMeta.avatar_key);
            }
            if (searchQaMeta.user_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, searchQaMeta.user_id);
            }
            if (searchQaMeta.source_anchor_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, searchQaMeta.source_anchor_url);
            }
            if (searchQaMeta.doc_type != null) {
                Doc.Type.ADAPTER.encodeWithTag(protoWriter, 15, searchQaMeta.doc_type);
            }
            protoWriter.writeBytes(searchQaMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchQaMeta$a */
    public static final class C18909a extends Message.Builder<SearchQaMeta, C18909a> {

        /* renamed from: a */
        public String f46752a;

        /* renamed from: b */
        public String f46753b;

        /* renamed from: c */
        public String f46754c;

        /* renamed from: d */
        public SourceType f46755d;

        /* renamed from: e */
        public String f46756e;

        /* renamed from: f */
        public String f46757f;

        /* renamed from: g */
        public String f46758g;

        /* renamed from: h */
        public String f46759h;

        /* renamed from: i */
        public String f46760i;

        /* renamed from: j */
        public Long f46761j;

        /* renamed from: k */
        public String f46762k;

        /* renamed from: l */
        public String f46763l;

        /* renamed from: m */
        public String f46764m;

        /* renamed from: n */
        public Doc.Type f46765n;

        /* renamed from: a */
        public SearchQaMeta build() {
            String str = this.f46752a;
            if (str != null) {
                return new SearchQaMeta(str, this.f46753b, this.f46754c, this.f46755d, this.f46756e, this.f46757f, this.f46758g, this.f46759h, this.f46760i, this.f46761j, this.f46762k, this.f46763l, this.f46764m, this.f46765n, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public C18909a newBuilder() {
        C18909a aVar = new C18909a();
        aVar.f46752a = this.id;
        aVar.f46753b = this.name;
        aVar.f46754c = this.description;
        aVar.f46755d = this.source_type;
        aVar.f46756e = this.source_id;
        aVar.f46757f = this.faq_id;
        aVar.f46758g = this.source_url;
        aVar.f46759h = this.category_name;
        aVar.f46760i = this.category_desc;
        aVar.f46761j = this.update_time;
        aVar.f46762k = this.avatar_key;
        aVar.f46763l = this.user_id;
        aVar.f46764m = this.source_anchor_url;
        aVar.f46765n = this.doc_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchQaMeta");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.source_type != null) {
            sb.append(", source_type=");
            sb.append(this.source_type);
        }
        if (this.source_id != null) {
            sb.append(", source_id=");
            sb.append(this.source_id);
        }
        if (this.faq_id != null) {
            sb.append(", faq_id=");
            sb.append(this.faq_id);
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
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.source_anchor_url != null) {
            sb.append(", source_anchor_url=");
            sb.append(this.source_anchor_url);
        }
        if (this.doc_type != null) {
            sb.append(", doc_type=");
            sb.append(this.doc_type);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchQaMeta{");
        replace.append('}');
        return replace.toString();
    }

    public SearchQaMeta(String str, String str2, String str3, SourceType sourceType, String str4, String str5, String str6, String str7, String str8, Long l, String str9, String str10, String str11, Doc.Type type) {
        this(str, str2, str3, sourceType, str4, str5, str6, str7, str8, l, str9, str10, str11, type, ByteString.EMPTY);
    }

    public SearchQaMeta(String str, String str2, String str3, SourceType sourceType, String str4, String str5, String str6, String str7, String str8, Long l, String str9, String str10, String str11, Doc.Type type, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.source_type = sourceType;
        this.source_id = str4;
        this.faq_id = str5;
        this.source_url = str6;
        this.category_name = str7;
        this.category_desc = str8;
        this.update_time = l;
        this.avatar_key = str9;
        this.user_id = str10;
        this.source_anchor_url = str11;
        this.doc_type = type;
    }
}
