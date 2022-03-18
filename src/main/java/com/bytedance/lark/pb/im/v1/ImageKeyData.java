package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ImageKeyData extends Message<ImageKeyData, C17785a> {
    public static final ProtoAdapter<ImageKeyData> ADAPTER = new C17786b();
    private static final long serialVersionUID = 0;
    public final String image_key;
    public final String message_id;

    /* renamed from: com.bytedance.lark.pb.im.v1.ImageKeyData$b */
    private static final class C17786b extends ProtoAdapter<ImageKeyData> {
        C17786b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageKeyData.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageKeyData imageKeyData) {
            int i;
            int i2 = 0;
            if (imageKeyData.image_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, imageKeyData.image_key);
            } else {
                i = 0;
            }
            if (imageKeyData.message_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, imageKeyData.message_id);
            }
            return i + i2 + imageKeyData.unknownFields().size();
        }

        /* renamed from: a */
        public ImageKeyData decode(ProtoReader protoReader) throws IOException {
            C17785a aVar = new C17785a();
            aVar.f44828a = "";
            aVar.f44829b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44828a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44829b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageKeyData imageKeyData) throws IOException {
            if (imageKeyData.image_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageKeyData.image_key);
            }
            if (imageKeyData.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, imageKeyData.message_id);
            }
            protoWriter.writeBytes(imageKeyData.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ImageKeyData$a */
    public static final class C17785a extends Message.Builder<ImageKeyData, C17785a> {

        /* renamed from: a */
        public String f44828a;

        /* renamed from: b */
        public String f44829b;

        /* renamed from: a */
        public ImageKeyData build() {
            return new ImageKeyData(this.f44828a, this.f44829b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17785a newBuilder() {
        C17785a aVar = new C17785a();
        aVar.f44828a = this.image_key;
        aVar.f44829b = this.message_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ImageKeyData");
        StringBuilder sb = new StringBuilder();
        if (this.image_key != null) {
            sb.append(", image_key=");
            sb.append(this.image_key);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageKeyData{");
        replace.append('}');
        return replace.toString();
    }

    public ImageKeyData(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public ImageKeyData(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_key = str;
        this.message_id = str2;
    }
}
