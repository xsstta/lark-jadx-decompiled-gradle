package com.ss.android.lark.pb.ai;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SmartMosaicRequest extends Message<SmartMosaicRequest, C49521a> {
    public static final ProtoAdapter<SmartMosaicRequest> ADAPTER = new C49522b();
    public static final Boolean DEFAULT_AVATAR = true;
    public static final Boolean DEFAULT_TEXT = true;
    private static final long serialVersionUID = 0;
    public final Boolean mavatar;
    public final ImageInfo mimage;
    public final Boolean mtext;

    /* renamed from: com.ss.android.lark.pb.ai.SmartMosaicRequest$b */
    private static final class C49522b extends ProtoAdapter<SmartMosaicRequest> {
        C49522b() {
            super(FieldEncoding.LENGTH_DELIMITED, SmartMosaicRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SmartMosaicRequest smartMosaicRequest) {
            int i;
            int encodedSizeWithTag = ImageInfo.ADAPTER.encodedSizeWithTag(1, smartMosaicRequest.mimage);
            int i2 = 0;
            if (smartMosaicRequest.mtext != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, smartMosaicRequest.mtext);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (smartMosaicRequest.mavatar != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, smartMosaicRequest.mavatar);
            }
            return i3 + i2 + smartMosaicRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SmartMosaicRequest decode(ProtoReader protoReader) throws IOException {
            C49521a aVar = new C49521a();
            aVar.f124119b = true;
            aVar.f124120c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124118a = ImageInfo.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f124119b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124120c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SmartMosaicRequest smartMosaicRequest) throws IOException {
            ImageInfo.ADAPTER.encodeWithTag(protoWriter, 1, smartMosaicRequest.mimage);
            if (smartMosaicRequest.mtext != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, smartMosaicRequest.mtext);
            }
            if (smartMosaicRequest.mavatar != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, smartMosaicRequest.mavatar);
            }
            protoWriter.writeBytes(smartMosaicRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49521a newBuilder() {
        C49521a aVar = new C49521a();
        aVar.f124118a = this.mimage;
        aVar.f124119b = this.mtext;
        aVar.f124120c = this.mavatar;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ai.SmartMosaicRequest$a */
    public static final class C49521a extends Message.Builder<SmartMosaicRequest, C49521a> {

        /* renamed from: a */
        public ImageInfo f124118a;

        /* renamed from: b */
        public Boolean f124119b;

        /* renamed from: c */
        public Boolean f124120c;

        /* renamed from: a */
        public SmartMosaicRequest build() {
            ImageInfo imageInfo = this.f124118a;
            if (imageInfo != null) {
                return new SmartMosaicRequest(imageInfo, this.f124119b, this.f124120c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageInfo, "mimage");
        }

        /* renamed from: a */
        public C49521a mo172721a(ImageInfo imageInfo) {
            this.f124118a = imageInfo;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", image=");
        sb.append(this.mimage);
        if (this.mtext != null) {
            sb.append(", text=");
            sb.append(this.mtext);
        }
        if (this.mavatar != null) {
            sb.append(", avatar=");
            sb.append(this.mavatar);
        }
        StringBuilder replace = sb.replace(0, 2, "SmartMosaicRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SmartMosaicRequest(ImageInfo imageInfo, Boolean bool, Boolean bool2) {
        this(imageInfo, bool, bool2, ByteString.EMPTY);
    }

    public SmartMosaicRequest(ImageInfo imageInfo, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mimage = imageInfo;
        this.mtext = bool;
        this.mavatar = bool2;
    }
}
