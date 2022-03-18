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
import java.util.Map;
import okio.ByteString;

public final class PushFeedEntityPreviews extends Message<PushFeedEntityPreviews, C17204a> {
    public static final ProtoAdapter<PushFeedEntityPreviews> ADAPTER = new C17205b();
    private static final long serialVersionUID = 0;
    public final Map<Integer, FilterPushInfo> filters_info;
    public final List<String> removed_feeds;
    public final Map<String, FeedCardPushInfo> updated_feeds;

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushFeedEntityPreviews$a */
    public static final class C17204a extends Message.Builder<PushFeedEntityPreviews, C17204a> {

        /* renamed from: a */
        public Map<String, FeedCardPushInfo> f43990a = Internal.newMutableMap();

        /* renamed from: b */
        public List<String> f43991b = Internal.newMutableList();

        /* renamed from: c */
        public Map<Integer, FilterPushInfo> f43992c = Internal.newMutableMap();

        /* renamed from: a */
        public PushFeedEntityPreviews build() {
            return new PushFeedEntityPreviews(this.f43990a, this.f43991b, this.f43992c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushFeedEntityPreviews$b */
    private static final class C17205b extends ProtoAdapter<PushFeedEntityPreviews> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, FeedCardPushInfo>> f43993a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FeedCardPushInfo.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<Integer, FilterPushInfo>> f43994b = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, FilterPushInfo.ADAPTER);

        C17205b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushFeedEntityPreviews.class);
        }

        /* renamed from: a */
        public int encodedSize(PushFeedEntityPreviews pushFeedEntityPreviews) {
            return this.f43993a.encodedSizeWithTag(1, pushFeedEntityPreviews.updated_feeds) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pushFeedEntityPreviews.removed_feeds) + this.f43994b.encodedSizeWithTag(3, pushFeedEntityPreviews.filters_info) + pushFeedEntityPreviews.unknownFields().size();
        }

        /* renamed from: a */
        public PushFeedEntityPreviews decode(ProtoReader protoReader) throws IOException {
            C17204a aVar = new C17204a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43990a.putAll(this.f43993a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43991b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43992c.putAll(this.f43994b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushFeedEntityPreviews pushFeedEntityPreviews) throws IOException {
            this.f43993a.encodeWithTag(protoWriter, 1, pushFeedEntityPreviews.updated_feeds);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pushFeedEntityPreviews.removed_feeds);
            this.f43994b.encodeWithTag(protoWriter, 3, pushFeedEntityPreviews.filters_info);
            protoWriter.writeBytes(pushFeedEntityPreviews.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17204a newBuilder() {
        C17204a aVar = new C17204a();
        aVar.f43990a = Internal.copyOf("updated_feeds", this.updated_feeds);
        aVar.f43991b = Internal.copyOf("removed_feeds", this.removed_feeds);
        aVar.f43992c = Internal.copyOf("filters_info", this.filters_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushFeedEntityPreviews");
        StringBuilder sb = new StringBuilder();
        if (!this.updated_feeds.isEmpty()) {
            sb.append(", updated_feeds=");
            sb.append(this.updated_feeds);
        }
        if (!this.removed_feeds.isEmpty()) {
            sb.append(", removed_feeds=");
            sb.append(this.removed_feeds);
        }
        if (!this.filters_info.isEmpty()) {
            sb.append(", filters_info=");
            sb.append(this.filters_info);
        }
        StringBuilder replace = sb.replace(0, 2, "PushFeedEntityPreviews{");
        replace.append('}');
        return replace.toString();
    }

    public PushFeedEntityPreviews(Map<String, FeedCardPushInfo> map, List<String> list, Map<Integer, FilterPushInfo> map2) {
        this(map, list, map2, ByteString.EMPTY);
    }

    public PushFeedEntityPreviews(Map<String, FeedCardPushInfo> map, List<String> list, Map<Integer, FilterPushInfo> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.updated_feeds = Internal.immutableCopyOf("updated_feeds", map);
        this.removed_feeds = Internal.immutableCopyOf("removed_feeds", list);
        this.filters_info = Internal.immutableCopyOf("filters_info", map2);
    }
}
