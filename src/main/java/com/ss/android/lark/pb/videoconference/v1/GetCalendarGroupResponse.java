package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetCalendarGroupResponse extends Message<GetCalendarGroupResponse, C50611a> {
    public static final ProtoAdapter<GetCalendarGroupResponse> ADAPTER = new C50612b();
    public static final GetCalendarGroupStatus DEFAULT_GET_CAL_GROUP_STATUS = GetCalendarGroupStatus.GET_GROUP_UNKNOWN;
    private static final long serialVersionUID = 0;
    public final GetCalendarGroupStatus get_cal_group_status;
    public final String group_id;

    public enum GetCalendarGroupStatus implements WireEnum {
        GET_GROUP_UNKNOWN(0),
        GET_GROUP_SUCCESS(1),
        GET_GROUP_FAILED(2),
        GET_GROUP_NOT_CREATED(3),
        GET_GROUP_NOT_PERMITTED(4);
        
        public static final ProtoAdapter<GetCalendarGroupStatus> ADAPTER = ProtoAdapter.newEnumAdapter(GetCalendarGroupStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static GetCalendarGroupStatus fromValue(int i) {
            if (i == 0) {
                return GET_GROUP_UNKNOWN;
            }
            if (i == 1) {
                return GET_GROUP_SUCCESS;
            }
            if (i == 2) {
                return GET_GROUP_FAILED;
            }
            if (i == 3) {
                return GET_GROUP_NOT_CREATED;
            }
            if (i != 4) {
                return null;
            }
            return GET_GROUP_NOT_PERMITTED;
        }

        private GetCalendarGroupStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGroupResponse$b */
    private static final class C50612b extends ProtoAdapter<GetCalendarGroupResponse> {
        C50612b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetCalendarGroupResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetCalendarGroupResponse getCalendarGroupResponse) {
            int i;
            int i2 = 0;
            if (getCalendarGroupResponse.group_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getCalendarGroupResponse.group_id);
            } else {
                i = 0;
            }
            if (getCalendarGroupResponse.get_cal_group_status != null) {
                i2 = GetCalendarGroupStatus.ADAPTER.encodedSizeWithTag(2, getCalendarGroupResponse.get_cal_group_status);
            }
            return i + i2 + getCalendarGroupResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetCalendarGroupResponse decode(ProtoReader protoReader) throws IOException {
            C50611a aVar = new C50611a();
            aVar.f126345a = "";
            aVar.f126346b = GetCalendarGroupStatus.GET_GROUP_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126345a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f126346b = GetCalendarGroupStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetCalendarGroupResponse getCalendarGroupResponse) throws IOException {
            if (getCalendarGroupResponse.group_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getCalendarGroupResponse.group_id);
            }
            if (getCalendarGroupResponse.get_cal_group_status != null) {
                GetCalendarGroupStatus.ADAPTER.encodeWithTag(protoWriter, 2, getCalendarGroupResponse.get_cal_group_status);
            }
            protoWriter.writeBytes(getCalendarGroupResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetCalendarGroupResponse$a */
    public static final class C50611a extends Message.Builder<GetCalendarGroupResponse, C50611a> {

        /* renamed from: a */
        public String f126345a;

        /* renamed from: b */
        public GetCalendarGroupStatus f126346b;

        /* renamed from: a */
        public GetCalendarGroupResponse build() {
            return new GetCalendarGroupResponse(this.f126345a, this.f126346b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50611a newBuilder() {
        C50611a aVar = new C50611a();
        aVar.f126345a = this.group_id;
        aVar.f126346b = this.get_cal_group_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetCalendarGroupResponse");
        StringBuilder sb = new StringBuilder();
        if (this.group_id != null) {
            sb.append(", group_id=");
            sb.append(this.group_id);
        }
        if (this.get_cal_group_status != null) {
            sb.append(", get_cal_group_status=");
            sb.append(this.get_cal_group_status);
        }
        StringBuilder replace = sb.replace(0, 2, "GetCalendarGroupResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetCalendarGroupResponse(String str, GetCalendarGroupStatus getCalendarGroupStatus) {
        this(str, getCalendarGroupStatus, ByteString.EMPTY);
    }

    public GetCalendarGroupResponse(String str, GetCalendarGroupStatus getCalendarGroupStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.group_id = str;
        this.get_cal_group_status = getCalendarGroupStatus;
    }
}
