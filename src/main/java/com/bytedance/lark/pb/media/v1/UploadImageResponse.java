package com.bytedance.lark.pb.media.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UploadImageResponse extends Message<UploadImageResponse, C18306a> {
    public static final ProtoAdapter<UploadImageResponse> ADAPTER = new C18307b();
    private static final long serialVersionUID = 0;
    public final ImageSet image_set;
    public final String local_key;

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageResponse$b */
    private static final class C18307b extends ProtoAdapter<UploadImageResponse> {
        C18307b() {
            super(FieldEncoding.LENGTH_DELIMITED, UploadImageResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(UploadImageResponse uploadImageResponse) {
            int i;
            int i2 = 0;
            if (uploadImageResponse.local_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, uploadImageResponse.local_key);
            } else {
                i = 0;
            }
            if (uploadImageResponse.image_set != null) {
                i2 = ImageSet.ADAPTER.encodedSizeWithTag(2, uploadImageResponse.image_set);
            }
            return i + i2 + uploadImageResponse.unknownFields().size();
        }

        /* renamed from: a */
        public UploadImageResponse decode(ProtoReader protoReader) throws IOException {
            C18306a aVar = new C18306a();
            aVar.f45608a = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45608a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45609b = ImageSet.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UploadImageResponse uploadImageResponse) throws IOException {
            if (uploadImageResponse.local_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadImageResponse.local_key);
            }
            if (uploadImageResponse.image_set != null) {
                ImageSet.ADAPTER.encodeWithTag(protoWriter, 2, uploadImageResponse.image_set);
            }
            protoWriter.writeBytes(uploadImageResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.media.v1.UploadImageResponse$a */
    public static final class C18306a extends Message.Builder<UploadImageResponse, C18306a> {

        /* renamed from: a */
        public String f45608a;

        /* renamed from: b */
        public ImageSet f45609b;

        /* renamed from: a */
        public UploadImageResponse build() {
            return new UploadImageResponse(this.f45608a, this.f45609b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18306a newBuilder() {
        C18306a aVar = new C18306a();
        aVar.f45608a = this.local_key;
        aVar.f45609b = this.image_set;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("media", "UploadImageResponse");
        StringBuilder sb = new StringBuilder();
        if (this.local_key != null) {
            sb.append(", local_key=");
            sb.append(this.local_key);
        }
        if (this.image_set != null) {
            sb.append(", image_set=");
            sb.append(this.image_set);
        }
        StringBuilder replace = sb.replace(0, 2, "UploadImageResponse{");
        replace.append('}');
        return replace.toString();
    }

    public UploadImageResponse(String str, ImageSet imageSet) {
        this(str, imageSet, ByteString.EMPTY);
    }

    public UploadImageResponse(String str, ImageSet imageSet, ByteString byteString) {
        super(ADAPTER, byteString);
        this.local_key = str;
        this.image_set = imageSet;
    }
}
