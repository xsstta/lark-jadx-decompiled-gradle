package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.google.firebase.messaging.Constants;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ImageConfiguration extends Message<ImageConfiguration, C16310a> {
    public static final ProtoAdapter<ImageConfiguration> ADAPTER = new C16311b();
    public static final Boolean DEFAULT_IS_BACKGROUND = false;
    private static final long serialVersionUID = 0;
    public final ImageResourceData data;
    public final Boolean is_background;
    public final ImageConfigurationProperty property;

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageConfiguration$b */
    private static final class C16311b extends ProtoAdapter<ImageConfiguration> {
        C16311b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageConfiguration.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageConfiguration imageConfiguration) {
            return ImageResourceData.ADAPTER.encodedSizeWithTag(1, imageConfiguration.data) + ImageConfigurationProperty.ADAPTER.encodedSizeWithTag(2, imageConfiguration.property) + ProtoAdapter.BOOL.encodedSizeWithTag(3, imageConfiguration.is_background) + imageConfiguration.unknownFields().size();
        }

        /* renamed from: a */
        public ImageConfiguration decode(ProtoReader protoReader) throws IOException {
            C16310a aVar = new C16310a();
            aVar.f42547c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42545a = ImageResourceData.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f42546b = ImageConfigurationProperty.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42547c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageConfiguration imageConfiguration) throws IOException {
            ImageResourceData.ADAPTER.encodeWithTag(protoWriter, 1, imageConfiguration.data);
            ImageConfigurationProperty.ADAPTER.encodeWithTag(protoWriter, 2, imageConfiguration.property);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, imageConfiguration.is_background);
            protoWriter.writeBytes(imageConfiguration.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C16310a newBuilder() {
        C16310a aVar = new C16310a();
        aVar.f42545a = this.data;
        aVar.f42546b = this.property;
        aVar.f42547c = this.is_background;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.ImageConfiguration$a */
    public static final class C16310a extends Message.Builder<ImageConfiguration, C16310a> {

        /* renamed from: a */
        public ImageResourceData f42545a;

        /* renamed from: b */
        public ImageConfigurationProperty f42546b;

        /* renamed from: c */
        public Boolean f42547c;

        /* renamed from: a */
        public ImageConfiguration build() {
            ImageConfigurationProperty imageConfigurationProperty;
            Boolean bool;
            ImageResourceData imageResourceData = this.f42545a;
            if (imageResourceData != null && (imageConfigurationProperty = this.f42546b) != null && (bool = this.f42547c) != null) {
                return new ImageConfiguration(imageResourceData, imageConfigurationProperty, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageResourceData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f42546b, "property", this.f42547c, "is_background");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "ImageConfiguration");
        StringBuilder sb = new StringBuilder();
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", property=");
        sb.append(this.property);
        sb.append(", is_background=");
        sb.append(this.is_background);
        StringBuilder replace = sb.replace(0, 2, "ImageConfiguration{");
        replace.append('}');
        return replace.toString();
    }

    public ImageConfiguration(ImageResourceData imageResourceData, ImageConfigurationProperty imageConfigurationProperty, Boolean bool) {
        this(imageResourceData, imageConfigurationProperty, bool, ByteString.EMPTY);
    }

    public ImageConfiguration(ImageResourceData imageResourceData, ImageConfigurationProperty imageConfigurationProperty, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data = imageResourceData;
        this.property = imageConfigurationProperty;
        this.is_background = bool;
    }
}
