package com.ss.android.lark.searchcommon.view.general.lynx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.messaging.Constants;
import com.lynx.tasm.AbstractC26911n;
import com.lynx.tasm.behavior.AbstractC26674h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.utils.rxjava.C57865c;
import javax.xml.transform.Transformer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002JF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/lynx/ASLynxViewClient;", "Lcom/lynx/tasm/LynxViewClient;", "()V", "isBase64Img", "", "imgUrl", "", "loadBase64Img", "Landroid/graphics/Bitmap;", "loadImage", "", "context", "Landroid/content/Context;", "cacheKey", "src", "width", "", "height", "transformer", "Ljavax/xml/transform/Transformer;", "handler", "Lcom/lynx/tasm/behavior/ImageInterceptor$CompletionHandler;", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.a */
public final class ASLynxViewClient extends AbstractC26911n {

    /* renamed from: a */
    public static final Companion f133776a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/lynx/ASLynxViewClient$Companion;", "", "()V", "AVATAR_HOST", "", "AVATAR_ID", "QUERY_KEY", "SCHEME", "TAG", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.a$b */
    static final class C54033b<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ String f133777a;

        /* renamed from: b */
        final /* synthetic */ String f133778b;

        C54033b(String str, String str2) {
            this.f133777a = str;
            this.f133778b = str2;
        }

        /* renamed from: a */
        public final Bitmap produce() {
            return BitmapFactory.decodeFile(SearchCommonModuleDependency.m208732b().mo102888a(this.f133777a, this.f133778b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.a$c */
    static final class C54034c<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC26674h.AbstractC26675a f133779a;

        C54034c(AbstractC26674h.AbstractC26675a aVar) {
            this.f133779a = aVar;
        }

        /* renamed from: a */
        public final void consume(Bitmap bitmap) {
            Log.m165379d("ASLynxViewClient", "load aisearch image complete " + bitmap);
            this.f133779a.imageLoadCompletion(bitmap, null);
        }
    }

    /* renamed from: e */
    private final boolean m209676e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (StringsKt.startsWith$default(str, "data:image/png;base64,", false, 2, (Object) null) || StringsKt.startsWith$default(str, "data:image/*;base64,", false, 2, (Object) null) || StringsKt.startsWith$default(str, "data:image/jpg;base64,", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private final Bitmap m209677f(String str) {
        try {
            byte[] bArr = null;
            byte[] decode = Base64.decode((String) StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).get(1), 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (IllegalArgumentException e) {
            Log.m165384e("ASLynxViewClient", "decode base64 error", e);
            return null;
        }
    }

    @Override // com.lynx.tasm.behavior.AbstractC26674h, com.lynx.tasm.AbstractC26911n
    /* renamed from: a */
    public void mo53708a(Context context, String str, String str2, float f, float f2, Transformer transformer, AbstractC26674h.AbstractC26675a aVar) {
        Bitmap f3;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "handler");
        Log.m165379d("ASLynxViewClient", "loadImage " + str2);
        if (str2 == null || !m209676e(str2) || (f3 = m209677f(str2)) == null) {
            try {
                Uri parse = Uri.parse(str2);
                Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
                if (TextUtils.equals(parse.getScheme(), "aisearch") && TextUtils.equals(parse.getHost(), "avatar")) {
                    C57865c.m224574a(new C54033b(parse.getQueryParameter("key"), parse.getQueryParameter("id")), new C54034c(aVar));
                    return;
                }
            } catch (UnsupportedOperationException e) {
                Log.m165384e("ASLynxViewClient", "error", e);
            } catch (NullPointerException e2) {
                Log.m165384e("ASLynxViewClient", "error", e2);
            }
            aVar.imageLoadCompletion(null, null);
            return;
        }
        Log.m165379d("ASLynxViewClient", "load base64 image complete " + f3);
        aVar.imageLoadCompletion(f3, null);
    }
}
