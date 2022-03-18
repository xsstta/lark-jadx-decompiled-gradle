package com.ss.android.lark.pb.searches;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.searches.IntegrationSearchRequest;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class SearchHistoryInfo extends Message<SearchHistoryInfo, C50040a> {
    public static final ProtoAdapter<SearchHistoryInfo> ADAPTER = new C50041b();
    public static final Integer DEFAULT_TAB_INDEX = 0;
    private static final long serialVersionUID = 0;
    public final List<String> mexternal_ids;
    public final ExternalType mexternal_type;
    public final IntegrationSearchRequest.FilterParam mfilter_param;
    public final String mid;
    public final String mquery;
    public final Source msrc;
    public final Integer mtab_index;
    public final TabType mtab_type;

    public enum ExternalType implements WireEnum {
        UNKNOWNTYPE(0),
        MAINTAB(1),
        SUBTAB(2);
        
        public static final ProtoAdapter<ExternalType> ADAPTER = ProtoAdapter.newEnumAdapter(ExternalType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ExternalType fromValue(int i) {
            if (i == 0) {
                return UNKNOWNTYPE;
            }
            if (i == 1) {
                return MAINTAB;
            }
            if (i != 2) {
                return null;
            }
            return SUBTAB;
        }

        private ExternalType(int i) {
            this.value = i;
        }
    }

    public enum Source implements WireEnum {
        UNKNOWN(0),
        MAIN(1),
        MESSAGE(2),
        SPACE(3),
        EXTERNAL(4),
        WIKI(5),
        CHAT(6),
        USER(7);
        
        public static final ProtoAdapter<Source> ADAPTER = ProtoAdapter.newEnumAdapter(Source.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Source fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return MAIN;
                case 2:
                    return MESSAGE;
                case 3:
                    return SPACE;
                case 4:
                    return EXTERNAL;
                case 5:
                    return WIKI;
                case 6:
                    return CHAT;
                case 7:
                    return USER;
                default:
                    return null;
            }
        }

        private Source(int i) {
            this.value = i;
        }
    }

    public enum TabType implements WireEnum {
        UNKNOWNTAB(0),
        ALL(1),
        FILE(2),
        LINK(3);
        
        public static final ProtoAdapter<TabType> ADAPTER = ProtoAdapter.newEnumAdapter(TabType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TabType fromValue(int i) {
            if (i == 0) {
                return UNKNOWNTAB;
            }
            if (i == 1) {
                return ALL;
            }
            if (i == 2) {
                return FILE;
            }
            if (i != 3) {
                return null;
            }
            return LINK;
        }

        private TabType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.SearchHistoryInfo$b */
    private static final class C50041b extends ProtoAdapter<SearchHistoryInfo> {
        C50041b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchHistoryInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchHistoryInfo searchHistoryInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchHistoryInfo.mquery);
            int i6 = 0;
            if (searchHistoryInfo.mfilter_param != null) {
                i = IntegrationSearchRequest.FilterParam.ADAPTER.encodedSizeWithTag(2, searchHistoryInfo.mfilter_param);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (searchHistoryInfo.mtab_index != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, searchHistoryInfo.mtab_index);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (searchHistoryInfo.mid != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, searchHistoryInfo.mid);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (searchHistoryInfo.msrc != null) {
                i4 = Source.ADAPTER.encodedSizeWithTag(5, searchHistoryInfo.msrc);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (searchHistoryInfo.mtab_type != null) {
                i5 = TabType.ADAPTER.encodedSizeWithTag(6, searchHistoryInfo.mtab_type);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (searchHistoryInfo.mexternal_type != null) {
                i6 = ExternalType.ADAPTER.encodedSizeWithTag(7, searchHistoryInfo.mexternal_type);
            }
            return i11 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(8, searchHistoryInfo.mexternal_ids) + searchHistoryInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SearchHistoryInfo decode(ProtoReader protoReader) throws IOException {
            C50040a aVar = new C50040a();
            aVar.f125138a = "";
            aVar.f125140c = 0;
            aVar.f125141d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125138a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125139b = IntegrationSearchRequest.FilterParam.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125140c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125141d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f125142e = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            try {
                                aVar.f125143f = TabType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            try {
                                aVar.f125144g = ExternalType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case 8:
                            aVar.f125145h.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, SearchHistoryInfo searchHistoryInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchHistoryInfo.mquery);
            if (searchHistoryInfo.mfilter_param != null) {
                IntegrationSearchRequest.FilterParam.ADAPTER.encodeWithTag(protoWriter, 2, searchHistoryInfo.mfilter_param);
            }
            if (searchHistoryInfo.mtab_index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, searchHistoryInfo.mtab_index);
            }
            if (searchHistoryInfo.mid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchHistoryInfo.mid);
            }
            if (searchHistoryInfo.msrc != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 5, searchHistoryInfo.msrc);
            }
            if (searchHistoryInfo.mtab_type != null) {
                TabType.ADAPTER.encodeWithTag(protoWriter, 6, searchHistoryInfo.mtab_type);
            }
            if (searchHistoryInfo.mexternal_type != null) {
                ExternalType.ADAPTER.encodeWithTag(protoWriter, 7, searchHistoryInfo.mexternal_type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 8, searchHistoryInfo.mexternal_ids);
            protoWriter.writeBytes(searchHistoryInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.searches.SearchHistoryInfo$a */
    public static final class C50040a extends Message.Builder<SearchHistoryInfo, C50040a> {

        /* renamed from: a */
        public String f125138a;

        /* renamed from: b */
        public IntegrationSearchRequest.FilterParam f125139b;

        /* renamed from: c */
        public Integer f125140c;

        /* renamed from: d */
        public String f125141d;

        /* renamed from: e */
        public Source f125142e;

        /* renamed from: f */
        public TabType f125143f;

        /* renamed from: g */
        public ExternalType f125144g;

        /* renamed from: h */
        public List<String> f125145h = Internal.newMutableList();

        /* renamed from: a */
        public SearchHistoryInfo build() {
            String str = this.f125138a;
            if (str != null) {
                return new SearchHistoryInfo(str, this.f125139b, this.f125140c, this.f125141d, this.f125142e, this.f125143f, this.f125144g, this.f125145h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mquery");
        }
    }

    @Override // com.squareup.wire.Message
    public C50040a newBuilder() {
        C50040a aVar = new C50040a();
        aVar.f125138a = this.mquery;
        aVar.f125139b = this.mfilter_param;
        aVar.f125140c = this.mtab_index;
        aVar.f125141d = this.mid;
        aVar.f125142e = this.msrc;
        aVar.f125143f = this.mtab_type;
        aVar.f125144g = this.mexternal_type;
        aVar.f125145h = Internal.copyOf("mexternal_ids", this.mexternal_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.mquery);
        if (this.mfilter_param != null) {
            sb.append(", filter_param=");
            sb.append(this.mfilter_param);
        }
        if (this.mtab_index != null) {
            sb.append(", tab_index=");
            sb.append(this.mtab_index);
        }
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        if (this.msrc != null) {
            sb.append(", src=");
            sb.append(this.msrc);
        }
        if (this.mtab_type != null) {
            sb.append(", tab_type=");
            sb.append(this.mtab_type);
        }
        if (this.mexternal_type != null) {
            sb.append(", external_type=");
            sb.append(this.mexternal_type);
        }
        if (!this.mexternal_ids.isEmpty()) {
            sb.append(", external_ids=");
            sb.append(this.mexternal_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchHistoryInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SearchHistoryInfo(String str, IntegrationSearchRequest.FilterParam filterParam, Integer num, String str2, Source source, TabType tabType, ExternalType externalType, List<String> list) {
        this(str, filterParam, num, str2, source, tabType, externalType, list, ByteString.EMPTY);
    }

    public SearchHistoryInfo(String str, IntegrationSearchRequest.FilterParam filterParam, Integer num, String str2, Source source, TabType tabType, ExternalType externalType, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mquery = str;
        this.mfilter_param = filterParam;
        this.mtab_index = num;
        this.mid = str2;
        this.msrc = source;
        this.mtab_type = tabType;
        this.mexternal_type = externalType;
        this.mexternal_ids = Internal.immutableCopyOf("mexternal_ids", list);
    }
}
