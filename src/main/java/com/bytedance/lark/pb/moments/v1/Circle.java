package com.bytedance.lark.pb.moments.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class Circle extends Message<Circle, C18332a> {
    public static final ProtoAdapter<Circle> ADAPTER = new C18333b();
    public static final Long DEFAULT_CREATE_TIME_SEC = 0L;
    private static final long serialVersionUID = 0;
    public final String announcement;
    public final CircleConfig config;
    public final Long create_time_sec;
    public final String description;
    public final String id;
    public final String name;
    public final Permission permission;
    public final String tenant_id;

    /* renamed from: com.bytedance.lark.pb.moments.v1.Circle$b */
    private static final class C18333b extends ProtoAdapter<Circle> {
        C18333b() {
            super(FieldEncoding.LENGTH_DELIMITED, Circle.class);
        }

        /* renamed from: a */
        public int encodedSize(Circle circle) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (circle.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, circle.id);
            } else {
                i = 0;
            }
            if (circle.tenant_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, circle.tenant_id);
            } else {
                i2 = 0;
            }
            int i9 = i + i2;
            if (circle.name != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, circle.name);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (circle.description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, circle.description);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (circle.announcement != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, circle.announcement);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (circle.create_time_sec != null) {
                i6 = ProtoAdapter.INT64.encodedSizeWithTag(6, circle.create_time_sec);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (circle.config != null) {
                i7 = CircleConfig.ADAPTER.encodedSizeWithTag(7, circle.config);
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (circle.permission != null) {
                i8 = Permission.ADAPTER.encodedSizeWithTag(8, circle.permission);
            }
            return i14 + i8 + circle.unknownFields().size();
        }

        /* renamed from: a */
        public Circle decode(ProtoReader protoReader) throws IOException {
            C18332a aVar = new C18332a();
            aVar.f45657a = "";
            aVar.f45658b = "";
            aVar.f45659c = "";
            aVar.f45660d = "";
            aVar.f45661e = "";
            aVar.f45662f = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45657a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f45658b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f45659c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f45660d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f45661e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45662f = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            aVar.f45663g = CircleConfig.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f45664h = Permission.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Circle circle) throws IOException {
            if (circle.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, circle.id);
            }
            if (circle.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, circle.tenant_id);
            }
            if (circle.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, circle.name);
            }
            if (circle.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, circle.description);
            }
            if (circle.announcement != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, circle.announcement);
            }
            if (circle.create_time_sec != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, circle.create_time_sec);
            }
            if (circle.config != null) {
                CircleConfig.ADAPTER.encodeWithTag(protoWriter, 7, circle.config);
            }
            if (circle.permission != null) {
                Permission.ADAPTER.encodeWithTag(protoWriter, 8, circle.permission);
            }
            protoWriter.writeBytes(circle.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.Circle$a */
    public static final class C18332a extends Message.Builder<Circle, C18332a> {

        /* renamed from: a */
        public String f45657a;

        /* renamed from: b */
        public String f45658b;

        /* renamed from: c */
        public String f45659c;

        /* renamed from: d */
        public String f45660d;

        /* renamed from: e */
        public String f45661e;

        /* renamed from: f */
        public Long f45662f;

        /* renamed from: g */
        public CircleConfig f45663g;

        /* renamed from: h */
        public Permission f45664h;

        /* renamed from: a */
        public Circle build() {
            return new Circle(this.f45657a, this.f45658b, this.f45659c, this.f45660d, this.f45661e, this.f45662f, this.f45663g, this.f45664h, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18332a newBuilder() {
        C18332a aVar = new C18332a();
        aVar.f45657a = this.id;
        aVar.f45658b = this.tenant_id;
        aVar.f45659c = this.name;
        aVar.f45660d = this.description;
        aVar.f45661e = this.announcement;
        aVar.f45662f = this.create_time_sec;
        aVar.f45663g = this.config;
        aVar.f45664h = this.permission;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "Circle");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.announcement != null) {
            sb.append(", announcement=");
            sb.append(this.announcement);
        }
        if (this.create_time_sec != null) {
            sb.append(", create_time_sec=");
            sb.append(this.create_time_sec);
        }
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        if (this.permission != null) {
            sb.append(", permission=");
            sb.append(this.permission);
        }
        StringBuilder replace = sb.replace(0, 2, "Circle{");
        replace.append('}');
        return replace.toString();
    }

    public Circle(String str, String str2, String str3, String str4, String str5, Long l, CircleConfig circleConfig, Permission permission2) {
        this(str, str2, str3, str4, str5, l, circleConfig, permission2, ByteString.EMPTY);
    }

    public Circle(String str, String str2, String str3, String str4, String str5, Long l, CircleConfig circleConfig, Permission permission2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.tenant_id = str2;
        this.name = str3;
        this.description = str4;
        this.announcement = str5;
        this.create_time_sec = l;
        this.config = circleConfig;
        this.permission = permission2;
    }
}
