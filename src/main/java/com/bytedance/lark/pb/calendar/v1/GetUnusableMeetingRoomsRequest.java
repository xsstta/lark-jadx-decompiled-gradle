package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class GetUnusableMeetingRoomsRequest extends Message<GetUnusableMeetingRoomsRequest, C15798a> {
    public static final ProtoAdapter<GetUnusableMeetingRoomsRequest> ADAPTER = new C15799b();
    public static final Long DEFAULT_EVENT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String event_end_time;
    public final Long event_original_time;
    public final String event_rrule;
    public final String event_start_time;
    public final Map<String, SchemaExtraData.ResourceApprovalInfo> resource_approvals;
    public final Map<String, SchemaExtraData.ResourceRequisition> resource_requisitions;
    public final Map<String, SchemaExtraData.ResourceStrategy> resource_strategies;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsRequest$a */
    public static final class C15798a extends Message.Builder<GetUnusableMeetingRoomsRequest, C15798a> {

        /* renamed from: a */
        public Map<String, SchemaExtraData.ResourceStrategy> f41571a = Internal.newMutableMap();

        /* renamed from: b */
        public String f41572b;

        /* renamed from: c */
        public String f41573c;

        /* renamed from: d */
        public String f41574d;

        /* renamed from: e */
        public Map<String, SchemaExtraData.ResourceRequisition> f41575e = Internal.newMutableMap();

        /* renamed from: f */
        public Map<String, SchemaExtraData.ResourceApprovalInfo> f41576f = Internal.newMutableMap();

        /* renamed from: g */
        public Long f41577g;

        /* renamed from: a */
        public GetUnusableMeetingRoomsRequest build() {
            return new GetUnusableMeetingRoomsRequest(this.f41571a, this.f41572b, this.f41573c, this.f41574d, this.f41575e, this.f41576f, this.f41577g, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15798a mo57055a(Long l) {
            this.f41577g = l;
            return this;
        }

        /* renamed from: b */
        public C15798a mo57059b(String str) {
            this.f41573c = str;
            return this;
        }

        /* renamed from: c */
        public C15798a mo57061c(String str) {
            this.f41574d = str;
            return this;
        }

        /* renamed from: a */
        public C15798a mo57056a(String str) {
            this.f41572b = str;
            return this;
        }

        /* renamed from: b */
        public C15798a mo57060b(Map<String, SchemaExtraData.ResourceRequisition> map) {
            Internal.checkElementsNotNull(map);
            this.f41575e = map;
            return this;
        }

        /* renamed from: c */
        public C15798a mo57062c(Map<String, SchemaExtraData.ResourceApprovalInfo> map) {
            Internal.checkElementsNotNull(map);
            this.f41576f = map;
            return this;
        }

        /* renamed from: a */
        public C15798a mo57057a(Map<String, SchemaExtraData.ResourceStrategy> map) {
            Internal.checkElementsNotNull(map);
            this.f41571a = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUnusableMeetingRoomsRequest$b */
    private static final class C15799b extends ProtoAdapter<GetUnusableMeetingRoomsRequest> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, SchemaExtraData.ResourceStrategy>> f41578a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SchemaExtraData.ResourceStrategy.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, SchemaExtraData.ResourceRequisition>> f41579b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SchemaExtraData.ResourceRequisition.ADAPTER);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, SchemaExtraData.ResourceApprovalInfo>> f41580c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, SchemaExtraData.ResourceApprovalInfo.ADAPTER);

        C15799b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUnusableMeetingRoomsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUnusableMeetingRoomsRequest getUnusableMeetingRoomsRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = this.f41578a.encodedSizeWithTag(1, getUnusableMeetingRoomsRequest.resource_strategies);
            int i4 = 0;
            if (getUnusableMeetingRoomsRequest.event_start_time != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getUnusableMeetingRoomsRequest.event_start_time);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (getUnusableMeetingRoomsRequest.event_end_time != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, getUnusableMeetingRoomsRequest.event_end_time);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (getUnusableMeetingRoomsRequest.event_rrule != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, getUnusableMeetingRoomsRequest.event_rrule);
            } else {
                i3 = 0;
            }
            int encodedSizeWithTag2 = i6 + i3 + this.f41579b.encodedSizeWithTag(5, getUnusableMeetingRoomsRequest.resource_requisitions) + this.f41580c.encodedSizeWithTag(6, getUnusableMeetingRoomsRequest.resource_approvals);
            if (getUnusableMeetingRoomsRequest.event_original_time != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(7, getUnusableMeetingRoomsRequest.event_original_time);
            }
            return encodedSizeWithTag2 + i4 + getUnusableMeetingRoomsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUnusableMeetingRoomsRequest decode(ProtoReader protoReader) throws IOException {
            C15798a aVar = new C15798a();
            aVar.f41572b = "";
            aVar.f41573c = "";
            aVar.f41574d = "";
            aVar.f41577g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41571a.putAll(this.f41578a.decode(protoReader));
                            break;
                        case 2:
                            aVar.f41572b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41573c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f41574d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f41575e.putAll(this.f41579b.decode(protoReader));
                            break;
                        case 6:
                            aVar.f41576f.putAll(this.f41580c.decode(protoReader));
                            break;
                        case 7:
                            aVar.f41577g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetUnusableMeetingRoomsRequest getUnusableMeetingRoomsRequest) throws IOException {
            this.f41578a.encodeWithTag(protoWriter, 1, getUnusableMeetingRoomsRequest.resource_strategies);
            if (getUnusableMeetingRoomsRequest.event_start_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getUnusableMeetingRoomsRequest.event_start_time);
            }
            if (getUnusableMeetingRoomsRequest.event_end_time != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getUnusableMeetingRoomsRequest.event_end_time);
            }
            if (getUnusableMeetingRoomsRequest.event_rrule != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getUnusableMeetingRoomsRequest.event_rrule);
            }
            this.f41579b.encodeWithTag(protoWriter, 5, getUnusableMeetingRoomsRequest.resource_requisitions);
            this.f41580c.encodeWithTag(protoWriter, 6, getUnusableMeetingRoomsRequest.resource_approvals);
            if (getUnusableMeetingRoomsRequest.event_original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, getUnusableMeetingRoomsRequest.event_original_time);
            }
            protoWriter.writeBytes(getUnusableMeetingRoomsRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15798a newBuilder() {
        C15798a aVar = new C15798a();
        aVar.f41571a = Internal.copyOf("resource_strategies", this.resource_strategies);
        aVar.f41572b = this.event_start_time;
        aVar.f41573c = this.event_end_time;
        aVar.f41574d = this.event_rrule;
        aVar.f41575e = Internal.copyOf("resource_requisitions", this.resource_requisitions);
        aVar.f41576f = Internal.copyOf("resource_approvals", this.resource_approvals);
        aVar.f41577g = this.event_original_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetUnusableMeetingRoomsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.resource_strategies.isEmpty()) {
            sb.append(", resource_strategies=");
            sb.append(this.resource_strategies);
        }
        if (this.event_start_time != null) {
            sb.append(", event_start_time=");
            sb.append(this.event_start_time);
        }
        if (this.event_end_time != null) {
            sb.append(", event_end_time=");
            sb.append(this.event_end_time);
        }
        if (this.event_rrule != null) {
            sb.append(", event_rrule=");
            sb.append(this.event_rrule);
        }
        if (!this.resource_requisitions.isEmpty()) {
            sb.append(", resource_requisitions=");
            sb.append(this.resource_requisitions);
        }
        if (!this.resource_approvals.isEmpty()) {
            sb.append(", resource_approvals=");
            sb.append(this.resource_approvals);
        }
        if (this.event_original_time != null) {
            sb.append(", event_original_time=");
            sb.append(this.event_original_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUnusableMeetingRoomsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUnusableMeetingRoomsRequest(Map<String, SchemaExtraData.ResourceStrategy> map, String str, String str2, String str3, Map<String, SchemaExtraData.ResourceRequisition> map2, Map<String, SchemaExtraData.ResourceApprovalInfo> map3, Long l) {
        this(map, str, str2, str3, map2, map3, l, ByteString.EMPTY);
    }

    public GetUnusableMeetingRoomsRequest(Map<String, SchemaExtraData.ResourceStrategy> map, String str, String str2, String str3, Map<String, SchemaExtraData.ResourceRequisition> map2, Map<String, SchemaExtraData.ResourceApprovalInfo> map3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_strategies = Internal.immutableCopyOf("resource_strategies", map);
        this.event_start_time = str;
        this.event_end_time = str2;
        this.event_rrule = str3;
        this.resource_requisitions = Internal.immutableCopyOf("resource_requisitions", map2);
        this.resource_approvals = Internal.immutableCopyOf("resource_approvals", map3);
        this.event_original_time = l;
    }
}
