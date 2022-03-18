package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class PushEmojis extends Message<PushEmojis, C17891a> {
    public static final ProtoAdapter<PushEmojis> ADAPTER = new C17892b();
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final Map<String, Emoji> emojis;
    public final Integer version;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushEmojis$a */
    public static final class C17891a extends Message.Builder<PushEmojis, C17891a> {

        /* renamed from: a */
        public Map<String, Emoji> f44967a = Internal.newMutableMap();

        /* renamed from: b */
        public Integer f44968b;

        /* renamed from: a */
        public PushEmojis build() {
            return new PushEmojis(this.f44967a, this.f44968b, super.buildUnknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushEmojis$b */
    private static final class C17892b extends ProtoAdapter<PushEmojis> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, Emoji>> f44969a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, Emoji.ADAPTER);

        C17892b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushEmojis.class);
        }

        /* renamed from: a */
        public int encodedSize(PushEmojis pushEmojis) {
            int i;
            int encodedSizeWithTag = this.f44969a.encodedSizeWithTag(1, pushEmojis.emojis);
            if (pushEmojis.version != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(2, pushEmojis.version);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + pushEmojis.unknownFields().size();
        }

        /* renamed from: a */
        public PushEmojis decode(ProtoReader protoReader) throws IOException {
            C17891a aVar = new C17891a();
            aVar.f44968b = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44967a.putAll(this.f44969a.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44968b = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushEmojis pushEmojis) throws IOException {
            this.f44969a.encodeWithTag(protoWriter, 1, pushEmojis.emojis);
            if (pushEmojis.version != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, pushEmojis.version);
            }
            protoWriter.writeBytes(pushEmojis.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17891a newBuilder() {
        C17891a aVar = new C17891a();
        aVar.f44967a = Internal.copyOf("emojis", this.emojis);
        aVar.f44968b = this.version;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushEmojis");
        StringBuilder sb = new StringBuilder();
        if (!this.emojis.isEmpty()) {
            sb.append(", emojis=");
            sb.append(this.emojis);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        StringBuilder replace = sb.replace(0, 2, "PushEmojis{");
        replace.append('}');
        return replace.toString();
    }

    public PushEmojis(Map<String, Emoji> map, Integer num) {
        this(map, num, ByteString.EMPTY);
    }

    public PushEmojis(Map<String, Emoji> map, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.emojis = Internal.immutableCopyOf("emojis", map);
        this.version = num;
    }
}
