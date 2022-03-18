package com.ss.android.lark.pb.videoconference.v1;

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

public final class GetVCTabMeetingDetailResponse extends Message<GetVCTabMeetingDetailResponse, C50699a> {
    public static final ProtoAdapter<GetVCTabMeetingDetailResponse> ADAPTER = new C50700b();
    private static final long serialVersionUID = 0;
    public final AccessInfos access_infos;
    public final String calendar_event_rrule;
    public final String history_id;
    public final List<VCTabMeetingAbbrInfo> infos;
    public final String meeting_number;
    public final String meeting_url;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabMeetingDetailResponse$b */
    private static final class C50700b extends ProtoAdapter<GetVCTabMeetingDetailResponse> {
        C50700b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCTabMeetingDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCTabMeetingDetailResponse getVCTabMeetingDetailResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getVCTabMeetingDetailResponse.history_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getVCTabMeetingDetailResponse.history_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + VCTabMeetingAbbrInfo.ADAPTER.asRepeated().encodedSizeWithTag(2, getVCTabMeetingDetailResponse.infos);
            if (getVCTabMeetingDetailResponse.meeting_number != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getVCTabMeetingDetailResponse.meeting_number);
            } else {
                i2 = 0;
            }
            int i6 = encodedSizeWithTag + i2;
            if (getVCTabMeetingDetailResponse.meeting_url != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getVCTabMeetingDetailResponse.meeting_url);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getVCTabMeetingDetailResponse.access_infos != null) {
                i4 = AccessInfos.ADAPTER.encodedSizeWithTag(5, getVCTabMeetingDetailResponse.access_infos);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getVCTabMeetingDetailResponse.calendar_event_rrule != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, getVCTabMeetingDetailResponse.calendar_event_rrule);
            }
            return i8 + i5 + getVCTabMeetingDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCTabMeetingDetailResponse decode(ProtoReader protoReader) throws IOException {
            C50699a aVar = new C50699a();
            aVar.f126432a = "";
            aVar.f126434c = "";
            aVar.f126435d = "";
            aVar.f126437f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126432a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126433b.add(VCTabMeetingAbbrInfo.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            aVar.f126434c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f126435d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126436e = AccessInfos.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126437f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVCTabMeetingDetailResponse getVCTabMeetingDetailResponse) throws IOException {
            if (getVCTabMeetingDetailResponse.history_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getVCTabMeetingDetailResponse.history_id);
            }
            VCTabMeetingAbbrInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getVCTabMeetingDetailResponse.infos);
            if (getVCTabMeetingDetailResponse.meeting_number != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getVCTabMeetingDetailResponse.meeting_number);
            }
            if (getVCTabMeetingDetailResponse.meeting_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getVCTabMeetingDetailResponse.meeting_url);
            }
            if (getVCTabMeetingDetailResponse.access_infos != null) {
                AccessInfos.ADAPTER.encodeWithTag(protoWriter, 5, getVCTabMeetingDetailResponse.access_infos);
            }
            if (getVCTabMeetingDetailResponse.calendar_event_rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, getVCTabMeetingDetailResponse.calendar_event_rrule);
            }
            protoWriter.writeBytes(getVCTabMeetingDetailResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCTabMeetingDetailResponse$a */
    public static final class C50699a extends Message.Builder<GetVCTabMeetingDetailResponse, C50699a> {

        /* renamed from: a */
        public String f126432a;

        /* renamed from: b */
        public List<VCTabMeetingAbbrInfo> f126433b = Internal.newMutableList();

        /* renamed from: c */
        public String f126434c;

        /* renamed from: d */
        public String f126435d;

        /* renamed from: e */
        public AccessInfos f126436e;

        /* renamed from: f */
        public String f126437f;

        /* renamed from: a */
        public GetVCTabMeetingDetailResponse build() {
            return new GetVCTabMeetingDetailResponse(this.f126432a, this.f126433b, this.f126434c, this.f126435d, this.f126436e, this.f126437f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50699a newBuilder() {
        C50699a aVar = new C50699a();
        aVar.f126432a = this.history_id;
        aVar.f126433b = Internal.copyOf("infos", this.infos);
        aVar.f126434c = this.meeting_number;
        aVar.f126435d = this.meeting_url;
        aVar.f126436e = this.access_infos;
        aVar.f126437f = this.calendar_event_rrule;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVCTabMeetingDetailResponse");
        StringBuilder sb = new StringBuilder();
        if (this.history_id != null) {
            sb.append(", history_id=");
            sb.append(this.history_id);
        }
        if (!this.infos.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        if (this.meeting_number != null) {
            sb.append(", meeting_number=");
            sb.append(this.meeting_number);
        }
        if (this.meeting_url != null) {
            sb.append(", meeting_url=");
            sb.append(this.meeting_url);
        }
        if (this.access_infos != null) {
            sb.append(", access_infos=");
            sb.append(this.access_infos);
        }
        if (this.calendar_event_rrule != null) {
            sb.append(", calendar_event_rrule=");
            sb.append(this.calendar_event_rrule);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVCTabMeetingDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCTabMeetingDetailResponse(String str, List<VCTabMeetingAbbrInfo> list, String str2, String str3, AccessInfos accessInfos, String str4) {
        this(str, list, str2, str3, accessInfos, str4, ByteString.EMPTY);
    }

    public GetVCTabMeetingDetailResponse(String str, List<VCTabMeetingAbbrInfo> list, String str2, String str3, AccessInfos accessInfos, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.history_id = str;
        this.infos = Internal.immutableCopyOf("infos", list);
        this.meeting_number = str2;
        this.meeting_url = str3;
        this.access_infos = accessInfos;
        this.calendar_event_rrule = str4;
    }
}
