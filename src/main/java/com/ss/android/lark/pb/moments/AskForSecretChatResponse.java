package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AskForSecretChatResponse extends Message<AskForSecretChatResponse, C49898a> {
    public static final ProtoAdapter<AskForSecretChatResponse> ADAPTER = new C49899b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.moments.AskForSecretChatResponse$b */
    private static final class C49899b extends ProtoAdapter<AskForSecretChatResponse> {
        C49899b() {
            super(FieldEncoding.LENGTH_DELIMITED, AskForSecretChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(AskForSecretChatResponse askForSecretChatResponse) {
            return askForSecretChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public AskForSecretChatResponse decode(ProtoReader protoReader) throws IOException {
            C49898a aVar = new C49898a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AskForSecretChatResponse askForSecretChatResponse) throws IOException {
            protoWriter.writeBytes(askForSecretChatResponse.unknownFields());
        }
    }

    public AskForSecretChatResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.moments.AskForSecretChatResponse$a */
    public static final class C49898a extends Message.Builder<AskForSecretChatResponse, C49898a> {
        /* renamed from: a */
        public AskForSecretChatResponse build() {
            return new AskForSecretChatResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49898a newBuilder() {
        C49898a aVar = new C49898a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "AskForSecretChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public AskForSecretChatResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
