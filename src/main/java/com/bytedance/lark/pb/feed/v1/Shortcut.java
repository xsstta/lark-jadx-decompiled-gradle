package com.bytedance.lark.pb.feed.v1;

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

public final class Shortcut extends Message<Shortcut, C17228a> {
    public static final ProtoAdapter<Shortcut> ADAPTER = new C17229b();
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final Integer position;

    /* renamed from: com.bytedance.lark.pb.feed.v1.Shortcut$b */
    private static final class C17229b extends ProtoAdapter<Shortcut> {
        C17229b() {
            super(FieldEncoding.LENGTH_DELIMITED, Shortcut.class);
        }

        /* renamed from: a */
        public int encodedSize(Shortcut shortcut) {
            int i;
            int encodedSizeWithTag = Channel.ADAPTER.encodedSizeWithTag(1, shortcut.channel);
            if (shortcut.position != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, shortcut.position);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + shortcut.unknownFields().size();
        }

        /* renamed from: a */
        public Shortcut decode(ProtoReader protoReader) throws IOException {
            C17228a aVar = new C17228a();
            aVar.f44034b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44033a = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44034b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Shortcut shortcut) throws IOException {
            Channel.ADAPTER.encodeWithTag(protoWriter, 1, shortcut.channel);
            if (shortcut.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, shortcut.position);
            }
            protoWriter.writeBytes(shortcut.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.feed.v1.Shortcut$a */
    public static final class C17228a extends Message.Builder<Shortcut, C17228a> {

        /* renamed from: a */
        public Channel f44033a;

        /* renamed from: b */
        public Integer f44034b;

        /* renamed from: a */
        public Shortcut build() {
            Channel channel = this.f44033a;
            if (channel != null) {
                return new Shortcut(channel, this.f44034b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(channel, "channel");
        }

        /* renamed from: a */
        public C17228a mo60591a(Channel channel) {
            this.f44033a = channel;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C17228a newBuilder() {
        C17228a aVar = new C17228a();
        aVar.f44033a = this.channel;
        aVar.f44034b = this.position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("feed", "Shortcut");
        StringBuilder sb = new StringBuilder();
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        StringBuilder replace = sb.replace(0, 2, "Shortcut{");
        replace.append('}');
        return replace.toString();
    }

    public Shortcut(Channel channel2, Integer num) {
        this(channel2, num, ByteString.EMPTY);
    }

    public Shortcut(Channel channel2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel = channel2;
        this.position = num;
    }
}
