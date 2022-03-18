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

public final class PushPostIsBroadcastLocalNotification extends Message<PushPostIsBroadcastLocalNotification, C18516a> {
    public static final ProtoAdapter<PushPostIsBroadcastLocalNotification> ADAPTER = new C18517b();
    public static final Boolean DEFAULT_IS_BROADCAST = false;
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final Boolean is_broadcast;
    public final String post_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushPostIsBroadcastLocalNotification$b */
    private static final class C18517b extends ProtoAdapter<PushPostIsBroadcastLocalNotification> {
        C18517b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushPostIsBroadcastLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushPostIsBroadcastLocalNotification pushPostIsBroadcastLocalNotification) {
            int i;
            int i2 = 0;
            if (pushPostIsBroadcastLocalNotification.post_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushPostIsBroadcastLocalNotification.post_id);
            } else {
                i = 0;
            }
            if (pushPostIsBroadcastLocalNotification.is_broadcast != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, pushPostIsBroadcastLocalNotification.is_broadcast);
            }
            return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, pushPostIsBroadcastLocalNotification.category_ids) + pushPostIsBroadcastLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushPostIsBroadcastLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18516a aVar = new C18516a();
            aVar.f45991a = "";
            aVar.f45992b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45991a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45992b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45993c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushPostIsBroadcastLocalNotification pushPostIsBroadcastLocalNotification) throws IOException {
            if (pushPostIsBroadcastLocalNotification.post_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushPostIsBroadcastLocalNotification.post_id);
            }
            if (pushPostIsBroadcastLocalNotification.is_broadcast != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pushPostIsBroadcastLocalNotification.is_broadcast);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, pushPostIsBroadcastLocalNotification.category_ids);
            protoWriter.writeBytes(pushPostIsBroadcastLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushPostIsBroadcastLocalNotification$a */
    public static final class C18516a extends Message.Builder<PushPostIsBroadcastLocalNotification, C18516a> {

        /* renamed from: a */
        public String f45991a;

        /* renamed from: b */
        public Boolean f45992b;

        /* renamed from: c */
        public List<String> f45993c = Internal.newMutableList();

        /* renamed from: a */
        public PushPostIsBroadcastLocalNotification build() {
            return new PushPostIsBroadcastLocalNotification(this.f45991a, this.f45992b, this.f45993c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18516a newBuilder() {
        C18516a aVar = new C18516a();
        aVar.f45991a = this.post_id;
        aVar.f45992b = this.is_broadcast;
        aVar.f45993c = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushPostIsBroadcastLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.post_id != null) {
            sb.append(", post_id=");
            sb.append(this.post_id);
        }
        if (this.is_broadcast != null) {
            sb.append(", is_broadcast=");
            sb.append(this.is_broadcast);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushPostIsBroadcastLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushPostIsBroadcastLocalNotification(String str, Boolean bool, List<String> list) {
        this(str, bool, list, ByteString.EMPTY);
    }

    public PushPostIsBroadcastLocalNotification(String str, Boolean bool, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.post_id = str;
        this.is_broadcast = bool;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
    }
}
