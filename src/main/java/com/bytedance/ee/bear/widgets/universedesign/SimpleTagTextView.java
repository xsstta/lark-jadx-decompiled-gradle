package com.bytedance.ee.bear.widgets.universedesign;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/widgets/universedesign/SimpleTagTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mTagsDrawable", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable;", "text", "", "init", "", "onCreateTag", "Lcom/larksuite/component/universe_design/tag/UDTagsDrawable$TagModel;", "setText", "updateUDTagsDrawable", "tagModel", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SimpleTagTextView extends AppCompatTextView {

    /* renamed from: a */
    private UDTagsDrawable f32032a;

    /* renamed from: b */
    private String f32033b;

    /* renamed from: a */
    private final UDTagsDrawable.TagModel m49219a() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        return new UDTagsDrawable.TagModel.Builder(context).mo91418a(this.f32033b).mo91417a(UDTagsDrawable.TagColorSet.BLUE).mo91427g();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleTagTextView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setText(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f32033b = str;
        m49221a(m49219a());
    }

    /* renamed from: a */
    private final void m49221a(UDTagsDrawable.TagModel eVar) {
        if (eVar != null) {
            Context context = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            UDTagsDrawable i = new UDTagsDrawable.Builder(context).mo91384a(eVar).mo91398i();
            this.f32032a = i;
            if (i != null) {
                i.mo91368a((View) this);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SimpleTagTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.SpaceTagTextView);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final void m49220a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.text});
            String string = obtainStyledAttributes.getString(0);
            if (string == null) {
                string = "";
            }
            setText(string);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleTagTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f32033b = "";
        m49220a(context, attributeSet);
    }
}
