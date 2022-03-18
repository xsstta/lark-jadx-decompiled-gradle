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

public final class GetFeedCardsV3Response extends Message<GetFeedCardsV3Response, C17158a> {
    public static final ProtoAdapter<GetFeedCardsV3Response> ADAPTER = new C17159b();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_SYNCING_FINISH = true;
    private static final long serialVersionUID = 0;
    public final List<Cursor> continuous_cursors;
    public final List<FeedEntityPreview> entity_previews;
    public final List<GroupFeedCursor> feed_continuous_cursor;
    public final FeedFilter filter;
    public final Long next_cursor;
    public final Boolean syncing_finish;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Response$b */
    private static final class C17159b extends ProtoAdapter<GetFeedCardsV3Response> {
        C17159b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedCardsV3Response.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedCardsV3Response getFeedCardsV3Response) {
            int i;
            int i2;
            int i3 = 0;
            if (getFeedCardsV3Response.next_cursor != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getFeedCardsV3Response.next_cursor);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Cursor.ADAPTER.asRepeated().encodedSizeWithTag(2, getFeedCardsV3Response.continuous_cursors);
            if (getFeedCardsV3Response.syncing_finish != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getFeedCardsV3Response.syncing_finish);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i2 + FeedEntityPreview.ADAPTER.asRepeated().encodedSizeWithTag(4, getFeedCardsV3Response.entity_previews);
            if (getFeedCardsV3Response.filter != null) {
                i3 = FeedFilter.ADAPTER.encodedSizeWithTag(5, getFeedCardsV3Response.filter);
            }
            return encodedSizeWithTag2 + i3 + GroupFeedCursor.ADAPTER.asRepeated().encodedSizeWithTag(6, getFeedCardsV3Response.feed_continuous_cursor) + getFeedCardsV3Response.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedCardsV3Response decode(ProtoReader protoReader) throws IOException {
            C17158a aVar = new C17158a();
            aVar.f43902a = 0L;
            aVar.f43904c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43902a = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43903b.add(Cursor.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f43904c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43905d.add(FeedEntityPreview.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f43906e = FeedFilter.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43907f.add(GroupFeedCursor.ADAPTER.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, GetFeedCardsV3Response getFeedCardsV3Response) throws IOException {
            if (getFeedCardsV3Response.next_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getFeedCardsV3Response.next_cursor);
            }
            Cursor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getFeedCardsV3Response.continuous_cursors);
            if (getFeedCardsV3Response.syncing_finish != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getFeedCardsV3Response.syncing_finish);
            }
            FeedEntityPreview.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getFeedCardsV3Response.entity_previews);
            if (getFeedCardsV3Response.filter != null) {
                FeedFilter.ADAPTER.encodeWithTag(protoWriter, 5, getFeedCardsV3Response.filter);
            }
            GroupFeedCursor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, getFeedCardsV3Response.feed_continuous_cursor);
            protoWriter.writeBytes(getFeedCardsV3Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV3Response$a */
    public static final class C17158a extends Message.Builder<GetFeedCardsV3Response, C17158a> {

        /* renamed from: a */
        public Long f43902a;

        /* renamed from: b */
        public List<Cursor> f43903b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f43904c;

        /* renamed from: d */
        public List<FeedEntityPreview> f43905d = Internal.newMutableList();

        /* renamed from: e */
        public FeedFilter f43906e;

        /* renamed from: f */
        public List<GroupFeedCursor> f43907f = Internal.newMutableList();

        /* renamed from: a */
        public GetFeedCardsV3Response build() {
            return new GetFeedCardsV3Response(this.f43902a, this.f43903b, this.f43904c, this.f43905d, this.f43906e, this.f43907f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17158a newBuilder() {
        C17158a aVar = new C17158a();
        aVar.f43902a = this.next_cursor;
        aVar.f43903b = Internal.copyOf("continuous_cursors", this.continuous_cursors);
        aVar.f43904c = this.syncing_finish;
        aVar.f43905d = Internal.copyOf("entity_previews", this.entity_previews);
        aVar.f43906e = this.filter;
        aVar.f43907f = Internal.copyOf("feed_continuous_cursor", this.feed_continuous_cursor);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetFeedCardsV3Response");
        StringBuilder sb = new StringBuilder();
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (!this.continuous_cursors.isEmpty()) {
            sb.append(", continuous_cursors=");
            sb.append(this.continuous_cursors);
        }
        if (this.syncing_finish != null) {
            sb.append(", syncing_finish=");
            sb.append(this.syncing_finish);
        }
        if (!this.entity_previews.isEmpty()) {
            sb.append(", entity_previews=");
            sb.append(this.entity_previews);
        }
        if (this.filter != null) {
            sb.append(", filter=");
            sb.append(this.filter);
        }
        if (!this.feed_continuous_cursor.isEmpty()) {
            sb.append(", feed_continuous_cursor=");
            sb.append(this.feed_continuous_cursor);
        }
        StringBuilder replace = sb.replace(0, 2, "GetFeedCardsV3Response{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedCardsV3Response(Long l, List<Cursor> list, Boolean bool, List<FeedEntityPreview> list2, FeedFilter feedFilter, List<GroupFeedCursor> list3) {
        this(l, list, bool, list2, feedFilter, list3, ByteString.EMPTY);
    }

    public GetFeedCardsV3Response(Long l, List<Cursor> list, Boolean bool, List<FeedEntityPreview> list2, FeedFilter feedFilter, List<GroupFeedCursor> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_cursor = l;
        this.continuous_cursors = Internal.immutableCopyOf("continuous_cursors", list);
        this.syncing_finish = bool;
        this.entity_previews = Internal.immutableCopyOf("entity_previews", list2);
        this.filter = feedFilter;
        this.feed_continuous_cursor = Internal.immutableCopyOf("feed_continuous_cursor", list3);
    }
}
