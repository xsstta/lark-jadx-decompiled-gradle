package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.VcDocs;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VcQueryDocsRequest extends Message<VcQueryDocsRequest, C51216a> {
    public static final ProtoAdapter<VcQueryDocsRequest> ADAPTER = new C51217b();
    public static final Integer DEFAULT_LIMIT = 0;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final QuerySource DEFAULT_SOURCE = QuerySource.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer limit;
    public final Integer offset;
    public final QueryOpts opts;
    public final String query;
    public final List<VcDocs.DocSubType> query_subtypes;
    public final List<VcDocs.DocType> query_types;
    public final QuerySource source;

    public enum QuerySource implements WireEnum {
        UNKNOWN(0),
        ALL_PAGE(1),
        MAGIC_SHARE_PAGE(2),
        SEARCH_LIST_PAGE(3);
        
        public static final ProtoAdapter<QuerySource> ADAPTER = ProtoAdapter.newEnumAdapter(QuerySource.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static QuerySource fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALL_PAGE;
            }
            if (i == 2) {
                return MAGIC_SHARE_PAGE;
            }
            if (i != 3) {
                return null;
            }
            return SEARCH_LIST_PAGE;
        }

        private QuerySource(int i) {
            this.value = i;
        }
    }

    public static final class QueryOpts extends Message<QueryOpts, C51214a> {
        public static final ProtoAdapter<QueryOpts> ADAPTER = new C51215b();
        public static final Boolean DEFAULT_ONLY_SUPPORT_MS = false;
        public static final Boolean DEFAULT_WITH_THUMBNAIL = false;
        private static final long serialVersionUID = 0;
        public final String meeting_space_id;
        public final Boolean only_support_ms;
        public final Boolean with_thumbnail;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcQueryDocsRequest$QueryOpts$b */
        private static final class C51215b extends ProtoAdapter<QueryOpts> {
            C51215b() {
                super(FieldEncoding.LENGTH_DELIMITED, QueryOpts.class);
            }

            /* renamed from: a */
            public int encodedSize(QueryOpts queryOpts) {
                int i;
                int i2;
                int i3 = 0;
                if (queryOpts.meeting_space_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, queryOpts.meeting_space_id);
                } else {
                    i = 0;
                }
                if (queryOpts.with_thumbnail != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, queryOpts.with_thumbnail);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (queryOpts.only_support_ms != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, queryOpts.only_support_ms);
                }
                return i4 + i3 + queryOpts.unknownFields().size();
            }

            /* renamed from: a */
            public QueryOpts decode(ProtoReader protoReader) throws IOException {
                C51214a aVar = new C51214a();
                aVar.f127498a = "";
                aVar.f127499b = false;
                aVar.f127500c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127498a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127499b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127500c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, QueryOpts queryOpts) throws IOException {
                if (queryOpts.meeting_space_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, queryOpts.meeting_space_id);
                }
                if (queryOpts.with_thumbnail != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, queryOpts.with_thumbnail);
                }
                if (queryOpts.only_support_ms != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, queryOpts.only_support_ms);
                }
                protoWriter.writeBytes(queryOpts.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcQueryDocsRequest$QueryOpts$a */
        public static final class C51214a extends Message.Builder<QueryOpts, C51214a> {

            /* renamed from: a */
            public String f127498a;

            /* renamed from: b */
            public Boolean f127499b;

            /* renamed from: c */
            public Boolean f127500c;

            /* renamed from: a */
            public QueryOpts build() {
                return new QueryOpts(this.f127498a, this.f127499b, this.f127500c, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C51214a mo176614a(Boolean bool) {
                this.f127499b = bool;
                return this;
            }

            /* renamed from: b */
            public C51214a mo176617b(Boolean bool) {
                this.f127500c = bool;
                return this;
            }

            /* renamed from: a */
            public C51214a mo176615a(String str) {
                this.f127498a = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C51214a newBuilder() {
            C51214a aVar = new C51214a();
            aVar.f127498a = this.meeting_space_id;
            aVar.f127499b = this.with_thumbnail;
            aVar.f127500c = this.only_support_ms;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "QueryOpts");
            StringBuilder sb = new StringBuilder();
            if (this.meeting_space_id != null) {
                sb.append(", meeting_space_id=");
                sb.append(this.meeting_space_id);
            }
            if (this.with_thumbnail != null) {
                sb.append(", with_thumbnail=");
                sb.append(this.with_thumbnail);
            }
            if (this.only_support_ms != null) {
                sb.append(", only_support_ms=");
                sb.append(this.only_support_ms);
            }
            StringBuilder replace = sb.replace(0, 2, "QueryOpts{");
            replace.append('}');
            return replace.toString();
        }

        public QueryOpts(String str, Boolean bool, Boolean bool2) {
            this(str, bool, bool2, ByteString.EMPTY);
        }

        public QueryOpts(String str, Boolean bool, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.meeting_space_id = str;
            this.with_thumbnail = bool;
            this.only_support_ms = bool2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcQueryDocsRequest$b */
    private static final class C51217b extends ProtoAdapter<VcQueryDocsRequest> {
        C51217b() {
            super(FieldEncoding.LENGTH_DELIMITED, VcQueryDocsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VcQueryDocsRequest vcQueryDocsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (vcQueryDocsRequest.query != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vcQueryDocsRequest.query);
            } else {
                i = 0;
            }
            if (vcQueryDocsRequest.limit != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, vcQueryDocsRequest.limit);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (vcQueryDocsRequest.offset != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, vcQueryDocsRequest.offset);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i6 + i3 + VcDocs.DocType.ADAPTER.asRepeated().encodedSizeWithTag(4, vcQueryDocsRequest.query_types);
            if (vcQueryDocsRequest.opts != null) {
                i4 = QueryOpts.ADAPTER.encodedSizeWithTag(5, vcQueryDocsRequest.opts);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i4 + VcDocs.DocSubType.ADAPTER.asRepeated().encodedSizeWithTag(6, vcQueryDocsRequest.query_subtypes);
            if (vcQueryDocsRequest.source != null) {
                i5 = QuerySource.ADAPTER.encodedSizeWithTag(7, vcQueryDocsRequest.source);
            }
            return encodedSizeWithTag2 + i5 + vcQueryDocsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VcQueryDocsRequest decode(ProtoReader protoReader) throws IOException {
            C51216a aVar = new C51216a();
            aVar.f127501a = "";
            aVar.f127502b = 0;
            aVar.f127503c = 0;
            aVar.f127507g = QuerySource.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127501a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127502b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127503c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f127504d.add(VcDocs.DocType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f127505e = QueryOpts.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f127506f.add(VcDocs.DocSubType.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            try {
                                aVar.f127507g = QuerySource.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
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
        public void encode(ProtoWriter protoWriter, VcQueryDocsRequest vcQueryDocsRequest) throws IOException {
            if (vcQueryDocsRequest.query != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vcQueryDocsRequest.query);
            }
            if (vcQueryDocsRequest.limit != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, vcQueryDocsRequest.limit);
            }
            if (vcQueryDocsRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, vcQueryDocsRequest.offset);
            }
            VcDocs.DocType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, vcQueryDocsRequest.query_types);
            if (vcQueryDocsRequest.opts != null) {
                QueryOpts.ADAPTER.encodeWithTag(protoWriter, 5, vcQueryDocsRequest.opts);
            }
            VcDocs.DocSubType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, vcQueryDocsRequest.query_subtypes);
            if (vcQueryDocsRequest.source != null) {
                QuerySource.ADAPTER.encodeWithTag(protoWriter, 7, vcQueryDocsRequest.source);
            }
            protoWriter.writeBytes(vcQueryDocsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VcQueryDocsRequest$a */
    public static final class C51216a extends Message.Builder<VcQueryDocsRequest, C51216a> {

        /* renamed from: a */
        public String f127501a;

        /* renamed from: b */
        public Integer f127502b;

        /* renamed from: c */
        public Integer f127503c;

        /* renamed from: d */
        public List<VcDocs.DocType> f127504d = Internal.newMutableList();

        /* renamed from: e */
        public QueryOpts f127505e;

        /* renamed from: f */
        public List<VcDocs.DocSubType> f127506f = Internal.newMutableList();

        /* renamed from: g */
        public QuerySource f127507g;

        /* renamed from: a */
        public VcQueryDocsRequest build() {
            return new VcQueryDocsRequest(this.f127501a, this.f127502b, this.f127503c, this.f127504d, this.f127505e, this.f127506f, this.f127507g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51216a mo176621a(QueryOpts queryOpts) {
            this.f127505e = queryOpts;
            return this;
        }

        /* renamed from: b */
        public C51216a mo176626b(Integer num) {
            this.f127503c = num;
            return this;
        }

        /* renamed from: a */
        public C51216a mo176622a(QuerySource querySource) {
            this.f127507g = querySource;
            return this;
        }

        /* renamed from: a */
        public C51216a mo176623a(Integer num) {
            this.f127502b = num;
            return this;
        }

        /* renamed from: a */
        public C51216a mo176624a(String str) {
            this.f127501a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51216a newBuilder() {
        C51216a aVar = new C51216a();
        aVar.f127501a = this.query;
        aVar.f127502b = this.limit;
        aVar.f127503c = this.offset;
        aVar.f127504d = Internal.copyOf("query_types", this.query_types);
        aVar.f127505e = this.opts;
        aVar.f127506f = Internal.copyOf("query_subtypes", this.query_subtypes);
        aVar.f127507g = this.source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VcQueryDocsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (!this.query_types.isEmpty()) {
            sb.append(", query_types=");
            sb.append(this.query_types);
        }
        if (this.opts != null) {
            sb.append(", opts=");
            sb.append(this.opts);
        }
        if (!this.query_subtypes.isEmpty()) {
            sb.append(", query_subtypes=");
            sb.append(this.query_subtypes);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        StringBuilder replace = sb.replace(0, 2, "VcQueryDocsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VcQueryDocsRequest(String str, Integer num, Integer num2, List<VcDocs.DocType> list, QueryOpts queryOpts, List<VcDocs.DocSubType> list2, QuerySource querySource) {
        this(str, num, num2, list, queryOpts, list2, querySource, ByteString.EMPTY);
    }

    public VcQueryDocsRequest(String str, Integer num, Integer num2, List<VcDocs.DocType> list, QueryOpts queryOpts, List<VcDocs.DocSubType> list2, QuerySource querySource, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.limit = num;
        this.offset = num2;
        this.query_types = Internal.immutableCopyOf("query_types", list);
        this.opts = queryOpts;
        this.query_subtypes = Internal.immutableCopyOf("query_subtypes", list2);
        this.source = querySource;
    }
}
