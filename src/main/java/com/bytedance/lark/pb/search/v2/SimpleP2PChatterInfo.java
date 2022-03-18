package com.bytedance.lark.pb.search.v2;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SimpleP2PChatterInfo extends Message<SimpleP2PChatterInfo, C19031a> {
    public static final ProtoAdapter<SimpleP2PChatterInfo> ADAPTER = new C19032b();
    public static final Boolean DEFAULT_CAN_JOIN_GROUP = true;
    public static final Boolean DEFAULT_IN_CONTACTS = true;
    public static final Boolean DEFAULT_IS_REGISTERED = false;
    public static final Chatter.Type DEFAULT_TYPE = Chatter.Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final Boolean can_join_group;
    public final String chatter_id;
    public final Boolean in_contacts;
    public final Boolean is_registered;
    public final String tenant_id;
    public final Chatter.Type type;
    public final String with_bot_tag;
    public final WorkStatus work_status;

    /* renamed from: com.bytedance.lark.pb.search.v2.SimpleP2PChatterInfo$b */
    private static final class C19032b extends ProtoAdapter<SimpleP2PChatterInfo> {
        C19032b() {
            super(FieldEncoding.LENGTH_DELIMITED, SimpleP2PChatterInfo.class);
        }

        /* renamed from: a */
        public int encodedSize(SimpleP2PChatterInfo simpleP2PChatterInfo) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, simpleP2PChatterInfo.chatter_id);
            int i7 = 0;
            if (simpleP2PChatterInfo.type != null) {
                i = Chatter.Type.ADAPTER.encodedSizeWithTag(2, simpleP2PChatterInfo.type);
            } else {
                i = 0;
            }
            int i8 = encodedSizeWithTag + i;
            if (simpleP2PChatterInfo.is_registered != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, simpleP2PChatterInfo.is_registered);
            } else {
                i2 = 0;
            }
            int i9 = i8 + i2;
            if (simpleP2PChatterInfo.tenant_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, simpleP2PChatterInfo.tenant_id);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (simpleP2PChatterInfo.with_bot_tag != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(5, simpleP2PChatterInfo.with_bot_tag);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (simpleP2PChatterInfo.can_join_group != null) {
                i5 = ProtoAdapter.BOOL.encodedSizeWithTag(6, simpleP2PChatterInfo.can_join_group);
            } else {
                i5 = 0;
            }
            int i12 = i11 + i5;
            if (simpleP2PChatterInfo.in_contacts != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(7, simpleP2PChatterInfo.in_contacts);
            } else {
                i6 = 0;
            }
            int i13 = i12 + i6;
            if (simpleP2PChatterInfo.work_status != null) {
                i7 = WorkStatus.ADAPTER.encodedSizeWithTag(8, simpleP2PChatterInfo.work_status);
            }
            return i13 + i7 + simpleP2PChatterInfo.unknownFields().size();
        }

        /* renamed from: a */
        public SimpleP2PChatterInfo decode(ProtoReader protoReader) throws IOException {
            C19031a aVar = new C19031a();
            aVar.f47088a = "";
            aVar.f47089b = Chatter.Type.UNKNOWN;
            aVar.f47090c = false;
            aVar.f47091d = "";
            aVar.f47092e = "bot";
            aVar.f47093f = true;
            aVar.f47094g = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f47088a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f47089b = Chatter.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            aVar.f47090c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f47091d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f47092e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f47093f = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            aVar.f47094g = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            aVar.f47095h = WorkStatus.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, SimpleP2PChatterInfo simpleP2PChatterInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, simpleP2PChatterInfo.chatter_id);
            if (simpleP2PChatterInfo.type != null) {
                Chatter.Type.ADAPTER.encodeWithTag(protoWriter, 2, simpleP2PChatterInfo.type);
            }
            if (simpleP2PChatterInfo.is_registered != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, simpleP2PChatterInfo.is_registered);
            }
            if (simpleP2PChatterInfo.tenant_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, simpleP2PChatterInfo.tenant_id);
            }
            if (simpleP2PChatterInfo.with_bot_tag != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, simpleP2PChatterInfo.with_bot_tag);
            }
            if (simpleP2PChatterInfo.can_join_group != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, simpleP2PChatterInfo.can_join_group);
            }
            if (simpleP2PChatterInfo.in_contacts != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, simpleP2PChatterInfo.in_contacts);
            }
            if (simpleP2PChatterInfo.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 8, simpleP2PChatterInfo.work_status);
            }
            protoWriter.writeBytes(simpleP2PChatterInfo.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.search.v2.SimpleP2PChatterInfo$a */
    public static final class C19031a extends Message.Builder<SimpleP2PChatterInfo, C19031a> {

        /* renamed from: a */
        public String f47088a;

        /* renamed from: b */
        public Chatter.Type f47089b;

        /* renamed from: c */
        public Boolean f47090c;

        /* renamed from: d */
        public String f47091d;

        /* renamed from: e */
        public String f47092e;

        /* renamed from: f */
        public Boolean f47093f;

        /* renamed from: g */
        public Boolean f47094g;

        /* renamed from: h */
        public WorkStatus f47095h;

        /* renamed from: a */
        public SimpleP2PChatterInfo build() {
            String str = this.f47088a;
            if (str != null) {
                return new SimpleP2PChatterInfo(str, this.f47089b, this.f47090c, this.f47091d, this.f47092e, this.f47093f, this.f47094g, this.f47095h, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "chatter_id");
        }
    }

    @Override // com.squareup.wire.Message
    public C19031a newBuilder() {
        C19031a aVar = new C19031a();
        aVar.f47088a = this.chatter_id;
        aVar.f47089b = this.type;
        aVar.f47090c = this.is_registered;
        aVar.f47091d = this.tenant_id;
        aVar.f47092e = this.with_bot_tag;
        aVar.f47093f = this.can_join_group;
        aVar.f47094g = this.in_contacts;
        aVar.f47095h = this.work_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("search", "SimpleP2PChatterInfo");
        StringBuilder sb = new StringBuilder();
        sb.append(", chatter_id=");
        sb.append(this.chatter_id);
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.is_registered != null) {
            sb.append(", is_registered=");
            sb.append(this.is_registered);
        }
        if (this.tenant_id != null) {
            sb.append(", tenant_id=");
            sb.append(this.tenant_id);
        }
        if (this.with_bot_tag != null) {
            sb.append(", with_bot_tag=");
            sb.append(this.with_bot_tag);
        }
        if (this.can_join_group != null) {
            sb.append(", can_join_group=");
            sb.append(this.can_join_group);
        }
        if (this.in_contacts != null) {
            sb.append(", in_contacts=");
            sb.append(this.in_contacts);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        StringBuilder replace = sb.replace(0, 2, "SimpleP2PChatterInfo{");
        replace.append('}');
        return replace.toString();
    }

    public SimpleP2PChatterInfo(String str, Chatter.Type type2, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, WorkStatus workStatus) {
        this(str, type2, bool, str2, str3, bool2, bool3, workStatus, ByteString.EMPTY);
    }

    public SimpleP2PChatterInfo(String str, Chatter.Type type2, Boolean bool, String str2, String str3, Boolean bool2, Boolean bool3, WorkStatus workStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chatter_id = str;
        this.type = type2;
        this.is_registered = bool;
        this.tenant_id = str2;
        this.with_bot_tag = str3;
        this.can_join_group = bool2;
        this.in_contacts = bool3;
        this.work_status = workStatus;
    }
}
