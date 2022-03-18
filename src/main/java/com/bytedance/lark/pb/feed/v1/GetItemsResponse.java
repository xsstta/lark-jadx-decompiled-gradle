package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Item;
import com.bytedance.lark.pb.basic.v1.Team;
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

public final class GetItemsResponse extends Message<GetItemsResponse, C17174a> {
    public static final ProtoAdapter<GetItemsResponse> ADAPTER = new C17175b();
    private static final long serialVersionUID = 0;
    public final Map<Long, FeedEntityPreview> chats;
    public final Map<Long, BadgeCount> item2badge_count;
    public final Map<Long, Result> results;
    public final Map<Long, Team> teams;

    public static final class Result extends Message<Result, C17172a> {
        public static final ProtoAdapter<Result> ADAPTER = new C17173b();
        public static final Boolean DEFAULT_HAS_MORE = false;
        public static final Long DEFAULT_NEXT_CURSOR = 0L;
        private static final long serialVersionUID = 0;
        public final Boolean has_more;
        public final List<Item> items;
        public final Long next_cursor;

        /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsResponse$Result$b */
        private static final class C17173b extends ProtoAdapter<Result> {
            C17173b() {
                super(FieldEncoding.LENGTH_DELIMITED, Result.class);
            }

            /* renamed from: a */
            public int encodedSize(Result result) {
                int i;
                int i2 = 0;
                if (result.next_cursor != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(1, result.next_cursor);
                } else {
                    i = 0;
                }
                if (result.has_more != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, result.has_more);
                }
                return i + i2 + Item.ADAPTER.asRepeated().encodedSizeWithTag(3, result.items) + result.unknownFields().size();
            }

            /* renamed from: a */
            public Result decode(ProtoReader protoReader) throws IOException {
                C17172a aVar = new C17172a();
                aVar.f43928a = 0L;
                aVar.f43929b = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43928a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f43929b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43930c.add(Item.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Result result) throws IOException {
                if (result.next_cursor != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, result.next_cursor);
                }
                if (result.has_more != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, result.has_more);
                }
                Item.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, result.items);
                protoWriter.writeBytes(result.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsResponse$Result$a */
        public static final class C17172a extends Message.Builder<Result, C17172a> {

            /* renamed from: a */
            public Long f43928a;

            /* renamed from: b */
            public Boolean f43929b;

            /* renamed from: c */
            public List<Item> f43930c = Internal.newMutableList();

            /* renamed from: a */
            public Result build() {
                return new Result(this.f43928a, this.f43929b, this.f43930c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17172a newBuilder() {
            C17172a aVar = new C17172a();
            aVar.f43928a = this.next_cursor;
            aVar.f43929b = this.has_more;
            aVar.f43930c = Internal.copyOf("items", this.items);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("feed", "Result");
            StringBuilder sb = new StringBuilder();
            if (this.next_cursor != null) {
                sb.append(", next_cursor=");
                sb.append(this.next_cursor);
            }
            if (this.has_more != null) {
                sb.append(", has_more=");
                sb.append(this.has_more);
            }
            if (!this.items.isEmpty()) {
                sb.append(", items=");
                sb.append(this.items);
            }
            StringBuilder replace = sb.replace(0, 2, "Result{");
            replace.append('}');
            return replace.toString();
        }

        public Result(Long l, Boolean bool, List<Item> list) {
            this(l, bool, list, ByteString.EMPTY);
        }

        public Result(Long l, Boolean bool, List<Item> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.next_cursor = l;
            this.has_more = bool;
            this.items = Internal.immutableCopyOf("items", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsResponse$a */
    public static final class C17174a extends Message.Builder<GetItemsResponse, C17174a> {

        /* renamed from: a */
        public Map<Long, Result> f43931a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<Long, Team> f43932b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<Long, FeedEntityPreview> f43933c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<Long, BadgeCount> f43934d = Internal.newMutableMap();

        /* renamed from: a */
        public GetItemsResponse build() {
            return new GetItemsResponse(this.f43931a, this.f43932b, this.f43933c, this.f43934d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetItemsResponse$b */
    private static final class C17175b extends ProtoAdapter<GetItemsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<Long, Result>> f43935a = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, Result.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<Long, Team>> f43936b = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, Team.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<Long, FeedEntityPreview>> f43937c = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, FeedEntityPreview.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<Long, BadgeCount>> f43938d = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, BadgeCount.ADAPTER);

        C17175b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetItemsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetItemsResponse getItemsResponse) {
            return this.f43935a.encodedSizeWithTag(1, getItemsResponse.results) + this.f43936b.encodedSizeWithTag(20, getItemsResponse.teams) + this.f43937c.encodedSizeWithTag(21, getItemsResponse.chats) + this.f43938d.encodedSizeWithTag(22, getItemsResponse.item2badge_count) + getItemsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetItemsResponse decode(ProtoReader protoReader) throws IOException {
            C17174a aVar = new C17174a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    switch (nextTag) {
                        case 20:
                            aVar.f43932b.putAll(this.f43936b.decode(protoReader));
                            continue;
                        case 21:
                            aVar.f43933c.putAll(this.f43937c.decode(protoReader));
                            continue;
                        case 22:
                            aVar.f43934d.putAll(this.f43938d.decode(protoReader));
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f43931a.putAll(this.f43935a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetItemsResponse getItemsResponse) throws IOException {
            this.f43935a.encodeWithTag(protoWriter, 1, getItemsResponse.results);
            this.f43936b.encodeWithTag(protoWriter, 20, getItemsResponse.teams);
            this.f43937c.encodeWithTag(protoWriter, 21, getItemsResponse.chats);
            this.f43938d.encodeWithTag(protoWriter, 22, getItemsResponse.item2badge_count);
            protoWriter.writeBytes(getItemsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17174a newBuilder() {
        C17174a aVar = new C17174a();
        aVar.f43931a = Internal.copyOf("results", this.results);
        aVar.f43932b = Internal.copyOf("teams", this.teams);
        aVar.f43933c = Internal.copyOf("chats", this.chats);
        aVar.f43934d = Internal.copyOf("item2badge_count", this.item2badge_count);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetItemsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        if (!this.teams.isEmpty()) {
            sb.append(", teams=");
            sb.append(this.teams);
        }
        if (!this.chats.isEmpty()) {
            sb.append(", chats=");
            sb.append(this.chats);
        }
        if (!this.item2badge_count.isEmpty()) {
            sb.append(", item2badge_count=");
            sb.append(this.item2badge_count);
        }
        StringBuilder replace = sb.replace(0, 2, "GetItemsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetItemsResponse(Map<Long, Result> map, Map<Long, Team> map2, Map<Long, FeedEntityPreview> map3, Map<Long, BadgeCount> map4) {
        this(map, map2, map3, map4, ByteString.EMPTY);
    }

    public GetItemsResponse(Map<Long, Result> map, Map<Long, Team> map2, Map<Long, FeedEntityPreview> map3, Map<Long, BadgeCount> map4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.results = Internal.immutableCopyOf("results", map);
        this.teams = Internal.immutableCopyOf("teams", map2);
        this.chats = Internal.immutableCopyOf("chats", map3);
        this.item2badge_count = Internal.immutableCopyOf("item2badge_count", map4);
    }
}
