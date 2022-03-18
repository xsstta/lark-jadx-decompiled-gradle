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

public final class GetNextUnreadFeedCardsV4Request extends Message<GetNextUnreadFeedCardsV4Request, C17180a> {
    public static final ProtoAdapter<GetNextUnreadFeedCardsV4Request> ADAPTER = new C17181b();
    public static final Integer DEFAULT_ADDITIONAL_COUNT = 0;
    public static final FeedFilter.Type DEFAULT_FILTER = FeedFilter.Type.INBOX;
    private static final long serialVersionUID = 0;
    public final Integer additional_count;
    public final FeedCursor current_cursor;
    public final String current_id;
    public final FeedFilter.Type filter;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsV4Request$b */
    private static final class C17181b extends ProtoAdapter<GetNextUnreadFeedCardsV4Request> {
        C17181b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNextUnreadFeedCardsV4Request.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNextUnreadFeedCardsV4Request getNextUnreadFeedCardsV4Request) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getNextUnreadFeedCardsV4Request.current_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getNextUnreadFeedCardsV4Request.current_id);
            } else {
                i = 0;
            }
            if (getNextUnreadFeedCardsV4Request.filter != null) {
                i2 = FeedFilter.Type.ADAPTER.encodedSizeWithTag(2, getNextUnreadFeedCardsV4Request.filter);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (getNextUnreadFeedCardsV4Request.additional_count != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, getNextUnreadFeedCardsV4Request.additional_count);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (getNextUnreadFeedCardsV4Request.current_cursor != null) {
                i4 = FeedCursor.ADAPTER.encodedSizeWithTag(4, getNextUnreadFeedCardsV4Request.current_cursor);
            }
            return i6 + i4 + getNextUnreadFeedCardsV4Request.unknownFields().size();
        }

        /* renamed from: a */
        public GetNextUnreadFeedCardsV4Request decode(ProtoReader protoReader) throws IOException {
            C17180a aVar = new C17180a();
            aVar.f43948a = "";
            aVar.f43949b = FeedFilter.Type.INBOX;
            aVar.f43950c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43948a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f43949b = FeedFilter.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f43950c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43951d = FeedCursor.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNextUnreadFeedCardsV4Request getNextUnreadFeedCardsV4Request) throws IOException {
            if (getNextUnreadFeedCardsV4Request.current_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getNextUnreadFeedCardsV4Request.current_id);
            }
            if (getNextUnreadFeedCardsV4Request.filter != null) {
                FeedFilter.Type.ADAPTER.encodeWithTag(protoWriter, 2, getNextUnreadFeedCardsV4Request.filter);
            }
            if (getNextUnreadFeedCardsV4Request.additional_count != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getNextUnreadFeedCardsV4Request.additional_count);
            }
            if (getNextUnreadFeedCardsV4Request.current_cursor != null) {
                FeedCursor.ADAPTER.encodeWithTag(protoWriter, 4, getNextUnreadFeedCardsV4Request.current_cursor);
            }
            protoWriter.writeBytes(getNextUnreadFeedCardsV4Request.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsV4Request$a */
    public static final class C17180a extends Message.Builder<GetNextUnreadFeedCardsV4Request, C17180a> {

        /* renamed from: a */
        public String f43948a;

        /* renamed from: b */
        public FeedFilter.Type f43949b;

        /* renamed from: c */
        public Integer f43950c;

        /* renamed from: d */
        public FeedCursor f43951d;

        /* renamed from: a */
        public GetNextUnreadFeedCardsV4Request build() {
            return new GetNextUnreadFeedCardsV4Request(this.f43948a, this.f43949b, this.f43950c, this.f43951d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17180a mo60487a(FeedCursor feedCursor) {
            this.f43951d = feedCursor;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17180a newBuilder() {
        C17180a aVar = new C17180a();
        aVar.f43948a = this.current_id;
        aVar.f43949b = this.filter;
        aVar.f43950c = this.additional_count;
        aVar.f43951d = this.current_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetNextUnreadFeedCardsV4Request");
        StringBuilder sb = new StringBuilder();
        if (this.current_id != null) {
            sb.append(", current_id=");
            sb.append(this.current_id);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        if (this.additional_count != null) {
            sb.append(", additional_count=");
            sb.append(this.additional_count);
        }
        if (this.current_cursor != null) {
            sb.append(", current_cursor=");
            sb.append(this.current_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNextUnreadFeedCardsV4Request{");
        replace.append('}');
        return replace.toString();
    }

    public GetNextUnreadFeedCardsV4Request(String str, FeedFilter.Type type, Integer num, FeedCursor feedCursor) {
        this(str, type, num, feedCursor, ByteString.EMPTY);
    }

    public GetNextUnreadFeedCardsV4Request(String str, FeedFilter.Type type, Integer num, FeedCursor feedCursor, ByteString byteString) {
        super(ADAPTER, byteString);
        this.current_id = str;
        this.filter = type;
        this.additional_count = num;
        this.current_cursor = feedCursor;
    }
}
