package com.bytedance.lark.pb.calendar.v1;

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

public final class MGetServerInstancesRequest extends Message<MGetServerInstancesRequest, C15852a> {
    public static final ProtoAdapter<MGetServerInstancesRequest> ADAPTER = new C15853b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;
    public final Long end_time;
    public final Long start_time;
    public final String timezone;
    public final List<String> work_hour_calendar_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerInstancesRequest$b */
    private static final class C15853b extends ProtoAdapter<MGetServerInstancesRequest> {
        C15853b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerInstancesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerInstancesRequest mGetServerInstancesRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetServerInstancesRequest.calendar_ids);
            int i3 = 0;
            if (mGetServerInstancesRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, mGetServerInstancesRequest.start_time);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (mGetServerInstancesRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, mGetServerInstancesRequest.end_time);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (mGetServerInstancesRequest.timezone != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, mGetServerInstancesRequest.timezone);
            }
            return i5 + i3 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, mGetServerInstancesRequest.work_hour_calendar_ids) + mGetServerInstancesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerInstancesRequest decode(ProtoReader protoReader) throws IOException {
            C15852a aVar = new C15852a();
            aVar.f41666b = 0L;
            aVar.f41667c = 0L;
            aVar.f41668d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41665a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41666b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41667c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41668d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41669e.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerInstancesRequest mGetServerInstancesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetServerInstancesRequest.calendar_ids);
            if (mGetServerInstancesRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mGetServerInstancesRequest.start_time);
            }
            if (mGetServerInstancesRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mGetServerInstancesRequest.end_time);
            }
            if (mGetServerInstancesRequest.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mGetServerInstancesRequest.timezone);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 5, mGetServerInstancesRequest.work_hour_calendar_ids);
            protoWriter.writeBytes(mGetServerInstancesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerInstancesRequest$a */
    public static final class C15852a extends Message.Builder<MGetServerInstancesRequest, C15852a> {

        /* renamed from: a */
        public List<String> f41665a = Internal.newMutableList();

        /* renamed from: b */
        public Long f41666b;

        /* renamed from: c */
        public Long f41667c;

        /* renamed from: d */
        public String f41668d;

        /* renamed from: e */
        public List<String> f41669e = Internal.newMutableList();

        /* renamed from: a */
        public MGetServerInstancesRequest build() {
            return new MGetServerInstancesRequest(this.f41665a, this.f41666b, this.f41667c, this.f41668d, this.f41669e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15852a mo57206a(Long l) {
            this.f41666b = l;
            return this;
        }

        /* renamed from: b */
        public C15852a mo57210b(Long l) {
            this.f41667c = l;
            return this;
        }

        /* renamed from: a */
        public C15852a mo57207a(String str) {
            this.f41668d = str;
            return this;
        }

        /* renamed from: b */
        public C15852a mo57211b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41669e = list;
            return this;
        }

        /* renamed from: a */
        public C15852a mo57208a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41665a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15852a newBuilder() {
        C15852a aVar = new C15852a();
        aVar.f41665a = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.f41666b = this.start_time;
        aVar.f41667c = this.end_time;
        aVar.f41668d = this.timezone;
        aVar.f41669e = Internal.copyOf("work_hour_calendar_ids", this.work_hour_calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetServerInstancesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        if (!this.work_hour_calendar_ids.isEmpty()) {
            sb.append(", work_hour_calendar_ids=");
            sb.append(this.work_hour_calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerInstancesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerInstancesRequest(List<String> list, Long l, Long l2, String str, List<String> list2) {
        this(list, l, l2, str, list2, ByteString.EMPTY);
    }

    public MGetServerInstancesRequest(List<String> list, Long l, Long l2, String str, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
        this.start_time = l;
        this.end_time = l2;
        this.timezone = str;
        this.work_hour_calendar_ids = Internal.immutableCopyOf("work_hour_calendar_ids", list2);
    }
}
