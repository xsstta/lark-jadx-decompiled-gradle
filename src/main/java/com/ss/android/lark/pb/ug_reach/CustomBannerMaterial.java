package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CustomBannerMaterial extends Message<CustomBannerMaterial, C50122a> {
    public static final ProtoAdapter<CustomBannerMaterial> ADAPTER = new C50123b();
    private static final long serialVersionUID = 0;
    public final String mdata;
    public final String mlayout_name;

    /* renamed from: com.ss.android.lark.pb.ug_reach.CustomBannerMaterial$b */
    private static final class C50123b extends ProtoAdapter<CustomBannerMaterial> {
        C50123b() {
            super(FieldEncoding.LENGTH_DELIMITED, CustomBannerMaterial.class);
        }

        /* renamed from: a */
        public int encodedSize(CustomBannerMaterial customBannerMaterial) {
            int i;
            int i2 = 0;
            if (customBannerMaterial.mlayout_name != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, customBannerMaterial.mlayout_name);
            } else {
                i = 0;
            }
            if (customBannerMaterial.mdata != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, customBannerMaterial.mdata);
            }
            return i + i2 + customBannerMaterial.unknownFields().size();
        }

        /* renamed from: a */
        public CustomBannerMaterial decode(ProtoReader protoReader) throws IOException {
            C50122a aVar = new C50122a();
            aVar.f125275a = "";
            aVar.f125276b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125275a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125276b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CustomBannerMaterial customBannerMaterial) throws IOException {
            if (customBannerMaterial.mlayout_name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customBannerMaterial.mlayout_name);
            }
            if (customBannerMaterial.mdata != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, customBannerMaterial.mdata);
            }
            protoWriter.writeBytes(customBannerMaterial.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.CustomBannerMaterial$a */
    public static final class C50122a extends Message.Builder<CustomBannerMaterial, C50122a> {

        /* renamed from: a */
        public String f125275a;

        /* renamed from: b */
        public String f125276b;

        /* renamed from: a */
        public CustomBannerMaterial build() {
            return new CustomBannerMaterial(this.f125275a, this.f125276b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50122a newBuilder() {
        C50122a aVar = new C50122a();
        aVar.f125275a = this.mlayout_name;
        aVar.f125276b = this.mdata;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mlayout_name != null) {
            sb.append(", layout_name=");
            sb.append(this.mlayout_name);
        }
        if (this.mdata != null) {
            sb.append(", data=");
            sb.append(this.mdata);
        }
        StringBuilder replace = sb.replace(0, 2, "CustomBannerMaterial{");
        replace.append('}');
        return replace.toString();
    }

    public CustomBannerMaterial(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public CustomBannerMaterial(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mlayout_name = str;
        this.mdata = str2;
    }
}
