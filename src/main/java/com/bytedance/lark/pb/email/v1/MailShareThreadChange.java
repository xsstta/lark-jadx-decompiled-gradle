package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailShareThreadChange extends Message<MailShareThreadChange, C17046a> {
    public static final ProtoAdapter<MailShareThreadChange> ADAPTER = new C17047b();
    private static final long serialVersionUID = 0;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailShareThreadChange$b */
    private static final class C17047b extends ProtoAdapter<MailShareThreadChange> {
        C17047b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailShareThreadChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailShareThreadChange mailShareThreadChange) {
            int i;
            if (mailShareThreadChange.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailShareThreadChange.thread_id);
            } else {
                i = 0;
            }
            return i + mailShareThreadChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailShareThreadChange decode(ProtoReader protoReader) throws IOException {
            C17046a aVar = new C17046a();
            aVar.f43700a = "";
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
                    aVar.f43700a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailShareThreadChange mailShareThreadChange) throws IOException {
            if (mailShareThreadChange.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailShareThreadChange.thread_id);
            }
            protoWriter.writeBytes(mailShareThreadChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailShareThreadChange$a */
    public static final class C17046a extends Message.Builder<MailShareThreadChange, C17046a> {

        /* renamed from: a */
        public String f43700a;

        /* renamed from: a */
        public MailShareThreadChange build() {
            return new MailShareThreadChange(this.f43700a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17046a newBuilder() {
        C17046a aVar = new C17046a();
        aVar.f43700a = this.thread_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailShareThreadChange");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailShareThreadChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailShareThreadChange(String str) {
        this(str, ByteString.EMPTY);
    }

    public MailShareThreadChange(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
    }
}
