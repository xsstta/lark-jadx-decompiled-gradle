package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushAutoTranslateScopeNotify extends Message<PushAutoTranslateScopeNotify, C17869a> {
    public static final ProtoAdapter<PushAutoTranslateScopeNotify> ADAPTER = new C17870b();
    public static final Integer DEFAULT_SCOPES = 0;
    private static final long serialVersionUID = 0;
    public final Integer scopes;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushAutoTranslateScopeNotify$b */
    private static final class C17870b extends ProtoAdapter<PushAutoTranslateScopeNotify> {
        C17870b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAutoTranslateScopeNotify.class);
        }

        /* renamed from: a */
        public int encodedSize(PushAutoTranslateScopeNotify pushAutoTranslateScopeNotify) {
            int i;
            if (pushAutoTranslateScopeNotify.scopes != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, pushAutoTranslateScopeNotify.scopes);
            } else {
                i = 0;
            }
            return i + pushAutoTranslateScopeNotify.unknownFields().size();
        }

        /* renamed from: a */
        public PushAutoTranslateScopeNotify decode(ProtoReader protoReader) throws IOException {
            C17869a aVar = new C17869a();
            aVar.f44941a = 0;
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
                    aVar.f44941a = ProtoAdapter.INT32.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushAutoTranslateScopeNotify pushAutoTranslateScopeNotify) throws IOException {
            if (pushAutoTranslateScopeNotify.scopes != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, pushAutoTranslateScopeNotify.scopes);
            }
            protoWriter.writeBytes(pushAutoTranslateScopeNotify.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushAutoTranslateScopeNotify$a */
    public static final class C17869a extends Message.Builder<PushAutoTranslateScopeNotify, C17869a> {

        /* renamed from: a */
        public Integer f44941a;

        /* renamed from: a */
        public PushAutoTranslateScopeNotify build() {
            return new PushAutoTranslateScopeNotify(this.f44941a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17869a newBuilder() {
        C17869a aVar = new C17869a();
        aVar.f44941a = this.scopes;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushAutoTranslateScopeNotify");
        StringBuilder sb = new StringBuilder();
        if (this.scopes != null) {
            sb.append(", scopes=");
            sb.append(this.scopes);
        }
        StringBuilder replace = sb.replace(0, 2, "PushAutoTranslateScopeNotify{");
        replace.append('}');
        return replace.toString();
    }

    public PushAutoTranslateScopeNotify(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public PushAutoTranslateScopeNotify(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.scopes = num;
    }
}
