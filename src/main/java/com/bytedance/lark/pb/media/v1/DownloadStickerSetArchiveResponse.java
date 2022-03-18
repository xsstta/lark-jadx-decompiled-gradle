package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class DownloadStickerSetArchiveResponse extends Message<DownloadStickerSetArchiveResponse, C18218a> {
    public static final ProtoAdapter<DownloadStickerSetArchiveResponse> ADAPTER = new C18219b();
    private static final long serialVersionUID = 0;

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadStickerSetArchiveResponse$b */
    private static final class C18219b extends ProtoAdapter<DownloadStickerSetArchiveResponse> {
        C18219b() {
            super(FieldEncoding.LENGTH_DELIMITED, DownloadStickerSetArchiveResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(DownloadStickerSetArchiveResponse downloadStickerSetArchiveResponse) {
            return downloadStickerSetArchiveResponse.unknownFields().size();
        }

        /* renamed from: a */
        public DownloadStickerSetArchiveResponse decode(ProtoReader protoReader) throws IOException {
            C18218a aVar = new C18218a();
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
        public void encode(ProtoWriter protoWriter, DownloadStickerSetArchiveResponse downloadStickerSetArchiveResponse) throws IOException {
            protoWriter.writeBytes(downloadStickerSetArchiveResponse.unknownFields());
        }
    }

    public DownloadStickerSetArchiveResponse() {
        this(ByteString.EMPTY);
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.DownloadStickerSetArchiveResponse$a */
    public static final class C18218a extends Message.Builder<DownloadStickerSetArchiveResponse, C18218a> {
        /* renamed from: a */
        public DownloadStickerSetArchiveResponse build() {
            return new DownloadStickerSetArchiveResponse(super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18218a newBuilder() {
        C18218a aVar = new C18218a();
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "DownloadStickerSetArchiveResponse");
        StringBuilder replace = new StringBuilder().replace(0, 2, "DownloadStickerSetArchiveResponse{");
        replace.append('}');
        return replace.toString();
    }

    public DownloadStickerSetArchiveResponse(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
