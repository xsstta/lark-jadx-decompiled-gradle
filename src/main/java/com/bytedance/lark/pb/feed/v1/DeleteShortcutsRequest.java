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

public final class DeleteShortcutsRequest extends Message<DeleteShortcutsRequest, C17112a> {
    public static final ProtoAdapter<DeleteShortcutsRequest> ADAPTER = new C17113b();
    private static final long serialVersionUID = 0;
    public final List<Shortcut> shortcuts;

    /* renamed from: com.bytedance.lark.pb.feed.v1.DeleteShortcutsRequest$b */
    private static final class C17113b extends ProtoAdapter<DeleteShortcutsRequest> {
        C17113b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteShortcutsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteShortcutsRequest deleteShortcutsRequest) {
            return Shortcut.ADAPTER.asRepeated().encodedSizeWithTag(1, deleteShortcutsRequest.shortcuts) + deleteShortcutsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteShortcutsRequest decode(ProtoReader protoReader) throws IOException {
            C17112a aVar = new C17112a();
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
                    aVar.f43842a.add(Shortcut.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteShortcutsRequest deleteShortcutsRequest) throws IOException {
            Shortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, deleteShortcutsRequest.shortcuts);
            protoWriter.writeBytes(deleteShortcutsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.DeleteShortcutsRequest$a */
    public static final class C17112a extends Message.Builder<DeleteShortcutsRequest, C17112a> {

        /* renamed from: a */
        public List<Shortcut> f43842a = Internal.newMutableList();

        /* renamed from: a */
        public DeleteShortcutsRequest build() {
            return new DeleteShortcutsRequest(this.f43842a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17112a mo60325a(List<Shortcut> list) {
            Internal.checkElementsNotNull(list);
            this.f43842a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17112a newBuilder() {
        C17112a aVar = new C17112a();
        aVar.f43842a = Internal.copyOf("shortcuts", this.shortcuts);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "DeleteShortcutsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.shortcuts.isEmpty()) {
            sb.append(", shortcuts=");
            sb.append(this.shortcuts);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteShortcutsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteShortcutsRequest(List<Shortcut> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteShortcutsRequest(List<Shortcut> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shortcuts = Internal.immutableCopyOf("shortcuts", list);
    }
}
