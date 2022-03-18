package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUndoResponse extends Message<MailUndoResponse, C16924a> {
    public static final ProtoAdapter<MailUndoResponse> ADAPTER = new C16925b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUndoResponse$b */
    private static final class C16925b extends ProtoAdapter<MailUndoResponse> {
        C16925b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUndoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUndoResponse mailUndoResponse) {
            return mailUndoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailUndoResponse decode(ProtoReader protoReader) throws IOException {
            C16924a aVar = new C16924a();
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
        public void encode(ProtoWriter protoWriter, MailUndoResponse mailUndoResponse) throws IOException {
            protoWriter.writeBytes(mailUndoResponse.unknownFields());
        }
    }

    public MailUndoResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUndoResponse$a */
    public static final class C16924a extends Message.Builder<MailUndoResponse, C16924a> {
        /* renamed from: a */
        public MailUndoResponse build() {
            return new MailUndoResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16924a newBuilder() {
        C16924a aVar = new C16924a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUndoResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailUndoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailUndoResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
