package com.bytedance.lark.pb.feed.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
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

public final class PushShortcutsResponse extends Message<PushShortcutsResponse, C17212a> {
    public static final ProtoAdapter<PushShortcutsResponse> ADAPTER = new C17213b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final Map<String, FeedEntityPreview> entity_previews;
    public final List<Shortcut> shortcuts;

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushShortcutsResponse$a */
    public static final class C17212a extends Message.Builder<PushShortcutsResponse, C17212a> {

        /* renamed from: a */
        public List<Shortcut> f44015a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f44016b;

        /* renamed from: c */
        public Map<String, FeedEntityPreview> f44017c = Internal.newMutableMap();

        /* renamed from: a */
        public PushShortcutsResponse build() {
            return new PushShortcutsResponse(this.f44015a, this.f44016b, this.f44017c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.PushShortcutsResponse$b */
    private static final class C17213b extends ProtoAdapter<PushShortcutsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, FeedEntityPreview>> f44018a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FeedEntityPreview.ADAPTER);

        C17213b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushShortcutsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushShortcutsResponse pushShortcutsResponse) {
            int i;
            int encodedSizeWithTag = Shortcut.ADAPTER.asRepeated().encodedSizeWithTag(1, pushShortcutsResponse.shortcuts);
            if (pushShortcutsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, pushShortcutsResponse.entity);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f44018a.encodedSizeWithTag(4, pushShortcutsResponse.entity_previews) + pushShortcutsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushShortcutsResponse decode(ProtoReader protoReader) throws IOException {
            C17212a aVar = new C17212a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44015a.add(Shortcut.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f44016b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44017c.putAll(this.f44018a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushShortcutsResponse pushShortcutsResponse) throws IOException {
            Shortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushShortcutsResponse.shortcuts);
            if (pushShortcutsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, pushShortcutsResponse.entity);
            }
            this.f44018a.encodeWithTag(protoWriter, 4, pushShortcutsResponse.entity_previews);
            protoWriter.writeBytes(pushShortcutsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17212a newBuilder() {
        C17212a aVar = new C17212a();
        aVar.f44015a = Internal.copyOf("shortcuts", this.shortcuts);
        aVar.f44016b = this.entity;
        aVar.f44017c = Internal.copyOf("entity_previews", this.entity_previews);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "PushShortcutsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.shortcuts.isEmpty()) {
            sb.append(", shortcuts=");
            sb.append(this.shortcuts);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.entity_previews.isEmpty()) {
            sb.append(", entity_previews=");
            sb.append(this.entity_previews);
        }
        StringBuilder replace = sb.replace(0, 2, "PushShortcutsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushShortcutsResponse(List<Shortcut> list, C14928Entity entity2, Map<String, FeedEntityPreview> map) {
        this(list, entity2, map, ByteString.EMPTY);
    }

    public PushShortcutsResponse(List<Shortcut> list, C14928Entity entity2, Map<String, FeedEntityPreview> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shortcuts = Internal.immutableCopyOf("shortcuts", list);
        this.entity = entity2;
        this.entity_previews = Internal.immutableCopyOf("entity_previews", map);
    }
}
