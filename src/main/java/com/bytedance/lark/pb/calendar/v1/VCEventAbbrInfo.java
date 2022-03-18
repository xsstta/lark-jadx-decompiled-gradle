package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEvent;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class VCEventAbbrInfo extends Message<VCEventAbbrInfo, C16116a> {
    public static final ProtoAdapter<VCEventAbbrInfo> ADAPTER = new C16117b();
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Boolean DEFAULT_IS_ALL_DAY = false;
    public static final Boolean DEFAULT_IS_CROSS_TENANT = false;
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    public static final CalendarEvent.Source DEFAULT_SOURCE = CalendarEvent.Source.UNKNOWN_SOURCE;
    public static final Long DEFAULT_START_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final Long end_time;
    public final String event_id;
    public final Boolean is_all_day;
    public final Boolean is_cross_tenant;
    public final String key;
    public final String organizer_id;
    public final Long original_time;
    public final String server_id;
    public final CalendarEvent.Source source;
    public final Long start_time;
    public final String topic;
    public final String unique_id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.VCEventAbbrInfo$b */
    private static final class C16117b extends ProtoAdapter<VCEventAbbrInfo> {
        C16117b() {
            super(FieldEncoding.LENGTH_DELIMITED, VCEventAbbrInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(VCEventAbbrInfo vCEventAbbrInfo) {
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
            int i12 = 0;
            if (vCEventAbbrInfo.event_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, vCEventAbbrInfo.event_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.encodedSizeWithTag(2, vCEventAbbrInfo.unique_id);
            if (vCEventAbbrInfo.start_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(3, vCEventAbbrInfo.start_time);
            } else {
                i2 = 0;
            }
            int i13 = encodedSizeWithTag + i2;
            if (vCEventAbbrInfo.end_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(4, vCEventAbbrInfo.end_time);
            } else {
                i3 = 0;
            }
            int i14 = i13 + i3;
            if (vCEventAbbrInfo.topic != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, vCEventAbbrInfo.topic);
            } else {
                i4 = 0;
            }
            int i15 = i14 + i4;
            if (vCEventAbbrInfo.is_cross_tenant != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, vCEventAbbrInfo.is_cross_tenant);
            } else {
                i5 = 0;
            }
            int i16 = i15 + i5;
            if (vCEventAbbrInfo.is_all_day != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, vCEventAbbrInfo.is_all_day);
            } else {
                i6 = 0;
            }
            int i17 = i16 + i6;
            if (vCEventAbbrInfo.source != null) {
                i7 = CalendarEvent.Source.ADAPTER.encodedSizeWithTag(8, vCEventAbbrInfo.source);
            } else {
                i7 = 0;
            }
            int i18 = i17 + i7;
            if (vCEventAbbrInfo.server_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(9, vCEventAbbrInfo.server_id);
            } else {
                i8 = 0;
            }
            int i19 = i18 + i8;
            if (vCEventAbbrInfo.calendar_id != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(10, vCEventAbbrInfo.calendar_id);
            } else {
                i9 = 0;
            }
            int i20 = i19 + i9;
            if (vCEventAbbrInfo.key != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(11, vCEventAbbrInfo.key);
            } else {
                i10 = 0;
            }
            int i21 = i20 + i10;
            if (vCEventAbbrInfo.original_time != null) {
                i11 = ProtoAdapter.INT64.encodedSizeWithTag(12, vCEventAbbrInfo.original_time);
            } else {
                i11 = 0;
            }
            int i22 = i21 + i11;
            if (vCEventAbbrInfo.organizer_id != null) {
                i12 = ProtoAdapter.STRING.encodedSizeWithTag(13, vCEventAbbrInfo.organizer_id);
            }
            return i22 + i12 + vCEventAbbrInfo.unknownFields().size();
        }

        /* renamed from: a */
        public VCEventAbbrInfo decode(ProtoReader protoReader) throws IOException {
            C16116a aVar = new C16116a();
            aVar.f42206a = "";
            aVar.f42207b = "";
            aVar.f42208c = 0L;
            aVar.f42209d = 0L;
            aVar.f42210e = "";
            aVar.f42211f = false;
            aVar.f42212g = false;
            aVar.f42213h = CalendarEvent.Source.UNKNOWN_SOURCE;
            aVar.f42214i = "";
            aVar.f42215j = "";
            aVar.f42216k = "";
            aVar.f42217l = 0L;
            aVar.f42218m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f42206a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f42207b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f42208c = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            aVar.f42209d = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            aVar.f42210e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f42211f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f42212g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            try {
                                aVar.f42213h = CalendarEvent.Source.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 9:
                            aVar.f42214i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f42215j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            aVar.f42216k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                            aVar.f42217l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 13:
                            aVar.f42218m = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VCEventAbbrInfo vCEventAbbrInfo) throws IOException {
            if (vCEventAbbrInfo.event_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, vCEventAbbrInfo.event_id);
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, vCEventAbbrInfo.unique_id);
            if (vCEventAbbrInfo.start_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, vCEventAbbrInfo.start_time);
            }
            if (vCEventAbbrInfo.end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, vCEventAbbrInfo.end_time);
            }
            if (vCEventAbbrInfo.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, vCEventAbbrInfo.topic);
            }
            if (vCEventAbbrInfo.is_cross_tenant != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, vCEventAbbrInfo.is_cross_tenant);
            }
            if (vCEventAbbrInfo.is_all_day != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, vCEventAbbrInfo.is_all_day);
            }
            if (vCEventAbbrInfo.source != null) {
                CalendarEvent.Source.ADAPTER.encodeWithTag(protoWriter, 8, vCEventAbbrInfo.source);
            }
            if (vCEventAbbrInfo.server_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, vCEventAbbrInfo.server_id);
            }
            if (vCEventAbbrInfo.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, vCEventAbbrInfo.calendar_id);
            }
            if (vCEventAbbrInfo.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, vCEventAbbrInfo.key);
            }
            if (vCEventAbbrInfo.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 12, vCEventAbbrInfo.original_time);
            }
            if (vCEventAbbrInfo.organizer_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, vCEventAbbrInfo.organizer_id);
            }
            protoWriter.writeBytes(vCEventAbbrInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.VCEventAbbrInfo$a */
    public static final class C16116a extends Message.Builder<VCEventAbbrInfo, C16116a> {

        /* renamed from: a */
        public String f42206a;

        /* renamed from: b */
        public String f42207b;

        /* renamed from: c */
        public Long f42208c;

        /* renamed from: d */
        public Long f42209d;

        /* renamed from: e */
        public String f42210e;

        /* renamed from: f */
        public Boolean f42211f;

        /* renamed from: g */
        public Boolean f42212g;

        /* renamed from: h */
        public CalendarEvent.Source f42213h;

        /* renamed from: i */
        public String f42214i;

        /* renamed from: j */
        public String f42215j;

        /* renamed from: k */
        public String f42216k;

        /* renamed from: l */
        public Long f42217l;

        /* renamed from: m */
        public String f42218m;

        /* renamed from: a */
        public VCEventAbbrInfo build() {
            String str = this.f42207b;
            if (str != null) {
                return new VCEventAbbrInfo(this.f42206a, str, this.f42208c, this.f42209d, this.f42210e, this.f42211f, this.f42212g, this.f42213h, this.f42214i, this.f42215j, this.f42216k, this.f42217l, this.f42218m, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "unique_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C16116a newBuilder() {
        C16116a aVar = new C16116a();
        aVar.f42206a = this.event_id;
        aVar.f42207b = this.unique_id;
        aVar.f42208c = this.start_time;
        aVar.f42209d = this.end_time;
        aVar.f42210e = this.topic;
        aVar.f42211f = this.is_cross_tenant;
        aVar.f42212g = this.is_all_day;
        aVar.f42213h = this.source;
        aVar.f42214i = this.server_id;
        aVar.f42215j = this.calendar_id;
        aVar.f42216k = this.key;
        aVar.f42217l = this.original_time;
        aVar.f42218m = this.organizer_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "VCEventAbbrInfo");
        StringBuilder sb = new StringBuilder();
        if (this.event_id != null) {
            sb.append(", event_id=");
            sb.append(this.event_id);
        }
        sb.append(", unique_id=");
        sb.append(this.unique_id);
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.is_cross_tenant != null) {
            sb.append(", is_cross_tenant=");
            sb.append(this.is_cross_tenant);
        }
        if (this.is_all_day != null) {
            sb.append(", is_all_day=");
            sb.append(this.is_all_day);
        }
        if (this.source != null) {
            sb.append(", source=");
            sb.append(this.source);
        }
        if (this.server_id != null) {
            sb.append(", server_id=");
            sb.append(this.server_id);
        }
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.key != null) {
            sb.append(", key=");
            sb.append(this.key);
        }
        if (this.original_time != null) {
            sb.append(", original_time=");
            sb.append(this.original_time);
        }
        if (this.organizer_id != null) {
            sb.append(", organizer_id=");
            sb.append(this.organizer_id);
        }
        StringBuilder replace = sb.replace(0, 2, "VCEventAbbrInfo{");
        replace.append('}');
        return replace.toString();
    }

    public VCEventAbbrInfo(String str, String str2, Long l, Long l2, String str3, Boolean bool, Boolean bool2, CalendarEvent.Source source2, String str4, String str5, String str6, Long l3, String str7) {
        this(str, str2, l, l2, str3, bool, bool2, source2, str4, str5, str6, l3, str7, ByteString.EMPTY);
    }

    public VCEventAbbrInfo(String str, String str2, Long l, Long l2, String str3, Boolean bool, Boolean bool2, CalendarEvent.Source source2, String str4, String str5, String str6, Long l3, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_id = str;
        this.unique_id = str2;
        this.start_time = l;
        this.end_time = l2;
        this.topic = str3;
        this.is_cross_tenant = bool;
        this.is_all_day = bool2;
        this.source = source2;
        this.server_id = str4;
        this.calendar_id = str5;
        this.key = str6;
        this.original_time = l3;
        this.organizer_id = str7;
    }
}
