package com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue;

import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;

public class UserList implements NonProguard {
    public List<UserEntity> users;

    public UserList() {
    }

    public UserList(List<UserEntity> list) {
        this.users = list;
    }
}
