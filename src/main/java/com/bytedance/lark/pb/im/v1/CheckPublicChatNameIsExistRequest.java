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

public final class CheckPublicChatNameIsExistRequest extends Message<CheckPublicChatNameIsExistRequest, C17326a> {
    public static final ProtoAdapter<CheckPublicChatNameIsExistRequest> ADAPTER = new C17327b();
    private static final long serialVersionUID = 0;
    public final String chat_name;

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckPublicChatNameIsExistRequest$b */
    private static final class C17327b extends ProtoAdapter<CheckPublicChatNameIsExistRequest> {
        C17327b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckPublicChatNameIsExistRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckPublicChatNameIsExistRequest checkPublicChatNameIsExistRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, checkPublicChatNameIsExistRequest.chat_name) + checkPublicChatNameIsExistRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckPublicChatNameIsExistRequest decode(ProtoReader protoReader) throws IOException {
            C17326a aVar = new C17326a();
            aVar.f44178a = "";
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
                    aVar.f44178a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckPublicChatNameIsExistRequest checkPublicChatNameIsExistRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkPublicChatNameIsExistRequest.chat_name);
            protoWriter.writeBytes(checkPublicChatNameIsExistRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.CheckPublicChatNameIsExistRequest$a */
    public static final class C17326a extends Message.Builder<CheckPublicChatNameIsExistRequest, C17326a> {

        /* renamed from: a */
        public String f44178a;

        /* renamed from: a */
        public CheckPublicChatNameIsExistRequest build() {
            String str = this.f44178a;
            if (str != null) {
                return new CheckPublicChatNameIsExistRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_name");
        }

        /* renamed from: a */
        public C17326a mo60838a(String str) {
            this.f44178a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17326a newBuilder() {
        C17326a aVar = new C17326a();
        aVar.f44178a = this.chat_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "CheckPublicChatNameIsExistRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_name=");
        sb.append(this.chat_name);
        StringBuilder replace = sb.replace(0, 2, "CheckPublicChatNameIsExistRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckPublicChatNameIsExistRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public CheckPublicChatNameIsExistRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_name = str;
    }
}
