package com.bytedance.lark.pb.calendar.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteEventResponse extends Message<DeleteEventResponse, C15596a> {
    public static final ProtoAdapter<DeleteEventResponse> ADAPTER = new C15597b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DeleteEventResponse$b */
    private static final class C15597b extends ProtoAdapter<DeleteEventResponse> {
        C15597b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteEventResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteEventResponse deleteEventResponse) {
            return deleteEventResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteEventResponse decode(ProtoReader protoReader) throws IOException {
            C15596a aVar = new C15596a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteEventResponse deleteEventResponse) throws IOException {
            protoWriter.writeBytes(deleteEventResponse.unknownFields());
        }
    }

    public DeleteEventResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.DeleteEventResponse$a */
    public static final class C15596a extends Message.Builder<DeleteEventResponse, C15596a> {
        /* renamed from: a */
        public DeleteEventResponse build() {
            return new DeleteEventResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15596a newBuilder() {
        C15596a aVar = new C15596a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "DeleteEventResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteEventResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteEventResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
