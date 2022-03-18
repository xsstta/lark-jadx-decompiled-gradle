package com.ss.android.lark.pb.moments;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AskForSecretChatRequest extends Message<AskForSecretChatRequest, C49896a> {
    public static final ProtoAdapter<AskForSecretChatRequest> ADAPTER = new C49897b();
    private static final long serialVersionUID = 0;
    public final String mcomment_id;
    public final String mmessage;
    public final String mpost_id;

    /* renamed from: com.ss.android.lark.pb.moments.AskForSecretChatRequest$b */
    private static final class C49897b extends ProtoAdapter<AskForSecretChatRequest> {
        C49897b() {
            super(FieldEncoding.LENGTH_DELIMITED, AskForSecretChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(AskForSecretChatRequest askForSecretChatRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (askForSecretChatRequest.mpost_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, askForSecretChatRequest.mpost_id);
            } else {
                i = 0;
            }
            if (askForSecretChatRequest.mcomment_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, askForSecretChatRequest.mcomment_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (askForSecretChatRequest.mmessage != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, askForSecretChatRequest.mmessage);
            }
            return i4 + i3 + askForSecretChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public AskForSecretChatRequest decode(ProtoReader protoReader) throws IOException {
            C49896a aVar = new C49896a();
            aVar.f124916a = "";
            aVar.f124917b = "";
            aVar.f124918c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124916a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124917b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124918c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AskForSecretChatRequest askForSecretChatRequest) throws IOException {
            if (askForSecretChatRequest.mpost_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, askForSecretChatRequest.mpost_id);
            }
            if (askForSecretChatRequest.mcomment_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, askForSecretChatRequest.mcomment_id);
            }
            if (askForSecretChatRequest.mmessage != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, askForSecretChatRequest.mmessage);
            }
            protoWriter.writeBytes(askForSecretChatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.moments.AskForSecretChatRequest$a */
    public static final class C49896a extends Message.Builder<AskForSecretChatRequest, C49896a> {

        /* renamed from: a */
        public String f124916a;

        /* renamed from: b */
        public String f124917b;

        /* renamed from: c */
        public String f124918c;

        /* renamed from: a */
        public AskForSecretChatRequest build() {
            return new AskForSecretChatRequest(this.f124916a, this.f124917b, this.f124918c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49896a mo173555a(String str) {
            this.f124916a = str;
            return this;
        }

        /* renamed from: b */
        public C49896a mo173557b(String str) {
            this.f124917b = str;
            return this;
        }

        /* renamed from: c */
        public C49896a mo173558c(String str) {
            this.f124918c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49896a newBuilder() {
        C49896a aVar = new C49896a();
        aVar.f124916a = this.mpost_id;
        aVar.f124917b = this.mcomment_id;
        aVar.f124918c = this.mmessage;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mpost_id != null) {
            sb.append(", post_id=");
            sb.append(this.mpost_id);
        }
        if (this.mcomment_id != null) {
            sb.append(", comment_id=");
            sb.append(this.mcomment_id);
        }
        if (this.mmessage != null) {
            sb.append(", message=");
            sb.append(this.mmessage);
        }
        StringBuilder replace = sb.replace(0, 2, "AskForSecretChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public AskForSecretChatRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public AskForSecretChatRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mpost_id = str;
        this.mcomment_id = str2;
        this.mmessage = str3;
    }
}
