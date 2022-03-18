package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.MessageSource;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TranslateMessageContext extends Message<TranslateMessageContext, C18103a> {
    public static final ProtoAdapter<TranslateMessageContext> ADAPTER = new C18104b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String manual_target_language;
    public final String message_id;
    public final MessageSource message_source;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateMessageContext$b */
    private static final class C18104b extends ProtoAdapter<TranslateMessageContext> {
        C18104b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateMessageContext.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateMessageContext translateMessageContext) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, translateMessageContext.message_id);
            int i2 = 0;
            if (translateMessageContext.message_source != null) {
                i = MessageSource.ADAPTER.encodedSizeWithTag(2, translateMessageContext.message_source);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (translateMessageContext.manual_target_language != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, translateMessageContext.manual_target_language);
            }
            return i3 + i2 + ProtoAdapter.STRING.encodedSizeWithTag(4, translateMessageContext.chat_id) + translateMessageContext.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateMessageContext decode(ProtoReader protoReader) throws IOException {
            C18103a aVar = new C18103a();
            aVar.f45248a = "";
            aVar.f45250c = "";
            aVar.f45251d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45248a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45249b = MessageSource.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45250c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45251d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateMessageContext translateMessageContext) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, translateMessageContext.message_id);
            if (translateMessageContext.message_source != null) {
                MessageSource.ADAPTER.encodeWithTag(protoWriter, 2, translateMessageContext.message_source);
            }
            if (translateMessageContext.manual_target_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, translateMessageContext.manual_target_language);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, translateMessageContext.chat_id);
            protoWriter.writeBytes(translateMessageContext.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18103a newBuilder() {
        C18103a aVar = new C18103a();
        aVar.f45248a = this.message_id;
        aVar.f45249b = this.message_source;
        aVar.f45250c = this.manual_target_language;
        aVar.f45251d = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateMessageContext$a */
    public static final class C18103a extends Message.Builder<TranslateMessageContext, C18103a> {

        /* renamed from: a */
        public String f45248a;

        /* renamed from: b */
        public MessageSource f45249b;

        /* renamed from: c */
        public String f45250c;

        /* renamed from: d */
        public String f45251d;

        /* renamed from: a */
        public TranslateMessageContext build() {
            String str;
            String str2 = this.f45248a;
            if (str2 != null && (str = this.f45251d) != null) {
                return new TranslateMessageContext(str2, this.f45249b, this.f45250c, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "message_id", this.f45251d, "chat_id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateMessageContext");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        if (this.message_source != null) {
            sb.append(", message_source=");
            sb.append(this.message_source);
        }
        if (this.manual_target_language != null) {
            sb.append(", manual_target_language=");
            sb.append(this.manual_target_language);
        }
        sb.append(", chat_id=");
        sb.append(this.chat_id);
        StringBuilder replace = sb.replace(0, 2, "TranslateMessageContext{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateMessageContext(String str, MessageSource messageSource, String str2, String str3) {
        this(str, messageSource, str2, str3, ByteString.EMPTY);
    }

    public TranslateMessageContext(String str, MessageSource messageSource, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.message_source = messageSource;
        this.manual_target_language = str2;
        this.chat_id = str3;
    }
}
