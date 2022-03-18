package com.ss.android.lark.pb.calendarevents;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CheckInByQRCodeRequest extends Message<CheckInByQRCodeRequest, C49562a> {
    public static final ProtoAdapter<CheckInByQRCodeRequest> ADAPTER = new C49563b();
    public static final Long DEFAULT_EVENT_END_TIME = 0L;
    public static final Long DEFAULT_EVENT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long mevent_end_time;
    public final Long mevent_start_time;
    public final String mref_id;
    public final String mresource_id;

    /* renamed from: com.ss.android.lark.pb.calendarevents.CheckInByQRCodeRequest$b */
    private static final class C49563b extends ProtoAdapter<CheckInByQRCodeRequest> {
        C49563b() {
            super(FieldEncoding.LENGTH_DELIMITED, CheckInByQRCodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CheckInByQRCodeRequest checkInByQRCodeRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (checkInByQRCodeRequest.mresource_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, checkInByQRCodeRequest.mresource_id);
            } else {
                i = 0;
            }
            if (checkInByQRCodeRequest.mref_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, checkInByQRCodeRequest.mref_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (checkInByQRCodeRequest.mevent_start_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, checkInByQRCodeRequest.mevent_start_time);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (checkInByQRCodeRequest.mevent_end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, checkInByQRCodeRequest.mevent_end_time);
            }
            return i6 + i4 + checkInByQRCodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CheckInByQRCodeRequest decode(ProtoReader protoReader) throws IOException {
            C49562a aVar = new C49562a();
            aVar.f124177a = "";
            aVar.f124178b = "";
            aVar.f124179c = 0L;
            aVar.f124180d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124177a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124178b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f124179c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124180d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CheckInByQRCodeRequest checkInByQRCodeRequest) throws IOException {
            if (checkInByQRCodeRequest.mresource_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, checkInByQRCodeRequest.mresource_id);
            }
            if (checkInByQRCodeRequest.mref_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, checkInByQRCodeRequest.mref_id);
            }
            if (checkInByQRCodeRequest.mevent_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, checkInByQRCodeRequest.mevent_start_time);
            }
            if (checkInByQRCodeRequest.mevent_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, checkInByQRCodeRequest.mevent_end_time);
            }
            protoWriter.writeBytes(checkInByQRCodeRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.calendarevents.CheckInByQRCodeRequest$a */
    public static final class C49562a extends Message.Builder<CheckInByQRCodeRequest, C49562a> {

        /* renamed from: a */
        public String f124177a;

        /* renamed from: b */
        public String f124178b;

        /* renamed from: c */
        public Long f124179c;

        /* renamed from: d */
        public Long f124180d;

        /* renamed from: a */
        public CheckInByQRCodeRequest build() {
            return new CheckInByQRCodeRequest(this.f124177a, this.f124178b, this.f124179c, this.f124180d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49562a mo172831a(Long l) {
            this.f124179c = l;
            return this;
        }

        /* renamed from: b */
        public C49562a mo172834b(Long l) {
            this.f124180d = l;
            return this;
        }

        /* renamed from: a */
        public C49562a mo172832a(String str) {
            this.f124177a = str;
            return this;
        }

        /* renamed from: b */
        public C49562a mo172835b(String str) {
            this.f124178b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49562a newBuilder() {
        C49562a aVar = new C49562a();
        aVar.f124177a = this.mresource_id;
        aVar.f124178b = this.mref_id;
        aVar.f124179c = this.mevent_start_time;
        aVar.f124180d = this.mevent_end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mresource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.mresource_id);
        }
        if (this.mref_id != null) {
            sb.append(", ref_id=");
            sb.append(this.mref_id);
        }
        if (this.mevent_start_time != null) {
            sb.append(", event_start_time=");
            sb.append(this.mevent_start_time);
        }
        if (this.mevent_end_time != null) {
            sb.append(", event_end_time=");
            sb.append(this.mevent_end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "CheckInByQRCodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CheckInByQRCodeRequest(String str, String str2, Long l, Long l2) {
        this(str, str2, l, l2, ByteString.EMPTY);
    }

    public CheckInByQRCodeRequest(String str, String str2, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mresource_id = str;
        this.mref_id = str2;
        this.mevent_start_time = l;
        this.mevent_end_time = l2;
    }
}
