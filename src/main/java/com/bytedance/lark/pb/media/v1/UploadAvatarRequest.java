package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UploadAvatarRequest extends Message<UploadAvatarRequest, C18298a> {
    public static final ProtoAdapter<UploadAvatarRequest> ADAPTER = new C18299b();
    public static final ByteString DEFAULT_IMAGE = ByteString.EMPTY;
    public static final Boolean DEFAULT_NEED_MOSAIC = false;
    private static final long serialVersionUID = 0;
    public final ByteString image;
    public final Boolean need_mosaic;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAvatarRequest$b */
    private static final class C18299b extends ProtoAdapter<UploadAvatarRequest> {
        C18299b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadAvatarRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadAvatarRequest uploadAvatarRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.BYTES.encodedSizeWithTag(1, uploadAvatarRequest.image);
            if (uploadAvatarRequest.need_mosaic != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, uploadAvatarRequest.need_mosaic);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + uploadAvatarRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UploadAvatarRequest decode(ProtoReader protoReader) throws IOException {
            C18298a aVar = new C18298a();
            aVar.f45599a = ByteString.EMPTY;
            aVar.f45600b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45599a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45600b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadAvatarRequest uploadAvatarRequest) throws IOException {
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, uploadAvatarRequest.image);
            if (uploadAvatarRequest.need_mosaic != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uploadAvatarRequest.need_mosaic);
            }
            protoWriter.writeBytes(uploadAvatarRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadAvatarRequest$a */
    public static final class C18298a extends Message.Builder<UploadAvatarRequest, C18298a> {

        /* renamed from: a */
        public ByteString f45599a;

        /* renamed from: b */
        public Boolean f45600b;

        /* renamed from: a */
        public UploadAvatarRequest build() {
            ByteString byteString = this.f45599a;
            if (byteString != null) {
                return new UploadAvatarRequest(byteString, this.f45600b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(byteString, "image");
        }

        /* renamed from: a */
        public C18298a mo63362a(Boolean bool) {
            this.f45600b = bool;
            return this;
        }

        /* renamed from: a */
        public C18298a mo63363a(ByteString byteString) {
            this.f45599a = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18298a newBuilder() {
        C18298a aVar = new C18298a();
        aVar.f45599a = this.image;
        aVar.f45600b = this.need_mosaic;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadAvatarRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", image=");
        sb.append(this.image);
        if (this.need_mosaic != null) {
            sb.append(", need_mosaic=");
            sb.append(this.need_mosaic);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadAvatarRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UploadAvatarRequest(ByteString byteString, Boolean bool) {
        this(byteString, bool, ByteString.EMPTY);
    }

    public UploadAvatarRequest(ByteString byteString, Boolean bool, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.image = byteString;
        this.need_mosaic = bool;
    }
}
