package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DownloadFileResponse extends Message<DownloadFileResponse, C18210a> {
    public static final ProtoAdapter<DownloadFileResponse> ADAPTER = new C18211b();
    private static final long serialVersionUID = 0;
    public final String path;

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadFileResponse$b */
    private static final class C18211b extends ProtoAdapter<DownloadFileResponse> {
        C18211b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadFileResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadFileResponse downloadFileResponse) {
            int i;
            if (downloadFileResponse.path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, downloadFileResponse.path);
            } else {
                i = 0;
            }
            return i + downloadFileResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadFileResponse decode(ProtoReader protoReader) throws IOException {
            C18210a aVar = new C18210a();
            aVar.f45440a = "";
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
                    aVar.f45440a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DownloadFileResponse downloadFileResponse) throws IOException {
            if (downloadFileResponse.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadFileResponse.path);
            }
            protoWriter.writeBytes(downloadFileResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadFileResponse$a */
    public static final class C18210a extends Message.Builder<DownloadFileResponse, C18210a> {

        /* renamed from: a */
        public String f45440a;

        /* renamed from: a */
        public DownloadFileResponse build() {
            return new DownloadFileResponse(this.f45440a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18210a newBuilder() {
        C18210a aVar = new C18210a();
        aVar.f45440a = this.path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DownloadFileResponse");
        StringBuilder sb = new StringBuilder();
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        StringBuilder replace = sb.replace(0, 2, "DownloadFileResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadFileResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public DownloadFileResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.path = str;
    }
}
