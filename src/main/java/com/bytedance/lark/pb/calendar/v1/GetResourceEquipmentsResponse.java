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
import java.util.Map;
import okio.ByteString;

public final class GetResourceEquipmentsResponse extends Message<GetResourceEquipmentsResponse, C15774a> {
    public static final ProtoAdapter<GetResourceEquipmentsResponse> ADAPTER = new C15775b();
    private static final long serialVersionUID = 0;
    public final List<String> equipment_ids;
    public final Map<String, MeetingRoomEquipment> equipment_lists;
    public final Map<String, Equipment> equipments;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceEquipmentsResponse$a */
    public static final class C15774a extends Message.Builder<GetResourceEquipmentsResponse, C15774a> {

        /* renamed from: a */
        public Map<String, Equipment> f41539a = Internal.newMutableMap();

        /* renamed from: b */
        public List<String> f41540b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, MeetingRoomEquipment> f41541c = Internal.newMutableMap();

        /* renamed from: a */
        public GetResourceEquipmentsResponse build() {
            return new GetResourceEquipmentsResponse(this.f41539a, this.f41540b, this.f41541c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetResourceEquipmentsResponse$b */
    private static final class C15775b extends ProtoAdapter<GetResourceEquipmentsResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Equipment>> f41542a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Equipment.ADAPTER);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, MeetingRoomEquipment>> f41543b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, MeetingRoomEquipment.ADAPTER);

        C15775b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetResourceEquipmentsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetResourceEquipmentsResponse getResourceEquipmentsResponse) {
            return this.f41542a.encodedSizeWithTag(1, getResourceEquipmentsResponse.equipments) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, getResourceEquipmentsResponse.equipment_ids) + this.f41543b.encodedSizeWithTag(3, getResourceEquipmentsResponse.equipment_lists) + getResourceEquipmentsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetResourceEquipmentsResponse decode(ProtoReader protoReader) throws IOException {
            C15774a aVar = new C15774a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41539a.putAll(this.f41542a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41540b.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41541c.putAll(this.f41543b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetResourceEquipmentsResponse getResourceEquipmentsResponse) throws IOException {
            this.f41542a.encodeWithTag(protoWriter, 1, getResourceEquipmentsResponse.equipments);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, getResourceEquipmentsResponse.equipment_ids);
            this.f41543b.encodeWithTag(protoWriter, 3, getResourceEquipmentsResponse.equipment_lists);
            protoWriter.writeBytes(getResourceEquipmentsResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15774a newBuilder() {
        C15774a aVar = new C15774a();
        aVar.f41539a = Internal.copyOf("equipments", this.equipments);
        aVar.f41540b = Internal.copyOf("equipment_ids", this.equipment_ids);
        aVar.f41541c = Internal.copyOf("equipment_lists", this.equipment_lists);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetResourceEquipmentsResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.equipments.isEmpty()) {
            sb.append(", equipments=");
            sb.append(this.equipments);
        }
        if (!this.equipment_ids.isEmpty()) {
            sb.append(", equipment_ids=");
            sb.append(this.equipment_ids);
        }
        if (!this.equipment_lists.isEmpty()) {
            sb.append(", equipment_lists=");
            sb.append(this.equipment_lists);
        }
        StringBuilder replace = sb.replace(0, 2, "GetResourceEquipmentsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetResourceEquipmentsResponse(Map<String, Equipment> map, List<String> list, Map<String, MeetingRoomEquipment> map2) {
        this(map, list, map2, ByteString.EMPTY);
    }

    public GetResourceEquipmentsResponse(Map<String, Equipment> map, List<String> list, Map<String, MeetingRoomEquipment> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.equipments = Internal.immutableCopyOf("equipments", map);
        this.equipment_ids = Internal.immutableCopyOf("equipment_ids", list);
        this.equipment_lists = Internal.immutableCopyOf("equipment_lists", map2);
    }
}
