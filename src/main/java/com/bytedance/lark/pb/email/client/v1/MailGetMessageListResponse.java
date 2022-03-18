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

public final class MailGetMessageListResponse extends Message<MailGetMessageListResponse, C16744a> {
    public static final ProtoAdapter<MailGetMessageListResponse> ADAPTER = new C16745b();
    public static final PermissionCode DEFAULT_CODE = PermissionCode.NONE;
    public static final Boolean DEFAULT_IS_EXTERNAL = false;
    public static final Boolean DEFAULT_IS_FLAGGED = false;
    public static final Boolean DEFAULT_IS_READ = false;
    public static final ThreadSecurityLevel DEFAULT_SECURITY_LEVEL = ThreadSecurityLevel.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final PermissionCode code;
    public final List<Draft> drafts;
    public final Boolean is_external;
    public final Boolean is_flagged;
    public final Boolean is_read;
    public final List<String> label_ids;
    public final List<Label> labels;
    public final List<MessageItem> message_items;
    public final ThreadSecurityLevel security_level;
    public final String subject;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageListResponse$b */
    private static final class C16745b extends ProtoAdapter<MailGetMessageListResponse> {
        C16745b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMessageListResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMessageListResponse mailGetMessageListResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = MessageItem.ADAPTER.asRepeated().encodedSizeWithTag(1, mailGetMessageListResponse.message_items) + Draft.ADAPTER.asRepeated().encodedSizeWithTag(2, mailGetMessageListResponse.drafts) + Label.ADAPTER.asRepeated().encodedSizeWithTag(3, mailGetMessageListResponse.labels);
            int i6 = 0;
            if (mailGetMessageListResponse.code != null) {
                i = PermissionCode.ADAPTER.encodedSizeWithTag(4, mailGetMessageListResponse.code);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (mailGetMessageListResponse.is_external != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(5, mailGetMessageListResponse.is_external);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (mailGetMessageListResponse.security_level != null) {
                i3 = ThreadSecurityLevel.ADAPTER.encodedSizeWithTag(6, mailGetMessageListResponse.security_level);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (mailGetMessageListResponse.is_flagged != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, mailGetMessageListResponse.is_flagged);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (mailGetMessageListResponse.subject != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, mailGetMessageListResponse.subject);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (mailGetMessageListResponse.is_read != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(9, mailGetMessageListResponse.is_read);
            }
            return i11 + i6 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(10, mailGetMessageListResponse.label_ids) + mailGetMessageListResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMessageListResponse decode(ProtoReader protoReader) throws IOException {
            C16744a aVar = new C16744a();
            aVar.f43212d = PermissionCode.NONE;
            aVar.f43213e = false;
            aVar.f43214f = ThreadSecurityLevel.UNKNOWN;
            aVar.f43215g = false;
            aVar.f43216h = "";
            aVar.f43217i = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43209a.add(MessageItem.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            aVar.f43210b.add(Draft.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f43211c.add(Label.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            try {
                                aVar.f43212d = PermissionCode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f43213e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            try {
                                aVar.f43214f = ThreadSecurityLevel.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 7:
                            aVar.f43215g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43216h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43217i = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43218j.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, MailGetMessageListResponse mailGetMessageListResponse) throws IOException {
            MessageItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailGetMessageListResponse.message_items);
            Draft.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, mailGetMessageListResponse.drafts);
            Label.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, mailGetMessageListResponse.labels);
            if (mailGetMessageListResponse.code != null) {
                PermissionCode.ADAPTER.encodeWithTag(protoWriter, 4, mailGetMessageListResponse.code);
            }
            if (mailGetMessageListResponse.is_external != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mailGetMessageListResponse.is_external);
            }
            if (mailGetMessageListResponse.security_level != null) {
                ThreadSecurityLevel.ADAPTER.encodeWithTag(protoWriter, 6, mailGetMessageListResponse.security_level);
            }
            if (mailGetMessageListResponse.is_flagged != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, mailGetMessageListResponse.is_flagged);
            }
            if (mailGetMessageListResponse.subject != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, mailGetMessageListResponse.subject);
            }
            if (mailGetMessageListResponse.is_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, mailGetMessageListResponse.is_read);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 10, mailGetMessageListResponse.label_ids);
            protoWriter.writeBytes(mailGetMessageListResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageListResponse$a */
    public static final class C16744a extends Message.Builder<MailGetMessageListResponse, C16744a> {

        /* renamed from: a */
        public List<MessageItem> f43209a = Internal.newMutableList();

        /* renamed from: b */
        public List<Draft> f43210b = Internal.newMutableList();

        /* renamed from: c */
        public List<Label> f43211c = Internal.newMutableList();

        /* renamed from: d */
        public PermissionCode f43212d;

        /* renamed from: e */
        public Boolean f43213e;

        /* renamed from: f */
        public ThreadSecurityLevel f43214f;

        /* renamed from: g */
        public Boolean f43215g;

        /* renamed from: h */
        public String f43216h;

        /* renamed from: i */
        public Boolean f43217i;

        /* renamed from: j */
        public List<String> f43218j = Internal.newMutableList();

        /* renamed from: a */
        public MailGetMessageListResponse build() {
            return new MailGetMessageListResponse(this.f43209a, this.f43210b, this.f43211c, this.f43212d, this.f43213e, this.f43214f, this.f43215g, this.f43216h, this.f43217i, this.f43218j, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16744a newBuilder() {
        C16744a aVar = new C16744a();
        aVar.f43209a = Internal.copyOf("message_items", this.message_items);
        aVar.f43210b = Internal.copyOf("drafts", this.drafts);
        aVar.f43211c = Internal.copyOf("labels", this.labels);
        aVar.f43212d = this.code;
        aVar.f43213e = this.is_external;
        aVar.f43214f = this.security_level;
        aVar.f43215g = this.is_flagged;
        aVar.f43216h = this.subject;
        aVar.f43217i = this.is_read;
        aVar.f43218j = Internal.copyOf("label_ids", this.label_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMessageListResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_items.isEmpty()) {
            sb.append(", message_items=");
            sb.append(this.message_items);
        }
        if (!this.drafts.isEmpty()) {
            sb.append(", drafts=");
            sb.append(this.drafts);
        }
        if (!this.labels.isEmpty()) {
            sb.append(", labels=");
            sb.append(this.labels);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.is_external != null) {
            sb.append(", is_external=");
            sb.append(this.is_external);
        }
        if (this.security_level != null) {
            sb.append(", security_level=");
            sb.append(this.security_level);
        }
        if (this.is_flagged != null) {
            sb.append(", is_flagged=");
            sb.append(this.is_flagged);
        }
        if (this.subject != null) {
            sb.append(", subject=");
            sb.append(this.subject);
        }
        if (this.is_read != null) {
            sb.append(", is_read=");
            sb.append(this.is_read);
        }
        if (!this.label_ids.isEmpty()) {
            sb.append(", label_ids=");
            sb.append(this.label_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMessageListResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMessageListResponse(List<MessageItem> list, List<Draft> list2, List<Label> list3, PermissionCode permissionCode, Boolean bool, ThreadSecurityLevel threadSecurityLevel, Boolean bool2, String str, Boolean bool3, List<String> list4) {
        this(list, list2, list3, permissionCode, bool, threadSecurityLevel, bool2, str, bool3, list4, ByteString.EMPTY);
    }

    public MailGetMessageListResponse(List<MessageItem> list, List<Draft> list2, List<Label> list3, PermissionCode permissionCode, Boolean bool, ThreadSecurityLevel threadSecurityLevel, Boolean bool2, String str, Boolean bool3, List<String> list4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_items = Internal.immutableCopyOf("message_items", list);
        this.drafts = Internal.immutableCopyOf("drafts", list2);
        this.labels = Internal.immutableCopyOf("labels", list3);
        this.code = permissionCode;
        this.is_external = bool;
        this.security_level = threadSecurityLevel;
        this.is_flagged = bool2;
        this.subject = str;
        this.is_read = bool3;
        this.label_ids = Internal.immutableCopyOf("label_ids", list4);
    }
}
