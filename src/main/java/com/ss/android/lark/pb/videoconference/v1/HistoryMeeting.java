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

public final class HistoryMeeting extends Message<HistoryMeeting, C50741a> {
    public static final ProtoAdapter<HistoryMeeting> ADAPTER = new C50742b();
    public static final VCHistoryType DEFAULT_ITEM_TYPE = VCHistoryType.ALL;
    private static final long serialVersionUID = 0;
    public final VCEventAbbrInfo event_info;
    public final String id;
    public final VCHistoryType item_type;
    public final VCMeetingAbbrInfo vc_info;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HistoryMeeting$b */
    private static final class C50742b extends ProtoAdapter<HistoryMeeting> {
        C50742b() {
            super(FieldEncoding.LENGTH_DELIMITED, HistoryMeeting.class);
        }

        /* renamed from: a */
        public int encodedSize(HistoryMeeting historyMeeting) {
            int i;
            int encodedSizeWithTag = VCHistoryType.ADAPTER.encodedSizeWithTag(1, historyMeeting.item_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, historyMeeting.id);
            int i2 = 0;
            if (historyMeeting.vc_info != null) {
                i = VCMeetingAbbrInfo.ADAPTER.encodedSizeWithTag(3, historyMeeting.vc_info);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (historyMeeting.event_info != null) {
                i2 = VCEventAbbrInfo.ADAPTER.encodedSizeWithTag(4, historyMeeting.event_info);
            }
            return i3 + i2 + historyMeeting.unknownFields().size();
        }

        /* renamed from: a */
        public HistoryMeeting decode(ProtoReader protoReader) throws IOException {
            C50741a aVar = new C50741a();
            aVar.f126501a = VCHistoryType.ALL;
            aVar.f126502b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126501a = VCHistoryType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126502b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f126503c = VCMeetingAbbrInfo.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126504d = VCEventAbbrInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, HistoryMeeting historyMeeting) throws IOException {
            VCHistoryType.ADAPTER.encodeWithTag(protoWriter, 1, historyMeeting.item_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, historyMeeting.id);
            if (historyMeeting.vc_info != null) {
                VCMeetingAbbrInfo.ADAPTER.encodeWithTag(protoWriter, 3, historyMeeting.vc_info);
            }
            if (historyMeeting.event_info != null) {
                VCEventAbbrInfo.ADAPTER.encodeWithTag(protoWriter, 4, historyMeeting.event_info);
            }
            protoWriter.writeBytes(historyMeeting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50741a newBuilder() {
        C50741a aVar = new C50741a();
        aVar.f126501a = this.item_type;
        aVar.f126502b = this.id;
        aVar.f126503c = this.vc_info;
        aVar.f126504d = this.event_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.HistoryMeeting$a */
    public static final class C50741a extends Message.Builder<HistoryMeeting, C50741a> {

        /* renamed from: a */
        public VCHistoryType f126501a;

        /* renamed from: b */
        public String f126502b;

        /* renamed from: c */
        public VCMeetingAbbrInfo f126503c;

        /* renamed from: d */
        public VCEventAbbrInfo f126504d;

        /* renamed from: a */
        public HistoryMeeting build() {
            String str;
            VCHistoryType vCHistoryType = this.f126501a;
            if (vCHistoryType != null && (str = this.f126502b) != null) {
                return new HistoryMeeting(vCHistoryType, str, this.f126503c, this.f126504d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(vCHistoryType, "item_type", this.f126502b, "id");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "HistoryMeeting");
        StringBuilder sb = new StringBuilder();
        sb.append(", item_type=");
        sb.append(this.item_type);
        sb.append(", id=");
        sb.append(this.id);
        if (this.vc_info != null) {
            sb.append(", vc_info=");
            sb.append(this.vc_info);
        }
        if (this.event_info != null) {
            sb.append(", event_info=");
            sb.append(this.event_info);
        }
        StringBuilder replace = sb.replace(0, 2, "HistoryMeeting{");
        replace.append('}');
        return replace.toString();
    }

    public HistoryMeeting(VCHistoryType vCHistoryType, String str, VCMeetingAbbrInfo vCMeetingAbbrInfo, VCEventAbbrInfo vCEventAbbrInfo) {
        this(vCHistoryType, str, vCMeetingAbbrInfo, vCEventAbbrInfo, ByteString.EMPTY);
    }

    public HistoryMeeting(VCHistoryType vCHistoryType, String str, VCMeetingAbbrInfo vCMeetingAbbrInfo, VCEventAbbrInfo vCEventAbbrInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.item_type = vCHistoryType;
        this.id = str;
        this.vc_info = vCMeetingAbbrInfo;
        this.event_info = vCEventAbbrInfo;
    }
}
