package com.bytedance.lark.pb.ugreach.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ReachPointRelation extends Message<ReachPointRelation, C19799a> {
    public static final ProtoAdapter<ReachPointRelation> ADAPTER = new C19800b();
    public static final DefenseStrategy DEFAULT_DEFENSE_STRATEGY = DefenseStrategy.UNKNOWN;
    public static final Boolean DEFAULT_IS_CONFLICT = false;
    public static final Boolean DEFAULT_NEED_GRAB = false;
    public static final Integer DEFAULT_PRIORITY = 0;
    public static final Integer DEFAULT_TTL = 0;
    private static final long serialVersionUID = 0;
    public final List<String> child_ids;
    public final DefenseStrategy defense_strategy;
    public final Boolean is_conflict;
    public final Boolean need_grab;
    public final String parent_id;
    public final Integer priority;
    public final Integer ttl;

    public enum DefenseStrategy implements WireEnum {
        UNKNOWN(0),
        ROUNDABOUT(1),
        GIVE_UP(2);
        
        public static final ProtoAdapter<DefenseStrategy> ADAPTER = ProtoAdapter.newEnumAdapter(DefenseStrategy.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static DefenseStrategy fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ROUNDABOUT;
            }
            if (i != 2) {
                return null;
            }
            return GIVE_UP;
        }

        private DefenseStrategy(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointRelation$b */
    private static final class C19800b extends ProtoAdapter<ReachPointRelation> {
        C19800b() {
            super(FieldEncoding.LENGTH_DELIMITED, ReachPointRelation.class);
        }

        /* renamed from: a */
        public int encodedSize(ReachPointRelation reachPointRelation) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (reachPointRelation.parent_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, reachPointRelation.parent_id);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, reachPointRelation.child_ids);
            if (reachPointRelation.is_conflict != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, reachPointRelation.is_conflict);
            } else {
                i2 = 0;
            }
            int i7 = encodedSizeWithTag + i2;
            if (reachPointRelation.priority != null) {
                i3 = ProtoAdapter.INT32.encodedSizeWithTag(4, reachPointRelation.priority);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (reachPointRelation.need_grab != null) {
                i4 = ProtoAdapter.BOOL.encodedSizeWithTag(5, reachPointRelation.need_grab);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (reachPointRelation.ttl != null) {
                i5 = ProtoAdapter.INT32.encodedSizeWithTag(6, reachPointRelation.ttl);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (reachPointRelation.defense_strategy != null) {
                i6 = DefenseStrategy.ADAPTER.encodedSizeWithTag(7, reachPointRelation.defense_strategy);
            }
            return i10 + i6 + reachPointRelation.unknownFields().size();
        }

        /* renamed from: a */
        public ReachPointRelation decode(ProtoReader protoReader) throws IOException {
            C19799a aVar = new C19799a();
            aVar.f48266a = "";
            aVar.f48268c = false;
            aVar.f48269d = 0;
            aVar.f48270e = false;
            aVar.f48271f = 0;
            aVar.f48272g = DefenseStrategy.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f48266a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f48267b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f48268c = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            aVar.f48269d = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f48270e = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            aVar.f48271f = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            try {
                                aVar.f48272g = DefenseStrategy.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
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
        public void encode(ProtoWriter protoWriter, ReachPointRelation reachPointRelation) throws IOException {
            if (reachPointRelation.parent_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, reachPointRelation.parent_id);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, reachPointRelation.child_ids);
            if (reachPointRelation.is_conflict != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, reachPointRelation.is_conflict);
            }
            if (reachPointRelation.priority != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, reachPointRelation.priority);
            }
            if (reachPointRelation.need_grab != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, reachPointRelation.need_grab);
            }
            if (reachPointRelation.ttl != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, reachPointRelation.ttl);
            }
            if (reachPointRelation.defense_strategy != null) {
                DefenseStrategy.ADAPTER.encodeWithTag(protoWriter, 7, reachPointRelation.defense_strategy);
            }
            protoWriter.writeBytes(reachPointRelation.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ugreach.v1.ReachPointRelation$a */
    public static final class C19799a extends Message.Builder<ReachPointRelation, C19799a> {

        /* renamed from: a */
        public String f48266a;

        /* renamed from: b */
        public List<String> f48267b = Internal.newMutableList();

        /* renamed from: c */
        public Boolean f48268c;

        /* renamed from: d */
        public Integer f48269d;

        /* renamed from: e */
        public Boolean f48270e;

        /* renamed from: f */
        public Integer f48271f;

        /* renamed from: g */
        public DefenseStrategy f48272g;

        /* renamed from: a */
        public ReachPointRelation build() {
            return new ReachPointRelation(this.f48266a, this.f48267b, this.f48268c, this.f48269d, this.f48270e, this.f48271f, this.f48272g, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19799a newBuilder() {
        C19799a aVar = new C19799a();
        aVar.f48266a = this.parent_id;
        aVar.f48267b = Internal.copyOf("child_ids", this.child_ids);
        aVar.f48268c = this.is_conflict;
        aVar.f48269d = this.priority;
        aVar.f48270e = this.need_grab;
        aVar.f48271f = this.ttl;
        aVar.f48272g = this.defense_strategy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ugreach", "ReachPointRelation");
        StringBuilder sb = new StringBuilder();
        if (this.parent_id != null) {
            sb.append(", parent_id=");
            sb.append(this.parent_id);
        }
        if (!this.child_ids.isEmpty()) {
            sb.append(", child_ids=");
            sb.append(this.child_ids);
        }
        if (this.is_conflict != null) {
            sb.append(", is_conflict=");
            sb.append(this.is_conflict);
        }
        if (this.priority != null) {
            sb.append(", priority=");
            sb.append(this.priority);
        }
        if (this.need_grab != null) {
            sb.append(", need_grab=");
            sb.append(this.need_grab);
        }
        if (this.ttl != null) {
            sb.append(", ttl=");
            sb.append(this.ttl);
        }
        if (this.defense_strategy != null) {
            sb.append(", defense_strategy=");
            sb.append(this.defense_strategy);
        }
        StringBuilder replace = sb.replace(0, 2, "ReachPointRelation{");
        replace.append('}');
        return replace.toString();
    }

    public ReachPointRelation(String str, List<String> list, Boolean bool, Integer num, Boolean bool2, Integer num2, DefenseStrategy defenseStrategy) {
        this(str, list, bool, num, bool2, num2, defenseStrategy, ByteString.EMPTY);
    }

    public ReachPointRelation(String str, List<String> list, Boolean bool, Integer num, Boolean bool2, Integer num2, DefenseStrategy defenseStrategy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent_id = str;
        this.child_ids = Internal.immutableCopyOf("child_ids", list);
        this.is_conflict = bool;
        this.priority = num;
        this.need_grab = bool2;
        this.ttl = num2;
        this.defense_strategy = defenseStrategy;
    }
}
