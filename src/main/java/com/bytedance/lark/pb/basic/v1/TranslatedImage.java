package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class TranslatedImage extends Message<TranslatedImage, C15356a> {
    public static final ProtoAdapter<TranslatedImage> ADAPTER = new C15357b();
    public static final Boolean DEFAULT_IS_TRANSLATED = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_translated;
    public final ImageSet translated_image_set;

    /* renamed from: com.bytedance.lark.pb.basic.v1.TranslatedImage$b */
    private static final class C15357b extends ProtoAdapter<TranslatedImage> {
        C15357b() {
            super(FieldEncoding.LENGTH_DELIMITED, TranslatedImage.class);
        }

        /* renamed from: a */
        public int encodedSize(TranslatedImage translatedImage) {
            return ImageSet.ADAPTER.encodedSizeWithTag(1, translatedImage.translated_image_set) + ProtoAdapter.BOOL.encodedSizeWithTag(2, translatedImage.is_translated) + translatedImage.unknownFields().size();
        }

        /* renamed from: a */
        public TranslatedImage decode(ProtoReader protoReader) throws IOException {
            C15356a aVar = new C15356a();
            aVar.f40670b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f40669a = ImageSet.ADAPTER.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40670b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, TranslatedImage translatedImage) throws IOException {
            ImageSet.ADAPTER.encodeWithTag(protoWriter, 1, translatedImage.translated_image_set);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, translatedImage.is_translated);
            protoWriter.writeBytes(translatedImage.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15356a newBuilder() {
        C15356a aVar = new C15356a();
        aVar.f40669a = this.translated_image_set;
        aVar.f40670b = this.is_translated;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.TranslatedImage$a */
    public static final class C15356a extends Message.Builder<TranslatedImage, C15356a> {

        /* renamed from: a */
        public ImageSet f40669a;

        /* renamed from: b */
        public Boolean f40670b;

        /* renamed from: a */
        public TranslatedImage build() {
            Boolean bool;
            ImageSet imageSet = this.f40669a;
            if (imageSet != null && (bool = this.f40670b) != null) {
                return new TranslatedImage(imageSet, bool, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageSet, "translated_image_set", this.f40670b, "is_translated");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "TranslatedImage");
        StringBuilder sb = new StringBuilder();
        sb.append(", translated_image_set=");
        sb.append(this.translated_image_set);
        sb.append(", is_translated=");
        sb.append(this.is_translated);
        StringBuilder replace = sb.replace(0, 2, "TranslatedImage{");
        replace.append('}');
        return replace.toString();
    }

    public TranslatedImage(ImageSet imageSet, Boolean bool) {
        this(imageSet, bool, ByteString.EMPTY);
    }

    public TranslatedImage(ImageSet imageSet, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.translated_image_set = imageSet;
        this.is_translated = bool;
    }
}
