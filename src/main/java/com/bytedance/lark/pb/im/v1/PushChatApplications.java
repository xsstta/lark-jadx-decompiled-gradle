package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.ChatApplication;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class PushChatApplications extends Message<PushChatApplications, C17871a> {
    public static final ProtoAdapter<PushChatApplications> ADAPTER = new C17872b();
    private static final long serialVersionUID = 0;
    public final List<ChatApplication> applications;
    public final C14928Entity entity;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatApplications$b */
    private static final class C17872b extends ProtoAdapter<PushChatApplications> {
        C17872b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushChatApplications.class);
        }

        /* renamed from: a */
        public int encodedSize(PushChatApplications pushChatApplications) {
            int i;
            int encodedSizeWithTag = ChatApplication.ADAPTER.asRepeated().encodedSizeWithTag(1, pushChatApplications.applications);
            if (pushChatApplications.entity != null) {
                i = C14928Entity.ADAPTER.encodedSizeWithTag(2, pushChatApplications.entity);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushChatApplications.unknownFields().size();
        }

        /* renamed from: a */
        public PushChatApplications decode(ProtoReader protoReader) throws IOException {
            C17871a aVar = new C17871a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44942a.add(ChatApplication.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44943b = C14928Entity.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushChatApplications pushChatApplications) throws IOException {
            ChatApplication.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushChatApplications.applications);
            if (pushChatApplications.entity != null) {
                C14928Entity.ADAPTER.encodeWithTag(protoWriter, 2, pushChatApplications.entity);
            }
            protoWriter.writeBytes(pushChatApplications.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushChatApplications$a */
    public static final class C17871a extends Message.Builder<PushChatApplications, C17871a> {

        /* renamed from: a */
        public List<ChatApplication> f44942a = Internal.newMutableList();

        /* renamed from: b */
        public C14928Entity f44943b;

        /* renamed from: a */
        public PushChatApplications build() {
            return new PushChatApplications(this.f44942a, this.f44943b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17871a newBuilder() {
        C17871a aVar = new C17871a();
        aVar.f44942a = Internal.copyOf("applications", this.applications);
        aVar.f44943b = this.entity;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushChatApplications");
        StringBuilder sb = new StringBuilder();
        if (!this.applications.isEmpty()) {
            sb.append(", applications=");
            sb.append(this.applications);
        }
        if (this.entity != null) {
            sb.append(", entity=");
            sb.append(this.entity);
        }
        StringBuilder replace = sb.replace(0, 2, "PushChatApplications{");
        replace.append('}');
        return replace.toString();
    }

    public PushChatApplications(List<ChatApplication> list, C14928Entity entity2) {
        this(list, entity2, ByteString.EMPTY);
    }

    public PushChatApplications(List<ChatApplication> list, C14928Entity entity2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.applications = Internal.immutableCopyOf("applications", list);
        this.entity = entity2;
    }
}
