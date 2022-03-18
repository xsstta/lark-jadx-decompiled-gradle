package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AcceptSecretChatRequest extends Message<AcceptSecretChatRequest, C49892a> {
    public static final ProtoAdapter<AcceptSecretChatRequest> ADAPTER = new C49893b();
    private static final long serialVersionUID = 0;
    public final String mtoken;

    /* renamed from: com.ss.android.lark.pb.moments.AcceptSecretChatRequest$b */
    private static final class C49893b extends ProtoAdapter<AcceptSecretChatRequest> {
        C49893b() {
            super(FieldEncoding.LENGTH_DELIMITED, AcceptSecretChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AcceptSecretChatRequest acceptSecretChatRequest) {
            int i;
            if (acceptSecretChatRequest.mtoken != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, acceptSecretChatRequest.mtoken);
            } else {
                i = 0;
            }
            return i + acceptSecretChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AcceptSecretChatRequest decode(ProtoReader protoReader) throws IOException {
            C49892a aVar = new C49892a();
            aVar.f124913a = "";
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
                    aVar.f124913a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AcceptSecretChatRequest acceptSecretChatRequest) throws IOException {
            if (acceptSecretChatRequest.mtoken != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, acceptSecretChatRequest.mtoken);
            }
            protoWriter.writeBytes(acceptSecretChatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.AcceptSecretChatRequest$a */
    public static final class C49892a extends Message.Builder<AcceptSecretChatRequest, C49892a> {

        /* renamed from: a */
        public String f124913a;

        /* renamed from: a */
        public AcceptSecretChatRequest build() {
            return new AcceptSecretChatRequest(this.f124913a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49892a mo173546a(String str) {
            this.f124913a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49892a newBuilder() {
        C49892a aVar = new C49892a();
        aVar.f124913a = this.mtoken;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtoken != null) {
            sb.append(", token=");
            sb.append(this.mtoken);
        }
        StringBuilder replace = sb.replace(0, 2, "AcceptSecretChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AcceptSecretChatRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public AcceptSecretChatRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtoken = str;
    }
}
