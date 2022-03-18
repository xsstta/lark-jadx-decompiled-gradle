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

public final class GetShortcutsResponse extends Message<GetShortcutsResponse, C17190a> {
    public static final ProtoAdapter<GetShortcutsResponse> ADAPTER = new C17191b();
    private static final long serialVersionUID = 0;
    public final C14928Entity entity;
    public final Map<String, FeedEntityPreview> entity_preview;
    public final List<Shortcut> shortcuts;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsResponse$a */
    public static final class C17190a extends Message.Builder<GetShortcutsResponse, C17190a> {

        /* renamed from: a */
        public List<Shortcut> f43961a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f43962b;

        /* renamed from: c */
        public Map<String, FeedEntityPreview> f43963c = Internal.newMutableMap();

        /* renamed from: a */
        public GetShortcutsResponse build() {
            return new GetShortcutsResponse(this.f43961a, this.f43962b, this.f43963c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsResponse$b */
    private static final class C17191b extends ProtoAdapter<GetShortcutsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, FeedEntityPreview>> f43964a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, FeedEntityPreview.ADAPTER);

        C17191b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetShortcutsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetShortcutsResponse getShortcutsResponse) {
            int i;
            int encodedSizeWithTag = Shortcut.ADAPTER.asRepeated().encodedSizeWithTag(1, getShortcutsResponse.shortcuts);
            if (getShortcutsResponse.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, getShortcutsResponse.entity);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + this.f43964a.encodedSizeWithTag(4, getShortcutsResponse.entity_preview) + getShortcutsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetShortcutsResponse decode(ProtoReader protoReader) throws IOException {
            C17190a aVar = new C17190a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43961a.add(Shortcut.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43962b = C14928Entity.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43963c.putAll(this.f43964a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetShortcutsResponse getShortcutsResponse) throws IOException {
            Shortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getShortcutsResponse.shortcuts);
            if (getShortcutsResponse.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, getShortcutsResponse.entity);
            }
            this.f43964a.encodeWithTag(protoWriter, 4, getShortcutsResponse.entity_preview);
            protoWriter.writeBytes(getShortcutsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17190a newBuilder() {
        C17190a aVar = new C17190a();
        aVar.f43961a = Internal.copyOf("shortcuts", this.shortcuts);
        aVar.f43962b = this.entity;
        aVar.f43963c = Internal.copyOf("entity_preview", this.entity_preview);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetShortcutsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.shortcuts.isEmpty()) {
            sb.append(", shortcuts=");
            sb.append(this.shortcuts);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        if (!this.entity_preview.isEmpty()) {
            sb.append(", entity_preview=");
            sb.append(this.entity_preview);
        }
        StringBuilder replace = sb.replace(0, 2, "GetShortcutsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetShortcutsResponse(List<Shortcut> list, C14928Entity entity2, Map<String, FeedEntityPreview> map) {
        this(list, entity2, map, ByteString.EMPTY);
    }

    public GetShortcutsResponse(List<Shortcut> list, C14928Entity entity2, Map<String, FeedEntityPreview> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shortcuts = Internal.immutableCopyOf("shortcuts", list);
        this.entity = entity2;
        this.entity_preview = Internal.immutableCopyOf("entity_preview", map);
    }
}
