package com.bytedance.lark.pb.openplatform.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class PushMiniprogramPreviewRequest extends Message<PushMiniprogramPreviewRequest, C18691a> {
    public static final ProtoAdapter<PushMiniprogramPreviewRequest> ADAPTER = new C18692b();
    public static final Boolean DEFAULT_IS_ONLINE = false;
    private static final long serialVersionUID = 0;
    public final String cli_id;
    public final String extra;
    public final Boolean is_online;
    public final String time_stamp;
    public final String url;
    public final String url_v2;

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushMiniprogramPreviewRequest$b */
    private static final class C18692b extends ProtoAdapter<PushMiniprogramPreviewRequest> {
        C18692b() {
            super(FieldEncoding.LENGTH_DELIMITED, PushMiniprogramPreviewRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(PushMiniprogramPreviewRequest pushMiniprogramPreviewRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (pushMiniprogramPreviewRequest.cli_id != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, pushMiniprogramPreviewRequest.cli_id);
            } else {
                i = 0;
            }
            if (pushMiniprogramPreviewRequest.url != null) {
                i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, pushMiniprogramPreviewRequest.url);
            } else {
                i2 = 0;
            }
            int i7 = i + i2;
            if (pushMiniprogramPreviewRequest.extra != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, pushMiniprogramPreviewRequest.extra);
            } else {
                i3 = 0;
            }
            int i8 = i7 + i3;
            if (pushMiniprogramPreviewRequest.time_stamp != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, pushMiniprogramPreviewRequest.time_stamp);
            } else {
                i4 = 0;
            }
            int i9 = i8 + i4;
            if (pushMiniprogramPreviewRequest.url_v2 != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, pushMiniprogramPreviewRequest.url_v2);
            } else {
                i5 = 0;
            }
            int i10 = i9 + i5;
            if (pushMiniprogramPreviewRequest.is_online != null) {
                i6 = ProtoAdapter.BOOL.encodedSizeWithTag(6, pushMiniprogramPreviewRequest.is_online);
            }
            return i10 + i6 + pushMiniprogramPreviewRequest.unknownFields().size();
        }

        /* renamed from: a */
        public PushMiniprogramPreviewRequest decode(ProtoReader protoReader) throws IOException {
            C18691a aVar = new C18691a();
            aVar.f46229a = "";
            aVar.f46230b = "";
            aVar.f46231c = "";
            aVar.f46232d = "";
            aVar.f46233e = "";
            aVar.f46234f = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f46229a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f46230b = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            aVar.f46231c = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            aVar.f46232d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            aVar.f46233e = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            aVar.f46234f = ProtoAdapter.BOOL.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, PushMiniprogramPreviewRequest pushMiniprogramPreviewRequest) throws IOException {
            if (pushMiniprogramPreviewRequest.cli_id != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pushMiniprogramPreviewRequest.cli_id);
            }
            if (pushMiniprogramPreviewRequest.url != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, pushMiniprogramPreviewRequest.url);
            }
            if (pushMiniprogramPreviewRequest.extra != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, pushMiniprogramPreviewRequest.extra);
            }
            if (pushMiniprogramPreviewRequest.time_stamp != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, pushMiniprogramPreviewRequest.time_stamp);
            }
            if (pushMiniprogramPreviewRequest.url_v2 != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, pushMiniprogramPreviewRequest.url_v2);
            }
            if (pushMiniprogramPreviewRequest.is_online != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, pushMiniprogramPreviewRequest.is_online);
            }
            protoWriter.writeBytes(pushMiniprogramPreviewRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.openplatform.v1.PushMiniprogramPreviewRequest$a */
    public static final class C18691a extends Message.Builder<PushMiniprogramPreviewRequest, C18691a> {

        /* renamed from: a */
        public String f46229a;

        /* renamed from: b */
        public String f46230b;

        /* renamed from: c */
        public String f46231c;

        /* renamed from: d */
        public String f46232d;

        /* renamed from: e */
        public String f46233e;

        /* renamed from: f */
        public Boolean f46234f;

        /* renamed from: a */
        public PushMiniprogramPreviewRequest build() {
            return new PushMiniprogramPreviewRequest(this.f46229a, this.f46230b, this.f46231c, this.f46232d, this.f46233e, this.f46234f, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18691a newBuilder() {
        C18691a aVar = new C18691a();
        aVar.f46229a = this.cli_id;
        aVar.f46230b = this.url;
        aVar.f46231c = this.extra;
        aVar.f46232d = this.time_stamp;
        aVar.f46233e = this.url_v2;
        aVar.f46234f = this.is_online;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("openplatform", "PushMiniprogramPreviewRequest");
        StringBuilder sb = new StringBuilder();
        if (this.cli_id != null) {
            sb.append(", cli_id=");
            sb.append(this.cli_id);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.time_stamp != null) {
            sb.append(", time_stamp=");
            sb.append(this.time_stamp);
        }
        if (this.url_v2 != null) {
            sb.append(", url_v2=");
            sb.append(this.url_v2);
        }
        if (this.is_online != null) {
            sb.append(", is_online=");
            sb.append(this.is_online);
        }
        StringBuilder replace = sb.replace(0, 2, "PushMiniprogramPreviewRequest{");
        replace.append('}');
        return replace.toString();
    }

    public PushMiniprogramPreviewRequest(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this(str, str2, str3, str4, str5, bool, ByteString.EMPTY);
    }

    public PushMiniprogramPreviewRequest(String str, String str2, String str3, String str4, String str5, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cli_id = str;
        this.url = str2;
        this.extra = str3;
        this.time_stamp = str4;
        this.url_v2 = str5;
        this.is_online = bool;
    }
}
