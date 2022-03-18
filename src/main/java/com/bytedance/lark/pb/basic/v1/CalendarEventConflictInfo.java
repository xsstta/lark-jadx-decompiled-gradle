package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CalendarEventConflictInfo extends Message<CalendarEventConflictInfo, C14710a> {
    public static final ProtoAdapter<CalendarEventConflictInfo> ADAPTER = new C14711b();
    public static final Long DEFAULT_CONFLICT_TIME = 0L;
    public static final ConflictType DEFAULT_CONFLICT_TYPE = ConflictType.NONE;
    private static final long serialVersionUID = 0;
    public final Long conflict_time;
    public final ConflictType conflict_type;

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarEventConflictInfo$b */
    private static final class C14711b extends ProtoAdapter<CalendarEventConflictInfo> {
        C14711b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarEventConflictInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarEventConflictInfo calendarEventConflictInfo) {
            int i;
            int i2 = 0;
            if (calendarEventConflictInfo.conflict_type != null) {
                i = ConflictType.ADAPTER.encodedSizeWithTag(1, calendarEventConflictInfo.conflict_type);
            } else {
                i = 0;
            }
            if (calendarEventConflictInfo.conflict_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, calendarEventConflictInfo.conflict_time);
            }
            return i + i2 + calendarEventConflictInfo.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarEventConflictInfo decode(ProtoReader protoReader) throws IOException {
            C14710a aVar = new C14710a();
            aVar.f38892a = ConflictType.NONE;
            aVar.f38893b = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f38892a = ConflictType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38893b = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarEventConflictInfo calendarEventConflictInfo) throws IOException {
            if (calendarEventConflictInfo.conflict_type != null) {
                ConflictType.ADAPTER.encodeWithTag(protoWriter, 1, calendarEventConflictInfo.conflict_type);
            }
            if (calendarEventConflictInfo.conflict_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, calendarEventConflictInfo.conflict_time);
            }
            protoWriter.writeBytes(calendarEventConflictInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.CalendarEventConflictInfo$a */
    public static final class C14710a extends Message.Builder<CalendarEventConflictInfo, C14710a> {

        /* renamed from: a */
        public ConflictType f38892a;

        /* renamed from: b */
        public Long f38893b;

        /* renamed from: a */
        public CalendarEventConflictInfo build() {
            return new CalendarEventConflictInfo(this.f38892a, this.f38893b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14710a newBuilder() {
        C14710a aVar = new C14710a();
        aVar.f38892a = this.conflict_type;
        aVar.f38893b = this.conflict_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "CalendarEventConflictInfo");
        StringBuilder sb = new StringBuilder();
        if (this.conflict_type != null) {
            sb.append(", conflict_type=");
            sb.append(this.conflict_type);
        }
        if (this.conflict_time != null) {
            sb.append(", conflict_time=");
            sb.append(this.conflict_time);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarEventConflictInfo{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarEventConflictInfo(ConflictType conflictType, Long l) {
        this(conflictType, l, ByteString.EMPTY);
    }

    public CalendarEventConflictInfo(ConflictType conflictType, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conflict_type = conflictType;
        this.conflict_time = l;
    }
}
