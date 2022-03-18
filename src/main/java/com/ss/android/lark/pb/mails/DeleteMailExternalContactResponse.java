package com.ss.android.lark.pb.mails;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DeleteMailExternalContactResponse extends Message<DeleteMailExternalContactResponse, C49831a> {
    public static final ProtoAdapter<DeleteMailExternalContactResponse> ADAPTER = new C49832b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.mails.DeleteMailExternalContactResponse$b */
    private static final class C49832b extends ProtoAdapter<DeleteMailExternalContactResponse> {
        C49832b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMailExternalContactResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteMailExternalContactResponse deleteMailExternalContactResponse) {
            return deleteMailExternalContactResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteMailExternalContactResponse decode(ProtoReader protoReader) throws IOException {
            C49831a aVar = new C49831a();
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
        public void encode(ProtoWriter protoWriter, DeleteMailExternalContactResponse deleteMailExternalContactResponse) throws IOException {
            protoWriter.writeBytes(deleteMailExternalContactResponse.unknownFields());
        }
    }

    public DeleteMailExternalContactResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.mails.DeleteMailExternalContactResponse$a */
    public static final class C49831a extends Message.Builder<DeleteMailExternalContactResponse, C49831a> {
        /* renamed from: a */
        public DeleteMailExternalContactResponse build() {
            return new DeleteMailExternalContactResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49831a newBuilder() {
        C49831a aVar = new C49831a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "DeleteMailExternalContactResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMailExternalContactResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
