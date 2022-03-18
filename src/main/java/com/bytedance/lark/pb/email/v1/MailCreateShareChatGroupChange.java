package com.bytedance.lark.pb.email.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailCreateShareChatGroupChange extends Message<MailCreateShareChatGroupChange, C17016a> {
    public static final ProtoAdapter<MailCreateShareChatGroupChange> ADAPTER = new C17017b();
    private static final long serialVersionUID = 0;
    public final String chat_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.v1.MailCreateShareChatGroupChange$b */
    private static final class C17017b extends ProtoAdapter<MailCreateShareChatGroupChange> {
        C17017b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailCreateShareChatGroupChange.class);
        }

        /* renamed from: a */
        public int encodedSize(MailCreateShareChatGroupChange mailCreateShareChatGroupChange) {
            int i;
            int i2 = 0;
            if (mailCreateShareChatGroupChange.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailCreateShareChatGroupChange.thread_id);
            } else {
                i = 0;
            }
            if (mailCreateShareChatGroupChange.chat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailCreateShareChatGroupChange.chat_id);
            }
            return i + i2 + mailCreateShareChatGroupChange.unknownFields().size();
        }

        /* renamed from: a */
        public MailCreateShareChatGroupChange decode(ProtoReader protoReader) throws IOException {
            C17016a aVar = new C17016a();
            aVar.f43664a = "";
            aVar.f43665b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43664a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43665b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailCreateShareChatGroupChange mailCreateShareChatGroupChange) throws IOException {
            if (mailCreateShareChatGroupChange.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailCreateShareChatGroupChange.thread_id);
            }
            if (mailCreateShareChatGroupChange.chat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailCreateShareChatGroupChange.chat_id);
            }
            protoWriter.writeBytes(mailCreateShareChatGroupChange.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.v1.MailCreateShareChatGroupChange$a */
    public static final class C17016a extends Message.Builder<MailCreateShareChatGroupChange, C17016a> {

        /* renamed from: a */
        public String f43664a;

        /* renamed from: b */
        public String f43665b;

        /* renamed from: a */
        public MailCreateShareChatGroupChange build() {
            return new MailCreateShareChatGroupChange(this.f43664a, this.f43665b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17016a newBuilder() {
        C17016a aVar = new C17016a();
        aVar.f43664a = this.thread_id;
        aVar.f43665b = this.chat_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailCreateShareChatGroupChange");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.chat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.chat_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MailCreateShareChatGroupChange{");
        replace.append('}');
        return replace.toString();
    }

    public MailCreateShareChatGroupChange(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public MailCreateShareChatGroupChange(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.chat_id = str2;
    }
}
