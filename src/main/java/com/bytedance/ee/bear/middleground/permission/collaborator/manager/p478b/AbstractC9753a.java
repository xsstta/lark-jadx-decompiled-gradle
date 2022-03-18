package com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.share.export.UserInfo;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.component.universe_design.image.UDAvatar;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a */
public abstract class AbstractC9753a extends BaseQuickAdapter<UserInfo, C9754a> {
    public AbstractC9753a() {
        super((int) R.layout.permission_collaborator_manage_item);
    }

    /* renamed from: com.bytedance.ee.bear.middleground.permission.collaborator.manager.b.a$a */
    public static class C9754a extends C20923c {

        /* renamed from: a */
        public UDAvatar f26306a;

        /* renamed from: b */
        public CustomTitleView f26307b;

        /* renamed from: c */
        public TextView f26308c;

        /* renamed from: d */
        public TextView f26309d;

        /* renamed from: e */
        public TextView f26310e;

        /* renamed from: f */
        public ImageView f26311f;

        public C9754a(View view) {
            super(view);
            this.f26306a = (UDAvatar) view.findViewById(R.id.item_collaborator_icon);
            this.f26307b = (CustomTitleView) view.findViewById(R.id.item_collaborator_name);
            this.f26308c = (TextView) view.findViewById(R.id.item_collaborator_desc);
            this.f26310e = (TextView) view.findViewById(R.id.item_collaborator_permission);
            this.f26311f = (ImageView) view.findViewById(R.id.item_collaborator_permission_icon);
            this.f26309d = (TextView) view.findViewById(R.id.item_collaborator_source);
        }
    }
}
