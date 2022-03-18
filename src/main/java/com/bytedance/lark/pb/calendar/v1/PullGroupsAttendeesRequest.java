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

public final class PullGroupsAttendeesRequest extends Message<PullGroupsAttendeesRequest, C15938a> {
    public static final ProtoAdapter<PullGroupsAttendeesRequest> ADAPTER = new C15939b();
    private static final long serialVersionUID = 0;
    public final List<String> ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullGroupsAttendeesRequest$b */
    private static final class C15939b extends ProtoAdapter<PullGroupsAttendeesRequest> {
        C15939b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullGroupsAttendeesRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PullGroupsAttendeesRequest pullGroupsAttendeesRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, pullGroupsAttendeesRequest.ids) + pullGroupsAttendeesRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PullGroupsAttendeesRequest decode(ProtoReader protoReader) throws IOException {
            C15938a aVar = new C15938a();
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
                    aVar.f41920a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullGroupsAttendeesRequest pullGroupsAttendeesRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, pullGroupsAttendeesRequest.ids);
            protoWriter.writeBytes(pullGroupsAttendeesRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.PullGroupsAttendeesRequest$a */
    public static final class C15938a extends Message.Builder<PullGroupsAttendeesRequest, C15938a> {

        /* renamed from: a */
        public List<String> f41920a = Internal.newMutableList();

        /* renamed from: a */
        public PullGroupsAttendeesRequest build() {
            return new PullGroupsAttendeesRequest(this.f41920a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15938a mo57441a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41920a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15938a newBuilder() {
        C15938a aVar = new C15938a();
        aVar.f41920a = Internal.copyOf("ids", this.ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "PullGroupsAttendeesRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.ids.isEmpty()) {
            sb.append(", ids=");
            sb.append(this.ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PullGroupsAttendeesRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PullGroupsAttendeesRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public PullGroupsAttendeesRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ids = Internal.immutableCopyOf("ids", list);
    }
}
