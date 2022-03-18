package com.bytedance.lark.pb.email.client.v1;

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

public final class MailSearchInWhichFolderRequest extends Message<MailSearchInWhichFolderRequest, C16870a> {
    public static final ProtoAdapter<MailSearchInWhichFolderRequest> ADAPTER = new C16871b();
    private static final long serialVersionUID = 0;
    public final List<String> message_ids;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderRequest$b */
    private static final class C16871b extends ProtoAdapter<MailSearchInWhichFolderRequest> {
        C16871b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSearchInWhichFolderRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSearchInWhichFolderRequest mailSearchInWhichFolderRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailSearchInWhichFolderRequest.message_ids) + mailSearchInWhichFolderRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailSearchInWhichFolderRequest decode(ProtoReader protoReader) throws IOException {
            C16870a aVar = new C16870a();
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
                    aVar.f43334a.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSearchInWhichFolderRequest mailSearchInWhichFolderRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailSearchInWhichFolderRequest.message_ids);
            protoWriter.writeBytes(mailSearchInWhichFolderRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderRequest$a */
    public static final class C16870a extends Message.Builder<MailSearchInWhichFolderRequest, C16870a> {

        /* renamed from: a */
        public List<String> f43334a = Internal.newMutableList();

        /* renamed from: a */
        public MailSearchInWhichFolderRequest build() {
            return new MailSearchInWhichFolderRequest(this.f43334a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16870a mo59692a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43334a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16870a newBuilder() {
        C16870a aVar = new C16870a();
        aVar.f43334a = Internal.copyOf("message_ids", this.message_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSearchInWhichFolderRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.message_ids.isEmpty()) {
            sb.append(", message_ids=");
            sb.append(this.message_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSearchInWhichFolderRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailSearchInWhichFolderRequest(List<String> list) {
        this(list, ByteString.EMPTY);
    }

    public MailSearchInWhichFolderRequest(List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_ids = Internal.immutableCopyOf("message_ids", list);
    }
}
