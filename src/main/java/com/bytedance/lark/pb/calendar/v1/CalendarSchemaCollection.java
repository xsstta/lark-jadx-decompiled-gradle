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

public final class CalendarSchemaCollection extends Message<CalendarSchemaCollection, C15560a> {
    public static final ProtoAdapter<CalendarSchemaCollection> ADAPTER = new C15561b();
    private static final long serialVersionUID = 0;
    public final CalendarSchemaCompatibility compatibility;
    public final List<EntitySchema> entity_schemas;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSchemaCollection$b */
    private static final class C15561b extends ProtoAdapter<CalendarSchemaCollection> {
        C15561b() {
            super(FieldEncoding.LENGTH_DELIMITED, CalendarSchemaCollection.class);
        }

        /* renamed from: a */
        public int encodedSize(CalendarSchemaCollection calendarSchemaCollection) {
            int i;
            int encodedSizeWithTag = EntitySchema.ADAPTER.asRepeated().encodedSizeWithTag(1, calendarSchemaCollection.entity_schemas);
            if (calendarSchemaCollection.compatibility != null) {
                i = CalendarSchemaCompatibility.ADAPTER.encodedSizeWithTag(2, calendarSchemaCollection.compatibility);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + calendarSchemaCollection.unknownFields().size();
        }

        /* renamed from: a */
        public CalendarSchemaCollection decode(ProtoReader protoReader) throws IOException {
            C15560a aVar = new C15560a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f41263a.add(EntitySchema.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41264b = CalendarSchemaCompatibility.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CalendarSchemaCollection calendarSchemaCollection) throws IOException {
            EntitySchema.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, calendarSchemaCollection.entity_schemas);
            if (calendarSchemaCollection.compatibility != null) {
                CalendarSchemaCompatibility.ADAPTER.encodeWithTag(protoWriter, 2, calendarSchemaCollection.compatibility);
            }
            protoWriter.writeBytes(calendarSchemaCollection.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.CalendarSchemaCollection$a */
    public static final class C15560a extends Message.Builder<CalendarSchemaCollection, C15560a> {

        /* renamed from: a */
        public List<EntitySchema> f41263a = Internal.newMutableList();

        /* renamed from: b */
        public CalendarSchemaCompatibility f41264b;

        /* renamed from: a */
        public CalendarSchemaCollection build() {
            return new CalendarSchemaCollection(this.f41263a, this.f41264b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15560a mo56447a(CalendarSchemaCompatibility calendarSchemaCompatibility) {
            this.f41264b = calendarSchemaCompatibility;
            return this;
        }

        /* renamed from: a */
        public C15560a mo56448a(List<EntitySchema> list) {
            Internal.checkElementsNotNull(list);
            this.f41263a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15560a newBuilder() {
        C15560a aVar = new C15560a();
        aVar.f41263a = Internal.copyOf("entity_schemas", this.entity_schemas);
        aVar.f41264b = this.compatibility;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "CalendarSchemaCollection");
        StringBuilder sb = new StringBuilder();
        if (!this.entity_schemas.isEmpty()) {
            sb.append(", entity_schemas=");
            sb.append(this.entity_schemas);
        }
        if (this.compatibility != null) {
            sb.append(", compatibility=");
            sb.append(this.compatibility);
        }
        StringBuilder replace = sb.replace(0, 2, "CalendarSchemaCollection{");
        replace.append('}');
        return replace.toString();
    }

    public CalendarSchemaCollection(List<EntitySchema> list, CalendarSchemaCompatibility calendarSchemaCompatibility) {
        this(list, calendarSchemaCompatibility, ByteString.EMPTY);
    }

    public CalendarSchemaCollection(List<EntitySchema> list, CalendarSchemaCompatibility calendarSchemaCompatibility, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entity_schemas = Internal.immutableCopyOf("entity_schemas", list);
        this.compatibility = calendarSchemaCompatibility;
    }
}
