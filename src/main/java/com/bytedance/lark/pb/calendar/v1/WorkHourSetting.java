package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class WorkHourSetting extends Message<WorkHourSetting, C16124a> {
    public static final ProtoAdapter<WorkHourSetting> ADAPTER = new C16125b();
    public static final Boolean DEFAULT_ENABLE_WORK_HOUR = false;
    public static final Boolean DEFAULT_IS_FIRST_SET = true;
    private static final long serialVersionUID = 0;
    public final Boolean enable_work_hour;
    public final Boolean is_first_set;
    public final Map<String, WorkHourItem> work_hour_items;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.WorkHourSetting$a */
    public static final class C16124a extends Message.Builder<WorkHourSetting, C16124a> {

        /* renamed from: a */
        public Boolean f42231a;

        /* renamed from: b */
        public Map<String, WorkHourItem> f42232b = Internal.newMutableMap();

        /* renamed from: c */
        public Boolean f42233c;

        /* renamed from: a */
        public WorkHourSetting build() {
            return new WorkHourSetting(this.f42231a, this.f42232b, this.f42233c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.WorkHourSetting$b */
    private static final class C16125b extends ProtoAdapter<WorkHourSetting> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, WorkHourItem>> f42234a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, WorkHourItem.ADAPTER);

        C16125b() {
            super(FieldEncoding.LENGTH_DELIMITED, WorkHourSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(WorkHourSetting workHourSetting) {
            int i;
            int i2 = 0;
            if (workHourSetting.enable_work_hour != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, workHourSetting.enable_work_hour);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + this.f42234a.encodedSizeWithTag(2, workHourSetting.work_hour_items);
            if (workHourSetting.is_first_set != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, workHourSetting.is_first_set);
            }
            return encodedSizeWithTag + i2 + workHourSetting.unknownFields().size();
        }

        /* renamed from: a */
        public WorkHourSetting decode(ProtoReader protoReader) throws IOException {
            C16124a aVar = new C16124a();
            aVar.f42231a = false;
            aVar.f42233c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42231a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42232b.putAll(this.f42234a.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42233c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, WorkHourSetting workHourSetting) throws IOException {
            if (workHourSetting.enable_work_hour != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, workHourSetting.enable_work_hour);
            }
            this.f42234a.encodeWithTag(protoWriter, 2, workHourSetting.work_hour_items);
            if (workHourSetting.is_first_set != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, workHourSetting.is_first_set);
            }
            protoWriter.writeBytes(workHourSetting.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16124a newBuilder() {
        C16124a aVar = new C16124a();
        aVar.f42231a = this.enable_work_hour;
        aVar.f42232b = Internal.copyOf("work_hour_items", this.work_hour_items);
        aVar.f42233c = this.is_first_set;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "WorkHourSetting");
        StringBuilder sb = new StringBuilder();
        if (this.enable_work_hour != null) {
            sb.append(", enable_work_hour=");
            sb.append(this.enable_work_hour);
        }
        if (!this.work_hour_items.isEmpty()) {
            sb.append(", work_hour_items=");
            sb.append(this.work_hour_items);
        }
        if (this.is_first_set != null) {
            sb.append(", is_first_set=");
            sb.append(this.is_first_set);
        }
        StringBuilder replace = sb.replace(0, 2, "WorkHourSetting{");
        replace.append('}');
        return replace.toString();
    }

    public WorkHourSetting(Boolean bool, Map<String, WorkHourItem> map, Boolean bool2) {
        this(bool, map, bool2, ByteString.EMPTY);
    }

    public WorkHourSetting(Boolean bool, Map<String, WorkHourItem> map, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enable_work_hour = bool;
        this.work_hour_items = Internal.immutableCopyOf("work_hour_items", map);
        this.is_first_set = bool2;
    }
}
