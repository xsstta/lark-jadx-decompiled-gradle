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

public final class MGetServerInstancesResponse extends Message<MGetServerInstancesResponse, C15854a> {
    public static final ProtoAdapter<MGetServerInstancesResponse> ADAPTER = new C15855b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> calendar_id_timezone_map;
    public final List<CalendarEventInstance> instances;
    public final Map<String, Boolean> private_calendar_ids;
    public final Map<String, WorkHourSetting> work_hour_settings;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerInstancesResponse$a */
    public static final class C15854a extends Message.Builder<MGetServerInstancesResponse, C15854a> {

        /* renamed from: a */
        public List<CalendarEventInstance> f41670a = Internal.newMutableList();

        /* renamed from: b */
        public Map<String, Boolean> f41671b = Internal.newMutableMap();

        /* renamed from: c */
        public Map<String, String> f41672c = Internal.newMutableMap();

        /* renamed from: d */
        public Map<String, WorkHourSetting> f41673d = Internal.newMutableMap();

        /* renamed from: a */
        public MGetServerInstancesResponse build() {
            return new MGetServerInstancesResponse(this.f41670a, this.f41671b, this.f41672c, this.f41673d, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerInstancesResponse$b */
    private static final class C15855b extends ProtoAdapter<MGetServerInstancesResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Boolean>> f41674a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.BOOL);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, String>> f41675b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: c */
        private final ProtoAdapter<Map<String, WorkHourSetting>> f41676c = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, WorkHourSetting.ADAPTER);

        C15855b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerInstancesResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerInstancesResponse mGetServerInstancesResponse) {
            return CalendarEventInstance.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetServerInstancesResponse.instances) + this.f41674a.encodedSizeWithTag(2, mGetServerInstancesResponse.private_calendar_ids) + this.f41675b.encodedSizeWithTag(3, mGetServerInstancesResponse.calendar_id_timezone_map) + this.f41676c.encodedSizeWithTag(4, mGetServerInstancesResponse.work_hour_settings) + mGetServerInstancesResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerInstancesResponse decode(ProtoReader protoReader) throws IOException {
            C15854a aVar = new C15854a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41670a.add(CalendarEventInstance.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f41671b.putAll(this.f41674a.decode(protoReader));
                } else if (nextTag == 3) {
                    aVar.f41672c.putAll(this.f41675b.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41673d.putAll(this.f41676c.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerInstancesResponse mGetServerInstancesResponse) throws IOException {
            CalendarEventInstance.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetServerInstancesResponse.instances);
            this.f41674a.encodeWithTag(protoWriter, 2, mGetServerInstancesResponse.private_calendar_ids);
            this.f41675b.encodeWithTag(protoWriter, 3, mGetServerInstancesResponse.calendar_id_timezone_map);
            this.f41676c.encodeWithTag(protoWriter, 4, mGetServerInstancesResponse.work_hour_settings);
            protoWriter.writeBytes(mGetServerInstancesResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15854a newBuilder() {
        C15854a aVar = new C15854a();
        aVar.f41670a = Internal.copyOf("instances", this.instances);
        aVar.f41671b = Internal.copyOf("private_calendar_ids", this.private_calendar_ids);
        aVar.f41672c = Internal.copyOf("calendar_id_timezone_map", this.calendar_id_timezone_map);
        aVar.f41673d = Internal.copyOf("work_hour_settings", this.work_hour_settings);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetServerInstancesResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.instances.isEmpty()) {
            sb.append(", instances=");
            sb.append(this.instances);
        }
        if (!this.private_calendar_ids.isEmpty()) {
            sb.append(", private_calendar_ids=");
            sb.append(this.private_calendar_ids);
        }
        if (!this.calendar_id_timezone_map.isEmpty()) {
            sb.append(", calendar_id_timezone_map=");
            sb.append(this.calendar_id_timezone_map);
        }
        if (!this.work_hour_settings.isEmpty()) {
            sb.append(", work_hour_settings=");
            sb.append(this.work_hour_settings);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerInstancesResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerInstancesResponse(List<CalendarEventInstance> list, Map<String, Boolean> map, Map<String, String> map2, Map<String, WorkHourSetting> map3) {
        this(list, map, map2, map3, ByteString.EMPTY);
    }

    public MGetServerInstancesResponse(List<CalendarEventInstance> list, Map<String, Boolean> map, Map<String, String> map2, Map<String, WorkHourSetting> map3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.instances = Internal.immutableCopyOf("instances", list);
        this.private_calendar_ids = Internal.immutableCopyOf("private_calendar_ids", map);
        this.calendar_id_timezone_map = Internal.immutableCopyOf("calendar_id_timezone_map", map2);
        this.work_hour_settings = Internal.immutableCopyOf("work_hour_settings", map3);
    }
}
