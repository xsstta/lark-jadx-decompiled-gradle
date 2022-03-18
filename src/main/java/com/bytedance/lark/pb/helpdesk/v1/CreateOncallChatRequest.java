package com.bytedance.lark.pb.helpdesk.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.CircleArea;
import com.bytedance.lark.pb.basic.v1.Coordinate;
import com.bytedance.lark.pb.basic.v1.PolygonArea;
import com.bytedance.lark.pb.basic.v1.RectangleArea;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class CreateOncallChatRequest extends Message<CreateOncallChatRequest, C17254a> {
    public static final ProtoAdapter<CreateOncallChatRequest> ADAPTER = new C17255b();
    private static final long serialVersionUID = 0;
    public final AdditionalData additional_data;
    public final String oncall_id;
    public final String user_id;

    public static final class AdditionalData extends Message<AdditionalData, C17252a> {
        public static final ProtoAdapter<AdditionalData> ADAPTER = new C17253b();
        public static final Long DEFAULT_FAQ_ID = 0L;
        private static final long serialVersionUID = 0;
        public final CircleArea circle_area;
        public final String extra;
        public final Long faq_id;
        public final String faq_id_str;
        public final Coordinate point;
        public final PolygonArea polygon_area;
        public final RectangleArea rectangle_area;

        /* renamed from: com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatRequest$AdditionalData$b */
        private static final class C17253b extends ProtoAdapter<AdditionalData> {
            C17253b() {
                super(FieldEncoding.LENGTH_DELIMITED, AdditionalData.class);
            }

            /* renamed from: a */
            public int encodedSize(AdditionalData additionalData) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7 = 0;
                if (additionalData.extra != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(5, additionalData.extra);
                } else {
                    i = 0;
                }
                if (additionalData.faq_id != null) {
                    i2 = ProtoAdapter.INT64.encodedSizeWithTag(6, additionalData.faq_id);
                } else {
                    i2 = 0;
                }
                int i8 = i + i2;
                if (additionalData.faq_id_str != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(7, additionalData.faq_id_str);
                } else {
                    i3 = 0;
                }
                int i9 = i8 + i3;
                if (additionalData.point != null) {
                    i4 = Coordinate.ADAPTER.encodedSizeWithTag(1, additionalData.point);
                } else {
                    i4 = 0;
                }
                int i10 = i9 + i4;
                if (additionalData.circle_area != null) {
                    i5 = CircleArea.ADAPTER.encodedSizeWithTag(2, additionalData.circle_area);
                } else {
                    i5 = 0;
                }
                int i11 = i10 + i5;
                if (additionalData.rectangle_area != null) {
                    i6 = RectangleArea.ADAPTER.encodedSizeWithTag(3, additionalData.rectangle_area);
                } else {
                    i6 = 0;
                }
                int i12 = i11 + i6;
                if (additionalData.polygon_area != null) {
                    i7 = PolygonArea.ADAPTER.encodedSizeWithTag(4, additionalData.polygon_area);
                }
                return i12 + i7 + additionalData.unknownFields().size();
            }

            /* renamed from: a */
            public AdditionalData decode(ProtoReader protoReader) throws IOException {
                C17252a aVar = new C17252a();
                aVar.f44078a = "";
                aVar.f44079b = 0L;
                aVar.f44080c = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                aVar.mo60653a(Coordinate.ADAPTER.decode(protoReader));
                                break;
                            case 2:
                                aVar.mo60652a(CircleArea.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                aVar.mo60655a(RectangleArea.ADAPTER.decode(protoReader));
                                break;
                            case 4:
                                aVar.mo60654a(PolygonArea.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                aVar.f44078a = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                aVar.f44079b = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 7:
                                aVar.f44080c = ProtoAdapter.STRING.decode(protoReader);
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
            public void encode(ProtoWriter protoWriter, AdditionalData additionalData) throws IOException {
                if (additionalData.extra != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, additionalData.extra);
                }
                if (additionalData.faq_id != null) {
                    ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, additionalData.faq_id);
                }
                if (additionalData.faq_id_str != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, additionalData.faq_id_str);
                }
                if (additionalData.point != null) {
                    Coordinate.ADAPTER.encodeWithTag(protoWriter, 1, additionalData.point);
                }
                if (additionalData.circle_area != null) {
                    CircleArea.ADAPTER.encodeWithTag(protoWriter, 2, additionalData.circle_area);
                }
                if (additionalData.rectangle_area != null) {
                    RectangleArea.ADAPTER.encodeWithTag(protoWriter, 3, additionalData.rectangle_area);
                }
                if (additionalData.polygon_area != null) {
                    PolygonArea.ADAPTER.encodeWithTag(protoWriter, 4, additionalData.polygon_area);
                }
                protoWriter.writeBytes(additionalData.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C17252a newBuilder() {
            C17252a aVar = new C17252a();
            aVar.f44078a = this.extra;
            aVar.f44079b = this.faq_id;
            aVar.f44080c = this.faq_id_str;
            aVar.f44081d = this.point;
            aVar.f44082e = this.circle_area;
            aVar.f44083f = this.rectangle_area;
            aVar.f44084g = this.polygon_area;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("helpdesk", "AdditionalData");
            StringBuilder sb = new StringBuilder();
            if (this.extra != null) {
                sb.append(", extra=");
                sb.append(this.extra);
            }
            if (this.faq_id != null) {
                sb.append(", faq_id=");
                sb.append(this.faq_id);
            }
            if (this.faq_id_str != null) {
                sb.append(", faq_id_str=");
                sb.append(this.faq_id_str);
            }
            if (this.point != null) {
                sb.append(", point=");
                sb.append(this.point);
            }
            if (this.circle_area != null) {
                sb.append(", circle_area=");
                sb.append(this.circle_area);
            }
            if (this.rectangle_area != null) {
                sb.append(", rectangle_area=");
                sb.append(this.rectangle_area);
            }
            if (this.polygon_area != null) {
                sb.append(", polygon_area=");
                sb.append(this.polygon_area);
            }
            StringBuilder replace = sb.replace(0, 2, "AdditionalData{");
            replace.append('}');
            return replace.toString();
        }

        /* renamed from: com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatRequest$AdditionalData$a */
        public static final class C17252a extends Message.Builder<AdditionalData, C17252a> {

            /* renamed from: a */
            public String f44078a;

            /* renamed from: b */
            public Long f44079b;

            /* renamed from: c */
            public String f44080c;

            /* renamed from: d */
            public Coordinate f44081d;

            /* renamed from: e */
            public CircleArea f44082e;

            /* renamed from: f */
            public RectangleArea f44083f;

            /* renamed from: g */
            public PolygonArea f44084g;

            /* renamed from: a */
            public AdditionalData build() {
                return new AdditionalData(this.f44078a, this.f44079b, this.f44080c, this.f44081d, this.f44082e, this.f44083f, this.f44084g, super.buildUnknownFields());
            }

            /* renamed from: a */
            public C17252a mo60656a(String str) {
                this.f44078a = str;
                return this;
            }

            /* renamed from: b */
            public C17252a mo60658b(String str) {
                this.f44080c = str;
                return this;
            }

            /* renamed from: a */
            public C17252a mo60652a(CircleArea circleArea) {
                this.f44082e = circleArea;
                this.f44081d = null;
                this.f44083f = null;
                this.f44084g = null;
                return this;
            }

            /* renamed from: a */
            public C17252a mo60653a(Coordinate coordinate) {
                this.f44081d = coordinate;
                this.f44082e = null;
                this.f44083f = null;
                this.f44084g = null;
                return this;
            }

            /* renamed from: a */
            public C17252a mo60654a(PolygonArea polygonArea) {
                this.f44084g = polygonArea;
                this.f44081d = null;
                this.f44082e = null;
                this.f44083f = null;
                return this;
            }

            /* renamed from: a */
            public C17252a mo60655a(RectangleArea rectangleArea) {
                this.f44083f = rectangleArea;
                this.f44081d = null;
                this.f44082e = null;
                this.f44084g = null;
                return this;
            }
        }

        public AdditionalData(String str, Long l, String str2, Coordinate coordinate, CircleArea circleArea, RectangleArea rectangleArea, PolygonArea polygonArea) {
            this(str, l, str2, coordinate, circleArea, rectangleArea, polygonArea, ByteString.EMPTY);
        }

        public AdditionalData(String str, Long l, String str2, Coordinate coordinate, CircleArea circleArea, RectangleArea rectangleArea, PolygonArea polygonArea, ByteString byteString) {
            super(ADAPTER, byteString);
            if (Internal.countNonNull(coordinate, circleArea, rectangleArea, polygonArea, new Object[0]) <= 1) {
                this.extra = str;
                this.faq_id = l;
                this.faq_id_str = str2;
                this.point = coordinate;
                this.circle_area = circleArea;
                this.rectangle_area = rectangleArea;
                this.polygon_area = polygonArea;
                return;
            }
            throw new IllegalArgumentException("at most one of point, circle_area, rectangle_area, polygon_area may be non-null");
        }
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatRequest$b */
    private static final class C17255b extends ProtoAdapter<CreateOncallChatRequest> {
        C17255b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateOncallChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateOncallChatRequest createOncallChatRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, createOncallChatRequest.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, createOncallChatRequest.oncall_id);
            if (createOncallChatRequest.additional_data != null) {
                i = AdditionalData.ADAPTER.encodedSizeWithTag(3, createOncallChatRequest.additional_data);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + createOncallChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public CreateOncallChatRequest decode(ProtoReader protoReader) throws IOException {
            C17254a aVar = new C17254a();
            aVar.f44085a = "";
            aVar.f44086b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f44085a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f44086b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f44087c = AdditionalData.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateOncallChatRequest createOncallChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, createOncallChatRequest.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createOncallChatRequest.oncall_id);
            if (createOncallChatRequest.additional_data != null) {
                AdditionalData.ADAPTER.encodeWithTag(protoWriter, 3, createOncallChatRequest.additional_data);
            }
            protoWriter.writeBytes(createOncallChatRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C17254a newBuilder() {
        C17254a aVar = new C17254a();
        aVar.f44085a = this.user_id;
        aVar.f44086b = this.oncall_id;
        aVar.f44087c = this.additional_data;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.helpdesk.v1.CreateOncallChatRequest$a */
    public static final class C17254a extends Message.Builder<CreateOncallChatRequest, C17254a> {

        /* renamed from: a */
        public String f44085a;

        /* renamed from: b */
        public String f44086b;

        /* renamed from: c */
        public AdditionalData f44087c;

        /* renamed from: a */
        public CreateOncallChatRequest build() {
            String str;
            String str2 = this.f44085a;
            if (str2 != null && (str = this.f44086b) != null) {
                return new CreateOncallChatRequest(str2, str, this.f44087c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str2, "user_id", this.f44086b, "oncall_id");
        }

        /* renamed from: a */
        public C17254a mo60662a(AdditionalData additionalData) {
            this.f44087c = additionalData;
            return this;
        }

        /* renamed from: b */
        public C17254a mo60665b(String str) {
            this.f44086b = str;
            return this;
        }

        /* renamed from: a */
        public C17254a mo60663a(String str) {
            this.f44085a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("helpdesk", "CreateOncallChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", oncall_id=");
        sb.append(this.oncall_id);
        if (this.additional_data != null) {
            sb.append(", additional_data=");
            sb.append(this.additional_data);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateOncallChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public CreateOncallChatRequest(String str, String str2, AdditionalData additionalData) {
        this(str, str2, additionalData, ByteString.EMPTY);
    }

    public CreateOncallChatRequest(String str, String str2, AdditionalData additionalData, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_id = str;
        this.oncall_id = str2;
        this.additional_data = additionalData;
    }
}
