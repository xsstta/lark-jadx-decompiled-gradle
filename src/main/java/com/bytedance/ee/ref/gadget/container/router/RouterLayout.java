package com.bytedance.ee.ref.gadget.container.router;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.ref.gadget.container.p696a.C13572a;
import com.larksuite.suite.R;
import java.util.List;
import java.util.Stack;

public class RouterLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC13574a f35693a;

    /* renamed from: b */
    private Stack<View> f35694b;

    /* renamed from: c */
    private int f35695c;

    /* renamed from: d */
    private int f35696d;

    /* renamed from: e */
    private View f35697e;

    /* renamed from: com.bytedance.ee.ref.gadget.container.router.RouterLayout$a */
    public interface AbstractC13574a {
    }

    public View getCurrentView() {
        return this.f35697e;
    }

    public Stack<View> getNormalPageList() {
        return this.f35694b;
    }

    /* renamed from: a */
    private void m55062a() {
        this.f35694b = new Stack<>();
        this.f35695c = R.anim.microapp_i_slide_in_right;
        this.f35696d = R.anim.microapp_i_slide_out_right;
    }

    public C13572a getTabLayout() {
        if (this.f35694b.isEmpty()) {
            return null;
        }
        View view = this.f35694b.get(0);
        if (view instanceof C13575a) {
            return ((C13575a) view).getTabLayout();
        }
        return null;
    }

    public List<View> getTabList() {
        if (this.f35694b.isEmpty()) {
            return null;
        }
        View view = this.f35694b.get(0);
        if (view instanceof C13575a) {
            return ((C13575a) view).getPageList();
        }
        return null;
    }

    public void setTabChangeListener(AbstractC13574a aVar) {
        this.f35693a = aVar;
    }

    public RouterLayout(Context context) {
        super(context);
        m55062a();
    }

    public void removeView(View view) {
        super.removeView(view);
        if (view instanceof C13575a) {
            ((C13575a) view).mo50378a();
        }
    }

    public RouterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m55062a();
    }

    public RouterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m55062a();
    }
}
