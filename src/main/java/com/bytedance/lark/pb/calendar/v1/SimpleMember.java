package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.CalendarEventAttendee;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SimpleMember extends Message<SimpleMember, C16056a> {
    public static final ProtoAdapter<SimpleMember> ADAPTER = new C16057b();
    public static final CalendarEventAttendee.Status DEFAULT_STATUS = CalendarEventAttendee.Status.NEEDS_ACTION;
    private static final long serialVersionUID = 0;
    public final String calendar_id;
    public final CalendarEventAttendee.Status status;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SimpleMember$b */
    private static final class C16057b extends ProtoAdapter<SimpleMember> {
        C16057b() {
            super(FieldEncoding.LENGTH_DELIMITED, SimpleMember.class);
        }

        /* renamed from: a */
        public int encodedSize(SimpleMember simpleMember) {
            int i;
            int i2 = 0;
            if (simpleMember.calendar_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, simpleMember.calendar_id);
            } else {
                i = 0;
            }
            if (simpleMember.status != null) {
                i2 = CalendarEventAttendee.Status.ADAPTER.encodedSizeWithTag(2, simpleMember.status);
            }
            return i + i2 + simpleMember.unknownFields().size();
        }

        /* renamed from: a */
        public SimpleMember decode(ProtoReader protoReader) throws IOException {
            C16056a aVar = new C16056a();
            aVar.f42134a = "";
            aVar.f42135b = CalendarEventAttendee.Status.NEEDS_ACTION;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42134a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f42135b = CalendarEventAttendee.Status.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SimpleMember simpleMember) throws IOException {
            if (simpleMember.calendar_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, simpleMember.calendar_id);
            }
            if (simpleMember.status != null) {
                CalendarEventAttendee.Status.ADAPTER.encodeWithTag(protoWriter, 2, simpleMember.status);
            }
            protoWriter.writeBytes(simpleMember.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.SimpleMember$a */
    public static final class C16056a extends Message.Builder<SimpleMember, C16056a> {

        /* renamed from: a */
        public String f42134a;

        /* renamed from: b */
        public CalendarEventAttendee.Status f42135b;

        /* renamed from: a */
        public SimpleMember build() {
            return new SimpleMember(this.f42134a, this.f42135b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16056a mo57736a(CalendarEventAttendee.Status status) {
            this.f42135b = status;
            return this;
        }

        /* renamed from: a */
        public C16056a mo57737a(String str) {
            this.f42134a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16056a newBuilder() {
        C16056a aVar = new C16056a();
        aVar.f42134a = this.calendar_id;
        aVar.f42135b = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "SimpleMember");
        StringBuilder sb = new StringBuilder();
        if (this.calendar_id != null) {
            sb.append(", calendar_id=");
            sb.append(this.calendar_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "SimpleMember{");
        replace.append('}');
        return replace.toString();
    }

    public SimpleMember(String str, CalendarEventAttendee.Status status2) {
        this(str, status2, ByteString.EMPTY);
    }

    public SimpleMember(String str, CalendarEventAttendee.Status status2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_id = str;
        this.status = status2;
    }
}
