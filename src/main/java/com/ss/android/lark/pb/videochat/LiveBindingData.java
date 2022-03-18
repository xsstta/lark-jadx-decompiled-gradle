package com.ss.android.lark.pb.videochat;

import com.huawei.hms.android.HwBuildEx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class LiveBindingData extends Message<LiveBindingData, C50374a> {
    public static final ProtoAdapter<LiveBindingData> ADAPTER = new C50375b();
    private static final long serialVersionUID = 0;
    public final BindingInfo mbindings;

    public enum BINDING_TYPE implements WireEnum {
        UNKNOWN(0),
        DOUYIN(1),
        XIGUA(2),
        FACEBOOK(3),
        YOUTUBE(4),
        TIKTOK(5),
        TIKTOK_WEB(6),
        TIKTOK_APP(7),
        NEO_DOUYIN_WEB(8),
        NEO_DOUYIN_APP(9),
        THD_PARTY(10),
        THD_PARTY_FACEBOOK(11),
        THD_PARTY_YOUTUBE(12);
        
        public static final ProtoAdapter<BINDING_TYPE> ADAPTER = ProtoAdapter.newEnumAdapter(BINDING_TYPE.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static BINDING_TYPE fromValue(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN;
                case 1:
                    return DOUYIN;
                case 2:
                    return XIGUA;
                case 3:
                    return FACEBOOK;
                case 4:
                    return YOUTUBE;
                case 5:
                    return TIKTOK;
                case 6:
                    return TIKTOK_WEB;
                case 7:
                    return TIKTOK_APP;
                case 8:
                    return NEO_DOUYIN_WEB;
                case 9:
                    return NEO_DOUYIN_APP;
                case 10:
                    return THD_PARTY;
                case 11:
                    return THD_PARTY_FACEBOOK;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return THD_PARTY_YOUTUBE;
                default:
                    return null;
            }
        }

        private BINDING_TYPE(int i) {
            this.value = i;
        }
    }

    public static final class LiveAccountData extends Message<LiveAccountData, C50370a> {
        public static final ProtoAdapter<LiveAccountData> ADAPTER = new C50371b();
        public static final Boolean DEFAULT_IS_LIVING = false;
        private static final long serialVersionUID = 0;
        public final String maccount_id;
        public final String mbinding_id;
        public final BINDING_TYPE mbinding_type;
        public final Boolean mis_living;
        public final String mliving_device_id;
        public final String mliving_meeting_id;
        public final String mnick_name;
        public final String mopen_id;

        /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$LiveAccountData$b */
        private static final class C50371b extends ProtoAdapter<LiveAccountData> {
            C50371b() {
                super(FieldEncoding.LENGTH_DELIMITED, LiveAccountData.class);
            }

            /* renamed from: a */
            public int encodedSize(LiveAccountData liveAccountData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int encodedSizeWithTag = BINDING_TYPE.ADAPTER.encodedSizeWithTag(1, liveAccountData.mbinding_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, liveAccountData.mbinding_id);
                int i6 = 0;
                if (liveAccountData.maccount_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, liveAccountData.maccount_id);
                } else {
                    i = 0;
                }
                int i7 = encodedSizeWithTag + i;
                if (liveAccountData.mnick_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, liveAccountData.mnick_name);
                } else {
                    i2 = 0;
                }
                int i8 = i7 + i2;
                if (liveAccountData.mis_living != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, liveAccountData.mis_living);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (liveAccountData.mliving_meeting_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, liveAccountData.mliving_meeting_id);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (liveAccountData.mliving_device_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, liveAccountData.mliving_device_id);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (liveAccountData.mopen_id != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, liveAccountData.mopen_id);
                }
                return i11 + i6 + liveAccountData.unknownFields().size();
            }

            /* renamed from: a */
            public LiveAccountData decode(ProtoReader protoReader) throws IOException {
                C50370a aVar = new C50370a();
                aVar.f125765b = "";
                aVar.f125766c = "";
                aVar.f125767d = "";
                aVar.f125768e = false;
                aVar.f125769f = "";
                aVar.f125770g = "";
                aVar.f125771h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f125764a = BINDING_TYPE.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f125765b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f125766c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f125767d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f125768e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f125769f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f125770g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f125771h = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, LiveAccountData liveAccountData) throws IOException {
                BINDING_TYPE.ADAPTER.encodeWithTag(protoWriter, 1, liveAccountData.mbinding_type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, liveAccountData.mbinding_id);
                if (liveAccountData.maccount_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, liveAccountData.maccount_id);
                }
                if (liveAccountData.mnick_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, liveAccountData.mnick_name);
                }
                if (liveAccountData.mis_living != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, liveAccountData.mis_living);
                }
                if (liveAccountData.mliving_meeting_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, liveAccountData.mliving_meeting_id);
                }
                if (liveAccountData.mliving_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, liveAccountData.mliving_device_id);
                }
                if (liveAccountData.mopen_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, liveAccountData.mopen_id);
                }
                protoWriter.writeBytes(liveAccountData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$LiveAccountData$a */
        public static final class C50370a extends Message.Builder<LiveAccountData, C50370a> {

            /* renamed from: a */
            public BINDING_TYPE f125764a;

            /* renamed from: b */
            public String f125765b;

            /* renamed from: c */
            public String f125766c;

            /* renamed from: d */
            public String f125767d;

            /* renamed from: e */
            public Boolean f125768e;

            /* renamed from: f */
            public String f125769f;

            /* renamed from: g */
            public String f125770g;

            /* renamed from: h */
            public String f125771h;

            /* renamed from: a */
            public LiveAccountData build() {
                String str;
                BINDING_TYPE binding_type = this.f125764a;
                if (binding_type != null && (str = this.f125765b) != null) {
                    return new LiveAccountData(binding_type, str, this.f125766c, this.f125767d, this.f125768e, this.f125769f, this.f125770g, this.f125771h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(binding_type, "mbinding_type", this.f125765b, "mbinding_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C50370a newBuilder() {
            C50370a aVar = new C50370a();
            aVar.f125764a = this.mbinding_type;
            aVar.f125765b = this.mbinding_id;
            aVar.f125766c = this.maccount_id;
            aVar.f125767d = this.mnick_name;
            aVar.f125768e = this.mis_living;
            aVar.f125769f = this.mliving_meeting_id;
            aVar.f125770g = this.mliving_device_id;
            aVar.f125771h = this.mopen_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", binding_type=");
            sb.append(this.mbinding_type);
            sb.append(", binding_id=");
            sb.append(this.mbinding_id);
            if (this.maccount_id != null) {
                sb.append(", account_id=");
                sb.append(this.maccount_id);
            }
            if (this.mnick_name != null) {
                sb.append(", nick_name=");
                sb.append(this.mnick_name);
            }
            if (this.mis_living != null) {
                sb.append(", is_living=");
                sb.append(this.mis_living);
            }
            if (this.mliving_meeting_id != null) {
                sb.append(", living_meeting_id=");
                sb.append(this.mliving_meeting_id);
            }
            if (this.mliving_device_id != null) {
                sb.append(", living_device_id=");
                sb.append(this.mliving_device_id);
            }
            if (this.mopen_id != null) {
                sb.append(", open_id=");
                sb.append(this.mopen_id);
            }
            StringBuilder replace = sb.replace(0, 2, "LiveAccountData{");
            replace.append('}');
            return replace.toString();
        }

        public LiveAccountData(BINDING_TYPE binding_type, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6) {
            this(binding_type, str, str2, str3, bool, str4, str5, str6, ByteString.EMPTY);
        }

        public LiveAccountData(BINDING_TYPE binding_type, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mbinding_type = binding_type;
            this.mbinding_id = str;
            this.maccount_id = str2;
            this.mnick_name = str3;
            this.mis_living = bool;
            this.mliving_meeting_id = str4;
            this.mliving_device_id = str5;
            this.mopen_id = str6;
        }
    }

    public static final class LiveStreamData extends Message<LiveStreamData, C50372a> {
        public static final ProtoAdapter<LiveStreamData> ADAPTER = new C50373b();
        public static final Boolean DEFAULT_IS_LIVING = false;
        private static final long serialVersionUID = 0;
        public final String mbinding_id;
        public final String mbinding_name;
        public final BINDING_TYPE mbinding_type;
        public final Boolean mis_living;
        public final String mliving_device_id;
        public final String mliving_meeting_id;
        public final String mtoken;
        public final String murl;

        /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$LiveStreamData$b */
        private static final class C50373b extends ProtoAdapter<LiveStreamData> {
            C50373b() {
                super(FieldEncoding.LENGTH_DELIMITED, LiveStreamData.class);
            }

            /* renamed from: a */
            public int encodedSize(LiveStreamData liveStreamData) {
                int i;
                int i2;
                int i3;
                int i4;
                int encodedSizeWithTag = BINDING_TYPE.ADAPTER.encodedSizeWithTag(1, liveStreamData.mbinding_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, liveStreamData.mbinding_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, liveStreamData.mbinding_name);
                int i5 = 0;
                if (liveStreamData.murl != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(4, liveStreamData.murl);
                } else {
                    i = 0;
                }
                int i6 = encodedSizeWithTag + i;
                if (liveStreamData.mtoken != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, liveStreamData.mtoken);
                } else {
                    i2 = 0;
                }
                int i7 = i6 + i2;
                if (liveStreamData.mis_living != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, liveStreamData.mis_living);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (liveStreamData.mliving_meeting_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, liveStreamData.mliving_meeting_id);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (liveStreamData.mliving_device_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, liveStreamData.mliving_device_id);
                }
                return i9 + i5 + liveStreamData.unknownFields().size();
            }

            /* renamed from: a */
            public LiveStreamData decode(ProtoReader protoReader) throws IOException {
                C50372a aVar = new C50372a();
                aVar.f125773b = "";
                aVar.f125774c = "";
                aVar.f125775d = "";
                aVar.f125776e = "";
                aVar.f125777f = false;
                aVar.f125778g = "";
                aVar.f125779h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f125772a = BINDING_TYPE.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f125773b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f125774c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f125775d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f125776e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f125777f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f125778g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f125779h = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, LiveStreamData liveStreamData) throws IOException {
                BINDING_TYPE.ADAPTER.encodeWithTag(protoWriter, 1, liveStreamData.mbinding_type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, liveStreamData.mbinding_id);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, liveStreamData.mbinding_name);
                if (liveStreamData.murl != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, liveStreamData.murl);
                }
                if (liveStreamData.mtoken != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, liveStreamData.mtoken);
                }
                if (liveStreamData.mis_living != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, liveStreamData.mis_living);
                }
                if (liveStreamData.mliving_meeting_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, liveStreamData.mliving_meeting_id);
                }
                if (liveStreamData.mliving_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, liveStreamData.mliving_device_id);
                }
                protoWriter.writeBytes(liveStreamData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50372a newBuilder() {
            C50372a aVar = new C50372a();
            aVar.f125772a = this.mbinding_type;
            aVar.f125773b = this.mbinding_id;
            aVar.f125774c = this.mbinding_name;
            aVar.f125775d = this.murl;
            aVar.f125776e = this.mtoken;
            aVar.f125777f = this.mis_living;
            aVar.f125778g = this.mliving_meeting_id;
            aVar.f125779h = this.mliving_device_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$LiveStreamData$a */
        public static final class C50372a extends Message.Builder<LiveStreamData, C50372a> {

            /* renamed from: a */
            public BINDING_TYPE f125772a;

            /* renamed from: b */
            public String f125773b;

            /* renamed from: c */
            public String f125774c;

            /* renamed from: d */
            public String f125775d;

            /* renamed from: e */
            public String f125776e;

            /* renamed from: f */
            public Boolean f125777f;

            /* renamed from: g */
            public String f125778g;

            /* renamed from: h */
            public String f125779h;

            /* renamed from: a */
            public LiveStreamData build() {
                String str;
                String str2;
                BINDING_TYPE binding_type = this.f125772a;
                if (binding_type != null && (str = this.f125773b) != null && (str2 = this.f125774c) != null) {
                    return new LiveStreamData(binding_type, str, str2, this.f125775d, this.f125776e, this.f125777f, this.f125778g, this.f125779h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(binding_type, "mbinding_type", this.f125773b, "mbinding_id", this.f125774c, "mbinding_name");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", binding_type=");
            sb.append(this.mbinding_type);
            sb.append(", binding_id=");
            sb.append(this.mbinding_id);
            sb.append(", binding_name=");
            sb.append(this.mbinding_name);
            if (this.murl != null) {
                sb.append(", url=");
                sb.append(this.murl);
            }
            if (this.mtoken != null) {
                sb.append(", token=");
                sb.append(this.mtoken);
            }
            if (this.mis_living != null) {
                sb.append(", is_living=");
                sb.append(this.mis_living);
            }
            if (this.mliving_meeting_id != null) {
                sb.append(", living_meeting_id=");
                sb.append(this.mliving_meeting_id);
            }
            if (this.mliving_device_id != null) {
                sb.append(", living_device_id=");
                sb.append(this.mliving_device_id);
            }
            StringBuilder replace = sb.replace(0, 2, "LiveStreamData{");
            replace.append('}');
            return replace.toString();
        }

        public LiveStreamData(BINDING_TYPE binding_type, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
            this(binding_type, str, str2, str3, str4, bool, str5, str6, ByteString.EMPTY);
        }

        public LiveStreamData(BINDING_TYPE binding_type, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mbinding_type = binding_type;
            this.mbinding_id = str;
            this.mbinding_name = str2;
            this.murl = str3;
            this.mtoken = str4;
            this.mis_living = bool;
            this.mliving_meeting_id = str5;
            this.mliving_device_id = str6;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$b */
    private static final class C50375b extends ProtoAdapter<LiveBindingData> {
        C50375b() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveBindingData.class);
        }

        /* renamed from: a */
        public int encodedSize(LiveBindingData liveBindingData) {
            return BindingInfo.ADAPTER.encodedSizeWithTag(1, liveBindingData.mbindings) + liveBindingData.unknownFields().size();
        }

        /* renamed from: a */
        public LiveBindingData decode(ProtoReader protoReader) throws IOException {
            C50374a aVar = new C50374a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125780a = BindingInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LiveBindingData liveBindingData) throws IOException {
            BindingInfo.ADAPTER.encodeWithTag(protoWriter, 1, liveBindingData.mbindings);
            protoWriter.writeBytes(liveBindingData.unknownFields());
        }
    }

    public static final class BindingInfo extends Message<BindingInfo, C50368a> {
        public static final ProtoAdapter<BindingInfo> ADAPTER = new C50369b();
        private static final long serialVersionUID = 0;
        public final Map<String, LiveAccountData> maccount_bindings;
        public final Map<String, LiveStreamData> mstream_bindings;

        /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$BindingInfo$a */
        public static final class C50368a extends Message.Builder<BindingInfo, C50368a> {

            /* renamed from: a */
            public Map<String, LiveAccountData> f125760a = Internal.newMutableMap();

            /* renamed from: b */
            public Map<String, LiveStreamData> f125761b = Internal.newMutableMap();

            /* renamed from: a */
            public BindingInfo build() {
                return new BindingInfo(this.f125760a, this.f125761b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$BindingInfo$b */
        private static final class C50369b extends ProtoAdapter<BindingInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, LiveAccountData>> f125762a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LiveAccountData.ADAPTER);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, LiveStreamData>> f125763b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LiveStreamData.ADAPTER);

            C50369b() {
                super(FieldEncoding.LENGTH_DELIMITED, BindingInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(BindingInfo bindingInfo) {
                return this.f125762a.encodedSizeWithTag(1, bindingInfo.maccount_bindings) + this.f125763b.encodedSizeWithTag(2, bindingInfo.mstream_bindings) + bindingInfo.unknownFields().size();
            }

            /* renamed from: a */
            public BindingInfo decode(ProtoReader protoReader) throws IOException {
                C50368a aVar = new C50368a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125760a.putAll(this.f125762a.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125761b.putAll(this.f125763b.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BindingInfo bindingInfo) throws IOException {
                this.f125762a.encodeWithTag(protoWriter, 1, bindingInfo.maccount_bindings);
                this.f125763b.encodeWithTag(protoWriter, 2, bindingInfo.mstream_bindings);
                protoWriter.writeBytes(bindingInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50368a newBuilder() {
            C50368a aVar = new C50368a();
            aVar.f125760a = Internal.copyOf("maccount_bindings", this.maccount_bindings);
            aVar.f125761b = Internal.copyOf("mstream_bindings", this.mstream_bindings);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!this.maccount_bindings.isEmpty()) {
                sb.append(", account_bindings=");
                sb.append(this.maccount_bindings);
            }
            if (!this.mstream_bindings.isEmpty()) {
                sb.append(", stream_bindings=");
                sb.append(this.mstream_bindings);
            }
            StringBuilder replace = sb.replace(0, 2, "BindingInfo{");
            replace.append('}');
            return replace.toString();
        }

        public BindingInfo(Map<String, LiveAccountData> map, Map<String, LiveStreamData> map2) {
            this(map, map2, ByteString.EMPTY);
        }

        public BindingInfo(Map<String, LiveAccountData> map, Map<String, LiveStreamData> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.maccount_bindings = Internal.immutableCopyOf("maccount_bindings", map);
            this.mstream_bindings = Internal.immutableCopyOf("mstream_bindings", map2);
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.LiveBindingData$a */
    public static final class C50374a extends Message.Builder<LiveBindingData, C50374a> {

        /* renamed from: a */
        public BindingInfo f125780a;

        /* renamed from: a */
        public LiveBindingData build() {
            BindingInfo bindingInfo = this.f125780a;
            if (bindingInfo != null) {
                return new LiveBindingData(bindingInfo, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bindingInfo, "mbindings");
        }
    }

    @Override // com.squareup.wire.Message
    public C50374a newBuilder() {
        C50374a aVar = new C50374a();
        aVar.f125780a = this.mbindings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", bindings=");
        sb.append(this.mbindings);
        StringBuilder replace = sb.replace(0, 2, "LiveBindingData{");
        replace.append('}');
        return replace.toString();
    }

    public LiveBindingData(BindingInfo bindingInfo) {
        this(bindingInfo, ByteString.EMPTY);
    }

    public LiveBindingData(BindingInfo bindingInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mbindings = bindingInfo;
    }
}
