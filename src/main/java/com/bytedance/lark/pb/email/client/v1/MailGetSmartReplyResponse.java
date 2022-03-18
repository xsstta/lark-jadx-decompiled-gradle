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

public final class MailGetSmartReplyResponse extends Message<MailGetSmartReplyResponse, C16786a> {
    public static final ProtoAdapter<MailGetSmartReplyResponse> ADAPTER = new C16787b();
    private static final long serialVersionUID = 0;
    public final List<MailSmartReplyInfo> smart_reply_msgs_info;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartReplyResponse$b */
    private static final class C16787b extends ProtoAdapter<MailGetSmartReplyResponse> {
        C16787b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetSmartReplyResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetSmartReplyResponse mailGetSmartReplyResponse) {
            return MailSmartReplyInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, mailGetSmartReplyResponse.smart_reply_msgs_info) + mailGetSmartReplyResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetSmartReplyResponse decode(ProtoReader protoReader) throws IOException {
            C16786a aVar = new C16786a();
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
                    aVar.f43256a.add(MailSmartReplyInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetSmartReplyResponse mailGetSmartReplyResponse) throws IOException {
            MailSmartReplyInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailGetSmartReplyResponse.smart_reply_msgs_info);
            protoWriter.writeBytes(mailGetSmartReplyResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetSmartReplyResponse$a */
    public static final class C16786a extends Message.Builder<MailGetSmartReplyResponse, C16786a> {

        /* renamed from: a */
        public List<MailSmartReplyInfo> f43256a = Internal.newMutableList();

        /* renamed from: a */
        public MailGetSmartReplyResponse build() {
            return new MailGetSmartReplyResponse(this.f43256a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16786a newBuilder() {
        C16786a aVar = new C16786a();
        aVar.f43256a = Internal.copyOf("smart_reply_msgs_info", this.smart_reply_msgs_info);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetSmartReplyResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.smart_reply_msgs_info.isEmpty()) {
            sb.append(", smart_reply_msgs_info=");
            sb.append(this.smart_reply_msgs_info);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetSmartReplyResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetSmartReplyResponse(List<MailSmartReplyInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public MailGetSmartReplyResponse(List<MailSmartReplyInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.smart_reply_msgs_info = Internal.immutableCopyOf("smart_reply_msgs_info", list);
    }
}
