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

public final class SearchCalendarEventInstance extends Message<SearchCalendarEventInstance, C16020a> {
    public static final ProtoAdapter<SearchCalendarEventInstance> ADAPTER = new C16021b();
    public static final Long DEFAULT_CROSS_DAY_END_TIME = 0L;
    public static final Integer DEFAULT_CROSS_DAY_NO = 0;
    public static final Long DEFAULT_CROSS_DAY_START_TIME = 0L;
    public static final Integer DEFAULT_CROSS_DAY_SUM = 0;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long cross_day_end_time;
    public final Integer cross_day_no;
    public final Long cross_day_start_time;
    public final Integer cross_day_sum;
    public final Long end_time;
    public final String event_server_id;
    public final Long start_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchCalendarEventInstance$b */
    private static final class C16021b extends ProtoAdapter<SearchCalendarEventInstance> {
        C16021b() {
            super(FieldEncoding.LENGTH_DELIMITED, SearchCalendarEventInstance.class);
        }

        /* renamed from: a */
        public int encodedSize(SearchCalendarEventInstance searchCalendarEventInstance) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, searchCalendarEventInstance.event_server_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, searchCalendarEventInstance.start_time) + ProtoAdapter.INT64.encodedSizeWithTag(3, searchCalendarEventInstance.end_time);
            int i4 = 0;
            if (searchCalendarEventInstance.cross_day_no != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, searchCalendarEventInstance.cross_day_no);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (searchCalendarEventInstance.cross_day_sum != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(5, searchCalendarEventInstance.cross_day_sum);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (searchCalendarEventInstance.cross_day_start_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(6, searchCalendarEventInstance.cross_day_start_time);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (searchCalendarEventInstance.cross_day_end_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(7, searchCalendarEventInstance.cross_day_end_time);
            }
            return i7 + i4 + searchCalendarEventInstance.unknownFields().size();
        }

        /* renamed from: a */
        public SearchCalendarEventInstance decode(ProtoReader protoReader) throws IOException {
            C16020a aVar = new C16020a();
            aVar.f42077a = "";
            aVar.f42078b = 0L;
            aVar.f42079c = 0L;
            aVar.f42080d = 0;
            aVar.f42081e = 0;
            aVar.f42082f = 0L;
            aVar.f42083g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42077a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42078b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42079c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42080d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42081e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42082f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42083g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SearchCalendarEventInstance searchCalendarEventInstance) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, searchCalendarEventInstance.event_server_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, searchCalendarEventInstance.start_time);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, searchCalendarEventInstance.end_time);
            if (searchCalendarEventInstance.cross_day_no != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, searchCalendarEventInstance.cross_day_no);
            }
            if (searchCalendarEventInstance.cross_day_sum != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, searchCalendarEventInstance.cross_day_sum);
            }
            if (searchCalendarEventInstance.cross_day_start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, searchCalendarEventInstance.cross_day_start_time);
            }
            if (searchCalendarEventInstance.cross_day_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, searchCalendarEventInstance.cross_day_end_time);
            }
            protoWriter.writeBytes(searchCalendarEventInstance.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16020a newBuilder() {
        C16020a aVar = new C16020a();
        aVar.f42077a = this.event_server_id;
        aVar.f42078b = this.start_time;
        aVar.f42079c = this.end_time;
        aVar.f42080d = this.cross_day_no;
        aVar.f42081e = this.cross_day_sum;
        aVar.f42082f = this.cross_day_start_time;
        aVar.f42083g = this.cross_day_end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SearchCalendarEventInstance$a */
    public static final class C16020a extends Message.Builder<SearchCalendarEventInstance, C16020a> {

        /* renamed from: a */
        public String f42077a;

        /* renamed from: b */
        public Long f42078b;

        /* renamed from: c */
        public Long f42079c;

        /* renamed from: d */
        public Integer f42080d;

        /* renamed from: e */
        public Integer f42081e;

        /* renamed from: f */
        public Long f42082f;

        /* renamed from: g */
        public Long f42083g;

        /* renamed from: a */
        public SearchCalendarEventInstance build() {
            Long l;
            Long l2;
            String str = this.f42077a;
            if (str != null && (l = this.f42078b) != null && (l2 = this.f42079c) != null) {
                return new SearchCalendarEventInstance(str, l, l2, this.f42080d, this.f42081e, this.f42082f, this.f42083g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "event_server_id", this.f42078b, "start_time", this.f42079c, "end_time");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SearchCalendarEventInstance");
        StringBuilder sb = new StringBuilder();
        sb.append(", event_server_id=");
        sb.append(this.event_server_id);
        sb.append(", start_time=");
        sb.append(this.start_time);
        sb.append(", end_time=");
        sb.append(this.end_time);
        if (this.cross_day_no != null) {
            sb.append(", cross_day_no=");
            sb.append(this.cross_day_no);
        }
        if (this.cross_day_sum != null) {
            sb.append(", cross_day_sum=");
            sb.append(this.cross_day_sum);
        }
        if (this.cross_day_start_time != null) {
            sb.append(", cross_day_start_time=");
            sb.append(this.cross_day_start_time);
        }
        if (this.cross_day_end_time != null) {
            sb.append(", cross_day_end_time=");
            sb.append(this.cross_day_end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "SearchCalendarEventInstance{");
        replace.append('}');
        return replace.toString();
    }

    public SearchCalendarEventInstance(String str, Long l, Long l2, Integer num, Integer num2, Long l3, Long l4) {
        this(str, l, l2, num, num2, l3, l4, ByteString.EMPTY);
    }

    public SearchCalendarEventInstance(String str, Long l, Long l2, Integer num, Integer num2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_server_id = str;
        this.start_time = l;
        this.end_time = l2;
        this.cross_day_no = num;
        this.cross_day_sum = num2;
        this.cross_day_start_time = l3;
        this.cross_day_end_time = l4;
    }
}
