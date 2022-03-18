package com.bytedance.lark.pb.space.doc.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class CreateDocResponse extends Message<CreateDocResponse, C19241a> {
    public static final ProtoAdapter<CreateDocResponse> ADAPTER = new C19242b();
    public static final Integer DEFAULT_CODE = 0;
    private static final long serialVersionUID = 0;
    public final Integer code;
    public final String msg;
    public final String url;

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocResponse$b */
    private static final class C19242b extends ProtoAdapter<CreateDocResponse> {
        C19242b() {
            super(FieldEncoding.LENGTH_DELIMITED, CreateDocResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(CreateDocResponse createDocResponse) {
            int i;
            int i2;
            int i3 = 0;
            if (createDocResponse.url != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(2, createDocResponse.url);
            } else {
                i = 0;
            }
            if (createDocResponse.code != null) {
                i2 = ProtoAdapter.INT32.encodedSizeWithTag(3, createDocResponse.code);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (createDocResponse.msg != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(4, createDocResponse.msg);
            }
            return i4 + i3 + createDocResponse.unknownFields().size();
        }

        /* renamed from: a */
        public CreateDocResponse decode(ProtoReader protoReader) throws IOException {
            C19241a aVar = new C19241a();
            aVar.f47418a = "";
            aVar.f47419b = 0;
            aVar.f47420c = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 2) {
                    aVar.f47418a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 3) {
                    aVar.f47419b = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag != 4) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f47420c = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, CreateDocResponse createDocResponse) throws IOException {
            if (createDocResponse.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, createDocResponse.url);
            }
            if (createDocResponse.code != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, createDocResponse.code);
            }
            if (createDocResponse.msg != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, createDocResponse.msg);
            }
            protoWriter.writeBytes(createDocResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.space.doc.v1.CreateDocResponse$a */
    public static final class C19241a extends Message.Builder<CreateDocResponse, C19241a> {

        /* renamed from: a */
        public String f47418a;

        /* renamed from: b */
        public Integer f47419b;

        /* renamed from: c */
        public String f47420c;

        /* renamed from: a */
        public CreateDocResponse build() {
            return new CreateDocResponse(this.f47418a, this.f47419b, this.f47420c, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C19241a newBuilder() {
        C19241a aVar = new C19241a();
        aVar.f47418a = this.url;
        aVar.f47419b = this.code;
        aVar.f47420c = this.msg;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("space", "CreateDocResponse");
        StringBuilder sb = new StringBuilder();
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.msg != null) {
            sb.append(", msg=");
            sb.append(this.msg);
        }
        StringBuilder replace = sb.replace(0, 2, "CreateDocResponse{");
        replace.append('}');
        return replace.toString();
    }

    public CreateDocResponse(String str, Integer num, String str2) {
        this(str, num, str2, ByteString.EMPTY);
    }

    public CreateDocResponse(String str, Integer num, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.url = str;
        this.code = num;
        this.msg = str2;
    }
}
