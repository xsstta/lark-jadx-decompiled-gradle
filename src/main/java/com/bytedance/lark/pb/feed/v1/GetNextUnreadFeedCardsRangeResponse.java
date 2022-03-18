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

public final class GetNextUnreadFeedCardsRangeResponse extends Message<GetNextUnreadFeedCardsRangeResponse, C17178a> {
    public static final ProtoAdapter<GetNextUnreadFeedCardsRangeResponse> ADAPTER = new C17179b();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    private static final long serialVersionUID = 0;
    public final List<Cursor> continuous_cursors;
    public final List<FeedEntityPreview> entity_previews;
    public final List<GroupFeedCursor> feed_continuous_cursor;
    public final FeedFilter feed_filter;
    public final String next_channel_id;
    public final Long next_cursor;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsRangeResponse$b */
    private static final class C17179b extends ProtoAdapter<GetNextUnreadFeedCardsRangeResponse> {
        C17179b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNextUnreadFeedCardsRangeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNextUnreadFeedCardsRangeResponse getNextUnreadFeedCardsRangeResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (getNextUnreadFeedCardsRangeResponse.feed_filter != null) {
                i = FeedFilter.ADAPTER.encodedSizeWithTag(1, getNextUnreadFeedCardsRangeResponse.feed_filter);
            } else {
                i = 0;
            }
            if (getNextUnreadFeedCardsRangeResponse.next_channel_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getNextUnreadFeedCardsRangeResponse.next_channel_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getNextUnreadFeedCardsRangeResponse.next_cursor != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getNextUnreadFeedCardsRangeResponse.next_cursor);
            }
            return i4 + i3 + Cursor.ADAPTER.asRepeated().encodedSizeWithTag(4, getNextUnreadFeedCardsRangeResponse.continuous_cursors) + FeedEntityPreview.ADAPTER.asRepeated().encodedSizeWithTag(5, getNextUnreadFeedCardsRangeResponse.entity_previews) + GroupFeedCursor.ADAPTER.asRepeated().encodedSizeWithTag(6, getNextUnreadFeedCardsRangeResponse.feed_continuous_cursor) + getNextUnreadFeedCardsRangeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetNextUnreadFeedCardsRangeResponse decode(ProtoReader protoReader) throws IOException {
            C17178a aVar = new C17178a();
            aVar.f43943b = "";
            aVar.f43944c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43942a = FeedFilter.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43943b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43944c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43945d.add(Cursor.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f43946e.add(FeedEntityPreview.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f43947f.add(GroupFeedCursor.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, GetNextUnreadFeedCardsRangeResponse getNextUnreadFeedCardsRangeResponse) throws IOException {
            if (getNextUnreadFeedCardsRangeResponse.feed_filter != null) {
                FeedFilter.ADAPTER.encodeWithTag(protoWriter, 1, getNextUnreadFeedCardsRangeResponse.feed_filter);
            }
            if (getNextUnreadFeedCardsRangeResponse.next_channel_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getNextUnreadFeedCardsRangeResponse.next_channel_id);
            }
            if (getNextUnreadFeedCardsRangeResponse.next_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getNextUnreadFeedCardsRangeResponse.next_cursor);
            }
            Cursor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getNextUnreadFeedCardsRangeResponse.continuous_cursors);
            FeedEntityPreview.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, getNextUnreadFeedCardsRangeResponse.entity_previews);
            GroupFeedCursor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, getNextUnreadFeedCardsRangeResponse.feed_continuous_cursor);
            protoWriter.writeBytes(getNextUnreadFeedCardsRangeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetNextUnreadFeedCardsRangeResponse$a */
    public static final class C17178a extends Message.Builder<GetNextUnreadFeedCardsRangeResponse, C17178a> {

        /* renamed from: a */
        public FeedFilter f43942a;

        /* renamed from: b */
        public String f43943b;

        /* renamed from: c */
        public Long f43944c;

        /* renamed from: d */
        public List<Cursor> f43945d = Internal.newMutableList();

        /* renamed from: e */
        public List<FeedEntityPreview> f43946e = Internal.newMutableList();

        /* renamed from: f */
        public List<GroupFeedCursor> f43947f = Internal.newMutableList();

        /* renamed from: a */
        public GetNextUnreadFeedCardsRangeResponse build() {
            return new GetNextUnreadFeedCardsRangeResponse(this.f43942a, this.f43943b, this.f43944c, this.f43945d, this.f43946e, this.f43947f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17178a newBuilder() {
        C17178a aVar = new C17178a();
        aVar.f43942a = this.feed_filter;
        aVar.f43943b = this.next_channel_id;
        aVar.f43944c = this.next_cursor;
        aVar.f43945d = Internal.copyOf("continuous_cursors", this.continuous_cursors);
        aVar.f43946e = Internal.copyOf("entity_previews", this.entity_previews);
        aVar.f43947f = Internal.copyOf("feed_continuous_cursor", this.feed_continuous_cursor);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetNextUnreadFeedCardsRangeResponse");
        StringBuilder sb = new StringBuilder();
        if (this.feed_filter != null) {
            sb.append(", feed_filter=");
            sb.append(this.feed_filter);
        }
        if (this.next_channel_id != null) {
            sb.append(", next_channel_id=");
            sb.append(this.next_channel_id);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (!this.continuous_cursors.isEmpty()) {
            sb.append(", continuous_cursors=");
            sb.append(this.continuous_cursors);
        }
        if (!this.entity_previews.isEmpty()) {
            sb.append(", entity_previews=");
            sb.append(this.entity_previews);
        }
        if (!this.feed_continuous_cursor.isEmpty()) {
            sb.append(", feed_continuous_cursor=");
            sb.append(this.feed_continuous_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNextUnreadFeedCardsRangeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetNextUnreadFeedCardsRangeResponse(FeedFilter feedFilter, String str, Long l, List<Cursor> list, List<FeedEntityPreview> list2, List<GroupFeedCursor> list3) {
        this(feedFilter, str, l, list, list2, list3, ByteString.EMPTY);
    }

    public GetNextUnreadFeedCardsRangeResponse(FeedFilter feedFilter, String str, Long l, List<Cursor> list, List<FeedEntityPreview> list2, List<GroupFeedCursor> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feed_filter = feedFilter;
        this.next_channel_id = str;
        this.next_cursor = l;
        this.continuous_cursors = Internal.immutableCopyOf("continuous_cursors", list);
        this.entity_previews = Internal.immutableCopyOf("entity_previews", list2);
        this.feed_continuous_cursor = Internal.immutableCopyOf("feed_continuous_cursor", list3);
    }
}
