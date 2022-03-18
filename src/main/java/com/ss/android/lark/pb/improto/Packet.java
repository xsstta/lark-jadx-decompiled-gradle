package com.ss.android.lark.pb.improto;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.location.LocationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class Packet extends Message<Packet, C49811a> {
    public static final ProtoAdapter<Packet> ADAPTER = new C49812b();
    public static final Integer DEFAULT_COMMAND = 0;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
    public static final Integer DEFAULT_STATUS = Integer.valueOf((int) LocationRequest.PRIORITY_HD_ACCURACY);
    public static final Integer DEFAULT_WAIT_RETRY_INTERVAL = 0;
    private static final long serialVersionUID = 0;
    public final String mcid;
    public final Command mcmd;
    public final Integer mcommand;
    public final Long mcursor;
    public final ByteString mpayload;
    public final PayloadType mpayload_type;
    public final List<PipeEntity> mpipe_entities;
    public final PipeEntity mpipe_entity;
    public final String msid;
    public final Integer mstatus;
    public final List<VersionPayload> mversion_payloads;
    public final Integer mwait_retry_interval;

    public static final class VersionPayload extends Message<VersionPayload, C49809a> {
        public static final ProtoAdapter<VersionPayload> ADAPTER = new C49810b();
        public static final ByteString DEFAULT_PAYLOAD = ByteString.EMPTY;
        private static final long serialVersionUID = 0;
        public final ByteString mpayload;
        public final VersionRange mversion_range;

        /* renamed from: com.ss.android.lark.pb.improto.Packet$VersionPayload$b */
        private static final class C49810b extends ProtoAdapter<VersionPayload> {
            C49810b() {
                super(FieldEncoding.LENGTH_DELIMITED, VersionPayload.class);
            }

            /* renamed from: a */
            public int encodedSize(VersionPayload versionPayload) {
                return VersionRange.ADAPTER.encodedSizeWithTag(1, versionPayload.mversion_range) + ProtoAdapter.BYTES.encodedSizeWithTag(2, versionPayload.mpayload) + versionPayload.unknownFields().size();
            }

            /* renamed from: a */
            public VersionPayload decode(ProtoReader protoReader) throws IOException {
                C49809a aVar = new C49809a();
                aVar.f124740b = ByteString.EMPTY;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f124739a = VersionRange.ADAPTER.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f124740b = ProtoAdapter.BYTES.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, VersionPayload versionPayload) throws IOException {
                VersionRange.ADAPTER.encodeWithTag(protoWriter, 1, versionPayload.mversion_range);
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, versionPayload.mpayload);
                protoWriter.writeBytes(versionPayload.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C49809a newBuilder() {
            C49809a aVar = new C49809a();
            aVar.f124739a = this.mversion_range;
            aVar.f124740b = this.mpayload;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.improto.Packet$VersionPayload$a */
        public static final class C49809a extends Message.Builder<VersionPayload, C49809a> {

            /* renamed from: a */
            public VersionRange f124739a;

            /* renamed from: b */
            public ByteString f124740b;

            /* renamed from: a */
            public VersionPayload build() {
                ByteString byteString;
                VersionRange versionRange = this.f124739a;
                if (versionRange != null && (byteString = this.f124740b) != null) {
                    return new VersionPayload(versionRange, byteString, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(versionRange, "mversion_range", this.f124740b, "mpayload");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", version_range=");
            sb.append(this.mversion_range);
            sb.append(", payload=");
            sb.append(this.mpayload);
            StringBuilder replace = sb.replace(0, 2, "VersionPayload{");
            replace.append('}');
            return replace.toString();
        }

        public VersionPayload(VersionRange versionRange, ByteString byteString) {
            this(versionRange, byteString, ByteString.EMPTY);
        }

        public VersionPayload(VersionRange versionRange, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            this.mversion_range = versionRange;
            this.mpayload = byteString;
        }
    }

    /* renamed from: com.ss.android.lark.pb.improto.Packet$b */
    private static final class C49812b extends ProtoAdapter<Packet> {
        C49812b() {
            super(FieldEncoding.LENGTH_DELIMITED, Packet.class);
        }

        /* renamed from: a */
        public int encodedSize(Packet packet) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            if (packet.msid != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, packet.msid);
            } else {
                i = 0;
            }
            int encodedSizeWithTag = i + PayloadType.ADAPTER.encodedSizeWithTag(2, packet.mpayload_type) + Command.ADAPTER.encodedSizeWithTag(3, packet.mcmd);
            if (packet.mstatus != null) {
                i2 = ProtoAdapter.UINT32.encodedSizeWithTag(4, packet.mstatus);
            } else {
                i2 = 0;
            }
            int i9 = encodedSizeWithTag + i2;
            if (packet.mpayload != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(5, packet.mpayload);
            } else {
                i3 = 0;
            }
            int i10 = i9 + i3;
            if (packet.mcid != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(6, packet.mcid);
            } else {
                i4 = 0;
            }
            int i11 = i10 + i4;
            if (packet.mpipe_entity != null) {
                i5 = PipeEntity.ADAPTER.encodedSizeWithTag(7, packet.mpipe_entity);
            } else {
                i5 = 0;
            }
            int encodedSizeWithTag2 = i11 + i5 + VersionPayload.ADAPTER.asRepeated().encodedSizeWithTag(8, packet.mversion_payloads) + PipeEntity.ADAPTER.asRepeated().encodedSizeWithTag(9, packet.mpipe_entities);
            if (packet.mwait_retry_interval != null) {
                i6 = ProtoAdapter.UINT32.encodedSizeWithTag(10, packet.mwait_retry_interval);
            } else {
                i6 = 0;
            }
            int i12 = encodedSizeWithTag2 + i6;
            if (packet.mcommand != null) {
                i7 = ProtoAdapter.INT32.encodedSizeWithTag(11, packet.mcommand);
            } else {
                i7 = 0;
            }
            int i13 = i12 + i7;
            if (packet.mcursor != null) {
                i8 = ProtoAdapter.UINT64.encodedSizeWithTag(12, packet.mcursor);
            }
            return i13 + i8 + packet.unknownFields().size();
        }

        /* renamed from: a */
        public Packet decode(ProtoReader protoReader) throws IOException {
            C49811a aVar = new C49811a();
            aVar.f124741a = "";
            aVar.f124744d = Integer.valueOf((int) LocationRequest.PRIORITY_HD_ACCURACY);
            aVar.f124745e = ByteString.EMPTY;
            aVar.f124746f = "";
            aVar.f124750j = 0;
            aVar.f124751k = 0;
            aVar.f124752l = 0L;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f124741a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                aVar.f124742b = PayloadType.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 3:
                            try {
                                aVar.f124743c = Command.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                                break;
                            }
                        case 4:
                            aVar.f124744d = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 5:
                            aVar.f124745e = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 6:
                            aVar.f124746f = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            aVar.f124747g = PipeEntity.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            aVar.f124748h.add(VersionPayload.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            aVar.f124749i.add(PipeEntity.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            aVar.f124750j = ProtoAdapter.UINT32.decode(protoReader);
                            break;
                        case 11:
                            aVar.f124751k = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HwBuildEx.VersionCodes.EMUI_5_1:
                            aVar.f124752l = ProtoAdapter.UINT64.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, Packet packet) throws IOException {
            if (packet.msid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, packet.msid);
            }
            PayloadType.ADAPTER.encodeWithTag(protoWriter, 2, packet.mpayload_type);
            Command.ADAPTER.encodeWithTag(protoWriter, 3, packet.mcmd);
            if (packet.mstatus != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, packet.mstatus);
            }
            if (packet.mpayload != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 5, packet.mpayload);
            }
            if (packet.mcid != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, packet.mcid);
            }
            if (packet.mpipe_entity != null) {
                PipeEntity.ADAPTER.encodeWithTag(protoWriter, 7, packet.mpipe_entity);
            }
            VersionPayload.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, packet.mversion_payloads);
            PipeEntity.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, packet.mpipe_entities);
            if (packet.mwait_retry_interval != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 10, packet.mwait_retry_interval);
            }
            if (packet.mcommand != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 11, packet.mcommand);
            }
            if (packet.mcursor != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 12, packet.mcursor);
            }
            protoWriter.writeBytes(packet.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.improto.Packet$a */
    public static final class C49811a extends Message.Builder<Packet, C49811a> {

        /* renamed from: a */
        public String f124741a;

        /* renamed from: b */
        public PayloadType f124742b;

        /* renamed from: c */
        public Command f124743c;

        /* renamed from: d */
        public Integer f124744d;

        /* renamed from: e */
        public ByteString f124745e;

        /* renamed from: f */
        public String f124746f;

        /* renamed from: g */
        public PipeEntity f124747g;

        /* renamed from: h */
        public List<VersionPayload> f124748h = Internal.newMutableList();

        /* renamed from: i */
        public List<PipeEntity> f124749i = Internal.newMutableList();

        /* renamed from: j */
        public Integer f124750j;

        /* renamed from: k */
        public Integer f124751k;

        /* renamed from: l */
        public Long f124752l;

        /* renamed from: a */
        public Packet build() {
            Command command;
            PayloadType payloadType = this.f124742b;
            if (payloadType != null && (command = this.f124743c) != null) {
                return new Packet(this.f124741a, payloadType, command, this.f124744d, this.f124745e, this.f124746f, this.f124747g, this.f124748h, this.f124749i, this.f124750j, this.f124751k, this.f124752l, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(payloadType, "mpayload_type", this.f124743c, "mcmd");
        }

        /* renamed from: a */
        public C49811a mo173369a(Command command) {
            this.f124743c = command;
            return this;
        }

        /* renamed from: a */
        public C49811a mo173370a(PayloadType payloadType) {
            this.f124742b = payloadType;
            return this;
        }

        /* renamed from: a */
        public C49811a mo173371a(String str) {
            this.f124746f = str;
            return this;
        }

        /* renamed from: a */
        public C49811a mo173372a(ByteString byteString) {
            this.f124745e = byteString;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C49811a newBuilder() {
        C49811a aVar = new C49811a();
        aVar.f124741a = this.msid;
        aVar.f124742b = this.mpayload_type;
        aVar.f124743c = this.mcmd;
        aVar.f124744d = this.mstatus;
        aVar.f124745e = this.mpayload;
        aVar.f124746f = this.mcid;
        aVar.f124747g = this.mpipe_entity;
        aVar.f124748h = Internal.copyOf("mversion_payloads", this.mversion_payloads);
        aVar.f124749i = Internal.copyOf("mpipe_entities", this.mpipe_entities);
        aVar.f124750j = this.mwait_retry_interval;
        aVar.f124751k = this.mcommand;
        aVar.f124752l = this.mcursor;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msid != null) {
            sb.append(", sid=");
            sb.append(this.msid);
        }
        sb.append(", payload_type=");
        sb.append(this.mpayload_type);
        sb.append(", cmd=");
        sb.append(this.mcmd);
        if (this.mstatus != null) {
            sb.append(", status=");
            sb.append(this.mstatus);
        }
        if (this.mpayload != null) {
            sb.append(", payload=");
            sb.append(this.mpayload);
        }
        if (this.mcid != null) {
            sb.append(", cid=");
            sb.append(this.mcid);
        }
        if (this.mpipe_entity != null) {
            sb.append(", pipe_entity=");
            sb.append(this.mpipe_entity);
        }
        if (!this.mversion_payloads.isEmpty()) {
            sb.append(", version_payloads=");
            sb.append(this.mversion_payloads);
        }
        if (!this.mpipe_entities.isEmpty()) {
            sb.append(", pipe_entities=");
            sb.append(this.mpipe_entities);
        }
        if (this.mwait_retry_interval != null) {
            sb.append(", wait_retry_interval=");
            sb.append(this.mwait_retry_interval);
        }
        if (this.mcommand != null) {
            sb.append(", command=");
            sb.append(this.mcommand);
        }
        if (this.mcursor != null) {
            sb.append(", cursor=");
            sb.append(this.mcursor);
        }
        StringBuilder replace = sb.replace(0, 2, "Packet{");
        replace.append('}');
        return replace.toString();
    }

    public Packet(String str, PayloadType payloadType, Command command, Integer num, ByteString byteString, String str2, PipeEntity pipeEntity, List<VersionPayload> list, List<PipeEntity> list2, Integer num2, Integer num3, Long l) {
        this(str, payloadType, command, num, byteString, str2, pipeEntity, list, list2, num2, num3, l, ByteString.EMPTY);
    }

    public Packet(String str, PayloadType payloadType, Command command, Integer num, ByteString byteString, String str2, PipeEntity pipeEntity, List<VersionPayload> list, List<PipeEntity> list2, Integer num2, Integer num3, Long l, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.msid = str;
        this.mpayload_type = payloadType;
        this.mcmd = command;
        this.mstatus = num;
        this.mpayload = byteString;
        this.mcid = str2;
        this.mpipe_entity = pipeEntity;
        this.mversion_payloads = Internal.immutableCopyOf("mversion_payloads", list);
        this.mpipe_entities = Internal.immutableCopyOf("mpipe_entities", list2);
        this.mwait_retry_interval = num2;
        this.mcommand = num3;
        this.mcursor = l;
    }
}
