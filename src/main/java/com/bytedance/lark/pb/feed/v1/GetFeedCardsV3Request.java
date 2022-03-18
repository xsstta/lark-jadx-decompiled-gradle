package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetFeedCardsV3Request extends Message<GetFeedCardsV3Request, C17156a> {
    public static final ProtoAdapter<GetFeedCardsV3Request> ADAPTER = new C17157b();
    public static final Integer DEFAULT_COUNT = 20;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final GetType DEFAULT_GET_TYPE = GetType.REFRESH;
    private static final long serialVersionUID = 0;
    public final Integer count;
    public final Long cursor;
    public final CursorRange cursor_range;
    public final String feed_card_id;
    public final FeedFilter filter;
    public final GetType get_type;

    public enum GetType implements WireEnum {
        REFRESH(1),
        LOAD_MORE(2),
        BETWEEN_CURSOR(3);
        
        public static final ProtoAdapter<GetType> ADAPTER = ProtoAdapter.newEnumAdapter(GetType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static GetType fromValue(int i) {
            if (i == 1) {
                return REFRESH;
            }
            if (i == 2) {
                return LOAD_MORE;
            }
            if (i != 3) {
                return null;
            }
            return BETWEEN_CURSOR;
        }

        private GetType(int i) {
            this.value = i;
        }
    }

    public static final class CursorRange extends Message<CursorRange, C17154a> {
        public static final ProtoAdapter<CursorRange> ADAPTER = new C17155b();
        public static final Long DEFAULT_MAX_CURSOR = 0L;
        public static final Long DEFAULT_MIN_CURSOR = 0L;
        private static final long serialVersionUID = 0;
        public final Long max_cursor;
        public final Long min_cursor;

        /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Request$CursorRange$b */
        private static final class C17155b extends ProtoAdapter<CursorRange> {
            C17155b() {
                super(FieldEncoding.LENGTH_DELIMITED, CursorRange.class);
            }

            /* renamed from: a */
            public int encodedSize(CursorRange cursorRange) {
                return ProtoAdapter.INT64.encodedSizeWithTag(1, cursorRange.max_cursor) + ProtoAdapter.INT64.encodedSizeWithTag(2, cursorRange.min_cursor) + cursorRange.unknownFields().size();
            }

            /* renamed from: a */
            public CursorRange decode(ProtoReader protoReader) throws IOException {
                C17154a aVar = new C17154a();
                aVar.f43894a = 0L;
                aVar.f43895b = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43894a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43895b = ProtoAdapter.INT64.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CursorRange cursorRange) throws IOException {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, cursorRange.max_cursor);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, cursorRange.min_cursor);
                protoWriter.writeBytes(cursorRange.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17154a newBuilder() {
            C17154a aVar = new C17154a();
            aVar.f43894a = this.max_cursor;
            aVar.f43895b = this.min_cursor;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Request$CursorRange$a */
        public static final class C17154a extends Message.Builder<CursorRange, C17154a> {

            /* renamed from: a */
            public Long f43894a;

            /* renamed from: b */
            public Long f43895b;

            /* renamed from: a */
            public CursorRange build() {
                Long l;
                Long l2 = this.f43894a;
                if (l2 != null && (l = this.f43895b) != null) {
                    return new CursorRange(l2, l, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(l2, "max_cursor", this.f43895b, "min_cursor");
            }

            /* renamed from: a */
            public C17154a mo60417a(Long l) {
                this.f43894a = l;
                return this;
            }

            /* renamed from: b */
            public C17154a mo60419b(Long l) {
                this.f43895b = l;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("feed", "CursorRange");
            StringBuilder sb = new StringBuilder();
            sb.append(", max_cursor=");
            sb.append(this.max_cursor);
            sb.append(", min_cursor=");
            sb.append(this.min_cursor);
            StringBuilder replace = sb.replace(0, 2, "CursorRange{");
            replace.append('}');
            return replace.toString();
        }

        public CursorRange(Long l, Long l2) {
            this(l, l2, ByteString.EMPTY);
        }

        public CursorRange(Long l, Long l2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.max_cursor = l;
            this.min_cursor = l2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Request$b */
    private static final class C17157b extends ProtoAdapter<GetFeedCardsV3Request> {
        C17157b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedCardsV3Request.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedCardsV3Request getFeedCardsV3Request) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (getFeedCardsV3Request.get_type != null) {
                i = GetType.ADAPTER.encodedSizeWithTag(1, getFeedCardsV3Request.get_type);
            } else {
                i = 0;
            }
            if (getFeedCardsV3Request.feed_card_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getFeedCardsV3Request.feed_card_id);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (getFeedCardsV3Request.cursor != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getFeedCardsV3Request.cursor);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (getFeedCardsV3Request.count != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(4, getFeedCardsV3Request.count);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (getFeedCardsV3Request.cursor_range != null) {
                i5 = CursorRange.ADAPTER.encodedSizeWithTag(5, getFeedCardsV3Request.cursor_range);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (getFeedCardsV3Request.filter != null) {
                i6 = FeedFilter.ADAPTER.encodedSizeWithTag(6, getFeedCardsV3Request.filter);
            }
            return i10 + i6 + getFeedCardsV3Request.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedCardsV3Request decode(ProtoReader protoReader) throws IOException {
            C17156a aVar = new C17156a();
            aVar.f43896a = GetType.REFRESH;
            aVar.f43897b = "";
            aVar.f43898c = 0L;
            aVar.f43899d = 20;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f43896a = GetType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f43897b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43898c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43899d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43900e = CursorRange.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43901f = FeedFilter.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetFeedCardsV3Request getFeedCardsV3Request) throws IOException {
            if (getFeedCardsV3Request.get_type != null) {
                GetType.ADAPTER.encodeWithTag(protoWriter, 1, getFeedCardsV3Request.get_type);
            }
            if (getFeedCardsV3Request.feed_card_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getFeedCardsV3Request.feed_card_id);
            }
            if (getFeedCardsV3Request.cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getFeedCardsV3Request.cursor);
            }
            if (getFeedCardsV3Request.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, getFeedCardsV3Request.count);
            }
            if (getFeedCardsV3Request.cursor_range != null) {
                CursorRange.ADAPTER.encodeWithTag(protoWriter, 5, getFeedCardsV3Request.cursor_range);
            }
            if (getFeedCardsV3Request.filter != null) {
                FeedFilter.ADAPTER.encodeWithTag(protoWriter, 6, getFeedCardsV3Request.filter);
            }
            protoWriter.writeBytes(getFeedCardsV3Request.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17156a newBuilder() {
        C17156a aVar = new C17156a();
        aVar.f43896a = this.get_type;
        aVar.f43897b = this.feed_card_id;
        aVar.f43898c = this.cursor;
        aVar.f43899d = this.count;
        aVar.f43900e = this.cursor_range;
        aVar.f43901f = this.filter;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetFeedCardsV3Request");
        StringBuilder sb = new StringBuilder();
        if (this.get_type != null) {
            sb.append(", get_type=");
            sb.append(this.get_type);
        }
        if (this.feed_card_id != null) {
            sb.append(", feed_card_id=");
            sb.append(this.feed_card_id);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.cursor_range != null) {
            sb.append(", cursor_range=");
            sb.append(this.cursor_range);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedCardsV3Request{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Request$a */
    public static final class C17156a extends Message.Builder<GetFeedCardsV3Request, C17156a> {

        /* renamed from: a */
        public GetType f43896a;

        /* renamed from: b */
        public String f43897b;

        /* renamed from: c */
        public Long f43898c;

        /* renamed from: d */
        public Integer f43899d;

        /* renamed from: e */
        public CursorRange f43900e;

        /* renamed from: f */
        public FeedFilter f43901f;

        /* renamed from: a */
        public GetFeedCardsV3Request build() {
            return new GetFeedCardsV3Request(this.f43896a, this.f43897b, this.f43898c, this.f43899d, this.f43900e, this.f43901f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17156a mo60423a(FeedFilter feedFilter) {
            this.f43901f = feedFilter;
            return this;
        }

        /* renamed from: a */
        public C17156a mo60424a(CursorRange cursorRange) {
            this.f43900e = cursorRange;
            return this;
        }

        /* renamed from: a */
        public C17156a mo60425a(GetType getType) {
            this.f43896a = getType;
            return this;
        }

        /* renamed from: a */
        public C17156a mo60426a(Integer num) {
            this.f43899d = num;
            return this;
        }

        /* renamed from: a */
        public C17156a mo60427a(Long l) {
            this.f43898c = l;
            return this;
        }

        /* renamed from: a */
        public C17156a mo60428a(String str) {
            this.f43897b = str;
            return this;
        }
    }

    public GetFeedCardsV3Request(GetType getType, String str, Long l, Integer num, CursorRange cursorRange, FeedFilter feedFilter) {
        this(getType, str, l, num, cursorRange, feedFilter, ByteString.EMPTY);
    }

    public GetFeedCardsV3Request(GetType getType, String str, Long l, Integer num, CursorRange cursorRange, FeedFilter feedFilter, ByteString byteString) {
        super(ADAPTER, byteString);
        this.get_type = getType;
        this.feed_card_id = str;
        this.cursor = l;
        this.count = num;
        this.cursor_range = cursorRange;
        this.filter = feedFilter;
    }
}
