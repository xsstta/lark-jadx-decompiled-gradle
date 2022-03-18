package com.bytedance.lark.pb.moments.v1;

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

public final class ReplaceBroadcastRequest extends Message<ReplaceBroadcastRequest, C18532a> {
    public static final ProtoAdapter<ReplaceBroadcastRequest> ADAPTER = new C18533b();
    private static final long serialVersionUID = 0;
    public final Broadcast new_broadcast;
    public final List<String> push_category_ids;
    public final String unset_post_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ReplaceBroadcastRequest$b */
    private static final class C18533b extends ProtoAdapter<ReplaceBroadcastRequest> {
        C18533b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReplaceBroadcastRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ReplaceBroadcastRequest replaceBroadcastRequest) {
            int i;
            int i2 = 0;
            if (replaceBroadcastRequest.new_broadcast != null) {
                i = Broadcast.ADAPTER.encodedSizeWithTag(1, replaceBroadcastRequest.new_broadcast);
            } else {
                i = 0;
            }
            if (replaceBroadcastRequest.unset_post_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, replaceBroadcastRequest.unset_post_id);
            }
            return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, replaceBroadcastRequest.push_category_ids) + replaceBroadcastRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ReplaceBroadcastRequest decode(ProtoReader protoReader) throws IOException {
            C18532a aVar = new C18532a();
            aVar.f46018b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46017a = Broadcast.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46018b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46019c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReplaceBroadcastRequest replaceBroadcastRequest) throws IOException {
            if (replaceBroadcastRequest.new_broadcast != null) {
                Broadcast.ADAPTER.encodeWithTag(protoWriter, 1, replaceBroadcastRequest.new_broadcast);
            }
            if (replaceBroadcastRequest.unset_post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, replaceBroadcastRequest.unset_post_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, replaceBroadcastRequest.push_category_ids);
            protoWriter.writeBytes(replaceBroadcastRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ReplaceBroadcastRequest$a */
    public static final class C18532a extends Message.Builder<ReplaceBroadcastRequest, C18532a> {

        /* renamed from: a */
        public Broadcast f46017a;

        /* renamed from: b */
        public String f46018b;

        /* renamed from: c */
        public List<String> f46019c = Internal.newMutableList();

        /* renamed from: a */
        public ReplaceBroadcastRequest build() {
            return new ReplaceBroadcastRequest(this.f46017a, this.f46018b, this.f46019c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18532a mo63937a(Broadcast broadcast) {
            this.f46017a = broadcast;
            return this;
        }

        /* renamed from: a */
        public C18532a mo63938a(String str) {
            this.f46018b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18532a newBuilder() {
        C18532a aVar = new C18532a();
        aVar.f46017a = this.new_broadcast;
        aVar.f46018b = this.unset_post_id;
        aVar.f46019c = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ReplaceBroadcastRequest");
        StringBuilder sb = new StringBuilder();
        if (this.new_broadcast != null) {
            sb.append(", new_broadcast=");
            sb.append(this.new_broadcast);
        }
        if (this.unset_post_id != null) {
            sb.append(", unset_post_id=");
            sb.append(this.unset_post_id);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "ReplaceBroadcastRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ReplaceBroadcastRequest(Broadcast broadcast, String str, List<String> list) {
        this(broadcast, str, list, ByteString.EMPTY);
    }

    public ReplaceBroadcastRequest(Broadcast broadcast, String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.new_broadcast = broadcast;
        this.unset_post_id = str;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
    }
}
