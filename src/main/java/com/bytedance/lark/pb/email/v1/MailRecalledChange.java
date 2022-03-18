package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailRecalledChange extends Message<MailRecalledChange, C17034a> {
    public static final ProtoAdapter<MailRecalledChange> ADAPTER = new C17035b();
    private static final long serialVersionUID = 0;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailRecalledChange$b */
    private static final class C17035b extends ProtoAdapter<MailRecalledChange> {
        C17035b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailRecalledChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailRecalledChange mailRecalledChange) {
            int i;
            if (mailRecalledChange.message_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailRecalledChange.message_id);
            } else {
                i = 0;
            }
            return i + mailRecalledChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailRecalledChange decode(ProtoReader protoReader) throws IOException {
            C17034a aVar = new C17034a();
            aVar.f43685a = "";
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
                    aVar.f43685a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailRecalledChange mailRecalledChange) throws IOException {
            if (mailRecalledChange.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailRecalledChange.message_id);
            }
            protoWriter.writeBytes(mailRecalledChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailRecalledChange$a */
    public static final class C17034a extends Message.Builder<MailRecalledChange, C17034a> {

        /* renamed from: a */
        public String f43685a;

        /* renamed from: a */
        public MailRecalledChange build() {
            return new MailRecalledChange(this.f43685a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17034a newBuilder() {
        C17034a aVar = new C17034a();
        aVar.f43685a = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailRecalledChange");
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailRecalledChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailRecalledChange(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailRecalledChange(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = str;
    }
}
