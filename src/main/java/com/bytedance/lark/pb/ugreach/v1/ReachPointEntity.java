package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ReachPointEntity extends Message<ReachPointEntity, C19795a> {
    public static final ProtoAdapter<ReachPointEntity> ADAPTER = new C19796b();
    private static final long serialVersionUID = 0;
    public final ReachPointConfig config;
    public final List<ReachPointMaterial> material;
    public final String reach_point_id;
    public final String scenario_id;
    public final String type;

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointEntity$b */
    private static final class C19796b extends ProtoAdapter<ReachPointEntity> {
        C19796b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReachPointEntity.class);
        }

        /* renamed from: a */
        public int encodedSize(ReachPointEntity reachPointEntity) {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (reachPointEntity.reach_point_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, reachPointEntity.reach_point_id);
            } else {
                i = 0;
            }
            if (reachPointEntity.scenario_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, reachPointEntity.scenario_id);
            } else {
                i2 = 0;
            }
            int i5 = i + i2;
            if (reachPointEntity.type != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, reachPointEntity.type);
            } else {
                i3 = 0;
            }
            int i6 = i5 + i3;
            if (reachPointEntity.config != null) {
                i4 = ReachPointConfig.ADAPTER.encodedSizeWithTag(4, reachPointEntity.config);
            }
            return i6 + i4 + ReachPointMaterial.ADAPTER.asRepeated().encodedSizeWithTag(5, reachPointEntity.material) + reachPointEntity.unknownFields().size();
        }

        /* renamed from: a */
        public ReachPointEntity decode(ProtoReader protoReader) throws IOException {
            C19795a aVar = new C19795a();
            aVar.f48258a = "";
            aVar.f48259b = "";
            aVar.f48260c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f48258a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f48259b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f48260c = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f48261d = ReachPointConfig.ADAPTER.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f48262e.add(ReachPointMaterial.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ReachPointEntity reachPointEntity) throws IOException {
            if (reachPointEntity.reach_point_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reachPointEntity.reach_point_id);
            }
            if (reachPointEntity.scenario_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, reachPointEntity.scenario_id);
            }
            if (reachPointEntity.type != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, reachPointEntity.type);
            }
            if (reachPointEntity.config != null) {
                ReachPointConfig.ADAPTER.encodeWithTag(protoWriter, 4, reachPointEntity.config);
            }
            ReachPointMaterial.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, reachPointEntity.material);
            protoWriter.writeBytes(reachPointEntity.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointEntity$a */
    public static final class C19795a extends Message.Builder<ReachPointEntity, C19795a> {

        /* renamed from: a */
        public String f48258a;

        /* renamed from: b */
        public String f48259b;

        /* renamed from: c */
        public String f48260c;

        /* renamed from: d */
        public ReachPointConfig f48261d;

        /* renamed from: e */
        public List<ReachPointMaterial> f48262e = Internal.newMutableList();

        /* renamed from: a */
        public ReachPointEntity build() {
            return new ReachPointEntity(this.f48258a, this.f48259b, this.f48260c, this.f48261d, this.f48262e, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19795a newBuilder() {
        C19795a aVar = new C19795a();
        aVar.f48258a = this.reach_point_id;
        aVar.f48259b = this.scenario_id;
        aVar.f48260c = this.type;
        aVar.f48261d = this.config;
        aVar.f48262e = Internal.copyOf("material", this.material);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "ReachPointEntity");
        StringBuilder sb = new StringBuilder();
        if (this.reach_point_id != null) {
            sb.append(", reach_point_id=");
            sb.append(this.reach_point_id);
        }
        if (this.scenario_id != null) {
            sb.append(", scenario_id=");
            sb.append(this.scenario_id);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        if (!this.material.isEmpty()) {
            sb.append(", material=");
            sb.append(this.material);
        }
        StringBuilder replace = sb.replace(0, 2, "ReachPointEntity{");
        replace.append('}');
        return replace.toString();
    }

    public ReachPointEntity(String str, String str2, String str3, ReachPointConfig reachPointConfig, List<ReachPointMaterial> list) {
        this(str, str2, str3, reachPointConfig, list, ByteString.EMPTY);
    }

    public ReachPointEntity(String str, String str2, String str3, ReachPointConfig reachPointConfig, List<ReachPointMaterial> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reach_point_id = str;
        this.scenario_id = str2;
        this.type = str3;
        this.config = reachPointConfig;
        this.material = Internal.immutableCopyOf("material", list);
    }
}
