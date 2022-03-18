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

public final class Transmit2ThreadTarget extends Message<Transmit2ThreadTarget, C18113a> {
    public static final ProtoAdapter<Transmit2ThreadTarget> ADAPTER = new C18114b();
    private static final long serialVersionUID = 0;
    public final String channel_id;
    public final String thread_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget$b */
    private static final class C18114b extends ProtoAdapter<Transmit2ThreadTarget> {
        C18114b() {
            super(FieldEncoding.LENGTH_DELIMITED, Transmit2ThreadTarget.class);
        }

        /* renamed from: a */
        public int encodedSize(Transmit2ThreadTarget transmit2ThreadTarget) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, transmit2ThreadTarget.thread_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, transmit2ThreadTarget.channel_id) + transmit2ThreadTarget.unknownFields().size();
        }

        /* renamed from: a */
        public Transmit2ThreadTarget decode(ProtoReader protoReader) throws IOException {
            C18113a aVar = new C18113a();
            aVar.f45264a = "";
            aVar.f45265b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45264a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45265b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Transmit2ThreadTarget transmit2ThreadTarget) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, transmit2ThreadTarget.thread_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, transmit2ThreadTarget.channel_id);
            protoWriter.writeBytes(transmit2ThreadTarget.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18113a newBuilder() {
        C18113a aVar = new C18113a();
        aVar.f45264a = this.thread_id;
        aVar.f45265b = this.channel_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.Transmit2ThreadTarget$a */
    public static final class C18113a extends Message.Builder<Transmit2ThreadTarget, C18113a> {

        /* renamed from: a */
        public String f45264a;

        /* renamed from: b */
        public String f45265b;

        /* renamed from: a */
        public Transmit2ThreadTarget build() {
            String str;
            String str2 = this.f45264a;
            if (str2 != null && (str = this.f45265b) != null) {
                return new Transmit2ThreadTarget(str2, str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "thread_id", this.f45265b, "channel_id");
        }

        /* renamed from: a */
        public C18113a mo62829a(String str) {
            this.f45264a = str;
            return this;
        }

        /* renamed from: b */
        public C18113a mo62831b(String str) {
            this.f45265b = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "Transmit2ThreadTarget");
        StringBuilder sb = new StringBuilder();
        sb.append(", thread_id=");
        sb.append(this.thread_id);
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        StringBuilder replace = sb.replace(0, 2, "Transmit2ThreadTarget{");
        replace.append('}');
        return replace.toString();
    }

    public Transmit2ThreadTarget(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public Transmit2ThreadTarget(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.thread_id = str;
        this.channel_id = str2;
    }
}
