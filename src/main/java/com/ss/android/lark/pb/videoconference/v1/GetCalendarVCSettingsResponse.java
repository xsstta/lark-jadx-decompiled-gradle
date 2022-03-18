package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarVCSettingsResponse extends Message<GetCalendarVCSettingsResponse, C50633a> {
    public static final ProtoAdapter<GetCalendarVCSettingsResponse> ADAPTER = new C50634b();
    private static final long serialVersionUID = 0;
    public final CalendarVCSettings settings;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarVCSettingsResponse$b */
    private static final class C50634b extends ProtoAdapter<GetCalendarVCSettingsResponse> {
        C50634b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarVCSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarVCSettingsResponse getCalendarVCSettingsResponse) {
            int i;
            if (getCalendarVCSettingsResponse.settings != null) {
                i = CalendarVCSettings.ADAPTER.encodedSizeWithTag(1, getCalendarVCSettingsResponse.settings);
            } else {
                i = 0;
            }
            return i + getCalendarVCSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarVCSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C50633a aVar = new C50633a();
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
                    aVar.f126372a = CalendarVCSettings.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarVCSettingsResponse getCalendarVCSettingsResponse) throws IOException {
            if (getCalendarVCSettingsResponse.settings != null) {
                CalendarVCSettings.ADAPTER.encodeWithTag(protoWriter, 1, getCalendarVCSettingsResponse.settings);
            }
            protoWriter.writeBytes(getCalendarVCSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarVCSettingsResponse$a */
    public static final class C50633a extends Message.Builder<GetCalendarVCSettingsResponse, C50633a> {

        /* renamed from: a */
        public CalendarVCSettings f126372a;

        /* renamed from: a */
        public GetCalendarVCSettingsResponse build() {
            return new GetCalendarVCSettingsResponse(this.f126372a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50633a newBuilder() {
        C50633a aVar = new C50633a();
        aVar.f126372a = this.settings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarVCSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarVCSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarVCSettingsResponse(CalendarVCSettings calendarVCSettings) {
        this(calendarVCSettings, ByteString.EMPTY);
    }

    public GetCalendarVCSettingsResponse(CalendarVCSettings calendarVCSettings, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = calendarVCSettings;
    }
}
