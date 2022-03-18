package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarSettingsResponse extends Message<GetCalendarSettingsResponse, C15670a> {
    public static final ProtoAdapter<GetCalendarSettingsResponse> ADAPTER = new C15671b();
    private static final long serialVersionUID = 0;
    public final CalendarSetting settings;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarSettingsResponse$b */
    private static final class C15671b extends ProtoAdapter<GetCalendarSettingsResponse> {
        C15671b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarSettingsResponse getCalendarSettingsResponse) {
            int i;
            if (getCalendarSettingsResponse.settings != null) {
                i = CalendarSetting.ADAPTER.encodedSizeWithTag(1, getCalendarSettingsResponse.settings);
            } else {
                i = 0;
            }
            return i + getCalendarSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C15670a aVar = new C15670a();
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
                    aVar.f41435a = CalendarSetting.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarSettingsResponse getCalendarSettingsResponse) throws IOException {
            if (getCalendarSettingsResponse.settings != null) {
                CalendarSetting.ADAPTER.encodeWithTag(protoWriter, 1, getCalendarSettingsResponse.settings);
            }
            protoWriter.writeBytes(getCalendarSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetCalendarSettingsResponse$a */
    public static final class C15670a extends Message.Builder<GetCalendarSettingsResponse, C15670a> {

        /* renamed from: a */
        public CalendarSetting f41435a;

        /* renamed from: a */
        public GetCalendarSettingsResponse build() {
            return new GetCalendarSettingsResponse(this.f41435a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15670a newBuilder() {
        C15670a aVar = new C15670a();
        aVar.f41435a = this.settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetCalendarSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarSettingsResponse(CalendarSetting calendarSetting) {
        this(calendarSetting, ByteString.EMPTY);
    }

    public GetCalendarSettingsResponse(CalendarSetting calendarSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = calendarSetting;
    }
}
