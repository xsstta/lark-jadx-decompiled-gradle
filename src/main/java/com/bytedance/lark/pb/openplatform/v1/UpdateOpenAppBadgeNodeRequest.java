package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.openplatform.v1.CommonEnum;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class UpdateOpenAppBadgeNodeRequest extends Message<UpdateOpenAppBadgeNodeRequest, C18715a> {
    public static final ProtoAdapter<UpdateOpenAppBadgeNodeRequest> ADAPTER = new C18716b();
    public static final Integer DEFAULT_BADGE_NUM = 0;
    public static final CommonEnum.OpenAppFeatureType DEFAULT_FEATURE = CommonEnum.OpenAppFeatureType.MiniApp;
    public static final Boolean DEFAULT_NEED_SHOW = false;
    public static final Boolean DEFAULT_NEED_TRIGGER_PUSH = false;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final Integer badge_num;
    public final CommonEnum.OpenAppFeatureType feature;
    public final Boolean need_show;
    public final Boolean need_trigger_push;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeRequest$b */
    private static final class C18716b extends ProtoAdapter<UpdateOpenAppBadgeNodeRequest> {
        C18716b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateOpenAppBadgeNodeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateOpenAppBadgeNodeRequest updateOpenAppBadgeNodeRequest) {
            int i;
            int i2;
            int i3;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, updateOpenAppBadgeNodeRequest.app_id);
            int i4 = 0;
            if (updateOpenAppBadgeNodeRequest.feature != null) {
                i = CommonEnum.OpenAppFeatureType.ADAPTER.encodedSizeWithTag(2, updateOpenAppBadgeNodeRequest.feature);
            } else {
                i = 0;
            }
            int i5 = encodedSizeWithTag + i;
            if (updateOpenAppBadgeNodeRequest.badge_num != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, updateOpenAppBadgeNodeRequest.badge_num);
            } else {
                i2 = 0;
            }
            int i6 = i5 + i2;
            if (updateOpenAppBadgeNodeRequest.need_show != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(4, updateOpenAppBadgeNodeRequest.need_show);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (updateOpenAppBadgeNodeRequest.need_trigger_push != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, updateOpenAppBadgeNodeRequest.need_trigger_push);
            }
            return i7 + i4 + updateOpenAppBadgeNodeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateOpenAppBadgeNodeRequest decode(ProtoReader protoReader) throws IOException {
            C18715a aVar = new C18715a();
            aVar.f46260a = "";
            aVar.f46261b = CommonEnum.OpenAppFeatureType.MiniApp;
            aVar.f46262c = 0;
            aVar.f46263d = false;
            aVar.f46264e = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46260a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f46261b = CommonEnum.OpenAppFeatureType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f46262c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f46263d = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46264e = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateOpenAppBadgeNodeRequest updateOpenAppBadgeNodeRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateOpenAppBadgeNodeRequest.app_id);
            if (updateOpenAppBadgeNodeRequest.feature != null) {
                CommonEnum.OpenAppFeatureType.ADAPTER.encodeWithTag(protoWriter, 2, updateOpenAppBadgeNodeRequest.feature);
            }
            if (updateOpenAppBadgeNodeRequest.badge_num != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, updateOpenAppBadgeNodeRequest.badge_num);
            }
            if (updateOpenAppBadgeNodeRequest.need_show != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, updateOpenAppBadgeNodeRequest.need_show);
            }
            if (updateOpenAppBadgeNodeRequest.need_trigger_push != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, updateOpenAppBadgeNodeRequest.need_trigger_push);
            }
            protoWriter.writeBytes(updateOpenAppBadgeNodeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppBadgeNodeRequest$a */
    public static final class C18715a extends Message.Builder<UpdateOpenAppBadgeNodeRequest, C18715a> {

        /* renamed from: a */
        public String f46260a;

        /* renamed from: b */
        public CommonEnum.OpenAppFeatureType f46261b;

        /* renamed from: c */
        public Integer f46262c;

        /* renamed from: d */
        public Boolean f46263d;

        /* renamed from: e */
        public Boolean f46264e;

        /* renamed from: a */
        public UpdateOpenAppBadgeNodeRequest build() {
            String str = this.f46260a;
            if (str != null) {
                return new UpdateOpenAppBadgeNodeRequest(str, this.f46261b, this.f46262c, this.f46263d, this.f46264e, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "app_id");
        }

        /* renamed from: a */
        public C18715a mo64373a(CommonEnum.OpenAppFeatureType openAppFeatureType) {
            this.f46261b = openAppFeatureType;
            return this;
        }

        /* renamed from: b */
        public C18715a mo64378b(Boolean bool) {
            this.f46264e = bool;
            return this;
        }

        /* renamed from: a */
        public C18715a mo64374a(Boolean bool) {
            this.f46263d = bool;
            return this;
        }

        /* renamed from: a */
        public C18715a mo64375a(Integer num) {
            this.f46262c = num;
            return this;
        }

        /* renamed from: a */
        public C18715a mo64376a(String str) {
            this.f46260a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18715a newBuilder() {
        C18715a aVar = new C18715a();
        aVar.f46260a = this.app_id;
        aVar.f46261b = this.feature;
        aVar.f46262c = this.badge_num;
        aVar.f46263d = this.need_show;
        aVar.f46264e = this.need_trigger_push;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "UpdateOpenAppBadgeNodeRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", app_id=");
        sb.append(this.app_id);
        if (this.feature != null) {
            sb.append(", feature=");
            sb.append(this.feature);
        }
        if (this.badge_num != null) {
            sb.append(", badge_num=");
            sb.append(this.badge_num);
        }
        if (this.need_show != null) {
            sb.append(", need_show=");
            sb.append(this.need_show);
        }
        if (this.need_trigger_push != null) {
            sb.append(", need_trigger_push=");
            sb.append(this.need_trigger_push);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateOpenAppBadgeNodeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateOpenAppBadgeNodeRequest(String str, CommonEnum.OpenAppFeatureType openAppFeatureType, Integer num, Boolean bool, Boolean bool2) {
        this(str, openAppFeatureType, num, bool, bool2, ByteString.EMPTY);
    }

    public UpdateOpenAppBadgeNodeRequest(String str, CommonEnum.OpenAppFeatureType openAppFeatureType, Integer num, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.feature = openAppFeatureType;
        this.badge_num = num;
        this.need_show = bool;
        this.need_trigger_push = bool2;
    }
}
