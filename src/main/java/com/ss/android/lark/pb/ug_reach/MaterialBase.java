package com.ss.android.lark.pb.ug_reach;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class MaterialBase extends Message<MaterialBase, C50126a> {
    public static final ProtoAdapter<MaterialBase> ADAPTER = new C50127b();
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_TASK_ID = 0L;
    public static final Integer DEFAULT_VERSION = 0;
    private static final long serialVersionUID = 0;
    public final String mab_version;
    public final Long mid;
    public final String mkey;
    public final Long mtask_id;
    public final Integer mversion;

    /* renamed from: com.ss.android.lark.pb.ug_reach.MaterialBase$b */
    private static final class C50127b extends ProtoAdapter<MaterialBase> {
        C50127b() {
            super(FieldEncoding.LENGTH_DELIMITED, MaterialBase.class);
        }

        /* renamed from: a */
        public int encodedSize(MaterialBase materialBase) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (materialBase.mkey != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, materialBase.mkey);
            } else {
                i = 0;
            }
            if (materialBase.mid != null) {
                i2 = ProtoAdapter.INT64.encodedSizeWithTag(2, materialBase.mid);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (materialBase.mversion != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(3, materialBase.mversion);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (materialBase.mab_version != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, materialBase.mab_version);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (materialBase.mtask_id != null) {
                i5 = ProtoAdapter.INT64.encodedSizeWithTag(5, materialBase.mtask_id);
            }
            return i8 + i5 + materialBase.unknownFields().size();
        }

        /* renamed from: a */
        public MaterialBase decode(ProtoReader protoReader) throws IOException {
            C50126a aVar = new C50126a();
            aVar.f125280a = "";
            aVar.f125281b = 0L;
            aVar.f125282c = 0;
            aVar.f125283d = "";
            aVar.f125284e = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125280a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f125281b = ProtoAdapter.INT64.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f125282c = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f125283d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125284e = ProtoAdapter.INT64.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, MaterialBase materialBase) throws IOException {
            if (materialBase.mkey != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, materialBase.mkey);
            }
            if (materialBase.mid != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, materialBase.mid);
            }
            if (materialBase.mversion != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, materialBase.mversion);
            }
            if (materialBase.mab_version != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, materialBase.mab_version);
            }
            if (materialBase.mtask_id != null) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, materialBase.mtask_id);
            }
            protoWriter.writeBytes(materialBase.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug_reach.MaterialBase$a */
    public static final class C50126a extends Message.Builder<MaterialBase, C50126a> {

        /* renamed from: a */
        public String f125280a;

        /* renamed from: b */
        public Long f125281b;

        /* renamed from: c */
        public Integer f125282c;

        /* renamed from: d */
        public String f125283d;

        /* renamed from: e */
        public Long f125284e;

        /* renamed from: a */
        public MaterialBase build() {
            return new MaterialBase(this.f125280a, this.f125281b, this.f125282c, this.f125283d, this.f125284e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50126a newBuilder() {
        C50126a aVar = new C50126a();
        aVar.f125280a = this.mkey;
        aVar.f125281b = this.mid;
        aVar.f125282c = this.mversion;
        aVar.f125283d = this.mab_version;
        aVar.f125284e = this.mtask_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.mkey != null) {
            sb.append(", key=");
            sb.append(this.mkey);
        }
        if (this.mid != null) {
            sb.append(", id=");
            sb.append(this.mid);
        }
        if (this.mversion != null) {
            sb.append(", version=");
            sb.append(this.mversion);
        }
        if (this.mab_version != null) {
            sb.append(", ab_version=");
            sb.append(this.mab_version);
        }
        if (this.mtask_id != null) {
            sb.append(", task_id=");
            sb.append(this.mtask_id);
        }
        StringBuilder replace = sb.replace(0, 2, "MaterialBase{");
        replace.append('}');
        return replace.toString();
    }

    public MaterialBase(String str, Long l, Integer num, String str2, Long l2) {
        this(str, l, num, str2, l2, ByteString.EMPTY);
    }

    public MaterialBase(String str, Long l, Integer num, String str2, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mkey = str;
        this.mid = l;
        this.mversion = num;
        this.mab_version = str2;
        this.mtask_id = l2;
    }
}
