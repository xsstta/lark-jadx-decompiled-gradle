package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class GetResourceCheckInInfoResponse extends Message<GetResourceCheckInInfoResponse, C15770a> {
    public static final ProtoAdapter<GetResourceCheckInInfoResponse> ADAPTER = new C15771b();
    public static final CreateEventAuth DEFAULT_AUTH_CREATE_EVENT = CreateEventAuth.UNKNOWN;
    public static final Long DEFAULT_CURRENT_TIMESTAMP_SECOND = 0L;
    private static final long serialVersionUID = 0;
    public final CreateEventAuth auth_create_event;
    public final CalendarBuilding building;
    public final Map<String, EventCreator> chatters;
    public final Long current_timestamp_second;
    public final List<InstanceInfo> instance_infos;
    public final CalendarResource resource;
    public final ResourceCheckInStrategy resource_check_in_strategy;

    public enum CreateEventAuth implements WireEnum {
        UNKNOWN(0),
        AUTHORIZED(1),
        LIMITED_BY_USER_STRATEGY(2);
        
        public static final ProtoAdapter<CreateEventAuth> ADAPTER = ProtoAdapter.newEnumAdapter(CreateEventAuth.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static CreateEventAuth fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return AUTHORIZED;
            }
            if (i != 2) {
                return null;
            }
            return LIMITED_BY_USER_STRATEGY;
        }

        private CreateEventAuth(int i) {
            this.value = i;
        }
    }

    public static final class InstanceInfo extends Message<InstanceInfo, C15768a> {
        public static final ProtoAdapter<InstanceInfo> ADAPTER = new C15769b();
        private static final long serialVersionUID = 0;
        public final CalendarEventInstance instance;
        public final InstanceCheckInInfo instance_check_in_info;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse$InstanceInfo$b */
        private static final class C15769b extends ProtoAdapter<InstanceInfo> {
            C15769b() {
                super(FieldEncoding.LENGTH_DELIMITED, InstanceInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(InstanceInfo instanceInfo) {
                int i;
                int encodedSizeWithTag = CalendarEventInstance.ADAPTER.encodedSizeWithTag(1, instanceInfo.instance);
                if (instanceInfo.instance_check_in_info != null) {
                    i = InstanceCheckInInfo.ADAPTER.encodedSizeWithTag(2, instanceInfo.instance_check_in_info);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + instanceInfo.unknownFields().size();
            }

            /* renamed from: a */
            public InstanceInfo decode(ProtoReader protoReader) throws IOException {
                C15768a aVar = new C15768a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f41529a = CalendarEventInstance.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f41530b = InstanceCheckInInfo.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, InstanceInfo instanceInfo) throws IOException {
                CalendarEventInstance.ADAPTER.encodeWithTag(protoWriter, 1, instanceInfo.instance);
                if (instanceInfo.instance_check_in_info != null) {
                    InstanceCheckInInfo.ADAPTER.encodeWithTag(protoWriter, 2, instanceInfo.instance_check_in_info);
                }
                protoWriter.writeBytes(instanceInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse$InstanceInfo$a */
        public static final class C15768a extends Message.Builder<InstanceInfo, C15768a> {

            /* renamed from: a */
            public CalendarEventInstance f41529a;

            /* renamed from: b */
            public InstanceCheckInInfo f41530b;

            /* renamed from: a */
            public InstanceInfo build() {
                CalendarEventInstance calendarEventInstance = this.f41529a;
                if (calendarEventInstance != null) {
                    return new InstanceInfo(calendarEventInstance, this.f41530b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(calendarEventInstance, "instance");
            }
        }

        @Override // com.squareup.wire.Message
        public C15768a newBuilder() {
            C15768a aVar = new C15768a();
            aVar.f41529a = this.instance;
            aVar.f41530b = this.instance_check_in_info;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "InstanceInfo");
            StringBuilder sb = new StringBuilder();
            sb.append(", instance=");
            sb.append(this.instance);
            if (this.instance_check_in_info != null) {
                sb.append(", instance_check_in_info=");
                sb.append(this.instance_check_in_info);
            }
            StringBuilder replace = sb.replace(0, 2, "InstanceInfo{");
            replace.append('}');
            return replace.toString();
        }

        public InstanceInfo(CalendarEventInstance calendarEventInstance, InstanceCheckInInfo instanceCheckInInfo) {
            this(calendarEventInstance, instanceCheckInInfo, ByteString.EMPTY);
        }

        public InstanceInfo(CalendarEventInstance calendarEventInstance, InstanceCheckInInfo instanceCheckInInfo, ByteString byteString) {
            super(ADAPTER, byteString);
            this.instance = calendarEventInstance;
            this.instance_check_in_info = instanceCheckInInfo;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse$a */
    public static final class C15770a extends Message.Builder<GetResourceCheckInInfoResponse, C15770a> {

        /* renamed from: a */
        public CalendarResource f41531a;

        /* renamed from: b */
        public CalendarBuilding f41532b;

        /* renamed from: c */
        public Map<String, EventCreator> f41533c = Internal.newMutableMap();

        /* renamed from: d */
        public Long f41534d;

        /* renamed from: e */
        public CreateEventAuth f41535e;

        /* renamed from: f */
        public List<InstanceInfo> f41536f = Internal.newMutableList();

        /* renamed from: g */
        public ResourceCheckInStrategy f41537g;

        /* renamed from: a */
        public GetResourceCheckInInfoResponse build() {
            return new GetResourceCheckInInfoResponse(this.f41531a, this.f41532b, this.f41533c, this.f41534d, this.f41535e, this.f41536f, this.f41537g, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceCheckInInfoResponse$b */
    private static final class C15771b extends ProtoAdapter<GetResourceCheckInInfoResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, EventCreator>> f41538a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, EventCreator.ADAPTER);

        C15771b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceCheckInInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceCheckInInfoResponse getResourceCheckInInfoResponse) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (getResourceCheckInInfoResponse.resource != null) {
                i = CalendarResource.ADAPTER.encodedSizeWithTag(1, getResourceCheckInInfoResponse.resource);
            } else {
                i = 0;
            }
            if (getResourceCheckInInfoResponse.building != null) {
                i2 = CalendarBuilding.ADAPTER.encodedSizeWithTag(2, getResourceCheckInInfoResponse.building);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + this.f41538a.encodedSizeWithTag(3, getResourceCheckInInfoResponse.chatters);
            if (getResourceCheckInInfoResponse.current_timestamp_second != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, getResourceCheckInInfoResponse.current_timestamp_second);
            } else {
                i3 = 0;
            }
            int i6 = encodedSizeWithTag + i3;
            if (getResourceCheckInInfoResponse.auth_create_event != null) {
                i4 = CreateEventAuth.ADAPTER.encodedSizeWithTag(5, getResourceCheckInInfoResponse.auth_create_event);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i6 + i4 + InstanceInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, getResourceCheckInInfoResponse.instance_infos);
            if (getResourceCheckInInfoResponse.resource_check_in_strategy != null) {
                i5 = ResourceCheckInStrategy.ADAPTER.encodedSizeWithTag(7, getResourceCheckInInfoResponse.resource_check_in_strategy);
            }
            return encodedSizeWithTag2 + i5 + getResourceCheckInInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceCheckInInfoResponse decode(ProtoReader protoReader) throws IOException {
            C15770a aVar = new C15770a();
            aVar.f41534d = 0L;
            aVar.f41535e = CreateEventAuth.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41531a = CalendarResource.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f41532b = CalendarBuilding.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f41533c.putAll(this.f41538a.decode(protoReader));
                            break;
                        case 4:
                            aVar.f41534d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f41535e = CreateEventAuth.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f41536f.add(InstanceInfo.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            aVar.f41537g = ResourceCheckInStrategy.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetResourceCheckInInfoResponse getResourceCheckInInfoResponse) throws IOException {
            if (getResourceCheckInInfoResponse.resource != null) {
                CalendarResource.ADAPTER.encodeWithTag(protoWriter, 1, getResourceCheckInInfoResponse.resource);
            }
            if (getResourceCheckInInfoResponse.building != null) {
                CalendarBuilding.ADAPTER.encodeWithTag(protoWriter, 2, getResourceCheckInInfoResponse.building);
            }
            this.f41538a.encodeWithTag(protoWriter, 3, getResourceCheckInInfoResponse.chatters);
            if (getResourceCheckInInfoResponse.current_timestamp_second != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getResourceCheckInInfoResponse.current_timestamp_second);
            }
            if (getResourceCheckInInfoResponse.auth_create_event != null) {
                CreateEventAuth.ADAPTER.encodeWithTag(protoWriter, 5, getResourceCheckInInfoResponse.auth_create_event);
            }
            InstanceInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, getResourceCheckInInfoResponse.instance_infos);
            if (getResourceCheckInInfoResponse.resource_check_in_strategy != null) {
                ResourceCheckInStrategy.ADAPTER.encodeWithTag(protoWriter, 7, getResourceCheckInInfoResponse.resource_check_in_strategy);
            }
            protoWriter.writeBytes(getResourceCheckInInfoResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15770a newBuilder() {
        C15770a aVar = new C15770a();
        aVar.f41531a = this.resource;
        aVar.f41532b = this.building;
        aVar.f41533c = Internal.copyOf("chatters", this.chatters);
        aVar.f41534d = this.current_timestamp_second;
        aVar.f41535e = this.auth_create_event;
        aVar.f41536f = Internal.copyOf("instance_infos", this.instance_infos);
        aVar.f41537g = this.resource_check_in_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetResourceCheckInInfoResponse");
        StringBuilder sb = new StringBuilder();
        if (this.resource != null) {
            sb.append(", resource=");
            sb.append(this.resource);
        }
        if (this.building != null) {
            sb.append(", building=");
            sb.append(this.building);
        }
        if (!this.chatters.isEmpty()) {
            sb.append(", chatters=");
            sb.append(this.chatters);
        }
        if (this.current_timestamp_second != null) {
            sb.append(", current_timestamp_second=");
            sb.append(this.current_timestamp_second);
        }
        if (this.auth_create_event != null) {
            sb.append(", auth_create_event=");
            sb.append(this.auth_create_event);
        }
        if (!this.instance_infos.isEmpty()) {
            sb.append(", instance_infos=");
            sb.append(this.instance_infos);
        }
        if (this.resource_check_in_strategy != null) {
            sb.append(", resource_check_in_strategy=");
            sb.append(this.resource_check_in_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "GetResourceCheckInInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceCheckInInfoResponse(CalendarResource calendarResource, CalendarBuilding calendarBuilding, Map<String, EventCreator> map, Long l, CreateEventAuth createEventAuth, List<InstanceInfo> list, ResourceCheckInStrategy resourceCheckInStrategy) {
        this(calendarResource, calendarBuilding, map, l, createEventAuth, list, resourceCheckInStrategy, ByteString.EMPTY);
    }

    public GetResourceCheckInInfoResponse(CalendarResource calendarResource, CalendarBuilding calendarBuilding, Map<String, EventCreator> map, Long l, CreateEventAuth createEventAuth, List<InstanceInfo> list, ResourceCheckInStrategy resourceCheckInStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource = calendarResource;
        this.building = calendarBuilding;
        this.chatters = Internal.immutableCopyOf("chatters", map);
        this.current_timestamp_second = l;
        this.auth_create_event = createEventAuth;
        this.instance_infos = Internal.immutableCopyOf("instance_infos", list);
        this.resource_check_in_strategy = resourceCheckInStrategy;
    }
}
