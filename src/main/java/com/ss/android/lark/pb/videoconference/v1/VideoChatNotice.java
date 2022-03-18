package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class VideoChatNotice extends Message<VideoChatNotice, C51270a> {
    public static final ProtoAdapter<VideoChatNotice> ADAPTER = new C51271b();
    public static final Integer DEFAULT_CMD = 0;
    public static final Long DEFAULT_MEETING_END_TIME = 0L;
    public static final PopupType DEFAULT_POPUP_TYPE = PopupType.UNKNOWN_POPUP_TYPE;
    public static final Boolean DEFAULT_PUSH_WHEN_ON_THE_CALL = false;
    public static final StatusCode DEFAULT_STATUS = StatusCode.UNKOWN;
    public static final Integer DEFAULT_TIMEOUT = 0;
    public static final Integer DEFAULT_TOAST_DURATION_MS = 0;
    public static final ToastPositionMask DEFAULT_TOAST_POSITION = ToastPositionMask.LARK;
    public static final Type DEFAULT_TYPE = Type.TOAST;
    private static final long serialVersionUID = 0;
    public final ActionTime action_time;
    public final I18nKeyInfo btn_i18n_key;
    public final Integer cmd;
    public final Map<String, String> extra;
    public final Long meeting_end_time;
    public final String meeting_id;
    public final String message;
    public final String message_id;
    public final I18nKeyInfo msg_i18n_key;
    public final String notice_id;
    public final PopupType popup_type;
    public final String push_sid;
    public final Boolean push_when_on_the_call;
    public final StatusCode status;
    public final Integer timeout;
    public final String title;
    public final I18nKeyInfo title_i18n_key;
    public final Integer toast_duration_ms;
    public final ToastPositionMask toast_position;
    public final Type type;

    public enum PopupType implements WireEnum {
        UNKNOWN_POPUP_TYPE(0),
        POPUP_FORCE_JOIN(1),
        POPUP_PREVIEW(2),
        POPUP_NORMAL(3),
        POPUP_RECORDING_CONFIRM(4),
        POPUP_DOC_PERM_CONFIRM(5),
        NOTICE_EXTERNAL_PERM_CHANGED(6),
        POPUP_MEETING_END_CONFIRM(7);
        
        public static final ProtoAdapter<PopupType> ADAPTER = ProtoAdapter.newEnumAdapter(PopupType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static PopupType fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_POPUP_TYPE;
                case 1:
                    return POPUP_FORCE_JOIN;
                case 2:
                    return POPUP_PREVIEW;
                case 3:
                    return POPUP_NORMAL;
                case 4:
                    return POPUP_RECORDING_CONFIRM;
                case 5:
                    return POPUP_DOC_PERM_CONFIRM;
                case 6:
                    return NOTICE_EXTERNAL_PERM_CHANGED;
                case 7:
                    return POPUP_MEETING_END_CONFIRM;
                default:
                    return null;
            }
        }

        private PopupType(int i) {
            this.value = i;
        }
    }

    public enum StatusCode implements WireEnum {
        UNKOWN(0),
        SUCCESS(1),
        USER_BUSY_ERROR(2),
        SHARE_CARD_USER_PERMISSION(3);
        
        public static final ProtoAdapter<StatusCode> ADAPTER = ProtoAdapter.newEnumAdapter(StatusCode.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static StatusCode fromValue(int i) {
            if (i == 0) {
                return UNKOWN;
            }
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return USER_BUSY_ERROR;
            }
            if (i != 3) {
                return null;
            }
            return SHARE_CARD_USER_PERMISSION;
        }

        private StatusCode(int i) {
            this.value = i;
        }
    }

    public enum ToastPositionMask implements WireEnum {
        LARK(1),
        VC(2);
        
        public static final ProtoAdapter<ToastPositionMask> ADAPTER = ProtoAdapter.newEnumAdapter(ToastPositionMask.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ToastPositionMask fromValue(int i) {
            if (i == 1) {
                return LARK;
            }
            if (i != 2) {
                return null;
            }
            return VC;
        }

        private ToastPositionMask(int i) {
            this.value = i;
        }
    }

    public enum Type implements WireEnum {
        TOAST(1),
        POPUP(2),
        ALERT(3),
        PREVIEW(4),
        TIPS(5),
        BROADCAST(6);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            switch (i) {
                case 1:
                    return TOAST;
                case 2:
                    return POPUP;
                case 3:
                    return ALERT;
                case 4:
                    return PREVIEW;
                case 5:
                    return TIPS;
                case 6:
                    return BROADCAST;
                default:
                    return null;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatNotice$b */
    private static final class C51271b extends ProtoAdapter<VideoChatNotice> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f127683a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C51271b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatNotice.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatNotice videoChatNotice) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int encodedSizeWithTag = StatusCode.ADAPTER.encodedSizeWithTag(1, videoChatNotice.status) + Type.ADAPTER.encodedSizeWithTag(2, videoChatNotice.type);
            int i17 = 0;
            if (videoChatNotice.message != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(3, videoChatNotice.message);
            } else {
                i = 0;
            }
            int i18 = encodedSizeWithTag + i;
            if (videoChatNotice.title != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, videoChatNotice.title);
            } else {
                i2 = 0;
            }
            int i19 = i18 + i2;
            if (videoChatNotice.notice_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(5, videoChatNotice.notice_id);
            } else {
                i3 = 0;
            }
            int i20 = i19 + i3;
            if (videoChatNotice.cmd != null) {
                i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, videoChatNotice.cmd);
            } else {
                i4 = 0;
            }
            int i21 = i20 + i4;
            if (videoChatNotice.action_time != null) {
                i5 = ActionTime.ADAPTER.encodedSizeWithTag(7, videoChatNotice.action_time);
            } else {
                i5 = 0;
            }
            int i22 = i21 + i5;
            if (videoChatNotice.timeout != null) {
                i6 = ProtoAdapter.INT32.encodedSizeWithTag(8, videoChatNotice.timeout);
            } else {
                i6 = 0;
            }
            int i23 = i22 + i6;
            if (videoChatNotice.meeting_id != null) {
                i7 = ProtoAdapter.STRING.encodedSizeWithTag(9, videoChatNotice.meeting_id);
            } else {
                i7 = 0;
            }
            int i24 = i23 + i7;
            if (videoChatNotice.message_id != null) {
                i8 = ProtoAdapter.STRING.encodedSizeWithTag(10, videoChatNotice.message_id);
            } else {
                i8 = 0;
            }
            int i25 = i24 + i8;
            if (videoChatNotice.popup_type != null) {
                i9 = PopupType.ADAPTER.encodedSizeWithTag(11, videoChatNotice.popup_type);
            } else {
                i9 = 0;
            }
            int i26 = i25 + i9;
            if (videoChatNotice.msg_i18n_key != null) {
                i10 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(12, videoChatNotice.msg_i18n_key);
            } else {
                i10 = 0;
            }
            int i27 = i26 + i10;
            if (videoChatNotice.title_i18n_key != null) {
                i11 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(13, videoChatNotice.title_i18n_key);
            } else {
                i11 = 0;
            }
            int i28 = i27 + i11;
            if (videoChatNotice.toast_position != null) {
                i12 = ToastPositionMask.ADAPTER.encodedSizeWithTag(14, videoChatNotice.toast_position);
            } else {
                i12 = 0;
            }
            int i29 = i28 + i12;
            if (videoChatNotice.toast_duration_ms != null) {
                i13 = ProtoAdapter.INT32.encodedSizeWithTag(15, videoChatNotice.toast_duration_ms);
            } else {
                i13 = 0;
            }
            int encodedSizeWithTag2 = i29 + i13 + this.f127683a.encodedSizeWithTag(16, videoChatNotice.extra);
            if (videoChatNotice.push_sid != null) {
                i14 = ProtoAdapter.STRING.encodedSizeWithTag(17, videoChatNotice.push_sid);
            } else {
                i14 = 0;
            }
            int i30 = encodedSizeWithTag2 + i14;
            if (videoChatNotice.push_when_on_the_call != null) {
                i15 = ProtoAdapter.BOOL.encodedSizeWithTag(18, videoChatNotice.push_when_on_the_call);
            } else {
                i15 = 0;
            }
            int i31 = i30 + i15;
            if (videoChatNotice.btn_i18n_key != null) {
                i16 = I18nKeyInfo.ADAPTER.encodedSizeWithTag(19, videoChatNotice.btn_i18n_key);
            } else {
                i16 = 0;
            }
            int i32 = i31 + i16;
            if (videoChatNotice.meeting_end_time != null) {
                i17 = ProtoAdapter.INT64.encodedSizeWithTag(20, videoChatNotice.meeting_end_time);
            }
            return i32 + i17 + videoChatNotice.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatNotice decode(ProtoReader protoReader) throws IOException {
            C51270a aVar = new C51270a();
            aVar.f127663a = StatusCode.UNKOWN;
            aVar.f127664b = Type.TOAST;
            aVar.f127665c = "";
            aVar.f127666d = "";
            aVar.f127667e = "";
            aVar.f127668f = 0;
            aVar.f127670h = 0;
            aVar.f127671i = "";
            aVar.f127672j = "";
            aVar.f127673k = PopupType.UNKNOWN_POPUP_TYPE;
            aVar.f127676n = ToastPositionMask.LARK;
            aVar.f127677o = 0;
            aVar.f127679q = "";
            aVar.f127680r = false;
            aVar.f127682t = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f127663a = StatusCode.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            try {
                                aVar.f127664b = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 3:
                            aVar.f127665c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f127666d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f127667e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f127668f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            aVar.f127669g = ActionTime.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f127670h = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 9:
                            aVar.f127671i = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 10:
                            aVar.f127672j = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 11:
                            try {
                                aVar.f127673k = PopupType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e3.value));
                                break;
                            }
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f127674l = I18nKeyInfo.ADAPTER.decode(protoReader);
                            break;
                        case 13:
                            aVar.f127675m = I18nKeyInfo.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            try {
                                aVar.f127676n = ToastPositionMask.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e4.value));
                                break;
                            }
                        case 15:
                            aVar.f127677o = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            aVar.f127678p.putAll(this.f127683a.decode(protoReader));
                            break;
                        case 17:
                            aVar.f127679q = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 18:
                            aVar.f127680r = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            aVar.f127681s = I18nKeyInfo.ADAPTER.decode(protoReader);
                            break;
                        case 20:
                            aVar.f127682t = ProtoAdapter.INT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, VideoChatNotice videoChatNotice) throws IOException {
            StatusCode.ADAPTER.encodeWithTag(protoWriter, 1, videoChatNotice.status);
            Type.ADAPTER.encodeWithTag(protoWriter, 2, videoChatNotice.type);
            if (videoChatNotice.message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, videoChatNotice.message);
            }
            if (videoChatNotice.title != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, videoChatNotice.title);
            }
            if (videoChatNotice.notice_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, videoChatNotice.notice_id);
            }
            if (videoChatNotice.cmd != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, videoChatNotice.cmd);
            }
            if (videoChatNotice.action_time != null) {
                ActionTime.ADAPTER.encodeWithTag(protoWriter, 7, videoChatNotice.action_time);
            }
            if (videoChatNotice.timeout != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, videoChatNotice.timeout);
            }
            if (videoChatNotice.meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, videoChatNotice.meeting_id);
            }
            if (videoChatNotice.message_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, videoChatNotice.message_id);
            }
            if (videoChatNotice.popup_type != null) {
                PopupType.ADAPTER.encodeWithTag(protoWriter, 11, videoChatNotice.popup_type);
            }
            if (videoChatNotice.msg_i18n_key != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 12, videoChatNotice.msg_i18n_key);
            }
            if (videoChatNotice.title_i18n_key != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 13, videoChatNotice.title_i18n_key);
            }
            if (videoChatNotice.toast_position != null) {
                ToastPositionMask.ADAPTER.encodeWithTag(protoWriter, 14, videoChatNotice.toast_position);
            }
            if (videoChatNotice.toast_duration_ms != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 15, videoChatNotice.toast_duration_ms);
            }
            this.f127683a.encodeWithTag(protoWriter, 16, videoChatNotice.extra);
            if (videoChatNotice.push_sid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, videoChatNotice.push_sid);
            }
            if (videoChatNotice.push_when_on_the_call != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 18, videoChatNotice.push_when_on_the_call);
            }
            if (videoChatNotice.btn_i18n_key != null) {
                I18nKeyInfo.ADAPTER.encodeWithTag(protoWriter, 19, videoChatNotice.btn_i18n_key);
            }
            if (videoChatNotice.meeting_end_time != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, videoChatNotice.meeting_end_time);
            }
            protoWriter.writeBytes(videoChatNotice.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatNotice$a */
    public static final class C51270a extends Message.Builder<VideoChatNotice, C51270a> {

        /* renamed from: a */
        public StatusCode f127663a;

        /* renamed from: b */
        public Type f127664b;

        /* renamed from: c */
        public String f127665c;

        /* renamed from: d */
        public String f127666d;

        /* renamed from: e */
        public String f127667e;

        /* renamed from: f */
        public Integer f127668f;

        /* renamed from: g */
        public ActionTime f127669g;

        /* renamed from: h */
        public Integer f127670h;

        /* renamed from: i */
        public String f127671i;

        /* renamed from: j */
        public String f127672j;

        /* renamed from: k */
        public PopupType f127673k;

        /* renamed from: l */
        public I18nKeyInfo f127674l;

        /* renamed from: m */
        public I18nKeyInfo f127675m;

        /* renamed from: n */
        public ToastPositionMask f127676n;

        /* renamed from: o */
        public Integer f127677o;

        /* renamed from: p */
        public Map<String, String> f127678p = Internal.newMutableMap();

        /* renamed from: q */
        public String f127679q;

        /* renamed from: r */
        public Boolean f127680r;

        /* renamed from: s */
        public I18nKeyInfo f127681s;

        /* renamed from: t */
        public Long f127682t;

        /* renamed from: a */
        public VideoChatNotice build() {
            Type type;
            StatusCode statusCode = this.f127663a;
            if (statusCode != null && (type = this.f127664b) != null) {
                return new VideoChatNotice(statusCode, type, this.f127665c, this.f127666d, this.f127667e, this.f127668f, this.f127669g, this.f127670h, this.f127671i, this.f127672j, this.f127673k, this.f127674l, this.f127675m, this.f127676n, this.f127677o, this.f127678p, this.f127679q, this.f127680r, this.f127681s, this.f127682t, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(statusCode, UpdateKey.STATUS, this.f127664b, ShareHitPoint.f121869d);
        }
    }

    @Override // com.squareup.wire.Message
    public C51270a newBuilder() {
        C51270a aVar = new C51270a();
        aVar.f127663a = this.status;
        aVar.f127664b = this.type;
        aVar.f127665c = this.message;
        aVar.f127666d = this.title;
        aVar.f127667e = this.notice_id;
        aVar.f127668f = this.cmd;
        aVar.f127669g = this.action_time;
        aVar.f127670h = this.timeout;
        aVar.f127671i = this.meeting_id;
        aVar.f127672j = this.message_id;
        aVar.f127673k = this.popup_type;
        aVar.f127674l = this.msg_i18n_key;
        aVar.f127675m = this.title_i18n_key;
        aVar.f127676n = this.toast_position;
        aVar.f127677o = this.toast_duration_ms;
        aVar.f127678p = Internal.copyOf("extra", this.extra);
        aVar.f127679q = this.push_sid;
        aVar.f127680r = this.push_when_on_the_call;
        aVar.f127681s = this.btn_i18n_key;
        aVar.f127682t = this.meeting_end_time;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatNotice");
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", type=");
        sb.append(this.type);
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.notice_id != null) {
            sb.append(", notice_id=");
            sb.append(this.notice_id);
        }
        if (this.cmd != null) {
            sb.append(", cmd=");
            sb.append(this.cmd);
        }
        if (this.action_time != null) {
            sb.append(", action_time=");
            sb.append(this.action_time);
        }
        if (this.timeout != null) {
            sb.append(", timeout=");
            sb.append(this.timeout);
        }
        if (this.meeting_id != null) {
            sb.append(", meeting_id=");
            sb.append(this.meeting_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        if (this.popup_type != null) {
            sb.append(", popup_type=");
            sb.append(this.popup_type);
        }
        if (this.msg_i18n_key != null) {
            sb.append(", msg_i18n_key=");
            sb.append(this.msg_i18n_key);
        }
        if (this.title_i18n_key != null) {
            sb.append(", title_i18n_key=");
            sb.append(this.title_i18n_key);
        }
        if (this.toast_position != null) {
            sb.append(", toast_position=");
            sb.append(this.toast_position);
        }
        if (this.toast_duration_ms != null) {
            sb.append(", toast_duration_ms=");
            sb.append(this.toast_duration_ms);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.push_sid != null) {
            sb.append(", push_sid=");
            sb.append(this.push_sid);
        }
        if (this.push_when_on_the_call != null) {
            sb.append(", push_when_on_the_call=");
            sb.append(this.push_when_on_the_call);
        }
        if (this.btn_i18n_key != null) {
            sb.append(", btn_i18n_key=");
            sb.append(this.btn_i18n_key);
        }
        if (this.meeting_end_time != null) {
            sb.append(", meeting_end_time=");
            sb.append(this.meeting_end_time);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatNotice{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatNotice(StatusCode statusCode, Type type2, String str, String str2, String str3, Integer num, ActionTime actionTime, Integer num2, String str4, String str5, PopupType popupType, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, ToastPositionMask toastPositionMask, Integer num3, Map<String, String> map, String str6, Boolean bool, I18nKeyInfo i18nKeyInfo3, Long l) {
        this(statusCode, type2, str, str2, str3, num, actionTime, num2, str4, str5, popupType, i18nKeyInfo, i18nKeyInfo2, toastPositionMask, num3, map, str6, bool, i18nKeyInfo3, l, ByteString.EMPTY);
    }

    public VideoChatNotice(StatusCode statusCode, Type type2, String str, String str2, String str3, Integer num, ActionTime actionTime, Integer num2, String str4, String str5, PopupType popupType, I18nKeyInfo i18nKeyInfo, I18nKeyInfo i18nKeyInfo2, ToastPositionMask toastPositionMask, Integer num3, Map<String, String> map, String str6, Boolean bool, I18nKeyInfo i18nKeyInfo3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = statusCode;
        this.type = type2;
        this.message = str;
        this.title = str2;
        this.notice_id = str3;
        this.cmd = num;
        this.action_time = actionTime;
        this.timeout = num2;
        this.meeting_id = str4;
        this.message_id = str5;
        this.popup_type = popupType;
        this.msg_i18n_key = i18nKeyInfo;
        this.title_i18n_key = i18nKeyInfo2;
        this.toast_position = toastPositionMask;
        this.toast_duration_ms = num3;
        this.extra = Internal.immutableCopyOf("extra", map);
        this.push_sid = str6;
        this.push_when_on_the_call = bool;
        this.btn_i18n_key = i18nKeyInfo3;
        this.meeting_end_time = l;
    }
}
