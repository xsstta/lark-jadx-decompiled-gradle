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

public final class GetChatLimitInfoRequest extends Message<GetChatLimitInfoRequest, C17516a> {
    public static final ProtoAdapter<GetChatLimitInfoRequest> ADAPTER = new C17517b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLimitInfoRequest$b */
    private static final class C17517b extends ProtoAdapter<GetChatLimitInfoRequest> {
        C17517b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatLimitInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatLimitInfoRequest getChatLimitInfoRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatLimitInfoRequest.chat_id) + getChatLimitInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatLimitInfoRequest decode(ProtoReader protoReader) throws IOException {
            C17516a aVar = new C17516a();
            aVar.f44443a = "";
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
                    aVar.f44443a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatLimitInfoRequest getChatLimitInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatLimitInfoRequest.chat_id);
            protoWriter.writeBytes(getChatLimitInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLimitInfoRequest$a */
    public static final class C17516a extends Message.Builder<GetChatLimitInfoRequest, C17516a> {

        /* renamed from: a */
        public String f44443a;

        /* renamed from: a */
        public GetChatLimitInfoRequest build() {
            String str = this.f44443a;
            if (str != null) {
                return new GetChatLimitInfoRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C17516a mo61357a(String str) {
            this.f44443a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17516a newBuilder() {
        C17516a aVar = new C17516a();
        aVar.f44443a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatLimitInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "GetChatLimitInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatLimitInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatLimitInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
