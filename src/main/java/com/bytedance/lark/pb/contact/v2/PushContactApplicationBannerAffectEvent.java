package com.bytedance.lark.pb.contact.v2;

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

public final class PushContactApplicationBannerAffectEvent extends Message<PushContactApplicationBannerAffectEvent, C16554a> {
    public static final ProtoAdapter<PushContactApplicationBannerAffectEvent> ADAPTER = new C16555b();
    public static final AffectEventType DEFAULT_EVENT_TYPE = AffectEventType.UnknownType;
    private static final long serialVersionUID = 0;
    public final AffectEventType event_type;
    public final List<String> target_user_ids;

    public enum AffectEventType implements WireEnum {
        UnknownType(0),
        Block(1),
        ContactApplication(2),
        ContactDidChange(3),
        BeBlock(4);
        
        public static final ProtoAdapter<AffectEventType> ADAPTER = ProtoAdapter.newEnumAdapter(AffectEventType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static AffectEventType fromValue(int i) {
            if (i == 0) {
                return UnknownType;
            }
            if (i == 1) {
                return Block;
            }
            if (i == 2) {
                return ContactApplication;
            }
            if (i == 3) {
                return ContactDidChange;
            }
            if (i != 4) {
                return null;
            }
            return BeBlock;
        }

        private AffectEventType(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.PushContactApplicationBannerAffectEvent$b */
    private static final class C16555b extends ProtoAdapter<PushContactApplicationBannerAffectEvent> {
        C16555b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushContactApplicationBannerAffectEvent.class);
        }

        /* renamed from: a */
        public int encodedSize(PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent) {
            return AffectEventType.ADAPTER.encodedSizeWithTag(1, pushContactApplicationBannerAffectEvent.event_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, pushContactApplicationBannerAffectEvent.target_user_ids) + pushContactApplicationBannerAffectEvent.unknownFields().size();
        }

        /* renamed from: a */
        public PushContactApplicationBannerAffectEvent decode(ProtoReader protoReader) throws IOException {
            C16554a aVar = new C16554a();
            aVar.f42922a = AffectEventType.UnknownType;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f42922a = AffectEventType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42923b.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, PushContactApplicationBannerAffectEvent pushContactApplicationBannerAffectEvent) throws IOException {
            AffectEventType.ADAPTER.encodeWithTag(protoWriter, 1, pushContactApplicationBannerAffectEvent.event_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, pushContactApplicationBannerAffectEvent.target_user_ids);
            protoWriter.writeBytes(pushContactApplicationBannerAffectEvent.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v2.PushContactApplicationBannerAffectEvent$a */
    public static final class C16554a extends Message.Builder<PushContactApplicationBannerAffectEvent, C16554a> {

        /* renamed from: a */
        public AffectEventType f42922a;

        /* renamed from: b */
        public List<String> f42923b = Internal.newMutableList();

        /* renamed from: a */
        public PushContactApplicationBannerAffectEvent build() {
            AffectEventType affectEventType = this.f42922a;
            if (affectEventType != null) {
                return new PushContactApplicationBannerAffectEvent(affectEventType, this.f42923b, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(affectEventType, "event_type");
        }
    }

    @Override // com.squareup.wire.Message
    public C16554a newBuilder() {
        C16554a aVar = new C16554a();
        aVar.f42922a = this.event_type;
        aVar.f42923b = Internal.copyOf("target_user_ids", this.target_user_ids);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "PushContactApplicationBannerAffectEvent");
        StringBuilder sb = new StringBuilder();
        sb.append(", event_type=");
        sb.append(this.event_type);
        if (!this.target_user_ids.isEmpty()) {
            sb.append(", target_user_ids=");
            sb.append(this.target_user_ids);
        }
        StringBuilder replace = sb.replace(0, 2, "PushContactApplicationBannerAffectEvent{");
        replace.append('}');
        return replace.toString();
    }

    public PushContactApplicationBannerAffectEvent(AffectEventType affectEventType, List<String> list) {
        this(affectEventType, list, ByteString.EMPTY);
    }

    public PushContactApplicationBannerAffectEvent(AffectEventType affectEventType, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.event_type = affectEventType;
        this.target_user_ids = Internal.immutableCopyOf("target_user_ids", list);
    }
}
