package com.bytedance.ee.bear.more.itemv2;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ISwitchMoreItem;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J*\u0010\u0019\u001a\u00020\u00142\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/SubscribeItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ISwitchMoreItem;", "()V", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "serviceContext$delegate", "Lkotlin/Lazy;", "getIcon", "", "getIconTint", "getId", "", "getTitle", "isCheck", "", "isVisible", "notifyItemChange", "", "adapter", "Ljava/lang/ref/WeakReference;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "onCheckStateChange", "newState", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SubscribeItemV2 extends BaseMoreItem implements ISwitchMoreItem {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SubscribeItemV2.class), "serviceContext", "getServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;"))};
    public static final Companion Companion = new Companion(null);
    private final Lazy serviceContext$delegate = LazyKt.lazy(C10229b.INSTANCE);

    private final C10917c getServiceContext() {
        Lazy lazy = this.serviceContext$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C10917c) lazy.getValue();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_subscribe_add_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "subscribe";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/SubscribeItemV2$Companion;", "", "()V", "TAG", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.SubscribeItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_Subscribe);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.SubscribeItemV2$b */
    static final class C10229b extends Lambda implements Function0<C10917c> {
        public static final C10229b INSTANCE = new C10229b();

        C10229b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ISwitchMoreItem
    public boolean isCheck() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            return moreInfo.mo39035d();
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        boolean z;
        if (!(getMoreInfo() instanceof DocMoreInfo)) {
            return false;
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            DocMoreInfo aVar = (DocMoreInfo) moreInfo;
            if (aVar.mo39010F()) {
                return false;
            }
            boolean a = C4211a.m17514a().mo16536a("spacekit.mobile.more_subscribe_enable", false);
            boolean b = C4211a.m17514a().mo16538b("ccm.docx.subscribe_update_enable", false);
            if ((!a || aVar.mo39057x() != 2) && (!b || aVar.mo39057x() != 22)) {
                z = false;
            } else {
                z = true;
            }
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
            if (TextUtils.equals(d.mo17354O(), aVar.mo39046m())) {
                return z;
            }
            if (!z || !aVar.mo39049p()) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.export.DocMoreInfo");
    }

    public final void notifyItemChange(WeakReference<RecyclerView.Adapter<?>> weakReference, int i) {
        if (!C13726a.m55676b(getHost().mo39165b().getActivity()) || !getHost().mo39167d()) {
            C13479a.m54758a("SubscribeItem", "activity is not active or panel not showing");
            return;
        }
        RecyclerView.Adapter<?> adapter = weakReference.get();
        if (adapter != null) {
            adapter.notifyItemChanged(i);
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ISwitchMoreItem
    public void onCheckStateChange(WeakReference<RecyclerView.Adapter<?>> weakReference, boolean z, int i) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(weakReference, "adapter");
        IMoreInfo moreInfo = getMoreInfo();
        C13479a.m54764b("SubscribeItem", "onItemCheck. ");
        if (moreInfo != null) {
            boolean z2 = !moreInfo.mo39035d();
            if (z2) {
                str = "add_subscribe";
            } else {
                str = "remove_subscribe";
            }
            C10196b.m42465a(moreInfo, str);
            ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31501a(C10236c.m42701a(moreInfo), C10236c.m42702b(moreInfo), z2, new SubscribeItemV2$onCheckStateChange$1(this, moreInfo, z2, weakReference, i));
            if (moreInfo instanceof DocMoreInfo) {
                Bundle arguments = getHost().mo39165b().getArguments();
                String h = moreInfo.mo39041h();
                int e = moreInfo.mo39036e();
                String f = moreInfo.mo39038f();
                if (z2) {
                    str2 = "follow_open";
                } else {
                    str2 = "follow_close";
                }
                C10196b.m42463a(arguments, h, e, false, f, str2, "none", "", "", "", moreInfo instanceof WikiMoreInfo, ((DocMoreInfo) moreInfo).mo39008D());
            }
        }
    }
}
