package com.bytedance.lark.pb.contact.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class UpdateChatterRequest extends Message<UpdateChatterRequest, C16406a> {
    public static final ProtoAdapter<UpdateChatterRequest> ADAPTER = new C16407b();
    public static final Chatter.Description.Type DEFAULT_DESCRIPTION_TYPE = Chatter.Description.Type.ON_DEFAULT;
    public static final ByteString DEFAULT_ICON_DATA = ByteString.EMPTY;
    private static final long serialVersionUID = 0;
    public final String description;
    public final Chatter.Description.Type description_type;
    public final ByteString icon_data;
    public final String icon_key;
    public final String time_zone;

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateChatterRequest$b */
    private static final class C16407b extends ProtoAdapter<UpdateChatterRequest> {
        C16407b() {
            super(FieldEncoding.LENGTH_DELIMITED, UpdateChatterRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(UpdateChatterRequest updateChatterRequest) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5 = 0;
            if (updateChatterRequest.description != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(1, updateChatterRequest.description);
            } else {
                i = 0;
            }
            if (updateChatterRequest.description_type != null) {
                i2 = Chatter.Description.Type.ADAPTER.encodedSizeWithTag(2, updateChatterRequest.description_type);
            } else {
                i2 = 0;
            }
            int i6 = i + i2;
            if (updateChatterRequest.icon_data != null) {
                i3 = ProtoAdapter.BYTES.encodedSizeWithTag(3, updateChatterRequest.icon_data);
            } else {
                i3 = 0;
            }
            int i7 = i6 + i3;
            if (updateChatterRequest.icon_key != null) {
                i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, updateChatterRequest.icon_key);
            } else {
                i4 = 0;
            }
            int i8 = i7 + i4;
            if (updateChatterRequest.time_zone != null) {
                i5 = ProtoAdapter.STRING.encodedSizeWithTag(5, updateChatterRequest.time_zone);
            }
            return i8 + i5 + updateChatterRequest.unknownFields().size();
        }

        /* renamed from: a */
        public UpdateChatterRequest decode(ProtoReader protoReader) throws IOException {
            C16406a aVar = new C16406a();
            aVar.f42674a = "";
            aVar.f42675b = Chatter.Description.Type.ON_DEFAULT;
            aVar.f42676c = ByteString.EMPTY;
            aVar.f42677d = "";
            aVar.f42678e = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f42674a = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag == 2) {
                    try {
                        aVar.f42675b = Chatter.Description.Type.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag == 3) {
                    aVar.f42676c = ProtoAdapter.BYTES.decode(protoReader);
                } else if (nextTag == 4) {
                    aVar.f42677d = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f42678e = ProtoAdapter.STRING.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, UpdateChatterRequest updateChatterRequest) throws IOException {
            if (updateChatterRequest.description != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateChatterRequest.description);
            }
            if (updateChatterRequest.description_type != null) {
                Chatter.Description.Type.ADAPTER.encodeWithTag(protoWriter, 2, updateChatterRequest.description_type);
            }
            if (updateChatterRequest.icon_data != null) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, updateChatterRequest.icon_data);
            }
            if (updateChatterRequest.icon_key != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, updateChatterRequest.icon_key);
            }
            if (updateChatterRequest.time_zone != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, updateChatterRequest.time_zone);
            }
            protoWriter.writeBytes(updateChatterRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.contact.v1.UpdateChatterRequest$a */
    public static final class C16406a extends Message.Builder<UpdateChatterRequest, C16406a> {

        /* renamed from: a */
        public String f42674a;

        /* renamed from: b */
        public Chatter.Description.Type f42675b;

        /* renamed from: c */
        public ByteString f42676c;

        /* renamed from: d */
        public String f42677d;

        /* renamed from: e */
        public String f42678e;

        /* renamed from: a */
        public UpdateChatterRequest build() {
            return new UpdateChatterRequest(this.f42674a, this.f42675b, this.f42676c, this.f42677d, this.f42678e, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C16406a mo58565a(Chatter.Description.Type type) {
            this.f42675b = type;
            return this;
        }

        /* renamed from: b */
        public C16406a mo58568b(String str) {
            this.f42677d = str;
            return this;
        }

        /* renamed from: c */
        public C16406a mo58569c(String str) {
            this.f42678e = str;
            return this;
        }

        /* renamed from: a */
        public C16406a mo58566a(String str) {
            this.f42674a = str;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C16406a newBuilder() {
        C16406a aVar = new C16406a();
        aVar.f42674a = this.description;
        aVar.f42675b = this.description_type;
        aVar.f42676c = this.icon_data;
        aVar.f42677d = this.icon_key;
        aVar.f42678e = this.time_zone;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("contact", "UpdateChatterRequest");
        StringBuilder sb = new StringBuilder();
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.description_type != null) {
            sb.append(", description_type=");
            sb.append(this.description_type);
        }
        if (this.icon_data != null) {
            sb.append(", icon_data=");
            sb.append(this.icon_data);
        }
        if (this.icon_key != null) {
            sb.append(", icon_key=");
            sb.append(this.icon_key);
        }
        if (this.time_zone != null) {
            sb.append(", time_zone=");
            sb.append(this.time_zone);
        }
        StringBuilder replace = sb.replace(0, 2, "UpdateChatterRequest{");
        replace.append('}');
        return replace.toString();
    }

    public UpdateChatterRequest(String str, Chatter.Description.Type type, ByteString byteString, String str2, String str3) {
        this(str, type, byteString, str2, str3, ByteString.EMPTY);
    }

    public UpdateChatterRequest(String str, Chatter.Description.Type type, ByteString byteString, String str2, String str3, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.description = str;
        this.description_type = type;
        this.icon_data = byteString;
        this.icon_key = str2;
        this.time_zone = str3;
    }
}
