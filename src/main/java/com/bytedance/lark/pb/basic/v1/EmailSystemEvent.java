package com.bytedance.lark.pb.basic.v1;

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

public final class EmailSystemEvent extends Message<EmailSystemEvent, C14926a> {
    public static final ProtoAdapter<EmailSystemEvent> ADAPTER = new C14927b();
    private static final long serialVersionUID = 0;
    public final List<EmailMember> cc;
    public final String operator_id;
    public final List<EmailMember> to;

    /* renamed from: com.bytedance.lark.pb.basic.v1.EmailSystemEvent$b */
    private static final class C14927b extends ProtoAdapter<EmailSystemEvent> {
        C14927b() {
            super(FieldEncoding.LENGTH_DELIMITED, EmailSystemEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(EmailSystemEvent emailSystemEvent) {
            int i;
            if (emailSystemEvent.operator_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, emailSystemEvent.operator_id);
            } else {
                i = 0;
            }
            return i + EmailMember.ADAPTER.asRepeated().encodedSizeWithTag(2, emailSystemEvent.to) + EmailMember.ADAPTER.asRepeated().encodedSizeWithTag(3, emailSystemEvent.cc) + emailSystemEvent.unknownFields().size();
        }

        /* renamed from: a */
        public EmailSystemEvent decode(ProtoReader protoReader) throws IOException {
            C14926a aVar = new C14926a();
            aVar.f39482a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39482a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f39483b.add(EmailMember.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39484c.add(EmailMember.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, EmailSystemEvent emailSystemEvent) throws IOException {
            if (emailSystemEvent.operator_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, emailSystemEvent.operator_id);
            }
            EmailMember.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, emailSystemEvent.to);
            EmailMember.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, emailSystemEvent.cc);
            protoWriter.writeBytes(emailSystemEvent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.EmailSystemEvent$a */
    public static final class C14926a extends Message.Builder<EmailSystemEvent, C14926a> {

        /* renamed from: a */
        public String f39482a;

        /* renamed from: b */
        public List<EmailMember> f39483b = Internal.newMutableList();

        /* renamed from: c */
        public List<EmailMember> f39484c = Internal.newMutableList();

        /* renamed from: a */
        public EmailSystemEvent build() {
            return new EmailSystemEvent(this.f39482a, this.f39483b, this.f39484c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14926a newBuilder() {
        C14926a aVar = new C14926a();
        aVar.f39482a = this.operator_id;
        aVar.f39483b = Internal.copyOf("to", this.to);
        aVar.f39484c = Internal.copyOf("cc", this.cc);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "EmailSystemEvent");
        StringBuilder sb = new StringBuilder();
        if (this.operator_id != null) {
            sb.append(", operator_id=");
            sb.append(this.operator_id);
        }
        if (!this.to.isEmpty()) {
            sb.append(", to=");
            sb.append(this.to);
        }
        if (!this.cc.isEmpty()) {
            sb.append(", cc=");
            sb.append(this.cc);
        }
        StringBuilder replace = sb.replace(0, 2, "EmailSystemEvent{");
        replace.append('}');
        return replace.toString();
    }

    public EmailSystemEvent(String str, List<EmailMember> list, List<EmailMember> list2) {
        this(str, list, list2, ByteString.EMPTY);
    }

    public EmailSystemEvent(String str, List<EmailMember> list, List<EmailMember> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.operator_id = str;
        this.to = Internal.immutableCopyOf("to", list);
        this.cc = Internal.immutableCopyOf("cc", list2);
    }
}
