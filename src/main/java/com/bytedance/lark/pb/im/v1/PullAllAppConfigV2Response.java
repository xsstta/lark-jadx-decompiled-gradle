package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.AppConfigV2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PullAllAppConfigV2Response extends Message<PullAllAppConfigV2Response, C17855a> {
    public static final ProtoAdapter<PullAllAppConfigV2Response> ADAPTER = new C17856b();
    private static final long serialVersionUID = 0;
    public final AppConfigV2 config;

    /* renamed from: com.bytedance.lark.pb.im.v1.PullAllAppConfigV2Response$b */
    private static final class C17856b extends ProtoAdapter<PullAllAppConfigV2Response> {
        C17856b() {
            super(FieldEncoding.LENGTH_DELIMITED, PullAllAppConfigV2Response.class);
        }

        /* renamed from: a */
        public int encodedSize(PullAllAppConfigV2Response pullAllAppConfigV2Response) {
            int i;
            if (pullAllAppConfigV2Response.config != null) {
                i = AppConfigV2.ADAPTER.encodedSizeWithTag(1, pullAllAppConfigV2Response.config);
            } else {
                i = 0;
            }
            return i + pullAllAppConfigV2Response.unknownFields().size();
        }

        /* renamed from: a */
        public PullAllAppConfigV2Response decode(ProtoReader protoReader) throws IOException {
            C17855a aVar = new C17855a();
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
                    aVar.f44921a = AppConfigV2.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PullAllAppConfigV2Response pullAllAppConfigV2Response) throws IOException {
            if (pullAllAppConfigV2Response.config != null) {
                AppConfigV2.ADAPTER.encodeWithTag(protoWriter, 1, pullAllAppConfigV2Response.config);
            }
            protoWriter.writeBytes(pullAllAppConfigV2Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PullAllAppConfigV2Response$a */
    public static final class C17855a extends Message.Builder<PullAllAppConfigV2Response, C17855a> {

        /* renamed from: a */
        public AppConfigV2 f44921a;

        /* renamed from: a */
        public PullAllAppConfigV2Response build() {
            return new PullAllAppConfigV2Response(this.f44921a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17855a newBuilder() {
        C17855a aVar = new C17855a();
        aVar.f44921a = this.config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PullAllAppConfigV2Response");
        StringBuilder sb = new StringBuilder();
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        StringBuilder replace = sb.replace(0, 2, "PullAllAppConfigV2Response{");
        replace.append('}');
        return replace.toString();
    }

    public PullAllAppConfigV2Response(AppConfigV2 appConfigV2) {
        this(appConfigV2, ByteString.EMPTY);
    }

    public PullAllAppConfigV2Response(AppConfigV2 appConfigV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = appConfigV2;
    }
}
