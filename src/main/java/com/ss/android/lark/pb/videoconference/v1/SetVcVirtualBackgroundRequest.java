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

public final class SetVcVirtualBackgroundRequest extends Message<SetVcVirtualBackgroundRequest, C51026a> {
    public static final ProtoAdapter<SetVcVirtualBackgroundRequest> ADAPTER = new C51027b();
    public static final Boolean DEFAULT_IS_VIDEO = false;
    private static final long serialVersionUID = 0;
    public final Boolean is_video;
    public final List<CustomVirtualBackground> sets;

    public static final class CustomVirtualBackground extends Message<CustomVirtualBackground, C51024a> {
        public static final ProtoAdapter<CustomVirtualBackground> ADAPTER = new C51025b();
        public static final MaterialSource DEFAULT_SOURCE = MaterialSource.UNKNOWN_SOURCE;
        private static final long serialVersionUID = 0;
        public final String name;
        public final String path;
        public final MaterialSource source;

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundRequest$CustomVirtualBackground$b */
        private static final class C51025b extends ProtoAdapter<CustomVirtualBackground> {
            C51025b() {
                super(FieldEncoding.LENGTH_DELIMITED, CustomVirtualBackground.class);
            }

            /* renamed from: a */
            public int encodedSize(CustomVirtualBackground customVirtualBackground) {
                int i;
                int i2;
                int i3 = 0;
                if (customVirtualBackground.path != null) {
                    i = ProtoAdapter.STRING.encodedSizeWithTag(1, customVirtualBackground.path);
                } else {
                    i = 0;
                }
                if (customVirtualBackground.name != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, customVirtualBackground.name);
                } else {
                    i2 = 0;
                }
                int i4 = i + i2;
                if (customVirtualBackground.source != null) {
                    i3 = MaterialSource.ADAPTER.encodedSizeWithTag(3, customVirtualBackground.source);
                }
                return i4 + i3 + customVirtualBackground.unknownFields().size();
            }

            /* renamed from: a */
            public CustomVirtualBackground decode(ProtoReader protoReader) throws IOException {
                C51024a aVar = new C51024a();
                aVar.f127082a = "";
                aVar.f127083b = "";
                aVar.f127084c = MaterialSource.UNKNOWN_SOURCE;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f127082a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        aVar.f127083b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            aVar.f127084c = MaterialSource.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, CustomVirtualBackground customVirtualBackground) throws IOException {
                if (customVirtualBackground.path != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customVirtualBackground.path);
                }
                if (customVirtualBackground.name != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, customVirtualBackground.name);
                }
                if (customVirtualBackground.source != null) {
                    MaterialSource.ADAPTER.encodeWithTag(protoWriter, 3, customVirtualBackground.source);
                }
                protoWriter.writeBytes(customVirtualBackground.unknownFields());
            }
        }

        /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundRequest$CustomVirtualBackground$a */
        public static final class C51024a extends Message.Builder<CustomVirtualBackground, C51024a> {

            /* renamed from: a */
            public String f127082a;

            /* renamed from: b */
            public String f127083b;

            /* renamed from: c */
            public MaterialSource f127084c;

            /* renamed from: a */
            public CustomVirtualBackground build() {
                return new CustomVirtualBackground(this.f127082a, this.f127083b, this.f127084c, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C51024a newBuilder() {
            C51024a aVar = new C51024a();
            aVar.f127082a = this.path;
            aVar.f127083b = this.name;
            aVar.f127084c = this.source;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("videoconference", "CustomVirtualBackground");
            StringBuilder sb = new StringBuilder();
            if (this.path != null) {
                sb.append(", path=");
                sb.append(this.path);
            }
            if (this.name != null) {
                sb.append(", name=");
                sb.append(this.name);
            }
            if (this.source != null) {
                sb.append(", source=");
                sb.append(this.source);
            }
            StringBuilder replace = sb.replace(0, 2, "CustomVirtualBackground{");
            replace.append('}');
            return replace.toString();
        }

        public CustomVirtualBackground(String str, String str2, MaterialSource materialSource) {
            this(str, str2, materialSource, ByteString.EMPTY);
        }

        public CustomVirtualBackground(String str, String str2, MaterialSource materialSource, ByteString byteString) {
            super(ADAPTER, byteString);
            this.path = str;
            this.name = str2;
            this.source = materialSource;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundRequest$b */
    private static final class C51027b extends ProtoAdapter<SetVcVirtualBackgroundRequest> {
        C51027b() {
            super(FieldEncoding.LENGTH_DELIMITED, SetVcVirtualBackgroundRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(SetVcVirtualBackgroundRequest setVcVirtualBackgroundRequest) {
            int i;
            int encodedSizeWithTag = CustomVirtualBackground.ADAPTER.asRepeated().encodedSizeWithTag(1, setVcVirtualBackgroundRequest.sets);
            if (setVcVirtualBackgroundRequest.is_video != null) {
                i = ProtoAdapter.BOOL.encodedSizeWithTag(2, setVcVirtualBackgroundRequest.is_video);
            } else {
                i = 0;
            }
            return encodedSizeWithTag + i + setVcVirtualBackgroundRequest.unknownFields().size();
        }

        /* renamed from: a */
        public SetVcVirtualBackgroundRequest decode(ProtoReader protoReader) throws IOException {
            C51026a aVar = new C51026a();
            aVar.f127086b = false;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f127085a.add(CustomVirtualBackground.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f127086b = ProtoAdapter.BOOL.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, SetVcVirtualBackgroundRequest setVcVirtualBackgroundRequest) throws IOException {
            CustomVirtualBackground.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, setVcVirtualBackgroundRequest.sets);
            if (setVcVirtualBackgroundRequest.is_video != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, setVcVirtualBackgroundRequest.is_video);
            }
            protoWriter.writeBytes(setVcVirtualBackgroundRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.SetVcVirtualBackgroundRequest$a */
    public static final class C51026a extends Message.Builder<SetVcVirtualBackgroundRequest, C51026a> {

        /* renamed from: a */
        public List<CustomVirtualBackground> f127085a = Internal.newMutableList();

        /* renamed from: b */
        public Boolean f127086b;

        /* renamed from: a */
        public SetVcVirtualBackgroundRequest build() {
            return new SetVcVirtualBackgroundRequest(this.f127085a, this.f127086b, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C51026a mo176164a(Boolean bool) {
            this.f127086b = bool;
            return this;
        }

        /* renamed from: a */
        public C51026a mo176165a(List<CustomVirtualBackground> list) {
            Internal.checkElementsNotNull(list);
            this.f127085a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51026a newBuilder() {
        C51026a aVar = new C51026a();
        aVar.f127085a = Internal.copyOf("sets", this.sets);
        aVar.f127086b = this.is_video;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "SetVcVirtualBackgroundRequest");
        StringBuilder sb = new StringBuilder();
        if (!this.sets.isEmpty()) {
            sb.append(", sets=");
            sb.append(this.sets);
        }
        if (this.is_video != null) {
            sb.append(", is_video=");
            sb.append(this.is_video);
        }
        StringBuilder replace = sb.replace(0, 2, "SetVcVirtualBackgroundRequest{");
        replace.append('}');
        return replace.toString();
    }

    public SetVcVirtualBackgroundRequest(List<CustomVirtualBackground> list, Boolean bool) {
        this(list, bool, ByteString.EMPTY);
    }

    public SetVcVirtualBackgroundRequest(List<CustomVirtualBackground> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sets = Internal.immutableCopyOf("sets", list);
        this.is_video = bool;
    }
}
