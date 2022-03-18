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

public final class DownloadNormalResponse extends Message<DownloadNormalResponse, C19343a> {
    public static final ProtoAdapter<DownloadNormalResponse> ADAPTER = new C19344b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadNormalResponse$b */
    private static final class C19344b extends ProtoAdapter<DownloadNormalResponse> {
        C19344b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadNormalResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadNormalResponse downloadNormalResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, downloadNormalResponse.key) + downloadNormalResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadNormalResponse decode(ProtoReader protoReader) throws IOException {
            C19343a aVar = new C19343a();
            aVar.f47546a = "";
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
                    aVar.f47546a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DownloadNormalResponse downloadNormalResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadNormalResponse.key);
            protoWriter.writeBytes(downloadNormalResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadNormalResponse$a */
    public static final class C19343a extends Message.Builder<DownloadNormalResponse, C19343a> {

        /* renamed from: a */
        public String f47546a;

        /* renamed from: a */
        public DownloadNormalResponse build() {
            String str = this.f47546a;
            if (str != null) {
                return new DownloadNormalResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C19343a newBuilder() {
        C19343a aVar = new C19343a();
        aVar.f47546a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadNormalResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "DownloadNormalResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadNormalResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public DownloadNormalResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
