package com.bytedance.lark.pb.email.v1;

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

public final class MailSendCardRequest extends Message<MailSendCardRequest, C17038a> {
    public static final ProtoAdapter<MailSendCardRequest> ADAPTER = new C17039b();
    public static final Boolean DEFAULT_CREATE_GROUP = false;
    private static final long serialVersionUID = 0;
    public final String add_note;
    public final List<String> chat_ids;
    public final Boolean create_group;
    public final String label_id;
    public final List<String> message_ids;
    public final String thread_id;
    public final List<String> user_ids;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSendCardRequest$b */
    private static final class C17039b extends ProtoAdapter<MailSendCardRequest> {
        C17039b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSendCardRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSendCardRequest mailSendCardRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailSendCardRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailSendCardRequest.thread_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, mailSendCardRequest.message_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, mailSendCardRequest.chat_ids);
            if (mailSendCardRequest.add_note != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, mailSendCardRequest.add_note);
            } else {
                i2 = 0;
            }
            int i5 = encodedSizeWithTag + i2;
            if (mailSendCardRequest.create_group != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, mailSendCardRequest.create_group);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i5 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, mailSendCardRequest.user_ids);
            if (mailSendCardRequest.label_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, mailSendCardRequest.label_id);
            }
            return encodedSizeWithTag2 + i4 + mailSendCardRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSendCardRequest decode(ProtoReader protoReader) throws IOException {
            C17038a aVar = new C17038a();
            aVar.f43688a = "";
            aVar.f43691d = "";
            aVar.f43692e = false;
            aVar.f43694g = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43688a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43689b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f43690c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f43691d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43692e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43693f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f43694g = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MailSendCardRequest mailSendCardRequest) throws IOException {
            if (mailSendCardRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailSendCardRequest.thread_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, mailSendCardRequest.message_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, mailSendCardRequest.chat_ids);
            if (mailSendCardRequest.add_note != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mailSendCardRequest.add_note);
            }
            if (mailSendCardRequest.create_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mailSendCardRequest.create_group);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, mailSendCardRequest.user_ids);
            if (mailSendCardRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, mailSendCardRequest.label_id);
            }
            protoWriter.writeBytes(mailSendCardRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailSendCardRequest$a */
    public static final class C17038a extends Message.Builder<MailSendCardRequest, C17038a> {

        /* renamed from: a */
        public String f43688a;

        /* renamed from: b */
        public List<String> f43689b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f43690c = Internal.newMutableList();

        /* renamed from: d */
        public String f43691d;

        /* renamed from: e */
        public Boolean f43692e;

        /* renamed from: f */
        public List<String> f43693f = Internal.newMutableList();

        /* renamed from: g */
        public String f43694g;

        /* renamed from: a */
        public MailSendCardRequest build() {
            return new MailSendCardRequest(this.f43688a, this.f43689b, this.f43690c, this.f43691d, this.f43692e, this.f43693f, this.f43694g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C17038a mo60156a(Boolean bool) {
            this.f43692e = bool;
            return this;
        }

        /* renamed from: b */
        public C17038a mo60160b(String str) {
            this.f43691d = str;
            return this;
        }

        /* renamed from: a */
        public C17038a mo60157a(String str) {
            this.f43688a = str;
            return this;
        }

        /* renamed from: b */
        public C17038a mo60161b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43690c = list;
            return this;
        }

        /* renamed from: c */
        public C17038a mo60162c(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43693f = list;
            return this;
        }

        /* renamed from: a */
        public C17038a mo60158a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43689b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17038a newBuilder() {
        C17038a aVar = new C17038a();
        aVar.f43688a = this.thread_id;
        aVar.f43689b = Internal.copyOf("message_ids", this.message_ids);
        aVar.f43690c = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f43691d = this.add_note;
        aVar.f43692e = this.create_group;
        aVar.f43693f = Internal.copyOf("user_ids", this.user_ids);
        aVar.f43694g = this.label_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSendCardRequest");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.add_note != null) {
            sb.append(", add_note=");
            sb.append(this.add_note);
        }
        if (this.create_group != null) {
            sb.append(", create_group=");
            sb.append(this.create_group);
        }
        if (!this.user_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.user_ids);
        }
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSendCardRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSendCardRequest(String str, List<String> list, List<String> list2, String str2, Boolean bool, List<String> list3, String str3) {
        this(str, list, list2, str2, bool, list3, str3, ByteString.EMPTY);
    }

    public MailSendCardRequest(String str, List<String> list, List<String> list2, String str2, Boolean bool, List<String> list3, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list2);
        this.add_note = str2;
        this.create_group = bool;
        this.user_ids = Internal.immutableCopyOf("user_ids", list3);
        this.label_id = str3;
    }
}
