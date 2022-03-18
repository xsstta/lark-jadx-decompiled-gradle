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
import java.util.List;
import okio.ByteString;

public final class FollowGrootCellPayload extends Message<FollowGrootCellPayload, C50567a> {
    public static final ProtoAdapter<FollowGrootCellPayload> ADAPTER = new C50568b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<FollowPatch> patches;
    public final List<FollowState> states;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        PATCHES(1),
        STATES(2);
        
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
                return PATCHES;
            }
            if (i != 2) {
                return null;
            }
            return STATES;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowGrootCellPayload$b */
    private static final class C50568b extends ProtoAdapter<FollowGrootCellPayload> {
        C50568b() {
            super(FieldEncoding.LENGTH_DELIMITED, FollowGrootCellPayload.class);
        }

        /* renamed from: a */
        public int encodedSize(FollowGrootCellPayload followGrootCellPayload) {
            return Type.ADAPTER.encodedSizeWithTag(1, followGrootCellPayload.type) + FollowPatch.ADAPTER.asRepeated().encodedSizeWithTag(2, followGrootCellPayload.patches) + FollowState.ADAPTER.asRepeated().encodedSizeWithTag(3, followGrootCellPayload.states) + followGrootCellPayload.unknownFields().size();
        }

        /* renamed from: a */
        public FollowGrootCellPayload decode(ProtoReader protoReader) throws IOException {
            C50567a aVar = new C50567a();
            aVar.f126224a = Type.UNKNOWN;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f126224a = Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f126225b.add(FollowPatch.ADAPTER.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126226c.add(FollowState.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, FollowGrootCellPayload followGrootCellPayload) throws IOException {
            Type.ADAPTER.encodeWithTag(protoWriter, 1, followGrootCellPayload.type);
            FollowPatch.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, followGrootCellPayload.patches);
            FollowState.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, followGrootCellPayload.states);
            protoWriter.writeBytes(followGrootCellPayload.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.FollowGrootCellPayload$a */
    public static final class C50567a extends Message.Builder<FollowGrootCellPayload, C50567a> {

        /* renamed from: a */
        public Type f126224a;

        /* renamed from: b */
        public List<FollowPatch> f126225b = Internal.newMutableList();

        /* renamed from: c */
        public List<FollowState> f126226c = Internal.newMutableList();

        /* renamed from: a */
        public FollowGrootCellPayload build() {
            Type type = this.f126224a;
            if (type != null) {
                return new FollowGrootCellPayload(type, this.f126225b, this.f126226c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(type, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C50567a mo175083a(Type type) {
            this.f126224a = type;
            return this;
        }

        /* renamed from: a */
        public C50567a mo175084a(List<FollowPatch> list) {
            Internal.checkElementsNotNull(list);
            this.f126225b = list;
            return this;
        }

        /* renamed from: b */
        public C50567a mo175086b(List<FollowState> list) {
            Internal.checkElementsNotNull(list);
            this.f126226c = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50567a newBuilder() {
        C50567a aVar = new C50567a();
        aVar.f126224a = this.type;
        aVar.f126225b = Internal.copyOf("patches", this.patches);
        aVar.f126226c = Internal.copyOf("states", this.states);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "FollowGrootCellPayload");
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.type);
        if (!this.patches.isEmpty()) {
            sb.append(", patches=");
            sb.append(this.patches);
        }
        if (!this.states.isEmpty()) {
            sb.append(", states=");
            sb.append(this.states);
        }
        StringBuilder replace = sb.replace(0, 2, "FollowGrootCellPayload{");
        replace.append('}');
        return replace.toString();
    }

    public FollowGrootCellPayload(Type type2, List<FollowPatch> list, List<FollowState> list2) {
        this(type2, list, list2, ByteString.EMPTY);
    }

    public FollowGrootCellPayload(Type type2, List<FollowPatch> list, List<FollowState> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = type2;
        this.patches = Internal.immutableCopyOf("patches", list);
        this.states = Internal.immutableCopyOf("states", list2);
    }
}
