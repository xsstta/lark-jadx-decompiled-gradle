package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DeleteCalendarRequest extends Message<DeleteCalendarRequest, C15592a> {
    public static final ProtoAdapter<DeleteCalendarRequest> ADAPTER = new C15593b();
    private static final long serialVersionUID = 0;
    public final String id;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DeleteCalendarRequest$b */
    private static final class C15593b extends ProtoAdapter<DeleteCalendarRequest> {
        C15593b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteCalendarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteCalendarRequest deleteCalendarRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteCalendarRequest.id) + deleteCalendarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteCalendarRequest decode(ProtoReader protoReader) throws IOException {
            C15592a aVar = new C15592a();
            aVar.f41324a = "";
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
                    aVar.f41324a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteCalendarRequest deleteCalendarRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteCalendarRequest.id);
            protoWriter.writeBytes(deleteCalendarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DeleteCalendarRequest$a */
    public static final class C15592a extends Message.Builder<DeleteCalendarRequest, C15592a> {

        /* renamed from: a */
        public String f41324a;

        /* renamed from: a */
        public DeleteCalendarRequest build() {
            String str = this.f41324a;
            if (str != null) {
                return new DeleteCalendarRequest(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        /* renamed from: a */
        public C15592a mo56549a(String str) {
            this.f41324a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C15592a newBuilder() {
        C15592a aVar = new C15592a();
        aVar.f41324a = this.id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "DeleteCalendarRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        StringBuilder replace = sb.replace(0, 2, "DeleteCalendarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteCalendarRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteCalendarRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
    }
}
