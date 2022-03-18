package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.VCEventAbbrInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpcomingEvent extends Message<UpcomingEvent, C51124a> {
    public static final ProtoAdapter<UpcomingEvent> ADAPTER = new C51125b();
    private static final long serialVersionUID = 0;
    public final VCEventAbbrInfo event_info;
    public final String id;
    public final VCMeetingAbbrInfo vc_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpcomingEvent$b */
    private static final class C51125b extends ProtoAdapter<UpcomingEvent> {
        C51125b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpcomingEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(UpcomingEvent upcomingEvent) {
            int i;
            int encodedSizeWithTag = VCEventAbbrInfo.ADAPTER.encodedSizeWithTag(1, upcomingEvent.event_info) + ProtoAdapter.STRING.encodedSizeWithTag(2, upcomingEvent.id);
            if (upcomingEvent.vc_info != null) {
                i = VCMeetingAbbrInfo.ADAPTER.encodedSizeWithTag(3, upcomingEvent.vc_info);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + upcomingEvent.unknownFields().size();
        }

        /* renamed from: a */
        public UpcomingEvent decode(ProtoReader protoReader) throws IOException {
            C51124a aVar = new C51124a();
            aVar.f127234b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127233a = VCEventAbbrInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127234b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127235c = VCMeetingAbbrInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpcomingEvent upcomingEvent) throws IOException {
            VCEventAbbrInfo.ADAPTER.encodeWithTag(protoWriter, 1, upcomingEvent.event_info);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, upcomingEvent.id);
            if (upcomingEvent.vc_info != null) {
                VCMeetingAbbrInfo.ADAPTER.encodeWithTag(protoWriter, 3, upcomingEvent.vc_info);
            }
            protoWriter.writeBytes(upcomingEvent.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51124a newBuilder() {
        C51124a aVar = new C51124a();
        aVar.f127233a = this.event_info;
        aVar.f127234b = this.id;
        aVar.f127235c = this.vc_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.UpcomingEvent$a */
    public static final class C51124a extends Message.Builder<UpcomingEvent, C51124a> {

        /* renamed from: a */
        public VCEventAbbrInfo f127233a;

        /* renamed from: b */
        public String f127234b;

        /* renamed from: c */
        public VCMeetingAbbrInfo f127235c;

        /* renamed from: a */
        public UpcomingEvent build() {
            String str;
            VCEventAbbrInfo vCEventAbbrInfo = this.f127233a;
            if (vCEventAbbrInfo != null && (str = this.f127234b) != null) {
                return new UpcomingEvent(vCEventAbbrInfo, str, this.f127235c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(vCEventAbbrInfo, "event_info", this.f127234b, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "UpcomingEvent");
        StringBuilder sb = new StringBuilder();
        sb.append(", event_info=");
        sb.append(this.event_info);
        sb.append(", id=");
        sb.append(this.id);
        if (this.vc_info != null) {
            sb.append(", vc_info=");
            sb.append(this.vc_info);
        }
        StringBuilder replace = sb.replace(0, 2, "UpcomingEvent{");
        replace.append('}');
        return replace.toString();
    }

    public UpcomingEvent(VCEventAbbrInfo vCEventAbbrInfo, String str, VCMeetingAbbrInfo vCMeetingAbbrInfo) {
        this(vCEventAbbrInfo, str, vCMeetingAbbrInfo, ByteString.EMPTY);
    }

    public UpcomingEvent(VCEventAbbrInfo vCEventAbbrInfo, String str, VCMeetingAbbrInfo vCMeetingAbbrInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_info = vCEventAbbrInfo;
        this.id = str;
        this.vc_info = vCMeetingAbbrInfo;
    }
}
