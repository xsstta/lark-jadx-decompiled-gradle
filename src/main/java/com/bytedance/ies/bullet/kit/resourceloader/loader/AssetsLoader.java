package com.bytedance.ies.bullet.kit.resourceloader.loader;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.resourceloader.ResLoaderConfigManager;
import com.bytedance.ies.bullet.kit.resourceloader.ResourceMetaData;
import com.bytedance.ies.bullet.kit.resourceloader.StreamMetaInfo;
import com.bytedance.ies.bullet.p782a.p783a.C14403i;
import com.bytedance.ies.bullet.service.base.ChannelBundleModel;
import com.bytedance.ies.bullet.service.base.ResourceFrom;
import com.bytedance.ies.bullet.service.base.ResourceInfo;
import com.bytedance.ies.bullet.service.base.ResourceType;
import com.bytedance.ies.bullet.service.base.api.ILoggable;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.bytedance.ies.bullet.service.base.resourceloader.config.ResourceLoaderConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.TaskConfig;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J@\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\u0012H\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ies/bullet/kit/resourceloader/loader/AssetsLoader;", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/IXResourceLoader;", "()V", "cancelLoad", "", "interceptAssetRequest", "Lcom/bytedance/ies/bullet/kit/resourceloader/ResourceMetaData;", "url", "", "loadAssetStream", "uri", "Landroid/net/Uri;", "loadAsync", "input", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "config", "Lcom/bytedance/ies/bullet/service/base/resourceloader/config/TaskConfig;", "resolve", "Lkotlin/Function1;", "reject", "", "loadSync", "x-resourceloader_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.a.a.a.a */
public final class AssetsLoader extends IXResourceLoader {
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void cancelLoad() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ies/bullet/service/base/ResourceInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.a$a */
    static final class C14377a extends Lambda implements Function1<ResourceInfo, Unit> {
        final /* synthetic */ CountDownLatch $countDown;
        final /* synthetic */ Ref.ObjectRef $result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14377a(Ref.ObjectRef objectRef, CountDownLatch countDownLatch) {
            super(1);
            this.$result = objectRef;
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ResourceInfo mVar) {
            invoke(mVar);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ies.bullet.service.base.m */
        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(ResourceInfo mVar) {
            Intrinsics.checkParameterIsNotNull(mVar, "it");
            this.$result.element = mVar;
            this.$countDown.countDown();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.a.a.a.a$b */
    static final class C14378b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ CountDownLatch $countDown;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14378b(CountDownLatch countDownLatch) {
            super(1);
            this.$countDown = countDownLatch;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            this.$countDown.countDown();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009e A[SYNTHETIC, Splitter:B:33:0x009e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.bytedance.ies.bullet.kit.resourceloader.ResourceMetaData m57866a(android.net.Uri r7) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.resourceloader.loader.AssetsLoader.m57866a(android.net.Uri):com.bytedance.ies.bullet.a.a.h");
    }

    /* renamed from: a */
    private final ResourceMetaData m57867a(String str) {
        String str2;
        ILoggable.C14411b.m58025a(this, "interceptAssetRequest# url=" + str, null, null, 6, null);
        ResourceLoaderConfig a = ResLoaderConfigManager.f37779a.mo52569a().mo52565a(getService());
        if (a.mo52738c().isEmpty()) {
            Uri parse = Uri.parse(str);
            Intrinsics.checkExpressionValueIsNotNull(parse, "Uri.parse(url)");
            return new ResourceMetaData(parse);
        }
        ArrayList arrayList = new ArrayList();
        List<String> c = a.mo52738c();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c, 10));
        for (T t : c) {
            if (LoaderUtil.f37766a.mo52547b(t)) {
                Pattern compile = Pattern.compile(t);
                Intrinsics.checkExpressionValueIsNotNull(compile, "Pattern.compile(it)");
                arrayList.add(compile);
            }
            arrayList2.add(Unit.INSTANCE);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str3 = str;
            Matcher matcher = ((Pattern) arrayList.get(i)).matcher(str3);
            if (matcher.find()) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str3, "?", 0, false, 6, (Object) null);
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str3, "#", 0, false, 6, (Object) null);
                int coerceAtMost = RangesKt.coerceAtMost(indexOf$default, indexOf$default2);
                if (coerceAtMost == -1) {
                    coerceAtMost = RangesKt.coerceAtLeast(indexOf$default, indexOf$default2);
                }
                if (coerceAtMost != -1) {
                    int end = matcher.end();
                    if (str != null) {
                        str2 = str.substring(end, coerceAtMost);
                        Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    int end2 = matcher.end();
                    if (str != null) {
                        str2 = str.substring(end2);
                        Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (StringsKt.endsWith$default(str2, "/", false, 2, (Object) null)) {
                    int length = str2.length() - 1;
                    if (str2 != null) {
                        str2 = str2.substring(0, length);
                        Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    return m57866a(C14403i.m57936b(str2, null, 2, null));
                }
            }
        }
        Uri parse2 = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse2, "Uri.parse(url)");
        return new ResourceMetaData(parse2);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public ResourceInfo loadSync(ResourceInfo mVar, TaskConfig jVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "input");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        ILoggable.C14411b.m58025a(this, "start to sync load from assets", null, null, 6, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        loadAsync(mVar, jVar, new C14377a(objectRef, countDownLatch), new C14378b(countDownLatch));
        countDownLatch.await(jVar.mo52755c(), TimeUnit.MILLISECONDS);
        return objectRef.element;
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public void loadAsync(ResourceInfo mVar, TaskConfig jVar, Function1<? super ResourceInfo, Unit> function1, Function1<? super Throwable, Unit> function12) {
        String str;
        String str2;
        boolean z;
        InputStream inputStream;
        String str3;
        Uri b;
        InputStream inputStream2;
        String str4;
        Uri b2;
        Intrinsics.checkParameterIsNotNull(mVar, "input");
        Intrinsics.checkParameterIsNotNull(jVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "resolve");
        Intrinsics.checkParameterIsNotNull(function12, "reject");
        ILoggable.C14411b.m58025a(this, "start to async load from assets", null, null, 6, null);
        if (!jVar.mo52764j()) {
            function12.invoke(new Throwable("reject because config.useAssetsLoader = false"));
            return;
        }
        ChannelBundleModel i = mVar.mo52711i();
        if (i == null || (str = i.mo52620a()) == null) {
            str = jVar.mo52760f();
        }
        ChannelBundleModel i2 = mVar.mo52711i();
        if (i2 == null || (str2 = i2.mo52623b()) == null) {
            str2 = jVar.mo52761g();
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            function12.invoke(new Exception("channel is invalid on url:" + mVar.mo52702b() + " for asset"));
            return;
        }
        try {
            String a = LoaderUtil.f37766a.mo52545a(str, str2);
            InputStream inputStream3 = null;
            ResourceMetaData a2 = m57866a(C14403i.m57936b(a, null, 2, null));
            StreamMetaInfo b3 = a2.mo52601b();
            if (b3 != null) {
                inputStream = b3.mo52603a();
            } else {
                inputStream = null;
            }
            String str5 = "";
            if (inputStream == null) {
                String uri = mVar.mo52702b().toString();
                Intrinsics.checkExpressionValueIsNotNull(uri, "input.srcUri.toString()");
                ResourceMetaData a3 = m57867a(uri);
                StreamMetaInfo b4 = a3.mo52601b();
                if (b4 != null) {
                    inputStream2 = b4.mo52603a();
                } else {
                    inputStream2 = null;
                }
                if (inputStream2 == null) {
                    function12.invoke(new FileNotFoundException("resource not found with asset"));
                    return;
                }
                StreamMetaInfo b5 = a3.mo52601b();
                if (b5 == null || (b2 = b5.mo52604b()) == null || (str4 = b2.getPath()) == null) {
                    str4 = str5;
                }
                Intrinsics.checkExpressionValueIsNotNull(str4, "streamMeta?.streamPathUri?.path ?: \"\"");
                if (LoaderUtil.f37766a.mo52547b(str4)) {
                    int length = str4.length();
                    if (str4 != null) {
                        str5 = str4.substring(1, length);
                        Intrinsics.checkExpressionValueIsNotNull(str5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                mVar.mo52700a(str5);
                if (b5 != null) {
                    inputStream3 = b5.mo52603a();
                }
                mVar.mo52699a(inputStream3);
                mVar.mo52697a(ResourceType.ASSET);
                mVar.mo52696a(ResourceFrom.BUILTIN);
                mVar.mo52701a(true);
                function1.invoke(mVar);
                return;
            }
            StreamMetaInfo b6 = a2.mo52601b();
            if (b6 == null || (b = b6.mo52604b()) == null || (str3 = b.getPath()) == null) {
                str3 = str5;
            }
            Intrinsics.checkExpressionValueIsNotNull(str3, "streamMeta?.streamPathUri?.path ?: \"\"");
            if (LoaderUtil.f37766a.mo52547b(str3)) {
                int length2 = str3.length();
                if (str3 != null) {
                    str5 = str3.substring(1, length2);
                    Intrinsics.checkExpressionValueIsNotNull(str5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            mVar.mo52700a(str5);
            if (b6 != null) {
                inputStream3 = b6.mo52603a();
            }
            mVar.mo52699a(inputStream3);
            mVar.mo52697a(ResourceType.ASSET);
            mVar.mo52696a(ResourceFrom.BUILTIN);
            mVar.mo52701a(true);
            function1.invoke(mVar);
        } catch (Exception e) {
            function12.invoke(e);
        }
    }
}
