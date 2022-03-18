package com.bytedance.lark.pb.settings.v1;

import com.android.p074a.p075a.p076a.C1911a;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

public final class GetNavigationAppInfoRequest extends Message<GetNavigationAppInfoRequest, C19147a> {
    public static final ProtoAdapter<GetNavigationAppInfoRequest> ADAPTER = new C19148b();
    public static final Integer DEFAULT_FIRST_PAGE = 0;
    public static final Boolean DEFAULT_FULL_DATA = false;
    public static final NavigationPlatform DEFAULT_PLATFORM = NavigationPlatform.NAV_PC;
    private static final long serialVersionUID = 0;
    public final Integer first_page;
    public final Boolean full_data;
    public final NavigationPlatform platform;

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoRequest$b */
    private static final class C19148b extends ProtoAdapter<GetNavigationAppInfoRequest> {
        C19148b() {
            super(FieldEncoding.LENGTH_DELIMITED, GetNavigationAppInfoRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(GetNavigationAppInfoRequest getNavigationAppInfoRequest) {
            int i;
            int i2;
            int i3 = 0;
            if (getNavigationAppInfoRequest.first_page != null) {
                i = ProtoAdapter.INT32.encodedSizeWithTag(1, getNavigationAppInfoRequest.first_page);
            } else {
                i = 0;
            }
            if (getNavigationAppInfoRequest.full_data != null) {
                i2 = ProtoAdapter.BOOL.encodedSizeWithTag(2, getNavigationAppInfoRequest.full_data);
            } else {
                i2 = 0;
            }
            int i4 = i + i2;
            if (getNavigationAppInfoRequest.platform != null) {
                i3 = NavigationPlatform.ADAPTER.encodedSizeWithTag(3, getNavigationAppInfoRequest.platform);
            }
            return i4 + i3 + getNavigationAppInfoRequest.unknownFields().size();
        }

        /* renamed from: a */
        public GetNavigationAppInfoRequest decode(ProtoReader protoReader) throws IOException {
            C19147a aVar = new C19147a();
            aVar.f47285a = 0;
            aVar.f47286b = false;
            aVar.f47287c = NavigationPlatform.NAV_PC;
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f47285a = ProtoAdapter.INT32.decode(protoReader);
                } else if (nextTag == 2) {
                    aVar.f47286b = ProtoAdapter.BOOL.decode(protoReader);
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        aVar.f47287c = NavigationPlatform.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, GetNavigationAppInfoRequest getNavigationAppInfoRequest) throws IOException {
            if (getNavigationAppInfoRequest.first_page != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getNavigationAppInfoRequest.first_page);
            }
            if (getNavigationAppInfoRequest.full_data != null) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getNavigationAppInfoRequest.full_data);
            }
            if (getNavigationAppInfoRequest.platform != null) {
                NavigationPlatform.ADAPTER.encodeWithTag(protoWriter, 3, getNavigationAppInfoRequest.platform);
            }
            protoWriter.writeBytes(getNavigationAppInfoRequest.unknownFields());
        }
    }

    /* renamed from: com.bytedance.lark.pb.settings.v1.GetNavigationAppInfoRequest$a */
    public static final class C19147a extends Message.Builder<GetNavigationAppInfoRequest, C19147a> {

        /* renamed from: a */
        public Integer f47285a;

        /* renamed from: b */
        public Boolean f47286b;

        /* renamed from: c */
        public NavigationPlatform f47287c;

        /* renamed from: a */
        public GetNavigationAppInfoRequest build() {
            return new GetNavigationAppInfoRequest(this.f47285a, this.f47286b, this.f47287c, super.buildUnknownFields());
        }

        /* renamed from: a */
        public C19147a mo65441a(NavigationPlatform navigationPlatform) {
            this.f47287c = navigationPlatform;
            return this;
        }

        /* renamed from: a */
        public C19147a mo65442a(Boolean bool) {
            this.f47286b = bool;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C19147a newBuilder() {
        C19147a aVar = new C19147a();
        aVar.f47285a = this.first_page;
        aVar.f47286b = this.full_data;
        aVar.f47287c = this.platform;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("settings", "GetNavigationAppInfoRequest");
        StringBuilder sb = new StringBuilder();
        if (this.first_page != null) {
            sb.append(", first_page=");
            sb.append(this.first_page);
        }
        if (this.full_data != null) {
            sb.append(", full_data=");
            sb.append(this.full_data);
        }
        if (this.platform != null) {
            sb.append(", platform=");
            sb.append(this.platform);
        }
        StringBuilder replace = sb.replace(0, 2, "GetNavigationAppInfoRequest{");
        replace.append('}');
        return replace.toString();
    }

    public GetNavigationAppInfoRequest(Integer num, Boolean bool, NavigationPlatform navigationPlatform) {
        this(num, bool, navigationPlatform, ByteString.EMPTY);
    }

    public GetNavigationAppInfoRequest(Integer num, Boolean bool, NavigationPlatform navigationPlatform, ByteString byteString) {
        super(ADAPTER, byteString);
        this.first_page = num;
        this.full_data = bool;
        this.platform = navigationPlatform;
    }
}
