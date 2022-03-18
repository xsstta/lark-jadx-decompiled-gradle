package com.bytedance.lark.pb.space.drive.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class DownloadRangeResponse extends Message<DownloadRangeResponse, C19349a> {
    public static final ProtoAdapter<DownloadRangeResponse> ADAPTER = new C19350b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRangeResponse$b */
    private static final class C19350b extends ProtoAdapter<DownloadRangeResponse> {
        C19350b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadRangeResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadRangeResponse downloadRangeResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, downloadRangeResponse.key) + downloadRangeResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadRangeResponse decode(ProtoReader protoReader) throws IOException {
            C19349a aVar = new C19349a();
            aVar.f47562a = "";
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
                    aVar.f47562a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DownloadRangeResponse downloadRangeResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadRangeResponse.key);
            protoWriter.writeBytes(downloadRangeResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadRangeResponse$a */
    public static final class C19349a extends Message.Builder<DownloadRangeResponse, C19349a> {

        /* renamed from: a */
        public String f47562a;

        /* renamed from: a */
        public DownloadRangeResponse build() {
            String str = this.f47562a;
            if (str != null) {
                return new DownloadRangeResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C19349a newBuilder() {
        C19349a aVar = new C19349a();
        aVar.f47562a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadRangeResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "DownloadRangeResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadRangeResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public DownloadRangeResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
