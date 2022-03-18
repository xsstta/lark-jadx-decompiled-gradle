package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetVCUpcomingCalendarInstancesRequest extends Message<GetVCUpcomingCalendarInstancesRequest, C50701a> {
    public static final ProtoAdapter<GetVCUpcomingCalendarInstancesRequest> ADAPTER = new C50702b();
    public static final Long DEFAULT_NUMBER = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long number;
    public final Long start_time;
    public final String timezone;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCUpcomingCalendarInstancesRequest$b */
    private static final class C50702b extends ProtoAdapter<GetVCUpcomingCalendarInstancesRequest> {
        C50702b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVCUpcomingCalendarInstancesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVCUpcomingCalendarInstancesRequest getVCUpcomingCalendarInstancesRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getVCUpcomingCalendarInstancesRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getVCUpcomingCalendarInstancesRequest.start_time);
            } else {
                i = 0;
            }
            if (getVCUpcomingCalendarInstancesRequest.timezone != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getVCUpcomingCalendarInstancesRequest.timezone);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getVCUpcomingCalendarInstancesRequest.number != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getVCUpcomingCalendarInstancesRequest.number);
            }
            return i4 + i3 + getVCUpcomingCalendarInstancesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVCUpcomingCalendarInstancesRequest decode(ProtoReader protoReader) throws IOException {
            C50701a aVar = new C50701a();
            aVar.f126438a = 0L;
            aVar.f126439b = "";
            aVar.f126440c = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126438a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f126439b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126440c = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVCUpcomingCalendarInstancesRequest getVCUpcomingCalendarInstancesRequest) throws IOException {
            if (getVCUpcomingCalendarInstancesRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getVCUpcomingCalendarInstancesRequest.start_time);
            }
            if (getVCUpcomingCalendarInstancesRequest.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getVCUpcomingCalendarInstancesRequest.timezone);
            }
            if (getVCUpcomingCalendarInstancesRequest.number != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getVCUpcomingCalendarInstancesRequest.number);
            }
            protoWriter.writeBytes(getVCUpcomingCalendarInstancesRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVCUpcomingCalendarInstancesRequest$a */
    public static final class C50701a extends Message.Builder<GetVCUpcomingCalendarInstancesRequest, C50701a> {

        /* renamed from: a */
        public Long f126438a;

        /* renamed from: b */
        public String f126439b;

        /* renamed from: c */
        public Long f126440c;

        /* renamed from: a */
        public GetVCUpcomingCalendarInstancesRequest build() {
            return new GetVCUpcomingCalendarInstancesRequest(this.f126438a, this.f126439b, this.f126440c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50701a newBuilder() {
        C50701a aVar = new C50701a();
        aVar.f126438a = this.start_time;
        aVar.f126439b = this.timezone;
        aVar.f126440c = this.number;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVCUpcomingCalendarInstancesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (this.number != null) {
            sb.append(", number=");
            sb.append(this.number);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVCUpcomingCalendarInstancesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVCUpcomingCalendarInstancesRequest(Long l, String str, Long l2) {
        this(l, str, l2, ByteString.EMPTY);
    }

    public GetVCUpcomingCalendarInstancesRequest(Long l, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.start_time = l;
        this.timezone = str;
        this.number = l2;
    }
}
