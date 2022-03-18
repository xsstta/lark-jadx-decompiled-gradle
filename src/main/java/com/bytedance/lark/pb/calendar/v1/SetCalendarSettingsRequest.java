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

public final class SetCalendarSettingsRequest extends Message<SetCalendarSettingsRequest, C16040a> {
    public static final ProtoAdapter<SetCalendarSettingsRequest> ADAPTER = new C16041b();
    public static final Boolean DEFAULT_EDIT_OTHER_TIMEZONES = false;
    private static final long serialVersionUID = 0;
    public final Boolean edit_other_timezones;
    public final CalendarSetting settings;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetCalendarSettingsRequest$b */
    private static final class C16041b extends ProtoAdapter<SetCalendarSettingsRequest> {
        C16041b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCalendarSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCalendarSettingsRequest setCalendarSettingsRequest) {
            int i;
            int encodedSizeWithTag = CalendarSetting.ADAPTER.encodedSizeWithTag(1, setCalendarSettingsRequest.settings);
            if (setCalendarSettingsRequest.edit_other_timezones != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, setCalendarSettingsRequest.edit_other_timezones);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setCalendarSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetCalendarSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C16040a aVar = new C16040a();
            aVar.f42116b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42115a = CalendarSetting.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42116b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetCalendarSettingsRequest setCalendarSettingsRequest) throws IOException {
            CalendarSetting.ADAPTER.encodeWithTag(protoWriter, 1, setCalendarSettingsRequest.settings);
            if (setCalendarSettingsRequest.edit_other_timezones != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setCalendarSettingsRequest.edit_other_timezones);
            }
            protoWriter.writeBytes(setCalendarSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SetCalendarSettingsRequest$a */
    public static final class C16040a extends Message.Builder<SetCalendarSettingsRequest, C16040a> {

        /* renamed from: a */
        public CalendarSetting f42115a;

        /* renamed from: b */
        public Boolean f42116b;

        /* renamed from: a */
        public SetCalendarSettingsRequest build() {
            CalendarSetting calendarSetting = this.f42115a;
            if (calendarSetting != null) {
                return new SetCalendarSettingsRequest(calendarSetting, this.f42116b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(calendarSetting, "settings");
        }

        /* renamed from: a */
        public C16040a mo57690a(CalendarSetting calendarSetting) {
            this.f42115a = calendarSetting;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16040a newBuilder() {
        C16040a aVar = new C16040a();
        aVar.f42115a = this.settings;
        aVar.f42116b = this.edit_other_timezones;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SetCalendarSettingsRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", settings=");
        sb.append(this.settings);
        if (this.edit_other_timezones != null) {
            sb.append(", edit_other_timezones=");
            sb.append(this.edit_other_timezones);
        }
        StringBuilder replace = sb.replace(0, 2, "SetCalendarSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetCalendarSettingsRequest(CalendarSetting calendarSetting, Boolean bool) {
        this(calendarSetting, bool, ByteString.EMPTY);
    }

    public SetCalendarSettingsRequest(CalendarSetting calendarSetting, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.settings = calendarSetting;
        this.edit_other_timezones = bool;
    }
}
