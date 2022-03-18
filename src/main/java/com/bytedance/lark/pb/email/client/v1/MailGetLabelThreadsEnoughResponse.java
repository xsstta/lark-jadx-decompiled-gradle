package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetLabelThreadsEnoughResponse extends Message<MailGetLabelThreadsEnoughResponse, C16722a> {
    public static final ProtoAdapter<MailGetLabelThreadsEnoughResponse> ADAPTER = new C16723b();
    public static final Boolean DEFAULT_ENOUGH = false;
    private static final long serialVersionUID = 0;
    public final Boolean enough;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelThreadsEnoughResponse$b */
    private static final class C16723b extends ProtoAdapter<MailGetLabelThreadsEnoughResponse> {
        C16723b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetLabelThreadsEnoughResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetLabelThreadsEnoughResponse mailGetLabelThreadsEnoughResponse) {
            int i;
            if (mailGetLabelThreadsEnoughResponse.enough != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, mailGetLabelThreadsEnoughResponse.enough);
            } else {
                i = 0;
            }
            return i + mailGetLabelThreadsEnoughResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetLabelThreadsEnoughResponse decode(ProtoReader protoReader) throws IOException {
            C16722a aVar = new C16722a();
            aVar.f43189a = false;
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
                    aVar.f43189a = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetLabelThreadsEnoughResponse mailGetLabelThreadsEnoughResponse) throws IOException {
            if (mailGetLabelThreadsEnoughResponse.enough != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, mailGetLabelThreadsEnoughResponse.enough);
            }
            protoWriter.writeBytes(mailGetLabelThreadsEnoughResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetLabelThreadsEnoughResponse$a */
    public static final class C16722a extends Message.Builder<MailGetLabelThreadsEnoughResponse, C16722a> {

        /* renamed from: a */
        public Boolean f43189a;

        /* renamed from: a */
        public MailGetLabelThreadsEnoughResponse build() {
            return new MailGetLabelThreadsEnoughResponse(this.f43189a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16722a newBuilder() {
        C16722a aVar = new C16722a();
        aVar.f43189a = this.enough;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetLabelThreadsEnoughResponse");
        StringBuilder sb = new StringBuilder();
        if (this.enough != null) {
            sb.append(", enough=");
            sb.append(this.enough);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetLabelThreadsEnoughResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetLabelThreadsEnoughResponse(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public MailGetLabelThreadsEnoughResponse(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.enough = bool;
    }
}
