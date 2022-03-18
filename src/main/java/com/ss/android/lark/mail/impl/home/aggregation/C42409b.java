package com.ss.android.lark.mail.impl.home.aggregation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.home.aggregation.b */
public class C42409b {
    /* renamed from: a */
    public static void m169266a(TextView textView) {
        if (textView != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            textView.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], null, compoundDrawables[3]);
        }
    }

    /* renamed from: a */
    public static void m169267a(MailThread mailThread, String str, TextView textView, Context context) {
        UDTagsDrawable.TagModel.Builder aVar;
        if (!(textView == null || context == null)) {
            C43374f.m172264f();
            List<MailLabelEntity> a = C43374f.m172257a(mailThread, str);
            if (a == null || a.isEmpty()) {
                m169266a(textView);
                return;
            }
            UDTagsDrawable.Builder d = new UDTagsDrawable.Builder(context).mo91390d((float) UIHelper.getDimens(R.dimen.mail_label_max_width));
            int size = a.size();
            int i = 0;
            for (int i2 = 0; i2 < size && i < 4; i2++) {
                if (a.get(i2) != null) {
                    i++;
                    MailLabelEntity mailLabelEntity = a.get(i2);
                    UDTagsDrawable.TagModel.Builder aVar2 = new UDTagsDrawable.TagModel.Builder(context);
                    if (i < 4) {
                        int h = mailLabelEntity.mo151523h();
                        int e = mailLabelEntity.mo151515e();
                        aVar = aVar2.mo91422c(e).mo91419b(h).mo91418a((CollectionUtils.isEmpty(mailLabelEntity.mo151493B()) || mailLabelEntity.mo151493B().size() <= 1 || TextUtils.isEmpty(mailLabelEntity.mo151492A())) ? mailLabelEntity.mo151528l() : "/" + mailLabelEntity.mo151528l());
                    } else {
                        aVar = aVar2.mo91424d(UIHelper.getColor(R.color.udtoken_tag_neutral_text_normal)).mo91419b(UIHelper.getColor(R.color.udtoken_tag_neutral_bg_normal)).mo91416a(UIHelper.getDrawable(R.drawable.ud_icon_more_outlined));
                    }
                    d.mo91384a(aVar.mo91427g());
                }
            }
            UDTagsDrawable i3 = d.mo91398i();
            if (i3 != null) {
                i3.mo91369a(textView);
            }
        }
    }

    /* renamed from: a */
    public static UDTagsDrawable m169264a(Context context, int i, int i2, String str, int i3, int i4, int i5, int i6, int i7) {
        return m169265a(context, new ArrayList<Integer>(i) {
            /* class com.ss.android.lark.mail.impl.home.aggregation.C42409b.C424101 */
            final /* synthetic */ int val$bgColor;

            {
                this.val$bgColor = r1;
                add(Integer.valueOf(r1));
            }
        }, new ArrayList<Integer>(i2) {
            /* class com.ss.android.lark.mail.impl.home.aggregation.C42409b.C424112 */
            final /* synthetic */ int val$fontColor;

            {
                this.val$fontColor = r1;
                add(Integer.valueOf(r1));
            }
        }, new ArrayList<String>(str) {
            /* class com.ss.android.lark.mail.impl.home.aggregation.C42409b.C424123 */
            final /* synthetic */ String val$text;

            {
                this.val$text = r1;
                add(r1);
            }
        }, i3, i4, i5, -1, i6, i7);
    }

    /* renamed from: a */
    public static UDTagsDrawable m169265a(Context context, List<Integer> list, List<Integer> list2, List<String> list3, int i, int i2, int i3, int i4, int i5, int i6) {
        if (context == null || list == null || list2 == null || list3 == null) {
            return null;
        }
        UDTagsDrawable.Builder bVar = new UDTagsDrawable.Builder(context);
        if (i2 >= 0) {
            bVar = bVar.mo91390d((float) i2);
        }
        if (i3 >= 0) {
            bVar = bVar.mo91386b((float) i3);
        }
        if (i4 >= 0) {
            bVar = bVar.mo91392e((float) i4);
        }
        if (i5 >= 0) {
            bVar = bVar.mo91388c((float) i5);
        }
        if (i >= 0) {
            bVar.mo91390d((float) i);
        }
        if (i6 >= 0) {
            bVar.mo91383a((float) i6);
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue = list.get(i7).intValue();
            int intValue2 = list2.get(i7).intValue();
            bVar.mo91384a(new UDTagsDrawable.TagModel.Builder(context).mo91418a(list3.get(i7)).mo91422c(UIHelper.getColor(intValue2)).mo91419b(UIHelper.getColor(intValue)).mo91427g());
        }
        return bVar.mo91398i();
    }
}
