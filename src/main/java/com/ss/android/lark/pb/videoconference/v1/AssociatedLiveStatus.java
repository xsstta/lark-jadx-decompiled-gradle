package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AssociatedLiveStatus extends Message<AssociatedLiveStatus, C50469a> {
    public static final ProtoAdapter<AssociatedLiveStatus> ADAPTER = new C50470b();
    public static final Long DEFAULT_LIVE_DURATION = 0L;
    public static final Long DEFAULT_LIVE_START_TIME = 0L;
    public static final LiveStatus DEFAULT_LIVE_STATUS = LiveStatus.UNKNOWN;
    public static final Long DEFAULT_REQ_BEGIN_TIME = 0L;
    public static final Long DEFAULT_REQ_END_TIME = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    private static final long serialVersionUID = 0;
    public final String associated_event_id;
    public final Long live_duration;
    public final String live_id;
    public final Long live_start_time;
    public final LiveStatus live_status;
    public final Long req_begin_time;
    public final Long req_end_time;
    public final Long version;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AssociatedLiveStatus$b */
    private static final class C50470b extends ProtoAdapter<AssociatedLiveStatus> {
        C50470b() {
            super(FieldEncoding.LENGTH_DELIMITED, AssociatedLiveStatus.class);
        }

        /* renamed from: a */
        public int encodedSize(AssociatedLiveStatus associatedLiveStatus) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (associatedLiveStatus.associated_event_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, associatedLiveStatus.associated_event_id);
            } else {
                i = 0;
            }
            if (associatedLiveStatus.live_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, associatedLiveStatus.live_id);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (associatedLiveStatus.live_status != null) {
                i3 = LiveStatus.ADAPTER.encodedSizeWithTag(3, associatedLiveStatus.live_status);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (associatedLiveStatus.version != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, associatedLiveStatus.version);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (associatedLiveStatus.live_start_time != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, associatedLiveStatus.live_start_time);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (associatedLiveStatus.live_duration != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, associatedLiveStatus.live_duration);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (associatedLiveStatus.req_begin_time != null) {
                i7 = ProtoAdapter.INT64.encodedSizeWithTag(7, associatedLiveStatus.req_begin_time);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (associatedLiveStatus.req_end_time != null) {
                i8 = ProtoAdapter.INT64.encodedSizeWithTag(8, associatedLiveStatus.req_end_time);
            }
            return i14 + i8 + associatedLiveStatus.unknownFields().size();
        }

        /* renamed from: a */
        public AssociatedLiveStatus decode(ProtoReader protoReader) throws IOException {
            C50469a aVar = new C50469a();
            aVar.f126008a = "";
            aVar.f126009b = "";
            aVar.f126010c = LiveStatus.UNKNOWN;
            aVar.f126011d = 0L;
            aVar.f126012e = 0L;
            aVar.f126013f = 0L;
            aVar.f126014g = 0L;
            aVar.f126015h = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f126008a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f126009b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f126010c = LiveStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f126011d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f126012e = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            aVar.f126013f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f126014g = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            aVar.f126015h = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, AssociatedLiveStatus associatedLiveStatus) throws IOException {
            if (associatedLiveStatus.associated_event_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, associatedLiveStatus.associated_event_id);
            }
            if (associatedLiveStatus.live_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, associatedLiveStatus.live_id);
            }
            if (associatedLiveStatus.live_status != null) {
                LiveStatus.ADAPTER.encodeWithTag(protoWriter, 3, associatedLiveStatus.live_status);
            }
            if (associatedLiveStatus.version != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, associatedLiveStatus.version);
            }
            if (associatedLiveStatus.live_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, associatedLiveStatus.live_start_time);
            }
            if (associatedLiveStatus.live_duration != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, associatedLiveStatus.live_duration);
            }
            if (associatedLiveStatus.req_begin_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, associatedLiveStatus.req_begin_time);
            }
            if (associatedLiveStatus.req_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, associatedLiveStatus.req_end_time);
            }
            protoWriter.writeBytes(associatedLiveStatus.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.AssociatedLiveStatus$a */
    public static final class C50469a extends Message.Builder<AssociatedLiveStatus, C50469a> {

        /* renamed from: a */
        public String f126008a;

        /* renamed from: b */
        public String f126009b;

        /* renamed from: c */
        public LiveStatus f126010c;

        /* renamed from: d */
        public Long f126011d;

        /* renamed from: e */
        public Long f126012e;

        /* renamed from: f */
        public Long f126013f;

        /* renamed from: g */
        public Long f126014g;

        /* renamed from: h */
        public Long f126015h;

        /* renamed from: a */
        public AssociatedLiveStatus build() {
            return new AssociatedLiveStatus(this.f126008a, this.f126009b, this.f126010c, this.f126011d, this.f126012e, this.f126013f, this.f126014g, this.f126015h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50469a newBuilder() {
        C50469a aVar = new C50469a();
        aVar.f126008a = this.associated_event_id;
        aVar.f126009b = this.live_id;
        aVar.f126010c = this.live_status;
        aVar.f126011d = this.version;
        aVar.f126012e = this.live_start_time;
        aVar.f126013f = this.live_duration;
        aVar.f126014g = this.req_begin_time;
        aVar.f126015h = this.req_end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "AssociatedLiveStatus");
        StringBuilder sb = new StringBuilder();
        if (this.associated_event_id != null) {
            sb.append(", associated_event_id=");
            sb.append(this.associated_event_id);
        }
        if (this.live_id != null) {
            sb.append(", live_id=");
            sb.append(this.live_id);
        }
        if (this.live_status != null) {
            sb.append(", live_status=");
            sb.append(this.live_status);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.live_start_time != null) {
            sb.append(", live_start_time=");
            sb.append(this.live_start_time);
        }
        if (this.live_duration != null) {
            sb.append(", live_duration=");
            sb.append(this.live_duration);
        }
        if (this.req_begin_time != null) {
            sb.append(", req_begin_time=");
            sb.append(this.req_begin_time);
        }
        if (this.req_end_time != null) {
            sb.append(", req_end_time=");
            sb.append(this.req_end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "AssociatedLiveStatus{");
        replace.append('}');
        return replace.toString();
    }

    public AssociatedLiveStatus(String str, String str2, LiveStatus liveStatus, Long l, Long l2, Long l3, Long l4, Long l5) {
        this(str, str2, liveStatus, l, l2, l3, l4, l5, ByteString.EMPTY);
    }

    public AssociatedLiveStatus(String str, String str2, LiveStatus liveStatus, Long l, Long l2, Long l3, Long l4, Long l5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.associated_event_id = str;
        this.live_id = str2;
        this.live_status = liveStatus;
        this.version = l;
        this.live_start_time = l2;
        this.live_duration = l3;
        this.req_begin_time = l4;
        this.req_end_time = l5;
    }
}
