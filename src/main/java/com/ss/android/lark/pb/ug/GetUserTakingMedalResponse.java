package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import java.io.IOException;
import okio.ByteString;

public final class GetUserTakingMedalResponse extends Message<GetUserTakingMedalResponse, C50092a> {
    public static final ProtoAdapter<GetUserTakingMedalResponse> ADAPTER = new C50093b();
    public static final Long DEFAULT_EFFECT_TIME = 0L;
    public static final Long DEFAULT_EXPIRE_TIME = 0L;
    public static final Boolean DEFAULT_IS_VALID = false;
    private static final long serialVersionUID = 0;
    public final Long meffect_time;
    public final Long mexpire_time;
    public final I18nVal mexplanation;
    public final Boolean mis_valid;
    public final ImageSetPassThrough mmedal_image;
    public final ImageSetPassThrough mmedal_show_image;
    public final I18nVal mname;

    /* renamed from: com.ss.android.lark.pb.ug.GetUserTakingMedalResponse$b */
    private static final class C50093b extends ProtoAdapter<GetUserTakingMedalResponse> {
        C50093b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserTakingMedalResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserTakingMedalResponse getUserTakingMedalResponse) {
            int i;
            int encodedSizeWithTag = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(1, getUserTakingMedalResponse.mmedal_image) + ImageSetPassThrough.ADAPTER.encodedSizeWithTag(2, getUserTakingMedalResponse.mmedal_show_image) + I18nVal.ADAPTER.encodedSizeWithTag(3, getUserTakingMedalResponse.mname) + I18nVal.ADAPTER.encodedSizeWithTag(4, getUserTakingMedalResponse.mexplanation) + ProtoAdapter.BOOL.encodedSizeWithTag(5, getUserTakingMedalResponse.mis_valid);
            int i2 = 0;
            if (getUserTakingMedalResponse.meffect_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(6, getUserTakingMedalResponse.meffect_time);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getUserTakingMedalResponse.mexpire_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(7, getUserTakingMedalResponse.mexpire_time);
            }
            return i3 + i2 + getUserTakingMedalResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserTakingMedalResponse decode(ProtoReader protoReader) throws IOException {
            C50092a aVar = new C50092a();
            aVar.f125219e = false;
            aVar.f125220f = 0L;
            aVar.f125221g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125215a = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125216b = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125217c = I18nVal.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125218d = I18nVal.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125219e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125220f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125221g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetUserTakingMedalResponse getUserTakingMedalResponse) throws IOException {
            ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 1, getUserTakingMedalResponse.mmedal_image);
            ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 2, getUserTakingMedalResponse.mmedal_show_image);
            I18nVal.ADAPTER.encodeWithTag(protoWriter, 3, getUserTakingMedalResponse.mname);
            I18nVal.ADAPTER.encodeWithTag(protoWriter, 4, getUserTakingMedalResponse.mexplanation);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getUserTakingMedalResponse.mis_valid);
            if (getUserTakingMedalResponse.meffect_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, getUserTakingMedalResponse.meffect_time);
            }
            if (getUserTakingMedalResponse.mexpire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, getUserTakingMedalResponse.mexpire_time);
            }
            protoWriter.writeBytes(getUserTakingMedalResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50092a newBuilder() {
        C50092a aVar = new C50092a();
        aVar.f125215a = this.mmedal_image;
        aVar.f125216b = this.mmedal_show_image;
        aVar.f125217c = this.mname;
        aVar.f125218d = this.mexplanation;
        aVar.f125219e = this.mis_valid;
        aVar.f125220f = this.meffect_time;
        aVar.f125221g = this.mexpire_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ug.GetUserTakingMedalResponse$a */
    public static final class C50092a extends Message.Builder<GetUserTakingMedalResponse, C50092a> {

        /* renamed from: a */
        public ImageSetPassThrough f125215a;

        /* renamed from: b */
        public ImageSetPassThrough f125216b;

        /* renamed from: c */
        public I18nVal f125217c;

        /* renamed from: d */
        public I18nVal f125218d;

        /* renamed from: e */
        public Boolean f125219e;

        /* renamed from: f */
        public Long f125220f;

        /* renamed from: g */
        public Long f125221g;

        /* renamed from: a */
        public GetUserTakingMedalResponse build() {
            ImageSetPassThrough imageSetPassThrough;
            I18nVal i18nVal;
            I18nVal i18nVal2;
            Boolean bool;
            ImageSetPassThrough imageSetPassThrough2 = this.f125215a;
            if (imageSetPassThrough2 != null && (imageSetPassThrough = this.f125216b) != null && (i18nVal = this.f125217c) != null && (i18nVal2 = this.f125218d) != null && (bool = this.f125219e) != null) {
                return new GetUserTakingMedalResponse(imageSetPassThrough2, imageSetPassThrough, i18nVal, i18nVal2, bool, this.f125220f, this.f125221g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageSetPassThrough2, "mmedal_image", this.f125216b, "mmedal_show_image", this.f125217c, "mname", this.f125218d, "mexplanation", this.f125219e, "mis_valid");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", medal_image=");
        sb.append(this.mmedal_image);
        sb.append(", medal_show_image=");
        sb.append(this.mmedal_show_image);
        sb.append(", name=");
        sb.append(this.mname);
        sb.append(", explanation=");
        sb.append(this.mexplanation);
        sb.append(", is_valid=");
        sb.append(this.mis_valid);
        if (this.meffect_time != null) {
            sb.append(", effect_time=");
            sb.append(this.meffect_time);
        }
        if (this.mexpire_time != null) {
            sb.append(", expire_time=");
            sb.append(this.mexpire_time);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserTakingMedalResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserTakingMedalResponse(ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, I18nVal i18nVal, I18nVal i18nVal2, Boolean bool, Long l, Long l2) {
        this(imageSetPassThrough, imageSetPassThrough2, i18nVal, i18nVal2, bool, l, l2, ByteString.EMPTY);
    }

    public GetUserTakingMedalResponse(ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, I18nVal i18nVal, I18nVal i18nVal2, Boolean bool, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmedal_image = imageSetPassThrough;
        this.mmedal_show_image = imageSetPassThrough2;
        this.mname = i18nVal;
        this.mexplanation = i18nVal2;
        this.mis_valid = bool;
        this.meffect_time = l;
        this.mexpire_time = l2;
    }
}
