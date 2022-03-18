package com.bytedance.ies.bullet.service.base;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ies.bullet.service.base.api.IBulletService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J«\u0001\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2'\b\u0002\u0010\u0011\u001a!\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00150\u0012j\u0002`\u00162<\b\u0002\u0010\u0017\u001a6\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00150\u0018j\u0002`\u001aH&¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/IRouterService;", "Lcom/bytedance/ies/bullet/service/base/api/IBulletService;", "close", "", "containerId", "", "open", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "bundle", "Landroid/os/Bundle;", "packageNames", "", "hooks", "Lcom/bytedance/ies/bullet/service/base/IConvertHook;", "onPreOpen", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "Lcom/bytedance/ies/bullet/service/base/PreOpenHook;", "onPostOpen", "Lkotlin/Function2;", "success", "Lcom/bytedance/ies/bullet/service/base/PostOpenHook;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.g */
public interface IRouterService extends IBulletService {
    /* renamed from: a */
    boolean mo33894a(Context context, Uri uri, Bundle bundle, List<String> list, List<? extends Object> list2, Function1<? super Uri, Unit> function1, Function2<? super Uri, ? super Boolean, Unit> kVar);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.g$a */
    public static final class C14416a {

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/net/Uri;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.bullet.service.base.g$a$a */
        public static final class C14417a extends Lambda implements Function1<Uri, Unit> {
            public static final C14417a INSTANCE = new C14417a();

            C14417a() {
                super(1);
            }

            public final void invoke(Uri uri) {
                Intrinsics.checkParameterIsNotNull(uri, "it");
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
                invoke(uri);
                return Unit.INSTANCE;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/net/Uri;", "<anonymous parameter 1>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ies.bullet.service.base.g$a$b */
        public static final class C14418b extends Lambda implements Function2<Uri, Boolean, Unit> {
            public static final C14418b INSTANCE = new C14418b();

            C14418b() {
                super(2);
            }

            public final void invoke(Uri uri, boolean z) {
                Intrinsics.checkParameterIsNotNull(uri, "<anonymous parameter 0>");
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(Uri uri, Boolean bool) {
                invoke(uri, bool.booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m58057a(IRouterService gVar, Context context, Uri uri, Bundle bundle, List list, List list2, Function1 function1, Function2 kVar, int i, Object obj) {
            Bundle bundle2;
            ArrayList arrayList;
            List list3;
            C14417a aVar;
            C14418b bVar;
            if (obj == null) {
                if ((i & 4) != 0) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                if ((i & 8) != 0) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = list;
                }
                if ((i & 16) != 0) {
                    list3 = null;
                } else {
                    list3 = list2;
                }
                if ((i & 32) != 0) {
                    aVar = C14417a.INSTANCE;
                } else {
                    aVar = function1;
                }
                if ((i & 64) != 0) {
                    bVar = C14418b.INSTANCE;
                } else {
                    bVar = kVar;
                }
                return gVar.mo33894a(context, uri, bundle2, arrayList, list3, aVar, bVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: open");
        }
    }
}
