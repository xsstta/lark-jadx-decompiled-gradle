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

public final class MessagesSummary extends Message<MessagesSummary, C16970a> {
    public static final ProtoAdapter<MessagesSummary> ADAPTER = new C16971b();
    public static final Long DEFAULT_CREATE_TIMESTAMP = 0L;
    public static final Long DEFAULT_DELIVERY_STATE = 0L;
    public static final Boolean DEFAULT_HASATTACHMENT = false;
    public static final Boolean DEFAULT_HASDRAFT = false;
    public static final Boolean DEFAULT_ISFLAGGED = false;
    public static final Boolean DEFAULT_ISREAD = false;
    public static final Boolean DEFAULT_IS_EXTERNAL = false;
    public static final Long DEFAULT_LAST_MESSAGE_TIMESTAMP = 0L;
    public static final Long DEFAULT_MSGNUM = 0L;
    private static final long serialVersionUID = 0;
    public final List<ThreadAction> actions;
    public final List<String> attachment_name_list;
    public final Long create_timestamp;
    public final Long delivery_state;
    public final String folder;
    public final String from;
    public final Boolean hasAttachment;
    public final Boolean hasDraft;
    public final Boolean isFlagged;
    public final Boolean isRead;
    public final Boolean is_external;
    public final List<Label> label_items;
    public final List<String> labels;
    public final Long last_message_timestamp;
    public final String message_id;
    public final List<String> message_ids;
    public final Long msgNum;
    public final String msg_summary;
    public final String subject;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MessagesSummary$b */
    private static final class C16971b extends ProtoAdapter<MessagesSummary> {
        C16971b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessagesSummary.class);
        }

        /* renamed from: a */
        public int encodedSize(MessagesSummary messagesSummary) {
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
            if (messagesSummary.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, messagesSummary.message_id);
            } else {
                i = 0;
            }
            if (messagesSummary.thread_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, messagesSummary.thread_id);
            } else {
                i2 = 0;
            }
            int i16 = i + i2;
            if (messagesSummary.from != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, messagesSummary.from);
            } else {
                i3 = 0;
            }
            int i17 = i16 + i3;
            if (messagesSummary.msg_summary != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, messagesSummary.msg_summary);
            } else {
                i4 = 0;
            }
            int i18 = i17 + i4;
            if (messagesSummary.create_timestamp != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, messagesSummary.create_timestamp);
            } else {
                i5 = 0;
            }
            int i19 = i18 + i5;
            if (messagesSummary.last_message_timestamp != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, messagesSummary.last_message_timestamp);
            } else {
                i6 = 0;
            }
            int i20 = i19 + i6;
            if (messagesSummary.subject != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, messagesSummary.subject);
            } else {
                i7 = 0;
            }
            int i21 = i20 + i7;
            if (messagesSummary.isRead != null) {
                i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, messagesSummary.isRead);
            } else {
                i8 = 0;
            }
            int i22 = i21 + i8;
            if (messagesSummary.delivery_state != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(9, messagesSummary.delivery_state);
            } else {
                i9 = 0;
            }
            int i23 = i22 + i9;
            if (messagesSummary.hasAttachment != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, messagesSummary.hasAttachment);
            } else {
                i10 = 0;
            }
            int i24 = i23 + i10;
            if (messagesSummary.msgNum != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(11, messagesSummary.msgNum);
            } else {
                i11 = 0;
            }
            int encodedSizeWithTag = i24 + i11 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(12, messagesSummary.labels);
            if (messagesSummary.hasDraft != null) {
                i12 = ProtoAdapter.BOOL.encodedSizeWithTag(13, messagesSummary.hasDraft);
            } else {
                i12 = 0;
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + i12 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(14, messagesSummary.message_ids) + Label.ADAPTER.asRepeated().encodedSizeWithTag(15, messagesSummary.label_items) + ThreadAction.ADAPTER.asRepeated().encodedSizeWithTag(16, messagesSummary.actions);
            if (messagesSummary.isFlagged != null) {
                i13 = ProtoAdapter.BOOL.encodedSizeWithTag(17, messagesSummary.isFlagged);
            } else {
                i13 = 0;
            }
            int i25 = encodedSizeWithTag2 + i13;
            if (messagesSummary.is_external != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(18, messagesSummary.is_external);
            } else {
                i14 = 0;
            }
            int i26 = i25 + i14;
            if (messagesSummary.folder != null) {
                i15 = ProtoAdapter.STRING.encodedSizeWithTag(19, messagesSummary.folder);
            }
            return i26 + i15 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(20, messagesSummary.attachment_name_list) + messagesSummary.unknownFields().size();
        }

        /* renamed from: a */
        public MessagesSummary decode(ProtoReader protoReader) throws IOException {
            C16970a aVar = new C16970a();
            aVar.f43512a = "";
            aVar.f43513b = "";
            aVar.f43514c = "";
            aVar.f43515d = "";
            aVar.f43516e = 0L;
            aVar.f43517f = 0L;
            aVar.f43518g = "";
            aVar.f43519h = false;
            aVar.f43520i = 0L;
            aVar.f43521j = false;
            aVar.f43522k = 0L;
            aVar.f43524m = false;
            aVar.f43528q = false;
            aVar.f43529r = false;
            aVar.f43530s = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43512a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43513b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43514c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f43515d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f43516e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f43517f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43518g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43519h = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43520i = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 10:
                            aVar.f43521j = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 11:
                            aVar.f43522k = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f43523l.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            aVar.f43524m = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            aVar.f43525n.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            aVar.f43526o.add(Label.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            try {
                                aVar.f43527p.add(ThreadAction.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 17:
                            aVar.f43528q = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 18:
                            aVar.f43529r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f43530s = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 20:
                            aVar.f43531t.add(ProtoAdapter.STRING.decode(protoReader));
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
        public void encode(ProtoWriter protoWriter, MessagesSummary messagesSummary) throws IOException {
            if (messagesSummary.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messagesSummary.message_id);
            }
            if (messagesSummary.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, messagesSummary.thread_id);
            }
            if (messagesSummary.from != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, messagesSummary.from);
            }
            if (messagesSummary.msg_summary != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, messagesSummary.msg_summary);
            }
            if (messagesSummary.create_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, messagesSummary.create_timestamp);
            }
            if (messagesSummary.last_message_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, messagesSummary.last_message_timestamp);
            }
            if (messagesSummary.subject != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, messagesSummary.subject);
            }
            if (messagesSummary.isRead != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, messagesSummary.isRead);
            }
            if (messagesSummary.delivery_state != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, messagesSummary.delivery_state);
            }
            if (messagesSummary.hasAttachment != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, messagesSummary.hasAttachment);
            }
            if (messagesSummary.msgNum != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 11, messagesSummary.msgNum);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 12, messagesSummary.labels);
            if (messagesSummary.hasDraft != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 13, messagesSummary.hasDraft);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 14, messagesSummary.message_ids);
            Label.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, messagesSummary.label_items);
            ThreadAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, messagesSummary.actions);
            if (messagesSummary.isFlagged != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 17, messagesSummary.isFlagged);
            }
            if (messagesSummary.is_external != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, messagesSummary.is_external);
            }
            if (messagesSummary.folder != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 19, messagesSummary.folder);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 20, messagesSummary.attachment_name_list);
            protoWriter.writeBytes(messagesSummary.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MessagesSummary$a */
    public static final class C16970a extends Message.Builder<MessagesSummary, C16970a> {

        /* renamed from: a */
        public String f43512a;

        /* renamed from: b */
        public String f43513b;

        /* renamed from: c */
        public String f43514c;

        /* renamed from: d */
        public String f43515d;

        /* renamed from: e */
        public Long f43516e;

        /* renamed from: f */
        public Long f43517f;

        /* renamed from: g */
        public String f43518g;

        /* renamed from: h */
        public Boolean f43519h;

        /* renamed from: i */
        public Long f43520i;

        /* renamed from: j */
        public Boolean f43521j;

        /* renamed from: k */
        public Long f43522k;

        /* renamed from: l */
        public List<String> f43523l = Internal.newMutableList();

        /* renamed from: m */
        public Boolean f43524m;

        /* renamed from: n */
        public List<String> f43525n = Internal.newMutableList();

        /* renamed from: o */
        public List<Label> f43526o = Internal.newMutableList();

        /* renamed from: p */
        public List<ThreadAction> f43527p = Internal.newMutableList();

        /* renamed from: q */
        public Boolean f43528q;

        /* renamed from: r */
        public Boolean f43529r;

        /* renamed from: s */
        public String f43530s;

        /* renamed from: t */
        public List<String> f43531t = Internal.newMutableList();

        /* renamed from: a */
        public MessagesSummary build() {
            return new MessagesSummary(this.f43512a, this.f43513b, this.f43514c, this.f43515d, this.f43516e, this.f43517f, this.f43518g, this.f43519h, this.f43520i, this.f43521j, this.f43522k, this.f43523l, this.f43524m, this.f43525n, this.f43526o, this.f43527p, this.f43528q, this.f43529r, this.f43530s, this.f43531t, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16970a newBuilder() {
        C16970a aVar = new C16970a();
        aVar.f43512a = this.message_id;
        aVar.f43513b = this.thread_id;
        aVar.f43514c = this.from;
        aVar.f43515d = this.msg_summary;
        aVar.f43516e = this.create_timestamp;
        aVar.f43517f = this.last_message_timestamp;
        aVar.f43518g = this.subject;
        aVar.f43519h = this.isRead;
        aVar.f43520i = this.delivery_state;
        aVar.f43521j = this.hasAttachment;
        aVar.f43522k = this.msgNum;
        aVar.f43523l = Internal.copyOf("labels", this.labels);
        aVar.f43524m = this.hasDraft;
        aVar.f43525n = Internal.copyOf("message_ids", this.message_ids);
        aVar.f43526o = Internal.copyOf("label_items", this.label_items);
        aVar.f43527p = Internal.copyOf("actions", this.actions);
        aVar.f43528q = this.isFlagged;
        aVar.f43529r = this.is_external;
        aVar.f43530s = this.folder;
        aVar.f43531t = Internal.copyOf("attachment_name_list", this.attachment_name_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MessagesSummary");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.from != null) {
            sb.append(", from=");
            sb.append(this.from);
        }
        if (this.msg_summary != null) {
            sb.append(", msg_summary=");
            sb.append(this.msg_summary);
        }
        if (this.create_timestamp != null) {
            sb.append(", create_timestamp=");
            sb.append(this.create_timestamp);
        }
        if (this.last_message_timestamp != null) {
            sb.append(", last_message_timestamp=");
            sb.append(this.last_message_timestamp);
        }
        if (this.subject != null) {
            sb.append(", subject=");
            sb.append(this.subject);
        }
        if (this.isRead != null) {
            sb.append(", isRead=");
            sb.append(this.isRead);
        }
        if (this.delivery_state != null) {
            sb.append(", delivery_state=");
            sb.append(this.delivery_state);
        }
        if (this.hasAttachment != null) {
            sb.append(", hasAttachment=");
            sb.append(this.hasAttachment);
        }
        if (this.msgNum != null) {
            sb.append(", msgNum=");
            sb.append(this.msgNum);
        }
        if (!this.labels.isEmpty()) {
            sb.append(", labels=");
            sb.append(this.labels);
        }
        if (this.hasDraft != null) {
            sb.append(", hasDraft=");
            sb.append(this.hasDraft);
        }
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        if (!this.label_items.isEmpty()) {
            sb.append(", label_items=");
            sb.append(this.label_items);
        }
        if (!this.actions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.actions);
        }
        if (this.isFlagged != null) {
            sb.append(", isFlagged=");
            sb.append(this.isFlagged);
        }
        if (this.is_external != null) {
            sb.append(", is_external=");
            sb.append(this.is_external);
        }
        if (this.folder != null) {
            sb.append(", folder=");
            sb.append(this.folder);
        }
        if (!this.attachment_name_list.isEmpty()) {
            sb.append(", attachment_name_list=");
            sb.append(this.attachment_name_list);
        }
        StringBuilder replace = sb.replace(0, 2, "MessagesSummary{");
        replace.append('}');
        return replace.toString();
    }

    public MessagesSummary(String str, String str2, String str3, String str4, Long l, Long l2, String str5, Boolean bool, Long l3, Boolean bool2, Long l4, List<String> list, Boolean bool3, List<String> list2, List<Label> list3, List<ThreadAction> list4, Boolean bool4, Boolean bool5, String str6, List<String> list5) {
        this(str, str2, str3, str4, l, l2, str5, bool, l3, bool2, l4, list, bool3, list2, list3, list4, bool4, bool5, str6, list5, ByteString.EMPTY);
    }

    public MessagesSummary(String str, String str2, String str3, String str4, Long l, Long l2, String str5, Boolean bool, Long l3, Boolean bool2, Long l4, List<String> list, Boolean bool3, List<String> list2, List<Label> list3, List<ThreadAction> list4, Boolean bool4, Boolean bool5, String str6, List<String> list5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.thread_id = str2;
        this.from = str3;
        this.msg_summary = str4;
        this.create_timestamp = l;
        this.last_message_timestamp = l2;
        this.subject = str5;
        this.isRead = bool;
        this.delivery_state = l3;
        this.hasAttachment = bool2;
        this.msgNum = l4;
        this.labels = Internal.immutableCopyOf("labels", list);
        this.hasDraft = bool3;
        this.message_ids = Internal.immutableCopyOf("message_ids", list2);
        this.label_items = Internal.immutableCopyOf("label_items", list3);
        this.actions = Internal.immutableCopyOf("actions", list4);
        this.isFlagged = bool4;
        this.is_external = bool5;
        this.folder = str6;
        this.attachment_name_list = Internal.immutableCopyOf("attachment_name_list", list5);
    }
}
