package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushContactToken extends Message<PushContactToken, C17885a> {
    public static final ProtoAdapter<PushContactToken> ADAPTER = new C17886b();
    private static final long serialVersionUID = 0;
    public final String token;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushContactToken$b */
    private static final class C17886b extends ProtoAdapter<PushContactToken> {
        C17886b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushContactToken.class);
        }

        /* renamed from: a */
        public int encodedSize(PushContactToken pushContactToken) {
            int i;
            if (pushContactToken.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushContactToken.token);
            } else {
                i = 0;
            }
            return i + pushContactToken.unknownFields().size();
        }

        /* renamed from: a */
        public PushContactToken decode(ProtoReader protoReader) throws IOException {
            C17885a aVar = new C17885a();
            aVar.f44961a = "";
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
                    aVar.f44961a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushContactToken pushContactToken) throws IOException {
            if (pushContactToken.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushContactToken.token);
            }
            protoWriter.writeBytes(pushContactToken.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushContactToken$a */
    public static final class C17885a extends Message.Builder<PushContactToken, C17885a> {

        /* renamed from: a */
        public String f44961a;

        /* renamed from: a */
        public PushContactToken build() {
            return new PushContactToken(this.f44961a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17885a newBuilder() {
        C17885a aVar = new C17885a();
        aVar.f44961a = this.token;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushContactToken");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        StringBuilder replace = sb.replace(0, 2, "PushContactToken{");
        replace.append('}');
        return replace.toString();
    }

    public PushContactToken(String str) {
        this(str, ByteString.EMPTY);
    }

    public PushContactToken(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
    }
}
