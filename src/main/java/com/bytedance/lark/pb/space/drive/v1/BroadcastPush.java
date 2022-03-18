package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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

public final class BroadcastPush extends Message<BroadcastPush, C19303a> {
    public static final ProtoAdapter<BroadcastPush> ADAPTER = new C19304b();
    private static final long serialVersionUID = 0;
    public final List<EventMessage> event_message;

    public static final class EventMessage extends Message<EventMessage, C19301a> {
        public static final ProtoAdapter<EventMessage> ADAPTER = new C19302b();
        public static final PushStatus DEFAULT_PUSH_STATUS = PushStatus.NORMAL;
        public static final PushType DEFAULT_PUSH_TYPE = PushType.RECENT_LIST;
        private static final long serialVersionUID = 0;
        public final List<Payload> payloads;
        public final PushStatus push_status;
        public final PushType push_type;
        public final String subsc_sign;

        public enum PushStatus implements WireEnum {
            NORMAL(0),
            LOSS(1);
            
            public static final ProtoAdapter<PushStatus> ADAPTER = ProtoAdapter.newEnumAdapter(PushStatus.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static PushStatus fromValue(int i) {
                if (i == 0) {
                    return NORMAL;
                }
                if (i != 1) {
                    return null;
                }
                return LOSS;
            }

            private PushStatus(int i) {
                this.value = i;
            }
        }

        public static final class Payload extends Message<Payload, C19299a> {
            public static final ProtoAdapter<Payload> ADAPTER = new C19300b();
            public static final Long DEFAULT_EVENT_TIME = 0L;
            public static final Long DEFAULT_EVENT_TYPE = 0L;
            public static final Long DEFAULT_FILE_TYPE = 0L;
            public static final Long DEFAULT_VERSION = 0L;
            private static final long serialVersionUID = 0;
            public final String data;
            public final Long event_time;
            public final Long event_type;
            public final String extra;
            public final Long file_type;
            public final String node_token;
            public final Long version;

            /* renamed from: com.bytedance.lark.pb.space.drive.v1.BroadcastPush$EventMessage$Payload$b */
            private static final class C19300b extends ProtoAdapter<Payload> {
                C19300b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Payload.class);
                }

                /* renamed from: a */
                public int encodedSize(Payload payload) {
                    int i;
                    int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, payload.node_token) + ProtoAdapter.INT64.encodedSizeWithTag(2, payload.file_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, payload.data) + ProtoAdapter.INT64.encodedSizeWithTag(4, payload.event_type) + ProtoAdapter.INT64.encodedSizeWithTag(5, payload.event_time) + ProtoAdapter.INT64.encodedSizeWithTag(6, payload.version);
                    if (payload.extra != null) {
                        i = ProtoAdapter.STRING.encodedSizeWithTag(7, payload.extra);
                    } else {
                        i = 0;
                    }
                    return encodedSizeWithTag + i + payload.unknownFields().size();
                }

                /* renamed from: a */
                public Payload decode(ProtoReader protoReader) throws IOException {
                    C19299a aVar = new C19299a();
                    aVar.f47490a = "";
                    aVar.f47491b = 0L;
                    aVar.f47492c = "";
                    aVar.f47493d = 0L;
                    aVar.f47494e = 0L;
                    aVar.f47495f = 0L;
                    aVar.f47496g = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag != -1) {
                            switch (nextTag) {
                                case 1:
                                    aVar.f47490a = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    aVar.f47491b = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 3:
                                    aVar.f47492c = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 4:
                                    aVar.f47493d = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 5:
                                    aVar.f47494e = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 6:
                                    aVar.f47495f = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 7:
                                    aVar.f47496g = ProtoAdapter.STRING.decode(protoReader);
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
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, payload.node_token);
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, payload.file_type);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, payload.data);
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, payload.event_type);
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, payload.event_time);
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, payload.version);
                    if (payload.extra != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, payload.extra);
                    }
                    protoWriter.writeBytes(payload.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C19299a newBuilder() {
                C19299a aVar = new C19299a();
                aVar.f47490a = this.node_token;
                aVar.f47491b = this.file_type;
                aVar.f47492c = this.data;
                aVar.f47493d = this.event_type;
                aVar.f47494e = this.event_time;
                aVar.f47495f = this.version;
                aVar.f47496g = this.extra;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            /* renamed from: com.bytedance.lark.pb.space.drive.v1.BroadcastPush$EventMessage$Payload$a */
            public static final class C19299a extends Message.Builder<Payload, C19299a> {

                /* renamed from: a */
                public String f47490a;

                /* renamed from: b */
                public Long f47491b;

                /* renamed from: c */
                public String f47492c;

                /* renamed from: d */
                public Long f47493d;

                /* renamed from: e */
                public Long f47494e;

                /* renamed from: f */
                public Long f47495f;

                /* renamed from: g */
                public String f47496g;

                /* renamed from: a */
                public Payload build() {
                    Long l;
                    String str;
                    Long l2;
                    Long l3;
                    Long l4;
                    String str2 = this.f47490a;
                    if (str2 != null && (l = this.f47491b) != null && (str = this.f47492c) != null && (l2 = this.f47493d) != null && (l3 = this.f47494e) != null && (l4 = this.f47495f) != null) {
                        return new Payload(str2, l, str, l2, l3, l4, this.f47496g, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str2, "node_token", this.f47491b, "file_type", this.f47492c, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f47493d, "event_type", this.f47494e, "event_time", this.f47495f, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
                }
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("space", "Payload");
                StringBuilder sb = new StringBuilder();
                sb.append(", node_token=");
                sb.append(this.node_token);
                sb.append(", file_type=");
                sb.append(this.file_type);
                sb.append(", data=");
                sb.append(this.data);
                sb.append(", event_type=");
                sb.append(this.event_type);
                sb.append(", event_time=");
                sb.append(this.event_time);
                sb.append(", version=");
                sb.append(this.version);
                if (this.extra != null) {
                    sb.append(", extra=");
                    sb.append(this.extra);
                }
                StringBuilder replace = sb.replace(0, 2, "Payload{");
                replace.append('}');
                return replace.toString();
            }

            public Payload(String str, Long l, String str2, Long l2, Long l3, Long l4, String str3) {
                this(str, l, str2, l2, l3, l4, str3, ByteString.EMPTY);
            }

            public Payload(String str, Long l, String str2, Long l2, Long l3, Long l4, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                this.node_token = str;
                this.file_type = l;
                this.data = str2;
                this.event_type = l2;
                this.event_time = l3;
                this.version = l4;
                this.extra = str3;
            }
        }

        /* renamed from: com.bytedance.lark.pb.space.drive.v1.BroadcastPush$EventMessage$b */
        private static final class C19302b extends ProtoAdapter<EventMessage> {
            C19302b() {
                super(FieldEncoding.LENGTH_DELIMITED, EventMessage.class);
            }

            /* renamed from: a */
            public int encodedSize(EventMessage eventMessage) {
                return PushType.ADAPTER.encodedSizeWithTag(1, eventMessage.push_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, eventMessage.subsc_sign) + PushStatus.ADAPTER.encodedSizeWithTag(3, eventMessage.push_status) + Payload.ADAPTER.asRepeated().encodedSizeWithTag(4, eventMessage.payloads) + eventMessage.unknownFields().size();
            }

            /* renamed from: a */
            public EventMessage decode(ProtoReader protoReader) throws IOException {
                C19301a aVar = new C19301a();
                aVar.f47497a = PushType.RECENT_LIST;
                aVar.f47498b = "";
                aVar.f47499c = PushStatus.NORMAL;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f47497a = PushType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f47498b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        try {
                            aVar.f47499c = PushStatus.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                        }
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f47500d.add(Payload.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, EventMessage eventMessage) throws IOException {
                PushType.ADAPTER.encodeWithTag(protoWriter, 1, eventMessage.push_type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, eventMessage.subsc_sign);
                PushStatus.ADAPTER.encodeWithTag(protoWriter, 3, eventMessage.push_status);
                Payload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, eventMessage.payloads);
                protoWriter.writeBytes(eventMessage.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.space.drive.v1.BroadcastPush$EventMessage$a */
        public static final class C19301a extends Message.Builder<EventMessage, C19301a> {

            /* renamed from: a */
            public PushType f47497a;

            /* renamed from: b */
            public String f47498b;

            /* renamed from: c */
            public PushStatus f47499c;

            /* renamed from: d */
            public List<Payload> f47500d = Internal.newMutableList();

            /* renamed from: a */
            public EventMessage build() {
                String str;
                PushStatus pushStatus;
                PushType pushType = this.f47497a;
                if (pushType != null && (str = this.f47498b) != null && (pushStatus = this.f47499c) != null) {
                    return new EventMessage(pushType, str, pushStatus, this.f47500d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(pushType, "push_type", this.f47498b, "subsc_sign", this.f47499c, "push_status");
            }
        }

        @Override // com.squareup.wire.Message
        public C19301a newBuilder() {
            C19301a aVar = new C19301a();
            aVar.f47497a = this.push_type;
            aVar.f47498b = this.subsc_sign;
            aVar.f47499c = this.push_status;
            aVar.f47500d = Internal.copyOf("payloads", this.payloads);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("space", "EventMessage");
            StringBuilder sb = new StringBuilder();
            sb.append(", push_type=");
            sb.append(this.push_type);
            sb.append(", subsc_sign=");
            sb.append(this.subsc_sign);
            sb.append(", push_status=");
            sb.append(this.push_status);
            if (!this.payloads.isEmpty()) {
                sb.append(", payloads=");
                sb.append(this.payloads);
            }
            StringBuilder replace = sb.replace(0, 2, "EventMessage{");
            replace.append('}');
            return replace.toString();
        }

        public EventMessage(PushType pushType, String str, PushStatus pushStatus, List<Payload> list) {
            this(pushType, str, pushStatus, list, ByteString.EMPTY);
        }

        public EventMessage(PushType pushType, String str, PushStatus pushStatus, List<Payload> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.push_type = pushType;
            this.subsc_sign = str;
            this.push_status = pushStatus;
            this.payloads = Internal.immutableCopyOf("payloads", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.BroadcastPush$b */
    private static final class C19304b extends ProtoAdapter<BroadcastPush> {
        C19304b() {
            super(FieldEncoding.LENGTH_DELIMITED, BroadcastPush.class);
        }

        /* renamed from: a */
        public int encodedSize(BroadcastPush broadcastPush) {
            return EventMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, broadcastPush.event_message) + broadcastPush.unknownFields().size();
        }

        /* renamed from: a */
        public BroadcastPush decode(ProtoReader protoReader) throws IOException {
            C19303a aVar = new C19303a();
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
                    aVar.f47501a.add(EventMessage.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BroadcastPush broadcastPush) throws IOException {
            EventMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, broadcastPush.event_message);
            protoWriter.writeBytes(broadcastPush.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.BroadcastPush$a */
    public static final class C19303a extends Message.Builder<BroadcastPush, C19303a> {

        /* renamed from: a */
        public List<EventMessage> f47501a = Internal.newMutableList();

        /* renamed from: a */
        public BroadcastPush build() {
            return new BroadcastPush(this.f47501a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19303a newBuilder() {
        C19303a aVar = new C19303a();
        aVar.f47501a = Internal.copyOf("event_message", this.event_message);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "BroadcastPush");
        StringBuilder sb = new StringBuilder();
        if (!this.event_message.isEmpty()) {
            sb.append(", event_message=");
            sb.append(this.event_message);
        }
        StringBuilder replace = sb.replace(0, 2, "BroadcastPush{");
        replace.append('}');
        return replace.toString();
    }

    public BroadcastPush(List<EventMessage> list) {
        this(list, ByteString.EMPTY);
    }

    public BroadcastPush(List<EventMessage> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_message = Internal.immutableCopyOf("event_message", list);
    }
}
