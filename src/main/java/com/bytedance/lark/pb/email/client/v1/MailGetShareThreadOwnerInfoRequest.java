package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetShareThreadOwnerInfoRequest extends Message<MailGetShareThreadOwnerInfoRequest, C16772a> {
    public static final ProtoAdapter<MailGetShareThreadOwnerInfoRequest> ADAPTER = new C16773b();
    private static final long serialVersionUID = 0;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoRequest$b */
    private static final class C16773b extends ProtoAdapter<MailGetShareThreadOwnerInfoRequest> {
        C16773b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetShareThreadOwnerInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetShareThreadOwnerInfoRequest mailGetShareThreadOwnerInfoRequest) {
            int i;
            if (mailGetShareThreadOwnerInfoRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetShareThreadOwnerInfoRequest.thread_id);
            } else {
                i = 0;
            }
            return i + mailGetShareThreadOwnerInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetShareThreadOwnerInfoRequest decode(ProtoReader protoReader) throws IOException {
            C16772a aVar = new C16772a();
            aVar.f43245a = "";
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
                    aVar.f43245a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetShareThreadOwnerInfoRequest mailGetShareThreadOwnerInfoRequest) throws IOException {
            if (mailGetShareThreadOwnerInfoRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetShareThreadOwnerInfoRequest.thread_id);
            }
            protoWriter.writeBytes(mailGetShareThreadOwnerInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetShareThreadOwnerInfoRequest$a */
    public static final class C16772a extends Message.Builder<MailGetShareThreadOwnerInfoRequest, C16772a> {

        /* renamed from: a */
        public String f43245a;

        /* renamed from: a */
        public MailGetShareThreadOwnerInfoRequest build() {
            return new MailGetShareThreadOwnerInfoRequest(this.f43245a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16772a newBuilder() {
        C16772a aVar = new C16772a();
        aVar.f43245a = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetShareThreadOwnerInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetShareThreadOwnerInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetShareThreadOwnerInfoRequest(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailGetShareThreadOwnerInfoRequest(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
    }
}
