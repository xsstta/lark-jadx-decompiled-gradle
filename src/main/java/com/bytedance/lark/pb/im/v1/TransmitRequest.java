package com.bytedance.lark.pb.im.v1;

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

public final class TransmitRequest extends Message<TransmitRequest, C18115a> {
    public static final ProtoAdapter<TransmitRequest> ADAPTER = new C18116b();
    public static final Type DEFAULT_TYPE = Type.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> chat_ids;
    public final String file_key;
    public final String id;
    public final String origin_merge_forward_id;
    public final List<Transmit2ThreadTarget> thread_targets;
    public final Type type;

    public enum Type implements WireEnum {
        UNKNOWN(0),
        MESSAGE(1),
        FAVORITE(2);
        
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
                return MESSAGE;
            }
            if (i != 2) {
                return null;
            }
            return FAVORITE;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TransmitRequest$b */
    private static final class C18116b extends ProtoAdapter<TransmitRequest> {
        C18116b() {
            super(FieldEncoding.LENGTH_DELIMITED, TransmitRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(TransmitRequest transmitRequest) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, transmitRequest.chat_ids) + ProtoAdapter.STRING.encodedSizeWithTag(2, transmitRequest.id) + Type.ADAPTER.encodedSizeWithTag(3, transmitRequest.type) + Transmit2ThreadTarget.ADAPTER.asRepeated().encodedSizeWithTag(4, transmitRequest.thread_targets);
            int i2 = 0;
            if (transmitRequest.file_key != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(5, transmitRequest.file_key);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (transmitRequest.origin_merge_forward_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(6, transmitRequest.origin_merge_forward_id);
            }
            return i3 + i2 + transmitRequest.unknownFields().size();
        }

        /* renamed from: a */
        public TransmitRequest decode(ProtoReader protoReader) throws IOException {
            C18115a aVar = new C18115a();
            aVar.f45267b = "";
            aVar.f45268c = Type.UNKNOWN;
            aVar.f45270e = "";
            aVar.f45271f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f45266a.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            aVar.f45267b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            try {
                                aVar.f45268c = Type.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 4:
                            aVar.f45269d.add(Transmit2ThreadTarget.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            aVar.f45270e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f45271f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, TransmitRequest transmitRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, transmitRequest.chat_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, transmitRequest.id);
            Type.ADAPTER.encodeWithTag(protoWriter, 3, transmitRequest.type);
            Transmit2ThreadTarget.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, transmitRequest.thread_targets);
            if (transmitRequest.file_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, transmitRequest.file_key);
            }
            if (transmitRequest.origin_merge_forward_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, transmitRequest.origin_merge_forward_id);
            }
            protoWriter.writeBytes(transmitRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.im.v1.TransmitRequest$a */
    public static final class C18115a extends Message.Builder<TransmitRequest, C18115a> {

        /* renamed from: a */
        public List<String> f45266a = Internal.newMutableList();

        /* renamed from: b */
        public String f45267b;

        /* renamed from: c */
        public Type f45268c;

        /* renamed from: d */
        public List<Transmit2ThreadTarget> f45269d = Internal.newMutableList();

        /* renamed from: e */
        public String f45270e;

        /* renamed from: f */
        public String f45271f;

        /* renamed from: a */
        public TransmitRequest build() {
            Type type;
            String str = this.f45267b;
            if (str != null && (type = this.f45268c) != null) {
                return new TransmitRequest(this.f45266a, str, type, this.f45269d, this.f45270e, this.f45271f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id", this.f45268c, ShareHitPoint.f121869d);
        }

        /* renamed from: a */
        public C18115a mo62835a(Type type) {
            this.f45268c = type;
            return this;
        }

        /* renamed from: b */
        public C18115a mo62839b(String str) {
            this.f45271f = str;
            return this;
        }

        /* renamed from: a */
        public C18115a mo62836a(String str) {
            this.f45267b = str;
            return this;
        }

        /* renamed from: b */
        public C18115a mo62840b(List<Transmit2ThreadTarget> list) {
            Internal.checkElementsNotNull(list);
            this.f45269d = list;
            return this;
        }

        /* renamed from: a */
        public C18115a mo62837a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f45266a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18115a newBuilder() {
        C18115a aVar = new C18115a();
        aVar.f45266a = Internal.copyOf("chat_ids", this.chat_ids);
        aVar.f45267b = this.id;
        aVar.f45268c = this.type;
        aVar.f45269d = Internal.copyOf("thread_targets", this.thread_targets);
        aVar.f45270e = this.file_key;
        aVar.f45271f = this.origin_merge_forward_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("im", "TransmitRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.chat_ids.isEmpty()) {
            sb.append(", chat_ids=");
            sb.append(this.chat_ids);
        }
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        if (!this.thread_targets.isEmpty()) {
            sb.append(", thread_targets=");
            sb.append(this.thread_targets);
        }
        if (this.file_key != null) {
            sb.append(", file_key=");
            sb.append(this.file_key);
        }
        if (this.origin_merge_forward_id != null) {
            sb.append(", origin_merge_forward_id=");
            sb.append(this.origin_merge_forward_id);
        }
        StringBuilder replace = sb.replace(0, 2, "TransmitRequest{");
        replace.append('}');
        return replace.toString();
    }

    public TransmitRequest(List<String> list, String str, Type type2, List<Transmit2ThreadTarget> list2, String str2, String str3) {
        this(list, str, type2, list2, str2, str3, ByteString.EMPTY);
    }

    public TransmitRequest(List<String> list, String str, Type type2, List<Transmit2ThreadTarget> list2, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.chat_ids = Internal.immutableCopyOf("chat_ids", list);
        this.id = str;
        this.type = type2;
        this.thread_targets = Internal.immutableCopyOf("thread_targets", list2);
        this.file_key = str2;
        this.origin_merge_forward_id = str3;
    }
}
