package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateReactionResponse extends Message<CreateReactionResponse, C18356a> {
    public static final ProtoAdapter<CreateReactionResponse> ADAPTER = new C18357b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final ReactionSet modified_reaction_set;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateReactionResponse$b */
    private static final class C18357b extends ProtoAdapter<CreateReactionResponse> {
        C18357b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateReactionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateReactionResponse createReactionResponse) {
            int i;
            int i2 = 0;
            if (createReactionResponse.modified_reaction_set != null) {
                i = ReactionSet.ADAPTER.encodedSizeWithTag(1, createReactionResponse.modified_reaction_set);
            } else {
                i = 0;
            }
            if (createReactionResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, createReactionResponse.entities);
            }
            return i + i2 + createReactionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateReactionResponse decode(ProtoReader protoReader) throws IOException {
            C18356a aVar = new C18356a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45726a = ReactionSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45727b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateReactionResponse createReactionResponse) throws IOException {
            if (createReactionResponse.modified_reaction_set != null) {
                ReactionSet.ADAPTER.encodeWithTag(protoWriter, 1, createReactionResponse.modified_reaction_set);
            }
            if (createReactionResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, createReactionResponse.entities);
            }
            protoWriter.writeBytes(createReactionResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CreateReactionResponse$a */
    public static final class C18356a extends Message.Builder<CreateReactionResponse, C18356a> {

        /* renamed from: a */
        public ReactionSet f45726a;

        /* renamed from: b */
        public Entities f45727b;

        /* renamed from: a */
        public CreateReactionResponse build() {
            return new CreateReactionResponse(this.f45726a, this.f45727b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18356a newBuilder() {
        C18356a aVar = new C18356a();
        aVar.f45726a = this.modified_reaction_set;
        aVar.f45727b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CreateReactionResponse");
        StringBuilder sb = new StringBuilder();
        if (this.modified_reaction_set != null) {
            sb.append(", modified_reaction_set=");
            sb.append(this.modified_reaction_set);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateReactionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateReactionResponse(ReactionSet reactionSet, Entities entities2) {
        this(reactionSet, entities2, ByteString.EMPTY);
    }

    public CreateReactionResponse(ReactionSet reactionSet, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.modified_reaction_set = reactionSet;
        this.entities = entities2;
    }
}
