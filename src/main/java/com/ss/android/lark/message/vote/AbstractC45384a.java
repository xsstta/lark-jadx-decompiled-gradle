package com.ss.android.lark.message.vote;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;

/* renamed from: com.ss.android.lark.message.vote.a */
public interface AbstractC45384a {

    /* renamed from: com.ss.android.lark.message.vote.a$a */
    public interface AbstractC45385a {
        void onItemSelected(boolean z);
    }

    /* renamed from: com.ss.android.lark.message.vote.a$b */
    public interface AbstractC45386b {
        void onVote(String str, Map<String, String> map);
    }

    /* renamed from: a */
    TextView mo160232a();

    /* renamed from: b */
    TextView mo160233b();

    /* renamed from: c */
    View mo160234c();

    /* renamed from: d */
    RecyclerView mo160235d();

    /* renamed from: e */
    TextView mo160236e();

    /* renamed from: f */
    TextView mo160237f();

    /* renamed from: g */
    TextView mo160238g();

    /* renamed from: h */
    AbstractC45386b mo160239h();

    /* renamed from: i */
    AbstractC45385a mo160240i();
}
