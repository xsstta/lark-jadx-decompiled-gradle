package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CalendarEventReminder extends Message<CalendarEventReminder, C15538a> {
    public static final ProtoAdapter<CalendarEventReminder> ADAPTER = new C15539b();
    public static final Method DEFAULT_METHOD = Method.DEFAULT;
    public static final Integer DEFAULT_MINUTES = 0;
    private static final long serialVersionUID = 0;
    public final String calendar_event_id;
    public final Method method;
    public final Integer minutes;

    public enum Method implements WireEnum {
        DEFAULT(1),
        EMAIL(2),
        POPUP(3),
        SMS(4);
        
        public static final ProtoAdapter<Method> ADAPTER = ProtoAdapter.newEnumAdapter(Method.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Method fromValue(int i) {
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i == 3) {
                return POPUP;
            }
            if (i != 4) {
                return null;
            }
            return SMS;
        }

        private Method(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventReminder$b */
    private static final class C15539b extends ProtoAdapter<CalendarEventReminder> {
        C15539b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventReminder.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventReminder calendarEventReminder) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, calendarEventReminder.calendar_event_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, calendarEventReminder.minutes) + Method.ADAPTER.encodedSizeWithTag(3, calendarEventReminder.method) + calendarEventReminder.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventReminder decode(ProtoReader protoReader) throws IOException {
            C15538a aVar = new C15538a();
            aVar.f41197a = "";
            aVar.f41198b = 0;
            aVar.f41199c = Method.DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41197a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41198b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f41199c = Method.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarEventReminder calendarEventReminder) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarEventReminder.calendar_event_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, calendarEventReminder.minutes);
            Method.ADAPTER.encodeWithTag(protoWriter, 3, calendarEventReminder.method);
            protoWriter.writeBytes(calendarEventReminder.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15538a newBuilder() {
        C15538a aVar = new C15538a();
        aVar.f41197a = this.calendar_event_id;
        aVar.f41198b = this.minutes;
        aVar.f41199c = this.method;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventReminder$a */
    public static final class C15538a extends Message.Builder<CalendarEventReminder, C15538a> {

        /* renamed from: a */
        public String f41197a;

        /* renamed from: b */
        public Integer f41198b;

        /* renamed from: c */
        public Method f41199c;

        /* renamed from: a */
        public CalendarEventReminder build() {
            Integer num;
            Method method;
            String str = this.f41197a;
            if (str != null && (num = this.f41198b) != null && (method = this.f41199c) != null) {
                return new CalendarEventReminder(str, num, method, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "calendar_event_id", this.f41198b, "minutes", this.f41199c, "method");
        }

        /* renamed from: a */
        public C15538a mo56362a(Method method) {
            this.f41199c = method;
            return this;
        }

        /* renamed from: a */
        public C15538a mo56363a(Integer num) {
            this.f41198b = num;
            return this;
        }

        /* renamed from: a */
        public C15538a mo56364a(String str) {
            this.f41197a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEventReminder");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_event_id=");
        sb.append(this.calendar_event_id);
        sb.append(", minutes=");
        sb.append(this.minutes);
        sb.append(", method=");
        sb.append(this.method);
        StringBuilder replace = sb.replace(0, 2, "CalendarEventReminder{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventReminder(String str, Integer num, Method method2) {
        this(str, num, method2, ByteString.EMPTY);
    }

    public CalendarEventReminder(String str, Integer num, Method method2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_event_id = str;
        this.minutes = num;
        this.method = method2;
    }
}
