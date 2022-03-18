package com.bytedance.lark.pb.behavior.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class EnterChatRequest extends Message<EnterChatRequest, C15448a> {
    public static final ProtoAdapter<EnterChatRequest> ADAPTER = new C15449b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.EnterChatRequest$b */
    private static final class C15449b extends ProtoAdapter<EnterChatRequest> {
        C15449b() {
            super(FieldEncoding.LENGTH_DELIMITED, EnterChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(EnterChatRequest enterChatRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, enterChatRequest.chat_id) + enterChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public EnterChatRequest decode(ProtoReader protoReader) throws IOException {
            C15448a aVar = new C15448a();
            aVar.f40904a = "";
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
                    aVar.f40904a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EnterChatRequest enterChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, enterChatRequest.chat_id);
            protoWriter.writeBytes(enterChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.EnterChatRequest$a */
    public static final class C15448a extends Message.Builder<EnterChatRequest, C15448a> {

        /* renamed from: a */
        public String f40904a;

        /* renamed from: a */
        public EnterChatRequest build() {
            String str = this.f40904a;
            if (str != null) {
                return new EnterChatRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C15448a mo55998a(String str) {
            this.f40904a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15448a newBuilder() {
        C15448a aVar = new C15448a();
        aVar.f40904a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "EnterChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "EnterChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public EnterChatRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public EnterChatRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
