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

public final class UpdateShortcutsRequest extends Message<UpdateShortcutsRequest, C17246a> {
    public static final ProtoAdapter<UpdateShortcutsRequest> ADAPTER = new C17247b();
    private static final long serialVersionUID = 0;
    public final Map<String, Integer> id2position;
    public final List<Shortcut> shortcuts;

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateShortcutsRequest$a */
    public static final class C17246a extends Message.Builder<UpdateShortcutsRequest, C17246a> {

        /* renamed from: a */
        public List<Shortcut> f44072a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, Integer> f44073b = Internal.newMutableMap();

        /* renamed from: a */
        public UpdateShortcutsRequest build() {
            return new UpdateShortcutsRequest(this.f44072a, this.f44073b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17246a mo60638a(List<Shortcut> list) {
            Internal.checkElementsNotNull(list);
            this.f44072a = list;
            return this;
        }

        /* renamed from: a */
        public C17246a mo60639a(Map<String, Integer> map) {
            Internal.checkElementsNotNull(map);
            this.f44073b = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.UpdateShortcutsRequest$b */
    private static final class C17247b extends ProtoAdapter<UpdateShortcutsRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Integer>> f44074a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT32);

        C17247b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateShortcutsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateShortcutsRequest updateShortcutsRequest) {
            return Shortcut.ADAPTER.asRepeated().encodedSizeWithTag(1, updateShortcutsRequest.shortcuts) + this.f44074a.encodedSizeWithTag(2, updateShortcutsRequest.id2position) + updateShortcutsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateShortcutsRequest decode(ProtoReader protoReader) throws IOException {
            C17246a aVar = new C17246a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44072a.add(Shortcut.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44073b.putAll(this.f44074a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateShortcutsRequest updateShortcutsRequest) throws IOException {
            Shortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, updateShortcutsRequest.shortcuts);
            this.f44074a.encodeWithTag(protoWriter, 2, updateShortcutsRequest.id2position);
            protoWriter.writeBytes(updateShortcutsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17246a newBuilder() {
        C17246a aVar = new C17246a();
        aVar.f44072a = Internal.copyOf("shortcuts", this.shortcuts);
        aVar.f44073b = Internal.copyOf("id2position", this.id2position);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "UpdateShortcutsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.shortcuts.isEmpty()) {
            sb.append(", shortcuts=");
            sb.append(this.shortcuts);
        }
        if (!this.id2position.isEmpty()) {
            sb.append(", id2position=");
            sb.append(this.id2position);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateShortcutsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateShortcutsRequest(List<Shortcut> list, Map<String, Integer> map) {
        this(list, map, ByteString.EMPTY);
    }

    public UpdateShortcutsRequest(List<Shortcut> list, Map<String, Integer> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shortcuts = Internal.immutableCopyOf("shortcuts", list);
        this.id2position = Internal.immutableCopyOf("id2position", map);
    }
}
