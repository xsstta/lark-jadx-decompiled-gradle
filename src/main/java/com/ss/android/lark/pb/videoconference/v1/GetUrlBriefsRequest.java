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

public final class GetUrlBriefsRequest extends Message<GetUrlBriefsRequest, C50689a> {
    public static final ProtoAdapter<GetUrlBriefsRequest> ADAPTER = new C50690b();
    private static final long serialVersionUID = 0;
    public final Opts opts;
    public final List<String> urls;

    public static final class Opts extends Message<Opts, C50687a> {
        public static final ProtoAdapter<Opts> ADAPTER = new C50688b();
        public static final Boolean DEFAULT_GET_THUMBNAIL = false;
        public static final Boolean DEFAULT_GET_TITLE = false;
        public static final Boolean DEFAULT_GET_TYPE = false;
        private static final long serialVersionUID = 0;
        public final Boolean get_thumbnail;
        public final Boolean get_title;
        public final Boolean get_type;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsRequest$Opts$b */
        private static final class C50688b extends ProtoAdapter<Opts> {
            C50688b() {
                super(FieldEncoding.LENGTH_DELIMITED, Opts.class);
            }

            /* renamed from: a */
            public int encodedSize(Opts opts) {
                int i;
                int i2;
                int i3 = 0;
                if (opts.get_title != null) {
                    i = ProtoAdapter.BOOL.encodedSizeWithTag(1, opts.get_title);
                } else {
                    i = 0;
                }
                if (opts.get_type != null) {
                    i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, opts.get_type);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (opts.get_thumbnail != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, opts.get_thumbnail);
                }
                return i4 + i3 + opts.unknownFields().size();
            }

            /* renamed from: a */
            public Opts decode(ProtoReader protoReader) throws IOException {
                C50687a aVar = new C50687a();
                aVar.f126415a = false;
                aVar.f126416b = false;
                aVar.f126417c = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126415a = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126416b = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f126417c = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, Opts opts) throws IOException {
                if (opts.get_title != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, opts.get_title);
                }
                if (opts.get_type != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, opts.get_type);
                }
                if (opts.get_thumbnail != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, opts.get_thumbnail);
                }
                protoWriter.writeBytes(opts.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsRequest$Opts$a */
        public static final class C50687a extends Message.Builder<Opts, C50687a> {

            /* renamed from: a */
            public Boolean f126415a;

            /* renamed from: b */
            public Boolean f126416b;

            /* renamed from: c */
            public Boolean f126417c;

            /* renamed from: a */
            public Opts build() {
                return new Opts(this.f126415a, this.f126416b, this.f126417c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50687a newBuilder() {
            C50687a aVar = new C50687a();
            aVar.f126415a = this.get_title;
            aVar.f126416b = this.get_type;
            aVar.f126417c = this.get_thumbnail;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "Opts");
            StringBuilder sb = new StringBuilder();
            if (this.get_title != null) {
                sb.append(", get_title=");
                sb.append(this.get_title);
            }
            if (this.get_type != null) {
                sb.append(", get_type=");
                sb.append(this.get_type);
            }
            if (this.get_thumbnail != null) {
                sb.append(", get_thumbnail=");
                sb.append(this.get_thumbnail);
            }
            StringBuilder replace = sb.replace(0, 2, "Opts{");
            replace.append('}');
            return replace.toString();
        }

        public Opts(Boolean bool, Boolean bool2, Boolean bool3) {
            this(bool, bool2, bool3, ByteString.EMPTY);
        }

        public Opts(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
            super(ADAPTER, byteString);
            this.get_title = bool;
            this.get_type = bool2;
            this.get_thumbnail = bool3;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsRequest$b */
    private static final class C50690b extends ProtoAdapter<GetUrlBriefsRequest> {
        C50690b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUrlBriefsRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUrlBriefsRequest getUrlBriefsRequest) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, getUrlBriefsRequest.urls) + Opts.ADAPTER.encodedSizeWithTag(2, getUrlBriefsRequest.opts) + getUrlBriefsRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetUrlBriefsRequest decode(ProtoReader protoReader) throws IOException {
            C50689a aVar = new C50689a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126418a.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126419b = Opts.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUrlBriefsRequest getUrlBriefsRequest) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, getUrlBriefsRequest.urls);
            Opts.ADAPTER.encodeWithTag(protoWriter, 2, getUrlBriefsRequest.opts);
            protoWriter.writeBytes(getUrlBriefsRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetUrlBriefsRequest$a */
    public static final class C50689a extends Message.Builder<GetUrlBriefsRequest, C50689a> {

        /* renamed from: a */
        public List<String> f126418a = Internal.newMutableList();

        /* renamed from: b */
        public Opts f126419b;

        /* renamed from: a */
        public GetUrlBriefsRequest build() {
            Opts opts = this.f126419b;
            if (opts != null) {
                return new GetUrlBriefsRequest(this.f126418a, opts, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(opts, "opts");
        }

        /* renamed from: a */
        public C50689a mo175357a(Opts opts) {
            this.f126419b = opts;
            return this;
        }

        /* renamed from: a */
        public C50689a mo175358a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f126418a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50689a newBuilder() {
        C50689a aVar = new C50689a();
        aVar.f126418a = Internal.copyOf("urls", this.urls);
        aVar.f126419b = this.opts;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetUrlBriefsRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.urls.isEmpty()) {
            sb.append(", urls=");
            sb.append(this.urls);
        }
        sb.append(", opts=");
        sb.append(this.opts);
        StringBuilder replace = sb.replace(0, 2, "GetUrlBriefsRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetUrlBriefsRequest(List<String> list, Opts opts2) {
        this(list, opts2, ByteString.EMPTY);
    }

    public GetUrlBriefsRequest(List<String> list, Opts opts2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.urls = Internal.immutableCopyOf("urls", list);
        this.opts = opts2;
    }
}
