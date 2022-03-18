package com.bytedance.lark.pb.todo.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class ShareTodoMessageResponse extends Message<ShareTodoMessageResponse, C19635a> {
    public static final ProtoAdapter<ShareTodoMessageResponse> ADAPTER = new C19636b();
    private static final long serialVersionUID = 0;
    public final Map<String, String> chat_id2message_ids;
    public final List<ShareFailedChat> failed_chats;
    public final Map<String, Share2ThreadTarget> message2threads;

    public static final class Share2ThreadTarget extends Message<Share2ThreadTarget, C19631a> {
        public static final ProtoAdapter<Share2ThreadTarget> ADAPTER = new C19632b();
        private static final long serialVersionUID = 0;
        public final String channel_id;
        public final String thread_id;

        /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse$Share2ThreadTarget$b */
        private static final class C19632b extends ProtoAdapter<Share2ThreadTarget> {
            C19632b() {
                super(FieldEncoding.LENGTH_DELIMITED, Share2ThreadTarget.class);
            }

            /* renamed from: a */
            public int encodedSize(Share2ThreadTarget share2ThreadTarget) {
                int i;
                int i2 = 0;
                if (share2ThreadTarget.thread_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, share2ThreadTarget.thread_id);
                } else {
                    i = 0;
                }
                if (share2ThreadTarget.channel_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, share2ThreadTarget.channel_id);
                }
                return i + i2 + share2ThreadTarget.unknownFields().size();
            }

            /* renamed from: a */
            public Share2ThreadTarget decode(ProtoReader protoReader) throws IOException {
                C19631a aVar = new C19631a();
                aVar.f48004a = "";
                aVar.f48005b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48004a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48005b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Share2ThreadTarget share2ThreadTarget) throws IOException {
                if (share2ThreadTarget.thread_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, share2ThreadTarget.thread_id);
                }
                if (share2ThreadTarget.channel_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, share2ThreadTarget.channel_id);
                }
                protoWriter.writeBytes(share2ThreadTarget.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse$Share2ThreadTarget$a */
        public static final class C19631a extends Message.Builder<Share2ThreadTarget, C19631a> {

            /* renamed from: a */
            public String f48004a;

            /* renamed from: b */
            public String f48005b;

            /* renamed from: a */
            public Share2ThreadTarget build() {
                return new Share2ThreadTarget(this.f48004a, this.f48005b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19631a newBuilder() {
            C19631a aVar = new C19631a();
            aVar.f48004a = this.thread_id;
            aVar.f48005b = this.channel_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "Share2ThreadTarget");
            StringBuilder sb = new StringBuilder();
            if (this.thread_id != null) {
                sb.append(", thread_id=");
                sb.append(this.thread_id);
            }
            if (this.channel_id != null) {
                sb.append(", channel_id=");
                sb.append(this.channel_id);
            }
            StringBuilder replace = sb.replace(0, 2, "Share2ThreadTarget{");
            replace.append('}');
            return replace.toString();
        }

        public Share2ThreadTarget(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public Share2ThreadTarget(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.thread_id = str;
            this.channel_id = str2;
        }
    }

    public static final class ShareFailedChat extends Message<ShareFailedChat, C19633a> {
        public static final ProtoAdapter<ShareFailedChat> ADAPTER = new C19634b();
        public static final Integer DEFAULT_ERROR_CODE = 0;
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final String chat_name;
        public final Integer error_code;

        /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse$ShareFailedChat$b */
        private static final class C19634b extends ProtoAdapter<ShareFailedChat> {
            C19634b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareFailedChat.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareFailedChat shareFailedChat) {
                int i;
                int i2;
                int i3 = 0;
                if (shareFailedChat.error_code != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(1, shareFailedChat.error_code);
                } else {
                    i = 0;
                }
                if (shareFailedChat.chat_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, shareFailedChat.chat_id);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (shareFailedChat.chat_name != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, shareFailedChat.chat_name);
                }
                return i4 + i3 + shareFailedChat.unknownFields().size();
            }

            /* renamed from: a */
            public ShareFailedChat decode(ProtoReader protoReader) throws IOException {
                C19633a aVar = new C19633a();
                aVar.f48006a = 0;
                aVar.f48007b = "";
                aVar.f48008c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f48006a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f48007b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f48008c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareFailedChat shareFailedChat) throws IOException {
                if (shareFailedChat.error_code != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, shareFailedChat.error_code);
                }
                if (shareFailedChat.chat_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareFailedChat.chat_id);
                }
                if (shareFailedChat.chat_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareFailedChat.chat_name);
                }
                protoWriter.writeBytes(shareFailedChat.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse$ShareFailedChat$a */
        public static final class C19633a extends Message.Builder<ShareFailedChat, C19633a> {

            /* renamed from: a */
            public Integer f48006a;

            /* renamed from: b */
            public String f48007b;

            /* renamed from: c */
            public String f48008c;

            /* renamed from: a */
            public ShareFailedChat build() {
                return new ShareFailedChat(this.f48006a, this.f48007b, this.f48008c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C19633a newBuilder() {
            C19633a aVar = new C19633a();
            aVar.f48006a = this.error_code;
            aVar.f48007b = this.chat_id;
            aVar.f48008c = this.chat_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("todo", "ShareFailedChat");
            StringBuilder sb = new StringBuilder();
            if (this.error_code != null) {
                sb.append(", error_code=");
                sb.append(this.error_code);
            }
            if (this.chat_id != null) {
                sb.append(", chat_id=");
                sb.append(this.chat_id);
            }
            if (this.chat_name != null) {
                sb.append(", chat_name=");
                sb.append(this.chat_name);
            }
            StringBuilder replace = sb.replace(0, 2, "ShareFailedChat{");
            replace.append('}');
            return replace.toString();
        }

        public ShareFailedChat(Integer num, String str, String str2) {
            this(num, str, str2, ByteString.EMPTY);
        }

        public ShareFailedChat(Integer num, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.error_code = num;
            this.chat_id = str;
            this.chat_name = str2;
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse$a */
    public static final class C19635a extends Message.Builder<ShareTodoMessageResponse, C19635a> {

        /* renamed from: a */
        public Map<String, String> f48009a = Internal.newMutableMap();

        /* renamed from: b */
        public Map<String, Share2ThreadTarget> f48010b = Internal.newMutableMap();

        /* renamed from: c */
        public List<ShareFailedChat> f48011c = Internal.newMutableList();

        /* renamed from: a */
        public ShareTodoMessageResponse build() {
            return new ShareTodoMessageResponse(this.f48009a, this.f48010b, this.f48011c, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.todo.v1.ShareTodoMessageResponse$b */
    private static final class C19636b extends ProtoAdapter<ShareTodoMessageResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f48012a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        /* renamed from: b */
        private final ProtoAdapter<Map<String, Share2ThreadTarget>> f48013b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Share2ThreadTarget.ADAPTER);

        C19636b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareTodoMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareTodoMessageResponse shareTodoMessageResponse) {
            return this.f48012a.encodedSizeWithTag(1, shareTodoMessageResponse.chat_id2message_ids) + this.f48013b.encodedSizeWithTag(2, shareTodoMessageResponse.message2threads) + ShareFailedChat.ADAPTER.asRepeated().encodedSizeWithTag(3, shareTodoMessageResponse.failed_chats) + shareTodoMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareTodoMessageResponse decode(ProtoReader protoReader) throws IOException {
            C19635a aVar = new C19635a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48009a.putAll(this.f48012a.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.f48010b.putAll(this.f48013b.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48011c.add(ShareFailedChat.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareTodoMessageResponse shareTodoMessageResponse) throws IOException {
            this.f48012a.encodeWithTag(protoWriter, 1, shareTodoMessageResponse.chat_id2message_ids);
            this.f48013b.encodeWithTag(protoWriter, 2, shareTodoMessageResponse.message2threads);
            ShareFailedChat.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, shareTodoMessageResponse.failed_chats);
            protoWriter.writeBytes(shareTodoMessageResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19635a newBuilder() {
        C19635a aVar = new C19635a();
        aVar.f48009a = Internal.copyOf("chat_id2message_ids", this.chat_id2message_ids);
        aVar.f48010b = Internal.copyOf("message2threads", this.message2threads);
        aVar.f48011c = Internal.copyOf("failed_chats", this.failed_chats);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("todo", "ShareTodoMessageResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_id2message_ids.isEmpty()) {
            sb.append(", chat_id2message_ids=");
            sb.append(this.chat_id2message_ids);
        }
        if (!this.message2threads.isEmpty()) {
            sb.append(", message2threads=");
            sb.append(this.message2threads);
        }
        if (!this.failed_chats.isEmpty()) {
            sb.append(", failed_chats=");
            sb.append(this.failed_chats);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareTodoMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareTodoMessageResponse(Map<String, String> map, Map<String, Share2ThreadTarget> map2, List<ShareFailedChat> list) {
        this(map, map2, list, ByteString.EMPTY);
    }

    public ShareTodoMessageResponse(Map<String, String> map, Map<String, Share2ThreadTarget> map2, List<ShareFailedChat> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_id2message_ids = Internal.immutableCopyOf("chat_id2message_ids", map);
        this.message2threads = Internal.immutableCopyOf("message2threads", map2);
        this.failed_chats = Internal.immutableCopyOf("failed_chats", list);
    }
}
