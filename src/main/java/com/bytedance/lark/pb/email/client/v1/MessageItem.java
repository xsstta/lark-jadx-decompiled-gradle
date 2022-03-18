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

public final class MessageItem extends Message<MessageItem, C16968a> {
    public static final ProtoAdapter<MessageItem> ADAPTER = new C16969b();
    public static final Integer DEFAULT_INDEX = 0;
    private static final long serialVersionUID = 0;
    public final List<Draft> drafts;
    public final Integer index;
    public final Message message;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MessageItem$b */
    private static final class C16969b extends ProtoAdapter<MessageItem> {
        C16969b() {
            super(FieldEncoding.LENGTH_DELIMITED, MessageItem.class);
        }

        /* renamed from: a */
        public int encodedSize(MessageItem messageItem) {
            int i;
            int i2 = 0;
            if (messageItem.message != null) {
                i = Message.ADAPTER.encodedSizeWithTag(1, messageItem.message);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + Draft.ADAPTER.asRepeated().encodedSizeWithTag(2, messageItem.drafts);
            if (messageItem.index != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, messageItem.index);
            }
            return encodedSizeWithTag + i2 + messageItem.unknownFields().size();
        }

        /* renamed from: a */
        public MessageItem decode(ProtoReader protoReader) throws IOException {
            C16968a aVar = new C16968a();
            aVar.f43511c = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43509a = Message.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43510b.add(Draft.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43511c = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MessageItem messageItem) throws IOException {
            if (messageItem.message != null) {
                Message.ADAPTER.encodeWithTag(protoWriter, 1, messageItem.message);
            }
            Draft.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messageItem.drafts);
            if (messageItem.index != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, messageItem.index);
            }
            protoWriter.writeBytes(messageItem.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MessageItem$a */
    public static final class C16968a extends Message.Builder<MessageItem, C16968a> {

        /* renamed from: a */
        public Message f43509a;

        /* renamed from: b */
        public List<Draft> f43510b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f43511c;

        /* renamed from: a */
        public MessageItem build() {
            return new MessageItem(this.f43509a, this.f43510b, this.f43511c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16968a newBuilder() {
        C16968a aVar = new C16968a();
        aVar.f43509a = this.message;
        aVar.f43510b = Internal.copyOf("drafts", this.drafts);
        aVar.f43511c = this.index;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MessageItem");
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (!this.drafts.isEmpty()) {
            sb.append(", drafts=");
            sb.append(this.drafts);
        }
        if (this.index != null) {
            sb.append(", index=");
            sb.append(this.index);
        }
        StringBuilder replace = sb.replace(0, 2, "MessageItem{");
        replace.append('}');
        return replace.toString();
    }

    public MessageItem(Message message2, List<Draft> list, Integer num) {
        this(message2, list, num, ByteString.EMPTY);
    }

    public MessageItem(Message message2, List<Draft> list, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = message2;
        this.drafts = Internal.immutableCopyOf("drafts", list);
        this.index = num;
    }
}
