package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class FollowAction extends Message<FollowAction, C50312a> {
    public static final ProtoAdapter<FollowAction> ADAPTER = new C50313b();
    public static final Integer DEFAULT_SEQ_ID = 0;
    private static final long serialVersionUID = 0;
    public final String mcustomized_data;
    public final NavigationData mnavigation_data;
    public final ResizeData mresize_data;
    public final ScrollData mscroll_data;
    public final Integer mseq_id;
    public final String mshare_id;
    public final Type mtype;
    public final String murl;

    public static final class NavigationData extends Message<NavigationData, C50306a> {
        public static final ProtoAdapter<NavigationData> ADAPTER = new C50307b();
        private static final long serialVersionUID = 0;
        public final NavigationChangeMode mmode;
        public final String murl;

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

        /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$NavigationData$b */
        private static final class C50307b extends ProtoAdapter<NavigationData> {
            C50307b() {
                super(FieldEncoding.LENGTH_DELIMITED, NavigationData.class);
            }

            /* renamed from: a */
            public int encodedSize(NavigationData navigationData) {
                int i;
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, navigationData.murl);
                if (navigationData.mmode != null) {
                    i = NavigationChangeMode.ADAPTER.encodedSizeWithTag(2, navigationData.mmode);
                } else {
                    i = 0;
                }
                return encodedSizeWithTag + i + navigationData.unknownFields().size();
            }

            /* renamed from: a */
            public NavigationData decode(ProtoReader protoReader) throws IOException {
                C50306a aVar = new C50306a();
                aVar.f125680a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125680a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f125681b = NavigationChangeMode.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, NavigationData navigationData) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, navigationData.murl);
                if (navigationData.mmode != null) {
                    NavigationChangeMode.ADAPTER.encodeWithTag(protoWriter, 2, navigationData.mmode);
                }
                protoWriter.writeBytes(navigationData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$NavigationData$a */
        public static final class C50306a extends Message.Builder<NavigationData, C50306a> {

            /* renamed from: a */
            public String f125680a;

            /* renamed from: b */
            public NavigationChangeMode f125681b;

            /* renamed from: a */
            public NavigationData build() {
                String str = this.f125680a;
                if (str != null) {
                    return new NavigationData(str, this.f125681b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "murl");
            }
        }

        @Override // com.squareup.wire.Message
        public C50306a newBuilder() {
            C50306a aVar = new C50306a();
            aVar.f125680a = this.murl;
            aVar.f125681b = this.mmode;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", url=");
            sb.append(this.murl);
            if (this.mmode != null) {
                sb.append(", mode=");
                sb.append(this.mmode);
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
            this.murl = str;
            this.mmode = navigationChangeMode;
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

    public static final class ResizeData extends Message<ResizeData, C50308a> {
        public static final ProtoAdapter<ResizeData> ADAPTER = new C50309b();
        public static final Integer DEFAULT_CLIENT_HEIGHT = 0;
        public static final Integer DEFAULT_CLIENT_WIDTH = 0;
        public static final Integer DEFAULT_HEIGHT = 0;
        public static final Integer DEFAULT_SCROLL_HEIGHT = 0;
        public static final Integer DEFAULT_SCROLL_WIDTH = 0;
        public static final Integer DEFAULT_WIDTH = 0;
        private static final long serialVersionUID = 0;
        public final Integer mclient_height;
        public final Integer mclient_width;
        public final Integer mheight;
        public final Integer mscroll_height;
        public final Integer mscroll_width;
        public final Integer mwidth;

        /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$ResizeData$b */
        private static final class C50309b extends ProtoAdapter<ResizeData> {
            C50309b() {
                super(FieldEncoding.LENGTH_DELIMITED, ResizeData.class);
            }

            /* renamed from: a */
            public int encodedSize(ResizeData resizeData) {
                int i;
                int i2;
                int i3;
                int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, resizeData.mwidth) + ProtoAdapter.INT32.encodedSizeWithTag(2, resizeData.mheight);
                int i4 = 0;
                if (resizeData.mclient_width != null) {
                    i = ProtoAdapter.INT32.encodedSizeWithTag(3, resizeData.mclient_width);
                } else {
                    i = 0;
                }
                int i5 = encodedSizeWithTag + i;
                if (resizeData.mclient_height != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(4, resizeData.mclient_height);
                } else {
                    i2 = 0;
                }
                int i6 = i5 + i2;
                if (resizeData.mscroll_width != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(5, resizeData.mscroll_width);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (resizeData.mscroll_height != null) {
                    i4 = ProtoAdapter.INT32.encodedSizeWithTag(6, resizeData.mscroll_height);
                }
                return i7 + i4 + resizeData.unknownFields().size();
            }

            /* renamed from: a */
            public ResizeData decode(ProtoReader protoReader) throws IOException {
                C50308a aVar = new C50308a();
                aVar.f125682a = 0;
                aVar.f125683b = 0;
                aVar.f125684c = 0;
                aVar.f125685d = 0;
                aVar.f125686e = 0;
                aVar.f125687f = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.f125682a = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                aVar.f125683b = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                aVar.f125684c = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                aVar.f125685d = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                aVar.f125686e = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 6:
                                aVar.f125687f = ProtoAdapter.INT32.decode(protoReader);
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
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, resizeData.mwidth);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, resizeData.mheight);
                if (resizeData.mclient_width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, resizeData.mclient_width);
                }
                if (resizeData.mclient_height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, resizeData.mclient_height);
                }
                if (resizeData.mscroll_width != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, resizeData.mscroll_width);
                }
                if (resizeData.mscroll_height != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, resizeData.mscroll_height);
                }
                protoWriter.writeBytes(resizeData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$ResizeData$a */
        public static final class C50308a extends Message.Builder<ResizeData, C50308a> {

            /* renamed from: a */
            public Integer f125682a;

            /* renamed from: b */
            public Integer f125683b;

            /* renamed from: c */
            public Integer f125684c;

            /* renamed from: d */
            public Integer f125685d;

            /* renamed from: e */
            public Integer f125686e;

            /* renamed from: f */
            public Integer f125687f;

            /* renamed from: a */
            public ResizeData build() {
                Integer num;
                Integer num2 = this.f125682a;
                if (num2 != null && (num = this.f125683b) != null) {
                    return new ResizeData(num2, num, this.f125684c, this.f125685d, this.f125686e, this.f125687f, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(num2, "mwidth", this.f125683b, "mheight");
            }
        }

        @Override // com.squareup.wire.Message
        public C50308a newBuilder() {
            C50308a aVar = new C50308a();
            aVar.f125682a = this.mwidth;
            aVar.f125683b = this.mheight;
            aVar.f125684c = this.mclient_width;
            aVar.f125685d = this.mclient_height;
            aVar.f125686e = this.mscroll_width;
            aVar.f125687f = this.mscroll_height;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", width=");
            sb.append(this.mwidth);
            sb.append(", height=");
            sb.append(this.mheight);
            if (this.mclient_width != null) {
                sb.append(", client_width=");
                sb.append(this.mclient_width);
            }
            if (this.mclient_height != null) {
                sb.append(", client_height=");
                sb.append(this.mclient_height);
            }
            if (this.mscroll_width != null) {
                sb.append(", scroll_width=");
                sb.append(this.mscroll_width);
            }
            if (this.mscroll_height != null) {
                sb.append(", scroll_height=");
                sb.append(this.mscroll_height);
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
            this.mwidth = num;
            this.mheight = num2;
            this.mclient_width = num3;
            this.mclient_height = num4;
            this.mscroll_width = num5;
            this.mscroll_height = num6;
        }
    }

    public static final class ScrollData extends Message<ScrollData, C50310a> {
        public static final ProtoAdapter<ScrollData> ADAPTER = new C50311b();
        public static final Integer DEFAULT_SCROLL_LEFT = 0;
        public static final Integer DEFAULT_SCROLL_TOP = 0;
        private static final long serialVersionUID = 0;
        public final Integer mscroll_left;
        public final Integer mscroll_top;
        public final String mtarget_selector;

        /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$ScrollData$b */
        private static final class C50311b extends ProtoAdapter<ScrollData> {
            C50311b() {
                super(FieldEncoding.LENGTH_DELIMITED, ScrollData.class);
            }

            /* renamed from: a */
            public int encodedSize(ScrollData scrollData) {
                int i;
                int i2;
                int i3 = 0;
                if (scrollData.mtarget_selector != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, scrollData.mtarget_selector);
                } else {
                    i = 0;
                }
                if (scrollData.mscroll_top != null) {
                    i2 = ProtoAdapter.INT32.encodedSizeWithTag(2, scrollData.mscroll_top);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (scrollData.mscroll_left != null) {
                    i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, scrollData.mscroll_left);
                }
                return i4 + i3 + scrollData.unknownFields().size();
            }

            /* renamed from: a */
            public ScrollData decode(ProtoReader protoReader) throws IOException {
                C50310a aVar = new C50310a();
                aVar.f125688a = "";
                aVar.f125689b = 0;
                aVar.f125690c = 0;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125688a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f125689b = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125690c = ProtoAdapter.INT32.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, ScrollData scrollData) throws IOException {
                if (scrollData.mtarget_selector != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, scrollData.mtarget_selector);
                }
                if (scrollData.mscroll_top != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, scrollData.mscroll_top);
                }
                if (scrollData.mscroll_left != null) {
                    ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, scrollData.mscroll_left);
                }
                protoWriter.writeBytes(scrollData.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$ScrollData$a */
        public static final class C50310a extends Message.Builder<ScrollData, C50310a> {

            /* renamed from: a */
            public String f125688a;

            /* renamed from: b */
            public Integer f125689b;

            /* renamed from: c */
            public Integer f125690c;

            /* renamed from: a */
            public ScrollData build() {
                return new ScrollData(this.f125688a, this.f125689b, this.f125690c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50310a newBuilder() {
            C50310a aVar = new C50310a();
            aVar.f125688a = this.mtarget_selector;
            aVar.f125689b = this.mscroll_top;
            aVar.f125690c = this.mscroll_left;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mtarget_selector != null) {
                sb.append(", target_selector=");
                sb.append(this.mtarget_selector);
            }
            if (this.mscroll_top != null) {
                sb.append(", scroll_top=");
                sb.append(this.mscroll_top);
            }
            if (this.mscroll_left != null) {
                sb.append(", scroll_left=");
                sb.append(this.mscroll_left);
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
            this.mtarget_selector = str;
            this.mscroll_top = num;
            this.mscroll_left = num2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$b */
    private static final class C50313b extends ProtoAdapter<FollowAction> {
        C50313b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowAction.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowAction followAction) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int encodedSizeWithTag = Type.ADAPTER.encodedSizeWithTag(1, followAction.mtype) + ProtoAdapter.INT32.encodedSizeWithTag(2, followAction.mseq_id);
            int i6 = 0;
            if (followAction.mscroll_data != null) {
                i = ScrollData.ADAPTER.encodedSizeWithTag(3, followAction.mscroll_data);
            } else {
                i = 0;
            }
            int i7 = encodedSizeWithTag + i;
            if (followAction.mresize_data != null) {
                i2 = ResizeData.ADAPTER.encodedSizeWithTag(4, followAction.mresize_data);
            } else {
                i2 = 0;
            }
            int i8 = i7 + i2;
            if (followAction.mnavigation_data != null) {
                i3 = NavigationData.ADAPTER.encodedSizeWithTag(5, followAction.mnavigation_data);
            } else {
                i3 = 0;
            }
            int i9 = i8 + i3;
            if (followAction.murl != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, followAction.murl);
            } else {
                i4 = 0;
            }
            int i10 = i9 + i4;
            if (followAction.mshare_id != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(7, followAction.mshare_id);
            } else {
                i5 = 0;
            }
            int i11 = i10 + i5;
            if (followAction.mcustomized_data != null) {
                i6 = ProtoAdapter.STRING.encodedSizeWithTag(61, followAction.mcustomized_data);
            }
            return i11 + i6 + followAction.unknownFields().size();
        }

        /* renamed from: a */
        public FollowAction decode(ProtoReader protoReader) throws IOException {
            C50312a aVar = new C50312a();
            aVar.f125692b = 0;
            aVar.f125696f = "";
            aVar.f125697g = "";
            aVar.f125698h = "";
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
                                aVar.f125691a = Type.ADAPTER.decode(protoReader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 2:
                            aVar.f125692b = ProtoAdapter.INT32.decode(protoReader);
                            continue;
                        case 3:
                            aVar.f125693c = ScrollData.ADAPTER.decode(protoReader);
                            continue;
                        case 4:
                            aVar.f125694d = ResizeData.ADAPTER.decode(protoReader);
                            continue;
                        case 5:
                            aVar.f125695e = NavigationData.ADAPTER.decode(protoReader);
                            continue;
                        case 6:
                            aVar.f125696f = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        case 7:
                            aVar.f125697g = ProtoAdapter.STRING.decode(protoReader);
                            continue;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            continue;
                    }
                } else {
                    aVar.f125698h = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowAction followAction) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, followAction.mtype);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, followAction.mseq_id);
            if (followAction.mscroll_data != null) {
                ScrollData.ADAPTER.encodeWithTag(protoWriter, 3, followAction.mscroll_data);
            }
            if (followAction.mresize_data != null) {
                ResizeData.ADAPTER.encodeWithTag(protoWriter, 4, followAction.mresize_data);
            }
            if (followAction.mnavigation_data != null) {
                NavigationData.ADAPTER.encodeWithTag(protoWriter, 5, followAction.mnavigation_data);
            }
            if (followAction.murl != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, followAction.murl);
            }
            if (followAction.mshare_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, followAction.mshare_id);
            }
            if (followAction.mcustomized_data != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 61, followAction.mcustomized_data);
            }
            protoWriter.writeBytes(followAction.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.FollowAction$a */
    public static final class C50312a extends Message.Builder<FollowAction, C50312a> {

        /* renamed from: a */
        public Type f125691a;

        /* renamed from: b */
        public Integer f125692b;

        /* renamed from: c */
        public ScrollData f125693c;

        /* renamed from: d */
        public ResizeData f125694d;

        /* renamed from: e */
        public NavigationData f125695e;

        /* renamed from: f */
        public String f125696f;

        /* renamed from: g */
        public String f125697g;

        /* renamed from: h */
        public String f125698h;

        /* renamed from: a */
        public FollowAction build() {
            Integer num;
            Type type = this.f125691a;
            if (type != null && (num = this.f125692b) != null) {
                return new FollowAction(type, num, this.f125693c, this.f125694d, this.f125695e, this.f125696f, this.f125697g, this.f125698h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, "mtype", this.f125692b, "mseq_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C50312a newBuilder() {
        C50312a aVar = new C50312a();
        aVar.f125691a = this.mtype;
        aVar.f125692b = this.mseq_id;
        aVar.f125693c = this.mscroll_data;
        aVar.f125694d = this.mresize_data;
        aVar.f125695e = this.mnavigation_data;
        aVar.f125696f = this.murl;
        aVar.f125697g = this.mshare_id;
        aVar.f125698h = this.mcustomized_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.mtype);
        sb.append(", seq_id=");
        sb.append(this.mseq_id);
        if (this.mscroll_data != null) {
            sb.append(", scroll_data=");
            sb.append(this.mscroll_data);
        }
        if (this.mresize_data != null) {
            sb.append(", resize_data=");
            sb.append(this.mresize_data);
        }
        if (this.mnavigation_data != null) {
            sb.append(", navigation_data=");
            sb.append(this.mnavigation_data);
        }
        if (this.murl != null) {
            sb.append(", url=");
            sb.append(this.murl);
        }
        if (this.mshare_id != null) {
            sb.append(", share_id=");
            sb.append(this.mshare_id);
        }
        if (this.mcustomized_data != null) {
            sb.append(", customized_data=");
            sb.append(this.mcustomized_data);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowAction{");
        replace.append('}');
        return replace.toString();
    }

    public FollowAction(Type type, Integer num, ScrollData scrollData, ResizeData resizeData, NavigationData navigationData, String str, String str2, String str3) {
        this(type, num, scrollData, resizeData, navigationData, str, str2, str3, ByteString.EMPTY);
    }

    public FollowAction(Type type, Integer num, ScrollData scrollData, ResizeData resizeData, NavigationData navigationData, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtype = type;
        this.mseq_id = num;
        this.mscroll_data = scrollData;
        this.mresize_data = resizeData;
        this.mnavigation_data = navigationData;
        this.murl = str;
        this.mshare_id = str2;
        this.mcustomized_data = str3;
    }
}
