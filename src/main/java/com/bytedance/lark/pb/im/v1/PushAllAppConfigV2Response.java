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

public final class PushAllAppConfigV2Response extends Message<PushAllAppConfigV2Response, C17865a> {
    public static final ProtoAdapter<PushAllAppConfigV2Response> ADAPTER = new C17866b();
    private static final long serialVersionUID = 0;
    public final AppConfigV2 config;

    /* renamed from: com.bytedance.lark.pb.im.v1.PushAllAppConfigV2Response$b */
    private static final class C17866b extends ProtoAdapter<PushAllAppConfigV2Response> {
        C17866b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushAllAppConfigV2Response.class);
        }

        /* renamed from: a */
        public int encodedSize(PushAllAppConfigV2Response pushAllAppConfigV2Response) {
            int i;
            if (pushAllAppConfigV2Response.config != null) {
                i = AppConfigV2.ADAPTER.encodedSizeWithTag(1, pushAllAppConfigV2Response.config);
            } else {
                i = 0;
            }
            return i + pushAllAppConfigV2Response.unknownFields().size();
        }

        /* renamed from: a */
        public PushAllAppConfigV2Response decode(ProtoReader protoReader) throws IOException {
            C17865a aVar = new C17865a();
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
                    aVar.f44935a = AppConfigV2.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushAllAppConfigV2Response pushAllAppConfigV2Response) throws IOException {
            if (pushAllAppConfigV2Response.config != null) {
                AppConfigV2.ADAPTER.encodeWithTag(protoWriter, 1, pushAllAppConfigV2Response.config);
            }
            protoWriter.writeBytes(pushAllAppConfigV2Response.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.PushAllAppConfigV2Response$a */
    public static final class C17865a extends Message.Builder<PushAllAppConfigV2Response, C17865a> {

        /* renamed from: a */
        public AppConfigV2 f44935a;

        /* renamed from: a */
        public PushAllAppConfigV2Response build() {
            return new PushAllAppConfigV2Response(this.f44935a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17865a newBuilder() {
        C17865a aVar = new C17865a();
        aVar.f44935a = this.config;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "PushAllAppConfigV2Response");
        StringBuilder sb = new StringBuilder();
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        StringBuilder replace = sb.replace(0, 2, "PushAllAppConfigV2Response{");
        replace.append('}');
        return replace.toString();
    }

    public PushAllAppConfigV2Response(AppConfigV2 appConfigV2) {
        this(appConfigV2, ByteString.EMPTY);
    }

    public PushAllAppConfigV2Response(AppConfigV2 appConfigV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config = appConfigV2;
    }
}
