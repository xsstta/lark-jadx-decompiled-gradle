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

public final class TranslateError extends Message<TranslateError, C18097a> {
    public static final ProtoAdapter<TranslateError> ADAPTER = new C18098b();
    public static final Long DEFAULT_ERROR_CODE = 0L;
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final Long error_code;
    public final String message_id;
    public final MessageSource message_source;

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateError$b */
    private static final class C18098b extends ProtoAdapter<TranslateError> {
        C18098b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslateError.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslateError translateError) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, translateError.message_id) + MessageSource.ADAPTER.encodedSizeWithTag(2, translateError.message_source);
            if (translateError.chat_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, translateError.chat_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + ProtoAdapter.INT64.encodedSizeWithTag(4, translateError.error_code) + translateError.unknownFields().size();
        }

        /* renamed from: a */
        public TranslateError decode(ProtoReader protoReader) throws IOException {
            C18097a aVar = new C18097a();
            aVar.f45238a = "";
            aVar.f45240c = "";
            aVar.f45241d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45238a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45239b = MessageSource.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45240c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45241d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslateError translateError) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, translateError.message_id);
            MessageSource.ADAPTER.encodeWithTag(protoWriter, 2, translateError.message_source);
            if (translateError.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, translateError.chat_id);
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, translateError.error_code);
            protoWriter.writeBytes(translateError.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18097a newBuilder() {
        C18097a aVar = new C18097a();
        aVar.f45238a = this.message_id;
        aVar.f45239b = this.message_source;
        aVar.f45240c = this.chat_id;
        aVar.f45241d = this.error_code;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TranslateError$a */
    public static final class C18097a extends Message.Builder<TranslateError, C18097a> {

        /* renamed from: a */
        public String f45238a;

        /* renamed from: b */
        public MessageSource f45239b;

        /* renamed from: c */
        public String f45240c;

        /* renamed from: d */
        public Long f45241d;

        /* renamed from: a */
        public TranslateError build() {
            MessageSource messageSource;
            Long l;
            String str = this.f45238a;
            if (str != null && (messageSource = this.f45239b) != null && (l = this.f45241d) != null) {
                return new TranslateError(str, messageSource, this.f45240c, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "message_id", this.f45239b, "message_source", this.f45241d, "error_code");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TranslateError");
        StringBuilder sb = new StringBuilder();
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", message_source=");
        sb.append(this.message_source);
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        sb.append(", error_code=");
        sb.append(this.error_code);
        StringBuilder replace = sb.replace(0, 2, "TranslateError{");
        replace.append('}');
        return replace.toString();
    }

    public TranslateError(String str, MessageSource messageSource, String str2, Long l) {
        this(str, messageSource, str2, l, ByteString.EMPTY);
    }

    public TranslateError(String str, MessageSource messageSource, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.message_source = messageSource;
        this.chat_id = str2;
        this.error_code = l;
    }
}
