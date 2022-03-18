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

public final class MailSearchInWhichFolderResponse extends Message<MailSearchInWhichFolderResponse, C16874a> {
    public static final ProtoAdapter<MailSearchInWhichFolderResponse> ADAPTER = new C16875b();
    private static final long serialVersionUID = 0;
    public final List<MessageInFolders> message_folders;

    public static final class MessageInFolders extends Message<MessageInFolders, C16872a> {
        public static final ProtoAdapter<MessageInFolders> ADAPTER = new C16873b();
        private static final long serialVersionUID = 0;
        public final List<String> folders;
        public final String message_id;

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderResponse$MessageInFolders$b */
        private static final class C16873b extends ProtoAdapter<MessageInFolders> {
            C16873b() {
                super(FieldEncoding.LENGTH_DELIMITED, MessageInFolders.class);
            }

            /* renamed from: a */
            public int encodedSize(MessageInFolders messageInFolders) {
                int i;
                if (messageInFolders.message_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, messageInFolders.message_id);
                } else {
                    i = 0;
                }
                return i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, messageInFolders.folders) + messageInFolders.unknownFields().size();
            }

            /* renamed from: a */
            public MessageInFolders decode(ProtoReader protoReader) throws IOException {
                C16872a aVar = new C16872a();
                aVar.f43335a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f43335a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f43336b.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, MessageInFolders messageInFolders) throws IOException {
                if (messageInFolders.message_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageInFolders.message_id);
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, messageInFolders.folders);
                protoWriter.writeBytes(messageInFolders.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderResponse$MessageInFolders$a */
        public static final class C16872a extends Message.Builder<MessageInFolders, C16872a> {

            /* renamed from: a */
            public String f43335a;

            /* renamed from: b */
            public List<String> f43336b = Internal.newMutableList();

            /* renamed from: a */
            public MessageInFolders build() {
                return new MessageInFolders(this.f43335a, this.f43336b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16872a newBuilder() {
            C16872a aVar = new C16872a();
            aVar.f43335a = this.message_id;
            aVar.f43336b = Internal.copyOf("folders", this.folders);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("email", "MessageInFolders");
            StringBuilder sb = new StringBuilder();
            if (this.message_id != null) {
                sb.append(", message_id=");
                sb.append(this.message_id);
            }
            if (!this.folders.isEmpty()) {
                sb.append(", folders=");
                sb.append(this.folders);
            }
            StringBuilder replace = sb.replace(0, 2, "MessageInFolders{");
            replace.append('}');
            return replace.toString();
        }

        public MessageInFolders(String str, List<String> list) {
            this(str, list, ByteString.EMPTY);
        }

        public MessageInFolders(String str, List<String> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.message_id = str;
            this.folders = Internal.immutableCopyOf("folders", list);
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderResponse$b */
    private static final class C16875b extends ProtoAdapter<MailSearchInWhichFolderResponse> {
        C16875b() {
            super(FieldEncoding.LENGTH_DELIMITED, MailSearchInWhichFolderResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(MailSearchInWhichFolderResponse mailSearchInWhichFolderResponse) {
            return MessageInFolders.ADAPTER.asRepeated().encodedSizeWithTag(1, mailSearchInWhichFolderResponse.message_folders) + mailSearchInWhichFolderResponse.unknownFields().size();
        }

        /* renamed from: a */
        public MailSearchInWhichFolderResponse decode(ProtoReader protoReader) throws IOException {
            C16874a aVar = new C16874a();
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
                    aVar.f43337a.add(MessageInFolders.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MailSearchInWhichFolderResponse mailSearchInWhichFolderResponse) throws IOException {
            MessageInFolders.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, mailSearchInWhichFolderResponse.message_folders);
            protoWriter.writeBytes(mailSearchInWhichFolderResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.email.client.v1.MailSearchInWhichFolderResponse$a */
    public static final class C16874a extends Message.Builder<MailSearchInWhichFolderResponse, C16874a> {

        /* renamed from: a */
        public List<MessageInFolders> f43337a = Internal.newMutableList();

        /* renamed from: a */
        public MailSearchInWhichFolderResponse build() {
            return new MailSearchInWhichFolderResponse(this.f43337a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16874a newBuilder() {
        C16874a aVar = new C16874a();
        aVar.f43337a = Internal.copyOf("message_folders", this.message_folders);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("email", "MailSearchInWhichFolderResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.message_folders.isEmpty()) {
            sb.append(", message_folders=");
            sb.append(this.message_folders);
        }
        StringBuilder replace = sb.replace(0, 2, "MailSearchInWhichFolderResponse{");
        replace.append('}');
        return replace.toString();
    }

    public MailSearchInWhichFolderResponse(List<MessageInFolders> list) {
        this(list, ByteString.EMPTY);
    }

    public MailSearchInWhichFolderResponse(List<MessageInFolders> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_folders = Internal.immutableCopyOf("message_folders", list);
    }
}
