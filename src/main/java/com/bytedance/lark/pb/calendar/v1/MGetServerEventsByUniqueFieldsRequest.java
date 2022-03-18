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

public final class MGetServerEventsByUniqueFieldsRequest extends Message<MGetServerEventsByUniqueFieldsRequest, C15844a> {
    public static final ProtoAdapter<MGetServerEventsByUniqueFieldsRequest> ADAPTER = new C15845b();
    private static final long serialVersionUID = 0;
    public final List<CalendarEventUniqueField> unique_fields;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsByUniqueFieldsRequest$b */
    private static final class C15845b extends ProtoAdapter<MGetServerEventsByUniqueFieldsRequest> {
        C15845b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetServerEventsByUniqueFieldsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetServerEventsByUniqueFieldsRequest mGetServerEventsByUniqueFieldsRequest) {
            return CalendarEventUniqueField.ADAPTER.asRepeated().encodedSizeWithTag(1, mGetServerEventsByUniqueFieldsRequest.unique_fields) + mGetServerEventsByUniqueFieldsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetServerEventsByUniqueFieldsRequest decode(ProtoReader protoReader) throws IOException {
            C15844a aVar = new C15844a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f41658a.add(CalendarEventUniqueField.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetServerEventsByUniqueFieldsRequest mGetServerEventsByUniqueFieldsRequest) throws IOException {
            CalendarEventUniqueField.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mGetServerEventsByUniqueFieldsRequest.unique_fields);
            protoWriter.writeBytes(mGetServerEventsByUniqueFieldsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetServerEventsByUniqueFieldsRequest$a */
    public static final class C15844a extends Message.Builder<MGetServerEventsByUniqueFieldsRequest, C15844a> {

        /* renamed from: a */
        public List<CalendarEventUniqueField> f41658a = Internal.newMutableList();

        /* renamed from: a */
        public MGetServerEventsByUniqueFieldsRequest build() {
            return new MGetServerEventsByUniqueFieldsRequest(this.f41658a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15844a mo57187a(List<CalendarEventUniqueField> list) {
            Internal.checkElementsNotNull(list);
            this.f41658a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15844a newBuilder() {
        C15844a aVar = new C15844a();
        aVar.f41658a = Internal.copyOf("unique_fields", this.unique_fields);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetServerEventsByUniqueFieldsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.unique_fields.isEmpty()) {
            sb.append(", unique_fields=");
            sb.append(this.unique_fields);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetServerEventsByUniqueFieldsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetServerEventsByUniqueFieldsRequest(List<CalendarEventUniqueField> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetServerEventsByUniqueFieldsRequest(List<CalendarEventUniqueField> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.unique_fields = Internal.immutableCopyOf("unique_fields", list);
    }
}
