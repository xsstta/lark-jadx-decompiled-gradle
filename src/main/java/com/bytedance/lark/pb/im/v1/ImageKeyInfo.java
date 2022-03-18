package com.bytedance.lark.pb.im.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageKeyInfo extends Message<ImageKeyInfo, C17787a> {
    public static final ProtoAdapter<ImageKeyInfo> ADAPTER = new C17788b();
    public static final Boolean DEFAULT_IS_ORIGIN = false;
    private static final long serialVersionUID = 0;
    public final String image_key;
    public final Boolean is_origin;

    /* renamed from: com.bytedance.lark.pb.im.v1.ImageKeyInfo$b */
    private static final class C17788b extends ProtoAdapter<ImageKeyInfo> {
        C17788b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageKeyInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageKeyInfo imageKeyInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, imageKeyInfo.image_key) + ProtoAdapter.BOOL.encodedSizeWithTag(2, imageKeyInfo.is_origin) + imageKeyInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ImageKeyInfo decode(ProtoReader protoReader) throws IOException {
            C17787a aVar = new C17787a();
            aVar.f44830a = "";
            aVar.f44831b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44830a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44831b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageKeyInfo imageKeyInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageKeyInfo.image_key);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, imageKeyInfo.is_origin);
            protoWriter.writeBytes(imageKeyInfo.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17787a newBuilder() {
        C17787a aVar = new C17787a();
        aVar.f44830a = this.image_key;
        aVar.f44831b = this.is_origin;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.ImageKeyInfo$a */
    public static final class C17787a extends Message.Builder<ImageKeyInfo, C17787a> {

        /* renamed from: a */
        public String f44830a;

        /* renamed from: b */
        public Boolean f44831b;

        /* renamed from: a */
        public ImageKeyInfo build() {
            Boolean bool;
            String str = this.f44830a;
            if (str != null && (bool = this.f44831b) != null) {
                return new ImageKeyInfo(str, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "image_key", this.f44831b, "is_origin");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "ImageKeyInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", image_key=");
        sb.append(this.image_key);
        sb.append(", is_origin=");
        sb.append(this.is_origin);
        StringBuilder replace = sb.replace(0, 2, "ImageKeyInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ImageKeyInfo(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public ImageKeyInfo(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_key = str;
        this.is_origin = bool;
    }
}
