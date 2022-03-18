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

public final class PushChannelNickname extends Message<PushChannelNickname, C16352a> {
    public static final ProtoAdapter<PushChannelNickname> ADAPTER = new C16353b();
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final String nickname;
    public final String user_id;

    /* renamed from: com.bytedance.lark.pb.contact.v1.PushChannelNickname$b */
    private static final class C16353b extends ProtoAdapter<PushChannelNickname> {
        C16353b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushChannelNickname.class);
        }

        /* renamed from: a */
        public int encodedSize(PushChannelNickname pushChannelNickname) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pushChannelNickname.user_id) + Channel.ADAPTER.encodedSizeWithTag(2, pushChannelNickname.channel);
            if (pushChannelNickname.nickname != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, pushChannelNickname.nickname);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushChannelNickname.unknownFields().size();
        }

        /* renamed from: a */
        public PushChannelNickname decode(ProtoReader protoReader) throws IOException {
            C16352a aVar = new C16352a();
            aVar.f42596a = "";
            aVar.f42598c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42596a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42597b = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42598c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushChannelNickname pushChannelNickname) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushChannelNickname.user_id);
            Channel.ADAPTER.encodeWithTag(protoWriter, 2, pushChannelNickname.channel);
            if (pushChannelNickname.nickname != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushChannelNickname.nickname);
            }
            protoWriter.writeBytes(pushChannelNickname.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16352a newBuilder() {
        C16352a aVar = new C16352a();
        aVar.f42596a = this.user_id;
        aVar.f42597b = this.channel;
        aVar.f42598c = this.nickname;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.PushChannelNickname$a */
    public static final class C16352a extends Message.Builder<PushChannelNickname, C16352a> {

        /* renamed from: a */
        public String f42596a;

        /* renamed from: b */
        public Channel f42597b;

        /* renamed from: c */
        public String f42598c;

        /* renamed from: a */
        public PushChannelNickname build() {
            Channel channel;
            String str = this.f42596a;
            if (str != null && (channel = this.f42597b) != null) {
                return new PushChannelNickname(str, channel, this.f42598c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "user_id", this.f42597b, "channel");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PushChannelNickname");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        StringBuilder replace = sb.replace(0, 2, "PushChannelNickname{");
        replace.append('}');
        return replace.toString();
    }

    public PushChannelNickname(String str, Channel channel2, String str2) {
        this(str, channel2, str2, ByteString.EMPTY);
    }

    public PushChannelNickname(String str, Channel channel2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.channel = channel2;
        this.nickname = str2;
    }
}
