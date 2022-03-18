package com.ss.android.lark.pb.mails;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.mailentities.MailRequestBase;
import java.io.IOException;
import okio.ByteString;

public final class DeleteMailExternalContactRequest extends Message<DeleteMailExternalContactRequest, C49829a> {
    public static final ProtoAdapter<DeleteMailExternalContactRequest> ADAPTER = new C49830b();
    private static final long serialVersionUID = 0;
    public final MailRequestBase mbase;
    public final String mmail_address;

    /* renamed from: com.ss.android.lark.pb.mails.DeleteMailExternalContactRequest$b */
    private static final class C49830b extends ProtoAdapter<DeleteMailExternalContactRequest> {
        C49830b() {
            super(FieldEncoding.LENGTH_DELIMITED, DeleteMailExternalContactRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(DeleteMailExternalContactRequest deleteMailExternalContactRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMailExternalContactRequest.mmail_address);
            if (deleteMailExternalContactRequest.mbase != null) {
                i = MailRequestBase.ADAPTER.encodedSizeWithTag(255, deleteMailExternalContactRequest.mbase);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + deleteMailExternalContactRequest.unknownFields().size();
        }

        /* renamed from: a */
        public DeleteMailExternalContactRequest decode(ProtoReader protoReader) throws IOException {
            C49829a aVar = new C49829a();
            aVar.f124780a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124780a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 255) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124781b = MailRequestBase.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DeleteMailExternalContactRequest deleteMailExternalContactRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMailExternalContactRequest.mmail_address);
            if (deleteMailExternalContactRequest.mbase != null) {
                MailRequestBase.ADAPTER.encodeWithTag(protoWriter, 255, deleteMailExternalContactRequest.mbase);
            }
            protoWriter.writeBytes(deleteMailExternalContactRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mails.DeleteMailExternalContactRequest$a */
    public static final class C49829a extends Message.Builder<DeleteMailExternalContactRequest, C49829a> {

        /* renamed from: a */
        public String f124780a;

        /* renamed from: b */
        public MailRequestBase f124781b;

        /* renamed from: a */
        public DeleteMailExternalContactRequest build() {
            String str = this.f124780a;
            if (str != null) {
                return new DeleteMailExternalContactRequest(str, this.f124781b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mmail_address");
        }

        /* renamed from: a */
        public C49829a mo173414a(MailRequestBase mailRequestBase) {
            this.f124781b = mailRequestBase;
            return this;
        }

        /* renamed from: a */
        public C49829a mo173415a(String str) {
            this.f124780a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49829a newBuilder() {
        C49829a aVar = new C49829a();
        aVar.f124780a = this.mmail_address;
        aVar.f124781b = this.mbase;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", mail_address=");
        sb.append(this.mmail_address);
        if (this.mbase != null) {
            sb.append(", base=");
            sb.append(this.mbase);
        }
        StringBuilder replace = sb.replace(0, 2, "DeleteMailExternalContactRequest{");
        replace.append('}');
        return replace.toString();
    }

    public DeleteMailExternalContactRequest(String str, MailRequestBase mailRequestBase) {
        this(str, mailRequestBase, ByteString.EMPTY);
    }

    public DeleteMailExternalContactRequest(String str, MailRequestBase mailRequestBase, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmail_address = str;
        this.mbase = mailRequestBase;
    }
}
