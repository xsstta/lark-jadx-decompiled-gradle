package com.ss.android.lark.widget.light.listener;

import android.view.View;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/widget/light/listener/IAbbreviationClickListener;", "", "onAbbreviationClick", "", "view", "Landroid/view/View;", "abbreviationInfo", "Lcom/ss/android/lark/widget/span/AbbreviationInfo;", "actionUpX", "", "actionUpY", "IActionLocationProvider", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.widget.light.c.a */
public interface IAbbreviationClickListener {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/widget/light/listener/IAbbreviationClickListener$IActionLocationProvider;", "", "getAcitonUpX", "", "getActionUpY", "linked-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.widget.light.c.a$a */
    public interface IActionLocationProvider {
        int getAcitonUpX();

        int getActionUpY();
    }

    void onAbbreviationClick(View view, AbbreviationInfo abbreviationInfo, float f, float f2);
}
