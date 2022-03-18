package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Channel;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetChannelNicknameRequest extends Message<SetChannelNicknameRequest, C16390a> {
    public static final ProtoAdapter<SetChannelNicknameRequest> ADAPTER = new C16391b();
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final String nickname;

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetChannelNicknameRequest$b */
    private static final class C16391b extends ProtoAdapter<SetChannelNicknameRequest> {
        C16391b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetChannelNicknameRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetChannelNicknameRequest setChannelNicknameRequest) {
            int i;
            int encodedSizeWithTag = Channel.ADAPTER.encodedSizeWithTag(1, setChannelNicknameRequest.channel);
            if (setChannelNicknameRequest.nickname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, setChannelNicknameRequest.nickname);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setChannelNicknameRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetChannelNicknameRequest decode(ProtoReader protoReader) throws IOException {
            C16390a aVar = new C16390a();
            aVar.f42655b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42654a = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42655b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetChannelNicknameRequest setChannelNicknameRequest) throws IOException {
            Channel.ADAPTER.encodeWithTag(protoWriter, 1, setChannelNicknameRequest.channel);
            if (setChannelNicknameRequest.nickname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, setChannelNicknameRequest.nickname);
            }
            protoWriter.writeBytes(setChannelNicknameRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.SetChannelNicknameRequest$a */
    public static final class C16390a extends Message.Builder<SetChannelNicknameRequest, C16390a> {

        /* renamed from: a */
        public Channel f42654a;

        /* renamed from: b */
        public String f42655b;

        /* renamed from: a */
        public SetChannelNicknameRequest build() {
            Channel channel = this.f42654a;
            if (channel != null) {
                return new SetChannelNicknameRequest(channel, this.f42655b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channel, "channel");
        }

        /* renamed from: a */
        public C16390a mo58526a(Channel channel) {
            this.f42654a = channel;
            return this;
        }

        /* renamed from: a */
        public C16390a mo58527a(String str) {
            this.f42655b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16390a newBuilder() {
        C16390a aVar = new C16390a();
        aVar.f42654a = this.channel;
        aVar.f42655b = this.nickname;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "SetChannelNicknameRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        StringBuilder replace = sb.replace(0, 2, "SetChannelNicknameRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetChannelNicknameRequest(Channel channel2, String str) {
        this(channel2, str, ByteString.EMPTY);
    }

    public SetChannelNicknameRequest(Channel channel2, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = channel2;
        this.nickname = str;
    }
}
