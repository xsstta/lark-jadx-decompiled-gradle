package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendGrootCellsResponse extends Message<SendGrootCellsResponse, C51010a> {
    public static final ProtoAdapter<SendGrootCellsResponse> ADAPTER = new C51011b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendGrootCellsResponse$b */
    private static final class C51011b extends ProtoAdapter<SendGrootCellsResponse> {
        C51011b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendGrootCellsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendGrootCellsResponse sendGrootCellsResponse) {
            return sendGrootCellsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendGrootCellsResponse decode(ProtoReader protoReader) throws IOException {
            C51010a aVar = new C51010a();
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
        public void encode(ProtoWriter protoWriter, SendGrootCellsResponse sendGrootCellsResponse) throws IOException {
            protoWriter.writeBytes(sendGrootCellsResponse.unknownFields());
        }
    }

    public SendGrootCellsResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SendGrootCellsResponse$a */
    public static final class C51010a extends Message.Builder<SendGrootCellsResponse, C51010a> {
        /* renamed from: a */
        public SendGrootCellsResponse build() {
            return new SendGrootCellsResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51010a newBuilder() {
        C51010a aVar = new C51010a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SendGrootCellsResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "SendGrootCellsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendGrootCellsResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
