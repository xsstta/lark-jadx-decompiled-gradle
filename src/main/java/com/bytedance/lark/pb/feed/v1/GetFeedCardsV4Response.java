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

public final class GetFeedCardsV4Response extends Message<GetFeedCardsV4Response, C17162a> {
    public static final ProtoAdapter<GetFeedCardsV4Response> ADAPTER = new C17163b();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    public final FeedCursor feed_cursor;
    public final Long next_cursor;
    public final List<FeedEntityPreview> previews;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV4Response$b */
    private static final class C17163b extends ProtoAdapter<GetFeedCardsV4Response> {
        C17163b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedCardsV4Response.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedCardsV4Response getFeedCardsV4Response) {
            int i;
            int encodedSizeWithTag = FeedEntityPreview.ADAPTER.asRepeated().encodedSizeWithTag(1, getFeedCardsV4Response.previews);
            int i2 = 0;
            if (getFeedCardsV4Response.next_cursor != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getFeedCardsV4Response.next_cursor);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getFeedCardsV4Response.feed_cursor != null) {
                i2 = FeedCursor.ADAPTER.encodedSizeWithTag(3, getFeedCardsV4Response.feed_cursor);
            }
            return i3 + i2 + getFeedCardsV4Response.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedCardsV4Response decode(ProtoReader protoReader) throws IOException {
            C17162a aVar = new C17162a();
            aVar.f43914b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43913a.add(FeedEntityPreview.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43914b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43915c = FeedCursor.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFeedCardsV4Response getFeedCardsV4Response) throws IOException {
            FeedEntityPreview.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getFeedCardsV4Response.previews);
            if (getFeedCardsV4Response.next_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getFeedCardsV4Response.next_cursor);
            }
            if (getFeedCardsV4Response.feed_cursor != null) {
                FeedCursor.ADAPTER.encodeWithTag(protoWriter, 3, getFeedCardsV4Response.feed_cursor);
            }
            protoWriter.writeBytes(getFeedCardsV4Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV4Response$a */
    public static final class C17162a extends Message.Builder<GetFeedCardsV4Response, C17162a> {

        /* renamed from: a */
        public List<FeedEntityPreview> f43913a = Internal.newMutableList();

        /* renamed from: b */
        public Long f43914b;

        /* renamed from: c */
        public FeedCursor f43915c;

        /* renamed from: a */
        public GetFeedCardsV4Response build() {
            return new GetFeedCardsV4Response(this.f43913a, this.f43914b, this.f43915c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17162a newBuilder() {
        C17162a aVar = new C17162a();
        aVar.f43913a = Internal.copyOf("previews", this.previews);
        aVar.f43914b = this.next_cursor;
        aVar.f43915c = this.feed_cursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetFeedCardsV4Response");
        StringBuilder sb = new StringBuilder();
        if (!this.previews.isEmpty()) {
            sb.append(", previews=");
            sb.append(this.previews);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.feed_cursor != null) {
            sb.append(", feed_cursor=");
            sb.append(this.feed_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedCardsV4Response{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedCardsV4Response(List<FeedEntityPreview> list, Long l, FeedCursor feedCursor) {
        this(list, l, feedCursor, ByteString.EMPTY);
    }

    public GetFeedCardsV4Response(List<FeedEntityPreview> list, Long l, FeedCursor feedCursor, ByteString byteString) {
        super(ADAPTER, byteString);
        this.previews = Internal.immutableCopyOf("previews", list);
        this.next_cursor = l;
        this.feed_cursor = feedCursor;
    }
}
