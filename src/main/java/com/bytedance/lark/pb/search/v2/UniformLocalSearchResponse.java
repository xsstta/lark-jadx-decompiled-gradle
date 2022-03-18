package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.SearchChatMeta;
import com.bytedance.lark.pb.search.v1.SearchChatterMeta;
import com.bytedance.lark.pb.search.v1.SearchMessageMeta;
import com.bytedance.lark.pb.search.v1.SearchResult;
import com.bytedance.lark.pb.search.v1.SearchThreadMeta;
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

public final class UniformLocalSearchResponse extends Message<UniformLocalSearchResponse, C19057a> {
    public static final ProtoAdapter<UniformLocalSearchResponse> ADAPTER = new C19058b();
    public static final Boolean DEFAULT_HAS_MORE = false;
    public static final Integer DEFAULT_TOTAL = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, SearchChatMeta> chats;
    public final Map<String, SearchChatterMeta> chatters;
    public final Boolean has_more;
    public final Map<String, SearchMessageMeta> messages;
    public final List<SearchResult> results;
    public final Map<String, SearchThreadMeta> threads;
    public final Integer total;

    /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchResponse$a */
    public static final class C19057a extends Message.Builder<UniformLocalSearchResponse, C19057a> {

        /* renamed from: a */
        public List<SearchResult> f47142a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, SearchChatterMeta> f47143b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, SearchChatMeta> f47144c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, SearchMessageMeta> f47145d = Internal.newMutableMap();

        /* renamed from: e */
        public Map<String, SearchThreadMeta> f47146e = Internal.newMutableMap();

        /* renamed from: f */
        public Boolean f47147f;

        /* renamed from: g */
        public Integer f47148g;

        /* renamed from: a */
        public UniformLocalSearchResponse build() {
            return new UniformLocalSearchResponse(this.f47142a, this.f47143b, this.f47144c, this.f47145d, this.f47146e, this.f47147f, this.f47148g, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.UniformLocalSearchResponse$b */
    private static final class C19058b extends ProtoAdapter<UniformLocalSearchResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SearchChatterMeta>> f47149a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchChatterMeta.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SearchChatMeta>> f47150b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchChatMeta.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, SearchMessageMeta>> f47151c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchMessageMeta.ADAPTER);

        /* renamed from: d */
        private final ProtoAdapter<Map<String, SearchThreadMeta>> f47152d = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchThreadMeta.ADAPTER);

        C19058b() {
            super(FieldEncoding.LENGTH_DELIMITED, UniformLocalSearchResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UniformLocalSearchResponse uniformLocalSearchResponse) {
            int i;
            int encodedSizeWithTag = SearchResult.ADAPTER.asRepeated().encodedSizeWithTag(1, uniformLocalSearchResponse.results) + this.f47149a.encodedSizeWithTag(2, uniformLocalSearchResponse.chatters) + this.f47150b.encodedSizeWithTag(3, uniformLocalSearchResponse.chats) + this.f47151c.encodedSizeWithTag(4, uniformLocalSearchResponse.messages) + this.f47152d.encodedSizeWithTag(5, uniformLocalSearchResponse.threads);
            int i2 = 0;
            if (uniformLocalSearchResponse.has_more != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(6, uniformLocalSearchResponse.has_more);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (uniformLocalSearchResponse.total != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(7, uniformLocalSearchResponse.total);
            }
            return i3 + i2 + uniformLocalSearchResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UniformLocalSearchResponse decode(ProtoReader protoReader) throws IOException {
            C19057a aVar = new C19057a();
            aVar.f47147f = false;
            aVar.f47148g = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47142a.add(SearchResult.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f47143b.putAll(this.f47149a.decode(protoReader));
                            break;
                        case 3:
                            aVar.f47144c.putAll(this.f47150b.decode(protoReader));
                            break;
                        case 4:
                            aVar.f47145d.putAll(this.f47151c.decode(protoReader));
                            break;
                        case 5:
                            aVar.f47146e.putAll(this.f47152d.decode(protoReader));
                            break;
                        case 6:
                            aVar.f47147f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47148g = ProtoAdapter.INT32.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, UniformLocalSearchResponse uniformLocalSearchResponse) throws IOException {
            SearchResult.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, uniformLocalSearchResponse.results);
            this.f47149a.encodeWithTag(protoWriter, 2, uniformLocalSearchResponse.chatters);
            this.f47150b.encodeWithTag(protoWriter, 3, uniformLocalSearchResponse.chats);
            this.f47151c.encodeWithTag(protoWriter, 4, uniformLocalSearchResponse.messages);
            this.f47152d.encodeWithTag(protoWriter, 5, uniformLocalSearchResponse.threads);
            if (uniformLocalSearchResponse.has_more != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, uniformLocalSearchResponse.has_more);
            }
            if (uniformLocalSearchResponse.total != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, uniformLocalSearchResponse.total);
            }
            protoWriter.writeBytes(uniformLocalSearchResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19057a newBuilder() {
        C19057a aVar = new C19057a();
        aVar.f47142a = Internal.copyOf("results", this.results);
        aVar.f47143b = Internal.copyOf("chatters", this.chatters);
        aVar.f47144c = Internal.copyOf("chats", this.chats);
        aVar.f47145d = Internal.copyOf("messages", this.messages);
        aVar.f47146e = Internal.copyOf("threads", this.threads);
        aVar.f47147f = this.has_more;
        aVar.f47148g = this.total;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "UniformLocalSearchResponse");
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
        if (!this.threads.isEmpty()) {
            sb.append(", threads=");
            sb.append(this.threads);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        StringBuilder replace = sb.replace(0, 2, "UniformLocalSearchResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UniformLocalSearchResponse(List<SearchResult> list, Map<String, SearchChatterMeta> map, Map<String, SearchChatMeta> map2, Map<String, SearchMessageMeta> map3, Map<String, SearchThreadMeta> map4, Boolean bool, Integer num) {
        this(list, map, map2, map3, map4, bool, num, ByteString.EMPTY);
    }

    public UniformLocalSearchResponse(List<SearchResult> list, Map<String, SearchChatterMeta> map, Map<String, SearchChatMeta> map2, Map<String, SearchMessageMeta> map3, Map<String, SearchThreadMeta> map4, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.results = Internal.immutableCopyOf("results", list);
        this.chatters = Internal.immutableCopyOf("chatters", map);
        this.chats = Internal.immutableCopyOf("chats", map2);
        this.messages = Internal.immutableCopyOf("messages", map3);
        this.threads = Internal.immutableCopyOf("threads", map4);
        this.has_more = bool;
        this.total = num;
    }
}
