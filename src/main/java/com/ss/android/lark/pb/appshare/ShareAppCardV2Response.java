package com.ss.android.lark.pb.appshare;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ShareAppCardV2Response extends Message<ShareAppCardV2Response, C49545a> {
    public static final ProtoAdapter<ShareAppCardV2Response> ADAPTER = new C49546b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.ss.android.lark.pb.appshare.ShareAppCardV2Response$b */
    private static final class C49546b extends ProtoAdapter<ShareAppCardV2Response> {
        C49546b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareAppCardV2Response.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareAppCardV2Response shareAppCardV2Response) {
            return shareAppCardV2Response.unknownFields().size();
        }

        /* renamed from: a */
        public ShareAppCardV2Response decode(ProtoReader protoReader) throws IOException {
            C49545a aVar = new C49545a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareAppCardV2Response shareAppCardV2Response) throws IOException {
            protoWriter.writeBytes(shareAppCardV2Response.unknownFields());
        }
    }

    public ShareAppCardV2Response() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.ss.android.lark.pb.appshare.ShareAppCardV2Response$a */
    public static final class C49545a extends Message.Builder<ShareAppCardV2Response, C49545a> {
        /* renamed from: a */
        public ShareAppCardV2Response build() {
            return new ShareAppCardV2Response(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49545a newBuilder() {
        C49545a aVar = new C49545a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder replace = new StringBuilder().replace(0, 2, "ShareAppCardV2Response{");
        replace.append('}');
        return replace.toString();
    }

    public ShareAppCardV2Response(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
