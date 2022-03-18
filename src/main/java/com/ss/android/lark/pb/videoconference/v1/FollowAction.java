package com.ss.android.lark.pb.videoconference.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import okio.ByteString;

public final class FollowAction extends Message<FollowAction, C50565a> {
    public static final ProtoAdapter<FollowAction> ADAPTER = new C50566b();
    public static final Integer DEFAULT_SEQ_ID = 0;
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final String customized_data;
    public final NavigationData navigation_data;
    public final ResizeData resize_data;
    public final ScrollData scroll_data;
    public final Integer seq_id;
    public final String share_id;
    public final Type type;
    public final String url;

    public static final class NavigationData extends Message<NavigationData, C50559a> {
        public static final ProtoAdapter<NavigationData> ADAPTER = new C50560b();
        public static final NavigationChangeMode DEFAULT_MODE = NavigationChangeMode.UNKNOWN;
        private static final long serialVersionUID = 0;
        public final NavigationChangeMode mode;
        public final String url;

        public enum NavigationChangeMode implements WireEnum {
            UNKNOWN(0),
            LOAD(1),
            GO_FORWARD(2),
            GO_BACK(3),
            POP_STATE(4),
            HASH_CHANGED(5);
            
            public static final ProtoAdapter<NavigationChangeMode> ADAPTER = ProtoAdapter.newEnumAdapter(NavigationChangeMode.class);
            private final int value;

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            public static NavigationChangeMode fromValue(int i) {
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return LOAD;
                }
                if (i == 2) {
                    return GO_FORWARD;
                }
                if (i == 3) {
                    return GO_BACK;
                }
                if (i == 4) {
                    return POP_STATE;
                }
                if (i != 5) {
                    return null;
                }
                return HASH_CHANGED;
            }

            private NavigationChangeMode(int i) {
                this.value = i;
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$NavigationData$b */
        private static final class C50560b extends ProtoAdapter<NavigationData> {
            C50560b() {
                super(FieldEncoding.LENGTH_DELIMITED, NavigationData.class);
            }

            /* renamed from: a */
            public int encodedSize(NavigationData navigationData) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, navigationData.url);
                if (navigationData.mode != null) {
                    i = NavigationChangeMode.ADAPTER.encodedSizeWithTag(2, navigationData.mode);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + navigationData.unknownFields().size();
            }

            /* renamed from: a */
            public NavigationData decode(ProtoReader protoReader) throws IOException {
                C50559a aVar = new C50559a();
                aVar.f126205a = "";
                aVar.f126206b = NavigationChangeMode.UNKNOWN;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126205a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f126206b = NavigationChangeMode.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, NavigationData navigationData) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, navigationData.url);
                if (navigationData.mode != null) {
                    NavigationChangeMode.ADAPTER.encodeWithTag(protoWriter, 2, navigationData.mode);
                }
                protoWriter.writeBytes(navigationData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$NavigationData$a */
        public static final class C50559a extends Message.Builder<NavigationData, C50559a> {

            /* renamed from: a */
            public String f126205a;

            /* renamed from: b */
            public NavigationChangeMode f126206b;

            /* renamed from: a */
            public NavigationData build() {
                String str = this.f126205a;
                if (str != null) {
                    return new NavigationData(str, this.f126206b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "url");
            }
        }

        @Override // com.squareup.wire.Message
        public C50559a newBuilder() {
            C50559a aVar = new C50559a();
            aVar.f126205a = this.url;
            aVar.f126206b = this.mode;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "NavigationData");
            StringBuilder sb = new StringBuilder();
            sb.append(", url=");
            sb.append(this.url);
            if (this.mode != null) {
                sb.append(", mode=");
                sb.append(this.mode);
            }
            StringBuilder replace = sb.replace(0, 2, "NavigationData{");
            replace.append('}');
            return replace.toString();
        }

        public NavigationData(String str, NavigationChangeMode navigationChangeMode) {
            this(str, navigationChangeMode, ByteString.EMPTY);
        }

        public NavigationData(String str, NavigationChangeMode navigationChangeMode, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
            this.mode = navigationChangeMode;
        }
    }

    public enum Type implements WireEnum {
        UNKNOWN(0),
        SCROLL(1),
        RESIZE(2),
        NAVIGATION(3),
        CUSTOM(61);
        
        public static final ProtoAdapter<Type> ADAPTER = ProtoAdapter.newEnumAdapter(Type.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return SCROLL;
            }
            if (i == 2) {
                return RESIZE;
            }
            if (i == 3) {
                return NAVIGATION;
            }
            if (i != 61) {
                return null;
            }
            return CUSTOM;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public static final class ResizeData extends Message<ResizeData, C50561a> {
        public static final ProtoAdapter<ResizeData> ADAPTER = new C50562b();
        public static final Integer DEFAULT_CLIENT_HEIGHT = 0;
        public static final Integer DEFAULT_CLIENT_WIDTH = 0;
        public static final Integer DEFAULT_HEIGHT = 0;
        public static final Integer DEFAULT_SCROLL_HEIGHT = 0;
        public static final Integer DEFAULT_SCROLL_WIDTH = 0;
        public static final Integer DEFAULT_WIDTH = 0;
        private static final long serialVersionUID = 0;
        public final Integer client_height;
        public final Integer client_width;
        public final Integer height;
        public final Integer scroll_height;
        public final Integer scroll_width;
        public final Integer width;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$ResizeData$b */
        private static final class C50562b extends ProtoAdapter<ResizeData> {
            C50562b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResizeData.class);
            }

            /* renamed from: a */
            public int encodedSize(ResizeData resizeData) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, resizeData.width) + ProtoAdapter.INT32.encodedSizeWithTag(2, resizeData.height);
                int i4 = 0;
                if (resizeData.client_width != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(3, resizeData.client_width);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (resizeData.client_height != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, resizeData.client_height);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (resizeData.scroll_width != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, resizeData.scroll_width);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (resizeData.scroll_height != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, resizeData.scroll_height);
                }
                return i7 + i4 + resizeData.unknownFields().size();
            }

            /* renamed from: a */
            public ResizeData decode(ProtoReader protoReader) throws IOException {
                C50561a aVar = new C50561a();
                aVar.f126207a = 0;
                aVar.f126208b = 0;
                aVar.f126209c = 0;
                aVar.f126210d = 0;
                aVar.f126211e = 0;
                aVar.f126212f = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f126207a = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                aVar.f126208b = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                aVar.f126209c = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                aVar.f126210d = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                aVar.f126211e = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 6:
                                aVar.f126212f = ProtoAdapter.INT32.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, ResizeData resizeData) throws IOException {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, resizeData.width);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, resizeData.height);
                if (resizeData.client_width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, resizeData.client_width);
                }
                if (resizeData.client_height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, resizeData.client_height);
                }
                if (resizeData.scroll_width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, resizeData.scroll_width);
                }
                if (resizeData.scroll_height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, resizeData.scroll_height);
                }
                protoWriter.writeBytes(resizeData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$ResizeData$a */
        public static final class C50561a extends Message.Builder<ResizeData, C50561a> {

            /* renamed from: a */
            public Integer f126207a;

            /* renamed from: b */
            public Integer f126208b;

            /* renamed from: c */
            public Integer f126209c;

            /* renamed from: d */
            public Integer f126210d;

            /* renamed from: e */
            public Integer f126211e;

            /* renamed from: f */
            public Integer f126212f;

            /* renamed from: a */
            public ResizeData build() {
                Integer num;
                Integer num2 = this.f126207a;
                if (num2 != null && (num = this.f126208b) != null) {
                    return new ResizeData(num2, num, this.f126209c, this.f126210d, this.f126211e, this.f126212f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num2, "width", this.f126208b, "height");
            }
        }

        @Override // com.squareup.wire.Message
        public C50561a newBuilder() {
            C50561a aVar = new C50561a();
            aVar.f126207a = this.width;
            aVar.f126208b = this.height;
            aVar.f126209c = this.client_width;
            aVar.f126210d = this.client_height;
            aVar.f126211e = this.scroll_width;
            aVar.f126212f = this.scroll_height;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ResizeData");
            StringBuilder sb = new StringBuilder();
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            if (this.client_width != null) {
                sb.append(", client_width=");
                sb.append(this.client_width);
            }
            if (this.client_height != null) {
                sb.append(", client_height=");
                sb.append(this.client_height);
            }
            if (this.scroll_width != null) {
                sb.append(", scroll_width=");
                sb.append(this.scroll_width);
            }
            if (this.scroll_height != null) {
                sb.append(", scroll_height=");
                sb.append(this.scroll_height);
            }
            StringBuilder replace = sb.replace(0, 2, "ResizeData{");
            replace.append('}');
            return replace.toString();
        }

        public ResizeData(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
            this(num, num2, num3, num4, num5, num6, ByteString.EMPTY);
        }

        public ResizeData(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, ByteString byteString) {
            super(ADAPTER, byteString);
            this.width = num;
            this.height = num2;
            this.client_width = num3;
            this.client_height = num4;
            this.scroll_width = num5;
            this.scroll_height = num6;
        }
    }

    public static final class ScrollData extends Message<ScrollData, C50563a> {
        public static final ProtoAdapter<ScrollData> ADAPTER = new C50564b();
        public static final Integer DEFAULT_SCROLL_LEFT = 0;
        public static final Integer DEFAULT_SCROLL_TOP = 0;
        private static final long serialVersionUID = 0;
        public final Integer scroll_left;
        public final Integer scroll_top;
        public final String target_selector;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$ScrollData$b */
        private static final class C50564b extends ProtoAdapter<ScrollData> {
            C50564b() {
                super(FieldEncoding.LENGTH_DELIMITED, ScrollData.class);
            }

            /* renamed from: a */
            public int encodedSize(ScrollData scrollData) {
                int i;
                int i2;
                int i3 = 0;
                if (scrollData.target_selector != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, scrollData.target_selector);
                } else {
                    i = 0;
                }
                if (scrollData.scroll_top != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, scrollData.scroll_top);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (scrollData.scroll_left != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, scrollData.scroll_left);
                }
                return i4 + i3 + scrollData.unknownFields().size();
            }

            /* renamed from: a */
            public ScrollData decode(ProtoReader protoReader) throws IOException {
                C50563a aVar = new C50563a();
                aVar.f126213a = "";
                aVar.f126214b = 0;
                aVar.f126215c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126213a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126214b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126215c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ScrollData scrollData) throws IOException {
                if (scrollData.target_selector != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, scrollData.target_selector);
                }
                if (scrollData.scroll_top != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, scrollData.scroll_top);
                }
                if (scrollData.scroll_left != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, scrollData.scroll_left);
                }
                protoWriter.writeBytes(scrollData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$ScrollData$a */
        public static final class C50563a extends Message.Builder<ScrollData, C50563a> {

            /* renamed from: a */
            public String f126213a;

            /* renamed from: b */
            public Integer f126214b;

            /* renamed from: c */
            public Integer f126215c;

            /* renamed from: a */
            public ScrollData build() {
                return new ScrollData(this.f126213a, this.f126214b, this.f126215c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50563a newBuilder() {
            C50563a aVar = new C50563a();
            aVar.f126213a = this.target_selector;
            aVar.f126214b = this.scroll_top;
            aVar.f126215c = this.scroll_left;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "ScrollData");
            StringBuilder sb = new StringBuilder();
            if (this.target_selector != null) {
                sb.append(", target_selector=");
                sb.append(this.target_selector);
            }
            if (this.scroll_top != null) {
                sb.append(", scroll_top=");
                sb.append(this.scroll_top);
            }
            if (this.scroll_left != null) {
                sb.append(", scroll_left=");
                sb.append(this.scroll_left);
            }
            StringBuilder replace = sb.replace(0, 2, "ScrollData{");
            replace.append('}');
            return replace.toString();
        }

        public ScrollData(String str, Integer num, Integer num2) {
            this(str, num, num2, ByteString.EMPTY);
        }

        public ScrollData(String str, Integer num, Integer num2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.target_selector = str;
            this.scroll_top = num;
            this.scroll_left = num2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$b */
    private static final class C50566b extends ProtoAdapter<FollowAction> {
        C50566b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowAction.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowAction followAction) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, followAction.type) + ProtoAdapter.INT32.encodedSizeWithTag(2, followAction.seq_id);
            int i6 = 0;
            if (followAction.scroll_data != null) {
                i = ScrollData.ADAPTER.encodedSizeWithTag(3, followAction.scroll_data);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (followAction.resize_data != null) {
                i2 = ResizeData.ADAPTER.encodedSizeWithTag(4, followAction.resize_data);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (followAction.navigation_data != null) {
                i3 = NavigationData.ADAPTER.encodedSizeWithTag(5, followAction.navigation_data);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (followAction.url != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, followAction.url);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (followAction.share_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, followAction.share_id);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (followAction.customized_data != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(61, followAction.customized_data);
            }
            return i11 + i6 + followAction.unknownFields().size();
        }

        /* renamed from: a */
        public FollowAction decode(ProtoReader protoReader) throws IOException {
            C50565a aVar = new C50565a();
            aVar.f126216a = Type.UNKNOWN;
            aVar.f126217b = 0;
            aVar.f126221f = "";
            aVar.f126222g = "";
            aVar.f126223h = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 61) {
                    switch (nextTag) {
                        case 1:
                            try {
                                aVar.f126216a = Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f126217b = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f126218c = ScrollData.ADAPTER.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f126219d = ResizeData.ADAPTER.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f126220e = NavigationData.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f126221f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f126222g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f126223h = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowAction followAction) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, followAction.type);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, followAction.seq_id);
            if (followAction.scroll_data != null) {
                ScrollData.ADAPTER.encodeWithTag(protoWriter, 3, followAction.scroll_data);
            }
            if (followAction.resize_data != null) {
                ResizeData.ADAPTER.encodeWithTag(protoWriter, 4, followAction.resize_data);
            }
            if (followAction.navigation_data != null) {
                NavigationData.ADAPTER.encodeWithTag(protoWriter, 5, followAction.navigation_data);
            }
            if (followAction.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, followAction.url);
            }
            if (followAction.share_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, followAction.share_id);
            }
            if (followAction.customized_data != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 61, followAction.customized_data);
            }
            protoWriter.writeBytes(followAction.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowAction$a */
    public static final class C50565a extends Message.Builder<FollowAction, C50565a> {

        /* renamed from: a */
        public Type f126216a;

        /* renamed from: b */
        public Integer f126217b;

        /* renamed from: c */
        public ScrollData f126218c;

        /* renamed from: d */
        public ResizeData f126219d;

        /* renamed from: e */
        public NavigationData f126220e;

        /* renamed from: f */
        public String f126221f;

        /* renamed from: g */
        public String f126222g;

        /* renamed from: h */
        public String f126223h;

        /* renamed from: a */
        public FollowAction build() {
            Integer num;
            Type type = this.f126216a;
            if (type != null && (num = this.f126217b) != null) {
                return new FollowAction(type, num, this.f126218c, this.f126219d, this.f126220e, this.f126221f, this.f126222g, this.f126223h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d, this.f126217b, "seq_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50565a newBuilder() {
        C50565a aVar = new C50565a();
        aVar.f126216a = this.type;
        aVar.f126217b = this.seq_id;
        aVar.f126218c = this.scroll_data;
        aVar.f126219d = this.resize_data;
        aVar.f126220e = this.navigation_data;
        aVar.f126221f = this.url;
        aVar.f126222g = this.share_id;
        aVar.f126223h = this.customized_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowAction");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", seq_id=");
        sb.append(this.seq_id);
        if (this.scroll_data != null) {
            sb.append(", scroll_data=");
            sb.append(this.scroll_data);
        }
        if (this.resize_data != null) {
            sb.append(", resize_data=");
            sb.append(this.resize_data);
        }
        if (this.navigation_data != null) {
            sb.append(", navigation_data=");
            sb.append(this.navigation_data);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.share_id != null) {
            sb.append(", share_id=");
            sb.append(this.share_id);
        }
        if (this.customized_data != null) {
            sb.append(", customized_data=");
            sb.append(this.customized_data);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowAction{");
        replace.append('}');
        return replace.toString();
    }

    public FollowAction(Type type2, Integer num, ScrollData scrollData, ResizeData resizeData, NavigationData navigationData, String str, String str2, String str3) {
        this(type2, num, scrollData, resizeData, navigationData, str, str2, str3, ByteString.EMPTY);
    }

    public FollowAction(Type type2, Integer num, ScrollData scrollData, ResizeData resizeData, NavigationData navigationData, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.seq_id = num;
        this.scroll_data = scrollData;
        this.resize_data = resizeData;
        this.navigation_data = navigationData;
        this.url = str;
        this.share_id = str2;
        this.customized_data = str3;
    }
}
