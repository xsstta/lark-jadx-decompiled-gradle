package com.bytedance.ee.bear.lark.selector.base;

import com.larksuite.framework.mvp.IView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface ISelectorView<Value> extends IView<AbstractC8088a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CHOICE_MODE {
    }

    /* renamed from: com.bytedance.ee.bear.lark.selector.base.ISelectorView$a */
    public interface AbstractC8088a extends IView.IViewDelegate {
        /* renamed from: a */
        void mo31242a(String str);

        /* renamed from: a */
        boolean mo31243a();

        /* renamed from: b */
        void mo31244b(String str);
    }

    /* renamed from: com.bytedance.ee.bear.lark.selector.base.ISelectorView$b */
    public interface AbstractC8089b<Value, T extends ISelectorView> {
        /* renamed from: a */
        String mo31237a(int i);

        /* renamed from: a */
        void mo31238a();

        /* renamed from: a */
        void mo31239a(T t);

        /* renamed from: a */
        void mo31240a(List<Value> list);

        /* renamed from: b */
        void mo31241b(List<Value> list);
    }
}
