package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailAddFolderRequest extends Message<MailAddFolderRequest, C16628a> {
    public static final ProtoAdapter<MailAddFolderRequest> ADAPTER = new C16629b();
    private static final long serialVersionUID = 0;
    public final String folder_name;
    public final String parent_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddFolderRequest$b */
    private static final class C16629b extends ProtoAdapter<MailAddFolderRequest> {
        C16629b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailAddFolderRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailAddFolderRequest mailAddFolderRequest) {
            int i;
            int i2 = 0;
            if (mailAddFolderRequest.folder_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailAddFolderRequest.folder_name);
            } else {
                i = 0;
            }
            if (mailAddFolderRequest.parent_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailAddFolderRequest.parent_id);
            }
            return i + i2 + mailAddFolderRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailAddFolderRequest decode(ProtoReader protoReader) throws IOException {
            C16628a aVar = new C16628a();
            aVar.f43064a = "";
            aVar.f43065b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43064a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43065b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailAddFolderRequest mailAddFolderRequest) throws IOException {
            if (mailAddFolderRequest.folder_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailAddFolderRequest.folder_name);
            }
            if (mailAddFolderRequest.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailAddFolderRequest.parent_id);
            }
            protoWriter.writeBytes(mailAddFolderRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailAddFolderRequest$a */
    public static final class C16628a extends Message.Builder<MailAddFolderRequest, C16628a> {

        /* renamed from: a */
        public String f43064a;

        /* renamed from: b */
        public String f43065b;

        /* renamed from: a */
        public MailAddFolderRequest build() {
            return new MailAddFolderRequest(this.f43064a, this.f43065b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16628a newBuilder() {
        C16628a aVar = new C16628a();
        aVar.f43064a = this.folder_name;
        aVar.f43065b = this.parent_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailAddFolderRequest");
        StringBuilder sb = new StringBuilder();
        if (this.folder_name != null) {
            sb.append(", folder_name=");
            sb.append(this.folder_name);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailAddFolderRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailAddFolderRequest(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailAddFolderRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.folder_name = str;
        this.parent_id = str2;
    }
}
