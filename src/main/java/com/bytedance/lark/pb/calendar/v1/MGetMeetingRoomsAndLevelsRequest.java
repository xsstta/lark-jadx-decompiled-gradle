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

public final class MGetMeetingRoomsAndLevelsRequest extends Message<MGetMeetingRoomsAndLevelsRequest, C15840a> {
    public static final ProtoAdapter<MGetMeetingRoomsAndLevelsRequest> ADAPTER = new C15841b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_NEED_DISABLED_RESOURCE = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final List<String> level_ids;
    public final Boolean need_disabled_resource;
    public final String rrule;
    public final Long start_time;
    public final String start_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetMeetingRoomsAndLevelsRequest$b */
    private static final class C15841b extends ProtoAdapter<MGetMeetingRoomsAndLevelsRequest> {
        C15841b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetMeetingRoomsAndLevelsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetMeetingRoomsAndLevelsRequest mGetMeetingRoomsAndLevelsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetMeetingRoomsAndLevelsRequest.level_ids);
            int i5 = 0;
            if (mGetMeetingRoomsAndLevelsRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, mGetMeetingRoomsAndLevelsRequest.start_time);
            } else {
                i = 0;
            }
            int i6 = encodedSizeWithTag + i;
            if (mGetMeetingRoomsAndLevelsRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, mGetMeetingRoomsAndLevelsRequest.end_time);
            } else {
                i2 = 0;
            }
            int i7 = i6 + i2;
            if (mGetMeetingRoomsAndLevelsRequest.rrule != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, mGetMeetingRoomsAndLevelsRequest.rrule);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (mGetMeetingRoomsAndLevelsRequest.need_disabled_resource != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, mGetMeetingRoomsAndLevelsRequest.need_disabled_resource);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (mGetMeetingRoomsAndLevelsRequest.start_timezone != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(6, mGetMeetingRoomsAndLevelsRequest.start_timezone);
            }
            return i9 + i5 + mGetMeetingRoomsAndLevelsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetMeetingRoomsAndLevelsRequest decode(ProtoReader protoReader) throws IOException {
            C15840a aVar = new C15840a();
            aVar.f41651b = 0L;
            aVar.f41652c = 0L;
            aVar.f41653d = "";
            aVar.f41654e = false;
            aVar.f41655f = "UTC";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41650a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f41651b = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41652c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41653d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41654e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f41655f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MGetMeetingRoomsAndLevelsRequest mGetMeetingRoomsAndLevelsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetMeetingRoomsAndLevelsRequest.level_ids);
            if (mGetMeetingRoomsAndLevelsRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, mGetMeetingRoomsAndLevelsRequest.start_time);
            }
            if (mGetMeetingRoomsAndLevelsRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, mGetMeetingRoomsAndLevelsRequest.end_time);
            }
            if (mGetMeetingRoomsAndLevelsRequest.rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, mGetMeetingRoomsAndLevelsRequest.rrule);
            }
            if (mGetMeetingRoomsAndLevelsRequest.need_disabled_resource != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, mGetMeetingRoomsAndLevelsRequest.need_disabled_resource);
            }
            if (mGetMeetingRoomsAndLevelsRequest.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, mGetMeetingRoomsAndLevelsRequest.start_timezone);
            }
            protoWriter.writeBytes(mGetMeetingRoomsAndLevelsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetMeetingRoomsAndLevelsRequest$a */
    public static final class C15840a extends Message.Builder<MGetMeetingRoomsAndLevelsRequest, C15840a> {

        /* renamed from: a */
        public List<String> f41650a = Internal.newMutableList();

        /* renamed from: b */
        public Long f41651b;

        /* renamed from: c */
        public Long f41652c;

        /* renamed from: d */
        public String f41653d;

        /* renamed from: e */
        public Boolean f41654e;

        /* renamed from: f */
        public String f41655f;

        /* renamed from: a */
        public MGetMeetingRoomsAndLevelsRequest build() {
            return new MGetMeetingRoomsAndLevelsRequest(this.f41650a, this.f41651b, this.f41652c, this.f41653d, this.f41654e, this.f41655f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15840a newBuilder() {
        C15840a aVar = new C15840a();
        aVar.f41650a = Internal.copyOf("level_ids", this.level_ids);
        aVar.f41651b = this.start_time;
        aVar.f41652c = this.end_time;
        aVar.f41653d = this.rrule;
        aVar.f41654e = this.need_disabled_resource;
        aVar.f41655f = this.start_timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetMeetingRoomsAndLevelsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.level_ids.isEmpty()) {
            sb.append(", level_ids=");
            sb.append(this.level_ids);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.rrule != null) {
            sb.append(", rrule=");
            sb.append(this.rrule);
        }
        if (this.need_disabled_resource != null) {
            sb.append(", need_disabled_resource=");
            sb.append(this.need_disabled_resource);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetMeetingRoomsAndLevelsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetMeetingRoomsAndLevelsRequest(List<String> list, Long l, Long l2, String str, Boolean bool, String str2) {
        this(list, l, l2, str, bool, str2, ByteString.EMPTY);
    }

    public MGetMeetingRoomsAndLevelsRequest(List<String> list, Long l, Long l2, String str, Boolean bool, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.level_ids = Internal.immutableCopyOf("level_ids", list);
        this.start_time = l;
        this.end_time = l2;
        this.rrule = str;
        this.need_disabled_resource = bool;
        this.start_timezone = str2;
    }
}
