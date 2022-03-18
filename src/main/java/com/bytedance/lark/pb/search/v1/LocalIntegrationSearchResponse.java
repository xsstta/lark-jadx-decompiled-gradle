package com.bytedance.lark.pb.search.v1;

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

public final class LocalIntegrationSearchResponse extends Message<LocalIntegrationSearchResponse, C18839a> {
    public static final ProtoAdapter<LocalIntegrationSearchResponse> ADAPTER = new C18840b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, SearchBoxMeta> boxs;
    public final Map<String, SearchChatMeta> chats;
    public final Map<String, SearchChatterMeta> chatters;
    public final Map<String, SearchDocFeedMeta> doc_feeds;
    public final Map<String, SearchDocMeta> docs;
    public final Map<String, SearchEmailMeta> emails;
    public final Boolean has_more;
    public final Map<String, SearchMessageMeta> messages;
    public final List<SearchResult> results;
    public final Map<String, SearchThreadMeta> threads;
    public final Integer total;

    /* renamed from: com.bytedance.lark.pb.search.v1.LocalIntegrationSearchResponse$a */
    public static final class C18839a extends Message.Builder<LocalIntegrationSearchResponse, C18839a> {

        /* renamed from: a */
        public List<SearchResult> f46496a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, SearchChatterMeta> f46497b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, SearchChatMeta> f46498c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, SearchMessageMeta> f46499d = Internal.newMutableMap();

        /* renamed from: e */
        public Map<String, SearchDocMeta> f46500e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, SearchEmailMeta> f46501f = Internal.newMutableMap();

        /* renamed from: g */
        public Map<String, SearchThreadMeta> f46502g = Internal.newMutableMap();

        /* renamed from: h */
        public Map<String, SearchBoxMeta> f46503h = Internal.newMutableMap();

        /* renamed from: i */
        public Boolean f46504i;

        /* renamed from: j */
        public Integer f46505j;

        /* renamed from: k */
        public Map<String, SearchDocFeedMeta> f46506k = Internal.newMutableMap();

        /* renamed from: a */
        public LocalIntegrationSearchResponse build() {
            return new LocalIntegrationSearchResponse(this.f46496a, this.f46497b, this.f46498c, this.f46499d, this.f46500e, this.f46501f, this.f46502g, this.f46503h, this.f46504i, this.f46505j, this.f46506k, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v1.LocalIntegrationSearchResponse$b */
    private static final class C18840b extends ProtoAdapter<LocalIntegrationSearchResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SearchChatterMeta>> f46507a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchChatterMeta.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SearchChatMeta>> f46508b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchChatMeta.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, SearchMessageMeta>> f46509c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchMessageMeta.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, SearchDocMeta>> f46510d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchDocMeta.ADAPTER);

        /* renamed from: e */
        private final ProtoAdapter<Map<String, SearchEmailMeta>> f46511e = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchEmailMeta.ADAPTER);

        /* renamed from: f */
        private final ProtoAdapter<Map<String, SearchThreadMeta>> f46512f = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchThreadMeta.ADAPTER);

        /* renamed from: g */
        private final ProtoAdapter<Map<String, SearchBoxMeta>> f46513g = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchBoxMeta.ADAPTER);

        /* renamed from: h */
        private final ProtoAdapter<Map<String, SearchDocFeedMeta>> f46514h = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchDocFeedMeta.ADAPTER);

        C18840b() {
            super(FieldEncoding.LENGTH_DELIMITED, LocalIntegrationSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(LocalIntegrationSearchResponse localIntegrationSearchResponse) {
            int i;
            int encodedSizeWithTag = SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(1, localIntegrationSearchResponse.results) + this.f46507a.encodedSizeWithTag(2, localIntegrationSearchResponse.chatters) + this.f46508b.encodedSizeWithTag(3, localIntegrationSearchResponse.chats) + this.f46509c.encodedSizeWithTag(4, localIntegrationSearchResponse.messages) + this.f46510d.encodedSizeWithTag(5, localIntegrationSearchResponse.docs) + this.f46511e.encodedSizeWithTag(6, localIntegrationSearchResponse.emails) + this.f46512f.encodedSizeWithTag(7, localIntegrationSearchResponse.threads) + this.f46513g.encodedSizeWithTag(8, localIntegrationSearchResponse.boxs);
            int i2 = 0;
            if (localIntegrationSearchResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(9, localIntegrationSearchResponse.has_more);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (localIntegrationSearchResponse.total != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(10, localIntegrationSearchResponse.total);
            }
            return i3 + i2 + this.f46514h.encodedSizeWithTag(100, localIntegrationSearchResponse.doc_feeds) + localIntegrationSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public LocalIntegrationSearchResponse decode(ProtoReader protoReader) throws IOException {
            C18839a aVar = new C18839a();
            aVar.f46504i = false;
            aVar.f46505j = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46496a.add(SearchResult.ADAPTER.decode(protoReader));
                            continue;
                        case 2:
                            aVar.f46497b.putAll(this.f46507a.decode(protoReader));
                            continue;
                        case 3:
                            aVar.f46498c.putAll(this.f46508b.decode(protoReader));
                            continue;
                        case 4:
                            aVar.f46499d.putAll(this.f46509c.decode(protoReader));
                            continue;
                        case 5:
                            aVar.f46500e.putAll(this.f46510d.decode(protoReader));
                            continue;
                        case 6:
                            aVar.f46501f.putAll(this.f46511e.decode(protoReader));
                            continue;
                        case 7:
                            aVar.f46502g.putAll(this.f46512f.decode(protoReader));
                            continue;
                        case 8:
                            aVar.f46503h.putAll(this.f46513g.decode(protoReader));
                            continue;
                        case 9:
                            aVar.f46504i = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 10:
                            aVar.f46505j = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f46506k.putAll(this.f46514h.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LocalIntegrationSearchResponse localIntegrationSearchResponse) throws IOException {
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, localIntegrationSearchResponse.results);
            this.f46507a.encodeWithTag(protoWriter, 2, localIntegrationSearchResponse.chatters);
            this.f46508b.encodeWithTag(protoWriter, 3, localIntegrationSearchResponse.chats);
            this.f46509c.encodeWithTag(protoWriter, 4, localIntegrationSearchResponse.messages);
            this.f46510d.encodeWithTag(protoWriter, 5, localIntegrationSearchResponse.docs);
            this.f46511e.encodeWithTag(protoWriter, 6, localIntegrationSearchResponse.emails);
            this.f46512f.encodeWithTag(protoWriter, 7, localIntegrationSearchResponse.threads);
            this.f46513g.encodeWithTag(protoWriter, 8, localIntegrationSearchResponse.boxs);
            if (localIntegrationSearchResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, localIntegrationSearchResponse.has_more);
            }
            if (localIntegrationSearchResponse.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, localIntegrationSearchResponse.total);
            }
            this.f46514h.encodeWithTag(protoWriter, 100, localIntegrationSearchResponse.doc_feeds);
            protoWriter.writeBytes(localIntegrationSearchResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18839a newBuilder() {
        C18839a aVar = new C18839a();
        aVar.f46496a = Internal.copyOf("results", this.results);
        aVar.f46497b = Internal.copyOf("chatters", this.chatters);
        aVar.f46498c = Internal.copyOf("chats", this.chats);
        aVar.f46499d = Internal.copyOf("messages", this.messages);
        aVar.f46500e = Internal.copyOf("docs", this.docs);
        aVar.f46501f = Internal.copyOf("emails", this.emails);
        aVar.f46502g = Internal.copyOf("threads", this.threads);
        aVar.f46503h = Internal.copyOf("boxs", this.boxs);
        aVar.f46504i = this.has_more;
        aVar.f46505j = this.total;
        aVar.f46506k = Internal.copyOf("doc_feeds", this.doc_feeds);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "LocalIntegrationSearchResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (!this.chats.isEmpty()) {
            sb.append(", chats=");
            sb.append(this.chats);
        }
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (!this.docs.isEmpty()) {
            sb.append(", docs=");
            sb.append(this.docs);
        }
        if (!this.emails.isEmpty()) {
            sb.append(", emails=");
            sb.append(this.emails);
        }
        if (!this.threads.isEmpty()) {
            sb.append(", threads=");
            sb.append(this.threads);
        }
        if (!this.boxs.isEmpty()) {
            sb.append(", boxs=");
            sb.append(this.boxs);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        if (!this.doc_feeds.isEmpty()) {
            sb.append(", doc_feeds=");
            sb.append(this.doc_feeds);
        }
        StringBuilder replace = sb.replace(0, 2, "LocalIntegrationSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public LocalIntegrationSearchResponse(List<SearchResult> list, Map<String, SearchChatterMeta> map, Map<String, SearchChatMeta> map2, Map<String, SearchMessageMeta> map3, Map<String, SearchDocMeta> map4, Map<String, SearchEmailMeta> map5, Map<String, SearchThreadMeta> map6, Map<String, SearchBoxMeta> map7, Boolean bool, Integer num, Map<String, SearchDocFeedMeta> map8) {
        this(list, map, map2, map3, map4, map5, map6, map7, bool, num, map8, ByteString.EMPTY);
    }

    public LocalIntegrationSearchResponse(List<SearchResult> list, Map<String, SearchChatterMeta> map, Map<String, SearchChatMeta> map2, Map<String, SearchMessageMeta> map3, Map<String, SearchDocMeta> map4, Map<String, SearchEmailMeta> map5, Map<String, SearchThreadMeta> map6, Map<String, SearchBoxMeta> map7, Boolean bool, Integer num, Map<String, SearchDocFeedMeta> map8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.results = Internal.immutableCopyOf("results", list);
        this.chatters = Internal.immutableCopyOf("chatters", map);
        this.chats = Internal.immutableCopyOf("chats", map2);
        this.messages = Internal.immutableCopyOf("messages", map3);
        this.docs = Internal.immutableCopyOf("docs", map4);
        this.emails = Internal.immutableCopyOf("emails", map5);
        this.threads = Internal.immutableCopyOf("threads", map6);
        this.boxs = Internal.immutableCopyOf("boxs", map7);
        this.has_more = bool;
        this.total = num;
        this.doc_feeds = Internal.immutableCopyOf("doc_feeds", map8);
    }
}
