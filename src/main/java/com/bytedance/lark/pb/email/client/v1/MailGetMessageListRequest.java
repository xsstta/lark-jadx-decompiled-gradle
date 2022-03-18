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

public final class MailGetMessageListRequest extends Message<MailGetMessageListRequest, C16742a> {
    public static final ProtoAdapter<MailGetMessageListRequest> ADAPTER = new C16743b();
    public static final Boolean DEFAULT_MSG_NEED_CLIPPED = true;
    private static final long serialVersionUID = 0;
    public final String label_id;
    public final Boolean msg_need_clipped;
    public final List<String> new_message_ids;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageListRequest$b */
    private static final class C16743b extends ProtoAdapter<MailGetMessageListRequest> {
        C16743b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailGetMessageListRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(MailGetMessageListRequest mailGetMessageListRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (mailGetMessageListRequest.thread_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, mailGetMessageListRequest.thread_id);
            } else {
                i = 0;
            }
            if (mailGetMessageListRequest.label_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, mailGetMessageListRequest.label_id);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag = i + i2 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, mailGetMessageListRequest.new_message_ids);
            if (mailGetMessageListRequest.msg_need_clipped != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, mailGetMessageListRequest.msg_need_clipped);
            }
            return encodedSizeWithTag + i3 + mailGetMessageListRequest.unknownFields().size();
        }

        /* renamed from: a */
        public MailGetMessageListRequest decode(ProtoReader protoReader) throws IOException {
            C16742a aVar = new C16742a();
            aVar.f43205a = "";
            aVar.f43206b = "";
            aVar.f43208d = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f43205a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f43206b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f43207c.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f43208d = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailGetMessageListRequest mailGetMessageListRequest) throws IOException {
            if (mailGetMessageListRequest.thread_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, mailGetMessageListRequest.thread_id);
            }
            if (mailGetMessageListRequest.label_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, mailGetMessageListRequest.label_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, mailGetMessageListRequest.new_message_ids);
            if (mailGetMessageListRequest.msg_need_clipped != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, mailGetMessageListRequest.msg_need_clipped);
            }
            protoWriter.writeBytes(mailGetMessageListRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailGetMessageListRequest$a */
    public static final class C16742a extends Message.Builder<MailGetMessageListRequest, C16742a> {

        /* renamed from: a */
        public String f43205a;

        /* renamed from: b */
        public String f43206b;

        /* renamed from: c */
        public List<String> f43207c = Internal.newMutableList();

        /* renamed from: d */
        public Boolean f43208d;

        /* renamed from: a */
        public MailGetMessageListRequest build() {
            return new MailGetMessageListRequest(this.f43205a, this.f43206b, this.f43207c, this.f43208d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16742a mo59417a(String str) {
            this.f43205a = str;
            return this;
        }

        /* renamed from: b */
        public C16742a mo59420b(String str) {
            this.f43206b = str;
            return this;
        }

        /* renamed from: a */
        public C16742a mo59418a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f43207c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16742a newBuilder() {
        C16742a aVar = new C16742a();
        aVar.f43205a = this.thread_id;
        aVar.f43206b = this.label_id;
        aVar.f43207c = Internal.copyOf("new_message_ids", this.new_message_ids);
        aVar.f43208d = this.msg_need_clipped;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailGetMessageListRequest");
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
        StringBuilder replace = sb.replace(0, 2, "MailGetMessageListRequest{");
        replace.append('}');
        return replace.toString();
    }

    public MailGetMessageListRequest(String str, String str2, List<String> list, Boolean bool) {
        this(str, str2, list, bool, ByteString.EMPTY);
    }

    public MailGetMessageListRequest(String str, String str2, List<String> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.label_id = str2;
        this.new_message_ids = Internal.immutableCopyOf("new_message_ids", list);
        this.msg_need_clipped = bool;
    }
}
