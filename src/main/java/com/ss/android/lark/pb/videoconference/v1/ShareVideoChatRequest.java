package com.ss.android.lark.pb.videoconference.v1;

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

public final class ShareVideoChatRequest extends Message<ShareVideoChatRequest, C51054a> {
    public static final ProtoAdapter<ShareVideoChatRequest> ADAPTER = new C51055b();
    public static final ShareFrom DEFAULT_SHARE_FROM = ShareFrom.UNKNOWN;
    private static final long serialVersionUID = 0;
    public final List<String> group_ids;
    public final String id;
    public final String piggyback_text;
    public final ShareFrom share_from;
    public final String share_message;
    public final List<String> user_ids;

    public enum ShareFrom implements WireEnum {
        UNKNOWN(0),
        FROM_QR_CODE(1),
        FROM_VC(2),
        FROM_VCTAB(3);
        
        public static final ProtoAdapter<ShareFrom> ADAPTER = ProtoAdapter.newEnumAdapter(ShareFrom.class);
        private final int value;

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        public static ShareFrom fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return FROM_QR_CODE;
            }
            if (i == 2) {
                return FROM_VC;
            }
            if (i != 3) {
                return null;
            }
            return FROM_VCTAB;
        }

        private ShareFrom(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareVideoChatRequest$b */
    private static final class C51055b extends ProtoAdapter<ShareVideoChatRequest> {
        C51055b() {
            super(FieldEncoding.LENGTH_DELIMITED, ShareVideoChatRequest.class);
        }

        /* renamed from: a */
        public int encodedSize(ShareVideoChatRequest shareVideoChatRequest) {
            int i;
            int i2;
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, shareVideoChatRequest.id) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, shareVideoChatRequest.user_ids) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, shareVideoChatRequest.group_ids);
            int i3 = 0;
            if (shareVideoChatRequest.piggyback_text != null) {
                i = ProtoAdapter.STRING.encodedSizeWithTag(4, shareVideoChatRequest.piggyback_text);
            } else {
                i = 0;
            }
            int i4 = encodedSizeWithTag + i;
            if (shareVideoChatRequest.share_from != null) {
                i2 = ShareFrom.ADAPTER.encodedSizeWithTag(5, shareVideoChatRequest.share_from);
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            if (shareVideoChatRequest.share_message != null) {
                i3 = ProtoAdapter.STRING.encodedSizeWithTag(6, shareVideoChatRequest.share_message);
            }
            return i5 + i3 + shareVideoChatRequest.unknownFields().size();
        }

        /* renamed from: a */
        public ShareVideoChatRequest decode(ProtoReader protoReader) throws IOException {
            C51054a aVar = new C51054a();
            aVar.f127133a = "";
            aVar.f127136d = "";
            aVar.f127137e = ShareFrom.UNKNOWN;
            aVar.f127138f = "";
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            aVar.f127133a = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            aVar.f127134b.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            aVar.f127135c.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            aVar.f127136d = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            try {
                                aVar.f127137e = ShareFrom.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                aVar.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 6:
                            aVar.f127138f = ProtoAdapter.STRING.decode(protoReader);
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
        public void encode(ProtoWriter protoWriter, ShareVideoChatRequest shareVideoChatRequest) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shareVideoChatRequest.id);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, shareVideoChatRequest.user_ids);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, shareVideoChatRequest.group_ids);
            if (shareVideoChatRequest.piggyback_text != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, shareVideoChatRequest.piggyback_text);
            }
            if (shareVideoChatRequest.share_from != null) {
                ShareFrom.ADAPTER.encodeWithTag(protoWriter, 5, shareVideoChatRequest.share_from);
            }
            if (shareVideoChatRequest.share_message != null) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, shareVideoChatRequest.share_message);
            }
            protoWriter.writeBytes(shareVideoChatRequest.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.videoconference.v1.ShareVideoChatRequest$a */
    public static final class C51054a extends Message.Builder<ShareVideoChatRequest, C51054a> {

        /* renamed from: a */
        public String f127133a;

        /* renamed from: b */
        public List<String> f127134b = Internal.newMutableList();

        /* renamed from: c */
        public List<String> f127135c = Internal.newMutableList();

        /* renamed from: d */
        public String f127136d;

        /* renamed from: e */
        public ShareFrom f127137e;

        /* renamed from: f */
        public String f127138f;

        /* renamed from: a */
        public ShareVideoChatRequest build() {
            String str = this.f127133a;
            if (str != null) {
                return new ShareVideoChatRequest(str, this.f127134b, this.f127135c, this.f127136d, this.f127137e, this.f127138f, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(str, "id");
        }

        /* renamed from: a */
        public C51054a mo176245a(ShareFrom shareFrom) {
            this.f127137e = shareFrom;
            return this;
        }

        /* renamed from: b */
        public C51054a mo176249b(String str) {
            this.f127138f = str;
            return this;
        }

        /* renamed from: a */
        public C51054a mo176246a(String str) {
            this.f127133a = str;
            return this;
        }

        /* renamed from: b */
        public C51054a mo176250b(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127135c = list;
            return this;
        }

        /* renamed from: a */
        public C51054a mo176247a(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.f127134b = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C51054a newBuilder() {
        C51054a aVar = new C51054a();
        aVar.f127133a = this.id;
        aVar.f127134b = Internal.copyOf("user_ids", this.user_ids);
        aVar.f127135c = Internal.copyOf("group_ids", this.group_ids);
        aVar.f127136d = this.piggyback_text;
        aVar.f127137e = this.share_from;
        aVar.f127138f = this.share_message;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        C1911a.m8540a("videoconference", "ShareVideoChatRequest");
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        if (!this.user_ids.isEmpty()) {
            sb.append(", user_ids=");
            sb.append(this.user_ids);
        }
        if (!this.group_ids.isEmpty()) {
            sb.append(", group_ids=");
            sb.append(this.group_ids);
        }
        if (this.piggyback_text != null) {
            sb.append(", piggyback_text=");
            sb.append(this.piggyback_text);
        }
        if (this.share_from != null) {
            sb.append(", share_from=");
            sb.append(this.share_from);
        }
        if (this.share_message != null) {
            sb.append(", share_message=");
            sb.append(this.share_message);
        }
        StringBuilder replace = sb.replace(0, 2, "ShareVideoChatRequest{");
        replace.append('}');
        return replace.toString();
    }

    public ShareVideoChatRequest(String str, List<String> list, List<String> list2, String str2, ShareFrom shareFrom, String str3) {
        this(str, list, list2, str2, shareFrom, str3, ByteString.EMPTY);
    }

    public ShareVideoChatRequest(String str, List<String> list, List<String> list2, String str2, ShareFrom shareFrom, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.user_ids = Internal.immutableCopyOf("user_ids", list);
        this.group_ids = Internal.immutableCopyOf("group_ids", list2);
        this.piggyback_text = str2;
        this.share_from = shareFrom;
        this.share_message = str3;
    }
}
