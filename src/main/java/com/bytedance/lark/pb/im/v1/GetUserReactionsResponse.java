package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetUserReactionsResponse extends Message<GetUserReactionsResponse, C17765a> {
    public static final ProtoAdapter<GetUserReactionsResponse> ADAPTER = new C17766b();
    private static final long serialVersionUID = 0;
    public final UserReactions user_reactions;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUserReactionsResponse$b */
    private static final class C17766b extends ProtoAdapter<GetUserReactionsResponse> {
        C17766b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserReactionsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserReactionsResponse getUserReactionsResponse) {
            int i;
            if (getUserReactionsResponse.user_reactions != null) {
                i = UserReactions.ADAPTER.encodedSizeWithTag(1, getUserReactionsResponse.user_reactions);
            } else {
                i = 0;
            }
            return i + getUserReactionsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserReactionsResponse decode(ProtoReader protoReader) throws IOException {
            C17765a aVar = new C17765a();
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
                    aVar.f44811a = UserReactions.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserReactionsResponse getUserReactionsResponse) throws IOException {
            if (getUserReactionsResponse.user_reactions != null) {
                UserReactions.ADAPTER.encodeWithTag(protoWriter, 1, getUserReactionsResponse.user_reactions);
            }
            protoWriter.writeBytes(getUserReactionsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetUserReactionsResponse$a */
    public static final class C17765a extends Message.Builder<GetUserReactionsResponse, C17765a> {

        /* renamed from: a */
        public UserReactions f44811a;

        /* renamed from: a */
        public GetUserReactionsResponse build() {
            return new GetUserReactionsResponse(this.f44811a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17765a newBuilder() {
        C17765a aVar = new C17765a();
        aVar.f44811a = this.user_reactions;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetUserReactionsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.user_reactions != null) {
            sb.append(", user_reactions=");
            sb.append(this.user_reactions);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserReactionsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserReactionsResponse(UserReactions userReactions) {
        this(userReactions, ByteString.EMPTY);
    }

    public GetUserReactionsResponse(UserReactions userReactions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_reactions = userReactions;
    }
}
