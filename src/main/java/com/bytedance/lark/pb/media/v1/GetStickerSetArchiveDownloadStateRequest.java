package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetStickerSetArchiveDownloadStateRequest extends Message<GetStickerSetArchiveDownloadStateRequest, C18262a> {
    public static final ProtoAdapter<GetStickerSetArchiveDownloadStateRequest> ADAPTER = new C18263b();
    private static final long serialVersionUID = 0;
    public final String path;
    public final List<String> sticker_set_ids;

    /* renamed from: com.bytedance.lark.pb.media.v1.GetStickerSetArchiveDownloadStateRequest$b */
    private static final class C18263b extends ProtoAdapter<GetStickerSetArchiveDownloadStateRequest> {
        C18263b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetStickerSetArchiveDownloadStateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetStickerSetArchiveDownloadStateRequest getStickerSetArchiveDownloadStateRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getStickerSetArchiveDownloadStateRequest.sticker_set_ids);
            if (getStickerSetArchiveDownloadStateRequest.path != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, getStickerSetArchiveDownloadStateRequest.path);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getStickerSetArchiveDownloadStateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetStickerSetArchiveDownloadStateRequest decode(ProtoReader protoReader) throws IOException {
            C18262a aVar = new C18262a();
            aVar.f45511b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45510a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45511b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetStickerSetArchiveDownloadStateRequest getStickerSetArchiveDownloadStateRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getStickerSetArchiveDownloadStateRequest.sticker_set_ids);
            if (getStickerSetArchiveDownloadStateRequest.path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getStickerSetArchiveDownloadStateRequest.path);
            }
            protoWriter.writeBytes(getStickerSetArchiveDownloadStateRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.GetStickerSetArchiveDownloadStateRequest$a */
    public static final class C18262a extends Message.Builder<GetStickerSetArchiveDownloadStateRequest, C18262a> {

        /* renamed from: a */
        public List<String> f45510a = Internal.newMutableList();

        /* renamed from: b */
        public String f45511b;

        /* renamed from: a */
        public GetStickerSetArchiveDownloadStateRequest build() {
            return new GetStickerSetArchiveDownloadStateRequest(this.f45510a, this.f45511b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18262a mo63266a(String str) {
            this.f45511b = str;
            return this;
        }

        /* renamed from: a */
        public C18262a mo63267a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45510a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18262a newBuilder() {
        C18262a aVar = new C18262a();
        aVar.f45510a = Internal.copyOf("sticker_set_ids", this.sticker_set_ids);
        aVar.f45511b = this.path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "GetStickerSetArchiveDownloadStateRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.sticker_set_ids.isEmpty()) {
            sb.append(", sticker_set_ids=");
            sb.append(this.sticker_set_ids);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        StringBuilder replace = sb.replace(0, 2, "GetStickerSetArchiveDownloadStateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetStickerSetArchiveDownloadStateRequest(List<String> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public GetStickerSetArchiveDownloadStateRequest(List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sticker_set_ids = Internal.immutableCopyOf("sticker_set_ids", list);
        this.path = str;
    }
}
