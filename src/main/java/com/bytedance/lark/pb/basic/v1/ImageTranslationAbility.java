package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ImageTranslationAbility extends Message<ImageTranslationAbility, C15015a> {
    public static final ProtoAdapter<ImageTranslationAbility> ADAPTER = new C15016b();
    public static final Boolean DEFAULT_CAN_TRANSLATE = false;
    private static final long serialVersionUID = 0;
    public final Boolean can_translate;
    public final List<String> src_language;

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageTranslationAbility$b */
    private static final class C15016b extends ProtoAdapter<ImageTranslationAbility> {
        C15016b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageTranslationAbility.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageTranslationAbility imageTranslationAbility) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, imageTranslationAbility.can_translate) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, imageTranslationAbility.src_language) + imageTranslationAbility.unknownFields().size();
        }

        /* renamed from: a */
        public ImageTranslationAbility decode(ProtoReader protoReader) throws IOException {
            C15015a aVar = new C15015a();
            aVar.f39707a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f39707a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f39708b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageTranslationAbility imageTranslationAbility) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, imageTranslationAbility.can_translate);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, imageTranslationAbility.src_language);
            protoWriter.writeBytes(imageTranslationAbility.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.ImageTranslationAbility$a */
    public static final class C15015a extends Message.Builder<ImageTranslationAbility, C15015a> {

        /* renamed from: a */
        public Boolean f39707a;

        /* renamed from: b */
        public List<String> f39708b = Internal.newMutableList();

        /* renamed from: a */
        public ImageTranslationAbility build() {
            Boolean bool = this.f39707a;
            if (bool != null) {
                return new ImageTranslationAbility(bool, this.f39708b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "can_translate");
        }
    }

    @Override // com.squareup.wire.Message
    public C15015a newBuilder() {
        C15015a aVar = new C15015a();
        aVar.f39707a = this.can_translate;
        aVar.f39708b = Internal.copyOf("src_language", this.src_language);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "ImageTranslationAbility");
        StringBuilder sb = new StringBuilder();
        sb.append(", can_translate=");
        sb.append(this.can_translate);
        if (!this.src_language.isEmpty()) {
            sb.append(", src_language=");
            sb.append(this.src_language);
        }
        StringBuilder replace = sb.replace(0, 2, "ImageTranslationAbility{");
        replace.append('}');
        return replace.toString();
    }

    public ImageTranslationAbility(Boolean bool, List<String> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public ImageTranslationAbility(Boolean bool, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_translate = bool;
        this.src_language = Internal.immutableCopyOf("src_language", list);
    }
}
