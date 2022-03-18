package com.ss.android.lark.pb.todo;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendTodoHeartbeatResponse extends Message<SendTodoHeartbeatResponse, C50076a> {
    public static final ProtoAdapter<SendTodoHeartbeatResponse> ADAPTER = new C50077b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.todo.SendTodoHeartbeatResponse$b */
    private static final class C50077b extends ProtoAdapter<SendTodoHeartbeatResponse> {
        C50077b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendTodoHeartbeatResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(SendTodoHeartbeatResponse sendTodoHeartbeatResponse) {
            return sendTodoHeartbeatResponse.unknownFields().size();
        }

        /* renamed from: a */
        public SendTodoHeartbeatResponse decode(ProtoReader protoReader) throws IOException {
            C50076a aVar = new C50076a();
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
        public void encode(ProtoWriter protoWriter, SendTodoHeartbeatResponse sendTodoHeartbeatResponse) throws IOException {
            protoWriter.writeBytes(sendTodoHeartbeatResponse.unknownFields());
        }
    }

    public SendTodoHeartbeatResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.todo.SendTodoHeartbeatResponse$a */
    public static final class C50076a extends Message.Builder<SendTodoHeartbeatResponse, C50076a> {
        /* renamed from: a */
        public SendTodoHeartbeatResponse build() {
            return new SendTodoHeartbeatResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50076a newBuilder() {
        C50076a aVar = new C50076a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "SendTodoHeartbeatResponse{");
        replace.append('}');
        return replace.toString();
    }

    public SendTodoHeartbeatResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
