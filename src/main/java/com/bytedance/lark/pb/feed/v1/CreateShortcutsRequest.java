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

public final class CreateShortcutsRequest extends Message<CreateShortcutsRequest, C17104a> {
    public static final ProtoAdapter<CreateShortcutsRequest> ADAPTER = new C17105b();
    private static final long serialVersionUID = 0;
    public final List<Shortcut> shortcuts;

    /* renamed from: com.bytedance.lark.pb.feed.v1.CreateShortcutsRequest$b */
    private static final class C17105b extends ProtoAdapter<CreateShortcutsRequest> {
        C17105b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateShortcutsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateShortcutsRequest createShortcutsRequest) {
            return Shortcut.ADAPTER.asRepeated().encodedSizeWithTag(1, createShortcutsRequest.shortcuts) + createShortcutsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateShortcutsRequest decode(ProtoReader protoReader) throws IOException {
            C17104a aVar = new C17104a();
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
                    aVar.f43837a.add(Shortcut.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateShortcutsRequest createShortcutsRequest) throws IOException {
            Shortcut.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, createShortcutsRequest.shortcuts);
            protoWriter.writeBytes(createShortcutsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.CreateShortcutsRequest$a */
    public static final class C17104a extends Message.Builder<CreateShortcutsRequest, C17104a> {

        /* renamed from: a */
        public List<Shortcut> f43837a = Internal.newMutableList();

        /* renamed from: a */
        public CreateShortcutsRequest build() {
            return new CreateShortcutsRequest(this.f43837a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17104a mo60306a(List<Shortcut> list) {
            Internal.checkElementsNotNull(list);
            this.f43837a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17104a newBuilder() {
        C17104a aVar = new C17104a();
        aVar.f43837a = Internal.copyOf("shortcuts", this.shortcuts);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "CreateShortcutsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.shortcuts.isEmpty()) {
            sb.append(", shortcuts=");
            sb.append(this.shortcuts);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateShortcutsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateShortcutsRequest(List<Shortcut> list) {
        this(list, ByteString.EMPTY);
    }

    public CreateShortcutsRequest(List<Shortcut> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.shortcuts = Internal.immutableCopyOf("shortcuts", list);
    }
}
