package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ShareTarget extends Message<ShareTarget, C18077a> {
    public static final ProtoAdapter<ShareTarget> ADAPTER = new C18078b();
    private static final long serialVersionUID = 0;
    public final Chat to_chat;
    public final Thread to_thread;

    public static final class Chat extends Message<Chat, C18073a> {
        public static final ProtoAdapter<Chat> ADAPTER = new C18074b();
        private static final long serialVersionUID = 0;
        public final String chat_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareTarget$Chat$b */
        private static final class C18074b extends ProtoAdapter<Chat> {
            C18074b() {
                super(FieldEncoding.LENGTH_DELIMITED, Chat.class);
            }

            /* renamed from: a */
            public int encodedSize(Chat chat) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, chat.chat_id) + chat.unknownFields().size();
            }

            /* renamed from: a */
            public Chat decode(ProtoReader protoReader) throws IOException {
                C18073a aVar = new C18073a();
                aVar.f45200a = "";
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
                        aVar.f45200a = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Chat chat) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chat.chat_id);
                protoWriter.writeBytes(chat.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareTarget$Chat$a */
        public static final class C18073a extends Message.Builder<Chat, C18073a> {

            /* renamed from: a */
            public String f45200a;

            /* renamed from: a */
            public Chat build() {
                String str = this.f45200a;
                if (str != null) {
                    return new Chat(str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "chat_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C18073a newBuilder() {
            C18073a aVar = new C18073a();
            aVar.f45200a = this.chat_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "Chat");
            StringBuilder sb = new StringBuilder();
            sb.append(", chat_id=");
            sb.append(this.chat_id);
            StringBuilder replace = sb.replace(0, 2, "Chat{");
            replace.append('}');
            return replace.toString();
        }

        public Chat(String str) {
            this(str, ByteString.EMPTY);
        }

        public Chat(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.chat_id = str;
        }
    }

    public static final class Thread extends Message<Thread, C18075a> {
        public static final ProtoAdapter<Thread> ADAPTER = new C18076b();
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final String thread_id;

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareTarget$Thread$b */
        private static final class C18076b extends ProtoAdapter<Thread> {
            C18076b() {
                super(FieldEncoding.LENGTH_DELIMITED, Thread.class);
            }

            /* renamed from: a */
            public int encodedSize(Thread thread) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, thread.thread_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, thread.chat_id) + thread.unknownFields().size();
            }

            /* renamed from: a */
            public Thread decode(ProtoReader protoReader) throws IOException {
                C18075a aVar = new C18075a();
                aVar.f45201a = "";
                aVar.f45202b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f45201a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f45202b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Thread thread) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, thread.thread_id);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, thread.chat_id);
                protoWriter.writeBytes(thread.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18075a newBuilder() {
            C18075a aVar = new C18075a();
            aVar.f45201a = this.thread_id;
            aVar.f45202b = this.chat_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.im.v1.ShareTarget$Thread$a */
        public static final class C18075a extends Message.Builder<Thread, C18075a> {

            /* renamed from: a */
            public String f45201a;

            /* renamed from: b */
            public String f45202b;

            /* renamed from: a */
            public Thread build() {
                String str;
                String str2 = this.f45201a;
                if (str2 != null && (str = this.f45202b) != null) {
                    return new Thread(str2, str, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str2, "thread_id", this.f45202b, "chat_id");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("im", "Thread");
            StringBuilder sb = new StringBuilder();
            sb.append(", thread_id=");
            sb.append(this.thread_id);
            sb.append(", chat_id=");
            sb.append(this.chat_id);
            StringBuilder replace = sb.replace(0, 2, "Thread{");
            replace.append('}');
            return replace.toString();
        }

        public Thread(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public Thread(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.thread_id = str;
            this.chat_id = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareTarget$b */
    private static final class C18078b extends ProtoAdapter<ShareTarget> {
        C18078b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareTarget.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareTarget shareTarget) {
            int i;
            int i2 = 0;
            if (shareTarget.to_chat != null) {
                i = Chat.ADAPTER.encodedSizeWithTag(1, shareTarget.to_chat);
            } else {
                i = 0;
            }
            if (shareTarget.to_thread != null) {
                i2 = Thread.ADAPTER.encodedSizeWithTag(2, shareTarget.to_thread);
            }
            return i + i2 + shareTarget.unknownFields().size();
        }

        /* renamed from: a */
        public ShareTarget decode(ProtoReader protoReader) throws IOException {
            C18077a aVar = new C18077a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.mo62741a(Chat.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.mo62742a(Thread.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareTarget shareTarget) throws IOException {
            if (shareTarget.to_chat != null) {
                Chat.ADAPTER.encodeWithTag(protoWriter, 1, shareTarget.to_chat);
            }
            if (shareTarget.to_thread != null) {
                Thread.ADAPTER.encodeWithTag(protoWriter, 2, shareTarget.to_thread);
            }
            protoWriter.writeBytes(shareTarget.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ShareTarget$a */
    public static final class C18077a extends Message.Builder<ShareTarget, C18077a> {

        /* renamed from: a */
        public Chat f45203a;

        /* renamed from: b */
        public Thread f45204b;

        /* renamed from: a */
        public ShareTarget build() {
            return new ShareTarget(this.f45203a, this.f45204b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18077a mo62741a(Chat chat) {
            this.f45203a = chat;
            this.f45204b = null;
            return this;
        }

        /* renamed from: a */
        public C18077a mo62742a(Thread thread) {
            this.f45204b = thread;
            this.f45203a = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18077a newBuilder() {
        C18077a aVar = new C18077a();
        aVar.f45203a = this.to_chat;
        aVar.f45204b = this.to_thread;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ShareTarget");
        StringBuilder sb = new StringBuilder();
        if (this.to_chat != null) {
            sb.append(", to_chat=");
            sb.append(this.to_chat);
        }
        if (this.to_thread != null) {
            sb.append(", to_thread=");
            sb.append(this.to_thread);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareTarget{");
        replace.append('}');
        return replace.toString();
    }

    public ShareTarget(Chat chat, Thread thread) {
        this(chat, thread, ByteString.EMPTY);
    }

    public ShareTarget(Chat chat, Thread thread, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(chat, thread) <= 1) {
            this.to_chat = chat;
            this.to_thread = thread;
            return;
        }
        throw new IllegalArgumentException("at most one of to_chat, to_thread may be non-null");
    }
}
