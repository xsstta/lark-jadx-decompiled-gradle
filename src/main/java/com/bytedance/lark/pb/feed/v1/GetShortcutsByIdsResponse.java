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

public final class GetShortcutsByIdsResponse extends Message<GetShortcutsByIdsResponse, C17186a> {
    public static final ProtoAdapter<GetShortcutsByIdsResponse> ADAPTER = new C17187b();
    private static final long serialVersionUID = 0;
    public final List<Shortcut> shortcuts;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsByIdsResponse$b */
    private static final class C17187b extends ProtoAdapter<GetShortcutsByIdsResponse> {
        C17187b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetShortcutsByIdsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetShortcutsByIdsResponse getShortcutsByIdsResponse) {
            return Shortcut.ADAPTER.asRepeated().encodedSizeWithTag(1, getShortcutsByIdsResponse.shortcuts) + getShortcutsByIdsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetShortcutsByIdsResponse decode(ProtoReader protoReader) throws IOException {
            C17186a aVar = new C17186a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43957a.add(Shortcut.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetShortcutsByIdsResponse getShortcutsByIdsResponse) throws IOException {
            Shortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getShortcutsByIdsResponse.shortcuts);
            protoWriter.writeBytes(getShortcutsByIdsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsByIdsResponse$a */
    public static final class C17186a extends Message.Builder<GetShortcutsByIdsResponse, C17186a> {

        /* renamed from: a */
        public List<Shortcut> f43957a = Internal.newMutableList();

        /* renamed from: a */
        public GetShortcutsByIdsResponse build() {
            return new GetShortcutsByIdsResponse(this.f43957a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17186a newBuilder() {
        C17186a aVar = new C17186a();
        aVar.f43957a = Internal.copyOf("shortcuts", this.shortcuts);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetShortcutsByIdsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.shortcuts.isEmpty()) {
            sb.append(", shortcuts=");
            sb.append(this.shortcuts);
        }
        StringBuilder replace = sb.replace(0, 2, "GetShortcutsByIdsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetShortcutsByIdsResponse(List<Shortcut> list) {
        this(list, ByteString.EMPTY);
    }

    public GetShortcutsByIdsResponse(List<Shortcut> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shortcuts = Internal.immutableCopyOf("shortcuts", list);
    }
}
