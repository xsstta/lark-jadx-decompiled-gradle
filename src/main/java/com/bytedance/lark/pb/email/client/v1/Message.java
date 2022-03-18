package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.log.IVideoEventLogger;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Message extends com.squareup.wire.Message<Message, C16966a> {
    public static final ProtoAdapter<Message> ADAPTER = new C16967b();
    public static final Boolean DEFAULT_CAN_REPLY_ALL = false;
    public static final Long DEFAULT_CREATED_TIMESTAMP = 0L;
    public static final DeliveryState DEFAULT_DELIVERY_STATE = DeliveryState.UNKNOWN_DELIVERY_STATE;
    public static final Boolean DEFAULT_IS_BODY_CLIPPED = false;
    public static final Boolean DEFAULT_IS_READ = false;
    public static final Boolean DEFAULT_IS_SEND_SEPARATELY = false;
    public static final Boolean DEFAULT_IS_SUSPECT = false;
    public static final Long DEFAULT_LAST_UPDATED_TIMESTAMP = 0L;
    public static final RecallStatus DEFAULT_RECALL_STATUS = RecallStatus.None;
    public static final RedirectType DEFAULT_REDIRECT_TYPE = RedirectType.NONE_REDIRECT;
    public static final ReportType DEFAULT_REPORT_TYPE = ReportType.UNKNOWN_TYPE;
    public static final Long DEFAULT_SCHEDULE_SEND_TIMESTAMP = 0L;
    public static final ThreadSecurityLevel DEFAULT_SECURITY_LEVEL = ThreadSecurityLevel.UNKNOWN;
    public static final SendState DEFAULT_SEND_STATE = SendState.UNKNOWN_SEND_STATE;
    public static final Long DEFAULT_THREAD_INDEX = 0L;
    private static final long serialVersionUID = 0;
    public final List<Attachment> attachments;
    public final List<Address> bcc;
    public final String body_html;
    public final String body_plaintext;
    public final EmailCalendarEventInfo calendar_event_card;
    public final Boolean can_reply_all;
    public final List<Address> cc;
    public final Long created_timestamp;
    public final DeliveryState delivery_state;
    public final Address from;
    public final String id;
    public final List<DraftImage> images;
    public final Boolean is_body_clipped;
    public final Boolean is_read;
    public final Boolean is_send_separately;
    public final Boolean is_suspect;
    public final String language_identifier;
    public final Long last_updated_timestamp;
    public final String locale_language;
    public final RecallStatus recall_status;
    public final RedirectType redirect_type;
    public final ReportType report_type;
    public final Long schedule_send_timestamp;
    public final ThreadSecurityLevel security_level;
    public final SendState send_state;
    public final FilterStatus status;
    public final String subject;
    public final String system_plaintext;
    public final Long thread_index;
    public final List<Address> to;
    public final UnsubscribeOption unsubscribe_option;
    public final String via_domain;

    public enum DeliveryState implements WireEnum {
        UNKNOWN_DELIVERY_STATE(0),
        TO_SEND(1),
        SENDING(2),
        DELIVERED(3),
        RECEIVED(4),
        DRAFT(5),
        SEND_ERROR(6),
        SENT_TO_SELF(7),
        RECALL(8),
        PENDING(9),
        SCHEDULED(10);
        
        public static final ProtoAdapter<DeliveryState> ADAPTER = ProtoAdapter.newEnumAdapter(DeliveryState.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DeliveryState fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_DELIVERY_STATE;
                case 1:
                    return TO_SEND;
                case 2:
                    return SENDING;
                case 3:
                    return DELIVERED;
                case 4:
                    return RECEIVED;
                case 5:
                    return DRAFT;
                case 6:
                    return SEND_ERROR;
                case 7:
                    return SENT_TO_SELF;
                case 8:
                    return RECALL;
                case 9:
                    return PENDING;
                case 10:
                    return SCHEDULED;
                default:
                    return null;
            }
        }

        private DeliveryState(int i) {
            this.value = i;
        }
    }

    public enum RecallStatus implements WireEnum {
        None(0),
        Processing(1),
        Done(2),
        ALL_SUCCESS(3),
        ALL_FAIL(4),
        SOME_FAIL(5);
        
        public static final ProtoAdapter<RecallStatus> ADAPTER = ProtoAdapter.newEnumAdapter(RecallStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static RecallStatus fromValue(int i) {
            if (i == 0) {
                return None;
            }
            if (i == 1) {
                return Processing;
            }
            if (i == 2) {
                return Done;
            }
            if (i == 3) {
                return ALL_SUCCESS;
            }
            if (i == 4) {
                return ALL_FAIL;
            }
            if (i != 5) {
                return null;
            }
            return SOME_FAIL;
        }

        private RecallStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Message$a */
    public static final class C16966a extends Message.Builder<Message, C16966a> {

        /* renamed from: A */
        public Boolean f43477A;

        /* renamed from: B */
        public ReportType f43478B;

        /* renamed from: C */
        public Boolean f43479C;

        /* renamed from: D */
        public String f43480D;

        /* renamed from: E */
        public RedirectType f43481E;

        /* renamed from: F */
        public SendState f43482F;

        /* renamed from: a */
        public String f43483a;

        /* renamed from: b */
        public Address f43484b;

        /* renamed from: c */
        public List<Address> f43485c = Internal.newMutableList();

        /* renamed from: d */
        public List<Address> f43486d = Internal.newMutableList();

        /* renamed from: e */
        public List<Address> f43487e = Internal.newMutableList();

        /* renamed from: f */
        public String f43488f;

        /* renamed from: g */
        public String f43489g;

        /* renamed from: h */
        public String f43490h;

        /* renamed from: i */
        public List<Attachment> f43491i = Internal.newMutableList();

        /* renamed from: j */
        public List<DraftImage> f43492j = Internal.newMutableList();

        /* renamed from: k */
        public FilterStatus f43493k;

        /* renamed from: l */
        public DeliveryState f43494l;

        /* renamed from: m */
        public Long f43495m;

        /* renamed from: n */
        public Long f43496n;

        /* renamed from: o */
        public Boolean f43497o;

        /* renamed from: p */
        public Long f43498p;

        /* renamed from: q */
        public EmailCalendarEventInfo f43499q;

        /* renamed from: r */
        public String f43500r;

        /* renamed from: s */
        public Boolean f43501s;

        /* renamed from: t */
        public RecallStatus f43502t;

        /* renamed from: u */
        public String f43503u;

        /* renamed from: v */
        public Boolean f43504v;

        /* renamed from: w */
        public String f43505w;

        /* renamed from: x */
        public ThreadSecurityLevel f43506x;

        /* renamed from: y */
        public UnsubscribeOption f43507y;

        /* renamed from: z */
        public Long f43508z;

        /* renamed from: a */
        public C16966a mo59926a(String str) {
            this.f43483a = str;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59927a(List<Address> list) {
            Internal.checkElementsNotNull(list);
            this.f43485c = list;
            return this;
        }

        /* renamed from: a */
        public Message build() {
            return new Message(this.f43483a, this.f43484b, this.f43485c, this.f43486d, this.f43487e, this.f43488f, this.f43489g, this.f43490h, this.f43491i, this.f43492j, this.f43493k, this.f43494l, this.f43495m, this.f43496n, this.f43497o, this.f43498p, this.f43499q, this.f43500r, this.f43501s, this.f43502t, this.f43503u, this.f43504v, this.f43505w, this.f43506x, this.f43507y, this.f43508z, this.f43477A, this.f43478B, this.f43479C, this.f43480D, this.f43481E, this.f43482F, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16966a mo59915a(Address address) {
            this.f43484b = address;
            return this;
        }

        /* renamed from: b */
        public C16966a mo59929b(Boolean bool) {
            this.f43501s = bool;
            return this;
        }

        /* renamed from: c */
        public C16966a mo59933c(Boolean bool) {
            this.f43477A = bool;
            return this;
        }

        /* renamed from: d */
        public C16966a mo59937d(Boolean bool) {
            this.f43479C = bool;
            return this;
        }

        /* renamed from: e */
        public C16966a mo59941e(String str) {
            this.f43505w = str;
            return this;
        }

        /* renamed from: f */
        public C16966a mo59943f(String str) {
            this.f43480D = str;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59916a(FilterStatus filterStatus) {
            this.f43493k = filterStatus;
            return this;
        }

        /* renamed from: b */
        public C16966a mo59930b(Long l) {
            this.f43496n = l;
            return this;
        }

        /* renamed from: c */
        public C16966a mo59934c(Long l) {
            this.f43498p = l;
            return this;
        }

        /* renamed from: d */
        public C16966a mo59938d(Long l) {
            this.f43508z = l;
            return this;
        }

        /* renamed from: e */
        public C16966a mo59942e(List<DraftImage> list) {
            Internal.checkElementsNotNull(list);
            this.f43492j = list;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59917a(DeliveryState deliveryState) {
            this.f43494l = deliveryState;
            return this;
        }

        /* renamed from: b */
        public C16966a mo59931b(String str) {
            this.f43488f = str;
            return this;
        }

        /* renamed from: c */
        public C16966a mo59935c(String str) {
            this.f43489g = str;
            return this;
        }

        /* renamed from: d */
        public C16966a mo59939d(String str) {
            this.f43490h = str;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59918a(RecallStatus recallStatus) {
            this.f43502t = recallStatus;
            return this;
        }

        /* renamed from: b */
        public C16966a mo59932b(List<Address> list) {
            Internal.checkElementsNotNull(list);
            this.f43486d = list;
            return this;
        }

        /* renamed from: c */
        public C16966a mo59936c(List<Address> list) {
            Internal.checkElementsNotNull(list);
            this.f43487e = list;
            return this;
        }

        /* renamed from: d */
        public C16966a mo59940d(List<Attachment> list) {
            Internal.checkElementsNotNull(list);
            this.f43491i = list;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59919a(RedirectType redirectType) {
            this.f43481E = redirectType;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59920a(ReportType reportType) {
            this.f43478B = reportType;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59921a(SendState sendState) {
            this.f43482F = sendState;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59922a(ThreadSecurityLevel threadSecurityLevel) {
            this.f43506x = threadSecurityLevel;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59923a(UnsubscribeOption unsubscribeOption) {
            this.f43507y = unsubscribeOption;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59924a(Boolean bool) {
            this.f43497o = bool;
            return this;
        }

        /* renamed from: a */
        public C16966a mo59925a(Long l) {
            this.f43495m = l;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.Message$b */
    private static final class C16967b extends ProtoAdapter<Message> {
        C16967b() {
            super(FieldEncoding.LENGTH_DELIMITED, Message.class);
        }

        /* renamed from: a */
        public int encodedSize(Message message) {
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
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27 = 0;
            if (message.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, message.id);
            } else {
                i = 0;
            }
            if (message.from != null) {
                i2 = Address.ADAPTER.encodedSizeWithTag(2, message.from);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + Address.ADAPTER.asRepeated().encodedSizeWithTag(3, message.to) + Address.ADAPTER.asRepeated().encodedSizeWithTag(4, message.cc) + Address.ADAPTER.asRepeated().encodedSizeWithTag(5, message.bcc);
            if (message.subject != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, message.subject);
            } else {
                i3 = 0;
            }
            int i28 = encodedSizeWithTag + i3;
            if (message.body_html != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, message.body_html);
            } else {
                i4 = 0;
            }
            int i29 = i28 + i4;
            if (message.body_plaintext != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, message.body_plaintext);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag2 = i29 + i5 + Attachment.ADAPTER.asRepeated().encodedSizeWithTag(9, message.attachments) + DraftImage.ADAPTER.asRepeated().encodedSizeWithTag(10, message.images);
            if (message.status != null) {
                i6 = FilterStatus.ADAPTER.encodedSizeWithTag(11, message.status);
            } else {
                i6 = 0;
            }
            int i30 = encodedSizeWithTag2 + i6;
            if (message.delivery_state != null) {
                i7 = DeliveryState.ADAPTER.encodedSizeWithTag(12, message.delivery_state);
            } else {
                i7 = 0;
            }
            int i31 = i30 + i7;
            if (message.last_updated_timestamp != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(13, message.last_updated_timestamp);
            } else {
                i8 = 0;
            }
            int i32 = i31 + i8;
            if (message.created_timestamp != null) {
                i9 = ProtoAdapter.INT64.encodedSizeWithTag(14, message.created_timestamp);
            } else {
                i9 = 0;
            }
            int i33 = i32 + i9;
            if (message.is_read != null) {
                i10 = ProtoAdapter.BOOL.encodedSizeWithTag(15, message.is_read);
            } else {
                i10 = 0;
            }
            int i34 = i33 + i10;
            if (message.thread_index != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(16, message.thread_index);
            } else {
                i11 = 0;
            }
            int i35 = i34 + i11;
            if (message.calendar_event_card != null) {
                i12 = EmailCalendarEventInfo.ADAPTER.encodedSizeWithTag(17, message.calendar_event_card);
            } else {
                i12 = 0;
            }
            int i36 = i35 + i12;
            if (message.via_domain != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(18, message.via_domain);
            } else {
                i13 = 0;
            }
            int i37 = i36 + i13;
            if (message.is_body_clipped != null) {
                i14 = ProtoAdapter.BOOL.encodedSizeWithTag(19, message.is_body_clipped);
            } else {
                i14 = 0;
            }
            int i38 = i37 + i14;
            if (message.recall_status != null) {
                i15 = RecallStatus.ADAPTER.encodedSizeWithTag(20, message.recall_status);
            } else {
                i15 = 0;
            }
            int i39 = i38 + i15;
            if (message.system_plaintext != null) {
                i16 = ProtoAdapter.STRING.encodedSizeWithTag(21, message.system_plaintext);
            } else {
                i16 = 0;
            }
            int i40 = i39 + i16;
            if (message.can_reply_all != null) {
                i17 = ProtoAdapter.BOOL.encodedSizeWithTag(22, message.can_reply_all);
            } else {
                i17 = 0;
            }
            int i41 = i40 + i17;
            if (message.language_identifier != null) {
                i18 = ProtoAdapter.STRING.encodedSizeWithTag(23, message.language_identifier);
            } else {
                i18 = 0;
            }
            int i42 = i41 + i18;
            if (message.security_level != null) {
                i19 = ThreadSecurityLevel.ADAPTER.encodedSizeWithTag(24, message.security_level);
            } else {
                i19 = 0;
            }
            int i43 = i42 + i19;
            if (message.unsubscribe_option != null) {
                i20 = UnsubscribeOption.ADAPTER.encodedSizeWithTag(25, message.unsubscribe_option);
            } else {
                i20 = 0;
            }
            int i44 = i43 + i20;
            if (message.schedule_send_timestamp != null) {
                i21 = ProtoAdapter.INT64.encodedSizeWithTag(26, message.schedule_send_timestamp);
            } else {
                i21 = 0;
            }
            int i45 = i44 + i21;
            if (message.is_send_separately != null) {
                i22 = ProtoAdapter.BOOL.encodedSizeWithTag(27, message.is_send_separately);
            } else {
                i22 = 0;
            }
            int i46 = i45 + i22;
            if (message.report_type != null) {
                i23 = ReportType.ADAPTER.encodedSizeWithTag(28, message.report_type);
            } else {
                i23 = 0;
            }
            int i47 = i46 + i23;
            if (message.is_suspect != null) {
                i24 = ProtoAdapter.BOOL.encodedSizeWithTag(29, message.is_suspect);
            } else {
                i24 = 0;
            }
            int i48 = i47 + i24;
            if (message.locale_language != null) {
                i25 = ProtoAdapter.STRING.encodedSizeWithTag(30, message.locale_language);
            } else {
                i25 = 0;
            }
            int i49 = i48 + i25;
            if (message.redirect_type != null) {
                i26 = RedirectType.ADAPTER.encodedSizeWithTag(31, message.redirect_type);
            } else {
                i26 = 0;
            }
            int i50 = i49 + i26;
            if (message.send_state != null) {
                i27 = SendState.ADAPTER.encodedSizeWithTag(32, message.send_state);
            }
            return i50 + i27 + message.unknownFields().size();
        }

        /* renamed from: a */
        public Message decode(ProtoReader protoReader) throws IOException {
            C16966a aVar = new C16966a();
            aVar.f43483a = "";
            aVar.f43488f = "";
            aVar.f43489g = "";
            aVar.f43490h = "";
            aVar.f43494l = DeliveryState.UNKNOWN_DELIVERY_STATE;
            aVar.f43495m = 0L;
            aVar.f43496n = 0L;
            aVar.f43497o = false;
            aVar.f43498p = 0L;
            aVar.f43500r = "";
            aVar.f43501s = false;
            aVar.f43502t = RecallStatus.None;
            aVar.f43503u = "";
            aVar.f43504v = false;
            aVar.f43505w = "[unknown]";
            aVar.f43506x = ThreadSecurityLevel.UNKNOWN;
            aVar.f43508z = 0L;
            aVar.f43477A = false;
            aVar.f43478B = ReportType.UNKNOWN_TYPE;
            aVar.f43479C = false;
            aVar.f43480D = "";
            aVar.f43481E = RedirectType.NONE_REDIRECT;
            aVar.f43482F = SendState.UNKNOWN_SEND_STATE;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f43483a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f43484b = Address.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f43485c.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            aVar.f43486d.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f43487e.add(Address.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            aVar.f43488f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f43489g = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            aVar.f43490h = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            aVar.f43491i.add(Attachment.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f43492j.add(DraftImage.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            aVar.f43493k = FilterStatus.ADAPTER.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            try {
                                aVar.f43494l = DeliveryState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 13:
                            aVar.f43495m = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            aVar.f43496n = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            aVar.f43497o = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            aVar.f43498p = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 17:
                            aVar.f43499q = EmailCalendarEventInfo.ADAPTER.decode(protoReader);
                            break;
                        case 18:
                            aVar.f43500r = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            aVar.f43501s = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 20:
                            try {
                                aVar.f43502t = RecallStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 21:
                            aVar.f43503u = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            aVar.f43504v = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            aVar.f43505w = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 24:
                            try {
                                aVar.f43506x = ThreadSecurityLevel.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                            aVar.f43507y = UnsubscribeOption.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            aVar.f43508z = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /*{ENCODED_INT: 27}*/:
                            aVar.f43477A = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case IVideoEventLogger.LOGGER_OPTION_ENABLE_SR /*{ENCODED_INT: 28}*/:
                            try {
                                aVar.f43478B = ReportType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 29:
                            aVar.f43479C = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            aVar.f43480D = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case TTVideoEngine.PLAYER_OPTION_ENABLE_PLAYER3_HARDWARE_DECODE /*{ENCODED_INT: 31}*/:
                            try {
                                aVar.f43481E = RedirectType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e5.value));
                                break;
                            }
                        case 32:
                            try {
                                aVar.f43482F = SendState.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e6.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, Message message) throws IOException {
            if (message.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, message.id);
            }
            if (message.from != null) {
                Address.ADAPTER.encodeWithTag(protoWriter, 2, message.from);
            }
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, message.to);
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, message.cc);
            Address.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, message.bcc);
            if (message.subject != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, message.subject);
            }
            if (message.body_html != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, message.body_html);
            }
            if (message.body_plaintext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, message.body_plaintext);
            }
            Attachment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, message.attachments);
            DraftImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, message.images);
            if (message.status != null) {
                FilterStatus.ADAPTER.encodeWithTag(protoWriter, 11, message.status);
            }
            if (message.delivery_state != null) {
                DeliveryState.ADAPTER.encodeWithTag(protoWriter, 12, message.delivery_state);
            }
            if (message.last_updated_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 13, message.last_updated_timestamp);
            }
            if (message.created_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 14, message.created_timestamp);
            }
            if (message.is_read != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, message.is_read);
            }
            if (message.thread_index != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 16, message.thread_index);
            }
            if (message.calendar_event_card != null) {
                EmailCalendarEventInfo.ADAPTER.encodeWithTag(protoWriter, 17, message.calendar_event_card);
            }
            if (message.via_domain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 18, message.via_domain);
            }
            if (message.is_body_clipped != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 19, message.is_body_clipped);
            }
            if (message.recall_status != null) {
                RecallStatus.ADAPTER.encodeWithTag(protoWriter, 20, message.recall_status);
            }
            if (message.system_plaintext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, message.system_plaintext);
            }
            if (message.can_reply_all != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, message.can_reply_all);
            }
            if (message.language_identifier != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, message.language_identifier);
            }
            if (message.security_level != null) {
                ThreadSecurityLevel.ADAPTER.encodeWithTag(protoWriter, 24, message.security_level);
            }
            if (message.unsubscribe_option != null) {
                UnsubscribeOption.ADAPTER.encodeWithTag(protoWriter, 25, message.unsubscribe_option);
            }
            if (message.schedule_send_timestamp != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 26, message.schedule_send_timestamp);
            }
            if (message.is_send_separately != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 27, message.is_send_separately);
            }
            if (message.report_type != null) {
                ReportType.ADAPTER.encodeWithTag(protoWriter, 28, message.report_type);
            }
            if (message.is_suspect != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 29, message.is_suspect);
            }
            if (message.locale_language != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 30, message.locale_language);
            }
            if (message.redirect_type != null) {
                RedirectType.ADAPTER.encodeWithTag(protoWriter, 31, message.redirect_type);
            }
            if (message.send_state != null) {
                SendState.ADAPTER.encodeWithTag(protoWriter, 32, message.send_state);
            }
            protoWriter.writeBytes(message.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16966a newBuilder() {
        C16966a aVar = new C16966a();
        aVar.f43483a = this.id;
        aVar.f43484b = this.from;
        aVar.f43485c = Internal.copyOf("to", this.to);
        aVar.f43486d = Internal.copyOf("cc", this.cc);
        aVar.f43487e = Internal.copyOf("bcc", this.bcc);
        aVar.f43488f = this.subject;
        aVar.f43489g = this.body_html;
        aVar.f43490h = this.body_plaintext;
        aVar.f43491i = Internal.copyOf("attachments", this.attachments);
        aVar.f43492j = Internal.copyOf("images", this.images);
        aVar.f43493k = this.status;
        aVar.f43494l = this.delivery_state;
        aVar.f43495m = this.last_updated_timestamp;
        aVar.f43496n = this.created_timestamp;
        aVar.f43497o = this.is_read;
        aVar.f43498p = this.thread_index;
        aVar.f43499q = this.calendar_event_card;
        aVar.f43500r = this.via_domain;
        aVar.f43501s = this.is_body_clipped;
        aVar.f43502t = this.recall_status;
        aVar.f43503u = this.system_plaintext;
        aVar.f43504v = this.can_reply_all;
        aVar.f43505w = this.language_identifier;
        aVar.f43506x = this.security_level;
        aVar.f43507y = this.unsubscribe_option;
        aVar.f43508z = this.schedule_send_timestamp;
        aVar.f43477A = this.is_send_separately;
        aVar.f43478B = this.report_type;
        aVar.f43479C = this.is_suspect;
        aVar.f43480D = this.locale_language;
        aVar.f43481E = this.redirect_type;
        aVar.f43482F = this.send_state;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "Message");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
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
        if (this.subject != null) {
            sb.append(", subject=");
            sb.append(this.subject);
        }
        if (this.body_html != null) {
            sb.append(", body_html=");
            sb.append(this.body_html);
        }
        if (this.body_plaintext != null) {
            sb.append(", body_plaintext=");
            sb.append(this.body_plaintext);
        }
        if (!this.attachments.isEmpty()) {
            sb.append(", attachments=");
            sb.append(this.attachments);
        }
        if (!this.images.isEmpty()) {
            sb.append(", images=");
            sb.append(this.images);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.delivery_state != null) {
            sb.append(", delivery_state=");
            sb.append(this.delivery_state);
        }
        if (this.last_updated_timestamp != null) {
            sb.append(", last_updated_timestamp=");
            sb.append(this.last_updated_timestamp);
        }
        if (this.created_timestamp != null) {
            sb.append(", created_timestamp=");
            sb.append(this.created_timestamp);
        }
        if (this.is_read != null) {
            sb.append(", is_read=");
            sb.append(this.is_read);
        }
        if (this.thread_index != null) {
            sb.append(", thread_index=");
            sb.append(this.thread_index);
        }
        if (this.calendar_event_card != null) {
            sb.append(", calendar_event_card=");
            sb.append(this.calendar_event_card);
        }
        if (this.via_domain != null) {
            sb.append(", via_domain=");
            sb.append(this.via_domain);
        }
        if (this.is_body_clipped != null) {
            sb.append(", is_body_clipped=");
            sb.append(this.is_body_clipped);
        }
        if (this.recall_status != null) {
            sb.append(", recall_status=");
            sb.append(this.recall_status);
        }
        if (this.system_plaintext != null) {
            sb.append(", system_plaintext=");
            sb.append(this.system_plaintext);
        }
        if (this.can_reply_all != null) {
            sb.append(", can_reply_all=");
            sb.append(this.can_reply_all);
        }
        if (this.language_identifier != null) {
            sb.append(", language_identifier=");
            sb.append(this.language_identifier);
        }
        if (this.security_level != null) {
            sb.append(", security_level=");
            sb.append(this.security_level);
        }
        if (this.unsubscribe_option != null) {
            sb.append(", unsubscribe_option=");
            sb.append(this.unsubscribe_option);
        }
        if (this.schedule_send_timestamp != null) {
            sb.append(", schedule_send_timestamp=");
            sb.append(this.schedule_send_timestamp);
        }
        if (this.is_send_separately != null) {
            sb.append(", is_send_separately=");
            sb.append(this.is_send_separately);
        }
        if (this.report_type != null) {
            sb.append(", report_type=");
            sb.append(this.report_type);
        }
        if (this.is_suspect != null) {
            sb.append(", is_suspect=");
            sb.append(this.is_suspect);
        }
        if (this.locale_language != null) {
            sb.append(", locale_language=");
            sb.append(this.locale_language);
        }
        if (this.redirect_type != null) {
            sb.append(", redirect_type=");
            sb.append(this.redirect_type);
        }
        if (this.send_state != null) {
            sb.append(", send_state=");
            sb.append(this.send_state);
        }
        StringBuilder replace = sb.replace(0, 2, "Message{");
        replace.append('}');
        return replace.toString();
    }

    public Message(String str, Address address, List<Address> list, List<Address> list2, List<Address> list3, String str2, String str3, String str4, List<Attachment> list4, List<DraftImage> list5, FilterStatus filterStatus, DeliveryState deliveryState, Long l, Long l2, Boolean bool, Long l3, EmailCalendarEventInfo emailCalendarEventInfo, String str5, Boolean bool2, RecallStatus recallStatus, String str6, Boolean bool3, String str7, ThreadSecurityLevel threadSecurityLevel, UnsubscribeOption unsubscribeOption, Long l4, Boolean bool4, ReportType reportType, Boolean bool5, String str8, RedirectType redirectType, SendState sendState) {
        this(str, address, list, list2, list3, str2, str3, str4, list4, list5, filterStatus, deliveryState, l, l2, bool, l3, emailCalendarEventInfo, str5, bool2, recallStatus, str6, bool3, str7, threadSecurityLevel, unsubscribeOption, l4, bool4, reportType, bool5, str8, redirectType, sendState, ByteString.EMPTY);
    }

    public Message(String str, Address address, List<Address> list, List<Address> list2, List<Address> list3, String str2, String str3, String str4, List<Attachment> list4, List<DraftImage> list5, FilterStatus filterStatus, DeliveryState deliveryState, Long l, Long l2, Boolean bool, Long l3, EmailCalendarEventInfo emailCalendarEventInfo, String str5, Boolean bool2, RecallStatus recallStatus, String str6, Boolean bool3, String str7, ThreadSecurityLevel threadSecurityLevel, UnsubscribeOption unsubscribeOption, Long l4, Boolean bool4, ReportType reportType, Boolean bool5, String str8, RedirectType redirectType, SendState sendState, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.from = address;
        this.to = Internal.immutableCopyOf("to", list);
        this.cc = Internal.immutableCopyOf("cc", list2);
        this.bcc = Internal.immutableCopyOf("bcc", list3);
        this.subject = str2;
        this.body_html = str3;
        this.body_plaintext = str4;
        this.attachments = Internal.immutableCopyOf("attachments", list4);
        this.images = Internal.immutableCopyOf("images", list5);
        this.status = filterStatus;
        this.delivery_state = deliveryState;
        this.last_updated_timestamp = l;
        this.created_timestamp = l2;
        this.is_read = bool;
        this.thread_index = l3;
        this.calendar_event_card = emailCalendarEventInfo;
        this.via_domain = str5;
        this.is_body_clipped = bool2;
        this.recall_status = recallStatus;
        this.system_plaintext = str6;
        this.can_reply_all = bool3;
        this.language_identifier = str7;
        this.security_level = threadSecurityLevel;
        this.unsubscribe_option = unsubscribeOption;
        this.schedule_send_timestamp = l4;
        this.is_send_separately = bool4;
        this.report_type = reportType;
        this.is_suspect = bool5;
        this.locale_language = str8;
        this.redirect_type = redirectType;
        this.send_state = sendState;
    }
}
