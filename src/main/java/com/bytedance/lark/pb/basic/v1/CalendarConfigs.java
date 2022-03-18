package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.RedDotUiItem;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class CalendarConfigs extends Message<CalendarConfigs, C14706a> {
    public static final ProtoAdapter<CalendarConfigs> ADAPTER = new C14707b();
    private static final long serialVersionUID = 0;
    public final String cal_dav_domain;
    public final List<RedDotUiItem> red_dot_items;

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarConfigs$b */
    private static final class C14707b extends ProtoAdapter<CalendarConfigs> {
        C14707b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarConfigs.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarConfigs calendarConfigs) {
            int i;
            int encodedSizeWithTag = RedDotUiItem.ADAPTER.asRepeated().encodedSizeWithTag(1, calendarConfigs.red_dot_items);
            if (calendarConfigs.cal_dav_domain != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, calendarConfigs.cal_dav_domain);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + calendarConfigs.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarConfigs decode(ProtoReader protoReader) throws IOException {
            C14706a aVar = new C14706a();
            aVar.f38877b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38876a.add(RedDotUiItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38877b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarConfigs calendarConfigs) throws IOException {
            RedDotUiItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, calendarConfigs.red_dot_items);
            if (calendarConfigs.cal_dav_domain != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, calendarConfigs.cal_dav_domain);
            }
            protoWriter.writeBytes(calendarConfigs.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarConfigs$a */
    public static final class C14706a extends Message.Builder<CalendarConfigs, C14706a> {

        /* renamed from: a */
        public List<RedDotUiItem> f38876a = Internal.newMutableList();

        /* renamed from: b */
        public String f38877b;

        /* renamed from: a */
        public CalendarConfigs build() {
            return new CalendarConfigs(this.f38876a, this.f38877b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14706a newBuilder() {
        C14706a aVar = new C14706a();
        aVar.f38876a = Internal.copyOf("red_dot_items", this.red_dot_items);
        aVar.f38877b = this.cal_dav_domain;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CalendarConfigs");
        StringBuilder sb = new StringBuilder();
        if (!this.red_dot_items.isEmpty()) {
            sb.append(", red_dot_items=");
            sb.append(this.red_dot_items);
        }
        if (this.cal_dav_domain != null) {
            sb.append(", cal_dav_domain=");
            sb.append(this.cal_dav_domain);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarConfigs{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarConfigs(List<RedDotUiItem> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public CalendarConfigs(List<RedDotUiItem> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.red_dot_items = Internal.immutableCopyOf("red_dot_items", list);
        this.cal_dav_domain = str;
    }
}
