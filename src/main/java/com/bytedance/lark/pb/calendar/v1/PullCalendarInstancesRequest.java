package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class PullCalendarInstancesRequest extends Message<PullCalendarInstancesRequest, C15922a> {
    public static final ProtoAdapter<PullCalendarInstancesRequest> ADAPTER = new C15923b();
    public static final Long DEFAULT_BEGIN_TIME = 0L;
    public static final Integer DEFAULT_LAST_MIN_TIMESPAN = 0;
    public static final PullType DEFAULT_PULL_TYPE = PullType.PastTime;
    private static final long serialVersionUID = 0;
    public final Long begin_time;
    public final String calendar_id;
    public final String last_event_id;
    public final Integer last_min_timespan;
    public final PullType pull_type;
    public final String timezone;

    public enum PullType implements WireEnum {
        PastTime(1),
        FutureTime(2);
        
        public static final ProtoAdapter<PullType> ADAPTER = ProtoAdapter.newEnumAdapter(PullType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PullType fromValue(int i) {
            if (i == 1) {
                return PastTime;
            }
            if (i != 2) {
                return null;
            }
            return FutureTime;
        }

        private PullType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullCalendarInstancesRequest$b */
    private static final class C15923b extends ProtoAdapter<PullCalendarInstancesRequest> {
        C15923b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullCalendarInstancesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullCalendarInstancesRequest pullCalendarInstancesRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (pullCalendarInstancesRequest.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pullCalendarInstancesRequest.calendar_id);
            } else {
                i = 0;
            }
            if (pullCalendarInstancesRequest.timezone != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pullCalendarInstancesRequest.timezone);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (pullCalendarInstancesRequest.begin_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, pullCalendarInstancesRequest.begin_time);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (pullCalendarInstancesRequest.pull_type != null) {
                i4 = PullType.ADAPTER.encodedSizeWithTag(4, pullCalendarInstancesRequest.pull_type);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pullCalendarInstancesRequest.last_min_timespan != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(5, pullCalendarInstancesRequest.last_min_timespan);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (pullCalendarInstancesRequest.last_event_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, pullCalendarInstancesRequest.last_event_id);
            }
            return i10 + i6 + pullCalendarInstancesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullCalendarInstancesRequest decode(ProtoReader protoReader) throws IOException {
            C15922a aVar = new C15922a();
            aVar.f41883a = "";
            aVar.f41884b = "";
            aVar.f41885c = 0L;
            aVar.f41886d = PullType.PastTime;
            aVar.f41887e = 0;
            aVar.f41888f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41883a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41884b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41885c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                aVar.f41886d = PullType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            aVar.f41887e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41888f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PullCalendarInstancesRequest pullCalendarInstancesRequest) throws IOException {
            if (pullCalendarInstancesRequest.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pullCalendarInstancesRequest.calendar_id);
            }
            if (pullCalendarInstancesRequest.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullCalendarInstancesRequest.timezone);
            }
            if (pullCalendarInstancesRequest.begin_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullCalendarInstancesRequest.begin_time);
            }
            if (pullCalendarInstancesRequest.pull_type != null) {
                PullType.ADAPTER.encodeWithTag(protoWriter, 4, pullCalendarInstancesRequest.pull_type);
            }
            if (pullCalendarInstancesRequest.last_min_timespan != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, pullCalendarInstancesRequest.last_min_timespan);
            }
            if (pullCalendarInstancesRequest.last_event_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, pullCalendarInstancesRequest.last_event_id);
            }
            protoWriter.writeBytes(pullCalendarInstancesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullCalendarInstancesRequest$a */
    public static final class C15922a extends Message.Builder<PullCalendarInstancesRequest, C15922a> {

        /* renamed from: a */
        public String f41883a;

        /* renamed from: b */
        public String f41884b;

        /* renamed from: c */
        public Long f41885c;

        /* renamed from: d */
        public PullType f41886d;

        /* renamed from: e */
        public Integer f41887e;

        /* renamed from: f */
        public String f41888f;

        /* renamed from: a */
        public PullCalendarInstancesRequest build() {
            return new PullCalendarInstancesRequest(this.f41883a, this.f41884b, this.f41885c, this.f41886d, this.f41887e, this.f41888f, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15922a mo57386a(PullType pullType) {
            this.f41886d = pullType;
            return this;
        }

        /* renamed from: b */
        public C15922a mo57391b(String str) {
            this.f41884b = str;
            return this;
        }

        /* renamed from: c */
        public C15922a mo57392c(String str) {
            this.f41888f = str;
            return this;
        }

        /* renamed from: a */
        public C15922a mo57387a(Integer num) {
            this.f41887e = num;
            return this;
        }

        /* renamed from: a */
        public C15922a mo57388a(Long l) {
            this.f41885c = l;
            return this;
        }

        /* renamed from: a */
        public C15922a mo57389a(String str) {
            this.f41883a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15922a newBuilder() {
        C15922a aVar = new C15922a();
        aVar.f41883a = this.calendar_id;
        aVar.f41884b = this.timezone;
        aVar.f41885c = this.begin_time;
        aVar.f41886d = this.pull_type;
        aVar.f41887e = this.last_min_timespan;
        aVar.f41888f = this.last_event_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullCalendarInstancesRequest");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (this.begin_time != null) {
            sb.append(", begin_time=");
            sb.append(this.begin_time);
        }
        if (this.pull_type != null) {
            sb.append(", pull_type=");
            sb.append(this.pull_type);
        }
        if (this.last_min_timespan != null) {
            sb.append(", last_min_timespan=");
            sb.append(this.last_min_timespan);
        }
        if (this.last_event_id != null) {
            sb.append(", last_event_id=");
            sb.append(this.last_event_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PullCalendarInstancesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullCalendarInstancesRequest(String str, String str2, Long l, PullType pullType, Integer num, String str3) {
        this(str, str2, l, pullType, num, str3, ByteString.EMPTY);
    }

    public PullCalendarInstancesRequest(String str, String str2, Long l, PullType pullType, Integer num, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.timezone = str2;
        this.begin_time = l;
        this.pull_type = pullType;
        this.last_min_timespan = num;
        this.last_event_id = str3;
    }
}
