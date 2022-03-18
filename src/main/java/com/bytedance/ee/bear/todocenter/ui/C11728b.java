package com.bytedance.ee.bear.todocenter.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.collection.C0513a;
import androidx.recyclerview.widget.AbstractC1398p;
import androidx.recyclerview.widget.C1374g;
import com.bytedance.ee.bear.todocenter.ui.entity.EmptyTodoEntity;
import com.bytedance.ee.bear.todocenter.ui.entity.SectionUIEntity;
import com.bytedance.ee.bear.todocenter.ui.entity.TodoUIEntity;
import com.bytedance.ee.bear.todocenter.ui.widget.TodoRichTextView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13630j;
import com.bytedance.ee.util.p718t.C13749l;
import com.chad.library.adapter.base.AbstractC20921b;
import com.chad.library.adapter.base.C20923c;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.todocenter.ui.b */
public class C11728b extends AbstractC20921b<AbstractC20930c, C11739f> {

    /* renamed from: a */
    public AbstractC11733c f31533a;

    /* renamed from: b */
    public final AbstractC11731a f31534b;

    /* renamed from: c */
    public final C0513a<String> f31535c = new C0513a<>();

    /* renamed from: d */
    private final Context f31536d;

    /* renamed from: com.bytedance.ee.bear.todocenter.ui.b$a */
    public interface AbstractC11731a {
        boolean isNetworkConnected();
    }

    /* renamed from: com.bytedance.ee.bear.todocenter.ui.b$c */
    public interface AbstractC11733c {
        void onCheckedChanged(TodoUIEntity todoUIEntity, int i, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.todocenter.ui.b$d */
    public interface AbstractC11734d {
        /* renamed from: a */
        void mo44893a(SectionUIEntity sectionUIEntity, int i, boolean z);
    }

    /* renamed from: a */
    public void mo44901a(boolean z, TodoUIEntity todoUIEntity, boolean z2) {
        if (z) {
            this.f31535c.remove(todoUIEntity.todo_id);
        } else {
            this.f31535c.add(todoUIEntity.todo_id);
        }
        if (z2) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo44900a(boolean z, TodoUIEntity todoUIEntity, List<AbstractC20930c> list) {
        mo44901a(true, todoUIEntity, false);
        m48648c(list);
    }

    /* renamed from: a */
    public void mo44897a(AbstractC11733c cVar) {
        this.f31533a = cVar;
    }

    /* renamed from: b */
    public void mo44902b(List<AbstractC20930c> list) {
        m48648c(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.b$b */
    public class C11732b implements AbstractC1398p {
        private C11732b() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: a */
        public void mo7365a(int i, int i2) {
            C11728b bVar = C11728b.this;
            bVar.notifyItemRangeInserted(i + bVar.mo70678c(), i2);
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: b */
        public void mo7367b(int i, int i2) {
            C11728b bVar = C11728b.this;
            bVar.notifyItemRangeRemoved(i + bVar.mo70678c(), i2);
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: c */
        public void mo7368c(int i, int i2) {
            C11728b bVar = C11728b.this;
            bVar.notifyItemMoved(i + bVar.mo70678c(), i2 + C11728b.this.mo70678c());
        }

        @Override // androidx.recyclerview.widget.AbstractC1398p
        /* renamed from: a */
        public void mo7366a(int i, int i2, Object obj) {
            C11728b bVar = C11728b.this;
            bVar.notifyItemRangeChanged(i + bVar.mo70678c(), i2, obj);
        }
    }

    /* renamed from: c */
    private void m48648c(List<AbstractC20930c> list) {
        if (list == null) {
            list = new ArrayList<>(0);
        }
        C1374g.m6298a(mo44895a(mo70673b(), list), true).mo7413a(new C11732b());
        this.f51214t = list;
    }

    /* renamed from: a */
    public void mo44899a(List<AbstractC20930c> list) {
        m48648c(list);
    }

    /* renamed from: a */
    public C1374g.AbstractC1376a mo44895a(final List<AbstractC20930c> list, final List<AbstractC20930c> list2) {
        return new C1374g.AbstractC1376a() {
            /* class com.bytedance.ee.bear.todocenter.ui.C11728b.C117302 */

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: a */
            public int mo7380a() {
                List list = list;
                if (list == null) {
                    return 0;
                }
                return list.size();
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: b */
            public int mo7382b() {
                List list = list2;
                if (list == null) {
                    return 0;
                }
                return list.size();
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: a */
            public boolean mo7381a(int i, int i2) {
                AbstractC20930c cVar = (AbstractC20930c) list.get(i);
                AbstractC20930c cVar2 = (AbstractC20930c) list2.get(i2);
                if (!(cVar instanceof SectionUIEntity) || !(cVar2 instanceof SectionUIEntity)) {
                    if (!(cVar instanceof TodoUIEntity) || !(cVar2 instanceof TodoUIEntity)) {
                        return false;
                    }
                    return TextUtils.equals(((TodoUIEntity) cVar).todo_id, ((TodoUIEntity) cVar2).todo_id);
                } else if (((SectionUIEntity) cVar).id == ((SectionUIEntity) cVar2).id) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
            /* renamed from: b */
            public boolean mo7383b(int i, int i2) {
                AbstractC20930c cVar = (AbstractC20930c) list.get(i);
                AbstractC20930c cVar2 = (AbstractC20930c) list2.get(i2);
                if ((cVar instanceof SectionUIEntity) && (cVar2 instanceof SectionUIEntity)) {
                    SectionUIEntity sectionUIEntity = (SectionUIEntity) cVar;
                    SectionUIEntity sectionUIEntity2 = (SectionUIEntity) cVar2;
                    if (!TextUtils.equals(sectionUIEntity.title, sectionUIEntity2.title) || sectionUIEntity.totalNum != sectionUIEntity2.totalNum) {
                        return false;
                    }
                    return true;
                } else if (!(cVar instanceof TodoUIEntity) || !(cVar2 instanceof TodoUIEntity)) {
                    return false;
                } else {
                    TodoUIEntity todoUIEntity = (TodoUIEntity) cVar;
                    TodoUIEntity todoUIEntity2 = (TodoUIEntity) cVar2;
                    if (!TextUtils.equals(todoUIEntity.todo_id, todoUIEntity2.todo_id) || !TextUtils.equals(todoUIEntity.obj_title, todoUIEntity2.obj_title) || todoUIEntity.is_done != todoUIEntity2.is_done || todoUIEntity.isLastItem != todoUIEntity2.isLastItem || !TextUtils.equals(todoUIEntity.reminderColorHandle, todoUIEntity2.reminderColorHandle) || !TextUtils.equals(todoUIEntity.content, todoUIEntity2.content)) {
                        return false;
                    }
                    return true;
                }
            }
        };
    }

    /* renamed from: a */
    public static void m48644a(ImageView imageView, SectionUIEntity sectionUIEntity) {
        float f;
        if (sectionUIEntity.isExpanded()) {
            f = 90.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        imageView.setRotation(f);
    }

    /* renamed from: a */
    private void m48645a(C11739f fVar, EmptyTodoEntity emptyTodoEntity) {
        View b = fVar.mo70740b(R.id.list_state_loaded_fail_empty_state);
        if (b instanceof SpaceEmptyState) {
            SpaceEmptyState spaceEmptyState = (SpaceEmptyState) b;
            spaceEmptyState.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_positive_complete));
            spaceEmptyState.setDesc(this.f31536d.getString(R.string.CreationMobile_Docs_TaskCenter_CompleteAllTask_Tooltip));
        }
    }

    /* renamed from: a */
    public static void m48647a(C20923c cVar, SectionUIEntity sectionUIEntity) {
        cVar.mo70737a(R.id.section_text, sectionUIEntity.title);
        ((TextView) cVar.mo70740b(R.id.section_text)).getPaint().setFakeBoldText(true);
        m48644a((ImageView) cVar.mo70740b(R.id.todo_arrow), sectionUIEntity);
    }

    /* renamed from: a */
    private void m48646a(final C11739f fVar, final TodoUIEntity todoUIEntity) {
        String str;
        int i;
        int i2;
        TodoRichTextView todoRichTextView = (TodoRichTextView) fVar.mo70740b(R.id.todo_item_content);
        todoRichTextView.setMaxLines(10);
        todoRichTextView.setRichText(todoUIEntity);
        View b = fVar.mo70740b(R.id.todo_item_checkbox);
        b.setEnabled(this.f31534b.isNetworkConnected());
        C117291 r1 = new OnSingleClickListener() {
            /* class com.bytedance.ee.bear.todocenter.ui.C11728b.C117291 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (!C11728b.this.f31534b.isNetworkConnected()) {
                    C13479a.m54764b(C11728b.f51185p, "onSingleClick: network no connect");
                } else if (C11728b.this.f31535c.contains(todoUIEntity.todo_id)) {
                    C13479a.m54764b(C11728b.f51185p, "onSingleClick: running");
                } else {
                    C13630j.m55310a(C11728b.this.f51211q, 10, 50);
                    if (C11728b.this.f31533a != null) {
                        C11728b.this.f31533a.onCheckedChanged(todoUIEntity, fVar.getLayoutPosition(), !todoUIEntity.is_done);
                    }
                }
            }
        };
        b.setOnClickListener(r1);
        fVar.mo70744c(R.id.checkbox_item, todoUIEntity.is_done).mo70745d(R.id.checkbox_item, this.f31534b.isNetworkConnected()).mo70735a(R.id.checkbox_item, r1);
        TextView textView = (TextView) fVar.mo70740b(R.id.todo_item_source);
        if (TextUtils.isEmpty(todoUIEntity.obj_title)) {
            str = C13749l.m55745a(this.f51211q, (int) R.string.Doc_Contract_UntitledDocument);
        } else {
            str = todoUIEntity.obj_title;
        }
        textView.setText(str);
        if (todoUIEntity.is_done) {
            i = C13749l.m55755c(this.f31536d, R.color.space_kit_n500);
        } else {
            i = C13749l.m55755c(this.f31536d, R.color.space_kit_n600);
        }
        textView.setTextColor(i);
        if (todoUIEntity.is_done) {
            i2 = R.drawable.icon_file_doc_grey;
        } else {
            i2 = R.drawable.icon_file_doc_colorful;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        ProgressBar progressBar = (ProgressBar) fVar.mo70740b(R.id.todo_item_loading);
        CheckBox checkBox = (CheckBox) fVar.mo70740b(R.id.checkbox_item);
        if (this.f31535c.contains(todoUIEntity.todo_id)) {
            progressBar.setVisibility(0);
            checkBox.setVisibility(8);
        } else {
            progressBar.setVisibility(8);
            checkBox.setVisibility(0);
        }
        View b2 = fVar.mo70740b(R.id.item_space);
        if (todoUIEntity.isLastItem) {
            b2.setVisibility(0);
        } else {
            b2.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo44896a(int i, AbstractC11734d dVar) {
        AbstractC20930c cVar = (AbstractC20930c) mo70685d(i);
        if (cVar instanceof SectionUIEntity) {
            SectionUIEntity sectionUIEntity = (SectionUIEntity) cVar;
            if (sectionUIEntity.isExpanded()) {
                mo70691g(i);
            } else {
                mo70688f(i);
            }
            if (dVar != null) {
                dVar.mo44893a(sectionUIEntity, i, sectionUIEntity.isExpanded());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16806a(C11739f fVar, AbstractC20930c cVar) {
        if (fVar.getItemViewType() == TodoItemType.Section.getType()) {
            m48647a((C20923c) fVar, (SectionUIEntity) cVar);
        } else if (fVar.getItemViewType() == TodoItemType.EmptyTodo.getType()) {
            m48645a(fVar, (EmptyTodoEntity) cVar);
        } else {
            m48646a(fVar, (TodoUIEntity) cVar);
        }
    }

    public C11728b(Context context, List<AbstractC20930c> list, AbstractC11731a aVar) {
        super(list);
        mo70726a(TodoItemType.Section.getType(), R.layout.todo_section_item);
        mo70726a(TodoItemType.Item.getType(), R.layout.todo_list_item);
        mo70726a(TodoItemType.EmptyTodo.getType(), R.layout.todo_empty_todo_item);
        this.f31536d = context;
        this.f31534b = aVar;
    }
}
