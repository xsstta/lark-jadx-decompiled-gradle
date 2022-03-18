package com.bytedance.ee.bear.basesdk.p250a;

import android.content.Context;
import com.bytedance.ee.bear.attachment.filereader.FileReaderActivity;
import com.bytedance.ee.bear.attachment.filereader.FileReaderMainDocActivity;
import com.bytedance.ee.bear.basesdk.services.p254a.C4493b;
import com.bytedance.ee.bear.bitable.pro.BitableProActivity;
import com.bytedance.ee.bear.debug.DebugActivity;
import com.bytedance.ee.bear.debug.DebugMainProcActivity;
import com.bytedance.ee.bear.document.DefaultRouteActivity;
import com.bytedance.ee.bear.document.DocActivity;
import com.bytedance.ee.bear.document.DocMainProcActivity;
import com.bytedance.ee.bear.document.bitable.BitableMainActivity;
import com.bytedance.ee.bear.document.web.CommonWebActivity;
import com.bytedance.ee.bear.document.web.CommonWebMainProcActivity;
import com.bytedance.ee.bear.document.web.SimpleWebActivity;
import com.bytedance.ee.bear.document.web.SimpleWebMainProcActivity;
import com.bytedance.ee.bear.integrator.DynamicModuleLoader;
import com.bytedance.ee.bear.integrator.wiki.WikiHomeActivity;
import com.bytedance.ee.bear.lark.route.SpaceRouteActivity;
import com.bytedance.ee.bear.list.folder.FolderListActivity;
import com.bytedance.ee.bear.list.folderselect.FolderSelectActivity;
import com.bytedance.ee.bear.list.route.compat.FolderRouteActivity;
import com.bytedance.ee.bear.list.share.ShareMoreActivity;
import com.bytedance.ee.bear.middleground.like.LikeListActivity;
import com.bytedance.ee.bear.middleground.like.LikeListMainProcActivity;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.CollaboratorManageActivity;
import com.bytedance.ee.bear.middleground.permission.setting.doc.DocumentPermissionSetActivity;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.LinkShareSetActivity;
import com.bytedance.ee.bear.middleground.record.privacy.PrivacyActivity;
import com.bytedance.ee.bear.middleground.record.privacy.PrivacyMainProcActivity;
import com.bytedance.ee.bear.middleground.record.viewhistory.ViewHistoryActivity;
import com.bytedance.ee.bear.middleground.record.viewhistory.ViewHistoryMainProcActivity;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.search.SearchHomeActivity;
import com.bytedance.ee.bear.search.SearchSubActivity;
import com.bytedance.ee.bear.search.space.SpaceSearchActivity;
import com.bytedance.ee.bear.slide.SlideRouteActivity;
import com.bytedance.ee.bear.templates.center.TemplateCenterActivity;
import com.bytedance.ee.bear.todocenter.ui.TodoCenterActivity;
import com.bytedance.ee.bear.wiki.homepage.spacelist.WikiAllSpaceActivity;
import com.bytedance.ee.bear.wiki.spacedetail.WikiSpaceDetailActivity;
import com.bytedance.ee.bear.wiki.spacedetail.WikiSpaceDetailMainProcActivity;
import com.bytedance.ee.bear.wiki.wikitree.WikiTreeActivity;
import com.bytedance.ee.bear.wiki.wikitree.WikiTreeMainProcActivity;
import com.bytedance.ee.bear.wikiv2.WikiActivity;
import com.bytedance.ee.bear.wikiv2.WikiMainProcActivity;
import com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListActivity;
import com.bytedance.ee.bear.wikiv2.trash.WikiTrashActivity;
import com.bytedance.ee.bear.wikiv2.trash.WikiTrashMainProcActivity;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiDefaultRouteActivity;
import com.bytedance.ee.util.p699b.C13595b;
import java.util.HashMap;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.a.b */
public abstract class AbstractC4353b {

    /* renamed from: a */
    protected final Map<String, AbstractC10740f.AbstractC10742b> f12986a = new HashMap();

    /* renamed from: b */
    protected Context f12987b;

    /* renamed from: a */
    public Map<String, AbstractC10740f.AbstractC10742b> mo17005a() {
        Class cls;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        Class cls6;
        Class cls7;
        Class cls8;
        Class cls9;
        Class cls10;
        Class cls11;
        Class cls12;
        Class cls13;
        Class cls14;
        this.f12986a.putAll(((DynamicModuleLoader) KoinJavaComponent.m268610a(DynamicModuleLoader.class)).mo30701c());
        Map<String, AbstractC10740f.AbstractC10742b> map = this.f12986a;
        Context context = this.f12987b;
        if (C13595b.m55176a()) {
            cls = DocMainProcActivity.class;
        } else {
            cls = DocActivity.class;
        }
        map.put("/doc/detail/activity", new C4493b.C4498d(context, cls));
        Map<String, AbstractC10740f.AbstractC10742b> map2 = this.f12986a;
        Context context2 = this.f12987b;
        if (C13595b.m55176a()) {
            cls2 = SimpleWebMainProcActivity.class;
        } else {
            cls2 = SimpleWebActivity.class;
        }
        map2.put("/doc/simple_web", new C4493b.C4498d(context2, cls2));
        Map<String, AbstractC10740f.AbstractC10742b> map3 = this.f12986a;
        Context context3 = this.f12987b;
        if (C13595b.m55176a()) {
            cls3 = CommonWebMainProcActivity.class;
        } else {
            cls3 = CommonWebActivity.class;
        }
        map3.put("/doc/common_web", new C4493b.C4498d(context3, cls3));
        this.f12986a.put("/slide/router", new C4493b.C4498d(this.f12987b, SlideRouteActivity.class));
        this.f12986a.put("/list/folder/activity", new C4493b.C4498d(this.f12987b, FolderListActivity.class));
        this.f12986a.put("/list/folder/route/activity", new C4493b.C4498d(this.f12987b, FolderRouteActivity.class));
        this.f12986a.put("/list/space/activity", new C4493b.C4498d(this.f12987b, SpaceRouteActivity.class));
        this.f12986a.put("/list/share/activity", new C4493b.C4498d(this.f12987b, ShareMoreActivity.class));
        this.f12986a.put("/folder/select/activity", new C4493b.C4498d(this.f12987b, FolderSelectActivity.class));
        this.f12986a.put("/share/collaborator/manage/activity", new C4493b.C4498d(this.f12987b, CollaboratorManageActivity.class));
        this.f12986a.put("/share/doc/permission/set/activity", new C4493b.C4498d(this.f12987b, DocumentPermissionSetActivity.class));
        this.f12986a.put("/share/linkshare/set/activity", new C4493b.C4498d(this.f12987b, LinkShareSetActivity.class));
        Map<String, AbstractC10740f.AbstractC10742b> map4 = this.f12986a;
        Context context4 = this.f12987b;
        if (C13595b.m55176a()) {
            cls4 = DebugMainProcActivity.class;
        } else {
            cls4 = DebugActivity.class;
        }
        map4.put("/debug/activity", new C4493b.C4498d(context4, cls4));
        Map<String, AbstractC10740f.AbstractC10742b> map5 = this.f12986a;
        Context context5 = this.f12987b;
        if (C13595b.m55176a()) {
            cls5 = FileReaderMainDocActivity.class;
        } else {
            cls5 = FileReaderActivity.class;
        }
        map5.put("/doc/filereader/activity", new C4493b.C4498d(context5, cls5));
        this.f12986a.put("/bitable/detail/activity", new C4493b.C4498d(this.f12987b, BitableMainActivity.class));
        Map<String, AbstractC10740f.AbstractC10742b> map6 = this.f12986a;
        Context context6 = this.f12987b;
        if (C13595b.m55176a()) {
            cls6 = PrivacyMainProcActivity.class;
        } else {
            cls6 = PrivacyActivity.class;
        }
        map6.put("/doc/privacy/activity", new C4493b.C4498d(context6, cls6));
        Map<String, AbstractC10740f.AbstractC10742b> map7 = this.f12986a;
        Context context7 = this.f12987b;
        if (C13595b.m55176a()) {
            cls7 = ViewHistoryMainProcActivity.class;
        } else {
            cls7 = ViewHistoryActivity.class;
        }
        map7.put("/doc/viewhistory/activity", new C4493b.C4498d(context7, cls7));
        Map<String, AbstractC10740f.AbstractC10742b> map8 = this.f12986a;
        Context context8 = this.f12987b;
        if (C13595b.m55176a()) {
            cls8 = LikeListMainProcActivity.class;
        } else {
            cls8 = LikeListActivity.class;
        }
        map8.put("/doc/like/activity", new C4493b.C4498d(context8, cls8));
        this.f12986a.put("/search/activity", new C4493b.C4498d(this.f12987b, SearchHomeActivity.class));
        this.f12986a.put("/search/sub_activity", new C4493b.C4498d(this.f12987b, SearchSubActivity.class));
        this.f12986a.put("/search/space_search/activity", new C4493b.C4498d(this.f12987b, SpaceSearchActivity.class));
        this.f12986a.put("/wiki/spacelist/activity", new C4493b.C4498d(this.f12987b, WikiAllSpaceActivity.class));
        Map<String, AbstractC10740f.AbstractC10742b> map9 = this.f12986a;
        Context context9 = this.f12987b;
        if (C13595b.m55176a()) {
            cls9 = WikiTreeMainProcActivity.class;
        } else {
            cls9 = WikiTreeActivity.class;
        }
        map9.put("/wiki/treehome/activity", new C4493b.C4498d(context9, cls9));
        Map<String, AbstractC10740f.AbstractC10742b> map10 = this.f12986a;
        Context context10 = this.f12987b;
        if (C13595b.m55176a()) {
            cls10 = WikiSpaceDetailMainProcActivity.class;
        } else {
            cls10 = WikiSpaceDetailActivity.class;
        }
        map10.put("/wiki/space/detail/activity", new C4493b.C4498d(context10, cls10));
        this.f12986a.put("/wikiv2/home/activity", new C4493b.C4498d(this.f12987b, WikiHomeActivity.class));
        this.f12986a.put("/wikiv2/spacelist/activity", new C4493b.C4498d(this.f12987b, WikiSpaceListActivity.class));
        Map<String, AbstractC10740f.AbstractC10742b> map11 = this.f12986a;
        Context context11 = this.f12987b;
        if (C13595b.m55176a()) {
            cls11 = com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeMainProcActivity.class;
        } else {
            cls11 = com.bytedance.ee.bear.wikiv2.wikitreev2.WikiTreeActivity.class;
        }
        map11.put("/wikiv2/treehome/activity", new C4493b.C4498d(context11, cls11));
        Map<String, AbstractC10740f.AbstractC10742b> map12 = this.f12986a;
        Context context12 = this.f12987b;
        if (C13595b.m55176a()) {
            cls12 = com.bytedance.ee.bear.wikiv2.spacedetail.WikiSpaceDetailMainProcActivity.class;
        } else {
            cls12 = com.bytedance.ee.bear.wikiv2.spacedetail.WikiSpaceDetailActivity.class;
        }
        map12.put("/wikiv2/space/detail/activity", new C4493b.C4498d(context12, cls12));
        Map<String, AbstractC10740f.AbstractC10742b> map13 = this.f12986a;
        Context context13 = this.f12987b;
        if (C13595b.m55176a()) {
            cls13 = WikiTrashMainProcActivity.class;
        } else {
            cls13 = WikiTrashActivity.class;
        }
        map13.put("/wikiv2/trash/activity", new C4493b.C4498d(context13, cls13));
        Map<String, AbstractC10740f.AbstractC10742b> map14 = this.f12986a;
        Context context14 = this.f12987b;
        if (C13595b.m55176a()) {
            cls14 = WikiMainProcActivity.class;
        } else {
            cls14 = WikiActivity.class;
        }
        map14.put("/wikiv2/detail/activity", new C4493b.C4498d(context14, cls14));
        this.f12986a.put("/list/template4/activity", new C4493b.C4498d(this.f12987b, TemplateCenterActivity.class));
        this.f12986a.put("/doc/default/route", new C4493b.C4498d(this.f12987b, DefaultRouteActivity.class));
        this.f12986a.put("/wiki/default/route", new C4493b.C4498d(this.f12987b, WikiDefaultRouteActivity.class));
        this.f12986a.put("/list/todo/activity", new C4493b.C4498d(this.f12987b, TodoCenterActivity.class));
        this.f12986a.put("/bitable/pro/activity", new C4493b.C4498d(this.f12987b, BitableProActivity.class));
        return this.f12986a;
    }

    public AbstractC4353b(Context context) {
        this.f12987b = context;
    }
}
