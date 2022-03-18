package com.ss.android.lark.forward.dto.template;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.forward.dto.ForwardTarget;
import java.util.List;

/* renamed from: com.ss.android.lark.forward.dto.template.a */
public interface AbstractC38405a {

    /* renamed from: com.ss.android.lark.forward.dto.template.a$a */
    public interface AbstractC38406a {
        /* renamed from: a */
        void mo140599a(int i, Intent intent);

        /* renamed from: a */
        void mo140600a(String str, String str2, boolean z);

        /* renamed from: a */
        void mo140601a(String str, boolean z);
    }

    void onForward(List<ForwardTarget> list, Bundle bundle, AbstractC38406a aVar);
}
