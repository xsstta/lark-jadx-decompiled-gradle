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

public final class GetUserAttendeeBaseInfosRequest extends Message<GetUserAttendeeBaseInfosRequest, C15804a> {
    public static final ProtoAdapter<GetUserAttendeeBaseInfosRequest> ADAPTER = new C15805b();
    private static final long serialVersionUID = 0;
    public final List<String> calendar_ids;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUserAttendeeBaseInfosRequest$b */
    private static final class C15805b extends ProtoAdapter<GetUserAttendeeBaseInfosRequest> {
        C15805b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserAttendeeBaseInfosRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserAttendeeBaseInfosRequest getUserAttendeeBaseInfosRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getUserAttendeeBaseInfosRequest.calendar_ids) + getUserAttendeeBaseInfosRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserAttendeeBaseInfosRequest decode(ProtoReader protoReader) throws IOException {
            C15804a aVar = new C15804a();
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
                    aVar.f41584a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserAttendeeBaseInfosRequest getUserAttendeeBaseInfosRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getUserAttendeeBaseInfosRequest.calendar_ids);
            protoWriter.writeBytes(getUserAttendeeBaseInfosRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.GetUserAttendeeBaseInfosRequest$a */
    public static final class C15804a extends Message.Builder<GetUserAttendeeBaseInfosRequest, C15804a> {

        /* renamed from: a */
        public List<String> f41584a = Internal.newMutableList();

        /* renamed from: a */
        public GetUserAttendeeBaseInfosRequest build() {
            return new GetUserAttendeeBaseInfosRequest(this.f41584a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C15804a mo57074a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f41584a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15804a newBuilder() {
        C15804a aVar = new C15804a();
        aVar.f41584a = Internal.copyOf("calendar_ids", this.calendar_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "GetUserAttendeeBaseInfosRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.calendar_ids.isEmpty()) {
            sb.append(", calendar_ids=");
            sb.append(this.calendar_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserAttendeeBaseInfosRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserAttendeeBaseInfosRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public GetUserAttendeeBaseInfosRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.calendar_ids = Internal.immutableCopyOf("calendar_ids", list);
    }
}
