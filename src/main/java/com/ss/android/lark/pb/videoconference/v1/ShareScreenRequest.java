package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class ShareScreenRequest extends Message<ShareScreenRequest, C51042a> {
    public static final ProtoAdapter<ShareScreenRequest> ADAPTER = new C51043b();
    public static final Boolean DEFAULT_ACCESSIBILITY = false;
    public static final Action DEFAULT_ACTION = Action.UNKNOWN;
    public static final FollowAssociateType DEFAULT_ASSOCIATE_TYPE = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
    public static final Integer DEFAULT_HEIGHT = 0;
    public static final Boolean DEFAULT_IS_PORTRAIT_MODE = false;
    public static final Boolean DEFAULT_IS_SMOOTH_MODE = false;
    public static final Integer DEFAULT_WIDTH = 0;
    private static final long serialVersionUID = 0;
    public final Boolean accessibility;
    public final Action action;
    public final FollowAssociateType associate_type;
    public final String breakout_meeting_id;
    public final Integer height;
    public final Boolean is_portrait_mode;
    public final Boolean is_smooth_mode;
    public final String meeting_id;
    public final Integer width;

    public enum Action implements WireEnum {
        UNKNOWN(0),
        START(1),
        STOP(2);
        
        public static final ProtoAdapter<Action> ADAPTER = ProtoAdapter.newEnumAdapter(Action.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Action fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return START;
            }
            if (i != 2) {
                return null;
            }
            return STOP;
        }

        private Action(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenRequest$b */
    private static final class C51043b extends ProtoAdapter<ShareScreenRequest> {
        C51043b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareScreenRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareScreenRequest shareScreenRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, shareScreenRequest.meeting_id) + Action.ADAPTER.encodedSizeWithTag(2, shareScreenRequest.action);
            int i7 = 0;
            if (shareScreenRequest.width != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(4, shareScreenRequest.width);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (shareScreenRequest.height != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(5, shareScreenRequest.height);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (shareScreenRequest.accessibility != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, shareScreenRequest.accessibility);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (shareScreenRequest.is_smooth_mode != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(7, shareScreenRequest.is_smooth_mode);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (shareScreenRequest.is_portrait_mode != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(8, shareScreenRequest.is_portrait_mode);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (shareScreenRequest.breakout_meeting_id != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(21, shareScreenRequest.breakout_meeting_id);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (shareScreenRequest.associate_type != null) {
                i7 = FollowAssociateType.ADAPTER.encodedSizeWithTag(22, shareScreenRequest.associate_type);
            }
            return i13 + i7 + shareScreenRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareScreenRequest decode(ProtoReader protoReader) throws IOException {
            C51042a aVar = new C51042a();
            aVar.f127108a = "";
            aVar.f127109b = Action.UNKNOWN;
            aVar.f127110c = 0;
            aVar.f127111d = 0;
            aVar.f127112e = false;
            aVar.f127113f = false;
            aVar.f127114g = false;
            aVar.f127115h = "";
            aVar.f127116i = FollowAssociateType.FOLLOW_ASSOCIATE_TYPE_UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127108a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f127109b = Action.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 21) {
                    aVar.f127115h = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 22) {
                    switch (nextTag) {
                        case 4:
                            aVar.f127110c = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f127111d = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f127112e = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f127113f = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        case 8:
                            aVar.f127114g = ProtoAdapter.BOOL.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    try {
                        aVar.f127116i = FollowAssociateType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ShareScreenRequest shareScreenRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareScreenRequest.meeting_id);
            Action.ADAPTER.encodeWithTag(protoWriter, 2, shareScreenRequest.action);
            if (shareScreenRequest.width != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, shareScreenRequest.width);
            }
            if (shareScreenRequest.height != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, shareScreenRequest.height);
            }
            if (shareScreenRequest.accessibility != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, shareScreenRequest.accessibility);
            }
            if (shareScreenRequest.is_smooth_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, shareScreenRequest.is_smooth_mode);
            }
            if (shareScreenRequest.is_portrait_mode != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, shareScreenRequest.is_portrait_mode);
            }
            if (shareScreenRequest.breakout_meeting_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 21, shareScreenRequest.breakout_meeting_id);
            }
            if (shareScreenRequest.associate_type != null) {
                FollowAssociateType.ADAPTER.encodeWithTag(protoWriter, 22, shareScreenRequest.associate_type);
            }
            protoWriter.writeBytes(shareScreenRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareScreenRequest$a */
    public static final class C51042a extends Message.Builder<ShareScreenRequest, C51042a> {

        /* renamed from: a */
        public String f127108a;

        /* renamed from: b */
        public Action f127109b;

        /* renamed from: c */
        public Integer f127110c;

        /* renamed from: d */
        public Integer f127111d;

        /* renamed from: e */
        public Boolean f127112e;

        /* renamed from: f */
        public Boolean f127113f;

        /* renamed from: g */
        public Boolean f127114g;

        /* renamed from: h */
        public String f127115h;

        /* renamed from: i */
        public FollowAssociateType f127116i;

        /* renamed from: a */
        public ShareScreenRequest build() {
            Action action;
            String str = this.f127108a;
            if (str != null && (action = this.f127109b) != null) {
                return new ShareScreenRequest(str, action, this.f127110c, this.f127111d, this.f127112e, this.f127113f, this.f127114g, this.f127115h, this.f127116i, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "meeting_id", this.f127109b, "action");
        }

        /* renamed from: a */
        public C51042a mo176211a(Action action) {
            this.f127109b = action;
            return this;
        }

        /* renamed from: b */
        public C51042a mo176214b(String str) {
            this.f127115h = str;
            return this;
        }

        /* renamed from: a */
        public C51042a mo176212a(String str) {
            this.f127108a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51042a newBuilder() {
        C51042a aVar = new C51042a();
        aVar.f127108a = this.meeting_id;
        aVar.f127109b = this.action;
        aVar.f127110c = this.width;
        aVar.f127111d = this.height;
        aVar.f127112e = this.accessibility;
        aVar.f127113f = this.is_smooth_mode;
        aVar.f127114g = this.is_portrait_mode;
        aVar.f127115h = this.breakout_meeting_id;
        aVar.f127116i = this.associate_type;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareScreenRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", meeting_id=");
        sb.append(this.meeting_id);
        sb.append(", action=");
        sb.append(this.action);
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.accessibility != null) {
            sb.append(", accessibility=");
            sb.append(this.accessibility);
        }
        if (this.is_smooth_mode != null) {
            sb.append(", is_smooth_mode=");
            sb.append(this.is_smooth_mode);
        }
        if (this.is_portrait_mode != null) {
            sb.append(", is_portrait_mode=");
            sb.append(this.is_portrait_mode);
        }
        if (this.breakout_meeting_id != null) {
            sb.append(", breakout_meeting_id=");
            sb.append(this.breakout_meeting_id);
        }
        if (this.associate_type != null) {
            sb.append(", associate_type=");
            sb.append(this.associate_type);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareScreenRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ShareScreenRequest(String str, Action action2, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str2, FollowAssociateType followAssociateType) {
        this(str, action2, num, num2, bool, bool2, bool3, str2, followAssociateType, ByteString.EMPTY);
    }

    public ShareScreenRequest(String str, Action action2, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, String str2, FollowAssociateType followAssociateType, ByteString byteString) {
        super(ADAPTER, byteString);
        this.meeting_id = str;
        this.action = action2;
        this.width = num;
        this.height = num2;
        this.accessibility = bool;
        this.is_smooth_mode = bool2;
        this.is_portrait_mode = bool3;
        this.breakout_meeting_id = str2;
        this.associate_type = followAssociateType;
    }
}
