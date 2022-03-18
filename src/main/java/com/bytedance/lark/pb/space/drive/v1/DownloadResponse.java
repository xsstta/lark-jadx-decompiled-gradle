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

public final class DownloadResponse extends Message<DownloadResponse, C19353a> {
    public static final ProtoAdapter<DownloadResponse> ADAPTER = new C19354b();
    private static final long serialVersionUID = 0;
    public final String key;

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadResponse$b */
    private static final class C19354b extends ProtoAdapter<DownloadResponse> {
        C19354b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadResponse downloadResponse) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, downloadResponse.key) + downloadResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadResponse decode(ProtoReader protoReader) throws IOException {
            C19353a aVar = new C19353a();
            aVar.f47583a = "";
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
                    aVar.f47583a = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, DownloadResponse downloadResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, downloadResponse.key);
            protoWriter.writeBytes(downloadResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.drive.v1.DownloadResponse$a */
    public static final class C19353a extends Message.Builder<DownloadResponse, C19353a> {

        /* renamed from: a */
        public String f47583a;

        /* renamed from: a */
        public DownloadResponse build() {
            String str = this.f47583a;
            if (str != null) {
                return new DownloadResponse(str, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "key");
        }
    }

    @Override // com.squareup.wire.Message
    public C19353a newBuilder() {
        C19353a aVar = new C19353a();
        aVar.f47583a = this.key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "DownloadResponse");
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        StringBuilder replace = sb.replace(0, 2, "DownloadResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadResponse(String str) {
        this(str, ByteString.EMPTY);
    }

    public DownloadResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
    }
}
