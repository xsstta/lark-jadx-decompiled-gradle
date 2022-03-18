package com.ss.android.lark.todo.impl.framework;

import android.view.View;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/todo/impl/framework/TodoBaseActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
public class TodoBaseActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private HashMap f141042a;

    /* renamed from: a */
    public View mo192024a(int i) {
        if (this.f141042a == null) {
            this.f141042a = new HashMap();
        }
        View view = (View) this.f141042a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f141042a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
