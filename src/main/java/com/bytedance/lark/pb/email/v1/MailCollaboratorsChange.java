package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCollaboratorsChange extends Message<MailCollaboratorsChange, C17014a> {
    public static final ProtoAdapter<MailCollaboratorsChange> ADAPTER = new C17015b();
    private static final long serialVersionUID = 0;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailCollaboratorsChange$b */
    private static final class C17015b extends ProtoAdapter<MailCollaboratorsChange> {
        C17015b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCollaboratorsChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCollaboratorsChange mailCollaboratorsChange) {
            int i;
            if (mailCollaboratorsChange.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCollaboratorsChange.thread_id);
            } else {
                i = 0;
            }
            return i + mailCollaboratorsChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailCollaboratorsChange decode(ProtoReader protoReader) throws IOException {
            C17014a aVar = new C17014a();
            aVar.f43663a = "";
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
                    aVar.f43663a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCollaboratorsChange mailCollaboratorsChange) throws IOException {
            if (mailCollaboratorsChange.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCollaboratorsChange.thread_id);
            }
            protoWriter.writeBytes(mailCollaboratorsChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailCollaboratorsChange$a */
    public static final class C17014a extends Message.Builder<MailCollaboratorsChange, C17014a> {

        /* renamed from: a */
        public String f43663a;

        /* renamed from: a */
        public MailCollaboratorsChange build() {
            return new MailCollaboratorsChange(this.f43663a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17014a newBuilder() {
        C17014a aVar = new C17014a();
        aVar.f43663a = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCollaboratorsChange");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCollaboratorsChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailCollaboratorsChange(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailCollaboratorsChange(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
    }
}
