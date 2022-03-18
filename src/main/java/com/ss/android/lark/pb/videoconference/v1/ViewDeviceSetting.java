package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.videoconference.v1.RTCProxy;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ViewDeviceSetting extends Message<ViewDeviceSetting, C51296a> {
    public static final ProtoAdapter<ViewDeviceSetting> ADAPTER = new C51297b();
    private static final long serialVersionUID = 0;
    public final Audio audio;
    public final Audio live_audio;
    public final Video live_video;
    public final Video video;

    public static final class Video extends Message<Video, C51294a> {
        public static final ProtoAdapter<Video> ADAPTER = new C51295b();
        public static final Boolean DEFAULT_BACKGROUND_BLUR = false;
        public static final Boolean DEFAULT_DEFAULT_CAMERA_MUTED = false;
        public static final Boolean DEFAULT_DYNAMIC_LAYOUT = false;
        public static final Boolean DEFAULT_FACE_BEAUTY = false;
        public static final Integer DEFAULT_FACE_BEAUTY_LEVEL = 0;
        public static final Boolean DEFAULT_MIRROR = true;
        public static final Boolean DEFAULT_PORTRAIT_MODE = false;
        public static final Boolean DEFAULT_SMOOTH_SHARE = false;
        public static final Boolean DEFAULT_VIDEO_ENHANCE = false;
        private static final long serialVersionUID = 0;
        public final String advanced_beauty;
        public final Boolean background_blur;
        public final String camera_device_id;
        public final String cpu_score_tip_timestamp;
        public final Boolean default_camera_muted;
        public final Boolean dynamic_layout;
        public final Boolean face_beauty;
        public final Integer face_beauty_level;
        public final String memoji_icon_url;
        public final String memoji_icon_url_v2;
        public final Boolean mirror;
        public final Boolean portrait_mode;
        public final RTCProxyInfos rtc_proxy_infos;
        public final Boolean smooth_share;
        public final Boolean video_enhance;
        public final VirtualAvatar virtual_avatar;
        public final String virtual_background;

        public static final class VirtualAvatar extends Message<VirtualAvatar, C51292a> {
            public static final ProtoAdapter<VirtualAvatar> ADAPTER = new C51293b();
            public static final Type DEFAULT_TYPE = Type.NONE;
            private static final long serialVersionUID = 0;
            public final String resource_id;
            public final Type type;

            public enum Type implements WireEnum {
                NONE(0),
                MEMOJI(1),
                ANIMOJI(2);
                
                public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
                private final int value;

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                public static Type fromValue(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return MEMOJI;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return ANIMOJI;
                }

                private Type(int i) {
                    this.value = i;
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Video$VirtualAvatar$b */
            private static final class C51293b extends ProtoAdapter<VirtualAvatar> {
                C51293b() {
                    super(FieldEncoding.LENGTH_DELIMITED, VirtualAvatar.class);
                }

                /* renamed from: a */
                public int encodedSize(VirtualAvatar virtualAvatar) {
                    int i;
                    int i2 = 0;
                    if (virtualAvatar.type != null) {
                        i = Type.ADAPTER.encodedSizeWithTag(1, virtualAvatar.type);
                    } else {
                        i = 0;
                    }
                    if (virtualAvatar.resource_id != null) {
                        i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, virtualAvatar.resource_id);
                    }
                    return i + i2 + virtualAvatar.unknownFields().size();
                }

                /* renamed from: a */
                public VirtualAvatar decode(ProtoReader protoReader) throws IOException {
                    C51292a aVar = new C51292a();
                    aVar.f127759a = Type.NONE;
                    aVar.f127760b = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            try {
                                aVar.f127759a = Type.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        } else if (nextTag != 2) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f127760b = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, VirtualAvatar virtualAvatar) throws IOException {
                    if (virtualAvatar.type != null) {
                        Type.ADAPTER.encodeWithTag(protoWriter, 1, virtualAvatar.type);
                    }
                    if (virtualAvatar.resource_id != null) {
                        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, virtualAvatar.resource_id);
                    }
                    protoWriter.writeBytes(virtualAvatar.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Video$VirtualAvatar$a */
            public static final class C51292a extends Message.Builder<VirtualAvatar, C51292a> {

                /* renamed from: a */
                public Type f127759a;

                /* renamed from: b */
                public String f127760b;

                /* renamed from: a */
                public VirtualAvatar build() {
                    return new VirtualAvatar(this.f127759a, this.f127760b, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C51292a newBuilder() {
                C51292a aVar = new C51292a();
                aVar.f127759a = this.type;
                aVar.f127760b = this.resource_id;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "VirtualAvatar");
                StringBuilder sb = new StringBuilder();
                if (this.type != null) {
                    sb.append(", type=");
                    sb.append(this.type);
                }
                if (this.resource_id != null) {
                    sb.append(", resource_id=");
                    sb.append(this.resource_id);
                }
                StringBuilder replace = sb.replace(0, 2, "VirtualAvatar{");
                replace.append('}');
                return replace.toString();
            }

            public VirtualAvatar(Type type2, String str) {
                this(type2, str, ByteString.EMPTY);
            }

            public VirtualAvatar(Type type2, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                this.type = type2;
                this.resource_id = str;
            }
        }

        public static final class RTCProxyInfos extends Message<RTCProxyInfos, C51290a> {
            public static final ProtoAdapter<RTCProxyInfos> ADAPTER = new C51291b();
            public static final Boolean DEFAULT_IS_OPEN = false;
            public static final RTCProxy.ProxyType DEFAULT_SELECTED_TYPE = RTCProxy.ProxyType.NONE;
            private static final long serialVersionUID = 0;
            public final List<RTCProxy> infos;
            public final Boolean is_open;
            public final RTCProxy.ProxyType selected_type;

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Video$RTCProxyInfos$b */
            private static final class C51291b extends ProtoAdapter<RTCProxyInfos> {
                C51291b() {
                    super(FieldEncoding.LENGTH_DELIMITED, RTCProxyInfos.class);
                }

                /* renamed from: a */
                public int encodedSize(RTCProxyInfos rTCProxyInfos) {
                    int i;
                    int i2 = 0;
                    if (rTCProxyInfos.is_open != null) {
                        i = ProtoAdapter.BOOL.encodedSizeWithTag(1, rTCProxyInfos.is_open);
                    } else {
                        i = 0;
                    }
                    if (rTCProxyInfos.selected_type != null) {
                        i2 = RTCProxy.ProxyType.ADAPTER.encodedSizeWithTag(2, rTCProxyInfos.selected_type);
                    }
                    return i + i2 + RTCProxy.ADAPTER.asRepeated().encodedSizeWithTag(3, rTCProxyInfos.infos) + rTCProxyInfos.unknownFields().size();
                }

                /* renamed from: a */
                public RTCProxyInfos decode(ProtoReader protoReader) throws IOException {
                    C51290a aVar = new C51290a();
                    aVar.f127756a = false;
                    aVar.f127757b = RTCProxy.ProxyType.NONE;
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f127756a = ProtoAdapter.BOOL.decode(protoReader);
                        } else if (nextTag == 2) {
                            try {
                                aVar.f127757b = RTCProxy.ProxyType.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        } else if (nextTag != 3) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f127758c.add(RTCProxy.ADAPTER.decode(protoReader));
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, RTCProxyInfos rTCProxyInfos) throws IOException {
                    if (rTCProxyInfos.is_open != null) {
                        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, rTCProxyInfos.is_open);
                    }
                    if (rTCProxyInfos.selected_type != null) {
                        RTCProxy.ProxyType.ADAPTER.encodeWithTag(protoWriter, 2, rTCProxyInfos.selected_type);
                    }
                    RTCProxy.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, rTCProxyInfos.infos);
                    protoWriter.writeBytes(rTCProxyInfos.unknownFields());
                }
            }

            /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Video$RTCProxyInfos$a */
            public static final class C51290a extends Message.Builder<RTCProxyInfos, C51290a> {

                /* renamed from: a */
                public Boolean f127756a;

                /* renamed from: b */
                public RTCProxy.ProxyType f127757b;

                /* renamed from: c */
                public List<RTCProxy> f127758c = Internal.newMutableList();

                /* renamed from: a */
                public RTCProxyInfos build() {
                    return new RTCProxyInfos(this.f127756a, this.f127757b, this.f127758c, super.buildUnknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C51290a newBuilder() {
                C51290a aVar = new C51290a();
                aVar.f127756a = this.is_open;
                aVar.f127757b = this.selected_type;
                aVar.f127758c = Internal.copyOf("infos", this.infos);
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                C1911a.m8540a("videoconference", "RTCProxyInfos");
                StringBuilder sb = new StringBuilder();
                if (this.is_open != null) {
                    sb.append(", is_open=");
                    sb.append(this.is_open);
                }
                if (this.selected_type != null) {
                    sb.append(", selected_type=");
                    sb.append(this.selected_type);
                }
                if (!this.infos.isEmpty()) {
                    sb.append(", infos=");
                    sb.append(this.infos);
                }
                StringBuilder replace = sb.replace(0, 2, "RTCProxyInfos{");
                replace.append('}');
                return replace.toString();
            }

            public RTCProxyInfos(Boolean bool, RTCProxy.ProxyType proxyType, List<RTCProxy> list) {
                this(bool, proxyType, list, ByteString.EMPTY);
            }

            public RTCProxyInfos(Boolean bool, RTCProxy.ProxyType proxyType, List<RTCProxy> list, ByteString byteString) {
                super(ADAPTER, byteString);
                this.is_open = bool;
                this.selected_type = proxyType;
                this.infos = Internal.immutableCopyOf("infos", list);
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Video$b */
        private static final class C51295b extends ProtoAdapter<Video> {
            C51295b() {
                super(FieldEncoding.LENGTH_DELIMITED, Video.class);
            }

            /* renamed from: a */
            public int encodedSize(Video video) {
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
                int i17 = 0;
                if (video.camera_device_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, video.camera_device_id);
                } else {
                    i = 0;
                }
                if (video.mirror != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, video.mirror);
                } else {
                    i2 = 0;
                }
                int i18 = i + i2;
                if (video.background_blur != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, video.background_blur);
                } else {
                    i3 = 0;
                }
                int i19 = i18 + i3;
                if (video.face_beauty != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, video.face_beauty);
                } else {
                    i4 = 0;
                }
                int i20 = i19 + i4;
                if (video.dynamic_layout != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, video.dynamic_layout);
                } else {
                    i5 = 0;
                }
                int i21 = i20 + i5;
                if (video.virtual_background != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(6, video.virtual_background);
                } else {
                    i6 = 0;
                }
                int i22 = i21 + i6;
                if (video.video_enhance != null) {
                    i7 = ProtoAdapter.BOOL.encodedSizeWithTag(7, video.video_enhance);
                } else {
                    i7 = 0;
                }
                int i23 = i22 + i7;
                if (video.smooth_share != null) {
                    i8 = ProtoAdapter.BOOL.encodedSizeWithTag(8, video.smooth_share);
                } else {
                    i8 = 0;
                }
                int i24 = i23 + i8;
                if (video.default_camera_muted != null) {
                    i9 = ProtoAdapter.BOOL.encodedSizeWithTag(9, video.default_camera_muted);
                } else {
                    i9 = 0;
                }
                int i25 = i24 + i9;
                if (video.face_beauty_level != null) {
                    i10 = ProtoAdapter.INT32.encodedSizeWithTag(10, video.face_beauty_level);
                } else {
                    i10 = 0;
                }
                int i26 = i25 + i10;
                if (video.memoji_icon_url != null) {
                    i11 = ProtoAdapter.STRING.encodedSizeWithTag(11, video.memoji_icon_url);
                } else {
                    i11 = 0;
                }
                int i27 = i26 + i11;
                if (video.virtual_avatar != null) {
                    i12 = VirtualAvatar.ADAPTER.encodedSizeWithTag(12, video.virtual_avatar);
                } else {
                    i12 = 0;
                }
                int i28 = i27 + i12;
                if (video.rtc_proxy_infos != null) {
                    i13 = RTCProxyInfos.ADAPTER.encodedSizeWithTag(13, video.rtc_proxy_infos);
                } else {
                    i13 = 0;
                }
                int i29 = i28 + i13;
                if (video.advanced_beauty != null) {
                    i14 = ProtoAdapter.STRING.encodedSizeWithTag(14, video.advanced_beauty);
                } else {
                    i14 = 0;
                }
                int i30 = i29 + i14;
                if (video.portrait_mode != null) {
                    i15 = ProtoAdapter.BOOL.encodedSizeWithTag(15, video.portrait_mode);
                } else {
                    i15 = 0;
                }
                int i31 = i30 + i15;
                if (video.memoji_icon_url_v2 != null) {
                    i16 = ProtoAdapter.STRING.encodedSizeWithTag(16, video.memoji_icon_url_v2);
                } else {
                    i16 = 0;
                }
                int i32 = i31 + i16;
                if (video.cpu_score_tip_timestamp != null) {
                    i17 = ProtoAdapter.STRING.encodedSizeWithTag(17, video.cpu_score_tip_timestamp);
                }
                return i32 + i17 + video.unknownFields().size();
            }

            /* renamed from: a */
            public Video decode(ProtoReader protoReader) throws IOException {
                C51294a aVar = new C51294a();
                aVar.f127761a = "";
                aVar.f127762b = true;
                aVar.f127763c = false;
                aVar.f127764d = false;
                aVar.f127765e = false;
                aVar.f127766f = "";
                aVar.f127767g = false;
                aVar.f127768h = false;
                aVar.f127769i = false;
                aVar.f127770j = 0;
                aVar.f127771k = "";
                aVar.f127774n = "";
                aVar.f127775o = false;
                aVar.f127776p = "";
                aVar.f127777q = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127761a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f127762b = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 3:
                                aVar.f127763c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127764d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127765e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127766f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f127767g = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 8:
                                aVar.f127768h = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 9:
                                aVar.f127769i = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 10:
                                aVar.f127770j = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 11:
                                aVar.f127771k = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HwBuildEx.VersionCodes.EMUI_5_1:
                                aVar.f127772l = VirtualAvatar.ADAPTER.decode(protoReader);
                                break;
                            case 13:
                                aVar.f127773m = RTCProxyInfos.ADAPTER.decode(protoReader);
                                break;
                            case 14:
                                aVar.f127774n = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 15:
                                aVar.f127775o = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 16:
                                aVar.f127776p = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 17:
                                aVar.f127777q = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Video video) throws IOException {
                if (video.camera_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, video.camera_device_id);
                }
                if (video.mirror != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, video.mirror);
                }
                if (video.background_blur != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, video.background_blur);
                }
                if (video.face_beauty != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, video.face_beauty);
                }
                if (video.dynamic_layout != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, video.dynamic_layout);
                }
                if (video.virtual_background != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, video.virtual_background);
                }
                if (video.video_enhance != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, video.video_enhance);
                }
                if (video.smooth_share != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, video.smooth_share);
                }
                if (video.default_camera_muted != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, video.default_camera_muted);
                }
                if (video.face_beauty_level != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, video.face_beauty_level);
                }
                if (video.memoji_icon_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 11, video.memoji_icon_url);
                }
                if (video.virtual_avatar != null) {
                    VirtualAvatar.ADAPTER.encodeWithTag(protoWriter, 12, video.virtual_avatar);
                }
                if (video.rtc_proxy_infos != null) {
                    RTCProxyInfos.ADAPTER.encodeWithTag(protoWriter, 13, video.rtc_proxy_infos);
                }
                if (video.advanced_beauty != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, video.advanced_beauty);
                }
                if (video.portrait_mode != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, video.portrait_mode);
                }
                if (video.memoji_icon_url_v2 != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 16, video.memoji_icon_url_v2);
                }
                if (video.cpu_score_tip_timestamp != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 17, video.cpu_score_tip_timestamp);
                }
                protoWriter.writeBytes(video.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Video$a */
        public static final class C51294a extends Message.Builder<Video, C51294a> {

            /* renamed from: a */
            public String f127761a;

            /* renamed from: b */
            public Boolean f127762b;

            /* renamed from: c */
            public Boolean f127763c;

            /* renamed from: d */
            public Boolean f127764d;

            /* renamed from: e */
            public Boolean f127765e;

            /* renamed from: f */
            public String f127766f;

            /* renamed from: g */
            public Boolean f127767g;

            /* renamed from: h */
            public Boolean f127768h;

            /* renamed from: i */
            public Boolean f127769i;

            /* renamed from: j */
            public Integer f127770j;

            /* renamed from: k */
            public String f127771k;

            /* renamed from: l */
            public VirtualAvatar f127772l;

            /* renamed from: m */
            public RTCProxyInfos f127773m;

            /* renamed from: n */
            public String f127774n;

            /* renamed from: o */
            public Boolean f127775o;

            /* renamed from: p */
            public String f127776p;

            /* renamed from: q */
            public String f127777q;

            /* renamed from: a */
            public Video build() {
                return new Video(this.f127761a, this.f127762b, this.f127763c, this.f127764d, this.f127765e, this.f127766f, this.f127767g, this.f127768h, this.f127769i, this.f127770j, this.f127771k, this.f127772l, this.f127773m, this.f127774n, this.f127775o, this.f127776p, this.f127777q, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C51294a mo176825a(Boolean bool) {
                this.f127762b = bool;
                return this;
            }

            /* renamed from: b */
            public C51294a mo176829b(Boolean bool) {
                this.f127763c = bool;
                return this;
            }

            /* renamed from: c */
            public C51294a mo176831c(Boolean bool) {
                this.f127764d = bool;
                return this;
            }

            /* renamed from: d */
            public C51294a mo176832d(Boolean bool) {
                this.f127765e = bool;
                return this;
            }

            /* renamed from: e */
            public C51294a mo176833e(Boolean bool) {
                this.f127767g = bool;
                return this;
            }

            /* renamed from: f */
            public C51294a mo176834f(Boolean bool) {
                this.f127768h = bool;
                return this;
            }

            /* renamed from: g */
            public C51294a mo176835g(Boolean bool) {
                this.f127769i = bool;
                return this;
            }

            /* renamed from: a */
            public C51294a mo176826a(Integer num) {
                this.f127770j = num;
                return this;
            }

            /* renamed from: b */
            public C51294a mo176830b(String str) {
                this.f127774n = str;
                return this;
            }

            /* renamed from: a */
            public C51294a mo176827a(String str) {
                this.f127766f = str;
                return this;
            }
        }

        @Override // com.squareup.wire.Message
        public C51294a newBuilder() {
            C51294a aVar = new C51294a();
            aVar.f127761a = this.camera_device_id;
            aVar.f127762b = this.mirror;
            aVar.f127763c = this.background_blur;
            aVar.f127764d = this.face_beauty;
            aVar.f127765e = this.dynamic_layout;
            aVar.f127766f = this.virtual_background;
            aVar.f127767g = this.video_enhance;
            aVar.f127768h = this.smooth_share;
            aVar.f127769i = this.default_camera_muted;
            aVar.f127770j = this.face_beauty_level;
            aVar.f127771k = this.memoji_icon_url;
            aVar.f127772l = this.virtual_avatar;
            aVar.f127773m = this.rtc_proxy_infos;
            aVar.f127774n = this.advanced_beauty;
            aVar.f127775o = this.portrait_mode;
            aVar.f127776p = this.memoji_icon_url_v2;
            aVar.f127777q = this.cpu_score_tip_timestamp;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Video");
            StringBuilder sb = new StringBuilder();
            if (this.camera_device_id != null) {
                sb.append(", camera_device_id=");
                sb.append(this.camera_device_id);
            }
            if (this.mirror != null) {
                sb.append(", mirror=");
                sb.append(this.mirror);
            }
            if (this.background_blur != null) {
                sb.append(", background_blur=");
                sb.append(this.background_blur);
            }
            if (this.face_beauty != null) {
                sb.append(", face_beauty=");
                sb.append(this.face_beauty);
            }
            if (this.dynamic_layout != null) {
                sb.append(", dynamic_layout=");
                sb.append(this.dynamic_layout);
            }
            if (this.virtual_background != null) {
                sb.append(", virtual_background=");
                sb.append(this.virtual_background);
            }
            if (this.video_enhance != null) {
                sb.append(", video_enhance=");
                sb.append(this.video_enhance);
            }
            if (this.smooth_share != null) {
                sb.append(", smooth_share=");
                sb.append(this.smooth_share);
            }
            if (this.default_camera_muted != null) {
                sb.append(", default_camera_muted=");
                sb.append(this.default_camera_muted);
            }
            if (this.face_beauty_level != null) {
                sb.append(", face_beauty_level=");
                sb.append(this.face_beauty_level);
            }
            if (this.memoji_icon_url != null) {
                sb.append(", memoji_icon_url=");
                sb.append(this.memoji_icon_url);
            }
            if (this.virtual_avatar != null) {
                sb.append(", virtual_avatar=");
                sb.append(this.virtual_avatar);
            }
            if (this.rtc_proxy_infos != null) {
                sb.append(", rtc_proxy_infos=");
                sb.append(this.rtc_proxy_infos);
            }
            if (this.advanced_beauty != null) {
                sb.append(", advanced_beauty=");
                sb.append(this.advanced_beauty);
            }
            if (this.portrait_mode != null) {
                sb.append(", portrait_mode=");
                sb.append(this.portrait_mode);
            }
            if (this.memoji_icon_url_v2 != null) {
                sb.append(", memoji_icon_url_v2=");
                sb.append(this.memoji_icon_url_v2);
            }
            if (this.cpu_score_tip_timestamp != null) {
                sb.append(", cpu_score_tip_timestamp=");
                sb.append(this.cpu_score_tip_timestamp);
            }
            StringBuilder replace = sb.replace(0, 2, "Video{");
            replace.append('}');
            return replace.toString();
        }

        public Video(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, String str3, VirtualAvatar virtualAvatar, RTCProxyInfos rTCProxyInfos, String str4, Boolean bool8, String str5, String str6) {
            this(str, bool, bool2, bool3, bool4, str2, bool5, bool6, bool7, num, str3, virtualAvatar, rTCProxyInfos, str4, bool8, str5, str6, ByteString.EMPTY);
        }

        public Video(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Boolean bool6, Boolean bool7, Integer num, String str3, VirtualAvatar virtualAvatar, RTCProxyInfos rTCProxyInfos, String str4, Boolean bool8, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.camera_device_id = str;
            this.mirror = bool;
            this.background_blur = bool2;
            this.face_beauty = bool3;
            this.dynamic_layout = bool4;
            this.virtual_background = str2;
            this.video_enhance = bool5;
            this.smooth_share = bool6;
            this.default_camera_muted = bool7;
            this.face_beauty_level = num;
            this.memoji_icon_url = str3;
            this.virtual_avatar = virtualAvatar;
            this.rtc_proxy_infos = rTCProxyInfos;
            this.advanced_beauty = str4;
            this.portrait_mode = bool8;
            this.memoji_icon_url_v2 = str5;
            this.cpu_score_tip_timestamp = str6;
        }
    }

    public static final class Audio extends Message<Audio, C51288a> {
        public static final ProtoAdapter<Audio> ADAPTER = new C51289b();
        public static final Boolean DEFAULT_AUTO_ADJUST_MICROPHONE_VOLUME = true;
        public static final Boolean DEFAULT_BACKGROUND_NOISE_REDUCTION = true;
        public static final Boolean DEFAULT_DEFAULT_MICROPHONE_MUTED = false;
        public static final Integer DEFAULT_HOWLING_IGNORE_COUNT = 0;
        public static final Boolean DEFAULT_KEYBOARD_SOUND_CANCELLATION = true;
        public static final Boolean DEFAULT_USS_PERMISSION = true;
        private static final long serialVersionUID = 0;
        public final Boolean auto_adjust_microphone_volume;
        public final Boolean background_noise_reduction;
        public final Boolean default_microphone_muted;
        public final String howling_first_ignore_notice_time;
        public final String howling_first_ignore_time;
        public final Integer howling_ignore_count;
        public final Boolean keyboard_sound_cancellation;
        public final String playback_device_id;
        public final String record_device_id;
        public final Boolean uss_permission;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Audio$b */
        private static final class C51289b extends ProtoAdapter<Audio> {
            C51289b() {
                super(FieldEncoding.LENGTH_DELIMITED, Audio.class);
            }

            /* renamed from: a */
            public int encodedSize(Audio audio) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                int i10 = 0;
                if (audio.record_device_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, audio.record_device_id);
                } else {
                    i = 0;
                }
                if (audio.playback_device_id != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, audio.playback_device_id);
                } else {
                    i2 = 0;
                }
                int i11 = i + i2;
                if (audio.keyboard_sound_cancellation != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, audio.keyboard_sound_cancellation);
                } else {
                    i3 = 0;
                }
                int i12 = i11 + i3;
                if (audio.background_noise_reduction != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, audio.background_noise_reduction);
                } else {
                    i4 = 0;
                }
                int i13 = i12 + i4;
                if (audio.default_microphone_muted != null) {
                    i5 = ProtoAdapter.BOOL.encodedSizeWithTag(5, audio.default_microphone_muted);
                } else {
                    i5 = 0;
                }
                int i14 = i13 + i5;
                if (audio.auto_adjust_microphone_volume != null) {
                    i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, audio.auto_adjust_microphone_volume);
                } else {
                    i6 = 0;
                }
                int i15 = i14 + i6;
                if (audio.howling_first_ignore_time != null) {
                    i7 = ProtoAdapter.STRING.encodedSizeWithTag(7, audio.howling_first_ignore_time);
                } else {
                    i7 = 0;
                }
                int i16 = i15 + i7;
                if (audio.howling_ignore_count != null) {
                    i8 = ProtoAdapter.INT32.encodedSizeWithTag(8, audio.howling_ignore_count);
                } else {
                    i8 = 0;
                }
                int i17 = i16 + i8;
                if (audio.howling_first_ignore_notice_time != null) {
                    i9 = ProtoAdapter.STRING.encodedSizeWithTag(9, audio.howling_first_ignore_notice_time);
                } else {
                    i9 = 0;
                }
                int i18 = i17 + i9;
                if (audio.uss_permission != null) {
                    i10 = ProtoAdapter.BOOL.encodedSizeWithTag(10, audio.uss_permission);
                }
                return i18 + i10 + audio.unknownFields().size();
            }

            /* renamed from: a */
            public Audio decode(ProtoReader protoReader) throws IOException {
                C51288a aVar = new C51288a();
                aVar.f127746a = "";
                aVar.f127747b = "";
                aVar.f127748c = true;
                aVar.f127749d = true;
                aVar.f127750e = false;
                aVar.f127751f = true;
                aVar.f127752g = "";
                aVar.f127753h = 0;
                aVar.f127754i = "";
                aVar.f127755j = true;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f127746a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                aVar.f127747b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f127748c = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                aVar.f127749d = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                aVar.f127750e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f127751f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f127752g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f127753h = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 9:
                                aVar.f127754i = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 10:
                                aVar.f127755j = ProtoAdapter.BOOL.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, Audio audio) throws IOException {
                if (audio.record_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, audio.record_device_id);
                }
                if (audio.playback_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, audio.playback_device_id);
                }
                if (audio.keyboard_sound_cancellation != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, audio.keyboard_sound_cancellation);
                }
                if (audio.background_noise_reduction != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, audio.background_noise_reduction);
                }
                if (audio.default_microphone_muted != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, audio.default_microphone_muted);
                }
                if (audio.auto_adjust_microphone_volume != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, audio.auto_adjust_microphone_volume);
                }
                if (audio.howling_first_ignore_time != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, audio.howling_first_ignore_time);
                }
                if (audio.howling_ignore_count != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 8, audio.howling_ignore_count);
                }
                if (audio.howling_first_ignore_notice_time != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, audio.howling_first_ignore_notice_time);
                }
                if (audio.uss_permission != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, audio.uss_permission);
                }
                protoWriter.writeBytes(audio.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$Audio$a */
        public static final class C51288a extends Message.Builder<Audio, C51288a> {

            /* renamed from: a */
            public String f127746a;

            /* renamed from: b */
            public String f127747b;

            /* renamed from: c */
            public Boolean f127748c;

            /* renamed from: d */
            public Boolean f127749d;

            /* renamed from: e */
            public Boolean f127750e;

            /* renamed from: f */
            public Boolean f127751f;

            /* renamed from: g */
            public String f127752g;

            /* renamed from: h */
            public Integer f127753h;

            /* renamed from: i */
            public String f127754i;

            /* renamed from: j */
            public Boolean f127755j;

            /* renamed from: a */
            public Audio build() {
                return new Audio(this.f127746a, this.f127747b, this.f127748c, this.f127749d, this.f127750e, this.f127751f, this.f127752g, this.f127753h, this.f127754i, this.f127755j, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51288a newBuilder() {
            C51288a aVar = new C51288a();
            aVar.f127746a = this.record_device_id;
            aVar.f127747b = this.playback_device_id;
            aVar.f127748c = this.keyboard_sound_cancellation;
            aVar.f127749d = this.background_noise_reduction;
            aVar.f127750e = this.default_microphone_muted;
            aVar.f127751f = this.auto_adjust_microphone_volume;
            aVar.f127752g = this.howling_first_ignore_time;
            aVar.f127753h = this.howling_ignore_count;
            aVar.f127754i = this.howling_first_ignore_notice_time;
            aVar.f127755j = this.uss_permission;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Audio");
            StringBuilder sb = new StringBuilder();
            if (this.record_device_id != null) {
                sb.append(", record_device_id=");
                sb.append(this.record_device_id);
            }
            if (this.playback_device_id != null) {
                sb.append(", playback_device_id=");
                sb.append(this.playback_device_id);
            }
            if (this.keyboard_sound_cancellation != null) {
                sb.append(", keyboard_sound_cancellation=");
                sb.append(this.keyboard_sound_cancellation);
            }
            if (this.background_noise_reduction != null) {
                sb.append(", background_noise_reduction=");
                sb.append(this.background_noise_reduction);
            }
            if (this.default_microphone_muted != null) {
                sb.append(", default_microphone_muted=");
                sb.append(this.default_microphone_muted);
            }
            if (this.auto_adjust_microphone_volume != null) {
                sb.append(", auto_adjust_microphone_volume=");
                sb.append(this.auto_adjust_microphone_volume);
            }
            if (this.howling_first_ignore_time != null) {
                sb.append(", howling_first_ignore_time=");
                sb.append(this.howling_first_ignore_time);
            }
            if (this.howling_ignore_count != null) {
                sb.append(", howling_ignore_count=");
                sb.append(this.howling_ignore_count);
            }
            if (this.howling_first_ignore_notice_time != null) {
                sb.append(", howling_first_ignore_notice_time=");
                sb.append(this.howling_first_ignore_notice_time);
            }
            if (this.uss_permission != null) {
                sb.append(", uss_permission=");
                sb.append(this.uss_permission);
            }
            StringBuilder replace = sb.replace(0, 2, "Audio{");
            replace.append('}');
            return replace.toString();
        }

        public Audio(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str3, Integer num, String str4, Boolean bool5) {
            this(str, str2, bool, bool2, bool3, bool4, str3, num, str4, bool5, ByteString.EMPTY);
        }

        public Audio(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str3, Integer num, String str4, Boolean bool5, ByteString byteString) {
            super(ADAPTER, byteString);
            this.record_device_id = str;
            this.playback_device_id = str2;
            this.keyboard_sound_cancellation = bool;
            this.background_noise_reduction = bool2;
            this.default_microphone_muted = bool3;
            this.auto_adjust_microphone_volume = bool4;
            this.howling_first_ignore_time = str3;
            this.howling_ignore_count = num;
            this.howling_first_ignore_notice_time = str4;
            this.uss_permission = bool5;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$b */
    private static final class C51297b extends ProtoAdapter<ViewDeviceSetting> {
        C51297b() {
            super(FieldEncoding.LENGTH_DELIMITED, ViewDeviceSetting.class);
        }

        /* renamed from: a */
        public int encodedSize(ViewDeviceSetting viewDeviceSetting) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (viewDeviceSetting.audio != null) {
                i = Audio.ADAPTER.encodedSizeWithTag(1, viewDeviceSetting.audio);
            } else {
                i = 0;
            }
            if (viewDeviceSetting.video != null) {
                i2 = Video.ADAPTER.encodedSizeWithTag(2, viewDeviceSetting.video);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (viewDeviceSetting.live_audio != null) {
                i3 = Audio.ADAPTER.encodedSizeWithTag(3, viewDeviceSetting.live_audio);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (viewDeviceSetting.live_video != null) {
                i4 = Video.ADAPTER.encodedSizeWithTag(4, viewDeviceSetting.live_video);
            }
            return i6 + i4 + viewDeviceSetting.unknownFields().size();
        }

        /* renamed from: a */
        public ViewDeviceSetting decode(ProtoReader protoReader) throws IOException {
            C51296a aVar = new C51296a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127778a = Audio.ADAPTER.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f127779b = Video.ADAPTER.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f127780c = Audio.ADAPTER.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127781d = Video.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ViewDeviceSetting viewDeviceSetting) throws IOException {
            if (viewDeviceSetting.audio != null) {
                Audio.ADAPTER.encodeWithTag(protoWriter, 1, viewDeviceSetting.audio);
            }
            if (viewDeviceSetting.video != null) {
                Video.ADAPTER.encodeWithTag(protoWriter, 2, viewDeviceSetting.video);
            }
            if (viewDeviceSetting.live_audio != null) {
                Audio.ADAPTER.encodeWithTag(protoWriter, 3, viewDeviceSetting.live_audio);
            }
            if (viewDeviceSetting.live_video != null) {
                Video.ADAPTER.encodeWithTag(protoWriter, 4, viewDeviceSetting.live_video);
            }
            protoWriter.writeBytes(viewDeviceSetting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ViewDeviceSetting$a */
    public static final class C51296a extends Message.Builder<ViewDeviceSetting, C51296a> {

        /* renamed from: a */
        public Audio f127778a;

        /* renamed from: b */
        public Video f127779b;

        /* renamed from: c */
        public Audio f127780c;

        /* renamed from: d */
        public Video f127781d;

        /* renamed from: a */
        public ViewDeviceSetting build() {
            return new ViewDeviceSetting(this.f127778a, this.f127779b, this.f127780c, this.f127781d, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51296a mo176839a(Audio audio) {
            this.f127778a = audio;
            return this;
        }

        /* renamed from: a */
        public C51296a mo176840a(Video video) {
            this.f127779b = video;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51296a newBuilder() {
        C51296a aVar = new C51296a();
        aVar.f127778a = this.audio;
        aVar.f127779b = this.video;
        aVar.f127780c = this.live_audio;
        aVar.f127781d = this.live_video;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ViewDeviceSetting");
        StringBuilder sb = new StringBuilder();
        if (this.audio != null) {
            sb.append(", audio=");
            sb.append(this.audio);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (this.live_audio != null) {
            sb.append(", live_audio=");
            sb.append(this.live_audio);
        }
        if (this.live_video != null) {
            sb.append(", live_video=");
            sb.append(this.live_video);
        }
        StringBuilder replace = sb.replace(0, 2, "ViewDeviceSetting{");
        replace.append('}');
        return replace.toString();
    }

    public ViewDeviceSetting(Audio audio2, Video video2, Audio audio3, Video video3) {
        this(audio2, video2, audio3, video3, ByteString.EMPTY);
    }

    public ViewDeviceSetting(Audio audio2, Video video2, Audio audio3, Video video3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.audio = audio2;
        this.video = video2;
        this.live_audio = audio3;
        this.live_video = video3;
    }
}
