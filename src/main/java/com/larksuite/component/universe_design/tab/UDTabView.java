package com.larksuite.component.universe_design.tab;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\b\u0010!\u001a\u00020\"H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabView;", "Landroid/widget/LinearLayout;", "Lcom/larksuite/component/universe_design/tab/IUDTabView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "maxWidth", "", "getMaxWidth$universe_ui_tab_release", "()I", "setMaxWidth$universe_ui_tab_release", "(I)V", "multiLineTitleTextSize", "getMultiLineTitleTextSize$universe_ui_tab_release", "setMultiLineTitleTextSize$universe_ui_tab_release", "singleLineTitleTextSize", "", "getSingleLineTitleTextSize$universe_ui_tab_release", "()F", "setSingleLineTitleTextSize$universe_ui_tab_release", "(F)V", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "getTab$universe_ui_tab_release", "()Lcom/larksuite/component/universe_design/tab/UDTab;", "setTab$universe_ui_tab_release", "(Lcom/larksuite/component/universe_design/tab/UDTab;)V", "getContentViewLeft", "getContentViewRight", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "performClick", "", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.tab.e */
public class UDTabView extends LinearLayout implements IUDTabView {

    /* renamed from: a */
    private UDTab f63638a;

    /* renamed from: b */
    private int f63639b = -1;

    /* renamed from: c */
    private int f63640c = -1;

    /* renamed from: d */
    private float f63641d = -1.0f;

    /* renamed from: e */
    private HashMap f63642e;

    /* renamed from: a */
    public View mo91357a(int i) {
        if (this.f63642e == null) {
            this.f63642e = new HashMap();
        }
        View view = (View) this.f63642e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f63642e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMaxWidth$universe_ui_tab_release() {
        return this.f63639b;
    }

    public final int getMultiLineTitleTextSize$universe_ui_tab_release() {
        return this.f63640c;
    }

    public final float getSingleLineTitleTextSize$universe_ui_tab_release() {
        return this.f63641d;
    }

    public final UDTab getTab$universe_ui_tab_release() {
        return this.f63638a;
    }

    public boolean performClick() {
        boolean performClick = super.performClick();
        UDTab bVar = this.f63638a;
        if (bVar == null) {
            return performClick;
        }
        if (bVar != null) {
            bVar.mo91344e();
        }
        return true;
    }

    @Override // com.larksuite.component.universe_design.tab.IUDTabView
    public int getContentViewLeft() {
        int left;
        int left2;
        ImageView imageView = (ImageView) mo91357a(R.id.ud_tab_icon);
        if (imageView == null || imageView.getVisibility() != 0) {
            FrameLayout frameLayout = (FrameLayout) mo91357a(R.id.ud_tab_title_warpper);
            if (frameLayout == null || frameLayout.getVisibility() != 0) {
                return 0;
            }
            left = frameLayout.getLeft();
            left2 = getLeft();
        } else {
            left = imageView.getLeft();
            left2 = getLeft();
        }
        return left + left2;
    }

    @Override // com.larksuite.component.universe_design.tab.IUDTabView
    public int getContentViewRight() {
        int right;
        int left;
        FrameLayout frameLayout = (FrameLayout) mo91357a(R.id.ud_tab_title_warpper);
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            ImageView imageView = (ImageView) mo91357a(R.id.ud_tab_icon);
            if (imageView == null || imageView.getVisibility() != 0) {
                return 0;
            }
            right = imageView.getRight();
            left = getLeft();
        } else {
            right = frameLayout.getRight();
            left = getLeft();
        }
        return right + left;
    }

    public final void setMaxWidth$universe_ui_tab_release(int i) {
        this.f63639b = i;
    }

    public final void setMultiLineTitleTextSize$universe_ui_tab_release(int i) {
        this.f63640c = i;
    }

    public final void setSingleLineTitleTextSize$universe_ui_tab_release(float f) {
        this.f63641d = f;
    }

    public final void setTab$universe_ui_tab_release(UDTab bVar) {
        this.f63638a = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTabView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater.from(context).inflate(R.layout.ud_tab_item_layout, (ViewGroup) this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-2, UDDimenUtils.m93313d(context, R.dimen.ud_tabs_height)));
        setGravity(17);
        setOrientation(0);
        setClickable(true);
        setFocusable(true);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        UDTab bVar;
        TextView f;
        if (this.f63639b > 0) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int i4 = this.f63639b;
            if (size > i4 || mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                super.onMeasure(i3, i2);
                bVar = this.f63638a;
                if (bVar != null && (f = bVar.mo91345f()) != null) {
                    if (f.getLineCount() <= 1) {
                        float textSize = f.getTextSize();
                        float f2 = this.f63641d;
                        if (textSize != f2) {
                            f.setTextSize(0, f2);
                            super.onMeasure(i, i2);
                            if (f.getLineCount() > 1 && this.f63640c > 0) {
                                float textSize2 = f.getTextSize();
                                int i5 = this.f63640c;
                                if (textSize2 != ((float) i5)) {
                                    f.setTextSize(0, (float) i5);
                                    super.onMeasure(i, i2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (this.f63640c > 0) {
                        float textSize3 = f.getTextSize();
                        int i6 = this.f63640c;
                        if (textSize3 != ((float) i6)) {
                            f.setTextSize(0, (float) i6);
                            super.onMeasure(i, i2);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        i3 = i;
        super.onMeasure(i3, i2);
        bVar = this.f63638a;
        if (bVar != null) {
        }
    }
}
