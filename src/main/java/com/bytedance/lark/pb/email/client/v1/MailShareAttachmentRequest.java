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

public final class MailShareAttachmentRequest extends Message<MailShareAttachmentRequest, C16890a> {
    public static final ProtoAdapter<MailShareAttachmentRequest> ADAPTER = new C16891b();
    public static final Boolean DEFAULT_CREATE_GROUP = false;
    private static final long serialVersionUID = 0;
    public final String add_note;
    public final String attachment_token;
    public final List<String> chat_ids;
    public final Boolean create_group;
    public final List<String> user_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailShareAttachmentRequest$b */
    private static final class C16891b extends ProtoAdapter<MailShareAttachmentRequest> {
        C16891b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailShareAttachmentRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailShareAttachmentRequest mailShareAttachmentRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailShareAttachmentRequest.chat_ids);
            int i3 = 0;
            if (mailShareAttachmentRequest.attachment_token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailShareAttachmentRequest.attachment_token);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (mailShareAttachmentRequest.add_note != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailShareAttachmentRequest.add_note);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (mailShareAttachmentRequest.create_group != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailShareAttachmentRequest.create_group);
            }
            return i5 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, mailShareAttachmentRequest.user_ids) + mailShareAttachmentRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailShareAttachmentRequest decode(ProtoReader protoReader) throws IOException {
            C16890a aVar = new C16890a();
            aVar.f43363b = "";
            aVar.f43364c = "";
            aVar.f43365d = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43362a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43363b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43364c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f43365d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43366e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailShareAttachmentRequest mailShareAttachmentRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailShareAttachmentRequest.chat_ids);
            if (mailShareAttachmentRequest.attachment_token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailShareAttachmentRequest.attachment_token);
            }
            if (mailShareAttachmentRequest.add_note != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailShareAttachmentRequest.add_note);
            }
            if (mailShareAttachmentRequest.create_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailShareAttachmentRequest.create_group);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, mailShareAttachmentRequest.user_ids);
            protoWriter.writeBytes(mailShareAttachmentRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailShareAttachmentRequest$a */
    public static final class C16890a extends Message.Builder<MailShareAttachmentRequest, C16890a> {

        /* renamed from: a */
        public List<String> f43362a = Internal.newMutableList();

        /* renamed from: b */
        public String f43363b;

        /* renamed from: c */
        public String f43364c;

        /* renamed from: d */
        public Boolean f43365d;

        /* renamed from: e */
        public List<String> f43366e = Internal.newMutableList();

        /* renamed from: a */
        public MailShareAttachmentRequest build() {
            return new MailShareAttachmentRequest(this.f43362a, this.f43363b, this.f43364c, this.f43365d, this.f43366e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16890a mo59740a(String str) {
            this.f43363b = str;
            return this;
        }

        /* renamed from: b */
        public C16890a mo59743b(String str) {
            this.f43364c = str;
            return this;
        }

        /* renamed from: a */
        public C16890a mo59741a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43362a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16890a newBuilder() {
        C16890a aVar = new C16890a();
        aVar.f43362a = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f43363b = this.attachment_token;
        aVar.f43364c = this.add_note;
        aVar.f43365d = this.create_group;
        aVar.f43366e = Internal.copyOf("user_ids", this.user_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailShareAttachmentRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        if (this.attachment_token != null) {
            sb.append(", attachment_token=");
            sb.append(this.attachment_token);
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
        StringBuilder replace = sb.replace(0, 2, "MailShareAttachmentRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailShareAttachmentRequest(List<String> list, String str, String str2, Boolean bool, List<String> list2) {
        this(list, str, str2, bool, list2, ByteString.EMPTY);
    }

    public MailShareAttachmentRequest(List<String> list, String str, String str2, Boolean bool, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.attachment_token = str;
        this.add_note = str2;
        this.create_group = bool;
        this.user_ids = Internal.immutableCopyOf("user_ids", list2);
    }
}
