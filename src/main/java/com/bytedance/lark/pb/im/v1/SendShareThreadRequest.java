package com.bytedance.lark.pb.im.v1;

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

public final class SendShareThreadRequest extends Message<SendShareThreadRequest, C18031a> {
    public static final ProtoAdapter<SendShareThreadRequest> ADAPTER = new C18032b();
    private static final long serialVersionUID = 0;
    public final String channel_id;
    public final List<String> chat_ids;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.SendShareThreadRequest$b */
    private static final class C18032b extends ProtoAdapter<SendShareThreadRequest> {
        C18032b() {
            super(FieldEncoding.LENGTH_DELIMITED, SendShareThreadRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SendShareThreadRequest sendShareThreadRequest) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendShareThreadRequest.channel_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, sendShareThreadRequest.thread_id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, sendShareThreadRequest.chat_ids) + sendShareThreadRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SendShareThreadRequest decode(ProtoReader protoReader) throws IOException {
            C18031a aVar = new C18031a();
            aVar.f45141a = "";
            aVar.f45142b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45141a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45142b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45143c.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SendShareThreadRequest sendShareThreadRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendShareThreadRequest.channel_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sendShareThreadRequest.thread_id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, sendShareThreadRequest.chat_ids);
            protoWriter.writeBytes(sendShareThreadRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18031a newBuilder() {
        C18031a aVar = new C18031a();
        aVar.f45141a = this.channel_id;
        aVar.f45142b = this.thread_id;
        aVar.f45143c = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.SendShareThreadRequest$a */
    public static final class C18031a extends Message.Builder<SendShareThreadRequest, C18031a> {

        /* renamed from: a */
        public String f45141a;

        /* renamed from: b */
        public String f45142b;

        /* renamed from: c */
        public List<String> f45143c = Internal.newMutableList();

        /* renamed from: a */
        public SendShareThreadRequest build() {
            String str;
            String str2 = this.f45141a;
            if (str2 != null && (str = this.f45142b) != null) {
                return new SendShareThreadRequest(str2, str, this.f45143c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "channel_id", this.f45142b, "thread_id");
        }

        /* renamed from: a */
        public C18031a mo62619a(String str) {
            this.f45141a = str;
            return this;
        }

        /* renamed from: b */
        public C18031a mo62622b(String str) {
            this.f45142b = str;
            return this;
        }

        /* renamed from: a */
        public C18031a mo62620a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45143c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "SendShareThreadRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.append(", thread_id=");
        sb.append(this.thread_id);
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "SendShareThreadRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SendShareThreadRequest(String str, String str2, List<String> list) {
        this(str, str2, list, ByteString.EMPTY);
    }

    public SendShareThreadRequest(String str, String str2, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_id = str;
        this.thread_id = str2;
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
    }
}
