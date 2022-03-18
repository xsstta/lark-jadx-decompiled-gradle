package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CalendarEventUniqueField extends Message<CalendarEventUniqueField, C15540a> {
    public static final ProtoAdapter<CalendarEventUniqueField> ADAPTER = new C15541b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventUniqueField$b */
    private static final class C15541b extends ProtoAdapter<CalendarEventUniqueField> {
        C15541b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventUniqueField.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventUniqueField calendarEventUniqueField) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, calendarEventUniqueField.calendar_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, calendarEventUniqueField.key) + ProtoAdapter.INT64.encodedSizeWithTag(3, calendarEventUniqueField.original_time) + calendarEventUniqueField.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventUniqueField decode(ProtoReader protoReader) throws IOException {
            C15540a aVar = new C15540a();
            aVar.f41200a = "";
            aVar.f41201b = "";
            aVar.f41202c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41200a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41201b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41202c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarEventUniqueField calendarEventUniqueField) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarEventUniqueField.calendar_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarEventUniqueField.key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, calendarEventUniqueField.original_time);
            protoWriter.writeBytes(calendarEventUniqueField.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15540a newBuilder() {
        C15540a aVar = new C15540a();
        aVar.f41200a = this.calendar_id;
        aVar.f41201b = this.key;
        aVar.f41202c = this.original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarEventUniqueField$a */
    public static final class C15540a extends Message.Builder<CalendarEventUniqueField, C15540a> {

        /* renamed from: a */
        public String f41200a;

        /* renamed from: b */
        public String f41201b;

        /* renamed from: c */
        public Long f41202c;

        /* renamed from: a */
        public CalendarEventUniqueField build() {
            String str;
            Long l;
            String str2 = this.f41200a;
            if (str2 != null && (str = this.f41201b) != null && (l = this.f41202c) != null) {
                return new CalendarEventUniqueField(str2, str, l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "calendar_id", this.f41201b, "key", this.f41202c, "original_time");
        }

        /* renamed from: a */
        public C15540a mo56369a(Long l) {
            this.f41202c = l;
            return this;
        }

        /* renamed from: b */
        public C15540a mo56372b(String str) {
            this.f41201b = str;
            return this;
        }

        /* renamed from: a */
        public C15540a mo56370a(String str) {
            this.f41200a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarEventUniqueField");
        StringBuilder sb = new StringBuilder();
        sb.append(", calendar_id=");
        sb.append(this.calendar_id);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", original_time=");
        sb.append(this.original_time);
        StringBuilder replace = sb.replace(0, 2, "CalendarEventUniqueField{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventUniqueField(String str, String str2, Long l) {
        this(str, str2, l, ByteString.EMPTY);
    }

    public CalendarEventUniqueField(String str, String str2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
    }
}
