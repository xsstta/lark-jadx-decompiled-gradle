package com.bytedance.ee.bear.pathnavigationview;

import com.bytedance.ee.bear.pathnavigationview.PathNavigationModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/pathnavigationview/PathNodeClickListener;", "T", "Lcom/bytedance/ee/bear/pathnavigationview/PathNavigationModel;", "", "onPathNodeClick", "", "index", "", "node", "(ILcom/bytedance/ee/bear/pathnavigationview/PathNavigationModel;)V", "biz-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.k.c */
public interface PathNodeClickListener<T extends PathNavigationModel> {
    /* renamed from: a */
    void mo30865a(int i, T t);
}
