package com.ss.android.lark.pb.mails;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.mailentities.MailSendStatusDetail;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetMessageSendStatusByMessageIDResponse extends Message<GetMessageSendStatusByMessageIDResponse, C49835a> {
    public static final ProtoAdapter<GetMessageSendStatusByMessageIDResponse> ADAPTER = new C49836b();
    private static final long serialVersionUID = 0;
    public final List<MailSendStatusDetail> mdetails;
    public final String mmessage_biz_id;

    /* renamed from: com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDResponse$b */
    private static final class C49836b extends ProtoAdapter<GetMessageSendStatusByMessageIDResponse> {
        C49836b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetMessageSendStatusByMessageIDResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetMessageSendStatusByMessageIDResponse getMessageSendStatusByMessageIDResponse) {
            int i;
            if (getMessageSendStatusByMessageIDResponse.mmessage_biz_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageSendStatusByMessageIDResponse.mmessage_biz_id);
            } else {
                i = 0;
            }
            return i + MailSendStatusDetail.ADAPTER.asRepeated().encodedSizeWithTag(2, getMessageSendStatusByMessageIDResponse.mdetails) + getMessageSendStatusByMessageIDResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetMessageSendStatusByMessageIDResponse decode(ProtoReader protoReader) throws IOException {
            C49835a aVar = new C49835a();
            aVar.f124784a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124784a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124785b.add(MailSendStatusDetail.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetMessageSendStatusByMessageIDResponse getMessageSendStatusByMessageIDResponse) throws IOException {
            if (getMessageSendStatusByMessageIDResponse.mmessage_biz_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageSendStatusByMessageIDResponse.mmessage_biz_id);
            }
            MailSendStatusDetail.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getMessageSendStatusByMessageIDResponse.mdetails);
            protoWriter.writeBytes(getMessageSendStatusByMessageIDResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.mails.GetMessageSendStatusByMessageIDResponse$a */
    public static final class C49835a extends Message.Builder<GetMessageSendStatusByMessageIDResponse, C49835a> {

        /* renamed from: a */
        public String f124784a;

        /* renamed from: b */
        public List<MailSendStatusDetail> f124785b = Internal.newMutableList();

        /* renamed from: a */
        public GetMessageSendStatusByMessageIDResponse build() {
            return new GetMessageSendStatusByMessageIDResponse(this.f124784a, this.f124785b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49835a newBuilder() {
        C49835a aVar = new C49835a();
        aVar.f124784a = this.mmessage_biz_id;
        aVar.f124785b = Internal.copyOf("mdetails", this.mdetails);
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
        if (!this.mdetails.isEmpty()) {
            sb.append(", details=");
            sb.append(this.mdetails);
        }
        StringBuilder replace = sb.replace(0, 2, "GetMessageSendStatusByMessageIDResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetMessageSendStatusByMessageIDResponse(String str, List<MailSendStatusDetail> list) {
        this(str, list, ByteString.EMPTY);
    }

    public GetMessageSendStatusByMessageIDResponse(String str, List<MailSendStatusDetail> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmessage_biz_id = str;
        this.mdetails = Internal.immutableCopyOf("mdetails", list);
    }
}
