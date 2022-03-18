package com.larksuite.component.blockit.entity.todo;

import java.io.Serializable;
import java.util.List;

public class MultiMessage implements Serializable {
    public String chatId;
    public List<String> messageIds;
}
