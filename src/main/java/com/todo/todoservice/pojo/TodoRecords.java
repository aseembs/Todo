package com.todo.todoservice.pojo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class TodoRecords {
    LocalDateTime time;
    String record;
    Boolean isCompleted;
}
