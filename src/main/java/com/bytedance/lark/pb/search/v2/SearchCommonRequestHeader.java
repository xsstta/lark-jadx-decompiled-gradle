package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v2.BaseEntity;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SearchCommonRequestHeader extends Message<SearchCommonRequestHeader, C19015a> {
    public static final ProtoAdapter<SearchCommonRequestHeader> ADAPTER = new C19016b();
    public static final Boolean DEFAULT_IS_FORCE = false;
    public static final Integer DEFAULT_SESSION_SEQ_ID = 0;
    private static final long serialVersionUID = 0;
    public final BaseEntity.SearchExtras extra_params;
    public final Boolean is_force;
    public final String pagination_token;
    public final String query;
    public final BaseEntity.SearchContext search_context;
    public final String search_session;
    public final Integer session_seq_id;
    public final ColdAndHotStorageInfo storage_info;
    public final Layout summary_layout;
    public final Layout title_layout;

    public static final class Layout extends Message<Layout, C19013a> {
        public static final ProtoAdapter<Layout> ADAPTER = new C19014b();
        public static final Integer DEFAULT_LINE = 0;
        public static final Integer DEFAULT_WIDTH = 0;
        private static final long serialVersionUID = 0;
        public final Integer line;
        public final Integer width;

        /* renamed from: com.bytedance.lark.pb.search.v2.SearchCommonRequestHeader$Layout$b */
        private static final class C19014b extends ProtoAdapter<Layout> {
            C19014b() {
                super(FieldEncoding.LENGTH_DELIMITED, Layout.class);
            }

            /* renamed from: a */
            public int encodedSize(Layout layout) {
                int i;
                int i2 = 0;
                if (layout.line != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, layout.line);
                } else {
                    i = 0;
                }
                if (layout.width != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, layout.width);
                }
                return i + i2 + layout.unknownFields().size();
            }

            /* renamed from: a */
            public Layout decode(ProtoReader protoReader) throws IOException {
                C19013a aVar = new C19013a();
                aVar.f47015a = 0;
                aVar.f47016b = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f47015a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47016b = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Layout layout) throws IOException {
                if (layout.line != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, layout.line);
                }
                if (layout.width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, layout.width);
                }
                protoWriter.writeBytes(layout.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.search.v2.SearchCommonRequestHeader$Layout$a */
        public static final class C19013a extends Message.Builder<Layout, C19013a> {

            /* renamed from: a */
            public Integer f47015a;

            /* renamed from: b */
            public Integer f47016b;

            /* renamed from: a */
            public Layout build() {
                return new Layout(this.f47015a, this.f47016b, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C19013a mo65088a(Integer num) {
                this.f47015a = num;
                return this;
            }

            /* renamed from: b */
            public C19013a mo65090b(Integer num) {
                this.f47016b = num;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C19013a newBuilder() {
            C19013a aVar = new C19013a();
            aVar.f47015a = this.line;
            aVar.f47016b = this.width;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("search", "Layout");
            StringBuilder sb = new StringBuilder();
            if (this.line != null) {
                sb.append(", line=");
                sb.append(this.line);
            }
            if (this.width != null) {
                sb.append(", width=");
                sb.append(this.width);
            }
            StringBuilder replace = sb.replace(0, 2, "Layout{");
            replace.append('}');
            return replace.toString();
        }

        public Layout(Integer num, Integer num2) {
            this(num, num2, ByteString.EMPTY);
        }

        public Layout(Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.line = num;
            this.width = num2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchCommonRequestHeader$b */
    private static final class C19016b extends ProtoAdapter<SearchCommonRequestHeader> {
        C19016b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchCommonRequestHeader.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchCommonRequestHeader searchCommonRequestHeader) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchCommonRequestHeader.search_session) + ProtoAdapter.INT32.encodedSizeWithTag(2, searchCommonRequestHeader.session_seq_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, searchCommonRequestHeader.query);
            int i7 = 0;
            if (searchCommonRequestHeader.pagination_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, searchCommonRequestHeader.pagination_token);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (searchCommonRequestHeader.search_context != null) {
                i2 = BaseEntity.SearchContext.ADAPTER.encodedSizeWithTag(5, searchCommonRequestHeader.search_context);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (searchCommonRequestHeader.extra_params != null) {
                i3 = BaseEntity.SearchExtras.ADAPTER.encodedSizeWithTag(6, searchCommonRequestHeader.extra_params);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (searchCommonRequestHeader.is_force != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, searchCommonRequestHeader.is_force);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (searchCommonRequestHeader.title_layout != null) {
                i5 = Layout.ADAPTER.encodedSizeWithTag(8, searchCommonRequestHeader.title_layout);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (searchCommonRequestHeader.summary_layout != null) {
                i6 = Layout.ADAPTER.encodedSizeWithTag(9, searchCommonRequestHeader.summary_layout);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (searchCommonRequestHeader.storage_info != null) {
                i7 = ColdAndHotStorageInfo.ADAPTER.encodedSizeWithTag(10, searchCommonRequestHeader.storage_info);
            }
            return i13 + i7 + searchCommonRequestHeader.unknownFields().size();
        }

        /* renamed from: a */
        public SearchCommonRequestHeader decode(ProtoReader protoReader) throws IOException {
            C19015a aVar = new C19015a();
            aVar.f47017a = "";
            aVar.f47018b = 0;
            aVar.f47019c = "";
            aVar.f47020d = "";
            aVar.f47023g = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47017a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f47018b = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            aVar.f47019c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47020d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47021e = BaseEntity.SearchContext.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47022f = BaseEntity.SearchExtras.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47023g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47024h = Layout.ADAPTER.decode(protoReader);
                            break;
                        case 9:
                            aVar.f47025i = Layout.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f47026j = ColdAndHotStorageInfo.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchCommonRequestHeader searchCommonRequestHeader) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchCommonRequestHeader.search_session);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, searchCommonRequestHeader.session_seq_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, searchCommonRequestHeader.query);
            if (searchCommonRequestHeader.pagination_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchCommonRequestHeader.pagination_token);
            }
            if (searchCommonRequestHeader.search_context != null) {
                BaseEntity.SearchContext.ADAPTER.encodeWithTag(protoWriter, 5, searchCommonRequestHeader.search_context);
            }
            if (searchCommonRequestHeader.extra_params != null) {
                BaseEntity.SearchExtras.ADAPTER.encodeWithTag(protoWriter, 6, searchCommonRequestHeader.extra_params);
            }
            if (searchCommonRequestHeader.is_force != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, searchCommonRequestHeader.is_force);
            }
            if (searchCommonRequestHeader.title_layout != null) {
                Layout.ADAPTER.encodeWithTag(protoWriter, 8, searchCommonRequestHeader.title_layout);
            }
            if (searchCommonRequestHeader.summary_layout != null) {
                Layout.ADAPTER.encodeWithTag(protoWriter, 9, searchCommonRequestHeader.summary_layout);
            }
            if (searchCommonRequestHeader.storage_info != null) {
                ColdAndHotStorageInfo.ADAPTER.encodeWithTag(protoWriter, 10, searchCommonRequestHeader.storage_info);
            }
            protoWriter.writeBytes(searchCommonRequestHeader.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19015a newBuilder() {
        C19015a aVar = new C19015a();
        aVar.f47017a = this.search_session;
        aVar.f47018b = this.session_seq_id;
        aVar.f47019c = this.query;
        aVar.f47020d = this.pagination_token;
        aVar.f47021e = this.search_context;
        aVar.f47022f = this.extra_params;
        aVar.f47023g = this.is_force;
        aVar.f47024h = this.title_layout;
        aVar.f47025i = this.summary_layout;
        aVar.f47026j = this.storage_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SearchCommonRequestHeader$a */
    public static final class C19015a extends Message.Builder<SearchCommonRequestHeader, C19015a> {

        /* renamed from: a */
        public String f47017a;

        /* renamed from: b */
        public Integer f47018b;

        /* renamed from: c */
        public String f47019c;

        /* renamed from: d */
        public String f47020d;

        /* renamed from: e */
        public BaseEntity.SearchContext f47021e;

        /* renamed from: f */
        public BaseEntity.SearchExtras f47022f;

        /* renamed from: g */
        public Boolean f47023g;

        /* renamed from: h */
        public Layout f47024h;

        /* renamed from: i */
        public Layout f47025i;

        /* renamed from: j */
        public ColdAndHotStorageInfo f47026j;

        /* renamed from: a */
        public SearchCommonRequestHeader build() {
            Integer num;
            String str;
            String str2 = this.f47017a;
            if (str2 != null && (num = this.f47018b) != null && (str = this.f47019c) != null) {
                return new SearchCommonRequestHeader(str2, num, str, this.f47020d, this.f47021e, this.f47022f, this.f47023g, this.f47024h, this.f47025i, this.f47026j, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "search_session", this.f47018b, "session_seq_id", this.f47019c, SearchIntents.EXTRA_QUERY);
        }

        /* renamed from: a */
        public C19015a mo65094a(BaseEntity.SearchContext searchContext) {
            this.f47021e = searchContext;
            return this;
        }

        /* renamed from: b */
        public C19015a mo65101b(Layout layout) {
            this.f47025i = layout;
            return this;
        }

        /* renamed from: c */
        public C19015a mo65103c(String str) {
            this.f47020d = str;
            return this;
        }

        /* renamed from: a */
        public C19015a mo65095a(BaseEntity.SearchExtras searchExtras) {
            this.f47022f = searchExtras;
            return this;
        }

        /* renamed from: b */
        public C19015a mo65102b(String str) {
            this.f47019c = str;
            return this;
        }

        /* renamed from: a */
        public C19015a mo65096a(Layout layout) {
            this.f47024h = layout;
            return this;
        }

        /* renamed from: a */
        public C19015a mo65097a(Boolean bool) {
            this.f47023g = bool;
            return this;
        }

        /* renamed from: a */
        public C19015a mo65098a(Integer num) {
            this.f47018b = num;
            return this;
        }

        /* renamed from: a */
        public C19015a mo65099a(String str) {
            this.f47017a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SearchCommonRequestHeader");
        StringBuilder sb = new StringBuilder();
        sb.append(", search_session=");
        sb.append(this.search_session);
        sb.append(", session_seq_id=");
        sb.append(this.session_seq_id);
        sb.append(", query=");
        sb.append(this.query);
        if (this.pagination_token != null) {
            sb.append(", pagination_token=");
            sb.append(this.pagination_token);
        }
        if (this.search_context != null) {
            sb.append(", search_context=");
            sb.append(this.search_context);
        }
        if (this.extra_params != null) {
            sb.append(", extra_params=");
            sb.append(this.extra_params);
        }
        if (this.is_force != null) {
            sb.append(", is_force=");
            sb.append(this.is_force);
        }
        if (this.title_layout != null) {
            sb.append(", title_layout=");
            sb.append(this.title_layout);
        }
        if (this.summary_layout != null) {
            sb.append(", summary_layout=");
            sb.append(this.summary_layout);
        }
        if (this.storage_info != null) {
            sb.append(", storage_info=");
            sb.append(this.storage_info);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchCommonRequestHeader{");
        replace.append('}');
        return replace.toString();
    }

    public SearchCommonRequestHeader(String str, Integer num, String str2, String str3, BaseEntity.SearchContext searchContext, BaseEntity.SearchExtras searchExtras, Boolean bool, Layout layout, Layout layout2, ColdAndHotStorageInfo coldAndHotStorageInfo) {
        this(str, num, str2, str3, searchContext, searchExtras, bool, layout, layout2, coldAndHotStorageInfo, ByteString.EMPTY);
    }

    public SearchCommonRequestHeader(String str, Integer num, String str2, String str3, BaseEntity.SearchContext searchContext, BaseEntity.SearchExtras searchExtras, Boolean bool, Layout layout, Layout layout2, ColdAndHotStorageInfo coldAndHotStorageInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_session = str;
        this.session_seq_id = num;
        this.query = str2;
        this.pagination_token = str3;
        this.search_context = searchContext;
        this.extra_params = searchExtras;
        this.is_force = bool;
        this.title_layout = layout;
        this.summary_layout = layout2;
        this.storage_info = coldAndHotStorageInfo;
    }
}
