package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.actions.SearchIntents;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VCSearchUserInMeetingRequest extends Message<VCSearchUserInMeetingRequest, C51168a> {
    public static final ProtoAdapter<VCSearchUserInMeetingRequest> ADAPTER = new C51169b();
    public static final Integer DEFAULT_COUNT = 50;
    public static final QueryType DEFAULT_QUERY_TYPE = QueryType.QUERY_ALL;
    private static final long serialVersionUID = 0;
    public final String breakout_room_id;
    public final Integer count;
    public final String query;
    public final QueryType query_type;

    public enum QueryType implements WireEnum {
        QUERY_ALL(0),
        QUERY_IN_MEETING(1);
        
        public static final ProtoAdapter<QueryType> ADAPTER = ProtoAdapter.newEnumAdapter(QueryType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static QueryType fromValue(int i) {
            if (i == 0) {
                return QUERY_ALL;
            }
            if (i != 1) {
                return null;
            }
            return QUERY_IN_MEETING;
        }

        private QueryType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingRequest$b */
    private static final class C51169b extends ProtoAdapter<VCSearchUserInMeetingRequest> {
        C51169b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCSearchUserInMeetingRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(VCSearchUserInMeetingRequest vCSearchUserInMeetingRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, vCSearchUserInMeetingRequest.query) + ProtoAdapter.INT32.encodedSizeWithTag(2, vCSearchUserInMeetingRequest.count);
            int i2 = 0;
            if (vCSearchUserInMeetingRequest.query_type != null) {
                i = QueryType.ADAPTER.encodedSizeWithTag(3, vCSearchUserInMeetingRequest.query_type);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (vCSearchUserInMeetingRequest.breakout_room_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, vCSearchUserInMeetingRequest.breakout_room_id);
            }
            return i3 + i2 + vCSearchUserInMeetingRequest.unknownFields().size();
        }

        /* renamed from: a */
        public VCSearchUserInMeetingRequest decode(ProtoReader protoReader) throws IOException {
            C51168a aVar = new C51168a();
            aVar.f127351a = "";
            aVar.f127352b = 50;
            aVar.f127353c = QueryType.QUERY_ALL;
            aVar.f127354d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127351a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127352b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    try {
                        aVar.f127353c = QueryType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127354d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VCSearchUserInMeetingRequest vCSearchUserInMeetingRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCSearchUserInMeetingRequest.query);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, vCSearchUserInMeetingRequest.count);
            if (vCSearchUserInMeetingRequest.query_type != null) {
                QueryType.ADAPTER.encodeWithTag(protoWriter, 3, vCSearchUserInMeetingRequest.query_type);
            }
            if (vCSearchUserInMeetingRequest.breakout_room_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, vCSearchUserInMeetingRequest.breakout_room_id);
            }
            protoWriter.writeBytes(vCSearchUserInMeetingRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51168a newBuilder() {
        C51168a aVar = new C51168a();
        aVar.f127351a = this.query;
        aVar.f127352b = this.count;
        aVar.f127353c = this.query_type;
        aVar.f127354d = this.breakout_room_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VCSearchUserInMeetingRequest$a */
    public static final class C51168a extends Message.Builder<VCSearchUserInMeetingRequest, C51168a> {

        /* renamed from: a */
        public String f127351a;

        /* renamed from: b */
        public Integer f127352b;

        /* renamed from: c */
        public QueryType f127353c;

        /* renamed from: d */
        public String f127354d;

        /* renamed from: a */
        public VCSearchUserInMeetingRequest build() {
            Integer num;
            String str = this.f127351a;
            if (str != null && (num = this.f127352b) != null) {
                return new VCSearchUserInMeetingRequest(str, num, this.f127353c, this.f127354d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, SearchIntents.EXTRA_QUERY, this.f127352b, "count");
        }

        /* renamed from: a */
        public C51168a mo176518a(QueryType queryType) {
            this.f127353c = queryType;
            return this;
        }

        /* renamed from: b */
        public C51168a mo176522b(String str) {
            this.f127354d = str;
            return this;
        }

        /* renamed from: a */
        public C51168a mo176519a(Integer num) {
            this.f127352b = num;
            return this;
        }

        /* renamed from: a */
        public C51168a mo176520a(String str) {
            this.f127351a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VCSearchUserInMeetingRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", count=");
        sb.append(this.count);
        if (this.query_type != null) {
            sb.append(", query_type=");
            sb.append(this.query_type);
        }
        if (this.breakout_room_id != null) {
            sb.append(", breakout_room_id=");
            sb.append(this.breakout_room_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VCSearchUserInMeetingRequest{");
        replace.append('}');
        return replace.toString();
    }

    public VCSearchUserInMeetingRequest(String str, Integer num, QueryType queryType, String str2) {
        this(str, num, queryType, str2, ByteString.EMPTY);
    }

    public VCSearchUserInMeetingRequest(String str, Integer num, QueryType queryType, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query = str;
        this.count = num;
        this.query_type = queryType;
        this.breakout_room_id = str2;
    }
}
