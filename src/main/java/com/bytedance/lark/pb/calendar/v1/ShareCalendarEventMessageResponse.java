package com.bytedance.lark.pb.calendar.v1;

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

public final class ShareCalendarEventMessageResponse extends Message<ShareCalendarEventMessageResponse, C16052a> {
    public static final ProtoAdapter<ShareCalendarEventMessageResponse> ADAPTER = new C16053b();
    private static final long serialVersionUID = 0;
    public final List<ShareFailedChat> share_failed_chats;

    public static final class ShareFailedChat extends Message<ShareFailedChat, C16050a> {
        public static final ProtoAdapter<ShareFailedChat> ADAPTER = new C16051b();
        public static final Integer DEFAULT_ERROR_CODE = 0;
        private static final long serialVersionUID = 0;
        public final String chat_id;
        public final String chat_name;
        public final Integer error_code;

        /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageResponse$ShareFailedChat$b */
        private static final class C16051b extends ProtoAdapter<ShareFailedChat> {
            C16051b() {
                super(FieldEncoding.LENGTH_DELIMITED, ShareFailedChat.class);
            }

            /* renamed from: a */
            public int encodedSize(ShareFailedChat shareFailedChat) {
                return ProtoAdapter.INT32.encodedSizeWithTag(1, shareFailedChat.error_code) + ProtoAdapter.STRING.encodedSizeWithTag(2, shareFailedChat.chat_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, shareFailedChat.chat_name) + shareFailedChat.unknownFields().size();
            }

            /* renamed from: a */
            public ShareFailedChat decode(ProtoReader protoReader) throws IOException {
                C16050a aVar = new C16050a();
                aVar.f42127a = 0;
                aVar.f42128b = "";
                aVar.f42129c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f42127a = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f42128b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f42129c = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ShareFailedChat shareFailedChat) throws IOException {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, shareFailedChat.error_code);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, shareFailedChat.chat_id);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, shareFailedChat.chat_name);
                protoWriter.writeBytes(shareFailedChat.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C16050a newBuilder() {
            C16050a aVar = new C16050a();
            aVar.f42127a = this.error_code;
            aVar.f42128b = this.chat_id;
            aVar.f42129c = this.chat_name;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageResponse$ShareFailedChat$a */
        public static final class C16050a extends Message.Builder<ShareFailedChat, C16050a> {

            /* renamed from: a */
            public Integer f42127a;

            /* renamed from: b */
            public String f42128b;

            /* renamed from: c */
            public String f42129c;

            /* renamed from: a */
            public ShareFailedChat build() {
                String str;
                String str2;
                Integer num = this.f42127a;
                if (num != null && (str = this.f42128b) != null && (str2 = this.f42129c) != null) {
                    return new ShareFailedChat(num, str, str2, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num, "error_code", this.f42128b, "chat_id", this.f42129c, "chat_name");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("calendar", "ShareFailedChat");
            StringBuilder sb = new StringBuilder();
            sb.append(", error_code=");
            sb.append(this.error_code);
            sb.append(", chat_id=");
            sb.append(this.chat_id);
            sb.append(", chat_name=");
            sb.append(this.chat_name);
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

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageResponse$b */
    private static final class C16053b extends ProtoAdapter<ShareCalendarEventMessageResponse> {
        C16053b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareCalendarEventMessageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareCalendarEventMessageResponse shareCalendarEventMessageResponse) {
            return ShareFailedChat.ADAPTER.asRepeated().encodedSizeWithTag(1, shareCalendarEventMessageResponse.share_failed_chats) + shareCalendarEventMessageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ShareCalendarEventMessageResponse decode(ProtoReader protoReader) throws IOException {
            C16052a aVar = new C16052a();
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
                    aVar.f42130a.add(ShareFailedChat.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareCalendarEventMessageResponse shareCalendarEventMessageResponse) throws IOException {
            ShareFailedChat.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, shareCalendarEventMessageResponse.share_failed_chats);
            protoWriter.writeBytes(shareCalendarEventMessageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.calendar.v1.ShareCalendarEventMessageResponse$a */
    public static final class C16052a extends Message.Builder<ShareCalendarEventMessageResponse, C16052a> {

        /* renamed from: a */
        public List<ShareFailedChat> f42130a = Internal.newMutableList();

        /* renamed from: a */
        public ShareCalendarEventMessageResponse build() {
            return new ShareCalendarEventMessageResponse(this.f42130a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16052a newBuilder() {
        C16052a aVar = new C16052a();
        aVar.f42130a = Internal.copyOf("share_failed_chats", this.share_failed_chats);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("calendar", "ShareCalendarEventMessageResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.share_failed_chats.isEmpty()) {
            sb.append(", share_failed_chats=");
            sb.append(this.share_failed_chats);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareCalendarEventMessageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ShareCalendarEventMessageResponse(List<ShareFailedChat> list) {
        this(list, ByteString.EMPTY);
    }

    public ShareCalendarEventMessageResponse(List<ShareFailedChat> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.share_failed_chats = Internal.immutableCopyOf("share_failed_chats", list);
    }
}
