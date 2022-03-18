package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushUserReactionsResponse extends Message<PushUserReactionsResponse, C17967a> {
    public static final ProtoAdapter<PushUserReactionsResponse> ADAPTER = new C17968b();
    private static final long serialVersionUID = 0;
    public final UserReactions user_reactions;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushUserReactionsResponse$b */
    private static final class C17968b extends ProtoAdapter<PushUserReactionsResponse> {
        C17968b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushUserReactionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PushUserReactionsResponse pushUserReactionsResponse) {
            int i;
            if (pushUserReactionsResponse.user_reactions != null) {
                i = UserReactions.ADAPTER.encodedSizeWithTag(1, pushUserReactionsResponse.user_reactions);
            } else {
                i = 0;
            }
            return i + pushUserReactionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PushUserReactionsResponse decode(ProtoReader protoReader) throws IOException {
            C17967a aVar = new C17967a();
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
                    aVar.f45063a = UserReactions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushUserReactionsResponse pushUserReactionsResponse) throws IOException {
            if (pushUserReactionsResponse.user_reactions != null) {
                UserReactions.ADAPTER.encodeWithTag(protoWriter, 1, pushUserReactionsResponse.user_reactions);
            }
            protoWriter.writeBytes(pushUserReactionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushUserReactionsResponse$a */
    public static final class C17967a extends Message.Builder<PushUserReactionsResponse, C17967a> {

        /* renamed from: a */
        public UserReactions f45063a;

        /* renamed from: a */
        public PushUserReactionsResponse build() {
            return new PushUserReactionsResponse(this.f45063a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17967a newBuilder() {
        C17967a aVar = new C17967a();
        aVar.f45063a = this.user_reactions;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushUserReactionsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.user_reactions != null) {
            sb.append(", user_reactions=");
            sb.append(this.user_reactions);
        }
        StringBuilder replace = sb.replace(0, 2, "PushUserReactionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PushUserReactionsResponse(UserReactions userReactions) {
        this(userReactions, ByteString.EMPTY);
    }

    public PushUserReactionsResponse(UserReactions userReactions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_reactions = userReactions;
    }
}
