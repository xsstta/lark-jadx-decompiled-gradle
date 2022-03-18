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

public final class GetChatLinkInfoRequest extends Message<GetChatLinkInfoRequest, C17520a> {
    public static final ProtoAdapter<GetChatLinkInfoRequest> ADAPTER = new C17521b();
    private static final long serialVersionUID = 0;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkInfoRequest$b */
    private static final class C17521b extends ProtoAdapter<GetChatLinkInfoRequest> {
        C17521b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChatLinkInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChatLinkInfoRequest getChatLinkInfoRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getChatLinkInfoRequest.token) + getChatLinkInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChatLinkInfoRequest decode(ProtoReader protoReader) throws IOException {
            C17520a aVar = new C17520a();
            aVar.f44447a = "";
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
                    aVar.f44447a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChatLinkInfoRequest getChatLinkInfoRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getChatLinkInfoRequest.token);
            protoWriter.writeBytes(getChatLinkInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.GetChatLinkInfoRequest$a */
    public static final class C17520a extends Message.Builder<GetChatLinkInfoRequest, C17520a> {

        /* renamed from: a */
        public String f44447a;

        /* renamed from: a */
        public GetChatLinkInfoRequest build() {
            String str = this.f44447a;
            if (str != null) {
                return new GetChatLinkInfoRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "token");
        }

        /* renamed from: a */
        public C17520a mo61366a(String str) {
            this.f44447a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17520a newBuilder() {
        C17520a aVar = new C17520a();
        aVar.f44447a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "GetChatLinkInfoRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", token=");
        sb.append(this.token);
        StringBuilder replace = sb.replace(0, 2, "GetChatLinkInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChatLinkInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetChatLinkInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
