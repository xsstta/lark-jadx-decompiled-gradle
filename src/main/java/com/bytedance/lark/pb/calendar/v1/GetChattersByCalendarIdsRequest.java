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

public final class GetChattersByCalendarIdsRequest extends Message<GetChattersByCalendarIdsRequest, C15684a> {
    public static final ProtoAdapter<GetChattersByCalendarIdsRequest> ADAPTER = new C15685b();
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChattersByCalendarIdsRequest$b */
    private static final class C15685b extends ProtoAdapter<GetChattersByCalendarIdsRequest> {
        C15685b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetChattersByCalendarIdsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetChattersByCalendarIdsRequest getChattersByCalendarIdsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getChattersByCalendarIdsRequest.calendar_ids) + getChattersByCalendarIdsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetChattersByCalendarIdsRequest decode(ProtoReader protoReader) throws IOException {
            C15684a aVar = new C15684a();
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
                    aVar.f41446a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetChattersByCalendarIdsRequest getChattersByCalendarIdsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getChattersByCalendarIdsRequest.calendar_ids);
            protoWriter.writeBytes(getChattersByCalendarIdsRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetChattersByCalendarIdsRequest$a */
    public static final class C15684a extends Message.Builder<GetChattersByCalendarIdsRequest, C15684a> {

        /* renamed from: a */
        public List<String> f41446a = Internal.newMutableList();

        /* renamed from: a */
        public GetChattersByCalendarIdsRequest build() {
            return new GetChattersByCalendarIdsRequest(this.f41446a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15684a mo56780a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41446a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15684a newBuilder() {
        C15684a aVar = new C15684a();
        aVar.f41446a = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetChattersByCalendarIdsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetChattersByCalendarIdsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetChattersByCalendarIdsRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetChattersByCalendarIdsRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
    }
}
