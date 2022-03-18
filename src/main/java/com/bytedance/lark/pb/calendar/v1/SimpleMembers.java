package com.bytedance.lark.pb.calendar.v1;

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

public final class SimpleMembers extends Message<SimpleMembers, C16058a> {
    public static final ProtoAdapter<SimpleMembers> ADAPTER = new C16059b();
    private static final long serialVersionUID = 0;
    public final List<SimpleMember> members;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SimpleMembers$b */
    private static final class C16059b extends ProtoAdapter<SimpleMembers> {
        C16059b() {
            super(FieldEncoding.LENGTH_DELIMITED, SimpleMembers.class);
        }

        /* renamed from: a */
        public int encodedSize(SimpleMembers simpleMembers) {
            return SimpleMember.ADAPTER.asRepeated().encodedSizeWithTag(1, simpleMembers.members) + simpleMembers.unknownFields().size();
        }

        /* renamed from: a */
        public SimpleMembers decode(ProtoReader protoReader) throws IOException {
            C16058a aVar = new C16058a();
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
                    aVar.f42136a.add(SimpleMember.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SimpleMembers simpleMembers) throws IOException {
            SimpleMember.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, simpleMembers.members);
            protoWriter.writeBytes(simpleMembers.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SimpleMembers$a */
    public static final class C16058a extends Message.Builder<SimpleMembers, C16058a> {

        /* renamed from: a */
        public List<SimpleMember> f42136a = Internal.newMutableList();

        /* renamed from: a */
        public SimpleMembers build() {
            return new SimpleMembers(this.f42136a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16058a mo57742a(List<SimpleMember> list) {
            Internal.checkElementsNotNull(list);
            this.f42136a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16058a newBuilder() {
        C16058a aVar = new C16058a();
        aVar.f42136a = Internal.copyOf("members", this.members);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SimpleMembers");
        StringBuilder sb = new StringBuilder();
        if (!this.members.isEmpty()) {
            sb.append(", members=");
            sb.append(this.members);
        }
        StringBuilder replace = sb.replace(0, 2, "SimpleMembers{");
        replace.append('}');
        return replace.toString();
    }

    public SimpleMembers(List<SimpleMember> list) {
        this(list, ByteString.EMPTY);
    }

    public SimpleMembers(List<SimpleMember> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.members = Internal.immutableCopyOf("members", list);
    }
}
