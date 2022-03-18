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

public final class BuildingFloorFilter extends Message<BuildingFloorFilter, C15498a> {
    public static final ProtoAdapter<BuildingFloorFilter> ADAPTER = new C15499b();
    private static final long serialVersionUID = 0;
    public final String building_id;
    public final List<String> needed_floors;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.BuildingFloorFilter$b */
    private static final class C15499b extends ProtoAdapter<BuildingFloorFilter> {
        C15499b() {
            super(FieldEncoding.LENGTH_DELIMITED, BuildingFloorFilter.class);
        }

        /* renamed from: a */
        public int encodedSize(BuildingFloorFilter buildingFloorFilter) {
            int i;
            if (buildingFloorFilter.building_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, buildingFloorFilter.building_id);
            } else {
                i = 0;
            }
            return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, buildingFloorFilter.needed_floors) + buildingFloorFilter.unknownFields().size();
        }

        /* renamed from: a */
        public BuildingFloorFilter decode(ProtoReader protoReader) throws IOException {
            C15498a aVar = new C15498a();
            aVar.f40957a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40957a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40958b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, BuildingFloorFilter buildingFloorFilter) throws IOException {
            if (buildingFloorFilter.building_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, buildingFloorFilter.building_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, buildingFloorFilter.needed_floors);
            protoWriter.writeBytes(buildingFloorFilter.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.BuildingFloorFilter$a */
    public static final class C15498a extends Message.Builder<BuildingFloorFilter, C15498a> {

        /* renamed from: a */
        public String f40957a;

        /* renamed from: b */
        public List<String> f40958b = Internal.newMutableList();

        /* renamed from: a */
        public BuildingFloorFilter build() {
            return new BuildingFloorFilter(this.f40957a, this.f40958b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15498a mo56104a(String str) {
            this.f40957a = str;
            return this;
        }

        /* renamed from: a */
        public C15498a mo56105a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f40958b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15498a newBuilder() {
        C15498a aVar = new C15498a();
        aVar.f40957a = this.building_id;
        aVar.f40958b = Internal.copyOf("needed_floors", this.needed_floors);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "BuildingFloorFilter");
        StringBuilder sb = new StringBuilder();
        if (this.building_id != null) {
            sb.append(", building_id=");
            sb.append(this.building_id);
        }
        if (!this.needed_floors.isEmpty()) {
            sb.append(", needed_floors=");
            sb.append(this.needed_floors);
        }
        StringBuilder replace = sb.replace(0, 2, "BuildingFloorFilter{");
        replace.append('}');
        return replace.toString();
    }

    public BuildingFloorFilter(String str, List<String> list) {
        this(str, list, ByteString.EMPTY);
    }

    public BuildingFloorFilter(String str, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.building_id = str;
        this.needed_floors = Internal.immutableCopyOf("needed_floors", list);
    }
}
