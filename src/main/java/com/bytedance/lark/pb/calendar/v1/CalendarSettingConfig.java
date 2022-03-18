package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class CalendarSettingConfig extends Message<CalendarSettingConfig, C15566a> {
    public static final ProtoAdapter<CalendarSettingConfig> ADAPTER = new C15567b();
    private static final long serialVersionUID = 0;
    public final Map<String, AlternateCalendar> lang_alternate_calendar_map;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSettingConfig$a */
    public static final class C15566a extends Message.Builder<CalendarSettingConfig, C15566a> {

        /* renamed from: a */
        public Map<String, AlternateCalendar> f41298a = Internal.newMutableMap();

        /* renamed from: a */
        public CalendarSettingConfig build() {
            return new CalendarSettingConfig(this.f41298a, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSettingConfig$b */
    private static final class C15567b extends ProtoAdapter<CalendarSettingConfig> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, AlternateCalendar>> f41299a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, AlternateCalendar.ADAPTER);

        C15567b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarSettingConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarSettingConfig calendarSettingConfig) {
            return this.f41299a.encodedSizeWithTag(1, calendarSettingConfig.lang_alternate_calendar_map) + calendarSettingConfig.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarSettingConfig decode(ProtoReader protoReader) throws IOException {
            C15566a aVar = new C15566a();
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
                    aVar.f41298a.putAll(this.f41299a.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarSettingConfig calendarSettingConfig) throws IOException {
            this.f41299a.encodeWithTag(protoWriter, 1, calendarSettingConfig.lang_alternate_calendar_map);
            protoWriter.writeBytes(calendarSettingConfig.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15566a newBuilder() {
        C15566a aVar = new C15566a();
        aVar.f41298a = Internal.copyOf("lang_alternate_calendar_map", this.lang_alternate_calendar_map);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarSettingConfig");
        StringBuilder sb = new StringBuilder();
        if (!this.lang_alternate_calendar_map.isEmpty()) {
            sb.append(", lang_alternate_calendar_map=");
            sb.append(this.lang_alternate_calendar_map);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarSettingConfig{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarSettingConfig(Map<String, AlternateCalendar> map) {
        this(map, ByteString.EMPTY);
    }

    public CalendarSettingConfig(Map<String, AlternateCalendar> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.lang_alternate_calendar_map = Internal.immutableCopyOf("lang_alternate_calendar_map", map);
    }
}
