package com.ss.android.lark.pb.openbanner;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class OpenBannerResponse extends Message<OpenBannerResponse, C49998a> {
    public static final ProtoAdapter<OpenBannerResponse> ADAPTER = new C49999b();
    public static final Integer DEFAULT_CODE = 0;
    private static final long serialVersionUID = 0;
    public final Integer mcode;
    public final Container mcontainer;
    public final ContainerTag mcontainer_tag;
    public final String mcontext;
    public final String mtarget_id;
    public final TargetType mtarget_type;
    public final Map<String, String> mtips_i18n;

    public static final class Container extends Message<Container, C49996a> {
        public static final ProtoAdapter<Container> ADAPTER = new C49997b();
        public static final Long DEFAULT_TIMESTAMP = 0L;
        private static final long serialVersionUID = 0;
        public final List<Resource> mresource_list;
        public final Long mtimestamp;

        public static final class Resource extends Message<Resource, C49994a> {
            public static final ProtoAdapter<Resource> ADAPTER = new C49995b();
            private static final long serialVersionUID = 0;
            public final String mresource_id;
            public final String mresource_type;
            public final String mview_data;
            public final ViewType mview_type;

            /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerResponse$Container$Resource$b */
            private static final class C49995b extends ProtoAdapter<Resource> {
                C49995b() {
                    super(FieldEncoding.LENGTH_DELIMITED, Resource.class);
                }

                /* renamed from: a */
                public int encodedSize(Resource resource) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, resource.mresource_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, resource.mresource_type) + ViewType.ADAPTER.encodedSizeWithTag(3, resource.mview_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, resource.mview_data) + resource.unknownFields().size();
                }

                /* renamed from: a */
                public Resource decode(ProtoReader protoReader) throws IOException {
                    C49994a aVar = new C49994a();
                    aVar.f125040a = "";
                    aVar.f125041b = "";
                    aVar.f125043d = "";
                    long beginMessage = protoReader.beginMessage();
                    while (true) {
                        int nextTag = protoReader.nextTag();
                        if (nextTag == -1) {
                            protoReader.endMessage(beginMessage);
                            return aVar.build();
                        } else if (nextTag == 1) {
                            aVar.f125040a = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 2) {
                            aVar.f125041b = ProtoAdapter.STRING.decode(protoReader);
                        } else if (nextTag == 3) {
                            try {
                                aVar.f125042c = ViewType.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                            }
                        } else if (nextTag != 4) {
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            aVar.f125043d = ProtoAdapter.STRING.decode(protoReader);
                        }
                    }
                }

                /* renamed from: a */
                public void encode(ProtoWriter protoWriter, Resource resource) throws IOException {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, resource.mresource_id);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, resource.mresource_type);
                    ViewType.ADAPTER.encodeWithTag(protoWriter, 3, resource.mview_type);
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, resource.mview_data);
                    protoWriter.writeBytes(resource.unknownFields());
                }
            }

            @Override // com.squareup.wire.Message
            public C49994a newBuilder() {
                C49994a aVar = new C49994a();
                aVar.f125040a = this.mresource_id;
                aVar.f125041b = this.mresource_type;
                aVar.f125042c = this.mview_type;
                aVar.f125043d = this.mview_data;
                aVar.addUnknownFields(unknownFields());
                return aVar;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(", resource_id=");
                sb.append(this.mresource_id);
                sb.append(", resource_type=");
                sb.append(this.mresource_type);
                sb.append(", view_type=");
                sb.append(this.mview_type);
                sb.append(", view_data=");
                sb.append(this.mview_data);
                StringBuilder replace = sb.replace(0, 2, "Resource{");
                replace.append('}');
                return replace.toString();
            }

            /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerResponse$Container$Resource$a */
            public static final class C49994a extends Message.Builder<Resource, C49994a> {

                /* renamed from: a */
                public String f125040a;

                /* renamed from: b */
                public String f125041b;

                /* renamed from: c */
                public ViewType f125042c;

                /* renamed from: d */
                public String f125043d;

                /* renamed from: a */
                public Resource build() {
                    String str;
                    ViewType viewType;
                    String str2;
                    String str3 = this.f125040a;
                    if (str3 != null && (str = this.f125041b) != null && (viewType = this.f125042c) != null && (str2 = this.f125043d) != null) {
                        return new Resource(str3, str, viewType, str2, super.buildUnknownFields());
                    }
                    throw Internal.missingRequiredFields(str3, "mresource_id", this.f125041b, "mresource_type", this.f125042c, "mview_type", this.f125043d, "mview_data");
                }
            }

            public Resource(String str, String str2, ViewType viewType, String str3) {
                this(str, str2, viewType, str3, ByteString.EMPTY);
            }

            public Resource(String str, String str2, ViewType viewType, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                this.mresource_id = str;
                this.mresource_type = str2;
                this.mview_type = viewType;
                this.mview_data = str3;
            }
        }

        /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerResponse$Container$b */
        private static final class C49997b extends ProtoAdapter<Container> {
            C49997b() {
                super(FieldEncoding.LENGTH_DELIMITED, Container.class);
            }

            /* renamed from: a */
            public int encodedSize(Container container) {
                return ProtoAdapter.INT64.encodedSizeWithTag(1, container.mtimestamp) + Resource.ADAPTER.asRepeated().encodedSizeWithTag(2, container.mresource_list) + container.unknownFields().size();
            }

            /* renamed from: a */
            public Container decode(ProtoReader protoReader) throws IOException {
                C49996a aVar = new C49996a();
                aVar.f125044a = 0L;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125044a = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125045b.add(Resource.ADAPTER.decode(protoReader));
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Container container) throws IOException {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, container.mtimestamp);
                Resource.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, container.mresource_list);
                protoWriter.writeBytes(container.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerResponse$Container$a */
        public static final class C49996a extends Message.Builder<Container, C49996a> {

            /* renamed from: a */
            public Long f125044a;

            /* renamed from: b */
            public List<Resource> f125045b = Internal.newMutableList();

            /* renamed from: a */
            public Container build() {
                Long l = this.f125044a;
                if (l != null) {
                    return new Container(l, this.f125045b, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(l, "mtimestamp");
            }
        }

        @Override // com.squareup.wire.Message
        public C49996a newBuilder() {
            C49996a aVar = new C49996a();
            aVar.f125044a = this.mtimestamp;
            aVar.f125045b = Internal.copyOf("mresource_list", this.mresource_list);
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", timestamp=");
            sb.append(this.mtimestamp);
            if (!this.mresource_list.isEmpty()) {
                sb.append(", resource_list=");
                sb.append(this.mresource_list);
            }
            StringBuilder replace = sb.replace(0, 2, "Container{");
            replace.append('}');
            return replace.toString();
        }

        public Container(Long l, List<Resource> list) {
            this(l, list, ByteString.EMPTY);
        }

        public Container(Long l, List<Resource> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mtimestamp = l;
            this.mresource_list = Internal.immutableCopyOf("mresource_list", list);
        }
    }

    /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerResponse$b */
    private static final class C49999b extends ProtoAdapter<OpenBannerResponse> {

        /* renamed from: a */
        private final ProtoAdapter<Map<String, String>> f125053a = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ProtoAdapter.STRING);

        C49999b() {
            super(FieldEncoding.LENGTH_DELIMITED, OpenBannerResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(OpenBannerResponse openBannerResponse) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, openBannerResponse.mtarget_id) + TargetType.ADAPTER.encodedSizeWithTag(2, openBannerResponse.mtarget_type);
            int i3 = 0;
            if (openBannerResponse.mcontainer_tag != null) {
                i = ContainerTag.ADAPTER.encodedSizeWithTag(3, openBannerResponse.mcontainer_tag);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (openBannerResponse.mcontext != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(4, openBannerResponse.mcontext);
            } else {
                i2 = 0;
            }
            int encodedSizeWithTag2 = i4 + i2 + ProtoAdapter.INT32.encodedSizeWithTag(5, openBannerResponse.mcode) + this.f125053a.encodedSizeWithTag(6, openBannerResponse.mtips_i18n);
            if (openBannerResponse.mcontainer != null) {
                i3 = Container.ADAPTER.encodedSizeWithTag(7, openBannerResponse.mcontainer);
            }
            return encodedSizeWithTag2 + i3 + openBannerResponse.unknownFields().size();
        }

        /* renamed from: a */
        public OpenBannerResponse decode(ProtoReader protoReader) throws IOException {
            C49998a aVar = new C49998a();
            aVar.f125046a = "";
            aVar.f125049d = "";
            aVar.f125050e = 0;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f125046a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f125047b = TargetType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f125048c = ContainerTag.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f125049d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f125050e = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            aVar.f125051f.putAll(this.f125053a.decode(protoReader));
                            break;
                        case 7:
                            aVar.f125052g = Container.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, OpenBannerResponse openBannerResponse) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, openBannerResponse.mtarget_id);
            TargetType.ADAPTER.encodeWithTag(protoWriter, 2, openBannerResponse.mtarget_type);
            if (openBannerResponse.mcontainer_tag != null) {
                ContainerTag.ADAPTER.encodeWithTag(protoWriter, 3, openBannerResponse.mcontainer_tag);
            }
            if (openBannerResponse.mcontext != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, openBannerResponse.mcontext);
            }
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, openBannerResponse.mcode);
            this.f125053a.encodeWithTag(protoWriter, 6, openBannerResponse.mtips_i18n);
            if (openBannerResponse.mcontainer != null) {
                Container.ADAPTER.encodeWithTag(protoWriter, 7, openBannerResponse.mcontainer);
            }
            protoWriter.writeBytes(openBannerResponse.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C49998a newBuilder() {
        C49998a aVar = new C49998a();
        aVar.f125046a = this.mtarget_id;
        aVar.f125047b = this.mtarget_type;
        aVar.f125048c = this.mcontainer_tag;
        aVar.f125049d = this.mcontext;
        aVar.f125050e = this.mcode;
        aVar.f125051f = Internal.copyOf("mtips_i18n", this.mtips_i18n);
        aVar.f125052g = this.mcontainer;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.ss.android.lark.pb.openbanner.OpenBannerResponse$a */
    public static final class C49998a extends Message.Builder<OpenBannerResponse, C49998a> {

        /* renamed from: a */
        public String f125046a;

        /* renamed from: b */
        public TargetType f125047b;

        /* renamed from: c */
        public ContainerTag f125048c;

        /* renamed from: d */
        public String f125049d;

        /* renamed from: e */
        public Integer f125050e;

        /* renamed from: f */
        public Map<String, String> f125051f = Internal.newMutableMap();

        /* renamed from: g */
        public Container f125052g;

        /* renamed from: a */
        public OpenBannerResponse build() {
            TargetType targetType;
            Integer num;
            String str = this.f125046a;
            if (str != null && (targetType = this.f125047b) != null && (num = this.f125050e) != null) {
                return new OpenBannerResponse(str, targetType, this.f125048c, this.f125049d, num, this.f125051f, this.f125052g, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "mtarget_id", this.f125047b, "mtarget_type", this.f125050e, "mcode");
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", target_id=");
        sb.append(this.mtarget_id);
        sb.append(", target_type=");
        sb.append(this.mtarget_type);
        if (this.mcontainer_tag != null) {
            sb.append(", container_tag=");
            sb.append(this.mcontainer_tag);
        }
        if (this.mcontext != null) {
            sb.append(", context=");
            sb.append(this.mcontext);
        }
        sb.append(", code=");
        sb.append(this.mcode);
        if (!this.mtips_i18n.isEmpty()) {
            sb.append(", tips_i18n=");
            sb.append(this.mtips_i18n);
        }
        if (this.mcontainer != null) {
            sb.append(", container=");
            sb.append(this.mcontainer);
        }
        StringBuilder replace = sb.replace(0, 2, "OpenBannerResponse{");
        replace.append('}');
        return replace.toString();
    }

    public OpenBannerResponse(String str, TargetType targetType, ContainerTag containerTag, String str2, Integer num, Map<String, String> map, Container container) {
        this(str, targetType, containerTag, str2, num, map, container, ByteString.EMPTY);
    }

    public OpenBannerResponse(String str, TargetType targetType, ContainerTag containerTag, String str2, Integer num, Map<String, String> map, Container container, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mtarget_id = str;
        this.mtarget_type = targetType;
        this.mcontainer_tag = containerTag;
        this.mcontext = str2;
        this.mcode = num;
        this.mtips_i18n = Internal.immutableCopyOf("mtips_i18n", map);
        this.mcontainer = container;
    }
}
