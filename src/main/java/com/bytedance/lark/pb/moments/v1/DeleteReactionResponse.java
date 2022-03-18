package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteReactionResponse extends Message<DeleteReactionResponse, C18364a> {
    public static final ProtoAdapter<DeleteReactionResponse> ADAPTER = new C18365b();
    private static final long serialVersionUID = 0;
    public final Entities entities;
    public final ReactionSet modified_reaction_set;

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeleteReactionResponse$b */
    private static final class C18365b extends ProtoAdapter<DeleteReactionResponse> {
        C18365b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteReactionResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteReactionResponse deleteReactionResponse) {
            int i;
            int i2 = 0;
            if (deleteReactionResponse.modified_reaction_set != null) {
                i = ReactionSet.ADAPTER.encodedSizeWithTag(1, deleteReactionResponse.modified_reaction_set);
            } else {
                i = 0;
            }
            if (deleteReactionResponse.entities != null) {
                i2 = Entities.ADAPTER.encodedSizeWithTag(2, deleteReactionResponse.entities);
            }
            return i + i2 + deleteReactionResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteReactionResponse decode(ProtoReader protoReader) throws IOException {
            C18364a aVar = new C18364a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45740a = ReactionSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45741b = Entities.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteReactionResponse deleteReactionResponse) throws IOException {
            if (deleteReactionResponse.modified_reaction_set != null) {
                ReactionSet.ADAPTER.encodeWithTag(protoWriter, 1, deleteReactionResponse.modified_reaction_set);
            }
            if (deleteReactionResponse.entities != null) {
                Entities.ADAPTER.encodeWithTag(protoWriter, 2, deleteReactionResponse.entities);
            }
            protoWriter.writeBytes(deleteReactionResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.DeleteReactionResponse$a */
    public static final class C18364a extends Message.Builder<DeleteReactionResponse, C18364a> {

        /* renamed from: a */
        public ReactionSet f45740a;

        /* renamed from: b */
        public Entities f45741b;

        /* renamed from: a */
        public DeleteReactionResponse build() {
            return new DeleteReactionResponse(this.f45740a, this.f45741b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18364a newBuilder() {
        C18364a aVar = new C18364a();
        aVar.f45740a = this.modified_reaction_set;
        aVar.f45741b = this.entities;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "DeleteReactionResponse");
        StringBuilder sb = new StringBuilder();
        if (this.modified_reaction_set != null) {
            sb.append(", modified_reaction_set=");
            sb.append(this.modified_reaction_set);
        }
        if (this.entities != null) {
            sb.append(", entities=");
            sb.append(this.entities);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteReactionResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteReactionResponse(ReactionSet reactionSet, Entities entities2) {
        this(reactionSet, entities2, ByteString.EMPTY);
    }

    public DeleteReactionResponse(ReactionSet reactionSet, Entities entities2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.modified_reaction_set = reactionSet;
        this.entities = entities2;
    }
}
