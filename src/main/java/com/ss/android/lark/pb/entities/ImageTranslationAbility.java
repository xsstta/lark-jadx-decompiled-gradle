package com.ss.android.lark.pb.entities;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ImageTranslationAbility extends Message<ImageTranslationAbility, C49724a> {
    public static final ProtoAdapter<ImageTranslationAbility> ADAPTER = new C49725b();
    public static final Boolean DEFAULT_CAN_TRANSLATE = false;
    private static final long serialVersionUID = 0;
    public final Boolean mcan_translate;
    public final List<String> msrc_language;

    /* renamed from: com.ss.android.lark.pb.entities.ImageTranslationAbility$b */
    private static final class C49725b extends ProtoAdapter<ImageTranslationAbility> {
        C49725b() {
            super(FieldEncoding.LENGTH_DELIMITED, ImageTranslationAbility.class);
        }

        /* renamed from: a */
        public int encodedSize(ImageTranslationAbility imageTranslationAbility) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, imageTranslationAbility.mcan_translate) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, imageTranslationAbility.msrc_language) + imageTranslationAbility.unknownFields().size();
        }

        /* renamed from: a */
        public ImageTranslationAbility decode(ProtoReader protoReader) throws IOException {
            C49724a aVar = new C49724a();
            aVar.f124495a = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f124495a = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f124496b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ImageTranslationAbility imageTranslationAbility) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, imageTranslationAbility.mcan_translate);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, imageTranslationAbility.msrc_language);
            protoWriter.writeBytes(imageTranslationAbility.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.entities.ImageTranslationAbility$a */
    public static final class C49724a extends Message.Builder<ImageTranslationAbility, C49724a> {

        /* renamed from: a */
        public Boolean f124495a;

        /* renamed from: b */
        public List<String> f124496b = Internal.newMutableList();

        /* renamed from: a */
        public ImageTranslationAbility build() {
            Boolean bool = this.f124495a;
            if (bool != null) {
                return new ImageTranslationAbility(bool, this.f124496b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bool, "mcan_translate");
        }
    }

    @Override // com.squareup.wire.Message
    public C49724a newBuilder() {
        C49724a aVar = new C49724a();
        aVar.f124495a = this.mcan_translate;
        aVar.f124496b = Internal.copyOf("msrc_language", this.msrc_language);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", can_translate=");
        sb.append(this.mcan_translate);
        if (!this.msrc_language.isEmpty()) {
            sb.append(", src_language=");
            sb.append(this.msrc_language);
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
        this.mcan_translate = bool;
        this.msrc_language = Internal.immutableCopyOf("msrc_language", list);
    }
}
