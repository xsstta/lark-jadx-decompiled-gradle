package com.ss.android.lark.profile.func.share_profile.share_url.mvp;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dto.ProfileLoadParams;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a;
import com.ss.android.lark.utils.UIHelper;

public class ShareProfileUrlView implements AbstractC52537a.AbstractC52540b {

    /* renamed from: a */
    private static final int f130006a;

    /* renamed from: b */
    private static final int f130007b;

    /* renamed from: c */
    private AbstractC52536b f130008c;

    /* renamed from: d */
    private AbstractC52537a.AbstractC52540b.AbstractC52541a f130009d;

    /* renamed from: e */
    private Context f130010e;
    @BindView(7727)
    LKUIRoundedImageView mContactAvatar;
    @BindView(7728)
    TextView mContactName;
    @BindView(7729)
    TextView mCopyContactProfileUrlLinkBtn;
    @BindView(7726)
    TextView mShareProfileUrl;

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView$a */
    public static class C52535a {

        /* renamed from: a */
        public String f130011a;

        /* renamed from: b */
        public String f130012b;

        /* renamed from: c */
        public String f130013c;
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView$b */
    public interface AbstractC52536b {
        /* renamed from: a */
        void mo179537a(ShareProfileUrlView shareProfileUrlView);

        /* renamed from: a */
        void mo179538a(String str);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f130008c = null;
        this.f130009d = null;
    }

    static {
        int dp2px = UIHelper.dp2px(48.0f);
        f130006a = dp2px;
        f130007b = dp2px;
    }

    /* renamed from: a */
    private void m203408a() {
        this.mCopyContactProfileUrlLinkBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.profile.func.share_profile.share_url.mvp.$$Lambda$ShareProfileUrlView$dGNX8P8AB26LbhmSetbbVD2ICf8 */

            public final void onClick(View view) {
                ShareProfileUrlView.this.m203409a((ShareProfileUrlView) view);
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f130008c.mo179537a(this);
        this.f130010e = this.mContactName.getContext();
        m203408a();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC52537a.AbstractC52540b.AbstractC52541a aVar) {
        this.f130009d = aVar;
    }

    public ShareProfileUrlView(AbstractC52536b bVar) {
        this.f130008c = bVar;
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52540b
    /* renamed from: a */
    public void mo179544a(String str) {
        this.mShareProfileUrl.setText(str);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52540b
    /* renamed from: b */
    public void mo179545b(String str) {
        this.f130008c.mo179538a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m203409a(View view) {
        String charSequence = this.mShareProfileUrl.getText().toString();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = "";
        }
        this.f130009d.mo179550a(charSequence);
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.AbstractC52537a.AbstractC52540b
    /* renamed from: a */
    public void mo179542a(C52535a aVar) {
        this.mContactName.setText(aVar.f130011a);
        C52239a.m202617d().mo133585o().mo133596a(this.f130010e, this.mContactAvatar, aVar.f130013c, aVar.f130012b, new ProfileLoadParams().mo178894b(f130007b).mo178889a(f130006a));
    }
}
