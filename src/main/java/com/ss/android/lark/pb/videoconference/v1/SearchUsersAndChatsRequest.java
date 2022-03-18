package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class SearchUsersAndChatsRequest extends Message<SearchUsersAndChatsRequest, C50996a> {
    public static final ProtoAdapter<SearchUsersAndChatsRequest> ADAPTER = new C50997b();
    public static final Integer DEFAULT_COUNT = 50;
    public static final I18nLocal DEFAULT_LOCALE_IDENTIFIER = I18nLocal.ZH_CN;
    public static final Boolean DEFAULT_NEED_QUERY_OUTER_TANANT = true;
    public static final Integer DEFAULT_OFFSET = 0;
    public static final QueryType DEFAULT_QUERY_TYPE = QueryType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final I18nLocal locale_identifier;
    public final Boolean need_query_outer_tanant;
    public final Integer offset;
    public final String query;
    public final QueryType query_type;

    public enum I18nLocal implements WireEnum {
        ZH_CN(0),
        EN_US(1),
        JA_JP(2);
        
        public static final ProtoAdapter<I18nLocal> ADAPTER = ProtoAdapter.newEnumAdapter(I18nLocal.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static I18nLocal fromValue(int i) {
            if (i == 0) {
                return ZH_CN;
            }
            if (i == 1) {
                return EN_US;
            }
            if (i != 2) {
                return null;
            }
            return JA_JP;
        }

        private I18nLocal(int i) {
            this.value = i;
        }
    }

    public enum QueryType implements WireEnum {
        UNKNOWN(0),
        SEARCH_FOR_SHARE_CARD(1);
        
        public static final ProtoAdapter<QueryType> ADAPTER = ProtoAdapter.newEnumAdapter(QueryType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static QueryType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return SEARCH_FOR_SHARE_CARD;
        }

        private QueryType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsRequest$b */
    private static final class C50997b extends ProtoAdapter<SearchUsersAndChatsRequest> {
        C50997b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchUsersAndChatsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchUsersAndChatsRequest searchUsersAndChatsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (searchUsersAndChatsRequest.query != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, searchUsersAndChatsRequest.query);
            } else {
                i = 0;
            }
            if (searchUsersAndChatsRequest.offset != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, searchUsersAndChatsRequest.offset);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (searchUsersAndChatsRequest.count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, searchUsersAndChatsRequest.count);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (searchUsersAndChatsRequest.need_query_outer_tanant != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, searchUsersAndChatsRequest.need_query_outer_tanant);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (searchUsersAndChatsRequest.locale_identifier != null) {
                i5 = I18nLocal.ADAPTER.encodedSizeWithTag(5, searchUsersAndChatsRequest.locale_identifier);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (searchUsersAndChatsRequest.query_type != null) {
                i6 = QueryType.ADAPTER.encodedSizeWithTag(6, searchUsersAndChatsRequest.query_type);
            }
            return i10 + i6 + searchUsersAndChatsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SearchUsersAndChatsRequest decode(ProtoReader protoReader) throws IOException {
            C50996a aVar = new C50996a();
            aVar.f127043a = "";
            aVar.f127044b = 0;
            aVar.f127045c = 50;
            aVar.f127046d = true;
            aVar.f127047e = I18nLocal.ZH_CN;
            aVar.f127048f = QueryType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127043a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127044b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f127045c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127046d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f127047e = I18nLocal.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f127048f = QueryType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
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
        public void encode(ProtoWriter protoWriter, SearchUsersAndChatsRequest searchUsersAndChatsRequest) throws IOException {
            if (searchUsersAndChatsRequest.query != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchUsersAndChatsRequest.query);
            }
            if (searchUsersAndChatsRequest.offset != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchUsersAndChatsRequest.offset);
            }
            if (searchUsersAndChatsRequest.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, searchUsersAndChatsRequest.count);
            }
            if (searchUsersAndChatsRequest.need_query_outer_tanant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, searchUsersAndChatsRequest.need_query_outer_tanant);
            }
            if (searchUsersAndChatsRequest.locale_identifier != null) {
                I18nLocal.ADAPTER.encodeWithTag(protoWriter, 5, searchUsersAndChatsRequest.locale_identifier);
            }
            if (searchUsersAndChatsRequest.query_type != null) {
                QueryType.ADAPTER.encodeWithTag(protoWriter, 6, searchUsersAndChatsRequest.query_type);
            }
            protoWriter.writeBytes(searchUsersAndChatsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SearchUsersAndChatsRequest$a */
    public static final class C50996a extends Message.Builder<SearchUsersAndChatsRequest, C50996a> {

        /* renamed from: a */
        public String f127043a;

        /* renamed from: b */
        public Integer f127044b;

        /* renamed from: c */
        public Integer f127045c;

        /* renamed from: d */
        public Boolean f127046d;

        /* renamed from: e */
        public I18nLocal f127047e;

        /* renamed from: f */
        public QueryType f127048f;

        /* renamed from: a */
        public SearchUsersAndChatsRequest build() {
            return new SearchUsersAndChatsRequest(this.f127043a, this.f127044b, this.f127045c, this.f127046d, this.f127047e, this.f127048f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50996a mo176092a(QueryType queryType) {
            this.f127048f = queryType;
            return this;
        }

        /* renamed from: b */
        public C50996a mo176097b(Integer num) {
            this.f127045c = num;
            return this;
        }

        /* renamed from: a */
        public C50996a mo176093a(Boolean bool) {
            this.f127046d = bool;
            return this;
        }

        /* renamed from: a */
        public C50996a mo176094a(Integer num) {
            this.f127044b = num;
            return this;
        }

        /* renamed from: a */
        public C50996a mo176095a(String str) {
            this.f127043a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50996a newBuilder() {
        C50996a aVar = new C50996a();
        aVar.f127043a = this.query;
        aVar.f127044b = this.offset;
        aVar.f127045c = this.count;
        aVar.f127046d = this.need_query_outer_tanant;
        aVar.f127047e = this.locale_identifier;
        aVar.f127048f = this.query_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SearchUsersAndChatsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.query != null) {
            sb.append(", query=");
            sb.append(this.query);
        }
        if (this.offset != null) {
            sb.append(", offset=");
            sb.append(this.offset);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.need_query_outer_tanant != null) {
            sb.append(", need_query_outer_tanant=");
            sb.append(this.need_query_outer_tanant);
        }
        if (this.locale_identifier != null) {
            sb.append(", locale_identifier=");
            sb.append(this.locale_identifier);
        }
        if (this.query_type != null) {
            sb.append(", query_type=");
            sb.append(this.query_type);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchUsersAndChatsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SearchUsersAndChatsRequest(String str, Integer num, Integer num2, Boolean bool, I18nLocal i18nLocal, QueryType queryType) {
        this(str, num, num2, bool, i18nLocal, queryType, ByteString.EMPTY);
    }

    public SearchUsersAndChatsRequest(String str, Integer num, Integer num2, Boolean bool, I18nLocal i18nLocal, QueryType queryType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.offset = num;
        this.count = num2;
        this.need_query_outer_tanant = bool;
        this.locale_identifier = i18nLocal;
        this.query_type = queryType;
    }
}
