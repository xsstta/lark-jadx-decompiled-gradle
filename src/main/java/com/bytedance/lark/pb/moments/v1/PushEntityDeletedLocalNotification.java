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

public final class PushEntityDeletedLocalNotification extends Message<PushEntityDeletedLocalNotification, C18504a> {
    public static final ProtoAdapter<PushEntityDeletedLocalNotification> ADAPTER = new C18505b();
    public static final EntityType DEFAULT_ENTITY_TYPE = EntityType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final String entity_id;
    public final EntityType entity_type;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushEntityDeletedLocalNotification$b */
    private static final class C18505b extends ProtoAdapter<PushEntityDeletedLocalNotification> {
        C18505b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushEntityDeletedLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushEntityDeletedLocalNotification pushEntityDeletedLocalNotification) {
            int i;
            int i2 = 0;
            if (pushEntityDeletedLocalNotification.entity_type != null) {
                i = EntityType.ADAPTER.encodedSizeWithTag(1, pushEntityDeletedLocalNotification.entity_type);
            } else {
                i = 0;
            }
            if (pushEntityDeletedLocalNotification.entity_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushEntityDeletedLocalNotification.entity_id);
            }
            return i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, pushEntityDeletedLocalNotification.category_ids) + pushEntityDeletedLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushEntityDeletedLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18504a aVar = new C18504a();
            aVar.f45973a = EntityType.UNKNOWN;
            aVar.f45974b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f45973a = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f45974b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45975c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushEntityDeletedLocalNotification pushEntityDeletedLocalNotification) throws IOException {
            if (pushEntityDeletedLocalNotification.entity_type != null) {
                EntityType.ADAPTER.encodeWithTag(protoWriter, 1, pushEntityDeletedLocalNotification.entity_type);
            }
            if (pushEntityDeletedLocalNotification.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushEntityDeletedLocalNotification.entity_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, pushEntityDeletedLocalNotification.category_ids);
            protoWriter.writeBytes(pushEntityDeletedLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushEntityDeletedLocalNotification$a */
    public static final class C18504a extends Message.Builder<PushEntityDeletedLocalNotification, C18504a> {

        /* renamed from: a */
        public EntityType f45973a;

        /* renamed from: b */
        public String f45974b;

        /* renamed from: c */
        public List<String> f45975c = Internal.newMutableList();

        /* renamed from: a */
        public PushEntityDeletedLocalNotification build() {
            return new PushEntityDeletedLocalNotification(this.f45973a, this.f45974b, this.f45975c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18504a newBuilder() {
        C18504a aVar = new C18504a();
        aVar.f45973a = this.entity_type;
        aVar.f45974b = this.entity_id;
        aVar.f45975c = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushEntityDeletedLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.entity_type != null) {
            sb.append(", entity_type=");
            sb.append(this.entity_type);
        }
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushEntityDeletedLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushEntityDeletedLocalNotification(EntityType entityType, String str, List<String> list) {
        this(entityType, str, list, ByteString.EMPTY);
    }

    public PushEntityDeletedLocalNotification(EntityType entityType, String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_type = entityType;
        this.entity_id = str;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
    }
}
