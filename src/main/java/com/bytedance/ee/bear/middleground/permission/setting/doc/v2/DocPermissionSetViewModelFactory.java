package com.bytedance.ee.bear.middleground.permission.setting.doc.v2;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J'\u0010\u0005\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "docPermSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "(Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.f */
public final class DocPermissionSetViewModelFactory extends C1144ai.C1148d {

    /* renamed from: a */
    public static final Companion f27058a = new Companion(null);

    /* renamed from: b */
    private final DocPermSetInfo f27059b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/middleground/permission/setting/doc/v2/DocPermissionSetViewModelFactory$Companion;", "", "()V", "newInstance", "Landroidx/lifecycle/ViewModelProvider$Factory;", "permSetInfo", "Lcom/bytedance/ee/bear/middleground_permission_export/model/permissionset/DocPermSetInfo;", "middleground-permission_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.permission.setting.doc.b.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1144ai.AbstractC1146b mo38255a(DocPermSetInfo docPermSetInfo) {
            Intrinsics.checkParameterIsNotNull(docPermSetInfo, "permSetInfo");
            return new DocPermissionSetViewModelFactory(docPermSetInfo);
        }
    }

    public DocPermissionSetViewModelFactory(DocPermSetInfo docPermSetInfo) {
        Intrinsics.checkParameterIsNotNull(docPermSetInfo, "docPermSetInfo");
        this.f27059b = docPermSetInfo;
    }

    @Override // androidx.lifecycle.C1144ai.C1148d, androidx.lifecycle.C1144ai.AbstractC1146b
    public <T extends AbstractC1142af> T create(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        try {
            return cls.getConstructor(DocPermSetInfo.class).newInstance(this.f27059b);
        } catch (InstantiationException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
