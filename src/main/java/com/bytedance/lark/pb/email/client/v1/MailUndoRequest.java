package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailUndoRequest extends Message<MailUndoRequest, C16922a> {
    public static final ProtoAdapter<MailUndoRequest> ADAPTER = new C16923b();
    private static final long serialVersionUID = 0;
    public final String uuid;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUndoRequest$b */
    private static final class C16923b extends ProtoAdapter<MailUndoRequest> {
        C16923b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailUndoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailUndoRequest mailUndoRequest) {
            int i;
            if (mailUndoRequest.uuid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailUndoRequest.uuid);
            } else {
                i = 0;
            }
            return i + mailUndoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailUndoRequest decode(ProtoReader protoReader) throws IOException {
            C16922a aVar = new C16922a();
            aVar.f43419a = "";
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
                    aVar.f43419a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailUndoRequest mailUndoRequest) throws IOException {
            if (mailUndoRequest.uuid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailUndoRequest.uuid);
            }
            protoWriter.writeBytes(mailUndoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailUndoRequest$a */
    public static final class C16922a extends Message.Builder<MailUndoRequest, C16922a> {

        /* renamed from: a */
        public String f43419a;

        /* renamed from: a */
        public MailUndoRequest build() {
            return new MailUndoRequest(this.f43419a, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16922a mo59811a(String str) {
            this.f43419a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16922a newBuilder() {
        C16922a aVar = new C16922a();
        aVar.f43419a = this.uuid;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailUndoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.uuid != null) {
            sb.append(", uuid=");
            sb.append(this.uuid);
        }
        StringBuilder replace = sb.replace(0, 2, "MailUndoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailUndoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailUndoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uuid = str;
    }
}
