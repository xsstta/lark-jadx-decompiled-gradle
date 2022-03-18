package com.bytedance.lark.pb.passport.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class GetUserSidebarResponse extends Message<GetUserSidebarResponse, C18731a> {
    public static final ProtoAdapter<GetUserSidebarResponse> ADAPTER = new C18732b();
    private static final long serialVersionUID = 0;
    public final List<SidebarInfo> sidebar_infos;

    public enum SidebarType implements WireEnum {
        UNKNOWN_SIDEBAR_TYPE(0),
        ADMIN(1);
        
        public static final ProtoAdapter<SidebarType> ADAPTER = ProtoAdapter.newEnumAdapter(SidebarType.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static SidebarType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN_SIDEBAR_TYPE;
            }
            if (i != 1) {
                return null;
            }
            return ADMIN;
        }

        private SidebarType(int i) {
            this.value = i;
        }
    }

    public static final class SidebarInfo extends Message<SidebarInfo, C18729a> {
        public static final ProtoAdapter<SidebarInfo> ADAPTER = new C18730b();
        public static final Boolean DEFAULT_SIDEBAR_ISSHOW = false;
        public static final SidebarType DEFAULT_SIDEBAR_TYPE = SidebarType.UNKNOWN_SIDEBAR_TYPE;
        private static final long serialVersionUID = 0;
        public final String sidebar_icon;
        public final Boolean sidebar_isshow;
        public final String sidebar_link;
        public final SidebarType sidebar_type;

        /* renamed from: com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse$SidebarInfo$b */
        private static final class C18730b extends ProtoAdapter<SidebarInfo> {
            C18730b() {
                super(FieldEncoding.LENGTH_DELIMITED, SidebarInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(SidebarInfo sidebarInfo) {
                int i;
                int i2;
                int i3;
                int i4 = 0;
                if (sidebarInfo.sidebar_type != null) {
                    i = SidebarType.ADAPTER.encodedSizeWithTag(1, sidebarInfo.sidebar_type);
                } else {
                    i = 0;
                }
                if (sidebarInfo.sidebar_icon != null) {
                    i2 = ProtoAdapter.STRING.encodedSizeWithTag(2, sidebarInfo.sidebar_icon);
                } else {
                    i2 = 0;
                }
                int i5 = i + i2;
                if (sidebarInfo.sidebar_link != null) {
                    i3 = ProtoAdapter.STRING.encodedSizeWithTag(3, sidebarInfo.sidebar_link);
                } else {
                    i3 = 0;
                }
                int i6 = i5 + i3;
                if (sidebarInfo.sidebar_isshow != null) {
                    i4 = ProtoAdapter.BOOL.encodedSizeWithTag(4, sidebarInfo.sidebar_isshow);
                }
                return i6 + i4 + sidebarInfo.unknownFields().size();
            }

            /* renamed from: a */
            public SidebarInfo decode(ProtoReader protoReader) throws IOException {
                C18729a aVar = new C18729a();
                aVar.f46275a = SidebarType.UNKNOWN_SIDEBAR_TYPE;
                aVar.f46276b = "";
                aVar.f46277c = "";
                aVar.f46278d = false;
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        try {
                            aVar.f46275a = SidebarType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                        }
                    } else if (nextTag == 2) {
                        aVar.f46276b = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 3) {
                        aVar.f46277c = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 4) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f46278d = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, SidebarInfo sidebarInfo) throws IOException {
                if (sidebarInfo.sidebar_type != null) {
                    SidebarType.ADAPTER.encodeWithTag(protoWriter, 1, sidebarInfo.sidebar_type);
                }
                if (sidebarInfo.sidebar_icon != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sidebarInfo.sidebar_icon);
                }
                if (sidebarInfo.sidebar_link != null) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, sidebarInfo.sidebar_link);
                }
                if (sidebarInfo.sidebar_isshow != null) {
                    ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, sidebarInfo.sidebar_isshow);
                }
                protoWriter.writeBytes(sidebarInfo.unknownFields());
            }
        }

        /* renamed from: com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse$SidebarInfo$a */
        public static final class C18729a extends Message.Builder<SidebarInfo, C18729a> {

            /* renamed from: a */
            public SidebarType f46275a;

            /* renamed from: b */
            public String f46276b;

            /* renamed from: c */
            public String f46277c;

            /* renamed from: d */
            public Boolean f46278d;

            /* renamed from: a */
            public SidebarInfo build() {
                return new SidebarInfo(this.f46275a, this.f46276b, this.f46277c, this.f46278d, super.buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C18729a newBuilder() {
            C18729a aVar = new C18729a();
            aVar.f46275a = this.sidebar_type;
            aVar.f46276b = this.sidebar_icon;
            aVar.f46277c = this.sidebar_link;
            aVar.f46278d = this.sidebar_isshow;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            C1911a.m8540a("passport", "SidebarInfo");
            StringBuilder sb = new StringBuilder();
            if (this.sidebar_type != null) {
                sb.append(", sidebar_type=");
                sb.append(this.sidebar_type);
            }
            if (this.sidebar_icon != null) {
                sb.append(", sidebar_icon=");
                sb.append(this.sidebar_icon);
            }
            if (this.sidebar_link != null) {
                sb.append(", sidebar_link=");
                sb.append(this.sidebar_link);
            }
            if (this.sidebar_isshow != null) {
                sb.append(", sidebar_isshow=");
                sb.append(this.sidebar_isshow);
            }
            StringBuilder replace = sb.replace(0, 2, "SidebarInfo{");
            replace.append('}');
            return replace.toString();
        }

        public SidebarInfo(SidebarType sidebarType, String str, String str2, Boolean bool) {
            this(sidebarType, str, str2, bool, ByteString.EMPTY);
        }

        public SidebarInfo(SidebarType sidebarType, String str, String str2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            this.sidebar_type = sidebarType;
            this.sidebar_icon = str;
            this.sidebar_link = str2;
            this.sidebar_isshow = bool;
        }
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse$b */
    private static final class C18732b extends ProtoAdapter<GetUserSidebarResponse> {
        C18732b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetUserSidebarResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(GetUserSidebarResponse getUserSidebarResponse) {
            return SidebarInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserSidebarResponse.sidebar_infos) + getUserSidebarResponse.unknownFields().size();
        }

        /* renamed from: a */
        public GetUserSidebarResponse decode(ProtoReader protoReader) throws IOException {
            C18731a aVar = new C18731a();
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
                    aVar.f46279a.add(SidebarInfo.ADAPTER.decode(protoReader));
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetUserSidebarResponse getUserSidebarResponse) throws IOException {
            SidebarInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUserSidebarResponse.sidebar_infos);
            protoWriter.writeBytes(getUserSidebarResponse.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.passport.v1.GetUserSidebarResponse$a */
    public static final class C18731a extends Message.Builder<GetUserSidebarResponse, C18731a> {

        /* renamed from: a */
        public List<SidebarInfo> f46279a = Internal.newMutableList();

        /* renamed from: a */
        public GetUserSidebarResponse build() {
            return new GetUserSidebarResponse(this.f46279a, super.buildUnknownFields());
        }
    }

    @Override // com.squareup.wire.Message
    public C18731a newBuilder() {
        C18731a aVar = new C18731a();
        aVar.f46279a = Internal.copyOf("sidebar_infos", this.sidebar_infos);
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("passport", "GetUserSidebarResponse");
        StringBuilder sb = new StringBuilder();
        if (!this.sidebar_infos.isEmpty()) {
            sb.append(", sidebar_infos=");
            sb.append(this.sidebar_infos);
        }
        StringBuilder replace = sb.replace(0, 2, "GetUserSidebarResponse{");
        replace.append('}');
        return replace.toString();
    }

    public GetUserSidebarResponse(List<SidebarInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public GetUserSidebarResponse(List<SidebarInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sidebar_infos = Internal.immutableCopyOf("sidebar_infos", list);
    }
}
