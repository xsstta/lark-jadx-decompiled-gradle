package com.bytedance.ee.bear.document.docmetainfo;

import com.bytedance.ee.bear.DocMetaInfo;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/docmetainfo/DocMetaInfoExecutor;", "", "()V", "TAG", "", "requestDocInfo", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/DocMetaInfo;", "token", ShareHitPoint.f121869d, "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.a.a */
public final class DocMetaInfoExecutor {

    /* renamed from: a */
    public static final DocMetaInfoExecutor f15945a = new DocMetaInfoExecutor();

    private DocMetaInfoExecutor() {
    }

    /* renamed from: a */
    public final AbstractC68307f<DocMetaInfo> mo22562a(String str, int i) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "token");
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        if (i == aVar.mo32555b()) {
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            str2 = String.format("/api/meta/?token=%s&type=%s", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
            Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
        } else {
            C8275a aVar2 = C8275a.f22372e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
            if (i == aVar2.mo32555b()) {
                StringCompanionObject mVar2 = StringCompanionObject.f173215a;
                str2 = String.format("/api/sheet/%s/", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
            } else {
                C8275a aVar3 = C8275a.f22373f;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.BITABLE");
                if (i == aVar3.mo32555b()) {
                    StringCompanionObject mVar3 = StringCompanionObject.f173215a;
                    str2 = String.format("/api/bitable/%s/", Arrays.copyOf(new Object[]{str}, 1));
                    Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
                } else {
                    C8275a aVar4 = C8275a.f22375h;
                    Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.FILE");
                    if (i == aVar4.mo32555b()) {
                        StringCompanionObject mVar4 = StringCompanionObject.f173215a;
                        str2 = String.format("/api/meta/?token=%s&type=%s", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                        Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
                    } else {
                        StringCompanionObject mVar5 = StringCompanionObject.f173215a;
                        str2 = String.format("/api/meta/?token=%s&type=%s", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                        Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
                    }
                }
            }
        }
        AbstractC68307f<DocMetaInfo> a = ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(new DocMetaInfoParser()).mo20141a(new NetService.C5077f(str2));
        Intrinsics.checkExpressionValueIsNotNull(a, "KoinJavaComponent.get(Ne…mpleRequest<String>(url))");
        return a;
    }
}
