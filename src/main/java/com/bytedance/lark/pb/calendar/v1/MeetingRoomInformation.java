package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class MeetingRoomInformation extends Message<MeetingRoomInformation, C15874a> {
    public static final ProtoAdapter<MeetingRoomInformation> ADAPTER = new C15875b();
    public static final Long DEFAULT_CAPACITY = 0L;
    public static final Boolean DEFAULT_IS_APPROVAL = false;
    public static final Boolean DEFAULT_IS_CUSTOMIZED = false;
    public static final Boolean DEFAULT_SHOULD_SHOW_SUMMARY = false;
    private static final long serialVersionUID = 0;
    public final String building_name;
    public final Long capacity;
    public final String city_name;
    public final List<MeetingRoomEquipment> equipment_lists;
    public final List<Equipment> equipments;
    public final String floor_name;
    public final Boolean is_approval;
    public final Boolean is_customized;
    public final String name;
    public final String picture;
    public final String remark;
    public final SchemaExtraData.ResourceRequisition resource_requisition;
    public final SchemaExtraData.ResourceStrategy resource_strategy;
    public final Boolean should_show_summary;
    public final SchemaExtraData.ApprovalTrigger trigger;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomInformation$b */
    private static final class C15875b extends ProtoAdapter<MeetingRoomInformation> {
        C15875b() {
            super(FieldEncoding.LENGTH_DELIMITED, MeetingRoomInformation.class);
        }

        /* renamed from: a */
        public int encodedSize(MeetingRoomInformation meetingRoomInformation) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13 = 0;
            if (meetingRoomInformation.floor_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, meetingRoomInformation.floor_name);
            } else {
                i = 0;
            }
            if (meetingRoomInformation.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, meetingRoomInformation.name);
            } else {
                i2 = 0;
            }
            int i14 = i + i2;
            if (meetingRoomInformation.city_name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, meetingRoomInformation.city_name);
            } else {
                i3 = 0;
            }
            int i15 = i14 + i3;
            if (meetingRoomInformation.resource_strategy != null) {
                i4 = SchemaExtraData.ResourceStrategy.ADAPTER.encodedSizeWithTag(4, meetingRoomInformation.resource_strategy);
            } else {
                i4 = 0;
            }
            int i16 = i15 + i4;
            if (meetingRoomInformation.resource_requisition != null) {
                i5 = SchemaExtraData.ResourceRequisition.ADAPTER.encodedSizeWithTag(5, meetingRoomInformation.resource_requisition);
            } else {
                i5 = 0;
            }
            int i17 = i16 + i5;
            if (meetingRoomInformation.building_name != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, meetingRoomInformation.building_name);
            } else {
                i6 = 0;
            }
            int i18 = i17 + i6;
            if (meetingRoomInformation.is_customized != null) {
                i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, meetingRoomInformation.is_customized);
            } else {
                i7 = 0;
            }
            int i19 = i18 + i7;
            if (meetingRoomInformation.trigger != null) {
                i8 = SchemaExtraData.ApprovalTrigger.ADAPTER.encodedSizeWithTag(8, meetingRoomInformation.trigger);
            } else {
                i8 = 0;
            }
            int i20 = i19 + i8;
            if (meetingRoomInformation.should_show_summary != null) {
                i9 = ProtoAdapter.BOOL.encodedSizeWithTag(10, meetingRoomInformation.should_show_summary);
            } else {
                i9 = 0;
            }
            int i21 = i20 + i9;
            if (meetingRoomInformation.capacity != null) {
                i10 = ProtoAdapter.INT64.encodedSizeWithTag(20, meetingRoomInformation.capacity);
            } else {
                i10 = 0;
            }
            int encodedSizeWithTag = i21 + i10 + Equipment.ADAPTER.asRepeated().encodedSizeWithTag(21, meetingRoomInformation.equipments);
            if (meetingRoomInformation.is_approval != null) {
                i11 = ProtoAdapter.BOOL.encodedSizeWithTag(22, meetingRoomInformation.is_approval);
            } else {
                i11 = 0;
            }
            int i22 = encodedSizeWithTag + i11;
            if (meetingRoomInformation.remark != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(23, meetingRoomInformation.remark);
            } else {
                i12 = 0;
            }
            int i23 = i22 + i12;
            if (meetingRoomInformation.picture != null) {
                i13 = ProtoAdapter.STRING.encodedSizeWithTag(24, meetingRoomInformation.picture);
            }
            return i23 + i13 + MeetingRoomEquipment.ADAPTER.asRepeated().encodedSizeWithTag(25, meetingRoomInformation.equipment_lists) + meetingRoomInformation.unknownFields().size();
        }

        /* renamed from: a */
        public MeetingRoomInformation decode(ProtoReader protoReader) throws IOException {
            C15874a aVar = new C15874a();
            aVar.f41704a = "";
            aVar.f41705b = "";
            aVar.f41706c = "";
            aVar.f41709f = "";
            aVar.f41710g = false;
            aVar.f41712i = false;
            aVar.f41713j = 0L;
            aVar.f41715l = false;
            aVar.f41716m = "";
            aVar.f41717n = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 10) {
                    switch (nextTag) {
                        case 1:
                            aVar.f41704a = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 2:
                            aVar.f41705b = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f41706c = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f41707d = SchemaExtraData.ResourceStrategy.ADAPTER.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f41708e = SchemaExtraData.ResourceRequisition.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f41709f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f41710g = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f41711h = SchemaExtraData.ApprovalTrigger.ADAPTER.decode(protoReader);
                            continue;
                        default:
                            switch (nextTag) {
                                case 20:
                                    aVar.f41713j = ProtoAdapter.INT64.decode(protoReader);
                                    continue;
                                case 21:
                                    aVar.f41714k.add(Equipment.ADAPTER.decode(protoReader));
                                    continue;
                                case 22:
                                    aVar.f41715l = ProtoAdapter.BOOL.decode(protoReader);
                                    continue;
                                case 23:
                                    aVar.f41716m = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case 24:
                                    aVar.f41717n = ProtoAdapter.STRING.decode(protoReader);
                                    continue;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /*{ENCODED_INT: 25}*/:
                                    aVar.f41718o.add(MeetingRoomEquipment.ADAPTER.decode(protoReader));
                                    continue;
                                default:
                                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    continue;
                                    continue;
                            }
                    }
                } else {
                    aVar.f41712i = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MeetingRoomInformation meetingRoomInformation) throws IOException {
            if (meetingRoomInformation.floor_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, meetingRoomInformation.floor_name);
            }
            if (meetingRoomInformation.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, meetingRoomInformation.name);
            }
            if (meetingRoomInformation.city_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, meetingRoomInformation.city_name);
            }
            if (meetingRoomInformation.resource_strategy != null) {
                SchemaExtraData.ResourceStrategy.ADAPTER.encodeWithTag(protoWriter, 4, meetingRoomInformation.resource_strategy);
            }
            if (meetingRoomInformation.resource_requisition != null) {
                SchemaExtraData.ResourceRequisition.ADAPTER.encodeWithTag(protoWriter, 5, meetingRoomInformation.resource_requisition);
            }
            if (meetingRoomInformation.building_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, meetingRoomInformation.building_name);
            }
            if (meetingRoomInformation.is_customized != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, meetingRoomInformation.is_customized);
            }
            if (meetingRoomInformation.trigger != null) {
                SchemaExtraData.ApprovalTrigger.ADAPTER.encodeWithTag(protoWriter, 8, meetingRoomInformation.trigger);
            }
            if (meetingRoomInformation.should_show_summary != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, meetingRoomInformation.should_show_summary);
            }
            if (meetingRoomInformation.capacity != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, meetingRoomInformation.capacity);
            }
            Equipment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 21, meetingRoomInformation.equipments);
            if (meetingRoomInformation.is_approval != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 22, meetingRoomInformation.is_approval);
            }
            if (meetingRoomInformation.remark != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 23, meetingRoomInformation.remark);
            }
            if (meetingRoomInformation.picture != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 24, meetingRoomInformation.picture);
            }
            MeetingRoomEquipment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 25, meetingRoomInformation.equipment_lists);
            protoWriter.writeBytes(meetingRoomInformation.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MeetingRoomInformation$a */
    public static final class C15874a extends Message.Builder<MeetingRoomInformation, C15874a> {

        /* renamed from: a */
        public String f41704a;

        /* renamed from: b */
        public String f41705b;

        /* renamed from: c */
        public String f41706c;

        /* renamed from: d */
        public SchemaExtraData.ResourceStrategy f41707d;

        /* renamed from: e */
        public SchemaExtraData.ResourceRequisition f41708e;

        /* renamed from: f */
        public String f41709f;

        /* renamed from: g */
        public Boolean f41710g;

        /* renamed from: h */
        public SchemaExtraData.ApprovalTrigger f41711h;

        /* renamed from: i */
        public Boolean f41712i;

        /* renamed from: j */
        public Long f41713j;

        /* renamed from: k */
        public List<Equipment> f41714k = Internal.newMutableList();

        /* renamed from: l */
        public Boolean f41715l;

        /* renamed from: m */
        public String f41716m;

        /* renamed from: n */
        public String f41717n;

        /* renamed from: o */
        public List<MeetingRoomEquipment> f41718o = Internal.newMutableList();

        /* renamed from: a */
        public MeetingRoomInformation build() {
            return new MeetingRoomInformation(this.f41704a, this.f41705b, this.f41706c, this.f41707d, this.f41708e, this.f41709f, this.f41710g, this.f41711h, this.f41712i, this.f41713j, this.f41714k, this.f41715l, this.f41716m, this.f41717n, this.f41718o, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15874a newBuilder() {
        C15874a aVar = new C15874a();
        aVar.f41704a = this.floor_name;
        aVar.f41705b = this.name;
        aVar.f41706c = this.city_name;
        aVar.f41707d = this.resource_strategy;
        aVar.f41708e = this.resource_requisition;
        aVar.f41709f = this.building_name;
        aVar.f41710g = this.is_customized;
        aVar.f41711h = this.trigger;
        aVar.f41712i = this.should_show_summary;
        aVar.f41713j = this.capacity;
        aVar.f41714k = Internal.copyOf("equipments", this.equipments);
        aVar.f41715l = this.is_approval;
        aVar.f41716m = this.remark;
        aVar.f41717n = this.picture;
        aVar.f41718o = Internal.copyOf("equipment_lists", this.equipment_lists);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MeetingRoomInformation");
        StringBuilder sb = new StringBuilder();
        if (this.floor_name != null) {
            sb.append(", floor_name=");
            sb.append(this.floor_name);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.city_name != null) {
            sb.append(", city_name=");
            sb.append(this.city_name);
        }
        if (this.resource_strategy != null) {
            sb.append(", resource_strategy=");
            sb.append(this.resource_strategy);
        }
        if (this.resource_requisition != null) {
            sb.append(", resource_requisition=");
            sb.append(this.resource_requisition);
        }
        if (this.building_name != null) {
            sb.append(", building_name=");
            sb.append(this.building_name);
        }
        if (this.is_customized != null) {
            sb.append(", is_customized=");
            sb.append(this.is_customized);
        }
        if (this.trigger != null) {
            sb.append(", trigger=");
            sb.append(this.trigger);
        }
        if (this.should_show_summary != null) {
            sb.append(", should_show_summary=");
            sb.append(this.should_show_summary);
        }
        if (this.capacity != null) {
            sb.append(", capacity=");
            sb.append(this.capacity);
        }
        if (!this.equipments.isEmpty()) {
            sb.append(", equipments=");
            sb.append(this.equipments);
        }
        if (this.is_approval != null) {
            sb.append(", is_approval=");
            sb.append(this.is_approval);
        }
        if (this.remark != null) {
            sb.append(", remark=");
            sb.append(this.remark);
        }
        if (this.picture != null) {
            sb.append(", picture=");
            sb.append(this.picture);
        }
        if (!this.equipment_lists.isEmpty()) {
            sb.append(", equipment_lists=");
            sb.append(this.equipment_lists);
        }
        StringBuilder replace = sb.replace(0, 2, "MeetingRoomInformation{");
        replace.append('}');
        return replace.toString();
    }

    public MeetingRoomInformation(String str, String str2, String str3, SchemaExtraData.ResourceStrategy resourceStrategy, SchemaExtraData.ResourceRequisition resourceRequisition, String str4, Boolean bool, SchemaExtraData.ApprovalTrigger approvalTrigger, Boolean bool2, Long l, List<Equipment> list, Boolean bool3, String str5, String str6, List<MeetingRoomEquipment> list2) {
        this(str, str2, str3, resourceStrategy, resourceRequisition, str4, bool, approvalTrigger, bool2, l, list, bool3, str5, str6, list2, ByteString.EMPTY);
    }

    public MeetingRoomInformation(String str, String str2, String str3, SchemaExtraData.ResourceStrategy resourceStrategy, SchemaExtraData.ResourceRequisition resourceRequisition, String str4, Boolean bool, SchemaExtraData.ApprovalTrigger approvalTrigger, Boolean bool2, Long l, List<Equipment> list, Boolean bool3, String str5, String str6, List<MeetingRoomEquipment> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.floor_name = str;
        this.name = str2;
        this.city_name = str3;
        this.resource_strategy = resourceStrategy;
        this.resource_requisition = resourceRequisition;
        this.building_name = str4;
        this.is_customized = bool;
        this.trigger = approvalTrigger;
        this.should_show_summary = bool2;
        this.capacity = l;
        this.equipments = Internal.immutableCopyOf("equipments", list);
        this.is_approval = bool3;
        this.remark = str5;
        this.picture = str6;
        this.equipment_lists = Internal.immutableCopyOf("equipment_lists", list2);
    }
}
