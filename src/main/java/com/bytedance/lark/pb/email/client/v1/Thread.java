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

public final class Thread extends Message<Thread, C16992a> {
    public static final ProtoAdapter<Thread> ADAPTER = new C16993b();
    public static final Boolean DEFAULT_HAS_ATTACHMENT = false;
    public static final Boolean DEFAULT_HAS_REPLY_THREAD = false;
    public static final Boolean DEFAULT_IS_COMPOSE_DRAFT = false;
    public static final Boolean DEFAULT_IS_FLAGGED = false;
    public static final Boolean DEFAULT_IS_READ = false;
    public static final Long DEFAULT_LAST_MESSAGE_TIMESTAMP = 0L;
    public static final Long DEFAULT_LAST_UPDATED_TIMESTAMP = 0L;
    public static final Long DEFAULT_MESSAGE_COUNT = 0L;
    public static final Long DEFAULT_SCHEDULE_SEND_MESSAGE_COUNT = 0L;
    public static final Long DEFAULT_SCHEDULE_SEND_TIMESTAMP = 0L;
    private static final long serialVersionUID = 0;
    public final List<Attachment> attachments;
    public final List<Address> bcc_address;
    public final List<Address> display_address;
    public final String draft_plaintext;
    public final Boolean has_attachment;
    public final Boolean has_reply_thread;
    public final String id;
    public final Boolean is_compose_draft;
    public final Boolean is_flagged;
    public final Boolean is_read;
    public final List<Label> label;
    public final List<String> label_ids;
    public final Long last_message_timestamp;
    public final Long last_updated_timestamp;
    public final Long message_count;
    public final String message_plaintext;
    public final String message_subject;
    public final Long schedule_send_message_count;
    public final Long schedule_send_timestamp;
    public final FilterStatus status;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Thread$b */
    private static final class C16993b extends ProtoAdapter<Thread> {
        C16993b() {
            super(FieldEncoding.LENGTH_DELIMITED, Thread.class);
        }

        /* renamed from: a */
        public int encodedSize(Thread thread) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = 0;
            if (thread.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, thread.id);
            } else {
                i = 0;
            }
            if (thread.message_count != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, thread.message_count);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (thread.status != null) {
                i3 = FilterStatus.ADAPTER.encodedSizeWithTag(3, thread.status);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag = i16 + i3 + Address.ADAPTER.asRepeated().encodedSizeWithTag(4, thread.display_address);
            if (thread.message_subject != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, thread.message_subject);
            } else {
                i4 = 0;
            }
            int i17 = encodedSizeWithTag + i4;
            if (thread.message_plaintext != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, thread.message_plaintext);
            } else {
                i5 = 0;
            }
            int i18 = i17 + i5;
            if (thread.draft_plaintext != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(7, thread.draft_plaintext);
            } else {
                i6 = 0;
            }
            int i19 = i18 + i6;
            if (thread.last_updated_timestamp != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(8, thread.last_updated_timestamp);
            } else {
                i7 = 0;
            }
            int encodedSizeWithTag2 = i19 + i7 + Attachment.ADAPTER.asRepeated().encodedSizeWithTag(9, thread.attachments);
            if (thread.is_read != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(10, thread.is_read);
            } else {
                i8 = 0;
            }
            int i20 = encodedSizeWithTag2 + i8;
            if (thread.last_message_timestamp != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(11, thread.last_message_timestamp);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag3 = i20 + i9 + Label.ADAPTER.asRepeated().encodedSizeWithTag(12, thread.label);
            if (thread.is_flagged != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(13, thread.is_flagged);
            } else {
                i10 = 0;
            }
            int i21 = encodedSizeWithTag3 + i10;
            if (thread.is_compose_draft != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(14, thread.is_compose_draft);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (thread.schedule_send_message_count != null) {
                i12 = ProtoAdapter.INT64.encodedSizeWithTag(15, thread.schedule_send_message_count);
            } else {
                i12 = 0;
            }
            int i23 = i22 + i12;
            if (thread.schedule_send_timestamp != null) {
                i13 = ProtoAdapter.INT64.encodedSizeWithTag(16, thread.schedule_send_timestamp);
            } else {
                i13 = 0;
            }
            int encodedSizeWithTag4 = i23 + i13 + Address.ADAPTER.asRepeated().encodedSizeWithTag(17, thread.bcc_address);
            if (thread.has_reply_thread != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(18, thread.has_reply_thread);
            } else {
                i14 = 0;
            }
            int encodedSizeWithTag5 = encodedSizeWithTag4 + i14 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(19, thread.label_ids);
            if (thread.has_attachment != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(20, thread.has_attachment);
            }
            return encodedSizeWithTag5 + i15 + thread.unknownFields().size();
        }

        /* renamed from: a */
        public Thread decode(ProtoReader protoReader) throws IOException {
            C16992a aVar = new C16992a();
            aVar.f43598a = "";
            aVar.f43599b = 0L;
            aVar.f43602e = "";
            aVar.f43603f = "";
            aVar.f43604g = "";
            aVar.f43605h = 0L;
            aVar.f43607j = false;
            aVar.f43608k = 0L;
            aVar.f43610m = false;
            aVar.f43611n = false;
            aVar.f43612o = 0L;
            aVar.f43613p = 0L;
            aVar.f43615r = false;
            aVar.f43617t = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43598a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43599b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43600c = FilterStatus.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43601d.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f43602e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43603f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43604g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43605h = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43606i.add(Attachment.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f43607j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43608k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43609l.add(Label.ADAPTER.decode(protoReader));
                            break;
                        case 13:
                            aVar.f43610m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f43611n = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            aVar.f43612o = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            aVar.f43613p = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 17:
                            aVar.f43614q.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 18:
                            aVar.f43615r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f43616s.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 20:
                            aVar.f43617t = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Thread thread) throws IOException {
            if (thread.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, thread.id);
            }
            if (thread.message_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, thread.message_count);
            }
            if (thread.status != null) {
                FilterStatus.ADAPTER.encodeWithTag(protoWriter, 3, thread.status);
            }
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, thread.display_address);
            if (thread.message_subject != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, thread.message_subject);
            }
            if (thread.message_plaintext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, thread.message_plaintext);
            }
            if (thread.draft_plaintext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, thread.draft_plaintext);
            }
            if (thread.last_updated_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, thread.last_updated_timestamp);
            }
            Attachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, thread.attachments);
            if (thread.is_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, thread.is_read);
            }
            if (thread.last_message_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, thread.last_message_timestamp);
            }
            Label.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, thread.label);
            if (thread.is_flagged != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, thread.is_flagged);
            }
            if (thread.is_compose_draft != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, thread.is_compose_draft);
            }
            if (thread.schedule_send_message_count != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 15, thread.schedule_send_message_count);
            }
            if (thread.schedule_send_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, thread.schedule_send_timestamp);
            }
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 17, thread.bcc_address);
            if (thread.has_reply_thread != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, thread.has_reply_thread);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 19, thread.label_ids);
            if (thread.has_attachment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, thread.has_attachment);
            }
            protoWriter.writeBytes(thread.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Thread$a */
    public static final class C16992a extends Message.Builder<Thread, C16992a> {

        /* renamed from: a */
        public String f43598a;

        /* renamed from: b */
        public Long f43599b;

        /* renamed from: c */
        public FilterStatus f43600c;

        /* renamed from: d */
        public List<Address> f43601d = Internal.newMutableList();

        /* renamed from: e */
        public String f43602e;

        /* renamed from: f */
        public String f43603f;

        /* renamed from: g */
        public String f43604g;

        /* renamed from: h */
        public Long f43605h;

        /* renamed from: i */
        public List<Attachment> f43606i = Internal.newMutableList();

        /* renamed from: j */
        public Boolean f43607j;

        /* renamed from: k */
        public Long f43608k;

        /* renamed from: l */
        public List<Label> f43609l = Internal.newMutableList();

        /* renamed from: m */
        public Boolean f43610m;

        /* renamed from: n */
        public Boolean f43611n;

        /* renamed from: o */
        public Long f43612o;

        /* renamed from: p */
        public Long f43613p;

        /* renamed from: q */
        public List<Address> f43614q = Internal.newMutableList();

        /* renamed from: r */
        public Boolean f43615r;

        /* renamed from: s */
        public List<String> f43616s = Internal.newMutableList();

        /* renamed from: t */
        public Boolean f43617t;

        /* renamed from: a */
        public Thread build() {
            return new Thread(this.f43598a, this.f43599b, this.f43600c, this.f43601d, this.f43602e, this.f43603f, this.f43604g, this.f43605h, this.f43606i, this.f43607j, this.f43608k, this.f43609l, this.f43610m, this.f43611n, this.f43612o, this.f43613p, this.f43614q, this.f43615r, this.f43616s, this.f43617t, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16992a mo60027a(FilterStatus filterStatus) {
            this.f43600c = filterStatus;
            return this;
        }

        /* renamed from: b */
        public C16992a mo60033b(Boolean bool) {
            this.f43610m = bool;
            return this;
        }

        /* renamed from: c */
        public C16992a mo60037c(Boolean bool) {
            this.f43611n = bool;
            return this;
        }

        /* renamed from: d */
        public C16992a mo60040d(Boolean bool) {
            this.f43615r = bool;
            return this;
        }

        /* renamed from: e */
        public C16992a mo60043e(Boolean bool) {
            this.f43617t = bool;
            return this;
        }

        /* renamed from: a */
        public C16992a mo60028a(Boolean bool) {
            this.f43607j = bool;
            return this;
        }

        /* renamed from: b */
        public C16992a mo60034b(Long l) {
            this.f43605h = l;
            return this;
        }

        /* renamed from: c */
        public C16992a mo60038c(Long l) {
            this.f43608k = l;
            return this;
        }

        /* renamed from: d */
        public C16992a mo60041d(Long l) {
            this.f43612o = l;
            return this;
        }

        /* renamed from: e */
        public C16992a mo60044e(Long l) {
            this.f43613p = l;
            return this;
        }

        /* renamed from: a */
        public C16992a mo60029a(Long l) {
            this.f43599b = l;
            return this;
        }

        /* renamed from: b */
        public C16992a mo60035b(String str) {
            this.f43602e = str;
            return this;
        }

        /* renamed from: c */
        public C16992a mo60039c(String str) {
            this.f43603f = str;
            return this;
        }

        /* renamed from: d */
        public C16992a mo60042d(String str) {
            this.f43604g = str;
            return this;
        }

        /* renamed from: a */
        public C16992a mo60030a(String str) {
            this.f43598a = str;
            return this;
        }

        /* renamed from: b */
        public C16992a mo60036b(List<Address> list) {
            Internal.checkElementsNotNull(list);
            this.f43614q = list;
            return this;
        }

        /* renamed from: a */
        public C16992a mo60031a(List<Address> list) {
            Internal.checkElementsNotNull(list);
            this.f43601d = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16992a newBuilder() {
        C16992a aVar = new C16992a();
        aVar.f43598a = this.id;
        aVar.f43599b = this.message_count;
        aVar.f43600c = this.status;
        aVar.f43601d = Internal.copyOf("display_address", this.display_address);
        aVar.f43602e = this.message_subject;
        aVar.f43603f = this.message_plaintext;
        aVar.f43604g = this.draft_plaintext;
        aVar.f43605h = this.last_updated_timestamp;
        aVar.f43606i = Internal.copyOf("attachments", this.attachments);
        aVar.f43607j = this.is_read;
        aVar.f43608k = this.last_message_timestamp;
        aVar.f43609l = Internal.copyOf("label", this.label);
        aVar.f43610m = this.is_flagged;
        aVar.f43611n = this.is_compose_draft;
        aVar.f43612o = this.schedule_send_message_count;
        aVar.f43613p = this.schedule_send_timestamp;
        aVar.f43614q = Internal.copyOf("bcc_address", this.bcc_address);
        aVar.f43615r = this.has_reply_thread;
        aVar.f43616s = Internal.copyOf("label_ids", this.label_ids);
        aVar.f43617t = this.has_attachment;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Thread");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.message_count != null) {
            sb.append(", message_count=");
            sb.append(this.message_count);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (!this.display_address.isEmpty()) {
            sb.append(", display_address=");
            sb.append(this.display_address);
        }
        if (this.message_subject != null) {
            sb.append(", message_subject=");
            sb.append(this.message_subject);
        }
        if (this.message_plaintext != null) {
            sb.append(", message_plaintext=");
            sb.append(this.message_plaintext);
        }
        if (this.draft_plaintext != null) {
            sb.append(", draft_plaintext=");
            sb.append(this.draft_plaintext);
        }
        if (this.last_updated_timestamp != null) {
            sb.append(", last_updated_timestamp=");
            sb.append(this.last_updated_timestamp);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (this.is_read != null) {
            sb.append(", is_read=");
            sb.append(this.is_read);
        }
        if (this.last_message_timestamp != null) {
            sb.append(", last_message_timestamp=");
            sb.append(this.last_message_timestamp);
        }
        if (!this.label.isEmpty()) {
            sb.append(", label=");
            sb.append(this.label);
        }
        if (this.is_flagged != null) {
            sb.append(", is_flagged=");
            sb.append(this.is_flagged);
        }
        if (this.is_compose_draft != null) {
            sb.append(", is_compose_draft=");
            sb.append(this.is_compose_draft);
        }
        if (this.schedule_send_message_count != null) {
            sb.append(", schedule_send_message_count=");
            sb.append(this.schedule_send_message_count);
        }
        if (this.schedule_send_timestamp != null) {
            sb.append(", schedule_send_timestamp=");
            sb.append(this.schedule_send_timestamp);
        }
        if (!this.bcc_address.isEmpty()) {
            sb.append(", bcc_address=");
            sb.append(this.bcc_address);
        }
        if (this.has_reply_thread != null) {
            sb.append(", has_reply_thread=");
            sb.append(this.has_reply_thread);
        }
        if (!this.label_ids.isEmpty()) {
            sb.append(", label_ids=");
            sb.append(this.label_ids);
        }
        if (this.has_attachment != null) {
            sb.append(", has_attachment=");
            sb.append(this.has_attachment);
        }
        StringBuilder replace = sb.replace(0, 2, "Thread{");
        replace.append('}');
        return replace.toString();
    }

    public Thread(String str, Long l, FilterStatus filterStatus, List<Address> list, String str2, String str3, String str4, Long l2, List<Attachment> list2, Boolean bool, Long l3, List<Label> list3, Boolean bool2, Boolean bool3, Long l4, Long l5, List<Address> list4, Boolean bool4, List<String> list5, Boolean bool5) {
        this(str, l, filterStatus, list, str2, str3, str4, l2, list2, bool, l3, list3, bool2, bool3, l4, l5, list4, bool4, list5, bool5, ByteString.EMPTY);
    }

    public Thread(String str, Long l, FilterStatus filterStatus, List<Address> list, String str2, String str3, String str4, Long l2, List<Attachment> list2, Boolean bool, Long l3, List<Label> list3, Boolean bool2, Boolean bool3, Long l4, Long l5, List<Address> list4, Boolean bool4, List<String> list5, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.message_count = l;
        this.status = filterStatus;
        this.display_address = Internal.immutableCopyOf("display_address", list);
        this.message_subject = str2;
        this.message_plaintext = str3;
        this.draft_plaintext = str4;
        this.last_updated_timestamp = l2;
        this.attachments = Internal.immutableCopyOf("attachments", list2);
        this.is_read = bool;
        this.last_message_timestamp = l3;
        this.label = Internal.immutableCopyOf("label", list3);
        this.is_flagged = bool2;
        this.is_compose_draft = bool3;
        this.schedule_send_message_count = l4;
        this.schedule_send_timestamp = l5;
        this.bcc_address = Internal.immutableCopyOf("bcc_address", list4);
        this.has_reply_thread = bool4;
        this.label_ids = Internal.immutableCopyOf("label_ids", list5);
        this.has_attachment = bool5;
    }
}
