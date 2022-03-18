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

public final class UpgradeToMeetingResponse extends Message<UpgradeToMeetingResponse, C16106a> {
    public static final ProtoAdapter<UpgradeToMeetingResponse> ADAPTER = new C16107b();
    public static final Boolean DEFAULT_SUCCESS = false;
    private static final long serialVersionUID = 0;
    public final CalendarEvent calendar_event;
    public final Meeting meeting;
    public final Boolean success;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpgradeToMeetingResponse$b */
    private static final class C16107b extends ProtoAdapter<UpgradeToMeetingResponse> {
        C16107b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpgradeToMeetingResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UpgradeToMeetingResponse upgradeToMeetingResponse) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, upgradeToMeetingResponse.success);
            int i2 = 0;
            if (upgradeToMeetingResponse.meeting != null) {
                i = Meeting.ADAPTER.encodedSizeWithTag(2, upgradeToMeetingResponse.meeting);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (upgradeToMeetingResponse.calendar_event != null) {
                i2 = CalendarEvent.ADAPTER.encodedSizeWithTag(3, upgradeToMeetingResponse.calendar_event);
            }
            return i3 + i2 + upgradeToMeetingResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UpgradeToMeetingResponse decode(ProtoReader protoReader) throws IOException {
            C16106a aVar = new C16106a();
            aVar.f42193a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42193a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42194b = Meeting.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42195c = CalendarEvent.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpgradeToMeetingResponse upgradeToMeetingResponse) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, upgradeToMeetingResponse.success);
            if (upgradeToMeetingResponse.meeting != null) {
                Meeting.ADAPTER.encodeWithTag(protoWriter, 2, upgradeToMeetingResponse.meeting);
            }
            if (upgradeToMeetingResponse.calendar_event != null) {
                CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 3, upgradeToMeetingResponse.calendar_event);
            }
            protoWriter.writeBytes(upgradeToMeetingResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16106a newBuilder() {
        C16106a aVar = new C16106a();
        aVar.f42193a = this.success;
        aVar.f42194b = this.meeting;
        aVar.f42195c = this.calendar_event;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.UpgradeToMeetingResponse$a */
    public static final class C16106a extends Message.Builder<UpgradeToMeetingResponse, C16106a> {

        /* renamed from: a */
        public Boolean f42193a;

        /* renamed from: b */
        public Meeting f42194b;

        /* renamed from: c */
        public CalendarEvent f42195c;

        /* renamed from: a */
        public UpgradeToMeetingResponse build() {
            Boolean bool = this.f42193a;
            if (bool != null) {
                return new UpgradeToMeetingResponse(bool, this.f42194b, this.f42195c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "success");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "UpgradeToMeetingResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", success=");
        sb.append(this.success);
        if (this.meeting != null) {
            sb.append(", meeting=");
            sb.append(this.meeting);
        }
        if (this.calendar_event != null) {
            sb.append(", calendar_event=");
            sb.append(this.calendar_event);
        }
        StringBuilder replace = sb.replace(0, 2, "UpgradeToMeetingResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UpgradeToMeetingResponse(Boolean bool, Meeting meeting2, CalendarEvent calendarEvent) {
        this(bool, meeting2, calendarEvent, ByteString.EMPTY);
    }

    public UpgradeToMeetingResponse(Boolean bool, Meeting meeting2, CalendarEvent calendarEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success = bool;
        this.meeting = meeting2;
        this.calendar_event = calendarEvent;
    }
}
