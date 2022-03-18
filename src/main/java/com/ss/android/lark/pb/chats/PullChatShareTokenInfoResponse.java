package com.ss.android.lark.pb.chats;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullChatShareTokenInfoResponse extends Message<PullChatShareTokenInfoResponse, C49602a> {
    public static final ProtoAdapter<PullChatShareTokenInfoResponse> ADAPTER = new C49603b();
    public static final Boolean DEFAULT_ALREADY_IN_CHAT = false;
    private static final long serialVersionUID = 0;
    public final Boolean malready_in_chat;
    public final String mchat_id;
    public final String minviter_id;

    /* renamed from: com.ss.android.lark.pb.chats.PullChatShareTokenInfoResponse$b */
    private static final class C49603b extends ProtoAdapter<PullChatShareTokenInfoResponse> {
        C49603b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullChatShareTokenInfoResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(PullChatShareTokenInfoResponse pullChatShareTokenInfoResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (pullChatShareTokenInfoResponse.malready_in_chat != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(1, pullChatShareTokenInfoResponse.malready_in_chat);
            } else {
                i = 0;
            }
            if (pullChatShareTokenInfoResponse.mchat_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pullChatShareTokenInfoResponse.mchat_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (pullChatShareTokenInfoResponse.minviter_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pullChatShareTokenInfoResponse.minviter_id);
            }
            return i4 + i3 + pullChatShareTokenInfoResponse.unknownFields().size();
        }

        /* renamed from: a */
        public PullChatShareTokenInfoResponse decode(ProtoReader protoReader) throws IOException {
            C49602a aVar = new C49602a();
            aVar.f124228a = false;
            aVar.f124229b = "";
            aVar.f124230c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124228a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124229b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124230c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullChatShareTokenInfoResponse pullChatShareTokenInfoResponse) throws IOException {
            if (pullChatShareTokenInfoResponse.malready_in_chat != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, pullChatShareTokenInfoResponse.malready_in_chat);
            }
            if (pullChatShareTokenInfoResponse.mchat_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pullChatShareTokenInfoResponse.mchat_id);
            }
            if (pullChatShareTokenInfoResponse.minviter_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pullChatShareTokenInfoResponse.minviter_id);
            }
            protoWriter.writeBytes(pullChatShareTokenInfoResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.chats.PullChatShareTokenInfoResponse$a */
    public static final class C49602a extends Message.Builder<PullChatShareTokenInfoResponse, C49602a> {

        /* renamed from: a */
        public Boolean f124228a;

        /* renamed from: b */
        public String f124229b;

        /* renamed from: c */
        public String f124230c;

        /* renamed from: a */
        public PullChatShareTokenInfoResponse build() {
            return new PullChatShareTokenInfoResponse(this.f124228a, this.f124229b, this.f124230c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49602a newBuilder() {
        C49602a aVar = new C49602a();
        aVar.f124228a = this.malready_in_chat;
        aVar.f124229b = this.mchat_id;
        aVar.f124230c = this.minviter_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.malready_in_chat != null) {
            sb.append(", already_in_chat=");
            sb.append(this.malready_in_chat);
        }
        if (this.mchat_id != null) {
            sb.append(", chat_id=");
            sb.append(this.mchat_id);
        }
        if (this.minviter_id != null) {
            sb.append(", inviter_id=");
            sb.append(this.minviter_id);
        }
        StringBuilder replace = sb.replace(0, 2, "PullChatShareTokenInfoResponse{");
        replace.append('}');
        return replace.toString();
    }

    public PullChatShareTokenInfoResponse(Boolean bool, String str, String str2) {
        this(bool, str, str2, ByteString.EMPTY);
    }

    public PullChatShareTokenInfoResponse(Boolean bool, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.malready_in_chat = bool;
        this.mchat_id = str;
        this.minviter_id = str2;
    }
}
