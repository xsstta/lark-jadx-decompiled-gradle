package com.ss.android.lark.pb.mails;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.lark.pb.mailentities.MailRequestBase;
import java.io.IOException;
import okio.ByteString;

public final class GetMessageSendStatusByMessageIDRequest extends Message<GetMessageSendStatusByMessageIDRequest, C49833a> {
    public static final ProtoAdapter<GetMessageSendStatusByMessageIDRequest> ADAPTER = new C49834b();
    private static final long serialVersionUID = 0;
    public final MailRequestBase mbase;
    public final String mmessage_biz_id;

    /* renamed from: com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDRequest$b */
    private static final class C49834b extends ProtoAdapter<GetMessageSendStatusByMessageIDRequest> {
        C49834b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageSendStatusByMessageIDRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageSendStatusByMessageIDRequest getMessageSendStatusByMessageIDRequest) {
            int i;
            int i2 = 0;
            if (getMessageSendStatusByMessageIDRequest.mmessage_biz_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageSendStatusByMessageIDRequest.mmessage_biz_id);
            } else {
                i = 0;
            }
            if (getMessageSendStatusByMessageIDRequest.mbase != null) {
                i2 = MailRequestBase.ADAPTER.encodedSizeWithTag(255, getMessageSendStatusByMessageIDRequest.mbase);
            }
            return i + i2 + getMessageSendStatusByMessageIDRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageSendStatusByMessageIDRequest decode(ProtoReader protoReader) throws IOException {
            C49833a aVar = new C49833a();
            aVar.f124782a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124782a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 255) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124783b = MailRequestBase.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageSendStatusByMessageIDRequest getMessageSendStatusByMessageIDRequest) throws IOException {
            if (getMessageSendStatusByMessageIDRequest.mmessage_biz_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageSendStatusByMessageIDRequest.mmessage_biz_id);
            }
            if (getMessageSendStatusByMessageIDRequest.mbase != null) {
                MailRequestBase.ADAPTER.encodeWithTag(protoWriter, 255, getMessageSendStatusByMessageIDRequest.mbase);
            }
            protoWriter.writeBytes(getMessageSendStatusByMessageIDRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDRequest$a */
    public static final class C49833a extends Message.Builder<GetMessageSendStatusByMessageIDRequest, C49833a> {

        /* renamed from: a */
        public String f124782a;

        /* renamed from: b */
        public MailRequestBase f124783b;

        /* renamed from: a */
        public GetMessageSendStatusByMessageIDRequest build() {
            return new GetMessageSendStatusByMessageIDRequest(this.f124782a, this.f124783b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C49833a mo173424a(MailRequestBase mailRequestBase) {
            this.f124783b = mailRequestBase;
            return this;
        }

        /* renamed from: a */
        public C49833a mo173425a(String str) {
            this.f124782a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49833a newBuilder() {
        C49833a aVar = new C49833a();
        aVar.f124782a = this.mmessage_biz_id;
        aVar.f124783b = this.mbase;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mmessage_biz_id != null) {
            sb.append(", message_biz_id=");
            sb.append(this.mmessage_biz_id);
        }
        if (this.mbase != null) {
            sb.append(", base=");
            sb.append(this.mbase);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageSendStatusByMessageIDRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageSendStatusByMessageIDRequest(String str, MailRequestBase mailRequestBase) {
        this(str, mailRequestBase, ByteString.EMPTY);
    }

    public GetMessageSendStatusByMessageIDRequest(String str, MailRequestBase mailRequestBase, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmessage_biz_id = str;
        this.mbase = mailRequestBase;
    }
}
