package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateOpenAppLastHappenTimeRequest extends Message<UpdateOpenAppLastHappenTimeRequest, C18719a> {
    public static final ProtoAdapter<UpdateOpenAppLastHappenTimeRequest> ADAPTER = new C18720b();
    private static final long serialVersionUID = 0;
    public final String app_id;
    public final String bot_id;
    public final String timestamp;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeRequest$b */
    private static final class C18720b extends ProtoAdapter<UpdateOpenAppLastHappenTimeRequest> {
        C18720b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateOpenAppLastHappenTimeRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateOpenAppLastHappenTimeRequest updateOpenAppLastHappenTimeRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (updateOpenAppLastHappenTimeRequest.app_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateOpenAppLastHappenTimeRequest.app_id);
            } else {
                i = 0;
            }
            if (updateOpenAppLastHappenTimeRequest.bot_id != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, updateOpenAppLastHappenTimeRequest.bot_id);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (updateOpenAppLastHappenTimeRequest.timestamp != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, updateOpenAppLastHappenTimeRequest.timestamp);
            }
            return i4 + i3 + updateOpenAppLastHappenTimeRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateOpenAppLastHappenTimeRequest decode(ProtoReader protoReader) throws IOException {
            C18719a aVar = new C18719a();
            aVar.f46267a = "";
            aVar.f46268b = "";
            aVar.f46269c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f46267a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f46268b = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f46269c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateOpenAppLastHappenTimeRequest updateOpenAppLastHappenTimeRequest) throws IOException {
            if (updateOpenAppLastHappenTimeRequest.app_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateOpenAppLastHappenTimeRequest.app_id);
            }
            if (updateOpenAppLastHappenTimeRequest.bot_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, updateOpenAppLastHappenTimeRequest.bot_id);
            }
            if (updateOpenAppLastHappenTimeRequest.timestamp != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, updateOpenAppLastHappenTimeRequest.timestamp);
            }
            protoWriter.writeBytes(updateOpenAppLastHappenTimeRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.UpdateOpenAppLastHappenTimeRequest$a */
    public static final class C18719a extends Message.Builder<UpdateOpenAppLastHappenTimeRequest, C18719a> {

        /* renamed from: a */
        public String f46267a;

        /* renamed from: b */
        public String f46268b;

        /* renamed from: c */
        public String f46269c;

        /* renamed from: a */
        public UpdateOpenAppLastHappenTimeRequest build() {
            return new UpdateOpenAppLastHappenTimeRequest(this.f46267a, this.f46268b, this.f46269c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C18719a mo64386a(String str) {
            this.f46267a = str;
            return this;
        }

        /* renamed from: b */
        public C18719a mo64388b(String str) {
            this.f46268b = str;
            return this;
        }

        /* renamed from: c */
        public C18719a mo64389c(String str) {
            this.f46269c = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C18719a newBuilder() {
        C18719a aVar = new C18719a();
        aVar.f46267a = this.app_id;
        aVar.f46268b = this.bot_id;
        aVar.f46269c = this.timestamp;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "UpdateOpenAppLastHappenTimeRequest");
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.timestamp != null) {
            sb.append(", timestamp=");
            sb.append(this.timestamp);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateOpenAppLastHappenTimeRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateOpenAppLastHappenTimeRequest(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public UpdateOpenAppLastHappenTimeRequest(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = str;
        this.bot_id = str2;
        this.timestamp = str3;
    }
}
