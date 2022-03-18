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

public final class GetAttendeesByChatterIdsRequest extends Message<GetAttendeesByChatterIdsRequest, C15640a> {
    public static final ProtoAdapter<GetAttendeesByChatterIdsRequest> ADAPTER = new C15641b();
    private static final long serialVersionUID = 0;
    public final List<String> chatter_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAttendeesByChatterIdsRequest$b */
    private static final class C15641b extends ProtoAdapter<GetAttendeesByChatterIdsRequest> {
        C15641b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetAttendeesByChatterIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetAttendeesByChatterIdsRequest getAttendeesByChatterIdsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getAttendeesByChatterIdsRequest.chatter_ids) + getAttendeesByChatterIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetAttendeesByChatterIdsRequest decode(ProtoReader protoReader) throws IOException {
            C15640a aVar = new C15640a();
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
                    aVar.f41403a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetAttendeesByChatterIdsRequest getAttendeesByChatterIdsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getAttendeesByChatterIdsRequest.chatter_ids);
            protoWriter.writeBytes(getAttendeesByChatterIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetAttendeesByChatterIdsRequest$a */
    public static final class C15640a extends Message.Builder<GetAttendeesByChatterIdsRequest, C15640a> {

        /* renamed from: a */
        public List<String> f41403a = Internal.newMutableList();

        /* renamed from: a */
        public GetAttendeesByChatterIdsRequest build() {
            return new GetAttendeesByChatterIdsRequest(this.f41403a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15640a mo56671a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41403a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15640a newBuilder() {
        C15640a aVar = new C15640a();
        aVar.f41403a = Internal.copyOf("chatter_ids", this.chatter_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetAttendeesByChatterIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chatter_ids.isEmpty()) {
            sb.append(", chatter_ids=");
            sb.append(this.chatter_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetAttendeesByChatterIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetAttendeesByChatterIdsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetAttendeesByChatterIdsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_ids = Internal.immutableCopyOf("chatter_ids", list);
    }
}
