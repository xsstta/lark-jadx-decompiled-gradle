package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetOpenAppStateRequest extends Message<GetOpenAppStateRequest, C18665a> {
    public static final ProtoAdapter<GetOpenAppStateRequest> ADAPTER = new C18666b();
    public static final Boolean DEFAULT_URGENT = false;
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String bot_id;
    public final Boolean urgent;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateRequest$b */
    private static final class C18666b extends ProtoAdapter<GetOpenAppStateRequest> {
        C18666b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetOpenAppStateRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetOpenAppStateRequest getOpenAppStateRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getOpenAppStateRequest.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, getOpenAppStateRequest.app_id);
            } else {
                i = 0;
            }
            if (getOpenAppStateRequest.bot_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, getOpenAppStateRequest.bot_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getOpenAppStateRequest.urgent != null) {
                i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, getOpenAppStateRequest.urgent);
            }
            return i4 + i3 + getOpenAppStateRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetOpenAppStateRequest decode(ProtoReader protoReader) throws IOException {
            C18665a aVar = new C18665a();
            aVar.f46193a = "";
            aVar.f46194b = "";
            aVar.f46195c = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46193a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46194b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46195c = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetOpenAppStateRequest getOpenAppStateRequest) throws IOException {
            if (getOpenAppStateRequest.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getOpenAppStateRequest.app_id);
            }
            if (getOpenAppStateRequest.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getOpenAppStateRequest.bot_id);
            }
            if (getOpenAppStateRequest.urgent != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getOpenAppStateRequest.urgent);
            }
            protoWriter.writeBytes(getOpenAppStateRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateRequest$a */
    public static final class C18665a extends Message.Builder<GetOpenAppStateRequest, C18665a> {

        /* renamed from: a */
        public String f46193a;

        /* renamed from: b */
        public String f46194b;

        /* renamed from: c */
        public Boolean f46195c;

        /* renamed from: a */
        public GetOpenAppStateRequest build() {
            return new GetOpenAppStateRequest(this.f46193a, this.f46194b, this.f46195c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18665a mo64257a(Boolean bool) {
            this.f46195c = bool;
            return this;
        }

        /* renamed from: a */
        public C18665a mo64258a(String str) {
            this.f46193a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18665a newBuilder() {
        C18665a aVar = new C18665a();
        aVar.f46193a = this.app_id;
        aVar.f46194b = this.bot_id;
        aVar.f46195c = this.urgent;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "GetOpenAppStateRequest");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.urgent != null) {
            sb.append(", urgent=");
            sb.append(this.urgent);
        }
        StringBuilder replace = sb.replace(0, 2, "GetOpenAppStateRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetOpenAppStateRequest(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public GetOpenAppStateRequest(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.bot_id = str2;
        this.urgent = bool;
    }
}
