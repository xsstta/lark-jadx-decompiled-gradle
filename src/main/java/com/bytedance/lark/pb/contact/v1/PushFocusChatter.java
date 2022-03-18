package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushFocusChatter extends Message<PushFocusChatter, C16354a> {
    public static final ProtoAdapter<PushFocusChatter> ADAPTER = new C16355b();
    private static final long serialVersionUID = 0;
    public final List<Chatter> add_chatters;
    public final List<Long> delete_chatter_ids;

    /* renamed from: com.bytedance.lark.pb.contact.v1.PushFocusChatter$b */
    private static final class C16355b extends ProtoAdapter<PushFocusChatter> {
        C16355b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushFocusChatter.class);
        }

        /* renamed from: a */
        public int encodedSize(PushFocusChatter pushFocusChatter) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, pushFocusChatter.delete_chatter_ids) + Chatter.ADAPTER.asRepeated().encodedSizeWithTag(2, pushFocusChatter.add_chatters) + pushFocusChatter.unknownFields().size();
        }

        /* renamed from: a */
        public PushFocusChatter decode(ProtoReader protoReader) throws IOException {
            C16354a aVar = new C16354a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42599a.add(ProtoAdapter.INT64.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42600b.add(Chatter.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushFocusChatter pushFocusChatter) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, pushFocusChatter.delete_chatter_ids);
            Chatter.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, pushFocusChatter.add_chatters);
            protoWriter.writeBytes(pushFocusChatter.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.PushFocusChatter$a */
    public static final class C16354a extends Message.Builder<PushFocusChatter, C16354a> {

        /* renamed from: a */
        public List<Long> f42599a = Internal.newMutableList();

        /* renamed from: b */
        public List<Chatter> f42600b = Internal.newMutableList();

        /* renamed from: a */
        public PushFocusChatter build() {
            return new PushFocusChatter(this.f42599a, this.f42600b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16354a newBuilder() {
        C16354a aVar = new C16354a();
        aVar.f42599a = Internal.copyOf("delete_chatter_ids", this.delete_chatter_ids);
        aVar.f42600b = Internal.copyOf("add_chatters", this.add_chatters);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PushFocusChatter");
        StringBuilder sb = new StringBuilder();
        if (!this.delete_chatter_ids.isEmpty()) {
            sb.append(", delete_chatter_ids=");
            sb.append(this.delete_chatter_ids);
        }
        if (!this.add_chatters.isEmpty()) {
            sb.append(", add_chatters=");
            sb.append(this.add_chatters);
        }
        StringBuilder replace = sb.replace(0, 2, "PushFocusChatter{");
        replace.append('}');
        return replace.toString();
    }

    public PushFocusChatter(List<Long> list, List<Chatter> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public PushFocusChatter(List<Long> list, List<Chatter> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.delete_chatter_ids = Internal.immutableCopyOf("delete_chatter_ids", list);
        this.add_chatters = Internal.immutableCopyOf("add_chatters", list2);
    }
}
