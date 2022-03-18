package com.ss.lark.android.avatar.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.media.v1.UploadAudioResponse;
import com.bytedance.lark.pb.media.v1.UploadAvatarRequest;
import com.bytedance.lark.pb.media.v1.UploadImageV2Request;
import com.bytedance.lark.pb.media.v1.UploadImageV2Response;
import com.bytedance.lark.pb.media.v1.UploadSecureImageRequest;
import com.bytedance.lark.pb.media.v1.UploadSecureImageResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57820d;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/lark/android/avatar/service/AvatarService;", "", "()V", "Companion", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.avatar.c.a */
public final class AvatarService {

    /* renamed from: a */
    public static final Companion f162321a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/lark/android/avatar/service/AvatarService$Companion;", "Lcom/ss/lark/android/avatar/service/IAvatarService;", "()V", "uploadAvatar", "", "avatarPath", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "uploadBackground", "backgroundPath", "uploadProfileCoverFile", "profileCoverPath", "core_avatar_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.avatar.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.avatar.c.a$a$a */
        public static final class C64208a<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C64208a f162322a = new C64208a();

            C64208a() {
            }

            /* renamed from: a */
            public final String parse(byte[] bArr) {
                return UploadAudioResponse.ADAPTER.decode(bArr).local_key;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.avatar.c.a$a$b */
        static final class C64209b<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C64209b f162323a = new C64209b();

            C64209b() {
            }

            /* renamed from: a */
            public final String parse(byte[] bArr) {
                return UploadSecureImageResponse.ADAPTER.decode(bArr).token;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.avatar.c.a$a$c */
        static final class C64210c<T> implements SdkSender.IParser<T> {

            /* renamed from: a */
            public static final C64210c f162324a = new C64210c();

            C64210c() {
            }

            /* renamed from: a */
            public final String parse(byte[] bArr) {
                return UploadImageV2Response.ADAPTER.decode(bArr).image_key;
            }
        }

        /* renamed from: a */
        public void mo222616a(String str, IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "avatarPath");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            byte[] a = C26311p.m95276a(str);
            SdkSender.asynSendRequestNonWrap(Command.UPLOAD_AVATAR, new UploadAvatarRequest.C18298a().mo63363a(ByteString.of(Arrays.copyOf(a, a.length))).mo63362a((Boolean) true), iGetDataCallback, C64208a.f162322a);
        }

        /* renamed from: c */
        public void mo222618c(String str, IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "profileCoverPath");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            byte[] a = C26311p.m95276a(str);
            SdkSender.asynSendRequestNonWrap(Command.UPLOAD_IMAGE_V2, new UploadImageV2Request.C18308a().mo63389a(ByteString.of(Arrays.copyOf(a, a.length))).mo63388a(UploadImageV2Request.ImageType.ProfileTopImage), iGetDataCallback, C64210c.f162324a);
        }

        /* renamed from: b */
        public void mo222617b(String str, IGetDataCallback<String> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "backgroundPath");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            int[] b = C57820d.m224436b(str);
            byte[] a = C26311p.m95276a(str);
            SdkSender.asynSendRequestNonWrap(Command.UPLOAD_SECURE_IMAGE, new UploadSecureImageRequest.C18312a().mo63399a(Integer.valueOf(b[0])).mo63402b(Integer.valueOf(b[1])).mo63400a(ByteString.of(Arrays.copyOf(a, a.length))).mo63398a(UploadSecureImageRequest.Type.NORMAL), iGetDataCallback, C64209b.f162323a);
        }
    }
}
