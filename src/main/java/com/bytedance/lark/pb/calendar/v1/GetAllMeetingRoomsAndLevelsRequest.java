package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetAllMeetingRoomsAndLevelsRequest extends Message<GetAllMeetingRoomsAndLevelsRequest, C15636a> {
    public static final ProtoAdapter<GetAllMeetingRoomsAndLevelsRequest> ADAPTER = new C15637b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_NEED_DISABLED_RESOURCE = false;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final String level_id;
    public final Boolean need_disabled_resource;
    public final Long start_time;
    public final String start_timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllMeetingRoomsAndLevelsRequest$b */
    private static final class C15637b extends ProtoAdapter<GetAllMeetingRoomsAndLevelsRequest> {
        C15637b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAllMeetingRoomsAndLevelsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAllMeetingRoomsAndLevelsRequest getAllMeetingRoomsAndLevelsRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getAllMeetingRoomsAndLevelsRequest.level_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getAllMeetingRoomsAndLevelsRequest.level_id);
            } else {
                i = 0;
            }
            if (getAllMeetingRoomsAndLevelsRequest.start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getAllMeetingRoomsAndLevelsRequest.start_time);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getAllMeetingRoomsAndLevelsRequest.end_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getAllMeetingRoomsAndLevelsRequest.end_time);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getAllMeetingRoomsAndLevelsRequest.need_disabled_resource != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, getAllMeetingRoomsAndLevelsRequest.need_disabled_resource);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getAllMeetingRoomsAndLevelsRequest.start_timezone != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, getAllMeetingRoomsAndLevelsRequest.start_timezone);
            }
            return i8 + i5 + getAllMeetingRoomsAndLevelsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAllMeetingRoomsAndLevelsRequest decode(ProtoReader protoReader) throws IOException {
            C15636a aVar = new C15636a();
            aVar.f41396a = "";
            aVar.f41397b = 0L;
            aVar.f41398c = 0L;
            aVar.f41399d = false;
            aVar.f41400e = "UTC";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41396a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41397b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41398c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f41399d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41400e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAllMeetingRoomsAndLevelsRequest getAllMeetingRoomsAndLevelsRequest) throws IOException {
            if (getAllMeetingRoomsAndLevelsRequest.level_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getAllMeetingRoomsAndLevelsRequest.level_id);
            }
            if (getAllMeetingRoomsAndLevelsRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getAllMeetingRoomsAndLevelsRequest.start_time);
            }
            if (getAllMeetingRoomsAndLevelsRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getAllMeetingRoomsAndLevelsRequest.end_time);
            }
            if (getAllMeetingRoomsAndLevelsRequest.need_disabled_resource != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, getAllMeetingRoomsAndLevelsRequest.need_disabled_resource);
            }
            if (getAllMeetingRoomsAndLevelsRequest.start_timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getAllMeetingRoomsAndLevelsRequest.start_timezone);
            }
            protoWriter.writeBytes(getAllMeetingRoomsAndLevelsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAllMeetingRoomsAndLevelsRequest$a */
    public static final class C15636a extends Message.Builder<GetAllMeetingRoomsAndLevelsRequest, C15636a> {

        /* renamed from: a */
        public String f41396a;

        /* renamed from: b */
        public Long f41397b;

        /* renamed from: c */
        public Long f41398c;

        /* renamed from: d */
        public Boolean f41399d;

        /* renamed from: e */
        public String f41400e;

        /* renamed from: a */
        public GetAllMeetingRoomsAndLevelsRequest build() {
            return new GetAllMeetingRoomsAndLevelsRequest(this.f41396a, this.f41397b, this.f41398c, this.f41399d, this.f41400e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15636a mo56659a(Boolean bool) {
            this.f41399d = bool;
            return this;
        }

        /* renamed from: b */
        public C15636a mo56663b(Long l) {
            this.f41398c = l;
            return this;
        }

        /* renamed from: a */
        public C15636a mo56660a(Long l) {
            this.f41397b = l;
            return this;
        }

        /* renamed from: a */
        public C15636a mo56661a(String str) {
            this.f41396a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15636a newBuilder() {
        C15636a aVar = new C15636a();
        aVar.f41396a = this.level_id;
        aVar.f41397b = this.start_time;
        aVar.f41398c = this.end_time;
        aVar.f41399d = this.need_disabled_resource;
        aVar.f41400e = this.start_timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAllMeetingRoomsAndLevelsRequest");
        StringBuilder sb = new StringBuilder();
        if (this.level_id != null) {
            sb.append(", level_id=");
            sb.append(this.level_id);
        }
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.need_disabled_resource != null) {
            sb.append(", need_disabled_resource=");
            sb.append(this.need_disabled_resource);
        }
        if (this.start_timezone != null) {
            sb.append(", start_timezone=");
            sb.append(this.start_timezone);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAllMeetingRoomsAndLevelsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAllMeetingRoomsAndLevelsRequest(String str, Long l, Long l2, Boolean bool, String str2) {
        this(str, l, l2, bool, str2, ByteString.EMPTY);
    }

    public GetAllMeetingRoomsAndLevelsRequest(String str, Long l, Long l2, Boolean bool, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.level_id = str;
        this.start_time = l;
        this.end_time = l2;
        this.need_disabled_resource = bool;
        this.start_timezone = str2;
    }
}
