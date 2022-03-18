package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MailUpdateDraftRequest extends Message<MailUpdateDraftRequest, C16944a> {
    public static final ProtoAdapter<MailUpdateDraftRequest> ADAPTER = new C16945b();
    public static final Boolean DEFAULT_IS_DELAY = false;
    private static final long serialVersionUID = 0;
    public final String draft_id;
    public final Boolean is_delay;
    public final Payload payload;

    public static final class Payload extends Message<Payload, C16942a> {
        public static final ProtoAdapter<Payload> ADAPTER = new C16943b();
        public static final Boolean DEFAULT_IS_SEND_SEPARATELY = false;
        private static final long serialVersionUID = 0;
        public final List<Attachment> attachments;
        public final List<Address> bcc;
        public final String body_html;
        public final String body_plaintext;
        public final List<Address> cc;
        public final List<DocsPermissionConfig> docs_permissions;
        public final Address from;
        public final List<DraftImage> images;
        public final Boolean is_send_separately;
        public final String subject;
        public final String thread_id;
        public final List<Address> to;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateDraftRequest$Payload$b */
        private static final class C16943b extends ProtoAdapter<Payload> {
            C16943b() {
                super(FieldEncoding.LENGTH_DELIMITED, Payload.class);
            }

            /* renamed from: a */
            public int encodedSize(Payload payload) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6 = 0;
                if (payload.from != null) {
                    i = Address.ADAPTER.encodedSizeWithTag(1, payload.from);
                } else {
                    i = 0;
                }
                int encodedSizeWithTag = i + Address.ADAPTER.asRepeated().encodedSizeWithTag(2, payload.to) + Address.ADAPTER.asRepeated().encodedSizeWithTag(3, payload.cc) + Address.ADAPTER.asRepeated().encodedSizeWithTag(4, payload.bcc);
                if (payload.body_html != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, payload.body_html);
                } else {
                    i2 = 0;
                }
                int i7 = encodedSizeWithTag + i2;
                if (payload.body_plaintext != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, payload.body_plaintext);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (payload.subject != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, payload.subject);
                } else {
                    i4 = 0;
                }
                int encodedSizeWithTag2 = i8 + i4 + DraftImage.ADAPTER.asRepeated().encodedSizeWithTag(8, payload.images) + Attachment.ADAPTER.asRepeated().encodedSizeWithTag(9, payload.attachments) + DocsPermissionConfig.ADAPTER.asRepeated().encodedSizeWithTag(10, payload.docs_permissions);
                if (payload.thread_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(11, payload.thread_id);
                } else {
                    i5 = 0;
                }
                int i9 = encodedSizeWithTag2 + i5;
                if (payload.is_send_separately != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(12, payload.is_send_separately);
                }
                return i9 + i6 + payload.unknownFields().size();
            }

            /* renamed from: a */
            public Payload decode(ProtoReader protoReader) throws IOException {
                C16942a aVar = new C16942a();
                aVar.f43435e = "";
                aVar.f43436f = "";
                aVar.f43437g = "";
                aVar.f43441k = "";
                aVar.f43442l = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f43431a = Address.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                aVar.f43432b.add(Address.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                aVar.f43433c.add(Address.ADAPTER.decode(protoReader));
                                break;
                            case 4:
                                aVar.f43434d.add(Address.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                aVar.f43435e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f43436f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f43437g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f43438h.add(DraftImage.ADAPTER.decode(protoReader));
                                break;
                            case 9:
                                aVar.f43439i.add(Attachment.ADAPTER.decode(protoReader));
                                break;
                            case 10:
                                aVar.f43440j.add(DocsPermissionConfig.ADAPTER.decode(protoReader));
                                break;
                            case 11:
                                aVar.f43441k = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                                aVar.f43442l = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Payload payload) throws IOException {
                if (payload.from != null) {
                    Address.ADAPTER.encodeWithTag(protoWriter, 1, payload.from);
                }
                Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, payload.to);
                Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, payload.cc);
                Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, payload.bcc);
                if (payload.body_html != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, payload.body_html);
                }
                if (payload.body_plaintext != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, payload.body_plaintext);
                }
                if (payload.subject != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, payload.subject);
                }
                DraftImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, payload.images);
                Attachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, payload.attachments);
                DocsPermissionConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, payload.docs_permissions);
                if (payload.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, payload.thread_id);
                }
                if (payload.is_send_separately != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 12, payload.is_send_separately);
                }
                protoWriter.writeBytes(payload.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateDraftRequest$Payload$a */
        public static final class C16942a extends Message.Builder<Payload, C16942a> {

            /* renamed from: a */
            public Address f43431a;

            /* renamed from: b */
            public List<Address> f43432b = Internal.newMutableList();

            /* renamed from: c */
            public List<Address> f43433c = Internal.newMutableList();

            /* renamed from: d */
            public List<Address> f43434d = Internal.newMutableList();

            /* renamed from: e */
            public String f43435e;

            /* renamed from: f */
            public String f43436f;

            /* renamed from: g */
            public String f43437g;

            /* renamed from: h */
            public List<DraftImage> f43438h = Internal.newMutableList();

            /* renamed from: i */
            public List<Attachment> f43439i = Internal.newMutableList();

            /* renamed from: j */
            public List<DocsPermissionConfig> f43440j = Internal.newMutableList();

            /* renamed from: k */
            public String f43441k;

            /* renamed from: l */
            public Boolean f43442l;

            /* renamed from: a */
            public Payload build() {
                return new Payload(this.f43431a, this.f43432b, this.f43433c, this.f43434d, this.f43435e, this.f43436f, this.f43437g, this.f43438h, this.f43439i, this.f43440j, this.f43441k, this.f43442l, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16942a newBuilder() {
            C16942a aVar = new C16942a();
            aVar.f43431a = this.from;
            aVar.f43432b = Internal.copyOf("to", this.to);
            aVar.f43433c = Internal.copyOf("cc", this.cc);
            aVar.f43434d = Internal.copyOf("bcc", this.bcc);
            aVar.f43435e = this.body_html;
            aVar.f43436f = this.body_plaintext;
            aVar.f43437g = this.subject;
            aVar.f43438h = Internal.copyOf("images", this.images);
            aVar.f43439i = Internal.copyOf("attachments", this.attachments);
            aVar.f43440j = Internal.copyOf("docs_permissions", this.docs_permissions);
            aVar.f43441k = this.thread_id;
            aVar.f43442l = this.is_send_separately;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "Payload");
            StringBuilder sb = new StringBuilder();
            if (this.from != null) {
                sb.append(", from=");
                sb.append(this.from);
            }
            if (!this.to.isEmpty()) {
                sb.append(", to=");
                sb.append(this.to);
            }
            if (!this.cc.isEmpty()) {
                sb.append(", cc=");
                sb.append(this.cc);
            }
            if (!this.bcc.isEmpty()) {
                sb.append(", bcc=");
                sb.append(this.bcc);
            }
            if (this.body_html != null) {
                sb.append(", body_html=");
                sb.append(this.body_html);
            }
            if (this.body_plaintext != null) {
                sb.append(", body_plaintext=");
                sb.append(this.body_plaintext);
            }
            if (this.subject != null) {
                sb.append(", subject=");
                sb.append(this.subject);
            }
            if (!this.images.isEmpty()) {
                sb.append(", images=");
                sb.append(this.images);
            }
            if (!this.attachments.isEmpty()) {
                sb.append(", attachments=");
                sb.append(this.attachments);
            }
            if (!this.docs_permissions.isEmpty()) {
                sb.append(", docs_permissions=");
                sb.append(this.docs_permissions);
            }
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            if (this.is_send_separately != null) {
                sb.append(", is_send_separately=");
                sb.append(this.is_send_separately);
            }
            StringBuilder replace = sb.replace(0, 2, "Payload{");
            replace.append('}');
            return replace.toString();
        }

        public Payload(Address address, List<Address> list, List<Address> list2, List<Address> list3, String str, String str2, String str3, List<DraftImage> list4, List<Attachment> list5, List<DocsPermissionConfig> list6, String str4, Boolean bool) {
            this(address, list, list2, list3, str, str2, str3, list4, list5, list6, str4, bool, ByteString.EMPTY);
        }

        public Payload(Address address, List<Address> list, List<Address> list2, List<Address> list3, String str, String str2, String str3, List<DraftImage> list4, List<Attachment> list5, List<DocsPermissionConfig> list6, String str4, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.from = address;
            this.to = Internal.immutableCopyOf("to", list);
            this.cc = Internal.immutableCopyOf("cc", list2);
            this.bcc = Internal.immutableCopyOf("bcc", list3);
            this.body_html = str;
            this.body_plaintext = str2;
            this.subject = str3;
            this.images = Internal.immutableCopyOf("images", list4);
            this.attachments = Internal.immutableCopyOf("attachments", list5);
            this.docs_permissions = Internal.immutableCopyOf("docs_permissions", list6);
            this.thread_id = str4;
            this.is_send_separately = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateDraftRequest$b */
    private static final class C16945b extends ProtoAdapter<MailUpdateDraftRequest> {
        C16945b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateDraftRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateDraftRequest mailUpdateDraftRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailUpdateDraftRequest.draft_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUpdateDraftRequest.draft_id);
            } else {
                i = 0;
            }
            if (mailUpdateDraftRequest.payload != null) {
                i2 = Payload.ADAPTER.encodedSizeWithTag(2, mailUpdateDraftRequest.payload);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (mailUpdateDraftRequest.is_delay != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, mailUpdateDraftRequest.is_delay);
            }
            return i4 + i3 + mailUpdateDraftRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateDraftRequest decode(ProtoReader protoReader) throws IOException {
            C16944a aVar = new C16944a();
            aVar.f43443a = "";
            aVar.f43445c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43443a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43444b = Payload.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43445c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateDraftRequest mailUpdateDraftRequest) throws IOException {
            if (mailUpdateDraftRequest.draft_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUpdateDraftRequest.draft_id);
            }
            if (mailUpdateDraftRequest.payload != null) {
                Payload.ADAPTER.encodeWithTag(protoWriter, 2, mailUpdateDraftRequest.payload);
            }
            if (mailUpdateDraftRequest.is_delay != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, mailUpdateDraftRequest.is_delay);
            }
            protoWriter.writeBytes(mailUpdateDraftRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateDraftRequest$a */
    public static final class C16944a extends Message.Builder<MailUpdateDraftRequest, C16944a> {

        /* renamed from: a */
        public String f43443a;

        /* renamed from: b */
        public Payload f43444b;

        /* renamed from: c */
        public Boolean f43445c;

        /* renamed from: a */
        public MailUpdateDraftRequest build() {
            return new MailUpdateDraftRequest(this.f43443a, this.f43444b, this.f43445c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16944a mo59863a(Payload payload) {
            this.f43444b = payload;
            return this;
        }

        /* renamed from: a */
        public C16944a mo59864a(Boolean bool) {
            this.f43445c = bool;
            return this;
        }

        /* renamed from: a */
        public C16944a mo59865a(String str) {
            this.f43443a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16944a newBuilder() {
        C16944a aVar = new C16944a();
        aVar.f43443a = this.draft_id;
        aVar.f43444b = this.payload;
        aVar.f43445c = this.is_delay;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateDraftRequest");
        StringBuilder sb = new StringBuilder();
        if (this.draft_id != null) {
            sb.append(", draft_id=");
            sb.append(this.draft_id);
        }
        if (this.payload != null) {
            sb.append(", payload=");
            sb.append(this.payload);
        }
        if (this.is_delay != null) {
            sb.append(", is_delay=");
            sb.append(this.is_delay);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateDraftRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateDraftRequest(String str, Payload payload2, Boolean bool) {
        this(str, payload2, bool, ByteString.EMPTY);
    }

    public MailUpdateDraftRequest(String str, Payload payload2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.draft_id = str;
        this.payload = payload2;
        this.is_delay = bool;
    }
}
