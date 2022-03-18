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
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

public final class LiveBindingData extends Message<LiveBindingData, C50849a> {
    public static final ProtoAdapter<LiveBindingData> ADAPTER = new C50850b();
    private static final long serialVersionUID = 0;
    public final BindingInfo bindings;

    public enum BINDING_TYPE implements WireEnum {
        UNKNOWN(0, null),
        DOUYIN(1, null),
        XIGUA(2, null),
        FACEBOOK(3, null),
        YOUTUBE(4, null),
        TICTOK(5, true),
        TIKTOK_WEB(6, null),
        TIKTOK_APP(7, null),
        NEO_DOUYIN_WEB(8, null),
        NEO_DOUYIN_APP(9, null),
        THD_PARTY(10, null),
        THD_PARTY_FACEBOOK(11, null),
        THD_PARTY_YOUTUBE(12, null);
        
        public static final ProtoAdapter<BINDING_TYPE> ADAPTER = ProtoAdapter.newEnumAdapter(BINDING_TYPE.class);
        public final Boolean deprecated;
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
                    return TICTOK;
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

        private BINDING_TYPE(int i, Boolean bool) {
            this.value = i;
            this.deprecated = bool;
        }
    }

    public static final class LiveAccountData extends Message<LiveAccountData, C50845a> {
        public static final ProtoAdapter<LiveAccountData> ADAPTER = new C50846b();
        public static final BINDING_TYPE DEFAULT_BINDING_TYPE = BINDING_TYPE.UNKNOWN;
        public static final Boolean DEFAULT_IS_LIVING = false;
        private static final long serialVersionUID = 0;
        public final String account_id;
        public final String binding_id;
        public final BINDING_TYPE binding_type;
        public final Boolean is_living;
        public final String living_device_id;
        public final String living_meeting_id;
        public final String nick_name;
        public final String open_id;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$LiveAccountData$b */
        private static final class C50846b extends ProtoAdapter<LiveAccountData> {
            C50846b() {
                super(FieldEncoding.LENGTH_DELIMITED, LiveAccountData.class);
            }

            /* renamed from: a */
            public int encodedSize(LiveAccountData liveAccountData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int encodedSizeWithTag = BINDING_TYPE.ADAPTER.encodedSizeWithTag(1, liveAccountData.binding_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, liveAccountData.binding_id);
                int i6 = 0;
                if (liveAccountData.account_id != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(3, liveAccountData.account_id);
                } else {
                    i = 0;
                }
                int i7 = encodedSizeWithTag + i;
                if (liveAccountData.nick_name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, liveAccountData.nick_name);
                } else {
                    i2 = 0;
                }
                int i8 = i7 + i2;
                if (liveAccountData.is_living != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(5, liveAccountData.is_living);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (liveAccountData.living_meeting_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, liveAccountData.living_meeting_id);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (liveAccountData.living_device_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, liveAccountData.living_device_id);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (liveAccountData.open_id != null) {
                    i6 = ProtoAdapter.STRING.encodedSizeWithTag(8, liveAccountData.open_id);
                }
                return i11 + i6 + liveAccountData.unknownFields().size();
            }

            /* renamed from: a */
            public LiveAccountData decode(ProtoReader protoReader) throws IOException {
                C50845a aVar = new C50845a();
                aVar.f126739a = BINDING_TYPE.UNKNOWN;
                aVar.f126740b = "";
                aVar.f126741c = "";
                aVar.f126742d = "";
                aVar.f126743e = false;
                aVar.f126744f = "";
                aVar.f126745g = "";
                aVar.f126746h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f126739a = BINDING_TYPE.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f126740b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126741c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126742d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126743e = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126744f = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126745g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f126746h = ProtoAdapter.STRING.decode(protoReader);
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
                BINDING_TYPE.ADAPTER.encodeWithTag(protoWriter, 1, liveAccountData.binding_type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, liveAccountData.binding_id);
                if (liveAccountData.account_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, liveAccountData.account_id);
                }
                if (liveAccountData.nick_name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, liveAccountData.nick_name);
                }
                if (liveAccountData.is_living != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, liveAccountData.is_living);
                }
                if (liveAccountData.living_meeting_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, liveAccountData.living_meeting_id);
                }
                if (liveAccountData.living_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, liveAccountData.living_device_id);
                }
                if (liveAccountData.open_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, liveAccountData.open_id);
                }
                protoWriter.writeBytes(liveAccountData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$LiveAccountData$a */
        public static final class C50845a extends Message.Builder<LiveAccountData, C50845a> {

            /* renamed from: a */
            public BINDING_TYPE f126739a;

            /* renamed from: b */
            public String f126740b;

            /* renamed from: c */
            public String f126741c;

            /* renamed from: d */
            public String f126742d;

            /* renamed from: e */
            public Boolean f126743e;

            /* renamed from: f */
            public String f126744f;

            /* renamed from: g */
            public String f126745g;

            /* renamed from: h */
            public String f126746h;

            /* renamed from: a */
            public LiveAccountData build() {
                String str;
                BINDING_TYPE binding_type = this.f126739a;
                if (binding_type != null && (str = this.f126740b) != null) {
                    return new LiveAccountData(binding_type, str, this.f126741c, this.f126742d, this.f126743e, this.f126744f, this.f126745g, this.f126746h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(binding_type, "binding_type", this.f126740b, "binding_id");
            }
        }

        @Override // com.squareup.wire.Message
        public C50845a newBuilder() {
            C50845a aVar = new C50845a();
            aVar.f126739a = this.binding_type;
            aVar.f126740b = this.binding_id;
            aVar.f126741c = this.account_id;
            aVar.f126742d = this.nick_name;
            aVar.f126743e = this.is_living;
            aVar.f126744f = this.living_meeting_id;
            aVar.f126745g = this.living_device_id;
            aVar.f126746h = this.open_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "LiveAccountData");
            StringBuilder sb = new StringBuilder();
            sb.append(", binding_type=");
            sb.append(this.binding_type);
            sb.append(", binding_id=");
            sb.append(this.binding_id);
            if (this.account_id != null) {
                sb.append(", account_id=");
                sb.append(this.account_id);
            }
            if (this.nick_name != null) {
                sb.append(", nick_name=");
                sb.append(this.nick_name);
            }
            if (this.is_living != null) {
                sb.append(", is_living=");
                sb.append(this.is_living);
            }
            if (this.living_meeting_id != null) {
                sb.append(", living_meeting_id=");
                sb.append(this.living_meeting_id);
            }
            if (this.living_device_id != null) {
                sb.append(", living_device_id=");
                sb.append(this.living_device_id);
            }
            if (this.open_id != null) {
                sb.append(", open_id=");
                sb.append(this.open_id);
            }
            StringBuilder replace = sb.replace(0, 2, "LiveAccountData{");
            replace.append('}');
            return replace.toString();
        }

        public LiveAccountData(BINDING_TYPE binding_type2, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6) {
            this(binding_type2, str, str2, str3, bool, str4, str5, str6, ByteString.EMPTY);
        }

        public LiveAccountData(BINDING_TYPE binding_type2, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.binding_type = binding_type2;
            this.binding_id = str;
            this.account_id = str2;
            this.nick_name = str3;
            this.is_living = bool;
            this.living_meeting_id = str4;
            this.living_device_id = str5;
            this.open_id = str6;
        }
    }

    public static final class LiveStreamData extends Message<LiveStreamData, C50847a> {
        public static final ProtoAdapter<LiveStreamData> ADAPTER = new C50848b();
        public static final BINDING_TYPE DEFAULT_BINDING_TYPE = BINDING_TYPE.UNKNOWN;
        public static final Boolean DEFAULT_IS_LIVING = false;
        private static final long serialVersionUID = 0;
        public final String binding_id;
        public final String binding_name;
        public final BINDING_TYPE binding_type;
        public final Boolean is_living;
        public final String living_device_id;
        public final String living_meeting_id;
        public final String token;
        public final String url;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$LiveStreamData$b */
        private static final class C50848b extends ProtoAdapter<LiveStreamData> {
            C50848b() {
                super(FieldEncoding.LENGTH_DELIMITED, LiveStreamData.class);
            }

            /* renamed from: a */
            public int encodedSize(LiveStreamData liveStreamData) {
                int i;
                int i2;
                int i3;
                int i4;
                int encodedSizeWithTag = BINDING_TYPE.ADAPTER.encodedSizeWithTag(1, liveStreamData.binding_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, liveStreamData.binding_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, liveStreamData.binding_name);
                int i5 = 0;
                if (liveStreamData.url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(4, liveStreamData.url);
                } else {
                    i = 0;
                }
                int i6 = encodedSizeWithTag + i;
                if (liveStreamData.token != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(5, liveStreamData.token);
                } else {
                    i2 = 0;
                }
                int i7 = i6 + i2;
                if (liveStreamData.is_living != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(6, liveStreamData.is_living);
                } else {
                    i3 = 0;
                }
                int i8 = i7 + i3;
                if (liveStreamData.living_meeting_id != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(7, liveStreamData.living_meeting_id);
                } else {
                    i4 = 0;
                }
                int i9 = i8 + i4;
                if (liveStreamData.living_device_id != null) {
                    i5 = ProtoAdapter.STRING.encodedSizeWithTag(8, liveStreamData.living_device_id);
                }
                return i9 + i5 + liveStreamData.unknownFields().size();
            }

            /* renamed from: a */
            public LiveStreamData decode(ProtoReader protoReader) throws IOException {
                C50847a aVar = new C50847a();
                aVar.f126747a = BINDING_TYPE.UNKNOWN;
                aVar.f126748b = "";
                aVar.f126749c = "";
                aVar.f126750d = "";
                aVar.f126751e = "";
                aVar.f126752f = false;
                aVar.f126753g = "";
                aVar.f126754h = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                try {
                                    aVar.f126747a = BINDING_TYPE.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                    break;
                                }
                            case 2:
                                aVar.f126748b = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126749c = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126750d = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126751e = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126752f = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 7:
                                aVar.f126753g = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                aVar.f126754h = ProtoAdapter.STRING.decode(protoReader);
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
                BINDING_TYPE.ADAPTER.encodeWithTag(protoWriter, 1, liveStreamData.binding_type);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, liveStreamData.binding_id);
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, liveStreamData.binding_name);
                if (liveStreamData.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, liveStreamData.url);
                }
                if (liveStreamData.token != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, liveStreamData.token);
                }
                if (liveStreamData.is_living != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, liveStreamData.is_living);
                }
                if (liveStreamData.living_meeting_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, liveStreamData.living_meeting_id);
                }
                if (liveStreamData.living_device_id != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, liveStreamData.living_device_id);
                }
                protoWriter.writeBytes(liveStreamData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50847a newBuilder() {
            C50847a aVar = new C50847a();
            aVar.f126747a = this.binding_type;
            aVar.f126748b = this.binding_id;
            aVar.f126749c = this.binding_name;
            aVar.f126750d = this.url;
            aVar.f126751e = this.token;
            aVar.f126752f = this.is_living;
            aVar.f126753g = this.living_meeting_id;
            aVar.f126754h = this.living_device_id;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$LiveStreamData$a */
        public static final class C50847a extends Message.Builder<LiveStreamData, C50847a> {

            /* renamed from: a */
            public BINDING_TYPE f126747a;

            /* renamed from: b */
            public String f126748b;

            /* renamed from: c */
            public String f126749c;

            /* renamed from: d */
            public String f126750d;

            /* renamed from: e */
            public String f126751e;

            /* renamed from: f */
            public Boolean f126752f;

            /* renamed from: g */
            public String f126753g;

            /* renamed from: h */
            public String f126754h;

            /* renamed from: a */
            public LiveStreamData build() {
                String str;
                String str2;
                BINDING_TYPE binding_type = this.f126747a;
                if (binding_type != null && (str = this.f126748b) != null && (str2 = this.f126749c) != null) {
                    return new LiveStreamData(binding_type, str, str2, this.f126750d, this.f126751e, this.f126752f, this.f126753g, this.f126754h, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(binding_type, "binding_type", this.f126748b, "binding_id", this.f126749c, "binding_name");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "LiveStreamData");
            StringBuilder sb = new StringBuilder();
            sb.append(", binding_type=");
            sb.append(this.binding_type);
            sb.append(", binding_id=");
            sb.append(this.binding_id);
            sb.append(", binding_name=");
            sb.append(this.binding_name);
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.token != null) {
                sb.append(", token=");
                sb.append(this.token);
            }
            if (this.is_living != null) {
                sb.append(", is_living=");
                sb.append(this.is_living);
            }
            if (this.living_meeting_id != null) {
                sb.append(", living_meeting_id=");
                sb.append(this.living_meeting_id);
            }
            if (this.living_device_id != null) {
                sb.append(", living_device_id=");
                sb.append(this.living_device_id);
            }
            StringBuilder replace = sb.replace(0, 2, "LiveStreamData{");
            replace.append('}');
            return replace.toString();
        }

        public LiveStreamData(BINDING_TYPE binding_type2, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
            this(binding_type2, str, str2, str3, str4, bool, str5, str6, ByteString.EMPTY);
        }

        public LiveStreamData(BINDING_TYPE binding_type2, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.binding_type = binding_type2;
            this.binding_id = str;
            this.binding_name = str2;
            this.url = str3;
            this.token = str4;
            this.is_living = bool;
            this.living_meeting_id = str5;
            this.living_device_id = str6;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$b */
    private static final class C50850b extends ProtoAdapter<LiveBindingData> {
        C50850b() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveBindingData.class);
        }

        /* renamed from: a */
        public int encodedSize(LiveBindingData liveBindingData) {
            return BindingInfo.ADAPTER.encodedSizeWithTag(1, liveBindingData.bindings) + liveBindingData.unknownFields().size();
        }

        /* renamed from: a */
        public LiveBindingData decode(ProtoReader protoReader) throws IOException {
            C50849a aVar = new C50849a();
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
                    aVar.f126755a = BindingInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, LiveBindingData liveBindingData) throws IOException {
            BindingInfo.ADAPTER.encodeWithTag(protoWriter, 1, liveBindingData.bindings);
            protoWriter.writeBytes(liveBindingData.unknownFields());
        }
    }

    public static final class BindingInfo extends Message<BindingInfo, C50843a> {
        public static final ProtoAdapter<BindingInfo> ADAPTER = new C50844b();
        private static final long serialVersionUID = 0;
        public final Map<String, LiveAccountData> account_bindings;
        public final Map<String, LiveStreamData> stream_bindings;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$BindingInfo$a */
        public static final class C50843a extends Message.Builder<BindingInfo, C50843a> {

            /* renamed from: a */
            public Map<String, LiveAccountData> f126735a = Internal.newMutableMap();

            /* renamed from: b */
            public Map<String, LiveStreamData> f126736b = Internal.newMutableMap();

            /* renamed from: a */
            public BindingInfo build() {
                return new BindingInfo(this.f126735a, this.f126736b, super.buildUnknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$BindingInfo$b */
        private static final class C50844b extends ProtoAdapter<BindingInfo> {

            /* renamed from: a */
            private final ProtoAdapter<Map<String, LiveAccountData>> f126737a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LiveAccountData.ADAPTER);

            /* renamed from: b */
            private final ProtoAdapter<Map<String, LiveStreamData>> f126738b = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, LiveStreamData.ADAPTER);

            C50844b() {
                super(FieldEncoding.LENGTH_DELIMITED, BindingInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(BindingInfo bindingInfo) {
                return this.f126737a.encodedSizeWithTag(1, bindingInfo.account_bindings) + this.f126738b.encodedSizeWithTag(2, bindingInfo.stream_bindings) + bindingInfo.unknownFields().size();
            }

            /* renamed from: a */
            public BindingInfo decode(ProtoReader protoReader) throws IOException {
                C50843a aVar = new C50843a();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126735a.putAll(this.f126737a.decode(protoReader));
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126736b.putAll(this.f126738b.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, BindingInfo bindingInfo) throws IOException {
                this.f126737a.encodeWithTag(protoWriter, 1, bindingInfo.account_bindings);
                this.f126738b.encodeWithTag(protoWriter, 2, bindingInfo.stream_bindings);
                protoWriter.writeBytes(bindingInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50843a newBuilder() {
            C50843a aVar = new C50843a();
            aVar.f126735a = Internal.copyOf("account_bindings", this.account_bindings);
            aVar.f126736b = Internal.copyOf("stream_bindings", this.stream_bindings);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "BindingInfo");
            StringBuilder sb = new StringBuilder();
            if (!this.account_bindings.isEmpty()) {
                sb.append(", account_bindings=");
                sb.append(this.account_bindings);
            }
            if (!this.stream_bindings.isEmpty()) {
                sb.append(", stream_bindings=");
                sb.append(this.stream_bindings);
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
            this.account_bindings = Internal.immutableCopyOf("account_bindings", map);
            this.stream_bindings = Internal.immutableCopyOf("stream_bindings", map2);
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.LiveBindingData$a */
    public static final class C50849a extends Message.Builder<LiveBindingData, C50849a> {

        /* renamed from: a */
        public BindingInfo f126755a;

        /* renamed from: a */
        public LiveBindingData build() {
            BindingInfo bindingInfo = this.f126755a;
            if (bindingInfo != null) {
                return new LiveBindingData(bindingInfo, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(bindingInfo, "bindings");
        }
    }

    @Override // com.squareup.wire.Message
    public C50849a newBuilder() {
        C50849a aVar = new C50849a();
        aVar.f126755a = this.bindings;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "LiveBindingData");
        StringBuilder sb = new StringBuilder();
        sb.append(", bindings=");
        sb.append(this.bindings);
        StringBuilder replace = sb.replace(0, 2, "LiveBindingData{");
        replace.append('}');
        return replace.toString();
    }

    public LiveBindingData(BindingInfo bindingInfo) {
        this(bindingInfo, ByteString.EMPTY);
    }

    public LiveBindingData(BindingInfo bindingInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bindings = bindingInfo;
    }
}
