package com.ss.android.lark.pb.videoconference.v1;

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

public final class VideoChatH323Setting extends Message<VideoChatH323Setting, C51242a> {
    public static final ProtoAdapter<VideoChatH323Setting> ADAPTER = new C51243b();
    private static final long serialVersionUID = 0;
    public final List<H323Access> h323_access_list;

    public static final class H323Access extends Message<H323Access, C51240a> {
        public static final ProtoAdapter<H323Access> ADAPTER = new C51241b();
        private static final long serialVersionUID = 0;
        public final String country;
        public final String ip;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatH323Setting$H323Access$b */
        private static final class C51241b extends ProtoAdapter<H323Access> {
            C51241b() {
                super(FieldEncoding.LENGTH_DELIMITED, H323Access.class);
            }

            /* renamed from: a */
            public int encodedSize(H323Access h323Access) {
                int i;
                int i2 = 0;
                if (h323Access.ip != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, h323Access.ip);
                } else {
                    i = 0;
                }
                if (h323Access.country != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, h323Access.country);
                }
                return i + i2 + h323Access.unknownFields().size();
            }

            /* renamed from: a */
            public H323Access decode(ProtoReader protoReader) throws IOException {
                C51240a aVar = new C51240a();
                aVar.f127559a = "";
                aVar.f127560b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127559a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f127560b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, H323Access h323Access) throws IOException {
                if (h323Access.ip != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, h323Access.ip);
                }
                if (h323Access.country != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, h323Access.country);
                }
                protoWriter.writeBytes(h323Access.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatH323Setting$H323Access$a */
        public static final class C51240a extends Message.Builder<H323Access, C51240a> {

            /* renamed from: a */
            public String f127559a;

            /* renamed from: b */
            public String f127560b;

            /* renamed from: a */
            public H323Access build() {
                return new H323Access(this.f127559a, this.f127560b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51240a newBuilder() {
            C51240a aVar = new C51240a();
            aVar.f127559a = this.ip;
            aVar.f127560b = this.country;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "H323Access");
            StringBuilder sb = new StringBuilder();
            if (this.ip != null) {
                sb.append(", ip=");
                sb.append(this.ip);
            }
            if (this.country != null) {
                sb.append(", country=");
                sb.append(this.country);
            }
            StringBuilder replace = sb.replace(0, 2, "H323Access{");
            replace.append('}');
            return replace.toString();
        }

        public H323Access(String str, String str2) {
            this(str, str2, ByteString.EMPTY);
        }

        public H323Access(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.ip = str;
            this.country = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatH323Setting$b */
    private static final class C51243b extends ProtoAdapter<VideoChatH323Setting> {
        C51243b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatH323Setting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatH323Setting videoChatH323Setting) {
            return H323Access.ADAPTER.asRepeated().encodedSizeWithTag(1, videoChatH323Setting.h323_access_list) + videoChatH323Setting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatH323Setting decode(ProtoReader protoReader) throws IOException {
            C51242a aVar = new C51242a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127561a.add(H323Access.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatH323Setting videoChatH323Setting) throws IOException {
            H323Access.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, videoChatH323Setting.h323_access_list);
            protoWriter.writeBytes(videoChatH323Setting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.VideoChatH323Setting$a */
    public static final class C51242a extends Message.Builder<VideoChatH323Setting, C51242a> {

        /* renamed from: a */
        public List<H323Access> f127561a = Internal.newMutableList();

        /* renamed from: a */
        public VideoChatH323Setting build() {
            return new VideoChatH323Setting(this.f127561a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C51242a newBuilder() {
        C51242a aVar = new C51242a();
        aVar.f127561a = Internal.copyOf("h323_access_list", this.h323_access_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "VideoChatH323Setting");
        StringBuilder sb = new StringBuilder();
        if (!this.h323_access_list.isEmpty()) {
            sb.append(", h323_access_list=");
            sb.append(this.h323_access_list);
        }
        StringBuilder replace = sb.replace(0, 2, "VideoChatH323Setting{");
        replace.append('}');
        return replace.toString();
    }

    public VideoChatH323Setting(List<H323Access> list) {
        this(list, ByteString.EMPTY);
    }

    public VideoChatH323Setting(List<H323Access> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.h323_access_list = Internal.immutableCopyOf("h323_access_list", list);
    }
}
