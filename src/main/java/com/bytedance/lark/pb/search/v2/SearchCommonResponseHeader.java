package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SearchCommonResponseHeader extends Message<SearchCommonResponseHeader, C19017a> {
    public static final ProtoAdapter<SearchCommonResponseHeader> ADAPTER = new C19018b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final InvokeAbnormalNotice DEFAULT_INVOKE_ABNORMAL_NOTICE = InvokeAbnormalNotice.DEFAULT;
    public static final Integer DEFAULT_SESSION_SEQ_ID = 0;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final Boolean has_more;
    public final InvokeAbnormalNotice invoke_abnormal_notice;
    public final String pagination_token;
    public final String request_id;
    public final SearchResponseExtras response_extras;
    public final String search_session;
    public final Integer session_seq_id;
    public final ColdAndHotStorageInfo storage_info;
    public final SuggestionFilters suggestion_filters;
    public final SuggestionQueries suggestion_queries;
    public final Integer total;

    public enum InvokeAbnormalNotice implements WireEnum {
        DEFAULT(0),
        TOO_FREQUENT(1),
        EMPTY_SEARCH_SESSION(2),
        EMPTY_SESSION_SEQ_ID(3),
        QUERY_ABNORMAL(4),
        REQUEST_PARAMS_ABNORMAL(5),
        REQUEST_CANCELED(6),
        VERSION_SWITCH(7),
        QUERY_LENGTH_EXCEEDED(8),
        UNKNOWN(100);
        
        public static final ProtoAdapter<InvokeAbnormalNotice> ADAPTER = ProtoAdapter.newEnumAdapter(InvokeAbnormalNotice.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static InvokeAbnormalNotice fromValue(int i) {
            if (i == 100) {
                return UNKNOWN;
            }
            switch (i) {
                case 0:
                    return DEFAULT;
                case 1:
                    return TOO_FREQUENT;
                case 2:
                    return EMPTY_SEARCH_SESSION;
                case 3:
                    return EMPTY_SESSION_SEQ_ID;
                case 4:
                    return QUERY_ABNORMAL;
                case 5:
                    return REQUEST_PARAMS_ABNORMAL;
                case 6:
                    return REQUEST_CANCELED;
                case 7:
                    return VERSION_SWITCH;
                case 8:
                    return QUERY_LENGTH_EXCEEDED;
                default:
                    return null;
            }
        }

        private InvokeAbnormalNotice(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader$b */
    private static final class C19018b extends ProtoAdapter<SearchCommonResponseHeader> {
        C19018b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchCommonResponseHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchCommonResponseHeader searchCommonResponseHeader) {
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
            int i11 = 0;
            if (searchCommonResponseHeader.suggestion_filters != null) {
                i = SuggestionFilters.ADAPTER.encodedSizeWithTag(1, searchCommonResponseHeader.suggestion_filters);
            } else {
                i = 0;
            }
            if (searchCommonResponseHeader.suggestion_queries != null) {
                i2 = SuggestionQueries.ADAPTER.encodedSizeWithTag(2, searchCommonResponseHeader.suggestion_queries);
            } else {
                i2 = 0;
            }
            int i12 = i + i2;
            if (searchCommonResponseHeader.search_session != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchCommonResponseHeader.search_session);
            } else {
                i3 = 0;
            }
            int i13 = i12 + i3;
            if (searchCommonResponseHeader.session_seq_id != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, searchCommonResponseHeader.session_seq_id);
            } else {
                i4 = 0;
            }
            int i14 = i13 + i4;
            if (searchCommonResponseHeader.request_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, searchCommonResponseHeader.request_id);
            } else {
                i5 = 0;
            }
            int i15 = i14 + i5;
            if (searchCommonResponseHeader.total != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(6, searchCommonResponseHeader.total);
            } else {
                i6 = 0;
            }
            int i16 = i15 + i6;
            if (searchCommonResponseHeader.has_more != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, searchCommonResponseHeader.has_more);
            } else {
                i7 = 0;
            }
            int i17 = i16 + i7;
            if (searchCommonResponseHeader.pagination_token != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(8, searchCommonResponseHeader.pagination_token);
            } else {
                i8 = 0;
            }
            int i18 = i17 + i8;
            if (searchCommonResponseHeader.invoke_abnormal_notice != null) {
                i9 = InvokeAbnormalNotice.ADAPTER.encodedSizeWithTag(9, searchCommonResponseHeader.invoke_abnormal_notice);
            } else {
                i9 = 0;
            }
            int i19 = i18 + i9;
            if (searchCommonResponseHeader.response_extras != null) {
                i10 = SearchResponseExtras.ADAPTER.encodedSizeWithTag(10, searchCommonResponseHeader.response_extras);
            } else {
                i10 = 0;
            }
            int i20 = i19 + i10;
            if (searchCommonResponseHeader.storage_info != null) {
                i11 = ColdAndHotStorageInfo.ADAPTER.encodedSizeWithTag(11, searchCommonResponseHeader.storage_info);
            }
            return i20 + i11 + searchCommonResponseHeader.unknownFields().size();
        }

        /* renamed from: a */
        public SearchCommonResponseHeader decode(ProtoReader protoReader) throws IOException {
            C19017a aVar = new C19017a();
            aVar.f47029c = "";
            aVar.f47030d = 0;
            aVar.f47031e = "";
            aVar.f47032f = 0;
            aVar.f47033g = false;
            aVar.f47034h = "";
            aVar.f47035i = InvokeAbnormalNotice.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47027a = SuggestionFilters.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47028b = SuggestionQueries.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47029c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47030d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47031e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47032f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47033g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47034h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            try {
                                aVar.f47035i = InvokeAbnormalNotice.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 10:
                            aVar.f47036j = SearchResponseExtras.ADAPTER.decode(protoReader);
                            break;
                        case 11:
                            aVar.f47037k = ColdAndHotStorageInfo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchCommonResponseHeader searchCommonResponseHeader) throws IOException {
            if (searchCommonResponseHeader.suggestion_filters != null) {
                SuggestionFilters.ADAPTER.encodeWithTag(protoWriter, 1, searchCommonResponseHeader.suggestion_filters);
            }
            if (searchCommonResponseHeader.suggestion_queries != null) {
                SuggestionQueries.ADAPTER.encodeWithTag(protoWriter, 2, searchCommonResponseHeader.suggestion_queries);
            }
            if (searchCommonResponseHeader.search_session != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchCommonResponseHeader.search_session);
            }
            if (searchCommonResponseHeader.session_seq_id != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, searchCommonResponseHeader.session_seq_id);
            }
            if (searchCommonResponseHeader.request_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, searchCommonResponseHeader.request_id);
            }
            if (searchCommonResponseHeader.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, searchCommonResponseHeader.total);
            }
            if (searchCommonResponseHeader.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, searchCommonResponseHeader.has_more);
            }
            if (searchCommonResponseHeader.pagination_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, searchCommonResponseHeader.pagination_token);
            }
            if (searchCommonResponseHeader.invoke_abnormal_notice != null) {
                InvokeAbnormalNotice.ADAPTER.encodeWithTag(protoWriter, 9, searchCommonResponseHeader.invoke_abnormal_notice);
            }
            if (searchCommonResponseHeader.response_extras != null) {
                SearchResponseExtras.ADAPTER.encodeWithTag(protoWriter, 10, searchCommonResponseHeader.response_extras);
            }
            if (searchCommonResponseHeader.storage_info != null) {
                ColdAndHotStorageInfo.ADAPTER.encodeWithTag(protoWriter, 11, searchCommonResponseHeader.storage_info);
            }
            protoWriter.writeBytes(searchCommonResponseHeader.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchCommonResponseHeader$a */
    public static final class C19017a extends Message.Builder<SearchCommonResponseHeader, C19017a> {

        /* renamed from: a */
        public SuggestionFilters f47027a;

        /* renamed from: b */
        public SuggestionQueries f47028b;

        /* renamed from: c */
        public String f47029c;

        /* renamed from: d */
        public Integer f47030d;

        /* renamed from: e */
        public String f47031e;

        /* renamed from: f */
        public Integer f47032f;

        /* renamed from: g */
        public Boolean f47033g;

        /* renamed from: h */
        public String f47034h;

        /* renamed from: i */
        public InvokeAbnormalNotice f47035i;

        /* renamed from: j */
        public SearchResponseExtras f47036j;

        /* renamed from: k */
        public ColdAndHotStorageInfo f47037k;

        /* renamed from: a */
        public SearchCommonResponseHeader build() {
            return new SearchCommonResponseHeader(this.f47027a, this.f47028b, this.f47029c, this.f47030d, this.f47031e, this.f47032f, this.f47033g, this.f47034h, this.f47035i, this.f47036j, this.f47037k, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19017a newBuilder() {
        C19017a aVar = new C19017a();
        aVar.f47027a = this.suggestion_filters;
        aVar.f47028b = this.suggestion_queries;
        aVar.f47029c = this.search_session;
        aVar.f47030d = this.session_seq_id;
        aVar.f47031e = this.request_id;
        aVar.f47032f = this.total;
        aVar.f47033g = this.has_more;
        aVar.f47034h = this.pagination_token;
        aVar.f47035i = this.invoke_abnormal_notice;
        aVar.f47036j = this.response_extras;
        aVar.f47037k = this.storage_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchCommonResponseHeader");
        StringBuilder sb = new StringBuilder();
        if (this.suggestion_filters != null) {
            sb.append(", suggestion_filters=");
            sb.append(this.suggestion_filters);
        }
        if (this.suggestion_queries != null) {
            sb.append(", suggestion_queries=");
            sb.append(this.suggestion_queries);
        }
        if (this.search_session != null) {
            sb.append(", search_session=");
            sb.append(this.search_session);
        }
        if (this.session_seq_id != null) {
            sb.append(", session_seq_id=");
            sb.append(this.session_seq_id);
        }
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.pagination_token != null) {
            sb.append(", pagination_token=");
            sb.append(this.pagination_token);
        }
        if (this.invoke_abnormal_notice != null) {
            sb.append(", invoke_abnormal_notice=");
            sb.append(this.invoke_abnormal_notice);
        }
        if (this.response_extras != null) {
            sb.append(", response_extras=");
            sb.append(this.response_extras);
        }
        if (this.storage_info != null) {
            sb.append(", storage_info=");
            sb.append(this.storage_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchCommonResponseHeader{");
        replace.append('}');
        return replace.toString();
    }

    public SearchCommonResponseHeader(SuggestionFilters suggestionFilters, SuggestionQueries suggestionQueries, String str, Integer num, String str2, Integer num2, Boolean bool, String str3, InvokeAbnormalNotice invokeAbnormalNotice, SearchResponseExtras searchResponseExtras, ColdAndHotStorageInfo coldAndHotStorageInfo) {
        this(suggestionFilters, suggestionQueries, str, num, str2, num2, bool, str3, invokeAbnormalNotice, searchResponseExtras, coldAndHotStorageInfo, ByteString.EMPTY);
    }

    public SearchCommonResponseHeader(SuggestionFilters suggestionFilters, SuggestionQueries suggestionQueries, String str, Integer num, String str2, Integer num2, Boolean bool, String str3, InvokeAbnormalNotice invokeAbnormalNotice, SearchResponseExtras searchResponseExtras, ColdAndHotStorageInfo coldAndHotStorageInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.suggestion_filters = suggestionFilters;
        this.suggestion_queries = suggestionQueries;
        this.search_session = str;
        this.session_seq_id = num;
        this.request_id = str2;
        this.total = num2;
        this.has_more = bool;
        this.pagination_token = str3;
        this.invoke_abnormal_notice = invokeAbnormalNotice;
        this.response_extras = searchResponseExtras;
        this.storage_info = coldAndHotStorageInfo;
    }
}
