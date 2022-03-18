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

public final class GetChatAvatarMetaRequest extends Message<GetChatAvatarMetaRequest, C17494a> {
    public static final ProtoAdapter<GetChatAvatarMetaRequest> ADAPTER = new C17495b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAvatarMetaRequest$b */
    private static final class C17495b extends ProtoAdapter<GetChatAvatarMetaRequest> {
        C17495b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatAvatarMetaRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatAvatarMetaRequest getChatAvatarMetaRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatAvatarMetaRequest.chat_id) + getChatAvatarMetaRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatAvatarMetaRequest decode(ProtoReader protoReader) throws IOException {
            C17494a aVar = new C17494a();
            aVar.f44403a = "";
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
                    aVar.f44403a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatAvatarMetaRequest getChatAvatarMetaRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatAvatarMetaRequest.chat_id);
            protoWriter.writeBytes(getChatAvatarMetaRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatAvatarMetaRequest$a */
    public static final class C17494a extends Message.Builder<GetChatAvatarMetaRequest, C17494a> {

        /* renamed from: a */
        public String f44403a;

        /* renamed from: a */
        public GetChatAvatarMetaRequest build() {
            String str = this.f44403a;
            if (str != null) {
                return new GetChatAvatarMetaRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17494a mo61297a(String str) {
            this.f44403a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17494a newBuilder() {
        C17494a aVar = new C17494a();
        aVar.f44403a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatAvatarMetaRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetChatAvatarMetaRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatAvatarMetaRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatAvatarMetaRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
