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

public final class SaveThirdPartyCalendarSettingsRequest extends Message<SaveThirdPartyCalendarSettingsRequest, C15994a> {
    public static final ProtoAdapter<SaveThirdPartyCalendarSettingsRequest> ADAPTER = new C15995b();
    private static final long serialVersionUID = 0;
    public final List<ThirdPartyCalendarSetting> third_party_calendar_settings;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveThirdPartyCalendarSettingsRequest$b */
    private static final class C15995b extends ProtoAdapter<SaveThirdPartyCalendarSettingsRequest> {
        C15995b() {
            super(FieldEncoding.LENGTH_DELIMITED, SaveThirdPartyCalendarSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SaveThirdPartyCalendarSettingsRequest saveThirdPartyCalendarSettingsRequest) {
            return ThirdPartyCalendarSetting.ADAPTER.asRepeated().encodedSizeWithTag(1, saveThirdPartyCalendarSettingsRequest.third_party_calendar_settings) + saveThirdPartyCalendarSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SaveThirdPartyCalendarSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C15994a aVar = new C15994a();
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
                    aVar.f42015a.add(ThirdPartyCalendarSetting.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SaveThirdPartyCalendarSettingsRequest saveThirdPartyCalendarSettingsRequest) throws IOException {
            ThirdPartyCalendarSetting.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, saveThirdPartyCalendarSettingsRequest.third_party_calendar_settings);
            protoWriter.writeBytes(saveThirdPartyCalendarSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SaveThirdPartyCalendarSettingsRequest$a */
    public static final class C15994a extends Message.Builder<SaveThirdPartyCalendarSettingsRequest, C15994a> {

        /* renamed from: a */
        public List<ThirdPartyCalendarSetting> f42015a = Internal.newMutableList();

        /* renamed from: a */
        public SaveThirdPartyCalendarSettingsRequest build() {
            return new SaveThirdPartyCalendarSettingsRequest(this.f42015a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15994a newBuilder() {
        C15994a aVar = new C15994a();
        aVar.f42015a = Internal.copyOf("third_party_calendar_settings", this.third_party_calendar_settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SaveThirdPartyCalendarSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.third_party_calendar_settings.isEmpty()) {
            sb.append(", third_party_calendar_settings=");
            sb.append(this.third_party_calendar_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "SaveThirdPartyCalendarSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SaveThirdPartyCalendarSettingsRequest(List<ThirdPartyCalendarSetting> list) {
        this(list, ByteString.EMPTY);
    }

    public SaveThirdPartyCalendarSettingsRequest(List<ThirdPartyCalendarSetting> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.third_party_calendar_settings = Internal.immutableCopyOf("third_party_calendar_settings", list);
    }
}
