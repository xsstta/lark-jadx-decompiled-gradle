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

public final class PushReactionSetLocalNotification extends Message<PushReactionSetLocalNotification, C18518a> {
    public static final ProtoAdapter<PushReactionSetLocalNotification> ADAPTER = new C18519b();
    public static final EntityType DEFAULT_ENTITY_TYPE = EntityType.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> category_ids;
    public final Entities entities;
    public final String entity_id;
    public final EntityType entity_type;
    public final ReactionSet reaction_set;

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushReactionSetLocalNotification$b */
    private static final class C18519b extends ProtoAdapter<PushReactionSetLocalNotification> {
        C18519b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushReactionSetLocalNotification.class);
        }

        /* renamed from: a */
        public int encodedSize(PushReactionSetLocalNotification pushReactionSetLocalNotification) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (pushReactionSetLocalNotification.entity_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushReactionSetLocalNotification.entity_id);
            } else {
                i = 0;
            }
            if (pushReactionSetLocalNotification.entity_type != null) {
                i2 = EntityType.ADAPTER.encodedSizeWithTag(2, pushReactionSetLocalNotification.entity_type);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (pushReactionSetLocalNotification.reaction_set != null) {
                i3 = ReactionSet.ADAPTER.encodedSizeWithTag(3, pushReactionSetLocalNotification.reaction_set);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (pushReactionSetLocalNotification.entities != null) {
                i4 = Entities.ADAPTER.encodedSizeWithTag(4, pushReactionSetLocalNotification.entities);
            }
            return i6 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, pushReactionSetLocalNotification.category_ids) + pushReactionSetLocalNotification.unknownFields().size();
        }

        /* renamed from: a */
        public PushReactionSetLocalNotification decode(ProtoReader protoReader) throws IOException {
            C18518a aVar = new C18518a();
            aVar.f45994a = "";
            aVar.f45995b = EntityType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45994a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f45995b = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f45996c = ReactionSet.ADAPTER.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f45997d = Entities.ADAPTER.decode(protoReader);
                } else if (nextTag != 101) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45998e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushReactionSetLocalNotification pushReactionSetLocalNotification) throws IOException {
            if (pushReactionSetLocalNotification.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushReactionSetLocalNotification.entity_id);
            }
            if (pushReactionSetLocalNotification.entity_type != null) {
                EntityType.ADAPTER.encodeWithTag(protoWriter, 2, pushReactionSetLocalNotification.entity_type);
            }
            if (pushReactionSetLocalNotification.reaction_set != null) {
                ReactionSet.ADAPTER.encodeWithTag(protoWriter, 3, pushReactionSetLocalNotification.reaction_set);
            }
            if (pushReactionSetLocalNotification.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 4, pushReactionSetLocalNotification.entities);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, pushReactionSetLocalNotification.category_ids);
            protoWriter.writeBytes(pushReactionSetLocalNotification.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.PushReactionSetLocalNotification$a */
    public static final class C18518a extends Message.Builder<PushReactionSetLocalNotification, C18518a> {

        /* renamed from: a */
        public String f45994a;

        /* renamed from: b */
        public EntityType f45995b;

        /* renamed from: c */
        public ReactionSet f45996c;

        /* renamed from: d */
        public Entities f45997d;

        /* renamed from: e */
        public List<String> f45998e = Internal.newMutableList();

        /* renamed from: a */
        public PushReactionSetLocalNotification build() {
            return new PushReactionSetLocalNotification(this.f45994a, this.f45995b, this.f45996c, this.f45997d, this.f45998e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18518a newBuilder() {
        C18518a aVar = new C18518a();
        aVar.f45994a = this.entity_id;
        aVar.f45995b = this.entity_type;
        aVar.f45996c = this.reaction_set;
        aVar.f45997d = this.entities;
        aVar.f45998e = Internal.copyOf("category_ids", this.category_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "PushReactionSetLocalNotification");
        StringBuilder sb = new StringBuilder();
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (this.entity_type != null) {
            sb.append(", entity_type=");
            sb.append(this.entity_type);
        }
        if (this.reaction_set != null) {
            sb.append(", reaction_set=");
            sb.append(this.reaction_set);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        if (!this.category_ids.isEmpty()) {
            sb.append(", category_ids=");
            sb.append(this.category_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushReactionSetLocalNotification{");
        replace.append('}');
        return replace.toString();
    }

    public PushReactionSetLocalNotification(String str, EntityType entityType, ReactionSet reactionSet, Entities entities2, List<String> list) {
        this(str, entityType, reactionSet, entities2, list, ByteString.EMPTY);
    }

    public PushReactionSetLocalNotification(String str, EntityType entityType, ReactionSet reactionSet, Entities entities2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.entity_type = entityType;
        this.reaction_set = reactionSet;
        this.entities = entities2;
        this.category_ids = Internal.immutableCopyOf("category_ids", list);
    }
}
