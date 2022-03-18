package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4530e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.ui.ColorUtils;
import com.ruffian.library.RTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectTextView;", "Lcom/ruffian/library/RTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "initAttr", "", "setColor", "backgroundColor", "", "textColor", "setData", "selectEntity", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/OptionField$OptionEntity;", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SelectTextView extends RTextView {

    /* renamed from: a */
    public static final Companion f13698a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/select/SelectTextView$Companion;", "", "()V", "TAG", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.SelectTextView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final void m19258b() {
        setIncludeFontPadding(false);
        setCornerRadius((float) C13749l.m55738a(100));
        setGravity(17);
        setPadding(C13749l.m55738a(12), C13749l.m55738a(2), C13749l.m55738a(12), C13749l.m55738a(2));
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public SelectTextView(Context context) {
        super(context);
        m19258b();
    }

    public final void setData(C4530e.C4531a aVar) {
        String str;
        if (aVar == null || (str = aVar.mo17734b()) == null) {
            str = "";
        }
        setText(str);
        if (aVar != null) {
            mo18231a(aVar.mo17738d(), aVar.mo17739e());
        }
    }

    public SelectTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19258b();
    }

    /* renamed from: a */
    public final void mo18231a(String str, String str2) {
        if (str != null) {
            try {
                mo96117a(ColorUtils.m55697a(str));
            } catch (Exception e) {
                C13479a.m54759a("SelectTextView", "parse color failed!", e);
                return;
            }
        }
        if (str2 != null) {
            setTextColor(ColorUtils.m55697a(str2));
        }
    }
}
