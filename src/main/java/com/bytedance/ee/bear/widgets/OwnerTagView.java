package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ee.bear.widgets.universedesign.SpaceTagTextView;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/widgets/OwnerTagView;", "Lcom/bytedance/ee/bear/widgets/universedesign/SpaceTagTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onCreateTag", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class OwnerTagView extends SpaceTagTextView {
    @Override // com.bytedance.ee.bear.widgets.universedesign.SpaceTagTextView
    /* renamed from: a */
    public UDTagsDrawable.TagModel mo16312a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return new UDTagsDrawable.TagModel.Builder(context).mo91418a(getContext().getText(R.string.Doc_Share_ShareOwner).toString()).mo91417a(UDTagsDrawable.TagColorSet.BLUE).mo91427g();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OwnerTagView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OwnerTagView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OwnerTagView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
