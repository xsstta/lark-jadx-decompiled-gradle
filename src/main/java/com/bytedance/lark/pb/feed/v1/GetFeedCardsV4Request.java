package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.feed.v1.FeedFilter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetFeedCardsV4Request extends Message<GetFeedCardsV4Request, C17160a> {
    public static final ProtoAdapter<GetFeedCardsV4Request> ADAPTER = new C17161b();
    public static final Long DEFAULT_BOX_ID = 0L;
    public static final Integer DEFAULT_COUNT = 20;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final FeedFilter.Type DEFAULT_FILTER = FeedFilter.Type.INBOX;
    private static final long serialVersionUID = 0;
    public final Long box_id;
    public final Integer count;
    public final Long cursor;
    public final FeedCursor feed_cursor;
    public final FeedFilter.Type filter;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV4Request$b */
    private static final class C17161b extends ProtoAdapter<GetFeedCardsV4Request> {
        C17161b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedCardsV4Request.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedCardsV4Request getFeedCardsV4Request) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getFeedCardsV4Request.cursor != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getFeedCardsV4Request.cursor);
            } else {
                i = 0;
            }
            if (getFeedCardsV4Request.count != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, getFeedCardsV4Request.count);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getFeedCardsV4Request.filter != null) {
                i3 = FeedFilter.Type.ADAPTER.encodedSizeWithTag(3, getFeedCardsV4Request.filter);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getFeedCardsV4Request.box_id != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, getFeedCardsV4Request.box_id);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getFeedCardsV4Request.feed_cursor != null) {
                i5 = FeedCursor.ADAPTER.encodedSizeWithTag(5, getFeedCardsV4Request.feed_cursor);
            }
            return i8 + i5 + getFeedCardsV4Request.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedCardsV4Request decode(ProtoReader protoReader) throws IOException {
            C17160a aVar = new C17160a();
            aVar.f43908a = 0L;
            aVar.f43909b = 20;
            aVar.f43910c = FeedFilter.Type.INBOX;
            aVar.f43911d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43908a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43909b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f43910c = FeedFilter.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f43911d = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43912e = FeedCursor.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFeedCardsV4Request getFeedCardsV4Request) throws IOException {
            if (getFeedCardsV4Request.cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getFeedCardsV4Request.cursor);
            }
            if (getFeedCardsV4Request.count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getFeedCardsV4Request.count);
            }
            if (getFeedCardsV4Request.filter != null) {
                FeedFilter.Type.ADAPTER.encodeWithTag(protoWriter, 3, getFeedCardsV4Request.filter);
            }
            if (getFeedCardsV4Request.box_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getFeedCardsV4Request.box_id);
            }
            if (getFeedCardsV4Request.feed_cursor != null) {
                FeedCursor.ADAPTER.encodeWithTag(protoWriter, 5, getFeedCardsV4Request.feed_cursor);
            }
            protoWriter.writeBytes(getFeedCardsV4Request.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV4Request$a */
    public static final class C17160a extends Message.Builder<GetFeedCardsV4Request, C17160a> {

        /* renamed from: a */
        public Long f43908a;

        /* renamed from: b */
        public Integer f43909b;

        /* renamed from: c */
        public FeedFilter.Type f43910c;

        /* renamed from: d */
        public Long f43911d;

        /* renamed from: e */
        public FeedCursor f43912e;

        /* renamed from: a */
        public GetFeedCardsV4Request build() {
            return new GetFeedCardsV4Request(this.f43908a, this.f43909b, this.f43910c, this.f43911d, this.f43912e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17160a mo60437a(FeedCursor feedCursor) {
            this.f43912e = feedCursor;
            return this;
        }

        /* renamed from: a */
        public C17160a mo60438a(FeedFilter.Type type) {
            this.f43910c = type;
            return this;
        }

        /* renamed from: a */
        public C17160a mo60439a(Integer num) {
            this.f43909b = num;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17160a newBuilder() {
        C17160a aVar = new C17160a();
        aVar.f43908a = this.cursor;
        aVar.f43909b = this.count;
        aVar.f43910c = this.filter;
        aVar.f43911d = this.box_id;
        aVar.f43912e = this.feed_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetFeedCardsV4Request");
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        if (this.box_id != null) {
            sb.append(", box_id=");
            sb.append(this.box_id);
        }
        if (this.feed_cursor != null) {
            sb.append(", feed_cursor=");
            sb.append(this.feed_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedCardsV4Request{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedCardsV4Request(Long l, Integer num, FeedFilter.Type type, Long l2, FeedCursor feedCursor) {
        this(l, num, type, l2, feedCursor, ByteString.EMPTY);
    }

    public GetFeedCardsV4Request(Long l, Integer num, FeedFilter.Type type, Long l2, FeedCursor feedCursor, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.count = num;
        this.filter = type;
        this.box_id = l2;
        this.feed_cursor = feedCursor;
    }
}
