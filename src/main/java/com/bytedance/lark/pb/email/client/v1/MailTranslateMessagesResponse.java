package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailTranslateMessagesResponse extends Message<MailTranslateMessagesResponse, C16920a> {
    public static final ProtoAdapter<MailTranslateMessagesResponse> ADAPTER = new C16921b();
    private static final long serialVersionUID = 0;
    public final List<TranslateMessageInfo> messages;

    public enum TranslateResult implements WireEnum {
        SUCCEED(0),
        NOT_SUPPORT(1),
        SAME_LANGUAGE(2),
        BLOB_DETECTED(3),
        BACKEND_ERROR(4),
        PARTIAL_SUPPORT(5),
        IGNORED(6);
        
        public static final ProtoAdapter<TranslateResult> ADAPTER = ProtoAdapter.newEnumAdapter(TranslateResult.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static TranslateResult fromValue(int i) {
            switch (i) {
                case 0:
                    return SUCCEED;
                case 1:
                    return NOT_SUPPORT;
                case 2:
                    return SAME_LANGUAGE;
                case 3:
                    return BLOB_DETECTED;
                case 4:
                    return BACKEND_ERROR;
                case 5:
                    return PARTIAL_SUPPORT;
                case 6:
                    return IGNORED;
                default:
                    return null;
            }
        }

        private TranslateResult(int i) {
            this.value = i;
        }
    }

    public static final class TranslateMessageInfo extends Message<TranslateMessageInfo, C16918a> {
        public static final ProtoAdapter<TranslateMessageInfo> ADAPTER = new C16919b();
        public static final TranslateResult DEFAULT_RESULT = TranslateResult.SUCCEED;
        public static final Boolean DEFAULT_SHOW_ORIGINAL_TEXT = false;
        private static final long serialVersionUID = 0;
        public final String message_id;
        public final TranslateResult result;
        public final Boolean show_original_text;
        public final List<String> source_languages;
        public final String thread_id;
        public final String translated_body;
        public final String translated_body_plain_text;
        public final String translated_subject;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateMessageInfo$b */
        private static final class C16919b extends ProtoAdapter<TranslateMessageInfo> {
            C16919b() {
                super(FieldEncoding.LENGTH_DELIMITED, TranslateMessageInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(TranslateMessageInfo translateMessageInfo) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (translateMessageInfo.message_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, translateMessageInfo.message_id);
                } else {
                    i = 0;
                }
                if (translateMessageInfo.translated_subject != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, translateMessageInfo.translated_subject);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (translateMessageInfo.translated_body_plain_text != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, translateMessageInfo.translated_body_plain_text);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (translateMessageInfo.translated_body != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, translateMessageInfo.translated_body);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (translateMessageInfo.result != null) {
                    i5 = TranslateResult.ADAPTER.encodedSizeWithTag(5, translateMessageInfo.result);
                } else {
                    i5 = 0;
                }
                int encodedSizeWithTag = i10 + i5 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, translateMessageInfo.source_languages);
                if (translateMessageInfo.show_original_text != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, translateMessageInfo.show_original_text);
                } else {
                    i6 = 0;
                }
                int i11 = encodedSizeWithTag + i6;
                if (translateMessageInfo.thread_id != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(8, translateMessageInfo.thread_id);
                }
                return i11 + i7 + translateMessageInfo.unknownFields().size();
            }

            /* renamed from: a */
            public TranslateMessageInfo decode(ProtoReader protoReader) throws IOException {
                C16918a aVar = new C16918a();
                aVar.f43410a = "";
                aVar.f43411b = "";
                aVar.f43412c = "";
                aVar.f43413d = "";
                aVar.f43414e = TranslateResult.SUCCEED;
                aVar.f43416g = false;
                aVar.f43417h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f43410a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f43411b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f43412c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f43413d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                try {
                                    aVar.f43414e = TranslateResult.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 6:
                                aVar.f43415f.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 7:
                                aVar.f43416g = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                aVar.f43417h = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                        }
                    } else {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, TranslateMessageInfo translateMessageInfo) throws IOException {
                if (translateMessageInfo.message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, translateMessageInfo.message_id);
                }
                if (translateMessageInfo.translated_subject != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, translateMessageInfo.translated_subject);
                }
                if (translateMessageInfo.translated_body_plain_text != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, translateMessageInfo.translated_body_plain_text);
                }
                if (translateMessageInfo.translated_body != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, translateMessageInfo.translated_body);
                }
                if (translateMessageInfo.result != null) {
                    TranslateResult.ADAPTER.encodeWithTag(protoWriter, 5, translateMessageInfo.result);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, translateMessageInfo.source_languages);
                if (translateMessageInfo.show_original_text != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, translateMessageInfo.show_original_text);
                }
                if (translateMessageInfo.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, translateMessageInfo.thread_id);
                }
                protoWriter.writeBytes(translateMessageInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$TranslateMessageInfo$a */
        public static final class C16918a extends Message.Builder<TranslateMessageInfo, C16918a> {

            /* renamed from: a */
            public String f43410a;

            /* renamed from: b */
            public String f43411b;

            /* renamed from: c */
            public String f43412c;

            /* renamed from: d */
            public String f43413d;

            /* renamed from: e */
            public TranslateResult f43414e;

            /* renamed from: f */
            public List<String> f43415f = Internal.newMutableList();

            /* renamed from: g */
            public Boolean f43416g;

            /* renamed from: h */
            public String f43417h;

            /* renamed from: a */
            public TranslateMessageInfo build() {
                return new TranslateMessageInfo(this.f43410a, this.f43411b, this.f43412c, this.f43413d, this.f43414e, this.f43415f, this.f43416g, this.f43417h, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16918a newBuilder() {
            C16918a aVar = new C16918a();
            aVar.f43410a = this.message_id;
            aVar.f43411b = this.translated_subject;
            aVar.f43412c = this.translated_body_plain_text;
            aVar.f43413d = this.translated_body;
            aVar.f43414e = this.result;
            aVar.f43415f = Internal.copyOf("source_languages", this.source_languages);
            aVar.f43416g = this.show_original_text;
            aVar.f43417h = this.thread_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "TranslateMessageInfo");
            StringBuilder sb = new StringBuilder();
            if (this.message_id != null) {
                sb.append(", message_id=");
                sb.append(this.message_id);
            }
            if (this.translated_subject != null) {
                sb.append(", translated_subject=");
                sb.append(this.translated_subject);
            }
            if (this.translated_body_plain_text != null) {
                sb.append(", translated_body_plain_text=");
                sb.append(this.translated_body_plain_text);
            }
            if (this.translated_body != null) {
                sb.append(", translated_body=");
                sb.append(this.translated_body);
            }
            if (this.result != null) {
                sb.append(", result=");
                sb.append(this.result);
            }
            if (!this.source_languages.isEmpty()) {
                sb.append(", source_languages=");
                sb.append(this.source_languages);
            }
            if (this.show_original_text != null) {
                sb.append(", show_original_text=");
                sb.append(this.show_original_text);
            }
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            StringBuilder replace = sb.replace(0, 2, "TranslateMessageInfo{");
            replace.append('}');
            return replace.toString();
        }

        public TranslateMessageInfo(String str, String str2, String str3, String str4, TranslateResult translateResult, List<String> list, Boolean bool, String str5) {
            this(str, str2, str3, str4, translateResult, list, bool, str5, ByteString.EMPTY);
        }

        public TranslateMessageInfo(String str, String str2, String str3, String str4, TranslateResult translateResult, List<String> list, Boolean bool, String str5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.message_id = str;
            this.translated_subject = str2;
            this.translated_body_plain_text = str3;
            this.translated_body = str4;
            this.result = translateResult;
            this.source_languages = Internal.immutableCopyOf("source_languages", list);
            this.show_original_text = bool;
            this.thread_id = str5;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$b */
    private static final class C16921b extends ProtoAdapter<MailTranslateMessagesResponse> {
        C16921b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailTranslateMessagesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailTranslateMessagesResponse mailTranslateMessagesResponse) {
            return TranslateMessageInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, mailTranslateMessagesResponse.messages) + mailTranslateMessagesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailTranslateMessagesResponse decode(ProtoReader protoReader) throws IOException {
            C16920a aVar = new C16920a();
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
                    aVar.f43418a.add(TranslateMessageInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailTranslateMessagesResponse mailTranslateMessagesResponse) throws IOException {
            TranslateMessageInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailTranslateMessagesResponse.messages);
            protoWriter.writeBytes(mailTranslateMessagesResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesResponse$a */
    public static final class C16920a extends Message.Builder<MailTranslateMessagesResponse, C16920a> {

        /* renamed from: a */
        public List<TranslateMessageInfo> f43418a = Internal.newMutableList();

        /* renamed from: a */
        public MailTranslateMessagesResponse build() {
            return new MailTranslateMessagesResponse(this.f43418a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16920a newBuilder() {
        C16920a aVar = new C16920a();
        aVar.f43418a = Internal.copyOf("messages", this.messages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailTranslateMessagesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        StringBuilder replace = sb.replace(0, 2, "MailTranslateMessagesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailTranslateMessagesResponse(List<TranslateMessageInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public MailTranslateMessagesResponse(List<TranslateMessageInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
    }
}
