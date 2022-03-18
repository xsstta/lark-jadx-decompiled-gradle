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

public final class DeleteReactionRequest extends Message<DeleteReactionRequest, C18362a> {
    public static final ProtoAdapter<DeleteReactionRequest> ADAPTER = new C18363b();
    public static final EntityType DEFAULT_ENTITY_TYPE = EntityType.UNKNOWN;
    public static final Boolean DEFAULT_IS_ANONYMOUS = false;
    private static final long serialVersionUID = 0;
    public final String entity_id;
    public final EntityType entity_type;
    public final Boolean is_anonymous;
    public final ReactionSet original_reaction_set;
    public final List<String> push_category_ids;
    public final String reaction_type;

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeleteReactionRequest$b */
    private static final class C18363b extends ProtoAdapter<DeleteReactionRequest> {
        C18363b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteReactionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteReactionRequest deleteReactionRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (deleteReactionRequest.entity_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteReactionRequest.entity_id);
            } else {
                i = 0;
            }
            if (deleteReactionRequest.reaction_type != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, deleteReactionRequest.reaction_type);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (deleteReactionRequest.entity_type != null) {
                i3 = EntityType.ADAPTER.encodedSizeWithTag(3, deleteReactionRequest.entity_type);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (deleteReactionRequest.original_reaction_set != null) {
                i4 = ReactionSet.ADAPTER.encodedSizeWithTag(4, deleteReactionRequest.original_reaction_set);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag = i7 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(101, deleteReactionRequest.push_category_ids);
            if (deleteReactionRequest.is_anonymous != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(102, deleteReactionRequest.is_anonymous);
            }
            return encodedSizeWithTag + i5 + deleteReactionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteReactionRequest decode(ProtoReader protoReader) throws IOException {
            C18362a aVar = new C18362a();
            aVar.f45734a = "";
            aVar.f45735b = "";
            aVar.f45736c = EntityType.UNKNOWN;
            aVar.f45739f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45734a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45735b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f45736c = EntityType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 4) {
                    aVar.f45737d = ReactionSet.ADAPTER.decode(protoReader);
                } else if (nextTag == 101) {
                    aVar.f45738e.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 102) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45739f = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteReactionRequest deleteReactionRequest) throws IOException {
            if (deleteReactionRequest.entity_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteReactionRequest.entity_id);
            }
            if (deleteReactionRequest.reaction_type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deleteReactionRequest.reaction_type);
            }
            if (deleteReactionRequest.entity_type != null) {
                EntityType.ADAPTER.encodeWithTag(protoWriter, 3, deleteReactionRequest.entity_type);
            }
            if (deleteReactionRequest.original_reaction_set != null) {
                ReactionSet.ADAPTER.encodeWithTag(protoWriter, 4, deleteReactionRequest.original_reaction_set);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 101, deleteReactionRequest.push_category_ids);
            if (deleteReactionRequest.is_anonymous != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 102, deleteReactionRequest.is_anonymous);
            }
            protoWriter.writeBytes(deleteReactionRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeleteReactionRequest$a */
    public static final class C18362a extends Message.Builder<DeleteReactionRequest, C18362a> {

        /* renamed from: a */
        public String f45734a;

        /* renamed from: b */
        public String f45735b;

        /* renamed from: c */
        public EntityType f45736c;

        /* renamed from: d */
        public ReactionSet f45737d;

        /* renamed from: e */
        public List<String> f45738e = Internal.newMutableList();

        /* renamed from: f */
        public Boolean f45739f;

        /* renamed from: a */
        public DeleteReactionRequest build() {
            return new DeleteReactionRequest(this.f45734a, this.f45735b, this.f45736c, this.f45737d, this.f45738e, this.f45739f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18362a mo63531a(EntityType entityType) {
            this.f45736c = entityType;
            return this;
        }

        /* renamed from: b */
        public C18362a mo63536b(String str) {
            this.f45735b = str;
            return this;
        }

        /* renamed from: a */
        public C18362a mo63532a(ReactionSet reactionSet) {
            this.f45737d = reactionSet;
            return this;
        }

        /* renamed from: a */
        public C18362a mo63533a(Boolean bool) {
            this.f45739f = bool;
            return this;
        }

        /* renamed from: a */
        public C18362a mo63534a(String str) {
            this.f45734a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18362a newBuilder() {
        C18362a aVar = new C18362a();
        aVar.f45734a = this.entity_id;
        aVar.f45735b = this.reaction_type;
        aVar.f45736c = this.entity_type;
        aVar.f45737d = this.original_reaction_set;
        aVar.f45738e = Internal.copyOf("push_category_ids", this.push_category_ids);
        aVar.f45739f = this.is_anonymous;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "DeleteReactionRequest");
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
        StringBuilder replace = sb.replace(0, 2, "DeleteReactionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteReactionRequest(String str, String str2, EntityType entityType, ReactionSet reactionSet, List<String> list, Boolean bool) {
        this(str, str2, entityType, reactionSet, list, bool, ByteString.EMPTY);
    }

    public DeleteReactionRequest(String str, String str2, EntityType entityType, ReactionSet reactionSet, List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_id = str;
        this.reaction_type = str2;
        this.entity_type = entityType;
        this.original_reaction_set = reactionSet;
        this.push_category_ids = Internal.immutableCopyOf("push_category_ids", list);
        this.is_anonymous = bool;
    }
}
