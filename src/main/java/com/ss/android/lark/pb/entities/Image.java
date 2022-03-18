package com.ss.android.lark.pb.entities;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class Image extends Message<Image, C49712a> {
    public static final ProtoAdapter<Image> ADAPTER = new C49713b();
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Integer DEFAULT_SECURE_HEIGHT = 0;
    public static final Integer DEFAULT_SECURE_WIDTH = 0;
    public static final Integer DEFAULT_SIZE = 0;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Crypto mcrypto;
    public final String metag;
    public final String mfs_unit;
    public final Integer mheight;
    public final String mkey;
    public final Map<String, String> mparams;
    public final Integer msecure_height;
    public final String msecure_key;
    public final List<String> msecure_urls;
    public final Integer msecure_width;
    public final Integer msize;
    public final List<String> murls;
    public final Integer mwidth;

    /* renamed from: com.ss.android.lark.pb.entities.Image$b */
    private static final class C49713b extends ProtoAdapter<Image> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f124470a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49713b() {
            super(FieldEncoding.LENGTH_DELIMITED, Image.class);
        }

        /* renamed from: a */
        public int encodedSize(Image image) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10 = 0;
            if (image.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, image.mkey);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, image.murls);
            if (image.mwidth != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, image.mwidth);
            } else {
                i2 = 0;
            }
            int i11 = encodedSizeWithTag + i2;
            if (image.mheight != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, image.mheight);
            } else {
                i3 = 0;
            }
            int i12 = i11 + i3;
            if (image.msecure_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, image.msecure_key);
            } else {
                i4 = 0;
            }
            int encodedSizeWithTag2 = i12 + i4 + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, image.msecure_urls);
            if (image.msecure_width != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(7, image.msecure_width);
            } else {
                i5 = 0;
            }
            int i13 = encodedSizeWithTag2 + i5;
            if (image.msecure_height != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(8, image.msecure_height);
            } else {
                i6 = 0;
            }
            int i14 = i13 + i6;
            if (image.mcrypto != null) {
                i7 = Crypto.ADAPTER.encodedSizeWithTag(9, image.mcrypto);
            } else {
                i7 = 0;
            }
            int i15 = i14 + i7;
            if (image.msize != null) {
                i8 = ProtoAdapter.INT32.encodedSizeWithTag(10, image.msize);
            } else {
                i8 = 0;
            }
            int i16 = i15 + i8;
            if (image.mfs_unit != null) {
                i9 = ProtoAdapter.STRING.encodedSizeWithTag(11, image.mfs_unit);
            } else {
                i9 = 0;
            }
            int encodedSizeWithTag3 = i16 + i9 + this.f124470a.encodedSizeWithTag(12, image.mparams);
            if (image.metag != null) {
                i10 = ProtoAdapter.STRING.encodedSizeWithTag(13, image.metag);
            }
            return encodedSizeWithTag3 + i10 + image.unknownFields().size();
        }

        /* renamed from: a */
        public Image decode(ProtoReader protoReader) throws IOException {
            C49712a aVar = new C49712a();
            aVar.f124457a = "";
            aVar.f124459c = 0;
            aVar.f124460d = 0;
            aVar.f124461e = "";
            aVar.f124463g = 0;
            aVar.f124464h = 0;
            aVar.f124466j = 0;
            aVar.f124467k = "";
            aVar.f124469m = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124457a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f124458b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f124459c = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            aVar.f124460d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124461e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124462f.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            aVar.f124463g = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124464h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f124465i = Crypto.ADAPTER.decode(protoReader);
                            break;
                        case 10:
                            aVar.f124466j = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124467k = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124468l.putAll(this.f124470a.decode(protoReader));
                            break;
                        case 13:
                            aVar.f124469m = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, Image image) throws IOException {
            if (image.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, image.mkey);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, image.murls);
            if (image.mwidth != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, image.mwidth);
            }
            if (image.mheight != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, image.mheight);
            }
            if (image.msecure_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, image.msecure_key);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 6, image.msecure_urls);
            if (image.msecure_width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, image.msecure_width);
            }
            if (image.msecure_height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, image.msecure_height);
            }
            if (image.mcrypto != null) {
                Crypto.ADAPTER.encodeWithTag(protoWriter, 9, image.mcrypto);
            }
            if (image.msize != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, image.msize);
            }
            if (image.mfs_unit != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, image.mfs_unit);
            }
            this.f124470a.encodeWithTag(protoWriter, 12, image.mparams);
            if (image.metag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, image.metag);
            }
            protoWriter.writeBytes(image.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.Image$a */
    public static final class C49712a extends Message.Builder<Image, C49712a> {

        /* renamed from: a */
        public String f124457a;

        /* renamed from: b */
        public List<String> f124458b = Internal.newMutableList();

        /* renamed from: c */
        public Integer f124459c;

        /* renamed from: d */
        public Integer f124460d;

        /* renamed from: e */
        public String f124461e;

        /* renamed from: f */
        public List<String> f124462f = Internal.newMutableList();

        /* renamed from: g */
        public Integer f124463g;

        /* renamed from: h */
        public Integer f124464h;

        /* renamed from: i */
        public Crypto f124465i;

        /* renamed from: j */
        public Integer f124466j;

        /* renamed from: k */
        public String f124467k;

        /* renamed from: l */
        public Map<String, String> f124468l = Internal.newMutableMap();

        /* renamed from: m */
        public String f124469m;

        /* renamed from: a */
        public Image build() {
            return new Image(this.f124457a, this.f124458b, this.f124459c, this.f124460d, this.f124461e, this.f124462f, this.f124463g, this.f124464h, this.f124465i, this.f124466j, this.f124467k, this.f124468l, this.f124469m, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49712a newBuilder() {
        C49712a aVar = new C49712a();
        aVar.f124457a = this.mkey;
        aVar.f124458b = Internal.copyOf("murls", this.murls);
        aVar.f124459c = this.mwidth;
        aVar.f124460d = this.mheight;
        aVar.f124461e = this.msecure_key;
        aVar.f124462f = Internal.copyOf("msecure_urls", this.msecure_urls);
        aVar.f124463g = this.msecure_width;
        aVar.f124464h = this.msecure_height;
        aVar.f124465i = this.mcrypto;
        aVar.f124466j = this.msize;
        aVar.f124467k = this.mfs_unit;
        aVar.f124468l = Internal.copyOf("mparams", this.mparams);
        aVar.f124469m = this.metag;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (!this.murls.isEmpty()) {
            sb.append(", urls=");
            sb.append(this.murls);
        }
        if (this.mwidth != null) {
            sb.append(", width=");
            sb.append(this.mwidth);
        }
        if (this.mheight != null) {
            sb.append(", height=");
            sb.append(this.mheight);
        }
        if (this.msecure_key != null) {
            sb.append(", secure_key=");
            sb.append(this.msecure_key);
        }
        if (!this.msecure_urls.isEmpty()) {
            sb.append(", secure_urls=");
            sb.append(this.msecure_urls);
        }
        if (this.msecure_width != null) {
            sb.append(", secure_width=");
            sb.append(this.msecure_width);
        }
        if (this.msecure_height != null) {
            sb.append(", secure_height=");
            sb.append(this.msecure_height);
        }
        if (this.mcrypto != null) {
            sb.append(", crypto=");
            sb.append(this.mcrypto);
        }
        if (this.msize != null) {
            sb.append(", size=");
            sb.append(this.msize);
        }
        if (this.mfs_unit != null) {
            sb.append(", fs_unit=");
            sb.append(this.mfs_unit);
        }
        if (!this.mparams.isEmpty()) {
            sb.append(", params=");
            sb.append(this.mparams);
        }
        if (this.metag != null) {
            sb.append(", etag=");
            sb.append(this.metag);
        }
        StringBuilder replace = sb.replace(0, 2, "Image{");
        replace.append('}');
        return replace.toString();
    }

    public Image(String str, List<String> list, Integer num, Integer num2, String str2, List<String> list2, Integer num3, Integer num4, Crypto crypto, Integer num5, String str3, Map<String, String> map, String str4) {
        this(str, list, num, num2, str2, list2, num3, num4, crypto, num5, str3, map, str4, ByteString.EMPTY);
    }

    public Image(String str, List<String> list, Integer num, Integer num2, String str2, List<String> list2, Integer num3, Integer num4, Crypto crypto, Integer num5, String str3, Map<String, String> map, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkey = str;
        this.murls = Internal.immutableCopyOf("murls", list);
        this.mwidth = num;
        this.mheight = num2;
        this.msecure_key = str2;
        this.msecure_urls = Internal.immutableCopyOf("msecure_urls", list2);
        this.msecure_width = num3;
        this.msecure_height = num4;
        this.mcrypto = crypto;
        this.msize = num5;
        this.mfs_unit = str3;
        this.mparams = Internal.immutableCopyOf("mparams", map);
        this.metag = str4;
    }
}
