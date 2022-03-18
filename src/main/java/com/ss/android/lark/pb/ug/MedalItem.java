package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import java.io.IOException;
import okio.ByteString;

public final class MedalItem extends Message<MedalItem, C50102a> {
    public static final ProtoAdapter<MedalItem> ADAPTER = new C50103b();
    private static final long serialVersionUID = 0;
    public final String mgrant_id;
    public final String mmedal_id;
    public final ImageSetPassThrough mmedal_image;
    public final ImageSetPassThrough mmedal_show_image;
    public final I18nVal mname;
    public final MedalStatus mstatus;

    public enum MedalStatus implements WireEnum {
        VALID(1),
        INVALID(2),
        TAKING(3);
        
        public static final ProtoAdapter<MedalStatus> ADAPTER = ProtoAdapter.newEnumAdapter(MedalStatus.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static MedalStatus fromValue(int i) {
            if (i == 1) {
                return VALID;
            }
            if (i == 2) {
                return INVALID;
            }
            if (i != 3) {
                return null;
            }
            return TAKING;
        }

        private MedalStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug.MedalItem$b */
    private static final class C50103b extends ProtoAdapter<MedalItem> {
        C50103b() {
            super(FieldEncoding.LENGTH_DELIMITED, MedalItem.class);
        }

        /* renamed from: a */
        public int encodedSize(MedalItem medalItem) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, medalItem.mmedal_id) + ImageSetPassThrough.ADAPTER.encodedSizeWithTag(2, medalItem.mmedal_image) + ImageSetPassThrough.ADAPTER.encodedSizeWithTag(3, medalItem.mmedal_show_image) + I18nVal.ADAPTER.encodedSizeWithTag(4, medalItem.mname) + MedalStatus.ADAPTER.encodedSizeWithTag(5, medalItem.mstatus);
            if (medalItem.mgrant_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(6, medalItem.mgrant_id);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + medalItem.unknownFields().size();
        }

        /* renamed from: a */
        public MedalItem decode(ProtoReader protoReader) throws IOException {
            C50102a aVar = new C50102a();
            aVar.f125230a = "";
            aVar.f125235f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125230a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f125231b = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            aVar.f125232c = ImageSetPassThrough.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            aVar.f125233d = I18nVal.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f125234e = MedalStatus.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f125235f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, MedalItem medalItem) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, medalItem.mmedal_id);
            ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 2, medalItem.mmedal_image);
            ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 3, medalItem.mmedal_show_image);
            I18nVal.ADAPTER.encodeWithTag(protoWriter, 4, medalItem.mname);
            MedalStatus.ADAPTER.encodeWithTag(protoWriter, 5, medalItem.mstatus);
            if (medalItem.mgrant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, medalItem.mgrant_id);
            }
            protoWriter.writeBytes(medalItem.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50102a newBuilder() {
        C50102a aVar = new C50102a();
        aVar.f125230a = this.mmedal_id;
        aVar.f125231b = this.mmedal_image;
        aVar.f125232c = this.mmedal_show_image;
        aVar.f125233d = this.mname;
        aVar.f125234e = this.mstatus;
        aVar.f125235f = this.mgrant_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.ug.MedalItem$a */
    public static final class C50102a extends Message.Builder<MedalItem, C50102a> {

        /* renamed from: a */
        public String f125230a;

        /* renamed from: b */
        public ImageSetPassThrough f125231b;

        /* renamed from: c */
        public ImageSetPassThrough f125232c;

        /* renamed from: d */
        public I18nVal f125233d;

        /* renamed from: e */
        public MedalStatus f125234e;

        /* renamed from: f */
        public String f125235f;

        /* renamed from: a */
        public MedalItem build() {
            ImageSetPassThrough imageSetPassThrough;
            ImageSetPassThrough imageSetPassThrough2;
            I18nVal i18nVal;
            MedalStatus medalStatus;
            String str = this.f125230a;
            if (str != null && (imageSetPassThrough = this.f125231b) != null && (imageSetPassThrough2 = this.f125232c) != null && (i18nVal = this.f125233d) != null && (medalStatus = this.f125234e) != null) {
                return new MedalItem(str, imageSetPassThrough, imageSetPassThrough2, i18nVal, medalStatus, this.f125235f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mmedal_id", this.f125231b, "mmedal_image", this.f125232c, "mmedal_show_image", this.f125233d, "mname", this.f125234e, "mstatus");
        }

        /* renamed from: a */
        public C50102a mo174019a(MedalStatus medalStatus) {
            this.f125234e = medalStatus;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", medal_id=");
        sb.append(this.mmedal_id);
        sb.append(", medal_image=");
        sb.append(this.mmedal_image);
        sb.append(", medal_show_image=");
        sb.append(this.mmedal_show_image);
        sb.append(", name=");
        sb.append(this.mname);
        sb.append(", status=");
        sb.append(this.mstatus);
        if (this.mgrant_id != null) {
            sb.append(", grant_id=");
            sb.append(this.mgrant_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MedalItem{");
        replace.append('}');
        return replace.toString();
    }

    public MedalItem(String str, ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, I18nVal i18nVal, MedalStatus medalStatus, String str2) {
        this(str, imageSetPassThrough, imageSetPassThrough2, i18nVal, medalStatus, str2, ByteString.EMPTY);
    }

    public MedalItem(String str, ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, I18nVal i18nVal, MedalStatus medalStatus, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmedal_id = str;
        this.mmedal_image = imageSetPassThrough;
        this.mmedal_show_image = imageSetPassThrough2;
        this.mname = i18nVal;
        this.mstatus = medalStatus;
        this.mgrant_id = str2;
    }
}
