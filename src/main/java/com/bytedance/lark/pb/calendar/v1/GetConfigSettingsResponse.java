package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CalendarConfigs;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetConfigSettingsResponse extends Message<GetConfigSettingsResponse, C15690a> {
    public static final ProtoAdapter<GetConfigSettingsResponse> ADAPTER = new C15691b();
    private static final long serialVersionUID = 0;
    public final CalendarConfigs calendar_configs;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetConfigSettingsResponse$b */
    private static final class C15691b extends ProtoAdapter<GetConfigSettingsResponse> {
        C15691b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetConfigSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetConfigSettingsResponse getConfigSettingsResponse) {
            int i;
            if (getConfigSettingsResponse.calendar_configs != null) {
                i = CalendarConfigs.ADAPTER.encodedSizeWithTag(1, getConfigSettingsResponse.calendar_configs);
            } else {
                i = 0;
            }
            return i + getConfigSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetConfigSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C15690a aVar = new C15690a();
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
                    aVar.f41449a = CalendarConfigs.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetConfigSettingsResponse getConfigSettingsResponse) throws IOException {
            if (getConfigSettingsResponse.calendar_configs != null) {
                CalendarConfigs.ADAPTER.encodeWithTag(protoWriter, 1, getConfigSettingsResponse.calendar_configs);
            }
            protoWriter.writeBytes(getConfigSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetConfigSettingsResponse$a */
    public static final class C15690a extends Message.Builder<GetConfigSettingsResponse, C15690a> {

        /* renamed from: a */
        public CalendarConfigs f41449a;

        /* renamed from: a */
        public GetConfigSettingsResponse build() {
            return new GetConfigSettingsResponse(this.f41449a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15690a newBuilder() {
        C15690a aVar = new C15690a();
        aVar.f41449a = this.calendar_configs;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetConfigSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_configs != null) {
            sb.append(", calendar_configs=");
            sb.append(this.calendar_configs);
        }
        StringBuilder replace = sb.replace(0, 2, "GetConfigSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetConfigSettingsResponse(CalendarConfigs calendarConfigs) {
        this(calendarConfigs, ByteString.EMPTY);
    }

    public GetConfigSettingsResponse(CalendarConfigs calendarConfigs, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_configs = calendarConfigs;
    }
}
