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

public final class GetVcVirtualBackgroundRequest extends Message<GetVcVirtualBackgroundRequest, C50711a> {
    public static final ProtoAdapter<GetVcVirtualBackgroundRequest> ADAPTER = new C50712b();
    public static final Boolean DEFAULT_FROM_LOCAL = false;
    private static final long serialVersionUID = 0;
    public final Boolean from_local;
    public final List<VirtualBackground> sets;

    public static final class VirtualBackground extends Message<VirtualBackground, C50709a> {
        public static final ProtoAdapter<VirtualBackground> ADAPTER = new C50710b();
        public static final Boolean DEFAULT_IS_VIDEO = false;
        public static final MaterialSource DEFAULT_SOURCE = MaterialSource.UNKNOWN_SOURCE;
        private static final long serialVersionUID = 0;
        public final Boolean is_video;
        public final String name;
        public final String portrait_url;
        public final MaterialSource source;
        public final String url;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundRequest$VirtualBackground$b */
        private static final class C50710b extends ProtoAdapter<VirtualBackground> {
            C50710b() {
                super(FieldEncoding.LENGTH_DELIMITED, VirtualBackground.class);
            }

            /* renamed from: a */
            public int encodedSize(VirtualBackground virtualBackground) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5 = 0;
                if (virtualBackground.url != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, virtualBackground.url);
                } else {
                    i = 0;
                }
                if (virtualBackground.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, virtualBackground.name);
                } else {
                    i2 = 0;
                }
                int i6 = i + i2;
                if (virtualBackground.is_video != null) {
                    i3 = ProtoAdapter.BOOL.encodedSizeWithTag(3, virtualBackground.is_video);
                } else {
                    i3 = 0;
                }
                int i7 = i6 + i3;
                if (virtualBackground.portrait_url != null) {
                    i4 = ProtoAdapter.STRING.encodedSizeWithTag(4, virtualBackground.portrait_url);
                } else {
                    i4 = 0;
                }
                int i8 = i7 + i4;
                if (virtualBackground.source != null) {
                    i5 = MaterialSource.ADAPTER.encodedSizeWithTag(5, virtualBackground.source);
                }
                return i8 + i5 + virtualBackground.unknownFields().size();
            }

            /* renamed from: a */
            public VirtualBackground decode(ProtoReader protoReader) throws IOException {
                C50709a aVar = new C50709a();
                aVar.f126443a = "";
                aVar.f126444b = "";
                aVar.f126445c = false;
                aVar.f126446d = "";
                aVar.f126447e = MaterialSource.UNKNOWN_SOURCE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f126443a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f126444b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f126445c = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 4) {
                        aVar.f126446d = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 5) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f126447e = MaterialSource.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, VirtualBackground virtualBackground) throws IOException {
                if (virtualBackground.url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, virtualBackground.url);
                }
                if (virtualBackground.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, virtualBackground.name);
                }
                if (virtualBackground.is_video != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, virtualBackground.is_video);
                }
                if (virtualBackground.portrait_url != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, virtualBackground.portrait_url);
                }
                if (virtualBackground.source != null) {
                    MaterialSource.ADAPTER.encodeWithTag(protoWriter, 5, virtualBackground.source);
                }
                protoWriter.writeBytes(virtualBackground.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundRequest$VirtualBackground$a */
        public static final class C50709a extends Message.Builder<VirtualBackground, C50709a> {

            /* renamed from: a */
            public String f126443a;

            /* renamed from: b */
            public String f126444b;

            /* renamed from: c */
            public Boolean f126445c;

            /* renamed from: d */
            public String f126446d;

            /* renamed from: e */
            public MaterialSource f126447e;

            /* renamed from: a */
            public VirtualBackground build() {
                return new VirtualBackground(this.f126443a, this.f126444b, this.f126445c, this.f126446d, this.f126447e, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50709a newBuilder() {
            C50709a aVar = new C50709a();
            aVar.f126443a = this.url;
            aVar.f126444b = this.name;
            aVar.f126445c = this.is_video;
            aVar.f126446d = this.portrait_url;
            aVar.f126447e = this.source;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "VirtualBackground");
            StringBuilder sb = new StringBuilder();
            if (this.url != null) {
                sb.append(", url=");
                sb.append(this.url);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.is_video != null) {
                sb.append(", is_video=");
                sb.append(this.is_video);
            }
            if (this.portrait_url != null) {
                sb.append(", portrait_url=");
                sb.append(this.portrait_url);
            }
            if (this.source != null) {
                sb.append(", source=");
                sb.append(this.source);
            }
            StringBuilder replace = sb.replace(0, 2, "VirtualBackground{");
            replace.append('}');
            return replace.toString();
        }

        public VirtualBackground(String str, String str2, Boolean bool, String str3, MaterialSource materialSource) {
            this(str, str2, bool, str3, materialSource, ByteString.EMPTY);
        }

        public VirtualBackground(String str, String str2, Boolean bool, String str3, MaterialSource materialSource, ByteString byteString) {
            super(ADAPTER, byteString);
            this.url = str;
            this.name = str2;
            this.is_video = bool;
            this.portrait_url = str3;
            this.source = materialSource;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundRequest$b */
    private static final class C50712b extends ProtoAdapter<GetVcVirtualBackgroundRequest> {
        C50712b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetVcVirtualBackgroundRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetVcVirtualBackgroundRequest getVcVirtualBackgroundRequest) {
            int i;
            int encodedSizeWithTag = VirtualBackground.ADAPTER.asRepeated().encodedSizeWithTag(1, getVcVirtualBackgroundRequest.sets);
            if (getVcVirtualBackgroundRequest.from_local != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, getVcVirtualBackgroundRequest.from_local);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + getVcVirtualBackgroundRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetVcVirtualBackgroundRequest decode(ProtoReader protoReader) throws IOException {
            C50711a aVar = new C50711a();
            aVar.f126449b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f126448a.add(VirtualBackground.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f126449b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetVcVirtualBackgroundRequest getVcVirtualBackgroundRequest) throws IOException {
            VirtualBackground.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getVcVirtualBackgroundRequest.sets);
            if (getVcVirtualBackgroundRequest.from_local != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getVcVirtualBackgroundRequest.from_local);
            }
            protoWriter.writeBytes(getVcVirtualBackgroundRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.GetVcVirtualBackgroundRequest$a */
    public static final class C50711a extends Message.Builder<GetVcVirtualBackgroundRequest, C50711a> {

        /* renamed from: a */
        public List<VirtualBackground> f126448a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f126449b;

        /* renamed from: a */
        public GetVcVirtualBackgroundRequest build() {
            return new GetVcVirtualBackgroundRequest(this.f126448a, this.f126449b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C50711a mo175406a(List<VirtualBackground> list) {
            Internal.checkElementsNotNull(list);
            this.f126448a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50711a newBuilder() {
        C50711a aVar = new C50711a();
        aVar.f126448a = Internal.copyOf("sets", this.sets);
        aVar.f126449b = this.from_local;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "GetVcVirtualBackgroundRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.sets.isEmpty()) {
            sb.append(", sets=");
            sb.append(this.sets);
        }
        if (this.from_local != null) {
            sb.append(", from_local=");
            sb.append(this.from_local);
        }
        StringBuilder replace = sb.replace(0, 2, "GetVcVirtualBackgroundRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetVcVirtualBackgroundRequest(List<VirtualBackground> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public GetVcVirtualBackgroundRequest(List<VirtualBackground> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sets = Internal.immutableCopyOf("sets", list);
        this.from_local = bool;
    }
}
