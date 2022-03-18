package com.bytedance.lark.pb.ai.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class AppActionParams extends Message<AppActionParams, C14621a> {
    public static final ProtoAdapter<AppActionParams> ADAPTER = new C14622b();
    private static final long serialVersionUID = 0;
    public final String action_icon_key;
    public final String action_url;

    /* renamed from: com.bytedance.lark.pb.ai.v1.AppActionParams$b */
    private static final class C14622b extends ProtoAdapter<AppActionParams> {
        C14622b() {
            super(FieldEncoding.LENGTH_DELIMITED, AppActionParams.class);
        }

        /* renamed from: a */
        public int encodedSize(AppActionParams appActionParams) {
            int i;
            int i2 = 0;
            if (appActionParams.action_url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, appActionParams.action_url);
            } else {
                i = 0;
            }
            if (appActionParams.action_icon_key != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, appActionParams.action_icon_key);
            }
            return i + i2 + appActionParams.unknownFields().size();
        }

        /* renamed from: a */
        public AppActionParams decode(ProtoReader protoReader) throws IOException {
            C14621a aVar = new C14621a();
            aVar.f38705a = "";
            aVar.f38706b = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f38705a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f38706b = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, AppActionParams appActionParams) throws IOException {
            if (appActionParams.action_url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, appActionParams.action_url);
            }
            if (appActionParams.action_icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, appActionParams.action_icon_key);
            }
            protoWriter.writeBytes(appActionParams.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.ai.v1.AppActionParams$a */
    public static final class C14621a extends Message.Builder<AppActionParams, C14621a> {

        /* renamed from: a */
        public String f38705a;

        /* renamed from: b */
        public String f38706b;

        /* renamed from: a */
        public AppActionParams build() {
            return new AppActionParams(this.f38705a, this.f38706b, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C14621a newBuilder() {
        C14621a aVar = new C14621a();
        aVar.f38705a = this.action_url;
        aVar.f38706b = this.action_icon_key;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("ai", "AppActionParams");
        StringBuilder sb = new StringBuilder();
        if (this.action_url != null) {
            sb.append(", action_url=");
            sb.append(this.action_url);
        }
        if (this.action_icon_key != null) {
            sb.append(", action_icon_key=");
            sb.append(this.action_icon_key);
        }
        StringBuilder replace = sb.replace(0, 2, "AppActionParams{");
        replace.append('}');
        return replace.toString();
    }

    public AppActionParams(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public AppActionParams(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.action_url = str;
        this.action_icon_key = str2;
    }
}
