package com.ss.android.lark.pb.dynamic_resource;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageConfiguration extends Message<ImageConfiguration, C49622a> {
    public static final ProtoAdapter<ImageConfiguration> ADAPTER = new C49623b();
    public static final Boolean DEFAULT_IS_BACKGROUND = false;
    private static final long serialVersionUID = 0;
    public final ImageResourceData mdata;
    public final Boolean mis_background;
    public final ImageConfigurationProperty mproperty;

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ImageConfiguration$b */
    private static final class C49623b extends ProtoAdapter<ImageConfiguration> {
        C49623b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageConfiguration.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageConfiguration imageConfiguration) {
            return ImageResourceData.ADAPTER.encodedSizeWithTag(1, imageConfiguration.mdata) + ImageConfigurationProperty.ADAPTER.encodedSizeWithTag(2, imageConfiguration.mproperty) + ProtoAdapter.BOOL.encodedSizeWithTag(3, imageConfiguration.mis_background) + imageConfiguration.unknownFields().size();
        }

        /* renamed from: a */
        public ImageConfiguration decode(ProtoReader protoReader) throws IOException {
            C49622a aVar = new C49622a();
            aVar.f124251c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124249a = ImageResourceData.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124250b = ImageConfigurationProperty.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124251c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageConfiguration imageConfiguration) throws IOException {
            ImageResourceData.ADAPTER.encodeWithTag(protoWriter, 1, imageConfiguration.mdata);
            ImageConfigurationProperty.ADAPTER.encodeWithTag(protoWriter, 2, imageConfiguration.mproperty);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, imageConfiguration.mis_background);
            protoWriter.writeBytes(imageConfiguration.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49622a newBuilder() {
        C49622a aVar = new C49622a();
        aVar.f124249a = this.mdata;
        aVar.f124250b = this.mproperty;
        aVar.f124251c = this.mis_background;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.dynamic_resource.ImageConfiguration$a */
    public static final class C49622a extends Message.Builder<ImageConfiguration, C49622a> {

        /* renamed from: a */
        public ImageResourceData f124249a;

        /* renamed from: b */
        public ImageConfigurationProperty f124250b;

        /* renamed from: c */
        public Boolean f124251c;

        /* renamed from: a */
        public ImageConfiguration build() {
            ImageConfigurationProperty imageConfigurationProperty;
            Boolean bool;
            ImageResourceData imageResourceData = this.f124249a;
            if (imageResourceData != null && (imageConfigurationProperty = this.f124250b) != null && (bool = this.f124251c) != null) {
                return new ImageConfiguration(imageResourceData, imageConfigurationProperty, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageResourceData, "mdata", this.f124250b, "mproperty", this.f124251c, "mis_background");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", data=");
        sb.append(this.mdata);
        sb.append(", property=");
        sb.append(this.mproperty);
        sb.append(", is_background=");
        sb.append(this.mis_background);
        StringBuilder replace = sb.replace(0, 2, "ImageConfiguration{");
        replace.append('}');
        return replace.toString();
    }

    public ImageConfiguration(ImageResourceData imageResourceData, ImageConfigurationProperty imageConfigurationProperty, Boolean bool) {
        this(imageResourceData, imageConfigurationProperty, bool, ByteString.EMPTY);
    }

    public ImageConfiguration(ImageResourceData imageResourceData, ImageConfigurationProperty imageConfigurationProperty, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mdata = imageResourceData;
        this.mproperty = imageConfigurationProperty;
        this.mis_background = bool;
    }
}
