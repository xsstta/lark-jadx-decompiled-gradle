package com.bytedance.ee.bear.templates.preview.single;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.templates.TemplateUtils;
import com.bytedance.ee.bear.templates.preview.data.Item;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewPlugin$setupMoreMenu$1", "Lcom/bytedance/ee/bear/browser/plugin/MenuItem;", "onClick", "", "v", "Landroid/view/View;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommonTemplatePreviewPlugin$setupMoreMenu$1 extends MenuItem {
    final /* synthetic */ Drawable $tintDrawable;
    final /* synthetic */ CommonTemplatePreviewPlugin this$0;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin$setupMoreMenu$1$b */
    static final class C11581b extends Lambda implements Function0<Unit> {
        final /* synthetic */ Item $it;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11581b(Item item) {
            super(0);
            this.$it = item;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            CommonTemplatePreviewAnalytic.f31207b.mo44509a(this.$it);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin$setupMoreMenu$1$c */
    static final class C11582c extends Lambda implements Function0<Unit> {
        final /* synthetic */ Item $it;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11582c(Item item) {
            super(0);
            this.$it = item;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            CommonTemplatePreviewAnalytic.f31207b.mo44513b(this.$it);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/bytedance/ee/bear/templates/preview/single/CommonTemplatePreviewPlugin$setupMoreMenu$1$onClick$1$3"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin$setupMoreMenu$1$a */
    static final class C11580a extends Lambda implements Function0<Unit> {
        final /* synthetic */ Item $it;
        final /* synthetic */ CommonTemplatePreviewPlugin$setupMoreMenu$1 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11580a(Item item, CommonTemplatePreviewPlugin$setupMoreMenu$1 commonTemplatePreviewPlugin$setupMoreMenu$1) {
            super(0);
            this.$it = item;
            this.this$0 = commonTemplatePreviewPlugin$setupMoreMenu$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            Intent intent = new Intent();
            intent.putExtra("token", this.$it.getObjToken());
            this.this$0.this$0.getActivity().setResult(SmEvents.EVENT_HB_NOTICE_DISCONNECT, intent);
            this.this$0.this$0.getActivity().finish();
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.MenuItem
    public void onClick(View view) {
        Item currTemplate;
        Intrinsics.checkParameterIsNotNull(view, "v");
        CommonTemplateViewModel cVar = this.this$0.commonTemplateViewModel;
        if (!(cVar == null || (currTemplate = cVar.getCurrTemplate()) == null)) {
            TemplateUtils gVar = TemplateUtils.f31021a;
            Context context = this.this$0.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            gVar.mo44262a(context, currTemplate.getObjType(), currTemplate.getObjToken(), new C11581b(currTemplate), new C11582c(currTemplate), new C11580a(currTemplate, this));
        }
        CommonTemplatePreviewAnalytic.f31207b.mo44512b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonTemplatePreviewPlugin$setupMoreMenu$1(CommonTemplatePreviewPlugin commonTemplatePreviewPlugin, Drawable drawable, String str, Drawable drawable2, String str2) {
        super(str, drawable2, str2);
        this.this$0 = commonTemplatePreviewPlugin;
        this.$tintDrawable = drawable;
    }
}
