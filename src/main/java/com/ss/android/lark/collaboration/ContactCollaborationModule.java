package com.ss.android.lark.collaboration;

import android.content.Context;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.collaboration.ApplyCollabUtils;
import com.ss.android.lark.collaboration.p1730a.AbstractC35340a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001c\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/collaboration/ContactCollaborationModule;", "", "dependency", "Lcom/ss/android/lark/collaboration/dependency/ICollaborationDependency;", "(Lcom/ss/android/lark/collaboration/dependency/ICollaborationDependency;)V", "showApplyCollabDialog", "", "context", "Landroid/content/Context;", "initBuilder", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder;", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IApplyCollabDialogBuilder;", "showBlockTipDialog", "Lcom/ss/android/lark/biz/core/api/contact/IInitBuilder$IBlockTipBuilder;", "Companion", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.collaboration.d */
public final class ContactCollaborationModule {

    /* renamed from: a */
    public static volatile AbstractC35340a f91398a;

    /* renamed from: b */
    public static final Companion f91399b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC35340a m138138a() {
        return f91399b.mo130104b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/collaboration/ContactCollaborationModule$Companion;", "", "()V", "TAG", "", "collaborationDependency", "Lcom/ss/android/lark/collaboration/dependency/ICollaborationDependency;", "getCollaborationDependency", "()Lcom/ss/android/lark/collaboration/dependency/ICollaborationDependency;", "setCollaborationDependency", "(Lcom/ss/android/lark/collaboration/dependency/ICollaborationDependency;)V", "getDependency", "getFeatureGatingMap", "", "", "core_contact_contact-collaboration_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.collaboration.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final AbstractC35340a mo130103a() {
            return ContactCollaborationModule.f91398a;
        }

        @JvmStatic
        /* renamed from: b */
        public final AbstractC35340a mo130104b() {
            return mo130103a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ContactCollaborationModule(AbstractC35340a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        f91398a = aVar;
    }

    /* renamed from: b */
    public final void mo130102b(Context context, IInitBuilder<IInitBuilder.IBlockTipBuilder> aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "initBuilder");
        ApplyCollabUtils.BlockTipDialog aVar2 = new ApplyCollabUtils.BlockTipDialog(context);
        aVar.init(aVar2);
        aVar2.mo130092a();
    }

    /* renamed from: a */
    public final void mo130101a(Context context, IInitBuilder<IInitBuilder.IApplyCollabDialogBuilder> aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "initBuilder");
        AbstractC35340a aVar2 = f91398a;
        if (aVar2 == null || aVar2.mo130066a("lark.client.contact.opt", false)) {
            ApplyCollabDialog aVar3 = new ApplyCollabDialog(context);
            aVar.init(aVar3);
            aVar3.mo130044a();
        }
    }
}
