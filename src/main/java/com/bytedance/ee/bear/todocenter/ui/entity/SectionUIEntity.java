package com.bytedance.ee.bear.todocenter.ui.entity;

import com.bytedance.ee.bear.todocenter.ui.TodoItemType;
import com.bytedance.ee.util.io.NonProguard;
import com.chad.library.adapter.base.entity.AbstractC20928a;
import com.chad.library.adapter.base.entity.AbstractC20930c;

public class SectionUIEntity extends AbstractC20928a<TodoUIEntity> implements NonProguard, AbstractC20930c {
    public int id;
    public String title;
    public int totalNum;

    @Override // com.chad.library.adapter.base.entity.AbstractC20929b
    public int getLevel() {
        return 0;
    }

    public SectionUIEntity() {
    }

    public int getId() {
        return this.id;
    }

    public int getTotalNum() {
        return this.totalNum;
    }

    @Override // com.chad.library.adapter.base.entity.AbstractC20930c
    public int getItemType() {
        return TodoItemType.Section.getType();
    }

    public String toString() {
        return "SectionEntity{title='" + this.title + '\'' + ", id=" + this.id + ", totalNum=" + this.totalNum + '}';
    }

    public SectionUIEntity(int i) {
        this.id = i;
    }
}
