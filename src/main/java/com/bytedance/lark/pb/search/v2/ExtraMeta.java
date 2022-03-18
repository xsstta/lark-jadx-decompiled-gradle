package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.search.v1.SearchBoxMeta;
import com.bytedance.lark.pb.search.v1.SearchDocFeedMeta;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class ExtraMeta extends Message<ExtraMeta, C18989a> {
    public static final ProtoAdapter<ExtraMeta> ADAPTER = new C18990b();
    private static final long serialVersionUID = 0;
    public final Map<String, SearchBoxMeta> chat_box_meta;
    public final Map<String, SearchDocFeedMeta> doc_feed_meta;

    /* renamed from: com.bytedance.lark.pb.search.v2.ExtraMeta$a */
    public static final class C18989a extends Message.Builder<ExtraMeta, C18989a> {

        /* renamed from: a */
        public Map<String, SearchBoxMeta> f46962a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, SearchDocFeedMeta> f46963b = Internal.newMutableMap();

        /* renamed from: a */
        public ExtraMeta build() {
            return new ExtraMeta(this.f46962a, this.f46963b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.ExtraMeta$b */
    private static final class C18990b extends ProtoAdapter<ExtraMeta> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SearchBoxMeta>> f46964a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchBoxMeta.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SearchDocFeedMeta>> f46965b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SearchDocFeedMeta.ADAPTER);

        C18990b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExtraMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ExtraMeta extraMeta) {
            return this.f46964a.encodedSizeWithTag(1, extraMeta.chat_box_meta) + this.f46965b.encodedSizeWithTag(2, extraMeta.doc_feed_meta) + extraMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ExtraMeta decode(ProtoReader protoReader) throws IOException {
            C18989a aVar = new C18989a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46962a.putAll(this.f46964a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46963b.putAll(this.f46965b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExtraMeta extraMeta) throws IOException {
            this.f46964a.encodeWithTag(protoWriter, 1, extraMeta.chat_box_meta);
            this.f46965b.encodeWithTag(protoWriter, 2, extraMeta.doc_feed_meta);
            protoWriter.writeBytes(extraMeta.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18989a newBuilder() {
        C18989a aVar = new C18989a();
        aVar.f46962a = Internal.copyOf("chat_box_meta", this.chat_box_meta);
        aVar.f46963b = Internal.copyOf("doc_feed_meta", this.doc_feed_meta);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "ExtraMeta");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_box_meta.isEmpty()) {
            sb.append(", chat_box_meta=");
            sb.append(this.chat_box_meta);
        }
        if (!this.doc_feed_meta.isEmpty()) {
            sb.append(", doc_feed_meta=");
            sb.append(this.doc_feed_meta);
        }
        StringBuilder replace = sb.replace(0, 2, "ExtraMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ExtraMeta(Map<String, SearchBoxMeta> map, Map<String, SearchDocFeedMeta> map2) {
        this(map, map2, ByteString.EMPTY);
    }

    public ExtraMeta(Map<String, SearchBoxMeta> map, Map<String, SearchDocFeedMeta> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_box_meta = Internal.immutableCopyOf("chat_box_meta", map);
        this.doc_feed_meta = Internal.immutableCopyOf("doc_feed_meta", map2);
    }
}
