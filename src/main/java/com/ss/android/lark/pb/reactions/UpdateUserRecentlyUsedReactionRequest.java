package com.ss.android.lark.pb.reactions;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateUserRecentlyUsedReactionRequest extends Message<UpdateUserRecentlyUsedReactionRequest, C50000a> {
    public static final ProtoAdapter<UpdateUserRecentlyUsedReactionRequest> ADAPTER = new C50001b();
    private static final long serialVersionUID = 0;
    public final String mreaction_key;

    /* renamed from: com.ss.android.lark.pb.reactions.UpdateUserRecentlyUsedReactionRequest$b */
    private static final class C50001b extends ProtoAdapter<UpdateUserRecentlyUsedReactionRequest> {
        C50001b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateUserRecentlyUsedReactionRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateUserRecentlyUsedReactionRequest updateUserRecentlyUsedReactionRequest) {
            int i;
            if (updateUserRecentlyUsedReactionRequest.mreaction_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateUserRecentlyUsedReactionRequest.mreaction_key);
            } else {
                i = 0;
            }
            return i + updateUserRecentlyUsedReactionRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateUserRecentlyUsedReactionRequest decode(ProtoReader protoReader) throws IOException {
            C50000a aVar = new C50000a();
            aVar.f125054a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125054a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateUserRecentlyUsedReactionRequest updateUserRecentlyUsedReactionRequest) throws IOException {
            if (updateUserRecentlyUsedReactionRequest.mreaction_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateUserRecentlyUsedReactionRequest.mreaction_key);
            }
            protoWriter.writeBytes(updateUserRecentlyUsedReactionRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.reactions.UpdateUserRecentlyUsedReactionRequest$a */
    public static final class C50000a extends Message.Builder<UpdateUserRecentlyUsedReactionRequest, C50000a> {

        /* renamed from: a */
        public String f125054a;

        /* renamed from: a */
        public UpdateUserRecentlyUsedReactionRequest build() {
            return new UpdateUserRecentlyUsedReactionRequest(this.f125054a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50000a mo173800a(String str) {
            this.f125054a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50000a newBuilder() {
        C50000a aVar = new C50000a();
        aVar.f125054a = this.mreaction_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mreaction_key != null) {
            sb.append(", reaction_key=");
            sb.append(this.mreaction_key);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateUserRecentlyUsedReactionRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateUserRecentlyUsedReactionRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpdateUserRecentlyUsedReactionRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mreaction_key = str;
    }
}
