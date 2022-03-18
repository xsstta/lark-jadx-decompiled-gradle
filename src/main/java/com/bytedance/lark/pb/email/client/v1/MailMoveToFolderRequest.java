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

public final class MailMoveToFolderRequest extends Message<MailMoveToFolderRequest, C16828a> {
    public static final ProtoAdapter<MailMoveToFolderRequest> ADAPTER = new C16829b();
    private static final long serialVersionUID = 0;
    public final String from_id;
    public final List<String> thread_ids;
    public final String to_folder;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveToFolderRequest$b */
    private static final class C16829b extends ProtoAdapter<MailMoveToFolderRequest> {
        C16829b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailMoveToFolderRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailMoveToFolderRequest mailMoveToFolderRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, mailMoveToFolderRequest.thread_ids);
            int i2 = 0;
            if (mailMoveToFolderRequest.from_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, mailMoveToFolderRequest.from_id);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (mailMoveToFolderRequest.to_folder != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailMoveToFolderRequest.to_folder);
            }
            return i3 + i2 + mailMoveToFolderRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailMoveToFolderRequest decode(ProtoReader protoReader) throws IOException {
            C16828a aVar = new C16828a();
            aVar.f43297b = "";
            aVar.f43298c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43296a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f43297b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43298c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailMoveToFolderRequest mailMoveToFolderRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, mailMoveToFolderRequest.thread_ids);
            if (mailMoveToFolderRequest.from_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailMoveToFolderRequest.from_id);
            }
            if (mailMoveToFolderRequest.to_folder != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailMoveToFolderRequest.to_folder);
            }
            protoWriter.writeBytes(mailMoveToFolderRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailMoveToFolderRequest$a */
    public static final class C16828a extends Message.Builder<MailMoveToFolderRequest, C16828a> {

        /* renamed from: a */
        public List<String> f43296a = Internal.newMutableList();

        /* renamed from: b */
        public String f43297b;

        /* renamed from: c */
        public String f43298c;

        /* renamed from: a */
        public MailMoveToFolderRequest build() {
            return new MailMoveToFolderRequest(this.f43296a, this.f43297b, this.f43298c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16828a newBuilder() {
        C16828a aVar = new C16828a();
        aVar.f43296a = Internal.copyOf("thread_ids", this.thread_ids);
        aVar.f43297b = this.from_id;
        aVar.f43298c = this.to_folder;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailMoveToFolderRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.thread_ids.isEmpty()) {
            sb.append(", thread_ids=");
            sb.append(this.thread_ids);
        }
        if (this.from_id != null) {
            sb.append(", from_id=");
            sb.append(this.from_id);
        }
        if (this.to_folder != null) {
            sb.append(", to_folder=");
            sb.append(this.to_folder);
        }
        StringBuilder replace = sb.replace(0, 2, "MailMoveToFolderRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailMoveToFolderRequest(List<String> list, String str, String str2) {
        this(list, str, str2, ByteString.EMPTY);
    }

    public MailMoveToFolderRequest(List<String> list, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_ids = Internal.immutableCopyOf("thread_ids", list);
        this.from_id = str;
        this.to_folder = str2;
    }
}
