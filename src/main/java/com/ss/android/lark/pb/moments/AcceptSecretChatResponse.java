package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AcceptSecretChatResponse extends Message<AcceptSecretChatResponse, C49894a> {
    public static final ProtoAdapter<AcceptSecretChatResponse> ADAPTER = new C49895b();
    public static final Boolean DEFAULT_IS_EXPIRED = false;
    private static final long serialVersionUID = 0;
    public final String mchat_id;
    public final Boolean mis_expired;

    /* renamed from: com.ss.android.lark.pb.moments.AcceptSecretChatResponse$b */
    private static final class C49895b extends ProtoAdapter<AcceptSecretChatResponse> {
        C49895b() {
            super(FieldEncoding.LENGTH_DELIMITED, AcceptSecretChatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(AcceptSecretChatResponse acceptSecretChatResponse) {
            int i;
            int i2 = 0;
            if (acceptSecretChatResponse.mchat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, acceptSecretChatResponse.mchat_id);
            } else {
                i = 0;
            }
            if (acceptSecretChatResponse.mis_expired != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, acceptSecretChatResponse.mis_expired);
            }
            return i + i2 + acceptSecretChatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public AcceptSecretChatResponse decode(ProtoReader protoReader) throws IOException {
            C49894a aVar = new C49894a();
            aVar.f124914a = "";
            aVar.f124915b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124914a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124915b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AcceptSecretChatResponse acceptSecretChatResponse) throws IOException {
            if (acceptSecretChatResponse.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, acceptSecretChatResponse.mchat_id);
            }
            if (acceptSecretChatResponse.mis_expired != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, acceptSecretChatResponse.mis_expired);
            }
            protoWriter.writeBytes(acceptSecretChatResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.AcceptSecretChatResponse$a */
    public static final class C49894a extends Message.Builder<AcceptSecretChatResponse, C49894a> {

        /* renamed from: a */
        public String f124914a;

        /* renamed from: b */
        public Boolean f124915b;

        /* renamed from: a */
        public AcceptSecretChatResponse build() {
            return new AcceptSecretChatResponse(this.f124914a, this.f124915b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49894a newBuilder() {
        C49894a aVar = new C49894a();
        aVar.f124914a = this.mchat_id;
        aVar.f124915b = this.mis_expired;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.mis_expired != null) {
            sb.append(", is_expired=");
            sb.append(this.mis_expired);
        }
        StringBuilder replace = sb.replace(0, 2, "AcceptSecretChatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public AcceptSecretChatResponse(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public AcceptSecretChatResponse(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mchat_id = str;
        this.mis_expired = bool;
    }
}
