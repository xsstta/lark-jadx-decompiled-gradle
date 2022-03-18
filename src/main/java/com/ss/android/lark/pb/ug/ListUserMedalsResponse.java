package com.ss.android.lark.pb.ug;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

public final class ListUserMedalsResponse extends Message<ListUserMedalsResponse, C50100a> {
    public static final ProtoAdapter<ListUserMedalsResponse> ADAPTER = new C50101b();
    private static final long serialVersionUID = 0;
    public final List<MedalItem> mmedal_list;
    public final UserInfo muser_info;

    public static final class UserInfo extends Message<UserInfo, C50098a> {
        public static final ProtoAdapter<UserInfo> ADAPTER = new C50099b();
        private static final long serialVersionUID = 0;
        public final String mavatar_key;
        public final ImageSetPassThrough mtop_image;

        /* renamed from: com.ss.android.lark.pb.ug.ListUserMedalsResponse$UserInfo$b */
        private static final class C50099b extends ProtoAdapter<UserInfo> {
            C50099b() {
                super(FieldEncoding.LENGTH_DELIMITED, UserInfo.class);
            }

            /* renamed from: a */
            public int encodedSize(UserInfo userInfo) {
                return ProtoAdapter.STRING.encodedSizeWithTag(1, userInfo.mavatar_key) + ImageSetPassThrough.ADAPTER.encodedSizeWithTag(2, userInfo.mtop_image) + userInfo.unknownFields().size();
            }

            /* renamed from: a */
            public UserInfo decode(ProtoReader protoReader) throws IOException {
                C50098a aVar = new C50098a();
                aVar.f125226a = "";
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        protoReader.endMessage(beginMessage);
                        return aVar.build();
                    } else if (nextTag == 1) {
                        aVar.f125226a = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        aVar.f125227b = ImageSetPassThrough.ADAPTER.decode(protoReader);
                    }
                }
            }

            /* renamed from: a */
            public void encode(ProtoWriter protoWriter, UserInfo userInfo) throws IOException {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, userInfo.mavatar_key);
                ImageSetPassThrough.ADAPTER.encodeWithTag(protoWriter, 2, userInfo.mtop_image);
                protoWriter.writeBytes(userInfo.unknownFields());
            }
        }

        @Override // com.squareup.wire.Message
        public C50098a newBuilder() {
            C50098a aVar = new C50098a();
            aVar.f125226a = this.mavatar_key;
            aVar.f125227b = this.mtop_image;
            aVar.addUnknownFields(unknownFields());
            return aVar;
        }

        /* renamed from: com.ss.android.lark.pb.ug.ListUserMedalsResponse$UserInfo$a */
        public static final class C50098a extends Message.Builder<UserInfo, C50098a> {

            /* renamed from: a */
            public String f125226a;

            /* renamed from: b */
            public ImageSetPassThrough f125227b;

            /* renamed from: a */
            public UserInfo build() {
                ImageSetPassThrough imageSetPassThrough;
                String str = this.f125226a;
                if (str != null && (imageSetPassThrough = this.f125227b) != null) {
                    return new UserInfo(str, imageSetPassThrough, super.buildUnknownFields());
                }
                throw Internal.missingRequiredFields(str, "mavatar_key", this.f125227b, "mtop_image");
            }
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", avatar_key=");
            sb.append(this.mavatar_key);
            sb.append(", top_image=");
            sb.append(this.mtop_image);
            StringBuilder replace = sb.replace(0, 2, "UserInfo{");
            replace.append('}');
            return replace.toString();
        }

        public UserInfo(String str, ImageSetPassThrough imageSetPassThrough) {
            this(str, imageSetPassThrough, ByteString.EMPTY);
        }

        public UserInfo(String str, ImageSetPassThrough imageSetPassThrough, ByteString byteString) {
            super(ADAPTER, byteString);
            this.mavatar_key = str;
            this.mtop_image = imageSetPassThrough;
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug.ListUserMedalsResponse$b */
    private static final class C50101b extends ProtoAdapter<ListUserMedalsResponse> {
        C50101b() {
            super(FieldEncoding.LENGTH_DELIMITED, ListUserMedalsResponse.class);
        }

        /* renamed from: a */
        public int encodedSize(ListUserMedalsResponse listUserMedalsResponse) {
            return MedalItem.ADAPTER.asRepeated().encodedSizeWithTag(1, listUserMedalsResponse.mmedal_list) + UserInfo.ADAPTER.encodedSizeWithTag(2, listUserMedalsResponse.muser_info) + listUserMedalsResponse.unknownFields().size();
        }

        /* renamed from: a */
        public ListUserMedalsResponse decode(ProtoReader protoReader) throws IOException {
            C50100a aVar = new C50100a();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return aVar.build();
                } else if (nextTag == 1) {
                    aVar.f125228a.add(MedalItem.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    aVar.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    aVar.f125229b = UserInfo.ADAPTER.decode(protoReader);
                }
            }
        }

        /* renamed from: a */
        public void encode(ProtoWriter protoWriter, ListUserMedalsResponse listUserMedalsResponse) throws IOException {
            MedalItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, listUserMedalsResponse.mmedal_list);
            UserInfo.ADAPTER.encodeWithTag(protoWriter, 2, listUserMedalsResponse.muser_info);
            protoWriter.writeBytes(listUserMedalsResponse.unknownFields());
        }
    }

    /* renamed from: com.ss.android.lark.pb.ug.ListUserMedalsResponse$a */
    public static final class C50100a extends Message.Builder<ListUserMedalsResponse, C50100a> {

        /* renamed from: a */
        public List<MedalItem> f125228a = Internal.newMutableList();

        /* renamed from: b */
        public UserInfo f125229b;

        /* renamed from: a */
        public ListUserMedalsResponse build() {
            UserInfo userInfo = this.f125229b;
            if (userInfo != null) {
                return new ListUserMedalsResponse(this.f125228a, userInfo, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(userInfo, "muser_info");
        }

        /* renamed from: a */
        public C50100a mo174014a(List<MedalItem> list) {
            Internal.checkElementsNotNull(list);
            this.f125228a = list;
            return this;
        }
    }

    @Override // com.squareup.wire.Message
    public C50100a newBuilder() {
        C50100a aVar = new C50100a();
        aVar.f125228a = Internal.copyOf("mmedal_list", this.mmedal_list);
        aVar.f125229b = this.muser_info;
        aVar.addUnknownFields(unknownFields());
        return aVar;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.mmedal_list.isEmpty()) {
            sb.append(", medal_list=");
            sb.append(this.mmedal_list);
        }
        sb.append(", user_info=");
        sb.append(this.muser_info);
        StringBuilder replace = sb.replace(0, 2, "ListUserMedalsResponse{");
        replace.append('}');
        return replace.toString();
    }

    public ListUserMedalsResponse(List<MedalItem> list, UserInfo userInfo) {
        this(list, userInfo, ByteString.EMPTY);
    }

    public ListUserMedalsResponse(List<MedalItem> list, UserInfo userInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mmedal_list = Internal.immutableCopyOf("mmedal_list", list);
        this.muser_info = userInfo;
    }
}
