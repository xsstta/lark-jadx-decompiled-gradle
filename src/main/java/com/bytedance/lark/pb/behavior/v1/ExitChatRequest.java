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

public final class ExitChatRequest extends Message<ExitChatRequest, C15450a> {
    public static final ProtoAdapter<ExitChatRequest> ADAPTER = new C15451b();
    private static final long serialVersionUID = 0;
    public final String chat_id;

    /* renamed from: com.bytedance.lark.pb.behavior.v1.ExitChatRequest$b */
    private static final class C15451b extends ProtoAdapter<ExitChatRequest> {
        C15451b() {
            super(FieldEncoding.LENGTH_DELIMITED, ExitChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ExitChatRequest exitChatRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, exitChatRequest.chat_id) + exitChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ExitChatRequest decode(ProtoReader protoReader) throws IOException {
            C15450a aVar = new C15450a();
            aVar.f40905a = "";
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
                    aVar.f40905a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ExitChatRequest exitChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, exitChatRequest.chat_id);
            protoWriter.writeBytes(exitChatRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.behavior.v1.ExitChatRequest$a */
    public static final class C15450a extends Message.Builder<ExitChatRequest, C15450a> {

        /* renamed from: a */
        public String f40905a;

        /* renamed from: a */
        public ExitChatRequest build() {
            String str = this.f40905a;
            if (str != null) {
                return new ExitChatRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chat_id");
        }

        /* renamed from: a */
        public C15450a mo56003a(String str) {
            this.f40905a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15450a newBuilder() {
        C15450a aVar = new C15450a();
        aVar.f40905a = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("behavior", "ExitChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "ExitChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ExitChatRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public ExitChatRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id = str;
    }
}
