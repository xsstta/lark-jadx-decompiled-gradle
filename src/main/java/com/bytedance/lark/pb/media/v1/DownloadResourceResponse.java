package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DownloadResourceResponse extends Message<DownloadResourceResponse, C18214a> {
    public static final ProtoAdapter<DownloadResourceResponse> ADAPTER = new C18215b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadResourceResponse$b */
    private static final class C18215b extends ProtoAdapter<DownloadResourceResponse> {
        C18215b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadResourceResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadResourceResponse downloadResourceResponse) {
            return downloadResourceResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadResourceResponse decode(ProtoReader protoReader) throws IOException {
            C18214a aVar = new C18214a();
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
        public void encode(ProtoWriter protoWriter, DownloadResourceResponse downloadResourceResponse) throws IOException {
            protoWriter.writeBytes(downloadResourceResponse.unknownFields());
        }
    }

    public DownloadResourceResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadResourceResponse$a */
    public static final class C18214a extends Message.Builder<DownloadResourceResponse, C18214a> {
        /* renamed from: a */
        public DownloadResourceResponse build() {
            return new DownloadResourceResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18214a newBuilder() {
        C18214a aVar = new C18214a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DownloadResourceResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DownloadResourceResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadResourceResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
