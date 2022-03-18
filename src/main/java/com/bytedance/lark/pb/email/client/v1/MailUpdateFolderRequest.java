package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUpdateFolderRequest extends Message<MailUpdateFolderRequest, C16948a> {
    public static final ProtoAdapter<MailUpdateFolderRequest> ADAPTER = new C16949b();
    public static final Long DEFAULT_ORDER_INDEX = 0L;
    private static final long serialVersionUID = 0;
    public final String folder_id;
    public final String folder_name;
    public final Long order_index;
    public final String parent_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateFolderRequest$b */
    private static final class C16949b extends ProtoAdapter<MailUpdateFolderRequest> {
        C16949b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUpdateFolderRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUpdateFolderRequest mailUpdateFolderRequest) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (mailUpdateFolderRequest.folder_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUpdateFolderRequest.folder_id);
            } else {
                i = 0;
            }
            if (mailUpdateFolderRequest.folder_name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailUpdateFolderRequest.folder_name);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (mailUpdateFolderRequest.parent_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, mailUpdateFolderRequest.parent_id);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (mailUpdateFolderRequest.order_index != null) {
                i4 = ProtoAdapter.INT64.encodedSizeWithTag(4, mailUpdateFolderRequest.order_index);
            }
            return i6 + i4 + mailUpdateFolderRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUpdateFolderRequest decode(ProtoReader protoReader) throws IOException {
            C16948a aVar = new C16948a();
            aVar.f43447a = "";
            aVar.f43448b = "";
            aVar.f43449c = "";
            aVar.f43450d = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43447a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43448b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43449c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43450d = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUpdateFolderRequest mailUpdateFolderRequest) throws IOException {
            if (mailUpdateFolderRequest.folder_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUpdateFolderRequest.folder_id);
            }
            if (mailUpdateFolderRequest.folder_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailUpdateFolderRequest.folder_name);
            }
            if (mailUpdateFolderRequest.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, mailUpdateFolderRequest.parent_id);
            }
            if (mailUpdateFolderRequest.order_index != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, mailUpdateFolderRequest.order_index);
            }
            protoWriter.writeBytes(mailUpdateFolderRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUpdateFolderRequest$a */
    public static final class C16948a extends Message.Builder<MailUpdateFolderRequest, C16948a> {

        /* renamed from: a */
        public String f43447a;

        /* renamed from: b */
        public String f43448b;

        /* renamed from: c */
        public String f43449c;

        /* renamed from: d */
        public Long f43450d;

        /* renamed from: a */
        public MailUpdateFolderRequest build() {
            return new MailUpdateFolderRequest(this.f43447a, this.f43448b, this.f43449c, this.f43450d, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16948a newBuilder() {
        C16948a aVar = new C16948a();
        aVar.f43447a = this.folder_id;
        aVar.f43448b = this.folder_name;
        aVar.f43449c = this.parent_id;
        aVar.f43450d = this.order_index;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUpdateFolderRequest");
        StringBuilder sb = new StringBuilder();
        if (this.folder_id != null) {
            sb.append(", folder_id=");
            sb.append(this.folder_id);
        }
        if (this.folder_name != null) {
            sb.append(", folder_name=");
            sb.append(this.folder_name);
        }
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (this.order_index != null) {
            sb.append(", order_index=");
            sb.append(this.order_index);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUpdateFolderRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUpdateFolderRequest(String str, String str2, String str3, Long l) {
        this(str, str2, str3, l, ByteString.EMPTY);
    }

    public MailUpdateFolderRequest(String str, String str2, String str3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.folder_id = str;
        this.folder_name = str2;
        this.parent_id = str3;
        this.order_index = l;
    }
}
