package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetLargeFileCanShareToExternalResponse extends Message<MailGetLargeFileCanShareToExternalResponse, C16730a> {
    public static final ProtoAdapter<MailGetLargeFileCanShareToExternalResponse> ADAPTER = new C16731b();
    public static final Boolean DEFAULT_CAN_SHARE = false;
    private static final long serialVersionUID = 0;
    public final Boolean can_share;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLargeFileCanShareToExternalResponse$b */
    private static final class C16731b extends ProtoAdapter<MailGetLargeFileCanShareToExternalResponse> {
        C16731b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetLargeFileCanShareToExternalResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetLargeFileCanShareToExternalResponse mailGetLargeFileCanShareToExternalResponse) {
            int i;
            if (mailGetLargeFileCanShareToExternalResponse.can_share != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailGetLargeFileCanShareToExternalResponse.can_share);
            } else {
                i = 0;
            }
            return i + mailGetLargeFileCanShareToExternalResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetLargeFileCanShareToExternalResponse decode(ProtoReader protoReader) throws IOException {
            C16730a aVar = new C16730a();
            aVar.f43193a = false;
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
                    aVar.f43193a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetLargeFileCanShareToExternalResponse mailGetLargeFileCanShareToExternalResponse) throws IOException {
            if (mailGetLargeFileCanShareToExternalResponse.can_share != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailGetLargeFileCanShareToExternalResponse.can_share);
            }
            protoWriter.writeBytes(mailGetLargeFileCanShareToExternalResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLargeFileCanShareToExternalResponse$a */
    public static final class C16730a extends Message.Builder<MailGetLargeFileCanShareToExternalResponse, C16730a> {

        /* renamed from: a */
        public Boolean f43193a;

        /* renamed from: a */
        public MailGetLargeFileCanShareToExternalResponse build() {
            return new MailGetLargeFileCanShareToExternalResponse(this.f43193a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16730a newBuilder() {
        C16730a aVar = new C16730a();
        aVar.f43193a = this.can_share;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetLargeFileCanShareToExternalResponse");
        StringBuilder sb = new StringBuilder();
        if (this.can_share != null) {
            sb.append(", can_share=");
            sb.append(this.can_share);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetLargeFileCanShareToExternalResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetLargeFileCanShareToExternalResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailGetLargeFileCanShareToExternalResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_share = bool;
    }
}
