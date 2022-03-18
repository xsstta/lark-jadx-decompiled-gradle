package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetScheduleMessageCountRequest extends Message<MailGetScheduleMessageCountRequest, C16768a> {
    public static final ProtoAdapter<MailGetScheduleMessageCountRequest> ADAPTER = new C16769b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetScheduleMessageCountRequest$b */
    private static final class C16769b extends ProtoAdapter<MailGetScheduleMessageCountRequest> {
        C16769b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetScheduleMessageCountRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetScheduleMessageCountRequest mailGetScheduleMessageCountRequest) {
            return mailGetScheduleMessageCountRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetScheduleMessageCountRequest decode(ProtoReader protoReader) throws IOException {
            C16768a aVar = new C16768a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetScheduleMessageCountRequest mailGetScheduleMessageCountRequest) throws IOException {
            protoWriter.writeBytes(mailGetScheduleMessageCountRequest.unknownFields());
        }
    }

    public MailGetScheduleMessageCountRequest() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetScheduleMessageCountRequest$a */
    public static final class C16768a extends Message.Builder<MailGetScheduleMessageCountRequest, C16768a> {
        /* renamed from: a */
        public MailGetScheduleMessageCountRequest build() {
            return new MailGetScheduleMessageCountRequest(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16768a newBuilder() {
        C16768a aVar = new C16768a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetScheduleMessageCountRequest");
        StringBuilder replace = new StringBuilder().replace(0, 2, "MailGetScheduleMessageCountRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetScheduleMessageCountRequest(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
