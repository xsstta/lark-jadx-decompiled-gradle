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

public final class GetShortcutsByIdsRequest extends Message<GetShortcutsByIdsRequest, C17184a> {
    public static final ProtoAdapter<GetShortcutsByIdsRequest> ADAPTER = new C17185b();
    private static final long serialVersionUID = 0;
    public final List<String> shortcut_ids;

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsByIdsRequest$b */
    private static final class C17185b extends ProtoAdapter<GetShortcutsByIdsRequest> {
        C17185b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetShortcutsByIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetShortcutsByIdsRequest getShortcutsByIdsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getShortcutsByIdsRequest.shortcut_ids) + getShortcutsByIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetShortcutsByIdsRequest decode(ProtoReader protoReader) throws IOException {
            C17184a aVar = new C17184a();
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
                    aVar.f43956a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetShortcutsByIdsRequest getShortcutsByIdsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getShortcutsByIdsRequest.shortcut_ids);
            protoWriter.writeBytes(getShortcutsByIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.GetShortcutsByIdsRequest$a */
    public static final class C17184a extends Message.Builder<GetShortcutsByIdsRequest, C17184a> {

        /* renamed from: a */
        public List<String> f43956a = Internal.newMutableList();

        /* renamed from: a */
        public GetShortcutsByIdsRequest build() {
            return new GetShortcutsByIdsRequest(this.f43956a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17184a mo60496a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43956a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17184a newBuilder() {
        C17184a aVar = new C17184a();
        aVar.f43956a = Internal.copyOf("shortcut_ids", this.shortcut_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "GetShortcutsByIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.shortcut_ids.isEmpty()) {
            sb.append(", shortcut_ids=");
            sb.append(this.shortcut_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetShortcutsByIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetShortcutsByIdsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetShortcutsByIdsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shortcut_ids = Internal.immutableCopyOf("shortcut_ids", list);
    }
}
