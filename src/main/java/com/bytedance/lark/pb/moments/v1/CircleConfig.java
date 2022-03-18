package com.bytedance.lark.pb.moments.v1;

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

public final class CircleConfig extends Message<CircleConfig, C18334a> {
    public static final ProtoAdapter<CircleConfig> ADAPTER = new C18335b();
    private static final long serialVersionUID = 0;
    public final List<String> admin_user_ids;
    public final AnonymityPolicy anonymity_policy;

    /* renamed from: com.bytedance.lark.pb.moments.v1.CircleConfig$b */
    private static final class C18335b extends ProtoAdapter<CircleConfig> {
        C18335b() {
            super(FieldEncoding.LENGTH_DELIMITED, CircleConfig.class);
        }

        /* renamed from: a */
        public int encodedSize(CircleConfig circleConfig) {
            int i;
            int encodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, circleConfig.admin_user_ids);
            if (circleConfig.anonymity_policy != null) {
                i = AnonymityPolicy.ADAPTER.encodedSizeWithTag(2, circleConfig.anonymity_policy);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + circleConfig.unknownFields().size();
        }

        /* renamed from: a */
        public CircleConfig decode(ProtoReader protoReader) throws IOException {
            C18334a aVar = new C18334a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f45665a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f45666b = AnonymityPolicy.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CircleConfig circleConfig) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, circleConfig.admin_user_ids);
            if (circleConfig.anonymity_policy != null) {
                AnonymityPolicy.ADAPTER.encodeWithTag(protoWriter, 2, circleConfig.anonymity_policy);
            }
            protoWriter.writeBytes(circleConfig.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.moments.v1.CircleConfig$a */
    public static final class C18334a extends Message.Builder<CircleConfig, C18334a> {

        /* renamed from: a */
        public List<String> f45665a = Internal.newMutableList();

        /* renamed from: b */
        public AnonymityPolicy f45666b;

        /* renamed from: a */
        public CircleConfig build() {
            return new CircleConfig(this.f45665a, this.f45666b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18334a newBuilder() {
        C18334a aVar = new C18334a();
        aVar.f45665a = Internal.copyOf("admin_user_ids", this.admin_user_ids);
        aVar.f45666b = this.anonymity_policy;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("moments", "CircleConfig");
        StringBuilder sb = new StringBuilder();
        if (!this.admin_user_ids.isEmpty()) {
            sb.append(", admin_user_ids=");
            sb.append(this.admin_user_ids);
        }
        if (this.anonymity_policy != null) {
            sb.append(", anonymity_policy=");
            sb.append(this.anonymity_policy);
        }
        StringBuilder replace = sb.replace(0, 2, "CircleConfig{");
        replace.append('}');
        return replace.toString();
    }

    public CircleConfig(List<String> list, AnonymityPolicy anonymityPolicy) {
        this(list, anonymityPolicy, ByteString.EMPTY);
    }

    public CircleConfig(List<String> list, AnonymityPolicy anonymityPolicy, ByteString byteString) {
        super(ADAPTER, byteString);
        this.admin_user_ids = Internal.immutableCopyOf("admin_user_ids", list);
        this.anonymity_policy = anonymityPolicy;
    }
}
