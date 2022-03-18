package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailTranslateMessagesRequest extends Message<MailTranslateMessagesRequest, C16916a> {
    public static final ProtoAdapter<MailTranslateMessagesRequest> ADAPTER = new C16917b();
    public static final Boolean DEFAULT_NEED_TRANSLATED_SUBJECT = false;
    public static final Boolean DEFAULT_SHOW_ORIGINAL_TEXT = false;
    private static final long serialVersionUID = 0;
    public final List<String> ignored_languages;
    public final List<TranslateMessage> messages;
    public final Boolean need_translated_subject;
    public final Boolean show_original_text;
    public final String source_language;
    public final String target_language;

    public static final class TranslateMessage extends Message<TranslateMessage, C16914a> {
        public static final ProtoAdapter<TranslateMessage> ADAPTER = new C16915b();
        public static final Boolean DEFAULT_IS_BODY_CLIPPED = false;
        public static final Boolean DEFAULT_SHOW_ORIGINAL_TEXT = false;
        private static final long serialVersionUID = 0;
        public final Boolean is_body_clipped;
        public final List<String> languages;
        public final String message_id;
        public final String owner_user_id;
        public final Boolean show_original_text;
        public final String thread_id;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesRequest$TranslateMessage$b */
        private static final class C16915b extends ProtoAdapter<TranslateMessage> {
            C16915b() {
                super(FieldEncoding.LENGTH_DELIMITED, TranslateMessage.class);
            }

            /* renamed from: a */
            public int encodedSize(TranslateMessage translateMessage) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (translateMessage.message_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, translateMessage.message_id);
                } else {
                    i = 0;
                }
                if (translateMessage.thread_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, translateMessage.thread_id);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (translateMessage.is_body_clipped != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, translateMessage.is_body_clipped);
                } else {
                    i3 = 0;
                }
                int encodedSizeWithTag = i6 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, translateMessage.languages);
                if (translateMessage.show_original_text != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, translateMessage.show_original_text);
                } else {
                    i4 = 0;
                }
                int i7 = encodedSizeWithTag + i4;
                if (translateMessage.owner_user_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, translateMessage.owner_user_id);
                }
                return i7 + i5 + translateMessage.unknownFields().size();
            }

            /* renamed from: a */
            public TranslateMessage decode(ProtoReader protoReader) throws IOException {
                C16914a aVar = new C16914a();
                aVar.f43398a = "";
                aVar.f43399b = "";
                aVar.f43400c = false;
                aVar.f43402e = false;
                aVar.f43403f = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f43398a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f43399b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f43400c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f43401d.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 5:
                                aVar.f43402e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f43403f = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, TranslateMessage translateMessage) throws IOException {
                if (translateMessage.message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, translateMessage.message_id);
                }
                if (translateMessage.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, translateMessage.thread_id);
                }
                if (translateMessage.is_body_clipped != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, translateMessage.is_body_clipped);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, translateMessage.languages);
                if (translateMessage.show_original_text != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, translateMessage.show_original_text);
                }
                if (translateMessage.owner_user_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, translateMessage.owner_user_id);
                }
                protoWriter.writeBytes(translateMessage.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesRequest$TranslateMessage$a */
        public static final class C16914a extends Message.Builder<TranslateMessage, C16914a> {

            /* renamed from: a */
            public String f43398a;

            /* renamed from: b */
            public String f43399b;

            /* renamed from: c */
            public Boolean f43400c;

            /* renamed from: d */
            public List<String> f43401d = Internal.newMutableList();

            /* renamed from: e */
            public Boolean f43402e;

            /* renamed from: f */
            public String f43403f;

            /* renamed from: a */
            public TranslateMessage build() {
                return new TranslateMessage(this.f43398a, this.f43399b, this.f43400c, this.f43401d, this.f43402e, this.f43403f, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16914a newBuilder() {
            C16914a aVar = new C16914a();
            aVar.f43398a = this.message_id;
            aVar.f43399b = this.thread_id;
            aVar.f43400c = this.is_body_clipped;
            aVar.f43401d = Internal.copyOf("languages", this.languages);
            aVar.f43402e = this.show_original_text;
            aVar.f43403f = this.owner_user_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "TranslateMessage");
            StringBuilder sb = new StringBuilder();
            if (this.message_id != null) {
                sb.append(", message_id=");
                sb.append(this.message_id);
            }
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            if (this.is_body_clipped != null) {
                sb.append(", is_body_clipped=");
                sb.append(this.is_body_clipped);
            }
            if (!this.languages.isEmpty()) {
                sb.append(", languages=");
                sb.append(this.languages);
            }
            if (this.show_original_text != null) {
                sb.append(", show_original_text=");
                sb.append(this.show_original_text);
            }
            if (this.owner_user_id != null) {
                sb.append(", owner_user_id=");
                sb.append(this.owner_user_id);
            }
            StringBuilder replace = sb.replace(0, 2, "TranslateMessage{");
            replace.append('}');
            return replace.toString();
        }

        public TranslateMessage(String str, String str2, Boolean bool, List<String> list, Boolean bool2, String str3) {
            this(str, str2, bool, list, bool2, str3, ByteString.EMPTY);
        }

        public TranslateMessage(String str, String str2, Boolean bool, List<String> list, Boolean bool2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.message_id = str;
            this.thread_id = str2;
            this.is_body_clipped = bool;
            this.languages = Internal.immutableCopyOf("languages", list);
            this.show_original_text = bool2;
            this.owner_user_id = str3;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesRequest$b */
    private static final class C16917b extends ProtoAdapter<MailTranslateMessagesRequest> {
        C16917b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailTranslateMessagesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailTranslateMessagesRequest mailTranslateMessagesRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = TranslateMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, mailTranslateMessagesRequest.messages);
            int i4 = 0;
            if (mailTranslateMessagesRequest.source_language != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailTranslateMessagesRequest.source_language);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (mailTranslateMessagesRequest.target_language != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailTranslateMessagesRequest.target_language);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (mailTranslateMessagesRequest.show_original_text != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailTranslateMessagesRequest.show_original_text);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (mailTranslateMessagesRequest.need_translated_subject != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, mailTranslateMessagesRequest.need_translated_subject);
            }
            return i7 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, mailTranslateMessagesRequest.ignored_languages) + mailTranslateMessagesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailTranslateMessagesRequest decode(ProtoReader protoReader) throws IOException {
            C16916a aVar = new C16916a();
            aVar.f43405b = "";
            aVar.f43406c = "";
            aVar.f43407d = false;
            aVar.f43408e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43404a.add(TranslateMessage.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f43405b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43406c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43407d = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43408e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43409f.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, MailTranslateMessagesRequest mailTranslateMessagesRequest) throws IOException {
            TranslateMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailTranslateMessagesRequest.messages);
            if (mailTranslateMessagesRequest.source_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailTranslateMessagesRequest.source_language);
            }
            if (mailTranslateMessagesRequest.target_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailTranslateMessagesRequest.target_language);
            }
            if (mailTranslateMessagesRequest.show_original_text != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailTranslateMessagesRequest.show_original_text);
            }
            if (mailTranslateMessagesRequest.need_translated_subject != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mailTranslateMessagesRequest.need_translated_subject);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, mailTranslateMessagesRequest.ignored_languages);
            protoWriter.writeBytes(mailTranslateMessagesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailTranslateMessagesRequest$a */
    public static final class C16916a extends Message.Builder<MailTranslateMessagesRequest, C16916a> {

        /* renamed from: a */
        public List<TranslateMessage> f43404a = Internal.newMutableList();

        /* renamed from: b */
        public String f43405b;

        /* renamed from: c */
        public String f43406c;

        /* renamed from: d */
        public Boolean f43407d;

        /* renamed from: e */
        public Boolean f43408e;

        /* renamed from: f */
        public List<String> f43409f = Internal.newMutableList();

        /* renamed from: a */
        public MailTranslateMessagesRequest build() {
            return new MailTranslateMessagesRequest(this.f43404a, this.f43405b, this.f43406c, this.f43407d, this.f43408e, this.f43409f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16916a mo59795a(Boolean bool) {
            this.f43408e = bool;
            return this;
        }

        /* renamed from: a */
        public C16916a mo59796a(String str) {
            this.f43406c = str;
            return this;
        }

        /* renamed from: b */
        public C16916a mo59799b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43409f = list;
            return this;
        }

        /* renamed from: a */
        public C16916a mo59797a(List<TranslateMessage> list) {
            Internal.checkElementsNotNull(list);
            this.f43404a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16916a newBuilder() {
        C16916a aVar = new C16916a();
        aVar.f43404a = Internal.copyOf("messages", this.messages);
        aVar.f43405b = this.source_language;
        aVar.f43406c = this.target_language;
        aVar.f43407d = this.show_original_text;
        aVar.f43408e = this.need_translated_subject;
        aVar.f43409f = Internal.copyOf("ignored_languages", this.ignored_languages);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailTranslateMessagesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.messages.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.source_language != null) {
            sb.append(", source_language=");
            sb.append(this.source_language);
        }
        if (this.target_language != null) {
            sb.append(", target_language=");
            sb.append(this.target_language);
        }
        if (this.show_original_text != null) {
            sb.append(", show_original_text=");
            sb.append(this.show_original_text);
        }
        if (this.need_translated_subject != null) {
            sb.append(", need_translated_subject=");
            sb.append(this.need_translated_subject);
        }
        if (!this.ignored_languages.isEmpty()) {
            sb.append(", ignored_languages=");
            sb.append(this.ignored_languages);
        }
        StringBuilder replace = sb.replace(0, 2, "MailTranslateMessagesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailTranslateMessagesRequest(List<TranslateMessage> list, String str, String str2, Boolean bool, Boolean bool2, List<String> list2) {
        this(list, str, str2, bool, bool2, list2, ByteString.EMPTY);
    }

    public MailTranslateMessagesRequest(List<TranslateMessage> list, String str, String str2, Boolean bool, Boolean bool2, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = Internal.immutableCopyOf("messages", list);
        this.source_language = str;
        this.target_language = str2;
        this.show_original_text = bool;
        this.need_translated_subject = bool2;
        this.ignored_languages = Internal.immutableCopyOf("ignored_languages", list2);
    }
}
