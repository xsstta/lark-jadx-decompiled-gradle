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

public final class MailGetMessageListFromNetRequest extends Message<MailGetMessageListFromNetRequest, C16740a> {
    public static final ProtoAdapter<MailGetMessageListFromNetRequest> ADAPTER = new C16741b();
    public static final Boolean DEFAULT_MSG_NEED_CLIPPED = true;
    private static final long serialVersionUID = 0;
    public final String label_id;
    public final Boolean msg_need_clipped;
    public final List<String> new_message_ids;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageListFromNetRequest$b */
    private static final class C16741b extends ProtoAdapter<MailGetMessageListFromNetRequest> {
        C16741b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMessageListFromNetRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMessageListFromNetRequest mailGetMessageListFromNetRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailGetMessageListFromNetRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetMessageListFromNetRequest.thread_id);
            } else {
                i = 0;
            }
            if (mailGetMessageListFromNetRequest.label_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetMessageListFromNetRequest.label_id);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, mailGetMessageListFromNetRequest.new_message_ids);
            if (mailGetMessageListFromNetRequest.msg_need_clipped != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailGetMessageListFromNetRequest.msg_need_clipped);
            }
            return encodedSizeWithTag + i3 + mailGetMessageListFromNetRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMessageListFromNetRequest decode(ProtoReader protoReader) throws IOException {
            C16740a aVar = new C16740a();
            aVar.f43201a = "";
            aVar.f43202b = "";
            aVar.f43204d = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43201a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43202b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43203c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43204d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMessageListFromNetRequest mailGetMessageListFromNetRequest) throws IOException {
            if (mailGetMessageListFromNetRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetMessageListFromNetRequest.thread_id);
            }
            if (mailGetMessageListFromNetRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetMessageListFromNetRequest.label_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, mailGetMessageListFromNetRequest.new_message_ids);
            if (mailGetMessageListFromNetRequest.msg_need_clipped != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailGetMessageListFromNetRequest.msg_need_clipped);
            }
            protoWriter.writeBytes(mailGetMessageListFromNetRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageListFromNetRequest$a */
    public static final class C16740a extends Message.Builder<MailGetMessageListFromNetRequest, C16740a> {

        /* renamed from: a */
        public String f43201a;

        /* renamed from: b */
        public String f43202b;

        /* renamed from: c */
        public List<String> f43203c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f43204d;

        /* renamed from: a */
        public MailGetMessageListFromNetRequest build() {
            return new MailGetMessageListFromNetRequest(this.f43201a, this.f43202b, this.f43203c, this.f43204d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16740a mo59410a(String str) {
            this.f43201a = str;
            return this;
        }

        /* renamed from: b */
        public C16740a mo59413b(String str) {
            this.f43202b = str;
            return this;
        }

        /* renamed from: a */
        public C16740a mo59411a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43203c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16740a newBuilder() {
        C16740a aVar = new C16740a();
        aVar.f43201a = this.thread_id;
        aVar.f43202b = this.label_id;
        aVar.f43203c = Internal.copyOf("new_message_ids", this.new_message_ids);
        aVar.f43204d = this.msg_need_clipped;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMessageListFromNetRequest");
        StringBuilder sb = new StringBuilder();
        if (this.thread_id != null) {
            sb.append(", thread_id=");
            sb.append(this.thread_id);
        }
        if (this.label_id != null) {
            sb.append(", label_id=");
            sb.append(this.label_id);
        }
        if (!this.new_message_ids.isEmpty()) {
            sb.append(", new_message_ids=");
            sb.append(this.new_message_ids);
        }
        if (this.msg_need_clipped != null) {
            sb.append(", msg_need_clipped=");
            sb.append(this.msg_need_clipped);
        }
        StringBuilder replace = sb.replace(0, 2, "MailGetMessageListFromNetRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMessageListFromNetRequest(String str, String str2, List<String> list, Boolean bool) {
        this(str, str2, list, bool, ByteString.EMPTY);
    }

    public MailGetMessageListFromNetRequest(String str, String str2, List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.label_id = str2;
        this.new_message_ids = Internal.immutableCopyOf("new_message_ids", list);
        this.msg_need_clipped = bool;
    }
}
