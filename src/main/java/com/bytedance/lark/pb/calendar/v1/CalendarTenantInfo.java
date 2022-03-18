package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarTenantInfo extends Message<CalendarTenantInfo, C15568a> {
    public static final ProtoAdapter<CalendarTenantInfo> ADAPTER = new C15569b();
    private static final long serialVersionUID = 0;
    public final String tenant_id;
    public final String tenant_name;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo$b */
    private static final class C15569b extends ProtoAdapter<CalendarTenantInfo> {
        C15569b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarTenantInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarTenantInfo calendarTenantInfo) {
            int i;
            int i2 = 0;
            if (calendarTenantInfo.tenant_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, calendarTenantInfo.tenant_id);
            } else {
                i = 0;
            }
            if (calendarTenantInfo.tenant_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarTenantInfo.tenant_name);
            }
            return i + i2 + calendarTenantInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarTenantInfo decode(ProtoReader protoReader) throws IOException {
            C15568a aVar = new C15568a();
            aVar.f41300a = "";
            aVar.f41301b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41300a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41301b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarTenantInfo calendarTenantInfo) throws IOException {
            if (calendarTenantInfo.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, calendarTenantInfo.tenant_id);
            }
            if (calendarTenantInfo.tenant_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarTenantInfo.tenant_name);
            }
            protoWriter.writeBytes(calendarTenantInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo$a */
    public static final class C15568a extends Message.Builder<CalendarTenantInfo, C15568a> {

        /* renamed from: a */
        public String f41300a;

        /* renamed from: b */
        public String f41301b;

        /* renamed from: a */
        public CalendarTenantInfo build() {
            return new CalendarTenantInfo(this.f41300a, this.f41301b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15568a mo56487a(String str) {
            this.f41300a = str;
            return this;
        }

        /* renamed from: b */
        public C15568a mo56489b(String str) {
            this.f41301b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15568a newBuilder() {
        C15568a aVar = new C15568a();
        aVar.f41300a = this.tenant_id;
        aVar.f41301b = this.tenant_name;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarTenantInfo");
        StringBuilder sb = new StringBuilder();
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.tenant_name != null) {
            sb.append(", tenant_name=");
            sb.append(this.tenant_name);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarTenantInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarTenantInfo(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CalendarTenantInfo(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tenant_id = str;
        this.tenant_name = str2;
    }
}
