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

public final class GetRoomViewInstancesRequest extends Message<GetRoomViewInstancesRequest, C15780a> {
    public static final ProtoAdapter<GetRoomViewInstancesRequest> ADAPTER = new C15781b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final Long end_time;
    public final List<String> resource_calendar_ids;
    public final Long start_time;
    public final String timezone;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesRequest$b */
    private static final class C15781b extends ProtoAdapter<GetRoomViewInstancesRequest> {
        C15781b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetRoomViewInstancesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetRoomViewInstancesRequest getRoomViewInstancesRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getRoomViewInstancesRequest.resource_calendar_ids);
            int i3 = 0;
            if (getRoomViewInstancesRequest.start_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(2, getRoomViewInstancesRequest.start_time);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (getRoomViewInstancesRequest.end_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, getRoomViewInstancesRequest.end_time);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (getRoomViewInstancesRequest.timezone != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getRoomViewInstancesRequest.timezone);
            }
            return i5 + i3 + getRoomViewInstancesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetRoomViewInstancesRequest decode(ProtoReader protoReader) throws IOException {
            C15780a aVar = new C15780a();
            aVar.f41554b = 0L;
            aVar.f41555c = 0L;
            aVar.f41556d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41553a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41554b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f41555c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41556d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetRoomViewInstancesRequest getRoomViewInstancesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getRoomViewInstancesRequest.resource_calendar_ids);
            if (getRoomViewInstancesRequest.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getRoomViewInstancesRequest.start_time);
            }
            if (getRoomViewInstancesRequest.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getRoomViewInstancesRequest.end_time);
            }
            if (getRoomViewInstancesRequest.timezone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getRoomViewInstancesRequest.timezone);
            }
            protoWriter.writeBytes(getRoomViewInstancesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetRoomViewInstancesRequest$a */
    public static final class C15780a extends Message.Builder<GetRoomViewInstancesRequest, C15780a> {

        /* renamed from: a */
        public List<String> f41553a = Internal.newMutableList();

        /* renamed from: b */
        public Long f41554b;

        /* renamed from: c */
        public Long f41555c;

        /* renamed from: d */
        public String f41556d;

        /* renamed from: a */
        public GetRoomViewInstancesRequest build() {
            return new GetRoomViewInstancesRequest(this.f41553a, this.f41554b, this.f41555c, this.f41556d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15780a mo57009a(Long l) {
            this.f41554b = l;
            return this;
        }

        /* renamed from: b */
        public C15780a mo57013b(Long l) {
            this.f41555c = l;
            return this;
        }

        /* renamed from: a */
        public C15780a mo57010a(String str) {
            this.f41556d = str;
            return this;
        }

        /* renamed from: a */
        public C15780a mo57011a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41553a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15780a newBuilder() {
        C15780a aVar = new C15780a();
        aVar.f41553a = Internal.copyOf("resource_calendar_ids", this.resource_calendar_ids);
        aVar.f41554b = this.start_time;
        aVar.f41555c = this.end_time;
        aVar.f41556d = this.timezone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetRoomViewInstancesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.resource_calendar_ids.isEmpty()) {
            sb.append(", resource_calendar_ids=");
            sb.append(this.resource_calendar_ids);
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
        StringBuilder replace = sb.replace(0, 2, "GetRoomViewInstancesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetRoomViewInstancesRequest(List<String> list, Long l, Long l2, String str) {
        this(list, l, l2, str, ByteString.EMPTY);
    }

    public GetRoomViewInstancesRequest(List<String> list, Long l, Long l2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_calendar_ids = Internal.immutableCopyOf("resource_calendar_ids", list);
        this.start_time = l;
        this.end_time = l2;
        this.timezone = str;
    }
}
