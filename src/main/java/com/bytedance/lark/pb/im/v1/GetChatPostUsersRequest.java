package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetChatPostUsersRequest extends Message<GetChatPostUsersRequest, C17538a> {
    public static final ProtoAdapter<GetChatPostUsersRequest> ADAPTER = new C17539b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPostUsersRequest$b */
    private static final class C17539b extends ProtoAdapter<GetChatPostUsersRequest> {
        C17539b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatPostUsersRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatPostUsersRequest getChatPostUsersRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatPostUsersRequest.chat_id) + getChatPostUsersRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatPostUsersRequest decode(ProtoReader protoReader) throws IOException {
            C17538a aVar = new C17538a();
            aVar.f44493a = "";
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
                    aVar.f44493a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatPostUsersRequest getChatPostUsersRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatPostUsersRequest.chat_id);
            protoWriter.writeBytes(getChatPostUsersRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatPostUsersRequest$a */
    public static final class C17538a extends Message.Builder<GetChatPostUsersRequest, C17538a> {

        /* renamed from: a */
        public String f44493a;

        /* renamed from: a */
        public GetChatPostUsersRequest build() {
            String str = this.f44493a;
            if (str != null) {
                return new GetChatPostUsersRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17538a mo61419a(String str) {
            this.f44493a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17538a newBuilder() {
        C17538a aVar = new C17538a();
        aVar.f44493a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatPostUsersRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetChatPostUsersRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatPostUsersRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatPostUsersRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
