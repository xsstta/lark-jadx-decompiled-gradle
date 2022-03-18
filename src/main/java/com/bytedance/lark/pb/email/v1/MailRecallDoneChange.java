package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.Message;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailRecallDoneChange extends Message<MailRecallDoneChange, C17032a> {
    public static final ProtoAdapter<MailRecallDoneChange> ADAPTER = new C17033b();
    public static final Message.RecallStatus DEFAULT_STATUS = Message.RecallStatus.None;
    private static final long serialVersionUID = 0;
    public final String message_id;
    public final Message.RecallStatus status;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailRecallDoneChange$b */
    private static final class C17033b extends ProtoAdapter<MailRecallDoneChange> {
        C17033b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRecallDoneChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRecallDoneChange mailRecallDoneChange) {
            int i;
            int i2 = 0;
            if (mailRecallDoneChange.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailRecallDoneChange.message_id);
            } else {
                i = 0;
            }
            if (mailRecallDoneChange.status != null) {
                i2 = Message.RecallStatus.ADAPTER.encodedSizeWithTag(2, mailRecallDoneChange.status);
            }
            return i + i2 + mailRecallDoneChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailRecallDoneChange decode(ProtoReader protoReader) throws IOException {
            C17032a aVar = new C17032a();
            aVar.f43683a = "";
            aVar.f43684b = Message.RecallStatus.None;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43683a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f43684b = Message.RecallStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailRecallDoneChange mailRecallDoneChange) throws IOException {
            if (mailRecallDoneChange.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailRecallDoneChange.message_id);
            }
            if (mailRecallDoneChange.status != null) {
                Message.RecallStatus.ADAPTER.encodeWithTag(protoWriter, 2, mailRecallDoneChange.status);
            }
            protoWriter.writeBytes(mailRecallDoneChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailRecallDoneChange$a */
    public static final class C17032a extends Message.Builder<MailRecallDoneChange, C17032a> {

        /* renamed from: a */
        public String f43683a;

        /* renamed from: b */
        public Message.RecallStatus f43684b;

        /* renamed from: a */
        public MailRecallDoneChange build() {
            return new MailRecallDoneChange(this.f43683a, this.f43684b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17032a newBuilder() {
        C17032a aVar = new C17032a();
        aVar.f43683a = this.message_id;
        aVar.f43684b = this.status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailRecallDoneChange");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "MailRecallDoneChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailRecallDoneChange(String str, Message.RecallStatus recallStatus) {
        this(str, recallStatus, ByteString.EMPTY);
    }

    public MailRecallDoneChange(String str, Message.RecallStatus recallStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
        this.status = recallStatus;
    }
}
