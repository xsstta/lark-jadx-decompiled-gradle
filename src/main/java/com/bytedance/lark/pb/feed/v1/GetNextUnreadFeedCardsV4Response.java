package com.bytedance.lark.pb.feed.v1;

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

public final class GetNextUnreadFeedCardsV4Response extends Message<GetNextUnreadFeedCardsV4Response, C17182a> {
    public static final ProtoAdapter<GetNextUnreadFeedCardsV4Response> ADAPTER = new C17183b();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    public final FeedCursor feed_cursor;
    public final Long next_cursor;
    public final String next_id;
    public final List<FeedEntityPreview> previews;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsV4Response$b */
    private static final class C17183b extends ProtoAdapter<GetNextUnreadFeedCardsV4Response> {
        C17183b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNextUnreadFeedCardsV4Response.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNextUnreadFeedCardsV4Response getNextUnreadFeedCardsV4Response) {
            int i;
            int i2;
            int i3 = 0;
            if (getNextUnreadFeedCardsV4Response.next_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getNextUnreadFeedCardsV4Response.next_id);
            } else {
                i = 0;
            }
            if (getNextUnreadFeedCardsV4Response.next_cursor != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getNextUnreadFeedCardsV4Response.next_cursor);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + FeedEntityPreview.ADAPTER.asRepeated().encodedSizeWithTag(3, getNextUnreadFeedCardsV4Response.previews);
            if (getNextUnreadFeedCardsV4Response.feed_cursor != null) {
                i3 = FeedCursor.ADAPTER.encodedSizeWithTag(4, getNextUnreadFeedCardsV4Response.feed_cursor);
            }
            return encodedSizeWithTag + i3 + getNextUnreadFeedCardsV4Response.unknownFields().size();
        }

        /* renamed from: a */
        public GetNextUnreadFeedCardsV4Response decode(ProtoReader protoReader) throws IOException {
            C17182a aVar = new C17182a();
            aVar.f43952a = "";
            aVar.f43953b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43952a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43953b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43954c.add(FeedEntityPreview.ADAPTER.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43955d = FeedCursor.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNextUnreadFeedCardsV4Response getNextUnreadFeedCardsV4Response) throws IOException {
            if (getNextUnreadFeedCardsV4Response.next_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getNextUnreadFeedCardsV4Response.next_id);
            }
            if (getNextUnreadFeedCardsV4Response.next_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getNextUnreadFeedCardsV4Response.next_cursor);
            }
            FeedEntityPreview.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getNextUnreadFeedCardsV4Response.previews);
            if (getNextUnreadFeedCardsV4Response.feed_cursor != null) {
                FeedCursor.ADAPTER.encodeWithTag(protoWriter, 4, getNextUnreadFeedCardsV4Response.feed_cursor);
            }
            protoWriter.writeBytes(getNextUnreadFeedCardsV4Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsV4Response$a */
    public static final class C17182a extends Message.Builder<GetNextUnreadFeedCardsV4Response, C17182a> {

        /* renamed from: a */
        public String f43952a;

        /* renamed from: b */
        public Long f43953b;

        /* renamed from: c */
        public List<FeedEntityPreview> f43954c = Internal.newMutableList();

        /* renamed from: d */
        public FeedCursor f43955d;

        /* renamed from: a */
        public GetNextUnreadFeedCardsV4Response build() {
            return new GetNextUnreadFeedCardsV4Response(this.f43952a, this.f43953b, this.f43954c, this.f43955d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17182a newBuilder() {
        C17182a aVar = new C17182a();
        aVar.f43952a = this.next_id;
        aVar.f43953b = this.next_cursor;
        aVar.f43954c = Internal.copyOf("previews", this.previews);
        aVar.f43955d = this.feed_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetNextUnreadFeedCardsV4Response");
        StringBuilder sb = new StringBuilder();
        if (this.next_id != null) {
            sb.append(", next_id=");
            sb.append(this.next_id);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (!this.previews.isEmpty()) {
            sb.append(", previews=");
            sb.append(this.previews);
        }
        if (this.feed_cursor != null) {
            sb.append(", feed_cursor=");
            sb.append(this.feed_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNextUnreadFeedCardsV4Response{");
        replace.append('}');
        return replace.toString();
    }

    public GetNextUnreadFeedCardsV4Response(String str, Long l, List<FeedEntityPreview> list, FeedCursor feedCursor) {
        this(str, l, list, feedCursor, ByteString.EMPTY);
    }

    public GetNextUnreadFeedCardsV4Response(String str, Long l, List<FeedEntityPreview> list, FeedCursor feedCursor, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_id = str;
        this.next_cursor = l;
        this.previews = Internal.immutableCopyOf("previews", list);
        this.feed_cursor = feedCursor;
    }
}
