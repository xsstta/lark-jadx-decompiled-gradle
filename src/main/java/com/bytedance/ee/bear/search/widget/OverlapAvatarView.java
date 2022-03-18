package com.bytedance.ee.bear.search.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bytedance.ee.bear.search.model.ChatInfo;
import com.bytedance.ee.bear.search.model.OwnerInfo;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.image.entity.AvatarImage;
import java.util.ArrayList;
import java.util.List;

public class OverlapAvatarView extends FrameLayout {
    /* renamed from: a */
    private void m45262a() {
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    }

    public OverlapAvatarView(Context context) {
        this(context, null);
    }

    public void setChatInfo(List<ChatInfo> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (ChatInfo chatInfo : list) {
            if (chatInfo.getChatType() == ChatInfo.ChatType.SINGLE_CHAT.getValue()) {
                str = chatInfo.getP2pChatterId();
            } else {
                str = chatInfo.getChatId();
            }
            arrayList.add(new C10882a(str, chatInfo.getAvatarKey()));
        }
        mo41398a(arrayList, 3);
    }

    public void setOwnerInfo(List<OwnerInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (OwnerInfo ownerInfo : list) {
            arrayList.add(new C10882a(ownerInfo.getOwnerId(), ownerInfo.getAvatarKey()));
        }
        mo41398a(arrayList, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.search.widget.OverlapAvatarView$a */
    public static class C10882a {

        /* renamed from: a */
        String f29287a;

        /* renamed from: b */
        String f29288b;

        C10882a(String str, String str2) {
            this.f29287a = str == null ? "" : str;
            this.f29288b = str2 == null ? "" : str2;
        }
    }

    public OverlapAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public void mo41398a(List<C10882a> list, int i) {
        if (CollectionUtils.isEmpty(list)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        removeAllViews();
        int size = list.size();
        if (i == 0 || i > size) {
            i = size;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            LKUIRoundedImageView lKUIRoundedImageView = new LKUIRoundedImageView(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C13749l.m55738a(28), C13749l.m55738a(28));
            marginLayoutParams.setMarginStart(i2);
            lKUIRoundedImageView.setLayoutParams(marginLayoutParams);
            lKUIRoundedImageView.setBorderColor(getContext().getResources().getColor(R.color.bg_body));
            lKUIRoundedImageView.setBorderWidthDP(2.0f);
            lKUIRoundedImageView.setCornerRadiusDP(24.0f);
            addView(lKUIRoundedImageView);
            C10882a aVar = list.get(i3);
            ((C2124f) ComponentCallbacks2C2115c.m9151c(getContext()).mo10414a(AvatarImage.Builder.obtain(aVar.f29288b, aVar.f29287a, 240, 240).build()).mo11123a((int) R.drawable.search_owner_place_holder)).mo10399a((ImageView) lKUIRoundedImageView);
            i2 += C13749l.m55738a(16);
        }
        invalidate();
        requestLayout();
    }

    public OverlapAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45262a();
    }
}
