package com.bytedance.lark.pb.basic.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class SetEnvRequest extends Message<SetEnvRequest, C15268a> {
    public static final ProtoAdapter<SetEnvRequest> ADAPTER = new C15269b();
    public static final InitSDKRequest.EnvType DEFAULT_ENV_TYPE = InitSDKRequest.EnvType.ONLINE;
    public static final Boolean DEFAULT_SHOULD_FETCH_DOMAINS_IF_ABSENT = true;
    private static final long serialVersionUID = 0;
    public final InitSDKRequest.EnvType env_type;
    public final InitSDKRequest.EnvV2 env_v2;
    public final Boolean should_fetch_domains_if_absent;

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetEnvRequest$b */
    private static final class C15269b extends ProtoAdapter<SetEnvRequest> {
        C15269b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetEnvRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetEnvRequest setEnvRequest) {
            int i;
            int encodedSizeWithTag = InitSDKRequest.EnvType.ADAPTER.encodedSizeWithTag(1, setEnvRequest.env_type);
            int i2 = 0;
            if (setEnvRequest.env_v2 != null) {
                i = InitSDKRequest.EnvV2.ADAPTER.encodedSizeWithTag(2, setEnvRequest.env_v2);
            } else {
                i = 0;
            }
            int i3 = encodedSizeWithTag + i;
            if (setEnvRequest.should_fetch_domains_if_absent != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(3, setEnvRequest.should_fetch_domains_if_absent);
            }
            return i3 + i2 + setEnvRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetEnvRequest decode(ProtoReader protoReader) throws IOException {
            C15268a aVar = new C15268a();
            aVar.f40468a = InitSDKRequest.EnvType.ONLINE;
            aVar.f40470c = true;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    try {
                        aVar.f40468a = InitSDKRequest.EnvType.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 2) {
                    aVar.f40469b = InitSDKRequest.EnvV2.ADAPTER.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f40470c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetEnvRequest setEnvRequest) throws IOException {
            InitSDKRequest.EnvType.ADAPTER.encodeWithTag(protoWriter, 1, setEnvRequest.env_type);
            if (setEnvRequest.env_v2 != null) {
                InitSDKRequest.EnvV2.ADAPTER.encodeWithTag(protoWriter, 2, setEnvRequest.env_v2);
            }
            if (setEnvRequest.should_fetch_domains_if_absent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, setEnvRequest.should_fetch_domains_if_absent);
            }
            protoWriter.writeBytes(setEnvRequest.unknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C15268a newBuilder() {
        C15268a aVar = new C15268a();
        aVar.f40468a = this.env_type;
        aVar.f40469b = this.env_v2;
        aVar.f40470c = this.should_fetch_domains_if_absent;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    /* renamed from: com.bytedance.lark.pb.basic.v1.SetEnvRequest$a */
    public static final class C15268a extends Message.Builder<SetEnvRequest, C15268a> {

        /* renamed from: a */
        public InitSDKRequest.EnvType f40468a;

        /* renamed from: b */
        public InitSDKRequest.EnvV2 f40469b;

        /* renamed from: c */
        public Boolean f40470c;

        /* renamed from: a */
        public SetEnvRequest build() {
            InitSDKRequest.EnvType envType = this.f40468a;
            if (envType != null) {
                return new SetEnvRequest(envType, this.f40469b, this.f40470c, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(envType, "env_type");
        }

        /* renamed from: a */
        public C15268a mo55574a(InitSDKRequest.EnvType envType) {
            this.f40468a = envType;
            return this;
        }

        /* renamed from: a */
        public C15268a mo55575a(InitSDKRequest.EnvV2 envV2) {
            this.f40469b = envV2;
            return this;
        }

        /* renamed from: a */
        public C15268a mo55576a(Boolean bool) {
            this.f40470c = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("basic", "SetEnvRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", env_type=");
        sb.append(this.env_type);
        if (this.env_v2 != null) {
            sb.append(", env_v2=");
            sb.append(this.env_v2);
        }
        if (this.should_fetch_domains_if_absent != null) {
            sb.append(", should_fetch_domains_if_absent=");
            sb.append(this.should_fetch_domains_if_absent);
        }
        StringBuilder replace = sb.replace(0, 2, "SetEnvRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetEnvRequest(InitSDKRequest.EnvType envType, InitSDKRequest.EnvV2 envV2, Boolean bool) {
        this(envType, envV2, bool, ByteString.EMPTY);
    }

    public SetEnvRequest(InitSDKRequest.EnvType envType, InitSDKRequest.EnvV2 envV2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.env_type = envType;
        this.env_v2 = envV2;
        this.should_fetch_domains_if_absent = bool;
    }
}
