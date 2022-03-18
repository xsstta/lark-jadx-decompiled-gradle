package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SetCalendarVCSettingsRequest extends Message<SetCalendarVCSettingsRequest, C51016a> {
    public static final ProtoAdapter<SetCalendarVCSettingsRequest> ADAPTER = new C51017b();
    private static final long serialVersionUID = 0;
    public final String meeting_number;
    public final CalendarVCSettings settings;
    public final String unique_id;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetCalendarVCSettingsRequest$b */
    private static final class C51017b extends ProtoAdapter<SetCalendarVCSettingsRequest> {
        C51017b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetCalendarVCSettingsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetCalendarVCSettingsRequest setCalendarVCSettingsRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (setCalendarVCSettingsRequest.unique_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, setCalendarVCSettingsRequest.unique_id);
            } else {
                i = 0;
            }
            if (setCalendarVCSettingsRequest.settings != null) {
                i2 = CalendarVCSettings.ADAPTER.encodedSizeWithTag(2, setCalendarVCSettingsRequest.settings);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (setCalendarVCSettingsRequest.meeting_number != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, setCalendarVCSettingsRequest.meeting_number);
            }
            return i4 + i3 + setCalendarVCSettingsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetCalendarVCSettingsRequest decode(ProtoReader protoReader) throws IOException {
            C51016a aVar = new C51016a();
            aVar.f127078a = "";
            aVar.f127080c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127078a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127079b = CalendarVCSettings.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127080c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetCalendarVCSettingsRequest setCalendarVCSettingsRequest) throws IOException {
            if (setCalendarVCSettingsRequest.unique_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setCalendarVCSettingsRequest.unique_id);
            }
            if (setCalendarVCSettingsRequest.settings != null) {
                CalendarVCSettings.ADAPTER.encodeWithTag(protoWriter, 2, setCalendarVCSettingsRequest.settings);
            }
            if (setCalendarVCSettingsRequest.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, setCalendarVCSettingsRequest.meeting_number);
            }
            protoWriter.writeBytes(setCalendarVCSettingsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetCalendarVCSettingsRequest$a */
    public static final class C51016a extends Message.Builder<SetCalendarVCSettingsRequest, C51016a> {

        /* renamed from: a */
        public String f127078a;

        /* renamed from: b */
        public CalendarVCSettings f127079b;

        /* renamed from: c */
        public String f127080c;

        /* renamed from: a */
        public SetCalendarVCSettingsRequest build() {
            return new SetCalendarVCSettingsRequest(this.f127078a, this.f127079b, this.f127080c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51016a newBuilder() {
        C51016a aVar = new C51016a();
        aVar.f127078a = this.unique_id;
        aVar.f127079b = this.settings;
        aVar.f127080c = this.meeting_number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SetCalendarVCSettingsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.unique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.unique_id);
        }
        if (this.settings != null) {
            sb.append(", settings=");
            sb.append(this.settings);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        StringBuilder replace = sb.replace(0, 2, "SetCalendarVCSettingsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetCalendarVCSettingsRequest(String str, CalendarVCSettings calendarVCSettings, String str2) {
        this(str, calendarVCSettings, str2, ByteString.EMPTY);
    }

    public SetCalendarVCSettingsRequest(String str, CalendarVCSettings calendarVCSettings, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unique_id = str;
        this.settings = calendarVCSettings;
        this.meeting_number = str2;
    }
}
