package com.ss.android.lark.pb.todo;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class SendTodoHeartbeatRequest extends Message<SendTodoHeartbeatRequest, C50074a> {
    public static final ProtoAdapter<SendTodoHeartbeatRequest> ADAPTER = new C50075b();
    private static final long serialVersionUID = 0;
    public final String mtodo_guid;

    /* renamed from: com.ss.android.lark.pb.todo.SendTodoHeartbeatRequest$b */
    private static final class C50075b extends ProtoAdapter<SendTodoHeartbeatRequest> {
        C50075b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendTodoHeartbeatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendTodoHeartbeatRequest sendTodoHeartbeatRequest) {
            int i;
            if (sendTodoHeartbeatRequest.mtodo_guid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, sendTodoHeartbeatRequest.mtodo_guid);
            } else {
                i = 0;
            }
            return i + sendTodoHeartbeatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendTodoHeartbeatRequest decode(ProtoReader protoReader) throws IOException {
            C50074a aVar = new C50074a();
            aVar.f125197a = "";
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
                    aVar.f125197a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendTodoHeartbeatRequest sendTodoHeartbeatRequest) throws IOException {
            if (sendTodoHeartbeatRequest.mtodo_guid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendTodoHeartbeatRequest.mtodo_guid);
            }
            protoWriter.writeBytes(sendTodoHeartbeatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.todo.SendTodoHeartbeatRequest$a */
    public static final class C50074a extends Message.Builder<SendTodoHeartbeatRequest, C50074a> {

        /* renamed from: a */
        public String f125197a;

        /* renamed from: a */
        public SendTodoHeartbeatRequest build() {
            return new SendTodoHeartbeatRequest(this.f125197a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50074a newBuilder() {
        C50074a aVar = new C50074a();
        aVar.f125197a = this.mtodo_guid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mtodo_guid != null) {
            sb.append(", todo_guid=");
            sb.append(this.mtodo_guid);
        }
        StringBuilder replace = sb.replace(0, 2, "SendTodoHeartbeatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendTodoHeartbeatRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public SendTodoHeartbeatRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtodo_guid = str;
    }
}
