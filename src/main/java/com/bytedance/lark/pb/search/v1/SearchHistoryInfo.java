package com.bytedance.lark.pb.search.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.IntegrationSearchRequest;
import com.huawei.hms.actions.SearchIntents;
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

public final class SearchHistoryInfo extends Message<SearchHistoryInfo, C18887a> {
    public static final ProtoAdapter<SearchHistoryInfo> ADAPTER = new C18888b();
    public static final Source DEFAULT_SOURCE = Source.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> external_ids;
    public final ExternalSubSource external_sub_source;
    public final IntegrationSearchRequest.FilterParam filter_param;
    public final String id;
    public final MainSubSource main_sub_source;
    public final MessageSubSource message_sub_source;
    public final String query;
    public final Source source;
    public final SpaceSubSource space_sub_source;

    public static final class ExternalSubSource extends Message<ExternalSubSource, C18879a> {
        public static final ProtoAdapter<ExternalSubSource> ADAPTER = new C18880b();
        public static final Type DEFAULT_TYPE = Type.MAINTAB;
        private static final long serialVersionUID = 0;
        public final Type type;

        public enum Type implements WireEnum {
            MAINTAB(0),
            SUBTAB(1);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return MAINTAB;
                }
                if (i != 1) {
                    return null;
                }
                return SUBTAB;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$ExternalSubSource$b */
        private static final class C18880b extends ProtoAdapter<ExternalSubSource> {
            C18880b() {
                super(FieldEncoding.LENGTH_DELIMITED, ExternalSubSource.class);
            }

            /* renamed from: a */
            public int encodedSize(ExternalSubSource externalSubSource) {
                int i;
                if (externalSubSource.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, externalSubSource.type);
                } else {
                    i = 0;
                }
                return i + externalSubSource.unknownFields().size();
            }

            /* renamed from: a */
            public ExternalSubSource decode(ProtoReader protoReader) throws IOException {
                C18879a aVar = new C18879a();
                aVar.f46676a = Type.MAINTAB;
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
                        try {
                            aVar.f46676a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ExternalSubSource externalSubSource) throws IOException {
                if (externalSubSource.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, externalSubSource.type);
                }
                protoWriter.writeBytes(externalSubSource.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$ExternalSubSource$a */
        public static final class C18879a extends Message.Builder<ExternalSubSource, C18879a> {

            /* renamed from: a */
            public Type f46676a;

            /* renamed from: a */
            public ExternalSubSource build() {
                return new ExternalSubSource(this.f46676a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18879a newBuilder() {
            C18879a aVar = new C18879a();
            aVar.f46676a = this.type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "ExternalSubSource");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            StringBuilder replace = sb.replace(0, 2, "ExternalSubSource{");
            replace.append('}');
            return replace.toString();
        }

        public ExternalSubSource(Type type2) {
            this(type2, ByteString.EMPTY);
        }

        public ExternalSubSource(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
        }
    }

    public static final class MessageSubSource extends Message<MessageSubSource, C18883a> {
        public static final ProtoAdapter<MessageSubSource> ADAPTER = new C18884b();
        public static final Type DEFAULT_TYPE = Type.ALL;
        private static final long serialVersionUID = 0;
        public final Type type;

        public enum Type implements WireEnum {
            ALL(0),
            LINK(1),
            FILE(2);
            
            public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static Type fromValue(int i) {
                if (i == 0) {
                    return ALL;
                }
                if (i == 1) {
                    return LINK;
                }
                if (i != 2) {
                    return null;
                }
                return FILE;
            }

            private Type(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$MessageSubSource$b */
        private static final class C18884b extends ProtoAdapter<MessageSubSource> {
            C18884b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageSubSource.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageSubSource messageSubSource) {
                int i;
                if (messageSubSource.type != null) {
                    i = Type.ADAPTER.encodedSizeWithTag(1, messageSubSource.type);
                } else {
                    i = 0;
                }
                return i + messageSubSource.unknownFields().size();
            }

            /* renamed from: a */
            public MessageSubSource decode(ProtoReader protoReader) throws IOException {
                C18883a aVar = new C18883a();
                aVar.f46677a = Type.ALL;
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
                        try {
                            aVar.f46677a = Type.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageSubSource messageSubSource) throws IOException {
                if (messageSubSource.type != null) {
                    Type.ADAPTER.encodeWithTag(protoWriter, 1, messageSubSource.type);
                }
                protoWriter.writeBytes(messageSubSource.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$MessageSubSource$a */
        public static final class C18883a extends Message.Builder<MessageSubSource, C18883a> {

            /* renamed from: a */
            public Type f46677a;

            /* renamed from: a */
            public MessageSubSource build() {
                return new MessageSubSource(this.f46677a, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18883a newBuilder() {
            C18883a aVar = new C18883a();
            aVar.f46677a = this.type;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "MessageSubSource");
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageSubSource{");
            replace.append('}');
            return replace.toString();
        }

        public MessageSubSource(Type type2) {
            this(type2, ByteString.EMPTY);
        }

        public MessageSubSource(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.type = type2;
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

    public static final class MainSubSource extends Message<MainSubSource, C18881a> {
        public static final ProtoAdapter<MainSubSource> ADAPTER = new C18882b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$MainSubSource$b */
        private static final class C18882b extends ProtoAdapter<MainSubSource> {
            C18882b() {
                super(FieldEncoding.LENGTH_DELIMITED, MainSubSource.class);
            }

            /* renamed from: a */
            public int encodedSize(MainSubSource mainSubSource) {
                return mainSubSource.unknownFields().size();
            }

            /* renamed from: a */
            public MainSubSource decode(ProtoReader protoReader) throws IOException {
                C18881a aVar = new C18881a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MainSubSource mainSubSource) throws IOException {
                protoWriter.writeBytes(mainSubSource.unknownFields());
            }
        }

        public MainSubSource() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$MainSubSource$a */
        public static final class C18881a extends Message.Builder<MainSubSource, C18881a> {
            /* renamed from: a */
            public MainSubSource build() {
                return new MainSubSource(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18881a newBuilder() {
            C18881a aVar = new C18881a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "MainSubSource");
            StringBuilder replace = new StringBuilder().replace(0, 2, "MainSubSource{");
            replace.append('}');
            return replace.toString();
        }

        public MainSubSource(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    public static final class SpaceSubSource extends Message<SpaceSubSource, C18885a> {
        public static final ProtoAdapter<SpaceSubSource> ADAPTER = new C18886b();
        private static final long serialVersionUID = 0;

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$SpaceSubSource$b */
        private static final class C18886b extends ProtoAdapter<SpaceSubSource> {
            C18886b() {
                super(FieldEncoding.LENGTH_DELIMITED, SpaceSubSource.class);
            }

            /* renamed from: a */
            public int encodedSize(SpaceSubSource spaceSubSource) {
                return spaceSubSource.unknownFields().size();
            }

            /* renamed from: a */
            public SpaceSubSource decode(ProtoReader protoReader) throws IOException {
                C18885a aVar = new C18885a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SpaceSubSource spaceSubSource) throws IOException {
                protoWriter.writeBytes(spaceSubSource.unknownFields());
            }
        }

        public SpaceSubSource() {
            this(ByteString.EMPTY);
        }

        /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$SpaceSubSource$a */
        public static final class C18885a extends Message.Builder<SpaceSubSource, C18885a> {
            /* renamed from: a */
            public SpaceSubSource build() {
                return new SpaceSubSource(super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18885a newBuilder() {
            C18885a aVar = new C18885a();
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "SpaceSubSource");
            StringBuilder replace = new StringBuilder().replace(0, 2, "SpaceSubSource{");
            replace.append('}');
            return replace.toString();
        }

        public SpaceSubSource(ByteString byteString) {
            super(ADAPTER, byteString);
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$b */
    private static final class C18888b extends ProtoAdapter<SearchHistoryInfo> {
        C18888b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchHistoryInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchHistoryInfo searchHistoryInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchHistoryInfo.query);
            int i7 = 0;
            if (searchHistoryInfo.filter_param != null) {
                i = IntegrationSearchRequest.FilterParam.ADAPTER.encodedSizeWithTag(2, searchHistoryInfo.filter_param);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (searchHistoryInfo.id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, searchHistoryInfo.id);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (searchHistoryInfo.source != null) {
                i3 = Source.ADAPTER.encodedSizeWithTag(4, searchHistoryInfo.source);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i9 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, searchHistoryInfo.external_ids);
            if (searchHistoryInfo.main_sub_source != null) {
                i4 = MainSubSource.ADAPTER.encodedSizeWithTag(5, searchHistoryInfo.main_sub_source);
            } else {
                i4 = 0;
            }
            int i10 = encodedSizeWithTag2 + i4;
            if (searchHistoryInfo.message_sub_source != null) {
                i5 = MessageSubSource.ADAPTER.encodedSizeWithTag(6, searchHistoryInfo.message_sub_source);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (searchHistoryInfo.space_sub_source != null) {
                i6 = SpaceSubSource.ADAPTER.encodedSizeWithTag(7, searchHistoryInfo.space_sub_source);
            } else {
                i6 = 0;
            }
            int i12 = i11 + i6;
            if (searchHistoryInfo.external_sub_source != null) {
                i7 = ExternalSubSource.ADAPTER.encodedSizeWithTag(8, searchHistoryInfo.external_sub_source);
            }
            return i12 + i7 + searchHistoryInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SearchHistoryInfo decode(ProtoReader protoReader) throws IOException {
            C18887a aVar = new C18887a();
            aVar.f46678a = "";
            aVar.f46680c = "";
            aVar.f46681d = Source.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46678a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46679b = IntegrationSearchRequest.FilterParam.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46680c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f46681d = Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.mo64799a(MainSubSource.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.mo64800a(MessageSubSource.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.mo64801a(SpaceSubSource.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            aVar.mo64798a(ExternalSubSource.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f46682e.add(ProtoAdapter.STRING.decode(protoReader));
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
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchHistoryInfo.query);
            if (searchHistoryInfo.filter_param != null) {
                IntegrationSearchRequest.FilterParam.ADAPTER.encodeWithTag(protoWriter, 2, searchHistoryInfo.filter_param);
            }
            if (searchHistoryInfo.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchHistoryInfo.id);
            }
            if (searchHistoryInfo.source != null) {
                Source.ADAPTER.encodeWithTag(protoWriter, 4, searchHistoryInfo.source);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 9, searchHistoryInfo.external_ids);
            if (searchHistoryInfo.main_sub_source != null) {
                MainSubSource.ADAPTER.encodeWithTag(protoWriter, 5, searchHistoryInfo.main_sub_source);
            }
            if (searchHistoryInfo.message_sub_source != null) {
                MessageSubSource.ADAPTER.encodeWithTag(protoWriter, 6, searchHistoryInfo.message_sub_source);
            }
            if (searchHistoryInfo.space_sub_source != null) {
                SpaceSubSource.ADAPTER.encodeWithTag(protoWriter, 7, searchHistoryInfo.space_sub_source);
            }
            if (searchHistoryInfo.external_sub_source != null) {
                ExternalSubSource.ADAPTER.encodeWithTag(protoWriter, 8, searchHistoryInfo.external_sub_source);
            }
            protoWriter.writeBytes(searchHistoryInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18887a newBuilder() {
        C18887a aVar = new C18887a();
        aVar.f46678a = this.query;
        aVar.f46679b = this.filter_param;
        aVar.f46680c = this.id;
        aVar.f46681d = this.source;
        aVar.f46682e = Internal.copyOf("external_ids", this.external_ids);
        aVar.f46683f = this.main_sub_source;
        aVar.f46684g = this.message_sub_source;
        aVar.f46685h = this.space_sub_source;
        aVar.f46686i = this.external_sub_source;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.SearchHistoryInfo$a */
    public static final class C18887a extends Message.Builder<SearchHistoryInfo, C18887a> {

        /* renamed from: a */
        public String f46678a;

        /* renamed from: b */
        public IntegrationSearchRequest.FilterParam f46679b;

        /* renamed from: c */
        public String f46680c;

        /* renamed from: d */
        public Source f46681d;

        /* renamed from: e */
        public List<String> f46682e = Internal.newMutableList();

        /* renamed from: f */
        public MainSubSource f46683f;

        /* renamed from: g */
        public MessageSubSource f46684g;

        /* renamed from: h */
        public SpaceSubSource f46685h;

        /* renamed from: i */
        public ExternalSubSource f46686i;

        /* renamed from: a */
        public SearchHistoryInfo build() {
            String str = this.f46678a;
            if (str != null) {
                return new SearchHistoryInfo(str, this.f46679b, this.f46680c, this.f46681d, this.f46682e, this.f46683f, this.f46684g, this.f46685h, this.f46686i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY);
        }

        /* renamed from: a */
        public C18887a mo64798a(ExternalSubSource externalSubSource) {
            this.f46686i = externalSubSource;
            this.f46683f = null;
            this.f46684g = null;
            this.f46685h = null;
            return this;
        }

        /* renamed from: a */
        public C18887a mo64799a(MainSubSource mainSubSource) {
            this.f46683f = mainSubSource;
            this.f46684g = null;
            this.f46685h = null;
            this.f46686i = null;
            return this;
        }

        /* renamed from: a */
        public C18887a mo64800a(MessageSubSource messageSubSource) {
            this.f46684g = messageSubSource;
            this.f46683f = null;
            this.f46685h = null;
            this.f46686i = null;
            return this;
        }

        /* renamed from: a */
        public C18887a mo64801a(SpaceSubSource spaceSubSource) {
            this.f46685h = spaceSubSource;
            this.f46683f = null;
            this.f46684g = null;
            this.f46686i = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchHistoryInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        if (this.filter_param != null) {
            sb.append(", filter_param=");
            sb.append(this.filter_param);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (!this.external_ids.isEmpty()) {
            sb.append(", external_ids=");
            sb.append(this.external_ids);
        }
        if (this.main_sub_source != null) {
            sb.append(", main_sub_source=");
            sb.append(this.main_sub_source);
        }
        if (this.message_sub_source != null) {
            sb.append(", message_sub_source=");
            sb.append(this.message_sub_source);
        }
        if (this.space_sub_source != null) {
            sb.append(", space_sub_source=");
            sb.append(this.space_sub_source);
        }
        if (this.external_sub_source != null) {
            sb.append(", external_sub_source=");
            sb.append(this.external_sub_source);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchHistoryInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SearchHistoryInfo(String str, IntegrationSearchRequest.FilterParam filterParam, String str2, Source source2, List<String> list, MainSubSource mainSubSource, MessageSubSource messageSubSource, SpaceSubSource spaceSubSource, ExternalSubSource externalSubSource) {
        this(str, filterParam, str2, source2, list, mainSubSource, messageSubSource, spaceSubSource, externalSubSource, ByteString.EMPTY);
    }

    public SearchHistoryInfo(String str, IntegrationSearchRequest.FilterParam filterParam, String str2, Source source2, List<String> list, MainSubSource mainSubSource, MessageSubSource messageSubSource, SpaceSubSource spaceSubSource, ExternalSubSource externalSubSource, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(mainSubSource, messageSubSource, spaceSubSource, externalSubSource, new Object[0]) <= 1) {
            this.query = str;
            this.filter_param = filterParam;
            this.id = str2;
            this.source = source2;
            this.external_ids = Internal.immutableCopyOf("external_ids", list);
            this.main_sub_source = mainSubSource;
            this.message_sub_source = messageSubSource;
            this.space_sub_source = spaceSubSource;
            this.external_sub_source = externalSubSource;
            return;
        }
        throw new IllegalArgumentException("at most one of main_sub_source, message_sub_source, space_sub_source, external_sub_source may be non-null");
    }
}
