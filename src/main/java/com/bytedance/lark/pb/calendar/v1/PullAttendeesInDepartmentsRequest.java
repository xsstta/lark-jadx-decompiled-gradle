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

public final class PullAttendeesInDepartmentsRequest extends Message<PullAttendeesInDepartmentsRequest, C15916a> {
    public static final ProtoAdapter<PullAttendeesInDepartmentsRequest> ADAPTER = new C15917b();
    private static final long serialVersionUID = 0;
    public final List<String> department_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsRequest$b */
    private static final class C15917b extends ProtoAdapter<PullAttendeesInDepartmentsRequest> {
        C15917b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAttendeesInDepartmentsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAttendeesInDepartmentsRequest pullAttendeesInDepartmentsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pullAttendeesInDepartmentsRequest.department_ids) + pullAttendeesInDepartmentsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullAttendeesInDepartmentsRequest decode(ProtoReader protoReader) throws IOException {
            C15916a aVar = new C15916a();
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
                    aVar.f41876a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAttendeesInDepartmentsRequest pullAttendeesInDepartmentsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pullAttendeesInDepartmentsRequest.department_ids);
            protoWriter.writeBytes(pullAttendeesInDepartmentsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullAttendeesInDepartmentsRequest$a */
    public static final class C15916a extends Message.Builder<PullAttendeesInDepartmentsRequest, C15916a> {

        /* renamed from: a */
        public List<String> f41876a = Internal.newMutableList();

        /* renamed from: a */
        public PullAttendeesInDepartmentsRequest build() {
            return new PullAttendeesInDepartmentsRequest(this.f41876a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15916a mo57373a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41876a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15916a newBuilder() {
        C15916a aVar = new C15916a();
        aVar.f41876a = Internal.copyOf("department_ids", this.department_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullAttendeesInDepartmentsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.department_ids.isEmpty()) {
            sb.append(", department_ids=");
            sb.append(this.department_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAttendeesInDepartmentsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullAttendeesInDepartmentsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PullAttendeesInDepartmentsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.department_ids = Internal.immutableCopyOf("department_ids", list);
    }
}
