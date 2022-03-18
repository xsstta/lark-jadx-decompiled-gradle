package com.ss.android.lark.forward.dto.template;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import java.util.List;
import pl.droidsonroids.gif.GifImageView;

public interface ForwardEnhancedView extends Parcelable {

    /* renamed from: com.ss.android.lark.forward.dto.template.ForwardEnhancedView$a */
    public interface AbstractC38392a {
        void proceed();
    }

    /* renamed from: a */
    void mo140739a(Activity activity, ConstraintLayout constraintLayout, List<ForwardTarget> list, Bundle bundle);

    /* renamed from: a */
    void mo140740a(Activity activity, List<ForwardTarget> list, Bundle bundle, AbstractC38392a aVar);

    /* renamed from: a */
    void mo140741a(Activity activity, List<ForwardTarget> list, Bundle bundle, AbstractC38392a aVar, ForwardTemplate forwardTemplate);

    /* renamed from: a */
    void mo140742a(List<ForwardTarget> list, GifImageView gifImageView, TextView textView, TextView textView2, TextView textView3, Bundle bundle);

    /* renamed from: a */
    boolean mo140743a(List<ForwardTarget> list, Bundle bundle);

    /* renamed from: b */
    boolean mo140744b(List<ForwardTarget> list, Bundle bundle);

    /* renamed from: c */
    boolean mo140745c(List<ForwardTarget> list, Bundle bundle);

    /* renamed from: d */
    boolean mo140746d(List<ForwardTarget> list, Bundle bundle);
}
