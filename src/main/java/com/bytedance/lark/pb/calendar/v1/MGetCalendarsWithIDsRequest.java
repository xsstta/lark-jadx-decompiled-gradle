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

public final class MGetCalendarsWithIDsRequest extends Message<MGetCalendarsWithIDsRequest, C15836a> {
    public static final ProtoAdapter<MGetCalendarsWithIDsRequest> ADAPTER = new C15837b();
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetCalendarsWithIDsRequest$b */
    private static final class C15837b extends ProtoAdapter<MGetCalendarsWithIDsRequest> {
        C15837b() {
            super(FieldEncoding.LENGTH_DELIMITED, MGetCalendarsWithIDsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MGetCalendarsWithIDsRequest mGetCalendarsWithIDsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mGetCalendarsWithIDsRequest.calendar_ids) + mGetCalendarsWithIDsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MGetCalendarsWithIDsRequest decode(ProtoReader protoReader) throws IOException {
            C15836a aVar = new C15836a();
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
                    aVar.f41646a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MGetCalendarsWithIDsRequest mGetCalendarsWithIDsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mGetCalendarsWithIDsRequest.calendar_ids);
            protoWriter.writeBytes(mGetCalendarsWithIDsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.MGetCalendarsWithIDsRequest$a */
    public static final class C15836a extends Message.Builder<MGetCalendarsWithIDsRequest, C15836a> {

        /* renamed from: a */
        public List<String> f41646a = Internal.newMutableList();

        /* renamed from: a */
        public MGetCalendarsWithIDsRequest build() {
            return new MGetCalendarsWithIDsRequest(this.f41646a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15836a mo57170a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41646a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15836a newBuilder() {
        C15836a aVar = new C15836a();
        aVar.f41646a = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "MGetCalendarsWithIDsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MGetCalendarsWithIDsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MGetCalendarsWithIDsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MGetCalendarsWithIDsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
    }
}
