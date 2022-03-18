package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

public final class GetBotControlInfoRequest extends Message<GetBotControlInfoRequest, C18653a> {
    public static final ProtoAdapter<GetBotControlInfoRequest> ADAPTER = new C18654b();
    public static final GetDataStrategy DEFAULT_STRATEGY = GetDataStrategy.LocalOnly;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String bot_id;
    public final GetDataStrategy strategy;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoRequest$b */
    private static final class C18654b extends ProtoAdapter<GetBotControlInfoRequest> {
        C18654b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetBotControlInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetBotControlInfoRequest getBotControlInfoRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getBotControlInfoRequest.strategy != null) {
                i = GetDataStrategy.ADAPTER.encodedSizeWithTag(3, getBotControlInfoRequest.strategy);
            } else {
                i = 0;
            }
            if (getBotControlInfoRequest.app_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(1, getBotControlInfoRequest.app_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getBotControlInfoRequest.bot_id != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(2, getBotControlInfoRequest.bot_id);
            }
            return i4 + i3 + getBotControlInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetBotControlInfoRequest decode(ProtoReader protoReader) throws IOException {
            C18653a aVar = new C18653a();
            aVar.f46177a = GetDataStrategy.LocalOnly;
            aVar.mo64227a("");
            aVar.mo64229b("");
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.mo64227a(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    aVar.mo64229b(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f46177a = GetDataStrategy.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetBotControlInfoRequest getBotControlInfoRequest) throws IOException {
            if (getBotControlInfoRequest.strategy != null) {
                GetDataStrategy.ADAPTER.encodeWithTag(protoWriter, 3, getBotControlInfoRequest.strategy);
            }
            if (getBotControlInfoRequest.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getBotControlInfoRequest.app_id);
            }
            if (getBotControlInfoRequest.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getBotControlInfoRequest.bot_id);
            }
            protoWriter.writeBytes(getBotControlInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoRequest$a */
    public static final class C18653a extends Message.Builder<GetBotControlInfoRequest, C18653a> {

        /* renamed from: a */
        public GetDataStrategy f46177a;

        /* renamed from: b */
        public String f46178b;

        /* renamed from: c */
        public String f46179c;

        /* renamed from: a */
        public GetBotControlInfoRequest build() {
            return new GetBotControlInfoRequest(this.f46177a, this.f46178b, this.f46179c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18653a mo64226a(GetDataStrategy getDataStrategy) {
            this.f46177a = getDataStrategy;
            return this;
        }

        /* renamed from: a */
        public C18653a mo64227a(String str) {
            this.f46178b = str;
            this.f46179c = null;
            return this;
        }

        /* renamed from: b */
        public C18653a mo64229b(String str) {
            this.f46179c = str;
            this.f46178b = null;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18653a newBuilder() {
        C18653a aVar = new C18653a();
        aVar.f46177a = this.strategy;
        aVar.f46178b = this.app_id;
        aVar.f46179c = this.bot_id;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetBotControlInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        StringBuilder replace = sb.replace(0, 2, "GetBotControlInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetBotControlInfoRequest(GetDataStrategy getDataStrategy, String str, String str2) {
        this(getDataStrategy, str, str2, ByteString.EMPTY);
    }

    public GetBotControlInfoRequest(GetDataStrategy getDataStrategy, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(str, str2) <= 1) {
            this.strategy = getDataStrategy;
            this.app_id = str;
            this.bot_id = str2;
            return;
        }
        throw new IllegalArgumentException("at most one of app_id, bot_id may be non-null");
    }
}
