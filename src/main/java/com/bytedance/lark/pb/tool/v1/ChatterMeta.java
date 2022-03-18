package com.bytedance.lark.pb.tool.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class ChatterMeta extends Message<ChatterMeta, C19687a> {
    public static final ProtoAdapter<ChatterMeta> ADAPTER = new C19688b();
    public static final Chatter.Description.Type DEFAULT_DESCRIPTION_FLAG = Chatter.Description.Type.ON_DEFAULT;
    private static final long serialVersionUID = 0;
    public final String avatar_key;
    public final String description;
    public final Chatter.Description.Type description_flag;
    public final String id;
    public final String name;
    public final WorkStatus work_status;

    /* renamed from: com.bytedance.lark.pb.tool.v1.ChatterMeta$b */
    private static final class C19688b extends ProtoAdapter<ChatterMeta> {
        C19688b() {
            super(FieldEncoding.LENGTH_DELIMITED, ChatterMeta.class);
        }

        /* renamed from: a */
        public int encodedSize(ChatterMeta chatterMeta) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (chatterMeta.id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, chatterMeta.id);
            } else {
                i = 0;
            }
            if (chatterMeta.name != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, chatterMeta.name);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (chatterMeta.avatar_key != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, chatterMeta.avatar_key);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (chatterMeta.description != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, chatterMeta.description);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (chatterMeta.description_flag != null) {
                i5 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(5, chatterMeta.description_flag);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (chatterMeta.work_status != null) {
                i6 = WorkStatus.ADAPTER.encodedSizeWithTag(6, chatterMeta.work_status);
            }
            return i10 + i6 + chatterMeta.unknownFields().size();
        }

        /* renamed from: a */
        public ChatterMeta decode(ProtoReader protoReader) throws IOException {
            C19687a aVar = new C19687a();
            aVar.f48133a = "";
            aVar.f48134b = "";
            aVar.f48135c = "";
            aVar.f48136d = "";
            aVar.f48137e = Chatter.Description.Type.ON_DEFAULT;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48133a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f48134b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f48135c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f48136d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f48137e = Chatter.Description.Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f48138f = WorkStatus.ADAPTER.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ChatterMeta chatterMeta) throws IOException {
            if (chatterMeta.id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, chatterMeta.id);
            }
            if (chatterMeta.name != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, chatterMeta.name);
            }
            if (chatterMeta.avatar_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, chatterMeta.avatar_key);
            }
            if (chatterMeta.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, chatterMeta.description);
            }
            if (chatterMeta.description_flag != null) {
                Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 5, chatterMeta.description_flag);
            }
            if (chatterMeta.work_status != null) {
                WorkStatus.ADAPTER.encodeWithTag(protoWriter, 6, chatterMeta.work_status);
            }
            protoWriter.writeBytes(chatterMeta.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.tool.v1.ChatterMeta$a */
    public static final class C19687a extends Message.Builder<ChatterMeta, C19687a> {

        /* renamed from: a */
        public String f48133a;

        /* renamed from: b */
        public String f48134b;

        /* renamed from: c */
        public String f48135c;

        /* renamed from: d */
        public String f48136d;

        /* renamed from: e */
        public Chatter.Description.Type f48137e;

        /* renamed from: f */
        public WorkStatus f48138f;

        /* renamed from: a */
        public ChatterMeta build() {
            return new ChatterMeta(this.f48133a, this.f48134b, this.f48135c, this.f48136d, this.f48137e, this.f48138f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19687a newBuilder() {
        C19687a aVar = new C19687a();
        aVar.f48133a = this.id;
        aVar.f48134b = this.name;
        aVar.f48135c = this.avatar_key;
        aVar.f48136d = this.description;
        aVar.f48137e = this.description_flag;
        aVar.f48138f = this.work_status;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("tool", "ChatterMeta");
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_key != null) {
            sb.append(", avatar_key=");
            sb.append(this.avatar_key);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.description_flag != null) {
            sb.append(", description_flag=");
            sb.append(this.description_flag);
        }
        if (this.work_status != null) {
            sb.append(", work_status=");
            sb.append(this.work_status);
        }
        StringBuilder replace = sb.replace(0, 2, "ChatterMeta{");
        replace.append('}');
        return replace.toString();
    }

    public ChatterMeta(String str, String str2, String str3, String str4, Chatter.Description.Type type, WorkStatus workStatus) {
        this(str, str2, str3, str4, type, workStatus, ByteString.EMPTY);
    }

    public ChatterMeta(String str, String str2, String str3, String str4, Chatter.Description.Type type, WorkStatus workStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.name = str2;
        this.avatar_key = str3;
        this.description = str4;
        this.description_flag = type;
        this.work_status = workStatus;
    }
}
