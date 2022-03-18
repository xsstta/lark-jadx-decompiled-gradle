package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ImageInfo extends Message<ImageInfo, C18408a> {
    public static final ProtoAdapter<ImageInfo> ADAPTER = new C18409b();
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Integer height;
    public final String local_path;
    public final String token;
    public final Integer width;

    /* renamed from: com.bytedance.lark.pb.moments.v1.ImageInfo$b */
    private static final class C18409b extends ProtoAdapter<ImageInfo> {
        C18409b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageInfo imageInfo) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (imageInfo.token != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, imageInfo.token);
            } else {
                i = 0;
            }
            if (imageInfo.width != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, imageInfo.width);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (imageInfo.height != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, imageInfo.height);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (imageInfo.local_path != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, imageInfo.local_path);
            }
            return i6 + i4 + imageInfo.unknownFields().size();
        }

        /* renamed from: a */
        public ImageInfo decode(ProtoReader protoReader) throws IOException {
            C18408a aVar = new C18408a();
            aVar.f45792a = "";
            aVar.f45793b = 0;
            aVar.f45794c = 0;
            aVar.f45795d = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45792a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f45793b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f45794c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45795d = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageInfo imageInfo) throws IOException {
            if (imageInfo.token != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, imageInfo.token);
            }
            if (imageInfo.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, imageInfo.width);
            }
            if (imageInfo.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, imageInfo.height);
            }
            if (imageInfo.local_path != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, imageInfo.local_path);
            }
            protoWriter.writeBytes(imageInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.ImageInfo$a */
    public static final class C18408a extends Message.Builder<ImageInfo, C18408a> {

        /* renamed from: a */
        public String f45792a;

        /* renamed from: b */
        public Integer f45793b;

        /* renamed from: c */
        public Integer f45794c;

        /* renamed from: d */
        public String f45795d;

        /* renamed from: a */
        public ImageInfo build() {
            return new ImageInfo(this.f45792a, this.f45793b, this.f45794c, this.f45795d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18408a mo63639a(Integer num) {
            this.f45793b = num;
            return this;
        }

        /* renamed from: b */
        public C18408a mo63642b(Integer num) {
            this.f45794c = num;
            return this;
        }

        /* renamed from: a */
        public C18408a mo63640a(String str) {
            this.f45792a = str;
            return this;
        }

        /* renamed from: b */
        public C18408a mo63643b(String str) {
            this.f45795d = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18408a newBuilder() {
        C18408a aVar = new C18408a();
        aVar.f45792a = this.token;
        aVar.f45793b = this.width;
        aVar.f45794c = this.height;
        aVar.f45795d = this.local_path;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "ImageInfo");
        StringBuilder sb = new StringBuilder();
        if (this.token != null) {
            sb.append(", token=");
            sb.append(this.token);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.local_path != null) {
            sb.append(", local_path=");
            sb.append(this.local_path);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageInfo{");
        replace.append('}');
        return replace.toString();
    }

    public ImageInfo(String str, Integer num, Integer num2, String str2) {
        this(str, num, num2, str2, ByteString.EMPTY);
    }

    public ImageInfo(String str, Integer num, Integer num2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.token = str;
        this.width = num;
        this.height = num2;
        this.local_path = str2;
    }
}
