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

public final class CreateReactionRequest extends Message<CreateReactionRequest, C18354a> {
    public static final ProtoAdapter<CreateReactionRequest> ADAPTER = new C18355b();
    public static final EntityType DEFAULT_ENTITY_TYPE = EntityType.UNKNOWN;
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    private static final long serialVersionUID = 0;
    public final String entity_id;
    public final EntityType entity_type;
    public final Boolean is_anonymous;
    public final ReactionSet original_reaction_set;
    public final List<String> push_category_ids;
    public final String reaction_type;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateReactionRequest$b */
    private static final class C18355b extends ProtoAdapter<CreateReactionRequest> {
        C18355b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateReactionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateReactionRequest createReactionRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (createReactionRequest.entity_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, createReactionRequest.entity_id);
            } else {
                i = 0;
            }
            if (createReactionRequest.reaction_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, createReactionRequest.reaction_type);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (createReactionRequest.entity_type != null) {
                i3 = EntityType.ADAPTER.encodedSizeWithTag(3, createReactionRequest.entity_type);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (createReactionRequest.original_reaction_set != null) {
                i4 = ReactionSet.ADAPTER.encodedSizeWithTag(4, createReactionRequest.original_reaction_set);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i7 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, createReactionRequest.push_category_ids);
            if (createReactionRequest.is_anonymous != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(102, createReactionRequest.is_anonymous);
            }
            return encodedSizeWithTag + i5 + createReactionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateReactionRequest decode(ProtoReader protoReader) throws IOException {
            C18354a aVar = new C18354a();
            aVar.f45720a = "";
            aVar.f45721b = "";
            aVar.f45722c = EntityType.UNKNOWN;
            aVar.f45725f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45720a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45721b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f45722c = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f45723d = ReactionSet.ADAPTER.decode(protoReader);
                } else if (nextTag == 101) {
                    aVar.f45724e.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 102) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45725f = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateReactionRequest createReactionRequest) throws IOException {
            if (createReactionRequest.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createReactionRequest.entity_id);
            }
            if (createReactionRequest.reaction_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createReactionRequest.reaction_type);
            }
            if (createReactionRequest.entity_type != null) {
                EntityType.ADAPTER.encodeWithTag(protoWriter, 3, createReactionRequest.entity_type);
            }
            if (createReactionRequest.original_reaction_set != null) {
                ReactionSet.ADAPTER.encodeWithTag(protoWriter, 4, createReactionRequest.original_reaction_set);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, createReactionRequest.push_category_ids);
            if (createReactionRequest.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 102, createReactionRequest.is_anonymous);
            }
            protoWriter.writeBytes(createReactionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateReactionRequest$a */
    public static final class C18354a extends Message.Builder<CreateReactionRequest, C18354a> {

        /* renamed from: a */
        public String f45720a;

        /* renamed from: b */
        public String f45721b;

        /* renamed from: c */
        public EntityType f45722c;

        /* renamed from: d */
        public ReactionSet f45723d;

        /* renamed from: e */
        public List<String> f45724e = Internal.newMutableList();

        /* renamed from: f */
        public Boolean f45725f;

        /* renamed from: a */
        public CreateReactionRequest build() {
            return new CreateReactionRequest(this.f45720a, this.f45721b, this.f45722c, this.f45723d, this.f45724e, this.f45725f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18354a mo63506a(EntityType entityType) {
            this.f45722c = entityType;
            return this;
        }

        /* renamed from: b */
        public C18354a mo63511b(String str) {
            this.f45721b = str;
            return this;
        }

        /* renamed from: a */
        public C18354a mo63507a(ReactionSet reactionSet) {
            this.f45723d = reactionSet;
            return this;
        }

        /* renamed from: a */
        public C18354a mo63508a(Boolean bool) {
            this.f45725f = bool;
            return this;
        }

        /* renamed from: a */
        public C18354a mo63509a(String str) {
            this.f45720a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18354a newBuilder() {
        C18354a aVar = new C18354a();
        aVar.f45720a = this.entity_id;
        aVar.f45721b = this.reaction_type;
        aVar.f45722c = this.entity_type;
        aVar.f45723d = this.original_reaction_set;
        aVar.f45724e = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.f45725f = this.is_anonymous;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CreateReactionRequest");
        StringBuilder sb = new StringBuilder();
        if (this.entity_id != null) {
            sb.append(", entity_id=");
            sb.append(this.entity_id);
        }
        if (this.reaction_type != null) {
            sb.append(", reaction_type=");
            sb.append(this.reaction_type);
        }
        if (this.entity_type != null) {
            sb.append(", entity_type=");
            sb.append(this.entity_type);
        }
        if (this.original_reaction_set != null) {
            sb.append(", original_reaction_set=");
            sb.append(this.original_reaction_set);
        }
        if (!this.push_category_ids.isEmpty()) {
            sb.append(", push_category_ids=");
            sb.append(this.push_category_ids);
        }
        if (this.is_anonymous != null) {
            sb.append(", is_anonymous=");
            sb.append(this.is_anonymous);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateReactionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateReactionRequest(String str, String str2, EntityType entityType, ReactionSet reactionSet, List<String> list, Boolean bool) {
        this(str, str2, entityType, reactionSet, list, bool, ByteString.EMPTY);
    }

    public CreateReactionRequest(String str, String str2, EntityType entityType, ReactionSet reactionSet, List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.reaction_type = str2;
        this.entity_type = entityType;
        this.original_reaction_set = reactionSet;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
        this.is_anonymous = bool;
    }
}
