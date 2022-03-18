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

public final class GetFeedCardsV2Response extends Message<GetFeedCardsV2Response, C17152a> {
    public static final ProtoAdapter<GetFeedCardsV2Response> ADAPTER = new C17153b();
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_SYNCING_FINISH = true;
    private static final long serialVersionUID = 0;
    public final List<Cursor> continuous_cursors;
    public final List<FeedEntityPreview> entity_previews;
    public final Long next_cursor;
    public final Boolean syncing_finish;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV2Response$b */
    private static final class C17153b extends ProtoAdapter<GetFeedCardsV2Response> {
        C17153b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetFeedCardsV2Response.class);
        }

        /* renamed from: a */
        public int encodedSize(GetFeedCardsV2Response getFeedCardsV2Response) {
            int i;
            int i2 = 0;
            if (getFeedCardsV2Response.next_cursor != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getFeedCardsV2Response.next_cursor);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Cursor.ADAPTER.asRepeated().encodedSizeWithTag(3, getFeedCardsV2Response.continuous_cursors);
            if (getFeedCardsV2Response.syncing_finish != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getFeedCardsV2Response.syncing_finish);
            }
            return encodedSizeWithTag + i2 + FeedEntityPreview.ADAPTER.asRepeated().encodedSizeWithTag(5, getFeedCardsV2Response.entity_previews) + getFeedCardsV2Response.unknownFields().size();
        }

        /* renamed from: a */
        public GetFeedCardsV2Response decode(ProtoReader protoReader) throws IOException {
            C17152a aVar = new C17152a();
            aVar.f43890a = 0L;
            aVar.f43892c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f43890a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43891b.add(Cursor.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    aVar.f43892c = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43893d.add(FeedEntityPreview.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetFeedCardsV2Response getFeedCardsV2Response) throws IOException {
            if (getFeedCardsV2Response.next_cursor != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getFeedCardsV2Response.next_cursor);
            }
            Cursor.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getFeedCardsV2Response.continuous_cursors);
            if (getFeedCardsV2Response.syncing_finish != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getFeedCardsV2Response.syncing_finish);
            }
            FeedEntityPreview.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, getFeedCardsV2Response.entity_previews);
            protoWriter.writeBytes(getFeedCardsV2Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetFeedCardsV2Response$a */
    public static final class C17152a extends Message.Builder<GetFeedCardsV2Response, C17152a> {

        /* renamed from: a */
        public Long f43890a;

        /* renamed from: b */
        public List<Cursor> f43891b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f43892c;

        /* renamed from: d */
        public List<FeedEntityPreview> f43893d = Internal.newMutableList();

        /* renamed from: a */
        public GetFeedCardsV2Response build() {
            return new GetFeedCardsV2Response(this.f43890a, this.f43891b, this.f43892c, this.f43893d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17152a newBuilder() {
        C17152a aVar = new C17152a();
        aVar.f43890a = this.next_cursor;
        aVar.f43891b = Internal.copyOf("continuous_cursors", this.continuous_cursors);
        aVar.f43892c = this.syncing_finish;
        aVar.f43893d = Internal.copyOf("entity_previews", this.entity_previews);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetFeedCardsV2Response");
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
        StringBuilder replace = sb.replace(0, 2, "GetFeedCardsV2Response{");
        replace.append('}');
        return replace.toString();
    }

    public GetFeedCardsV2Response(Long l, List<Cursor> list, Boolean bool, List<FeedEntityPreview> list2) {
        this(l, list, bool, list2, ByteString.EMPTY);
    }

    public GetFeedCardsV2Response(Long l, List<Cursor> list, Boolean bool, List<FeedEntityPreview> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_cursor = l;
        this.continuous_cursors = Internal.immutableCopyOf("continuous_cursors", list);
        this.syncing_finish = bool;
        this.entity_previews = Internal.immutableCopyOf("entity_previews", list2);
    }
}
