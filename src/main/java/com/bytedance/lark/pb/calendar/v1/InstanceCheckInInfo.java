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

public final class InstanceCheckInInfo extends Message<InstanceCheckInInfo, C15812a> {
    public static final ProtoAdapter<InstanceCheckInInfo> ADAPTER = new C15813b();
    public static final CheckInType DEFAULT_CHECK_IN_STATUS = CheckInType.UNKNOWN;
    public static final Long DEFAULT_CHECK_IN_TIMESTAMP_SECOND = 0L;
    private static final long serialVersionUID = 0;
    public final CheckInType check_in_status;
    public final Long check_in_timestamp_second;
    public final String instance_id;

    public enum CheckInType implements WireEnum {
        UNKNOWN(0),
        ALREADY_CHECK_IN(1),
        NOT_CHECK_IN(2),
        USER_NOT_AUTHORIZED(3);
        
        public static final ProtoAdapter<CheckInType> ADAPTER = ProtoAdapter.newEnumAdapter(CheckInType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CheckInType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALREADY_CHECK_IN;
            }
            if (i == 2) {
                return NOT_CHECK_IN;
            }
            if (i != 3) {
                return null;
            }
            return USER_NOT_AUTHORIZED;
        }

        private CheckInType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo$b */
    private static final class C15813b extends ProtoAdapter<InstanceCheckInInfo> {
        C15813b() {
            super(FieldEncoding.LENGTH_DELIMITED, InstanceCheckInInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(InstanceCheckInInfo instanceCheckInInfo) {
            int i;
            int i2;
            int i3 = 0;
            if (instanceCheckInInfo.instance_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, instanceCheckInInfo.instance_id);
            } else {
                i = 0;
            }
            if (instanceCheckInInfo.check_in_timestamp_second != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, instanceCheckInInfo.check_in_timestamp_second);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (instanceCheckInInfo.check_in_status != null) {
                i3 = CheckInType.ADAPTER.encodedSizeWithTag(3, instanceCheckInInfo.check_in_status);
            }
            return i4 + i3 + instanceCheckInInfo.unknownFields().size();
        }

        /* renamed from: a */
        public InstanceCheckInInfo decode(ProtoReader protoReader) throws IOException {
            C15812a aVar = new C15812a();
            aVar.f41592a = "";
            aVar.f41593b = 0L;
            aVar.f41594c = CheckInType.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41592a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f41593b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f41594c = CheckInType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, InstanceCheckInInfo instanceCheckInInfo) throws IOException {
            if (instanceCheckInInfo.instance_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, instanceCheckInInfo.instance_id);
            }
            if (instanceCheckInInfo.check_in_timestamp_second != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, instanceCheckInInfo.check_in_timestamp_second);
            }
            if (instanceCheckInInfo.check_in_status != null) {
                CheckInType.ADAPTER.encodeWithTag(protoWriter, 3, instanceCheckInInfo.check_in_status);
            }
            protoWriter.writeBytes(instanceCheckInInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo$a */
    public static final class C15812a extends Message.Builder<InstanceCheckInInfo, C15812a> {

        /* renamed from: a */
        public String f41592a;

        /* renamed from: b */
        public Long f41593b;

        /* renamed from: c */
        public CheckInType f41594c;

        /* renamed from: a */
        public InstanceCheckInInfo build() {
            return new InstanceCheckInInfo(this.f41592a, this.f41593b, this.f41594c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15812a newBuilder() {
        C15812a aVar = new C15812a();
        aVar.f41592a = this.instance_id;
        aVar.f41593b = this.check_in_timestamp_second;
        aVar.f41594c = this.check_in_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "InstanceCheckInInfo");
        StringBuilder sb = new StringBuilder();
        if (this.instance_id != null) {
            sb.append(", instance_id=");
            sb.append(this.instance_id);
        }
        if (this.check_in_timestamp_second != null) {
            sb.append(", check_in_timestamp_second=");
            sb.append(this.check_in_timestamp_second);
        }
        if (this.check_in_status != null) {
            sb.append(", check_in_status=");
            sb.append(this.check_in_status);
        }
        StringBuilder replace = sb.replace(0, 2, "InstanceCheckInInfo{");
        replace.append('}');
        return replace.toString();
    }

    public InstanceCheckInInfo(String str, Long l, CheckInType checkInType) {
        this(str, l, checkInType, ByteString.EMPTY);
    }

    public InstanceCheckInInfo(String str, Long l, CheckInType checkInType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.instance_id = str;
        this.check_in_timestamp_second = l;
        this.check_in_status = checkInType;
    }
}
