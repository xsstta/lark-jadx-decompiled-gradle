package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetThirdPartyCalendarSettingsResponse extends Message<GetThirdPartyCalendarSettingsResponse, C15790a> {
    public static final ProtoAdapter<GetThirdPartyCalendarSettingsResponse> ADAPTER = new C15791b();
    private static final long serialVersionUID = 0;
    public final List<ThirdPartyCalendarSetting> third_party_calendar_settings;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetThirdPartyCalendarSettingsResponse$b */
    private static final class C15791b extends ProtoAdapter<GetThirdPartyCalendarSettingsResponse> {
        C15791b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetThirdPartyCalendarSettingsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetThirdPartyCalendarSettingsResponse getThirdPartyCalendarSettingsResponse) {
            return ThirdPartyCalendarSetting.ADAPTER.asRepeated().encodedSizeWithTag(1, getThirdPartyCalendarSettingsResponse.third_party_calendar_settings) + getThirdPartyCalendarSettingsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetThirdPartyCalendarSettingsResponse decode(ProtoReader protoReader) throws IOException {
            C15790a aVar = new C15790a();
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
                    aVar.f41566a.add(ThirdPartyCalendarSetting.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetThirdPartyCalendarSettingsResponse getThirdPartyCalendarSettingsResponse) throws IOException {
            ThirdPartyCalendarSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getThirdPartyCalendarSettingsResponse.third_party_calendar_settings);
            protoWriter.writeBytes(getThirdPartyCalendarSettingsResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetThirdPartyCalendarSettingsResponse$a */
    public static final class C15790a extends Message.Builder<GetThirdPartyCalendarSettingsResponse, C15790a> {

        /* renamed from: a */
        public List<ThirdPartyCalendarSetting> f41566a = Internal.newMutableList();

        /* renamed from: a */
        public GetThirdPartyCalendarSettingsResponse build() {
            return new GetThirdPartyCalendarSettingsResponse(this.f41566a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15790a newBuilder() {
        C15790a aVar = new C15790a();
        aVar.f41566a = Internal.copyOf("third_party_calendar_settings", this.third_party_calendar_settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetThirdPartyCalendarSettingsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.third_party_calendar_settings.isEmpty()) {
            sb.append(", third_party_calendar_settings=");
            sb.append(this.third_party_calendar_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "GetThirdPartyCalendarSettingsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetThirdPartyCalendarSettingsResponse(List<ThirdPartyCalendarSetting> list) {
        this(list, ByteString.EMPTY);
    }

    public GetThirdPartyCalendarSettingsResponse(List<ThirdPartyCalendarSetting> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.third_party_calendar_settings = Internal.immutableCopyOf("third_party_calendar_settings", list);
    }
}
