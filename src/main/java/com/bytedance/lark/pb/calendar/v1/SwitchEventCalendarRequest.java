package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SwitchEventCalendarRequest extends Message<SwitchEventCalendarRequest, C16072a> {
    public static final ProtoAdapter<SwitchEventCalendarRequest> ADAPTER = new C16073b();
    public static final Long DEFAULT_ORIGINAL_TIME = 0L;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final String destination_calendar_id;
    public final String key;
    public final Long original_time;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SwitchEventCalendarRequest$b */
    private static final class C16073b extends ProtoAdapter<SwitchEventCalendarRequest> {
        C16073b() {
            super(FieldEncoding.LENGTH_DELIMITED, SwitchEventCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SwitchEventCalendarRequest switchEventCalendarRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (switchEventCalendarRequest.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, switchEventCalendarRequest.calendar_id);
            } else {
                i = 0;
            }
            if (switchEventCalendarRequest.key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, switchEventCalendarRequest.key);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (switchEventCalendarRequest.original_time != null) {
                i3 = ProtoAdapter.INT64.encodedSizeWithTag(3, switchEventCalendarRequest.original_time);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (switchEventCalendarRequest.destination_calendar_id != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, switchEventCalendarRequest.destination_calendar_id);
            }
            return i6 + i4 + switchEventCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SwitchEventCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C16072a aVar = new C16072a();
            aVar.f42160a = "";
            aVar.f42161b = "";
            aVar.f42162c = 0L;
            aVar.f42163d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42160a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42161b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f42162c = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42163d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SwitchEventCalendarRequest switchEventCalendarRequest) throws IOException {
            if (switchEventCalendarRequest.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, switchEventCalendarRequest.calendar_id);
            }
            if (switchEventCalendarRequest.key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, switchEventCalendarRequest.key);
            }
            if (switchEventCalendarRequest.original_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, switchEventCalendarRequest.original_time);
            }
            if (switchEventCalendarRequest.destination_calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, switchEventCalendarRequest.destination_calendar_id);
            }
            protoWriter.writeBytes(switchEventCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SwitchEventCalendarRequest$a */
    public static final class C16072a extends Message.Builder<SwitchEventCalendarRequest, C16072a> {

        /* renamed from: a */
        public String f42160a;

        /* renamed from: b */
        public String f42161b;

        /* renamed from: c */
        public Long f42162c;

        /* renamed from: d */
        public String f42163d;

        /* renamed from: a */
        public SwitchEventCalendarRequest build() {
            return new SwitchEventCalendarRequest(this.f42160a, this.f42161b, this.f42162c, this.f42163d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16072a mo57774a(Long l) {
            this.f42162c = l;
            return this;
        }

        /* renamed from: b */
        public C16072a mo57777b(String str) {
            this.f42161b = str;
            return this;
        }

        /* renamed from: c */
        public C16072a mo57778c(String str) {
            this.f42163d = str;
            return this;
        }

        /* renamed from: a */
        public C16072a mo57775a(String str) {
            this.f42160a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16072a newBuilder() {
        C16072a aVar = new C16072a();
        aVar.f42160a = this.calendar_id;
        aVar.f42161b = this.key;
        aVar.f42162c = this.original_time;
        aVar.f42163d = this.destination_calendar_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SwitchEventCalendarRequest");
        StringBuilder sb = new StringBuilder();
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
        if (this.destination_calendar_id != null) {
            sb.append(", destination_calendar_id=");
            sb.append(this.destination_calendar_id);
        }
        StringBuilder replace = sb.replace(0, 2, "SwitchEventCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SwitchEventCalendarRequest(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, ByteString.EMPTY);
    }

    public SwitchEventCalendarRequest(String str, String str2, Long l, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.key = str2;
        this.original_time = l;
        this.destination_calendar_id = str3;
    }
}
