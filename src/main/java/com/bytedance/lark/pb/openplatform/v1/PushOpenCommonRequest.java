package com.bytedance.lark.pb.openplatform.v1;

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

public final class PushOpenCommonRequest extends Message<PushOpenCommonRequest, C18697a> {
    public static final ProtoAdapter<PushOpenCommonRequest> ADAPTER = new C18698b();
    private static final long serialVersionUID = 0;
    public final List<OpenEvent> events;

    public enum EventType implements WireEnum {
        UNKNOWN(0),
        USER_UPLOAD_SETTING_UPDATED(1);
        
        public static final ProtoAdapter<EventType> ADAPTER = ProtoAdapter.newEnumAdapter(EventType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static EventType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return USER_UPLOAD_SETTING_UPDATED;
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    public static final class OpenEvent extends Message<OpenEvent, C18695a> {
        public static final ProtoAdapter<OpenEvent> ADAPTER = new C18696b();
        public static final Long DEFAULT_APP_ID = 0L;
        public static final EventType DEFAULT_EVENT_TYPE = EventType.UNKNOWN;
        public static final Long DEFAULT_PUSH_TIME = 0L;
        private static final long serialVersionUID = 0;
        public final Long app_id;
        public final EventType event_type;
        public final String payload;
        public final Long push_time;

        /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest$OpenEvent$b */
        private static final class C18696b extends ProtoAdapter<OpenEvent> {
            C18696b() {
                super(FieldEncoding.LENGTH_DELIMITED, OpenEvent.class);
            }

            /* renamed from: a */
            public int encodedSize(OpenEvent openEvent) {
                int i;
                int encodedSizeWithTag = EventType.ADAPTER.encodedSizeWithTag(1, openEvent.event_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, openEvent.push_time);
                int i2 = 0;
                if (openEvent.app_id != null) {
                    i = ProtoAdapter.INT64.encodedSizeWithTag(3, openEvent.app_id);
                } else {
                    i = 0;
                }
                int i3 = encodedSizeWithTag + i;
                if (openEvent.payload != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, openEvent.payload);
                }
                return i3 + i2 + openEvent.unknownFields().size();
            }

            /* renamed from: a */
            public OpenEvent decode(ProtoReader protoReader) throws IOException {
                C18695a aVar = new C18695a();
                aVar.f46236a = EventType.UNKNOWN;
                aVar.f46237b = 0L;
                aVar.f46238c = 0L;
                aVar.f46239d = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f46236a = EventType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f46237b = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f46238c = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46239d = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, OpenEvent openEvent) throws IOException {
                EventType.ADAPTER.encodeWithTag(protoWriter, 1, openEvent.event_type);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, openEvent.push_time);
                if (openEvent.app_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, openEvent.app_id);
                }
                if (openEvent.payload != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, openEvent.payload);
                }
                protoWriter.writeBytes(openEvent.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18695a newBuilder() {
            C18695a aVar = new C18695a();
            aVar.f46236a = this.event_type;
            aVar.f46237b = this.push_time;
            aVar.f46238c = this.app_id;
            aVar.f46239d = this.payload;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest$OpenEvent$a */
        public static final class C18695a extends Message.Builder<OpenEvent, C18695a> {

            /* renamed from: a */
            public EventType f46236a;

            /* renamed from: b */
            public Long f46237b;

            /* renamed from: c */
            public Long f46238c;

            /* renamed from: d */
            public String f46239d;

            /* renamed from: a */
            public OpenEvent build() {
                Long l;
                EventType eventType = this.f46236a;
                if (eventType != null && (l = this.f46237b) != null) {
                    return new OpenEvent(eventType, l, this.f46238c, this.f46239d, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(eventType, "event_type", this.f46237b, "push_time");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("openplatform", "OpenEvent");
            StringBuilder sb = new StringBuilder();
            sb.append(", event_type=");
            sb.append(this.event_type);
            sb.append(", push_time=");
            sb.append(this.push_time);
            if (this.app_id != null) {
                sb.append(", app_id=");
                sb.append(this.app_id);
            }
            if (this.payload != null) {
                sb.append(", payload=");
                sb.append(this.payload);
            }
            StringBuilder replace = sb.replace(0, 2, "OpenEvent{");
            replace.append('}');
            return replace.toString();
        }

        public OpenEvent(EventType eventType, Long l, Long l2, String str) {
            this(eventType, l, l2, str, ByteString.EMPTY);
        }

        public OpenEvent(EventType eventType, Long l, Long l2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.event_type = eventType;
            this.push_time = l;
            this.app_id = l2;
            this.payload = str;
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest$b */
    private static final class C18698b extends ProtoAdapter<PushOpenCommonRequest> {
        C18698b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushOpenCommonRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushOpenCommonRequest pushOpenCommonRequest) {
            return OpenEvent.ADAPTER.asRepeated().encodedSizeWithTag(1, pushOpenCommonRequest.events) + pushOpenCommonRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushOpenCommonRequest decode(ProtoReader protoReader) throws IOException {
            C18697a aVar = new C18697a();
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
                    aVar.f46240a.add(OpenEvent.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushOpenCommonRequest pushOpenCommonRequest) throws IOException {
            OpenEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pushOpenCommonRequest.events);
            protoWriter.writeBytes(pushOpenCommonRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest$a */
    public static final class C18697a extends Message.Builder<PushOpenCommonRequest, C18697a> {

        /* renamed from: a */
        public List<OpenEvent> f46240a = Internal.newMutableList();

        /* renamed from: a */
        public PushOpenCommonRequest build() {
            return new PushOpenCommonRequest(this.f46240a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18697a newBuilder() {
        C18697a aVar = new C18697a();
        aVar.f46240a = Internal.copyOf("events", this.events);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PushOpenCommonRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.events.isEmpty()) {
            sb.append(", events=");
            sb.append(this.events);
        }
        StringBuilder replace = sb.replace(0, 2, "PushOpenCommonRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushOpenCommonRequest(List<OpenEvent> list) {
        this(list, ByteString.EMPTY);
    }

    public PushOpenCommonRequest(List<OpenEvent> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.events = Internal.immutableCopyOf("events", list);
    }
}
