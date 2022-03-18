package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import okio.ByteString;

public final class GetPstnSipFeatureConfigRequest extends Message<GetPstnSipFeatureConfigRequest, C50330a> {
    public static final ProtoAdapter<GetPstnSipFeatureConfigRequest> ADAPTER = new C50331b();
    public static final Long DEFAULT_MEETING_NO = 0L;
    public static final Long DEFAULT_TENANT_ID = 0L;
    public static final Long DEFAULT_UNIQUE_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    private static final long serialVersionUID = 0;
    public final CalendarType mcalendar_type;
    public final Long mmeeting_no;
    public final Long mtenant_id;
    public final Long munique_id;
    public final Long muser_id;

    public enum CalendarType implements WireEnum {
        CALENDAR_TYPE_UNKNOWN(0),
        CALENDAR_TYPE_INTERVIEW(1);
        
        public static final ProtoAdapter<CalendarType> ADAPTER = ProtoAdapter.newEnumAdapter(CalendarType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CalendarType fromValue(int i) {
            if (i == 0) {
                return CALENDAR_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return CALENDAR_TYPE_INTERVIEW;
        }

        private CalendarType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest$b */
    private static final class C50331b extends ProtoAdapter<GetPstnSipFeatureConfigRequest> {
        C50331b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetPstnSipFeatureConfigRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetPstnSipFeatureConfigRequest getPstnSipFeatureConfigRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getPstnSipFeatureConfigRequest.muser_id != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(1, getPstnSipFeatureConfigRequest.muser_id);
            } else {
                i = 0;
            }
            if (getPstnSipFeatureConfigRequest.munique_id != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, getPstnSipFeatureConfigRequest.munique_id);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (getPstnSipFeatureConfigRequest.mtenant_id != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, getPstnSipFeatureConfigRequest.mtenant_id);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (getPstnSipFeatureConfigRequest.mcalendar_type != null) {
                i4 = CalendarType.ADAPTER.encodedSizeWithTag(4, getPstnSipFeatureConfigRequest.mcalendar_type);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (getPstnSipFeatureConfigRequest.mmeeting_no != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, getPstnSipFeatureConfigRequest.mmeeting_no);
            }
            return i8 + i5 + getPstnSipFeatureConfigRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetPstnSipFeatureConfigRequest decode(ProtoReader protoReader) throws IOException {
            C50330a aVar = new C50330a();
            aVar.f125708a = 0L;
            aVar.f125709b = 0L;
            aVar.f125710c = 0L;
            aVar.f125712e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125708a = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125709b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125710c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 4) {
                    try {
                        aVar.f125711d = CalendarType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125712e = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetPstnSipFeatureConfigRequest getPstnSipFeatureConfigRequest) throws IOException {
            if (getPstnSipFeatureConfigRequest.muser_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getPstnSipFeatureConfigRequest.muser_id);
            }
            if (getPstnSipFeatureConfigRequest.munique_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getPstnSipFeatureConfigRequest.munique_id);
            }
            if (getPstnSipFeatureConfigRequest.mtenant_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getPstnSipFeatureConfigRequest.mtenant_id);
            }
            if (getPstnSipFeatureConfigRequest.mcalendar_type != null) {
                CalendarType.ADAPTER.encodeWithTag(protoWriter, 4, getPstnSipFeatureConfigRequest.mcalendar_type);
            }
            if (getPstnSipFeatureConfigRequest.mmeeting_no != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, getPstnSipFeatureConfigRequest.mmeeting_no);
            }
            protoWriter.writeBytes(getPstnSipFeatureConfigRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.GetPstnSipFeatureConfigRequest$a */
    public static final class C50330a extends Message.Builder<GetPstnSipFeatureConfigRequest, C50330a> {

        /* renamed from: a */
        public Long f125708a;

        /* renamed from: b */
        public Long f125709b;

        /* renamed from: c */
        public Long f125710c;

        /* renamed from: d */
        public CalendarType f125711d;

        /* renamed from: e */
        public Long f125712e;

        /* renamed from: a */
        public GetPstnSipFeatureConfigRequest build() {
            return new GetPstnSipFeatureConfigRequest(this.f125708a, this.f125709b, this.f125710c, this.f125711d, this.f125712e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50330a mo174543a(CalendarType calendarType) {
            this.f125711d = calendarType;
            return this;
        }

        /* renamed from: b */
        public C50330a mo174546b(Long l) {
            this.f125709b = l;
            return this;
        }

        /* renamed from: c */
        public C50330a mo174547c(Long l) {
            this.f125710c = l;
            return this;
        }

        /* renamed from: a */
        public C50330a mo174544a(Long l) {
            this.f125708a = l;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50330a newBuilder() {
        C50330a aVar = new C50330a();
        aVar.f125708a = this.muser_id;
        aVar.f125709b = this.munique_id;
        aVar.f125710c = this.mtenant_id;
        aVar.f125711d = this.mcalendar_type;
        aVar.f125712e = this.mmeeting_no;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.muser_id != null) {
            sb.append(", user_id=");
            sb.append(this.muser_id);
        }
        if (this.munique_id != null) {
            sb.append(", unique_id=");
            sb.append(this.munique_id);
        }
        if (this.mtenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.mtenant_id);
        }
        if (this.mcalendar_type != null) {
            sb.append(", calendar_type=");
            sb.append(this.mcalendar_type);
        }
        if (this.mmeeting_no != null) {
            sb.append(", meeting_no=");
            sb.append(this.mmeeting_no);
        }
        StringBuilder replace = sb.replace(0, 2, "GetPstnSipFeatureConfigRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetPstnSipFeatureConfigRequest(Long l, Long l2, Long l3, CalendarType calendarType, Long l4) {
        this(l, l2, l3, calendarType, l4, ByteString.EMPTY);
    }

    public GetPstnSipFeatureConfigRequest(Long l, Long l2, Long l3, CalendarType calendarType, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.muser_id = l;
        this.munique_id = l2;
        this.mtenant_id = l3;
        this.mcalendar_type = calendarType;
        this.mmeeting_no = l4;
    }
}
