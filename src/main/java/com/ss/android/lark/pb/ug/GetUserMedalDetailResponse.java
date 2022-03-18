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

public final class GetUserMedalDetailResponse extends Message<GetUserMedalDetailResponse, C50088a> {
    public static final ProtoAdapter<GetUserMedalDetailResponse> ADAPTER = new C50089b();
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

    /* renamed from: com.ss.android.lark.pb.ug.GetUserMedalDetailResponse$b */
    private static final class C50089b extends ProtoAdapter<GetUserMedalDetailResponse> {
        C50089b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserMedalDetailResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserMedalDetailResponse getUserMedalDetailResponse) {
            int i;
            int encodedSizeWithTag = ImageSetPassThrough.ADAPTER.encodedSizeWithTag(1, getUserMedalDetailResponse.mmedal_image) + ImageSetPassThrough.ADAPTER.encodedSizeWithTag(2, getUserMedalDetailResponse.mmedal_show_image) + I18nVal.ADAPTER.encodedSizeWithTag(3, getUserMedalDetailResponse.mname) + I18nVal.ADAPTER.encodedSizeWithTag(4, getUserMedalDetailResponse.mexplanation) + ProtoAdapter.BOOL.encodedSizeWithTag(5, getUserMedalDetailResponse.mis_valid);
            int i2 = 0;
            if (getUserMedalDetailResponse.meffect_time != null) {
                i = ProtoAdapter.INT64.encodedSizeWithTag(6, getUserMedalDetailResponse.meffect_time);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (getUserMedalDetailResponse.mexpire_time != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(7, getUserMedalDetailResponse.mexpire_time);
            }
            return i3 + i2 + getUserMedalDetailResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserMedalDetailResponse decode(ProtoReader protoReader) throws IOException {
            C50088a aVar = new C50088a();
            aVar.f125211e = false;
            aVar.f125212f = 0L;
            aVar.f125213g = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125207a = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125208b = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125209c = I18nVal.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125210d = I18nVal.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125211e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125212f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f125213g = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, GetUserMedalDetailResponse getUserMedalDetailResponse) throws IOException {
            ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 1, getUserMedalDetailResponse.mmedal_image);
            ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 2, getUserMedalDetailResponse.mmedal_show_image);
            I18nVal.ADAPTER.encodeWithTag(protoWriter, 3, getUserMedalDetailResponse.mname);
            I18nVal.ADAPTER.encodeWithTag(protoWriter, 4, getUserMedalDetailResponse.mexplanation);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, getUserMedalDetailResponse.mis_valid);
            if (getUserMedalDetailResponse.meffect_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, getUserMedalDetailResponse.meffect_time);
            }
            if (getUserMedalDetailResponse.mexpire_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, getUserMedalDetailResponse.mexpire_time);
            }
            protoWriter.writeBytes(getUserMedalDetailResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50088a newBuilder() {
        C50088a aVar = new C50088a();
        aVar.f125207a = this.mmedal_image;
        aVar.f125208b = this.mmedal_show_image;
        aVar.f125209c = this.mname;
        aVar.f125210d = this.mexplanation;
        aVar.f125211e = this.mis_valid;
        aVar.f125212f = this.meffect_time;
        aVar.f125213g = this.mexpire_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ug.GetUserMedalDetailResponse$a */
    public static final class C50088a extends Message.Builder<GetUserMedalDetailResponse, C50088a> {

        /* renamed from: a */
        public ImageSetPassThrough f125207a;

        /* renamed from: b */
        public ImageSetPassThrough f125208b;

        /* renamed from: c */
        public I18nVal f125209c;

        /* renamed from: d */
        public I18nVal f125210d;

        /* renamed from: e */
        public Boolean f125211e;

        /* renamed from: f */
        public Long f125212f;

        /* renamed from: g */
        public Long f125213g;

        /* renamed from: a */
        public GetUserMedalDetailResponse build() {
            ImageSetPassThrough imageSetPassThrough;
            I18nVal i18nVal;
            I18nVal i18nVal2;
            Boolean bool;
            ImageSetPassThrough imageSetPassThrough2 = this.f125207a;
            if (imageSetPassThrough2 != null && (imageSetPassThrough = this.f125208b) != null && (i18nVal = this.f125209c) != null && (i18nVal2 = this.f125210d) != null && (bool = this.f125211e) != null) {
                return new GetUserMedalDetailResponse(imageSetPassThrough2, imageSetPassThrough, i18nVal, i18nVal2, bool, this.f125212f, this.f125213g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(imageSetPassThrough2, "mmedal_image", this.f125208b, "mmedal_show_image", this.f125209c, "mname", this.f125210d, "mexplanation", this.f125211e, "mis_valid");
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
        StringBuilder replace = sb.replace(0, 2, "GetUserMedalDetailResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserMedalDetailResponse(ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, I18nVal i18nVal, I18nVal i18nVal2, Boolean bool, Long l, Long l2) {
        this(imageSetPassThrough, imageSetPassThrough2, i18nVal, i18nVal2, bool, l, l2, ByteString.EMPTY);
    }

    public GetUserMedalDetailResponse(ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, I18nVal i18nVal, I18nVal i18nVal2, Boolean bool, Long l, Long l2, ByteString byteString) {
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
