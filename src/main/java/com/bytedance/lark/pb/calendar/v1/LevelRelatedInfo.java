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

public final class LevelRelatedInfo extends Message<LevelRelatedInfo, C15834a> {
    public static final ProtoAdapter<LevelRelatedInfo> ADAPTER = new C15835b();
    private static final long serialVersionUID = 0;
    public final Map<String, Long> level_weight;
    public final Map<String, Long> resource_weight;
    public final List<LevelContent> son_level_infos;
    public final List<CalendarResource> son_resources;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo$a */
    public static final class C15834a extends Message.Builder<LevelRelatedInfo, C15834a> {

        /* renamed from: a */
        public List<LevelContent> f41640a = Internal.newMutableList();

        /* renamed from: b */
        public List<CalendarResource> f41641b = Internal.newMutableList();

        /* renamed from: c */
        public Map<String, Long> f41642c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, Long> f41643d = Internal.newMutableMap();

        /* renamed from: a */
        public LevelRelatedInfo build() {
            return new LevelRelatedInfo(this.f41640a, this.f41641b, this.f41642c, this.f41643d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15834a mo57162a(List<LevelContent> list) {
            Internal.checkElementsNotNull(list);
            this.f41640a = list;
            return this;
        }

        /* renamed from: b */
        public C15834a mo57165b(List<CalendarResource> list) {
            Internal.checkElementsNotNull(list);
            this.f41641b = list;
            return this;
        }

        /* renamed from: a */
        public C15834a mo57163a(Map<String, Long> map) {
            Internal.checkElementsNotNull(map);
            this.f41642c = map;
            return this;
        }

        /* renamed from: b */
        public C15834a mo57166b(Map<String, Long> map) {
            Internal.checkElementsNotNull(map);
            this.f41643d = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.LevelRelatedInfo$b */
    private static final class C15835b extends ProtoAdapter<LevelRelatedInfo> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Long>> f41644a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Long>> f41645b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.INT64);

        C15835b() {
            super(FieldEncoding.LENGTH_DELIMITED, LevelRelatedInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(LevelRelatedInfo levelRelatedInfo) {
            return LevelContent.ADAPTER.asRepeated().encodedSizeWithTag(1, levelRelatedInfo.son_level_infos) + CalendarResource.ADAPTER.asRepeated().encodedSizeWithTag(2, levelRelatedInfo.son_resources) + this.f41644a.encodedSizeWithTag(3, levelRelatedInfo.resource_weight) + this.f41645b.encodedSizeWithTag(4, levelRelatedInfo.level_weight) + levelRelatedInfo.unknownFields().size();
        }

        /* renamed from: a */
        public LevelRelatedInfo decode(ProtoReader protoReader) throws IOException {
            C15834a aVar = new C15834a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41640a.add(LevelContent.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41641b.add(CalendarResource.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f41642c.putAll(this.f41644a.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41643d.putAll(this.f41645b.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LevelRelatedInfo levelRelatedInfo) throws IOException {
            LevelContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, levelRelatedInfo.son_level_infos);
            CalendarResource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, levelRelatedInfo.son_resources);
            this.f41644a.encodeWithTag(protoWriter, 3, levelRelatedInfo.resource_weight);
            this.f41645b.encodeWithTag(protoWriter, 4, levelRelatedInfo.level_weight);
            protoWriter.writeBytes(levelRelatedInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15834a newBuilder() {
        C15834a aVar = new C15834a();
        aVar.f41640a = Internal.copyOf("son_level_infos", this.son_level_infos);
        aVar.f41641b = Internal.copyOf("son_resources", this.son_resources);
        aVar.f41642c = Internal.copyOf("resource_weight", this.resource_weight);
        aVar.f41643d = Internal.copyOf("level_weight", this.level_weight);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "LevelRelatedInfo");
        StringBuilder sb = new StringBuilder();
        if (!this.son_level_infos.isEmpty()) {
            sb.append(", son_level_infos=");
            sb.append(this.son_level_infos);
        }
        if (!this.son_resources.isEmpty()) {
            sb.append(", son_resources=");
            sb.append(this.son_resources);
        }
        if (!this.resource_weight.isEmpty()) {
            sb.append(", resource_weight=");
            sb.append(this.resource_weight);
        }
        if (!this.level_weight.isEmpty()) {
            sb.append(", level_weight=");
            sb.append(this.level_weight);
        }
        StringBuilder replace = sb.replace(0, 2, "LevelRelatedInfo{");
        replace.append('}');
        return replace.toString();
    }

    public LevelRelatedInfo(List<LevelContent> list, List<CalendarResource> list2, Map<String, Long> map, Map<String, Long> map2) {
        this(list, list2, map, map2, ByteString.EMPTY);
    }

    public LevelRelatedInfo(List<LevelContent> list, List<CalendarResource> list2, Map<String, Long> map, Map<String, Long> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.son_level_infos = Internal.immutableCopyOf("son_level_infos", list);
        this.son_resources = Internal.immutableCopyOf("son_resources", list2);
        this.resource_weight = Internal.immutableCopyOf("resource_weight", map);
        this.level_weight = Internal.immutableCopyOf("level_weight", map2);
    }
}
