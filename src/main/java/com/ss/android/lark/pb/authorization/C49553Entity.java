package com.ss.android.lark.pb.authorization;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.lark.pb.authorization.Entity */
public final class C49553Entity extends Message<C49553Entity, C49554a> {
    public static final ProtoAdapter<C49553Entity> ADAPTER = new C49555b();
    private static final long serialVersionUID = 0;
    public final EntityType mentity_type;
    public final String mid;

    /* renamed from: com.ss.android.lark.pb.authorization.Entity$b */
    private static final class C49555b extends ProtoAdapter<C49553Entity> {
        C49555b() {
            super(FieldEncoding.LENGTH_DELIMITED, C49553Entity.class);
        }

        /* renamed from: a */
        public int encodedSize(C49553Entity entity) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, entity.mid) + EntityType.ADAPTER.encodedSizeWithTag(2, entity.mentity_type) + entity.unknownFields().size();
        }

        /* renamed from: a */
        public C49553Entity decode(ProtoReader protoReader) throws IOException {
            C49554a aVar = new C49554a();
            aVar.f124166a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124166a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f124167b = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, C49553Entity entity) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, entity.mid);
            EntityType.ADAPTER.encodeWithTag(protoWriter, 2, entity.mentity_type);
            protoWriter.writeBytes(entity.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49554a newBuilder() {
        C49554a aVar = new C49554a();
        aVar.f124166a = this.mid;
        aVar.f124167b = this.mentity_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.authorization.Entity$a */
    public static final class C49554a extends Message.Builder<C49553Entity, C49554a> {

        /* renamed from: a */
        public String f124166a;

        /* renamed from: b */
        public EntityType f124167b;

        /* renamed from: a */
        public C49553Entity build() {
            EntityType entityType;
            String str = this.f124166a;
            if (str != null && (entityType = this.f124167b) != null) {
                return new C49553Entity(str, entityType, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mid", this.f124167b, "mentity_type");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.mid);
        sb.append(", entity_type=");
        sb.append(this.mentity_type);
        StringBuilder replace = sb.replace(0, 2, "Entity{");
        replace.append('}');
        return replace.toString();
    }

    public C49553Entity(String str, EntityType entityType) {
        this(str, entityType, ByteString.EMPTY);
    }

    public C49553Entity(String str, EntityType entityType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mid = str;
        this.mentity_type = entityType;
    }
}
