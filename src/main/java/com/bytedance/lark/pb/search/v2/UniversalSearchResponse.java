package com.bytedance.lark.pb.search.v2;

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

public final class UniversalSearchResponse extends Message<UniversalSearchResponse, C19093a> {
    public static final ProtoAdapter<UniversalSearchResponse> ADAPTER = new C19094b();
    private static final long serialVersionUID = 0;
    public final ExtraMeta extra_meta;
    public final List<FailedEntityInfo> failed_entity_infos;
    public final SearchCommonResponseHeader header;
    public final List<SearchResult> results;
    public final SuggestionInfo suggestion_info;

    public static final class FailedEntityInfo extends Message<FailedEntityInfo, C19091a> {
        public static final ProtoAdapter<FailedEntityInfo> ADAPTER = new C19092b();
        public static final SearchEntityType DEFAULT_ENTITY_TYPE = SearchEntityType.UNKNOWN;
        public static final Boolean DEFAULT_IS_NEED_LOCAL_FALLBACK = false;
        private static final long serialVersionUID = 0;
        public final SearchEntityType entity_type;
        public final Boolean is_need_local_fallback;
        public final String local_pagination_token;

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSearchResponse$FailedEntityInfo$b */
        private static final class C19092b extends ProtoAdapter<FailedEntityInfo> {
            C19092b() {
                super(FieldEncoding.LENGTH_DELIMITED, FailedEntityInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(FailedEntityInfo failedEntityInfo) {
                int i;
                int encodedSizeWithTag = SearchEntityType.ADAPTER.encodedSizeWithTag(1, failedEntityInfo.entity_type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, failedEntityInfo.is_need_local_fallback);
                if (failedEntityInfo.local_pagination_token != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, failedEntityInfo.local_pagination_token);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + failedEntityInfo.unknownFields().size();
            }

            /* renamed from: a */
            public FailedEntityInfo decode(ProtoReader protoReader) throws IOException {
                C19091a aVar = new C19091a();
                aVar.f47203a = SearchEntityType.UNKNOWN;
                aVar.f47204b = false;
                aVar.f47205c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f47203a = SearchEntityType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f47204b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47205c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, FailedEntityInfo failedEntityInfo) throws IOException {
                SearchEntityType.ADAPTER.encodeWithTag(protoWriter, 1, failedEntityInfo.entity_type);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, failedEntityInfo.is_need_local_fallback);
                if (failedEntityInfo.local_pagination_token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, failedEntityInfo.local_pagination_token);
                }
                protoWriter.writeBytes(failedEntityInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19091a newBuilder() {
            C19091a aVar = new C19091a();
            aVar.f47203a = this.entity_type;
            aVar.f47204b = this.is_need_local_fallback;
            aVar.f47205c = this.local_pagination_token;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSearchResponse$FailedEntityInfo$a */
        public static final class C19091a extends Message.Builder<FailedEntityInfo, C19091a> {

            /* renamed from: a */
            public SearchEntityType f47203a;

            /* renamed from: b */
            public Boolean f47204b;

            /* renamed from: c */
            public String f47205c;

            /* renamed from: a */
            public FailedEntityInfo build() {
                Boolean bool;
                SearchEntityType searchEntityType = this.f47203a;
                if (searchEntityType != null && (bool = this.f47204b) != null) {
                    return new FailedEntityInfo(searchEntityType, bool, this.f47205c, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(searchEntityType, "entity_type", this.f47204b, "is_need_local_fallback");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "FailedEntityInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", entity_type=");
            sb.append(this.entity_type);
            sb.append(", is_need_local_fallback=");
            sb.append(this.is_need_local_fallback);
            if (this.local_pagination_token != null) {
                sb.append(", local_pagination_token=");
                sb.append(this.local_pagination_token);
            }
            StringBuilder replace = sb.replace(0, 2, "FailedEntityInfo{");
            replace.append('}');
            return replace.toString();
        }

        public FailedEntityInfo(SearchEntityType searchEntityType, Boolean bool, String str) {
            this(searchEntityType, bool, str, ByteString.EMPTY);
        }

        public FailedEntityInfo(SearchEntityType searchEntityType, Boolean bool, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.entity_type = searchEntityType;
            this.is_need_local_fallback = bool;
            this.local_pagination_token = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSearchResponse$b */
    private static final class C19094b extends ProtoAdapter<UniversalSearchResponse> {
        C19094b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniversalSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UniversalSearchResponse universalSearchResponse) {
            int i;
            int encodedSizeWithTag = SearchCommonResponseHeader.ADAPTER.encodedSizeWithTag(1, universalSearchResponse.header) + SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(2, universalSearchResponse.results);
            int i2 = 0;
            if (universalSearchResponse.extra_meta != null) {
                i = ExtraMeta.ADAPTER.encodedSizeWithTag(3, universalSearchResponse.extra_meta);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (universalSearchResponse.suggestion_info != null) {
                i2 = SuggestionInfo.ADAPTER.encodedSizeWithTag(4, universalSearchResponse.suggestion_info);
            }
            return i3 + i2 + FailedEntityInfo.ADAPTER.asRepeated().encodedSizeWithTag(5, universalSearchResponse.failed_entity_infos) + universalSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UniversalSearchResponse decode(ProtoReader protoReader) throws IOException {
            C19093a aVar = new C19093a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47206a = SearchCommonResponseHeader.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47207b.add(SearchResult.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f47208c = ExtraMeta.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f47209d = SuggestionInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47210e.add(FailedEntityInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UniversalSearchResponse universalSearchResponse) throws IOException {
            SearchCommonResponseHeader.ADAPTER.encodeWithTag(protoWriter, 1, universalSearchResponse.header);
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, universalSearchResponse.results);
            if (universalSearchResponse.extra_meta != null) {
                ExtraMeta.ADAPTER.encodeWithTag(protoWriter, 3, universalSearchResponse.extra_meta);
            }
            if (universalSearchResponse.suggestion_info != null) {
                SuggestionInfo.ADAPTER.encodeWithTag(protoWriter, 4, universalSearchResponse.suggestion_info);
            }
            FailedEntityInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, universalSearchResponse.failed_entity_infos);
            protoWriter.writeBytes(universalSearchResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniversalSearchResponse$a */
    public static final class C19093a extends Message.Builder<UniversalSearchResponse, C19093a> {

        /* renamed from: a */
        public SearchCommonResponseHeader f47206a;

        /* renamed from: b */
        public List<SearchResult> f47207b = Internal.newMutableList();

        /* renamed from: c */
        public ExtraMeta f47208c;

        /* renamed from: d */
        public SuggestionInfo f47209d;

        /* renamed from: e */
        public List<FailedEntityInfo> f47210e = Internal.newMutableList();

        /* renamed from: a */
        public UniversalSearchResponse build() {
            SearchCommonResponseHeader searchCommonResponseHeader = this.f47206a;
            if (searchCommonResponseHeader != null) {
                return new UniversalSearchResponse(searchCommonResponseHeader, this.f47207b, this.f47208c, this.f47209d, this.f47210e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(searchCommonResponseHeader, "header");
        }
    }

    @Override // com.squareup.wire.Message
    public C19093a newBuilder() {
        C19093a aVar = new C19093a();
        aVar.f47206a = this.header;
        aVar.f47207b = Internal.copyOf("results", this.results);
        aVar.f47208c = this.extra_meta;
        aVar.f47209d = this.suggestion_info;
        aVar.f47210e = Internal.copyOf("failed_entity_infos", this.failed_entity_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "UniversalSearchResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", header=");
        sb.append(this.header);
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        if (this.extra_meta != null) {
            sb.append(", extra_meta=");
            sb.append(this.extra_meta);
        }
        if (this.suggestion_info != null) {
            sb.append(", suggestion_info=");
            sb.append(this.suggestion_info);
        }
        if (!this.failed_entity_infos.isEmpty()) {
            sb.append(", failed_entity_infos=");
            sb.append(this.failed_entity_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "UniversalSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UniversalSearchResponse(SearchCommonResponseHeader searchCommonResponseHeader, List<SearchResult> list, ExtraMeta extraMeta, SuggestionInfo suggestionInfo, List<FailedEntityInfo> list2) {
        this(searchCommonResponseHeader, list, extraMeta, suggestionInfo, list2, ByteString.EMPTY);
    }

    public UniversalSearchResponse(SearchCommonResponseHeader searchCommonResponseHeader, List<SearchResult> list, ExtraMeta extraMeta, SuggestionInfo suggestionInfo, List<FailedEntityInfo> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.header = searchCommonResponseHeader;
        this.results = Internal.immutableCopyOf("results", list);
        this.extra_meta = extraMeta;
        this.suggestion_info = suggestionInfo;
        this.failed_entity_infos = Internal.immutableCopyOf("failed_entity_infos", list2);
    }
}
