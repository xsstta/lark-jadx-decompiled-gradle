package com.ss.android.lark.pb.videochat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class VideoChatH323Setting extends Message<VideoChatH323Setting, C50421a> {
    public static final ProtoAdapter<VideoChatH323Setting> ADAPTER = new C50422b();
    private static final long serialVersionUID = 0;
    public final List<H323Access> mh323_access_list;

    public static final class H323Access extends Message<H323Access, C50419a> {
        public static final ProtoAdapter<H323Access> ADAPTER = new C50420b();
        private static final long serialVersionUID = 0;
        public final String mcountry;
        public final String mip;

        /* renamed from: com.ss.android.lark.pb.videochat.VideoChatH323Setting$H323Access$b */
        private static final class C50420b extends ProtoAdapter<H323Access> {
            C50420b() {
                super(FieldEncoding.LENGTH_DELIMITED, H323Access.class);
            }

            /* renamed from: a */
            public int encodedSize(H323Access h323Access) {
                int i;
                int i2 = 0;
                if (h323Access.mip != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, h323Access.mip);
                } else {
                    i = 0;
                }
                if (h323Access.mcountry != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, h323Access.mcountry);
                }
                return i + i2 + h323Access.unknownFields().size();
            }

            /* renamed from: a */
            public H323Access decode(ProtoReader protoReader) throws IOException {
                C50419a aVar = new C50419a();
                aVar.f125897a = "";
                aVar.f125898b = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125897a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125898b = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, H323Access h323Access) throws IOException {
                if (h323Access.mip != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, h323Access.mip);
                }
                if (h323Access.mcountry != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, h323Access.mcountry);
                }
                protoWriter.writeBytes(h323Access.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videochat.VideoChatH323Setting$H323Access$a */
        public static final class C50419a extends Message.Builder<H323Access, C50419a> {

            /* renamed from: a */
            public String f125897a;

            /* renamed from: b */
            public String f125898b;

            /* renamed from: a */
            public H323Access build() {
                return new H323Access(this.f125897a, this.f125898b, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50419a newBuilder() {
            C50419a aVar = new C50419a();
            aVar.f125897a = this.mip;
            aVar.f125898b = this.mcountry;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.mip != null) {
                sb.append(", ip=");
                sb.append(this.mip);
            }
            if (this.mcountry != null) {
                sb.append(", country=");
                sb.append(this.mcountry);
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
            this.mip = str;
            this.mcountry = str2;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatH323Setting$b */
    private static final class C50422b extends ProtoAdapter<VideoChatH323Setting> {
        C50422b() {
            super(FieldEncoding.LENGTH_DELIMITED, VideoChatH323Setting.class);
        }

        /* renamed from: a */
        public int encodedSize(VideoChatH323Setting videoChatH323Setting) {
            return H323Access.ADAPTER.asRepeated().encodedSizeWithTag(1, videoChatH323Setting.mh323_access_list) + videoChatH323Setting.unknownFields().size();
        }

        /* renamed from: a */
        public VideoChatH323Setting decode(ProtoReader protoReader) throws IOException {
            C50421a aVar = new C50421a();
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
                    aVar.f125899a.add(H323Access.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, VideoChatH323Setting videoChatH323Setting) throws IOException {
            H323Access.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, videoChatH323Setting.mh323_access_list);
            protoWriter.writeBytes(videoChatH323Setting.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videochat.VideoChatH323Setting$a */
    public static final class C50421a extends Message.Builder<VideoChatH323Setting, C50421a> {

        /* renamed from: a */
        public List<H323Access> f125899a = Internal.newMutableList();

        /* renamed from: a */
        public VideoChatH323Setting build() {
            return new VideoChatH323Setting(this.f125899a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C50421a newBuilder() {
        C50421a aVar = new C50421a();
        aVar.f125899a = Internal.copyOf("mh323_access_list", this.mh323_access_list);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mh323_access_list.isEmpty()) {
            sb.append(", h323_access_list=");
            sb.append(this.mh323_access_list);
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
        this.mh323_access_list = Internal.immutableCopyOf("mh323_access_list", list);
    }
}
