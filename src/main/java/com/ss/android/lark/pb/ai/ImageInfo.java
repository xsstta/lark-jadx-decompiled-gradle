package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ImageInfo extends Message<ImageInfo, C49489a> {
    public static final ProtoAdapter<ImageInfo> ADAPTER = new C49490b();
    public static final ByteString DEFAULT_DATA = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final ByteString mdata;
    public final String mtos_object;

    /* renamed from: com.ss.android.lark.pb.ai.ImageInfo$b */
    private static final class C49490b extends ProtoAdapter<ImageInfo> {
        C49490b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageInfo imageInfo) {
            int i;
            int i2 = 0;
            if (imageInfo.mdata != null) {
                i = ProtoAdapter.BYTES.encodedSizeWithTag(1, imageInfo.mdata);
            } else {
                i = 0;
            }
            if (imageInfo.mtos_object != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, imageInfo.mtos_object);
            }
            return i + i2 + imageInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ImageInfo decode(ProtoReader protoReader) throws IOException {
            C49489a aVar = new C49489a();
            aVar.f124081a = ByteString.EMPTY;
            aVar.f124082b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124081a = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124082b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageInfo imageInfo) throws IOException {
            if (imageInfo.mdata != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, imageInfo.mdata);
            }
            if (imageInfo.mtos_object != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageInfo.mtos_object);
            }
            protoWriter.writeBytes(imageInfo.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ai.ImageInfo$a */
    public static final class C49489a extends Message.Builder<ImageInfo, C49489a> {

        /* renamed from: a */
        public ByteString f124081a;

        /* renamed from: b */
        public String f124082b;

        /* renamed from: a */
        public ImageInfo build() {
            return new ImageInfo(this.f124081a, this.f124082b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49489a newBuilder() {
        C49489a aVar = new C49489a();
        aVar.f124081a = this.mdata;
        aVar.f124082b = this.mtos_object;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mdata != null) {
            sb.append(", data=");
            sb.append(this.mdata);
        }
        if (this.mtos_object != null) {
            sb.append(", tos_object=");
            sb.append(this.mtos_object);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ImageInfo(ByteString byteString, String str) {
        this(byteString, str, ByteString.EMPTY);
    }

    public ImageInfo(ByteString byteString, String str, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.mdata = byteString;
        this.mtos_object = str;
    }
}
