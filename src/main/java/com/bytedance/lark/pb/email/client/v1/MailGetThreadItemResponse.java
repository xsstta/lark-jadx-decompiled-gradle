package com.bytedance.lark.pb.email.client.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.email.client.v1.MailGetThreadListResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MailGetThreadItemResponse extends Message<MailGetThreadItemResponse, C16802a> {
    public static final ProtoAdapter<MailGetThreadItemResponse> ADAPTER = new C16803b();
    private static final long serialVersionUID = 0;
    public final Thread thread;
    public final MailGetThreadListResponse.ThreadItem thread_item;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadItemResponse$b */
    private static final class C16803b extends ProtoAdapter<MailGetThreadItemResponse> {
        C16803b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetThreadItemResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetThreadItemResponse mailGetThreadItemResponse) {
            int i;
            int i2 = 0;
            if (mailGetThreadItemResponse.thread != null) {
                i = Thread.ADAPTER.encodedSizeWithTag(2, mailGetThreadItemResponse.thread);
            } else {
                i = 0;
            }
            if (mailGetThreadItemResponse.thread_item != null) {
                i2 = MailGetThreadListResponse.ThreadItem.ADAPTER.encodedSizeWithTag(3, mailGetThreadItemResponse.thread_item);
            }
            return i + i2 + mailGetThreadItemResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetThreadItemResponse decode(ProtoReader protoReader) throws IOException {
            C16802a aVar = new C16802a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f43265a = Thread.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43266b = MailGetThreadListResponse.ThreadItem.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetThreadItemResponse mailGetThreadItemResponse) throws IOException {
            if (mailGetThreadItemResponse.thread != null) {
                Thread.ADAPTER.encodeWithTag(protoWriter, 2, mailGetThreadItemResponse.thread);
            }
            if (mailGetThreadItemResponse.thread_item != null) {
                MailGetThreadListResponse.ThreadItem.ADAPTER.encodeWithTag(protoWriter, 3, mailGetThreadItemResponse.thread_item);
            }
            protoWriter.writeBytes(mailGetThreadItemResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetThreadItemResponse$a */
    public static final class C16802a extends Message.Builder<MailGetThreadItemResponse, C16802a> {

        /* renamed from: a */
        public Thread f43265a;

        /* renamed from: b */
        public MailGetThreadListResponse.ThreadItem f43266b;

        /* renamed from: a */
        public MailGetThreadItemResponse build() {
            return new MailGetThreadItemResponse(this.f43265a, this.f43266b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16802a newBuilder() {
        C16802a aVar = new C16802a();
        aVar.f43265a = this.thread;
        aVar.f43266b = this.thread_item;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetThreadItemResponse");
        StringBuilder sb = new StringBuilder();
        if (this.thread != null) {
            sb.append(", thread=");
            sb.append(this.thread);
        }
        if (this.thread_item != null) {
            sb.append(", thread_item=");
            sb.append(this.thread_item);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetThreadItemResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetThreadItemResponse(Thread thread2, MailGetThreadListResponse.ThreadItem threadItem) {
        this(thread2, threadItem, ByteString.EMPTY);
    }

    public MailGetThreadItemResponse(Thread thread2, MailGetThreadListResponse.ThreadItem threadItem, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread = thread2;
        this.thread_item = threadItem;
    }
}
