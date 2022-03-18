package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class QuasiThread extends Message<QuasiThread, C15141a> {
    public static final ProtoAdapter<QuasiThread> ADAPTER = new C15142b();
    public static final Integer DEFAULT_POSITION = 0;
    private static final long serialVersionUID = 0;
    public final Channel channel;
    public final String id;
    public final Integer position;
    public final String topic;

    /* renamed from: com.bytedance.lark.pb.basic.v1.QuasiThread$b */
    private static final class C15142b extends ProtoAdapter<QuasiThread> {
        C15142b() {
            super(FieldEncoding.LENGTH_DELIMITED, QuasiThread.class);
        }

        /* renamed from: a */
        public int encodedSize(QuasiThread quasiThread) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, quasiThread.id) + Channel.ADAPTER.encodedSizeWithTag(2, quasiThread.channel);
            int i2 = 0;
            if (quasiThread.topic != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, quasiThread.topic);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (quasiThread.position != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, quasiThread.position);
            }
            return i3 + i2 + quasiThread.unknownFields().size();
        }

        /* renamed from: a */
        public QuasiThread decode(ProtoReader protoReader) throws IOException {
            C15141a aVar = new C15141a();
            aVar.f40178a = "";
            aVar.f40180c = "";
            aVar.f40181d = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40178a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f40179b = Channel.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f40180c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40181d = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, QuasiThread quasiThread) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quasiThread.id);
            Channel.ADAPTER.encodeWithTag(protoWriter, 2, quasiThread.channel);
            if (quasiThread.topic != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, quasiThread.topic);
            }
            if (quasiThread.position != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, quasiThread.position);
            }
            protoWriter.writeBytes(quasiThread.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15141a newBuilder() {
        C15141a aVar = new C15141a();
        aVar.f40178a = this.id;
        aVar.f40179b = this.channel;
        aVar.f40180c = this.topic;
        aVar.f40181d = this.position;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.QuasiThread$a */
    public static final class C15141a extends Message.Builder<QuasiThread, C15141a> {

        /* renamed from: a */
        public String f40178a;

        /* renamed from: b */
        public Channel f40179b;

        /* renamed from: c */
        public String f40180c;

        /* renamed from: d */
        public Integer f40181d;

        /* renamed from: a */
        public QuasiThread build() {
            Channel channel;
            String str = this.f40178a;
            if (str != null && (channel = this.f40179b) != null) {
                return new QuasiThread(str, channel, this.f40180c, this.f40181d, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f40179b, "channel");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "QuasiThread");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", channel=");
        sb.append(this.channel);
        if (this.topic != null) {
            sb.append(", topic=");
            sb.append(this.topic);
        }
        if (this.position != null) {
            sb.append(", position=");
            sb.append(this.position);
        }
        StringBuilder replace = sb.replace(0, 2, "QuasiThread{");
        replace.append('}');
        return replace.toString();
    }

    public QuasiThread(String str, Channel channel2, String str2, Integer num) {
        this(str, channel2, str2, num, ByteString.EMPTY);
    }

    public QuasiThread(String str, Channel channel2, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.channel = channel2;
        this.topic = str2;
        this.position = num;
    }
}
