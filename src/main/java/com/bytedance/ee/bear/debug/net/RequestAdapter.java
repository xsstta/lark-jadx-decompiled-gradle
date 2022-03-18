package com.bytedance.ee.bear.debug.net;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ee.bear.contract.DebugRequest;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p701d.C13614b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/debug/net/RequestAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/contract/DebugRequest;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "convert", "", "helper", "item", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.net.a */
public final class RequestAdapter extends BaseQuickAdapter<DebugRequest, C20923c> {
    public RequestAdapter() {
        super((int) R.layout.item_request);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.a$a */
    public static final class View$OnLongClickListenerC5302a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ RequestAdapter f15207a;

        /* renamed from: b */
        final /* synthetic */ DebugRequest f15208b;

        View$OnLongClickListenerC5302a(RequestAdapter aVar, DebugRequest debugRequest) {
            this.f15207a = aVar;
            this.f15208b = debugRequest;
        }

        public final boolean onLongClick(View view) {
            C13614b.m55259a(this.f15207a.f51211q, this.f15208b.mo20048d());
            Toast.showText(this.f15207a.f51211q, "logId已复制到剪切板");
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/debug/net/RequestAdapter$convert$2", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.net.a$b */
    public static final class C5303b extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ RequestAdapter f15209a;

        /* renamed from: b */
        final /* synthetic */ DebugRequest f15210b;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            if (this.f15209a.f51211q instanceof RequestActivity) {
                Context context = this.f15209a.f51211q;
                if (context != null) {
                    ((RequestActivity) context).mo21315a(this.f15210b);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.debug.net.RequestActivity");
            }
        }

        C5303b(RequestAdapter aVar, DebugRequest debugRequest) {
            this.f15209a = aVar;
            this.f15210b = debugRequest;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C20923c cVar, DebugRequest debugRequest) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(cVar, "helper");
        Intrinsics.checkParameterIsNotNull(debugRequest, "item");
        if (debugRequest.mo20045a() == 0) {
            Context context = this.f51211q;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            i = context.getResources().getColor(R.color.text_title);
        } else {
            Context context2 = this.f51211q;
            Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
            i = context2.getResources().getColor(R.color.function_danger_500);
        }
        if (debugRequest.mo20045a() == 0) {
            Context context3 = this.f51211q;
            Intrinsics.checkExpressionValueIsNotNull(context3, "mContext");
            i2 = context3.getResources().getColor(R.color.text_caption);
        } else {
            Context context4 = this.f51211q;
            Intrinsics.checkExpressionValueIsNotNull(context4, "mContext");
            i2 = context4.getResources().getColor(R.color.function_danger_500);
        }
        C20923c c = cVar.mo70737a(R.id.url, debugRequest.mo20046b()).mo70743c(R.id.url, i);
        C20923c c2 = c.mo70737a(R.id.resultCode, "code:" + debugRequest.mo20045a()).mo70743c(R.id.resultCode, i2);
        c2.mo70737a(R.id.logid, "logId:" + debugRequest.mo20048d()).mo70743c(R.id.logid, i2);
        ((TextView) cVar.mo70740b(R.id.logid)).setOnLongClickListener(new View$OnLongClickListenerC5302a(this, debugRequest));
        cVar.mo70740b(R.id.url).setOnClickListener(new C5303b(this, debugRequest));
    }
}
